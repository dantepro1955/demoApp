package com.sept.android.lib.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ScrollView;

public class LockableScrollView extends ScrollView {
    /* renamed from: a */
    private boolean f19473a = true;

    public LockableScrollView(Context context) {
        super(context);
    }

    public LockableScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LockableScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void setScrollingEnabled(boolean z) {
        this.f19473a = z;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (motionEvent.getAction()) {
            case 0:
                if (this.f19473a) {
                    return super.onTouchEvent(motionEvent);
                }
                return this.f19473a;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f19473a) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return false;
    }
}
