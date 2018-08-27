package com.p000;

import com.ninegag.android.app.model.api.ApiBaseResponse;

/* compiled from: ApiResponseException */
/* renamed from: ckt */
public class ckt extends RuntimeException {
    /* renamed from: a */
    private String f9612a;
    /* renamed from: b */
    private String f9613b;

    public ckt(ApiBaseResponse apiBaseResponse) {
        String str = (apiBaseResponse == null || apiBaseResponse.meta == null) ? "" : apiBaseResponse.meta.status;
        this.f9612a = str;
        str = (apiBaseResponse == null || apiBaseResponse.meta == null) ? "" : apiBaseResponse.meta.status;
        this.f9613b = str;
    }

    public String getMessage() {
        return this.f9612a;
    }

    /* renamed from: a */
    public String m14210a() {
        return this.f9613b;
    }
}
