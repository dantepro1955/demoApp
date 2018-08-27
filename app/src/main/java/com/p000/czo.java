package com.p000;

import com.facebook.internal.NativeProtocol;
import java.util.Vector;
import p000.czs.C4709b;
import p000.czs.C4711e;

/* renamed from: czo */
public class czo {
    /* renamed from: a */
    private C4704a f20806a;
    /* renamed from: b */
    private Vector<czp> f20807b;
    /* renamed from: c */
    private Vector<String> f20808c;

    /* renamed from: czo$a */
    public enum C4704a {
        ADD,
        REMOVE,
        CLEARALL
    }

    public czo(C4704a c4704a) {
        if (c4704a == C4704a.ADD || c4704a == C4704a.REMOVE || c4704a == C4704a.CLEARALL) {
            this.f20806a = c4704a;
        } else {
            this.f20806a = C4704a.ADD;
        }
        this.f20807b = new Vector();
        this.f20808c = new Vector();
    }

    /* renamed from: a */
    public int m25847a() {
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i2 < this.f20807b.size()) {
            czp czp = (czp) this.f20807b.elementAt(i2);
            i2++;
            i3 = czp != null ? czp.m25850a() + i3 : i3;
        }
        while (i < this.f20808c.size()) {
            String str = (String) this.f20808c.elementAt(i);
            i++;
            i3 = str != null ? str.hashCode() + i3 : i3;
        }
        return i3;
    }

    /* renamed from: a */
    public void m25848a(String str) {
        this.f20808c.add(str);
    }

    /* renamed from: b */
    final C4709b m25849b() {
        C4709b c4709b = new C4709b();
        czs c4709b2 = new C4709b();
        if (this.f20806a != null) {
            switch (this.f20806a) {
                case ADD:
                    c4709b.m25866a(NativeProtocol.WEB_DIALOG_ACTION, "add");
                    break;
                case REMOVE:
                    c4709b.m25866a(NativeProtocol.WEB_DIALOG_ACTION, "remove");
                    break;
                case CLEARALL:
                    c4709b.m25866a(NativeProtocol.WEB_DIALOG_ACTION, "clear_all");
                    break;
                default:
                    break;
            }
        }
        c4709b.m25866a(NativeProtocol.WEB_DIALOG_ACTION, "add");
        czs c4711e;
        int i;
        if (!this.f20807b.isEmpty()) {
            c4711e = new C4711e();
            for (i = 0; i < this.f20807b.size(); i++) {
                czp czp = (czp) this.f20807b.elementAt(i);
                if (czp != null) {
                    czs b = czp.m25851b();
                    if (b != null) {
                        c4711e.m25870a(b);
                    }
                }
            }
            c4709b2.m25865a("list", c4711e);
        } else if (!this.f20808c.isEmpty()) {
            c4711e = new C4711e();
            for (i = 0; i < this.f20808c.size(); i++) {
                String str = (String) this.f20808c.elementAt(i);
                if (str != null) {
                    c4711e.m25871a(str);
                }
            }
            c4709b2.m25865a("list", c4711e);
        }
        c4709b.m25865a("content", c4709b2);
        return c4709b;
    }

    public String toString() {
        int i;
        int i2 = 0;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("action:" + this.f20806a + "\n");
        if (!this.f20807b.isEmpty()) {
            int size = this.f20807b.size();
            stringBuffer.append("contact list: " + size + "\n");
            for (i = 0; i < size; i++) {
                czp czp = (czp) this.f20807b.elementAt(i);
                if (czp != null) {
                    stringBuffer.append("contact: " + i + "\n");
                    stringBuffer.append(czp.toString());
                }
            }
        }
        if (!this.f20808c.isEmpty()) {
            i = this.f20808c.size();
            stringBuffer.append("word list: " + i + "\n");
            while (i2 < i) {
                String str = (String) this.f20808c.elementAt(i2);
                if (str != null) {
                    stringBuffer.append("word: " + i2 + " " + str + "\n");
                }
                i2++;
            }
        }
        return stringBuffer.toString();
    }
}
