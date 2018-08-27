package com.p000;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.text.TextUtils;
import com.flurry.android.AdCreative;
import com.under9.android.remoteconfig.api.model.ApiBroadcast;
import com.under9.android.remoteconfig.api.model.ApiBroadcastInfo;
import com.under9.android.remoteconfig.api.model.ApiBroadcastsResponse;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: BroadcastsUtil */
/* renamed from: dmz */
public class dmz {
    /* renamed from: a */
    public static ApiBroadcast m28131a(Context context, ApiBroadcast[] apiBroadcastArr, ArrayList<dmq> arrayList) {
        if (apiBroadcastArr == null) {
            return null;
        }
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        for (ApiBroadcast apiBroadcast : apiBroadcastArr) {
            if (dmz.m28135a(apiBroadcast) || dmz.m28136b(apiBroadcast)) {
                Iterator it = arrayList.iterator();
                Object obj = null;
                while (it.hasNext()) {
                    dmq dmq = (dmq) it.next();
                    if (apiBroadcast.id == dmq.f22252a) {
                        obj = 1;
                        if (dmz.m28133a(context, apiBroadcast, dmq)) {
                            return apiBroadcast;
                        }
                    }
                    obj = obj;
                }
                if (obj == null) {
                    return apiBroadcast;
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    private static boolean m28133a(Context context, ApiBroadcast apiBroadcast, dmq dmq) {
        if (apiBroadcast.id != dmq.f22252a) {
            return false;
        }
        if (apiBroadcast == null) {
            return false;
        }
        if (dmq == null) {
            return true;
        }
        long a = djw.m27632a();
        ApiBroadcastInfo apiBroadcastInfo = null;
        if (dmz.m28135a(apiBroadcast) && apiBroadcast.banner != null) {
            apiBroadcastInfo = apiBroadcast.banner;
        }
        if (dmz.m28136b(apiBroadcast) && apiBroadcast.full_screen != null) {
            apiBroadcastInfo = apiBroadcast.full_screen;
        }
        if (apiBroadcastInfo == null) {
            return false;
        }
        if (!TextUtils.isEmpty(apiBroadcastInfo.installedAppIdentifier) && dmz.m28134a(context, apiBroadcastInfo.installedAppIdentifier)) {
            return false;
        }
        long j = dmq.f22253b + ((long) (apiBroadcastInfo.recurrenceInterval * 1000));
        Object obj;
        if (dmq.f22254c < apiBroadcastInfo.recurrenceMaxCount || apiBroadcastInfo.recurrenceMaxCount == 0) {
            obj = 1;
        } else {
            obj = null;
        }
        if (j >= a || r0 == null) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m28134a(Context context, String str) {
        if (str == null || context == null) {
            return false;
        }
        try {
            context.getPackageManager().getPackageInfo(str, 128);
            return true;
        } catch (NameNotFoundException e) {
            return false;
        }
    }

    /* renamed from: a */
    public static boolean m28135a(ApiBroadcast apiBroadcast) {
        if (apiBroadcast == null) {
            return false;
        }
        return TextUtils.equals(AdCreative.kFormatBanner, apiBroadcast.activeMessageType);
    }

    /* renamed from: b */
    public static boolean m28136b(ApiBroadcast apiBroadcast) {
        if (apiBroadcast == null) {
            return false;
        }
        return TextUtils.equals("full_screen", apiBroadcast.activeMessageType);
    }

    /* renamed from: c */
    public static boolean m28137c(ApiBroadcast apiBroadcast) {
        if (apiBroadcast == null) {
            return false;
        }
        return TextUtils.equals("launch_image", apiBroadcast.activeMessageType);
    }

    /* renamed from: d */
    public static ApiBroadcastInfo m28138d(ApiBroadcast apiBroadcast) {
        if (dmz.m28135a(apiBroadcast)) {
            return apiBroadcast.banner;
        }
        if (dmz.m28136b(apiBroadcast)) {
            return apiBroadcast.full_screen;
        }
        if (dmz.m28137c(apiBroadcast)) {
            return apiBroadcast.launch_image;
        }
        return null;
    }

    /* renamed from: a */
    public static ApiBroadcastsResponse m28132a(String str) {
        return (ApiBroadcastsResponse) new buc().a().a(str, ApiBroadcastsResponse.class);
    }
}
