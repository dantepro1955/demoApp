package com.p000;

import android.view.View;
import com.facebook.internal.AnalyticsEvents;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p000.bby.C0997a;
import p000.bgv.C1186a;

@bhd
/* renamed from: bha */
public class bha implements C1186a<bbu> {
    /* renamed from: a */
    private final boolean f6218a;

    public bha(boolean z) {
        this.f6218a = z;
    }

    /* renamed from: a */
    private <K, V> hr<K, V> m8427a(hr<K, Future<V>> hrVar) throws InterruptedException, ExecutionException {
        hr<K, V> hrVar2 = new hr();
        for (int i = 0; i < hrVar.size(); i++) {
            hrVar2.put(hrVar.b(i), ((Future) hrVar.c(i)).get());
        }
        return hrVar2;
    }

    /* renamed from: a */
    private void m8428a(bgv bgv, JSONObject jSONObject, hr<String, Future<bbr>> hrVar) throws JSONException {
        hrVar.put(jSONObject.getString("name"), bgv.m8394a(jSONObject, "image_value", this.f6218a));
    }

    /* renamed from: a */
    private void m8429a(JSONObject jSONObject, hr<String, String> hrVar) throws JSONException {
        hrVar.put(jSONObject.getString("name"), jSONObject.getString("string_value"));
    }

    /* renamed from: a */
    public /* synthetic */ C0997a mo1186a(bgv bgv, JSONObject jSONObject) throws JSONException, InterruptedException, ExecutionException {
        return m8431b(bgv, jSONObject);
    }

    /* renamed from: b */
    public bbu m8431b(bgv bgv, JSONObject jSONObject) throws JSONException, InterruptedException, ExecutionException {
        String valueOf;
        View view = null;
        hr hrVar = new hr();
        hr hrVar2 = new hr();
        Future b = bgv.m8397b(jSONObject);
        ble a = bgv.m8391a(jSONObject, AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_VIDEO);
        JSONArray jSONArray = jSONObject.getJSONArray("custom_assets");
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
            String string = jSONObject2.getString("type");
            if ("string".equals(string)) {
                m8429a(jSONObject2, hrVar2);
            } else if ("image".equals(string)) {
                m8428a(bgv, jSONObject2, hrVar);
            } else {
                String str = "Unknown custom asset type: ";
                valueOf = String.valueOf(string);
                bky.m9011e(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            }
        }
        blo a2 = bgv.m8376a(a);
        valueOf = jSONObject.getString("custom_template_id");
        hrVar = m8427a(hrVar);
        bbq bbq = (bbq) b.get();
        baf z = a2 != null ? a2.mo1346z() : null;
        if (a2 != null) {
            view = a2.mo1305b();
        }
        return new bbu(valueOf, hrVar, hrVar2, bbq, z, view);
    }
}
