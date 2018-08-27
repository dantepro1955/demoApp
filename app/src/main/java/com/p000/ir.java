package com.p000;

import android.view.View;
import android.view.ViewParent;

/* compiled from: NestedScrollingChildHelper */
/* renamed from: ir */
public class ir {
    /* renamed from: a */
    private final View f24266a;
    /* renamed from: b */
    private ViewParent f24267b;
    /* renamed from: c */
    private boolean f24268c;
    /* renamed from: d */
    private int[] f24269d;

    public ir(View view) {
        this.f24266a = view;
    }

    /* renamed from: a */
    public void m31402a(boolean z) {
        if (this.f24268c) {
            jd.G(this.f24266a);
        }
        this.f24268c = z;
    }

    /* renamed from: a */
    public boolean m31403a() {
        return this.f24268c;
    }

    /* renamed from: b */
    public boolean m31409b() {
        return this.f24267b != null;
    }

    /* renamed from: a */
    public boolean m31406a(int i) {
        if (m31409b()) {
            return true;
        }
        if (m31403a()) {
            View view = this.f24266a;
            for (ViewParent parent = this.f24266a.getParent(); parent != null; parent = parent.getParent()) {
                if (js.m31796a(parent, view, this.f24266a, i)) {
                    this.f24267b = parent;
                    js.m31797b(parent, view, this.f24266a, i);
                    return true;
                }
                if (parent instanceof View) {
                    view = (View) parent;
                }
            }
        }
        return false;
    }

    /* renamed from: c */
    public void m31410c() {
        if (this.f24267b != null) {
            js.m31791a(this.f24267b, this.f24266a);
            this.f24267b = null;
        }
    }

    /* renamed from: a */
    public boolean m31407a(int i, int i2, int i3, int i4, int[] iArr) {
        if (!m31403a() || this.f24267b == null) {
            return false;
        }
        if (i != 0 || i2 != 0 || i3 != 0 || i4 != 0) {
            int i5;
            int i6;
            if (iArr != null) {
                this.f24266a.getLocationInWindow(iArr);
                int i7 = iArr[0];
                i5 = iArr[1];
                i6 = i7;
            } else {
                i5 = 0;
                i6 = 0;
            }
            js.m31792a(this.f24267b, this.f24266a, i, i2, i3, i4);
            if (iArr != null) {
                this.f24266a.getLocationInWindow(iArr);
                iArr[0] = iArr[0] - i6;
                iArr[1] = iArr[1] - i5;
            }
            return true;
        } else if (iArr == null) {
            return false;
        } else {
            iArr[0] = 0;
            iArr[1] = 0;
            return false;
        }
    }

    /* renamed from: a */
    public boolean m31408a(int i, int i2, int[] iArr, int[] iArr2) {
        if (!m31403a() || this.f24267b == null) {
            return false;
        }
        if (i != 0 || i2 != 0) {
            int i3;
            int i4;
            if (iArr2 != null) {
                this.f24266a.getLocationInWindow(iArr2);
                i3 = iArr2[0];
                i4 = iArr2[1];
            } else {
                i4 = 0;
                i3 = 0;
            }
            if (iArr == null) {
                if (this.f24269d == null) {
                    this.f24269d = new int[2];
                }
                iArr = this.f24269d;
            }
            iArr[0] = 0;
            iArr[1] = 0;
            js.m31793a(this.f24267b, this.f24266a, i, i2, iArr);
            if (iArr2 != null) {
                this.f24266a.getLocationInWindow(iArr2);
                iArr2[0] = iArr2[0] - i3;
                iArr2[1] = iArr2[1] - i4;
            }
            if (iArr[0] == 0 && iArr[1] == 0) {
                return false;
            }
            return true;
        } else if (iArr2 == null) {
            return false;
        } else {
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
    }

    /* renamed from: a */
    public boolean m31405a(float f, float f2, boolean z) {
        if (!m31403a() || this.f24267b == null) {
            return false;
        }
        return js.m31795a(this.f24267b, this.f24266a, f, f2, z);
    }

    /* renamed from: a */
    public boolean m31404a(float f, float f2) {
        if (!m31403a() || this.f24267b == null) {
            return false;
        }
        return js.m31794a(this.f24267b, this.f24266a, f, f2);
    }
}
