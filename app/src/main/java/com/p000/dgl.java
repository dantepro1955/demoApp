package com.p000;

import android.util.Log;
import com.under9.android.lib.network.model.Constants;
import java.io.IOException;
import okhttp3.OkHttpClient;
import okhttp3.Request.Builder;
import okhttp3.Response;

/* compiled from: HostAvailabilityController */
/* renamed from: dgl */
public final class dgl {
    /* renamed from: a */
    private OkHttpClient f21564a;
    /* renamed from: b */
    private dgq f21565b;

    public dgl(dgq dgq) {
        this.f21565b = dgq;
        this.f21564a = dgq.m27227e();
    }

    /* renamed from: a */
    public Response m27210a(String str, String str2, String str3) throws IOException {
        String str4 = str + Constants.SCHEME_SEP + str2 + str3;
        if (this.f21565b.m27223a()) {
            Log.d("HAController", "syncHealthCheck: " + str4);
        }
        return this.f21564a.newCall(new Builder().url(str4).get().build()).execute();
    }
}
