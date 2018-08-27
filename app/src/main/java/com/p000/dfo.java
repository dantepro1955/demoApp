package com.p000;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import com.facebook.stetho.common.Utf8Charset;
import com.under9.android.feedback.model.ReportType;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import p000.dff.C4869c;

/* compiled from: FeedbackUtil */
/* renamed from: dfo */
public class dfo {
    /* renamed from: a */
    public static String m27037a(dfd dfd, Map<String, String> map) {
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
            stringBuilder.append(dfd.m26958b().m26981h());
            return djj.m27575a(djj.m27580d(stringBuilder.toString()));
        } catch (Exception e) {
            return null;
        }
    }

    /* renamed from: a */
    public static String m27038a(HashMap<String, String> hashMap) {
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
    public static HashMap<String, String> m27040a(dfh dfh) {
        HashMap<String, String> hashMap = new HashMap();
        hashMap.put("appId", dfh.m26980g());
        hashMap.put("platformId", dfh.m26982i());
        return hashMap;
    }

    /* renamed from: a */
    public static ArrayList<ReportType> m27039a(Map<String, String> map) {
        ArrayList<ReportType> arrayList = new ArrayList();
        arrayList.add(new ReportType("", "Select a problem type"));
        for (String str : map.keySet()) {
            arrayList.add(new ReportType(str, (String) map.get(str)));
        }
        return arrayList;
    }

    /* renamed from: a */
    public static int m27035a(String str) {
        if ("2".equals(str)) {
            return C4869c.feedback_report_description_placeholder;
        }
        return C4869c.feedback_suggestion_description_placeholder;
    }

    /* renamed from: a */
    public static String m27036a(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        int i = applicationInfo.labelRes;
        return i == 0 ? applicationInfo.nonLocalizedLabel.toString() : context.getString(i);
    }
}
