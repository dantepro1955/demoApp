package com.p000;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: cdo */
final /* synthetic */ class cdo implements OnClickListener {
    /* renamed from: a */
    private final cdt f8824a;

    private cdo(cdt cdt) {
        this.f8824a = cdt;
    }

    /* renamed from: a */
    public static OnClickListener m12683a(cdt cdt) {
        return new cdo(cdt);
    }

    public void onClick(View view) {
        this.f8824a.f8844x.performClick();
    }
}
