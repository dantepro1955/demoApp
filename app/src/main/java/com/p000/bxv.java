package com.p000;

import android.support.v7.widget.LinearLayoutManager;
import org.json.JSONObject;

/* compiled from: IntervalVideoTracker */
/* renamed from: bxv */
abstract class bxv<PlayerOrIMAAd> extends bxt<PlayerOrIMAAd> {
    /* renamed from: j */
    protected C1581a f8120j = C1581a.UNINITIALIZED;
    /* renamed from: k */
    protected int f8121k = LinearLayoutManager.INVALID_OFFSET;
    /* renamed from: l */
    protected double f8122l = Double.NaN;
    /* renamed from: m */
    protected int f8123m = LinearLayoutManager.INVALID_OFFSET;
    /* renamed from: n */
    protected int f8124n = LinearLayoutManager.INVALID_OFFSET;
    /* renamed from: o */
    private int f8125o = 0;

    /* compiled from: IntervalVideoTracker */
    /* renamed from: bxv$1 */
    class C15801 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ bxv f8113a;

        C15801(bxv bxv) {
            this.f8113a = bxv;
        }

        public void run() {
            try {
                if (this.f8113a.f.get() == null || this.f8113a.m11685e()) {
                    this.f8113a.m11683c();
                } else if (Boolean.valueOf(this.f8113a.m11691i()).booleanValue()) {
                    this.f8113a.d.postDelayed(this, 200);
                } else {
                    this.f8113a.m11683c();
                }
            } catch (Exception e) {
                this.f8113a.m11683c();
                byt.m11829a(e);
            }
        }
    }

    /* compiled from: IntervalVideoTracker */
    /* renamed from: bxv$a */
    public enum C1581a {
        UNINITIALIZED,
        PAUSED,
        PLAYING,
        STOPPED,
        COMPLETED
    }

    /* renamed from: f */
    protected abstract Integer mo1609f();

    /* renamed from: g */
    protected abstract boolean mo1610g();

    /* renamed from: h */
    protected abstract Integer mo1611h();

    public bxv(String str, bxr bxr, byj byj) {
        super(str, bxr, byj);
    }

    /* renamed from: a */
    protected JSONObject mo1596a(bxy bxy) {
        Integer f;
        if (bxy.f8143c.equals(bxy.f8141a)) {
            try {
                f = mo1609f();
            } catch (Exception e) {
                f = Integer.valueOf(this.f8121k);
            }
            bxy.f8143c = f;
        } else {
            f = bxy.f8143c;
        }
        if (bxy.f8143c.intValue() < 0) {
            f = Integer.valueOf(this.f8121k);
            bxy.f8143c = f;
        }
        if (bxy.f8145e == bxz.AD_EVT_COMPLETE) {
            if (f.intValue() == LinearLayoutManager.INVALID_OFFSET || this.f8124n == LinearLayoutManager.INVALID_OFFSET || !m11679a(f, Integer.valueOf(this.f8124n))) {
                this.f8120j = C1581a.STOPPED;
                bxy.f8145e = bxz.AD_EVT_STOPPED;
            } else {
                this.f8120j = C1581a.COMPLETED;
            }
        }
        return super.mo1596a(bxy);
    }

    /* renamed from: b */
    protected void mo1597b() throws byu {
        super.mo1597b();
        this.d.postDelayed(new C15801(this), 200);
    }

    /* renamed from: i */
    protected boolean m11691i() throws byu {
        if (this.f.get() == null || m11685e()) {
            return false;
        }
        int intValue;
        boolean z;
        try {
            int intValue2 = mo1609f().intValue();
            if (this.f8121k >= 0 && intValue2 < 0) {
                return false;
            }
            this.f8121k = intValue2;
            if (intValue2 == 0) {
                return true;
            }
            intValue = mo1611h().intValue();
            boolean g = mo1610g();
            double d = ((double) intValue) / 4.0d;
            double d2 = m11684d();
            bxz bxz = null;
            if (intValue2 > this.f8123m) {
                this.f8123m = intValue2;
            }
            if (this.f8124n == LinearLayoutManager.INVALID_OFFSET) {
                this.f8124n = intValue;
            }
            if (g) {
                if (this.f8120j == C1581a.UNINITIALIZED) {
                    bxz = bxz.AD_EVT_START;
                    this.f8120j = C1581a.PLAYING;
                } else if (this.f8120j == C1581a.PAUSED) {
                    bxz = bxz.AD_EVT_PLAYING;
                    this.f8120j = C1581a.PLAYING;
                } else {
                    bxz bxz2;
                    intValue = ((int) Math.floor(((double) intValue2) / d)) - 1;
                    if (intValue > -1 && intValue < 3) {
                        bxz2 = b[intValue];
                        if (!this.c.containsKey(bxz2)) {
                            this.c.put(bxz2, Integer.valueOf(1));
                            bxz = bxz2;
                        }
                    }
                    bxz2 = null;
                    bxz = bxz2;
                }
            } else if (this.f8120j != C1581a.PAUSED) {
                bxz = bxz.AD_EVT_PAUSED;
                this.f8120j = C1581a.PAUSED;
            }
            if (bxz != null) {
                z = true;
            } else {
                z = false;
            }
            if (!(z || Double.isNaN(this.f8122l) || Math.abs(this.f8122l - d2) <= 0.05d)) {
                bxz = bxz.AD_EVT_VOLUME_CHANGE;
                z = true;
            }
            if (z) {
                m11682b(new bxy(bxz, Integer.valueOf(intValue2), Double.valueOf(d2)));
            }
            this.f8122l = d2;
            this.f8125o = 0;
            return true;
        } catch (Exception e) {
            intValue = this.f8125o;
            this.f8125o = intValue + 1;
            if (intValue < 5) {
                z = true;
            } else {
                z = false;
            }
            return z;
        }
    }
}
