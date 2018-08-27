package com.p000;

import android.content.Context;
import com.under9.android.comments.model.api.ApiLike;
import com.under9.android.comments.model.api.ApiResponse;
import java.util.HashMap;
import java.util.Map;

/* compiled from: LikeTask */
/* renamed from: ddx */
public class ddx extends dea {
    public ddx(String str, String str2) {
        super(str, str2);
    }

    /* renamed from: a */
    public ApiResponse mo4337a(String str) {
        return (ApiResponse) djm.m27592a(str, ApiLike.class);
    }

    /* renamed from: a */
    public void mo4338a(ApiResponse apiResponse) {
        super.mo4338a(apiResponse);
    }

    /* renamed from: c */
    protected String mo4341c(Context context) {
        return m26646c() + "/v1/like.json";
    }

    /* renamed from: b */
    protected dft mo4340b(Context context) {
        dft b = super.mo4340b(context);
        Map hashMap = new HashMap();
        hashMap.put("auth", this.b);
        hashMap.put("appId", dda.m26492a().m26526c());
        hashMap.put("commentId", this.a);
        hashMap.put("value", "1");
        b.m27094a(hashMap);
        return b;
    }

    /* renamed from: d */
    public void mo4342d(Context context) {
        super.m26671a(context, 101);
    }

    /* renamed from: e */
    public void mo4343e(Context context) {
        super.m26673b(context, 101);
    }
}
