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

/* compiled from: ExtractorSampleSourceFix */
/* renamed from: aek */
public final class aek implements ads, C0108a, aei, C0128a {
    /* renamed from: a */
    private static final List<Class<? extends aeg>> f817a = new ArrayList();
    /* renamed from: A */
    private C0129a f818A;
    /* renamed from: B */
    private IOException f819B;
    /* renamed from: C */
    private int f820C;
    /* renamed from: D */
    private long f821D;
    /* renamed from: E */
    private boolean f822E;
    /* renamed from: F */
    private int f823F;
    /* renamed from: G */
    private int f824G;
    /* renamed from: b */
    private final C0130b f825b;
    /* renamed from: c */
    private final agl f826c;
    /* renamed from: d */
    private final int f827d;
    /* renamed from: e */
    private final SparseArray<C0131c> f828e;
    /* renamed from: f */
    private final int f829f;
    /* renamed from: g */
    private final Uri f830g;
    /* renamed from: h */
    private final agp f831h;
    /* renamed from: i */
    private volatile boolean f832i;
    /* renamed from: j */
    private volatile aeo f833j;
    /* renamed from: k */
    private volatile aea f834k;
    /* renamed from: l */
    private boolean f835l;
    /* renamed from: m */
    private int f836m;
    /* renamed from: n */
    private ado[] f837n;
    /* renamed from: o */
    private long f838o;
    /* renamed from: p */
    private boolean[] f839p;
    /* renamed from: q */
    private boolean[] f840q;
    /* renamed from: r */
    private boolean[] f841r;
    /* renamed from: s */
    private int f842s;
    /* renamed from: t */
    private long f843t;
    /* renamed from: u */
    private long f844u;
    /* renamed from: v */
    private long f845v;
    /* renamed from: w */
    private boolean f846w;
    /* renamed from: x */
    private long f847x;
    /* renamed from: y */
    private long f848y;
    /* renamed from: z */
    private agx f849z;

    /* compiled from: ExtractorSampleSourceFix */
    /* renamed from: aek$a */
    static class C0129a implements C0123c {
        /* renamed from: a */
        private final Uri f805a;
        /* renamed from: b */
        private final agp f806b;
        /* renamed from: c */
        private final C0130b f807c;
        /* renamed from: d */
        private final agl f808d;
        /* renamed from: e */
        private final int f809e;
        /* renamed from: f */
        private final aem f810f = new aem();
        /* renamed from: g */
        private volatile boolean f811g;
        /* renamed from: h */
        private boolean f812h;

        public C0129a(Uri uri, agp agp, C0130b c0130b, agl agl, int i, long j) {
            this.f805a = (Uri) ahb.m1512a((Object) uri);
            this.f806b = (agp) ahb.m1512a((Object) agp);
            this.f807c = (C0130b) ahb.m1512a((Object) c0130b);
            this.f808d = (agl) ahb.m1512a((Object) agl);
            this.f809e = i;
            this.f810f.f853a = j;
            this.f812h = true;
        }

        /* renamed from: a */
        public void mo128a() {
            this.f811g = true;
        }

        /* renamed from: b */
        public boolean mo129b() {
            return this.f811g;
        }

        /* renamed from: c */
        public void mo130c() throws IOException, InterruptedException {
            int i;
            aeh aeh;
            Throwable th;
            int i2 = 0;
            while (i2 == 0 && !this.f811g) {
                try {
                    long j = this.f810f.f853a;
                    long open = this.f806b.open(new agq(this.f805a, j, -1, null));
                    if (open != -1) {
                        open += j;
                    }
                    aeh aed = new aed(this.f806b, j, open);
                    try {
                        int i3;
                        aeg a = this.f807c.m1044a(aed);
                        if (this.f812h) {
                            a.mo156b();
                            this.f812h = false;
                        }
                        int i4 = i2;
                        while (i4 == 0) {
                            try {
                                if (this.f811g) {
                                    break;
                                }
                                this.f808d.mo187b(this.f809e);
                                i4 = a.mo153a(aed, this.f810f);
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
                                this.f810f.f853a = aed.mo120c();
                            }
                            i3 = i4;
                        }
                        this.f806b.close();
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
                this.f810f.f853a = aeh.mo120c();
            }
            this.f806b.close();
            throw th;
        }
    }

    /* compiled from: ExtractorSampleSourceFix */
    /* renamed from: aek$b */
    static final class C0130b {
        /* renamed from: a */
        private final aeg[] f813a;
        /* renamed from: b */
        private final aei f814b;
        /* renamed from: c */
        private aeg f815c;

        public C0130b(aeg[] aegArr, aei aei) {
            this.f813a = aegArr;
            this.f814b = aei;
        }

        /* renamed from: a */
        public aeg m1044a(aeh aeh) throws C0132d, IOException, InterruptedException {
            if (this.f815c != null) {
                return this.f815c;
            }
            aeg[] aegArr = this.f813a;
            int length = aegArr.length;
            int i = 0;
            while (i < length) {
                aeg aeg = aegArr[i];
                try {
                    if (aeg.mo155a(aeh)) {
                        this.f815c = aeg;
                        break;
                    }
                    aeh.mo114a();
                    i++;
                } catch (EOFException e) {
                }
            }
            if (this.f815c == null) {
                throw new C0132d(this.f813a);
            }
            this.f815c.mo154a(this.f814b);
            return this.f815c;
        }
    }

    /* compiled from: ExtractorSampleSourceFix */
    /* renamed from: aek$c */
    class C0131c extends aee {
        /* renamed from: a */
        final /* synthetic */ aek f816a;

        public C0131c(aek aek, agl agl) {
            this.f816a = aek;
            super(agl);
        }

        /* renamed from: a */
        public void mo125a(long j, int i, int i2, int i3, byte[] bArr) {
            super.mo125a(j, i, i2, i3, bArr);
            this.f816a.f823F = this.f816a.f823F + 1;
        }
    }

    /* compiled from: ExtractorSampleSourceFix */
    /* renamed from: aek$d */
    public static final class C0132d extends adq {
        public C0132d(aeg[] aegArr) {
            super("None of the available extractors (" + ahr.m1596a((Object[]) aegArr) + ") could read the stream.");
        }
    }

    static {
        try {
            f817a.add(Class.forName("agf").asSubclass(aeg.class));
        } catch (ClassNotFoundException e) {
        }
        try {
            f817a.add(Class.forName("afd").asSubclass(aeg.class));
        } catch (ClassNotFoundException e2) {
        }
        try {
            f817a.add(Class.forName("afe").asSubclass(aeg.class));
        } catch (ClassNotFoundException e3) {
        }
        try {
            f817a.add(Class.forName("aex").asSubclass(aeg.class));
        } catch (ClassNotFoundException e4) {
        }
        try {
            f817a.add(Class.forName("afm").asSubclass(aeg.class));
        } catch (ClassNotFoundException e5) {
        }
        try {
            f817a.add(Class.forName("afz").asSubclass(aeg.class));
        } catch (ClassNotFoundException e6) {
        }
        try {
            f817a.add(Class.forName("aer").asSubclass(aeg.class));
        } catch (ClassNotFoundException e7) {
        }
        try {
            f817a.add(Class.forName("afw").asSubclass(aeg.class));
        } catch (ClassNotFoundException e8) {
        }
    }

    public aek(Uri uri, agp agp, agl agl, int i, aeg... aegArr) {
        this(uri, agp, agl, i, -1, aegArr);
    }

    public aek(Uri uri, agp agp, agl agl, int i, int i2, aeg... aegArr) {
        this.f830g = uri;
        this.f831h = agp;
        this.f826c = agl;
        this.f827d = i;
        this.f829f = i2;
        if (aegArr == null || aegArr.length == 0) {
            aegArr = new aeg[f817a.size()];
            int i3 = 0;
            while (i3 < aegArr.length) {
                try {
                    aegArr[i3] = (aeg) ((Class) f817a.get(i3)).newInstance();
                    i3++;
                } catch (Throwable e) {
                    throw new IllegalStateException("Unexpected error creating default extractor", e);
                } catch (Throwable e2) {
                    throw new IllegalStateException("Unexpected error creating default extractor", e2);
                }
            }
        }
        this.f825b = new C0130b(aegArr, this);
        this.f828e = new SparseArray();
        this.f845v = Long.MIN_VALUE;
    }

    /* renamed from: a */
    public C0108a mo133a() {
        this.f842s++;
        return this;
    }

    /* renamed from: a */
    public boolean mo139a(long j) {
        if (this.f835l) {
            return true;
        }
        if (this.f849z == null) {
            this.f849z = new agx("Loader:ExtractorSampleSource");
        }
        m1051g();
        if (this.f833j == null || !this.f832i || !m1053i()) {
            return false;
        }
        int size = this.f828e.size();
        this.f841r = new boolean[size];
        this.f840q = new boolean[size];
        this.f839p = new boolean[size];
        this.f837n = new ado[size];
        this.f838o = -1;
        for (int i = 0; i < size; i++) {
            ado c = ((C0131c) this.f828e.valueAt(i)).m984c();
            this.f837n[i] = c;
            if (c.f624e != -1 && c.f624e > this.f838o) {
                this.f838o = c.f624e;
            }
        }
        this.f835l = true;
        return true;
    }

    /* renamed from: c */
    public int mo145c() {
        return this.f828e.size();
    }

    /* renamed from: a */
    public ado mo132a(int i) {
        ahb.m1516b(this.f835l);
        return this.f837n[i];
    }

    /* renamed from: a */
    public void mo134a(int i, long j) {
        ahb.m1516b(this.f835l);
        ahb.m1516b(!this.f841r[i]);
        this.f836m++;
        this.f841r[i] = true;
        this.f839p[i] = true;
        this.f840q[i] = false;
        if (this.f836m == 1) {
            if (!this.f833j.mo110a()) {
                j = 0;
            }
            this.f843t = j;
            this.f844u = j;
            if (j != 0) {
                m1047c(j);
            }
        }
    }

    /* renamed from: c */
    public void mo146c(int i) {
        ahb.m1516b(this.f835l);
        ahb.m1516b(this.f841r[i]);
        this.f836m--;
        this.f841r[i] = false;
        if (this.f836m == 0) {
            this.f843t = Long.MIN_VALUE;
            if (this.f849z.m1497a()) {
                this.f849z.m1498b();
                return;
            }
            m1054j();
            this.f826c.mo184a(0);
        }
    }

    /* renamed from: b */
    public boolean mo144b(int i, long j) {
        ahb.m1516b(this.f835l);
        ahb.m1516b(this.f841r[i]);
        this.f843t = j;
        m1049e(this.f843t);
        if (this.f822E) {
            return true;
        }
        m1051g();
        if (m1055k()) {
            return false;
        }
        return !((C0131c) this.f828e.valueAt(i)).m986e();
    }

    /* renamed from: b */
    public long mo140b(int i) {
        if (!this.f840q[i]) {
            return Long.MIN_VALUE;
        }
        this.f840q[i] = false;
        return this.f844u;
    }

    /* renamed from: a */
    public int mo131a(int i, long j, adp adp, adr adr) {
        this.f843t = j;
        if (this.f840q[i] || m1055k()) {
            return -2;
        }
        C0131c c0131c = (C0131c) this.f828e.valueAt(i);
        if (this.f839p[i]) {
            adp.f641a = c0131c.m984c();
            adp.f642b = this.f834k;
            this.f839p[i] = false;
            return -4;
        } else if (!c0131c.m981a(adr)) {
            return this.f822E ? -1 : -2;
        } else {
            int i2;
            boolean z = adr.f647e < this.f844u;
            int i3 = adr.f646d;
            if (z) {
                i2 = 134217728;
            } else {
                i2 = 0;
            }
            adr.f646d = i2 | i3;
            if (this.f846w) {
                this.f848y = this.f847x - adr.f647e;
                this.f846w = false;
            }
            adr.f647e += this.f848y;
            return -3;
        }
    }

    /* renamed from: b */
    public void mo141b() throws IOException {
        if (this.f819B != null) {
            if (m1056l()) {
                throw this.f819B;
            }
            int i = this.f829f != -1 ? this.f829f : (this.f833j == null || this.f833j.mo110a()) ? 3 : 6;
            if (this.f820C > i) {
                throw this.f819B;
            }
        }
    }

    /* renamed from: b */
    public void mo142b(long j) {
        int i = 0;
        ahb.m1516b(this.f835l);
        ahb.m1516b(this.f836m > 0);
        if (!this.f833j.mo110a()) {
            j = 0;
        }
        long j2 = m1055k() ? this.f845v : this.f843t;
        this.f843t = j;
        this.f844u = j;
        if (j2 != j) {
            boolean z;
            if (m1055k()) {
                z = false;
            } else {
                z = true;
            }
            int i2 = 0;
            int i3 = z;
            while (i3 != 0 && i2 < this.f828e.size()) {
                i3 &= ((C0131c) this.f828e.valueAt(i2)).m983b(j);
                i2++;
            }
            if (i3 == 0) {
                m1047c(j);
            }
            while (i < this.f840q.length) {
                this.f840q[i] = true;
                i++;
            }
        }
    }

    /* renamed from: d */
    public long mo147d() {
        if (this.f822E) {
            return -3;
        }
        if (m1055k()) {
            return this.f845v;
        }
        long j = Long.MIN_VALUE;
        for (int i = 0; i < this.f828e.size(); i++) {
            j = Math.max(j, ((C0131c) this.f828e.valueAt(i)).m985d());
        }
        return j == Long.MIN_VALUE ? this.f843t : j;
    }

    /* renamed from: e */
    public void mo149e() {
        ahb.m1516b(this.f842s > 0);
        int i = this.f842s - 1;
        this.f842s = i;
        if (i == 0 && this.f849z != null) {
            this.f849z.m1499c();
            this.f849z = null;
        }
    }

    /* renamed from: a */
    public void mo137a(C0123c c0123c) {
        this.f822E = true;
    }

    /* renamed from: b */
    public void mo143b(C0123c c0123c) {
        if (this.f836m > 0) {
            m1047c(this.f845v);
            return;
        }
        m1054j();
        this.f826c.mo184a(0);
    }

    /* renamed from: a */
    public void mo138a(C0123c c0123c, IOException iOException) {
        this.f819B = iOException;
        this.f820C = this.f823F > this.f824G ? 1 : this.f820C + 1;
        this.f821D = SystemClock.elapsedRealtime();
        m1051g();
    }

    /* renamed from: d */
    public aep mo148d(int i) {
        C0131c c0131c = (C0131c) this.f828e.get(i);
        if (c0131c != null) {
            return c0131c;
        }
        aep c0131c2 = new C0131c(this, this.f826c);
        this.f828e.put(i, c0131c2);
        return c0131c2;
    }

    /* renamed from: f */
    public void mo150f() {
        this.f832i = true;
    }

    /* renamed from: a */
    public void mo136a(aeo aeo) {
        this.f833j = aeo;
    }

    /* renamed from: a */
    public void mo135a(aea aea) {
        this.f834k = aea;
    }

    /* renamed from: c */
    private void m1047c(long j) {
        this.f845v = j;
        this.f822E = false;
        if (this.f849z.m1497a()) {
            this.f849z.m1498b();
            return;
        }
        m1054j();
        m1051g();
    }

    /* renamed from: g */
    private void m1051g() {
        int i = 0;
        if (!this.f822E && !this.f849z.m1497a()) {
            if (this.f819B == null) {
                this.f848y = 0;
                this.f846w = false;
                if (this.f835l) {
                    ahb.m1516b(m1055k());
                    if (this.f838o == -1 || this.f845v < this.f838o) {
                        this.f818A = m1048d(this.f845v);
                        this.f845v = Long.MIN_VALUE;
                    } else {
                        this.f822E = true;
                        this.f845v = Long.MIN_VALUE;
                        return;
                    }
                }
                this.f818A = m1052h();
                this.f824G = this.f823F;
                this.f849z.m1495a(this.f818A, (C0128a) this);
            } else if (!m1056l()) {
                ahb.m1516b(this.f818A != null);
                if (SystemClock.elapsedRealtime() - this.f821D >= m1050f((long) this.f820C)) {
                    this.f819B = null;
                    if (!this.f835l) {
                        while (i < this.f828e.size()) {
                            ((C0131c) this.f828e.valueAt(i)).m976a();
                            i++;
                        }
                        this.f818A = m1052h();
                    } else if (!this.f833j.mo110a() && this.f838o == -1) {
                        while (i < this.f828e.size()) {
                            ((C0131c) this.f828e.valueAt(i)).m976a();
                            i++;
                        }
                        this.f818A = m1052h();
                        this.f847x = this.f843t;
                        this.f846w = true;
                    }
                    this.f824G = this.f823F;
                    this.f849z.m1495a(this.f818A, (C0128a) this);
                }
            }
        }
    }

    /* renamed from: h */
    private C0129a m1052h() {
        return new C0129a(this.f830g, this.f831h, this.f825b, this.f826c, this.f827d, 0);
    }

    /* renamed from: d */
    private C0129a m1048d(long j) {
        return new C0129a(this.f830g, this.f831h, this.f825b, this.f826c, this.f827d, this.f833j.mo111b(j));
    }

    /* renamed from: i */
    private boolean m1053i() {
        for (int i = 0; i < this.f828e.size(); i++) {
            if (!((C0131c) this.f828e.valueAt(i)).m982b()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: e */
    private void m1049e(long j) {
        for (int i = 0; i < this.f841r.length; i++) {
            if (!this.f841r[i]) {
                ((C0131c) this.f828e.valueAt(i)).m977a(j);
            }
        }
    }

    /* renamed from: j */
    private void m1054j() {
        for (int i = 0; i < this.f828e.size(); i++) {
            ((C0131c) this.f828e.valueAt(i)).m976a();
        }
        this.f818A = null;
        this.f819B = null;
        this.f820C = 0;
    }

    /* renamed from: k */
    private boolean m1055k() {
        return this.f845v != Long.MIN_VALUE;
    }

    /* renamed from: l */
    private boolean m1056l() {
        return this.f819B instanceof C0132d;
    }

    /* renamed from: f */
    private long m1050f(long j) {
        return Math.min((j - 1) * 1000, 5000);
    }
}
