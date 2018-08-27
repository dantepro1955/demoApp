package com.p000;

import android.util.Log;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.io.IOException;

/* compiled from: TsExtractor */
/* renamed from: afz */
public final class afz implements aeg {
    /* renamed from: d */
    private static final long f1234d = ((long) ahr.m1606c("AC-3"));
    /* renamed from: e */
    private static final long f1235e = ((long) ahr.m1606c("EAC3"));
    /* renamed from: f */
    private static final long f1236f = ((long) ahr.m1606c("HEVC"));
    /* renamed from: a */
    final SparseArray<C0153d> f1237a;
    /* renamed from: b */
    final SparseBooleanArray f1238b;
    /* renamed from: c */
    aft f1239c;
    /* renamed from: g */
    private final afx f1240g;
    /* renamed from: h */
    private final int f1241h;
    /* renamed from: i */
    private final ahk f1242i;
    /* renamed from: j */
    private final ahj f1243j;
    /* renamed from: k */
    private aei f1244k;

    /* compiled from: TsExtractor */
    /* renamed from: afz$d */
    static abstract class C0153d {
        /* renamed from: a */
        public abstract void mo164a();

        /* renamed from: a */
        public abstract void mo165a(ahk ahk, boolean z, aei aei);

        private C0153d() {
        }
    }

    /* compiled from: TsExtractor */
    /* renamed from: afz$a */
    class C0154a extends C0153d {
        /* renamed from: a */
        final /* synthetic */ afz f1215a;
        /* renamed from: b */
        private final ahj f1216b = new ahj(new byte[4]);

        public C0154a(afz afz) {
            this.f1215a = afz;
            super();
        }

        /* renamed from: a */
        public void mo164a() {
        }

        /* renamed from: a */
        public void mo165a(ahk ahk, boolean z, aei aei) {
            if (z) {
                ahk.m1566c(ahk.m1570f());
            }
            ahk.m1560a(this.f1216b, 3);
            this.f1216b.m1551b(12);
            int c = this.f1216b.m1554c(12);
            ahk.m1566c(5);
            int i = (c - 9) / 4;
            for (c = 0; c < i; c++) {
                ahk.m1560a(this.f1216b, 4);
                int c2 = this.f1216b.m1554c(16);
                this.f1216b.m1551b(3);
                if (c2 == 0) {
                    this.f1216b.m1551b(13);
                } else {
                    this.f1215a.f1237a.put(this.f1216b.m1554c(13), new C0156c(this.f1215a));
                }
            }
        }
    }

    /* compiled from: TsExtractor */
    /* renamed from: afz$b */
    static final class C0155b extends C0153d {
        /* renamed from: a */
        private final afp f1217a;
        /* renamed from: b */
        private final afx f1218b;
        /* renamed from: c */
        private final ahj f1219c = new ahj(new byte[10]);
        /* renamed from: d */
        private int f1220d = 0;
        /* renamed from: e */
        private int f1221e;
        /* renamed from: f */
        private boolean f1222f;
        /* renamed from: g */
        private boolean f1223g;
        /* renamed from: h */
        private boolean f1224h;
        /* renamed from: i */
        private int f1225i;
        /* renamed from: j */
        private int f1226j;
        /* renamed from: k */
        private boolean f1227k;
        /* renamed from: l */
        private long f1228l;

        public C0155b(afp afp, afx afx) {
            super();
            this.f1217a = afp;
            this.f1218b = afx;
        }

        /* renamed from: a */
        public void mo164a() {
            this.f1220d = 0;
            this.f1221e = 0;
            this.f1224h = false;
            this.f1217a.mo160a();
        }

        /* renamed from: a */
        public void mo165a(ahk ahk, boolean z, aei aei) {
            if (z) {
                switch (this.f1220d) {
                    case 2:
                        Log.w("TsExtractor", "Unexpected start indicator reading extended header");
                        break;
                    case 3:
                        if (this.f1226j != -1) {
                            Log.w("TsExtractor", "Unexpected start indicator: expected " + this.f1226j + " more bytes");
                        }
                        this.f1217a.mo163b();
                        break;
                }
                m1359a(1);
            }
            while (ahk.m1563b() > 0) {
                switch (this.f1220d) {
                    case 0:
                        ahk.m1566c(ahk.m1563b());
                        break;
                    case 1:
                        if (!m1360a(ahk, this.f1219c.f1489a, 9)) {
                            break;
                        }
                        m1359a(m1361b() ? 2 : 0);
                        break;
                    case 2:
                        if (m1360a(ahk, this.f1219c.f1489a, Math.min(10, this.f1225i)) && m1360a(ahk, null, this.f1225i)) {
                            m1362c();
                            this.f1217a.mo161a(this.f1228l, this.f1227k);
                            m1359a(3);
                            break;
                        }
                    case 3:
                        int i;
                        int b = ahk.m1563b();
                        if (this.f1226j == -1) {
                            i = 0;
                        } else {
                            i = b - this.f1226j;
                        }
                        if (i > 0) {
                            b -= i;
                            ahk.m1559a(ahk.m1567d() + b);
                        }
                        this.f1217a.mo162a(ahk);
                        if (this.f1226j == -1) {
                            break;
                        }
                        this.f1226j -= b;
                        if (this.f1226j != 0) {
                            break;
                        }
                        this.f1217a.mo163b();
                        m1359a(1);
                        break;
                    default:
                        break;
                }
            }
        }

        /* renamed from: a */
        private void m1359a(int i) {
            this.f1220d = i;
            this.f1221e = 0;
        }

        /* renamed from: a */
        private boolean m1360a(ahk ahk, byte[] bArr, int i) {
            int min = Math.min(ahk.m1563b(), i - this.f1221e);
            if (min <= 0) {
                return true;
            }
            if (bArr == null) {
                ahk.m1566c(min);
            } else {
                ahk.m1562a(bArr, this.f1221e, min);
            }
            this.f1221e = min + this.f1221e;
            if (this.f1221e != i) {
                return false;
            }
            return true;
        }

        /* renamed from: b */
        private boolean m1361b() {
            this.f1219c.m1548a(0);
            int c = this.f1219c.m1554c(24);
            if (c != 1) {
                Log.w("TsExtractor", "Unexpected start code prefix: " + c);
                this.f1226j = -1;
                return false;
            }
            this.f1219c.m1551b(8);
            int c2 = this.f1219c.m1554c(16);
            this.f1219c.m1551b(5);
            this.f1227k = this.f1219c.m1552b();
            this.f1219c.m1551b(2);
            this.f1222f = this.f1219c.m1552b();
            this.f1223g = this.f1219c.m1552b();
            this.f1219c.m1551b(6);
            this.f1225i = this.f1219c.m1554c(8);
            if (c2 == 0) {
                this.f1226j = -1;
            } else {
                this.f1226j = ((c2 + 6) - 9) - this.f1225i;
            }
            return true;
        }

        /* renamed from: c */
        private void m1362c() {
            this.f1219c.m1548a(0);
            this.f1228l = 0;
            if (this.f1222f) {
                this.f1219c.m1551b(4);
                long c = ((long) this.f1219c.m1554c(3)) << 30;
                this.f1219c.m1551b(1);
                c |= (long) (this.f1219c.m1554c(15) << 15);
                this.f1219c.m1551b(1);
                c |= (long) this.f1219c.m1554c(15);
                this.f1219c.m1551b(1);
                if (!this.f1224h && this.f1223g) {
                    this.f1219c.m1551b(4);
                    long c2 = ((long) this.f1219c.m1554c(3)) << 30;
                    this.f1219c.m1551b(1);
                    c2 |= (long) (this.f1219c.m1554c(15) << 15);
                    this.f1219c.m1551b(1);
                    c2 |= (long) this.f1219c.m1554c(15);
                    this.f1219c.m1551b(1);
                    this.f1218b.m1352a(c2);
                    this.f1224h = true;
                }
                this.f1228l = this.f1218b.m1352a(c);
            }
        }
    }

    /* compiled from: TsExtractor */
    /* renamed from: afz$c */
    class C0156c extends C0153d {
        /* renamed from: a */
        final /* synthetic */ afz f1229a;
        /* renamed from: b */
        private final ahj f1230b = new ahj(new byte[5]);
        /* renamed from: c */
        private final ahk f1231c = new ahk();
        /* renamed from: d */
        private int f1232d;
        /* renamed from: e */
        private int f1233e;

        public C0156c(afz afz) {
            this.f1229a = afz;
            super();
        }

        /* renamed from: a */
        public void mo164a() {
        }

        /* renamed from: a */
        public void mo165a(ahk ahk, boolean z, aei aei) {
            if (z) {
                ahk.m1566c(ahk.m1570f());
                ahk.m1560a(this.f1230b, 3);
                this.f1230b.m1551b(12);
                this.f1232d = this.f1230b.m1554c(12);
                if (this.f1231c.m1569e() < this.f1232d) {
                    this.f1231c.m1561a(new byte[this.f1232d], this.f1232d);
                } else {
                    this.f1231c.m1558a();
                    this.f1231c.m1559a(this.f1232d);
                }
            }
            int min = Math.min(ahk.m1563b(), this.f1232d - this.f1233e);
            ahk.m1562a(this.f1231c.f1493a, this.f1233e, min);
            this.f1233e = min + this.f1233e;
            if (this.f1233e >= this.f1232d) {
                this.f1231c.m1566c(7);
                this.f1231c.m1560a(this.f1230b, 2);
                this.f1230b.m1551b(4);
                min = this.f1230b.m1554c(12);
                this.f1231c.m1566c(min);
                if (this.f1229a.f1239c == null) {
                    this.f1229a.f1239c = new aft(aei.mo148d(21));
                }
                int i = ((this.f1232d - 9) - min) - 4;
                while (i > 0) {
                    this.f1231c.m1560a(this.f1230b, 5);
                    min = this.f1230b.m1554c(8);
                    this.f1230b.m1551b(3);
                    int c = this.f1230b.m1554c(13);
                    this.f1230b.m1551b(4);
                    int c2 = this.f1230b.m1554c(12);
                    if (min == 6) {
                        min = m1365a(this.f1231c, c2);
                    } else {
                        this.f1231c.m1566c(c2);
                    }
                    int i2 = i - (c2 + 5);
                    if (this.f1229a.f1238b.get(min)) {
                        i = i2;
                    } else {
                        afp afq;
                        switch (min) {
                            case 2:
                                afq = new afq(aei.mo148d(2));
                                break;
                            case 3:
                                afq = new afu(aei.mo148d(3));
                                break;
                            case 4:
                                afq = new afu(aei.mo148d(4));
                                break;
                            case 15:
                                if ((this.f1229a.f1241h & 2) == 0) {
                                    afq = new afn(aei.mo148d(15), new aef());
                                    break;
                                } else {
                                    afq = null;
                                    break;
                                }
                            case 21:
                                afq = this.f1229a.f1239c;
                                break;
                            case 27:
                                if ((this.f1229a.f1241h & 4) == 0) {
                                    afq = new afr(aei.mo148d(27), new afy(aei.mo148d(256)), (this.f1229a.f1241h & 1) != 0);
                                    break;
                                } else {
                                    afq = null;
                                    break;
                                }
                            case 36:
                                afq = new afs(aei.mo148d(36), new afy(aei.mo148d(256)));
                                break;
                            case 129:
                                afq = new afl(aei.mo148d(129), false);
                                break;
                            case 130:
                            case 138:
                                afq = new afo(aei.mo148d(138));
                                break;
                            case 135:
                                afq = new afl(aei.mo148d(135), true);
                                break;
                            default:
                                afq = null;
                                break;
                        }
                        if (afq != null) {
                            this.f1229a.f1238b.put(min, true);
                            this.f1229a.f1237a.put(c, new C0155b(afq, this.f1229a.f1240g));
                        }
                        i = i2;
                    }
                }
                aei.mo150f();
            }
        }

        /* renamed from: a */
        private int m1365a(ahk ahk, int i) {
            int i2 = -1;
            int d = ahk.m1567d() + i;
            while (ahk.m1567d() < d) {
                int f = ahk.m1570f();
                int f2 = ahk.m1570f();
                if (f == 5) {
                    long j = ahk.m1574j();
                    if (j == afz.f1234d) {
                        i2 = 129;
                    } else if (j == afz.f1235e) {
                        i2 = 135;
                    } else if (j == afz.f1236f) {
                        i2 = 36;
                    }
                    ahk.m1564b(d);
                    return i2;
                }
                if (f == 106) {
                    i2 = 129;
                } else if (f == 122) {
                    i2 = 135;
                } else if (f == 123) {
                    i2 = 138;
                }
                ahk.m1566c(f2);
            }
            ahk.m1564b(d);
            return i2;
        }
    }

    public afz() {
        this(new afx(0));
    }

    public afz(afx afx) {
        this(afx, 0);
    }

    public afz(afx afx, int i) {
        this.f1240g = afx;
        this.f1241h = i;
        this.f1242i = new ahk(188);
        this.f1243j = new ahj(new byte[3]);
        this.f1237a = new SparseArray();
        this.f1237a.put(0, new C0154a(this));
        this.f1238b = new SparseBooleanArray();
    }

    /* renamed from: a */
    public boolean mo155a(aeh aeh) throws IOException, InterruptedException {
        byte[] bArr = new byte[1];
        for (int i = 0; i < 5; i++) {
            aeh.mo122c(bArr, 0, 1);
            if ((bArr[0] & 255) != 71) {
                return false;
            }
            aeh.mo121c(187);
        }
        return true;
    }

    /* renamed from: a */
    public void mo154a(aei aei) {
        this.f1244k = aei;
        aei.mo136a(aeo.f740f);
    }

    /* renamed from: b */
    public void mo156b() {
        this.f1240g.m1353a();
        for (int i = 0; i < this.f1237a.size(); i++) {
            ((C0153d) this.f1237a.valueAt(i)).mo164a();
        }
    }

    /* renamed from: a */
    public int mo153a(aeh aeh, aem aem) throws IOException, InterruptedException {
        if (!aeh.mo115a(this.f1242i.f1493a, 0, 188, true)) {
            return -1;
        }
        this.f1242i.m1564b(0);
        this.f1242i.m1559a(188);
        if (this.f1242i.m1570f() != 71) {
            return 0;
        }
        this.f1242i.m1560a(this.f1243j, 3);
        this.f1243j.m1551b(1);
        boolean b = this.f1243j.m1552b();
        this.f1243j.m1551b(1);
        int c = this.f1243j.m1554c(13);
        this.f1243j.m1551b(2);
        boolean b2 = this.f1243j.m1552b();
        boolean b3 = this.f1243j.m1552b();
        if (b2) {
            this.f1242i.m1566c(this.f1242i.m1570f());
        }
        if (b3) {
            C0153d c0153d = (C0153d) this.f1237a.get(c);
            if (c0153d != null) {
                c0153d.mo165a(this.f1242i, b, this.f1244k);
            }
        }
        return 0;
    }
}
