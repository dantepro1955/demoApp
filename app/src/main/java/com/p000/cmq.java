package com.p000;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.facebook.AccessToken;
import com.facebook.appevents.AppEventsConstants;
import com.ninegag.android.app.R;
import com.ninegag.android.app.model.api.ApiBaseResponse;
import com.ninegag.android.app.model.api.ApiGag;
import com.ninegag.android.app.model.api.ApiPostsResponse;
import com.ninegag.android.app.otto.response.GagPostListResponseEvent;

/* compiled from: GetGagPostListTask */
/* renamed from: cmq */
public class cmq extends cmg {
    /* renamed from: b */
    boolean f9789b = false;
    /* renamed from: c */
    boolean f9790c = true;
    /* renamed from: d */
    boolean f9791d;
    /* renamed from: e */
    caf f9792e = caf.m12046a();
    /* renamed from: f */
    int f9793f;
    /* renamed from: g */
    int f9794g;
    /* renamed from: h */
    String f9795h;
    /* renamed from: i */
    String f9796i;
    /* renamed from: j */
    String f9797j = "";
    /* renamed from: k */
    private String f9798k;
    /* renamed from: l */
    private String f9799l;
    /* renamed from: m */
    private int f9800m = 9;

    /* renamed from: a */
    public static void m14598a(Intent intent, int i, String str, String str2, String str3, int i2) {
        intent.putExtra("list_type", i);
        intent.putExtra("group_id", str);
        intent.putExtra("scope", str3);
        intent.putExtra("type", i2);
        intent.putExtra("list_key", str2);
    }

    /* renamed from: b */
    public static void m14599b(Intent intent, int i, String str, String str2, String str3, int i2) {
        intent.putExtra("list_type", i);
        intent.putExtra(AccessToken.USER_ID_KEY, str);
        intent.putExtra("scope", str3);
        intent.putExtra("type", i2);
        intent.putExtra("list_key", str2);
    }

    public cmq(Intent intent) {
        this.f9793f = intent.getIntExtra("list_type", 0);
        this.f9798k = intent.getStringExtra("group_id");
        this.f9796i = intent.getStringExtra("scope");
        this.f9794g = intent.getIntExtra("type", 0);
        this.f9795h = intent.getStringExtra("list_key");
        this.f9799l = intent.getStringExtra(AccessToken.USER_ID_KEY);
        this.f9800m = intent.getIntExtra("limit", this.f9792e.m12087q().m14417w());
        if (this.f9800m <= 0) {
            this.f9800m = 9;
        }
    }

    /* renamed from: n */
    protected int mo1811n() {
        return this.f9800m;
    }

    /* renamed from: a */
    protected String mo1813a(ApiPostsResponse apiPostsResponse) {
        if (apiPostsResponse == null || apiPostsResponse.data == null || apiPostsResponse.data.posts == null) {
            return AppEventsConstants.EVENT_PARAM_VALUE_NO;
        }
        ApiGag[] apiGagArr = apiPostsResponse.data.posts;
        String[] strArr = new String[apiGagArr.length];
        int length = apiGagArr.length;
        for (int i = 0; i < length; i++) {
            strArr[i] = apiGagArr[i].id;
        }
        return TextUtils.join(",", strArr);
    }

    /* renamed from: c */
    public void mo1809c(Context context) {
        super.mo1809c(context);
        if (this.f9794g == 1) {
            dhe.c(this.f9796i, new GagPostListResponseEvent(this.f9795h, this.f9794g, false, this.f9792e.f8449a.getString(R.string.error_load_more)));
        }
    }

    /* renamed from: a */
    public void mo1800a(ApiBaseResponse apiBaseResponse) {
        final ApiPostsResponse apiPostsResponse = (ApiPostsResponse) apiBaseResponse;
        m14605b(apiBaseResponse);
        this.f9792e.m12075g().m13707a(new Runnable(this) {
            /* renamed from: b */
            final /* synthetic */ cmq f9788b;

            public void run() {
                boolean z = false;
                String str = null;
                boolean z2 = true;
                if (this.f9788b.f9794g == 0) {
                    this.f9788b.f9792e.m12075g().f9370c.m13831h(this.f9788b.f9795h);
                }
                String a;
                String str2;
                switch (this.f9788b.f9794g) {
                    case 0:
                        a = this.f9788b.mo1813a(apiPostsResponse);
                        cin cin = this.f9788b.f9792e.m12075g().f9370c;
                        String str3 = this.f9788b.f9795h;
                        if (apiPostsResponse.data.didEndOfList == 0) {
                            z = true;
                        }
                        cin.m13821a(str3, a, z, apiPostsResponse.data.targetedAdTags == null ? null : apiPostsResponse.data.targetedAdTags.m11072l().toString());
                        cin cin2 = this.f9788b.f9792e.m12075g().f9370c;
                        str2 = this.f9788b.f9795h;
                        if (apiPostsResponse.data.targetedAdTags != null) {
                            str = apiPostsResponse.data.targetedAdTags.m11072l().toString();
                        }
                        cin2.m13825b(str2, a, true, str);
                        break;
                    case 1:
                        str2 = this.f9788b.mo1813a(apiPostsResponse);
                        cin cin3 = this.f9788b.f9792e.m12075g().f9370c;
                        String str4 = this.f9788b.f9795h;
                        if (apiPostsResponse.data.didEndOfList != 0) {
                            z2 = false;
                        }
                        if (apiPostsResponse.data.targetedAdTags != null) {
                            str = apiPostsResponse.data.targetedAdTags.m11072l().toString();
                        }
                        cin3.m13821a(str4, str2, z2, str);
                        break;
                    case 2:
                        String a2 = this.f9788b.mo1813a(apiPostsResponse);
                        cin cin4 = this.f9788b.f9792e.m12075g().f9370c;
                        a = this.f9788b.f9795h;
                        if (apiPostsResponse.data.targetedAdTags != null) {
                            str = apiPostsResponse.data.targetedAdTags.m11072l().toString();
                        }
                        cin4.m13825b(a, a2, true, str);
                        break;
                }
                this.f9788b.f9792e.m12075g().f9370c.m13823a(this.f9788b.f9795h, apiPostsResponse.data.posts);
            }
        });
        dhe.c(this.f9796i, new GagPostListResponseEvent(this.f9795h, this.f9794g, true));
    }

    /* renamed from: a */
    protected void mo1807a(int i) {
        super.mo1807a(i);
        if (i == -1) {
            dhe.c(this.f9796i, new GagPostListResponseEvent(this.f9795h, this.f9794g, false, 4));
        }
    }

    /* renamed from: b */
    protected void m14605b(ApiBaseResponse apiBaseResponse) {
        ApiPostsResponse apiPostsResponse = (ApiPostsResponse) apiBaseResponse;
        if (apiPostsResponse == null || apiPostsResponse.data == null || apiPostsResponse.meta == null) {
            chn.m13412f(this.f9797j, "GetPost response data is null");
            this.f9790c = false;
            dhe.c(this.f9796i, new GagPostListResponseEvent(this.f9795h, this.f9794g, false, 4));
        } else if ("invalidGroupId".equals(apiPostsResponse.meta.errorCode)) {
            this.f9789b = true;
            dhe.c(this.f9796i, new GagPostListResponseEvent(this.f9795h, this.f9794g, false));
        } else if ("DataIsPrivate".equals(apiPostsResponse.meta.errorCode)) {
            this.f9791d = true;
            this.f9790c = false;
            dhe.c(this.f9796i, new GagPostListResponseEvent(this.f9795h, this.f9794g, false, this.f9792e.f8449a.getString(R.string.error_private)));
        } else if (!apiPostsResponse.success()) {
            chn.m13412f(this.f9797j, "GetPost response not success");
            this.f9790c = false;
        } else if (apiPostsResponse.data.posts == null) {
            chn.m13412f(this.f9797j, "GetPost posts null");
            this.f9790c = false;
        }
    }

    /* renamed from: a */
    protected ApiBaseResponse mo1799a(String str) {
        return (ApiBaseResponse) cpy.a(str, ApiPostsResponse.class, 2);
    }

    /* renamed from: f */
    protected dft mo1802f(Context context) {
        this.f9797j = m14491g(context);
        dft b = dft.b(this.f9797j);
        cmg.m14468a(b);
        return b;
    }

    /* renamed from: h */
    protected String mo1804h(Context context) {
        String str = "";
        switch (this.f9794g) {
            case 1:
                str = "/olderThan/" + this.f9792e.m12075g().f9370c.m13826c(this.f9795h);
                break;
            case 2:
                str = "/newerThan/" + this.f9792e.m12075g().f9370c.m13828e(this.f9795h);
                break;
        }
        String a = cqa.a(this.f9793f);
        str = String.format("%s/v2/post-list/group/%s/type/%s%s/itemCount/%d/entryTypes/%s", new Object[]{cae.m12035a(), this.f9798k, a, str, Integer.valueOf(this.f9800m), cps.a()});
        if (!m14600r()) {
            return str;
        }
        return str + String.format("/userId/%s", new Object[]{this.f9799l});
    }

    /* renamed from: m */
    public String mo1806m() {
        return this.f9793f + "-" + this.f9798k + "-" + this.f9794g + "-" + this.f9800m;
    }

    /* renamed from: r */
    private boolean m14600r() {
        return (this.f9799l == null || this.f9799l.isEmpty()) ? false : true;
    }
}
