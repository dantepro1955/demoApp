package com.p000;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.os.Parcel;
import android.util.Base64;
import com.facebook.stetho.common.Utf8Charset;
import com.google.android.gms.internal.zzec;
import com.under9.android.lib.network.model.Constants;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p000.bdx.C1082a;
import p000.bic.C1232a;

@bhd
/* renamed from: bdu */
public class bdu {
    /* renamed from: a */
    private final Map<bdw, bdx> f5704a = new HashMap();
    /* renamed from: b */
    private final LinkedList<bdw> f5705b = new LinkedList();
    /* renamed from: c */
    private bdr f5706c;

    /* renamed from: a */
    static String m7673a(String str) {
        try {
            Matcher matcher = Pattern.compile("([^/]+/[0-9]+).*").matcher(str);
            if (matcher.matches()) {
                str = matcher.group(1);
            }
        } catch (RuntimeException e) {
        }
        return str;
    }

    /* renamed from: a */
    static Set<String> m7674a(zzec zzec) {
        Set<String> hashSet = new HashSet();
        hashSet.addAll(zzec.f14915c.keySet());
        Bundle bundle = zzec.f14925m.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
        if (bundle != null) {
            hashSet.addAll(bundle.keySet());
        }
        return hashSet;
    }

    /* renamed from: a */
    private static void m7675a(Bundle bundle, String str) {
        String[] split = str.split(Constants.SEP, 2);
        if (split.length != 0) {
            String str2 = split[0];
            if (split.length == 1) {
                bundle.remove(str2);
                return;
            }
            Bundle bundle2 = bundle.getBundle(str2);
            if (bundle2 != null) {
                bdu.m7675a(bundle2, split[1]);
            }
        }
    }

    /* renamed from: a */
    private static void m7676a(String str, bdw bdw) {
        if (bky.m9005a(2)) {
            bkc.m9012a(String.format(str, new Object[]{bdw}));
        }
    }

    /* renamed from: b */
    static zzec m7677b(zzec zzec) {
        zzec e = bdu.m7683e(zzec);
        bdu.m7679c(e, "_skipMediation");
        return e;
    }

    /* renamed from: b */
    private String[] m7678b(String str) {
        try {
            String[] split = str.split("\u0000");
            for (int i = 0; i < split.length; i++) {
                split[i] = new String(Base64.decode(split[i], 0), Utf8Charset.NAME);
            }
            return split;
        } catch (UnsupportedEncodingException e) {
            return new String[0];
        }
    }

    /* renamed from: c */
    private static void m7679c(zzec zzec, String str) {
        Bundle bundle = zzec.f14925m.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
        if (bundle != null) {
            bundle.putBoolean(str, true);
        }
        zzec.f14915c.putBoolean(str, true);
    }

    /* renamed from: c */
    static boolean m7680c(zzec zzec) {
        return bdu.m7674a(zzec).contains("_skipMediation");
    }

    /* renamed from: c */
    private boolean m7681c(String str) {
        try {
            return Pattern.matches((String) bbb.bd.m7064c(), str);
        } catch (Throwable e) {
            ako.m2347i().m8934a(e, "InterstitialAdPool.isExcludedAdUnit");
            return false;
        }
    }

    /* renamed from: d */
    static zzec m7682d(zzec zzec) {
        zzec e = bdu.m7683e(zzec);
        for (String str : ((String) bbb.aZ.m7064c()).split(",")) {
            bdu.m7675a(e.f14925m, str);
            String str2 = "com.google.ads.mediation.admob.AdMobAdapter/";
            if (str.startsWith(str2)) {
                bdu.m7675a(e.f14915c, str.replaceFirst(str2, ""));
            }
        }
        return e;
    }

    /* renamed from: e */
    static zzec m7683e(zzec zzec) {
        Parcel obtain = Parcel.obtain();
        zzec.writeToParcel(obtain, 0);
        obtain.setDataPosition(0);
        zzec zzec2 = (zzec) zzec.CREATOR.createFromParcel(obtain);
        obtain.recycle();
        if (((Boolean) bbb.aR.m7064c()).booleanValue()) {
            zzec.m19664a(zzec2);
        }
        return zzec2;
    }

    /* renamed from: e */
    private String m7684e() {
        try {
            StringBuilder stringBuilder = new StringBuilder();
            Iterator it = this.f5705b.iterator();
            while (it.hasNext()) {
                stringBuilder.append(Base64.encodeToString(((bdw) it.next()).toString().getBytes(Utf8Charset.NAME), 0));
                if (it.hasNext()) {
                    stringBuilder.append("\u0000");
                }
            }
            return stringBuilder.toString();
        } catch (UnsupportedEncodingException e) {
            return "";
        }
    }

    /* renamed from: a */
    C1082a m7685a(zzec zzec, String str) {
        if (m7681c(str)) {
            return null;
        }
        bdx bdx;
        int i = new C1232a(this.f5706c.m7618a()).m8661a().f6429m;
        zzec d = bdu.m7682d(zzec);
        String a = bdu.m7673a(str);
        bdw bdw = new bdw(d, a, i);
        bdx bdx2 = (bdx) this.f5704a.get(bdw);
        if (bdx2 == null) {
            bdu.m7676a("Interstitial pool created at %s.", bdw);
            bdx2 = new bdx(d, a, i);
            this.f5704a.put(bdw, bdx2);
            bdx = bdx2;
        } else {
            bdx = bdx2;
        }
        this.f5705b.remove(bdw);
        this.f5705b.add(bdw);
        bdx.m7704g();
        while (this.f5705b.size() > ((Integer) bbb.ba.m7064c()).intValue()) {
            bdw bdw2 = (bdw) this.f5705b.remove();
            bdx bdx3 = (bdx) this.f5704a.get(bdw2);
            bdu.m7676a("Evicting interstitial queue for %s.", bdw2);
            while (bdx3.m7701d() > 0) {
                C1082a a2 = bdx3.m7695a(null);
                if (a2.f5717e) {
                    bdy.m7706a().m7709c();
                }
                a2.f5713a.m2176N();
            }
            this.f5704a.remove(bdw2);
        }
        while (bdx.m7701d() > 0) {
            C1082a a3 = bdx.m7695a(d);
            if (!a3.f5717e || ako.m2349k().mo606a() - a3.f5716d <= 1000 * ((long) ((Integer) bbb.bc.m7064c()).intValue())) {
                String str2 = a3.f5714b != null ? " (inline) " : " ";
                bdu.m7676a(new StringBuilder(String.valueOf(str2).length() + 34).append("Pooled interstitial").append(str2).append("returned at %s.").toString(), bdw);
                return a3;
            }
            bdu.m7676a("Expired interstitial at %s.", bdw);
            bdy.m7706a().m7708b();
        }
        return null;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    void m7686a() {
        /*
        r9 = this;
        r8 = 2;
        r0 = r9.f5706c;
        if (r0 != 0) goto L_0x0006;
    L_0x0005:
        return;
    L_0x0006:
        r0 = r9.f5704a;
        r0 = r0.entrySet();
        r4 = r0.iterator();
    L_0x0010:
        r0 = r4.hasNext();
        if (r0 == 0) goto L_0x0088;
    L_0x0016:
        r0 = r4.next();
        r0 = (java.util.Map.Entry) r0;
        r1 = r0.getKey();
        r1 = (p000.bdw) r1;
        r0 = r0.getValue();
        r0 = (p000.bdx) r0;
        r2 = p000.bky.m9005a(r8);
        if (r2 == 0) goto L_0x0056;
    L_0x002e:
        r2 = r0.m7701d();
        r3 = r0.m7702e();
        if (r3 >= r2) goto L_0x0056;
    L_0x0038:
        r5 = "Loading %s/%s pooled interstitials for %s.";
        r6 = 3;
        r6 = new java.lang.Object[r6];
        r7 = 0;
        r3 = r2 - r3;
        r3 = java.lang.Integer.valueOf(r3);
        r6[r7] = r3;
        r3 = 1;
        r2 = java.lang.Integer.valueOf(r2);
        r6[r3] = r2;
        r6[r8] = r1;
        r2 = java.lang.String.format(r5, r6);
        p000.bkc.m9012a(r2);
    L_0x0056:
        r2 = r0.m7703f();
        r2 = r2 + 0;
        r3 = r2;
    L_0x005d:
        r5 = r0.m7701d();
        r2 = p000.bbb.bb;
        r2 = r2.m7064c();
        r2 = (java.lang.Integer) r2;
        r2 = r2.intValue();
        if (r5 >= r2) goto L_0x0080;
    L_0x006f:
        r2 = "Pooling and loading one new interstitial for %s.";
        p000.bdu.m7676a(r2, r1);
        r2 = r9.f5706c;
        r2 = r0.m7698a(r2);
        if (r2 == 0) goto L_0x005d;
    L_0x007c:
        r2 = r3 + 1;
        r3 = r2;
        goto L_0x005d;
    L_0x0080:
        r0 = p000.bdy.m7706a();
        r0.m7707a(r3);
        goto L_0x0010;
    L_0x0088:
        r9.m7688b();
        goto L_0x0005;
        */
        throw new UnsupportedOperationException("Method not decompiled: bdu.a():void");
    }

    /* renamed from: a */
    void m7687a(bdr bdr) {
        if (this.f5706c == null) {
            this.f5706c = bdr.m7620b();
            m7690c();
        }
    }

    /* renamed from: b */
    void m7688b() {
        if (this.f5706c != null) {
            Editor edit = this.f5706c.m7618a().getSharedPreferences("com.google.android.gms.ads.internal.interstitial.InterstitialAdPool", 0).edit();
            edit.clear();
            for (Entry entry : this.f5704a.entrySet()) {
                bdw bdw = (bdw) entry.getKey();
                bdx bdx = (bdx) entry.getValue();
                if (bdx.m7705h()) {
                    edit.putString(bdw.toString(), new bea(bdx).m7750a());
                    bdu.m7676a("Saved interstitial queue for %s.", bdw);
                }
            }
            edit.putString("PoolKeys", m7684e());
            edit.apply();
        }
    }

    /* renamed from: b */
    void m7689b(zzec zzec, String str) {
        if (this.f5706c != null) {
            int i = new C1232a(this.f5706c.m7618a()).m8661a().f6429m;
            zzec d = bdu.m7682d(zzec);
            String a = bdu.m7673a(str);
            bdw bdw = new bdw(d, a, i);
            bdx bdx = (bdx) this.f5704a.get(bdw);
            if (bdx == null) {
                bdu.m7676a("Interstitial pool created at %s.", bdw);
                bdx = new bdx(d, a, i);
                this.f5704a.put(bdw, bdx);
            }
            bdx.m7697a(this.f5706c, zzec);
            bdx.m7704g();
            bdu.m7676a("Inline entry added to the queue at %s.", bdw);
        }
    }

    /* renamed from: c */
    void m7690c() {
        Throwable e;
        if (this.f5706c != null) {
            SharedPreferences sharedPreferences = this.f5706c.m7618a().getSharedPreferences("com.google.android.gms.ads.internal.interstitial.InterstitialAdPool", 0);
            m7691d();
            try {
                Map hashMap = new HashMap();
                for (Entry entry : sharedPreferences.getAll().entrySet()) {
                    if (!((String) entry.getKey()).equals("PoolKeys")) {
                        bea a = bea.m7749a((String) entry.getValue());
                        bdw bdw = new bdw(a.f5739a, a.f5740b, a.f5741c);
                        if (!this.f5704a.containsKey(bdw)) {
                            this.f5704a.put(bdw, new bdx(a.f5739a, a.f5740b, a.f5741c));
                            hashMap.put(bdw.toString(), bdw);
                            bdu.m7676a("Restored interstitial queue for %s.", bdw);
                        }
                    }
                }
                for (Object obj : m7678b(sharedPreferences.getString("PoolKeys", ""))) {
                    bdw bdw2 = (bdw) hashMap.get(obj);
                    if (this.f5704a.containsKey(bdw2)) {
                        this.f5705b.add(bdw2);
                    }
                }
            } catch (RuntimeException e2) {
                e = e2;
                ako.m2347i().m8934a(e, "InterstitialAdPool.restore");
                bky.m9009c("Malformed preferences value for InterstitialAdPool.", e);
                this.f5704a.clear();
                this.f5705b.clear();
            } catch (IOException e3) {
                e = e3;
                ako.m2347i().m8934a(e, "InterstitialAdPool.restore");
                bky.m9009c("Malformed preferences value for InterstitialAdPool.", e);
                this.f5704a.clear();
                this.f5705b.clear();
            }
        }
    }

    /* renamed from: d */
    void m7691d() {
        while (this.f5705b.size() > 0) {
            bdw bdw = (bdw) this.f5705b.remove();
            bdx bdx = (bdx) this.f5704a.get(bdw);
            bdu.m7676a("Flushing interstitial queue for %s.", bdw);
            while (bdx.m7701d() > 0) {
                bdx.m7695a(null).f5713a.m2176N();
            }
            this.f5704a.remove(bdw);
        }
    }
}
