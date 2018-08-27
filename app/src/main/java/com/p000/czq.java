package com.p000;

import java.util.Vector;
import p000.czs.C4709b;
import p000.czs.C4711e;

/* renamed from: czq */
public class czq {
    /* renamed from: a */
    private String f20823a;
    /* renamed from: b */
    private int f20824b = 0;
    /* renamed from: c */
    private C4706a f20825c;
    /* renamed from: d */
    private Vector<czo> f20826d;

    /* renamed from: czq$a */
    public enum C4706a {
        CONTACTS,
        CUSTOMWORDS,
        HISTORY
    }

    public czq(String str, C4706a c4706a) {
        this.f20823a = str;
        if (c4706a == C4706a.CONTACTS || c4706a == C4706a.CUSTOMWORDS || c4706a == C4706a.HISTORY) {
            this.f20825c = c4706a;
        } else {
            this.f20825c = C4706a.CONTACTS;
        }
        this.f20826d = new Vector();
    }

    /* renamed from: a */
    public String m25852a() {
        return this.f20823a;
    }

    /* renamed from: a */
    public void m25853a(czo czo) {
        if (czo != null) {
            this.f20826d.add(czo);
        }
    }

    /* renamed from: b */
    public int m25854b() {
        int i = 0;
        int i2 = 0;
        while (i < this.f20826d.size()) {
            czo czo = (czo) this.f20826d.elementAt(i);
            i++;
            i2 = czo != null ? czo.m25847a() + i2 : i2;
        }
        this.f20824b = i2;
        return i2;
    }

    /* renamed from: c */
    public String m25855c() {
        if (this.f20825c == null) {
            return "contacts";
        }
        switch (this.f20825c) {
            case CONTACTS:
                return "contacts";
            case CUSTOMWORDS:
                return "custom_words";
            case HISTORY:
                return "history";
            default:
                return "contacts";
        }
    }

    /* renamed from: d */
    final C4709b m25856d() {
        C4709b c4709b = new C4709b();
        c4709b.m25866a("id", this.f20823a);
        if (this.f20825c != null) {
            switch (this.f20825c) {
                case CONTACTS:
                    c4709b.m25866a("type", "contacts");
                    break;
                case CUSTOMWORDS:
                    c4709b.m25866a("type", "custom_words");
                    break;
                case HISTORY:
                    c4709b.m25866a("type", "history");
                    break;
                default:
                    break;
            }
        }
        c4709b.m25866a("type", "contacts");
        if (!this.f20826d.isEmpty()) {
            czs c4711e = new C4711e();
            for (int i = 0; i < this.f20826d.size(); i++) {
                czo czo = (czo) this.f20826d.elementAt(i);
                if (czo != null) {
                    czs b = czo.m25849b();
                    if (b != null) {
                        c4711e.m25870a(b);
                    }
                }
            }
            c4709b.m25865a("actions", c4711e);
        }
        return c4709b;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("id:" + this.f20823a + "\n");
        stringBuffer.append("checksum:" + this.f20824b + "\n");
        stringBuffer.append("type:" + this.f20825c + "\n");
        if (!this.f20826d.isEmpty()) {
            int size = this.f20826d.size();
            stringBuffer.append("action list: " + size + "\n");
            for (int i = 0; i < size; i++) {
                czo czo = (czo) this.f20826d.elementAt(i);
                if (czo != null) {
                    stringBuffer.append("action: " + i + "\n");
                    stringBuffer.append(czo.toString());
                }
            }
        }
        return stringBuffer.toString();
    }
}
