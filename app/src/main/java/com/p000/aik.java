package com.p000;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.under9.android.lib.network.model.Constants;

@bhd
/* renamed from: aik */
public class aik {
    /* renamed from: a */
    public boolean m1702a(Context context, Intent intent, aix aix) {
        try {
            String str = "Launching an intent: ";
            String valueOf = String.valueOf(intent.toURI());
            bkc.m9012a(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            ako.m2343e().m9098a(context, intent);
            if (aix != null) {
                aix.mo244e();
            }
            return true;
        } catch (ActivityNotFoundException e) {
            bky.m9011e(e.getMessage());
            return false;
        }
    }

    /* renamed from: a */
    public boolean m1703a(Context context, zzc zzc, aix aix) {
        if (zzc == null) {
            bky.m9011e("No intent data for launcher overlay.");
            return false;
        }
        bbb.m7128a(context);
        if (zzc.f14465h != null) {
            return m1702a(context, zzc.f14465h, aix);
        }
        Intent intent = new Intent();
        if (TextUtils.isEmpty(zzc.f14459b)) {
            bky.m9011e("Open GMSG did not contain a URL.");
            return false;
        }
        if (TextUtils.isEmpty(zzc.f14460c)) {
            intent.setData(Uri.parse(zzc.f14459b));
        } else {
            intent.setDataAndType(Uri.parse(zzc.f14459b), zzc.f14460c);
        }
        intent.setAction("android.intent.action.VIEW");
        if (!TextUtils.isEmpty(zzc.f14461d)) {
            intent.setPackage(zzc.f14461d);
        }
        if (!TextUtils.isEmpty(zzc.f14462e)) {
            String[] split = zzc.f14462e.split(Constants.SEP, 2);
            if (split.length < 2) {
                String str = "Could not parse component name from open GMSG: ";
                String valueOf = String.valueOf(zzc.f14462e);
                bky.m9011e(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
                return false;
            }
            intent.setClassName(split[0], split[1]);
        }
        Object obj = zzc.f14463f;
        if (!TextUtils.isEmpty(obj)) {
            int parseInt;
            try {
                parseInt = Integer.parseInt(obj);
            } catch (NumberFormatException e) {
                bky.m9011e("Could not parse intent flags.");
                parseInt = 0;
            }
            intent.addFlags(parseInt);
        }
        if (((Boolean) bbb.de.m7064c()).booleanValue()) {
            intent.addFlags(268435456);
            intent.putExtra("android.support.customtabs.extra.user_opt_out", true);
        }
        return m1702a(context, intent, aix);
    }
}
