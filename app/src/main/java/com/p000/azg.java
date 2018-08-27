package com.p000;

import com.mopub.volley.DefaultRetryPolicy;

/* renamed from: azg */
public class azg implements bjr {
    /* renamed from: a */
    private int f5124a;
    /* renamed from: b */
    private int f5125b;
    /* renamed from: c */
    private final int f5126c;
    /* renamed from: d */
    private final float f5127d;

    public azg() {
        this(DefaultRetryPolicy.DEFAULT_TIMEOUT_MS, 1, 1.0f);
    }

    public azg(int i, int i2, float f) {
        this.f5124a = i;
        this.f5126c = i2;
        this.f5127d = f;
    }

    /* renamed from: a */
    public int mo864a() {
        return this.f5124a;
    }

    /* renamed from: a */
    public void mo865a(bmt bmt) throws bmt {
        this.f5125b++;
        this.f5124a = (int) (((float) this.f5124a) + (((float) this.f5124a) * this.f5127d));
        if (!m6718c()) {
            throw bmt;
        }
    }

    /* renamed from: b */
    public int mo866b() {
        return this.f5125b;
    }

    /* renamed from: c */
    protected boolean m6718c() {
        return this.f5125b <= this.f5126c;
    }
}
