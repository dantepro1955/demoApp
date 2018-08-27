package com.p000;

import android.net.Uri;
import android.os.SystemClock;
import android.util.SparseArray;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import p000.ads.C0108a;
import p000.agx.C0123c;
import p000.agx.C0128a;

/* compiled from: ExtractorSampleSource */
/* renamed from: aej */
public final class aej implements ads, C0108a, aei, C0128a {
    /* renamed from: a */
    private static final List<Class<? extends aeg>> f772a = new ArrayList();
    /* renamed from: A */
    private C0124a f773A;
    /* renamed from: B */
    private IOException f774B;
    /* renamed from: C */
    private int f775C;
    /* renamed from: D */
    private long f776D;
    /* renamed from: E */
    private boolean f777E;
    /* renamed from: F */
    private int f778F;
    /* renamed from: G */
    private int f779G;
    /* renamed from: b */
    private final C0125b f780b;
    /* renamed from: c */
    private final agl f781c;
    /* renamed from: d */
    private final int f782d;
    /* renamed from: e */
    private final SparseArray<C0126c> f783e;
    /* renamed from: f */
    private final int f784f;
    /* renamed from: g */
    private final Uri f785g;
    /* renamed from: h */
    private final agp f786h;
    /* renamed from: i */
    private volatile boolean f787i;
    /* renamed from: j */
    private volatile aeo f788j;
    /* renamed from: k */
    private volatile aea f789k;
    /* renamed from: l */
    private boolean f790l;
    /* renamed from: m */
    private int f791m;
    /* renamed from: n */
    private ado[] f792n;
    /* renamed from: o */
    private long f793o;
    /* renamed from: p */
    private boolean[] f794p;
    /* renamed from: q */
    private boolean[] f795q;
    /* renamed from: r */
    private boolean[] f796r;
    /* renamed from: s */
    private int f797s;
    /* renamed from: t */
    private long f798t;
    /* renamed from: u */
    private long f799u;
    /* renamed from: v */
    private long f800v;
    /* renamed from: w */
    private boolean f801w;
    /* renamed from: x */
    private long f802x;
    /* renamed from: y */
    private long f803y;
    /* renamed from: z */
    private agx f804z;

    /* compiled from: ExtractorSampleSource */
    /* renamed from: aej$a */
    static class C0124a implements C0123c {
        /* renamed from: a */
        private final Uri f760a;
        /* renamed from: b */
        private final agp f761b;
        /* renamed from: c */
        private final C0125b f762c;
        /* renamed from: d */
        private final agl f763d;
        /* renamed from: e */
        private final int f764e;
        /* renamed from: f */
        private final aem f765f = new aem();
        /* renamed from: g */
        private volatile boolean f766g;
        /* renamed from: h */
        private boolean f767h;

        public C0124a(Uri uri, agp agp, C0125b c0125b, agl agl, int i, long j) {
            this.f760a = (Uri) ahb.m1512a((Object) uri);
            this.f761b = (agp) ahb.m1512a((Object) agp);
            this.f762c = (C0125b) ahb.m1512a((Object) c0125b);
            this.f763d = (agl) ahb.m1512a((Object) agl);
            this.f764e = i;
            this.f765f.f853a = j;
            this.f767h = true;
        }

        /* renamed from: a */
        public void mo128a() {
            this.f766g = true;
        }

        /* renamed from: b */
        public boolean mo129b() {
            return this.f766g;
        }

        /* renamed from: c */
        public void mo130c() throws IOException, InterruptedException {
            int i;
            aeh aeh;
            Throwable th;
            int i2 = 0;
            while (i2 == 0 && !this.f766g) {
                try {
                    long j = this.f765f.f853a;
                    long open = this.f761b.open(new agq(this.f760a, j, -1, null));
                    if (open != -1) {
                        open += j;
                    }
                    aeh aed = new aed(this.f761b, j, open);
                    try {
                        int i3;
                        aeg a = this.f762c.m1005a(aed);
                        if (this.f767h) {
                            a.mo156b();
                            this.f767h = false;
                        }
                        int i4 = i2;
                        while (i4 == 0) {
                            try {
                                if (this.f766g) {
                                    break;
                                }
                                this.f763d.mo187b(this.f764e);
                                i4 = a.mo153a(aed, this.f765f);
                            } catch (Throwable th2) {
                                Throwable th3 = th2;
                                i = i4;
                                aeh = aed;
                                th = th3;
                            }
                        }
                        if (i4 == 1) {
                            i3 = 0;
                        } else {
                            if (aed != null) {
                                this.f765f.f853a = aed.mo120c();
                            }
                            i3 = i4;
                        }
                        this.f761b.close();
                        i2 = i3;
                    } catch (Throwable th4) {
                        i = i2;
                        aeh aeh2 = aed;
                        th = th4;
                        aeh = aeh2;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    aeh = null;
                    i = i2;
                }
            }
            return;
            if (!(i == 1 || aeh == null)) {
                this.f765f.f853a = aeh.mo120c();
            }
            this.f761b.close();
            throw th;
        }
    }

    /* compiled from: ExtractorSampleSource */
    /* renamed from: aej$b */
    static final class C0125b {
        /* renamed from: a */
        private final aeg[] f768a;
        /* renamed from: b */
        private final aei f769b;
        /* renamed from: c */
        private aeg f770c;

        public C0125b(aeg[] aegArr, aei aei) {
            this.f768a = aegArr;
            this.f769b = aei;
        }

        /* renamed from: a */
        public aeg m1005a(aeh aeh) throws C0127d, IOException, InterruptedException {
            if (this.f770c != null) {
                return this.f770c;
            }
            aeg[] aegArr = this.f768a;
            int length = aegArr.length;
            int i = 0;
            while (i < length) {
                aeg aeg = aegArr[i];
                try {
                    if (aeg.mo155a(aeh)) {
                        this.f770c = aeg;
                        break;
                    }
                    aeh.mo114a();
                    i++;
                } catch (EOFException e) {
                }
            }
            if (this.f770c == null) {
                throw new C0127d(this.f768a);
            }
            this.f770c.mo154a(this.f769b);
            return this.f770c;
        }
    }

    /* compiled from: ExtractorSampleSource */
    /* renamed from: aej$c */
    class C0126c extends aee {
        /* renamed from: a */
        final /* synthetic */ aej f771a;

        public C0126c(aej aej, agl agl) {
            this.f771a = aej;
            super(agl);
        }

        /* renamed from: a */
        public void mo125a(long j, int i, int i2, int i3, byte[] bArr) {
            super.mo125a(j, i, i2, i3, bArr);
            this.f771a.f778F = this.f771a.f778F + 1;
        }
    }

    /* compiled from: ExtractorSampleSource */
    /* renamed from: aej$d */
    public static final class C0127d extends adq {
        public C0127d(aeg[] aegArr) {
            super("None of the available extractors (" + ahr.m1596a((Object[]) aegArr) + ") could read the stream.");
        }
    }

    static {
        try {
            f772a.add(Class.forName("agf").asSubclass(aeg.class));
        } catch (ClassNotFoundException e) {
        }
        try {
            f772a.add(Class.forName("afd").asSubclass(aeg.class));
        } catch (ClassNotFoundException e2) {
        }
        try {
            f772a.add(Class.forName("afe").asSubclass(aeg.class));
        } catch (ClassNotFoundException e3) {
        }
        try {
            f772a.add(Class.forName("aex").asSubclass(aeg.class));
        } catch (ClassNotFoundException e4) {
        }
        try {
            f772a.add(Class.forName("afm").asSubclass(aeg.class));
        } catch (ClassNotFoundException e5) {
        }
        try {
            f772a.add(Class.forName("afz").asSubclass(aeg.class));
        } catch (ClassNotFoundException e6) {
        }
        try {
            f772a.add(Class.forName("aer").asSubclass(aeg.class));
        } catch (ClassNotFoundException e7) {
        }
        try {
            f772a.add(Class.forName("afw").asSubclass(aeg.class));
        } catch (ClassNotFoundException e8) {
        }
    }

    public aej(Uri uri, agp agp, agl agl, int i, aeg... aegArr) {
        this(uri, agp, agl, i, -1, aegArr);
    }

    public aej(Uri uri, agp agp, agl agl, int i, int i2, aeg... aegArr) {
        this.f785g = uri;
        this.f786h = agp;
        this.f781c = agl;
        this.f782d = i;
        this.f784f = i2;
        if (aegArr == null || aegArr.length == 0) {
            aegArr = new aeg[f772a.size()];
            int i3 = 0;
            while (i3 < aegArr.length) {
                try {
                    aegArr[i3] = (aeg) ((Class) f772a.get(i3)).newInstance();
                    i3++;
                } catch (Throwable e) {
                    throw new IllegalStateException("Unexpected error creating default extractor", e);
                } catch (Throwable e2) {
                    throw new IllegalStateException("Unexpected error creating default extractor", e2);
                }
            }
        }
        this.f780b = new C0125b(aegArr, this);
        this.f783e = new SparseArray();
        this.f800v = Long.MIN_VALUE;
    }

    /* renamed from: a */
    public C0108a mo133a() {
        this.f797s++;
        return this;
    }

    /* renamed from: a */
    public boolean mo139a(long j) {
        if (this.f790l) {
            return true;
        }
        if (this.f804z == null) {
            this.f804z = new agx("Loader:ExtractorSampleSource");
        }
        m1015g();
        if (this.f788j == null || !this.f787i || !m1017i()) {
            return false;
        }
        int size = this.f783e.size();
        this.f796r = new boolean[size];
        this.f795q = new boolean[size];
        this.f794p = new boolean[size];
        this.f792n = new ado[size];
        this.f793o = -1;
        for (int i = 0; i < size; i++) {
            ado c = ((C0126c) this.f783e.valueAt(i)).m984c();
            this.f792n[i] = c;
            if (c.f624e != -1 && c.f624e > this.f793o) {
                this.f793o = c.f624e;
            }
        }
        this.f790l = true;
        return true;
    }

    /* renamed from: c */
    public int mo145c() {
        return this.f783e.size();
    }

    /* renamed from: a */
    public ado mo132a(int i) {
        ahb.m1516b(this.f790l);
        return this.f792n[i];
    }

    /* renamed from: a */
    public void mo134a(int i, long j) {
        ahb.m1516b(this.f790l);
        ahb.m1516b(!this.f796r[i]);
        this.f791m++;
        this.f796r[i] = true;
        this.f794p[i] = true;
        this.f795q[i] = false;
        if (this.f791m == 1) {
            if (!this.f788j.mo110a()) {
                j = 0;
            }
            this.f798t = j;
            this.f799u = j;
            m1011c(j);
        }
    }

    /* renamed from: c */
    public void mo146c(int i) {
        ahb.m1516b(this.f790l);
        ahb.m1516b(this.f796r[i]);
        this.f791m--;
        this.f796r[i] = false;
        if (this.f791m == 0) {
            this.f798t = Long.MIN_VALUE;
            if (this.f804z.m1497a()) {
                this.f804z.m1498b();
                return;
            }
            m1018j();
            this.f781c.mo184a(0);
        }
    }

    /* renamed from: b */
    public boolean mo144b(int i, long j) {
        ahb.m1516b(this.f790l);
        ahb.m1516b(this.f796r[i]);
        this.f798t = j;
        m1013e(this.f798t);
        if (this.f777E) {
            return true;
        }
        m1015g();
        if (m1019k()) {
            return false;
        }
        return !((C0126c) this.f783e.valueAt(i)).m986e();
    }

    /* renamed from: b */
    public long mo140b(int i) {
        if (!this.f795q[i]) {
            return Long.MIN_VALUE;
        }
        this.f795q[i] = false;
        return this.f799u;
    }

    /* renamed from: a */
    public int mo131a(int i, long j, adp adp, adr adr) {
        this.f798t = j;
        if (this.f795q[i] || m1019k()) {
            return -2;
        }
        C0126c c0126c = (C0126c) this.f783e.valueAt(i);
        if (this.f794p[i]) {
            adp.f641a = c0126c.m984c();
            adp.f642b = this.f789k;
            this.f794p[i] = false;
            return -4;
        } else if (!c0126c.m981a(adr)) {
            return this.f777E ? -1 : -2;
        } else {
            int i2;
            boolean z = adr.f647e < this.f799u;
            int i3 = adr.f646d;
            if (z) {
                i2 = 134217728;
            } else {
                i2 = 0;
            }
            adr.f646d = i2 | i3;
            if (this.f801w) {
                this.f803y = this.f802x - adr.f647e;
                this.f801w = false;
            }
            adr.f647e += this.f803y;
            return -3;
        }
    }

    /* renamed from: b */
    public void mo141b() throws IOException {
        if (this.f774B != null) {
            if (m1020l()) {
                throw this.f774B;
            }
            int i = this.f784f != -1 ? this.f784f : (this.f788j == null || this.f788j.mo110a()) ? 3 : 6;
            if (this.f775C > i) {
                throw this.f774B;
            }
        }
    }

    /* renamed from: b */
    public void mo142b(long j) {
        int i = 0;
        ahb.m1516b(this.f790l);
        ahb.m1516b(this.f791m > 0);
        if (!this.f788j.mo110a()) {
            j = 0;
        }
        long j2 = m1019k() ? this.f800v : this.f798t;
        this.f798t = j;
        this.f799u = j;
        if (j2 != j) {
            boolean z;
            if (m1019k()) {
                z = false;
            } else {
                z = true;
            }
            int i2 = 0;
            int i3 = z;
            while (i3 != 0 && i2 < this.f783e.size()) {
                i3 &= ((C0126c) this.f783e.valueAt(i2)).m983b(j);
                i2++;
            }
            if (i3 == 0) {
                m1011c(j);
            }
            while (i < this.f795q.length) {
                this.f795q[i] = true;
                i++;
            }
        }
    }

    /* renamed from: d */
    public long mo147d() {
        if (this.f777E) {
            return -3;
        }
        if (m1019k()) {
            return this.f800v;
        }
        long j = Long.MIN_VALUE;
        for (int i = 0; i < this.f783e.size(); i++) {
            j = Math.max(j, ((C0126c) this.f783e.valueAt(i)).m985d());
        }
        return j == Long.MIN_VALUE ? this.f798t : j;
    }

    /* renamed from: e */
    public void mo149e() {
        ahb.m1516b(this.f797s > 0);
        int i = this.f797s - 1;
        this.f797s = i;
        if (i == 0 && this.f804z != null) {
            this.f804z.m1499c();
            this.f804z = null;
        }
    }

    /* renamed from: a */
    public void mo137a(C0123c c0123c) {
        this.f777E = true;
    }

    /* renamed from: b */
    public void mo143b(C0123c c0123c) {
        if (this.f791m > 0) {
            m1011c(this.f800v);
            return;
        }
        m1018j();
        this.f781c.mo184a(0);
    }

    /* renamed from: a */
    public void mo138a(C0123c c0123c, IOException iOException) {
        this.f774B = iOException;
        this.f775C = this.f778F > this.f779G ? 1 : this.f775C + 1;
        this.f776D = SystemClock.elapsedRealtime();
        m1015g();
    }

    /* renamed from: d */
    public aep mo148d(int i) {
        C0126c c0126c = (C0126c) this.f783e.get(i);
        if (c0126c != null) {
            return c0126c;
        }
        aep c0126c2 = new C0126c(this, this.f781c);
        this.f783e.put(i, c0126c2);
        return c0126c2;
    }

    /* renamed from: f */
    public void mo150f() {
        this.f787i = true;
    }

    /* renamed from: a */
    public void mo136a(aeo aeo) {
        this.f788j = aeo;
    }

    /* renamed from: a */
    public void mo135a(aea aea) {
        this.f789k = aea;
    }

    /* renamed from: c */
    private void m1011c(long j) {
        this.f800v = j;
        this.f777E = false;
        if (this.f804z.m1497a()) {
            this.f804z.m1498b();
            return;
        }
        m1018j();
        m1015g();
    }

    /* renamed from: g */
    private void m1015g() {
        int i = 0;
        if (!this.f777E && !this.f804z.m1497a()) {
            if (this.f774B == null) {
                this.f803y = 0;
                this.f801w = false;
                if (this.f790l) {
                    ahb.m1516b(m1019k());
                    if (this.f793o == -1 || this.f800v < this.f793o) {
                        this.f773A = m1012d(this.f800v);
                        this.f800v = Long.MIN_VALUE;
                    } else {
                        this.f777E = true;
                        this.f800v = Long.MIN_VALUE;
                        return;
                    }
                }
                this.f773A = m1016h();
                this.f779G = this.f778F;
                this.f804z.m1495a(this.f773A, (C0128a) this);
            } else if (!m1020l()) {
                ahb.m1516b(this.f773A != null);
                if (SystemClock.elapsedRealtime() - this.f776D >= m1014f((long) this.f775C)) {
                    this.f774B = null;
                    if (!this.f790l) {
                        while (i < this.f783e.size()) {
                            ((C0126c) this.f783e.valueAt(i)).m976a();
                            i++;
                        }
                        this.f773A = m1016h();
                    } else if (!this.f788j.mo110a() && this.f793o == -1) {
                        while (i < this.f783e.size()) {
                            ((C0126c) this.f783e.valueAt(i)).m976a();
                            i++;
                        }
                        this.f773A = m1016h();
                        this.f802x = this.f798t;
                        this.f801w = true;
                    }
                    this.f779G = this.f778F;
                    this.f804z.m1495a(this.f773A, (C0128a) this);
                }
            }
        }
    }

    /* renamed from: h */
    private C0124a m1016h() {
        return new C0124a(this.f785g, this.f786h, this.f780b, this.f781c, this.f782d, 0);
    }

    /* renamed from: d */
    private C0124a m1012d(long j) {
        return new C0124a(this.f785g, this.f786h, this.f780b, this.f781c, this.f782d, this.f788j.mo111b(j));
    }

    /* renamed from: i */
    private boolean m1017i() {
        for (int i = 0; i < this.f783e.size(); i++) {
            if (!((C0126c) this.f783e.valueAt(i)).m982b()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: e */
    private void m1013e(long j) {
        for (int i = 0; i < this.f796r.length; i++) {
            if (!this.f796r[i]) {
                ((C0126c) this.f783e.valueAt(i)).m977a(j);
            }
        }
    }

    /* renamed from: j */
    private void m1018j() {
        for (int i = 0; i < this.f783e.size(); i++) {
            ((C0126c) this.f783e.valueAt(i)).m976a();
        }
        this.f773A = null;
        this.f774B = null;
        this.f775C = 0;
    }

    /* renamed from: k */
    private boolean m1019k() {
        return this.f800v != Long.MIN_VALUE;
    }

    /* renamed from: l */
    private boolean m1020l() {
        return this.f774B instanceof C0127d;
    }

    /* renamed from: f */
    private long m1014f(long j) {
        return Math.min((j - 1) * 1000, 5000);
    }
}
