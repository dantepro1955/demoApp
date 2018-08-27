package com.p000;

import android.content.Context;
import android.text.TextUtils;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.share.internal.ShareConstants;
import com.inmobi.commons.analytics.iat.impl.AdTrackerConstants;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

@bhd
/* renamed from: bdn */
public abstract class bdn implements ans {
    /* renamed from: a */
    protected Context f5670a;
    /* renamed from: b */
    protected String f5671b;
    /* renamed from: c */
    protected WeakReference<blo> f5672c;

    public bdn(blo blo) {
        this.f5670a = blo.getContext();
        this.f5671b = ako.m2343e().m9087a(this.f5670a, blo.mo1328o().f15121a);
        this.f5672c = new WeakReference(blo);
    }

    /* renamed from: a */
    private void m7601a(String str, Map<String, String> map) {
        blo blo = (blo) this.f5672c.get();
        if (blo != null) {
            blo.mo1303a(str, (Map) map);
        }
    }

    /* renamed from: c */
    private String m7602c(String str) {
        String str2 = "internal";
        Object obj = -1;
        switch (str.hashCode()) {
            case -1396664534:
                if (str.equals("badUrl")) {
                    obj = 6;
                    break;
                }
                break;
            case -1347010958:
                if (str.equals("inProgress")) {
                    obj = 2;
                    break;
                }
                break;
            case -918817863:
                if (str.equals("downloadTimeout")) {
                    obj = 7;
                    break;
                }
                break;
            case -659376217:
                if (str.equals("contentLengthMissing")) {
                    obj = 3;
                    break;
                }
                break;
            case -642208130:
                if (str.equals("playerFailed")) {
                    obj = 1;
                    break;
                }
                break;
            case -354048396:
                if (str.equals("sizeExceeded")) {
                    obj = 8;
                    break;
                }
                break;
            case -32082395:
                if (str.equals("externalAbort")) {
                    obj = 9;
                    break;
                }
                break;
            case 96784904:
                if (str.equals("error")) {
                    obj = null;
                    break;
                }
                break;
            case 580119100:
                if (str.equals("expireFailed")) {
                    obj = 5;
                    break;
                }
                break;
            case 725497484:
                if (str.equals("noCacheDir")) {
                    obj = 4;
                    break;
                }
                break;
        }
        switch (obj) {
            case null:
            case 1:
            case 2:
            case 3:
                return "internal";
            case 4:
            case 5:
                return "io";
            case 6:
            case 7:
                return "network";
            case 8:
            case 9:
                return "policy";
            default:
                return str2;
        }
    }

    /* renamed from: a */
    public void mo1004a() {
    }

    /* renamed from: a */
    protected void m7604a(final String str, final String str2, final int i) {
        bkx.f6798a.post(new Runnable(this) {
            /* renamed from: d */
            final /* synthetic */ bdn f5664d;

            public void run() {
                Map hashMap = new HashMap();
                hashMap.put("event", "precacheComplete");
                hashMap.put(AdTrackerConstants.SOURCE, str);
                hashMap.put("cachedSrc", str2);
                hashMap.put("totalBytes", Integer.toString(i));
                this.f5664d.m7601a("onPrecacheEvent", hashMap);
            }
        });
    }

    /* renamed from: a */
    protected void m7605a(String str, String str2, int i, int i2, boolean z) {
        final String str3 = str;
        final String str4 = str2;
        final int i3 = i;
        final int i4 = i2;
        final boolean z2 = z;
        bkx.f6798a.post(new Runnable(this) {
            /* renamed from: f */
            final /* synthetic */ bdn f5660f;

            public void run() {
                Map hashMap = new HashMap();
                hashMap.put("event", "precacheProgress");
                hashMap.put(AdTrackerConstants.SOURCE, str3);
                hashMap.put("cachedSrc", str4);
                hashMap.put("bytesLoaded", Integer.toString(i3));
                hashMap.put("totalBytes", Integer.toString(i4));
                hashMap.put("cacheReady", z2 ? "1" : AppEventsConstants.EVENT_PARAM_VALUE_NO);
                this.f5660f.m7601a("onPrecacheEvent", hashMap);
            }
        });
    }

    /* renamed from: a */
    public void m7606a(String str, String str2, String str3, String str4) {
        final String str5 = str;
        final String str6 = str2;
        final String str7 = str3;
        final String str8 = str4;
        bkx.f6798a.post(new Runnable(this) {
            /* renamed from: e */
            final /* synthetic */ bdn f5669e;

            public void run() {
                Map hashMap = new HashMap();
                hashMap.put("event", "precacheCanceled");
                hashMap.put(AdTrackerConstants.SOURCE, str5);
                if (!TextUtils.isEmpty(str6)) {
                    hashMap.put("cachedSrc", str6);
                }
                hashMap.put("type", this.f5669e.m7602c(str7));
                hashMap.put("reason", str7);
                if (!TextUtils.isEmpty(str8)) {
                    hashMap.put(ShareConstants.WEB_DIALOG_PARAM_MESSAGE, str8);
                }
                this.f5669e.m7601a("onPrecacheEvent", hashMap);
            }
        });
    }

    /* renamed from: a */
    public abstract boolean mo1005a(String str);

    /* renamed from: b */
    protected String m7608b(String str) {
        return azp.m6789a().m9286a(str);
    }

    /* renamed from: b */
    public abstract void mo1006b();
}
