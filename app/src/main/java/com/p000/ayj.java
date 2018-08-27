package com.p000;

import java.util.ArrayList;
import java.util.Iterator;

@bhd
/* renamed from: ayj */
public class ayj {
    /* renamed from: a */
    private final int f5025a;
    /* renamed from: b */
    private final int f5026b;
    /* renamed from: c */
    private final int f5027c;
    /* renamed from: d */
    private final ayp f5028d;
    /* renamed from: e */
    private final ayu f5029e;
    /* renamed from: f */
    private final Object f5030f = new Object();
    /* renamed from: g */
    private ArrayList<String> f5031g = new ArrayList();
    /* renamed from: h */
    private ArrayList<String> f5032h = new ArrayList();
    /* renamed from: i */
    private ArrayList<ayn> f5033i = new ArrayList();
    /* renamed from: j */
    private int f5034j = 0;
    /* renamed from: k */
    private int f5035k = 0;
    /* renamed from: l */
    private int f5036l = 0;
    /* renamed from: m */
    private int f5037m;
    /* renamed from: n */
    private String f5038n = "";
    /* renamed from: o */
    private String f5039o = "";
    /* renamed from: p */
    private String f5040p = "";

    public ayj(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.f5025a = i;
        this.f5026b = i2;
        this.f5027c = i3;
        this.f5028d = new ayp(i4);
        this.f5029e = new ayu(i5, i6, i7);
    }

    /* renamed from: a */
    private String m6576a(ArrayList<String> arrayList, int i) {
        if (arrayList.isEmpty()) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            stringBuffer.append((String) it.next());
            stringBuffer.append(' ');
            if (stringBuffer.length() > i) {
                break;
            }
        }
        stringBuffer.deleteCharAt(stringBuffer.length() - 1);
        String stringBuffer2 = stringBuffer.toString();
        return stringBuffer2.length() >= i ? stringBuffer2.substring(0, i) : stringBuffer2;
    }

    /* renamed from: c */
    private void m6577c(String str, boolean z, float f, float f2, float f3, float f4) {
        if (str != null && str.length() >= this.f5027c) {
            synchronized (this.f5030f) {
                this.f5031g.add(str);
                this.f5034j += str.length();
                if (z) {
                    this.f5032h.add(str);
                    this.f5033i.add(new ayn(f, f2, f3, f4, this.f5032h.size() - 1));
                }
            }
        }
    }

    /* renamed from: a */
    int m6578a(int i, int i2) {
        return (this.f5025a * i) + (this.f5026b * i2);
    }

    /* renamed from: a */
    public void m6579a(int i) {
        this.f5035k = i;
    }

    /* renamed from: a */
    public void m6580a(String str, boolean z, float f, float f2, float f3, float f4) {
        m6577c(str, z, f, f2, f3, f4);
        synchronized (this.f5030f) {
            if (this.f5036l < 0) {
                bky.m9006b("ActivityContent: negative number of WebViews.");
            }
            m6589h();
        }
    }

    /* renamed from: a */
    public boolean m6581a() {
        boolean z;
        synchronized (this.f5030f) {
            z = this.f5036l == 0;
        }
        return z;
    }

    /* renamed from: b */
    public String m6582b() {
        return this.f5038n;
    }

    /* renamed from: b */
    public void m6583b(String str, boolean z, float f, float f2, float f3, float f4) {
        m6577c(str, z, f, f2, f3, f4);
    }

    /* renamed from: c */
    public String m6584c() {
        return this.f5039o;
    }

    /* renamed from: d */
    public String m6585d() {
        return this.f5040p;
    }

    /* renamed from: e */
    public void m6586e() {
        synchronized (this.f5030f) {
            this.f5037m -= 100;
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ayj)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        ayj ayj = (ayj) obj;
        return ayj.m6582b() != null && ayj.m6582b().equals(m6582b());
    }

    /* renamed from: f */
    public void m6587f() {
        synchronized (this.f5030f) {
            this.f5036l--;
        }
    }

    /* renamed from: g */
    public void m6588g() {
        synchronized (this.f5030f) {
            this.f5036l++;
        }
    }

    /* renamed from: h */
    public void m6589h() {
        synchronized (this.f5030f) {
            int a = m6578a(this.f5034j, this.f5035k);
            if (a > this.f5037m) {
                this.f5037m = a;
                if (((Boolean) bbb.ac.m7064c()).booleanValue() && !ako.m2347i().m8942b()) {
                    this.f5038n = this.f5028d.m6637a(this.f5031g);
                    this.f5039o = this.f5028d.m6637a(this.f5032h);
                }
                if (((Boolean) bbb.ae.m7064c()).booleanValue() && !ako.m2347i().m8944c()) {
                    this.f5040p = this.f5029e.m6658a(this.f5032h, this.f5033i);
                }
            }
        }
    }

    public int hashCode() {
        return m6582b().hashCode();
    }

    /* renamed from: i */
    public int m6590i() {
        return this.f5037m;
    }

    /* renamed from: j */
    int m6591j() {
        return this.f5034j;
    }

    public String toString() {
        int i = this.f5035k;
        int i2 = this.f5037m;
        int i3 = this.f5034j;
        String valueOf = String.valueOf(m6576a(this.f5031g, 100));
        String valueOf2 = String.valueOf(m6576a(this.f5032h, 100));
        String str = this.f5038n;
        String str2 = this.f5039o;
        String str3 = this.f5040p;
        return new StringBuilder(((((String.valueOf(valueOf).length() + 165) + String.valueOf(valueOf2).length()) + String.valueOf(str).length()) + String.valueOf(str2).length()) + String.valueOf(str3).length()).append("ActivityContent fetchId: ").append(i).append(" score:").append(i2).append(" total_length:").append(i3).append("\n text: ").append(valueOf).append("\n viewableText").append(valueOf2).append("\n signture: ").append(str).append("\n viewableSignture: ").append(str2).append("\n viewableSignatureForVertical: ").append(str3).toString();
    }
}
