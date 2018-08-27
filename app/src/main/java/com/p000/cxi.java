package com.p000;

import android.graphics.Bitmap;
import android.os.Handler;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;
import p000.cxd.C4646a;
import p000.cxk.C4654a;
import p000.cxy.C4660a;
import p000.cyi.C4653a;

/* compiled from: LoadAndDisplayImageTask */
/* renamed from: cxi */
final class cxi implements C4653a, Runnable {
    /* renamed from: a */
    final String f20573a;
    /* renamed from: b */
    final cxz f20574b;
    /* renamed from: c */
    final cxd f20575c;
    /* renamed from: d */
    final cyd f20576d;
    /* renamed from: e */
    final cye f20577e;
    /* renamed from: f */
    private final cxg f20578f;
    /* renamed from: g */
    private final cxh f20579g;
    /* renamed from: h */
    private final Handler f20580h;
    /* renamed from: i */
    private final cxf f20581i;
    /* renamed from: j */
    private final cxy f20582j;
    /* renamed from: k */
    private final cxy f20583k;
    /* renamed from: l */
    private final cxy f20584l;
    /* renamed from: m */
    private final cxu f20585m;
    /* renamed from: n */
    private final String f20586n;
    /* renamed from: o */
    private final cxm f20587o;
    /* renamed from: p */
    private final boolean f20588p;
    /* renamed from: q */
    private cxn f20589q = cxn.NETWORK;

    /* compiled from: LoadAndDisplayImageTask */
    /* renamed from: cxi$2 */
    class C46512 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ cxi f20571a;

        C46512(cxi cxi) {
            this.f20571a = cxi;
        }

        public void run() {
            this.f20571a.f20576d.mo4095b(this.f20571a.f20573a, this.f20571a.f20574b.mo4228d());
        }
    }

    /* compiled from: LoadAndDisplayImageTask */
    /* renamed from: cxi$a */
    class C4652a extends Exception {
        /* renamed from: a */
        final /* synthetic */ cxi f20572a;

        C4652a(cxi cxi) {
            this.f20572a = cxi;
        }
    }

    public cxi(cxg cxg, cxh cxh, Handler handler) {
        this.f20578f = cxg;
        this.f20579g = cxh;
        this.f20580h = handler;
        this.f20581i = cxg.f20550a;
        this.f20582j = this.f20581i.f20543n;
        this.f20583k = this.f20581i.f20546q;
        this.f20584l = this.f20581i.f20547r;
        this.f20585m = this.f20581i.f20544o;
        this.f20573a = cxh.f20560a;
        this.f20586n = cxh.f20561b;
        this.f20574b = cxh.f20562c;
        this.f20587o = cxh.f20563d;
        this.f20575c = cxh.f20564e;
        this.f20576d = cxh.f20565f;
        this.f20577e = cxh.f20566g;
        this.f20588p = this.f20575c.m25479s();
    }

    public void run() {
        if (!m25521b() && !m25522c()) {
            ReentrantLock reentrantLock = this.f20579g.f20567h;
            cyj.m25644a("Start display image task [%s]", this.f20586n);
            if (reentrantLock.isLocked()) {
                cyj.m25644a("Image already is loading. Waiting... [%s]", this.f20586n);
            }
            reentrantLock.lock();
            try {
                m25528i();
                Bitmap a = this.f20581i.f20541l.m25409a(this.f20586n);
                if (a == null || a.isRecycled()) {
                    a = m25523d();
                    if (a != null) {
                        m25528i();
                        m25534o();
                        if (this.f20575c.m25464d()) {
                            cyj.m25644a("PreProcess image before caching in memory [%s]", this.f20586n);
                            a = this.f20575c.m25475o().m25640a(a);
                            if (a == null) {
                                cyj.m25647c("Pre-processor returned null [%s]", this.f20586n);
                            }
                        }
                        if (a != null && this.f20575c.m25468h()) {
                            cyj.m25644a("Cache image in memory [%s]", this.f20586n);
                            this.f20581i.f20541l.m25411a(this.f20586n, a);
                        }
                    } else {
                        return;
                    }
                }
                this.f20589q = cxn.MEMORY_CACHE;
                cyj.m25644a("...Get cached bitmap from memory after waiting. [%s]", this.f20586n);
                if (a != null && this.f20575c.m25465e()) {
                    cyj.m25644a("PostProcess image before displaying [%s]", this.f20586n);
                    a = this.f20575c.m25476p().m25640a(a);
                    if (a == null) {
                        cyj.m25647c("Post-processor returned null [%s]", this.f20586n);
                    }
                }
                m25528i();
                m25534o();
                reentrantLock.unlock();
                cxi.m25519a(new cxc(a, this.f20579g, this.f20578f, this.f20589q), this.f20588p, this.f20580h, this.f20578f);
            } catch (C4652a e) {
                m25526g();
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    /* renamed from: b */
    private boolean m25521b() {
        AtomicBoolean a = this.f20578f.m25506a();
        if (a.get()) {
            synchronized (this.f20578f.m25512b()) {
                if (a.get()) {
                    cyj.m25644a("ImageLoader is paused. Waiting...  [%s]", this.f20586n);
                    try {
                        this.f20578f.m25512b().wait();
                        cyj.m25644a(".. Resume loading [%s]", this.f20586n);
                    } catch (InterruptedException e) {
                        cyj.m25647c("Task was interrupted [%s]", this.f20586n);
                        return true;
                    }
                }
            }
        }
        return m25529j();
    }

    /* renamed from: c */
    private boolean m25522c() {
        if (!this.f20575c.m25466f()) {
            return false;
        }
        cyj.m25644a("Delay %d ms before loading...  [%s]", Integer.valueOf(this.f20575c.m25472l()), this.f20586n);
        try {
            Thread.sleep((long) this.f20575c.m25472l());
            return m25529j();
        } catch (InterruptedException e) {
            cyj.m25647c("Task was interrupted [%s]", this.f20586n);
            return true;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: d */
    private Bitmap m25523d() throws p000.cxi.C4652a {
        /*
        r7 = this;
        r1 = 0;
        r0 = r7.f20581i;	 Catch:{ IllegalStateException -> 0x00a0, a -> 0x00a8, IOException -> 0x00aa, OutOfMemoryError -> 0x00b7, Throwable -> 0x00c4 }
        r0 = r0.f20542m;	 Catch:{ IllegalStateException -> 0x00a0, a -> 0x00a8, IOException -> 0x00aa, OutOfMemoryError -> 0x00b7, Throwable -> 0x00c4 }
        r2 = r7.f20573a;	 Catch:{ IllegalStateException -> 0x00a0, a -> 0x00a8, IOException -> 0x00aa, OutOfMemoryError -> 0x00b7, Throwable -> 0x00c4 }
        r0 = r0.m25405a(r2);	 Catch:{ IllegalStateException -> 0x00a0, a -> 0x00a8, IOException -> 0x00aa, OutOfMemoryError -> 0x00b7, Throwable -> 0x00c4 }
        if (r0 == 0) goto L_0x00d9;
    L_0x000d:
        r2 = r0.exists();	 Catch:{ IllegalStateException -> 0x00a0, a -> 0x00a8, IOException -> 0x00aa, OutOfMemoryError -> 0x00b7, Throwable -> 0x00c4 }
        if (r2 == 0) goto L_0x00d9;
    L_0x0013:
        r2 = r0.length();	 Catch:{ IllegalStateException -> 0x00a0, a -> 0x00a8, IOException -> 0x00aa, OutOfMemoryError -> 0x00b7, Throwable -> 0x00c4 }
        r4 = 0;
        r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r2 <= 0) goto L_0x00d9;
    L_0x001d:
        r2 = "Load image from disk cache [%s]";
        r3 = 1;
        r3 = new java.lang.Object[r3];	 Catch:{ IllegalStateException -> 0x00a0, a -> 0x00a8, IOException -> 0x00aa, OutOfMemoryError -> 0x00b7, Throwable -> 0x00c4 }
        r4 = 0;
        r5 = r7.f20586n;	 Catch:{ IllegalStateException -> 0x00a0, a -> 0x00a8, IOException -> 0x00aa, OutOfMemoryError -> 0x00b7, Throwable -> 0x00c4 }
        r3[r4] = r5;	 Catch:{ IllegalStateException -> 0x00a0, a -> 0x00a8, IOException -> 0x00aa, OutOfMemoryError -> 0x00b7, Throwable -> 0x00c4 }
        p000.cyj.m25644a(r2, r3);	 Catch:{ IllegalStateException -> 0x00a0, a -> 0x00a8, IOException -> 0x00aa, OutOfMemoryError -> 0x00b7, Throwable -> 0x00c4 }
        r2 = p000.cxn.DISC_CACHE;	 Catch:{ IllegalStateException -> 0x00a0, a -> 0x00a8, IOException -> 0x00aa, OutOfMemoryError -> 0x00b7, Throwable -> 0x00c4 }
        r7.f20589q = r2;	 Catch:{ IllegalStateException -> 0x00a0, a -> 0x00a8, IOException -> 0x00aa, OutOfMemoryError -> 0x00b7, Throwable -> 0x00c4 }
        r7.m25528i();	 Catch:{ IllegalStateException -> 0x00a0, a -> 0x00a8, IOException -> 0x00aa, OutOfMemoryError -> 0x00b7, Throwable -> 0x00c4 }
        r2 = p000.cxy.C4660a.FILE;	 Catch:{ IllegalStateException -> 0x00a0, a -> 0x00a8, IOException -> 0x00aa, OutOfMemoryError -> 0x00b7, Throwable -> 0x00c4 }
        r0 = r0.getAbsolutePath();	 Catch:{ IllegalStateException -> 0x00a0, a -> 0x00a8, IOException -> 0x00aa, OutOfMemoryError -> 0x00b7, Throwable -> 0x00c4 }
        r0 = r2.m25570a(r0);	 Catch:{ IllegalStateException -> 0x00a0, a -> 0x00a8, IOException -> 0x00aa, OutOfMemoryError -> 0x00b7, Throwable -> 0x00c4 }
        r0 = r7.m25516a(r0);	 Catch:{ IllegalStateException -> 0x00a0, a -> 0x00a8, IOException -> 0x00aa, OutOfMemoryError -> 0x00b7, Throwable -> 0x00c4 }
    L_0x003f:
        if (r0 == 0) goto L_0x004d;
    L_0x0041:
        r2 = r0.getWidth();	 Catch:{ IllegalStateException -> 0x00d7, a -> 0x00a8, IOException -> 0x00d5, OutOfMemoryError -> 0x00d3, Throwable -> 0x00d1 }
        if (r2 <= 0) goto L_0x004d;
    L_0x0047:
        r2 = r0.getHeight();	 Catch:{ IllegalStateException -> 0x00d7, a -> 0x00a8, IOException -> 0x00d5, OutOfMemoryError -> 0x00d3, Throwable -> 0x00d1 }
        if (r2 > 0) goto L_0x009f;
    L_0x004d:
        r2 = "Load image from network [%s]";
        r3 = 1;
        r3 = new java.lang.Object[r3];	 Catch:{ IllegalStateException -> 0x00d7, a -> 0x00a8, IOException -> 0x00d5, OutOfMemoryError -> 0x00d3, Throwable -> 0x00d1 }
        r4 = 0;
        r5 = r7.f20586n;	 Catch:{ IllegalStateException -> 0x00d7, a -> 0x00a8, IOException -> 0x00d5, OutOfMemoryError -> 0x00d3, Throwable -> 0x00d1 }
        r3[r4] = r5;	 Catch:{ IllegalStateException -> 0x00d7, a -> 0x00a8, IOException -> 0x00d5, OutOfMemoryError -> 0x00d3, Throwable -> 0x00d1 }
        p000.cyj.m25644a(r2, r3);	 Catch:{ IllegalStateException -> 0x00d7, a -> 0x00a8, IOException -> 0x00d5, OutOfMemoryError -> 0x00d3, Throwable -> 0x00d1 }
        r2 = p000.cxn.NETWORK;	 Catch:{ IllegalStateException -> 0x00d7, a -> 0x00a8, IOException -> 0x00d5, OutOfMemoryError -> 0x00d3, Throwable -> 0x00d1 }
        r7.f20589q = r2;	 Catch:{ IllegalStateException -> 0x00d7, a -> 0x00a8, IOException -> 0x00d5, OutOfMemoryError -> 0x00d3, Throwable -> 0x00d1 }
        r2 = r7.f20573a;	 Catch:{ IllegalStateException -> 0x00d7, a -> 0x00a8, IOException -> 0x00d5, OutOfMemoryError -> 0x00d3, Throwable -> 0x00d1 }
        r3 = r7.f20575c;	 Catch:{ IllegalStateException -> 0x00d7, a -> 0x00a8, IOException -> 0x00d5, OutOfMemoryError -> 0x00d3, Throwable -> 0x00d1 }
        r3 = r3.m25469i();	 Catch:{ IllegalStateException -> 0x00d7, a -> 0x00a8, IOException -> 0x00d5, OutOfMemoryError -> 0x00d3, Throwable -> 0x00d1 }
        if (r3 == 0) goto L_0x0084;
    L_0x0068:
        r3 = r7.m25524e();	 Catch:{ IllegalStateException -> 0x00d7, a -> 0x00a8, IOException -> 0x00d5, OutOfMemoryError -> 0x00d3, Throwable -> 0x00d1 }
        if (r3 == 0) goto L_0x0084;
    L_0x006e:
        r3 = r7.f20581i;	 Catch:{ IllegalStateException -> 0x00d7, a -> 0x00a8, IOException -> 0x00d5, OutOfMemoryError -> 0x00d3, Throwable -> 0x00d1 }
        r3 = r3.f20542m;	 Catch:{ IllegalStateException -> 0x00d7, a -> 0x00a8, IOException -> 0x00d5, OutOfMemoryError -> 0x00d3, Throwable -> 0x00d1 }
        r4 = r7.f20573a;	 Catch:{ IllegalStateException -> 0x00d7, a -> 0x00a8, IOException -> 0x00d5, OutOfMemoryError -> 0x00d3, Throwable -> 0x00d1 }
        r3 = r3.m25405a(r4);	 Catch:{ IllegalStateException -> 0x00d7, a -> 0x00a8, IOException -> 0x00d5, OutOfMemoryError -> 0x00d3, Throwable -> 0x00d1 }
        if (r3 == 0) goto L_0x0084;
    L_0x007a:
        r2 = p000.cxy.C4660a.FILE;	 Catch:{ IllegalStateException -> 0x00d7, a -> 0x00a8, IOException -> 0x00d5, OutOfMemoryError -> 0x00d3, Throwable -> 0x00d1 }
        r3 = r3.getAbsolutePath();	 Catch:{ IllegalStateException -> 0x00d7, a -> 0x00a8, IOException -> 0x00d5, OutOfMemoryError -> 0x00d3, Throwable -> 0x00d1 }
        r2 = r2.m25570a(r3);	 Catch:{ IllegalStateException -> 0x00d7, a -> 0x00a8, IOException -> 0x00d5, OutOfMemoryError -> 0x00d3, Throwable -> 0x00d1 }
    L_0x0084:
        r7.m25528i();	 Catch:{ IllegalStateException -> 0x00d7, a -> 0x00a8, IOException -> 0x00d5, OutOfMemoryError -> 0x00d3, Throwable -> 0x00d1 }
        r0 = r7.m25516a(r2);	 Catch:{ IllegalStateException -> 0x00d7, a -> 0x00a8, IOException -> 0x00d5, OutOfMemoryError -> 0x00d3, Throwable -> 0x00d1 }
        if (r0 == 0) goto L_0x0099;
    L_0x008d:
        r2 = r0.getWidth();	 Catch:{ IllegalStateException -> 0x00d7, a -> 0x00a8, IOException -> 0x00d5, OutOfMemoryError -> 0x00d3, Throwable -> 0x00d1 }
        if (r2 <= 0) goto L_0x0099;
    L_0x0093:
        r2 = r0.getHeight();	 Catch:{ IllegalStateException -> 0x00d7, a -> 0x00a8, IOException -> 0x00d5, OutOfMemoryError -> 0x00d3, Throwable -> 0x00d1 }
        if (r2 > 0) goto L_0x009f;
    L_0x0099:
        r2 = p000.cxk.C4654a.DECODING_ERROR;	 Catch:{ IllegalStateException -> 0x00d7, a -> 0x00a8, IOException -> 0x00d5, OutOfMemoryError -> 0x00d3, Throwable -> 0x00d1 }
        r3 = 0;
        r7.m25518a(r2, r3);	 Catch:{ IllegalStateException -> 0x00d7, a -> 0x00a8, IOException -> 0x00d5, OutOfMemoryError -> 0x00d3, Throwable -> 0x00d1 }
    L_0x009f:
        return r0;
    L_0x00a0:
        r0 = move-exception;
        r0 = r1;
    L_0x00a2:
        r2 = p000.cxk.C4654a.NETWORK_DENIED;
        r7.m25518a(r2, r1);
        goto L_0x009f;
    L_0x00a8:
        r0 = move-exception;
        throw r0;
    L_0x00aa:
        r0 = move-exception;
        r6 = r0;
        r0 = r1;
        r1 = r6;
    L_0x00ae:
        p000.cyj.m25645a(r1);
        r2 = p000.cxk.C4654a.IO_ERROR;
        r7.m25518a(r2, r1);
        goto L_0x009f;
    L_0x00b7:
        r0 = move-exception;
        r6 = r0;
        r0 = r1;
        r1 = r6;
    L_0x00bb:
        p000.cyj.m25645a(r1);
        r2 = p000.cxk.C4654a.OUT_OF_MEMORY;
        r7.m25518a(r2, r1);
        goto L_0x009f;
    L_0x00c4:
        r0 = move-exception;
        r6 = r0;
        r0 = r1;
        r1 = r6;
    L_0x00c8:
        p000.cyj.m25645a(r1);
        r2 = p000.cxk.C4654a.UNKNOWN;
        r7.m25518a(r2, r1);
        goto L_0x009f;
    L_0x00d1:
        r1 = move-exception;
        goto L_0x00c8;
    L_0x00d3:
        r1 = move-exception;
        goto L_0x00bb;
    L_0x00d5:
        r1 = move-exception;
        goto L_0x00ae;
    L_0x00d7:
        r2 = move-exception;
        goto L_0x00a2;
    L_0x00d9:
        r0 = r1;
        goto L_0x003f;
        */
        throw new UnsupportedOperationException("Method not decompiled: cxi.d():android.graphics.Bitmap");
    }

    /* renamed from: a */
    private Bitmap m25516a(String str) throws IOException {
        String str2 = str;
        return this.f20585m.m25564a(new cxv(this.f20586n, str2, this.f20573a, this.f20587o, this.f20574b.mo4227c(), m25527h(), this.f20575c));
    }

    /* renamed from: e */
    private boolean m25524e() throws C4652a {
        cyj.m25644a("Cache image on disk [%s]", this.f20586n);
        try {
            boolean f = m25525f();
            if (!f) {
                return f;
            }
            int i = this.f20581i.f20533d;
            int i2 = this.f20581i.f20534e;
            if (i <= 0 && i2 <= 0) {
                return f;
            }
            cyj.m25644a("Resize image in disk cache [%s]", this.f20586n);
            m25520a(i, i2);
            return f;
        } catch (Throwable e) {
            cyj.m25645a(e);
            return false;
        }
    }

    /* renamed from: f */
    private boolean m25525f() throws IOException {
        boolean z = false;
        Closeable a = m25527h().m25571a(this.f20573a, this.f20575c.m25474n());
        if (a == null) {
            cyj.m25647c("No stream for image [%s]", this.f20586n);
        } else {
            try {
                z = this.f20581i.f20542m.m25407a(this.f20573a, a, this);
            } finally {
                cyi.m25642a(a);
            }
        }
        return z;
    }

    /* renamed from: a */
    private boolean m25520a(int i, int i2) throws IOException {
        File a = this.f20581i.f20542m.m25405a(this.f20573a);
        if (a != null && a.exists()) {
            Bitmap a2 = this.f20585m.m25564a(new cxv(this.f20586n, C4660a.FILE.m25570a(a.getAbsolutePath()), this.f20573a, new cxm(i, i2), cxp.FIT_INSIDE, m25527h(), new C4646a().m25435a(this.f20575c).m25436a(cxl.IN_SAMPLE_INT).m25438a()));
            if (!(a2 == null || this.f20581i.f20535f == null)) {
                cyj.m25644a("Process image before cache on disk [%s]", this.f20586n);
                a2 = this.f20581i.f20535f.m25640a(a2);
                if (a2 == null) {
                    cyj.m25647c("Bitmap processor for disk cache returned null [%s]", this.f20586n);
                }
            }
            Bitmap bitmap = a2;
            if (bitmap != null) {
                boolean a3 = this.f20581i.f20542m.m25406a(this.f20573a, bitmap);
                bitmap.recycle();
                return a3;
            }
        }
        return false;
    }

    /* renamed from: a */
    private void m25518a(final C4654a c4654a, final Throwable th) {
        if (!this.f20588p && !m25535p() && !m25529j()) {
            cxi.m25519a(new Runnable(this) {
                /* renamed from: c */
                final /* synthetic */ cxi f20570c;

                public void run() {
                    if (this.f20570c.f20575c.m25463c()) {
                        this.f20570c.f20574b.mo4225a(this.f20570c.f20575c.m25462c(this.f20570c.f20581i.f20530a));
                    }
                    this.f20570c.f20576d.mo4094a(this.f20570c.f20573a, this.f20570c.f20574b.mo4228d(), new cxk(c4654a, th));
                }
            }, false, this.f20580h, this.f20578f);
        }
    }

    /* renamed from: g */
    private void m25526g() {
        if (!this.f20588p && !m25535p()) {
            cxi.m25519a(new C46512(this), false, this.f20580h, this.f20578f);
        }
    }

    /* renamed from: h */
    private cxy m25527h() {
        if (this.f20578f.m25514c()) {
            return this.f20583k;
        }
        if (this.f20578f.m25515d()) {
            return this.f20584l;
        }
        return this.f20582j;
    }

    /* renamed from: i */
    private void m25528i() throws C4652a {
        m25530k();
        m25532m();
    }

    /* renamed from: j */
    private boolean m25529j() {
        return m25531l() || m25533n();
    }

    /* renamed from: k */
    private void m25530k() throws C4652a {
        if (m25531l()) {
            throw new C4652a(this);
        }
    }

    /* renamed from: l */
    private boolean m25531l() {
        if (!this.f20574b.mo4229e()) {
            return false;
        }
        cyj.m25644a("ImageAware was collected by GC. Task is cancelled. [%s]", this.f20586n);
        return true;
    }

    /* renamed from: m */
    private void m25532m() throws C4652a {
        if (m25533n()) {
            throw new C4652a(this);
        }
    }

    /* renamed from: n */
    private boolean m25533n() {
        if (!(!this.f20586n.equals(this.f20578f.m25505a(this.f20574b)))) {
            return false;
        }
        cyj.m25644a("ImageAware is reused for another image. Task is cancelled. [%s]", this.f20586n);
        return true;
    }

    /* renamed from: o */
    private void m25534o() throws C4652a {
        if (m25535p()) {
            throw new C4652a(this);
        }
    }

    /* renamed from: p */
    private boolean m25535p() {
        if (!Thread.interrupted()) {
            return false;
        }
        cyj.m25644a("Task was interrupted [%s]", this.f20586n);
        return true;
    }

    /* renamed from: a */
    String m25536a() {
        return this.f20573a;
    }

    /* renamed from: a */
    static void m25519a(Runnable runnable, boolean z, Handler handler, cxg cxg) {
        if (z) {
            runnable.run();
        } else if (handler == null) {
            cxg.m25511a(runnable);
        } else {
            handler.post(runnable);
        }
    }
}
