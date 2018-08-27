package com.p000;

import com.facebook.common.time.Clock;
import java.util.Collection;
import java.util.HashSet;

/* renamed from: yc */
class yc implements zb {
    /* renamed from: a */
    final /* synthetic */ vl f26028a;
    /* renamed from: b */
    private final yd f26029b;

    private yc(vl vlVar, yd ydVar) {
        this.f26028a = vlVar;
        this.f26029b = ydVar;
    }

    /* renamed from: a */
    public void mo5548a(int i) {
        synchronized (this.f26029b.f26031b) {
            Collection<zb> hashSet = new HashSet(this.f26029b.f26036g);
            this.f26029b.f26036g.clear();
            this.f26029b.f26034e = false;
        }
        for (zb a : hashSet) {
            try {
                a.mo5548a(i);
            } catch (Throwable th) {
                this.f26028a.f25717d.mo5609b("AppLovinAdService", "Unable to notify listener about ad load failure", th);
            }
        }
    }

    /* renamed from: a */
    public void mo5549a(yy yyVar) {
        synchronized (this.f26029b.f26031b) {
            if (this.f26028a.m34359a(this.f26029b.f26030a)) {
                long b = this.f26028a.m34362b(this.f26029b.f26030a);
                if (b > 0) {
                    this.f26029b.f26033d = (b * 1000) + System.currentTimeMillis();
                } else if (b == 0) {
                    this.f26029b.f26033d = Clock.MAX_TIME;
                }
                this.f26029b.f26032c = yyVar;
            } else {
                this.f26029b.f26032c = null;
                this.f26029b.f26033d = 0;
            }
            Collection<zb> hashSet = new HashSet(this.f26029b.f26036g);
            this.f26029b.f26036g.clear();
            Collection<zf> hashSet2 = new HashSet(this.f26029b.f26035f);
            this.f26029b.f26034e = false;
        }
        this.f26028a.m34368c(this.f26029b.f26030a);
        for (zb a : hashSet) {
            try {
                a.mo5549a(yyVar);
            } catch (Throwable th) {
                this.f26028a.f25717d.mo5609b("AppLovinAdService", "Unable to notify listener about a newly loaded ad", th);
            }
        }
        for (zf b2 : hashSet2) {
            try {
                b2.mo5550b(yyVar);
            } catch (Throwable th2) {
                this.f26028a.f25717d.mo5609b("AppLovinAdService", "Unable to notify listener about an updated loaded ad", th2);
            }
        }
    }
}
