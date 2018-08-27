package com.p000;

import io.fabric.sdk.android.Fabric;
import java.io.IOException;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import p000.acw.C0072a;

/* compiled from: NativeCrashWriter */
/* renamed from: acb */
class acb {
    /* renamed from: a */
    private static final acv f336a = new acv("", "", 0);
    /* renamed from: b */
    private static final C0055j[] f337b = new C0055j[0];
    /* renamed from: c */
    private static final C0067m[] f338c = new C0067m[0];
    /* renamed from: d */
    private static final C0062g[] f339d = new C0062g[0];
    /* renamed from: e */
    private static final C0057b[] f340e = new C0057b[0];
    /* renamed from: f */
    private static final C0058c[] f341f = new C0058c[0];

    /* compiled from: NativeCrashWriter */
    /* renamed from: acb$j */
    static abstract class C0055j {
        /* renamed from: a */
        private final int f308a;
        /* renamed from: b */
        private final C0055j[] f309b;

        public C0055j(int i, C0055j... c0055jArr) {
            this.f308a = i;
            if (c0055jArr == null) {
                c0055jArr = acb.f337b;
            }
            this.f309b = c0055jArr;
        }

        /* renamed from: b */
        public int mo30b() {
            int c = m412c();
            return (c + abg.m184l(c)) + abg.m183j(this.f308a);
        }

        /* renamed from: c */
        public int m412c() {
            int a = mo28a();
            for (C0055j b : this.f309b) {
                a += b.mo30b();
            }
            return a;
        }

        /* renamed from: b */
        public void mo31b(abg abg) throws IOException {
            abg.m207g(this.f308a, 2);
            abg.m209k(m412c());
            mo29a(abg);
            for (C0055j b : this.f309b) {
                b.mo31b(abg);
            }
        }

        /* renamed from: a */
        public int mo28a() {
            return 0;
        }

        /* renamed from: a */
        public void mo29a(abg abg) throws IOException {
        }
    }

    /* compiled from: NativeCrashWriter */
    /* renamed from: acb$a */
    static final class C0056a extends C0055j {
        public C0056a(C0061f c0061f, C0065k c0065k) {
            super(3, c0061f, c0065k);
        }
    }

    /* compiled from: NativeCrashWriter */
    /* renamed from: acb$b */
    static final class C0057b extends C0055j {
        /* renamed from: a */
        private final long f310a;
        /* renamed from: b */
        private final long f311b;
        /* renamed from: c */
        private final String f312c;
        /* renamed from: d */
        private final String f313d;

        public C0057b(acr acr) {
            super(4, new C0055j[0]);
            this.f310a = acr.f379a;
            this.f311b = acr.f380b;
            this.f312c = acr.f381c;
            this.f313d = acr.f382d;
        }

        /* renamed from: a */
        public int mo28a() {
            int b = abg.m169b(1, this.f310a);
            return ((b + abg.m170b(3, abd.m153a(this.f312c))) + abg.m169b(2, this.f311b)) + abg.m170b(4, abd.m153a(this.f313d));
        }

        /* renamed from: a */
        public void mo29a(abg abg) throws IOException {
            abg.m191a(1, this.f310a);
            abg.m191a(2, this.f311b);
            abg.m192a(3, abd.m153a(this.f312c));
            abg.m192a(4, abd.m153a(this.f313d));
        }
    }

    /* compiled from: NativeCrashWriter */
    /* renamed from: acb$c */
    static final class C0058c extends C0055j {
        /* renamed from: a */
        private final String f314a;
        /* renamed from: b */
        private final String f315b;

        public C0058c(acs acs) {
            super(2, new C0055j[0]);
            this.f314a = acs.f383a;
            this.f315b = acs.f384b;
        }

        /* renamed from: a */
        public int mo28a() {
            return abg.m170b(2, abd.m153a(this.f315b == null ? "" : this.f315b)) + abg.m170b(1, abd.m153a(this.f314a));
        }

        /* renamed from: a */
        public void mo29a(abg abg) throws IOException {
            abg.m192a(1, abd.m153a(this.f314a));
            abg.m192a(2, abd.m153a(this.f315b == null ? "" : this.f315b));
        }
    }

    /* compiled from: NativeCrashWriter */
    /* renamed from: acb$d */
    static final class C0059d extends C0055j {
        /* renamed from: a */
        private final float f316a;
        /* renamed from: b */
        private final int f317b;
        /* renamed from: c */
        private final boolean f318c;
        /* renamed from: d */
        private final int f319d;
        /* renamed from: e */
        private final long f320e;
        /* renamed from: f */
        private final long f321f;

        public C0059d(float f, int i, boolean z, int i2, long j, long j2) {
            super(5, new C0055j[0]);
            this.f316a = f;
            this.f317b = i;
            this.f318c = z;
            this.f319d = i2;
            this.f320e = j;
            this.f321f = j2;
        }

        /* renamed from: a */
        public int mo28a() {
            return (((((0 + abg.m168b(1, this.f316a)) + abg.m180f(2, this.f317b)) + abg.m171b(3, this.f318c)) + abg.m175d(4, this.f319d)) + abg.m169b(5, this.f320e)) + abg.m169b(6, this.f321f);
        }

        /* renamed from: a */
        public void mo29a(abg abg) throws IOException {
            abg.m189a(1, this.f316a);
            abg.m203c(2, this.f317b);
            abg.m193a(3, this.f318c);
            abg.m190a(4, this.f319d);
            abg.m191a(5, this.f320e);
            abg.m191a(6, this.f321f);
        }
    }

    /* compiled from: NativeCrashWriter */
    /* renamed from: acb$e */
    static final class C0060e extends C0055j {
        /* renamed from: a */
        private final long f322a;
        /* renamed from: b */
        private final String f323b;

        public C0060e(long j, String str, C0055j... c0055jArr) {
            super(10, c0055jArr);
            this.f322a = j;
            this.f323b = str;
        }

        /* renamed from: a */
        public int mo28a() {
            return abg.m169b(1, this.f322a) + abg.m170b(2, abd.m153a(this.f323b));
        }

        /* renamed from: a */
        public void mo29a(abg abg) throws IOException {
            abg.m191a(1, this.f322a);
            abg.m192a(2, abd.m153a(this.f323b));
        }
    }

    /* compiled from: NativeCrashWriter */
    /* renamed from: acb$f */
    static final class C0061f extends C0055j {
        public C0061f(C0066l c0066l, C0065k c0065k, C0065k c0065k2) {
            super(1, c0065k, c0066l, c0065k2);
        }
    }

    /* compiled from: NativeCrashWriter */
    /* renamed from: acb$g */
    static final class C0062g extends C0055j {
        /* renamed from: a */
        private final long f324a;
        /* renamed from: b */
        private final String f325b;
        /* renamed from: c */
        private final String f326c;
        /* renamed from: d */
        private final long f327d;
        /* renamed from: e */
        private final int f328e;

        public C0062g(C0072a c0072a) {
            super(3, new C0055j[0]);
            this.f324a = c0072a.f402a;
            this.f325b = c0072a.f403b;
            this.f326c = c0072a.f404c;
            this.f327d = c0072a.f405d;
            this.f328e = c0072a.f406e;
        }

        /* renamed from: a */
        public int mo28a() {
            return (((abg.m169b(1, this.f324a) + abg.m170b(2, abd.m153a(this.f325b))) + abg.m170b(3, abd.m153a(this.f326c))) + abg.m169b(4, this.f327d)) + abg.m175d(5, this.f328e);
        }

        /* renamed from: a */
        public void mo29a(abg abg) throws IOException {
            abg.m191a(1, this.f324a);
            abg.m192a(2, abd.m153a(this.f325b));
            abg.m192a(3, abd.m153a(this.f326c));
            abg.m191a(4, this.f327d);
            abg.m190a(5, this.f328e);
        }
    }

    /* compiled from: NativeCrashWriter */
    /* renamed from: acb$h */
    static final class C0063h extends C0055j {
        /* renamed from: a */
        abd f329a;

        public C0063h(abd abd) {
            super(6, new C0055j[0]);
            this.f329a = abd;
        }

        /* renamed from: a */
        public int mo28a() {
            return abg.m170b(1, this.f329a);
        }

        /* renamed from: a */
        public void mo29a(abg abg) throws IOException {
            abg.m192a(1, this.f329a);
        }
    }

    /* compiled from: NativeCrashWriter */
    /* renamed from: acb$i */
    static final class C0064i extends C0055j {
        public C0064i() {
            super(0, new C0055j[0]);
        }

        /* renamed from: b */
        public void mo31b(abg abg) throws IOException {
        }

        /* renamed from: b */
        public int mo30b() {
            return 0;
        }
    }

    /* compiled from: NativeCrashWriter */
    /* renamed from: acb$k */
    static final class C0065k extends C0055j {
        /* renamed from: a */
        private final C0055j[] f330a;

        public C0065k(C0055j... c0055jArr) {
            super(0, new C0055j[0]);
            this.f330a = c0055jArr;
        }

        /* renamed from: b */
        public void mo31b(abg abg) throws IOException {
            for (C0055j b : this.f330a) {
                b.mo31b(abg);
            }
        }

        /* renamed from: b */
        public int mo30b() {
            int i = 0;
            C0055j[] c0055jArr = this.f330a;
            int i2 = 0;
            while (i < c0055jArr.length) {
                i2 += c0055jArr[i].mo30b();
                i++;
            }
            return i2;
        }
    }

    /* compiled from: NativeCrashWriter */
    /* renamed from: acb$l */
    static final class C0066l extends C0055j {
        /* renamed from: a */
        private final String f331a;
        /* renamed from: b */
        private final String f332b;
        /* renamed from: c */
        private final long f333c;

        public C0066l(acv acv) {
            super(3, new C0055j[0]);
            this.f331a = acv.f399a;
            this.f332b = acv.f400b;
            this.f333c = acv.f401c;
        }

        /* renamed from: a */
        public int mo28a() {
            return (abg.m170b(1, abd.m153a(this.f331a)) + abg.m170b(2, abd.m153a(this.f332b))) + abg.m169b(3, this.f333c);
        }

        /* renamed from: a */
        public void mo29a(abg abg) throws IOException {
            abg.m192a(1, abd.m153a(this.f331a));
            abg.m192a(2, abd.m153a(this.f332b));
            abg.m191a(3, this.f333c);
        }
    }

    /* compiled from: NativeCrashWriter */
    /* renamed from: acb$m */
    static final class C0067m extends C0055j {
        /* renamed from: a */
        private final String f334a;
        /* renamed from: b */
        private final int f335b;

        public C0067m(acw acw, C0065k c0065k) {
            super(1, c0065k);
            this.f334a = acw.f407a;
            this.f335b = acw.f408b;
        }

        /* renamed from: a */
        public int mo28a() {
            return (m431d() ? abg.m170b(1, abd.m153a(this.f334a)) : 0) + abg.m175d(2, this.f335b);
        }

        /* renamed from: a */
        public void mo29a(abg abg) throws IOException {
            if (m431d()) {
                abg.m192a(1, abd.m153a(this.f334a));
            }
            abg.m190a(2, this.f335b);
        }

        /* renamed from: d */
        private boolean m431d() {
            return this.f334a != null && this.f334a.length() > 0;
        }
    }

    /* renamed from: a */
    private static C0060e m434a(acu acu, abw abw, Map<String, String> map) throws IOException {
        C0056a c0056a = new C0056a(new C0061f(new C0066l(acu.f394b != null ? acu.f394b : f336a), acb.m439a(acu.f395c), acb.m436a(acu.f396d)), acb.m437a(acb.m442a(acu.f397e, map)));
        C0055j a = acb.m435a(acu.f398f);
        abd a2 = abw.m387a();
        if (a2 == null) {
            Fabric.h().a("CrashlyticsCore", "No log data to include with this event.");
        }
        abw.m391b();
        C0063h c0063h = a2 != null ? new C0063h(a2) : new C0064i();
        return new C0060e(acu.f393a, "ndk-crash", c0056a, a, c0063h);
    }

    /* renamed from: a */
    private static acs[] m442a(acs[] acsArr, Map<String, String> map) {
        int i;
        Map treeMap = new TreeMap(map);
        if (acsArr != null) {
            for (acs acs : acsArr) {
                treeMap.put(acs.f383a, acs.f384b);
            }
        }
        Entry[] entryArr = (Entry[]) treeMap.entrySet().toArray(new Entry[treeMap.size()]);
        acs[] acsArr2 = new acs[entryArr.length];
        for (i = 0; i < acsArr2.length; i++) {
            acsArr2[i] = new acs((String) entryArr[i].getKey(), (String) entryArr[i].getValue());
        }
        return acsArr2;
    }

    /* renamed from: a */
    private static C0055j m435a(act act) {
        if (act == null) {
            return new C0064i();
        }
        return new C0059d(((float) act.f390f) / 100.0f, act.f391g, act.f392h, act.f385a, act.f386b - act.f388d, act.f387c - act.f389e);
    }

    /* renamed from: a */
    private static C0065k m439a(acw[] acwArr) {
        C0055j[] c0055jArr = acwArr != null ? new C0067m[acwArr.length] : f338c;
        for (int i = 0; i < c0055jArr.length; i++) {
            acw acw = acwArr[i];
            c0055jArr[i] = new C0067m(acw, acb.m438a(acw.f409c));
        }
        return new C0065k(c0055jArr);
    }

    /* renamed from: a */
    private static C0065k m438a(C0072a[] c0072aArr) {
        C0055j[] c0055jArr = c0072aArr != null ? new C0062g[c0072aArr.length] : f339d;
        for (int i = 0; i < c0055jArr.length; i++) {
            c0055jArr[i] = new C0062g(c0072aArr[i]);
        }
        return new C0065k(c0055jArr);
    }

    /* renamed from: a */
    private static C0065k m436a(acr[] acrArr) {
        C0055j[] c0055jArr = acrArr != null ? new C0057b[acrArr.length] : f340e;
        for (int i = 0; i < c0055jArr.length; i++) {
            c0055jArr[i] = new C0057b(acrArr[i]);
        }
        return new C0065k(c0055jArr);
    }

    /* renamed from: a */
    private static C0065k m437a(acs[] acsArr) {
        C0055j[] c0055jArr = acsArr != null ? new C0058c[acsArr.length] : f341f;
        for (int i = 0; i < c0055jArr.length; i++) {
            c0055jArr[i] = new C0058c(acsArr[i]);
        }
        return new C0065k(c0055jArr);
    }

    /* renamed from: a */
    public static void m440a(acu acu, abw abw, Map<String, String> map, abg abg) throws IOException {
        acb.m434a(acu, abw, map).mo31b(abg);
    }
}
