package com.p000;

import android.os.Process;
import android.util.SparseArray;
import java.lang.ref.WeakReference;

/* compiled from: AbstractQueryData */
/* renamed from: dok */
abstract class dok<T, Q extends doj<T>> {
    /* renamed from: a */
    final String f22425a;
    /* renamed from: b */
    final dnt<T, ?> f22426b;
    /* renamed from: c */
    final String[] f22427c;
    /* renamed from: d */
    final SparseArray<WeakReference<Q>> f22428d = new SparseArray();

    /* renamed from: b */
    protected abstract Q mo4503b();

    dok(dnt<T, ?> dnt, String str, String[] strArr) {
        this.f22426b = dnt;
        this.f22425a = str;
        this.f22427c = strArr;
    }

    /* renamed from: a */
    Q m28442a(Q q) {
        if (Thread.currentThread() != q.f22424e) {
            return m28441a();
        }
        System.arraycopy(this.f22427c, 0, q.f22423d, 0, this.f22427c.length);
        return q;
    }

    /* renamed from: a */
    Q m28441a() {
        int i;
        Q q;
        int myTid = Process.myTid();
        if (myTid == 0) {
            long id = Thread.currentThread().getId();
            if (id < 0 || id > 2147483647L) {
                throw new RuntimeException("Cannot handle thread ID: " + id);
            }
            i = (int) id;
        } else {
            i = myTid;
        }
        synchronized (this.f22428d) {
            WeakReference weakReference = (WeakReference) this.f22428d.get(i);
            q = weakReference != null ? (doj) weakReference.get() : null;
            if (q == null) {
                m28444c();
                q = mo4503b();
                this.f22428d.put(i, new WeakReference(q));
            } else {
                System.arraycopy(this.f22427c, 0, q.f22423d, 0, this.f22427c.length);
            }
        }
        return q;
    }

    /* renamed from: c */
    void m28444c() {
        synchronized (this.f22428d) {
            for (int size = this.f22428d.size() - 1; size >= 0; size--) {
                if (((WeakReference) this.f22428d.valueAt(size)).get() == null) {
                    this.f22428d.remove(this.f22428d.keyAt(size));
                }
            }
        }
    }
}
