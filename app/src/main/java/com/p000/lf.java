package com.p000;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.FilterQueryProvider;
import android.widget.Filterable;
import com.inmobi.commons.analytics.db.AnalyticsSQLiteHelper;
import p000.lg.C5508a;

/* compiled from: CursorAdapter */
/* renamed from: lf */
public abstract class lf extends BaseAdapter implements Filterable, C5508a {
    /* renamed from: a */
    protected boolean f24396a;
    /* renamed from: b */
    protected boolean f24397b;
    /* renamed from: c */
    protected Cursor f24398c;
    /* renamed from: d */
    protected Context f24399d;
    /* renamed from: e */
    protected int f24400e;
    /* renamed from: f */
    protected C5506a f24401f;
    /* renamed from: g */
    protected DataSetObserver f24402g;
    /* renamed from: h */
    protected lg f24403h;
    /* renamed from: i */
    protected FilterQueryProvider f24404i;

    /* compiled from: CursorAdapter */
    /* renamed from: lf$a */
    class C5506a extends ContentObserver {
        /* renamed from: a */
        final /* synthetic */ lf f24394a;

        C5506a(lf lfVar) {
            this.f24394a = lfVar;
            super(new Handler());
        }

        public boolean deliverSelfNotifications() {
            return true;
        }

        public void onChange(boolean z) {
            this.f24394a.m32396b();
        }
    }

    /* compiled from: CursorAdapter */
    /* renamed from: lf$b */
    class C5507b extends DataSetObserver {
        /* renamed from: a */
        final /* synthetic */ lf f24395a;

        C5507b(lf lfVar) {
            this.f24395a = lfVar;
        }

        public void onChanged() {
            this.f24395a.f24396a = true;
            this.f24395a.notifyDataSetChanged();
        }

        public void onInvalidated() {
            this.f24395a.f24396a = false;
            this.f24395a.notifyDataSetInvalidated();
        }
    }

    /* renamed from: a */
    public abstract View m32390a(Context context, Cursor cursor, ViewGroup viewGroup);

    /* renamed from: a */
    public abstract void m32393a(View view, Context context, Cursor cursor);

    public lf(Context context, Cursor cursor, boolean z) {
        m32391a(context, cursor, z ? 1 : 2);
    }

    /* renamed from: a */
    void m32391a(Context context, Cursor cursor, int i) {
        boolean z = true;
        if ((i & 1) == 1) {
            i |= 2;
            this.f24397b = true;
        } else {
            this.f24397b = false;
        }
        if (cursor == null) {
            z = false;
        }
        this.f24398c = cursor;
        this.f24396a = z;
        this.f24399d = context;
        this.f24400e = z ? cursor.getColumnIndexOrThrow(AnalyticsSQLiteHelper.GENERAL_ID) : -1;
        if ((i & 2) == 2) {
            this.f24401f = new C5506a(this);
            this.f24402g = new C5507b(this);
        } else {
            this.f24401f = null;
            this.f24402g = null;
        }
        if (z) {
            if (this.f24401f != null) {
                cursor.registerContentObserver(this.f24401f);
            }
            if (this.f24402g != null) {
                cursor.registerDataSetObserver(this.f24402g);
            }
        }
    }

    /* renamed from: a */
    public Cursor mo5140a() {
        return this.f24398c;
    }

    public int getCount() {
        if (!this.f24396a || this.f24398c == null) {
            return 0;
        }
        return this.f24398c.getCount();
    }

    public Object getItem(int i) {
        if (!this.f24396a || this.f24398c == null) {
            return null;
        }
        this.f24398c.moveToPosition(i);
        return this.f24398c;
    }

    public long getItemId(int i) {
        if (this.f24396a && this.f24398c != null && this.f24398c.moveToPosition(i)) {
            return this.f24398c.getLong(this.f24400e);
        }
        return 0;
    }

    public boolean hasStableIds() {
        return true;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (!this.f24396a) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        } else if (this.f24398c.moveToPosition(i)) {
            if (view == null) {
                view = m32390a(this.f24399d, this.f24398c, viewGroup);
            }
            m32393a(view, this.f24399d, this.f24398c);
            return view;
        } else {
            throw new IllegalStateException("couldn't move cursor to position " + i);
        }
    }

    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (!this.f24396a) {
            return null;
        }
        this.f24398c.moveToPosition(i);
        if (view == null) {
            view = m32395b(this.f24399d, this.f24398c, viewGroup);
        }
        m32393a(view, this.f24399d, this.f24398c);
        return view;
    }

    /* renamed from: b */
    public View m32395b(Context context, Cursor cursor, ViewGroup viewGroup) {
        return m32390a(context, cursor, viewGroup);
    }

    /* renamed from: a */
    public void mo5142a(Cursor cursor) {
        Cursor b = m32394b(cursor);
        if (b != null) {
            b.close();
        }
    }

    /* renamed from: b */
    public Cursor m32394b(Cursor cursor) {
        if (cursor == this.f24398c) {
            return null;
        }
        Cursor cursor2 = this.f24398c;
        if (cursor2 != null) {
            if (this.f24401f != null) {
                cursor2.unregisterContentObserver(this.f24401f);
            }
            if (this.f24402g != null) {
                cursor2.unregisterDataSetObserver(this.f24402g);
            }
        }
        this.f24398c = cursor;
        if (cursor != null) {
            if (this.f24401f != null) {
                cursor.registerContentObserver(this.f24401f);
            }
            if (this.f24402g != null) {
                cursor.registerDataSetObserver(this.f24402g);
            }
            this.f24400e = cursor.getColumnIndexOrThrow(AnalyticsSQLiteHelper.GENERAL_ID);
            this.f24396a = true;
            notifyDataSetChanged();
            return cursor2;
        }
        this.f24400e = -1;
        this.f24396a = false;
        notifyDataSetInvalidated();
        return cursor2;
    }

    /* renamed from: c */
    public CharSequence mo5143c(Cursor cursor) {
        return cursor == null ? "" : cursor.toString();
    }

    /* renamed from: a */
    public Cursor mo5141a(CharSequence charSequence) {
        if (this.f24404i != null) {
            return this.f24404i.runQuery(charSequence);
        }
        return this.f24398c;
    }

    public Filter getFilter() {
        if (this.f24403h == null) {
            this.f24403h = new lg(this);
        }
        return this.f24403h;
    }

    /* renamed from: b */
    protected void m32396b() {
        if (this.f24397b && this.f24398c != null && !this.f24398c.isClosed()) {
            this.f24396a = this.f24398c.requery();
        }
    }
}
