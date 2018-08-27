package com.p000;

import p000.cyu.C3618a;

/* renamed from: cyx */
final class cyx extends C0000a implements cyu {
    /* renamed from: b */
    private cyw f20716b;
    /* renamed from: c */
    private C3618a f20717c;
    /* renamed from: d */
    private final czv f20718d;

    /* renamed from: cyx$2 */
    class C46762 implements C3618a {
        /* renamed from: a */
        final /* synthetic */ cyx f20712a;

        C46762(cyx cyx) {
            this.f20712a = cyx;
        }

        public final void onSpeakingBegin(cyu cyu, final String str, final Object obj) {
            this.f20712a.a(new Runnable(this) {
                /* renamed from: c */
                private /* synthetic */ C46762 f20707c;

                public final void run() {
                    this.f20707c.f20712a.m25708a().onSpeakingBegin(this.f20707c.f20712a, str, obj);
                }
            });
        }

        public final void onSpeakingDone(cyu cyu, final String str, final cys cys, final Object obj) {
            this.f20712a.a(new Runnable(this) {
                /* renamed from: d */
                private /* synthetic */ C46762 f20711d;

                public final void run() {
                    this.f20711d.f20712a.m25708a().onSpeakingDone(this.f20711d.f20712a, str, cys, obj);
                }
            });
        }
    }

    public cyx(czv czv, final String str, final String str2, C3618a c3618a, Object obj) {
        super(obj);
        this.f20717c = c3618a;
        this.f20718d = czv;
        qu.m33922a(new Runnable(this) {
            /* renamed from: c */
            private /* synthetic */ cyx f20704c;

            public final void run() {
                this.f20704c.f20716b = new cyw(this.f20704c.f20718d.m25903b(), str, str2, new C46762(this.f20704c));
            }
        });
    }

    /* renamed from: a */
    private C3618a m25708a() {
        C3618a c3618a;
        synchronized (this.a) {
            c3618a = this.f20717c;
        }
        return c3618a;
    }

    /* renamed from: a */
    public final void mo4236a(final String str, final Object obj) {
        this.f20718d.m25905d();
        czv.m25885a((Object) str, "text");
        qu.m33922a(new Runnable(this) {
            /* renamed from: c */
            private /* synthetic */ cyx f20715c;

            public final void run() {
                this.f20715c.f20716b.mo4236a(str, obj);
            }
        });
    }
}
