package com.sept.android.lib.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.widget.ImageView.ScaleType;
import com.sept.android.lib.widget.aiv.AsyncImageView;

public class CustomRatioAsyncImageView extends AsyncImageView {
    /* renamed from: a */
    private boolean f19416a = false;
    /* renamed from: b */
    private int f19417b = 0;
    /* renamed from: c */
    private int f19418c = 0;
    /* renamed from: d */
    private boolean f19419d;

    public CustomRatioAsyncImageView(Context context) {
        super(context);
        m23815a();
    }

    public CustomRatioAsyncImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m23815a();
    }

    public CustomRatioAsyncImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m23815a();
    }

    /* renamed from: a */
    private void m23815a() {
        setScaleType(ScaleType.FIT_XY);
    }

    public void setDimension(int i, int i2) {
        this.f19417b = i;
        this.f19418c = i2;
    }

    public void setBoundedHeight(boolean z) {
        this.f19419d = z;
    }

    protected void onMeasure(int i, int i2) {
        if (this.f19417b == 0 || this.f19418c == 0) {
            super.onMeasure(i, i2);
            return;
        }
        float f = (((float) this.f19418c) * 1.0f) / ((float) this.f19417b);
        int size = MeasureSpec.getSize(i);
        int i3 = (int) (((float) size) * f);
        if (!this.f19419d || i3 <= size) {
            int i4 = i3;
            i3 = size;
            size = i4;
        } else {
            i3 = (int) (((float) size) / f);
        }
        setMeasuredDimension(i3, size);
    }
}
