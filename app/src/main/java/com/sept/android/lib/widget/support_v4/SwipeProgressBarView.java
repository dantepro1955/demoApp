package com.sept.android.lib.widget.support_v4;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import p000.dlk;

public class SwipeProgressBarView extends View {
    /* renamed from: a */
    private dlk f19710a;
    /* renamed from: b */
    private boolean f19711b = false;

    public SwipeProgressBarView(Context context) {
        super(context);
        m24065a();
    }

    public SwipeProgressBarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m24065a();
    }

    public SwipeProgressBarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m24065a();
    }

    /* renamed from: a */
    private void m24065a() {
        this.f19710a = new dlk(this);
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f19710a.m27842b(i, i2, i3, i4);
    }

    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f19710a.m27840a(canvas);
    }

    public void setColorScheme(int i, int i2, int i3, int i4) {
        Resources resources = getResources();
        this.f19710a.m27839a(resources.getColor(i), resources.getColor(i2), resources.getColor(i3), resources.getColor(i4));
    }

    public void setRefreshing(boolean z) {
        if (this.f19711b != z) {
            this.f19711b = z;
            if (this.f19711b) {
                this.f19710a.m27838a();
            } else {
                this.f19710a.m27841b();
            }
        }
    }
}
