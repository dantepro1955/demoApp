package com.sept.android.lib.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import p000.dkb;

public class FixedRatioFrameLayout extends FrameLayout {
    /* renamed from: a */
    dkb f19466a;

    public FixedRatioFrameLayout(Context context) {
        super(context);
        m23841a(context, null);
    }

    public FixedRatioFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m23841a(context, attributeSet);
    }

    public FixedRatioFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m23841a(context, attributeSet);
    }

    /* renamed from: a */
    private void m23841a(Context context, AttributeSet attributeSet) {
        this.f19466a = new dkb(this);
        this.f19466a.m27662a(context, attributeSet);
    }

    public void setRatio(float f) {
        this.f19466a.m27661a(f);
    }

    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, this.f19466a.m27660a(i, i2));
    }
}
