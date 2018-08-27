package com.p000;

import java.util.concurrent.ScheduledExecutorService;
import p000.dtm;
import p000.dtm.C5084a;
import p000.dtm.C5090b;
import p000.dtp.C5092a;
import p000.dtp.C5093b;
import p000.dtt;
import p000.dtt.C5095a;
import p000.dtw;
import p000.duk;
import p000.dvw;
import p000.dvy;
import p000.dyj;
import p000.dyl;
import p000.dym;

/* compiled from: RxJavaHooks */
/* renamed from: dyg */
public final class dyg {
    /* renamed from: a */
    static volatile dul<Throwable> f23466a;
    /* renamed from: b */
    static volatile duo<C5092a, C5092a> f23467b;
    /* renamed from: c */
    static volatile duo<C5095a, C5095a> f23468c;
    /* renamed from: d */
    static volatile duo<C5084a, C5084a> f23469d;
    /* renamed from: e */
    static volatile dup<dtp, C5092a, C5092a> f23470e;
    /* renamed from: f */
    static volatile dup<dtt, C5095a, C5095a> f23471f;
    /* renamed from: g */
    static volatile dup<dtm, C5084a, C5084a> f23472g;
    /* renamed from: h */
    static volatile duo<dts, dts> f23473h;
    /* renamed from: i */
    static volatile duo<dts, dts> f23474i;
    /* renamed from: j */
    static volatile duo<dts, dts> f23475j;
    /* renamed from: k */
    static volatile duo<duk, duk> f23476k;
    /* renamed from: l */
    static volatile duo<dtw, dtw> f23477l;
    /* renamed from: m */
    static volatile duo<dtw, dtw> f23478m;
    /* renamed from: n */
    static volatile dun<? extends ScheduledExecutorService> f23479n;
    /* renamed from: o */
    static volatile duo<Throwable, Throwable> f23480o;
    /* renamed from: p */
    static volatile duo<Throwable, Throwable> f23481p;
    /* renamed from: q */
    static volatile duo<Throwable, Throwable> f23482q;
    /* renamed from: r */
    static volatile duo<C5093b, C5093b> f23483r;
    /* renamed from: s */
    static volatile duo<C5093b, C5093b> f23484s;
    /* renamed from: t */
    static volatile duo<C5090b, C5090b> f23485t;

    /* compiled from: RxJavaHooks */
    /* renamed from: dyg$1 */
    static class C52371 implements dul<Throwable> {
        C52371() {
        }

        public /* synthetic */ void call(Object obj) {
            m29823a((Throwable) obj);
        }

        /* renamed from: a */
        public void m29823a(Throwable th) {
            dyj.a().b().a(th);
        }
    }

    /* compiled from: RxJavaHooks */
    /* renamed from: dyg$2 */
    static class C52382 implements duo<Throwable, Throwable> {
        C52382() {
        }

        /* renamed from: a */
        public Throwable m29825a(Throwable th) {
            return dyj.a().d().a(th);
        }
    }

    /* compiled from: RxJavaHooks */
    /* renamed from: dyg$3 */
    static class C52393 implements duo<C5093b, C5093b> {
        C52393() {
        }

        /* renamed from: a */
        public C5093b m29826a(C5093b c5093b) {
            return dyj.a().d().a(c5093b);
        }
    }

    /* compiled from: RxJavaHooks */
    /* renamed from: dyg$4 */
    static class C52404 implements duo<Throwable, Throwable> {
        C52404() {
        }

        /* renamed from: a */
        public Throwable m29829a(Throwable th) {
            return dyj.a().e().a(th);
        }
    }

    /* compiled from: RxJavaHooks */
    /* renamed from: dyg$5 */
    static class C52415 implements duo<C5090b, C5090b> {
        C52415() {
        }

        /* renamed from: a */
        public C5090b m29830a(C5090b c5090b) {
            return dyj.a().e().a(c5090b);
        }
    }

    /* compiled from: RxJavaHooks */
    /* renamed from: dyg$6 */
    static class C52426 implements duo<C5092a, C5092a> {
        C52426() {
        }

        /* renamed from: a */
        public C5092a m29832a(C5092a c5092a) {
            return dyj.a().c().a(c5092a);
        }
    }

    /* compiled from: RxJavaHooks */
    /* renamed from: dyg$7 */
    static class C52437 implements duo<C5095a, C5095a> {
        C52437() {
        }

        /* renamed from: a */
        public C5095a m29834a(C5095a c5095a) {
            return dyj.a().d().a(c5095a);
        }
    }

    /* compiled from: RxJavaHooks */
    /* renamed from: dyg$8 */
    static class C52448 implements duo<C5084a, C5084a> {
        C52448() {
        }

        /* renamed from: a */
        public C5084a m29836a(C5084a c5084a) {
            return dyj.a().e().a(c5084a);
        }
    }

    /* compiled from: RxJavaHooks */
    /* renamed from: dyg$9 */
    static class C52459 implements dup<dtp, C5092a, C5092a> {
        C52459() {
        }

        /* renamed from: a */
        public C5092a m29838a(dtp dtp, C5092a c5092a) {
            return dyj.a().c().a(dtp, c5092a);
        }
    }

    static {
        dyg.m29849a();
    }

    /* renamed from: a */
    static void m29849a() {
        f23466a = new C52371();
        f23470e = new C52459();
        f23477l = new duo<dtw, dtw>() {
            /* renamed from: a */
            public dtw m29809a(dtw dtw) {
                return dyj.a().c().a(dtw);
            }
        };
        f23471f = new dup<dtt, C5095a, C5095a>() {
            /* renamed from: a */
            public C5095a m29811a(dtt dtt, C5095a c5095a) {
                dyl d = dyj.a().d();
                return d == dym.m29860a() ? c5095a : new dvw(d.a(dtt, new dvy(c5095a)));
            }
        };
        f23478m = new duo<dtw, dtw>() {
            /* renamed from: a */
            public dtw m29813a(dtw dtw) {
                return dyj.a().d().a(dtw);
            }
        };
        f23472g = new dup<dtm, C5084a, C5084a>() {
            /* renamed from: a */
            public C5084a m29815a(dtm dtm, C5084a c5084a) {
                return dyj.a().e().a(dtm, c5084a);
            }
        };
        f23476k = new duo<duk, duk>() {
            /* renamed from: a */
            public duk m29817a(duk duk) {
                return dyj.a().f().a(duk);
            }
        };
        f23480o = new duo<Throwable, Throwable>() {
            /* renamed from: a */
            public Throwable m29820a(Throwable th) {
                return dyj.a().c().a(th);
            }
        };
        f23483r = new duo<C5093b, C5093b>() {
            /* renamed from: a */
            public C5093b m29821a(C5093b c5093b) {
                return dyj.a().c().a(c5093b);
            }
        };
        f23481p = new C52382();
        f23484s = new C52393();
        f23482q = new C52404();
        f23485t = new C52415();
        dyg.m29853b();
    }

    /* renamed from: b */
    static void m29853b() {
        f23467b = new C52426();
        f23468c = new C52437();
        f23469d = new C52448();
    }

    /* renamed from: a */
    public static void m29850a(Throwable th) {
        dul dul = f23466a;
        if (dul != null) {
            try {
                dul.call(th);
                return;
            } catch (Throwable th2) {
                System.err.println("The onError handler threw an Exception. It shouldn't. => " + th2.getMessage());
                th2.printStackTrace();
                dyg.m29854b(th2);
            }
        }
        dyg.m29854b(th);
    }

    /* renamed from: b */
    static void m29854b(Throwable th) {
        Thread currentThread = Thread.currentThread();
        currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
    }

    /* renamed from: a */
    public static <T> C5092a<T> m29842a(C5092a<T> c5092a) {
        duo duo = f23467b;
        if (duo != null) {
            return (C5092a) duo.mo4103a(c5092a);
        }
        return c5092a;
    }

    /* renamed from: a */
    public static <T> C5095a<T> m29846a(C5095a<T> c5095a) {
        duo duo = f23468c;
        if (duo != null) {
            return (C5095a) duo.mo4103a(c5095a);
        }
        return c5095a;
    }

    /* renamed from: a */
    public static C5084a m29840a(C5084a c5084a) {
        duo duo = f23469d;
        if (duo != null) {
            return (C5084a) duo.mo4103a(c5084a);
        }
        return c5084a;
    }

    /* renamed from: a */
    public static dts m29845a(dts dts) {
        duo duo = f23473h;
        if (duo != null) {
            return (dts) duo.mo4103a(dts);
        }
        return dts;
    }

    /* renamed from: b */
    public static dts m29852b(dts dts) {
        duo duo = f23474i;
        if (duo != null) {
            return (dts) duo.mo4103a(dts);
        }
        return dts;
    }

    /* renamed from: c */
    public static dts m29855c(dts dts) {
        duo duo = f23475j;
        if (duo != null) {
            return (dts) duo.mo4103a(dts);
        }
        return dts;
    }

    /* renamed from: a */
    public static duk m29848a(duk duk) {
        duo duo = f23476k;
        if (duo != null) {
            return (duk) duo.mo4103a(duk);
        }
        return duk;
    }

    /* renamed from: a */
    public static <T> C5092a<T> m29843a(dtp<T> dtp, C5092a<T> c5092a) {
        dup dup = f23470e;
        if (dup != null) {
            return (C5092a) dup.mo4116a(dtp, c5092a);
        }
        return c5092a;
    }

    /* renamed from: a */
    public static dtw m29847a(dtw dtw) {
        duo duo = f23477l;
        if (duo != null) {
            return (dtw) duo.mo4103a(dtw);
        }
        return dtw;
    }

    /* renamed from: c */
    public static Throwable m29857c(Throwable th) {
        duo duo = f23480o;
        if (duo != null) {
            return (Throwable) duo.mo4103a(th);
        }
        return th;
    }

    /* renamed from: a */
    public static <T, R> C5093b<R, T> m29844a(C5093b<R, T> c5093b) {
        duo duo = f23483r;
        if (duo != null) {
            return (C5093b) duo.mo4103a(c5093b);
        }
        return c5093b;
    }

    /* renamed from: b */
    public static <T, R> C5093b<R, T> m29851b(C5093b<R, T> c5093b) {
        duo duo = f23484s;
        if (duo != null) {
            return (C5093b) duo.mo4103a(c5093b);
        }
        return c5093b;
    }

    /* renamed from: a */
    public static <T> C5084a m29841a(dtm dtm, C5084a c5084a) {
        dup dup = f23472g;
        if (dup != null) {
            return (C5084a) dup.mo4116a(dtm, c5084a);
        }
        return c5084a;
    }

    /* renamed from: d */
    public static Throwable m29858d(Throwable th) {
        duo duo = f23482q;
        if (duo != null) {
            return (Throwable) duo.mo4103a(th);
        }
        return th;
    }

    /* renamed from: c */
    public static dun<? extends ScheduledExecutorService> m29856c() {
        return f23479n;
    }
}
