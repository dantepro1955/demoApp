package com.p000;

import android.annotation.TargetApi;
import android.os.Build.VERSION;
import com.facebook.stetho.common.Utf8Charset;
import com.mopub.common.GpsHelper;
import io.fabric.sdk.android.services.events.EventTransform;
import java.io.IOException;
import org.json.JSONObject;

/* compiled from: SessionEventTransform */
/* renamed from: aaq */
class aaq implements EventTransform<aao> {
    aaq() {
    }

    /* renamed from: a */
    public byte[] m105a(aao aao) throws IOException {
        return m107b(aao).toString().getBytes(Utf8Charset.NAME);
    }

    @TargetApi(9)
    /* renamed from: b */
    public JSONObject m107b(aao aao) throws IOException {
        try {
            JSONObject jSONObject = new JSONObject();
            aap aap = aao.f100a;
            jSONObject.put("appBundleId", aap.f109a);
            jSONObject.put("executionId", aap.f110b);
            jSONObject.put("installationId", aap.f111c);
            jSONObject.put("androidId", aap.f112d);
            jSONObject.put(GpsHelper.ADVERTISING_ID_KEY, aap.f113e);
            jSONObject.put("limitAdTrackingEnabled", aap.f114f);
            jSONObject.put("betaDeviceToken", aap.f115g);
            jSONObject.put("buildId", aap.f116h);
            jSONObject.put("osVersion", aap.f117i);
            jSONObject.put("deviceModel", aap.f118j);
            jSONObject.put("appVersionCode", aap.f119k);
            jSONObject.put("appVersionName", aap.f120l);
            jSONObject.put("timestamp", aao.f101b);
            jSONObject.put("type", aao.f102c.toString());
            if (aao.f103d != null) {
                jSONObject.put("details", new JSONObject(aao.f103d));
            }
            jSONObject.put("customType", aao.f104e);
            if (aao.f105f != null) {
                jSONObject.put("customAttributes", new JSONObject(aao.f105f));
            }
            jSONObject.put("predefinedType", aao.f106g);
            if (aao.f107h != null) {
                jSONObject.put("predefinedAttributes", new JSONObject(aao.f107h));
            }
            return jSONObject;
        } catch (Throwable e) {
            if (VERSION.SDK_INT >= 9) {
                throw new IOException(e.getMessage(), e);
            }
            throw new IOException(e.getMessage());
        }
    }
}
