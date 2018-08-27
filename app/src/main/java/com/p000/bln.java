package com.p000;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import com.google.android.gms.ads.internal.overlay.zzl;

@bhd
/* renamed from: bln */
public class bln {
    /* renamed from: a */
    private final blo f6824a;
    /* renamed from: b */
    private final Context f6825b;
    /* renamed from: c */
    private final ViewGroup f6826c;
    /* renamed from: d */
    private zzl f6827d;

    public bln(Context context, ViewGroup viewGroup, blo blo) {
        this(context, viewGroup, blo, null);
    }

    bln(Context context, ViewGroup viewGroup, blo blo, zzl zzl) {
        this.f6825b = context;
        this.f6826c = viewGroup;
        this.f6824a = blo;
        this.f6827d = zzl;
    }

    /* renamed from: a */
    public zzl m9341a() {
        aoi.m4687b("getAdVideoUnderlay must be called from the UI thread.");
        return this.f6827d;
    }

    /* renamed from: a */
    public void m9342a(int i, int i2, int i3, int i4) {
        aoi.m4687b("The underlay may only be modified from the UI thread.");
        if (this.f6827d != null) {
            this.f6827d.m19337a(i, i2, i3, i4);
        }
    }

    /* renamed from: a */
    public void m9343a(int i, int i2, int i3, int i4, int i5, boolean z) {
        if (this.f6827d == null) {
            bbf.m7148a(this.f6824a.mo1345y().m7158a(), this.f6824a.mo1344x(), "vpr2");
            this.f6827d = new zzl(this.f6825b, this.f6824a, i5, z, this.f6824a.mo1345y().m7158a());
            this.f6826c.addView(this.f6827d, 0, new LayoutParams(-1, -1));
            this.f6827d.m19337a(i, i2, i3, i4);
            this.f6824a.mo1322l().m9420a(false);
        }
    }

    /* renamed from: b */
    public void m9344b() {
        aoi.m4687b("onPause must be called from the UI thread.");
        if (this.f6827d != null) {
            this.f6827d.m19348i();
        }
    }

    /* renamed from: c */
    public void m9345c() {
        aoi.m4687b("onDestroy must be called from the UI thread.");
        if (this.f6827d != null) {
            this.f6827d.m19353n();
            this.f6826c.removeView(this.f6827d);
            this.f6827d = null;
        }
    }
}
