package com.sept.android.lib.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;

public class OneDirectionViewPager extends HackyViewPager {
    /* renamed from: a */
    float f19474a;
    /* renamed from: b */
    int f19475b;

    public OneDirectionViewPager(Context context) {
        super(context);
    }

    public OneDirectionViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!super.onInterceptTouchEvent(motionEvent)) {
            return false;
        }
        switch (motionEvent.getAction() & 255) {
            case 0:
                this.f19474a = motionEvent.getX();
                return true;
            case 2:
                float x = motionEvent.getX() - this.f19474a;
                if (x > 0.0f) {
                    this.f19475b = 1;
                }
                if (x >= 0.0f) {
                    return true;
                }
                this.f19475b = 2;
                return true;
            default:
                return true;
        }
    }
}
