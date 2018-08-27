package com.sept.android.lib.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

public class CustomSquareView extends View {
    public CustomSquareView(Context context) {
        super(context);
        m23824a();
    }

    public CustomSquareView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m23824a();
    }

    public CustomSquareView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m23824a();
    }

    /* renamed from: a */
    private void m23824a() {
        setPadding(0, 0, 0, 0);
    }

    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        setMeasuredDimension(measuredWidth, measuredWidth);
    }
}
