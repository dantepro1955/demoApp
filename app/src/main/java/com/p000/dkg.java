package com.p000;

import android.app.Activity;
import android.graphics.Point;
import android.view.View;
import android.widget.RelativeLayout.LayoutParams;
import p000.dnb.C5002e;

/* compiled from: FloatingHint */
/* renamed from: dkg */
public class dkg extends dkh {
    dkg(Activity activity, View view, Runnable runnable, long j) {
        super(activity, view, null, runnable, j);
    }

    /* renamed from: a */
    public void m27696a(Point point) {
        View findViewById = this.b.findViewById(C5002e.image);
        if (findViewById != null) {
            LayoutParams layoutParams = (LayoutParams) findViewById.getLayoutParams();
            layoutParams.leftMargin = point.x;
            layoutParams.topMargin = point.y;
            findViewById.setLayoutParams(layoutParams);
        }
    }
}
