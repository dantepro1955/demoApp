package com.p000;

import android.os.Handler;
import android.os.RemoteException;
import java.util.LinkedList;
import java.util.List;
import p000.azs.C0929a;
import p000.azt.C0930a;
import p000.azz.C0931a;
import p000.bbn.C0993a;
import p000.bgc.C1064a;
import p000.biq.C1077a;

@bhd
/* renamed from: bds */
class bds {
    /* renamed from: a */
    private final List<C1054a> f5696a = new LinkedList();

    /* renamed from: bds$a */
    interface C1054a {
        /* renamed from: a */
        void mo1007a(bdt bdt) throws RemoteException;
    }

    /* renamed from: bds$1 */
    class C10601 extends C0930a {
        /* renamed from: a */
        final /* synthetic */ bds f5682a;

        /* renamed from: bds$1$1 */
        class C10551 implements C1054a {
            C10551(C10601 c10601) {
            }

            /* renamed from: a */
            public void mo1007a(bdt bdt) throws RemoteException {
                if (bdt.f5698a != null) {
                    bdt.f5698a.mo859a();
                }
            }
        }

        /* renamed from: bds$1$3 */
        class C10573 implements C1054a {
            C10573(C10601 c10601) {
            }

            /* renamed from: a */
            public void mo1007a(bdt bdt) throws RemoteException {
                if (bdt.f5698a != null) {
                    bdt.f5698a.mo861b();
                }
            }
        }

        /* renamed from: bds$1$4 */
        class C10584 implements C1054a {
            C10584(C10601 c10601) {
            }

            /* renamed from: a */
            public void mo1007a(bdt bdt) throws RemoteException {
                if (bdt.f5698a != null) {
                    bdt.f5698a.mo862c();
                }
            }
        }

        /* renamed from: bds$1$5 */
        class C10595 implements C1054a {
            C10595(C10601 c10601) {
            }

            /* renamed from: a */
            public void mo1007a(bdt bdt) throws RemoteException {
                if (bdt.f5698a != null) {
                    bdt.f5698a.mo863d();
                }
            }
        }

        C10601(bds bds) {
            this.f5682a = bds;
        }

        /* renamed from: a */
        public void mo859a() throws RemoteException {
            this.f5682a.f5696a.add(new C10551(this));
        }

        /* renamed from: a */
        public void mo860a(final int i) throws RemoteException {
            this.f5682a.f5696a.add(new C1054a(this) {
                /* renamed from: a */
                public void mo1007a(bdt bdt) throws RemoteException {
                    if (bdt.f5698a != null) {
                        bdt.f5698a.mo860a(i);
                    }
                }
            });
            bkc.m9012a("Pooled interstitial failed to load.");
        }

        /* renamed from: b */
        public void mo861b() throws RemoteException {
            this.f5682a.f5696a.add(new C10573(this));
        }

        /* renamed from: c */
        public void mo862c() throws RemoteException {
            this.f5682a.f5696a.add(new C10584(this));
            bkc.m9012a("Pooled interstitial loaded.");
        }

        /* renamed from: d */
        public void mo863d() throws RemoteException {
            this.f5682a.f5696a.add(new C10595(this));
        }
    }

    /* renamed from: bds$2 */
    class C10622 extends C0931a {
        /* renamed from: a */
        final /* synthetic */ bds f5685a;

        C10622(bds bds) {
            this.f5685a = bds;
        }

        /* renamed from: a */
        public void mo867a(final String str, final String str2) throws RemoteException {
            this.f5685a.f5696a.add(new C1054a(this) {
                /* renamed from: a */
                public void mo1007a(bdt bdt) throws RemoteException {
                    if (bdt.f5699b != null) {
                        bdt.f5699b.mo867a(str, str2);
                    }
                }
            });
        }
    }

    /* renamed from: bds$3 */
    class C10653 extends C1064a {
        /* renamed from: a */
        final /* synthetic */ bds f5687a;

        C10653(bds bds) {
            this.f5687a = bds;
        }

        /* renamed from: a */
        public void mo1008a(final bgb bgb) throws RemoteException {
            this.f5687a.f5696a.add(new C1054a(this) {
                /* renamed from: a */
                public void mo1007a(bdt bdt) throws RemoteException {
                    if (bdt.f5700c != null) {
                        bdt.f5700c.mo1008a(bgb);
                    }
                }
            });
        }
    }

    /* renamed from: bds$4 */
    class C10674 extends C0993a {
        /* renamed from: a */
        final /* synthetic */ bds f5689a;

        C10674(bds bds) {
            this.f5689a = bds;
        }

        /* renamed from: a */
        public void mo920a(final bbm bbm) throws RemoteException {
            this.f5689a.f5696a.add(new C1054a(this) {
                /* renamed from: a */
                public void mo1007a(bdt bdt) throws RemoteException {
                    if (bdt.f5701d != null) {
                        bdt.f5701d.mo920a(bbm);
                    }
                }
            });
        }
    }

    /* renamed from: bds$5 */
    class C10695 extends C0929a {
        /* renamed from: a */
        final /* synthetic */ bds f5690a;

        /* renamed from: bds$5$1 */
        class C10681 implements C1054a {
            C10681(C10695 c10695) {
            }

            /* renamed from: a */
            public void mo1007a(bdt bdt) throws RemoteException {
                if (bdt.f5702e != null) {
                    bdt.f5702e.mo858a();
                }
            }
        }

        C10695(bds bds) {
            this.f5690a = bds;
        }

        /* renamed from: a */
        public void mo858a() throws RemoteException {
            this.f5690a.f5696a.add(new C10681(this));
        }
    }

    /* renamed from: bds$6 */
    class C10786 extends C1077a {
        /* renamed from: a */
        final /* synthetic */ bds f5693a;

        /* renamed from: bds$6$1 */
        class C10701 implements C1054a {
            C10701(C10786 c10786) {
            }

            /* renamed from: a */
            public void mo1007a(bdt bdt) throws RemoteException {
                if (bdt.f5703f != null) {
                    bdt.f5703f.mo1009a();
                }
            }
        }

        /* renamed from: bds$6$2 */
        class C10712 implements C1054a {
            C10712(C10786 c10786) {
            }

            /* renamed from: a */
            public void mo1007a(bdt bdt) throws RemoteException {
                if (bdt.f5703f != null) {
                    bdt.f5703f.mo1012b();
                }
            }
        }

        /* renamed from: bds$6$3 */
        class C10723 implements C1054a {
            C10723(C10786 c10786) {
            }

            /* renamed from: a */
            public void mo1007a(bdt bdt) throws RemoteException {
                if (bdt.f5703f != null) {
                    bdt.f5703f.mo1013c();
                }
            }
        }

        /* renamed from: bds$6$4 */
        class C10734 implements C1054a {
            C10734(C10786 c10786) {
            }

            /* renamed from: a */
            public void mo1007a(bdt bdt) throws RemoteException {
                if (bdt.f5703f != null) {
                    bdt.f5703f.mo1014d();
                }
            }
        }

        /* renamed from: bds$6$6 */
        class C10756 implements C1054a {
            C10756(C10786 c10786) {
            }

            /* renamed from: a */
            public void mo1007a(bdt bdt) throws RemoteException {
                if (bdt.f5703f != null) {
                    bdt.f5703f.mo1015e();
                }
            }
        }

        C10786(bds bds) {
            this.f5693a = bds;
        }

        /* renamed from: a */
        public void mo1009a() throws RemoteException {
            this.f5693a.f5696a.add(new C10701(this));
        }

        /* renamed from: a */
        public void mo1010a(final int i) throws RemoteException {
            this.f5693a.f5696a.add(new C1054a(this) {
                /* renamed from: a */
                public void mo1007a(bdt bdt) throws RemoteException {
                    if (bdt.f5703f != null) {
                        bdt.f5703f.mo1010a(i);
                    }
                }
            });
        }

        /* renamed from: a */
        public void mo1011a(final bin bin) throws RemoteException {
            this.f5693a.f5696a.add(new C1054a(this) {
                /* renamed from: a */
                public void mo1007a(bdt bdt) throws RemoteException {
                    if (bdt.f5703f != null) {
                        bdt.f5703f.mo1011a(bin);
                    }
                }
            });
        }

        /* renamed from: b */
        public void mo1012b() throws RemoteException {
            this.f5693a.f5696a.add(new C10712(this));
        }

        /* renamed from: c */
        public void mo1013c() throws RemoteException {
            this.f5693a.f5696a.add(new C10723(this));
        }

        /* renamed from: d */
        public void mo1014d() throws RemoteException {
            this.f5693a.f5696a.add(new C10734(this));
        }

        /* renamed from: e */
        public void mo1015e() throws RemoteException {
            this.f5693a.f5696a.add(new C10756(this));
        }
    }

    bds() {
    }

    /* renamed from: a */
    void m7665a(akf akf) {
        akf.mo227a(new C10601(this));
        akf.mo228a(new C10622(this));
        akf.mo231a(new C10653(this));
        akf.mo230a(new C10674(this));
        akf.mo226a(new C10695(this));
        akf.mo233a(new C10786(this));
    }

    /* renamed from: a */
    void m7666a(final bdt bdt) {
        Handler handler = bkg.f6710a;
        for (final C1054a c1054a : this.f5696a) {
            handler.post(new Runnable(this) {
                public void run() {
                    try {
                        c1054a.mo1007a(bdt);
                    } catch (Throwable e) {
                        bky.m9009c("Could not propagate interstitial ad event.", e);
                    }
                }
            });
        }
        this.f5696a.clear();
    }
}
