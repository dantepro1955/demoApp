package com.p000;

import android.animation.Animator;
import android.annotation.TargetApi;
import android.view.View;
import android.view.ViewGroup;

@TargetApi(14)
/* compiled from: VisibilityPort */
/* renamed from: cs */
abstract class cs extends cd {
    /* renamed from: a */
    private static final String[] f20071a = new String[]{"android:visibility:visibility", "android:visibility:parent"};

    /* compiled from: VisibilityPort */
    /* renamed from: cs$a */
    static class C4546a {
        /* renamed from: a */
        boolean f20065a;
        /* renamed from: b */
        boolean f20066b;
        /* renamed from: c */
        int f20067c;
        /* renamed from: d */
        int f20068d;
        /* renamed from: e */
        ViewGroup f20069e;
        /* renamed from: f */
        ViewGroup f20070f;

        C4546a() {
        }
    }

    cs() {
    }

    /* renamed from: a */
    public String[] m24746a() {
        return f20071a;
    }

    /* renamed from: d */
    private void m24742d(cj cjVar) {
        cjVar.f9413a.put("android:visibility:visibility", Integer.valueOf(cjVar.f9414b.getVisibility()));
        cjVar.f9413a.put("android:visibility:parent", cjVar.f9414b.getParent());
    }

    /* renamed from: a */
    public void m24745a(cj cjVar) {
        m24742d(cjVar);
    }

    /* renamed from: b */
    public void m24748b(cj cjVar) {
        m24742d(cjVar);
    }

    /* renamed from: c */
    public boolean m24749c(cj cjVar) {
        if (cjVar == null) {
            return false;
        }
        boolean z = ((Integer) cjVar.f9413a.get("android:visibility:visibility")).intValue() == 0 && ((View) cjVar.f9413a.get("android:visibility:parent")) != null;
        return z;
    }

    /* renamed from: a */
    private C4546a m24741a(cj cjVar, cj cjVar2) {
        C4546a c4546a = new C4546a();
        c4546a.f20065a = false;
        c4546a.f20066b = false;
        if (cjVar != null) {
            c4546a.f20067c = ((Integer) cjVar.f9413a.get("android:visibility:visibility")).intValue();
            c4546a.f20069e = (ViewGroup) cjVar.f9413a.get("android:visibility:parent");
        } else {
            c4546a.f20067c = -1;
            c4546a.f20069e = null;
        }
        if (cjVar2 != null) {
            c4546a.f20068d = ((Integer) cjVar2.f9413a.get("android:visibility:visibility")).intValue();
            c4546a.f20070f = (ViewGroup) cjVar2.f9413a.get("android:visibility:parent");
        } else {
            c4546a.f20068d = -1;
            c4546a.f20070f = null;
        }
        if (!(cjVar == null || cjVar2 == null)) {
            if (c4546a.f20067c == c4546a.f20068d && c4546a.f20069e == c4546a.f20070f) {
                return c4546a;
            }
            if (c4546a.f20067c != c4546a.f20068d) {
                if (c4546a.f20067c == 0) {
                    c4546a.f20066b = false;
                    c4546a.f20065a = true;
                } else if (c4546a.f20068d == 0) {
                    c4546a.f20066b = true;
                    c4546a.f20065a = true;
                }
            } else if (c4546a.f20069e != c4546a.f20070f) {
                if (c4546a.f20070f == null) {
                    c4546a.f20066b = false;
                    c4546a.f20065a = true;
                } else if (c4546a.f20069e == null) {
                    c4546a.f20066b = true;
                    c4546a.f20065a = true;
                }
            }
        }
        if (cjVar == null) {
            c4546a.f20066b = true;
            c4546a.f20065a = true;
        } else if (cjVar2 == null) {
            c4546a.f20066b = false;
            c4546a.f20065a = true;
        }
        return c4546a;
    }

    /* renamed from: a */
    public Animator m24744a(ViewGroup viewGroup, cj cjVar, cj cjVar2) {
        Object obj = null;
        int i = -1;
        C4546a a = m24741a(cjVar, cjVar2);
        if (a.f20065a) {
            if (this.h.size() > 0 || this.g.size() > 0) {
                View view;
                int id;
                Object obj2;
                View view2 = cjVar != null ? cjVar.f9414b : null;
                if (cjVar2 != null) {
                    view = cjVar2.f9414b;
                } else {
                    view = null;
                }
                if (view2 != null) {
                    id = view2.getId();
                } else {
                    id = -1;
                }
                if (view != null) {
                    i = view.getId();
                }
                if (a(view2, (long) id) || a(view, (long) r0)) {
                    obj2 = 1;
                } else {
                    obj2 = null;
                }
                obj = obj2;
            }
            if (!(obj == null && a.f20069e == null && a.f20070f == null)) {
                if (a.f20066b) {
                    return m24743a(viewGroup, cjVar, a.f20067c, cjVar2, a.f20068d);
                }
                return m24747b(viewGroup, cjVar, a.f20067c, cjVar2, a.f20068d);
            }
        }
        return null;
    }

    /* renamed from: a */
    public Animator m24743a(ViewGroup viewGroup, cj cjVar, int i, cj cjVar2, int i2) {
        return null;
    }

    /* renamed from: b */
    public Animator m24747b(ViewGroup viewGroup, cj cjVar, int i, cj cjVar2, int i2) {
        return null;
    }
}
