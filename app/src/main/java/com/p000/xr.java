package com.p000;

import org.json.JSONObject;

/* renamed from: xr */
abstract class xr extends wo implements yk {
    /* renamed from: e */
    private int f25937e;
    /* renamed from: f */
    private long f25938f;
    /* renamed from: g */
    private final yk f25939g;
    /* renamed from: h */
    private wr f25940h;

    xr(String str, int i, vm vmVar) {
        super(str, vmVar);
        this.f25938f = -1;
        this.f25940h = null;
        this.f25937e = i;
        this.f25939g = new xs(this, vmVar, str);
    }

    xr(String str, wr wrVar, vm vmVar) {
        this(str, ((Integer) vmVar.m34391a(wrVar)).intValue(), vmVar);
    }

    /* renamed from: c */
    private void m34720c() {
        if (this.f25940h != null) {
            ws h = this.b.m34403h();
            h.m34657a(this.f25940h, this.f25940h.m34650c());
            h.m34659b();
        }
    }

    /* renamed from: a */
    public void mo5589a(int i) {
    }

    /* renamed from: a */
    public void m34723a(long j) {
        this.f25938f = j;
    }

    /* renamed from: a */
    public void mo5590a(JSONObject jSONObject, int i) {
    }

    /* renamed from: a */
    public void m34725a(wr wrVar) {
        this.f25940h = wrVar;
    }

    /* renamed from: a */
    protected abstract void mo5591a(yj yjVar, yk ykVar);

    public void run() {
        mo5591a(this.b.m34405j(), this.f25939g);
    }
}
