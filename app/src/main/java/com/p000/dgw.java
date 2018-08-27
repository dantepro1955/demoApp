package com.p000;

/* compiled from: LoggerWrapper */
/* renamed from: dgw */
public final class dgw {
    /* renamed from: a */
    private dfz f21601a;

    public dgw(dfz dfz) {
        this.f21601a = dfz;
    }

    /* renamed from: a */
    public void m27249a(String str, String str2, String str3) {
        if (this.f21601a != null) {
            this.f21601a.log(str, str2, str3);
        }
    }

    /* renamed from: a */
    public void m27248a(String str, int i) {
        if (this.f21601a != null) {
            this.f21601a.logCount(str, i);
        }
    }
}
