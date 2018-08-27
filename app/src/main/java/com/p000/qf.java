package com.p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;

/* compiled from: TintTypedArray */
/* renamed from: qf */
public class qf {
    /* renamed from: a */
    private final Context f25201a;
    /* renamed from: b */
    private final TypedArray f25202b;

    /* renamed from: a */
    public static qf m33776a(Context context, AttributeSet attributeSet, int[] iArr) {
        return new qf(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    /* renamed from: a */
    public static qf m33777a(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2) {
        return new qf(context, context.obtainStyledAttributes(attributeSet, iArr, i, i2));
    }

    /* renamed from: a */
    public static qf m33775a(Context context, int i, int[] iArr) {
        return new qf(context, context.obtainStyledAttributes(i, iArr));
    }

    private qf(Context context, TypedArray typedArray) {
        this.f25201a = context;
        this.f25202b = typedArray;
    }

    /* renamed from: a */
    public Drawable m33780a(int i) {
        if (this.f25202b.hasValue(i)) {
            int resourceId = this.f25202b.getResourceId(i, 0);
            if (resourceId != 0) {
                return na.m32939b(this.f25201a, resourceId);
            }
        }
        return this.f25202b.getDrawable(i);
    }

    /* renamed from: b */
    public Drawable m33784b(int i) {
        if (this.f25202b.hasValue(i)) {
            int resourceId = this.f25202b.getResourceId(i, 0);
            if (resourceId != 0) {
                return ot.m33355a().m33374a(this.f25201a, resourceId, true);
            }
        }
        return null;
    }

    /* renamed from: c */
    public CharSequence m33786c(int i) {
        return this.f25202b.getText(i);
    }

    /* renamed from: d */
    public String m33788d(int i) {
        return this.f25202b.getString(i);
    }

    /* renamed from: a */
    public boolean m33782a(int i, boolean z) {
        return this.f25202b.getBoolean(i, z);
    }

    /* renamed from: a */
    public int m33779a(int i, int i2) {
        return this.f25202b.getInt(i, i2);
    }

    /* renamed from: a */
    public float m33778a(int i, float f) {
        return this.f25202b.getFloat(i, f);
    }

    /* renamed from: b */
    public int m33783b(int i, int i2) {
        return this.f25202b.getColor(i, i2);
    }

    /* renamed from: e */
    public ColorStateList m33790e(int i) {
        if (this.f25202b.hasValue(i)) {
            int resourceId = this.f25202b.getResourceId(i, 0);
            if (resourceId != 0) {
                ColorStateList a = na.m32936a(this.f25201a, resourceId);
                if (a != null) {
                    return a;
                }
            }
        }
        return this.f25202b.getColorStateList(i);
    }

    /* renamed from: c */
    public int m33785c(int i, int i2) {
        return this.f25202b.getInteger(i, i2);
    }

    /* renamed from: d */
    public int m33787d(int i, int i2) {
        return this.f25202b.getDimensionPixelOffset(i, i2);
    }

    /* renamed from: e */
    public int m33789e(int i, int i2) {
        return this.f25202b.getDimensionPixelSize(i, i2);
    }

    /* renamed from: f */
    public int m33791f(int i, int i2) {
        return this.f25202b.getLayoutDimension(i, i2);
    }

    /* renamed from: g */
    public int m33793g(int i, int i2) {
        return this.f25202b.getResourceId(i, i2);
    }

    /* renamed from: f */
    public CharSequence[] m33792f(int i) {
        return this.f25202b.getTextArray(i);
    }

    /* renamed from: g */
    public boolean m33794g(int i) {
        return this.f25202b.hasValue(i);
    }

    /* renamed from: a */
    public void m33781a() {
        this.f25202b.recycle();
    }
}
