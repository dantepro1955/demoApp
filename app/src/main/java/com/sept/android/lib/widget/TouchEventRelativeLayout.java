package com.sept.android.lib.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

public class TouchEventRelativeLayout extends RelativeLayout {
    /* renamed from: a */
    private C4443a f19525a;

    /* renamed from: com.sept.android.lib.widget.TouchEventRelativeLayout$a */
    public interface C4443a {
        /* renamed from: a */
        void mo4421a(ViewGroup viewGroup);

        /* renamed from: a */
        boolean mo4422a(MotionEvent motionEvent);

        /* renamed from: b */
        boolean mo4423b(MotionEvent motionEvent);
    }

    public TouchEventRelativeLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public TouchEventRelativeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public TouchEventRelativeLayout(Context context) {
        super(context);
    }

    public C4443a getInterceptTouchEventListener() {
        return this.f19525a;
    }

    public void setInterceptTouchEventListener(C4443a c4443a) {
        if (this.f19525a != null) {
            this.f19525a.mo4421a(null);
        }
        if (c4443a != null) {
            c4443a.mo4421a((ViewGroup) this);
        }
        this.f19525a = c4443a;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f19525a != null) {
            return this.f19525a.mo4423b(motionEvent);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f19525a != null) {
            return this.f19525a.mo4422a(motionEvent);
        }
        return super.onTouchEvent(motionEvent);
    }
}
