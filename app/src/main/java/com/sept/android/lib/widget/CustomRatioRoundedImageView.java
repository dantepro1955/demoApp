package com.sept.android.lib.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import com.makeramen.roundedimageview.RoundedImageView;

public class CustomRatioRoundedImageView extends RoundedImageView {
    /* renamed from: c */
    private boolean f19424c = false;
    /* renamed from: d */
    private int f19425d = 0;
    /* renamed from: e */
    private int f19426e = 0;
    /* renamed from: f */
    private boolean f19427f;

    public CustomRatioRoundedImageView(Context context) {
        super(context);
        m23817a();
    }

    public CustomRatioRoundedImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m23817a();
    }

    public CustomRatioRoundedImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m23817a();
    }

    /* renamed from: a */
    private void m23817a() {
    }

    public void setDimension(int i, int i2) {
        this.f19425d = i;
        this.f19426e = i2;
    }

    public void setBoundedHeight(boolean z) {
        this.f19427f = z;
    }

    protected void onMeasure(int i, int i2) {
        if (this.f19425d == 0 || this.f19426e == 0) {
            super.onMeasure(i, i2);
            return;
        }
        float f = (((float) this.f19426e) * 1.0f) / ((float) this.f19425d);
        int size = MeasureSpec.getSize(i);
        int i3 = (int) (((float) size) * f);
        if (!this.f19427f || i3 <= size) {
            int i4 = i3;
            i3 = size;
            size = i4;
        } else {
            i3 = (int) (((float) size) / f);
        }
        setMeasuredDimension(i3, size);
    }
}
