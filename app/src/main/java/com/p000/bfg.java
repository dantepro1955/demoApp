package com.p000;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.mediation.NativeAppInstallAdMapper;
import java.util.ArrayList;
import java.util.List;
import p000.aig.C0191a;
import p000.bfb.C1131a;

@bhd
/* renamed from: bfg */
public class bfg extends C1131a {
    /* renamed from: a */
    private final NativeAppInstallAdMapper f5935a;

    public bfg(NativeAppInstallAdMapper nativeAppInstallAdMapper) {
        this.f5935a = nativeAppInstallAdMapper;
    }

    /* renamed from: a */
    public String mo1080a() {
        return this.f5935a.getHeadline();
    }

    /* renamed from: a */
    public void mo1081a(aqq aqq) {
        this.f5935a.handleClick((View) aqr.m4968a(aqq));
    }

    /* renamed from: b */
    public List mo1082b() {
        List<C0191a> images = this.f5935a.getImages();
        if (images == null) {
            return null;
        }
        List arrayList = new ArrayList();
        for (C0191a c0191a : images) {
            arrayList.add(new bbr(c0191a.getDrawable(), c0191a.getUri(), c0191a.getScale()));
        }
        return arrayList;
    }

    /* renamed from: b */
    public void mo1083b(aqq aqq) {
        this.f5935a.trackView((View) aqr.m4968a(aqq));
    }

    /* renamed from: c */
    public String mo1084c() {
        return this.f5935a.getBody();
    }

    /* renamed from: c */
    public void mo1085c(aqq aqq) {
        this.f5935a.untrackView((View) aqr.m4968a(aqq));
    }

    /* renamed from: d */
    public bcc mo1086d() {
        C0191a icon = this.f5935a.getIcon();
        return icon != null ? new bbr(icon.getDrawable(), icon.getUri(), icon.getScale()) : null;
    }

    /* renamed from: e */
    public String mo1087e() {
        return this.f5935a.getCallToAction();
    }

    /* renamed from: f */
    public double mo1088f() {
        return this.f5935a.getStarRating();
    }

    /* renamed from: g */
    public String mo1089g() {
        return this.f5935a.getStore();
    }

    /* renamed from: h */
    public String mo1090h() {
        return this.f5935a.getPrice();
    }

    /* renamed from: i */
    public void mo1091i() {
        this.f5935a.recordImpression();
    }

    /* renamed from: j */
    public boolean mo1092j() {
        return this.f5935a.getOverrideImpressionRecording();
    }

    /* renamed from: k */
    public boolean mo1093k() {
        return this.f5935a.getOverrideClickHandling();
    }

    /* renamed from: l */
    public Bundle mo1094l() {
        return this.f5935a.getExtras();
    }

    /* renamed from: m */
    public baf mo1095m() {
        return this.f5935a.getVideoController() != null ? this.f5935a.getVideoController().m1641a() : null;
    }

    /* renamed from: n */
    public aqq mo1096n() {
        Object adChoicesContent = this.f5935a.getAdChoicesContent();
        return adChoicesContent == null ? null : aqr.m4967a(adChoicesContent);
    }
}
