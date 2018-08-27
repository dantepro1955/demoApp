package com.p000;

import android.os.Bundle;
import com.facebook.internal.AnalyticsEvents;
import com.millennialmedia.NativeAd;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import org.json.JSONException;
import org.json.JSONObject;
import p000.bby.C0997a;
import p000.bgv.C1186a;

@bhd
/* renamed from: bgx */
public class bgx implements C1186a<bbs> {
    /* renamed from: a */
    private final boolean f6203a;
    /* renamed from: b */
    private final boolean f6204b;

    public bgx(boolean z, boolean z2) {
        this.f6203a = z;
        this.f6204b = z2;
    }

    /* renamed from: a */
    public /* synthetic */ C0997a mo1186a(bgv bgv, JSONObject jSONObject) throws JSONException, InterruptedException, ExecutionException {
        return m8416b(bgv, jSONObject);
    }

    /* renamed from: b */
    public bbs m8416b(bgv bgv, JSONObject jSONObject) throws JSONException, InterruptedException, ExecutionException {
        List<ble> a = bgv.m8393a(jSONObject, "images", true, this.f6203a, this.f6204b);
        Future a2 = bgv.m8392a(jSONObject, "app_icon", true, this.f6203a);
        ble a3 = bgv.m8391a(jSONObject, AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_VIDEO);
        Future b = bgv.m8397b(jSONObject);
        List arrayList = new ArrayList();
        for (ble ble : a) {
            arrayList.add((bbr) ble.get());
        }
        blo a4 = bgv.m8376a(a3);
        return new bbs(jSONObject.getString("headline"), arrayList, jSONObject.getString(NativeAd.COMPONENT_ID_BODY), (bcc) a2.get(), jSONObject.getString("call_to_action"), jSONObject.optDouble(NativeAd.COMPONENT_ID_RATING, -1.0d), jSONObject.optString("store"), jSONObject.optString("price"), (bbq) b.get(), new Bundle(), a4 != null ? a4.mo1346z() : null, a4 != null ? a4.mo1305b() : null);
    }
}
