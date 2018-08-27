package com.p000;

import android.content.Context;
import com.under9.android.comments.model.api.ApiInfo;
import com.under9.android.comments.model.api.ApiQuota;
import com.under9.android.comments.model.api.ApiResponse;
import com.under9.android.comments.model.api.ApiUser;
import java.lang.reflect.Type;

/* compiled from: GetInfoTask */
/* renamed from: ddv */
public class ddv extends ddn {
    /* renamed from: a */
    private String f21329a = "";

    /* compiled from: GetInfoTask */
    /* renamed from: ddv$a */
    class C4834a implements bug<ApiUser> {
        /* renamed from: a */
        final /* synthetic */ ddv f21328a;

        C4834a(ddv ddv) {
            this.f21328a = ddv;
        }

        /* renamed from: b */
        public /* synthetic */ Object m26706b(buh buh, Type type, buf buf) throws bul {
            return m26705a(buh, type, buf);
        }

        /* renamed from: a */
        public ApiUser m26705a(buh buh, Type type, buf buf) throws bul {
            if (buh.j() && "".equals(buh.c())) {
                return null;
            }
            return (ApiUser) new bub().a(buh, ApiUser.class);
        }
    }

    public ddv(String str) {
        this.f21329a = str;
    }

    /* renamed from: a */
    public boolean mo4339a(Context context) {
        return true;
    }

    /* renamed from: a */
    public ApiResponse mo4337a(String str) {
        buc buc = new buc();
        buc.a(ApiUser.class, new C4834a(this));
        return (ApiResponse) buc.a().a(str, ApiInfo.class);
    }

    /* renamed from: a */
    public void mo4338a(ApiResponse apiResponse) {
        if (apiResponse != null) {
            ApiInfo apiInfo = (ApiInfo) apiResponse;
            ApiQuota apiQuota = apiInfo.payload != null ? apiInfo.payload.quota : null;
            if (apiQuota != null) {
                dda.m26492a().m26505a(apiQuota.count, apiQuota.wait);
            }
            ApiUser apiUser = apiInfo.payload.user;
            if (!(apiUser == null || apiUser.userId == null)) {
                dda.m26492a().m26525b("logged_in_user", dda.m26492a().m26502a(apiUser).m23630b());
            }
            dda.m26492a().m26540e("max_message_length", apiInfo.payload.app.maxMessageLength);
            dda.m26492a().m26540e("max_display_level", apiInfo.payload.app.maxDisplayLevel);
            dda.m26492a().m26511a("last_info_update_time", System.currentTimeMillis());
            dda.m26492a().m26540e("allow_anonymous_comment", apiInfo.payload.app.allowAnonymousComment);
            dda.m26492a().m26540e("enable_op_label_feature", apiInfo.payload.app.opLabelFeature);
            dda.m26492a().m26525b("anonymous_avatar_url", apiInfo.payload.app.anonymousAvatarUrl);
            dda.m26492a().m26540e("user_name_clickable", apiInfo.payload.app.mobileUserNameClickable);
            dda.m26492a().m26540e("allow_image_upload_feature", apiInfo.payload.app.allowImageUploadFeature);
            dda.m26492a().m26540e("allowAnonymousVote", apiInfo.payload.app.allowAnonymousVote);
            dda.m26492a().m26540e("enable_op_hide_comment_feature", apiInfo.payload.app.opHideCommentFeature);
        }
    }

    /* renamed from: b */
    protected dft mo4340b(Context context) {
        dft b = super.mo4340b(context);
        b.m27087a("appId", dda.m26492a().m26526c());
        b.m27087a("auth", this.f21329a);
        return b;
    }

    /* renamed from: c */
    protected String mo4341c(Context context) {
        return m26646c() + "/v1/info.json?id=" + dda.m26492a().m26526c();
    }
}
