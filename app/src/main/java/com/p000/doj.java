package com.p000;

/* compiled from: AbstractQuery */
/* renamed from: doj */
abstract class doj<T> {
    /* renamed from: a */
    protected final dnt<T, ?> f22420a;
    /* renamed from: b */
    protected final dny<T> f22421b;
    /* renamed from: c */
    protected final String f22422c;
    /* renamed from: d */
    protected final String[] f22423d;
    /* renamed from: e */
    protected final Thread f22424e = Thread.currentThread();

    /* renamed from: a */
    protected static String[] m28438a(Object[] objArr) {
        int length = objArr.length;
        String[] strArr = new String[length];
        for (int i = 0; i < length; i++) {
            Object obj = objArr[i];
            if (obj != null) {
                strArr[i] = obj.toString();
            } else {
                strArr[i] = null;
            }
        }
        return strArr;
    }

    protected doj(dnt<T, ?> dnt, String str, String[] strArr) {
        this.f22420a = dnt;
        this.f22421b = new dny(dnt);
        this.f22422c = str;
        this.f22423d = strArr;
    }

    /* renamed from: a */
    public doj<T> mo4502a(int i, Object obj) {
        m28440a();
        if (obj != null) {
            this.f22423d[i] = obj.toString();
        } else {
            this.f22423d[i] = null;
        }
        return this;
    }

    /* renamed from: a */
    protected void m28440a() {
        if (Thread.currentThread() != this.f22424e) {
            throw new dnw("Method may be called only in owner thread, use forCurrentThread to get an instance for this thread");
        }
    }
}
