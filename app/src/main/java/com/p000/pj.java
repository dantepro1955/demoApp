package com.p000;

import android.content.Context;
import android.os.Build.VERSION;
import android.support.v7.widget.ListViewCompat;
import android.view.MotionEvent;
import android.view.View;
import p000.mx.C5568a;

/* compiled from: DropDownListView */
/* renamed from: pj */
public class pj extends ListViewCompat {
    /* renamed from: g */
    private boolean f25073g;
    /* renamed from: h */
    private boolean f25074h;
    /* renamed from: i */
    private boolean f25075i;
    /* renamed from: j */
    private ju f25076j;
    /* renamed from: k */
    private lm f25077k;

    public pj(Context context, boolean z) {
        super(context, null, C5568a.dropDownListViewStyle);
        this.f25074h = z;
        setCacheColorHint(0);
    }

    /* renamed from: a */
    public boolean m33608a(MotionEvent motionEvent, int i) {
        boolean z;
        boolean z2;
        int a = io.a(motionEvent);
        switch (a) {
            case 1:
                z = false;
                break;
            case 2:
                z = true;
                break;
            case 3:
                z = false;
                z2 = false;
                break;
            default:
                z = false;
                z2 = true;
                break;
        }
        int findPointerIndex = motionEvent.findPointerIndex(i);
        if (findPointerIndex < 0) {
            z = false;
            z2 = false;
        } else {
            int x = (int) motionEvent.getX(findPointerIndex);
            findPointerIndex = (int) motionEvent.getY(findPointerIndex);
            int pointToPosition = pointToPosition(x, findPointerIndex);
            if (pointToPosition == -1) {
                z2 = z;
                z = true;
            } else {
                View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
                m33605a(childAt, pointToPosition, (float) x, (float) findPointerIndex);
                if (a == 1) {
                    m33604a(childAt, pointToPosition);
                }
                z = false;
                z2 = true;
            }
        }
        if (!z2 || r0) {
            m33606d();
        }
        if (z2) {
            if (this.f25077k == null) {
                this.f25077k = new lm(this);
            }
            this.f25077k.m32343a(true);
            this.f25077k.onTouch(this, motionEvent);
        } else if (this.f25077k != null) {
            this.f25077k.m32343a(false);
        }
        return z2;
    }

    /* renamed from: a */
    private void m33604a(View view, int i) {
        performItemClick(view, i, getItemIdAtPosition(i));
    }

    public void setListSelectionHidden(boolean z) {
        this.f25073g = z;
    }

    /* renamed from: d */
    private void m33606d() {
        this.f25075i = false;
        setPressed(false);
        drawableStateChanged();
        View childAt = getChildAt(this.f - getFirstVisiblePosition());
        if (childAt != null) {
            childAt.setPressed(false);
        }
        if (this.f25076j != null) {
            this.f25076j.m31859b();
            this.f25076j = null;
        }
    }

    /* renamed from: a */
    private void m33605a(View view, int i, float f, float f2) {
        this.f25075i = true;
        if (VERSION.SDK_INT >= 21) {
            drawableHotspotChanged(f, f2);
        }
        if (!isPressed()) {
            setPressed(true);
        }
        layoutChildren();
        if (this.f != -1) {
            View childAt = getChildAt(this.f - getFirstVisiblePosition());
            if (!(childAt == null || childAt == view || !childAt.isPressed())) {
                childAt.setPressed(false);
            }
        }
        this.f = i;
        float left = f - ((float) view.getLeft());
        float top = f2 - ((float) view.getTop());
        if (VERSION.SDK_INT >= 21) {
            view.drawableHotspotChanged(left, top);
        }
        if (!view.isPressed()) {
            view.setPressed(true);
        }
        a(i, view, f, f2);
        setSelectorEnabled(false);
        refreshDrawableState();
    }

    /* renamed from: a */
    protected boolean m33607a() {
        return this.f25075i || super.a();
    }

    public boolean isInTouchMode() {
        return (this.f25074h && this.f25073g) || super.isInTouchMode();
    }

    public boolean hasWindowFocus() {
        return this.f25074h || super.hasWindowFocus();
    }

    public boolean isFocused() {
        return this.f25074h || super.isFocused();
    }

    public boolean hasFocus() {
        return this.f25074h || super.hasFocus();
    }
}
