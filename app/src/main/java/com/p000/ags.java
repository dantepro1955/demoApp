package com.p000;

import android.os.Handler;
import com.facebook.ads.AdError;
import p000.agn.C0164a;

/* compiled from: DefaultBandwidthMeter */
/* renamed from: ags */
public final class ags implements agn {
    /* renamed from: a */
    private final Handler f1406a;
    /* renamed from: b */
    private final C0164a f1407b;
    /* renamed from: c */
    private final ahc f1408c;
    /* renamed from: d */
    private final aho f1409d;
    /* renamed from: e */
    private long f1410e;
    /* renamed from: f */
    private long f1411f;
    /* renamed from: g */
    private long f1412g;
    /* renamed from: h */
    private int f1413h;

    public ags() {
        this(null, null);
    }

    public ags(Handler handler, C0164a c0164a) {
        this(handler, c0164a, new ahp());
    }

    public ags(Handler handler, C0164a c0164a, ahc ahc) {
        this(handler, c0164a, ahc, AdError.SERVER_ERROR_CODE);
    }

    public ags(Handler handler, C0164a c0164a, ahc ahc, int i) {
        this.f1406a = handler;
        this.f1407b = c0164a;
        this.f1408c = ahc;
        this.f1409d = new aho(i);
        this.f1412g = -1;
    }

    /* renamed from: a */
    public synchronized void mo188a() {
        if (this.f1413h == 0) {
            this.f1411f = this.f1408c.mo192a();
        }
        this.f1413h++;
    }

    /* renamed from: a */
    public synchronized void mo189a(int i) {
        this.f1410e += (long) i;
    }

    /* renamed from: b */
    public synchronized void mo190b() {
        ahb.m1516b(this.f1413h > 0);
        long a = this.f1408c.mo192a();
        int i = (int) (a - this.f1411f);
        if (i > 0) {
            this.f1409d.m1586a((int) Math.sqrt((double) this.f1410e), (float) ((this.f1410e * 8000) / ((long) i)));
            float a2 = this.f1409d.m1585a(0.5f);
            this.f1412g = Float.isNaN(a2) ? -1 : (long) a2;
            m1475a(i, this.f1410e, this.f1412g);
        }
        this.f1413h--;
        if (this.f1413h > 0) {
            this.f1411f = a;
        }
        this.f1410e = 0;
    }

    /* renamed from: a */
    private void m1475a(int i, long j, long j2) {
        if (this.f1406a != null && this.f1407b != null) {
            final int i2 = i;
            final long j3 = j;
            final long j4 = j2;
            this.f1406a.post(new Runnable(this) {
                /* renamed from: d */
                final /* synthetic */ ags f1405d;

                public void run() {
                    this.f1405d.f1407b.m1464b(i2, j3, j4);
                }
            });
        }
    }
}
