package com.p000;

import org.json.JSONObject;

/* compiled from: OneSignal */
/* renamed from: dat$7 */
class dat$7 implements Runnable {
    /* renamed from: a */
    final /* synthetic */ String f20958a;
    /* renamed from: b */
    final /* synthetic */ JSONObject f20959b;
    /* renamed from: c */
    final /* synthetic */ boolean f20960c;

    dat$7(String str, JSONObject jSONObject, boolean z) {
        this.f20958a = str;
        this.f20959b = jSONObject;
        this.f20960c = z;
    }

    public void run() {
        dat.t().a(this.f20958a, this.f20959b, this.f20960c);
    }
}
