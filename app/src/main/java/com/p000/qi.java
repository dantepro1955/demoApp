package com.p000;

import android.view.View;

/* compiled from: ViewBoundsCheck */
/* renamed from: qi */
public class qi {
    /* renamed from: a */
    final C5687b f25231a;
    /* renamed from: b */
    C5686a f25232b = new C5686a();

    /* compiled from: ViewBoundsCheck */
    /* renamed from: qi$a */
    static class C5686a {
        /* renamed from: a */
        int f25226a = 0;
        /* renamed from: b */
        int f25227b;
        /* renamed from: c */
        int f25228c;
        /* renamed from: d */
        int f25229d;
        /* renamed from: e */
        int f25230e;

        C5686a() {
        }

        /* renamed from: a */
        void m33847a(int i, int i2, int i3, int i4) {
            this.f25227b = i;
            this.f25228c = i2;
            this.f25229d = i3;
            this.f25230e = i4;
        }

        /* renamed from: a */
        void m33846a(int i) {
            this.f25226a |= i;
        }

        /* renamed from: a */
        void m33845a() {
            this.f25226a = 0;
        }

        /* renamed from: a */
        int m33844a(int i, int i2) {
            if (i > i2) {
                return 1;
            }
            if (i == i2) {
                return 2;
            }
            return 4;
        }

        /* renamed from: b */
        boolean m33848b() {
            if ((this.f25226a & 7) != 0 && (this.f25226a & (m33844a(this.f25229d, this.f25227b) << 0)) == 0) {
                return false;
            }
            if ((this.f25226a & 112) != 0 && (this.f25226a & (m33844a(this.f25229d, this.f25228c) << 4)) == 0) {
                return false;
            }
            if ((this.f25226a & 1792) != 0 && (this.f25226a & (m33844a(this.f25230e, this.f25227b) << 8)) == 0) {
                return false;
            }
            if ((this.f25226a & 28672) == 0 || (this.f25226a & (m33844a(this.f25230e, this.f25228c) << 12)) != 0) {
                return true;
            }
            return false;
        }
    }

    /* compiled from: ViewBoundsCheck */
    /* renamed from: qi$b */
    public interface C5687b {
        /* renamed from: a */
        int m33849a();

        /* renamed from: a */
        int m33850a(View view);

        /* renamed from: a */
        View m33851a(int i);

        /* renamed from: b */
        int m33852b();

        /* renamed from: b */
        int m33853b(View view);
    }

    public qi(C5687b c5687b) {
        this.f25231a = c5687b;
    }

    /* renamed from: a */
    public View m33854a(int i, int i2, int i3, int i4) {
        int a = this.f25231a.m33849a();
        int b = this.f25231a.m33852b();
        int i5 = i2 > i ? 1 : -1;
        View view = null;
        while (i != i2) {
            View a2 = this.f25231a.m33851a(i);
            this.f25232b.m33847a(a, b, this.f25231a.m33850a(a2), this.f25231a.m33853b(a2));
            if (i3 != 0) {
                this.f25232b.m33845a();
                this.f25232b.m33846a(i3);
                if (this.f25232b.m33848b()) {
                    return a2;
                }
            }
            if (i4 != 0) {
                this.f25232b.m33845a();
                this.f25232b.m33846a(i4);
                if (this.f25232b.m33848b()) {
                    i += i5;
                    view = a2;
                }
            }
            a2 = view;
            i += i5;
            view = a2;
        }
        return view;
    }

    /* renamed from: a */
    public boolean m33855a(View view, int i) {
        this.f25232b.m33847a(this.f25231a.m33849a(), this.f25231a.m33852b(), this.f25231a.m33850a(view), this.f25231a.m33853b(view));
        if (i == 0) {
            return false;
        }
        this.f25232b.m33845a();
        this.f25232b.m33846a(i);
        return this.f25232b.m33848b();
    }
}
