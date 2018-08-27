package com.p000;

import java.util.List;

/* compiled from: BaseItemAdapter */
/* renamed from: csr */
public abstract class csr<T> extends csy {
    /* renamed from: b */
    protected List<T> f20127b;

    public csr(List<T> list) {
        this.f20127b = list;
    }

    /* renamed from: a */
    public void mo4145a(List<T> list) {
        this.f20127b.clear();
        this.f20127b.addAll(list);
        notifyDataSetChanged();
    }

    /* renamed from: a */
    public void mo4144a(int i) {
        this.f20127b.remove(i);
        notifyItemRemoved(i);
    }

    public int getItemCount() {
        if (this.f20127b == null) {
            return 0;
        }
        return this.f20127b.size();
    }

    /* renamed from: b */
    public T m24811b(int i) {
        return this.f20127b.get(i);
    }

    /* renamed from: c */
    public List<T> m24812c() {
        return this.f20127b;
    }
}
