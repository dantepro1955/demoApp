package com.p000;

import android.content.res.Resources;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import com.facebook.stetho.server.http.HttpStatus;

/* compiled from: AutoScrollHelper */
/* renamed from: kz */
public abstract class kz implements OnTouchListener {
    /* renamed from: r */
    private static final int f24368r = ViewConfiguration.getTapTimeout();
    /* renamed from: a */
    final C5498a f24369a = new C5498a();
    /* renamed from: b */
    final View f24370b;
    /* renamed from: c */
    boolean f24371c;
    /* renamed from: d */
    boolean f24372d;
    /* renamed from: e */
    boolean f24373e;
    /* renamed from: f */
    private final Interpolator f24374f = new AccelerateInterpolator();
    /* renamed from: g */
    private Runnable f24375g;
    /* renamed from: h */
    private float[] f24376h = new float[]{0.0f, 0.0f};
    /* renamed from: i */
    private float[] f24377i = new float[]{Float.MAX_VALUE, Float.MAX_VALUE};
    /* renamed from: j */
    private int f24378j;
    /* renamed from: k */
    private int f24379k;
    /* renamed from: l */
    private float[] f24380l = new float[]{0.0f, 0.0f};
    /* renamed from: m */
    private float[] f24381m = new float[]{0.0f, 0.0f};
    /* renamed from: n */
    private float[] f24382n = new float[]{Float.MAX_VALUE, Float.MAX_VALUE};
    /* renamed from: o */
    private boolean f24383o;
    /* renamed from: p */
    private boolean f24384p;
    /* renamed from: q */
    private boolean f24385q;

    /* compiled from: AutoScrollHelper */
    /* renamed from: kz$a */
    static class C5498a {
        /* renamed from: a */
        private int f24356a;
        /* renamed from: b */
        private int f24357b;
        /* renamed from: c */
        private float f24358c;
        /* renamed from: d */
        private float f24359d;
        /* renamed from: e */
        private long f24360e = Long.MIN_VALUE;
        /* renamed from: f */
        private long f24361f = 0;
        /* renamed from: g */
        private int f24362g = 0;
        /* renamed from: h */
        private int f24363h = 0;
        /* renamed from: i */
        private long f24364i = -1;
        /* renamed from: j */
        private float f24365j;
        /* renamed from: k */
        private int f24366k;

        C5498a() {
        }

        /* renamed from: a */
        public void m32325a(int i) {
            this.f24356a = i;
        }

        /* renamed from: b */
        public void m32327b(int i) {
            this.f24357b = i;
        }

        /* renamed from: a */
        public void m32323a() {
            this.f24360e = AnimationUtils.currentAnimationTimeMillis();
            this.f24364i = -1;
            this.f24361f = this.f24360e;
            this.f24365j = 0.5f;
            this.f24362g = 0;
            this.f24363h = 0;
        }

        /* renamed from: b */
        public void m32326b() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f24366k = kz.m32337a((int) (currentAnimationTimeMillis - this.f24360e), 0, this.f24357b);
            this.f24365j = m32322a(currentAnimationTimeMillis);
            this.f24364i = currentAnimationTimeMillis;
        }

        /* renamed from: c */
        public boolean m32328c() {
            return this.f24364i > 0 && AnimationUtils.currentAnimationTimeMillis() > this.f24364i + ((long) this.f24366k);
        }

        /* renamed from: a */
        private float m32322a(long j) {
            if (j < this.f24360e) {
                return 0.0f;
            }
            if (this.f24364i < 0 || j < this.f24364i) {
                return kz.m32334a(((float) (j - this.f24360e)) / ((float) this.f24356a), 0.0f, 1.0f) * 0.5f;
            }
            long j2 = j - this.f24364i;
            return (kz.m32334a(((float) j2) / ((float) this.f24366k), 0.0f, 1.0f) * this.f24365j) + (1.0f - this.f24365j);
        }

        /* renamed from: a */
        private float m32321a(float f) {
            return ((-4.0f * f) * f) + (4.0f * f);
        }

        /* renamed from: d */
        public void m32329d() {
            if (this.f24361f == 0) {
                throw new RuntimeException("Cannot compute scroll delta before calling start()");
            }
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            float a = m32321a(m32322a(currentAnimationTimeMillis));
            long j = currentAnimationTimeMillis - this.f24361f;
            this.f24361f = currentAnimationTimeMillis;
            this.f24362g = (int) ((((float) j) * a) * this.f24358c);
            this.f24363h = (int) ((((float) j) * a) * this.f24359d);
        }

        /* renamed from: a */
        public void m32324a(float f, float f2) {
            this.f24358c = f;
            this.f24359d = f2;
        }

        /* renamed from: e */
        public int m32330e() {
            return (int) (this.f24358c / Math.abs(this.f24358c));
        }

        /* renamed from: f */
        public int m32331f() {
            return (int) (this.f24359d / Math.abs(this.f24359d));
        }

        /* renamed from: g */
        public int m32332g() {
            return this.f24362g;
        }

        /* renamed from: h */
        public int m32333h() {
            return this.f24363h;
        }
    }

    /* compiled from: AutoScrollHelper */
    /* renamed from: kz$b */
    class C5499b implements Runnable {
        /* renamed from: a */
        final /* synthetic */ kz f24367a;

        C5499b(kz kzVar) {
            this.f24367a = kzVar;
        }

        public void run() {
            if (this.f24367a.f24373e) {
                if (this.f24367a.f24371c) {
                    this.f24367a.f24371c = false;
                    this.f24367a.f24369a.m32323a();
                }
                C5498a c5498a = this.f24367a.f24369a;
                if (c5498a.m32328c() || !this.f24367a.m32345a()) {
                    this.f24367a.f24373e = false;
                    return;
                }
                if (this.f24367a.f24372d) {
                    this.f24367a.f24372d = false;
                    this.f24367a.m32348b();
                }
                c5498a.m32329d();
                this.f24367a.mo5153a(c5498a.m32332g(), c5498a.m32333h());
                jd.a(this.f24367a.f24370b, this);
            }
        }
    }

    /* renamed from: a */
    public abstract void mo5153a(int i, int i2);

    /* renamed from: e */
    public abstract boolean mo5154e(int i);

    /* renamed from: f */
    public abstract boolean mo5155f(int i);

    public kz(View view) {
        this.f24370b = view;
        DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
        int i = (int) ((1575.0f * displayMetrics.density) + 0.5f);
        int i2 = (int) ((displayMetrics.density * 315.0f) + 0.5f);
        m32341a((float) i, (float) i);
        m32346b((float) i2, (float) i2);
        m32342a(1);
        m32353e(Float.MAX_VALUE, Float.MAX_VALUE);
        m32351d(0.2f, 0.2f);
        m32349c(1.0f, 1.0f);
        m32347b(f24368r);
        m32350c(HttpStatus.HTTP_INTERNAL_SERVER_ERROR);
        m32352d(HttpStatus.HTTP_INTERNAL_SERVER_ERROR);
    }

    /* renamed from: a */
    public kz m32343a(boolean z) {
        if (this.f24384p && !z) {
            m32339d();
        }
        this.f24384p = z;
        return this;
    }

    /* renamed from: a */
    public kz m32341a(float f, float f2) {
        this.f24382n[0] = f / 1000.0f;
        this.f24382n[1] = f2 / 1000.0f;
        return this;
    }

    /* renamed from: b */
    public kz m32346b(float f, float f2) {
        this.f24381m[0] = f / 1000.0f;
        this.f24381m[1] = f2 / 1000.0f;
        return this;
    }

    /* renamed from: c */
    public kz m32349c(float f, float f2) {
        this.f24380l[0] = f / 1000.0f;
        this.f24380l[1] = f2 / 1000.0f;
        return this;
    }

    /* renamed from: a */
    public kz m32342a(int i) {
        this.f24378j = i;
        return this;
    }

    /* renamed from: d */
    public kz m32351d(float f, float f2) {
        this.f24376h[0] = f;
        this.f24376h[1] = f2;
        return this;
    }

    /* renamed from: e */
    public kz m32353e(float f, float f2) {
        this.f24377i[0] = f;
        this.f24377i[1] = f2;
        return this;
    }

    /* renamed from: b */
    public kz m32347b(int i) {
        this.f24379k = i;
        return this;
    }

    /* renamed from: c */
    public kz m32350c(int i) {
        this.f24369a.m32325a(i);
        return this;
    }

    /* renamed from: d */
    public kz m32352d(int i) {
        this.f24369a.m32327b(i);
        return this;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z = true;
        if (!this.f24384p) {
            return false;
        }
        switch (io.a(motionEvent)) {
            case 0:
                this.f24372d = true;
                this.f24383o = false;
                break;
            case 1:
            case 3:
                m32339d();
                break;
            case 2:
                break;
        }
        this.f24369a.m32324a(m32336a(0, motionEvent.getX(), (float) view.getWidth(), (float) this.f24370b.getWidth()), m32336a(1, motionEvent.getY(), (float) view.getHeight(), (float) this.f24370b.getHeight()));
        if (!this.f24373e && m32345a()) {
            m32338c();
        }
        if (!(this.f24385q && this.f24373e)) {
            z = false;
        }
        return z;
    }

    /* renamed from: a */
    boolean m32345a() {
        C5498a c5498a = this.f24369a;
        int f = c5498a.m32331f();
        int e = c5498a.m32330e();
        return (f != 0 && mo5155f(f)) || (e != 0 && mo5154e(e));
    }

    /* renamed from: c */
    private void m32338c() {
        if (this.f24375g == null) {
            this.f24375g = new C5499b(this);
        }
        this.f24373e = true;
        this.f24371c = true;
        if (this.f24383o || this.f24379k <= 0) {
            this.f24375g.run();
        } else {
            jd.a(this.f24370b, this.f24375g, (long) this.f24379k);
        }
        this.f24383o = true;
    }

    /* renamed from: d */
    private void m32339d() {
        if (this.f24371c) {
            this.f24373e = false;
        } else {
            this.f24369a.m32326b();
        }
    }

    /* renamed from: a */
    private float m32336a(int i, float f, float f2, float f3) {
        float a = m32335a(this.f24376h[i], f2, this.f24377i[i], f);
        if (a == 0.0f) {
            return 0.0f;
        }
        float f4 = this.f24380l[i];
        float f5 = this.f24381m[i];
        float f6 = this.f24382n[i];
        f4 *= f3;
        if (a > 0.0f) {
            return kz.m32334a(a * f4, f5, f6);
        }
        return -kz.m32334a((-a) * f4, f5, f6);
    }

    /* renamed from: a */
    private float m32335a(float f, float f2, float f3, float f4) {
        float f5;
        float a = kz.m32334a(f * f2, 0.0f, f3);
        a = m32340f(f2 - f4, a) - m32340f(f4, a);
        if (a < 0.0f) {
            f5 = -this.f24374f.getInterpolation(-a);
        } else if (a <= 0.0f) {
            return 0.0f;
        } else {
            f5 = this.f24374f.getInterpolation(a);
        }
        return kz.m32334a(f5, -1.0f, 1.0f);
    }

    /* renamed from: f */
    private float m32340f(float f, float f2) {
        if (f2 == 0.0f) {
            return 0.0f;
        }
        switch (this.f24378j) {
            case 0:
            case 1:
                if (f >= f2) {
                    return 0.0f;
                }
                if (f >= 0.0f) {
                    return 1.0f - (f / f2);
                }
                if (this.f24373e && this.f24378j == 1) {
                    return 1.0f;
                }
                return 0.0f;
            case 2:
                if (f < 0.0f) {
                    return f / (-f2);
                }
                return 0.0f;
            default:
                return 0.0f;
        }
    }

    /* renamed from: a */
    static int m32337a(int i, int i2, int i3) {
        if (i > i3) {
            return i3;
        }
        if (i < i2) {
            return i2;
        }
        return i;
    }

    /* renamed from: a */
    static float m32334a(float f, float f2, float f3) {
        if (f > f3) {
            return f3;
        }
        if (f < f2) {
            return f2;
        }
        return f;
    }

    /* renamed from: b */
    void m32348b() {
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
        this.f24370b.onTouchEvent(obtain);
        obtain.recycle();
    }
}
