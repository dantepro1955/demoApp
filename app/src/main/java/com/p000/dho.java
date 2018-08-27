package com.p000;

import java.util.ArrayDeque;

/* compiled from: SimplePQ */
/* renamed from: dho */
public class dho {
    /* renamed from: a */
    ArrayDeque<dhp> f21641a = new ArrayDeque();
    /* renamed from: b */
    ArrayDeque<dhp> f21642b = new ArrayDeque();
    /* renamed from: c */
    ArrayDeque<dhp> f21643c = new ArrayDeque();
    /* renamed from: d */
    String f21644d = null;
    /* renamed from: e */
    long f21645e = 0;

    /* renamed from: a */
    public synchronized dhp m27304a() {
        dhp dhp;
        dhp = null;
        if (this.f21641a.size() > 0) {
            dhp = (dhp) this.f21641a.pop();
        } else if (this.f21642b.size() > 0) {
            dhp = (dhp) this.f21642b.pop();
        } else if (this.f21643c.size() > 0) {
            dhp = (dhp) this.f21643c.poll();
        }
        return dhp;
    }

    /* renamed from: a */
    public synchronized void m27305a(dhp dhp) {
        String b = dhp.mo4413b();
        long currentTimeMillis = System.currentTimeMillis();
        if (this.f21644d == null || !this.f21644d.equals(b) || this.f21645e + 100 <= currentTimeMillis) {
            this.f21644d = b;
            this.f21645e = currentTimeMillis;
            int a = dhp.mo4412a();
            if (a == 2) {
                m27303b(this.f21641a, dhp);
                m27303b(this.f21642b, dhp);
                m27303b(this.f21643c, dhp);
                this.f21641a.push(dhp);
            } else if (a == 1) {
                if (!m27302a(this.f21641a, dhp)) {
                    m27303b(this.f21642b, dhp);
                    m27303b(this.f21643c, dhp);
                    this.f21642b.push(dhp);
                }
            } else if (!(m27302a(this.f21641a, dhp) || m27302a(this.f21642b, dhp) || m27302a(this.f21643c, dhp))) {
                this.f21643c.add(dhp);
            }
        }
    }

    /* renamed from: a */
    private synchronized boolean m27302a(ArrayDeque<dhp> arrayDeque, dhp dhp) {
        boolean z;
        String b = dhp.mo4413b();
        if (b != null) {
            for (dhp b2 : (dhp[]) arrayDeque.toArray(new dhp[0])) {
                if (b.equals(b2.mo4413b())) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        return z;
    }

    /* renamed from: b */
    private synchronized void m27303b(ArrayDeque<dhp> arrayDeque, dhp dhp) {
        synchronized (this) {
            String b = dhp.mo4413b();
            dhp[] dhpArr = (dhp[]) arrayDeque.toArray(new dhp[0]);
            if (b != null) {
                for (dhp dhp2 : dhpArr) {
                    if (b.equals(dhp2.mo4413b())) {
                        arrayDeque.remove(dhp2);
                        break;
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public synchronized void m27306b(dhp dhp) {
        m27303b(this.f21641a, dhp);
        m27303b(this.f21642b, dhp);
        m27303b(this.f21643c, dhp);
    }
}
