package com.p000;

import android.content.Context;
import android.text.TextUtils;
import com.mopub.common.AdUrlGenerator;
import com.mopub.common.ClientMetadata;
import com.mopub.common.Constants;
import com.mopub.nativeads.RequestParameters;

/* compiled from: NativeUrlGenerator */
/* renamed from: bzu */
public class bzu extends AdUrlGenerator {
    /* renamed from: e */
    private String f8344e;
    /* renamed from: f */
    private String f8345f;

    public bzu(Context context) {
        super(context);
    }

    public bzu withAdUnitId(String str) {
        this.b = str;
        return this;
    }

    /* renamed from: a */
    public bzu m11960a(RequestParameters requestParameters) {
        if (requestParameters != null) {
            this.c = requestParameters.getKeywords();
            this.d = requestParameters.getLocation();
            this.f8344e = requestParameters.getDesiredAssets();
        }
        return this;
    }

    /* renamed from: a */
    public bzu m11959a(int i) {
        this.f8345f = String.valueOf(i);
        return this;
    }

    public String generateUrlString(String str) {
        a(str, Constants.AD_HANDLER);
        m11945a(ClientMetadata.getInstance(this.a));
        m11958d();
        m11957c();
        return a();
    }

    /* renamed from: c */
    private void m11957c() {
        if (!TextUtils.isEmpty(this.f8345f)) {
            b("MAGIC_NO", this.f8345f);
        }
    }

    /* renamed from: d */
    private void m11958d() {
        if (!TextUtils.isEmpty(this.f8344e)) {
            b("assets", this.f8344e);
        }
    }

    /* renamed from: b */
    protected void mo1627b(String str) {
        b("nsv", str);
    }
}
