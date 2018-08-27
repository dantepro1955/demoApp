package com.sept.android.lib.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;

public class CustomSquareImageView extends ImageView {
    public CustomSquareImageView(Context context) {
        super(context);
        m23819a();
    }

    public CustomSquareImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m23819a();
    }

    public CustomSquareImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m23819a();
    }

    /* renamed from: a */
    private void m23819a() {
        setPadding(0, 0, 0, 0);
    }

    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        setMeasuredDimension(measuredWidth, measuredWidth);
    }
}
