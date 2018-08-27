package com.p000;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.ads.AdActivity;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;

@bhd
/* renamed from: aip */
public class aip {
    /* renamed from: a */
    public void m1778a(Context context, AdOverlayInfoParcel adOverlayInfoParcel) {
        m1779a(context, adOverlayInfoParcel, true);
    }

    /* renamed from: a */
    public void m1779a(Context context, AdOverlayInfoParcel adOverlayInfoParcel, boolean z) {
        if (adOverlayInfoParcel.f14452k == 4 && adOverlayInfoParcel.f14444c == null) {
            if (adOverlayInfoParcel.f14443b != null) {
                adOverlayInfoParcel.f14443b.onAdClicked();
            }
            ako.m2340b().m1703a(context, adOverlayInfoParcel.f14442a, adOverlayInfoParcel.f14450i);
            return;
        }
        Intent intent = new Intent();
        intent.setClassName(context, AdActivity.CLASS_NAME);
        intent.putExtra("com.google.android.gms.ads.internal.overlay.useClientJar", adOverlayInfoParcel.f14454m.f15124d);
        intent.putExtra("shouldCallOnOverlayOpened", z);
        AdOverlayInfoParcel.m19288a(intent, adOverlayInfoParcel);
        if (!aqd.m4919i()) {
            intent.addFlags(524288);
        }
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        ako.m2343e().m9098a(context, intent);
    }
}
