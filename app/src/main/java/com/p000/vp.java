package com.p000;

import java.util.Map;

/* renamed from: vp */
public class vp implements zk {
    /* renamed from: a */
    private final vm f25770a;

    vp(vm vmVar) {
        this.f25770a = vmVar;
    }

    /* renamed from: a */
    public void m34451a(String str, Map map, int i, int i2, int i3, zj zjVar) {
        if (zn.m34841d(str)) {
            wo xeVar = new xe(this.f25770a, str, map, zjVar);
            xeVar.m34756b(i2);
            xeVar.m34755a(i);
            xeVar.m34757c(i3);
            this.f25770a.m34407l().m34803a(xeVar, xl.POSTBACKS);
            return;
        }
        this.f25770a.mo5561g().mo5612d("PostbackService", "Requested a postback dispatch for an empty URL; nothing to do...");
        if (zjVar != null) {
            zjVar.onPostbackFailure(str, -900);
        }
    }

    /* renamed from: a */
    public void m34452a(String str, Map map, zj zjVar) {
        if (zn.m34841d(str)) {
            this.f25770a.m34407l().m34803a(new xe(this.f25770a, str, map, new wk(this, zjVar)), xl.POSTBACKS);
            return;
        }
        this.f25770a.mo5561g().mo5606a("PostbackService", "Ignoring enqueued postback request to invalid URL");
    }

    /* renamed from: a */
    public void mo5566a(String str, zj zjVar) {
        m34452a(str, null, zjVar);
    }
}
