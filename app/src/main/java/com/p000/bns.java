package com.p000;

import android.text.TextUtils;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.internal.Utility;
import com.google.android.gms.internal.zzsl;
import com.inmobi.commons.ads.cache.AdDatabaseHelper;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: bns */
public class bns {
    /* renamed from: a */
    private final Map<String, String> f7164a;
    /* renamed from: b */
    private final List<zzsl> f7165b;
    /* renamed from: c */
    private final long f7166c;
    /* renamed from: d */
    private final long f7167d;
    /* renamed from: e */
    private final int f7168e;
    /* renamed from: f */
    private final boolean f7169f;
    /* renamed from: g */
    private final String f7170g;

    public bns(bms bms, Map<String, String> map, long j, boolean z) {
        this(bms, map, j, z, 0, 0, null);
    }

    public bns(bms bms, Map<String, String> map, long j, boolean z, long j2, int i) {
        this(bms, map, j, z, j2, i, null);
    }

    public bns(bms bms, Map<String, String> map, long j, boolean z, long j2, int i, List<zzsl> list) {
        aoi.m4679a((Object) bms);
        aoi.m4679a((Object) map);
        this.f7167d = j;
        this.f7169f = z;
        this.f7166c = j2;
        this.f7168e = i;
        this.f7165b = list != null ? list : Collections.emptyList();
        this.f7170g = bns.m10005a((List) list);
        Map hashMap = new HashMap();
        for (Entry entry : map.entrySet()) {
            String a;
            if (bns.m10006a(entry.getKey())) {
                a = bns.m10003a(bms, entry.getKey());
                if (a != null) {
                    hashMap.put(a, bns.m10007b(bms, entry.getValue()));
                }
            }
        }
        for (Entry entry2 : map.entrySet()) {
            if (!bns.m10006a(entry2.getKey())) {
                a = bns.m10003a(bms, entry2.getKey());
                if (a != null) {
                    hashMap.put(a, bns.m10007b(bms, entry2.getValue()));
                }
            }
        }
        if (!TextUtils.isEmpty(this.f7170g)) {
            bof.m10133a(hashMap, "_v", this.f7170g);
            if (this.f7170g.equals("ma4.0.0") || this.f7170g.equals("ma4.0.1")) {
                hashMap.remove(AdDatabaseHelper.COLUMN_AD_ID);
            }
        }
        this.f7164a = Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: a */
    public static bns m10002a(bms bms, bns bns, Map<String, String> map) {
        return new bns(bms, map, bns.m10011d(), bns.m10013f(), bns.m10010c(), bns.m10008a(), bns.m10012e());
    }

    /* renamed from: a */
    private static String m10003a(bms bms, Object obj) {
        if (obj == null) {
            return null;
        }
        Object obj2 = obj.toString();
        if (obj2.startsWith("&")) {
            obj2 = obj2.substring(1);
        }
        int length = obj2.length();
        if (length > 256) {
            obj2 = obj2.substring(0, 256);
            bms.zzc("Hit param name is too long and will be trimmed", Integer.valueOf(length), obj2);
        }
        return TextUtils.isEmpty(obj2) ? null : obj2;
    }

    /* renamed from: a */
    private String m10004a(String str, String str2) {
        aoi.m4681a(str);
        aoi.m4689b(!str.startsWith("&"), "Short param name required");
        String str3 = (String) this.f7164a.get(str);
        return str3 != null ? str3 : str2;
    }

    /* renamed from: a */
    private static String m10005a(List<zzsl> list) {
        CharSequence b;
        if (list != null) {
            for (zzsl zzsl : list) {
                if ("appendVersion".equals(zzsl.m19688a())) {
                    b = zzsl.m19689b();
                    break;
                }
            }
        }
        b = null;
        return TextUtils.isEmpty(b) ? null : b;
    }

    /* renamed from: a */
    private static boolean m10006a(Object obj) {
        return obj == null ? false : obj.toString().startsWith("&");
    }

    /* renamed from: b */
    private static String m10007b(bms bms, Object obj) {
        String obj2 = obj == null ? "" : obj.toString();
        int length = obj2.length();
        if (length <= Utility.DEFAULT_STREAM_BUFFER_SIZE) {
            return obj2;
        }
        obj2 = obj2.substring(0, Utility.DEFAULT_STREAM_BUFFER_SIZE);
        bms.zzc("Hit param value is too long and will be trimmed", Integer.valueOf(length), obj2);
        return obj2;
    }

    /* renamed from: a */
    public int m10008a() {
        return this.f7168e;
    }

    /* renamed from: b */
    public Map<String, String> m10009b() {
        return this.f7164a;
    }

    /* renamed from: c */
    public long m10010c() {
        return this.f7166c;
    }

    /* renamed from: d */
    public long m10011d() {
        return this.f7167d;
    }

    /* renamed from: e */
    public List<zzsl> m10012e() {
        return this.f7165b;
    }

    /* renamed from: f */
    public boolean m10013f() {
        return this.f7169f;
    }

    /* renamed from: g */
    public long m10014g() {
        return bof.m10129a(m10004a("_s", AppEventsConstants.EVENT_PARAM_VALUE_NO));
    }

    /* renamed from: h */
    public String m10015h() {
        return m10004a("_m", "");
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("ht=").append(this.f7167d);
        if (this.f7166c != 0) {
            stringBuffer.append(", dbId=").append(this.f7166c);
        }
        if (this.f7168e != 0) {
            stringBuffer.append(", appUID=").append(this.f7168e);
        }
        List<String> arrayList = new ArrayList(this.f7164a.keySet());
        Collections.sort(arrayList);
        for (String str : arrayList) {
            stringBuffer.append(", ");
            stringBuffer.append(str);
            stringBuffer.append("=");
            stringBuffer.append((String) this.f7164a.get(str));
        }
        return stringBuffer.toString();
    }
}
