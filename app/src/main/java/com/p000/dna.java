package com.p000;

import com.facebook.stetho.common.Utf8Charset;
import com.under9.android.remoteconfig.api.model.ApiConfigResponse;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* compiled from: RemoteConfigUtil */
/* renamed from: dna */
public class dna {
    /* renamed from: a */
    public static String m28175a(dmj dmj, Map<String, String> map) {
        try {
            List<String> arrayList = new ArrayList(map.keySet());
            Collections.sort(arrayList);
            StringBuilder stringBuilder = new StringBuilder();
            for (String str : arrayList) {
                stringBuilder.append(URLEncoder.encode(str, Utf8Charset.NAME));
                stringBuilder.append("=");
                stringBuilder.append(djz.m27648c((String) map.get(str)));
            }
            stringBuilder.append(".");
            stringBuilder.append(dmj.m28011b().m28040f());
            return djj.m27575a(djj.m27580d(stringBuilder.toString()));
        } catch (Exception e) {
            return null;
        }
    }

    /* renamed from: a */
    public static String m28176a(HashMap<String, String> hashMap) {
        try {
            StringBuilder stringBuilder = new StringBuilder();
            for (Entry entry : hashMap.entrySet()) {
                if (stringBuilder.length() > 0) {
                    stringBuilder.append('&');
                }
                stringBuilder.append(djz.m27647b((String) entry.getKey())).append('=').append(djz.m27647b((String) entry.getValue()));
            }
            return stringBuilder.toString();
        } catch (Exception e) {
            return null;
        }
    }

    /* renamed from: a */
    public static HashMap<String, String> m28177a(dml dml) {
        HashMap<String, String> hashMap = new HashMap();
        hashMap.put("appId", dml.m28039e());
        hashMap.put("mobileAppId", dml.m28041g());
        return hashMap;
    }

    /* renamed from: a */
    public static ApiConfigResponse m28174a(String str) {
        buc buc = new buc();
        buc.a(dmr.class, new dms());
        return (ApiConfigResponse) buc.a().a(str, ApiConfigResponse.class);
    }
}
