package com.p000;

import android.content.Context;

/* compiled from: AbstractDefaultActionItem */
/* renamed from: dic */
public abstract class dic extends dhx {
    /* renamed from: a */
    private int f21683a;
    /* renamed from: b */
    private int f21684b;

    public dic(Context context, int i, int i2) {
        this.f21683a = i;
        this.f21684b = i2;
        m27344a(context.getString(m27353d()));
    }

    /* renamed from: b */
    public void mo4416b(Context context) {
        super.mo4416b(context);
        m27343a(context.getResources().getDrawable(m27354e()));
    }

    /* renamed from: d */
    public int m27353d() {
        return this.f21683a;
    }

    /* renamed from: e */
    public int m27354e() {
        return this.f21684b;
    }
}
