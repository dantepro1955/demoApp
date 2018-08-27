package com.p000;

import java.util.Vector;

/* renamed from: dqs */
public final class dqs implements dqp {
    /* renamed from: a */
    private Vector f22620a = new Vector();
    /* renamed from: b */
    private dqr f22621b = null;
    /* renamed from: c */
    private double f22622c = 0.0d;

    /* renamed from: a */
    private dqt m28756a(int i) {
        return (dqt) this.f22620a.elementAt(i);
    }

    /* renamed from: a */
    public final double mo4553a() {
        return this.f22622c;
    }

    /* renamed from: a */
    public final void m28758a(double d) {
        this.f22622c = d;
    }

    /* renamed from: a */
    final void m28759a(dqr dqr) {
        this.f22621b = dqr;
    }

    /* renamed from: a */
    public final void m28760a(dqt dqt) {
        if (!(this.f22620a.size() == 0 || ((dqt) this.f22620a.lastElement()).m28769f() || dqt.m28768e())) {
            int size = this.f22620a.size();
            long c = this.f22620a.size() == 0 ? 0 : size == this.f22620a.size() ? m28756a(size - 1).m28766c() : m28756a(size).m28765b();
            this.f22620a.insertElementAt(new dqt(" ", c, c, 0.0d, false, (byte) 0), size);
        }
        this.f22620a.addElement(dqt);
    }

    /* renamed from: b */
    public final int m28761b() {
        int i = 0;
        int size = this.f22620a.size();
        if (size != 0) {
            for (int i2 = 0; i2 < size; i2++) {
                if (!m28756a(i2).m28767d()) {
                    i++;
                }
            }
        }
        return i;
    }

    /* renamed from: c */
    final void m28762c() {
        String property = System.getProperty("line.separator");
        if (property == null) {
            property = "\n";
        }
        for (int i = 0; i < this.f22620a.size(); i++) {
            dqt a = m28756a(i);
            StringBuffer stringBuffer = new StringBuffer(a.m28763a());
            int i2 = 0;
            while (i2 < stringBuffer.length()) {
                i2 = stringBuffer.toString().indexOf("\r\n", i2);
                if (i2 == -1) {
                    break;
                }
                stringBuffer.deleteCharAt(i2);
                stringBuffer.deleteCharAt(i2);
                stringBuffer.insert(i2, '\n');
                i2++;
            }
            i2 = 0;
            while (i2 < stringBuffer.length()) {
                i2 = stringBuffer.toString().indexOf("\n", i2);
                if (i2 == -1) {
                    break;
                }
                stringBuffer.deleteCharAt(i2);
                stringBuffer.insert(i2, property);
                i2 += property.length();
            }
            a.m28764a(stringBuffer.toString());
        }
    }

    public final String toString() {
        if (this.f22620a.size() == 0) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < this.f22620a.size(); i++) {
            stringBuffer.append(m28756a(i).toString());
        }
        return stringBuffer.toString();
    }
}
