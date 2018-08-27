package com.p000;

import android.content.Context;
import android.text.TextUtils;
import com.facebook.internal.ServerProtocol;
import com.google.android.gms.internal.zzqh;
import java.util.Map;
import org.json.JSONObject;
import p000.blh.C0242c;
import p000.blh.C1318b;

@bhd
/* renamed from: aka */
public class aka {
    /* renamed from: a */
    private final Object f1784a = new Object();
    /* renamed from: b */
    private Context f1785b;

    /* renamed from: a */
    private static boolean m2109a(bjv bjv) {
        if (bjv == null) {
            return true;
        }
        boolean z = (((ako.m2349k().mo606a() - bjv.m8915a()) > ((Long) bbb.cF.m7064c()).longValue() ? 1 : ((ako.m2349k().mo606a() - bjv.m8915a()) == ((Long) bbb.cF.m7064c()).longValue() ? 0 : -1)) > 0) || !bjv.m8916b();
        return z;
    }

    /* renamed from: a */
    public void m2111a(Context context, zzqh zzqh, String str, bjv bjv) {
        m2113a(context, zzqh, false, bjv, bjv != null ? null : bjv.m8918d(), str, null);
    }

    /* renamed from: a */
    public void m2112a(Context context, zzqh zzqh, String str, Runnable runnable) {
        m2113a(context, zzqh, true, null, str, null, runnable);
    }

    /* renamed from: a */
    void m2113a(Context context, zzqh zzqh, boolean z, bjv bjv, String str, String str2, Runnable runnable) {
        if (!aka.m2109a(bjv)) {
            return;
        }
        if (context == null) {
            bky.m9011e("Context not provided to fetch application settings");
        } else if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
            bky.m9011e("App settings could not be fetched. Required parameters missing");
        } else {
            this.f1785b = context;
            final bee a = ako.m2343e().m9084a(context, zzqh);
            final Runnable runnable2 = runnable;
            final bcy c02411 = new bcy(this) {
                /* renamed from: b */
                final /* synthetic */ aka f1776b;

                /* renamed from: a */
                public void mo277a(blo blo, Map<String, String> map) {
                    blo.mo1028b("/appSettingsFetched", (bcy) this);
                    synchronized (this.f1776b.f1784a) {
                        if (map != null) {
                            if (ServerProtocol.DIALOG_RETURN_SCOPES_TRUE.equalsIgnoreCase((String) map.get("isSuccessful"))) {
                                ako.m2347i().m8947d(this.f1776b.f1785b, (String) map.get("appSettingsJson"));
                                try {
                                    if (runnable2 != null) {
                                        runnable2.run();
                                    }
                                } catch (Throwable th) {
                                    ako.m2347i().m8934a(th, "ConfigLoader.maybeFetchNewAppSettings");
                                    bky.m9009c("ConfigLoader post task failed.", th);
                                }
                            }
                        }
                    }
                }
            };
            final String str3 = str;
            final String str4 = str2;
            final boolean z2 = z;
            final Context context2 = context;
            bkg.f6710a.post(new Runnable(this) {

                /* renamed from: aka$2$1 */
                class C02431 implements C0242c<bef> {
                    /* renamed from: a */
                    final /* synthetic */ C02442 f1777a;

                    C02431(C02442 c02442) {
                        this.f1777a = c02442;
                    }

                    /* renamed from: a */
                    public void m2106a(bef bef) {
                        bef.mo1023a("/appSettingsFetched", c02411);
                        try {
                            JSONObject jSONObject = new JSONObject();
                            if (!TextUtils.isEmpty(str3)) {
                                jSONObject.put("app_id", str3);
                            } else if (!TextUtils.isEmpty(str4)) {
                                jSONObject.put("ad_unit_id", str4);
                            }
                            jSONObject.put("is_init", z2);
                            jSONObject.put("pn", context2.getPackageName());
                            bef.mo1025a("AFMA_fetchAppSettings", jSONObject);
                        } catch (Throwable e) {
                            bef.mo1028b("/appSettingsFetched", c02411);
                            bky.m9007b("Error requesting application settings", e);
                        }
                    }

                    /* renamed from: a */
                    public /* synthetic */ void mo289a(Object obj) {
                        m2106a((bef) obj);
                    }
                }

                public void run() {
                    a.m7834a().mo1032a(new C02431(this), new C1318b());
                }
            });
        }
    }
}
