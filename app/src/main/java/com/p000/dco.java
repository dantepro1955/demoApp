package com.p000;

import android.content.Context;
import android.content.Intent;

/* compiled from: LGHomeBadger */
/* renamed from: dco */
public class dco extends dcl {
    public dco(Context context) {
        super(context);
    }

    /* renamed from: a */
    protected void mo4320a(int i) {
        Intent intent = new Intent("android.intent.action.BADGE_COUNT_UPDATE");
        intent.putExtra("badge_count", i);
        intent.putExtra("badge_count_package_name", m26376b());
        intent.putExtra("badge_count_class_name", m26374a());
        this.a.sendBroadcast(intent);
    }
}
