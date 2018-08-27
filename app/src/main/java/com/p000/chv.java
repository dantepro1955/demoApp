package com.p000;

import android.widget.BaseAdapter;
import com.ninegag.android.app.ui.BaseActivity;
import com.ninegag.android.app.ui.fragments.comment.CommentListingFragment;

/* compiled from: CommentEmbedPostModule */
/* renamed from: chv */
public class chv extends dfy {
    /* renamed from: a */
    private static caf f9286a = caf.m12046a();
    /* renamed from: b */
    private coj f9287b = new coj();
    /* renamed from: c */
    private cca f9288c;
    /* renamed from: d */
    private chw f9289d;
    /* renamed from: e */
    private cid f9290e;
    /* renamed from: f */
    private CommentListingFragment f9291f;
    /* renamed from: g */
    private BaseActivity f9292g;
    /* renamed from: h */
    private cqd f9293h;
    /* renamed from: i */
    private BaseAdapter f9294i;
    /* renamed from: j */
    private boolean f9295j;
    /* renamed from: k */
    private String f9296k;

    public chv(String str, String str2) {
        this.f9296k = str;
        this.f9287b.m14970a(true);
        this.f9287b.f9925b = str2;
        this.f9288c = new cca(str);
        this.f9289d = new chw();
        this.f9290e = new cid(str);
        a(this.f9289d);
        a(this.f9290e);
    }

    public void s_() {
        super.s_();
        this.f9288c.m12440a(this);
        this.f9289d.m13609a(this);
        this.f9290e.m13645a(this.f9292g);
    }

    public void t_() {
        super.t_();
    }

    public void w_() {
        super.w_();
        dhe.a(this.f9296k, this.f9288c);
    }

    public void u_() {
        super.u_();
        dhe.b(this.f9296k, this.f9288c);
    }

    /* renamed from: a */
    public void m13611a(CommentListingFragment commentListingFragment, BaseAdapter baseAdapter) {
        this.f9291f = commentListingFragment;
        this.f9292g = commentListingFragment.m20686g();
        this.f9293h = new cqd(this.f9292g);
        this.f9294i = baseAdapter;
    }

    /* renamed from: f */
    public void m13613f() {
        this.f9290e.m13648f();
        this.f9293h = null;
        this.f9292g = null;
    }

    /* renamed from: g */
    public void m13614g() {
        this.f9289d.m13620f();
    }

    /* renamed from: h */
    public boolean m13615h() {
        return m13617j().mo3310d();
    }

    /* renamed from: i */
    public boolean m13616i() {
        return this.f9295j;
    }

    /* renamed from: a */
    public void m13612a(boolean z) {
        this.f9295j = z;
    }

    /* renamed from: j */
    public CommentListingFragment m13617j() {
        return this.f9291f;
    }

    /* renamed from: k */
    public BaseActivity m13618k() {
        return this.f9292g;
    }
}
