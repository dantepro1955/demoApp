package com.p000;

import java.util.Map;

/* renamed from: xe */
public class xe extends wo {
    /* renamed from: e */
    private final String f25956e;
    /* renamed from: f */
    private final Map f25957f;
    /* renamed from: g */
    private final zj f25958g;
    /* renamed from: h */
    private int f25959h;
    /* renamed from: i */
    private int f25960i;
    /* renamed from: j */
    private int f25961j = -1;

    public xe(vm vmVar, String str, Map map, zj zjVar) {
        super("TaskDispatchPostback", vmVar);
        this.f25956e = str;
        this.f25958g = zjVar;
        this.f25957f = map;
    }

    /* renamed from: a */
    public void m34755a(int i) {
        this.f25959h = i;
    }

    /* renamed from: b */
    public void m34756b(int i) {
        this.f25960i = i;
    }

    /* renamed from: c */
    public void m34757c(int i) {
        this.f25961j = i;
    }

    public void run() {
        if (zn.m34841d(this.f25956e)) {
            xr xfVar = new xf(this, "RepeatTaskDispatchPostback", this.f25959h < 0 ? ((Integer) this.b.m34391a(wp.at)).intValue() : this.f25959h, this.b);
            xfVar.m34723a((long) this.f25960i);
            xfVar.run();
            return;
        }
        this.b.mo5561g().mo5608b("TaskDispatchPostback", "Requested URL is not valid; nothing to do...");
        this.f25958g.onPostbackFailure(this.f25956e, -900);
    }
}
