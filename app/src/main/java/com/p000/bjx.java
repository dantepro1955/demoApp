package com.p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import com.google.android.gms.ads.AdActivity;

@bhd
/* renamed from: bjx */
public class bjx {
    /* renamed from: a */
    long f6624a = -1;
    /* renamed from: b */
    long f6625b = -1;
    /* renamed from: c */
    int f6626c = -1;
    /* renamed from: d */
    int f6627d = -1;
    /* renamed from: e */
    long f6628e = 0;
    /* renamed from: f */
    final String f6629f;
    /* renamed from: g */
    int f6630g = 0;
    /* renamed from: h */
    int f6631h = 0;
    /* renamed from: i */
    private final Object f6632i = new Object();

    public bjx(String str) {
        this.f6629f = str;
    }

    /* renamed from: a */
    public static boolean m8972a(Context context) {
        int identifier = context.getResources().getIdentifier("Theme.Translucent", "style", "android");
        if (identifier == 0) {
            bky.m9010d("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
            return false;
        }
        try {
            if (identifier == context.getPackageManager().getActivityInfo(new ComponentName(context.getPackageName(), AdActivity.CLASS_NAME), 0).theme) {
                return true;
            }
            bky.m9010d("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
            return false;
        } catch (NameNotFoundException e) {
            bky.m9011e("Fail to fetch AdActivity theme");
            bky.m9010d("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
            return false;
        }
    }

    /* renamed from: a */
    public long m8973a() {
        return this.f6625b;
    }

    /* renamed from: a */
    public Bundle m8974a(Context context, String str) {
        Bundle bundle;
        synchronized (this.f6632i) {
            bundle = new Bundle();
            bundle.putString("session_id", this.f6629f);
            bundle.putLong("basets", this.f6625b);
            bundle.putLong("currts", this.f6624a);
            bundle.putString("seq_num", str);
            bundle.putInt("preqs", this.f6626c);
            bundle.putInt("preqs_in_session", this.f6627d);
            bundle.putLong("time_in_session", this.f6628e);
            bundle.putInt("pclick", this.f6630g);
            bundle.putInt("pimp", this.f6631h);
            bundle.putBoolean("support_transparent_background", bjx.m8972a(context));
        }
        return bundle;
    }

    /* renamed from: a */
    public void m8975a(int i) {
        this.f6627d = i;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public void m8976a(com.google.android.gms.internal.zzec r11, long r12) {
        /*
        r10 = this;
        r1 = r10.f6632i;
        monitor-enter(r1);
        r0 = p000.ako.m2347i();	 Catch:{ all -> 0x0055 }
        r2 = r0.m8959n();	 Catch:{ all -> 0x0055 }
        r0 = p000.ako.m2349k();	 Catch:{ all -> 0x0055 }
        r4 = r0.mo606a();	 Catch:{ all -> 0x0055 }
        r6 = r10.f6625b;	 Catch:{ all -> 0x0055 }
        r8 = -1;
        r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1));
        if (r0 != 0) goto L_0x0058;
    L_0x001b:
        r2 = r4 - r2;
        r0 = p000.bbb.aL;	 Catch:{ all -> 0x0055 }
        r0 = r0.m7064c();	 Catch:{ all -> 0x0055 }
        r0 = (java.lang.Long) r0;	 Catch:{ all -> 0x0055 }
        r6 = r0.longValue();	 Catch:{ all -> 0x0055 }
        r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1));
        if (r0 <= 0) goto L_0x0049;
    L_0x002d:
        r0 = -1;
        r10.m8975a(r0);	 Catch:{ all -> 0x0055 }
    L_0x0031:
        r10.f6625b = r12;	 Catch:{ all -> 0x0055 }
        r2 = r10.f6625b;	 Catch:{ all -> 0x0055 }
        r10.f6624a = r2;	 Catch:{ all -> 0x0055 }
    L_0x0037:
        r0 = r11.f14915c;	 Catch:{ all -> 0x0055 }
        if (r0 == 0) goto L_0x005b;
    L_0x003b:
        r0 = r11.f14915c;	 Catch:{ all -> 0x0055 }
        r2 = "gw";
        r3 = 2;
        r0 = r0.getInt(r2, r3);	 Catch:{ all -> 0x0055 }
        r2 = 1;
        if (r0 != r2) goto L_0x005b;
    L_0x0047:
        monitor-exit(r1);	 Catch:{ all -> 0x0055 }
    L_0x0048:
        return;
    L_0x0049:
        r0 = p000.ako.m2347i();	 Catch:{ all -> 0x0055 }
        r0 = r0.m8961p();	 Catch:{ all -> 0x0055 }
        r10.m8975a(r0);	 Catch:{ all -> 0x0055 }
        goto L_0x0031;
    L_0x0055:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0055 }
        throw r0;
    L_0x0058:
        r10.f6624a = r12;	 Catch:{ all -> 0x0055 }
        goto L_0x0037;
    L_0x005b:
        r0 = r10.f6626c;	 Catch:{ all -> 0x0055 }
        r0 = r0 + 1;
        r10.f6626c = r0;	 Catch:{ all -> 0x0055 }
        r0 = r10.f6627d;	 Catch:{ all -> 0x0055 }
        r0 = r0 + 1;
        r10.f6627d = r0;	 Catch:{ all -> 0x0055 }
        r0 = r10.f6627d;	 Catch:{ all -> 0x0055 }
        if (r0 != 0) goto L_0x0078;
    L_0x006b:
        r2 = 0;
        r10.f6628e = r2;	 Catch:{ all -> 0x0055 }
        r0 = p000.ako.m2347i();	 Catch:{ all -> 0x0055 }
        r0.m8937b(r4);	 Catch:{ all -> 0x0055 }
    L_0x0076:
        monitor-exit(r1);	 Catch:{ all -> 0x0055 }
        goto L_0x0048;
    L_0x0078:
        r0 = p000.ako.m2347i();	 Catch:{ all -> 0x0055 }
        r2 = r0.m8960o();	 Catch:{ all -> 0x0055 }
        r2 = r4 - r2;
        r10.f6628e = r2;	 Catch:{ all -> 0x0055 }
        goto L_0x0076;
        */
        throw new UnsupportedOperationException("Method not decompiled: bjx.a(com.google.android.gms.internal.zzec, long):void");
    }

    /* renamed from: b */
    public void m8977b() {
        synchronized (this.f6632i) {
            this.f6630g++;
        }
    }

    /* renamed from: c */
    public void m8978c() {
        synchronized (this.f6632i) {
            this.f6631h++;
        }
    }

    /* renamed from: d */
    public int m8979d() {
        return this.f6627d;
    }
}
