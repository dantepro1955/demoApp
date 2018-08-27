package com.p000;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;

/* compiled from: CommentSystemAddModule */
/* renamed from: dei */
public class dei extends dkk {
    /* renamed from: a */
    private boolean f21348a = false;
    /* renamed from: d */
    protected String f21349d;
    /* renamed from: e */
    protected long f21350e;
    /* renamed from: f */
    protected int f21351f;
    /* renamed from: g */
    protected String f21352g;
    /* renamed from: h */
    protected String f21353h;

    public dei(Context context) {
        super(context);
    }

    /* renamed from: b */
    public void m26769b(Bundle bundle) {
        super.b(bundle);
        this.f21349d = F().getString("url");
        this.f21350e = F().getLong("parent");
        this.f21351f = F().getInt("order");
        this.f21352g = F().getString("opClientId");
        this.f21353h = F().getString("opSignature");
        if (bundle != null) {
            this.f21350e = bundle.getLong("mParent", -1);
        }
        this.j = this.f21349d;
    }

    public void s_() {
        super.s_();
        if (g()) {
            Log.d("CommentSystemAddModule", "onStart() mUrl=" + this.f21349d);
        }
    }

    public void t_() {
        super.t_();
        if (g()) {
            Log.d("CommentSystemAddModule", "onStop() mUrl=" + this.f21349d);
        }
    }

    /* renamed from: a */
    public void m26768a(Bundle bundle) {
        super.a(bundle);
        bundle.putLong("parent", this.f21350e);
    }

    /* renamed from: c */
    protected void m26770c(String str) {
        super.c(str);
        if (g()) {
            Log.d("CommentSystemAddModule", "" + str + " mUrl=" + this.f21349d);
        }
        if (g()) {
            Log.d("CommentSystemAddModule", "" + str + " mParent=" + this.f21350e);
        }
        if (g()) {
            Log.d("CommentSystemAddModule", "" + str + " mOrder=" + this.f21351f);
        }
        if (g()) {
            Log.d("CommentSystemAddModule", "" + str + " mOpClientId=" + this.f21352g);
        }
        if (g()) {
            Log.d("CommentSystemAddModule", "" + str + " mOpSignature=" + this.f21353h);
        }
    }

    /* renamed from: p */
    public boolean m26771p() {
        return this.f21348a;
    }
}
