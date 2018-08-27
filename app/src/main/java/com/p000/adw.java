package com.p000;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;
import android.view.Choreographer.FrameCallback;
import android.view.WindowManager;

@TargetApi(16)
/* compiled from: VideoFrameReleaseTimeHelper */
/* renamed from: adw */
public final class adw {
    /* renamed from: a */
    private final C0109a f658a;
    /* renamed from: b */
    private final boolean f659b;
    /* renamed from: c */
    private final long f660c;
    /* renamed from: d */
    private final long f661d;
    /* renamed from: e */
    private long f662e;
    /* renamed from: f */
    private long f663f;
    /* renamed from: g */
    private long f664g;
    /* renamed from: h */
    private boolean f665h;
    /* renamed from: i */
    private long f666i;
    /* renamed from: j */
    private long f667j;
    /* renamed from: k */
    private long f668k;

    /* compiled from: VideoFrameReleaseTimeHelper */
    /* renamed from: adw$a */
    static final class C0109a implements Callback, FrameCallback {
        /* renamed from: b */
        private static final C0109a f652b = new C0109a();
        /* renamed from: a */
        public volatile long f653a;
        /* renamed from: c */
        private final Handler f654c;
        /* renamed from: d */
        private final HandlerThread f655d = new HandlerThread("ChoreographerOwner:Handler");
        /* renamed from: e */
        private Choreographer f656e;
        /* renamed from: f */
        private int f657f;

        /* renamed from: a */
        public static C0109a m849a() {
            return f652b;
        }

        private C0109a() {
            this.f655d.start();
            this.f654c = new Handler(this.f655d.getLooper(), this);
            this.f654c.sendEmptyMessage(0);
        }

        /* renamed from: b */
        public void m853b() {
            this.f654c.sendEmptyMessage(1);
        }

        /* renamed from: c */
        public void m854c() {
            this.f654c.sendEmptyMessage(2);
        }

        public void doFrame(long j) {
            this.f653a = j;
            this.f656e.postFrameCallbackDelayed(this, 500);
        }

        public boolean handleMessage(Message message) {
            switch (message.what) {
                case 0:
                    m850d();
                    return true;
                case 1:
                    m851e();
                    return true;
                case 2:
                    m852f();
                    return true;
                default:
                    return false;
            }
        }

        /* renamed from: d */
        private void m850d() {
            this.f656e = Choreographer.getInstance();
        }

        /* renamed from: e */
        private void m851e() {
            this.f657f++;
            if (this.f657f == 1) {
                this.f656e.postFrameCallback(this);
            }
        }

        /* renamed from: f */
        private void m852f() {
            this.f657f--;
            if (this.f657f == 0) {
                this.f656e.removeFrameCallback(this);
                this.f653a = 0;
            }
        }
    }

    public adw() {
        this(-1.0f, false);
    }

    public adw(Context context) {
        this(adw.m855a(context), true);
    }

    private adw(float f, boolean z) {
        this.f659b = z;
        if (z) {
            this.f658a = C0109a.m849a();
            this.f660c = (long) (1.0E9d / ((double) f));
            this.f661d = (this.f660c * 80) / 100;
            return;
        }
        this.f658a = null;
        this.f660c = -1;
        this.f661d = -1;
    }

    /* renamed from: a */
    public void m859a() {
        this.f665h = false;
        if (this.f659b) {
            this.f658a.m853b();
        }
    }

    /* renamed from: b */
    public void m860b() {
        if (this.f659b) {
            this.f658a.m854c();
        }
    }

    /* renamed from: a */
    public long m858a(long j, long j2) {
        long j3;
        long j4;
        long j5 = j * 1000;
        if (this.f665h) {
            if (j != this.f662e) {
                this.f668k++;
                this.f663f = this.f664g;
            }
            if (this.f668k >= 6) {
                j3 = this.f663f + ((j5 - this.f667j) / this.f668k);
                if (m857b(j3, j2)) {
                    this.f665h = false;
                    j4 = j2;
                    j3 = j5;
                } else {
                    j4 = (this.f666i + j3) - this.f667j;
                }
                if (!this.f665h) {
                    this.f667j = j5;
                    this.f666i = j2;
                    this.f668k = 0;
                    this.f665h = true;
                    m861c();
                }
                this.f662e = j;
                this.f664g = j3;
                return (this.f658a == null || this.f658a.f653a == 0) ? j4 : adw.m856a(j4, this.f658a.f653a, this.f660c) - this.f661d;
            } else if (m857b(j5, j2)) {
                this.f665h = false;
            }
        }
        j4 = j2;
        j3 = j5;
        if (this.f665h) {
            this.f667j = j5;
            this.f666i = j2;
            this.f668k = 0;
            this.f665h = true;
            m861c();
        }
        this.f662e = j;
        this.f664g = j3;
        if (this.f658a == null) {
            return j4;
        }
    }

    /* renamed from: c */
    protected void m861c() {
    }

    /* renamed from: b */
    private boolean m857b(long j, long j2) {
        return Math.abs((j2 - this.f666i) - (j - this.f667j)) > 20000000;
    }

    /* renamed from: a */
    private static long m856a(long j, long j2, long j3) {
        long j4;
        long j5 = (((j - j2) / j3) * j3) + j2;
        if (j <= j5) {
            j4 = j5 - j3;
        } else {
            j4 = j5;
            j5 += j3;
        }
        if (j5 - j < j - j4) {
            return j5;
        }
        return j4;
    }

    /* renamed from: a */
    private static float m855a(Context context) {
        return ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRefreshRate();
    }
}
