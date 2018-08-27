package com.p000;

import android.util.Log;
import com.facebook.common.util.ByteConstants;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: bnx */
public class bnx extends bmu {
    /* renamed from: a */
    private static String f7188a = "3";
    /* renamed from: b */
    private static String f7189b = "01VDIWEA?";
    /* renamed from: c */
    private static bnx f7190c;

    public bnx(bmw bmw) {
        super(bmw);
    }

    /* renamed from: a */
    public static bnx m10038a() {
        return f7190c;
    }

    /* renamed from: a */
    protected String m10039a(Object obj) {
        if (obj == null) {
            return null;
        }
        Object l = obj instanceof Integer ? new Long((long) ((Integer) obj).intValue()) : obj;
        if (!(l instanceof Long)) {
            return l instanceof Boolean ? String.valueOf(l) : l instanceof Throwable ? l.getClass().getCanonicalName() : "-";
        } else {
            if (Math.abs(((Long) l).longValue()) < 100) {
                return String.valueOf(l);
            }
            String str = String.valueOf(l).charAt(0) == '-' ? "-" : "";
            String valueOf = String.valueOf(Math.abs(((Long) l).longValue()));
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append(Math.round(Math.pow(10.0d, (double) (valueOf.length() - 1))));
            stringBuilder.append("...");
            stringBuilder.append(str);
            stringBuilder.append(Math.round(Math.pow(10.0d, (double) valueOf.length()) - 1.0d));
            return stringBuilder.toString();
        }
    }

    /* renamed from: a */
    public void m10040a(int i, String str, Object obj, Object obj2, Object obj3) {
        String str2 = (String) bnp.f7133c.m9985a();
        if (Log.isLoggable(str2, i)) {
            Log.println(i, str2, bms.zzc(str, obj, obj2, obj3));
        }
        if (i >= 5) {
            m10043b(i, str, obj, obj2, obj3);
        }
    }

    /* renamed from: a */
    public void m10041a(bns bns, String str) {
        Object obj;
        if (str == null) {
            obj = "no reason provided";
        }
        Object bns2 = bns != null ? bns.toString() : "no hit data";
        String str2 = "Discarding hit. ";
        String valueOf = String.valueOf(obj);
        zzd(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), bns2);
    }

    /* renamed from: a */
    public void m10042a(Map<String, String> map, String str) {
        Object obj;
        Object stringBuilder;
        if (str == null) {
            obj = "no reason provided";
        }
        if (map != null) {
            StringBuilder stringBuilder2 = new StringBuilder();
            for (Entry entry : map.entrySet()) {
                if (stringBuilder2.length() > 0) {
                    stringBuilder2.append(',');
                }
                stringBuilder2.append((String) entry.getKey());
                stringBuilder2.append('=');
                stringBuilder2.append((String) entry.getValue());
            }
            stringBuilder = stringBuilder2.toString();
        } else {
            stringBuilder = "no hit data";
        }
        String str2 = "Discarding hit. ";
        String valueOf = String.valueOf(obj);
        zzd(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), stringBuilder);
    }

    /* renamed from: b */
    public synchronized void m10043b(int i, String str, Object obj, Object obj2, Object obj3) {
        int i2 = 0;
        synchronized (this) {
            aoi.m4679a((Object) str);
            if (i >= 0) {
                i2 = i;
            }
            int length = i2 >= f7189b.length() ? f7189b.length() - 1 : i2;
            char c = zznT().m9936a() ? 'C' : 'c';
            String str2 = f7188a;
            char charAt = f7189b.charAt(length);
            String str3 = bmv.f7023a;
            String valueOf = String.valueOf(bms.zzc(str, m10039a(obj), m10039a(obj2), m10039a(obj3)));
            String stringBuilder = new StringBuilder(((String.valueOf(str2).length() + 3) + String.valueOf(str3).length()) + String.valueOf(valueOf).length()).append(str2).append(charAt).append(c).append(str3).append(":").append(valueOf).toString();
            if (stringBuilder.length() > ByteConstants.KB) {
                stringBuilder = stringBuilder.substring(0, ByteConstants.KB);
            }
            boa n = zznQ().m9779n();
            if (n != null) {
                n.m10099f().m10090a(stringBuilder);
            }
        }
    }

    protected void zzmS() {
        synchronized (bnx.class) {
            f7190c = this;
        }
    }
}
