package com.p000;

import android.os.Bundle;
import com.facebook.applinks.AppLinkData;
import com.facebook.places.model.PlaceFields;
import com.google.android.gms.internal.zzec;
import com.google.android.gms.internal.zzeg;
import com.millennialmedia.android.MMRequest;
import com.mopub.nativeads.AdMobStaticNativeAd;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

@bhd
/* renamed from: ajw */
public class ajw {
    /* renamed from: a */
    private static String m2063a(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        StringBuilder stringBuilder = new StringBuilder();
        Iterator it = new TreeSet(bundle.keySet()).iterator();
        while (it.hasNext()) {
            Object obj = bundle.get((String) it.next());
            String a = obj == null ? "null" : obj instanceof Bundle ? ajw.m2063a((Bundle) obj) : obj.toString();
            stringBuilder.append(a);
        }
        return stringBuilder.toString();
    }

    /* renamed from: a */
    public static Object[] m2064a(String str, zzec zzec, String str2, int i, zzeg zzeg) {
        Set hashSet = new HashSet(Arrays.asList(str.split(",")));
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        arrayList.add(str2);
        if (hashSet.contains("formatString")) {
            if (zzeg != null) {
                arrayList.add(zzeg.f14931a);
            } else {
                arrayList.add(null);
            }
        }
        if (hashSet.contains("networkType")) {
            arrayList.add(Integer.valueOf(i));
        }
        if (hashSet.contains("birthday")) {
            arrayList.add(Long.valueOf(zzec.f14914b));
        }
        if (hashSet.contains(AppLinkData.ARGUMENTS_EXTRAS_KEY)) {
            arrayList.add(ajw.m2063a(zzec.f14915c));
        }
        if (hashSet.contains(MMRequest.KEY_GENDER)) {
            arrayList.add(Integer.valueOf(zzec.f14916d));
        }
        if (hashSet.contains("keywords")) {
            if (zzec.f14917e != null) {
                arrayList.add(zzec.f14917e.toString());
            } else {
                arrayList.add(null);
            }
        }
        if (hashSet.contains("isTestDevice")) {
            arrayList.add(Boolean.valueOf(zzec.f14918f));
        }
        if (hashSet.contains("tagForChildDirectedTreatment")) {
            arrayList.add(Integer.valueOf(zzec.f14919g));
        }
        if (hashSet.contains("manualImpressionsEnabled")) {
            arrayList.add(Boolean.valueOf(zzec.f14920h));
        }
        if (hashSet.contains("publisherProvidedId")) {
            arrayList.add(zzec.f14921i);
        }
        if (hashSet.contains(PlaceFields.LOCATION)) {
            if (zzec.f14923k != null) {
                arrayList.add(zzec.f14923k.toString());
            } else {
                arrayList.add(null);
            }
        }
        if (hashSet.contains(AdMobStaticNativeAd.KEY_CONTENT_URL)) {
            arrayList.add(zzec.f14924l);
        }
        if (hashSet.contains("networkExtras")) {
            arrayList.add(ajw.m2063a(zzec.f14925m));
        }
        if (hashSet.contains("customTargeting")) {
            arrayList.add(ajw.m2063a(zzec.f14926n));
        }
        if (hashSet.contains("categoryExclusions")) {
            if (zzec.f14927o != null) {
                arrayList.add(zzec.f14927o.toString());
            } else {
                arrayList.add(null);
            }
        }
        if (hashSet.contains("requestAgent")) {
            arrayList.add(zzec.f14928p);
        }
        if (hashSet.contains("requestPackage")) {
            arrayList.add(zzec.f14929q);
        }
        if (hashSet.contains("isDesignedForFamilies")) {
            arrayList.add(Boolean.valueOf(zzec.f14930r));
        }
        return arrayList.toArray();
    }
}
