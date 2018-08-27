package com.p000;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Option */
/* renamed from: dsr */
public class dsr implements Serializable, Cloneable {
    private static final long serialVersionUID = 1;
    /* renamed from: a */
    private String f22822a;
    /* renamed from: b */
    private String f22823b;
    /* renamed from: c */
    private String f22824c = "arg";
    /* renamed from: d */
    private String f22825d;
    /* renamed from: e */
    private boolean f22826e;
    /* renamed from: f */
    private boolean f22827f;
    /* renamed from: g */
    private int f22828g = -1;
    /* renamed from: h */
    private Object f22829h;
    /* renamed from: i */
    private List f22830i = new ArrayList();
    /* renamed from: j */
    private char f22831j;

    public dsr(String str, String str2, boolean z, String str3) throws IllegalArgumentException {
        dst.m29185a(str);
        this.f22822a = str;
        this.f22823b = str2;
        if (z) {
            this.f22828g = 1;
        }
        this.f22825d = str3;
    }

    /* renamed from: a */
    String m29165a() {
        if (this.f22822a == null) {
            return this.f22823b;
        }
        return this.f22822a;
    }

    /* renamed from: b */
    public String m29167b() {
        return this.f22822a;
    }

    /* renamed from: c */
    public String m29168c() {
        return this.f22823b;
    }

    /* renamed from: d */
    public boolean m29169d() {
        return this.f22827f;
    }

    /* renamed from: e */
    public boolean m29170e() {
        return this.f22823b != null;
    }

    /* renamed from: f */
    public boolean m29171f() {
        return this.f22828g > 0 || this.f22828g == -2;
    }

    /* renamed from: g */
    public String m29172g() {
        return this.f22825d;
    }

    /* renamed from: h */
    public boolean m29173h() {
        return this.f22826e;
    }

    /* renamed from: i */
    public String m29174i() {
        return this.f22824c;
    }

    /* renamed from: j */
    public boolean m29175j() {
        return this.f22824c != null && this.f22824c.length() > 0;
    }

    /* renamed from: k */
    public boolean m29176k() {
        return this.f22828g > 1 || this.f22828g == -2;
    }

    /* renamed from: l */
    public char m29177l() {
        return this.f22831j;
    }

    /* renamed from: m */
    public boolean m29178m() {
        return this.f22831j > '\u0000';
    }

    /* renamed from: a */
    void m29166a(String str) {
        switch (this.f22828g) {
            case -1:
                throw new RuntimeException("NO_ARGS_ALLOWED");
            default:
                m29162b(str);
                return;
        }
    }

    /* renamed from: b */
    private void m29162b(String str) {
        if (m29178m()) {
            char l = m29177l();
            int indexOf = str.indexOf(l);
            while (indexOf != -1 && this.f22830i.size() != this.f22828g - 1) {
                m29163c(str.substring(0, indexOf));
                str = str.substring(indexOf + 1);
                indexOf = str.indexOf(l);
            }
        }
        m29163c(str);
    }

    /* renamed from: c */
    private void m29163c(String str) {
        if (this.f22828g <= 0 || this.f22830i.size() <= this.f22828g - 1) {
            this.f22830i.add(str);
            return;
        }
        throw new RuntimeException("Cannot add value, list full.");
    }

    /* renamed from: n */
    public String[] m29179n() {
        return m29164p() ? null : (String[]) this.f22830i.toArray(new String[this.f22830i.size()]);
    }

    public String toString() {
        StringBuffer append = new StringBuffer().append("[ option: ");
        append.append(this.f22822a);
        if (this.f22823b != null) {
            append.append(" ").append(this.f22823b);
        }
        append.append(" ");
        if (m29176k()) {
            append.append("[ARG...]");
        } else if (m29171f()) {
            append.append(" [ARG]");
        }
        append.append(" :: ").append(this.f22825d);
        if (this.f22829h != null) {
            append.append(" :: ").append(this.f22829h);
        }
        append.append(" ]");
        return append.toString();
    }

    /* renamed from: p */
    private boolean m29164p() {
        return this.f22830i.isEmpty();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        dsr dsr = (dsr) obj;
        if (this.f22822a == null ? dsr.f22822a != null : !this.f22822a.equals(dsr.f22822a)) {
            return false;
        }
        if (this.f22823b != null) {
            if (this.f22823b.equals(dsr.f22823b)) {
                return true;
            }
        } else if (dsr.f22823b == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int i = 0;
        if (this.f22822a != null) {
            hashCode = this.f22822a.hashCode();
        } else {
            hashCode = 0;
        }
        hashCode *= 31;
        if (this.f22823b != null) {
            i = this.f22823b.hashCode();
        }
        return hashCode + i;
    }

    public Object clone() {
        try {
            dsr dsr = (dsr) super.clone();
            dsr.f22830i = new ArrayList(this.f22830i);
            return dsr;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(new StringBuffer().append("A CloneNotSupportedException was thrown: ").append(e.getMessage()).toString());
        }
    }

    /* renamed from: o */
    void m29180o() {
        this.f22830i.clear();
    }
}
