package com.p000;

import android.support.v7.widget.LinearLayoutManager;
import android.util.Log;
import com.facebook.common.util.ByteConstants;
import com.mopub.nativeads.MoPubNativeAdPositioning.MoPubClientPositioning;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;
import p000.aea.C0120a;
import p000.aea.C0121b;
import p000.afa.C0142a;
import p000.afa.C0143b;

/* compiled from: FragmentedMp4Extractor */
/* renamed from: afd */
public final class afd implements aeg {
    /* renamed from: a */
    private static final byte[] f999a = new byte[]{(byte) -94, (byte) 57, (byte) 79, (byte) 82, (byte) 90, (byte) -101, (byte) 79, (byte) 20, (byte) -94, (byte) 68, (byte) 108, (byte) 66, (byte) 124, (byte) 100, (byte) -115, (byte) -12};
    /* renamed from: b */
    private final int f1000b;
    /* renamed from: c */
    private final ahk f1001c;
    /* renamed from: d */
    private final ahk f1002d;
    /* renamed from: e */
    private final ahk f1003e;
    /* renamed from: f */
    private final ahk f1004f;
    /* renamed from: g */
    private final byte[] f1005g;
    /* renamed from: h */
    private final Stack<C0142a> f1006h;
    /* renamed from: i */
    private final afj f1007i;
    /* renamed from: j */
    private int f1008j;
    /* renamed from: k */
    private int f1009k;
    /* renamed from: l */
    private long f1010l;
    /* renamed from: m */
    private int f1011m;
    /* renamed from: n */
    private ahk f1012n;
    /* renamed from: o */
    private long f1013o;
    /* renamed from: p */
    private int f1014p;
    /* renamed from: q */
    private int f1015q;
    /* renamed from: r */
    private int f1016r;
    /* renamed from: s */
    private int f1017s;
    /* renamed from: t */
    private afh f1018t;
    /* renamed from: u */
    private afc f1019u;
    /* renamed from: v */
    private aei f1020v;
    /* renamed from: w */
    private aep f1021w;
    /* renamed from: x */
    private boolean f1022x;

    public afd() {
        this(0);
    }

    public afd(int i) {
        this.f1000b = i;
        this.f1004f = new ahk(16);
        this.f1001c = new ahk(ahi.f1485a);
        this.f1002d = new ahk(4);
        this.f1003e = new ahk(1);
        this.f1005g = new byte[16];
        this.f1006h = new Stack();
        this.f1007i = new afj();
        m1201a();
    }

    /* renamed from: a */
    public boolean mo155a(aeh aeh) throws IOException, InterruptedException {
        return afg.m1245a(aeh);
    }

    /* renamed from: a */
    public void mo154a(aei aei) {
        this.f1020v = aei;
        this.f1021w = aei.mo148d(0);
        this.f1020v.mo150f();
    }

    /* renamed from: b */
    public void mo156b() {
        this.f1006h.clear();
        m1201a();
    }

    /* renamed from: a */
    public int mo153a(aeh aeh, aem aem) throws IOException, InterruptedException {
        while (true) {
            switch (this.f1008j) {
                case 0:
                    if (m1217b(aeh)) {
                        break;
                    }
                    return -1;
                case 1:
                    m1219c(aeh);
                    break;
                case 2:
                    m1221d(aeh);
                    break;
                default:
                    if (!m1222e(aeh)) {
                        break;
                    }
                    return 0;
            }
        }
    }

    /* renamed from: a */
    private void m1201a() {
        this.f1008j = 0;
        this.f1011m = 0;
    }

    /* renamed from: b */
    private boolean m1217b(aeh aeh) throws IOException, InterruptedException {
        if (this.f1011m == 0) {
            if (!aeh.mo115a(this.f1004f.f1493a, 0, 8, true)) {
                return false;
            }
            this.f1011m = 8;
            this.f1004f.m1564b(0);
            this.f1010l = this.f1004f.m1574j();
            this.f1009k = this.f1004f.m1575k();
        }
        if (this.f1010l == 1) {
            aeh.mo118b(this.f1004f.f1493a, 8, 8);
            this.f1011m += 8;
            this.f1010l = this.f1004f.m1580p();
        }
        long c = aeh.mo120c() - ((long) this.f1011m);
        if (this.f1009k == afa.f941H) {
            this.f1007i.f1064c = c;
            this.f1007i.f1063b = c;
        }
        if (this.f1009k == afa.f967h) {
            this.f1013o = c + this.f1010l;
            if (!this.f1022x) {
                this.f1020v.mo136a(aeo.f740f);
                this.f1022x = true;
            }
            if (this.f1007i.f1074m) {
                this.f1008j = 2;
            } else {
                this.f1008j = 3;
            }
            return true;
        }
        if (afd.m1216b(this.f1009k)) {
            this.f1006h.add(new C0142a(this.f1009k, (aeh.mo120c() + this.f1010l) - 8));
            m1201a();
        } else if (afd.m1211a(this.f1009k)) {
            if (this.f1011m != 8) {
                throw new adq("Leaf atom defines extended atom size (unsupported).");
            } else if (this.f1010l > 2147483647L) {
                throw new adq("Leaf atom with length > 2147483647 (unsupported).");
            } else {
                this.f1012n = new ahk((int) this.f1010l);
                System.arraycopy(this.f1004f.f1493a, 0, this.f1012n.f1493a, 0, 8);
                this.f1008j = 1;
            }
        } else if (this.f1010l > 2147483647L) {
            throw new adq("Skipping atom with length > 2147483647 (unsupported).");
        } else {
            this.f1012n = null;
            this.f1008j = 1;
        }
        return true;
    }

    /* renamed from: c */
    private void m1219c(aeh aeh) throws IOException, InterruptedException {
        int i = ((int) this.f1010l) - this.f1011m;
        if (this.f1012n != null) {
            aeh.mo118b(this.f1012n.f1493a, 8, i);
            m1203a(new C0143b(this.f1009k, this.f1012n), aeh.mo120c());
        } else {
            aeh.mo117b(i);
        }
        long c = aeh.mo120c();
        while (!this.f1006h.isEmpty() && ((C0142a) this.f1006h.peek()).aA == c) {
            m1202a((C0142a) this.f1006h.pop());
        }
        m1201a();
    }

    /* renamed from: a */
    private void m1203a(C0143b c0143b, long j) throws adq {
        if (!this.f1006h.isEmpty()) {
            ((C0142a) this.f1006h.peek()).m1173a(c0143b);
        } else if (c0143b.az == afa.f983x) {
            this.f1020v.mo136a(afd.m1199a(c0143b.aA, j));
            this.f1022x = true;
        }
    }

    /* renamed from: a */
    private void m1202a(C0142a c0142a) throws adq {
        if (c0142a.az == afa.f984y) {
            m1213b(c0142a);
        } else if (c0142a.az == afa.f941H) {
            m1220c(c0142a);
        } else if (!this.f1006h.isEmpty()) {
            ((C0142a) this.f1006h.peek()).m1172a(c0142a);
        }
    }

    /* renamed from: b */
    private void m1213b(C0142a c0142a) throws adq {
        List list = c0142a.aB;
        int size = list.size();
        aea aea = null;
        for (int i = 0; i < size; i++) {
            C0143b c0143b = (C0143b) list.get(i);
            if (c0143b.az == afa.f950Q) {
                if (aea == null) {
                    aea = new C0120a();
                }
                byte[] bArr = c0143b.aA.f1493a;
                if (aff.m1242a(bArr) == null) {
                    Log.w("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    aea.m926a(aff.m1242a(bArr), new C0121b("video/mp4", bArr));
                }
            }
        }
        if (aea != null) {
            this.f1020v.mo135a(aea);
        }
        this.f1019u = afd.m1200a(c0142a.m1175e(afa.f943J).m1174d(afa.f981v).aA);
        this.f1018t = afb.m1184a(c0142a.m1175e(afa.f934A), c0142a.m1174d(afa.f985z), false);
        if (this.f1018t == null) {
            throw new adq("Track type not supported.");
        }
        this.f1021w.mo126a(this.f1018t.f1054k);
    }

    /* renamed from: c */
    private void m1220c(C0142a c0142a) throws adq {
        this.f1007i.m1248a();
        afd.m1206a(this.f1018t, this.f1019u, c0142a, this.f1007i, this.f1000b, this.f1005g);
        this.f1014p = 0;
    }

    /* renamed from: a */
    private static afc m1200a(ahk ahk) {
        ahk.m1564b(16);
        return new afc(ahk.m1579o() - 1, ahk.m1579o(), ahk.m1579o(), ahk.m1575k());
    }

    /* renamed from: a */
    private static void m1206a(afh afh, afc afc, C0142a c0142a, afj afj, int i, byte[] bArr) throws adq {
        if (c0142a.m1176f(afa.f942I) != 1) {
            throw new adq("Traf count in moof != 1 (unsupported).");
        }
        afd.m1214b(afh, afc, c0142a.m1175e(afa.f942I), afj, i, bArr);
    }

    /* renamed from: b */
    private static void m1214b(afh afh, afc afc, C0142a c0142a, afj afj, int i, byte[] bArr) throws adq {
        if (c0142a.m1176f(afa.f982w) != 1) {
            throw new adq("Trun count in traf != 1 (unsupported).");
        }
        long j;
        if (c0142a.m1174d(afa.f979t) == null || (i & 2) != 0) {
            j = 0;
        } else {
            j = afd.m1212b(c0142a.m1174d(afa.f979t).aA);
        }
        afd.m1204a(afc, c0142a.m1174d(afa.f980u).aA, afj);
        C0143b d = c0142a.m1174d(afa.f982w);
        afd.m1205a(afh, afj.f1062a, j, i, d.aA, afj);
        d = c0142a.m1174d(afa.f958Y);
        if (d != null) {
            afd.m1207a(afh.f1055l[afj.f1062a.f995a], d.aA, afj);
        }
        d = c0142a.m1174d(afa.f959Z);
        if (d != null) {
            afd.m1209a(d.aA, afj);
        }
        d = c0142a.m1174d(afa.ab);
        if (d != null) {
            afd.m1215b(d.aA, afj);
        }
        int size = c0142a.aB.size();
        for (int i2 = 0; i2 < size; i2++) {
            d = (C0143b) c0142a.aB.get(i2);
            if (d.az == afa.aa) {
                afd.m1210a(d.aA, afj, bArr);
            }
        }
    }

    /* renamed from: a */
    private static void m1207a(afi afi, ahk ahk, afj afj) throws adq {
        boolean z = true;
        int i = afi.f1060b;
        ahk.m1564b(8);
        if ((afa.m1170b(ahk.m1575k()) & 1) == 1) {
            ahk.m1566c(8);
        }
        int f = ahk.m1570f();
        int o = ahk.m1579o();
        if (o != afj.f1065d) {
            throw new adq("Length mismatch: " + o + ", " + afj.f1065d);
        }
        if (f == 0) {
            boolean[] zArr = afj.f1071j;
            int i2 = 0;
            f = 0;
            while (i2 < o) {
                boolean z2;
                int f2 = ahk.m1570f();
                int i3 = f + f2;
                if (f2 > i) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                zArr[i2] = z2;
                i2++;
                f = i3;
            }
        } else {
            if (f <= i) {
                z = false;
            }
            f = (f * o) + 0;
            Arrays.fill(afj.f1071j, 0, o, z);
        }
        afj.m1252b(f);
    }

    /* renamed from: a */
    private static void m1209a(ahk ahk, afj afj) throws adq {
        ahk.m1564b(8);
        int k = ahk.m1575k();
        if ((afa.m1170b(k) & 1) == 1) {
            ahk.m1566c(8);
        }
        int o = ahk.m1579o();
        if (o != 1) {
            throw new adq("Unexpected saio entry count: " + o);
        }
        k = afa.m1169a(k);
        afj.f1064c = (k == 0 ? ahk.m1574j() : ahk.m1580p()) + afj.f1064c;
    }

    /* renamed from: a */
    private static void m1204a(afc afc, ahk ahk, afj afj) {
        ahk.m1564b(8);
        int b = afa.m1170b(ahk.m1575k());
        ahk.m1566c(4);
        if ((b & 1) != 0) {
            long p = ahk.m1580p();
            afj.f1063b = p;
            afj.f1064c = p;
        }
        afj.f1062a = new afc((b & 2) != 0 ? ahk.m1579o() - 1 : afc.f995a, (b & 8) != 0 ? ahk.m1579o() : afc.f996b, (b & 16) != 0 ? ahk.m1579o() : afc.f997c, (b & 32) != 0 ? ahk.m1579o() : afc.f998d);
    }

    /* renamed from: b */
    private static long m1212b(ahk ahk) {
        ahk.m1564b(8);
        return afa.m1169a(ahk.m1575k()) == 1 ? ahk.m1580p() : ahk.m1574j();
    }

    /* renamed from: a */
    private static void m1205a(afh afh, afc afc, long j, int i, ahk ahk, afj afj) {
        Object obj;
        long a;
        ahk.m1564b(8);
        int b = afa.m1170b(ahk.m1575k());
        int o = ahk.m1579o();
        if ((b & 1) != 0) {
            afj.f1063b += (long) ahk.m1575k();
        }
        Object obj2 = (b & 4) != 0 ? 1 : null;
        int i2 = afc.f998d;
        if (obj2 != null) {
            i2 = ahk.m1579o();
        }
        Object obj3 = (b & 256) != 0 ? 1 : null;
        Object obj4 = (b & 512) != 0 ? 1 : null;
        Object obj5 = (b & ByteConstants.KB) != 0 ? 1 : null;
        if ((b & 2048) != 0) {
            obj = 1;
        } else {
            obj = null;
        }
        if (afh.f1056m != null && afh.f1056m.length == 1 && afh.f1056m[0] == 0) {
            a = ahr.m1595a(afh.f1057n[0], 1000, afh.f1051h);
        } else {
            a = 0;
        }
        afj.m1249a(o);
        int[] iArr = afj.f1066e;
        int[] iArr2 = afj.f1067f;
        long[] jArr = afj.f1068g;
        boolean[] zArr = afj.f1069h;
        long j2 = afh.f1051h;
        Object obj6 = (afh.f1050g != afh.f1044a || (i & 1) == 0) ? null : 1;
        int i3 = 0;
        long j3 = j;
        while (i3 < o) {
            int o2 = obj3 != null ? ahk.m1579o() : afc.f996b;
            int o3 = obj4 != null ? ahk.m1579o() : afc.f997c;
            int k = (i3 != 0 || obj2 == null) ? obj5 != null ? ahk.m1575k() : afc.f998d : i2;
            if (obj != null) {
                iArr2[i3] = (int) (((long) (ahk.m1575k() * 1000)) / j2);
            } else {
                iArr2[i3] = 0;
            }
            jArr[i3] = ahr.m1595a(j3, 1000, j2) - a;
            iArr[i3] = o3;
            boolean z = ((k >> 16) & 1) == 0 && (obj6 == null || i3 == 0);
            zArr[i3] = z;
            i3++;
            j3 += (long) o2;
        }
    }

    /* renamed from: a */
    private static void m1210a(ahk ahk, afj afj, byte[] bArr) throws adq {
        ahk.m1564b(8);
        ahk.m1562a(bArr, 0, 16);
        if (Arrays.equals(bArr, f999a)) {
            afd.m1208a(ahk, 16, afj);
        }
    }

    /* renamed from: b */
    private static void m1215b(ahk ahk, afj afj) throws adq {
        afd.m1208a(ahk, 0, afj);
    }

    /* renamed from: a */
    private static void m1208a(ahk ahk, int i, afj afj) throws adq {
        ahk.m1564b(i + 8);
        int b = afa.m1170b(ahk.m1575k());
        if ((b & 1) != 0) {
            throw new adq("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z;
        if ((b & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        int o = ahk.m1579o();
        if (o != afj.f1065d) {
            throw new adq("Length mismatch: " + o + ", " + afj.f1065d);
        }
        Arrays.fill(afj.f1071j, 0, o, z);
        afj.m1252b(ahk.m1563b());
        afj.m1251a(ahk);
    }

    /* renamed from: a */
    private static aec m1199a(ahk ahk, long j) throws adq {
        long j2;
        long j3;
        ahk.m1564b(8);
        int a = afa.m1169a(ahk.m1575k());
        ahk.m1566c(4);
        long j4 = ahk.m1574j();
        if (a == 0) {
            j2 = ahk.m1574j() + j;
            j3 = ahk.m1574j();
        } else {
            j2 = ahk.m1580p() + j;
            j3 = ahk.m1580p();
        }
        ahk.m1566c(2);
        int g = ahk.m1571g();
        int[] iArr = new int[g];
        long[] jArr = new long[g];
        long[] jArr2 = new long[g];
        long[] jArr3 = new long[g];
        long j5 = j2;
        int i = 0;
        long j6 = j3;
        j3 = ahr.m1595a(j3, 1000000, j4);
        while (i < g) {
            int k = ahk.m1575k();
            if ((LinearLayoutManager.INVALID_OFFSET & k) != 0) {
                throw new adq("Unhandled indirect reference");
            }
            long j7 = ahk.m1574j();
            iArr[i] = k & MoPubClientPositioning.NO_REPEAT;
            jArr[i] = j5;
            jArr3[i] = j3;
            j3 = j6 + j7;
            j7 = ahr.m1595a(j3, 1000000, j4);
            jArr2[i] = j7 - jArr3[i];
            ahk.m1566c(4);
            j5 += (long) iArr[i];
            i++;
            j6 = j3;
            j3 = j7;
        }
        return new aec(iArr, jArr, jArr2, jArr3);
    }

    /* renamed from: d */
    private void m1221d(aeh aeh) throws IOException, InterruptedException {
        int c = (int) (this.f1007i.f1064c - aeh.mo120c());
        if (c < 0) {
            throw new adq("Offset to encryption data was negative.");
        }
        aeh.mo117b(c);
        this.f1007i.m1250a(aeh);
        this.f1008j = 3;
    }

    /* renamed from: e */
    private boolean m1222e(aeh aeh) throws IOException, InterruptedException {
        int c;
        int i = 2;
        if (this.f1008j == 3) {
            if (this.f1014p == this.f1007i.f1065d) {
                i = (int) (this.f1013o - aeh.mo120c());
                if (i < 0) {
                    throw new adq("Offset to end of mdat was negative.");
                }
                aeh.mo117b(i);
                m1201a();
                return false;
            }
            if (this.f1014p == 0) {
                c = (int) (this.f1007i.f1063b - aeh.mo120c());
                if (c < 0) {
                    throw new adq("Offset to sample data was negative.");
                }
                aeh.mo117b(c);
            }
            this.f1015q = this.f1007i.f1066e[this.f1014p];
            if (this.f1007i.f1070i) {
                this.f1016r = m1218c(this.f1007i.f1073l);
                this.f1015q += this.f1016r;
            } else {
                this.f1016r = 0;
            }
            this.f1017s = 0;
            this.f1008j = 4;
        }
        if (this.f1018t.f1058o != -1) {
            byte[] bArr = this.f1002d.f1493a;
            bArr[0] = (byte) 0;
            bArr[1] = (byte) 0;
            bArr[2] = (byte) 0;
            c = this.f1018t.f1058o;
            int i2 = 4 - this.f1018t.f1058o;
            while (this.f1016r < this.f1015q) {
                if (this.f1017s == 0) {
                    aeh.mo118b(this.f1002d.f1493a, i2, c);
                    this.f1002d.m1564b(0);
                    this.f1017s = this.f1002d.m1579o();
                    this.f1001c.m1564b(0);
                    this.f1021w.mo127a(this.f1001c, 4);
                    this.f1016r += 4;
                    this.f1015q += i2;
                } else {
                    int a = this.f1021w.mo124a(aeh, this.f1017s, false);
                    this.f1016r += a;
                    this.f1017s -= a;
                }
            }
        } else {
            while (this.f1016r < this.f1015q) {
                this.f1016r = this.f1021w.mo124a(aeh, this.f1015q - this.f1016r, false) + this.f1016r;
            }
        }
        long c2 = this.f1007i.m1253c(this.f1014p) * 1000;
        if (!this.f1007i.f1070i) {
            i = 0;
        }
        this.f1021w.mo125a(c2, i | (this.f1007i.f1069h[this.f1014p] ? 1 : 0), this.f1015q, 0, this.f1007i.f1070i ? this.f1018t.f1055l[this.f1007i.f1062a.f995a].f1061c : null);
        this.f1014p++;
        this.f1008j = 3;
        return true;
    }

    /* renamed from: c */
    private int m1218c(ahk ahk) {
        int i = this.f1018t.f1055l[this.f1007i.f1062a.f995a].f1060b;
        boolean z = this.f1007i.f1071j[this.f1014p];
        this.f1003e.f1493a[0] = (byte) ((z ? 128 : 0) | i);
        this.f1003e.m1564b(0);
        this.f1021w.mo127a(this.f1003e, 1);
        this.f1021w.mo127a(ahk, i);
        if (!z) {
            return i + 1;
        }
        int g = ahk.m1571g();
        ahk.m1566c(-2);
        g = (g * 6) + 2;
        this.f1021w.mo127a(ahk, g);
        return g + (i + 1);
    }

    /* renamed from: a */
    private static boolean m1211a(int i) {
        return i == afa.f948O || i == afa.f947N || i == afa.f985z || i == afa.f983x || i == afa.f949P || i == afa.f979t || i == afa.f980u || i == afa.f944K || i == afa.f981v || i == afa.f982w || i == afa.f950Q || i == afa.f958Y || i == afa.f959Z || i == afa.ab || i == afa.aa || i == afa.f946M;
    }

    /* renamed from: b */
    private static boolean m1216b(int i) {
        return i == afa.f984y || i == afa.f934A || i == afa.f935B || i == afa.f936C || i == afa.f937D || i == afa.f941H || i == afa.f942I || i == afa.f943J || i == afa.f945L;
    }
}
