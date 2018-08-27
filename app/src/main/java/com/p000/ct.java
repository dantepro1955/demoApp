package com.p000;

import android.annotation.TargetApi;
import android.os.IBinder;
import android.view.View;

@TargetApi(14)
/* compiled from: WindowIdPort */
/* renamed from: ct */
class ct {
    /* renamed from: a */
    private final IBinder f20159a;

    private ct(IBinder iBinder) {
        this.f20159a = iBinder;
    }

    /* renamed from: a */
    static ct m24849a(View view) {
        return new ct(view.getWindowToken());
    }

    public boolean equals(Object obj) {
        return (obj instanceof ct) && ((ct) obj).f20159a.equals(this.f20159a);
    }
}
