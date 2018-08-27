package com.sept.android.lib.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageButton;
import p000.dnb.C4999b;

public class HighlightableImageButton extends ImageButton {
    /* renamed from: a */
    private static final int[] f19470a = new int[]{C4999b.state_highlighted};
    /* renamed from: b */
    private boolean f19471b = false;

    public HighlightableImageButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public HighlightableImageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public HighlightableImageButton(Context context) {
        super(context);
    }

    public int[] onCreateDrawableState(int i) {
        if (!this.f19471b) {
            return super.onCreateDrawableState(i);
        }
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        mergeDrawableStates(onCreateDrawableState, f19470a);
        return onCreateDrawableState;
    }

    public void setHighlighted(boolean z) {
        if (this.f19471b != z) {
            this.f19471b = z;
            refreshDrawableState();
        }
    }
}
