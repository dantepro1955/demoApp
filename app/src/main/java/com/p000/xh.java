package com.p000;

import com.facebook.stetho.server.http.HttpStatus;
import org.json.JSONObject;

/* renamed from: xh */
class xh extends xr {
    /* renamed from: e */
    final /* synthetic */ xg f25967e;

    xh(xg xgVar, String str, wr wrVar, vm vmVar) {
        this.f25967e = xgVar;
        super(str, wrVar, vmVar);
    }

    /* renamed from: a */
    public void mo5589a(int i) {
        this.f25967e.m34766b(i);
    }

    /* renamed from: a */
    public void mo5590a(JSONObject jSONObject, int i) {
        if (i == HttpStatus.HTTP_OK) {
            this.f25967e.m34767b(jSONObject);
        } else {
            this.f25967e.m34766b(i);
        }
    }

    /* renamed from: a */
    protected void mo5591a(yj yjVar, yk ykVar) {
        yjVar.m34906a(this.f25967e.m34782c(), ((Integer) this.b.m34391a(wp.f25912p)).intValue(), ykVar);
    }
}
