package com.sept.android.lib.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

public class CustomFullTextSquareTextView extends TextView {
    /* renamed from: a */
    private boolean f19412a = false;
    /* renamed from: b */
    private int f19413b = 0;
    /* renamed from: c */
    private int f19414c = 0;
    /* renamed from: d */
    private boolean f19415d;

    public CustomFullTextSquareTextView(Context context) {
        super(context);
        m23814a();
    }

    public CustomFullTextSquareTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m23814a();
    }

    public CustomFullTextSquareTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m23814a();
    }

    /* renamed from: a */
    private void m23814a() {
    }

    public void setDimension(int i, int i2) {
        this.f19413b = i;
        this.f19414c = i2;
    }

    public void setBoundedHeight(boolean z) {
        this.f19415d = z;
    }

    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        setMinHeight(measuredWidth);
        setMinWidth(measuredWidth);
    }
}
