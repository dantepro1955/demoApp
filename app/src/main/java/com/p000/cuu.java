package com.p000;

import android.text.TextUtils;
import com.facebook.appevents.AppEventsConstants;
import com.ninegag.android.app.upload.SelectSectionActivity;
import java.util.ArrayList;

/* compiled from: UploadModelFactory */
/* renamed from: cuu */
public class cuu {
    /* renamed from: a */
    public static ArrayList<cut> m25034a(String str, String str2, boolean z, boolean z2) {
        ArrayList<cut> arrayList = new ArrayList();
        arrayList.add(cuu.m25032a(str, "title", str2));
        arrayList.add(cuu.m25033a(str, "isNSFW", z));
        arrayList.add(cuu.m25033a(str, "fbCreateAction", z2));
        return arrayList;
    }

    /* renamed from: a */
    public static ArrayList<cut> m25035a(String str, String str2, boolean z, boolean z2, String str3, String str4) {
        ArrayList<cut> arrayList = new ArrayList();
        arrayList.add(cuu.m25032a(str, "title", str2));
        arrayList.add(cuu.m25033a(str, "isNSFW", z));
        arrayList.add(cuu.m25033a(str, "fbCreateAction", z2));
        if (str3 == null || str3.isEmpty()) {
            arrayList.add(cuu.m25033a(str, "skipFromLists", true));
        } else {
            arrayList.add(cuu.m25032a(str, SelectSectionActivity.KEY_SECTION, str3));
        }
        if (!TextUtils.isEmpty(str4)) {
            arrayList.add(cuu.m25032a(str, "tags", str4));
        }
        return arrayList;
    }

    /* renamed from: a */
    public static cut m25032a(String str, String str2, String str3) {
        cut cut = new cut();
        cut.f20268b = str;
        cut.f20269c = str2;
        cut.f20270d = str3;
        return cut;
    }

    /* renamed from: a */
    public static cut m25033a(String str, String str2, boolean z) {
        return cuu.m25032a(str, str2, z ? "1" : AppEventsConstants.EVENT_PARAM_VALUE_NO);
    }
}
