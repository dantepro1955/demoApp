package com.sept.android.lib.widget;

import android.content.Context;
import android.util.AttributeSet;
import com.makeramen.roundedimageview.RoundedImageView;

public class CustomSquareRoundedImageView extends RoundedImageView {
    public CustomSquareRoundedImageView(Context context) {
        super(context);
        m23821a();
    }

    public CustomSquareRoundedImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m23821a();
    }

    public CustomSquareRoundedImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m23821a();
    }

    /* renamed from: a */
    private void m23821a() {
        setPadding(0, 0, 0, 0);
    }

    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        setMeasuredDimension(measuredWidth, measuredWidth);
    }
}
