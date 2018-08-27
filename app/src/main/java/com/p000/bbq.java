package com.p000;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import java.util.List;

@bhd
/* renamed from: bbq */
public class bbq {
    /* renamed from: a */
    static final int f5462a = f5465d;
    /* renamed from: b */
    static final int f5463b = f5464c;
    /* renamed from: c */
    private static final int f5464c = Color.rgb(12, 174, 206);
    /* renamed from: d */
    private static final int f5465d = Color.rgb(204, 204, 204);
    /* renamed from: e */
    private final String f5466e;
    /* renamed from: f */
    private final List<Drawable> f5467f;
    /* renamed from: g */
    private final int f5468g;
    /* renamed from: h */
    private final int f5469h;
    /* renamed from: i */
    private final int f5470i;
    /* renamed from: j */
    private final int f5471j;
    /* renamed from: k */
    private final int f5472k;
    /* renamed from: l */
    private final boolean f5473l;

    public bbq(String str, List<Drawable> list, Integer num, Integer num2, Integer num3, int i, int i2, boolean z) {
        this.f5466e = str;
        this.f5467f = list;
        this.f5468g = num != null ? num.intValue() : f5462a;
        this.f5469h = num2 != null ? num2.intValue() : f5463b;
        this.f5470i = num3 != null ? num3.intValue() : 12;
        this.f5471j = i;
        this.f5472k = i2;
        this.f5473l = z;
    }

    /* renamed from: a */
    public String m7197a() {
        return this.f5466e;
    }

    /* renamed from: b */
    public List<Drawable> m7198b() {
        return this.f5467f;
    }

    /* renamed from: c */
    public int m7199c() {
        return this.f5468g;
    }

    /* renamed from: d */
    public int m7200d() {
        return this.f5469h;
    }

    /* renamed from: e */
    public int m7201e() {
        return this.f5470i;
    }

    /* renamed from: f */
    public int m7202f() {
        return this.f5471j;
    }

    /* renamed from: g */
    public int m7203g() {
        return this.f5472k;
    }

    /* renamed from: h */
    public boolean m7204h() {
        return this.f5473l;
    }
}
