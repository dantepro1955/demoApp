package com.p000;

import java.util.Vector;
import p000.dnm.C5007a;
import p000.qv.C5697a;

/* renamed from: rc */
public final class rc {
    /* renamed from: a */
    private static final qv f25293a = new qv();
    /* renamed from: b */
    private final C5697a f25294b;
    /* renamed from: c */
    private final qz f25295c;
    /* renamed from: d */
    private sm f25296d;
    /* renamed from: e */
    private final Object f25297e;
    /* renamed from: f */
    private final sk f25298f = new C57042(this);
    /* renamed from: g */
    private boolean f25299g;
    /* renamed from: h */
    private boolean f25300h;
    /* renamed from: i */
    private boolean f25301i;
    /* renamed from: j */
    private boolean f25302j;
    /* renamed from: k */
    private final Object f25303k;
    /* renamed from: l */
    private final Object f25304l;

    /* renamed from: rc$2 */
    class C57042 implements sk {
        /* renamed from: a */
        private int f25290a = 0;
        /* renamed from: b */
        private boolean f25291b = false;
        /* renamed from: c */
        private /* synthetic */ rc f25292c;

        C57042(rc rcVar) {
            this.f25292c = rcVar;
        }

        /* renamed from: a */
        private void m33960a() {
            synchronized (this.f25292c.f25303k) {
                this.f25292c.f25301i = true;
                if (this.f25292c.f25302j) {
                    this.f25292c.f25303k.notify();
                    this.f25292c.f25302j = false;
                }
            }
        }

        /* renamed from: a */
        public final void mo5489a(sm smVar, String str, Object obj) {
            if (smVar != this.f25292c.f25296d) {
                czl.m25830b(this.f25292c, "Event " + str + " received for invalid recorder");
            } else if (str == "BUFFER_RECORDED") {
                if (obj instanceof Float) {
                    r0 = this.f25292c.f25295c;
                    this.f25292c.f25297e;
                    r0.mo4743a(((Float) obj).floatValue());
                }
            } else if (str == "STARTED") {
                this.f25291b = true;
                r0 = this.f25292c.f25295c;
                this.f25292c.f25297e;
                r0.mo4742a();
            } else if (str == "STOPPED") {
                czl.m25828a(this.f25292c, "Recorder stopped");
                m33960a();
                r0 = this.f25292c.f25295c;
                this.f25292c.f25297e;
                r0.mo4744a(this.f25290a);
            } else if (str == "RECORD_ERROR") {
                czl.m25831c(this.f25292c, "Recorder error");
                this.f25290a = 4;
                if (!this.f25291b) {
                    m33960a();
                    r0 = this.f25292c.f25295c;
                    this.f25292c.f25297e;
                    r0.mo4744a(this.f25290a);
                }
            } else if (str == "END_OF_SPEECH") {
                czl.m25828a(this.f25292c, "Recorder event (end of speech)");
                this.f25290a = 2;
            } else if (str == "CAPTURE_TIMEOUT") {
                czl.m25828a(this.f25292c, "Recorder event (timeout)");
                this.f25290a = 3;
            }
        }
    }

    public rc(dot dot, boolean z, boolean z2, Object obj, Object obj2, qz qzVar) {
        this.f25295c = qzVar;
        this.f25297e = obj;
        this.f25299g = false;
        this.f25300h = false;
        this.f25302j = false;
        this.f25301i = false;
        this.f25303k = new Object();
        this.f25304l = obj2;
        this.f25294b = f25293a.m33933f() == 0 ? null : f25293a.m33935b().m33934a();
        qv qvVar = new qv();
        if (this.f25294b == null) {
            if (z) {
                qvVar.m33930a((Object) new dnm("ep.enable", "TRUE".getBytes(), C5007a.f22310a));
            } else if (z2) {
                qvVar.m33930a((Object) new dnm("ep.enable", "TRUE".getBytes(), C5007a.f22310a));
                qvVar.m33930a((Object) new dnm("ep.VadLongUtterance", "TRUE".getBytes(), C5007a.f22310a));
            }
        }
        qvVar.m33930a((Object) new dnm("USE_ENERGY_LEVEL", "TRUE".getBytes(), C5007a.f22310a));
        qvVar.m33930a((Object) new dnm("Android_Context", this.f25304l, C5007a.f22310a));
        try {
            sk skVar = this.f25298f;
            Vector c = qvVar.m33936c();
            re reVar = re.f25306a;
            if (skVar == null) {
                throw new NullPointerException("NMSPAudioRecordListener can not be null!");
            } else if (dot == null) {
                throw new NullPointerException("Manager can not be null!");
            } else {
                this.f25296d = new dns(skVar, dot, c, reVar);
            }
        } catch (Throwable th) {
            czl.m25829a(this, "Error creating recorder", th);
            this.f25296d = null;
        }
    }

    /* renamed from: a */
    public final void m33971a() {
        if (this.f25299g) {
            czl.m25831c(this, "Recorder already started");
        } else {
            this.f25299g = true;
            if (this.f25296d != null) {
                try {
                    czl.m25828a((Object) this, "Starting recorder");
                    this.f25296d.mo4487f();
                    return;
                } catch (Throwable th) {
                    czl.m25829a(this, "Error starting recorder", th);
                }
            }
        }
        qz qzVar = this.f25295c;
        Object obj = this.f25297e;
        qzVar.mo4744a(4);
    }

    /* renamed from: a */
    public final void m33972a(final dnk dnk) {
        czl.m25828a((Object) this, "Capturing audio from recorder");
        if (this.f25294b == null) {
            this.f25296d.mo4482a(dnk);
        } else {
            this.f25296d.mo4482a(new dnk(this) {
                /* renamed from: a */
                final /* synthetic */ rc f25288a;

                /* renamed from: rc$1$1 */
                class C57021 implements Runnable {
                    /* renamed from: a */
                    private /* synthetic */ C57031 f25287a;

                    C57021(C57031 c57031) {
                        this.f25287a = c57031;
                    }

                    public final void run() {
                        this.f25287a.f25288a.m33973b();
                    }
                }

                /* renamed from: a */
                public final void mo4478a(byte[] bArr, int i, int i2, boolean z) throws dnq {
                    if (this.f25288a.f25294b == null) {
                        dnk.mo4478a(bArr, i, i2, z);
                    } else if (this.f25288a.f25294b.m33926a()) {
                        byte[] bArr2 = (byte[]) this.f25288a.f25294b.m33927b();
                        boolean z2 = !this.f25288a.f25294b.m33926a();
                        dnk.mo4478a(bArr2, 0, bArr2.length, z2);
                        if (z2) {
                            qu.m33922a(new C57021(this));
                        }
                    }
                    rc rcVar = this.f25288a;
                    null;
                }
            });
        }
    }

    /* renamed from: b */
    public final void m33973b() {
        if (this.f25299g && !this.f25300h) {
            this.f25300h = true;
            if (this.f25296d != null) {
                synchronized (this.f25303k) {
                    try {
                        if (!this.f25301i) {
                            czl.m25828a((Object) this, "Stopping recorder");
                            this.f25296d.mo4488g();
                            this.f25302j = true;
                            while (!this.f25301i) {
                                try {
                                    this.f25303k.wait();
                                } catch (InterruptedException e) {
                                }
                            }
                        }
                    } catch (Throwable th) {
                        czl.m25829a(this, "Error stopping recorder", th);
                        this.f25301i = true;
                    }
                }
                return;
            }
            czl.m25831c(this, "Can't stop recorder because it wasn't started");
            qz qzVar = this.f25295c;
            Object obj = this.f25297e;
            qzVar.mo4744a(4);
        }
    }
}
