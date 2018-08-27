package com.sept.android.lib.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import p000.dkb;

public class FixedRatioLinearLayout extends LinearLayout {
    /* renamed from: a */
    dkb f19467a;

    public FixedRatioLinearLayout(Context context) {
        super(context);
        m23842a(context, null);
    }

    public FixedRatioLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m23842a(context, attributeSet);
    }

    /* renamed from: a */
    private void m23842a(Context context, AttributeSet attributeSet) {
        this.f19467a = new dkb(this);
        this.f19467a.m27662a(context, attributeSet);
    }

    public void setRatio(float f) {
        this.f19467a.m27661a(f);
    }

    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, this.f19467a.m27660a(i, i2));
    }
}
