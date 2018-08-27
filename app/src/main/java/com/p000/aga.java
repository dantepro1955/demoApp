package com.p000;

import java.io.EOFException;
import java.io.IOException;
import java.util.Stack;

/* compiled from: DefaultEbmlReader */
/* renamed from: aga */
final class aga implements agb {
    /* renamed from: a */
    private final byte[] f1248a = new byte[8];
    /* renamed from: b */
    private final Stack<C0159a> f1249b = new Stack();
    /* renamed from: c */
    private final age f1250c = new age();
    /* renamed from: d */
    private agc f1251d;
    /* renamed from: e */
    private int f1252e;
    /* renamed from: f */
    private int f1253f;
    /* renamed from: g */
    private long f1254g;

    /* compiled from: DefaultEbmlReader */
    /* renamed from: aga$a */
    static final class C0159a {
        /* renamed from: a */
        private final int f1246a;
        /* renamed from: b */
        private final long f1247b;

        private C0159a(int i, long j) {
            this.f1246a = i;
            this.f1247b = j;
        }
    }

    aga() {
    }

    /* renamed from: a */
    public void mo170a(agc agc) {
        this.f1251d = agc;
    }

    /* renamed from: a */
    public void mo169a() {
        this.f1252e = 0;
        this.f1249b.clear();
        this.f1250c.m1414a();
    }

    /* renamed from: a */
    public boolean mo171a(aeh aeh) throws IOException, InterruptedException {
        ahb.m1516b(this.f1251d != null);
        while (true) {
            if (this.f1249b.isEmpty() || aeh.mo120c() < ((C0159a) this.f1249b.peek()).f1247b) {
                if (this.f1252e == 0) {
                    long a = this.f1250c.m1413a(aeh, true, false, 4);
                    if (a == -2) {
                        a = m1396b(aeh);
                    }
                    if (a == -1) {
                        return false;
                    }
                    this.f1253f = (int) a;
                    this.f1252e = 1;
                }
                if (this.f1252e == 1) {
                    this.f1254g = this.f1250c.m1413a(aeh, false, true, 8);
                    this.f1252e = 2;
                }
                int a2 = this.f1251d.mo172a(this.f1253f);
                switch (a2) {
                    case 0:
                        aeh.mo117b((int) this.f1254g);
                        this.f1252e = 0;
                    case 1:
                        long c = aeh.mo120c();
                        this.f1249b.add(new C0159a(this.f1253f, this.f1254g + c));
                        this.f1251d.mo176a(this.f1253f, c, this.f1254g);
                        this.f1252e = 0;
                        return true;
                    case 2:
                        if (this.f1254g > 8) {
                            throw new adq("Invalid integer size: " + this.f1254g);
                        }
                        this.f1251d.mo175a(this.f1253f, m1394a(aeh, (int) this.f1254g));
                        this.f1252e = 0;
                        return true;
                    case 3:
                        if (this.f1254g > 2147483647L) {
                            throw new adq("String element size: " + this.f1254g);
                        }
                        this.f1251d.mo177a(this.f1253f, m1397c(aeh, (int) this.f1254g));
                        this.f1252e = 0;
                        return true;
                    case 4:
                        this.f1251d.mo174a(this.f1253f, (int) this.f1254g, aeh);
                        this.f1252e = 0;
                        return true;
                    case 5:
                        if (this.f1254g == 4 || this.f1254g == 8) {
                            this.f1251d.mo173a(this.f1253f, m1395b(aeh, (int) this.f1254g));
                            this.f1252e = 0;
                            return true;
                        }
                        throw new adq("Invalid float size: " + this.f1254g);
                    default:
                        throw new adq("Invalid element type " + a2);
                }
            }
            this.f1251d.mo179c(((C0159a) this.f1249b.pop()).f1246a);
            return true;
        }
    }

    /* renamed from: b */
    private long m1396b(aeh aeh) throws EOFException, IOException, InterruptedException {
        while (true) {
            aeh.mo114a();
            aeh.mo122c(this.f1248a, 0, 4);
            int a = age.m1411a(this.f1248a[0]);
            if (a != -1 && a <= 4) {
                int a2 = (int) age.m1412a(this.f1248a, a, false);
                if (this.f1251d.mo178b(a2)) {
                    aeh.mo117b(a);
                    aeh.mo114a();
                    return (long) a2;
                }
            }
            aeh.mo117b(1);
        }
    }

    /* renamed from: a */
    private long m1394a(aeh aeh, int i) throws IOException, InterruptedException {
        int i2 = 0;
        aeh.mo118b(this.f1248a, 0, i);
        long j = 0;
        while (i2 < i) {
            j = (j << 8) | ((long) (this.f1248a[i2] & 255));
            i2++;
        }
        return j;
    }

    /* renamed from: b */
    private double m1395b(aeh aeh, int i) throws IOException, InterruptedException {
        long a = m1394a(aeh, i);
        if (i == 4) {
            return (double) Float.intBitsToFloat((int) a);
        }
        return Double.longBitsToDouble(a);
    }

    /* renamed from: c */
    private String m1397c(aeh aeh, int i) throws IOException, InterruptedException {
        if (i == 0) {
            return "";
        }
        byte[] bArr = new byte[i];
        aeh.mo118b(bArr, 0, i);
        return new String(bArr);
    }
}
