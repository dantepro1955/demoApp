package com.p000;

import java.util.Map;

/* renamed from: ye */
class ye extends wo {
    /* renamed from: e */
    final /* synthetic */ vl f26037e;
    /* renamed from: f */
    private final zd f26038f;

    public ye(vl vlVar, zd zdVar) {
        this.f26037e = vlVar;
        super("UpdateAdTask", vlVar.f25716c);
        this.f26038f = zdVar;
    }

    public void run() {
        Object obj = 1;
        yd ydVar = (yd) ((Map) this.f26037e.f25719f.get(ze.f26079a)).get(this.f26038f);
        synchronized (ydVar.f26031b) {
            boolean a = this.f26037e.m34359a(this.f26038f);
            boolean e = this.f26037e.m34357a();
            Object obj2 = !ydVar.f26035f.isEmpty() ? 1 : null;
            if (System.currentTimeMillis() <= ydVar.f26033d) {
                obj = null;
            }
            if (!(!a || obj2 == null || r1 == null || !e || ydVar.f26034e)) {
                ydVar.f26034e = true;
                this.f26037e.m34364b(this.f26038f, ze.f26079a, new yc(this.f26037e, ydVar, null));
            }
        }
    }
}
