package com.p000;

import android.content.res.Configuration;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.KeyEvent;
import android.view.View;
import p000.bsr.C1442a;
import p000.bsr.C1443b;
import p000.bsr.C1445d;
import p000.bsr.C1446e;
import p000.bsr.C1447f;
import p000.bta.C1455a;
import p000.btb.C1457a;
import p000.btc.C1459a;

/* renamed from: btm */
public final class btm implements bsr {
    /* renamed from: a */
    private bsx f7625a;
    /* renamed from: b */
    private bsz f7626b;

    public btm(bsx bsx, bsz bsz) {
        this.f7625a = (bsx) bsv.m10707a((Object) bsx, (Object) "connectionClient cannot be null");
        this.f7626b = (bsz) bsv.m10707a((Object) bsz, (Object) "embeddedPlayer cannot be null");
    }

    /* renamed from: a */
    public final void mo1516a() {
        m10927c(true);
    }

    /* renamed from: a */
    public final void mo1517a(int i) {
        try {
            this.f7626b.mo1438a(i);
        } catch (RemoteException e) {
            throw new btk(e);
        }
    }

    /* renamed from: a */
    public final void m10911a(Configuration configuration) {
        try {
            this.f7626b.mo1439a(configuration);
        } catch (RemoteException e) {
            throw new btk(e);
        }
    }

    /* renamed from: a */
    public final void mo1518a(final C1443b c1443b) {
        try {
            this.f7626b.mo1440a(new C1455a(this) {
                /* renamed from: b */
                final /* synthetic */ btm f7620b;

                /* renamed from: a */
                public final void mo1480a(boolean z) {
                    c1443b.mo1736a(z);
                }
            });
        } catch (RemoteException e) {
            throw new btk(e);
        }
    }

    /* renamed from: a */
    public final void mo1519a(final C1445d c1445d) {
        try {
            this.f7626b.mo1441a(new C1457a(this) {
                /* renamed from: b */
                final /* synthetic */ btm f7624b;

                /* renamed from: a */
                public final void mo1481a() {
                    c1445d.mo1730a();
                }

                /* renamed from: a */
                public final void mo1482a(int i) {
                    c1445d.mo1731a(i);
                }

                /* renamed from: a */
                public final void mo1483a(boolean z) {
                    c1445d.mo1738b(z);
                }

                /* renamed from: b */
                public final void mo1484b() {
                    c1445d.mo1737b();
                }

                /* renamed from: c */
                public final void mo1485c() {
                    c1445d.mo1739c();
                }
            });
        } catch (RemoteException e) {
            throw new btk(e);
        }
    }

    /* renamed from: a */
    public final void mo1520a(final C1446e c1446e) {
        try {
            this.f7626b.mo1442a(new C1459a(this) {
                /* renamed from: b */
                final /* synthetic */ btm f7622b;

                /* renamed from: a */
                public final void mo1486a() {
                    c1446e.mo1740d();
                }

                /* renamed from: a */
                public final void mo1487a(String str) {
                    c1446e.mo1735a(str);
                }

                /* renamed from: b */
                public final void mo1488b() {
                    c1446e.mo1741e();
                }

                /* renamed from: b */
                public final void mo1489b(String str) {
                    C1442a valueOf;
                    try {
                        valueOf = C1442a.valueOf(str);
                    } catch (IllegalArgumentException e) {
                        valueOf = C1442a.UNKNOWN;
                    } catch (NullPointerException e2) {
                        valueOf = C1442a.UNKNOWN;
                    }
                    c1446e.mo1732a(valueOf);
                }

                /* renamed from: c */
                public final void mo1490c() {
                    c1446e.mo1742f();
                }

                /* renamed from: d */
                public final void mo1491d() {
                    c1446e.mo1743g();
                }
            });
        } catch (RemoteException e) {
            throw new btk(e);
        }
    }

    /* renamed from: a */
    public final void mo1521a(C1447f c1447f) {
        try {
            this.f7626b.mo1444a(c1447f.name());
        } catch (RemoteException e) {
            throw new btk(e);
        }
    }

    /* renamed from: a */
    public final void mo1522a(String str) {
        mo1523a(str, 0);
    }

    /* renamed from: a */
    public final void mo1523a(String str, int i) {
        try {
            this.f7626b.mo1445a(str, i);
        } catch (RemoteException e) {
            throw new btk(e);
        }
    }

    /* renamed from: a */
    public final void mo1524a(boolean z) {
        try {
            this.f7626b.mo1456b(z);
        } catch (RemoteException e) {
            throw new btk(e);
        }
    }

    /* renamed from: a */
    public final boolean m10919a(int i, KeyEvent keyEvent) {
        try {
            return this.f7626b.mo1449a(i, keyEvent);
        } catch (RemoteException e) {
            throw new btk(e);
        }
    }

    /* renamed from: a */
    public final boolean m10920a(Bundle bundle) {
        try {
            return this.f7626b.mo1450a(bundle);
        } catch (RemoteException e) {
            throw new btk(e);
        }
    }

    /* renamed from: b */
    public final void mo1525b() {
        try {
            this.f7626b.mo1437a();
        } catch (RemoteException e) {
            throw new btk(e);
        }
    }

    /* renamed from: b */
    public final void mo1526b(String str) {
        mo1527b(str, 0);
    }

    /* renamed from: b */
    public final void mo1527b(String str, int i) {
        try {
            this.f7626b.mo1453b(str, i);
        } catch (RemoteException e) {
            throw new btk(e);
        }
    }

    /* renamed from: b */
    public final void mo1528b(boolean z) {
        try {
            this.f7626b.mo1459c(z);
        } catch (RemoteException e) {
            throw new btk(e);
        }
    }

    /* renamed from: b */
    public final boolean m10925b(int i, KeyEvent keyEvent) {
        try {
            return this.f7626b.mo1457b(i, keyEvent);
        } catch (RemoteException e) {
            throw new btk(e);
        }
    }

    /* renamed from: c */
    public final void mo1529c() {
        try {
            this.f7626b.mo1451b();
        } catch (RemoteException e) {
            throw new btk(e);
        }
    }

    /* renamed from: c */
    public final void m10927c(boolean z) {
        try {
            this.f7626b.mo1448a(z);
            this.f7625a.mo1512a(z);
            this.f7625a.mo1507d();
        } catch (RemoteException e) {
            throw new btk(e);
        }
    }

    /* renamed from: d */
    public final void m10928d(boolean z) {
        try {
            this.f7626b.mo1464e(z);
        } catch (RemoteException e) {
            throw new btk(e);
        }
    }

    /* renamed from: d */
    public final boolean mo1530d() {
        try {
            return this.f7626b.mo1460c();
        } catch (RemoteException e) {
            throw new btk(e);
        }
    }

    /* renamed from: e */
    public final int mo1531e() {
        try {
            return this.f7626b.mo1468h();
        } catch (RemoteException e) {
            throw new btk(e);
        }
    }

    /* renamed from: f */
    public final int mo1532f() {
        try {
            return this.f7626b.mo1469i();
        } catch (RemoteException e) {
            throw new btk(e);
        }
    }

    /* renamed from: g */
    public final View m10932g() {
        try {
            return (View) btp.m10945a(this.f7626b.mo1479s());
        } catch (RemoteException e) {
            throw new btk(e);
        }
    }

    /* renamed from: h */
    public final void m10933h() {
        try {
            this.f7626b.mo1473m();
        } catch (RemoteException e) {
            throw new btk(e);
        }
    }

    /* renamed from: i */
    public final void m10934i() {
        try {
            this.f7626b.mo1474n();
        } catch (RemoteException e) {
            throw new btk(e);
        }
    }

    /* renamed from: j */
    public final void m10935j() {
        try {
            this.f7626b.mo1475o();
        } catch (RemoteException e) {
            throw new btk(e);
        }
    }

    /* renamed from: k */
    public final void m10936k() {
        try {
            this.f7626b.mo1476p();
        } catch (RemoteException e) {
            throw new btk(e);
        }
    }

    /* renamed from: l */
    public final void m10937l() {
        try {
            this.f7626b.mo1477q();
        } catch (RemoteException e) {
            throw new btk(e);
        }
    }

    /* renamed from: m */
    public final void m10938m() {
        try {
            this.f7626b.mo1472l();
        } catch (RemoteException e) {
            throw new btk(e);
        }
    }

    /* renamed from: n */
    public final Bundle m10939n() {
        try {
            return this.f7626b.mo1478r();
        } catch (RemoteException e) {
            throw new btk(e);
        }
    }
}
