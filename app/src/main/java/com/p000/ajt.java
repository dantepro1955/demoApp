package com.p000;

import android.os.Debug;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewParent;
import com.facebook.appevents.AppEventsConstants;
import com.google.android.gms.ads.internal.zzx;
import com.google.android.gms.ads.internal.zzx.zza;
import com.google.android.gms.internal.zzec;
import com.google.android.gms.internal.zzeg;
import com.google.android.gms.internal.zzfc;
import com.google.android.gms.internal.zzfr;
import com.google.android.gms.internal.zzft;
import com.google.android.gms.internal.zzoo;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.CountDownLatch;
import p000.azx.C0217a;
import p000.bgo.C0218a;
import p000.bhe.C0219a;
import p000.bjt.C1254a;

@bhd
/* renamed from: ajt */
public abstract class ajt extends C0217a implements aix, azd, bct, C0218a, C0219a, bjy {
    /* renamed from: a */
    protected bbj f1721a;
    /* renamed from: b */
    protected bbh f1722b;
    /* renamed from: c */
    protected bbh f1723c;
    /* renamed from: d */
    protected boolean f1724d = false;
    /* renamed from: e */
    protected final akl f1725e;
    /* renamed from: f */
    protected final zzx f1726f;
    /* renamed from: g */
    protected transient zzec f1727g;
    /* renamed from: h */
    protected final axz f1728h;
    /* renamed from: i */
    protected final ajx f1729i;

    ajt(zzx zzx, akl akl, ajx ajx) {
        this.f1726f = zzx;
        if (akl == null) {
            akl = new akl(this);
        }
        this.f1725e = akl;
        this.f1729i = ajx;
        ako.m2343e().m9124b(this.f1726f.f14551c);
        ako.m2347i().m8928a(this.f1726f.f14551c, this.f1726f.f14553e);
        ako.m2348j().m6675a(this.f1726f.f14551c);
        this.f1728h = ako.m2347i().m8964s();
        ako.m2346h().m6608a(this.f1726f.f14551c);
        mo274x();
    }

    /* renamed from: a */
    private TimerTask m1950a(final Timer timer, final CountDownLatch countDownLatch) {
        return new TimerTask(this) {
            /* renamed from: c */
            final /* synthetic */ ajt f1720c;

            public void run() {
                if (((long) ((Integer) bbb.cv.m7064c()).intValue()) != countDownLatch.getCount()) {
                    bky.m9006b("Stopping method tracing");
                    Debug.stopMethodTracing();
                    if (countDownLatch.getCount() == 0) {
                        timer.cancel();
                        return;
                    }
                }
                String concat = String.valueOf(this.f1720c.f1726f.f14551c.getPackageName()).concat("_adsTrace_");
                try {
                    bky.m9006b("Starting method tracing");
                    countDownLatch.countDown();
                    Debug.startMethodTracing(new StringBuilder(String.valueOf(concat).length() + 20).append(concat).append(ako.m2349k().mo606a()).toString(), ((Integer) bbb.cw.m7064c()).intValue());
                } catch (Throwable e) {
                    bky.m9009c("Exception occurred while starting method tracing.", e);
                }
            }
        };
    }

    /* renamed from: d */
    private zzec mo288d(zzec zzec) {
        return (!apw.m4892c(this.f1726f.f14551c) || zzec.f14923k == null) ? zzec : new azj(zzec).m6725a(null).m6726a();
    }

    /* renamed from: x */
    private void mo274x() {
        if (((Boolean) bbb.ct.m7064c()).booleanValue()) {
            Timer timer = new Timer();
            timer.schedule(m1950a(timer, new CountDownLatch(((Integer) bbb.cv.m7064c()).intValue())), 0, ((Long) bbb.cu.m7064c()).longValue());
        }
    }

    /* renamed from: a */
    protected List<String> m1953a(String str, List<String> list) {
        if (str == null) {
            return list;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (String b : list) {
            arrayList.add(m1979b(str, b));
        }
        return arrayList;
    }

    /* renamed from: a */
    protected void m1954a(int i) {
        bky.m9011e("Failed to load ad: " + i);
        this.f1724d = false;
        if (this.f1726f.f14562n != null) {
            try {
                this.f1726f.f14562n.mo860a(i);
            } catch (Throwable e) {
                bky.m9009c("Could not call AdListener.onAdFailedToLoad().", e);
            }
        }
        if (this.f1726f.f14534A != null) {
            try {
                this.f1726f.f14534A.mo1010a(i);
            } catch (Throwable e2) {
                bky.m9009c("Could not call RewardedVideoAdListener.onRewardedVideoAdFailedToLoad().", e2);
            }
        }
    }

    /* renamed from: a */
    protected void m1955a(View view) {
        zza zza = this.f1726f.f14554f;
        if (zza != null) {
            zza.addView(view, ako.m2345g().mo1280d());
        }
    }

    /* renamed from: a */
    public void mo226a(azs azs) {
        aoi.m4687b("setAdListener must be called on the main UI thread.");
        this.f1726f.f14561m = azs;
    }

    /* renamed from: a */
    public void mo227a(azt azt) {
        aoi.m4687b("setAdListener must be called on the main UI thread.");
        this.f1726f.f14562n = azt;
    }

    /* renamed from: a */
    public void mo228a(azz azz) {
        aoi.m4687b("setAppEventListener must be called on the main UI thread.");
        this.f1726f.f14563o = azz;
    }

    /* renamed from: a */
    public void mo229a(bab bab) {
        aoi.m4687b("setCorrelationIdProvider must be called on the main UI thread");
        this.f1726f.f14564p = bab;
    }

    /* renamed from: a */
    public void mo230a(bbn bbn) {
        throw new IllegalStateException("setOnCustomRenderedAdLoadedListener is not supported for current ad type");
    }

    /* renamed from: a */
    public void mo231a(bgc bgc) {
        throw new IllegalStateException("setInAppPurchaseListener is not supported for current ad type");
    }

    /* renamed from: a */
    public void mo232a(bgg bgg, String str) {
        throw new IllegalStateException("setPlayStorePurchaseParams is not supported for current ad type");
    }

    /* renamed from: a */
    public void mo233a(biq biq) {
        aoi.m4687b("setRewardedVideoAdListener can only be called from the UI thread.");
        this.f1726f.f14534A = biq;
    }

    /* renamed from: a */
    public void mo234a(C1254a c1254a) {
        if (!(c1254a.f6530b.f15088n == -1 || TextUtils.isEmpty(c1254a.f6530b.f15099y))) {
            long b = m1978b(c1254a.f6530b.f15099y);
            if (b != -1) {
                bbh a = this.f1721a.m7162a(b + c1254a.f6530b.f15088n);
                this.f1721a.m7167a(a, "stc");
            }
        }
        this.f1721a.m7164a(c1254a.f6530b.f15099y);
        this.f1721a.m7167a(this.f1722b, "arf");
        this.f1723c = this.f1721a.m7161a();
        this.f1721a.m7165a("gqi", c1254a.f6530b.f15100z);
        this.f1726f.f14555g = null;
        this.f1726f.f14559k = c1254a;
        mo282a(c1254a, this.f1721a);
    }

    /* renamed from: a */
    protected abstract void mo282a(C1254a c1254a, bbj bbj);

    /* renamed from: a */
    public void mo235a(zzeg zzeg) {
        aoi.m4687b("setAdSize must be called on the main UI thread.");
        this.f1726f.f14557i = zzeg;
        if (!(this.f1726f.f14558j == null || this.f1726f.f14558j.f6547b == null || this.f1726f.f14539F != 0)) {
            this.f1726f.f14558j.f6547b.mo1301a(zzeg);
        }
        if (this.f1726f.f14554f != null) {
            if (this.f1726f.f14554f.getChildCount() > 1) {
                this.f1726f.f14554f.removeView(this.f1726f.f14554f.getNextView());
            }
            this.f1726f.f14554f.setMinimumWidth(zzeg.f14936f);
            this.f1726f.f14554f.setMinimumHeight(zzeg.f14933c);
            this.f1726f.f14554f.requestLayout();
        }
    }

    /* renamed from: a */
    public void mo236a(zzfc zzfc) {
        aoi.m4687b("setIconAdOptions must be called on the main UI thread.");
        this.f1726f.f14573y = zzfc;
    }

    /* renamed from: a */
    public void mo237a(zzft zzft) {
        aoi.m4687b("setVideoOptions must be called on the main UI thread.");
        this.f1726f.f14572x = zzft;
    }

    /* renamed from: a */
    protected void m1969a(zzoo zzoo) {
        if (this.f1726f.f14534A != null) {
            try {
                String str = "";
                int i = 1;
                if (zzoo != null) {
                    str = zzoo.f15114a;
                    i = zzoo.f15115b;
                }
                this.f1726f.f14534A.mo1011a(new bik(str, i));
            } catch (Throwable e) {
                bky.m9009c("Could not call RewardedVideoAdListener.onRewarded().", e);
            }
        }
    }

    /* renamed from: a */
    public void mo238a(String str) {
        bky.m9011e("RewardedVideoAd.setUserId() is deprecated. Please do not call this method.");
    }

    /* renamed from: a */
    public void mo239a(String str, String str2) {
        if (this.f1726f.f14563o != null) {
            try {
                this.f1726f.f14563o.mo867a(str, str2);
            } catch (Throwable e) {
                bky.m9009c("Could not call the AppEventListener.", e);
            }
        }
    }

    /* renamed from: a */
    public void mo240a(HashSet<bju> hashSet) {
        this.f1726f.m19369a((HashSet) hashSet);
    }

    /* renamed from: a */
    public void mo241a(boolean z) {
        throw new UnsupportedOperationException("Attempt to call setManualImpressionsEnabled for an unsupported ad type.");
    }

    /* renamed from: a */
    boolean mo267a(bjt bjt) {
        return false;
    }

    /* renamed from: a */
    protected abstract boolean mo268a(bjt bjt, bjt bjt2);

    /* renamed from: a */
    public boolean mo242a(zzec zzec) {
        aoi.m4687b("loadAd must be called on the main UI thread.");
        ako.m2348j().m6674a();
        if (((Boolean) bbb.aR.m7064c()).booleanValue()) {
            zzec.m19664a(zzec);
        }
        zzec d = mo288d(zzec);
        if (this.f1726f.f14555g == null && this.f1726f.f14556h == null) {
            bky.m9010d("Starting ad request.");
            m1987g();
            this.f1722b = this.f1721a.m7161a();
            if (!d.f14918f) {
                String valueOf = String.valueOf(azp.m6789a().m9285a(this.f1726f.f14551c));
                bky.m9010d(new StringBuilder(String.valueOf(valueOf).length() + 71).append("Use AdRequest.Builder.addTestDevice(\"").append(valueOf).append("\") to get test ads on this device.").toString());
            }
            this.f1725e.m2276a(d);
            this.f1724d = mo269a(d, this.f1721a);
            return this.f1724d;
        }
        if (this.f1727g != null) {
            bky.m9011e("Aborting last ad request since another ad request is already in progress. The current request object will still be cached for future refreshes.");
        } else {
            bky.m9011e("Loading already in progress, saving this object for future refreshes.");
        }
        this.f1727g = d;
        return false;
    }

    /* renamed from: a */
    protected abstract boolean mo269a(zzec zzec, bbj bbj);

    /* renamed from: b */
    long m1978b(String str) {
        int indexOf = str.indexOf("ufe");
        int indexOf2 = str.indexOf(44, indexOf);
        if (indexOf2 == -1) {
            indexOf2 = str.length();
        }
        try {
            return Long.parseLong(str.substring(indexOf + 4, indexOf2));
        } catch (IndexOutOfBoundsException e) {
            bky.m9011e("Invalid index for Url fetch time in CSI latency info.");
            return -1;
        } catch (NumberFormatException e2) {
            bky.m9011e("Cannot find valid format of Url fetch time in CSI latency info.");
            return -1;
        }
    }

    /* renamed from: b */
    protected String m1979b(String str, String str2) {
        return (str == null || TextUtils.isEmpty(str2)) ? str2 : ako.m2343e().m9080a(str2, "fbs_aeid", str).toString();
    }

    /* renamed from: b */
    public void mo243b(bjt bjt) {
        this.f1721a.m7167a(this.f1723c, "awr");
        this.f1726f.f14556h = null;
        if (!(bjt.f6549d == -2 || bjt.f6549d == 3)) {
            ako.m2347i().m8935a(this.f1726f.m19368a());
        }
        if (bjt.f6549d == -1) {
            this.f1724d = false;
            return;
        }
        if (mo267a(bjt)) {
            bky.m9006b("Ad refresh scheduled.");
        }
        if (bjt.f6549d != -2) {
            m1954a(bjt.f6549d);
            return;
        }
        if (this.f1726f.f14537D == null) {
            this.f1726f.f14537D = new bjz(this.f1726f.f14550b);
        }
        this.f1728h.m6456b(this.f1726f.f14558j);
        if (mo268a(this.f1726f.f14558j, bjt)) {
            this.f1726f.f14558j = bjt;
            this.f1726f.m19378i();
            this.f1721a.m7165a("is_mraid", this.f1726f.f14558j.m8899a() ? "1" : AppEventsConstants.EVENT_PARAM_VALUE_NO);
            this.f1721a.m7165a("is_mediation", this.f1726f.f14558j.f6559n ? "1" : AppEventsConstants.EVENT_PARAM_VALUE_NO);
            if (!(this.f1726f.f14558j.f6547b == null || this.f1726f.f14558j.f6547b.mo1322l() == null)) {
                this.f1721a.m7165a("is_delay_pl", this.f1726f.f14558j.f6547b.mo1322l().m9429f() ? "1" : AppEventsConstants.EVENT_PARAM_VALUE_NO);
            }
            this.f1721a.m7167a(this.f1722b, "ttc");
            if (ako.m2347i().m8951f() != null) {
                ako.m2347i().m8951f().m7143a(this.f1721a);
            }
            if (this.f1726f.m19374e()) {
                mo310u();
            }
        }
        if (bjt.f6545I != null) {
            ako.m2343e().m9105a(this.f1726f.f14551c, bjt.f6545I);
        }
    }

    /* renamed from: b */
    protected boolean mo271b(zzec zzec) {
        if (this.f1726f.f14554f == null) {
            return false;
        }
        ViewParent parent = this.f1726f.f14554f.getParent();
        if (!(parent instanceof View)) {
            return false;
        }
        View view = (View) parent;
        return ako.m2343e().m9113a(view, view.getContext());
    }

    /* renamed from: c */
    protected void m1982c(bjt bjt) {
        if (bjt == null) {
            bky.m9011e("Ad state was null when trying to ping impression URLs.");
            return;
        }
        bky.m9006b("Pinging Impression URLs.");
        if (this.f1726f.f14560l != null) {
            this.f1726f.f14560l.m8904a();
        }
        if (bjt.f6550e != null && !bjt.f6542F) {
            String d = ako.m2336D().m8886d(this.f1726f.f14551c);
            ako.m2343e().m9102a(this.f1726f.f14551c, this.f1726f.f14553e.f15121a, m1953a(d, bjt.f6550e));
            bjt.f6542F = true;
            m1984d(bjt);
            if (bjt.f6550e.size() > 0) {
                ako.m2336D().m8887d(this.f1726f.f14551c, d);
            }
        }
    }

    /* renamed from: c */
    public void m1983c(zzec zzec) {
        if (mo271b(zzec)) {
            mo242a(zzec);
            return;
        }
        bky.m9010d("Ad is not visible. Not refreshing ad.");
        this.f1725e.m2279b(zzec);
    }

    /* renamed from: d */
    protected void m1984d(bjt bjt) {
        if (bjt != null && !TextUtils.isEmpty(bjt.f6540D) && !bjt.f6544H && ako.m2351m().m9228b()) {
            bky.m9006b("Sending troubleshooting signals to the server.");
            ako.m2351m().m9223a(this.f1726f.f14551c, this.f1726f.f14553e.f15121a, bjt.f6540D, this.f1726f.f14550b);
            bjt.f6544H = true;
        }
    }

    /* renamed from: e */
    public void mo244e() {
        m1999s();
    }

    /* renamed from: f */
    public ajx m1986f() {
        return this.f1729i;
    }

    /* renamed from: g */
    public void m1987g() {
        this.f1721a = new bbj(((Boolean) bbb.f5387T.m7064c()).booleanValue(), "load_ad", this.f1726f.f14557i.f14931a);
        this.f1722b = new bbh(-1, null, null);
        this.f1723c = new bbh(-1, null, null);
    }

    /* renamed from: h */
    public void mo245h() {
        aoi.m4687b("destroy must be called on the main UI thread.");
        this.f1725e.m2275a();
        this.f1728h.m6457c(this.f1726f.f14558j);
        this.f1726f.m19379j();
    }

    /* renamed from: i */
    public aqq mo246i() {
        aoi.m4687b("getAdFrame must be called on the main UI thread.");
        return aqr.m4967a(this.f1726f.f14554f);
    }

    /* renamed from: j */
    public zzeg mo247j() {
        aoi.m4687b("getAdSize must be called on the main UI thread.");
        return this.f1726f.f14557i == null ? null : new zzfr(this.f1726f.f14557i);
    }

    /* renamed from: k */
    public boolean mo248k() {
        aoi.m4687b("isLoaded must be called on the main UI thread.");
        return this.f1726f.f14555g == null && this.f1726f.f14556h == null && this.f1726f.f14558j != null;
    }

    /* renamed from: l */
    public void mo249l() {
        aoi.m4687b("recordManualImpression must be called on the main UI thread.");
        if (this.f1726f.f14558j == null) {
            bky.m9011e("Ad state was null when trying to ping manual tracking URLs.");
            return;
        }
        bky.m9006b("Pinging manual tracking URLs.");
        if (this.f1726f.f14558j.f6551f != null && !this.f1726f.f14558j.f6543G) {
            ako.m2343e().m9102a(this.f1726f.f14551c, this.f1726f.f14553e.f15121a, this.f1726f.f14558j.f6551f);
            this.f1726f.f14558j.f6543G = true;
            m2003w();
        }
    }

    /* renamed from: m */
    public void mo250m() {
        aoi.m4687b("pause must be called on the main UI thread.");
    }

    /* renamed from: n */
    public void mo251n() {
        aoi.m4687b("resume must be called on the main UI thread.");
    }

    /* renamed from: o */
    public void mo252o() {
        aoi.m4687b("stopLoading must be called on the main UI thread.");
        this.f1724d = false;
        this.f1726f.m19370a(true);
    }

    public void onAdClicked() {
        if (this.f1726f.f14558j == null) {
            bky.m9011e("Ad state was null when trying to ping click URLs.");
            return;
        }
        bky.m9006b("Pinging click URLs.");
        if (this.f1726f.f14560l != null) {
            this.f1726f.f14560l.m8908b();
        }
        if (this.f1726f.f14558j.f6548c != null) {
            String d = ako.m2336D().m8886d(this.f1726f.f14551c);
            ako.m2343e().m9102a(this.f1726f.f14551c, this.f1726f.f14553e.f15121a, m1953a(d, this.f1726f.f14558j.f6548c));
            if (this.f1726f.f14558j.f6548c.size() > 0) {
                ako.m2336D().m8884c(this.f1726f.f14551c, d);
            }
        }
        if (this.f1726f.f14561m != null) {
            try {
                this.f1726f.f14561m.mo858a();
            } catch (Throwable e) {
                bky.m9009c("Could not notify onAdClicked event.", e);
            }
        }
    }

    /* renamed from: p */
    public boolean mo254p() {
        return this.f1724d;
    }

    /* renamed from: q */
    public baf mo255q() {
        return null;
    }

    /* renamed from: r */
    protected void mo309r() {
        bky.m9010d("Ad closing.");
        if (this.f1726f.f14562n != null) {
            try {
                this.f1726f.f14562n.mo859a();
            } catch (Throwable e) {
                bky.m9009c("Could not call AdListener.onAdClosed().", e);
            }
        }
        if (this.f1726f.f14534A != null) {
            try {
                this.f1726f.f14534A.mo1014d();
            } catch (Throwable e2) {
                bky.m9009c("Could not call RewardedVideoAdListener.onRewardedVideoAdClosed().", e2);
            }
        }
    }

    /* renamed from: s */
    protected void m1999s() {
        bky.m9010d("Ad leaving application.");
        if (this.f1726f.f14562n != null) {
            try {
                this.f1726f.f14562n.mo861b();
            } catch (Throwable e) {
                bky.m9009c("Could not call AdListener.onAdLeftApplication().", e);
            }
        }
        if (this.f1726f.f14534A != null) {
            try {
                this.f1726f.f14534A.mo1015e();
            } catch (Throwable e2) {
                bky.m9009c("Could not call  RewardedVideoAdListener.onRewardedVideoAdLeftApplication().", e2);
            }
        }
    }

    /* renamed from: t */
    protected void m2000t() {
        bky.m9010d("Ad opening.");
        if (this.f1726f.f14562n != null) {
            try {
                this.f1726f.f14562n.mo863d();
            } catch (Throwable e) {
                bky.m9009c("Could not call AdListener.onAdOpened().", e);
            }
        }
        if (this.f1726f.f14534A != null) {
            try {
                this.f1726f.f14534A.mo1012b();
            } catch (Throwable e2) {
                bky.m9009c("Could not call RewardedVideoAdListener.onRewardedVideoAdOpened().", e2);
            }
        }
    }

    /* renamed from: u */
    protected void mo310u() {
        bky.m9010d("Ad finished loading.");
        this.f1724d = false;
        if (this.f1726f.f14562n != null) {
            try {
                this.f1726f.f14562n.mo862c();
            } catch (Throwable e) {
                bky.m9009c("Could not call AdListener.onAdLoaded().", e);
            }
        }
        if (this.f1726f.f14534A != null) {
            try {
                this.f1726f.f14534A.mo1009a();
            } catch (Throwable e2) {
                bky.m9009c("Could not call RewardedVideoAdListener.onRewardedVideoAdLoaded().", e2);
            }
        }
    }

    /* renamed from: v */
    protected void m2002v() {
        if (this.f1726f.f14534A != null) {
            try {
                this.f1726f.f14534A.mo1013c();
            } catch (Throwable e) {
                bky.m9009c("Could not call RewardedVideoAdListener.onVideoStarted().", e);
            }
        }
    }

    /* renamed from: w */
    public void m2003w() {
        m1984d(this.f1726f.f14558j);
    }
}
