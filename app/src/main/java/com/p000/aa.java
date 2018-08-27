package com.p000;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build.VERSION;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.view.View;
import android.view.animation.Interpolator;
import p000.mx.C5577j;

/* compiled from: CollapsingTextHelper */
/* renamed from: aa */
public final class aa {
    /* renamed from: a */
    private static final boolean f2a = (VERSION.SDK_INT < 18);
    /* renamed from: b */
    private static final Paint f3b = null;
    /* renamed from: A */
    private boolean f4A;
    /* renamed from: B */
    private Bitmap f5B;
    /* renamed from: C */
    private Paint f6C;
    /* renamed from: D */
    private float f7D;
    /* renamed from: E */
    private float f8E;
    /* renamed from: F */
    private float f9F;
    /* renamed from: G */
    private float f10G;
    /* renamed from: H */
    private int[] f11H;
    /* renamed from: I */
    private boolean f12I;
    /* renamed from: J */
    private final TextPaint f13J;
    /* renamed from: K */
    private Interpolator f14K;
    /* renamed from: L */
    private Interpolator f15L;
    /* renamed from: M */
    private float f16M;
    /* renamed from: N */
    private float f17N;
    /* renamed from: O */
    private float f18O;
    /* renamed from: P */
    private int f19P;
    /* renamed from: Q */
    private float f20Q;
    /* renamed from: R */
    private float f21R;
    /* renamed from: S */
    private float f22S;
    /* renamed from: T */
    private int f23T;
    /* renamed from: c */
    private final View f24c;
    /* renamed from: d */
    private boolean f25d;
    /* renamed from: e */
    private float f26e;
    /* renamed from: f */
    private final Rect f27f;
    /* renamed from: g */
    private final Rect f28g;
    /* renamed from: h */
    private final RectF f29h;
    /* renamed from: i */
    private int f30i = 16;
    /* renamed from: j */
    private int f31j = 16;
    /* renamed from: k */
    private float f32k = 15.0f;
    /* renamed from: l */
    private float f33l = 15.0f;
    /* renamed from: m */
    private ColorStateList f34m;
    /* renamed from: n */
    private ColorStateList f35n;
    /* renamed from: o */
    private float f36o;
    /* renamed from: p */
    private float f37p;
    /* renamed from: q */
    private float f38q;
    /* renamed from: r */
    private float f39r;
    /* renamed from: s */
    private float f40s;
    /* renamed from: t */
    private float f41t;
    /* renamed from: u */
    private Typeface f42u;
    /* renamed from: v */
    private Typeface f43v;
    /* renamed from: w */
    private Typeface f44w;
    /* renamed from: x */
    private CharSequence f45x;
    /* renamed from: y */
    private CharSequence f46y;
    /* renamed from: z */
    private boolean f47z;

    static {
        if (f3b != null) {
            f3b.setAntiAlias(true);
            f3b.setColor(-65281);
        }
    }

    public aa(View view) {
        this.f24c = view;
        this.f13J = new TextPaint(129);
        this.f28g = new Rect();
        this.f27f = new Rect();
        this.f29h = new RectF();
    }

    /* renamed from: a */
    public void m24a(Interpolator interpolator) {
        this.f15L = interpolator;
        m43i();
    }

    /* renamed from: b */
    public void m33b(Interpolator interpolator) {
        this.f14K = interpolator;
        m43i();
    }

    /* renamed from: a */
    public void m18a(float f) {
        if (this.f32k != f) {
            this.f32k = f;
            m43i();
        }
    }

    /* renamed from: a */
    public void m21a(ColorStateList colorStateList) {
        if (this.f35n != colorStateList) {
            this.f35n = colorStateList;
            m43i();
        }
    }

    /* renamed from: b */
    public void m31b(ColorStateList colorStateList) {
        if (this.f34m != colorStateList) {
            this.f34m = colorStateList;
            m43i();
        }
    }

    /* renamed from: a */
    public void m20a(int i, int i2, int i3, int i4) {
        if (!aa.m4a(this.f27f, i, i2, i3, i4)) {
            this.f27f.set(i, i2, i3, i4);
            this.f12I = true;
            m17a();
        }
    }

    /* renamed from: b */
    public void m30b(int i, int i2, int i3, int i4) {
        if (!aa.m4a(this.f28g, i, i2, i3, i4)) {
            this.f28g.set(i, i2, i3, i4);
            this.f12I = true;
            m17a();
        }
    }

    /* renamed from: a */
    void m17a() {
        boolean z = this.f28g.width() > 0 && this.f28g.height() > 0 && this.f27f.width() > 0 && this.f27f.height() > 0;
        this.f25d = z;
    }

    /* renamed from: a */
    public void m19a(int i) {
        if (this.f30i != i) {
            this.f30i = i;
            m43i();
        }
    }

    /* renamed from: b */
    public int m27b() {
        return this.f30i;
    }

    /* renamed from: b */
    public void m29b(int i) {
        if (this.f31j != i) {
            this.f31j = i;
            m43i();
        }
    }

    /* renamed from: c */
    public int m34c() {
        return this.f31j;
    }

    /* renamed from: c */
    public void m35c(int i) {
        qf a = qf.a(this.f24c.getContext(), i, C5577j.TextAppearance);
        if (a.g(C5577j.TextAppearance_android_textColor)) {
            this.f35n = a.e(C5577j.TextAppearance_android_textColor);
        }
        if (a.g(C5577j.TextAppearance_android_textSize)) {
            this.f33l = (float) a.e(C5577j.TextAppearance_android_textSize, (int) this.f33l);
        }
        this.f19P = a.a(C5577j.TextAppearance_android_shadowColor, 0);
        this.f17N = a.a(C5577j.TextAppearance_android_shadowDx, 0.0f);
        this.f18O = a.a(C5577j.TextAppearance_android_shadowDy, 0.0f);
        this.f16M = a.a(C5577j.TextAppearance_android_shadowRadius, 0.0f);
        a.a();
        if (VERSION.SDK_INT >= 16) {
            this.f42u = m8e(i);
        }
        m43i();
    }

    /* renamed from: d */
    public void m38d(int i) {
        qf a = qf.a(this.f24c.getContext(), i, C5577j.TextAppearance);
        if (a.g(C5577j.TextAppearance_android_textColor)) {
            this.f34m = a.e(C5577j.TextAppearance_android_textColor);
        }
        if (a.g(C5577j.TextAppearance_android_textSize)) {
            this.f32k = (float) a.e(C5577j.TextAppearance_android_textSize, (int) this.f32k);
        }
        this.f23T = a.a(C5577j.TextAppearance_android_shadowColor, 0);
        this.f21R = a.a(C5577j.TextAppearance_android_shadowDx, 0.0f);
        this.f22S = a.a(C5577j.TextAppearance_android_shadowDy, 0.0f);
        this.f20Q = a.a(C5577j.TextAppearance_android_shadowRadius, 0.0f);
        a.a();
        if (VERSION.SDK_INT >= 16) {
            this.f43v = m8e(i);
        }
        m43i();
    }

    /* renamed from: e */
    private Typeface m8e(int i) {
        TypedArray obtainStyledAttributes = this.f24c.getContext().obtainStyledAttributes(i, new int[]{16843692});
        try {
            String string = obtainStyledAttributes.getString(0);
            if (string != null) {
                Typeface create = Typeface.create(string, 0);
                return create;
            }
            obtainStyledAttributes.recycle();
            return null;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: a */
    public void m23a(Typeface typeface) {
        if (this.f42u != typeface) {
            this.f42u = typeface;
            m43i();
        }
    }

    /* renamed from: b */
    public void m32b(Typeface typeface) {
        if (this.f43v != typeface) {
            this.f43v = typeface;
            m43i();
        }
    }

    /* renamed from: c */
    public void m36c(Typeface typeface) {
        this.f43v = typeface;
        this.f42u = typeface;
        m43i();
    }

    /* renamed from: d */
    public Typeface m37d() {
        return this.f42u != null ? this.f42u : Typeface.DEFAULT;
    }

    /* renamed from: e */
    public Typeface m39e() {
        return this.f43v != null ? this.f43v : Typeface.DEFAULT;
    }

    /* renamed from: b */
    public void m28b(float f) {
        float a = ah.m1500a(f, 0.0f, 1.0f);
        if (a != this.f26e) {
            this.f26e = a;
            m11l();
        }
    }

    /* renamed from: a */
    public final boolean m26a(int[] iArr) {
        this.f11H = iArr;
        if (!m40f()) {
            return false;
        }
        m43i();
        return true;
    }

    /* renamed from: f */
    final boolean m40f() {
        return (this.f35n != null && this.f35n.isStateful()) || (this.f34m != null && this.f34m.isStateful());
    }

    /* renamed from: g */
    public float m41g() {
        return this.f26e;
    }

    /* renamed from: h */
    public float m42h() {
        return this.f33l;
    }

    /* renamed from: l */
    private void m11l() {
        m6c(this.f26e);
    }

    /* renamed from: c */
    private void m6c(float f) {
        m7d(f);
        this.f40s = aa.m1a(this.f38q, this.f39r, f, this.f14K);
        this.f41t = aa.m1a(this.f36o, this.f37p, f, this.f14K);
        m9e(aa.m1a(this.f32k, this.f33l, f, this.f15L));
        if (this.f35n != this.f34m) {
            this.f13J.setColor(aa.m2a(m12m(), m13n(), f));
        } else {
            this.f13J.setColor(m13n());
        }
        this.f13J.setShadowLayer(aa.m1a(this.f20Q, this.f16M, f, null), aa.m1a(this.f21R, this.f17N, f, null), aa.m1a(this.f22S, this.f18O, f, null), aa.m2a(this.f23T, this.f19P, f));
        jd.m21228c(this.f24c);
    }

    /* renamed from: m */
    private int m12m() {
        if (this.f11H != null) {
            return this.f34m.getColorForState(this.f11H, 0);
        }
        return this.f34m.getDefaultColor();
    }

    /* renamed from: n */
    private int m13n() {
        if (this.f11H != null) {
            return this.f35n.getColorForState(this.f11H, 0);
        }
        return this.f35n.getDefaultColor();
    }

    /* renamed from: o */
    private void m14o() {
        int i;
        int i2 = 1;
        float f = 0.0f;
        float f2 = this.f10G;
        m10f(this.f33l);
        float measureText = this.f46y != null ? this.f13J.measureText(this.f46y, 0, this.f46y.length()) : 0.0f;
        int i3 = this.f31j;
        if (this.f47z) {
            i = 1;
        } else {
            i = 0;
        }
        i = hz.m21169a(i3, i);
        switch (i & 112) {
            case 48:
                this.f37p = ((float) this.f28g.top) - this.f13J.ascent();
                break;
            case 80:
                this.f37p = (float) this.f28g.bottom;
                break;
            default:
                this.f37p = (((this.f13J.descent() - this.f13J.ascent()) / 2.0f) - this.f13J.descent()) + ((float) this.f28g.centerY());
                break;
        }
        switch (i & 8388615) {
            case 1:
                this.f39r = ((float) this.f28g.centerX()) - (measureText / 2.0f);
                break;
            case 5:
                this.f39r = ((float) this.f28g.right) - measureText;
                break;
            default:
                this.f39r = (float) this.f28g.left;
                break;
        }
        m10f(this.f32k);
        if (this.f46y != null) {
            f = this.f13J.measureText(this.f46y, 0, this.f46y.length());
        }
        int i4 = this.f30i;
        if (!this.f47z) {
            i2 = 0;
        }
        i4 = hz.m21169a(i4, i2);
        switch (i4 & 112) {
            case 48:
                this.f36o = ((float) this.f27f.top) - this.f13J.ascent();
                break;
            case 80:
                this.f36o = (float) this.f27f.bottom;
                break;
            default:
                this.f36o = (((this.f13J.descent() - this.f13J.ascent()) / 2.0f) - this.f13J.descent()) + ((float) this.f27f.centerY());
                break;
        }
        switch (i4 & 8388615) {
            case 1:
                this.f38q = ((float) this.f27f.centerX()) - (f / 2.0f);
                break;
            case 5:
                this.f38q = ((float) this.f27f.right) - f;
                break;
            default:
                this.f38q = (float) this.f27f.left;
                break;
        }
        m16q();
        m9e(f2);
    }

    /* renamed from: d */
    private void m7d(float f) {
        this.f29h.left = aa.m1a((float) this.f27f.left, (float) this.f28g.left, f, this.f14K);
        this.f29h.top = aa.m1a(this.f36o, this.f37p, f, this.f14K);
        this.f29h.right = aa.m1a((float) this.f27f.right, (float) this.f28g.right, f, this.f14K);
        this.f29h.bottom = aa.m1a((float) this.f27f.bottom, (float) this.f28g.bottom, f, this.f14K);
    }

    /* renamed from: a */
    public void m22a(Canvas canvas) {
        int save = canvas.save();
        if (this.f46y != null && this.f25d) {
            float f;
            float f2 = this.f40s;
            float f3 = this.f41t;
            int i = (!this.f4A || this.f5B == null) ? 0 : 1;
            float f4;
            if (i != 0) {
                f = this.f7D * this.f9F;
                f4 = this.f8E * this.f9F;
            } else {
                f = this.f13J.ascent() * this.f9F;
                f4 = this.f13J.descent() * this.f9F;
            }
            if (i != 0) {
                f3 += f;
            }
            if (this.f9F != 1.0f) {
                canvas.scale(this.f9F, this.f9F, f2, f3);
            }
            if (i != 0) {
                canvas.drawBitmap(this.f5B, f2, f3, this.f6C);
            } else {
                canvas.drawText(this.f46y, 0, this.f46y.length(), f2, f3, this.f13J);
            }
        }
        canvas.restoreToCount(save);
    }

    /* renamed from: b */
    private boolean m5b(CharSequence charSequence) {
        int i = 1;
        if (jd.m21241g(this.f24c) != 1) {
            i = 0;
        }
        return (i != 0 ? he.f23765d : he.f23764c).a(charSequence, 0, charSequence.length());
    }

    /* renamed from: e */
    private void m9e(float f) {
        m10f(f);
        boolean z = f2a && this.f9F != 1.0f;
        this.f4A = z;
        if (this.f4A) {
            m15p();
        }
        jd.m21228c(this.f24c);
    }

    /* renamed from: f */
    private void m10f(float f) {
        boolean z = true;
        if (this.f45x != null) {
            float f2;
            boolean z2;
            float width = (float) this.f28g.width();
            float width2 = (float) this.f27f.width();
            if (aa.m3a(f, this.f33l)) {
                f2 = this.f33l;
                this.f9F = 1.0f;
                if (this.f44w != this.f42u) {
                    this.f44w = this.f42u;
                    z2 = true;
                } else {
                    z2 = false;
                }
            } else {
                f2 = this.f32k;
                if (this.f44w != this.f43v) {
                    this.f44w = this.f43v;
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (aa.m3a(f, this.f32k)) {
                    this.f9F = 1.0f;
                } else {
                    this.f9F = f / this.f32k;
                }
                float f3 = this.f33l / this.f32k;
                width = width2 * f3 > width ? Math.min(width / f3, width2) : width2;
            }
            if (width > 0.0f) {
                if (this.f10G != f2 || this.f12I || r0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                this.f10G = f2;
                this.f12I = false;
            }
            if (this.f46y == null || r0) {
                this.f13J.setTextSize(this.f10G);
                this.f13J.setTypeface(this.f44w);
                TextPaint textPaint = this.f13J;
                if (this.f9F == 1.0f) {
                    z = false;
                }
                textPaint.setLinearText(z);
                CharSequence ellipsize = TextUtils.ellipsize(this.f45x, this.f13J, width, TruncateAt.END);
                if (!TextUtils.equals(ellipsize, this.f46y)) {
                    this.f46y = ellipsize;
                    this.f47z = m5b(this.f46y);
                }
            }
        }
    }

    /* renamed from: p */
    private void m15p() {
        if (this.f5B == null && !this.f27f.isEmpty() && !TextUtils.isEmpty(this.f46y)) {
            m6c(0.0f);
            this.f7D = this.f13J.ascent();
            this.f8E = this.f13J.descent();
            int round = Math.round(this.f13J.measureText(this.f46y, 0, this.f46y.length()));
            int round2 = Math.round(this.f8E - this.f7D);
            if (round > 0 && round2 > 0) {
                this.f5B = Bitmap.createBitmap(round, round2, Config.ARGB_8888);
                new Canvas(this.f5B).drawText(this.f46y, 0, this.f46y.length(), 0.0f, ((float) round2) - this.f13J.descent(), this.f13J);
                if (this.f6C == null) {
                    this.f6C = new Paint(3);
                }
            }
        }
    }

    /* renamed from: i */
    public void m43i() {
        if (this.f24c.getHeight() > 0 && this.f24c.getWidth() > 0) {
            m14o();
            m11l();
        }
    }

    /* renamed from: a */
    public void m25a(CharSequence charSequence) {
        if (charSequence == null || !charSequence.equals(this.f45x)) {
            this.f45x = charSequence;
            this.f46y = null;
            m16q();
            m43i();
        }
    }

    /* renamed from: j */
    public CharSequence m44j() {
        return this.f45x;
    }

    /* renamed from: q */
    private void m16q() {
        if (this.f5B != null) {
            this.f5B.recycle();
            this.f5B = null;
        }
    }

    /* renamed from: a */
    private static boolean m3a(float f, float f2) {
        return Math.abs(f - f2) < 0.001f;
    }

    /* renamed from: k */
    public ColorStateList m45k() {
        return this.f35n;
    }

    /* renamed from: a */
    private static int m2a(int i, int i2, float f) {
        float f2 = 1.0f - f;
        return Color.argb((int) ((((float) Color.alpha(i)) * f2) + (((float) Color.alpha(i2)) * f)), (int) ((((float) Color.red(i)) * f2) + (((float) Color.red(i2)) * f)), (int) ((((float) Color.green(i)) * f2) + (((float) Color.green(i2)) * f)), (int) ((f2 * ((float) Color.blue(i))) + (((float) Color.blue(i2)) * f)));
    }

    /* renamed from: a */
    private static float m1a(float f, float f2, float f3, Interpolator interpolator) {
        if (interpolator != null) {
            f3 = interpolator.getInterpolation(f3);
        }
        return C5775v.a(f, f2, f3);
    }

    /* renamed from: a */
    private static boolean m4a(Rect rect, int i, int i2, int i3, int i4) {
        return rect.left == i && rect.top == i2 && rect.right == i3 && rect.bottom == i4;
    }
}
