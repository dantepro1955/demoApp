package com.p000;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* compiled from: HelpFormatter */
/* renamed from: dso */
public class dso {
    /* renamed from: a */
    public int f22811a = 74;
    /* renamed from: b */
    public int f22812b = 1;
    /* renamed from: c */
    public int f22813c = 3;
    /* renamed from: d */
    public String f22814d = "usage: ";
    /* renamed from: e */
    public String f22815e = System.getProperty("line.separator");
    /* renamed from: f */
    public String f22816f = "-";
    /* renamed from: g */
    public String f22817g = "--";
    /* renamed from: h */
    public String f22818h = "arg";
    /* renamed from: i */
    protected Comparator f22819i = new C5071a(null);

    /* compiled from: HelpFormatter */
    /* renamed from: dso$1 */
    static class C50701 {
    }

    /* compiled from: HelpFormatter */
    /* renamed from: dso$a */
    static class C5071a implements Comparator {
        private C5071a() {
        }

        C5071a(C50701 c50701) {
            this();
        }

        public int compare(Object obj, Object obj2) {
            return ((dsr) obj).m29165a().compareToIgnoreCase(((dsr) obj2).m29165a());
        }
    }

    /* renamed from: a */
    public int m29151a() {
        return this.f22811a;
    }

    /* renamed from: b */
    public int m29158b() {
        return this.f22812b;
    }

    /* renamed from: c */
    public int m29159c() {
        return this.f22813c;
    }

    /* renamed from: d */
    public Comparator m29160d() {
        return this.f22819i;
    }

    /* renamed from: a */
    public void m29157a(PrintWriter printWriter, int i, dsu dsu, int i2, int i3) {
        StringBuffer stringBuffer = new StringBuffer();
        m29156a(stringBuffer, i, dsu, i2, i3);
        printWriter.println(stringBuffer.toString());
    }

    /* renamed from: a */
    protected StringBuffer m29156a(StringBuffer stringBuffer, int i, dsu dsu, int i2, int i3) {
        String a = m29153a(i2);
        String a2 = m29153a(i3);
        List arrayList = new ArrayList();
        List<dsr> a3 = dsu.m29190a();
        Collections.sort(a3, m29160d());
        int i4 = 0;
        for (dsr dsr : a3) {
            dsr dsr2;
            int length;
            StringBuffer stringBuffer2 = new StringBuffer(8);
            if (dsr2.m29167b() == null) {
                stringBuffer2.append(a).append(new StringBuffer().append("   ").append(this.f22817g).toString()).append(dsr2.m29168c());
            } else {
                stringBuffer2.append(a).append(this.f22816f).append(dsr2.m29167b());
                if (dsr2.m29170e()) {
                    stringBuffer2.append(',').append(this.f22817g).append(dsr2.m29168c());
                }
            }
            if (dsr2.m29171f()) {
                if (dsr2.m29175j()) {
                    stringBuffer2.append(" <").append(dsr2.m29174i()).append(">");
                } else {
                    stringBuffer2.append(' ');
                }
            }
            arrayList.add(stringBuffer2);
            if (stringBuffer2.length() > i4) {
                length = stringBuffer2.length();
            } else {
                length = i4;
            }
            i4 = length;
        }
        Iterator it = a3.iterator();
        int i5 = 0;
        while (it.hasNext()) {
            dsr2 = (dsr) it.next();
            int i6 = i5 + 1;
            stringBuffer2 = new StringBuffer(arrayList.get(i5).toString());
            if (stringBuffer2.length() < i4) {
                stringBuffer2.append(m29153a(i4 - stringBuffer2.length()));
            }
            stringBuffer2.append(a2);
            i5 = i4 + i3;
            if (dsr2.m29172g() != null) {
                stringBuffer2.append(dsr2.m29172g());
            }
            m29155a(stringBuffer, i, i5, stringBuffer2.toString());
            if (it.hasNext()) {
                stringBuffer.append(this.f22815e);
            }
            i5 = i6;
        }
        return stringBuffer;
    }

    /* renamed from: a */
    protected StringBuffer m29155a(StringBuffer stringBuffer, int i, int i2, String str) {
        int a = m29152a(str, i, 0);
        if (a == -1) {
            stringBuffer.append(m29154a(str));
        } else {
            stringBuffer.append(m29154a(str.substring(0, a))).append(this.f22815e);
            if (i2 >= i) {
                i2 = 1;
            }
            String a2 = m29153a(i2);
            while (true) {
                str = new StringBuffer().append(a2).append(str.substring(a).trim()).toString();
                a = m29152a(str, i, 0);
                if (a == -1) {
                    break;
                }
                if (str.length() > i && a == i2 - 1) {
                    a = i;
                }
                stringBuffer.append(m29154a(str.substring(0, a))).append(this.f22815e);
            }
            stringBuffer.append(str);
        }
        return stringBuffer;
    }

    /* renamed from: a */
    protected int m29152a(String str, int i, int i2) {
        int indexOf = str.indexOf(10, i2);
        if (indexOf == -1 || indexOf > i) {
            indexOf = str.indexOf(9, i2);
            if (indexOf == -1 || indexOf > i) {
                if (i2 + i >= str.length()) {
                    return -1;
                }
                char charAt;
                indexOf = i2 + i;
                while (indexOf >= i2) {
                    charAt = str.charAt(indexOf);
                    if (charAt == ' ' || charAt == '\n' || charAt == '\r') {
                        break;
                    }
                    indexOf--;
                }
                if (indexOf > i2) {
                    return indexOf;
                }
                indexOf = i2 + i;
                while (indexOf <= str.length()) {
                    charAt = str.charAt(indexOf);
                    if (charAt == ' ' || charAt == '\n' || charAt == '\r') {
                        break;
                    }
                    indexOf++;
                }
                if (indexOf == str.length()) {
                    indexOf = -1;
                }
                return indexOf;
            }
        }
        return indexOf + 1;
    }

    /* renamed from: a */
    protected String m29153a(int i) {
        StringBuffer stringBuffer = new StringBuffer(i);
        for (int i2 = 0; i2 < i; i2++) {
            stringBuffer.append(' ');
        }
        return stringBuffer.toString();
    }

    /* renamed from: a */
    protected String m29154a(String str) {
        if (str == null || str.length() == 0) {
            return str;
        }
        int length = str.length();
        while (length > 0 && Character.isWhitespace(str.charAt(length - 1))) {
            length--;
        }
        return str.substring(0, length);
    }
}
