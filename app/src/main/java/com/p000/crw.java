package com.p000;

import android.os.Bundle;
import android.os.Handler;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: Blitz */
/* renamed from: crw */
public abstract class crw<E extends crz> extends CopyOnWriteArrayList<E> {
    /* renamed from: a */
    private static int f20030a = 0;
    /* renamed from: b */
    private static HashMap<String, crw> f20031b = new HashMap();
    /* renamed from: c */
    private static hh<String, crw> f20032c = new hh();
    /* renamed from: d */
    private static hh<String, Integer> f20033d = new hh();
    /* renamed from: e */
    private int f20034e;
    /* renamed from: f */
    private Handler f20035f;
    /* renamed from: g */
    private Handler f20036g;
    /* renamed from: h */
    private boolean f20037h;
    /* renamed from: i */
    private int f20038i;
    /* renamed from: j */
    private boolean f20039j;
    /* renamed from: k */
    private C4102a f20040k;
    /* renamed from: l */
    private boolean f20041l = false;
    /* renamed from: m */
    private boolean f20042m = false;
    /* renamed from: n */
    private boolean f20043n = false;
    /* renamed from: o */
    private C4541b f20044o;

    /* compiled from: Blitz */
    /* renamed from: crw$a */
    public interface C4102a {
        /* renamed from: a */
        void mo3774a();

        /* renamed from: a */
        void mo3775a(boolean z, boolean z2);

        /* renamed from: b */
        void mo3776b(boolean z, boolean z2);
    }

    /* compiled from: Blitz */
    /* renamed from: crw$b */
    public interface C4541b {
        void a_(String str);

        /* renamed from: d */
        void mo4127d(String str);
    }

    /* renamed from: a */
    protected abstract List<E> mo4132a();

    /* renamed from: a */
    protected abstract List<E> mo4133a(int i);

    /* renamed from: b */
    protected abstract boolean mo4134b();

    /* renamed from: c */
    protected abstract void mo4135c();

    /* renamed from: d */
    protected abstract void mo4136d();

    /* renamed from: e */
    protected abstract String mo4137e();

    protected crw() {
        int i = f20030a;
        f20030a = i + 1;
        this.f20034e = i;
    }

    /* renamed from: a */
    public void m24668a(C4541b c4541b) {
        this.f20044o = c4541b;
    }

    /* renamed from: q */
    public C4541b m24685q() {
        return this.f20044o;
    }

    public int hashCode() {
        return this.f20034e;
    }

    /* renamed from: k */
    protected long m24684k() {
        return 0;
    }

    /* renamed from: a */
    public void m24665a(Bundle bundle) {
        bundle.putBoolean(mo4137e() + ":end-of-list", this.f20037h);
        bundle.putBoolean(mo4137e() + ":inited", this.f20043n);
        bundle.putBoolean(mo4137e() + ":remote-refreshing", this.f20041l);
        bundle.putBoolean(mo4137e() + ":remote-loading-more", this.f20042m);
        m24656g();
    }

    /* renamed from: b */
    public void m24671b(Bundle bundle) {
        if (bundle != null) {
            this.f20037h = bundle.getBoolean(mo4137e() + ":end-of-list");
            this.f20043n = bundle.getBoolean(mo4137e() + ":inited");
            this.f20041l = bundle.getBoolean(mo4137e() + ":remote-refreshing");
            this.f20042m = bundle.getBoolean(mo4137e() + ":remote-loading-more");
            m24657h();
        }
    }

    /* renamed from: g */
    private void m24656g() {
        f20031b.put(mo4137e(), this);
    }

    /* renamed from: i */
    public void m24682i() {
        m24668a(null);
        m24667a(null);
        m24666a(null, null);
        f20032c.put(mo4137e(), (crw) clone());
    }

    /* renamed from: j */
    public void m24683j() {
        if (f20032c.containsKey(mo4137e())) {
            clear();
            addAll((Collection) f20032c.get(mo4137e()));
        }
    }

    /* renamed from: d */
    public void m24678d(int i) {
        this.f20038i = i;
        f20033d.put(mo4137e(), Integer.valueOf(this.f20038i));
    }

    /* renamed from: r */
    public int m24686r() {
        return f20033d.get(mo4137e()) == null ? 0 : ((Integer) f20033d.get(mo4137e())).intValue();
    }

    /* renamed from: h */
    private void m24657h() {
        if (f20031b.containsKey(mo4137e())) {
            crw crw = (crw) f20031b.get(mo4137e());
            if (crw.size() > 0) {
                addAll(crw);
            } else {
                this.f20043n = false;
            }
            f20031b.remove(mo4137e());
            return;
        }
        this.f20043n = false;
    }

    /* renamed from: s */
    public crw<E> m24687s() {
        if (f20032c.containsKey(mo4137e()) && ((crw) f20032c.get(mo4137e())).size() != 0) {
            return (crw) f20032c.get(mo4137e());
        }
        if (f20032c.containsKey(mo4137e())) {
            f20032c.remove(mo4137e());
        }
        return null;
    }

    /* renamed from: a */
    public static crw m24653a(String str) {
        return (crw) f20032c.get(str);
    }

    /* renamed from: t */
    public void m24688t() {
        if (this.f20041l) {
            m24676c(true);
        }
        if (this.f20042m) {
            m24679d(true);
        }
    }

    /* renamed from: a */
    public void m24666a(Handler handler, Handler handler2) {
        this.f20035f = handler;
        this.f20036g = handler2;
    }

    /* renamed from: u */
    public boolean m24689u() {
        return (this.f20035f == null || this.f20036g == null) ? false : true;
    }

    /* renamed from: v */
    public boolean m24690v() {
        return this.f20037h;
    }

    /* renamed from: w */
    public boolean m24691w() {
        return this.f20039j;
    }

    /* renamed from: a */
    public void m24669a(boolean z) {
        this.f20037h = z;
    }

    /* renamed from: b */
    public void m24672b(boolean z) {
        this.f20039j = z;
    }

    /* renamed from: a */
    public void m24667a(C4102a c4102a) {
        this.f20040k = c4102a;
    }

    /* renamed from: x */
    public void m24692x() {
        m24676c(false);
    }

    /* renamed from: y */
    public void m24693y() {
        m24679d(false);
    }

    /* renamed from: z */
    public void m24694z() {
        if (this.f20043n) {
            m24688t();
            return;
        }
        this.f20043n = true;
        m24692x();
        if (m24681f()) {
            m24658A();
        }
    }

    /* renamed from: f */
    public boolean m24681f() {
        return true;
    }

    /* renamed from: c */
    protected void m24676c(final boolean z) {
        if (m24689u()) {
            this.f20036g.post(new Runnable(this) {
                /* renamed from: b */
                final /* synthetic */ crw f20024b;

                public void run() {
                    final List a = this.f20024b.mo4132a();
                    final boolean b = this.f20024b.mo4134b();
                    this.f20024b.m24669a(!b);
                    if (this.f20024b.m24689u()) {
                        this.f20024b.f20035f.post(new Runnable(this) {
                            /* renamed from: c */
                            final /* synthetic */ C45381 f20022c;

                            public void run() {
                                this.f20022c.f20024b.clear();
                                for (crz add : a) {
                                    this.f20022c.f20024b.add(add);
                                }
                                if (z) {
                                    this.f20022c.f20024b.f20041l = false;
                                }
                                this.f20022c.f20024b.m24670a(b, z);
                            }
                        });
                    }
                }
            });
        }
    }

    /* renamed from: d */
    protected void m24679d(final boolean z) {
        if (m24689u() && !m24690v()) {
            this.f20036g.post(new Runnable(this) {
                /* renamed from: b */
                final /* synthetic */ crw f20029b;

                public void run() {
                    boolean z = true;
                    final List a = this.f20029b.mo4133a(this.f20029b.size());
                    final boolean b = this.f20029b.mo4134b();
                    if (!z) {
                        this.f20029b.m24672b(this.f20029b.m24684k() == ((long) this.f20029b.size()));
                    }
                    crw crw = this.f20029b;
                    if (b) {
                        z = false;
                    }
                    crw.m24669a(z);
                    if (this.f20029b.m24689u()) {
                        this.f20029b.f20035f.post(new Runnable(this) {
                            /* renamed from: c */
                            final /* synthetic */ C45402 f20027c;

                            public void run() {
                                for (crz add : a) {
                                    this.f20027c.f20029b.add(add);
                                }
                                if (z) {
                                    this.f20027c.f20029b.f20042m = false;
                                }
                                this.f20027c.f20029b.m24673b(b, z);
                            }
                        });
                    }
                }
            });
        }
    }

    /* renamed from: A */
    public void m24658A() {
        this.f20041l = true;
        m24662E();
        mo4135c();
    }

    /* renamed from: B */
    public void m24659B() {
        this.f20042m = true;
        mo4136d();
    }

    /* renamed from: C */
    protected void m24660C() {
        m24676c(true);
    }

    /* renamed from: D */
    protected void m24661D() {
        m24679d(true);
    }

    /* renamed from: E */
    protected void m24662E() {
        if (this.f20040k != null) {
            this.f20040k.mo3774a();
        }
    }

    /* renamed from: a */
    protected void m24670a(boolean z, boolean z2) {
        if (this.f20040k != null) {
            this.f20040k.mo3775a(z, z2);
        }
    }

    /* renamed from: b */
    protected void m24673b(boolean z, boolean z2) {
        if (this.f20040k != null) {
            this.f20040k.mo3776b(z, z2);
        }
    }

    /* renamed from: F */
    public static void m24651F() {
        synchronized (f20032c) {
            f20032c.clear();
        }
    }
}
