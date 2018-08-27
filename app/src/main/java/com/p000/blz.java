package com.p000;

import android.annotation.TargetApi;
import android.content.Context;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.facebook.stetho.common.Utf8Charset;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@TargetApi(11)
@bhd
/* renamed from: blz */
public class blz extends blp {
    public blz(blo blo, boolean z) {
        super(blo, z);
    }

    /* renamed from: a */
    protected WebResourceResponse m9606a(Context context, String str, String str2) throws IOException, ExecutionException, InterruptedException, TimeoutException {
        Map hashMap = new HashMap();
        hashMap.put("User-Agent", ako.m2343e().m9087a(context, str));
        hashMap.put("Cache-Control", "max-stale=3600");
        String str3 = (String) new bkn(context).m9255a(str2, hashMap).get(60, TimeUnit.SECONDS);
        return str3 == null ? null : new WebResourceResponse("application/javascript", Utf8Charset.NAME, new ByteArrayInputStream(str3.getBytes(Utf8Charset.NAME)));
    }

    /* renamed from: a */
    protected WebResourceResponse m9607a(WebView webView, String str, Map<String, String> map) {
        Exception e;
        String valueOf;
        if (webView instanceof blo) {
            blo blo = (blo) webView;
            if (!"mraid.js".equalsIgnoreCase(new File(str).getName())) {
                return super.shouldInterceptRequest(webView, str);
            }
            if (blo.mo1322l() != null) {
                blo.mo1322l().m9438o();
            }
            String str2 = blo.mo1321k().f14934d ? (String) bbb.f5386S.m7064c() : blo.mo1331p() ? (String) bbb.f5385R.m7064c() : (String) bbb.f5384Q.m7064c();
            try {
                return m9606a(blo.getContext(), blo.mo1328o().f15121a, str2);
            } catch (IOException e2) {
                e = e2;
                str2 = "Could not fetch MRAID JS. ";
                valueOf = String.valueOf(e.getMessage());
                bky.m9011e(valueOf.length() == 0 ? str2.concat(valueOf) : new String(str2));
                return null;
            } catch (ExecutionException e3) {
                e = e3;
                str2 = "Could not fetch MRAID JS. ";
                valueOf = String.valueOf(e.getMessage());
                if (valueOf.length() == 0) {
                }
                bky.m9011e(valueOf.length() == 0 ? str2.concat(valueOf) : new String(str2));
                return null;
            } catch (InterruptedException e4) {
                e = e4;
                str2 = "Could not fetch MRAID JS. ";
                valueOf = String.valueOf(e.getMessage());
                if (valueOf.length() == 0) {
                }
                bky.m9011e(valueOf.length() == 0 ? str2.concat(valueOf) : new String(str2));
                return null;
            } catch (TimeoutException e5) {
                e = e5;
                str2 = "Could not fetch MRAID JS. ";
                valueOf = String.valueOf(e.getMessage());
                if (valueOf.length() == 0) {
                }
                bky.m9011e(valueOf.length() == 0 ? str2.concat(valueOf) : new String(str2));
                return null;
            }
        }
        bky.m9011e("Tried to intercept request from a WebView that wasn't an AdWebView.");
        return null;
    }
}
