package com.p000;

import android.content.Context;
import android.content.Intent;
import com.facebook.appevents.AppEventsConstants;
import com.ninegag.android.app.model.api.ApiBaseResponse;
import com.ninegag.android.app.model.api.ApiPostsResponse;
import com.ninegag.android.app.otto.response.GagPostListResponseEvent;

/* compiled from: GetTopGagPostListTask */
/* renamed from: cmw */
public class cmw extends cmq {
    public cmw(Intent intent) {
        super(intent);
    }

    /* renamed from: a */
    public static void m14648a(Intent intent, String str, String str2, String str3, int i) {
        intent.putExtra("list_type", 14);
        intent.putExtra("group_id", str);
        intent.putExtra("scope", str3);
        intent.putExtra("type", i);
        intent.putExtra("list_key", str2);
    }

    /* renamed from: a */
    protected String mo1813a(ApiPostsResponse apiPostsResponse) {
        if (apiPostsResponse == null || apiPostsResponse.data == null || apiPostsResponse.data.posts == null) {
            return AppEventsConstants.EVENT_PARAM_VALUE_NO;
        }
        if (this.g == 1 || this.g == 0) {
            return apiPostsResponse.data.nextRefKey;
        }
        if (this.g == 2) {
            return apiPostsResponse.data.prevRefKey;
        }
        return AppEventsConstants.EVENT_PARAM_VALUE_NO;
    }

    /* renamed from: a */
    public void mo1800a(ApiBaseResponse apiBaseResponse) {
        final ApiPostsResponse apiPostsResponse = (ApiPostsResponse) apiBaseResponse;
        m14605b(apiBaseResponse);
        this.e.m12075g().m13707a(new Runnable(this) {
            /* renamed from: b */
            final /* synthetic */ cmw f9812b;

            public void run() {
                boolean z = false;
                String str = null;
                if (this.f9812b.g == 0) {
                    this.f9812b.e.m12075g().f9370c.m13831h(this.f9812b.h);
                }
                String a;
                cin cin;
                String str2;
                switch (this.f9812b.g) {
                    case 0:
                        a = this.f9812b.mo1813a(apiPostsResponse);
                        cin = this.f9812b.e.m12075g().f9370c;
                        str2 = this.f9812b.h;
                        if (apiPostsResponse.data.didEndOfList == 0) {
                            z = true;
                        }
                        cin.m13822a(str2, a, z, apiPostsResponse.data.separators, apiPostsResponse.data.targetedAdTags == null ? null : apiPostsResponse.data.targetedAdTags.m11072l().toString());
                        cin = this.f9812b.e.m12075g().f9370c;
                        str2 = this.f9812b.h;
                        if (apiPostsResponse.data.targetedAdTags != null) {
                            str = apiPostsResponse.data.targetedAdTags.m11072l().toString();
                        }
                        cin.m13825b(str2, a, true, str);
                        this.f9812b.e.m12057a(this.f9812b.h, apiPostsResponse.data.separators);
                        break;
                    case 1:
                        a = this.f9812b.mo1813a(apiPostsResponse);
                        cin = this.f9812b.e.m12075g().f9370c;
                        str2 = this.f9812b.h;
                        if (apiPostsResponse.data.didEndOfList == 0) {
                            z = true;
                        }
                        cin.m13822a(str2, a, z, apiPostsResponse.data.separators, apiPostsResponse.data.targetedAdTags == null ? null : apiPostsResponse.data.targetedAdTags.m11072l().toString());
                        this.f9812b.e.m12057a(this.f9812b.h, apiPostsResponse.data.separators);
                        break;
                    case 2:
                        String a2 = this.f9812b.mo1813a(apiPostsResponse);
                        cin cin2 = this.f9812b.e.m12075g().f9370c;
                        a = this.f9812b.h;
                        if (apiPostsResponse.data.targetedAdTags != null) {
                            str = apiPostsResponse.data.targetedAdTags.m11072l().toString();
                        }
                        cin2.m13825b(a, a2, true, str);
                        break;
                }
                this.f9812b.e.m12075g().f9370c.m13823a(this.f9812b.h, apiPostsResponse.data.posts);
            }
        });
        dhe.c(this.i, new GagPostListResponseEvent(this.h, this.g, true));
    }

    /* renamed from: h */
    protected String mo1804h(Context context) {
        String str = "";
        switch (this.g) {
            case 1:
                str = "/nextRefKey/" + this.e.m12075g().f9370c.m13826c(this.h);
                break;
        }
        return String.format("%s/v2/top-posts/sortBy/%s/timerange/%s%s/itemCount/%d/entryTypes/%s/locale/%s", new Object[]{cae.m12035a(), "vote", "1day", str, Integer.valueOf(mo1811n()), cps.a(), djo.a()});
    }
}
