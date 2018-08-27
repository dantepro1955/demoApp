package com.p000;

/* compiled from: ZoomConfig */
/* renamed from: dmf */
public class dmf {
    /* renamed from: a */
    float f22165a;
    /* renamed from: b */
    float f22166b;
    /* renamed from: c */
    float f22167c;
    /* renamed from: d */
    float f22168d;
    /* renamed from: e */
    float f22169e;
    /* renamed from: f */
    float f22170f;
    /* renamed from: g */
    float f22171g;

    /* renamed from: a */
    public void m27964a(int i, int i2, int i3, int i4, int i5) {
        float f = (((float) i) * 1.0f) / ((float) i3);
        float f2 = (((float) i2) * 1.0f) / ((float) i4);
        this.f22171g = f;
        if (i5 == 1) {
            if (i3 >= i4) {
                this.f22167c = Math.min(2.0f, f2);
            } else {
                this.f22167c = Math.min(2.0f, f);
            }
            this.f22168d = Math.min(1.0f, f);
            this.f22165a = Math.max(f * 2.0f, this.f22167c * 2.0f);
            this.f22166b = f;
        } else {
            this.f22167c = f;
            this.f22168d = this.f22167c;
            this.f22165a = Math.max(f * 2.0f, this.f22167c * 2.0f);
            this.f22166b = this.f22165a;
        }
        this.f22169e = this.f22168d * 0.6f;
        this.f22170f = (this.f22167c + this.f22166b) / 2.0f;
    }
}
