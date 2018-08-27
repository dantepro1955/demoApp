package com.p000;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import android.view.View.OnClickListener;
import com.facebook.ads.AudienceNetworkActivity;
import com.facebook.applinks.AppLinkData;
import com.facebook.stetho.common.Utf8Charset;
import com.millennialmedia.NativeAd;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p000.ajz.C0237a;
import p000.bcc.C0995a;
import p000.blp.C0197a;

@bhd
/* renamed from: akh */
public class akh {

    /* renamed from: akh$1 */
    class C02521 implements C0197a {
        /* renamed from: a */
        final /* synthetic */ bbs f1830a;
        /* renamed from: b */
        final /* synthetic */ String f1831b;
        /* renamed from: c */
        final /* synthetic */ blo f1832c;

        C02521(bbs bbs, String str, blo blo) {
            this.f1830a = bbs;
            this.f1831b = str;
            this.f1832c = blo;
        }

        /* renamed from: a */
        public void mo193a(blo blo, boolean z) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("headline", this.f1830a.mo924a());
                jSONObject.put(NativeAd.COMPONENT_ID_BODY, this.f1830a.mo927c());
                jSONObject.put("call_to_action", this.f1830a.mo929e());
                jSONObject.put("price", this.f1830a.mo932h());
                jSONObject.put("star_rating", String.valueOf(this.f1830a.mo930f()));
                jSONObject.put("store", this.f1830a.mo931g());
                jSONObject.put("icon", akh.m2205a(this.f1830a.mo928d()));
                JSONArray jSONArray = new JSONArray();
                List<Object> b = this.f1830a.mo926b();
                if (b != null) {
                    for (Object a : b) {
                        jSONArray.put(akh.m2205a(akh.m2213b(a)));
                    }
                }
                jSONObject.put("images", jSONArray);
                jSONObject.put(AppLinkData.ARGUMENTS_EXTRAS_KEY, akh.m2216b(this.f1830a.mo938n(), this.f1831b));
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("assets", jSONObject);
                jSONObject2.put("template_id", "2");
                this.f1832c.mo1025a("google.afma.nativeExpressAds.loadAssets", jSONObject2);
            } catch (Throwable e) {
                bky.m9009c("Exception occurred when loading assets", e);
            }
        }
    }

    /* renamed from: akh$2 */
    class C02532 implements C0197a {
        /* renamed from: a */
        final /* synthetic */ bbt f1833a;
        /* renamed from: b */
        final /* synthetic */ String f1834b;
        /* renamed from: c */
        final /* synthetic */ blo f1835c;

        C02532(bbt bbt, String str, blo blo) {
            this.f1833a = bbt;
            this.f1834b = str;
            this.f1835c = blo;
        }

        /* renamed from: a */
        public void mo193a(blo blo, boolean z) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("headline", this.f1833a.mo941a());
                jSONObject.put(NativeAd.COMPONENT_ID_BODY, this.f1833a.mo942c());
                jSONObject.put("call_to_action", this.f1833a.mo944e());
                jSONObject.put("advertiser", this.f1833a.mo945f());
                jSONObject.put("logo", akh.m2205a(this.f1833a.mo943d()));
                JSONArray jSONArray = new JSONArray();
                List<Object> b = this.f1833a.mo926b();
                if (b != null) {
                    for (Object a : b) {
                        jSONArray.put(akh.m2205a(akh.m2213b(a)));
                    }
                }
                jSONObject.put("images", jSONArray);
                jSONObject.put(AppLinkData.ARGUMENTS_EXTRAS_KEY, akh.m2216b(this.f1833a.mo948i(), this.f1834b));
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("assets", jSONObject);
                jSONObject2.put("template_id", "1");
                this.f1835c.mo1025a("google.afma.nativeExpressAds.loadAssets", jSONObject2);
            } catch (Throwable e) {
                bky.m9009c("Exception occurred when loading assets", e);
            }
        }
    }

    /* renamed from: akh$3 */
    class C02543 implements bcy {
        /* renamed from: a */
        final /* synthetic */ CountDownLatch f1836a;

        C02543(CountDownLatch countDownLatch) {
            this.f1836a = countDownLatch;
        }

        /* renamed from: a */
        public void mo277a(blo blo, Map<String, String> map) {
            this.f1836a.countDown();
            blo.mo1305b().setVisibility(0);
        }
    }

    /* renamed from: akh$4 */
    class C02554 implements bcy {
        /* renamed from: a */
        final /* synthetic */ CountDownLatch f1837a;

        C02554(CountDownLatch countDownLatch) {
            this.f1837a = countDownLatch;
        }

        /* renamed from: a */
        public void mo277a(blo blo, Map<String, String> map) {
            bky.m9011e("Adapter returned an ad, but assets substitution failed");
            this.f1837a.countDown();
            blo.destroy();
        }
    }

    /* renamed from: akh$5 */
    class C02565 implements bcy {
        /* renamed from: a */
        final /* synthetic */ bfb f1838a;
        /* renamed from: b */
        final /* synthetic */ C0237a f1839b;
        /* renamed from: c */
        final /* synthetic */ bfc f1840c;

        C02565(bfb bfb, C0237a c0237a, bfc bfc) {
            this.f1838a = bfb;
            this.f1839b = c0237a;
            this.f1840c = bfc;
        }

        /* renamed from: a */
        public void mo277a(blo blo, Map<String, String> map) {
            Object b = blo.mo1305b();
            if (b != null) {
                try {
                    if (this.f1838a != null) {
                        if (this.f1838a.mo1093k()) {
                            akh.m2217b(blo);
                            return;
                        }
                        this.f1838a.mo1081a(aqr.m4967a(b));
                        this.f1839b.m2073a();
                    } else if (this.f1840c == null) {
                    } else {
                        if (this.f1840c.mo1108i()) {
                            akh.m2217b(blo);
                            return;
                        }
                        this.f1840c.mo1098a(aqr.m4967a(b));
                        this.f1839b.m2073a();
                    }
                } catch (Throwable e) {
                    bky.m9009c("Unable to call handleClick on mapper", e);
                }
            }
        }
    }

    /* renamed from: a */
    public static View m2198a(bjt bjt) {
        if (bjt == null) {
            bky.m9008c("AdState is null");
            return null;
        } else if (akh.m2218b(bjt) && bjt.f6547b != null) {
            return bjt.f6547b.mo1305b();
        } else {
            try {
                aqq a = bjt.f6561p != null ? bjt.f6561p.mo1054a() : null;
                if (a != null) {
                    return (View) aqr.m4968a(a);
                }
                bky.m9011e("View in mediation adapter is null.");
                return null;
            } catch (Throwable e) {
                bky.m9009c("Could not get View from mediation adapter.", e);
                return null;
            }
        }
    }

    /* renamed from: a */
    private static bbs m2199a(bfb bfb) throws RemoteException {
        return new bbs(bfb.mo1080a(), bfb.mo1082b(), bfb.mo1084c(), bfb.mo1086d(), bfb.mo1087e(), bfb.mo1088f(), bfb.mo1089g(), bfb.mo1090h(), null, bfb.mo1094l(), null, null);
    }

    /* renamed from: a */
    private static bbt m2200a(bfc bfc) throws RemoteException {
        return new bbt(bfc.mo1097a(), bfc.mo1099b(), bfc.mo1101c(), bfc.mo1103d(), bfc.mo1104e(), bfc.mo1105f(), null, bfc.mo1109j(), null, null);
    }

    /* renamed from: a */
    static bcy m2202a(bfb bfb, bfc bfc, C0237a c0237a) {
        return new C02565(bfb, c0237a, bfc);
    }

    /* renamed from: a */
    static bcy m2203a(CountDownLatch countDownLatch) {
        return new C02543(countDownLatch);
    }

    /* renamed from: a */
    private static String m2204a(Bitmap bitmap) {
        OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        if (bitmap == null) {
            bky.m9011e("Bitmap is null. Returning empty string");
            return "";
        }
        bitmap.compress(CompressFormat.PNG, 100, byteArrayOutputStream);
        String encodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
        String valueOf = String.valueOf("data:image/png;base64,");
        encodeToString = String.valueOf(encodeToString);
        return encodeToString.length() != 0 ? valueOf.concat(encodeToString) : new String(valueOf);
    }

    /* renamed from: a */
    static String m2205a(bcc bcc) {
        if (bcc == null) {
            bky.m9011e("Image is null. Returning empty string");
            return "";
        }
        try {
            Uri b = bcc.mo922b();
            if (b != null) {
                return b.toString();
            }
        } catch (RemoteException e) {
            bky.m9011e("Unable to get image uri. Trying data uri next");
        }
        return akh.m2215b(bcc);
    }

    /* renamed from: a */
    public static void m2207a(bjt bjt, C0237a c0237a) {
        bfc bfc = null;
        if (bjt != null && akh.m2218b(bjt)) {
            blo blo = bjt.f6547b;
            Object b = blo != null ? blo.mo1305b() : null;
            if (b == null) {
                bky.m9011e("AdWebView is null");
                return;
            }
            try {
                List list = bjt.f6560o != null ? bjt.f6560o.f5836o : null;
                if (list == null || list.isEmpty()) {
                    bky.m9011e("No template ids present in mediation response");
                    return;
                }
                bfb h = bjt.f6561p != null ? bjt.f6561p.mo1071h() : null;
                if (bjt.f6561p != null) {
                    bfc = bjt.f6561p.mo1072i();
                }
                if (list.contains("2") && h != null) {
                    h.mo1083b(aqr.m4967a(b));
                    if (!h.mo1092j()) {
                        h.mo1091i();
                    }
                    blo.mo1322l().m9419a("/nativeExpressViewClicked", akh.m2202a(h, null, c0237a));
                } else if (!list.contains("1") || bfc == null) {
                    bky.m9011e("No matching template id and mapper");
                } else {
                    bfc.mo1100b(aqr.m4967a(b));
                    if (!bfc.mo1107h()) {
                        bfc.mo1106g();
                    }
                    blo.mo1322l().m9419a("/nativeExpressViewClicked", akh.m2202a(null, bfc, c0237a));
                }
            } catch (Throwable e) {
                bky.m9009c("Error occurred while recording impression and registering for clicks", e);
            }
        }
    }

    /* renamed from: a */
    private static void m2209a(blo blo, bbs bbs, String str) {
        blo.mo1322l().m9413a(new C02521(bbs, str, blo));
    }

    /* renamed from: a */
    private static void m2210a(blo blo, bbt bbt, String str) {
        blo.mo1322l().m9413a(new C02532(bbt, str, blo));
    }

    /* renamed from: a */
    private static void m2211a(blo blo, CountDownLatch countDownLatch) {
        blo.mo1322l().m9419a("/nativeExpressAssetsLoaded", akh.m2203a(countDownLatch));
        blo.mo1322l().m9419a("/nativeExpressAssetsLoadingFailed", akh.m2214b(countDownLatch));
    }

    /* renamed from: a */
    public static boolean m2212a(blo blo, ber ber, CountDownLatch countDownLatch) {
        boolean z = false;
        try {
            z = akh.m2219b(blo, ber, countDownLatch);
        } catch (Throwable e) {
            bky.m9009c("Unable to invoke load assets", e);
        } catch (RuntimeException e2) {
            countDownLatch.countDown();
            throw e2;
        }
        if (!z) {
            countDownLatch.countDown();
        }
        return z;
    }

    /* renamed from: b */
    private static bcc m2213b(Object obj) {
        return obj instanceof IBinder ? C0995a.m7208a((IBinder) obj) : null;
    }

    /* renamed from: b */
    static bcy m2214b(CountDownLatch countDownLatch) {
        return new C02554(countDownLatch);
    }

    /* renamed from: b */
    private static String m2215b(bcc bcc) {
        try {
            aqq a = bcc.mo921a();
            if (a == null) {
                bky.m9011e("Drawable is null. Returning empty string");
                return "";
            }
            Drawable drawable = (Drawable) aqr.m4968a(a);
            if (drawable instanceof BitmapDrawable) {
                return akh.m2204a(((BitmapDrawable) drawable).getBitmap());
            }
            bky.m9011e("Drawable is not an instance of BitmapDrawable. Returning empty string");
            return "";
        } catch (RemoteException e) {
            bky.m9011e("Unable to get drawable. Returning empty string");
            return "";
        }
    }

    /* renamed from: b */
    private static JSONObject m2216b(Bundle bundle, String str) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (bundle == null || TextUtils.isEmpty(str)) {
            return jSONObject;
        }
        JSONObject jSONObject2 = new JSONObject(str);
        Iterator keys = jSONObject2.keys();
        while (keys.hasNext()) {
            String str2 = (String) keys.next();
            if (bundle.containsKey(str2)) {
                if ("image".equals(jSONObject2.getString(str2))) {
                    Object obj = bundle.get(str2);
                    if (obj instanceof Bitmap) {
                        jSONObject.put(str2, akh.m2204a((Bitmap) obj));
                    } else {
                        bky.m9011e("Invalid type. An image type extra should return a bitmap");
                    }
                } else if (bundle.get(str2) instanceof Bitmap) {
                    bky.m9011e("Invalid asset type. Bitmap should be returned only for image type");
                } else {
                    jSONObject.put(str2, String.valueOf(bundle.get(str2)));
                }
            }
        }
        return jSONObject;
    }

    /* renamed from: b */
    private static void m2217b(blo blo) {
        OnClickListener D = blo.mo1291D();
        if (D != null) {
            D.onClick(blo.mo1305b());
        }
    }

    /* renamed from: b */
    public static boolean m2218b(bjt bjt) {
        return (bjt == null || !bjt.f6559n || bjt.f6560o == null || bjt.f6560o.f5833l == null) ? false : true;
    }

    /* renamed from: b */
    private static boolean m2219b(blo blo, ber ber, CountDownLatch countDownLatch) throws RemoteException {
        View b = blo.mo1305b();
        if (b == null) {
            bky.m9011e("AdWebView is null");
            return false;
        }
        b.setVisibility(4);
        List list = ber.f5879b.f5836o;
        if (list == null || list.isEmpty()) {
            bky.m9011e("No template ids present in mediation response");
            return false;
        }
        akh.m2211a(blo, countDownLatch);
        bfb h = ber.f5880c.mo1071h();
        bfc i = ber.f5880c.mo1072i();
        if (list.contains("2") && h != null) {
            akh.m2209a(blo, akh.m2199a(h), ber.f5879b.f5835n);
        } else if (!list.contains("1") || i == null) {
            bky.m9011e("No matching template id and mapper");
            return false;
        } else {
            akh.m2210a(blo, akh.m2200a(i), ber.f5879b.f5835n);
        }
        String str = ber.f5879b.f5833l;
        String str2 = ber.f5879b.f5834m;
        if (str2 != null) {
            blo.loadDataWithBaseURL(str2, str, AudienceNetworkActivity.WEBVIEW_MIME_TYPE, Utf8Charset.NAME, null);
        } else {
            blo.loadData(str, AudienceNetworkActivity.WEBVIEW_MIME_TYPE, Utf8Charset.NAME);
        }
        return true;
    }
}
