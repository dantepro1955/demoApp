package com.p000;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.text.TextUtils;
import com.under9.android.comments.otto.AskForLoginEvent;
import com.under9.android.comments.otto.AskForPostEvent;
import com.under9.android.comments.otto.RefreshTokenEvent;
import com.under9.android.comments.otto.RequestDownloadAnonymousAvatarEvent;
import com.under9.android.comments.otto.RequestDownloadImageEvent;
import com.under9.android.comments.otto.RequestDownloadMp4Event;
import p000.dct.C4092a;
import p000.dew.C4865i;

/* compiled from: CommentSystemController */
/* renamed from: dcy */
public class dcy {
    /* renamed from: a */
    private dct f16735a = dct.a();
    /* renamed from: b */
    private dcz f16736b = new dcz(this.f16735a.h());
    /* renamed from: c */
    private C4092a f16737c;
    /* renamed from: d */
    private Context f16738d;

    /* renamed from: a */
    public void m20934a(Activity activity) {
        m20935a(activity, null);
    }

    /* renamed from: a */
    public void m20935a(Activity activity, String str) {
        this.f16738d = activity;
        dda.a().a(activity.getApplicationContext());
        ddd.a().a(activity.getApplicationContext());
        this.f16736b.a(activity);
        this.f16736b.a(dct.a().h());
        dct.m().a(this);
        if (!TextUtils.isEmpty(str)) {
            dhe.a(str, this);
        }
    }

    /* renamed from: a */
    public void m20933a() {
        m20939a(null);
    }

    /* renamed from: a */
    public void m20939a(String str) {
        if (this.f16738d != null) {
            this.f16738d = null;
            this.f16736b.a();
            dct.m().b(this);
            if (!TextUtils.isEmpty(str)) {
                dhe.b(str, this);
            }
        }
    }

    /* renamed from: b */
    public dcz m20941b() {
        return this.f16736b;
    }

    /* renamed from: a */
    public void m20938a(C4092a c4092a) {
        this.f16737c = c4092a;
    }

    /* renamed from: c */
    public int m20942c() {
        return dda.a().r();
    }

    /* renamed from: d */
    public long m20943d() {
        return dda.a().s();
    }

    /* renamed from: e */
    public boolean m20944e() {
        return System.currentTimeMillis() > dda.a().s();
    }

    /* renamed from: f */
    public String m20945f() {
        if (this.f16738d == null) {
            return "";
        }
        String a = ctn.a(this.f16738d, (dda.a().s() - System.currentTimeMillis()) / 1000);
        return String.format(m20932a(C4865i.comment_limit_exceed_fs), new Object[]{a});
    }

    /* renamed from: a */
    public void m20936a(Context context, FragmentManager fragmentManager, Bundle bundle) {
        ddg.a(context, fragmentManager, this.f16736b, bundle);
    }

    /* renamed from: g */
    public void m20946g() {
        m20940a(false);
    }

    /* renamed from: a */
    public void m20940a(boolean z) {
        long k = dda.a().k("last_info_update_time");
        if (z || System.currentTimeMillis() - k > 1200000) {
            m20941b().b(null);
        }
    }

    /* renamed from: h */
    public void m20947h() {
        dct.a().i();
        m20946g();
    }

    /* renamed from: a */
    public void m20937a(Bundle bundle) {
        if (this.f16737c != null) {
            this.f16737c.a(bundle);
        }
    }

    /* renamed from: i */
    public void m20948i() {
        if (this.f16737c != null) {
            this.f16737c.a();
        }
    }

    @dhg
    public void onAskForPost(AskForPostEvent askForPostEvent) {
        m20948i();
    }

    @dhg
    public void onAskForLogin(AskForLoginEvent askForLoginEvent) {
        m20937a(askForLoginEvent.f19210a);
    }

    @dhg
    public void onRefreshToken(RefreshTokenEvent refreshTokenEvent) {
        this.f16736b.a(dct.a().h());
        m20947h();
    }

    @dhg
    public void onRequestDownloadImage(RequestDownloadImageEvent requestDownloadImageEvent) {
        m20941b().d(requestDownloadImageEvent.f19232a, new dcy$1(this));
    }

    @dhg
    public void onRequestDownloadAnonymousAvatarEvent(RequestDownloadAnonymousAvatarEvent requestDownloadAnonymousAvatarEvent) {
        m20941b().a(new dcy$2(this));
    }

    @dhg
    public void onRequestDownloadMp4(RequestDownloadMp4Event requestDownloadMp4Event) {
    }

    /* renamed from: a */
    private String m20932a(int i) {
        if (this.f16738d == null) {
            return null;
        }
        return this.f16738d.getString(i);
    }
}
