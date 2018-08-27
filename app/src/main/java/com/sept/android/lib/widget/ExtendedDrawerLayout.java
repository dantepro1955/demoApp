package com.sept.android.lib.widget;

import android.content.Context;
import android.support.v4.widget.DrawerLayout;
import android.util.AttributeSet;
import android.view.MotionEvent;

public class ExtendedDrawerLayout extends DrawerLayout {
    /* renamed from: d */
    private float f19462d;
    /* renamed from: e */
    private float f19463e;
    /* renamed from: f */
    private float f19464f;
    /* renamed from: g */
    private float f19465g;

    public ExtendedDrawerLayout(Context context) {
        super(context);
    }

    public ExtendedDrawerLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ExtendedDrawerLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        switch (motionEvent.getAction()) {
            case 0:
                this.f19463e = 0.0f;
                this.f19462d = 0.0f;
                this.f19464f = motionEvent.getX();
                this.f19465g = motionEvent.getY();
                break;
            case 2:
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                this.f19462d += Math.abs(x - this.f19464f);
                this.f19463e += Math.abs(y - this.f19465g);
                this.f19464f = x;
                this.f19465g = y;
                if (this.f19463e > this.f19462d) {
                    return false;
                }
                break;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }
}
