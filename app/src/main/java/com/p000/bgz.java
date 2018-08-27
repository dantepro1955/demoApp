package com.p000;

import android.os.Bundle;
import android.view.View;
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
/* renamed from: bgz */
public class bgz implements C1186a<bbt> {
    /* renamed from: a */
    private final boolean f6216a;
    /* renamed from: b */
    private final boolean f6217b;

    public bgz(boolean z, boolean z2) {
        this.f6216a = z;
        this.f6217b = z2;
    }

    /* renamed from: a */
    public /* synthetic */ C0997a mo1186a(bgv bgv, JSONObject jSONObject) throws JSONException, InterruptedException, ExecutionException {
        return m8423b(bgv, jSONObject);
    }

    /* renamed from: b */
    public bbt m8423b(bgv bgv, JSONObject jSONObject) throws JSONException, InterruptedException, ExecutionException {
        View view = null;
        List<ble> a = bgv.m8393a(jSONObject, "images", true, this.f6216a, this.f6217b);
        Future a2 = bgv.m8392a(jSONObject, "secondary_image", false, this.f6216a);
        Future b = bgv.m8397b(jSONObject);
        ble a3 = bgv.m8391a(jSONObject, AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_VIDEO);
        List arrayList = new ArrayList();
        for (ble ble : a) {
            arrayList.add((bbr) ble.get());
        }
        blo a4 = bgv.m8376a(a3);
        String string = jSONObject.getString("headline");
        String string2 = jSONObject.getString(NativeAd.COMPONENT_ID_BODY);
        bcc bcc = (bcc) a2.get();
        String string3 = jSONObject.getString("call_to_action");
        String string4 = jSONObject.getString("advertiser");
        bbq bbq = (bbq) b.get();
        Bundle bundle = new Bundle();
        baf z = a4 != null ? a4.mo1346z() : null;
        if (a4 != null) {
            view = a4.mo1305b();
        }
        return new bbt(string, arrayList, string2, bcc, string3, string4, bbq, bundle, z, view);
    }
}
