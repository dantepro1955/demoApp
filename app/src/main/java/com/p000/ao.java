package com.p000;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import p000.an.C0317e;
import p000.an.C0317e.C0312b;
import p000.an.C0317e.C0314a;

/* compiled from: ValueAnimatorCompatImplGingerbread */
/* renamed from: ao */
class ao extends C0317e {
    /* renamed from: a */
    private static final Handler f3788a = new Handler(Looper.getMainLooper());
    /* renamed from: b */
    private long f3789b;
    /* renamed from: c */
    private boolean f3790c;
    /* renamed from: d */
    private float f3791d;
    /* renamed from: e */
    private final int[] f3792e = new int[2];
    /* renamed from: f */
    private final float[] f3793f = new float[2];
    /* renamed from: g */
    private long f3794g = 200;
    /* renamed from: h */
    private Interpolator f3795h;
    /* renamed from: i */
    private ArrayList<C0314a> f3796i;
    /* renamed from: j */
    private ArrayList<C0312b> f3797j;
    /* renamed from: k */
    private final Runnable f3798k = new C06521(this);

    /* compiled from: ValueAnimatorCompatImplGingerbread */
    /* renamed from: ao$1 */
    class C06521 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ ao f3787a;

        C06521(ao aoVar) {
            this.f3787a = aoVar;
        }

        public void run() {
            this.f3787a.m4595j();
        }
    }

    ao() {
    }

    /* renamed from: a */
    public void mo574a() {
        if (!this.f3790c) {
            if (this.f3795h == null) {
                this.f3795h = new AccelerateDecelerateInterpolator();
            }
            this.f3790c = true;
            this.f3791d = 0.0f;
            m4594i();
        }
    }

    /* renamed from: i */
    final void m4594i() {
        this.f3789b = SystemClock.uptimeMillis();
        m4576k();
        m4577l();
        f3788a.postDelayed(this.f3798k, 10);
    }

    /* renamed from: b */
    public boolean mo581b() {
        return this.f3790c;
    }

    /* renamed from: a */
    public void mo580a(Interpolator interpolator) {
        this.f3795h = interpolator;
    }

    /* renamed from: a */
    public void mo578a(C0314a c0314a) {
        if (this.f3796i == null) {
            this.f3796i = new ArrayList();
        }
        this.f3796i.add(c0314a);
    }

    /* renamed from: a */
    public void mo579a(C0312b c0312b) {
        if (this.f3797j == null) {
            this.f3797j = new ArrayList();
        }
        this.f3797j.add(c0312b);
    }

    /* renamed from: a */
    public void mo576a(int i, int i2) {
        this.f3792e[0] = i;
        this.f3792e[1] = i2;
    }

    /* renamed from: c */
    public int mo582c() {
        return C5775v.a(this.f3792e[0], this.f3792e[1], mo585f());
    }

    /* renamed from: a */
    public void mo575a(float f, float f2) {
        this.f3793f[0] = f;
        this.f3793f[1] = f2;
    }

    /* renamed from: d */
    public float mo583d() {
        return C5775v.a(this.f3793f[0], this.f3793f[1], mo585f());
    }

    /* renamed from: a */
    public void mo577a(long j) {
        this.f3794g = j;
    }

    /* renamed from: e */
    public void mo584e() {
        this.f3790c = false;
        f3788a.removeCallbacks(this.f3798k);
        m4578m();
        m4579n();
    }

    /* renamed from: f */
    public float mo585f() {
        return this.f3791d;
    }

    /* renamed from: g */
    public void mo586g() {
        if (this.f3790c) {
            this.f3790c = false;
            f3788a.removeCallbacks(this.f3798k);
            this.f3791d = 1.0f;
            m4576k();
            m4579n();
        }
    }

    /* renamed from: h */
    public long mo587h() {
        return this.f3794g;
    }

    /* renamed from: j */
    final void m4595j() {
        if (this.f3790c) {
            float a = ah.m1500a(((float) (SystemClock.uptimeMillis() - this.f3789b)) / ((float) this.f3794g), 0.0f, 1.0f);
            if (this.f3795h != null) {
                a = this.f3795h.getInterpolation(a);
            }
            this.f3791d = a;
            m4576k();
            if (SystemClock.uptimeMillis() >= this.f3789b + this.f3794g) {
                this.f3790c = false;
                m4579n();
            }
        }
        if (this.f3790c) {
            f3788a.postDelayed(this.f3798k, 10);
        }
    }

    /* renamed from: k */
    private void m4576k() {
        if (this.f3797j != null) {
            int size = this.f3797j.size();
            for (int i = 0; i < size; i++) {
                ((C0312b) this.f3797j.get(i)).mo357a();
            }
        }
    }

    /* renamed from: l */
    private void m4577l() {
        if (this.f3796i != null) {
            int size = this.f3796i.size();
            for (int i = 0; i < size; i++) {
                ((C0314a) this.f3796i.get(i)).mo358a();
            }
        }
    }

    /* renamed from: m */
    private void m4578m() {
        if (this.f3796i != null) {
            int size = this.f3796i.size();
            for (int i = 0; i < size; i++) {
                ((C0314a) this.f3796i.get(i)).mo360c();
            }
        }
    }

    /* renamed from: n */
    private void m4579n() {
        if (this.f3796i != null) {
            int size = this.f3796i.size();
            for (int i = 0; i < size; i++) {
                ((C0314a) this.f3796i.get(i)).mo359b();
            }
        }
    }
}
