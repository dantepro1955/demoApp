package com.p000;

import android.net.Uri;
import android.net.Uri.Builder;
import android.text.TextUtils;
import com.facebook.share.internal.ShareConstants;
import com.inmobi.commons.ads.cache.AdDatabaseHelper;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: alk */
public class alk extends bms implements alr {
    /* renamed from: a */
    private static DecimalFormat f1969a;
    /* renamed from: b */
    private final bmw f1970b;
    /* renamed from: c */
    private final String f1971c;
    /* renamed from: d */
    private final Uri f1972d;
    /* renamed from: e */
    private final boolean f1973e;
    /* renamed from: f */
    private final boolean f1974f;

    public alk(bmw bmw, String str) {
        this(bmw, str, true, false);
    }

    public alk(bmw bmw, String str, boolean z, boolean z2) {
        super(bmw);
        aoi.m4681a(str);
        this.f1970b = bmw;
        this.f1971c = str;
        this.f1973e = z;
        this.f1974f = z2;
        this.f1972d = alk.m2462a(this.f1971c);
    }

    /* renamed from: a */
    static Uri m2462a(String str) {
        aoi.m4681a(str);
        Builder builder = new Builder();
        builder.scheme(ShareConstants.MEDIA_URI);
        builder.authority("google-analytics.com");
        builder.path(str);
        return builder.build();
    }

    /* renamed from: a */
    static String m2463a(double d) {
        if (f1969a == null) {
            f1969a = new DecimalFormat("0.######");
        }
        return f1969a.format(d);
    }

    /* renamed from: a */
    private static String m2464a(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof String) {
            String str = (String) obj;
            return TextUtils.isEmpty(str) ? null : str;
        } else if (!(obj instanceof Double)) {
            return obj instanceof Boolean ? obj != Boolean.FALSE ? "1" : null : String.valueOf(obj);
        } else {
            Double d = (Double) obj;
            return d.doubleValue() != 0.0d ? alk.m2463a(d.doubleValue()) : null;
        }
    }

    /* renamed from: a */
    private static String m2465a(Map<String, String> map) {
        StringBuilder stringBuilder = new StringBuilder();
        for (Entry entry : map.entrySet()) {
            if (stringBuilder.length() != 0) {
                stringBuilder.append(", ");
            }
            stringBuilder.append((String) entry.getKey());
            stringBuilder.append("=");
            stringBuilder.append((String) entry.getValue());
        }
        return stringBuilder.toString();
    }

    /* renamed from: a */
    private static void m2466a(Map<String, String> map, String str, double d) {
        if (d != 0.0d) {
            map.put(str, alk.m2463a(d));
        }
    }

    /* renamed from: a */
    private static void m2467a(Map<String, String> map, String str, int i, int i2) {
        if (i > 0 && i2 > 0) {
            map.put(str, i + "x" + i2);
        }
    }

    /* renamed from: a */
    private static void m2468a(Map<String, String> map, String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            map.put(str, str2);
        }
    }

    /* renamed from: a */
    private static void m2469a(Map<String, String> map, String str, boolean z) {
        if (z) {
            map.put(str, "1");
        }
    }

    /* renamed from: b */
    public static Map<String, String> m2470b(aln aln) {
        CharSequence a;
        Map hashMap = new HashMap();
        bmh bmh = (bmh) aln.m2488a(bmh.class);
        if (bmh != null) {
            for (Entry entry : bmh.m9651a().entrySet()) {
                String a2 = alk.m2464a(entry.getValue());
                if (a2 != null) {
                    hashMap.put((String) entry.getKey(), a2);
                }
            }
        }
        bmm bmm = (bmm) aln.m2488a(bmm.class);
        if (bmm != null) {
            alk.m2468a(hashMap, "t", bmm.m9692a());
            alk.m2468a(hashMap, "cid", bmm.m9698b());
            alk.m2468a(hashMap, "uid", bmm.m9701c());
            alk.m2468a(hashMap, "sc", bmm.m9707f());
            alk.m2466a(hashMap, "sf", bmm.m9709h());
            alk.m2469a(hashMap, "ni", bmm.m9708g());
            alk.m2468a(hashMap, AdDatabaseHelper.COLUMN_AD_ID, bmm.m9703d());
            alk.m2469a(hashMap, "ate", bmm.m9706e());
        }
        bmn bmn = (bmn) aln.m2488a(bmn.class);
        if (bmn != null) {
            alk.m2468a(hashMap, "cd", bmn.m9716b());
            alk.m2466a(hashMap, "a", (double) bmn.m9720c());
            alk.m2468a(hashMap, "dr", bmn.m9722d());
        }
        bmk bmk = (bmk) aln.m2488a(bmk.class);
        if (bmk != null) {
            alk.m2468a(hashMap, "ec", bmk.m9676a());
            alk.m2468a(hashMap, "ea", bmk.m9681b());
            alk.m2468a(hashMap, "el", bmk.m9683c());
            alk.m2466a(hashMap, "ev", (double) bmk.m9685d());
        }
        bme bme = (bme) aln.m2488a(bme.class);
        if (bme != null) {
            alk.m2468a(hashMap, "cn", bme.m9622a());
            alk.m2468a(hashMap, "cs", bme.m9626b());
            alk.m2468a(hashMap, "cm", bme.m9628c());
            alk.m2468a(hashMap, "ck", bme.m9630d());
            alk.m2468a(hashMap, "cc", bme.m9632e());
            alk.m2468a(hashMap, "ci", bme.m9634f());
            alk.m2468a(hashMap, "anid", bme.m9636g());
            alk.m2468a(hashMap, "gclid", bme.m9638h());
            alk.m2468a(hashMap, "dclid", bme.m9640i());
            alk.m2468a(hashMap, "aclid", bme.m9642j());
        }
        bml bml = (bml) aln.m2488a(bml.class);
        if (bml != null) {
            alk.m2468a(hashMap, "exd", bml.m9686a());
            alk.m2469a(hashMap, "exf", bml.m9691b());
        }
        bmo bmo = (bmo) aln.m2488a(bmo.class);
        if (bmo != null) {
            alk.m2468a(hashMap, "sn", bmo.m9723a());
            alk.m2468a(hashMap, "sa", bmo.m9727b());
            alk.m2468a(hashMap, "st", bmo.m9729c());
        }
        bmp bmp = (bmp) aln.m2488a(bmp.class);
        if (bmp != null) {
            alk.m2468a(hashMap, "utv", bmp.m9731a());
            alk.m2466a(hashMap, "utt", (double) bmp.m9736b());
            alk.m2468a(hashMap, "utc", bmp.m9738c());
            alk.m2468a(hashMap, "utl", bmp.m9740d());
        }
        bmf bmf = (bmf) aln.m2488a(bmf.class);
        if (bmf != null) {
            for (Entry entry2 : bmf.m9644a().entrySet()) {
                a = all.m2473a(((Integer) entry2.getKey()).intValue());
                if (!TextUtils.isEmpty(a)) {
                    hashMap.put(a, (String) entry2.getValue());
                }
            }
        }
        bmg bmg = (bmg) aln.m2488a(bmg.class);
        if (bmg != null) {
            for (Entry entry22 : bmg.m9647a().entrySet()) {
                a = all.m2475b(((Integer) entry22.getKey()).intValue());
                if (!TextUtils.isEmpty(a)) {
                    hashMap.put(a, alk.m2463a(((Double) entry22.getValue()).doubleValue()));
                }
            }
        }
        bmj bmj = (bmj) aln.m2488a(bmj.class);
        if (bmj != null) {
            alh a3 = bmj.m9669a();
            if (a3 != null) {
                for (Entry entry3 : a3.m2458a().entrySet()) {
                    if (((String) entry3.getKey()).startsWith("&")) {
                        hashMap.put(((String) entry3.getKey()).substring(1), (String) entry3.getValue());
                    } else {
                        hashMap.put((String) entry3.getKey(), (String) entry3.getValue());
                    }
                }
            }
            int i = 1;
            for (ali a4 : bmj.m9675d()) {
                hashMap.putAll(a4.m2459a(all.m2479f(i)));
                i++;
            }
            i = 1;
            for (alg a5 : bmj.m9673b()) {
                hashMap.putAll(a5.m2457a(all.m2477d(i)));
                i++;
            }
            i = 1;
            for (Entry entry222 : bmj.m9674c().entrySet()) {
                List<alg> list = (List) entry222.getValue();
                String i2 = all.m2482i(i);
                int i3 = 1;
                for (alg a52 : list) {
                    String valueOf = String.valueOf(i2);
                    String valueOf2 = String.valueOf(all.m2480g(i3));
                    hashMap.putAll(a52.m2457a(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf)));
                    i3++;
                }
                if (!TextUtils.isEmpty((CharSequence) entry222.getKey())) {
                    String valueOf3 = String.valueOf(i2);
                    String valueOf4 = String.valueOf("nm");
                    hashMap.put(valueOf4.length() != 0 ? valueOf3.concat(valueOf4) : new String(valueOf3), (String) entry222.getKey());
                }
                i++;
            }
        }
        bmi bmi = (bmi) aln.m2488a(bmi.class);
        if (bmi != null) {
            alk.m2468a(hashMap, "ul", bmi.m9668f());
            alk.m2466a(hashMap, "sd", (double) bmi.m9655a());
            alk.m2467a(hashMap, "sr", bmi.m9660b(), bmi.m9662c());
            alk.m2467a(hashMap, "vp", bmi.m9664d(), bmi.m9666e());
        }
        bmd bmd = (bmd) aln.m2488a(bmd.class);
        if (bmd != null) {
            alk.m2468a(hashMap, "an", bmd.m9612a());
            alk.m2468a(hashMap, "aid", bmd.m9618c());
            alk.m2468a(hashMap, "aiid", bmd.m9620d());
            alk.m2468a(hashMap, "av", bmd.m9616b());
        }
        return hashMap;
    }

    /* renamed from: a */
    public Uri mo321a() {
        return this.f1972d;
    }

    /* renamed from: a */
    public void mo322a(aln aln) {
        aoi.m4679a((Object) aln);
        aoi.m4689b(aln.m2496f(), "Can't deliver not submitted measurement");
        aoi.m4691c("deliver should be called on worker thread");
        aln a = aln.m2487a();
        bmm bmm = (bmm) a.m2491b(bmm.class);
        if (TextUtils.isEmpty(bmm.m9692a())) {
            zznS().m10042a(alk.m2470b(a), "Ignoring measurement without type");
        } else if (TextUtils.isEmpty(bmm.m9698b())) {
            zznS().m10042a(alk.m2470b(a), "Ignoring measurement without client id");
        } else if (!this.f1970b.m9776k().m2433f()) {
            double h = bmm.m9709h();
            if (bof.m10136a(h, bmm.m9698b())) {
                zzb("Sampling enabled. Hit sampled out. sampling rate", Double.valueOf(h));
                return;
            }
            Map b = alk.m2470b(a);
            b.put("v", "1");
            b.put("_v", bmv.f7024b);
            b.put("tid", this.f1971c);
            if (this.f1970b.m9776k().m2432e()) {
                zzc("Dry run is enabled. GoogleAnalytics would have sent", alk.m2465a(b));
                return;
            }
            Map hashMap = new HashMap();
            bof.m10133a(hashMap, "uid", bmm.m9701c());
            bmd bmd = (bmd) aln.m2488a(bmd.class);
            if (bmd != null) {
                bof.m10133a(hashMap, "an", bmd.m9612a());
                bof.m10133a(hashMap, "aid", bmd.m9618c());
                bof.m10133a(hashMap, "av", bmd.m9616b());
                bof.m10133a(hashMap, "aiid", bmd.m9620d());
            }
            b.put("_s", String.valueOf(zzmA().m9751a(new bmy(0, bmm.m9698b(), this.f1971c, !TextUtils.isEmpty(bmm.m9703d()), 0, hashMap))));
            zzmA().m9755a(new bns(zznS(), b, aln.m2494d(), true));
        }
    }
}
