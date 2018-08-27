package com.p000;

import android.content.Context;
import com.facebook.drawee.generic.GenericDraweeHierarchyBuilder;

@Deprecated
/* renamed from: acy */
public final class acy {
    /* renamed from: a */
    public static final acy f420a = new acy(-1, -2, "mb");
    /* renamed from: b */
    public static final acy f421b = new acy(320, 50, "mb");
    /* renamed from: c */
    public static final acy f422c = new acy(GenericDraweeHierarchyBuilder.DEFAULT_FADE_DURATION, 250, "as");
    /* renamed from: d */
    public static final acy f423d = new acy(468, 60, "as");
    /* renamed from: e */
    public static final acy f424e = new acy(728, 90, "as");
    /* renamed from: f */
    public static final acy f425f = new acy(160, 600, "as");
    /* renamed from: g */
    private final ahw f426g;

    public acy(int i, int i2) {
        this(new ahw(i, i2));
    }

    private acy(int i, int i2, String str) {
        this(new ahw(i, i2));
    }

    public acy(ahw ahw) {
        this.f426g = ahw;
    }

    /* renamed from: a */
    public int m508a() {
        return this.f426g.m1628b();
    }

    /* renamed from: a */
    public int m509a(Context context) {
        return this.f426g.m1629b(context);
    }

    /* renamed from: a */
    public acy m510a(acy... acyArr) {
        acy acy = null;
        if (acyArr != null) {
            float f = 0.0f;
            int a = m508a();
            int b = m512b();
            int length = acyArr.length;
            int i = 0;
            while (i < length) {
                float f2;
                acy acy2;
                acy acy3 = acyArr[i];
                int a2 = acy3.m508a();
                int b2 = acy3.m512b();
                if (m511a(a2, b2)) {
                    f2 = ((float) (a2 * b2)) / ((float) (a * b));
                    if (f2 > 1.0f) {
                        f2 = 1.0f / f2;
                    }
                    if (f2 > f) {
                        acy2 = acy3;
                        i++;
                        acy = acy2;
                        f = f2;
                    }
                }
                f2 = f;
                acy2 = acy;
                i++;
                acy = acy2;
                f = f2;
            }
        }
        return acy;
    }

    /* renamed from: a */
    public boolean m511a(int i, int i2) {
        int a = m508a();
        int b = m512b();
        return ((float) i) <= ((float) a) * 1.25f && ((float) i) >= ((float) a) * 0.8f && ((float) i2) <= ((float) b) * 1.25f && ((float) i2) >= ((float) b) * 0.8f;
    }

    /* renamed from: b */
    public int m512b() {
        return this.f426g.m1626a();
    }

    /* renamed from: b */
    public int m513b(Context context) {
        return this.f426g.m1627a(context);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof acy)) {
            return false;
        }
        return this.f426g.equals(((acy) obj).f426g);
    }

    public int hashCode() {
        return this.f426g.hashCode();
    }

    public String toString() {
        return this.f426g.toString();
    }
}
