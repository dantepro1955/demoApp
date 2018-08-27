package com.p000;

import java.util.Vector;
import p000.czs.C4709b;
import p000.czs.C4711e;

/* renamed from: czr */
public class czr {
    /* renamed from: a */
    private int f20827a = 0;
    /* renamed from: b */
    private String f20828b = null;
    /* renamed from: c */
    private Vector<czq> f20829c = new Vector();

    /* renamed from: a */
    public Vector<czq> m25857a() {
        return this.f20829c;
    }

    /* renamed from: a */
    public void m25858a(czq czq) {
        if (czq != null) {
            this.f20829c.add(czq);
        }
    }

    /* renamed from: b */
    public int m25859b() {
        int i = 0;
        int i2 = 0;
        while (i < this.f20829c.size()) {
            czq czq = (czq) this.f20829c.elementAt(i);
            i++;
            i2 = czq != null ? czq.m25854b() + i2 : i2;
        }
        return i2;
    }

    /* renamed from: c */
    public C4709b m25860c() {
        C4709b c4709b = new C4709b();
        c4709b.m25864a("delete_all", this.f20827a);
        if (this.f20828b != null) {
            c4709b.m25866a("common_user_id", this.f20828b);
        }
        if (!this.f20829c.isEmpty()) {
            czs c4711e = new C4711e();
            for (int i = 0; i < this.f20829c.size(); i++) {
                czq czq = (czq) this.f20829c.elementAt(i);
                if (czq != null) {
                    czs d = czq.m25856d();
                    if (d != null) {
                        c4711e.m25870a(d);
                    }
                }
            }
            c4709b.m25865a("data_list", c4711e);
        }
        return c4709b;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("delete_all:" + this.f20827a + "\n");
        stringBuffer.append("checksum:" + m25859b() + "\n");
        if (!this.f20829c.isEmpty()) {
            int size = this.f20829c.size();
            stringBuffer.append("data_list: elements " + size + "\n");
            for (int i = 0; i < size; i++) {
                czq czq = (czq) this.f20829c.elementAt(i);
                if (czq != null) {
                    stringBuffer.append("data: " + i + "\n");
                    stringBuffer.append(czq.toString());
                }
            }
        }
        return stringBuffer.toString();
    }
}
