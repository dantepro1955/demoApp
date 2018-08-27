package com.p000;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.internal.zzhc;
import com.google.android.gms.internal.zzqh;
import p000.azv.C0247a;

@bhd
/* renamed from: ake */
public class ake extends C0247a {
    /* renamed from: a */
    private azt f1807a;
    /* renamed from: b */
    private bcl f1808b;
    /* renamed from: c */
    private bcm f1809c;
    /* renamed from: d */
    private hr<String, bcn> f1810d = new hr();
    /* renamed from: e */
    private hr<String, bco> f1811e = new hr();
    /* renamed from: f */
    private zzhc f1812f;
    /* renamed from: g */
    private bab f1813g;
    /* renamed from: h */
    private final Context f1814h;
    /* renamed from: i */
    private final bex f1815i;
    /* renamed from: j */
    private final String f1816j;
    /* renamed from: k */
    private final zzqh f1817k;
    /* renamed from: l */
    private final ajx f1818l;

    public ake(Context context, String str, bex bex, zzqh zzqh, ajx ajx) {
        this.f1814h = context;
        this.f1816j = str;
        this.f1815i = bex;
        this.f1817k = zzqh;
        this.f1818l = ajx;
    }

    /* renamed from: a */
    public azu mo297a() {
        return new akd(this.f1814h, this.f1816j, this.f1815i, this.f1817k, this.f1807a, this.f1808b, this.f1809c, this.f1811e, this.f1810d, this.f1812f, this.f1813g, this.f1818l);
    }

    /* renamed from: a */
    public void mo298a(azt azt) {
        this.f1807a = azt;
    }

    /* renamed from: a */
    public void mo299a(bab bab) {
        this.f1813g = bab;
    }

    /* renamed from: a */
    public void mo300a(bcl bcl) {
        this.f1808b = bcl;
    }

    /* renamed from: a */
    public void mo301a(bcm bcm) {
        this.f1809c = bcm;
    }

    /* renamed from: a */
    public void mo302a(zzhc zzhc) {
        this.f1812f = zzhc;
    }

    /* renamed from: a */
    public void mo303a(String str, bco bco, bcn bcn) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Custom template ID for native custom template ad is empty. Please provide a valid template id.");
        }
        this.f1811e.put(str, bco);
        this.f1810d.put(str, bcn);
    }
}
