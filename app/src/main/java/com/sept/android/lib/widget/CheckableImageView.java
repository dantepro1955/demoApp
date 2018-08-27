package com.sept.android.lib.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Checkable;
import android.widget.ImageView;

public class CheckableImageView extends ImageView implements Checkable {
    /* renamed from: b */
    private static final int[] f19410b = new int[]{16842912};
    /* renamed from: a */
    private boolean f19411a;

    public CheckableImageView(Context context) {
        super(context, null);
    }

    public CheckableImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (isChecked()) {
            mergeDrawableStates(onCreateDrawableState, f19410b);
        }
        return onCreateDrawableState;
    }

    public void toggle() {
        setChecked(!this.f19411a);
    }

    public boolean isChecked() {
        return this.f19411a;
    }

    public void setChecked(boolean z) {
        if (this.f19411a != z) {
            this.f19411a = z;
            refreshDrawableState();
        }
    }
}
