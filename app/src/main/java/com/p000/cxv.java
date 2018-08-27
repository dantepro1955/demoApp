package com.p000;

import android.annotation.TargetApi;
import android.graphics.BitmapFactory.Options;
import android.os.Build.VERSION;

/* compiled from: ImageDecodingInfo */
/* renamed from: cxv */
public class cxv {
    /* renamed from: a */
    private final String f20637a;
    /* renamed from: b */
    private final String f20638b;
    /* renamed from: c */
    private final String f20639c;
    /* renamed from: d */
    private final cxm f20640d;
    /* renamed from: e */
    private final cxl f20641e;
    /* renamed from: f */
    private final cxp f20642f;
    /* renamed from: g */
    private final cxy f20643g;
    /* renamed from: h */
    private final Object f20644h;
    /* renamed from: i */
    private final boolean f20645i;
    /* renamed from: j */
    private final Options f20646j = new Options();

    public cxv(String str, String str2, String str3, cxm cxm, cxp cxp, cxy cxy, cxd cxd) {
        this.f20637a = str;
        this.f20638b = str2;
        this.f20639c = str3;
        this.f20640d = cxm;
        this.f20641e = cxd.m25470j();
        this.f20642f = cxp;
        this.f20643g = cxy;
        this.f20644h = cxd.m25474n();
        this.f20645i = cxd.m25473m();
        m25565a(cxd.m25471k(), this.f20646j);
    }

    /* renamed from: a */
    private void m25565a(Options options, Options options2) {
        options2.inDensity = options.inDensity;
        options2.inDither = options.inDither;
        options2.inInputShareable = options.inInputShareable;
        options2.inJustDecodeBounds = options.inJustDecodeBounds;
        options2.inPreferredConfig = options.inPreferredConfig;
        options2.inPurgeable = options.inPurgeable;
        options2.inSampleSize = options.inSampleSize;
        options2.inScaled = options.inScaled;
        options2.inScreenDensity = options.inScreenDensity;
        options2.inTargetDensity = options.inTargetDensity;
        options2.inTempStorage = options.inTempStorage;
        if (VERSION.SDK_INT >= 10) {
            m25566b(options, options2);
        }
        if (VERSION.SDK_INT >= 11) {
            m25567c(options, options2);
        }
    }

    @TargetApi(10)
    /* renamed from: b */
    private void m25566b(Options options, Options options2) {
        options2.inPreferQualityOverSpeed = options.inPreferQualityOverSpeed;
    }

    @TargetApi(11)
    /* renamed from: c */
    private void m25567c(Options options, Options options2) {
        options2.inBitmap = options.inBitmap;
        options2.inMutable = options.inMutable;
    }
}
