package com.p000;

import android.support.v7.widget.RecyclerView.C0581a;
import android.support.v7.widget.RecyclerView.C0583c;
import android.support.v7.widget.RecyclerView.C0605t;
import android.util.SparseIntArray;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: BlitzMergeAdapter */
/* renamed from: csv */
public class csv<T extends C0581a> extends C0581a {
    /* renamed from: a */
    public final ArrayList<C4562b> f20137a = new ArrayList();
    /* renamed from: b */
    private int f20138b = 0;
    /* renamed from: c */
    private final hh<C0581a, C4561a> f20139c = new hh();

    /* compiled from: BlitzMergeAdapter */
    /* renamed from: csv$a */
    class C4561a extends C0583c {
        /* renamed from: a */
        final /* synthetic */ csv f20131a;
        /* renamed from: b */
        private C0581a f20132b;

        public C4561a(csv csv, C0581a c0581a) {
            this.f20131a = csv;
            this.f20132b = c0581a;
        }

        public void onChanged() {
            this.f20131a.notifyDataSetChanged();
        }

        public void onItemRangeChanged(int i, int i2) {
            int a = this.f20131a.m24819a(this.f20132b, i);
            super.onItemRangeChanged(a, i2);
            this.f20131a.notifyItemRangeChanged(a, i2);
        }

        public void onItemRangeInserted(int i, int i2) {
            int a = this.f20131a.m24819a(this.f20132b, i);
            super.onItemRangeInserted(a, i2);
            this.f20131a.notifyItemRangeInserted(a, i2);
        }

        public void onItemRangeRemoved(int i, int i2) {
            int a = this.f20131a.m24819a(this.f20132b, i);
            super.onItemRangeRemoved(a, i2);
            this.f20131a.notifyItemRangeRemoved(a, i2);
        }
    }

    /* compiled from: BlitzMergeAdapter */
    /* renamed from: csv$b */
    public class C4562b {
        /* renamed from: a */
        public final T f20133a;
        /* renamed from: b */
        public int f20134b = 0;
        /* renamed from: c */
        public SparseIntArray f20135c = new SparseIntArray();
        /* renamed from: d */
        final /* synthetic */ csv f20136d;

        public C4562b(csv csv, T t) {
            this.f20136d = csv;
            this.f20133a = t;
        }
    }

    /* renamed from: a */
    public void m24825a(T t) {
        m24824a(this.f20137a.size(), (C0581a) t);
    }

    /* renamed from: a */
    public void m24824a(int i, T t) {
        this.f20137a.add(i, new C4562b(this, t));
        C0583c c4561a = new C4561a(this, t);
        this.f20139c.put(t, c4561a);
        t.registerAdapterDataObserver(c4561a);
        notifyDataSetChanged();
    }

    /* renamed from: a */
    public int m24822a() {
        return this.f20137a.size();
    }

    /* renamed from: a */
    public T m24823a(int i) {
        return ((C4562b) this.f20137a.get(i)).f20133a;
    }

    public int getItemCount() {
        Iterator it = this.f20137a.iterator();
        int i = 0;
        while (it.hasNext()) {
            i = ((C4562b) it.next()).f20133a.getItemCount() + i;
        }
        return i;
    }

    /* renamed from: b */
    public C4562b m24826b(int i) {
        int size = this.f20137a.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            C4562b c4562b = (C4562b) this.f20137a.get(i3);
            int itemCount = c4562b.f20133a.getItemCount() + i2;
            if (i < itemCount) {
                c4562b.f20134b = i - i2;
                return c4562b;
            }
            i2 = itemCount;
        }
        return null;
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public int getItemViewType(int i) {
        C4562b b = m24826b(i);
        int itemViewType = b.f20133a.getItemViewType(b.f20134b);
        if (b.f20135c.indexOfValue(itemViewType) >= 0) {
            int size = b.f20135c.size();
            for (int i2 = 0; i2 < size; i2++) {
                int keyAt = b.f20135c.keyAt(i2);
                if (b.f20135c.get(keyAt) == itemViewType) {
                    return keyAt;
                }
            }
        }
        this.f20138b++;
        b.f20135c.put(this.f20138b, itemViewType);
        return this.f20138b;
    }

    public C0605t onCreateViewHolder(ViewGroup viewGroup, int i) {
        Iterator it = this.f20137a.iterator();
        while (it.hasNext()) {
            C4562b c4562b = (C4562b) it.next();
            if (c4562b.f20135c.indexOfKey(i) >= 0) {
                return c4562b.f20133a.onCreateViewHolder(viewGroup, c4562b.f20135c.get(i));
            }
        }
        return null;
    }

    public void onBindViewHolder(C0605t c0605t, int i) {
        C4562b b = m24826b(i);
        b.f20133a.onBindViewHolder(c0605t, b.f20134b);
    }

    /* renamed from: a */
    private int m24819a(C0581a c0581a, int i) {
        int b = m24821b(c0581a);
        Iterator it = this.f20137a.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            C4562b c4562b = (C4562b) it.next();
            if (i2 >= b) {
                break;
            }
            i += c4562b.f20133a.getItemCount();
            i2++;
        }
        return i;
    }

    /* renamed from: b */
    private int m24821b(C0581a c0581a) {
        for (int i = 0; i < this.f20137a.size(); i++) {
            if (((C4562b) this.f20137a.get(i)).f20133a == c0581a) {
                return i;
            }
        }
        return -1;
    }
}
