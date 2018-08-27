package com.p000;

import android.content.Context;
import com.google.android.gms.internal.zzeg;
import com.google.android.gms.internal.zzoa;
import com.google.android.gms.internal.zzqh;
import p000.bio.C1237a;

@bhd
/* renamed from: bil */
public class bil extends C1237a {
    /* renamed from: a */
    private final Context f6453a;
    /* renamed from: b */
    private final Object f6454b;
    /* renamed from: c */
    private final zzqh f6455c;
    /* renamed from: d */
    private final bim f6456d;

    public bil(Context context, ajx ajx, bex bex, zzqh zzqh) {
        this(context, zzqh, new bim(context, ajx, zzeg.m19666a(), bex, zzqh));
    }

    bil(Context context, zzqh zzqh, bim bim) {
        this.f6454b = new Object();
        this.f6453a = context;
        this.f6455c = zzqh;
        this.f6456d = bim;
    }

    /* renamed from: a */
    public void mo1205a() {
        synchronized (this.f6454b) {
            this.f6456d.m8709K();
        }
    }

    /* renamed from: a */
    public void mo1206a(aqq aqq) {
        synchronized (this.f6454b) {
            this.f6456d.mo250m();
        }
    }

    /* renamed from: a */
    public void mo1207a(biq biq) {
        synchronized (this.f6454b) {
            this.f6456d.mo233a(biq);
        }
    }

    /* renamed from: a */
    public void mo1208a(zzoa zzoa) {
        synchronized (this.f6454b) {
            this.f6456d.m8718a(zzoa);
        }
    }

    /* renamed from: a */
    public void mo1209a(String str) {
        bky.m9011e("RewardedVideoAd.setUserId() is deprecated. Please do not call this method.");
    }

    /* renamed from: b */
    public void mo1210b(aqq aqq) {
        synchronized (this.f6454b) {
            Context context = aqq == null ? null : (Context) aqr.m4968a(aqq);
            if (context != null) {
                try {
                    this.f6456d.m8716a(context);
                } catch (Throwable e) {
                    bky.m9009c("Unable to extract updated context.", e);
                }
            }
            this.f6456d.mo251n();
        }
    }

    /* renamed from: b */
    public boolean mo1211b() {
        boolean L;
        synchronized (this.f6454b) {
            L = this.f6456d.m8710L();
        }
        return L;
    }

    /* renamed from: c */
    public void mo1212c() {
        mo1206a(null);
    }

    /* renamed from: c */
    public void mo1213c(aqq aqq) {
        synchronized (this.f6454b) {
            this.f6456d.mo245h();
        }
    }

    /* renamed from: d */
    public void mo1214d() {
        mo1210b(null);
    }

    /* renamed from: e */
    public void mo1215e() {
        mo1213c(null);
    }
}
