package com.p000;

import android.text.TextUtils;
import android.util.Log;
import com.facebook.internal.AnalyticsEvents;
import com.mopub.common.AdType;
import com.mopub.nativeads.MoPubNativeAdPositioning.MoPubClientPositioning;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* renamed from: bmn */
public final class bmn extends alo<bmn> {
    /* renamed from: a */
    private String f6990a;
    /* renamed from: b */
    private int f6991b;
    /* renamed from: c */
    private int f6992c;
    /* renamed from: d */
    private String f6993d;
    /* renamed from: e */
    private String f6994e;
    /* renamed from: f */
    private boolean f6995f;
    /* renamed from: g */
    private boolean f6996g;

    public bmn() {
        this(false);
    }

    public bmn(boolean z) {
        this(z, bmn.m9710a());
    }

    public bmn(boolean z, int i) {
        aoi.m4678a(i);
        this.f6991b = i;
        this.f6996g = z;
    }

    /* renamed from: a */
    static int m9710a() {
        UUID randomUUID = UUID.randomUUID();
        int leastSignificantBits = (int) (randomUUID.getLeastSignificantBits() & 2147483647L);
        if (leastSignificantBits != 0) {
            return leastSignificantBits;
        }
        leastSignificantBits = (int) (randomUUID.getMostSignificantBits() & 2147483647L);
        if (leastSignificantBits != 0) {
            return leastSignificantBits;
        }
        Log.e("GAv4", "UUID.randomUUID() returned 0.");
        return MoPubClientPositioning.NO_REPEAT;
    }

    /* renamed from: a */
    public void m9711a(int i) {
        this.f6991b = i;
    }

    /* renamed from: a */
    public /* synthetic */ void mo1348a(alo alo) {
        m9713a((bmn) alo);
    }

    /* renamed from: a */
    public void m9713a(bmn bmn) {
        if (!TextUtils.isEmpty(this.f6990a)) {
            bmn.m9714a(this.f6990a);
        }
        if (this.f6991b != 0) {
            bmn.m9711a(this.f6991b);
        }
        if (this.f6992c != 0) {
            bmn.m9717b(this.f6992c);
        }
        if (!TextUtils.isEmpty(this.f6993d)) {
            bmn.m9718b(this.f6993d);
        }
        if (!TextUtils.isEmpty(this.f6994e)) {
            bmn.m9721c(this.f6994e);
        }
        if (this.f6995f) {
            bmn.m9719b(this.f6995f);
        }
        if (this.f6996g) {
            bmn.m9715a(this.f6996g);
        }
    }

    /* renamed from: a */
    public void m9714a(String str) {
        this.f6990a = str;
    }

    /* renamed from: a */
    public void m9715a(boolean z) {
        this.f6996g = z;
    }

    /* renamed from: b */
    public String m9716b() {
        return this.f6990a;
    }

    /* renamed from: b */
    public void m9717b(int i) {
        this.f6992c = i;
    }

    /* renamed from: b */
    public void m9718b(String str) {
        this.f6993d = str;
    }

    /* renamed from: b */
    public void m9719b(boolean z) {
        this.f6995f = z;
    }

    /* renamed from: c */
    public int m9720c() {
        return this.f6991b;
    }

    /* renamed from: c */
    public void m9721c(String str) {
        if (TextUtils.isEmpty(str)) {
            this.f6994e = null;
        } else {
            this.f6994e = str;
        }
    }

    /* renamed from: d */
    public String m9722d() {
        return this.f6994e;
    }

    public String toString() {
        Map hashMap = new HashMap();
        hashMap.put("screenName", this.f6990a);
        hashMap.put(AdType.INTERSTITIAL, Boolean.valueOf(this.f6995f));
        hashMap.put(AnalyticsEvents.PARAMETER_SHARE_DIALOG_SHOW_AUTOMATIC, Boolean.valueOf(this.f6996g));
        hashMap.put("screenId", Integer.valueOf(this.f6991b));
        hashMap.put("referrerScreenId", Integer.valueOf(this.f6992c));
        hashMap.put("referrerScreenName", this.f6993d);
        hashMap.put("referrerUri", this.f6994e);
        return alo.m2502a((Object) hashMap);
    }
}
