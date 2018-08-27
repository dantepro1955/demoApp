package com.sept.android.lib.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.EditText;

public class CustomSquareEditTextView extends EditText {
    /* renamed from: a */
    private boolean f19428a = false;
    /* renamed from: b */
    private int f19429b = 0;
    /* renamed from: c */
    private int f19430c = 0;

    public CustomSquareEditTextView(Context context) {
        super(context);
        m23818a();
    }

    public CustomSquareEditTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m23818a();
    }

    public CustomSquareEditTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m23818a();
    }

    /* renamed from: a */
    private void m23818a() {
    }

    public void setDimension(int i, int i2) {
        this.f19429b = i;
        this.f19430c = i2;
    }

    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        setMinHeight(measuredWidth);
        setMinWidth(measuredWidth);
    }
}
