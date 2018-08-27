package com.sept.android.lib.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import p000.dkb;

public class FixedRatioRelativeLayout extends RelativeLayout {
    /* renamed from: a */
    dkb f19468a;

    public FixedRatioRelativeLayout(Context context) {
        super(context);
        m23843a(context, null);
    }

    public FixedRatioRelativeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m23843a(context, attributeSet);
    }

    public FixedRatioRelativeLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m23843a(context, attributeSet);
    }

    /* renamed from: a */
    private void m23843a(Context context, AttributeSet attributeSet) {
        this.f19468a = new dkb(this);
        this.f19468a.m27662a(context, attributeSet);
    }

    public void setRatio(float f) {
        this.f19468a.m27661a(f);
    }

    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, this.f19468a.m27660a(i, i2));
    }
}
