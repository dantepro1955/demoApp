package com.p000;

import android.content.Context;
import com.under9.android.comments.model.api.ApiLiveCommentPayload;
import com.under9.android.comments.model.api.ApiLiveCommentPayloadText;
import com.under9.android.comments.otto.NewLiveCommentEvent;
import okhttp3.OkHttpClient.Builder;

/* compiled from: LiveCommentServiceModule */
/* renamed from: ddl */
public class ddl extends dlh {
    /* renamed from: a */
    private String f21265a;
    /* renamed from: b */
    private String f21266b;
    /* renamed from: c */
    private Context f21267c;
    /* renamed from: d */
    private boolean f21268d;

    public ddl(Context context, Builder builder, String str, String str2) {
        super(builder.build());
        this.f21267c = context;
        this.f21265a = str;
        this.f21266b = str2;
    }

    /* renamed from: a */
    public String mo4328a() {
        return this.f21265a;
    }

    /* renamed from: a */
    public void mo4330a(String str) {
        ApiLiveCommentPayload apiLiveCommentPayload = (ApiLiveCommentPayload) dfa.m26949a(str, ApiLiveCommentPayload.class);
        if (apiLiveCommentPayload != null) {
            ApiLiveCommentPayloadText apiLiveCommentPayloadText = (ApiLiveCommentPayloadText) dfa.m26949a(apiLiveCommentPayload.text, ApiLiveCommentPayloadText.class);
            if (apiLiveCommentPayloadText != null) {
                dct.m26398a(this.f21266b, new NewLiveCommentEvent(apiLiveCommentPayloadText.commentId));
            }
        }
    }

    /* renamed from: b */
    public void mo4331b() {
        super.mo4331b();
        this.f21268d = true;
    }

    /* renamed from: c */
    public void mo4333c() {
        super.mo4333c();
        this.f21268d = false;
    }

    /* renamed from: d */
    public void mo4334d() {
        super.mo4334d();
    }

    /* renamed from: a */
    public void mo4329a(int i, String str) {
        this.f21268d = false;
    }

    /* renamed from: b */
    public void mo4332b(String str) {
        super.mo4332b(str);
        this.f21268d = false;
    }

    /* renamed from: e */
    public void m26634e() {
    }
}
