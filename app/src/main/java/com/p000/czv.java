package com.p000;

import java.util.Vector;
import p000.cyn.C3613a;
import p000.cyr.C3620a;
import p000.cyt.C4669a;
import p000.cyu.C3618a;
import p000.czs.C4709b;
import p000.czs.C4711e;

/* renamed from: czv */
final class czv {
    /* renamed from: a */
    private static czv f20844a = null;
    /* renamed from: b */
    private static Object f20845b = new Object();
    /* renamed from: o */
    private static Object f20846o = new Object();
    /* renamed from: c */
    private drl f20847c;
    /* renamed from: d */
    private final String f20848d;
    /* renamed from: e */
    private final String f20849e;
    /* renamed from: f */
    private final int f20850f;
    /* renamed from: g */
    private boolean f20851g;
    /* renamed from: h */
    private Object f20852h;
    /* renamed from: i */
    private final qv f20853i;
    /* renamed from: j */
    private cyp f20854j;
    /* renamed from: k */
    private cyp f20855k;
    /* renamed from: l */
    private cyp f20856l;
    /* renamed from: m */
    private cyp f20857m;
    /* renamed from: n */
    private final drj f20858n;
    /* renamed from: p */
    private cyy f20859p = null;
    /* renamed from: q */
    private czr f20860q;
    /* renamed from: r */
    private boolean f20861r = false;
    /* renamed from: s */
    private int f20862s = 0;
    /* renamed from: t */
    private int f20863t = 0;

    /* renamed from: czv$1 */
    class C47131 implements Runnable {
        /* renamed from: a */
        private /* synthetic */ czv f20839a;

        C47131(czv czv) {
            this.f20839a = czv;
        }

        public final void run() {
            this.f20839a.f20847c = new drl(this.f20839a.f20858n);
        }
    }

    /* renamed from: czv$2 */
    class C47142 implements Runnable {
        /* renamed from: a */
        private /* synthetic */ czv f20840a;

        C47142(czv czv) {
            this.f20840a = czv;
        }

        public final void run() {
            this.f20840a.f20847c.m28898a();
            int f = this.f20840a.f20853i.m33933f();
            for (int i = 0; i < f; i++) {
                ((cyp) this.f20840a.f20853i.m33931d()).m25654a().mo4474b();
            }
        }
    }

    /* renamed from: czv$3 */
    class C47153 implements Runnable {
        C47153() {
        }

        public final void run() {
            qu.m33924b();
        }
    }

    /* renamed from: czv$4 */
    class C47174 implements Runnable {
        /* renamed from: a */
        private /* synthetic */ czv f20841a;

        /* renamed from: czv$4$1 */
        class C47161 implements drf {
            C47161() {
            }

            /* renamed from: a */
            public final void mo4233a(dre dre) {
            }

            /* renamed from: a */
            public final void mo4234a(dre dre, int i, String str, String str2) {
            }
        }

        C47174(czv czv) {
            this.f20841a = czv;
        }

        public final void run() {
            dre a = this.f20841a.f20847c.m28893a(new C47161());
            if (a != null) {
                a.mo4475a();
            }
        }
    }

    /* renamed from: czv$5 */
    class C47185 implements Runnable {
        /* renamed from: a */
        private /* synthetic */ czv f20842a;

        C47185(czv czv) {
            this.f20842a = czv;
        }

        public final void run() {
            synchronized (czv.f20846o) {
                this.f20842a.f20859p.m25724a("DATA_BLOCK", this.f20842a.f20860q.m25860c());
                C4709b c4709b = new C4709b();
                czs c4711e = new C4711e();
                c4709b.m25864a("num_data_blocks", 1);
                Vector a = this.f20842a.f20860q.m25857a();
                for (int i = 0; i < a.size(); i++) {
                    czs c4709b2 = new C4709b();
                    c4709b2.m25866a("id", ((czq) a.elementAt(i)).m25852a());
                    c4709b2.m25866a("type", ((czq) a.elementAt(i)).m25855c());
                    c4709b2.m25866a("current_checksum", Integer.toString(this.f20842a.f20862s));
                    c4709b2.m25866a("new_checksum", Integer.toString(this.f20842a.f20863t));
                    c4709b2.m25866a("algorithm_id", "MD5");
                    c4711e.m25870a(c4709b2);
                }
                c4709b.m25865a("checksums", c4711e);
                this.f20842a.f20859p.m25724a("UPLOAD_DONE", c4709b);
                this.f20842a.f20861r = true;
                czv.f20846o.notify();
            }
        }
    }

    /* renamed from: czv$6 */
    class C47196 implements Runnable {
        /* renamed from: a */
        private /* synthetic */ czv f20843a;

        C47196(czv czv) {
            this.f20843a = czv;
        }

        public final void run() {
            this.f20843a.f20847c.m28901d();
        }
    }

    private czv(Object obj, String str, String str2, String str3, int i, String str4, boolean z, byte[] bArr, C4669a c4669a) {
        this.f20848d = str2;
        this.f20849e = str3;
        this.f20850f = i;
        this.f20851g = true;
        this.f20847c = null;
        this.f20853i = new qv();
        this.f20852h = null;
        this.f20854j = null;
        this.f20855k = null;
        this.f20856l = null;
        this.f20857m = null;
        this.f20858n = new drj(obj, str, this.f20849e, this.f20850f, str4, z, this.f20848d, bArr, c4669a);
        qu.m33922a(new C47131(this));
    }

    /* renamed from: a */
    public static czv m25880a(Object obj, String str, String str2, String str3, int i, String str4, boolean z, byte[] bArr, C4669a c4669a) {
        czv.m25885a(obj, "appContext");
        czv.m25885a((Object) str2, "id");
        czv.m25887a(str3, "host");
        czv.m25885a((Object) str, "appVersion");
        czv.m25885a((Object) bArr, "applicationKey");
        if (i < 0 || i > 65535) {
            czv.m25886a(new IllegalArgumentException("port must be between 0 and 65535"));
        }
        czv.m25885a(obj, "type");
        synchronized (f20845b) {
            czl.m25828a(null, "Initializing SpeechKit");
            if (f20844a == null) {
                qu.m33921a();
            }
            if (f20844a != null) {
                czv czv = f20844a;
                Object obj2 = (czv.f20848d.equals(str2) && czv.f20849e.equals(str3) && czv.f20850f == i) ? 1 : null;
                if (obj2 == null) {
                    czl.m25828a(null, "Releasing old SpeechKit before creating new instance");
                    f20844a.m25897m();
                    f20844a = null;
                }
            }
            if (f20844a == null) {
                czl.m25828a(null, "Creating fresh SpeechKit instance");
                f20844a = new czv(obj, str, str2, str3, i, str4, z, bArr, c4669a);
            }
        }
        return f20844a;
    }

    /* renamed from: a */
    static Object m25883a() {
        return f20845b;
    }

    /* renamed from: a */
    private void m25884a(czd czd) {
        if (this.f20854j != null) {
            czd.mo4255a(0, this.f20854j);
        }
        if (this.f20855k != null) {
            czd.mo4255a(1, this.f20855k);
        }
        if (this.f20856l != null) {
            czd.mo4255a(2, this.f20856l);
        }
        if (this.f20857m != null) {
            czd.mo4255a(3, this.f20857m);
        }
    }

    /* renamed from: a */
    static final void m25885a(Object obj, String str) {
        if (obj == null) {
            czv.m25886a(new IllegalArgumentException(str + " must not be null"));
        }
    }

    /* renamed from: a */
    private static void m25886a(RuntimeException runtimeException) {
        czl.m25831c(null, runtimeException.getMessage());
        throw runtimeException;
    }

    /* renamed from: a */
    static final void m25887a(String str, String str2) {
        if (str == null || str.length() == 0) {
            czv.m25886a(new IllegalArgumentException(str2 + " must not be null or empty"));
        }
    }

    /* renamed from: e */
    static final void m25892e() {
        czv.m25886a(new IllegalStateException("SpeechKit instance is released"));
    }

    /* renamed from: m */
    private void m25897m() {
        this.f20851g = false;
        qu.m33922a(new C47142(this));
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public final p000.cyl m25898a(p000.czr r5, int r6, int r7, p000.cyl.C3615a r8, Object r9) {
        /*
        r4 = this;
        r0 = "datablock";
        p000.czv.m25885a(r5, r0);
        r0 = "listener";
        p000.czv.m25885a(r8, r0);
        r1 = f20845b;
        monitor-enter(r1);
        r0 = r4.f20851g;	 Catch:{ all -> 0x0041 }
        if (r0 != 0) goto L_0x0014;
    L_0x0011:
        p000.czv.m25892e();	 Catch:{ all -> 0x0041 }
    L_0x0014:
        r0 = new cza;	 Catch:{ all -> 0x0041 }
        r0.<init>(r4, r8, r9);	 Catch:{ all -> 0x0041 }
        r4.f20859p = r0;	 Catch:{ all -> 0x0041 }
        r4.f20860q = r5;	 Catch:{ all -> 0x0041 }
        r4.f20862s = r6;	 Catch:{ all -> 0x0041 }
        r4.f20863t = r7;	 Catch:{ all -> 0x0041 }
        r2 = new czv$5;	 Catch:{ all -> 0x0041 }
        r2.<init>(r4);	 Catch:{ all -> 0x0041 }
        p000.qu.m33922a(r2);	 Catch:{ all -> 0x0041 }
        r2 = f20846o;	 Catch:{ all -> 0x0041 }
        monitor-enter(r2);	 Catch:{ all -> 0x0041 }
    L_0x002c:
        r3 = r4.f20861r;	 Catch:{ all -> 0x003e }
        if (r3 != 0) goto L_0x0038;
    L_0x0030:
        r3 = f20846o;	 Catch:{ InterruptedException -> 0x0036 }
        r3.wait();	 Catch:{ InterruptedException -> 0x0036 }
        goto L_0x002c;
    L_0x0036:
        r3 = move-exception;
        goto L_0x002c;
    L_0x0038:
        r0.m25741c();	 Catch:{ all -> 0x003e }
        monitor-exit(r2);	 Catch:{ all -> 0x003e }
        monitor-exit(r1);	 Catch:{ all -> 0x0041 }
        return r0;
    L_0x003e:
        r0 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x0041 }
        throw r0;	 Catch:{ all -> 0x0041 }
    L_0x0041:
        r0 = move-exception;
        monitor-exit(r1);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: czv.a(czr, int, int, cyl$a, java.lang.Object):cyl");
    }

    /* renamed from: a */
    public final cyn m25899a(String str, C4709b c4709b, String str2, C3613a c3613a, Object obj) {
        cyn czf;
        czv.m25885a((Object) str, "event");
        czv.m25885a((Object) c4709b, "content");
        czv.m25885a((Object) c3613a, "listener");
        synchronized (f20845b) {
            if (!this.f20851g) {
                czv.m25892e();
            }
            czf = new czf(this, str2, c3613a, obj);
            C4709b c4709b2 = new C4709b();
            c4709b2.m25866a("event", str);
            c4709b2.m25865a("content", (czs) c4709b);
            czf.m25724a("LOG_CONTENT", c4709b2);
        }
        return czf;
    }

    /* renamed from: a */
    public final cyr m25900a(String str, int i, String str2, C3620a c3620a, Object obj) {
        czd czj;
        czv.m25885a((Object) str, "type");
        czv.m25885a((Object) str2, "language");
        czv.m25885a((Object) c3620a, "listener");
        synchronized (f20845b) {
            if (!this.f20851g) {
                czv.m25892e();
            }
            czj = new czj(this, str, i, str2, c3620a, obj);
            m25884a(czj);
        }
        return czj;
    }

    /* renamed from: a */
    public final cyu m25901a(String str, C3618a c3618a, Object obj) {
        cyu cyx;
        czv.m25885a((Object) str, "language");
        czv.m25885a((Object) c3618a, "listener");
        synchronized (f20845b) {
            if (!this.f20851g) {
                czv.m25892e();
            }
            cyx = new cyx(this, null, str, c3618a, obj);
        }
        return cyx;
    }

    /* renamed from: a */
    final void m25902a(Object obj) {
        this.f20852h = obj;
    }

    /* renamed from: b */
    final drl m25903b() {
        return this.f20847c;
    }

    /* renamed from: c */
    final Object m25904c() {
        return this.f20852h;
    }

    /* renamed from: d */
    final void m25905d() {
        synchronized (f20845b) {
            if (!this.f20851g) {
                czv.m25892e();
            }
        }
    }

    /* renamed from: f */
    public final void m25906f() {
        synchronized (f20845b) {
            if (this == f20844a) {
                czl.m25828a((Object) this, "Releasing SpeechKit instance");
                m25897m();
                f20844a = null;
                qu.m33922a(new C47153());
            } else {
                czl.m25830b(this, "SpeechKit instance already released");
            }
        }
    }

    /* renamed from: g */
    public final void m25907g() {
        synchronized (f20845b) {
            if (!this.f20851g) {
                czv.m25892e();
            }
            qu.m33922a(new C47174(this));
        }
    }

    /* renamed from: h */
    public final String m25908h() {
        String c;
        synchronized (f20845b) {
            if (this.f20847c != null) {
                c = this.f20847c.m28900c();
            } else {
                c = null;
            }
        }
        return c;
    }

    /* renamed from: i */
    public final void m25909i() {
        synchronized (f20845b) {
            if (!this.f20851g) {
                czv.m25892e();
            }
            qu.m33922a(new C47196(this));
        }
    }

    /* renamed from: j */
    public final String m25910j() {
        return this.f20858n.m28868v();
    }

    /* renamed from: k */
    public final String m25911k() {
        return this.f20858n.m28869w();
    }
}
