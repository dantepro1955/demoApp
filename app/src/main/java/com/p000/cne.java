package com.p000;

import android.content.Context;
import android.content.Intent;
import com.facebook.ads.AudienceNetworkActivity;
import com.facebook.appevents.AppEventsConstants;
import com.ninegag.android.app.model.api.ApiPostsResponse;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

/* compiled from: SearchGagPostListTask */
/* renamed from: cne */
public class cne extends cmq {
    /* renamed from: k */
    private String f9832k = "";
    /* renamed from: l */
    private String f9833l = AppEventsConstants.EVENT_PARAM_VALUE_NO;
    /* renamed from: m */
    private String f9834m = "relevant";

    public cne(Intent intent) {
        super(intent);
        this.f9832k = intent.getStringExtra("search_key");
        this.f9834m = intent.getStringExtra("sort_by");
    }

    /* renamed from: a */
    public static void m14704a(Intent intent, String str, String str2, String str3, String str4, int i) {
        intent.putExtra("search_key", str);
        intent.putExtra("list_type", 12);
        intent.putExtra("list_key", str4);
        intent.putExtra("scope", str3);
        intent.putExtra("type", i);
        intent.putExtra("group_id", AppEventsConstants.EVENT_PARAM_VALUE_NO);
        intent.putExtra("sort_by", str2);
    }

    /* renamed from: a */
    protected String mo1813a(ApiPostsResponse apiPostsResponse) {
        if (apiPostsResponse == null || apiPostsResponse.data == null || apiPostsResponse.data.posts == null) {
            return AppEventsConstants.EVENT_PARAM_VALUE_NO;
        }
        int length;
        Object[] objArr = apiPostsResponse.data.posts;
        try {
            length = (objArr.length + Integer.parseInt(this.e.m12075g().f9370c.m13826c(this.h))) + 0;
        } catch (NumberFormatException e) {
            length = objArr.length;
        }
        this.f9833l = length + "";
        return this.f9833l;
    }

    /* renamed from: h */
    protected String mo1804h(Context context) {
        String str = this.f9832k;
        String str2 = "";
        try {
            str = URLEncoder.encode(this.f9832k, AudienceNetworkActivity.WEBVIEW_ENCODING);
        } catch (UnsupportedEncodingException e) {
        }
        switch (this.g) {
            case 1:
                this.f9833l = this.e.m12075g().f9370c.m13826c(this.h);
                break;
        }
        return String.format("%s/v2/search/query/%s/fromIndex/%s/itemCount/%d/entryTypes/%s/sortBy/%s", new Object[]{cae.m12035a(), str, this.f9833l, Integer.valueOf(mo1811n()), cps.a(), this.f9834m});
    }
}
