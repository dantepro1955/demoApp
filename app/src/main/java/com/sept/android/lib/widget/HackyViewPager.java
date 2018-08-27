package com.sept.android.lib.widget;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;

public class HackyViewPager extends ViewPager {
    /* renamed from: a */
    private boolean f19469a = true;

    public HackyViewPager(Context context) {
        super(context);
    }

    public HackyViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void setPagingEnabled(boolean z) {
        this.f19469a = z;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z = false;
        try {
            if (this.f19469a) {
                z = super.onTouchEvent(motionEvent);
            }
        } catch (Exception e) {
        }
        return z;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z = false;
        try {
            if (this.f19469a) {
                z = super.onInterceptTouchEvent(motionEvent);
            }
        } catch (Exception e) {
        }
        return z;
    }
}
