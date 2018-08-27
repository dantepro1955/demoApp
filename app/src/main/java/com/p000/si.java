package com.p000;

/* renamed from: si */
public class si {
    /* renamed from: a */
    private static final rk f25463a = dnn.m28258a(si.class);

    /* renamed from: a */
    public static String m34091a(String str) {
        if (f25463a.mo4274a()) {
            f25463a.mo4272a("Escaping XML reserved tokens (&, <, >, \" and ') of: " + str);
        }
        int i = 0;
        StringBuffer stringBuffer = new StringBuffer(str);
        while (i < stringBuffer.length()) {
            char charAt = stringBuffer.charAt(i);
            if (charAt == '&') {
                i++;
                stringBuffer.insert(i, "amp;");
                i += 4;
            } else if (charAt == '<') {
                stringBuffer.deleteCharAt(i);
                stringBuffer.insert(i, "&lt;");
                i += 4;
            } else if (charAt == '>') {
                stringBuffer.deleteCharAt(i);
                stringBuffer.insert(i, "&gt;");
                i += 4;
            } else if (charAt == '\"') {
                stringBuffer.deleteCharAt(i);
                stringBuffer.insert(i, "&quot;");
                i += 6;
            } else if (charAt == '\'') {
                stringBuffer.deleteCharAt(i);
                stringBuffer.insert(i, "&apos;");
                i += 6;
            } else {
                i++;
            }
        }
        String stringBuffer2 = stringBuffer.toString();
        if (f25463a.mo4274a()) {
            f25463a.mo4272a("Final output: " + stringBuffer2);
        }
        return stringBuffer2;
    }

    /* renamed from: a */
    public static boolean m34092a() {
        return false;
    }

    /* renamed from: a */
    public static boolean m34093a(rg rgVar) {
        short a = rgVar.m28246a();
        return a == rg.f25318d.m28246a() || a == rg.f25319e.m28246a() || a == rg.f25320f.m28246a() || a == rg.f25321g.m28246a();
    }

    /* renamed from: b */
    public static boolean m34094b() {
        return false;
    }

    /* renamed from: b */
    public static boolean m34095b(rg rgVar) {
        short a = rgVar.m28246a();
        return a == rg.f25315a.m28246a() || a == rg.f25317c.m28246a() || a == rg.f25316b.m28246a();
    }

    /* renamed from: c */
    public static rg m34096c(rg rgVar) {
        rg rgVar2 = (rgVar == rg.f25316b || rgVar == rg.f25317c) ? rg.f25315a : (rgVar == rg.f25319e || rgVar == rg.f25320f || rgVar == rg.f25322h || rgVar == rg.f25321g) ? rg.f25318d : rgVar;
        if (f25463a.mo4278c()) {
            f25463a.mo4277c("adjustCodecForBluetooth() " + rgVar.m28246a() + " -> " + rgVar2.m28246a());
        }
        return rgVar2;
    }
}
