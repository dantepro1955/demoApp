package com.p000;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.facebook.GraphResponse;
import com.under9.android.comments.model.Comment;
import com.under9.android.comments.model.PendingCommentListItem;
import com.under9.android.comments.model.User;
import com.under9.android.comments.model.api.ApiComment;
import com.under9.android.comments.model.api.ApiCommentAdd;
import com.under9.android.comments.model.api.ApiQuota;
import com.under9.android.comments.model.api.ApiResponse;
import com.under9.android.comments.otto.AddCommentFailedEvent;
import com.under9.android.comments.otto.AddCommentQuotaExceededEvent;
import com.under9.android.comments.service.TaskQueueService;
import java.util.HashMap;
import java.util.Map;

/* compiled from: AddCommentTask */
/* renamed from: ddm */
public class ddm extends ddn {
    /* renamed from: a */
    protected String f21279a = "";
    /* renamed from: b */
    protected String f21280b = "";
    /* renamed from: c */
    protected String f21281c = "";
    /* renamed from: d */
    protected String f21282d = null;
    /* renamed from: e */
    protected String f21283e = "";
    /* renamed from: f */
    protected long f21284f;
    /* renamed from: g */
    protected String f21285g = null;
    /* renamed from: h */
    protected String f21286h = null;
    /* renamed from: i */
    protected String f21287i = "";
    /* renamed from: j */
    protected String f21288j = "";
    /* renamed from: k */
    protected boolean f21289k = true;
    /* renamed from: m */
    private boolean f21290m = false;
    /* renamed from: n */
    private int f21291n;
    /* renamed from: o */
    private int f21292o;
    /* renamed from: p */
    private String f21293p = "";

    /* compiled from: AddCommentTask */
    /* renamed from: ddm$2 */
    class C48282 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ ddm f21271a;

        C48282(ddm ddm) {
            this.f21271a = ddm;
        }

        public void run() {
            dda.m26492a().m26544f(this.f21271a.f21284f);
        }
    }

    /* compiled from: AddCommentTask */
    /* renamed from: ddm$3 */
    class C48293 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ ddm f21272a;

        C48293(ddm ddm) {
            this.f21272a = ddm;
        }

        public void run() {
            dda.m26492a().m26527c(this.f21272a.f21284f);
        }
    }

    public ddm(String str, long j) {
        this.f21284f = j;
        this.f21279a = str;
        PendingCommentListItem d = dda.m26492a().m26531d(j);
        if (d == null) {
            m26657a(j);
            return;
        }
        this.f21280b = d.m23582e();
        Comment l = d.m23590l();
        if (l == null) {
            m26657a(j);
            return;
        }
        this.f21281c = l.m23450f();
        if (Boolean.TRUE.equals(l.m23469m())) {
            this.f21283e = "on";
        }
        this.f21282d = l.m23474p();
        this.f21285g = d.m23586h();
        this.f21286h = d.m23587i();
        this.f21287i = d.m23588j();
        this.f21288j = d.m23589k();
    }

    /* renamed from: a */
    public void m26657a(final long j) {
        this.f21289k = false;
        dda.m26492a().m26509a(new Runnable(this) {
            /* renamed from: b */
            final /* synthetic */ ddm f21270b;

            public void run() {
                dda.m26492a().m26527c(j);
            }
        });
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof ddm)) {
            return false;
        }
        if (this.f21284f == ((ddm) obj).f21284f) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public boolean mo4339a(Context context) {
        super.mo4339a(context);
        if (!this.f21289k || dda.m26492a().m26531d(this.f21284f).m23579d().intValue() != 1) {
            return false;
        }
        dda.m26492a().m26509a(new C48282(this));
        return true;
    }

    /* renamed from: a */
    public ApiResponse mo4337a(String str) {
        this.f21293p = str;
        return (ApiResponse) dez.m26905a(str, ApiCommentAdd.class, 2);
    }

    /* renamed from: a */
    public void mo4338a(ApiResponse apiResponse) {
        if (apiResponse != null) {
            final ApiCommentAdd apiCommentAdd = (ApiCommentAdd) apiResponse;
            this.f21291n = 0;
            this.f21292o = 0;
            ApiQuota apiQuota = apiCommentAdd.payload != null ? apiCommentAdd.payload.quota : null;
            if (apiQuota != null) {
                this.f21291n = apiQuota.count;
                this.f21292o = apiQuota.wait;
                dda.m26492a().m26505a(this.f21291n, this.f21292o);
            }
            String str = "AddCommentTask status=" + apiCommentAdd.status + ", code=" + apiCommentAdd.code + ", error=" + apiCommentAdd.error + ", quota=" + this.f21291n + ", wait=" + this.f21292o;
            if (apiCommentAdd.isError()) {
                dda.m26492a().m26509a(new C48293(this));
                this.f21290m = true;
                if ("CODE_COMMENT_RATE_LIMIT".equals(apiCommentAdd.code)) {
                    ddc.m26575d("Quota: " + this.f21291n + ", Wait: " + this.f21292o + ";;; " + this.f21293p);
                    dct.m26398a(this.f21280b, new AddCommentQuotaExceededEvent(this.f21291n, this.f21292o));
                    ddc.m26576e("compose-failed.quota-exceeded");
                } else if (apiCommentAdd.error == null || !apiCommentAdd.error.contains("User not found")) {
                    ddc.m26576e("compose-failed.others");
                    dct.m26398a(this.f21280b, new AddCommentFailedEvent());
                } else {
                    ddc.m26576e("compose-failed.user-not-found");
                    dct.m26398a(this.f21280b, new AddCommentFailedEvent());
                }
                ddc.m26573b(str);
                return;
            }
            dda.m26492a().m26509a(new Runnable(this) {
                /* renamed from: b */
                final /* synthetic */ ddm f21274b;

                public void run() {
                    PendingCommentListItem d = dda.m26492a().m26531d(this.f21274b.f21284f);
                    ApiComment apiComment = apiCommentAdd.payload.comment;
                    User a = dda.m26492a().m26502a(apiComment.user);
                    ddh.m26606a(apiComment, apiCommentAdd.payload.opUserId);
                    dda.m26492a().m26508a(d, dda.m26492a().m26495a(apiComment, dda.m26492a().m26542f(apiComment.parent), this.f21274b.f21280b, a));
                    dda.m26492a().m26546g(this.f21274b.f21284f);
                }
            });
        }
    }

    /* renamed from: a */
    public Map<String, String> m26656a() {
        Map<String, String> hashMap = new HashMap();
        hashMap.put("auth", this.f21279a);
        hashMap.put("appId", dda.m26492a().m26526c());
        hashMap.put("url", this.f21280b);
        hashMap.put("text", this.f21281c);
        hashMap.put("isAnonymous", this.f21283e);
        if (this.f21282d != null) {
            hashMap.put("parent", this.f21282d);
        }
        if (!(this.f21285g == null || this.f21285g.isEmpty() || this.f21286h == null || this.f21286h.isEmpty())) {
            hashMap.put("opClientId", this.f21285g);
            hashMap.put("opSignature", this.f21286h);
        }
        if (!(TextUtils.isEmpty(this.f21287i) || TextUtils.isEmpty(this.f21288j))) {
            this.f21287i = "[" + this.f21287i + "]";
            hashMap.put("userMedia", this.f21287i);
            hashMap.put("hash", this.f21288j);
        }
        return hashMap;
    }

    /* renamed from: b */
    protected dft mo4340b(Context context) {
        dft b = super.mo4340b(context);
        b.m27094a(m26656a());
        return b;
    }

    /* renamed from: c */
    protected String mo4341c(Context context) {
        return m26646c() + "/v1/comment.json";
    }

    /* renamed from: d */
    public void mo4342d(Context context) {
        Intent d = mo4335d();
        d.putExtra(GraphResponse.SUCCESS_KEY, false);
        d.putExtra("item_id", this.f21284f);
        d.putExtra(TaskQueueService.f19251a, 110);
        m26640a(context, d);
    }

    /* renamed from: e */
    public void mo4343e(Context context) {
        if (this.f21290m) {
            mo4342d(context);
            return;
        }
        Intent d = mo4335d();
        d.putExtra(GraphResponse.SUCCESS_KEY, true);
        d.putExtra(TaskQueueService.f19251a, 110);
        m26640a(context, d);
    }
}
