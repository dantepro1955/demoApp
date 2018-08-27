package com.p000;

import com.ninegag.android.app.model.api.ApiTopCommentResponse;
import com.ninegag.android.app.otto.TimelyCommentLoadedEvent;
import java.util.HashSet;

/* compiled from: CommentApiPool */
/* renamed from: cal */
public class cal extends ctg {
    /* renamed from: b */
    private static caf f8505b = caf.m12046a();

    /* compiled from: CommentApiPool */
    /* renamed from: cal$a */
    public static class C1638a implements dhp {
        /* renamed from: a */
        public int f8501a;
        /* renamed from: b */
        public String f8502b;
        /* renamed from: c */
        public String f8503c;
        /* renamed from: d */
        public boolean f8504d;

        public C1638a(String str, String str2, int i) {
            this.f8501a = i;
            this.f8502b = str2;
            this.f8503c = str;
        }

        /* renamed from: a */
        public void m12128a(boolean z) {
            this.f8504d = z;
        }

        /* renamed from: a */
        public int m12127a() {
            return this.f8501a;
        }

        /* renamed from: b */
        public String m12129b() {
            return this.f8502b;
        }
    }

    /* compiled from: CommentApiPool */
    /* renamed from: cal$b */
    public static class C1639b extends dhq {
        C1639b(dho dho, HashSet<String> hashSet) {
            super(dho, hashSet);
        }

        /* renamed from: a */
        public void m12130a(dhp dhp) {
            C1638a c1638a = (C1638a) dhp;
            ApiTopCommentResponse apiTopCommentResponse = (ApiTopCommentResponse) djm.a(cal.m12134b(cal.f8505b.m12090t().a(c1638a.f8502b)).e(), ApiTopCommentResponse.class);
            if (apiTopCommentResponse != null && apiTopCommentResponse.payload != null && apiTopCommentResponse.payload.data.length > 0) {
                if (c1638a.f8504d) {
                    cki cki = new cki();
                    cki.f9535c = apiTopCommentResponse.payload.data[0].comments;
                    cki.f9534b = c1638a.f8503c;
                    cki.f9536d = cqw.a();
                    cal.f8505b.m12075g().m13701a(cki);
                    dhe.c("OverlayModule", new TimelyCommentLoadedEvent(c1638a.f8503c));
                    return;
                }
                ckj ckj = new ckj();
                ckj.f9538c = apiTopCommentResponse.payload.data[0].comments;
                ckj.f9537b = c1638a.f8503c;
                cal.f8505b.m12075g().m13702a(ckj);
            }
        }

        /* renamed from: a */
        public void m12131a(dhp dhp, Exception exception) {
        }
    }

    public cal(int i, int i2) {
        super(i, i2);
    }

    /* renamed from: a */
    public dhq m12135a(dhp dhp) {
        return new C1639b(c(), b());
    }

    /* renamed from: b */
    private static dft m12134b(String str) {
        dft b = dft.b(str);
        b.a(false);
        b.b(5000);
        b.a(30000);
        b.d(f8505b.m12068d().f8410g);
        return b;
    }
}
