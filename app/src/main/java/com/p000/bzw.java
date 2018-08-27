package com.p000;

import android.content.Context;
import com.mopub.common.BaseUrlGenerator;
import com.mopub.common.ClientMetadata;
import com.mopub.common.Constants;

/* compiled from: PositioningUrlGenerator */
/* renamed from: bzw */
class bzw extends BaseUrlGenerator {
    /* renamed from: a */
    private final Context f8353a;
    /* renamed from: b */
    private String f8354b;

    public bzw(Context context) {
        this.f8353a = context;
    }

    public bzw withAdUnitId(String str) {
        this.f8354b = str;
        return this;
    }

    public String generateUrlString(String str) {
        a(str, Constants.POSITIONING_HANDLER);
        m11982a(this.f8354b);
        k("1");
        ClientMetadata instance = ClientMetadata.getInstance(this.f8353a);
        m11983b(instance.getSdkVersion());
        a(new String[]{instance.getDeviceManufacturer(), instance.getDeviceModel(), instance.getDeviceProduct()});
        l(instance.getAppVersion());
        b();
        return a();
    }

    /* renamed from: a */
    private void m11982a(String str) {
        b("id", str);
    }

    /* renamed from: b */
    private void m11983b(String str) {
        b("nsv", str);
    }
}
