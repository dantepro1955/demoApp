package com.p000;

import android.app.ActivityManager;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import com.ninegag.android.app.R;
import com.ninegag.android.app.otto.DrawerOpenedEvent;
import com.ninegag.android.app.otto.ThemeSwitchedEvent;
import com.ninegag.android.app.otto.VisitGroupEvent;
import com.ninegag.android.app.otto.actionbar.AbAuthClickedEvent;
import com.ninegag.android.app.otto.actionbar.AbEditProfileClickedEvent;
import com.ninegag.android.app.otto.actionbar.AbFeedbackClickedEvent;
import com.ninegag.android.app.otto.actionbar.AbMenuClickedEvent;
import com.ninegag.android.app.otto.actionbar.AbNotifClickedEvent;
import com.ninegag.android.app.otto.actionbar.AbSettingClickedEvent;
import com.ninegag.android.app.otto.broadcast.ApiCallbackEvent;
import com.ninegag.android.app.otto.featured.FeaturedPostClickEvent;
import com.ninegag.android.app.otto.featured.GoFeaturedListEvent;
import com.ninegag.android.app.ui.BaseNavActivity;
import com.ninegag.android.app.ui.HomeActivity;
import com.ninegag.android.app.ui.fragments.dialogs.LogoutDialogFragment;

/* compiled from: NavigationEventController */
/* renamed from: cho */
public class cho extends dfx {
    /* renamed from: a */
    private static caf f9252a = caf.m12046a();
    /* renamed from: b */
    private BaseNavActivity f9253b;
    /* renamed from: c */
    private cqd f9254c;

    /* renamed from: a */
    public void m13471a(BaseNavActivity baseNavActivity) {
        this.f9253b = baseNavActivity;
        this.f9254c = this.f9253b.getNavHelper();
        f9252a.m12066c((Object) this);
        f9252a.m12070d((Object) this);
    }

    public void s_() {
        super.s_();
    }

    public void t_() {
        f9252a.m12074f((Object) this);
        f9252a.m12076g((Object) this);
        this.f9254c = null;
        this.f9253b = null;
    }

    /* renamed from: a */
    public void m13470a(Bundle bundle) {
    }

    public void a_(Bundle bundle) {
    }

    public void v_() {
    }

    /* renamed from: e */
    public void m13472e() {
        if (this.f9253b != null && cqw.a() - f9252a.m12077h().bq() > cae.f8434d) {
            this.f9253b.issueGuestLoginIfNeeded();
            chr.m13522a().m13574d(-1);
        }
    }

    @dhg
    public void onApiCallback(ApiCallbackEvent apiCallbackEvent) {
        Intent intent = apiCallbackEvent.f18303a;
        if (intent != null && intent.getIntExtra("command", -1) != 113) {
        }
    }

    @dhg
    public void onSelectUploadFromGallery(cva cva) {
        this.f9254c.a(cva.f20276a, cva.f20277b);
    }

    @dhg
    public void onSelectUploadFromCapture(cux cux) {
        this.f9254c.e(cux.f20272a);
    }

    @dhg
    public void onSelectUploadFromMemeful(cvb cvb) {
        this.f9254c.f(cvb.f20278a);
    }

    @dhg
    public void onSelectUploadFromDirect(cuz cuz) {
        this.f9254c.a(cuz.f20274a, cuz.f20275b);
    }

    @dhg
    public void onSelectUploadVideoLink(cvc cvc) {
        this.f9254c.b(cvc.f20279a, cvc.f20280b);
    }

    @dhg
    public void onAbMenuClicked(AbMenuClickedEvent abMenuClickedEvent) {
        chn.m13444q(getClass().getName());
    }

    @dhg
    public void onAbNotifClicked(AbNotifClickedEvent abNotifClickedEvent) {
    }

    @dhg
    public void onAbEditProfileClicked(AbEditProfileClickedEvent abEditProfileClickedEvent) {
        chn.m13445q("User", "EditProfile");
        this.f9253b.getNavHelper().m();
    }

    @dhg
    public void onDrawerOpened(DrawerOpenedEvent drawerOpenedEvent) {
        if (drawerOpenedEvent.f18281a == R.id.drawer_menu) {
            m13472e();
        } else if (drawerOpenedEvent.f18281a == R.id.drawer_notif) {
            f9252a.m12054a(new clq());
        }
    }

    @dhg
    public void onFeaturedPostClick(FeaturedPostClickEvent featuredPostClickEvent) {
        cka cka = featuredPostClickEvent.f18307a;
        switch (cka.m14143d().intValue()) {
            case 1:
                cct a = cct.m12254a(cka.m14146g());
                chn.m13400c("Navigation", "ViewFeaturedPost", a.m12282e());
                if (a.m12288k()) {
                    this.f9253b.getNavHelper().c(a.m12285h(), a.m12282e());
                    return;
                } else {
                    this.f9253b.getNavHelper().l(a.m12282e());
                    return;
                }
            case 2:
                chn.m13445q("Navigation", "ViewFeaturedLink");
                this.f9253b.getNavHelper().k(cka.m14147h().m14117c());
                return;
            default:
                return;
        }
    }

    @dhg
    public void onGoFeaturedList(GoFeaturedListEvent goFeaturedListEvent) {
        this.f9253b.getNavHelper().i(goFeaturedListEvent.f18308a);
    }

    @dhg
    public void onAbSettingClicked(AbSettingClickedEvent abSettingClickedEvent) {
        chn.m13445q("Navigation", "ViewSettings");
        chn.m13328D();
        this.f9253b.getNavHelper().c();
    }

    @dhg
    public void onAbFeedbackClicked(AbFeedbackClickedEvent abFeedbackClickedEvent) {
        m13467f();
    }

    @dhg
    public void onAbAuthClicked(AbAuthClickedEvent abAuthClickedEvent) {
        int i = abAuthClickedEvent.f18301a;
        if (i == 2) {
            m13468g().c(9);
        } else if (i == 1) {
            m13468g().b(9);
        } else if (i == 3 && !ActivityManager.isUserAMonkey() && !(this.f9253b instanceof HomeActivity) && this.f9253b.canShowDialog()) {
            new LogoutDialogFragment().show(this.f9253b.getSupportFragmentManager(), "logout");
        }
    }

    @dhg
    public void onThemeSwitched(ThemeSwitchedEvent themeSwitchedEvent) {
        this.f9253b.updateTheme(true);
    }

    @dhg
    public void onVisitGroup(VisitGroupEvent visitGroupEvent) {
        this.f9253b.goGroupPage(visitGroupEvent.f18300a, true);
    }

    /* renamed from: f */
    private void m13467f() {
        if (this.f9253b.canShowDialog()) {
            chn.m13410f();
            f9252a.m12084n().e().a(m13469h());
        }
    }

    /* renamed from: g */
    private cqd m13468g() {
        return this.f9253b.getNavHelper();
    }

    /* renamed from: h */
    private FragmentManager m13469h() {
        return this.f9253b.getSupportFragmentManager();
    }
}
