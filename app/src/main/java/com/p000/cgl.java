package com.p000;

import com.ninegag.android.app.model.api.ApiBaseResponse;
import java.io.IOException;
import p000.dtp.C4531c;
import retrofit2.Response;
import retrofit2.adapter.rxjava.Result;

/* compiled from: ObservableTransformations */
/* renamed from: cgl */
public class cgl {
    /* renamed from: a */
    public static <T> C4531c<Result<T>, Response<T>> m13109a() {
        return cgm.m13113a();
    }

    /* renamed from: a */
    static /* synthetic */ dtp m13111a(Result result) {
        if (result.isError()) {
            return dtp.a(result.error());
        }
        Response response = result.response();
        if (response.isSuccessful()) {
            return dtp.a(result.response());
        }
        Throwable ckt;
        response.code();
        String str = "";
        try {
            ckt = new ckt((ApiBaseResponse) djm.a(response.errorBody().string(), ApiBaseResponse.class));
        } catch (IOException e) {
            ckt = null;
        }
        return dtp.a(ckt);
    }

    /* renamed from: a */
    static /* synthetic */ Boolean m13112a(Throwable th) {
        if ((th instanceof ckt) && "Failure".equals(((ckt) th).m14210a())) {
            return Boolean.valueOf(true);
        }
        return Boolean.valueOf(false);
    }
}
