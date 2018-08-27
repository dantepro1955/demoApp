package com.p000;

import android.util.Pair;
import com.facebook.imagepipeline.common.RotationOptions;
import com.facebook.internal.NativeProtocol;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p000.afa.C0142a;
import p000.afa.C0143b;

/* compiled from: AtomParsers */
/* renamed from: afb */
final class afb {

    /* compiled from: AtomParsers */
    /* renamed from: afb$a */
    static final class C0144a {
        /* renamed from: a */
        public final List<byte[]> f986a;
        /* renamed from: b */
        public final int f987b;
        /* renamed from: c */
        public final float f988c;

        public C0144a(List<byte[]> list, int i, float f) {
            this.f986a = list;
            this.f987b = i;
            this.f988c = f;
        }
    }

    /* compiled from: AtomParsers */
    /* renamed from: afb$b */
    static final class C0145b {
        /* renamed from: a */
        public final afi[] f989a;
        /* renamed from: b */
        public ado f990b;
        /* renamed from: c */
        public int f991c = -1;

        public C0145b(int i) {
            this.f989a = new afi[i];
        }
    }

    /* compiled from: AtomParsers */
    /* renamed from: afb$c */
    static final class C0146c {
        /* renamed from: a */
        private final int f992a;
        /* renamed from: b */
        private final long f993b;
        /* renamed from: c */
        private final int f994c;

        public C0146c(int i, long j, int i2) {
            this.f992a = i;
            this.f993b = j;
            this.f994c = i2;
        }
    }

    /* renamed from: a */
    public static afh m1184a(C0142a c0142a, C0143b c0143b, boolean z) {
        C0142a e = c0142a.m1175e(afa.f935B);
        int d = afb.m1196d(e.m1174d(afa.f948O).aA);
        if (d != afh.f1045b && d != afh.f1044a && d != afh.f1046c && d != afh.f1047d && d != afh.f1048e) {
            return null;
        }
        long j;
        C0146c c = afb.m1195c(c0142a.m1174d(afa.f944K).aA);
        long a = c.f993b;
        long b = afb.m1189b(c0143b.aA);
        if (a == -1) {
            j = -1;
        } else {
            j = ahr.m1595a(a, 1000000, b);
        }
        C0142a e2 = e.m1175e(afa.f936C).m1175e(afa.f937D);
        Pair e3 = afb.m1198e(e.m1174d(afa.f947N).aA);
        C0145b a2 = afb.m1183a(e2.m1174d(afa.f949P).aA, c.f992a, j, c.f994c, (String) e3.second, z);
        Pair b2 = afb.m1191b(c0142a.m1175e(afa.f945L));
        if (a2.f990b == null) {
            return null;
        }
        return new afh(c.f992a, d, ((Long) e3.first).longValue(), b, j, a2.f990b, a2.f989a, a2.f991c, (long[]) b2.first, (long[]) b2.second);
    }

    /* renamed from: a */
    public static afk m1186a(afh afh, C0142a c0142a) {
        ahk ahk;
        ahk ahk2 = c0142a.m1174d(afa.ak).aA;
        C0143b d = c0142a.m1174d(afa.al);
        if (d == null) {
            d = c0142a.m1174d(afa.am);
        }
        ahk ahk3 = d.aA;
        ahk ahk4 = c0142a.m1174d(afa.aj).aA;
        ahk ahk5 = c0142a.m1174d(afa.ag).aA;
        C0143b d2 = c0142a.m1174d(afa.ah);
        ahk ahk6 = d2 != null ? d2.aA : null;
        d2 = c0142a.m1174d(afa.ai);
        if (d2 != null) {
            ahk = d2.aA;
        } else {
            ahk = null;
        }
        ahk2.m1564b(12);
        int o = ahk2.m1579o();
        int o2 = ahk2.m1579o();
        Object obj = new long[o2];
        Object obj2 = new int[o2];
        int i = 0;
        long[] jArr = new long[o2];
        Object obj3 = new int[o2];
        if (o2 == 0) {
            return new afk(obj, obj2, 0, jArr, obj3);
        }
        long j;
        ahk3.m1564b(12);
        int o3 = ahk3.m1579o();
        ahk4.m1564b(12);
        int o4 = ahk4.m1579o() - 1;
        ahb.m1517b(ahk4.m1575k() == 1, "stsc first chunk must be 1");
        int o5 = ahk4.m1579o();
        ahk4.m1566c(4);
        int i2 = -1;
        if (o4 > 0) {
            i2 = ahk4.m1579o() - 1;
        }
        ahk5.m1564b(12);
        int o6 = ahk5.m1579o() - 1;
        int o7 = ahk5.m1579o();
        int o8 = ahk5.m1579o();
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        if (ahk != null) {
            ahk.m1564b(12);
            i4 = ahk.m1579o() - 1;
            i3 = ahk.m1579o();
            i5 = ahk.m1575k();
        }
        int i6 = -1;
        int i7 = 0;
        if (ahk6 != null) {
            ahk6.m1564b(12);
            i7 = ahk6.m1579o();
            i6 = ahk6.m1579o() - 1;
        }
        if (d.az == afa.al) {
            j = ahk3.m1574j();
        } else {
            j = ahk3.m1580p();
        }
        int i8 = 0;
        long j2 = 0;
        int i9 = o5;
        int i10 = o8;
        int i11 = i2;
        int i12 = o4;
        o8 = i6;
        i6 = 0;
        int i13 = i7;
        i7 = i5;
        i5 = o5;
        long j3 = j;
        int i14 = i3;
        int i15 = i4;
        i4 = o6;
        i3 = i13;
        while (i8 < o2) {
            int o9;
            long j4;
            obj[i8] = j3;
            if (o == 0) {
                i2 = ahk2.m1579o();
            } else {
                i2 = o;
            }
            obj2[i8] = i2;
            if (obj2[i8] > i) {
                i = obj2[i8];
            }
            jArr[i8] = ((long) i7) + j2;
            obj3[i8] = ahk6 == null ? 1 : null;
            if (i8 == o8) {
                obj3[i8] = 1;
                i2 = i3 - 1;
                if (i2 > 0) {
                    o4 = i2;
                    o9 = ahk6.m1579o() - 1;
                } else {
                    o4 = i2;
                    o9 = o8;
                }
            } else {
                o4 = i3;
                o9 = o8;
            }
            j2 += (long) i10;
            i2 = o7 - 1;
            if (i2 != 0 || i4 <= 0) {
                o8 = i10;
                o7 = i2;
                o6 = i4;
            } else {
                i10 = ahk5.m1579o();
                o8 = ahk5.m1579o();
                o7 = i10;
                o6 = i4 - 1;
            }
            if (ahk != null) {
                i2 = i14 - 1;
                if (i2 != 0 || i15 <= 0) {
                    i10 = i7;
                    i4 = i15;
                    i3 = i2;
                } else {
                    i14 = ahk.m1579o();
                    i10 = ahk.m1575k();
                    i4 = i15 - 1;
                    i3 = i14;
                }
            } else {
                i10 = i7;
                i4 = i15;
                i3 = i14;
            }
            i15 = i9 - 1;
            if (i15 == 0) {
                i14 = i6 + 1;
                if (i14 >= o3) {
                    j4 = j3;
                } else if (d.az == afa.al) {
                    j4 = ahk3.m1574j();
                } else {
                    j4 = ahk3.m1580p();
                }
                if (i14 == i11) {
                    i6 = ahk4.m1579o();
                    ahk4.m1566c(4);
                    i5 = i12 - 1;
                    if (i5 > 0) {
                        i11 = ahk4.m1579o() - 1;
                    }
                } else {
                    i6 = i5;
                    i5 = i12;
                }
                if (i14 < o3) {
                    i15 = i14;
                    i14 = i11;
                    i11 = i6;
                } else {
                    i13 = i15;
                    i15 = i14;
                    i14 = i11;
                    i11 = i6;
                    i6 = i13;
                }
            } else {
                j4 = ((long) obj2[i8]) + j3;
                i14 = i11;
                i11 = i5;
                i5 = i12;
                i13 = i6;
                i6 = i15;
                i15 = i13;
            }
            i8++;
            j3 = j4;
            i9 = i6;
            i7 = i10;
            i6 = i15;
            i12 = i5;
            i10 = o8;
            i5 = i11;
            i15 = i4;
            o8 = o9;
            i11 = i14;
            i4 = o6;
            i14 = i3;
            i3 = o4;
        }
        ahb.m1514a(i3 == 0);
        ahb.m1514a(o7 == 0);
        ahb.m1514a(i9 == 0);
        ahb.m1514a(i4 == 0);
        ahb.m1514a(i15 == 0);
        if (afh.f1056m == null) {
            ahr.m1599a(jArr, 1000000, afh.f1051h);
            return new afk(obj, obj2, i, jArr, obj3);
        } else if (afh.f1056m.length == 1 && afh.f1056m[0] == 0) {
            for (r2 = 0; r2 < jArr.length; r2++) {
                jArr[r2] = ahr.m1595a(jArr[r2] - afh.f1057n[0], 1000000, afh.f1051h);
            }
            return new afk(obj, obj2, i, jArr, obj3);
        } else {
            long j5;
            long a;
            Object obj4;
            Object obj5;
            Object obj6;
            r2 = 0;
            i15 = 0;
            i14 = 0;
            i11 = 0;
            while (r2 < afh.f1056m.length) {
                int b;
                int i16;
                j5 = afh.f1057n[r2];
                if (j5 != -1) {
                    a = ahr.m1595a(afh.f1056m[r2], afh.f1051h, afh.f1052i);
                    i7 = ahr.m1603b(jArr, j5, true, true);
                    b = ahr.m1603b(jArr, a + j5, true, false);
                    i2 = i11 + (b - i7);
                    if (i14 != i7) {
                        i16 = 1;
                    } else {
                        i16 = 0;
                    }
                    i16 |= i15;
                } else {
                    i16 = i15;
                    b = i14;
                    i2 = i11;
                }
                r2++;
                i15 = i16;
                i14 = b;
                i11 = i2;
            }
            i3 = i15 | (i11 != o2 ? 1 : 0);
            if (i3 != 0) {
                obj4 = new long[i11];
            } else {
                obj4 = obj;
            }
            if (i3 != 0) {
                obj5 = new int[i11];
            } else {
                obj5 = obj2;
            }
            if (i3 != 0) {
                i2 = 0;
            } else {
                i2 = i;
            }
            if (i3 != 0) {
                obj6 = new int[i11];
            } else {
                obj6 = obj3;
            }
            long[] jArr2 = new long[i11];
            r2 = 0;
            i15 = 0;
            j5 = 0;
            i = i2;
            while (r2 < afh.f1056m.length) {
                long j6 = afh.f1057n[r2];
                a = afh.f1056m[r2];
                if (j6 != -1) {
                    long a2 = j6 + ahr.m1595a(a, afh.f1051h, afh.f1052i);
                    i2 = ahr.m1603b(jArr, j6, true, true);
                    o7 = ahr.m1603b(jArr, a2, true, false);
                    if (i3 != 0) {
                        i7 = o7 - i2;
                        System.arraycopy(obj, i2, obj4, i15, i7);
                        System.arraycopy(obj2, i2, obj5, i15, i7);
                        System.arraycopy(obj3, i2, obj6, i15, i7);
                    }
                    i11 = i15;
                    for (o5 = i2; o5 < o7; o5++) {
                        jArr2[i11] = ahr.m1595a(jArr[o5] - j6, 1000000, afh.f1051h) + ahr.m1595a(j5, 1000000, afh.f1052i);
                        if (i3 != 0 && obj5[i11] > i) {
                            i = obj2[o5];
                        }
                        i11++;
                    }
                    i2 = i;
                    i = i11;
                } else {
                    i2 = i;
                    i = i15;
                }
                r2++;
                i15 = i;
                j5 = a + j5;
                i = i2;
            }
            return new afk(obj4, obj5, i, jArr2, obj6);
        }
    }

    /* renamed from: a */
    public static ael m1180a(C0142a c0142a) {
        C0143b d = c0142a.m1174d(afa.at);
        if (d == null) {
            return null;
        }
        ahk ahk = d.aA;
        ahk.m1564b(12);
        ahk ahk2 = new ahk();
        while (ahk.m1563b() > 0) {
            int k = ahk.m1575k() - 8;
            if (ahk.m1575k() == afa.au) {
                ahk2.m1561a(ahk.f1493a, ahk.m1567d() + k);
                ahk2.m1564b(ahk.m1567d());
                ael a = afb.m1181a(ahk2);
                if (a != null) {
                    return a;
                }
            }
            ahk.m1566c(k);
        }
        return null;
    }

    /* renamed from: a */
    private static ael m1181a(ahk ahk) {
        while (ahk.m1563b() > 0) {
            int d = ahk.m1567d() + ahk.m1575k();
            if (ahk.m1575k() == afa.ay) {
                String str = null;
                String str2 = null;
                Object obj = null;
                while (ahk.m1567d() < d) {
                    int k = ahk.m1575k() - 12;
                    int k2 = ahk.m1575k();
                    ahk.m1566c(4);
                    if (k2 == afa.av) {
                        obj = ahk.m1568d(k);
                    } else if (k2 == afa.aw) {
                        str2 = ahk.m1568d(k);
                    } else if (k2 == afa.ax) {
                        ahk.m1566c(4);
                        str = ahk.m1568d(k - 4);
                    } else {
                        ahk.m1566c(k);
                    }
                }
                if (!(str2 == null || str == null || !"com.apple.iTunes".equals(r2))) {
                    return ael.m1078a(str2, str);
                }
            }
            ahk.m1564b(d);
        }
        return null;
    }

    /* renamed from: b */
    private static long m1189b(ahk ahk) {
        int i = 8;
        ahk.m1564b(8);
        if (afa.m1169a(ahk.m1575k()) != 0) {
            i = 16;
        }
        ahk.m1566c(i);
        return ahk.m1574j();
    }

    /* renamed from: c */
    private static C0146c m1195c(ahk ahk) {
        int i;
        long j;
        int i2 = 8;
        ahk.m1564b(8);
        int a = afa.m1169a(ahk.m1575k());
        ahk.m1566c(a == 0 ? 8 : 16);
        int k = ahk.m1575k();
        ahk.m1566c(4);
        Object obj = 1;
        int d = ahk.m1567d();
        if (a == 0) {
            i2 = 4;
        }
        for (i = 0; i < i2; i++) {
            if (ahk.f1493a[d + i] != (byte) -1) {
                obj = null;
                break;
            }
        }
        if (obj != null) {
            ahk.m1566c(i2);
            j = -1;
        } else {
            j = a == 0 ? ahk.m1574j() : ahk.m1580p();
        }
        ahk.m1566c(16);
        int k2 = ahk.m1575k();
        i = ahk.m1575k();
        ahk.m1566c(4);
        int k3 = ahk.m1575k();
        a = ahk.m1575k();
        k2 = (k2 == 0 && i == NativeProtocol.MESSAGE_GET_ACCESS_TOKEN_REQUEST && k3 == (-65536) && a == 0) ? 90 : (k2 == 0 && i == (-65536) && k3 == NativeProtocol.MESSAGE_GET_ACCESS_TOKEN_REQUEST && a == 0) ? RotationOptions.ROTATE_270 : (k2 == (-65536) && i == 0 && k3 == 0 && a == (-65536)) ? RotationOptions.ROTATE_180 : 0;
        return new C0146c(k, j, k2);
    }

    /* renamed from: d */
    private static int m1196d(ahk ahk) {
        ahk.m1564b(16);
        return ahk.m1575k();
    }

    /* renamed from: e */
    private static Pair<Long, String> m1198e(ahk ahk) {
        int i = 8;
        ahk.m1564b(8);
        int a = afa.m1169a(ahk.m1575k());
        ahk.m1566c(a == 0 ? 8 : 16);
        long j = ahk.m1574j();
        if (a == 0) {
            i = 4;
        }
        ahk.m1566c(i);
        int g = ahk.m1571g();
        return Pair.create(Long.valueOf(j), "" + ((char) (((g >> 10) & 31) + 96)) + ((char) (((g >> 5) & 31) + 96)) + ((char) ((g & 31) + 96)));
    }

    /* renamed from: a */
    private static C0145b m1183a(ahk ahk, int i, long j, int i2, String str, boolean z) {
        ahk.m1564b(12);
        int k = ahk.m1575k();
        C0145b c0145b = new C0145b(k);
        for (int i3 = 0; i3 < k; i3++) {
            int d = ahk.m1567d();
            int k2 = ahk.m1575k();
            ahb.m1515a(k2 > 0, "childAtomSize should be positive");
            int k3 = ahk.m1575k();
            if (k3 == afa.f961b || k3 == afa.f962c || k3 == afa.f955V || k3 == afa.af || k3 == afa.f963d || k3 == afa.f964e || k3 == afa.f965f) {
                afb.m1188a(ahk, d, k2, i, j, i2, c0145b, i3);
            } else if (k3 == afa.f968i || k3 == afa.f956W || k3 == afa.f970k || k3 == afa.f972m || k3 == afa.f974o || k3 == afa.f977r || k3 == afa.f975p || k3 == afa.f976q || k3 == afa.aq || k3 == afa.ar) {
                afb.m1187a(ahk, k3, d, k2, i, j, str, z, c0145b, i3);
            } else if (k3 == afa.ad) {
                c0145b.f990b = ado.m818a(Integer.toString(i), "application/ttml+xml", -1, j, str);
            } else if (k3 == afa.an) {
                c0145b.f990b = ado.m818a(Integer.toString(i), "application/x-quicktime-tx3g", -1, j, str);
            } else if (k3 == afa.ao) {
                c0145b.f990b = ado.m818a(Integer.toString(i), "application/x-mp4vtt", -1, j, str);
            } else if (k3 == afa.ap) {
                c0145b.f990b = ado.m819a(Integer.toString(i), "application/ttml+xml", -1, j, str, 0);
            }
            ahk.m1564b(d + k2);
        }
        return c0145b;
    }

    /* renamed from: a */
    private static void m1188a(ahk ahk, int i, int i2, int i3, long j, int i4, C0145b c0145b, int i5) {
        ahk.m1564b(i + 8);
        ahk.m1566c(24);
        int g = ahk.m1571g();
        int g2 = ahk.m1571g();
        Object obj = null;
        float f = 1.0f;
        ahk.m1566c(50);
        List list = null;
        String str = null;
        int d = ahk.m1567d();
        while (d - i < i2) {
            ahk.m1564b(d);
            int d2 = ahk.m1567d();
            int k = ahk.m1575k();
            if (k == 0 && ahk.m1567d() - i == i2) {
                break;
            }
            Object obj2;
            ahb.m1515a(k > 0, "childAtomSize should be positive");
            int k2 = ahk.m1575k();
            if (k2 == afa.f938E) {
                ahb.m1516b(str == null);
                str = "video/avc";
                C0144a a = afb.m1182a(ahk, d2);
                list = a.f986a;
                c0145b.f991c = a.f987b;
                if (obj == null) {
                    f = a.f988c;
                }
                obj2 = obj;
            } else if (k2 == afa.f939F) {
                ahb.m1516b(str == null);
                Pair b = afb.m1192b(ahk, d2);
                List list2 = (List) b.first;
                c0145b.f991c = ((Integer) b.second).intValue();
                list = list2;
                obj2 = obj;
                str = "video/hevc";
            } else if (k2 == afa.f966g) {
                ahb.m1516b(str == null);
                str = "video/3gpp";
                obj2 = obj;
            } else if (k2 == afa.f940G) {
                ahb.m1516b(str == null);
                Pair d3 = afb.m1197d(ahk, d2);
                String str2 = (String) d3.first;
                list = Collections.singletonList(d3.second);
                str = str2;
                obj2 = obj;
            } else if (k2 == afa.f951R) {
                c0145b.f989a[i5] = afb.m1185a(ahk, d2, k);
                obj2 = obj;
            } else if (k2 == afa.ac) {
                f = afb.m1193c(ahk, d2);
                obj2 = 1;
            } else {
                obj2 = obj;
            }
            d += k;
            obj = obj2;
        }
        if (str != null) {
            c0145b.f990b = ado.m815a(Integer.toString(i3), str, -1, -1, j, g, g2, list, i4, f);
        }
    }

    /* renamed from: a */
    private static C0144a m1182a(ahk ahk, int i) {
        ahk.m1564b((i + 8) + 4);
        int f = (ahk.m1570f() & 3) + 1;
        if (f == 3) {
            throw new IllegalStateException();
        }
        int i2;
        List arrayList = new ArrayList();
        float f2 = 1.0f;
        int f3 = ahk.m1570f() & 31;
        for (i2 = 0; i2 < f3; i2++) {
            arrayList.add(ahi.m1542a(ahk));
        }
        int f4 = ahk.m1570f();
        for (i2 = 0; i2 < f4; i2++) {
            arrayList.add(ahi.m1542a(ahk));
        }
        if (f3 > 0) {
            ahj ahj = new ahj((byte[]) arrayList.get(0));
            ahj.m1548a((f + 1) * 8);
            f2 = ahd.m1519a(ahj).f1461c;
        }
        return new C0144a(arrayList, f, f2);
    }

    /* renamed from: b */
    private static Pair<List<byte[]>, Integer> m1192b(ahk ahk, int i) {
        int i2;
        ahk.m1564b((i + 8) + 21);
        int f = ahk.m1570f() & 3;
        int f2 = ahk.m1570f();
        int d = ahk.m1567d();
        int i3 = 0;
        int i4 = 0;
        while (i3 < f2) {
            ahk.m1566c(1);
            int g = ahk.m1571g();
            int i5 = i4;
            for (i2 = 0; i2 < g; i2++) {
                i4 = ahk.m1571g();
                i5 += i4 + 4;
                ahk.m1566c(i4);
            }
            i3++;
            i4 = i5;
        }
        ahk.m1564b(d);
        Object obj = new byte[i4];
        i3 = 0;
        i2 = 0;
        while (i3 < f2) {
            ahk.m1566c(1);
            g = ahk.m1571g();
            i5 = i2;
            for (i2 = 0; i2 < g; i2++) {
                int g2 = ahk.m1571g();
                System.arraycopy(ahi.f1485a, 0, obj, i5, ahi.f1485a.length);
                i5 += ahi.f1485a.length;
                System.arraycopy(ahk.f1493a, ahk.m1567d(), obj, i5, g2);
                i5 += g2;
                ahk.m1566c(g2);
            }
            i3++;
            i2 = i5;
        }
        return Pair.create(i4 == 0 ? null : Collections.singletonList(obj), Integer.valueOf(f + 1));
    }

    /* renamed from: b */
    private static Pair<long[], long[]> m1191b(C0142a c0142a) {
        if (c0142a != null) {
            C0143b d = c0142a.m1174d(afa.f946M);
            if (d != null) {
                ahk ahk = d.aA;
                ahk.m1564b(8);
                int a = afa.m1169a(ahk.m1575k());
                int o = ahk.m1579o();
                Object obj = new long[o];
                Object obj2 = new long[o];
                for (int i = 0; i < o; i++) {
                    obj[i] = a == 1 ? ahk.m1580p() : ahk.m1574j();
                    obj2[i] = a == 1 ? ahk.m1576l() : (long) ahk.m1575k();
                    if (ahk.m1572h() != (short) 1) {
                        throw new IllegalArgumentException("Unsupported media rate.");
                    }
                    ahk.m1566c(2);
                }
                return Pair.create(obj, obj2);
            }
        }
        return Pair.create(null, null);
    }

    /* renamed from: a */
    private static afi m1185a(ahk ahk, int i, int i2) {
        int i3 = i + 8;
        afi afi = null;
        while (i3 - i < i2) {
            ahk.m1564b(i3);
            int k = ahk.m1575k();
            int k2 = ahk.m1575k();
            if (k2 == afa.f957X) {
                ahk.m1575k();
            } else if (k2 == afa.f952S) {
                ahk.m1566c(4);
                ahk.m1575k();
                ahk.m1575k();
            } else if (k2 == afa.f953T) {
                afi = afb.m1190b(ahk, i3, k);
            }
            i3 += k;
        }
        return afi;
    }

    /* renamed from: c */
    private static float m1193c(ahk ahk, int i) {
        ahk.m1564b(i + 8);
        return ((float) ahk.m1579o()) / ((float) ahk.m1579o());
    }

    /* renamed from: b */
    private static afi m1190b(ahk ahk, int i, int i2) {
        boolean z = true;
        int i3 = i + 8;
        while (i3 - i < i2) {
            ahk.m1564b(i3);
            int k = ahk.m1575k();
            if (ahk.m1575k() == afa.f954U) {
                ahk.m1566c(4);
                i3 = ahk.m1575k();
                if ((i3 >> 8) != 1) {
                    z = false;
                }
                i3 &= 255;
                byte[] bArr = new byte[16];
                ahk.m1562a(bArr, 0, bArr.length);
                return new afi(z, i3, bArr);
            }
            i3 += k;
        }
        return null;
    }

    /* renamed from: a */
    private static void m1187a(ahk ahk, int i, int i2, int i3, int i4, long j, String str, boolean z, C0145b c0145b, int i5) {
        ahk.m1564b(i2 + 8);
        int i6 = 0;
        if (z) {
            ahk.m1566c(8);
            i6 = ahk.m1571g();
            ahk.m1566c(6);
        } else {
            ahk.m1566c(16);
        }
        int g = ahk.m1571g();
        int g2 = ahk.m1571g();
        ahk.m1566c(4);
        int m = ahk.m1577m();
        if (i6 > 0) {
            ahk.m1566c(16);
            if (i6 == 2) {
                ahk.m1566c(20);
            }
        }
        String str2 = null;
        if (i == afa.f970k) {
            str2 = "audio/ac3";
        } else if (i == afa.f972m) {
            str2 = "audio/eac3";
        } else if (i == afa.f974o) {
            str2 = "audio/vnd.dts";
        } else if (i == afa.f975p || i == afa.f976q) {
            str2 = "audio/vnd.dts.hd";
        } else if (i == afa.f977r) {
            str2 = "audio/vnd.dts.hd;profile=lbr";
        } else if (i == afa.aq) {
            str2 = "audio/3gpp";
        } else if (i == afa.ar) {
            str2 = "audio/amr-wb";
        }
        Object obj = null;
        int d = ahk.m1567d();
        String str3 = str2;
        while (d - i2 < i3) {
            ahk.m1564b(d);
            int k = ahk.m1575k();
            ahb.m1515a(k > 0, "childAtomSize should be positive");
            int k2 = ahk.m1575k();
            if (i == afa.f968i || i == afa.f956W) {
                Object obj2;
                i6 = -1;
                if (k2 == afa.f940G) {
                    i6 = d;
                } else if (z && k2 == afa.f969j) {
                    i6 = afb.m1194c(ahk, d, k);
                }
                if (i6 != -1) {
                    Pair d2 = afb.m1197d(ahk, i6);
                    str3 = (String) d2.first;
                    obj2 = (byte[]) d2.second;
                    if ("audio/mp4a-latm".equals(str3)) {
                        Pair a = ahd.m1520a((byte[]) obj2);
                        m = ((Integer) a.first).intValue();
                        g = ((Integer) a.second).intValue();
                    }
                } else {
                    if (k2 == afa.f951R) {
                        c0145b.f989a[i5] = afb.m1185a(ahk, d, k);
                    }
                    obj2 = obj;
                }
                obj = obj2;
            } else if (i == afa.f970k && k2 == afa.f971l) {
                ahk.m1564b(d + 8);
                c0145b.f990b = aha.m1507a(ahk, Integer.toString(i4), j, str);
                return;
            } else if (i == afa.f972m && k2 == afa.f973n) {
                ahk.m1564b(d + 8);
                c0145b.f990b = aha.m1510b(ahk, Integer.toString(i4), j, str);
                return;
            } else if ((i == afa.f974o || i == afa.f977r || i == afa.f975p || i == afa.f976q) && k2 == afa.f978s) {
                c0145b.f990b = ado.m816a(Integer.toString(i4), str3, -1, -1, j, g, m, null, str);
                return;
            }
            d += k;
        }
        if (str3 != null) {
            c0145b.f990b = ado.m816a(Integer.toString(i4), str3, -1, g2, j, g, m, obj == null ? null : Collections.singletonList(obj), str);
        }
    }

    /* renamed from: c */
    private static int m1194c(ahk ahk, int i, int i2) {
        int d = ahk.m1567d();
        while (d - i < i2) {
            ahk.m1564b(d);
            int k = ahk.m1575k();
            ahb.m1515a(k > 0, "childAtomSize should be positive");
            if (ahk.m1575k() == afa.f940G) {
                return d;
            }
            d += k;
        }
        return -1;
    }

    /* renamed from: d */
    private static Pair<String, byte[]> m1197d(ahk ahk, int i) {
        Object obj = null;
        ahk.m1564b((i + 8) + 4);
        ahk.m1566c(1);
        int f = ahk.m1570f();
        while (f > 127) {
            f = ahk.m1570f();
        }
        ahk.m1566c(2);
        f = ahk.m1570f();
        if ((f & 128) != 0) {
            ahk.m1566c(2);
        }
        if ((f & 64) != 0) {
            ahk.m1566c(ahk.m1571g());
        }
        if ((f & 32) != 0) {
            ahk.m1566c(2);
        }
        ahk.m1566c(1);
        f = ahk.m1570f();
        while (f > 127) {
            f = ahk.m1570f();
        }
        switch (ahk.m1570f()) {
            case 32:
                obj = "video/mp4v-es";
                break;
            case 33:
                obj = "video/avc";
                break;
            case 35:
                obj = "video/hevc";
                break;
            case 64:
            case 102:
            case 103:
            case 104:
                obj = "audio/mp4a-latm";
                break;
            case 107:
                return Pair.create("audio/mpeg", null);
            case 165:
                obj = "audio/ac3";
                break;
            case 166:
                obj = "audio/eac3";
                break;
            case 169:
            case 172:
                return Pair.create("audio/vnd.dts", null);
            case 170:
            case 171:
                return Pair.create("audio/vnd.dts.hd", null);
        }
        ahk.m1566c(12);
        ahk.m1566c(1);
        int f2 = ahk.m1570f();
        f = f2 & 127;
        while (f2 > 127) {
            f2 = ahk.m1570f();
            f = (f << 8) | (f2 & 127);
        }
        Object obj2 = new byte[f];
        ahk.m1562a(obj2, 0, f);
        return Pair.create(obj, obj2);
    }
}
