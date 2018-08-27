package com.p000;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.mediation.NativeContentAdMapper;
import java.util.ArrayList;
import java.util.List;
import p000.aig.C0191a;
import p000.bfc.C1133a;

@bhd
/* renamed from: bfh */
public class bfh extends C1133a {
    /* renamed from: a */
    private final NativeContentAdMapper f5936a;

    public bfh(NativeContentAdMapper nativeContentAdMapper) {
        this.f5936a = nativeContentAdMapper;
    }

    /* renamed from: a */
    public String mo1097a() {
        return this.f5936a.getHeadline();
    }

    /* renamed from: a */
    public void mo1098a(aqq aqq) {
        this.f5936a.handleClick((View) aqr.m4968a(aqq));
    }

    /* renamed from: b */
    public List mo1099b() {
        List<C0191a> images = this.f5936a.getImages();
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
    public void mo1100b(aqq aqq) {
        this.f5936a.trackView((View) aqr.m4968a(aqq));
    }

    /* renamed from: c */
    public String mo1101c() {
        return this.f5936a.getBody();
    }

    /* renamed from: c */
    public void mo1102c(aqq aqq) {
        this.f5936a.untrackView((View) aqr.m4968a(aqq));
    }

    /* renamed from: d */
    public bcc mo1103d() {
        C0191a logo = this.f5936a.getLogo();
        return logo != null ? new bbr(logo.getDrawable(), logo.getUri(), logo.getScale()) : null;
    }

    /* renamed from: e */
    public String mo1104e() {
        return this.f5936a.getCallToAction();
    }

    /* renamed from: f */
    public String mo1105f() {
        return this.f5936a.getAdvertiser();
    }

    /* renamed from: g */
    public void mo1106g() {
        this.f5936a.recordImpression();
    }

    /* renamed from: h */
    public boolean mo1107h() {
        return this.f5936a.getOverrideImpressionRecording();
    }

    /* renamed from: i */
    public boolean mo1108i() {
        return this.f5936a.getOverrideClickHandling();
    }

    /* renamed from: j */
    public Bundle mo1109j() {
        return this.f5936a.getExtras();
    }

    /* renamed from: k */
    public aqq mo1110k() {
        Object adChoicesContent = this.f5936a.getAdChoicesContent();
        return adChoicesContent == null ? null : aqr.m4967a(adChoicesContent);
    }

    /* renamed from: l */
    public baf mo1111l() {
        return this.f5936a.getVideoController() != null ? this.f5936a.getVideoController().m1641a() : null;
    }
}
