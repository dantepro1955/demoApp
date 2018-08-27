package com.p000;

import com.ninegag.android.tv.model.Post;
import com.ninegag.android.tv.model.PostVideo;

/* compiled from: PostWrapper */
/* renamed from: cvl */
public class cvl extends crz<Post> {
    /* renamed from: a */
    private PostVideo f20303a;

    protected cvl(Post post) {
        super(post);
    }

    /* renamed from: a */
    public String m25066a() {
        return ((Post) m24642R()).m23053c();
    }

    /* renamed from: b */
    public String m25068b() {
        return ((Post) m24642R()).m23086u();
    }

    /* renamed from: c */
    public String m25069c() {
        return ((Post) m24642R()).m23077m();
    }

    /* renamed from: d */
    public String m25070d() {
        return ((Post) m24642R()).m23069i();
    }

    /* renamed from: a */
    public void m25067a(PostVideo postVideo) {
        this.f20303a = postVideo;
    }

    /* renamed from: e */
    public int m25071e() {
        if (this.f20303a == null) {
            return 0;
        }
        Integer b = this.f20303a.m23152b();
        if (b != null) {
            return b.intValue();
        }
        return 0;
    }

    /* renamed from: f */
    public String m25072f() {
        if (this.f20303a != null) {
            return this.f20303a.m23158d();
        }
        return null;
    }

    /* renamed from: g */
    public int m25073g() {
        if (this.f20303a == null) {
            return 0;
        }
        Integer f = this.f20303a.m23161f();
        if (f != null) {
            return f.intValue();
        }
        return 0;
    }

    /* renamed from: h */
    public int m25074h() {
        if (this.f20303a == null) {
            return 0;
        }
        Integer e = this.f20303a.m23160e();
        if (e != null) {
            return e.intValue();
        }
        return 0;
    }

    /* renamed from: i */
    public String m25075i() {
        return ((Post) m24642R()).m23050b();
    }

    /* renamed from: j */
    public boolean m25076j() {
        return ((Post) m24642R()).m23079n().booleanValue();
    }
}
