package com.p000;

import android.util.Log;
import com.ninegag.android.app.model.api.ApiService;
import com.ninegag.android.app.model.api.ApiUrlInfoResponse;

/* compiled from: NetworkInformationRepository */
/* renamed from: cjg */
public class cjg extends cis {
    public cjg(ApiService apiService) {
        super(apiService);
    }

    /* renamed from: a */
    public dtp<ApiUrlInfoResponse> m14055a(String str) {
        return this.b.getUrlInfo(str).a(cgl.m13109a()).d(cjh.m14056a()).e(cji.m14058a(this));
    }

    /* renamed from: a */
    static /* synthetic */ ApiUrlInfoResponse m14054a(cjg cjg, Throwable th) {
        if (cjg.m14022a()) {
            Log.e("NetworkInformationRepository", "getUrlInfo: ", th);
        }
        return null;
    }
}
