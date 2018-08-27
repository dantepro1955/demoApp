package com.p000;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;

/* renamed from: td */
public class td implements OnTouchListener {
    /* renamed from: a */
    private long f25540a;
    /* renamed from: b */
    private float f25541b;
    /* renamed from: c */
    private float f25542c;
    /* renamed from: d */
    private Context f25543d;
    /* renamed from: e */
    private OnClickListener f25544e;

    public td(Context context, OnClickListener onClickListener) {
        this.f25543d = context;
        this.f25544e = onClickListener;
    }

    /* renamed from: a */
    private float m34190a(float f) {
        return f / this.f25543d.getResources().getDisplayMetrics().density;
    }

    /* renamed from: a */
    private float m34191a(float f, float f2, float f3, float f4) {
        float f5 = f - f3;
        float f6 = f2 - f4;
        return m34190a((float) Math.sqrt((double) ((f5 * f5) + (f6 * f6))));
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        switch (motionEvent.getAction()) {
            case 0:
                this.f25540a = System.currentTimeMillis();
                this.f25541b = motionEvent.getX();
                this.f25542c = motionEvent.getY();
                break;
            case 1:
                if (System.currentTimeMillis() - this.f25540a < 1000 && m34191a(this.f25541b, this.f25542c, motionEvent.getX(), motionEvent.getY()) < 10.0f) {
                    this.f25544e.onClick(view);
                    break;
                }
        }
        return true;
    }
}
