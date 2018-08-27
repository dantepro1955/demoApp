package com.p000;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.widget.Toast;
import com.facebook.GraphResponse;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.internal.AnalyticsEvents;
import com.facebook.stetho.server.http.HttpStatus;
import com.ninegag.android.app.otto.ApiGotUploadQuotaEvent;
import com.ninegag.android.app.otto.AppStartCompleteEvent;
import com.ninegag.android.app.otto.HintMessageEvent;
import com.ninegag.android.app.otto.LogoutDoneEvent;
import com.ninegag.android.app.otto.RemoteConfigImmediateEffectiveChangedEvent;
import com.ninegag.android.app.otto.UserForcedLogoutEvent;
import com.ninegag.android.app.otto.actionbar.AbChatClickedEvent;
import com.ninegag.android.app.otto.broadcast.ApiCallbackEvent;
import com.ninegag.android.app.otto.updatebanner.CloseBannerEvent;
import com.ninegag.android.app.otto.updatebanner.DisplayBroadcastEvent;
import com.ninegag.android.app.otto.updatebanner.OpenBannerEvent;
import com.ninegag.android.app.ui.HomeActivity;
import com.under9.android.remoteconfig.api.model.ApiBroadcast;
import com.under9.android.remoteconfig.api.model.ApiBroadcastInfo;
import java.util.Timer;
import java.util.TimerTask;

/* compiled from: HomeEventController */
/* renamed from: chx */
public class chx {
    /* renamed from: a */
    private static caf f9308a = caf.m12046a();
    /* renamed from: b */
    private HomeActivity f9309b;
    /* renamed from: c */
    private Timer f9310c;
    /* renamed from: d */
    private boolean f9311d = false;
    /* renamed from: e */
    private boolean f9312e = false;

    /* compiled from: HomeEventController */
    /* renamed from: chx$2 */
    class C17362 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ chx f9301a;

        C17362(chx chx) {
            this.f9301a = chx;
        }

        public void run() {
            if (this.f9301a.f9309b != null) {
                this.f9301a.f9309b.notifyPageAdapter();
            }
        }
    }

    /* compiled from: HomeEventController */
    /* renamed from: chx$3 */
    class C17373 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ chx f9302a;

        C17373(chx chx) {
            this.f9302a = chx;
        }

        public void run() {
            cag x = chx.f9308a.m12094x();
            if (x != null && x.m12104c() && this.f9302a.m13630f() != null) {
            }
        }
    }

    /* renamed from: a */
    public void m13632a(HomeActivity homeActivity) {
        this.f9309b = homeActivity;
        f9308a.m12066c((Object) this);
        f9308a.m12070d((Object) this);
        if (f9308a.m12094x().m12104c() && f9308a.m12077h().aH() == null) {
            f9308a.m12079i().m13586j(-1);
        }
        f9308a.m12079i().m13578e(-1);
        f9308a.m12085o().m14449a(false);
        f9308a.m12085o().m14450b(false);
        f9308a.m12085o().m14452d(false);
        if (!f9308a.m12096z()) {
            djx.a().submit(chy.m13635a(this));
        }
        f9308a.m12069d(this.f9309b);
        m13629e();
        this.f9309b.notifyPageAdapter();
    }

    /* renamed from: a */
    static /* synthetic */ void m13623a(chx chx) {
        cld cld = new cld();
        cld.m12622b("");
        cld.m12630e(Integer.valueOf(-1));
        cct a = cct.m12254a(cld);
        Context f = chx.m13630f();
        for (dhy b : cpw.a(f, new cli(f, a))) {
            b.b(f);
        }
        f9308a.m12058a(true);
    }

    /* renamed from: a */
    public void m13631a() {
    }

    /* renamed from: b */
    public void m13633b() {
    }

    /* renamed from: e */
    private void m13629e() {
        String g = f9308a.m12068d().m12027f() ? f9308a.m12068d().m12028g() : "";
        if (g != null && !g.isEmpty()) {
            String str = AppEventsConstants.EVENT_PARAM_VALUE_NO;
            if (f9308a.m12094x().m12104c()) {
                str = f9308a.m12075g().m13729g().f9565b;
            }
            if (!f9308a.m12077h().m13986a(str)) {
                m13624a(str, (int) (f9308a.m12077h().aX() / 1000), g);
            }
        }
    }

    /* renamed from: a */
    private void m13624a(final String str, final int i, final String str2) {
        this.f9310c = new Timer("appinfo-timer");
        this.f9310c.schedule(new TimerTask(this) {
            /* renamed from: d */
            final /* synthetic */ chx f9300d;

            public void run() {
                chx.f9308a.m12079i().m13557b(str, i, str2, -1);
            }
        }, 400);
    }

    /* renamed from: c */
    public void m13634c() {
        f9308a.m12074f((Object) this);
        f9308a.m12076g((Object) this);
        if (this.f9310c != null) {
            this.f9310c.cancel();
            this.f9310c = null;
        }
    }

    @dhg
    public void onApiCallback(ApiCallbackEvent apiCallbackEvent) {
        Intent intent = apiCallbackEvent.f18303a;
        int intExtra = intent.getIntExtra("command", -1);
        if (intExtra == 100) {
            cag x = f9308a.m12094x();
            boolean c = x == null ? false : x.m12104c();
            if (intent.getBooleanExtra(GraphResponse.SUCCESS_KEY, true)) {
                if (x != null) {
                    x.m12106e();
                }
            } else if (chp.m13478b().m13488e()) {
                if (intent.getBooleanExtra("force_logout", true)) {
                    if (c) {
                        this.f9309b.getSocialController().b(true);
                        this.f9309b.getNavHelper().l();
                        chn.m13460w("Forced logout - " + intent.getStringExtra(AnalyticsEvents.PARAMETER_SHARE_ERROR_MESSAGE));
                        f9308a.m12061b(this.f9309b.getApplicationContext());
                        dhe.a().c(new UserForcedLogoutEvent());
                    } else {
                        chn.m13462x("Forced logout - " + intent.getStringExtra(AnalyticsEvents.PARAMETER_SHARE_ERROR_MESSAGE));
                    }
                }
                CharSequence stringExtra = intent.getStringExtra(AnalyticsEvents.PARAMETER_SHARE_ERROR_MESSAGE);
                if (stringExtra != null) {
                    Toast.makeText(this.f9309b, stringExtra, 1).show();
                }
            }
        } else if (intExtra == HttpStatus.HTTP_OK) {
            f9308a.m12054a(new ApiGotUploadQuotaEvent());
        } else if (intExtra == 115) {
            Log.d("NewPostCountAPI", "onApiCallback() at HomeEventController: is called " + apiCallbackEvent.f18303a.getIntExtra("command", -1));
        }
    }

    @dhg
    public void onRemoteConfigImmediateEffectiveChanged(RemoteConfigImmediateEffectiveChangedEvent remoteConfigImmediateEffectiveChangedEvent) {
        chn.m13384a(f9308a.m12087q().m14432l());
        f9308a.m12069d(this.f9309b);
        if (m13630f() != null && !m13630f().isFinishing()) {
            crk.a(m13630f(), "225dac9c104265051c0da74c22840df8cd3edf23");
        }
    }

    @dhg
    public void onLogoutDone(LogoutDoneEvent logoutDoneEvent) {
        if (m13630f() != null) {
            m13630f().runOnUiThread(new C17362(this));
        }
    }

    @dhg
    public void onGagNotiUnreadCountUpdate(dge dge) {
        if (m13630f() != null) {
            m13630f().runOnUiThread(new C17373(this));
        }
    }

    @dhg
    public void onHintMessage(final HintMessageEvent hintMessageEvent) {
        m13630f().runOnUiThread(new Runnable(this) {
            /* renamed from: b */
            final /* synthetic */ chx f9304b;

            public void run() {
                this.f9304b.m13630f().showToast(hintMessageEvent.f18285a);
            }
        });
    }

    @dhg
    public void onAbChatClicked(AbChatClickedEvent abChatClickedEvent) {
        if (this.f9309b != null) {
            this.f9309b.getNavHelper().h();
        }
    }

    @dhg
    public void onCloseBanner(CloseBannerEvent closeBannerEvent) {
        try {
            this.f9309b.getBannerManager().f();
        } catch (Exception e) {
        }
    }

    @dhg
    public void onOpenBanner(OpenBannerEvent openBannerEvent) {
        try {
            ApiBroadcastInfo d = dmz.d(openBannerEvent.f18357a);
            if (d != null) {
                String str = d.actionUrl;
                Intent intent = new Intent();
                intent.setAction("android.intent.action.VIEW");
                intent.setData(Uri.parse(str));
                this.f9309b.startActivity(intent);
                this.f9309b.getBannerManager().f();
            }
        } catch (Exception e) {
        }
    }

    @dhg
    public void onAppStartComplete(AppStartCompleteEvent appStartCompleteEvent) {
    }

    /* renamed from: a */
    private void m13625a(final String str, long j, final boolean z) {
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable(this) {
            /* renamed from: c */
            final /* synthetic */ chx f9307c;

            public void run() {
                if (z) {
                    dhe.c(new DisplayBroadcastEvent());
                } else if (dlq.b(str)) {
                    dhe.c(new DisplayBroadcastEvent());
                }
            }
        }, j);
    }

    @dhg
    public void onDisplayBroadcast(DisplayBroadcastEvent displayBroadcastEvent) {
        Object obj = 1;
        if (!f9308a.m12075g().m13727f()) {
            try {
                for (ApiBroadcast d : f9308a.m12086p().d()) {
                    dlq.a(dmz.d(d).imageUrl);
                }
                ApiBroadcast c = f9308a.m12086p().c();
                if (c != null) {
                    String str = dmz.d(c).imageUrl;
                    if (this.f9311d || dlq.b(str)) {
                        this.f9311d = true;
                        if (!this.f9312e) {
                            this.f9312e = true;
                            if (dmz.a(c)) {
                                this.f9309b.getBannerManager().a(this.f9309b, new cgt(c));
                            } else if (dmz.b(c)) {
                                this.f9309b.getBannerManager().a(this.f9309b, new cgv(c));
                            } else {
                                obj = null;
                            }
                            if (obj != null) {
                                f9308a.m12075g().m13710a(true);
                                f9308a.m12086p().a(c);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    this.f9311d = true;
                    dlq.a(str);
                    m13625a(str, 1000, false);
                    m13625a(str, 2000, false);
                    m13625a(str, 3000, false);
                    m13625a(str, 4000, false);
                    m13625a(str, 5000, true);
                }
            } catch (Exception e) {
            }
        }
    }

    /* renamed from: f */
    private HomeActivity m13630f() {
        return this.f9309b;
    }
}
