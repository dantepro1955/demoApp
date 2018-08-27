package com.sept.android.lib.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;

public class CustomSquareRelativeLayoutView extends RelativeLayout {
    /* renamed from: a */
    private boolean f19431a = false;
    /* renamed from: b */
    private int f19432b = 0;
    /* renamed from: c */
    private int f19433c = 0;

    public CustomSquareRelativeLayoutView(Context context) {
        super(context);
        m23820a();
    }

    public CustomSquareRelativeLayoutView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m23820a();
    }

    public CustomSquareRelativeLayoutView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m23820a();
    }

    /* renamed from: a */
    private void m23820a() {
    }

    public void setDimension(int i, int i2) {
        this.f19432b = i;
        this.f19433c = i2;
    }

    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        setMinimumHeight(measuredWidth);
        setMinimumWidth(measuredWidth);
    }
}
