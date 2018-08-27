package com.p000;

import android.graphics.Bitmap.CompressFormat;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* compiled from: FeedbackApiUtil */
/* renamed from: dfg */
public class dfg {
    /* renamed from: a */
    public static String m26970a(dfd dfd) {
        HashMap a = dfo.m27040a(dfd.m26958b());
        a.put("signature", dfo.m27037a(dfd, a));
        return dfg.m26969a(dfd, dft.m27073b(dfd.m26958b().m26979f() + "/v1/feedback-types" + "?" + dfo.m27038a(a))).m27114e();
    }

    /* renamed from: a */
    public static String m26974a(dfd dfd, HashMap<String, String> hashMap) {
        dft a = dfg.m26969a(dfd, dft.m27076c(dfd.m26958b().m26979f() + "/v1/feedback"));
        a.m27094a((Map) hashMap);
        return a.m27114e();
    }

    /* renamed from: a */
    public static String m26972a(dfd dfd, String str, String str2) {
        String str3 = dfd.f21470a.getCacheDir() + UUID.randomUUID().toString() + ".jpg";
        try {
            djl.m27586a(dja.m27557a(str2, dfd.m26958b().m26983j()), CompressFormat.JPEG, 80, str3);
            String a = dfg.m26971a(dfd, str, new File(str3));
            djl.m27590b(str3);
            return a;
        } catch (Exception e) {
            return null;
        }
    }

    /* renamed from: a */
    public static String m26973a(dfd dfd, String str, List<String> list) {
        dft a = dfg.m26969a(dfd, dft.m27076c(dfd.m26958b().m26979f() + "/v1/feedback-networktrace"));
        Map hashMap = new HashMap();
        hashMap.put("appId", dfd.m26958b().m26980g());
        hashMap.put("feedbackId", str);
        hashMap.put("signature", dfo.m27037a(dfd, hashMap));
        hashMap.put("networkTrace", list.toString());
        a.m27094a(hashMap);
        return a.m27114e();
    }

    /* renamed from: a */
    public static String m26971a(dfd dfd, String str, File file) {
        Map hashMap = new HashMap();
        hashMap.put("feedbackId", str);
        hashMap.put("appId", dfd.m26958b().m26980g());
        String a = dfo.m27037a(dfd, hashMap);
        dft a2 = dfg.m26969a(dfd, dft.m27076c(dfd.m26958b().m26979f() + "/v1/feedback-image"));
        a2.m27113e("appId", dfd.m26958b().m26980g());
        a2.m27113e("feedbackId", str);
        a2.m27113e("signature", a);
        a2.m27088a("image", "a.jpg", file);
        return a2.m27114e();
    }

    /* renamed from: a */
    private static dft m26969a(dfd dfd, dft dft) {
        dft.m27087a("X-Package-ID", dfd.m26958b().m26976c());
        dft.m27086a("X-Package-Version", Integer.valueOf(dfd.m26958b().m26977d()));
        dft.m27087a("X-Device-UUID", dfd.m26958b().m26978e());
        return dft;
    }
}
