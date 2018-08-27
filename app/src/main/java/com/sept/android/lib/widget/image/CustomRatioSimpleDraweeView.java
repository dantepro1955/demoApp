package com.sept.android.lib.widget.image;

import android.content.Context;
import android.util.AttributeSet;

import com.facebook.drawee.view.SimpleDraweeView;

public class CustomRatioSimpleDraweeView extends SimpleDraweeView {
    /* renamed from: a */
    private int widthMeasure = 0;
    /* renamed from: b */
    private int heightMeasure = 0;
    /* renamed from: c */
    private boolean isNotSwitch;

    public CustomRatioSimpleDraweeView(Context context) {
        super(context);
    }

    public CustomRatioSimpleDraweeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CustomRatioSimpleDraweeView(Context context, AttributeSet attributeSet, int defStyle) {
        super(context, attributeSet, defStyle);
    }

    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (this.widthMeasure == 0 || this.heightMeasure == 0) {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            return;
        }
        float ratio = (((float) this.heightMeasure) * 1.0f) / ((float) this.widthMeasure);
        int size = MeasureSpec.getSize(widthMeasureSpec);
        int new_width = (int) (((float) size) * ratio);
        if (!this.isNotSwitch || new_width <= size) {
            int i4 = new_width;
            new_width = size;
            size = i4;
        } else {
            new_width = (int) (((float) size) / ratio);
        }
        setMeasuredDimension(new_width, size);
    }

    public void setDimension(int widthMeasureSpec, int heightMeasureSpec) {
        this.widthMeasure = widthMeasureSpec;
        this.heightMeasure = heightMeasureSpec;
    }
}
