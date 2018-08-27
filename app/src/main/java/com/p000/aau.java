package com.p000;

import android.annotation.TargetApi;
import android.app.Application;
import android.content.Context;
import android.os.Build.VERSION;
import android.text.TextUtils;
import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Kit;
import io.fabric.sdk.android.services.cache.MemoryValueCache;
import io.fabric.sdk.android.services.common.CommonUtils;
import io.fabric.sdk.android.services.common.DeviceIdentifierProvider;
import io.fabric.sdk.android.services.common.IdManager;
import io.fabric.sdk.android.services.common.IdManager.DeviceIdentifierType;
import io.fabric.sdk.android.services.common.SystemCurrentTimeProvider;
import io.fabric.sdk.android.services.network.DefaultHttpRequestFactory;
import io.fabric.sdk.android.services.persistence.PreferenceStoreImpl;
import io.fabric.sdk.android.services.settings.BetaSettingsData;
import io.fabric.sdk.android.services.settings.Settings;
import io.fabric.sdk.android.services.settings.SettingsData;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Beta */
/* renamed from: aau */
public class aau extends Kit<Boolean> implements DeviceIdentifierProvider {
    /* renamed from: a */
    private final MemoryValueCache<String> f141a = new MemoryValueCache();
    /* renamed from: b */
    private final aaz f142b = new aaz();
    /* renamed from: c */
    private abb f143c;

    /* renamed from: f */
    protected /* synthetic */ Object m128f() {
        return m126d();
    }

    @TargetApi(14)
    protected boolean f_() {
        this.f143c = m122a(VERSION.SDK_INT, (Application) r().getApplicationContext());
        return true;
    }

    /* renamed from: d */
    protected Boolean m126d() {
        Fabric.h().a("Beta", "Beta kit initializing...");
        Context r = r();
        IdManager q = q();
        if (TextUtils.isEmpty(m120a(r, q.j()))) {
            Fabric.h().a("Beta", "A Beta device token was not found for this app");
            return Boolean.valueOf(false);
        }
        Fabric.h().a("Beta", "Beta device token is present, checking for app updates.");
        BetaSettingsData h = m121h();
        aav a = m119a(r);
        if (m124a(h, a)) {
            this.f143c.mo7a(r, this, q, h, a, new PreferenceStoreImpl(this), new SystemCurrentTimeProvider(), new DefaultHttpRequestFactory(Fabric.h()));
        }
        return Boolean.valueOf(true);
    }

    @TargetApi(14)
    /* renamed from: a */
    abb m122a(int i, Application application) {
        if (i >= 14) {
            return new aat(s().e(), s().f());
        }
        return new aba();
    }

    /* renamed from: e */
    public Map<DeviceIdentifierType, String> m127e() {
        CharSequence a = m120a(r(), q().j());
        Map<DeviceIdentifierType, String> hashMap = new HashMap();
        if (!TextUtils.isEmpty(a)) {
            hashMap.put(DeviceIdentifierType.f23997c, a);
        }
        return hashMap;
    }

    /* renamed from: b */
    public String m125b() {
        return "com.crashlytics.sdk.android:beta";
    }

    /* renamed from: a */
    public String m123a() {
        return "1.2.5.dev";
    }

    /* renamed from: a */
    boolean m124a(BetaSettingsData betaSettingsData, aav aav) {
        return (betaSettingsData == null || TextUtils.isEmpty(betaSettingsData.f24203a) || aav == null) ? false : true;
    }

    /* renamed from: a */
    private String m120a(Context context, String str) {
        Object obj;
        try {
            obj = (String) this.f141a.a(context, this.f142b);
            if ("".equals(obj)) {
                obj = null;
            }
        } catch (Throwable e) {
            Fabric.h().e("Beta", "Failed to load the Beta device token", e);
            obj = null;
        }
        Fabric.h().a("Beta", "Beta device token present: " + (!TextUtils.isEmpty(obj)));
        return obj;
    }

    /* renamed from: h */
    private BetaSettingsData m121h() {
        SettingsData b = Settings.a().b();
        if (b != null) {
            return b.f24249f;
        }
        return null;
    }

    /* renamed from: a */
    private aav m119a(Context context) {
        Throwable th;
        Throwable e;
        Throwable th2;
        aav aav;
        InputStream inputStream = null;
        InputStream open;
        try {
            open = context.getAssets().open("crashlytics-build.properties");
            Object obj;
            if (open != null) {
                aav a;
                try {
                    a = aav.m130a(open);
                } catch (Throwable e2) {
                    th = e2;
                    obj = inputStream;
                    th2 = th;
                    try {
                        Fabric.h().e("Beta", "Error reading Beta build properties", th2);
                        if (open != null) {
                            try {
                                open.close();
                            } catch (Throwable th22) {
                                Fabric.h().e("Beta", "Error closing Beta build properties asset", th22);
                            }
                        }
                        return aav;
                    } catch (Throwable th3) {
                        e2 = th3;
                        if (open != null) {
                            try {
                                open.close();
                            } catch (Throwable th222) {
                                Fabric.h().e("Beta", "Error closing Beta build properties asset", th222);
                            }
                        }
                        throw e2;
                    }
                }
                try {
                    Fabric.h().a("Beta", a.f147d + " build properties: " + a.f145b + " (" + a.f144a + ") - " + a.f146c);
                    aav = a;
                } catch (Throwable e22) {
                    th = e22;
                    aav = a;
                    th222 = th;
                    Fabric.h().e("Beta", "Error reading Beta build properties", th222);
                    if (open != null) {
                        open.close();
                    }
                    return aav;
                }
            }
            obj = inputStream;
            if (open != null) {
                try {
                    open.close();
                } catch (Throwable th2222) {
                    Fabric.h().e("Beta", "Error closing Beta build properties asset", th2222);
                }
            }
        } catch (Throwable e222) {
            open = inputStream;
            InputStream inputStream2 = inputStream;
            th2222 = e222;
            aav = inputStream2;
            Fabric.h().e("Beta", "Error reading Beta build properties", th2222);
            if (open != null) {
                open.close();
            }
            return aav;
        } catch (Throwable th4) {
            e222 = th4;
            open = inputStream;
            if (open != null) {
                open.close();
            }
            throw e222;
        }
        return aav;
    }

    /* renamed from: g */
    String m129g() {
        return CommonUtils.b(r(), "com.crashlytics.ApiEndpoint");
    }
}
