package com.p000;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.mopub.common.MoPubBrowser;
import com.mopub.common.Preconditions;
import com.mopub.common.UrlAction;
import com.mopub.common.UrlHandler.Builder;
import com.mopub.common.UrlHandler.ResultActions;
import com.mopub.common.logging.MoPubLog;
import com.mopub.common.util.Intents;
import com.mopub.exceptions.IntentNotResolvableException;
import com.mopub.mobileads.VastTracker;
import com.mopub.network.TrackingRequest;
import java.io.Serializable;
import java.util.List;

/* compiled from: VastIconConfig */
/* renamed from: bzc */
public class bzc implements Serializable {
    private static final long serialVersionUID = 0;
    /* renamed from: a */
    private final int f8270a;
    /* renamed from: b */
    private final int f8271b;
    /* renamed from: c */
    private final int f8272c;
    /* renamed from: d */
    private final Integer f8273d;
    /* renamed from: e */
    private final bzh f8274e;
    /* renamed from: f */
    private final List<VastTracker> f8275f;
    /* renamed from: g */
    private final String f8276g;
    /* renamed from: h */
    private final List<VastTracker> f8277h;

    public bzc(int i, int i2, Integer num, Integer num2, bzh bzh, List<VastTracker> list, String str, List<VastTracker> list2) {
        Preconditions.checkNotNull(bzh);
        Preconditions.checkNotNull(list);
        Preconditions.checkNotNull(list2);
        this.f8270a = i;
        this.f8271b = i2;
        this.f8272c = num == null ? 0 : num.intValue();
        this.f8273d = num2;
        this.f8274e = bzh;
        this.f8275f = list;
        this.f8276g = str;
        this.f8277h = list2;
    }

    /* renamed from: a */
    public int m11862a() {
        return this.f8270a;
    }

    /* renamed from: b */
    public int m11865b() {
        return this.f8271b;
    }

    /* renamed from: c */
    public int m11866c() {
        return this.f8272c;
    }

    /* renamed from: d */
    public Integer m11867d() {
        return this.f8273d;
    }

    /* renamed from: e */
    public bzh m11868e() {
        return this.f8274e;
    }

    /* renamed from: f */
    public List<VastTracker> m11869f() {
        return this.f8275f;
    }

    /* renamed from: a */
    public void m11863a(Context context, int i, String str) {
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(str);
        TrackingRequest.makeVastTrackingHttpRequest(this.f8277h, null, Integer.valueOf(i), str, context);
    }

    /* renamed from: a */
    public void m11864a(final Context context, String str, final String str2) {
        Preconditions.checkNotNull(context);
        Object correctClickThroughUrl = this.f8274e.getCorrectClickThroughUrl(this.f8276g, str);
        if (!TextUtils.isEmpty(correctClickThroughUrl)) {
            new Builder().withSupportedUrlActions(UrlAction.IGNORE_ABOUT_SCHEME, new UrlAction[]{UrlAction.OPEN_NATIVE_BROWSER, UrlAction.OPEN_IN_APP_BROWSER}).withResultActions(new ResultActions(this) {
                /* renamed from: c */
                final /* synthetic */ bzc f8269c;

                public void urlHandlingSucceeded(String str, UrlAction urlAction) {
                    if (urlAction == UrlAction.OPEN_IN_APP_BROWSER) {
                        Bundle bundle = new Bundle();
                        bundle.putString(MoPubBrowser.DESTINATION_URL_KEY, str);
                        if (!TextUtils.isEmpty(str2)) {
                            bundle.putString(MoPubBrowser.DSP_CREATIVE_ID, str2);
                        }
                        try {
                            Intents.startActivity(context, Intents.getStartActivityIntent(context, MoPubBrowser.class, bundle));
                        } catch (IntentNotResolvableException e) {
                            MoPubLog.d(e.getMessage());
                        }
                    }
                }

                public void urlHandlingFailed(String str, UrlAction urlAction) {
                }
            }).withoutMoPubBrowser().build().handleUrl(context, correctClickThroughUrl);
        }
    }
}
