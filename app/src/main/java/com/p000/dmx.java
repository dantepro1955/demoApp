package com.p000;

import com.facebook.internal.AnalyticsEvents;
import com.inmobi.commons.analytics.db.AnalyticsSQLiteHelper;
import com.under9.android.remoteconfig.api.model.ApiAdsResponse;
import com.under9.android.remoteconfig.api.model.ApiAdsResponse.ApiAd;
import com.under9.android.remoteconfig.api.model.ApiAdsResponse.ApiAdConfig;
import com.under9.android.remoteconfig.api.model.ApiAdsResponse.ApiPayload;
import com.under9.android.remoteconfig.api.model.ApiAdsResponse.ApiView;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: AdsUtil */
/* renamed from: dmx */
public final class dmx {
    /* renamed from: a */
    public static ApiAdsResponse m28129a(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONObject jSONObject2 = jSONObject.getJSONObject("payload").getJSONObject("views");
            int length = jSONObject2.names().length();
            ApiView[] apiViewArr = new ApiView[length];
            for (int i = 0; i < length; i++) {
                try {
                    String str2 = (String) jSONObject2.names().get(i);
                    JSONObject jSONObject3 = jSONObject2.getJSONObject(str2);
                    int length2 = jSONObject3.names().length();
                    ApiAd[] apiAdArr = new ApiAd[length2];
                    boolean z = true;
                    int i2 = 0;
                    while (i2 < length2) {
                        boolean z2;
                        try {
                            String str3 = (String) jSONObject3.names().get(i2);
                            if ("displayAdEnabled".equals(str3)) {
                                z2 = jSONObject3.getBoolean("displayAdEnabled");
                            } else {
                                JSONObject jSONObject4 = jSONObject3.getJSONObject(str3);
                                ApiAdConfig apiAdConfig = new ApiAdConfig();
                                apiAdConfig.adTag = jSONObject4.getString("adTag");
                                apiAdConfig.occurrence = jSONObject4.getString("occurrence");
                                ApiAd apiAd = new ApiAd();
                                apiAd.name = str3;
                                apiAd.config = apiAdConfig;
                                apiAdArr[i2] = apiAd;
                                z2 = z;
                            }
                        } catch (JSONException e) {
                            z2 = z;
                        }
                        i2++;
                        z = z2;
                    }
                    for (int i3 = 0; i3 < apiAdArr.length; i3++) {
                        if (apiAdArr[i3] == null) {
                            apiAdArr[i3] = new ApiAd();
                        }
                        apiAdArr[i3].displayAdEnabled = Boolean.valueOf(z);
                    }
                    ApiView apiView = new ApiView();
                    apiView.name = str2;
                    apiView.ads = apiAdArr;
                    apiViewArr[i] = apiView;
                } catch (JSONException e2) {
                }
            }
            ApiPayload apiPayload = new ApiPayload();
            apiPayload.views = apiViewArr;
            ApiAdsResponse apiAdsResponse = new ApiAdsResponse();
            apiAdsResponse.ts = jSONObject.getLong("ts");
            apiAdsResponse.sid = jSONObject.getString(AnalyticsSQLiteHelper.EVENT_LIST_SID);
            apiAdsResponse.status = jSONObject.getString(AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_STATUS);
            apiAdsResponse.error = jSONObject.getString("error");
            apiAdsResponse.payload = apiPayload;
            return apiAdsResponse;
        } catch (JSONException e3) {
            return null;
        }
    }
}
