package com.p000;

import android.view.View;

/* compiled from: ViewOffsetHelper */
/* renamed from: as */
public class as {
    /* renamed from: a */
    private final View f4190a;
    /* renamed from: b */
    private int f4191b;
    /* renamed from: c */
    private int f4192c;
    /* renamed from: d */
    private int f4193d;
    /* renamed from: e */
    private int f4194e;

    public as(View view) {
        this.f4190a = view;
    }

    /* renamed from: a */
    public void m5381a() {
        this.f4191b = this.f4190a.getTop();
        this.f4192c = this.f4190a.getLeft();
        m5380d();
    }

    /* renamed from: d */
    private void m5380d() {
        jd.m21237e(this.f4190a, this.f4193d - (this.f4190a.getTop() - this.f4191b));
        jd.m21240f(this.f4190a, this.f4194e - (this.f4190a.getLeft() - this.f4192c));
    }

    /* renamed from: a */
    public boolean m5382a(int i) {
        if (this.f4193d == i) {
            return false;
        }
        this.f4193d = i;
        m5380d();
        return true;
    }

    /* renamed from: b */
    public boolean m5384b(int i) {
        if (this.f4194e == i) {
            return false;
        }
        this.f4194e = i;
        m5380d();
        return true;
    }

    /* renamed from: b */
    public int m5383b() {
        return this.f4193d;
    }

    /* renamed from: c */
    public int m5385c() {
        return this.f4191b;
    }
}
