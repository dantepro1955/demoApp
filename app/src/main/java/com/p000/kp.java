package com.p000;

import android.os.Build.VERSION;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import p000.kq.C5489a;
import p000.kr.C5493a;

/* compiled from: AccessibilityNodeProviderCompat */
/* renamed from: kp */
public class kp {
    /* renamed from: a */
    private static final C5488a f24347a;
    /* renamed from: b */
    private final Object f24348b;

    /* compiled from: AccessibilityNodeProviderCompat */
    /* renamed from: kp$a */
    interface C5488a {
        /* renamed from: a */
        Object mo5123a(kp kpVar);
    }

    /* compiled from: AccessibilityNodeProviderCompat */
    /* renamed from: kp$d */
    static class C5491d implements C5488a {
        C5491d() {
        }

        /* renamed from: a */
        public Object mo5123a(kp kpVar) {
            return null;
        }
    }

    /* compiled from: AccessibilityNodeProviderCompat */
    /* renamed from: kp$b */
    static class C5492b extends C5491d {
        C5492b() {
        }

        /* renamed from: a */
        public Object mo5123a(final kp kpVar) {
            return kq.m32287a(new C5489a(this) {
                /* renamed from: b */
                final /* synthetic */ C5492b f24344b;

                /* renamed from: a */
                public boolean mo5122a(int i, int i2, Bundle bundle) {
                    return kpVar.m32285a(i, i2, bundle);
                }

                /* renamed from: a */
                public List<Object> mo5121a(String str, int i) {
                    List a = kpVar.m32283a(str, i);
                    if (a == null) {
                        return null;
                    }
                    List<Object> arrayList = new ArrayList();
                    int size = a.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        arrayList.add(((kg) a.get(i2)).m32140a());
                    }
                    return arrayList;
                }

                /* renamed from: a */
                public Object mo5120a(int i) {
                    kg a = kpVar.m32284a(i);
                    if (a == null) {
                        return null;
                    }
                    return a.m32140a();
                }
            });
        }
    }

    /* compiled from: AccessibilityNodeProviderCompat */
    /* renamed from: kp$c */
    static class C5495c extends C5491d {
        C5495c() {
        }

        /* renamed from: a */
        public Object mo5123a(final kp kpVar) {
            return kr.m32288a(new C5493a(this) {
                /* renamed from: b */
                final /* synthetic */ C5495c f24346b;

                /* renamed from: a */
                public boolean mo5126a(int i, int i2, Bundle bundle) {
                    return kpVar.m32285a(i, i2, bundle);
                }

                /* renamed from: a */
                public List<Object> mo5125a(String str, int i) {
                    List a = kpVar.m32283a(str, i);
                    if (a == null) {
                        return null;
                    }
                    List<Object> arrayList = new ArrayList();
                    int size = a.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        arrayList.add(((kg) a.get(i2)).m32140a());
                    }
                    return arrayList;
                }

                /* renamed from: a */
                public Object mo5124a(int i) {
                    kg a = kpVar.m32284a(i);
                    if (a == null) {
                        return null;
                    }
                    return a.m32140a();
                }

                /* renamed from: b */
                public Object mo5127b(int i) {
                    kg b = kpVar.m32286b(i);
                    if (b == null) {
                        return null;
                    }
                    return b.m32140a();
                }
            });
        }
    }

    static {
        if (VERSION.SDK_INT >= 19) {
            f24347a = new C5495c();
        } else if (VERSION.SDK_INT >= 16) {
            f24347a = new C5492b();
        } else {
            f24347a = new C5491d();
        }
    }

    public kp() {
        this.f24348b = f24347a.mo5123a(this);
    }

    public kp(Object obj) {
        this.f24348b = obj;
    }

    /* renamed from: a */
    public Object m32282a() {
        return this.f24348b;
    }

    /* renamed from: a */
    public kg m32284a(int i) {
        return null;
    }

    /* renamed from: a */
    public boolean m32285a(int i, int i2, Bundle bundle) {
        return false;
    }

    /* renamed from: a */
    public List<kg> m32283a(String str, int i) {
        return null;
    }

    /* renamed from: b */
    public kg m32286b(int i) {
        return null;
    }
}
