package com.p000;

import com.facebook.internal.ServerProtocol;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import p000.att.C0806a;

/* renamed from: brz */
public class brz {
    /* renamed from: a */
    private static final Object f7491a = null;
    /* renamed from: b */
    private static Long f7492b = new Long(0);
    /* renamed from: c */
    private static Double f7493c = new Double(0.0d);
    /* renamed from: d */
    private static bry f7494d = bry.m10577a(0);
    /* renamed from: e */
    private static String f7495e = new String("");
    /* renamed from: f */
    private static Boolean f7496f = new Boolean(false);
    /* renamed from: g */
    private static List<Object> f7497g = new ArrayList(0);
    /* renamed from: h */
    private static Map<Object, Object> f7498h = new HashMap();
    /* renamed from: i */
    private static C0806a f7499i = brz.m10590c(f7495e);

    /* renamed from: a */
    public static C0806a m10584a() {
        return f7499i;
    }

    /* renamed from: a */
    private static Boolean m10585a(String str) {
        return ServerProtocol.DIALOG_RETURN_SCOPES_TRUE.equalsIgnoreCase(str) ? Boolean.TRUE : "false".equalsIgnoreCase(str) ? Boolean.FALSE : f7496f;
    }

    /* renamed from: a */
    public static String m10586a(C0806a c0806a) {
        return brz.m10587a(brz.m10591c(c0806a));
    }

    /* renamed from: a */
    public static String m10587a(Object obj) {
        return obj == null ? f7495e : obj.toString();
    }

    /* renamed from: b */
    public static Boolean m10588b(C0806a c0806a) {
        return brz.m10589b(brz.m10591c(c0806a));
    }

    /* renamed from: b */
    public static Boolean m10589b(Object obj) {
        return obj instanceof Boolean ? (Boolean) obj : brz.m10585a(brz.m10587a(obj));
    }

    /* renamed from: c */
    public static C0806a m10590c(Object obj) {
        boolean z = false;
        C0806a c0806a = new C0806a();
        if (obj instanceof C0806a) {
            return (C0806a) obj;
        }
        if (obj instanceof String) {
            c0806a.f4498a = 1;
            c0806a.f4499b = (String) obj;
        } else if (obj instanceof List) {
            c0806a.f4498a = 2;
            List<Object> list = (List) obj;
            r5 = new ArrayList(list.size());
            r1 = false;
            for (Object c : list) {
                C0806a c2 = brz.m10590c(c);
                if (c2 == f7499i) {
                    return f7499i;
                }
                r0 = r1 || c2.f4509l;
                r5.add(c2);
                r1 = r0;
            }
            c0806a.f4500c = (C0806a[]) r5.toArray(new C0806a[0]);
            z = r1;
        } else if (obj instanceof Map) {
            c0806a.f4498a = 3;
            Set<Entry> entrySet = ((Map) obj).entrySet();
            r5 = new ArrayList(entrySet.size());
            List arrayList = new ArrayList(entrySet.size());
            r1 = false;
            for (Entry entry : entrySet) {
                C0806a c3 = brz.m10590c(entry.getKey());
                C0806a c4 = brz.m10590c(entry.getValue());
                if (c3 == f7499i || c4 == f7499i) {
                    return f7499i;
                }
                r0 = r1 || c3.f4509l || c4.f4509l;
                r5.add(c3);
                arrayList.add(c4);
                r1 = r0;
            }
            c0806a.f4501d = (C0806a[]) r5.toArray(new C0806a[0]);
            c0806a.f4502e = (C0806a[]) arrayList.toArray(new C0806a[0]);
            z = r1;
        } else if (brz.m10592d(obj)) {
            c0806a.f4498a = 1;
            c0806a.f4499b = obj.toString();
        } else if (brz.m10593e(obj)) {
            c0806a.f4498a = 6;
            c0806a.f4505h = brz.m10594f(obj);
        } else if (obj instanceof Boolean) {
            c0806a.f4498a = 8;
            c0806a.f4506i = ((Boolean) obj).booleanValue();
        } else {
            String str = "Converting to Value from unknown object type: ";
            String valueOf = String.valueOf(obj == null ? "null" : obj.getClass().toString());
            brd.m10493a(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            return f7499i;
        }
        c0806a.f4509l = z;
        return c0806a;
    }

    /* renamed from: c */
    public static Object m10591c(C0806a c0806a) {
        int i = 0;
        if (c0806a == null) {
            return null;
        }
        C0806a[] c0806aArr;
        int length;
        switch (c0806a.f4498a) {
            case 1:
                return c0806a.f4499b;
            case 2:
                ArrayList arrayList = new ArrayList(c0806a.f4500c.length);
                c0806aArr = c0806a.f4500c;
                length = c0806aArr.length;
                while (i < length) {
                    Object c = brz.m10591c(c0806aArr[i]);
                    if (c == null) {
                        return null;
                    }
                    arrayList.add(c);
                    i++;
                }
                return arrayList;
            case 3:
                if (c0806a.f4501d.length != c0806a.f4502e.length) {
                    String str = "Converting an invalid value to object: ";
                    String valueOf = String.valueOf(c0806a.toString());
                    brd.m10493a(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
                    return null;
                }
                Map hashMap = new HashMap(c0806a.f4502e.length);
                while (i < c0806a.f4501d.length) {
                    Object c2 = brz.m10591c(c0806a.f4501d[i]);
                    Object c3 = brz.m10591c(c0806a.f4502e[i]);
                    if (c2 == null || c3 == null) {
                        return null;
                    }
                    hashMap.put(c2, c3);
                    i++;
                }
                return hashMap;
            case 4:
                brd.m10493a("Trying to convert a macro reference to object");
                return null;
            case 5:
                brd.m10493a("Trying to convert a function id to object");
                return null;
            case 6:
                return Long.valueOf(c0806a.f4505h);
            case 7:
                StringBuffer stringBuffer = new StringBuffer();
                c0806aArr = c0806a.f4507j;
                length = c0806aArr.length;
                while (i < length) {
                    String a = brz.m10586a(c0806aArr[i]);
                    if (a == f7495e) {
                        return null;
                    }
                    stringBuffer.append(a);
                    i++;
                }
                return stringBuffer.toString();
            case 8:
                return Boolean.valueOf(c0806a.f4506i);
            default:
                brd.m10493a("Failed to convert a value of type: " + c0806a.f4498a);
                return null;
        }
    }

    /* renamed from: d */
    private static boolean m10592d(Object obj) {
        return (obj instanceof Double) || (obj instanceof Float) || ((obj instanceof bry) && ((bry) obj).m10579a());
    }

    /* renamed from: e */
    private static boolean m10593e(Object obj) {
        return (obj instanceof Byte) || (obj instanceof Short) || (obj instanceof Integer) || (obj instanceof Long) || ((obj instanceof bry) && ((bry) obj).m10580b());
    }

    /* renamed from: f */
    private static long m10594f(Object obj) {
        if (obj instanceof Number) {
            return ((Number) obj).longValue();
        }
        brd.m10493a("getInt64 received non-Number");
        return 0;
    }
}
