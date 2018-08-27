package com.p000;

import org.json.JSONObject;

/* renamed from: xf */
class xf extends xr {
    /* renamed from: e */
    final /* synthetic */ xe f25962e;

    xf(xe xeVar, String str, int i, vm vmVar) {
        this.f25962e = xeVar;
        super(str, i, vmVar);
    }

    /* renamed from: a */
    public void mo5589a(int i) {
        this.f25962e.f25958g.onPostbackFailure(this.f25962e.f25956e, i);
    }

    /* renamed from: a */
    public void mo5590a(JSONObject jSONObject, int i) {
        this.f25962e.f25958g.onPostbackSuccess(this.f25962e.f25956e);
    }

    /* renamed from: a */
    protected void mo5591a(yj yjVar, yk ykVar) {
        int intValue = this.f25962e.f25961j < 0 ? ((Integer) this.b.m34391a(wp.as)).intValue() : this.f25962e.f25961j;
        if (this.f25962e.f25957f == null) {
            yjVar.m34907a(this.f25962e.f25956e, intValue, false, ykVar);
        } else {
            yjVar.m34905a(this.f25962e.f25956e, intValue, new JSONObject(this.f25962e.f25957f), false, ykVar);
        }
    }
}
