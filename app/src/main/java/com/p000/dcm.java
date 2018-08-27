package com.p000;

import android.content.Context;
import android.content.Intent;

/* compiled from: SonyHomeBadger */
/* renamed from: dcm */
public class dcm extends dcl {
    dcm(Context context) {
        super(context);
    }

    /* renamed from: a */
    void mo4320a(int i) {
        Intent intent = new Intent("com.sonyericsson.home.action.UPDATE_BADGE");
        intent.putExtra("com.sonyericsson.home.intent.extra.badge.PACKAGE_NAME", m26376b());
        intent.putExtra("com.sonyericsson.home.intent.extra.badge.ACTIVITY_NAME", m26374a());
        intent.putExtra("com.sonyericsson.home.intent.extra.badge.MESSAGE", String.valueOf(i));
        intent.putExtra("com.sonyericsson.home.intent.extra.badge.SHOW_MESSAGE", i > 0);
        this.a.sendBroadcast(intent);
    }
}
