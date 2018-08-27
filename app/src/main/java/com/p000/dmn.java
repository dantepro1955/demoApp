package com.p000;

import com.ninegag.android.app.upload.SelectSectionActivity;
import com.under9.android.remoteconfig.api.model.ApiAdsResponse.ApiAd;
import com.under9.android.remoteconfig.api.model.ApiAdsResponse.ApiAdConfig;
import com.under9.android.remoteconfig.api.model.ApiAdsResponse.ApiView;
import java.util.HashMap;
import java.util.Map;

/* compiled from: AdsModel */
/* renamed from: dmn */
public class dmn {
    /* renamed from: a */
    public static final dmn f22242a = dmn.m28055b();
    /* renamed from: b */
    public static final dmn f22243b = dmn.m28059c();
    /* renamed from: c */
    private static final Map<C4989a, dmm> f22244c = new HashMap();
    /* renamed from: d */
    private ApiView[] f22245d;

    /* compiled from: AdsModel */
    /* renamed from: dmn$a */
    static final class C4989a {
        /* renamed from: a */
        public final String f22238a;
        /* renamed from: b */
        public final String f22239b;
        /* renamed from: c */
        public final String f22240c;
        /* renamed from: d */
        public final boolean f22241d;

        public C4989a(String str, String str2, String str3, boolean z) {
            this.f22238a = str;
            this.f22239b = str2;
            this.f22240c = str3;
            this.f22241d = z;
        }

        public boolean equals(Object obj) {
            boolean z = true;
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C4989a c4989a = (C4989a) obj;
            if (this.f22238a != null) {
                if (!this.f22238a.equals(c4989a.f22238a)) {
                    return false;
                }
            } else if (c4989a.f22238a != null) {
                return false;
            }
            if (this.f22239b != null) {
                if (!this.f22239b.equals(c4989a.f22239b)) {
                    return false;
                }
            } else if (c4989a.f22239b != null) {
                return false;
            }
            if (this.f22240c != null) {
                if (!this.f22240c.equals(c4989a.f22240c)) {
                    return false;
                }
            } else if (c4989a.f22240c != null) {
                return false;
            }
            if (!(this.f22241d && c4989a.f22241d)) {
                z = false;
            }
            return z;
        }

        public int hashCode() {
            int hashCode;
            int i = 0;
            if (this.f22238a != null) {
                hashCode = this.f22238a.hashCode();
            } else {
                hashCode = 0;
            }
            int i2 = hashCode * 31;
            if (this.f22239b != null) {
                hashCode = this.f22239b.hashCode();
            } else {
                hashCode = 0;
            }
            hashCode = (hashCode + i2) * 31;
            if (this.f22240c != null) {
                i = this.f22240c.hashCode();
            }
            return hashCode + i;
        }
    }

    /* renamed from: a */
    public ApiView[] m28068a() {
        return this.f22245d;
    }

    /* renamed from: a */
    public void m28067a(ApiView[] apiViewArr) {
        this.f22245d = apiViewArr;
    }

    /* renamed from: a */
    public void m28066a(String str) {
        this.f22245d = (ApiView[]) djm.m27592a(str, ApiView[].class);
    }

    /* renamed from: a */
    public dmm m28065a(String str, String str2, String str3) {
        return m28052a(str, str2, str3, false);
    }

    /* renamed from: b */
    public dmm m28069b(String str, String str2, String str3) {
        return m28052a(str, str2, str3, true);
    }

    /* renamed from: a */
    private dmm m28052a(String str, String str2, String str3, boolean z) {
        C4989a c4989a = new C4989a(str, str2, str3, z);
        if (f22244c.containsKey(c4989a)) {
            return (dmm) f22244c.get(c4989a);
        }
        boolean booleanValue;
        dmn dmn = z ? f22243b : f22242a;
        if (dmn.f22245d[0].ads[0].displayAdEnabled != null) {
            booleanValue = dmn.f22245d[0].ads[0].displayAdEnabled.booleanValue();
        } else {
            booleanValue = true;
        }
        dmm dmm = new dmm(str, booleanValue, dmn.f22245d[0].ads[0].config.occurrence);
        dmm c = z ? m28057c(str) : m28054b(str);
        if (c != null) {
            dmm = c;
        }
        if (str2 == null || str3 == null || this.f22245d == null) {
            f22244c.put(c4989a, dmm);
            return dmm;
        }
        String h;
        String b;
        ApiView d;
        ApiView d2 = m28060d(str2);
        if (d2 == null) {
            h = dmn.m28064h(str2);
            if (h.contains("_")) {
                b = SelectSectionActivity.KEY_SECTION.equals(h.split("_")[0]) ? h : z ? dmn.m28056b(SelectSectionActivity.KEY_SECTION, h.split("_")[1]) : dmn.m28053a(SelectSectionActivity.KEY_SECTION, h.split("_")[1]);
                if (z) {
                    b = dmn.m28063g(b);
                }
                d2 = m28060d(b);
                if (d2 == null) {
                    if (z) {
                        d2 = m28060d(dmn.m28063g(dmn.m28064h(h).split("_")[0]));
                    } else {
                        d2 = m28060d(h.split("_")[0]);
                    }
                }
            } else {
                if (z) {
                    b = dmn.m28063g(h);
                } else {
                    b = h;
                }
                h = b;
                d2 = m28060d(b);
            }
        } else {
            h = str2;
        }
        if (d2 == null) {
            b = "section_" + h;
            if (z) {
                b = dmn.m28063g(b);
            }
            d2 = m28060d(b);
        }
        if (d2 == null) {
            if (z) {
                b = dmn.m28063g(h);
            } else {
                b = h;
            }
            d = m28060d(b);
        } else {
            d = d2;
        }
        if (d == null) {
            f22244c.put(c4989a, dmm);
            return dmm;
        }
        ApiAd apiAd = null;
        for (ApiAd apiAd2 : d.ads) {
            if (apiAd2 != null && str3.equalsIgnoreCase(apiAd2.name)) {
                apiAd = apiAd2;
                break;
            }
        }
        if (apiAd != null) {
            if (!dmn.m28061e(apiAd.config.adTag)) {
                str = apiAd.config.adTag;
            }
            c = new dmm(str, apiAd.displayAdEnabled.booleanValue(), apiAd.config.occurrence);
            f22244c.put(c4989a, c);
            return c;
        } else if (d.ads == null || d.ads.length <= 0) {
            f22244c.put(c4989a, dmm);
            return dmm;
        } else {
            dmm.m28048a(d.ads[0].displayAdEnabled.booleanValue());
            f22244c.put(c4989a, dmm);
            return dmm;
        }
    }

    /* renamed from: b */
    private dmm m28054b(String str) {
        return m28058c(str, "list_default");
    }

    /* renamed from: c */
    private dmm m28057c(String str) {
        return m28058c(str, "overlay_default");
    }

    /* renamed from: c */
    private dmm m28058c(String str, String str2) {
        if (this.f22245d != null) {
            for (ApiView apiView : this.f22245d) {
                if (apiView != null && str2.equalsIgnoreCase(apiView.name)) {
                    break;
                }
            }
        }
        ApiView apiView2 = null;
        if (apiView2 == null) {
            return null;
        }
        ApiAd apiAd;
        if (apiView2.ads != null) {
            for (ApiAd apiAd2 : apiView2.ads) {
                if (apiAd2 != null && "inline_ad".equals(apiAd2.name)) {
                    apiAd = apiAd2;
                    break;
                }
            }
        }
        apiAd = null;
        if (apiAd == null) {
            return null;
        }
        boolean z = true;
        if (apiAd.displayAdEnabled != null) {
            z = apiAd.displayAdEnabled.booleanValue();
        }
        if (!dmn.m28061e(apiAd.config.adTag)) {
            str = apiAd.config.adTag;
        }
        return new dmm(str, z, apiAd.config.occurrence);
    }

    /* renamed from: d */
    private ApiView m28060d(String str) {
        for (ApiView apiView : this.f22245d) {
            if (apiView != null && str.equalsIgnoreCase(apiView.name)) {
                return apiView;
            }
        }
        return null;
    }

    /* renamed from: a */
    public static String m28053a(String str, String str2) {
        if (dmn.m28061e(str)) {
            return str2;
        }
        String replaceAll = str.replaceAll("_", "-");
        if (dmn.m28061e(str2)) {
            return replaceAll;
        }
        return replaceAll + "_" + str2;
    }

    /* renamed from: b */
    public static String m28056b(String str, String str2) {
        if ("hotplustrending".equals(str2)) {
            str2 = "hot";
        }
        if (dmn.m28061e(str)) {
            return "overlay_" + str2;
        }
        String replaceAll = str.replaceAll("_", "-");
        if (dmn.m28061e(str2)) {
            return "overlay_" + replaceAll;
        }
        return "overlay_" + replaceAll + "_" + str2;
    }

    /* renamed from: e */
    private static boolean m28061e(String str) {
        if (str == null || str.length() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private static dmn m28055b() {
        return dmn.m28062f("list_default");
    }

    /* renamed from: c */
    private static dmn m28059c() {
        return dmn.m28062f("overlay_default");
    }

    /* renamed from: f */
    private static dmn m28062f(String str) {
        dmn dmn = new dmn();
        dmn.f22245d = new ApiView[1];
        dmn.f22245d[0] = new ApiView();
        dmn.f22245d[0].name = str;
        dmn.f22245d[0].ads = new ApiAd[1];
        dmn.f22245d[0].ads[0] = new ApiAd();
        dmn.f22245d[0].ads[0].name = "inline_ad";
        dmn.f22245d[0].ads[0].displayAdEnabled = Boolean.valueOf(true);
        dmn.f22245d[0].ads[0].config = new ApiAdConfig();
        dmn.f22245d[0].ads[0].config.adTag = "";
        dmn.f22245d[0].ads[0].config.occurrence = "10...10";
        return dmn;
    }

    /* renamed from: g */
    private static String m28063g(String str) {
        if (str.startsWith("overlay_")) {
            return str;
        }
        return "overlay_" + str;
    }

    /* renamed from: h */
    private static String m28064h(String str) {
        if (str.startsWith("overlay_")) {
            return str.substring(8);
        }
        return str;
    }
}
