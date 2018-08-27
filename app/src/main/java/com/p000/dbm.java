package com.p000;

import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnKeyListener;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.ListView;
import p000.dbt.C4782d;
import p000.dbt.C4783e;

/* compiled from: ListHolder */
/* renamed from: dbm */
public class dbm implements OnItemClickListener, dbl {
    /* renamed from: a */
    private int f21104a;
    /* renamed from: b */
    private ListView f21105b;
    /* renamed from: c */
    private dbr f21106c;
    /* renamed from: d */
    private OnKeyListener f21107d;
    /* renamed from: e */
    private View f21108e;
    /* renamed from: f */
    private View f21109f;

    /* compiled from: ListHolder */
    /* renamed from: dbm$1 */
    class C47781 implements OnKeyListener {
        /* renamed from: a */
        final /* synthetic */ dbm f21103a;

        C47781(dbm dbm) {
            this.f21103a = dbm;
        }

        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            if (this.f21103a.f21107d != null) {
                return this.f21103a.f21107d.onKey(view, i, keyEvent);
            }
            throw new NullPointerException("keyListener should not be null");
        }
    }

    /* renamed from: a */
    public void mo4312a(View view) {
        if (view != null) {
            this.f21105b.addHeaderView(view);
            this.f21108e = view;
        }
    }

    /* renamed from: b */
    public void mo4315b(View view) {
        if (view != null) {
            this.f21105b.addFooterView(view);
            this.f21109f = view;
        }
    }

    /* renamed from: a */
    public void mo4313a(BaseAdapter baseAdapter) {
        this.f21105b.setAdapter(baseAdapter);
    }

    /* renamed from: a */
    public void mo4310a(int i) {
        this.f21104a = i;
    }

    /* renamed from: a */
    public View mo4309a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(C4783e.dialog_list, viewGroup, false);
        inflate.findViewById(C4782d.dialogplus_outmost_container).setBackgroundResource(this.f21104a);
        this.f21105b = (ListView) inflate.findViewById(C4782d.dialogplus_list);
        this.f21105b.setOnItemClickListener(this);
        this.f21105b.setOnKeyListener(new C47781(this));
        return inflate;
    }

    /* renamed from: a */
    public void mo4314a(dbr dbr) {
        this.f21106c = dbr;
    }

    /* renamed from: a */
    public void mo4311a(OnKeyListener onKeyListener) {
        this.f21107d = onKeyListener;
    }

    /* renamed from: a */
    public View mo4308a() {
        return this.f21105b;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        if (this.f21106c != null) {
            dbr dbr = this.f21106c;
            Object itemAtPosition = adapterView.getItemAtPosition(i);
            if (this.f21108e != null) {
                i--;
            }
            dbr.mo4306a(itemAtPosition, view, i);
        }
    }
}
