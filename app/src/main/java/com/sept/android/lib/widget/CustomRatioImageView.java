package com.sept.android.lib.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;

public class CustomRatioImageView extends ImageView {
    /* renamed from: a */
    private boolean f19420a = false;
    /* renamed from: b */
    private int f19421b = 0;
    /* renamed from: c */
    private int f19422c = 0;
    /* renamed from: d */
    private boolean f19423d;

    public CustomRatioImageView(Context context) {
        super(context);
        m23816a();
    }

    public CustomRatioImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m23816a();
    }

    public CustomRatioImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m23816a();
    }

    /* renamed from: a */
    private void m23816a() {
        setScaleType(ScaleType.FIT_XY);
    }

    public void setDimension(int i, int i2) {
        this.f19421b = i;
        this.f19422c = i2;
    }

    public void setBoundedHeight(boolean z) {
        this.f19423d = z;
    }

    protected void onMeasure(int i, int i2) {
        if (this.f19421b == 0 || this.f19422c == 0) {
            super.onMeasure(i, i2);
            return;
        }
        float f = (((float) this.f19422c) * 1.0f) / ((float) this.f19421b);
        int size = MeasureSpec.getSize(i);
        int i3 = (int) (((float) size) * f);
        if (!this.f19423d || i3 <= size) {
            int i4 = i3;
            i3 = size;
            size = i4;
        } else {
            i3 = (int) (((float) size) / f);
        }
        setMeasuredDimension(i3, size);
    }
}
