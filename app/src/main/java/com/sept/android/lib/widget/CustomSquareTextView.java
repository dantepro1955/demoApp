package com.sept.android.lib.widget;

import android.content.Context;
import android.graphics.Typeface;
import android.text.Layout.Alignment;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.widget.TextView;

public class CustomSquareTextView extends TextView {
    /* renamed from: b */
    private static int f19434b = 0;
    /* renamed from: a */
    private boolean f19435a = false;

    public CustomSquareTextView(Context context) {
        super(context);
        m23822a();
    }

    public CustomSquareTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m23822a();
    }

    public CustomSquareTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m23822a();
    }

    /* renamed from: a */
    private void m23822a() {
    }

    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        if (f19434b != 0 || getMeasuredWidth() <= 0) {
            setMaxLines(f19434b);
        } else {
            f19434b = m23823a(getPaint(), getTypeface(), getMeasuredWidth());
            setMaxLines(f19434b);
        }
        setMeasuredDimension(measuredWidth, measuredWidth);
    }

    /* renamed from: a */
    public int m23823a(TextPaint textPaint, Typeface typeface, int i) {
        TextPaint textPaint2 = new TextPaint();
        textPaint2.set(textPaint);
        textPaint2.setTextSize(getTextSize());
        textPaint2.setTypeface(typeface);
        int height = i / new StaticLayout("a", textPaint2, i, Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false).getHeight();
        if (height > 2) {
            return height - 2;
        }
        return height;
    }
}
