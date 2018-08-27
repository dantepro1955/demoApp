package com.p000;

import android.content.Context;
import android.os.Build.VERSION;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.internal.ServerProtocol;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Future;

@bhd
/* renamed from: bbc */
public class bbc {
    /* renamed from: a */
    private boolean f5421a;
    /* renamed from: b */
    private String f5422b;
    /* renamed from: c */
    private Map<String, String> f5423c;
    /* renamed from: d */
    private Context f5424d = null;
    /* renamed from: e */
    private String f5425e = null;

    public bbc(Context context, String str) {
        this.f5424d = context;
        this.f5425e = str;
        this.f5421a = ((Boolean) bbb.f5387T.m7064c()).booleanValue();
        this.f5422b = (String) bbb.f5388U.m7064c();
        this.f5423c = new LinkedHashMap();
        this.f5423c.put("s", "gmob_sdk");
        this.f5423c.put("v", "3");
        this.f5423c.put("os", VERSION.RELEASE);
        this.f5423c.put(ServerProtocol.DIALOG_PARAM_SDK_VERSION, VERSION.SDK);
        this.f5423c.put("device", ako.m2343e().m9135e());
        this.f5423c.put("app", context.getApplicationContext() != null ? context.getApplicationContext().getPackageName() : context.getPackageName());
        this.f5423c.put("is_lite_sdk", ako.m2343e().m9146l(context) ? "1" : AppEventsConstants.EVENT_PARAM_VALUE_NO);
        Future a = ako.m2352n().m8665a(this.f5424d);
        try {
            a.get();
            this.f5423c.put("network_coarse", Integer.toString(((bic) a.get()).f6429m));
            this.f5423c.put("network_fine", Integer.toString(((bic) a.get()).f6430n));
        } catch (Throwable e) {
            ako.m2347i().m8934a(e, "CsiConfiguration.CsiConfiguration");
        }
    }

    /* renamed from: a */
    boolean m7130a() {
        return this.f5421a;
    }

    /* renamed from: b */
    String m7131b() {
        return this.f5422b;
    }

    /* renamed from: c */
    Context m7132c() {
        return this.f5424d;
    }

    /* renamed from: d */
    String m7133d() {
        return this.f5425e;
    }

    /* renamed from: e */
    Map<String, String> m7134e() {
        return this.f5423c;
    }
}
