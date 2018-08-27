package com.p000;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import java.util.Arrays;

/* compiled from: ViewDragHelper */
/* renamed from: mf */
public class mf {
    /* renamed from: v */
    private static final Interpolator f24465v = new C55261();
    /* renamed from: a */
    private int f24466a;
    /* renamed from: b */
    private int f24467b;
    /* renamed from: c */
    private int f24468c = -1;
    /* renamed from: d */
    private float[] f24469d;
    /* renamed from: e */
    private float[] f24470e;
    /* renamed from: f */
    private float[] f24471f;
    /* renamed from: g */
    private float[] f24472g;
    /* renamed from: h */
    private int[] f24473h;
    /* renamed from: i */
    private int[] f24474i;
    /* renamed from: j */
    private int[] f24475j;
    /* renamed from: k */
    private int f24476k;
    /* renamed from: l */
    private VelocityTracker f24477l;
    /* renamed from: m */
    private float f24478m;
    /* renamed from: n */
    private float f24479n;
    /* renamed from: o */
    private int f24480o;
    /* renamed from: p */
    private int f24481p;
    /* renamed from: q */
    private lw f24482q;
    /* renamed from: r */
    private final C5528a f24483r;
    /* renamed from: s */
    private View f24484s;
    /* renamed from: t */
    private boolean f24485t;
    /* renamed from: u */
    private final ViewGroup f24486u;
    /* renamed from: w */
    private final Runnable f24487w = new C55272(this);

    /* compiled from: ViewDragHelper */
    /* renamed from: mf$1 */
    static class C55261 implements Interpolator {
        C55261() {
        }

        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * (((f2 * f2) * f2) * f2)) + 1.0f;
        }
    }

    /* compiled from: ViewDragHelper */
    /* renamed from: mf$2 */
    class C55272 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ mf f24464a;

        C55272(mf mfVar) {
            this.f24464a = mfVar;
        }

        public void run() {
            this.f24464a.m32608c(0);
        }
    }

    /* compiled from: ViewDragHelper */
    /* renamed from: mf$a */
    public static abstract class C5528a {
        /* renamed from: a */
        public abstract boolean m32565a(View view, int i);

        /* renamed from: a */
        public void m32561a(int i) {
        }

        /* renamed from: a */
        public void m32564a(View view, int i, int i2, int i3, int i4) {
        }

        /* renamed from: b */
        public void m32569b(View view, int i) {
        }

        /* renamed from: a */
        public void m32563a(View view, float f, float f2) {
        }

        /* renamed from: a */
        public void m32562a(int i, int i2) {
        }

        /* renamed from: b */
        public boolean m32570b(int i) {
            return false;
        }

        /* renamed from: b */
        public void m32568b(int i, int i2) {
        }

        /* renamed from: c */
        public int m32571c(int i) {
            return i;
        }

        /* renamed from: b */
        public int m32566b(View view) {
            return 0;
        }

        /* renamed from: a */
        public int m32559a(View view) {
            return 0;
        }

        /* renamed from: b */
        public int m32567b(View view, int i, int i2) {
            return 0;
        }

        /* renamed from: a */
        public int m32560a(View view, int i, int i2) {
            return 0;
        }
    }

    /* renamed from: a */
    public static mf m32576a(ViewGroup viewGroup, C5528a c5528a) {
        return new mf(viewGroup.getContext(), viewGroup, c5528a);
    }

    /* renamed from: a */
    public static mf m32575a(ViewGroup viewGroup, float f, C5528a c5528a) {
        mf a = mf.m32576a(viewGroup, c5528a);
        a.f24467b = (int) (((float) a.f24467b) * (1.0f / f));
        return a;
    }

    private mf(Context context, ViewGroup viewGroup, C5528a c5528a) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        } else if (c5528a == null) {
            throw new IllegalArgumentException("Callback may not be null");
        } else {
            this.f24486u = viewGroup;
            this.f24483r = c5528a;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            this.f24480o = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
            this.f24467b = viewConfiguration.getScaledTouchSlop();
            this.f24478m = (float) viewConfiguration.getScaledMaximumFlingVelocity();
            this.f24479n = (float) viewConfiguration.getScaledMinimumFlingVelocity();
            this.f24482q = lw.m32510a(context, f24465v);
        }
    }

    /* renamed from: a */
    public void m32594a(float f) {
        this.f24479n = f;
    }

    /* renamed from: a */
    public int m32593a() {
        return this.f24466a;
    }

    /* renamed from: a */
    public void m32595a(int i) {
        this.f24481p = i;
    }

    /* renamed from: b */
    public int m32601b() {
        return this.f24480o;
    }

    /* renamed from: a */
    public void m32596a(View view, int i) {
        if (view.getParent() != this.f24486u) {
            throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + this.f24486u + ")");
        }
        this.f24484s = view;
        this.f24468c = i;
        this.f24483r.m32569b(view, i);
        m32608c(1);
    }

    /* renamed from: c */
    public View m32607c() {
        return this.f24484s;
    }

    /* renamed from: d */
    public int m32610d() {
        return this.f24467b;
    }

    /* renamed from: e */
    public void m32613e() {
        this.f24468c = -1;
        m32590g();
        if (this.f24477l != null) {
            this.f24477l.recycle();
            this.f24477l = null;
        }
    }

    /* renamed from: f */
    public void m32614f() {
        m32613e();
        if (this.f24466a == 2) {
            int b = this.f24482q.m32517b();
            int c = this.f24482q.m32518c();
            this.f24482q.m32523h();
            int b2 = this.f24482q.m32517b();
            int c2 = this.f24482q.m32518c();
            this.f24483r.m32564a(this.f24484s, b2, c2, b2 - b, c2 - c);
        }
        m32608c(0);
    }

    /* renamed from: a */
    public boolean m32599a(View view, int i, int i2) {
        this.f24484s = view;
        this.f24468c = -1;
        boolean a = m32580a(i, i2, 0, 0);
        if (!(a || this.f24466a != 0 || this.f24484s == null)) {
            this.f24484s = null;
        }
        return a;
    }

    /* renamed from: a */
    public boolean m32597a(int i, int i2) {
        if (this.f24485t) {
            return m32580a(i, i2, (int) jb.a(this.f24477l, this.f24468c), (int) jb.b(this.f24477l, this.f24468c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* renamed from: a */
    private boolean m32580a(int i, int i2, int i3, int i4) {
        int left = this.f24484s.getLeft();
        int top = this.f24484s.getTop();
        int i5 = i - left;
        int i6 = i2 - top;
        if (i5 == 0 && i6 == 0) {
            this.f24482q.m32523h();
            m32608c(0);
            return false;
        }
        this.f24482q.m32512a(left, top, i5, i6, m32574a(this.f24484s, i5, i6, i3, i4));
        m32608c(2);
        return true;
    }

    /* renamed from: a */
    private int m32574a(View view, int i, int i2, int i3, int i4) {
        int b = m32583b(i3, (int) this.f24479n, (int) this.f24478m);
        int b2 = m32583b(i4, (int) this.f24479n, (int) this.f24478m);
        int abs = Math.abs(i);
        int abs2 = Math.abs(i2);
        int abs3 = Math.abs(b);
        int abs4 = Math.abs(b2);
        int i5 = abs3 + abs4;
        int i6 = abs + abs2;
        return (int) (((b2 != 0 ? ((float) abs4) / ((float) i5) : ((float) abs2) / ((float) i6)) * ((float) m32573a(i2, b2, this.f24483r.m32559a(view)))) + ((b != 0 ? ((float) abs3) / ((float) i5) : ((float) abs) / ((float) i6)) * ((float) m32573a(i, b, this.f24483r.m32566b(view)))));
    }

    /* renamed from: a */
    private int m32573a(int i, int i2, int i3) {
        if (i == 0) {
            return 0;
        }
        int width = this.f24486u.getWidth();
        int i4 = width / 2;
        float b = (m32582b(Math.min(1.0f, ((float) Math.abs(i)) / ((float) width))) * ((float) i4)) + ((float) i4);
        i4 = Math.abs(i2);
        if (i4 > 0) {
            width = Math.round(Math.abs(b / ((float) i4)) * 1000.0f) * 4;
        } else {
            width = (int) (((((float) Math.abs(i)) / ((float) i3)) + 1.0f) * 256.0f);
        }
        return Math.min(width, 600);
    }

    /* renamed from: b */
    private int m32583b(int i, int i2, int i3) {
        int abs = Math.abs(i);
        if (abs < i2) {
            return 0;
        }
        if (abs <= i3) {
            return i;
        }
        if (i <= 0) {
            return -i3;
        }
        return i3;
    }

    /* renamed from: a */
    private float m32572a(float f, float f2, float f3) {
        float abs = Math.abs(f);
        if (abs < f2) {
            return 0.0f;
        }
        if (abs <= f3) {
            return f;
        }
        if (f <= 0.0f) {
            return -f3;
        }
        return f3;
    }

    /* renamed from: b */
    private float m32582b(float f) {
        return (float) Math.sin((double) ((float) (((double) (f - 0.5f)) * 0.4712389167638204d)));
    }

    /* renamed from: a */
    public boolean m32600a(boolean z) {
        if (this.f24466a == 2) {
            int i;
            boolean g = this.f24482q.m32522g();
            int b = this.f24482q.m32517b();
            int c = this.f24482q.m32518c();
            int left = b - this.f24484s.getLeft();
            int top = c - this.f24484s.getTop();
            if (left != 0) {
                jd.f(this.f24484s, left);
            }
            if (top != 0) {
                jd.e(this.f24484s, top);
            }
            if (!(left == 0 && top == 0)) {
                this.f24483r.m32564a(this.f24484s, b, c, left, top);
            }
            if (g && b == this.f24482q.m32519d() && c == this.f24482q.m32520e()) {
                this.f24482q.m32523h();
                i = 0;
            } else {
                boolean z2 = g;
            }
            if (i == 0) {
                if (z) {
                    this.f24486u.post(this.f24487w);
                } else {
                    m32608c(0);
                }
            }
        }
        return this.f24466a == 2;
    }

    /* renamed from: a */
    private void m32577a(float f, float f2) {
        this.f24485t = true;
        this.f24483r.m32563a(this.f24484s, f, f2);
        this.f24485t = false;
        if (this.f24466a == 1) {
            m32608c(0);
        }
    }

    /* renamed from: g */
    private void m32590g() {
        if (this.f24469d != null) {
            Arrays.fill(this.f24469d, 0.0f);
            Arrays.fill(this.f24470e, 0.0f);
            Arrays.fill(this.f24471f, 0.0f);
            Arrays.fill(this.f24472g, 0.0f);
            Arrays.fill(this.f24473h, 0);
            Arrays.fill(this.f24474i, 0);
            Arrays.fill(this.f24475j, 0);
            this.f24476k = 0;
        }
    }

    /* renamed from: e */
    private void m32588e(int i) {
        if (this.f24469d != null && m32603b(i)) {
            this.f24469d[i] = 0.0f;
            this.f24470e[i] = 0.0f;
            this.f24471f[i] = 0.0f;
            this.f24472g[i] = 0.0f;
            this.f24473h[i] = 0;
            this.f24474i[i] = 0;
            this.f24475j[i] = 0;
            this.f24476k &= (1 << i) ^ -1;
        }
    }

    /* renamed from: f */
    private void m32589f(int i) {
        if (this.f24469d == null || this.f24469d.length <= i) {
            Object obj = new float[(i + 1)];
            Object obj2 = new float[(i + 1)];
            Object obj3 = new float[(i + 1)];
            Object obj4 = new float[(i + 1)];
            Object obj5 = new int[(i + 1)];
            Object obj6 = new int[(i + 1)];
            Object obj7 = new int[(i + 1)];
            if (this.f24469d != null) {
                System.arraycopy(this.f24469d, 0, obj, 0, this.f24469d.length);
                System.arraycopy(this.f24470e, 0, obj2, 0, this.f24470e.length);
                System.arraycopy(this.f24471f, 0, obj3, 0, this.f24471f.length);
                System.arraycopy(this.f24472g, 0, obj4, 0, this.f24472g.length);
                System.arraycopy(this.f24473h, 0, obj5, 0, this.f24473h.length);
                System.arraycopy(this.f24474i, 0, obj6, 0, this.f24474i.length);
                System.arraycopy(this.f24475j, 0, obj7, 0, this.f24475j.length);
            }
            this.f24469d = obj;
            this.f24470e = obj2;
            this.f24471f = obj3;
            this.f24472g = obj4;
            this.f24473h = obj5;
            this.f24474i = obj6;
            this.f24475j = obj7;
        }
    }

    /* renamed from: a */
    private void m32578a(float f, float f2, int i) {
        m32589f(i);
        float[] fArr = this.f24469d;
        this.f24471f[i] = f;
        fArr[i] = f;
        fArr = this.f24470e;
        this.f24472g[i] = f2;
        fArr[i] = f2;
        this.f24473h[i] = m32587e((int) f, (int) f2);
        this.f24476k |= 1 << i;
    }

    /* renamed from: c */
    private void m32586c(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            if (m32591g(pointerId)) {
                float x = motionEvent.getX(i);
                float y = motionEvent.getY(i);
                this.f24471f[pointerId] = x;
                this.f24472g[pointerId] = y;
            }
        }
    }

    /* renamed from: b */
    public boolean m32603b(int i) {
        return (this.f24476k & (1 << i)) != 0;
    }

    /* renamed from: c */
    void m32608c(int i) {
        this.f24486u.removeCallbacks(this.f24487w);
        if (this.f24466a != i) {
            this.f24466a = i;
            this.f24483r.m32561a(i);
            if (this.f24466a == 0) {
                this.f24484s = null;
            }
        }
    }

    /* renamed from: b */
    boolean m32605b(View view, int i) {
        if (view == this.f24484s && this.f24468c == i) {
            return true;
        }
        if (view == null || !this.f24483r.m32565a(view, i)) {
            return false;
        }
        this.f24468c = i;
        m32596a(view, i);
        return true;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public boolean m32598a(MotionEvent r14) {
        /*
        r13 = this;
        r0 = p000.io.a(r14);
        r1 = p000.io.b(r14);
        if (r0 != 0) goto L_0x000d;
    L_0x000a:
        r13.m32613e();
    L_0x000d:
        r2 = r13.f24477l;
        if (r2 != 0) goto L_0x0017;
    L_0x0011:
        r2 = android.view.VelocityTracker.obtain();
        r13.f24477l = r2;
    L_0x0017:
        r2 = r13.f24477l;
        r2.addMovement(r14);
        switch(r0) {
            case 0: goto L_0x0026;
            case 1: goto L_0x0128;
            case 2: goto L_0x0092;
            case 3: goto L_0x0128;
            case 4: goto L_0x001f;
            case 5: goto L_0x005a;
            case 6: goto L_0x011f;
            default: goto L_0x001f;
        };
    L_0x001f:
        r0 = r13.f24466a;
        r1 = 1;
        if (r0 != r1) goto L_0x012d;
    L_0x0024:
        r0 = 1;
    L_0x0025:
        return r0;
    L_0x0026:
        r0 = r14.getX();
        r1 = r14.getY();
        r2 = 0;
        r2 = r14.getPointerId(r2);
        r13.m32578a(r0, r1, r2);
        r0 = (int) r0;
        r1 = (int) r1;
        r0 = r13.m32611d(r0, r1);
        r1 = r13.f24484s;
        if (r0 != r1) goto L_0x0048;
    L_0x0040:
        r1 = r13.f24466a;
        r3 = 2;
        if (r1 != r3) goto L_0x0048;
    L_0x0045:
        r13.m32605b(r0, r2);
    L_0x0048:
        r0 = r13.f24473h;
        r0 = r0[r2];
        r1 = r13.f24481p;
        r1 = r1 & r0;
        if (r1 == 0) goto L_0x001f;
    L_0x0051:
        r1 = r13.f24483r;
        r3 = r13.f24481p;
        r0 = r0 & r3;
        r1.m32562a(r0, r2);
        goto L_0x001f;
    L_0x005a:
        r0 = r14.getPointerId(r1);
        r2 = r14.getX(r1);
        r1 = r14.getY(r1);
        r13.m32578a(r2, r1, r0);
        r3 = r13.f24466a;
        if (r3 != 0) goto L_0x007f;
    L_0x006d:
        r1 = r13.f24473h;
        r1 = r1[r0];
        r2 = r13.f24481p;
        r2 = r2 & r1;
        if (r2 == 0) goto L_0x001f;
    L_0x0076:
        r2 = r13.f24483r;
        r3 = r13.f24481p;
        r1 = r1 & r3;
        r2.m32562a(r1, r0);
        goto L_0x001f;
    L_0x007f:
        r3 = r13.f24466a;
        r4 = 2;
        if (r3 != r4) goto L_0x001f;
    L_0x0084:
        r2 = (int) r2;
        r1 = (int) r1;
        r1 = r13.m32611d(r2, r1);
        r2 = r13.f24484s;
        if (r1 != r2) goto L_0x001f;
    L_0x008e:
        r13.m32605b(r1, r0);
        goto L_0x001f;
    L_0x0092:
        r0 = r13.f24469d;
        if (r0 == 0) goto L_0x001f;
    L_0x0096:
        r0 = r13.f24470e;
        if (r0 == 0) goto L_0x001f;
    L_0x009a:
        r2 = r14.getPointerCount();
        r0 = 0;
        r1 = r0;
    L_0x00a0:
        if (r1 >= r2) goto L_0x0107;
    L_0x00a2:
        r3 = r14.getPointerId(r1);
        r0 = r13.m32591g(r3);
        if (r0 != 0) goto L_0x00b0;
    L_0x00ac:
        r0 = r1 + 1;
        r1 = r0;
        goto L_0x00a0;
    L_0x00b0:
        r0 = r14.getX(r1);
        r4 = r14.getY(r1);
        r5 = r13.f24469d;
        r5 = r5[r3];
        r5 = r0 - r5;
        r6 = r13.f24470e;
        r6 = r6[r3];
        r6 = r4 - r6;
        r0 = (int) r0;
        r4 = (int) r4;
        r4 = r13.m32611d(r0, r4);
        if (r4 == 0) goto L_0x010c;
    L_0x00cc:
        r0 = r13.m32581a(r4, r5, r6);
        if (r0 == 0) goto L_0x010c;
    L_0x00d2:
        r0 = 1;
    L_0x00d3:
        if (r0 == 0) goto L_0x010e;
    L_0x00d5:
        r7 = r4.getLeft();
        r8 = (int) r5;
        r8 = r8 + r7;
        r9 = r13.f24483r;
        r10 = (int) r5;
        r8 = r9.m32567b(r4, r8, r10);
        r9 = r4.getTop();
        r10 = (int) r6;
        r10 = r10 + r9;
        r11 = r13.f24483r;
        r12 = (int) r6;
        r10 = r11.m32560a(r4, r10, r12);
        r11 = r13.f24483r;
        r11 = r11.m32566b(r4);
        r12 = r13.f24483r;
        r12 = r12.m32559a(r4);
        if (r11 == 0) goto L_0x0101;
    L_0x00fd:
        if (r11 <= 0) goto L_0x010e;
    L_0x00ff:
        if (r8 != r7) goto L_0x010e;
    L_0x0101:
        if (r12 == 0) goto L_0x0107;
    L_0x0103:
        if (r12 <= 0) goto L_0x010e;
    L_0x0105:
        if (r10 != r9) goto L_0x010e;
    L_0x0107:
        r13.m32586c(r14);
        goto L_0x001f;
    L_0x010c:
        r0 = 0;
        goto L_0x00d3;
    L_0x010e:
        r13.m32584b(r5, r6, r3);
        r5 = r13.f24466a;
        r6 = 1;
        if (r5 == r6) goto L_0x0107;
    L_0x0116:
        if (r0 == 0) goto L_0x00ac;
    L_0x0118:
        r0 = r13.m32605b(r4, r3);
        if (r0 == 0) goto L_0x00ac;
    L_0x011e:
        goto L_0x0107;
    L_0x011f:
        r0 = r14.getPointerId(r1);
        r13.m32588e(r0);
        goto L_0x001f;
    L_0x0128:
        r13.m32613e();
        goto L_0x001f;
    L_0x012d:
        r0 = 0;
        goto L_0x0025;
        */
        throw new UnsupportedOperationException("Method not decompiled: mf.a(android.view.MotionEvent):boolean");
    }

    /* renamed from: b */
    public void m32602b(MotionEvent motionEvent) {
        int i = 0;
        int a = io.a(motionEvent);
        int b = io.b(motionEvent);
        if (a == 0) {
            m32613e();
        }
        if (this.f24477l == null) {
            this.f24477l = VelocityTracker.obtain();
        }
        this.f24477l.addMovement(motionEvent);
        float x;
        float y;
        View d;
        int i2;
        switch (a) {
            case 0:
                x = motionEvent.getX();
                y = motionEvent.getY();
                i = motionEvent.getPointerId(0);
                d = m32611d((int) x, (int) y);
                m32578a(x, y, i);
                m32605b(d, i);
                i2 = this.f24473h[i];
                if ((this.f24481p & i2) != 0) {
                    this.f24483r.m32562a(i2 & this.f24481p, i);
                    return;
                }
                return;
            case 1:
                if (this.f24466a == 1) {
                    m32592h();
                }
                m32613e();
                return;
            case 2:
                if (this.f24466a != 1) {
                    i2 = motionEvent.getPointerCount();
                    while (i < i2) {
                        a = motionEvent.getPointerId(i);
                        if (m32591g(a)) {
                            float x2 = motionEvent.getX(i);
                            float y2 = motionEvent.getY(i);
                            float f = x2 - this.f24469d[a];
                            float f2 = y2 - this.f24470e[a];
                            m32584b(f, f2, a);
                            if (this.f24466a != 1) {
                                d = m32611d((int) x2, (int) y2);
                                if (m32581a(d, f, f2) && m32605b(d, a)) {
                                }
                            }
                            m32586c(motionEvent);
                            return;
                        }
                        i++;
                    }
                    m32586c(motionEvent);
                    return;
                } else if (m32591g(this.f24468c)) {
                    i = motionEvent.findPointerIndex(this.f24468c);
                    x = motionEvent.getX(i);
                    i2 = (int) (x - this.f24471f[this.f24468c]);
                    i = (int) (motionEvent.getY(i) - this.f24472g[this.f24468c]);
                    m32585b(this.f24484s.getLeft() + i2, this.f24484s.getTop() + i, i2, i);
                    m32586c(motionEvent);
                    return;
                } else {
                    return;
                }
            case 3:
                if (this.f24466a == 1) {
                    m32577a(0.0f, 0.0f);
                }
                m32613e();
                return;
            case 5:
                i = motionEvent.getPointerId(b);
                x = motionEvent.getX(b);
                y = motionEvent.getY(b);
                m32578a(x, y, i);
                if (this.f24466a == 0) {
                    m32605b(m32611d((int) x, (int) y), i);
                    i2 = this.f24473h[i];
                    if ((this.f24481p & i2) != 0) {
                        this.f24483r.m32562a(i2 & this.f24481p, i);
                        return;
                    }
                    return;
                } else if (m32609c((int) x, (int) y)) {
                    m32605b(this.f24484s, i);
                    return;
                } else {
                    return;
                }
            case 6:
                a = motionEvent.getPointerId(b);
                if (this.f24466a == 1 && a == this.f24468c) {
                    b = motionEvent.getPointerCount();
                    while (i < b) {
                        int pointerId = motionEvent.getPointerId(i);
                        if (pointerId != this.f24468c) {
                            if (m32611d((int) motionEvent.getX(i), (int) motionEvent.getY(i)) == this.f24484s && m32605b(this.f24484s, pointerId)) {
                                i = this.f24468c;
                                if (i == -1) {
                                    m32592h();
                                }
                            }
                        }
                        i++;
                    }
                    i = -1;
                    if (i == -1) {
                        m32592h();
                    }
                }
                m32588e(a);
                return;
            default:
                return;
        }
    }

    /* renamed from: b */
    private void m32584b(float f, float f2, int i) {
        int i2 = 1;
        if (!m32579a(f, f2, i, 1)) {
            i2 = 0;
        }
        if (m32579a(f2, f, i, 4)) {
            i2 |= 4;
        }
        if (m32579a(f, f2, i, 2)) {
            i2 |= 2;
        }
        if (m32579a(f2, f, i, 8)) {
            i2 |= 8;
        }
        if (i2 != 0) {
            int[] iArr = this.f24474i;
            iArr[i] = iArr[i] | i2;
            this.f24483r.m32568b(i2, i);
        }
    }

    /* renamed from: a */
    private boolean m32579a(float f, float f2, int i, int i2) {
        float abs = Math.abs(f);
        float abs2 = Math.abs(f2);
        if ((this.f24473h[i] & i2) != i2 || (this.f24481p & i2) == 0 || (this.f24475j[i] & i2) == i2 || (this.f24474i[i] & i2) == i2) {
            return false;
        }
        if (abs <= ((float) this.f24467b) && abs2 <= ((float) this.f24467b)) {
            return false;
        }
        if (abs < abs2 * 0.5f && this.f24483r.m32570b(i2)) {
            int[] iArr = this.f24475j;
            iArr[i] = iArr[i] | i2;
            return false;
        } else if ((this.f24474i[i] & i2) != 0 || abs <= ((float) this.f24467b)) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: a */
    private boolean m32581a(View view, float f, float f2) {
        if (view == null) {
            return false;
        }
        boolean z;
        boolean z2;
        if (this.f24483r.m32566b(view) > 0) {
            z = true;
        } else {
            z = false;
        }
        if (this.f24483r.m32559a(view) > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z && z2) {
            if ((f * f) + (f2 * f2) <= ((float) (this.f24467b * this.f24467b))) {
                return false;
            }
            return true;
        } else if (z) {
            if (Math.abs(f) <= ((float) this.f24467b)) {
                return false;
            }
            return true;
        } else if (!z2) {
            return false;
        } else {
            if (Math.abs(f2) <= ((float) this.f24467b)) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: d */
    public boolean m32612d(int i) {
        int length = this.f24469d.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (m32604b(i, i2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public boolean m32604b(int i, int i2) {
        if (!m32603b(i2)) {
            return false;
        }
        boolean z;
        boolean z2 = (i & 1) == 1;
        if ((i & 2) == 2) {
            z = true;
        } else {
            z = false;
        }
        float f = this.f24471f[i2] - this.f24469d[i2];
        float f2 = this.f24472g[i2] - this.f24470e[i2];
        if (z2 && z) {
            if ((f * f) + (f2 * f2) <= ((float) (this.f24467b * this.f24467b))) {
                return false;
            }
            return true;
        } else if (z2) {
            if (Math.abs(f) <= ((float) this.f24467b)) {
                return false;
            }
            return true;
        } else if (!z) {
            return false;
        } else {
            if (Math.abs(f2) <= ((float) this.f24467b)) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: h */
    private void m32592h() {
        this.f24477l.computeCurrentVelocity(1000, this.f24478m);
        m32577a(m32572a(jb.a(this.f24477l, this.f24468c), this.f24479n, this.f24478m), m32572a(jb.b(this.f24477l, this.f24468c), this.f24479n, this.f24478m));
    }

    /* renamed from: b */
    private void m32585b(int i, int i2, int i3, int i4) {
        int b;
        int a;
        int left = this.f24484s.getLeft();
        int top = this.f24484s.getTop();
        if (i3 != 0) {
            b = this.f24483r.m32567b(this.f24484s, i, i3);
            jd.f(this.f24484s, b - left);
        } else {
            b = i;
        }
        if (i4 != 0) {
            a = this.f24483r.m32560a(this.f24484s, i2, i4);
            jd.e(this.f24484s, a - top);
        } else {
            a = i2;
        }
        if (i3 != 0 || i4 != 0) {
            this.f24483r.m32564a(this.f24484s, b, a, b - left, a - top);
        }
    }

    /* renamed from: c */
    public boolean m32609c(int i, int i2) {
        return m32606b(this.f24484s, i, i2);
    }

    /* renamed from: b */
    public boolean m32606b(View view, int i, int i2) {
        if (view != null && i >= view.getLeft() && i < view.getRight() && i2 >= view.getTop() && i2 < view.getBottom()) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public View m32611d(int i, int i2) {
        for (int childCount = this.f24486u.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = this.f24486u.getChildAt(this.f24483r.m32571c(childCount));
            if (i >= childAt.getLeft() && i < childAt.getRight() && i2 >= childAt.getTop() && i2 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: e */
    private int m32587e(int i, int i2) {
        int i3 = 0;
        if (i < this.f24486u.getLeft() + this.f24480o) {
            i3 = 1;
        }
        if (i2 < this.f24486u.getTop() + this.f24480o) {
            i3 |= 4;
        }
        if (i > this.f24486u.getRight() - this.f24480o) {
            i3 |= 2;
        }
        if (i2 > this.f24486u.getBottom() - this.f24480o) {
            return i3 | 8;
        }
        return i3;
    }

    /* renamed from: g */
    private boolean m32591g(int i) {
        if (m32603b(i)) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + i + " because ACTION_DOWN was not received " + "for this pointer before ACTION_MOVE. It likely happened because " + " ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }
}
