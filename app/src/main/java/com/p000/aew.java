package com.p000;

import android.util.Pair;
import com.facebook.imageutils.JfifUtil;
import com.facebook.stetho.common.Utf8Charset;
import java.io.IOException;
import java.nio.charset.Charset;

/* compiled from: Id3Util */
/* renamed from: aew */
final class aew {
    /* renamed from: a */
    private static final int f908a = ahr.m1606c("ID3");
    /* renamed from: b */
    private static final Charset[] f909b = new Charset[]{Charset.forName("ISO-8859-1"), Charset.forName("UTF-16LE"), Charset.forName("UTF-16BE"), Charset.forName(Utf8Charset.NAME)};

    /* renamed from: a */
    public static ael m1139a(aeh aeh) throws IOException, InterruptedException {
        ahk ahk = new ahk(10);
        ael ael = null;
        int i = 0;
        while (true) {
            aeh.mo122c(ahk.f1493a, 0, 10);
            ahk.m1564b(0);
            if (ahk.m1573i() != f908a) {
                aeh.mo114a();
                aeh.mo121c(i);
                return ael;
            }
            int f = ahk.m1570f();
            int f2 = ahk.m1570f();
            int f3 = ahk.m1570f();
            int n = ahk.m1578n();
            if (ael == null && aew.m1143a(f, f2, f3, n)) {
                byte[] bArr = new byte[n];
                aeh.mo122c(bArr, 0, n);
                ael = aew.m1140a(new ahk(bArr), f, f3);
            } else {
                aeh.mo121c(n);
            }
            i += n + 10;
        }
    }

    /* renamed from: a */
    private static boolean m1143a(int i, int i2, int i3, int i4) {
        return i2 != 255 && i >= 2 && i <= 4 && i4 <= 3145728 && ((i != 2 || ((i3 & 63) == 0 && (i3 & 64) == 0)) && ((i != 3 || (i3 & 31) == 0) && (i != 4 || (i3 & 15) == 0)));
    }

    /* renamed from: a */
    private static ael m1140a(ahk ahk, int i, int i2) {
        aew.m1146b(ahk, i, i2);
        ahk.m1564b(0);
        int n;
        if (i != 3 || (i2 & 64) == 0) {
            if (i == 4 && (i2 & 64) != 0) {
                if (ahk.m1563b() < 4) {
                    return null;
                }
                n = ahk.m1578n();
                if (n < 6 || n > ahk.m1563b() + 4) {
                    return null;
                }
                ahk.m1564b(n);
            }
        } else if (ahk.m1563b() < 4) {
            return null;
        } else {
            n = ahk.m1579o();
            if (n > ahk.m1563b()) {
                return null;
            }
            if (n >= 6) {
                ahk.m1566c(2);
                int o = ahk.m1579o();
                ahk.m1564b(4);
                ahk.m1559a(ahk.m1565c() - o);
                if (ahk.m1563b() < n) {
                    return null;
                }
            }
            ahk.m1566c(n);
        }
        while (true) {
            Pair a = aew.m1141a(i, ahk);
            if (a == null) {
                return null;
            }
            if (((String) a.first).length() > 3) {
                ael a2 = ael.m1078a(((String) a.first).substring(3), (String) a.second);
                if (a2 != null) {
                    return a2;
                }
            }
        }
    }

    /* renamed from: a */
    private static Pair<String, String> m1141a(int i, ahk ahk) {
        int g;
        while (true) {
            int i2;
            if (i == 2) {
                if (ahk.m1563b() < 6) {
                    return null;
                }
                String a = ahk.m1557a(3, Charset.forName("US-ASCII"));
                if (a.equals("\u0000\u0000\u0000")) {
                    return null;
                }
                i2 = ahk.m1573i();
                if (i2 == 0 || i2 > ahk.m1563b()) {
                    return null;
                }
                if (a.equals("COM")) {
                    break;
                }
                ahk.m1566c(i2);
            } else if (ahk.m1563b() < 10) {
                return null;
            } else {
                String a2 = ahk.m1557a(4, Charset.forName("US-ASCII"));
                if (a2.equals("\u0000\u0000\u0000\u0000")) {
                    return null;
                }
                i2 = i == 4 ? ahk.m1578n() : ahk.m1579o();
                if (i2 == 0 || i2 > ahk.m1563b() - 2) {
                    return null;
                }
                g = ahk.m1571g();
                if ((i != 4 || (g & 12) == 0) && (i != 3 || (g & JfifUtil.MARKER_SOFn) == 0)) {
                    g = 0;
                } else {
                    g = 1;
                }
                if (g == 0 && a2.equals("COMM")) {
                    break;
                }
                ahk.m1566c(i2);
            }
        }
        g = ahk.m1570f();
        if (g < 0 || g >= f909b.length) {
            return null;
        }
        Pair<String, String> create;
        String[] split = ahk.m1557a(i2 - 1, f909b[g]).split("\u0000");
        if (split.length == 2) {
            create = Pair.create(split[0], split[1]);
        } else {
            create = null;
        }
        return create;
    }

    /* renamed from: b */
    private static boolean m1146b(ahk ahk, int i, int i2) {
        if (i != 4) {
            if ((i2 & 128) != 0) {
                Object obj = ahk.f1493a;
                int length = obj.length;
                int i3 = false;
                while (i3 + 1 < length) {
                    if ((obj[i3] & 255) == 255 && obj[i3 + 1] == (byte) 0) {
                        System.arraycopy(obj, i3 + 2, obj, i3 + 1, (length - i3) - 2);
                        length--;
                    }
                    i3++;
                }
                ahk.m1559a(length);
            }
        } else if (aew.m1144a(ahk, false)) {
            aew.m1145b(ahk, false);
        } else if (!aew.m1144a(ahk, true)) {
            return false;
        } else {
            aew.m1145b(ahk, true);
        }
        return true;
    }

    /* renamed from: a */
    private static boolean m1144a(ahk ahk, boolean z) {
        ahk.m1564b(0);
        while (ahk.m1563b() >= 10) {
            if (ahk.m1575k() == 0) {
                return true;
            }
            long j = ahk.m1574j();
            if (!z) {
                if ((8421504 & j) != 0) {
                    return false;
                }
                j = (((j >> 24) & 127) << 21) | (((j & 127) | (((j >> 8) & 127) << 7)) | (((j >> 16) & 127) << 14));
            }
            if (j > ((long) (ahk.m1563b() - 2))) {
                return false;
            }
            if ((ahk.m1571g() & 1) != 0 && ahk.m1563b() < 4) {
                return false;
            }
            ahk.m1566c((int) j);
        }
        return true;
    }

    /* renamed from: b */
    private static void m1145b(ahk ahk, boolean z) {
        ahk.m1564b(0);
        byte[] bArr = ahk.f1493a;
        while (ahk.m1563b() >= 10 && ahk.m1575k() != 0) {
            int d;
            int i;
            int o = z ? ahk.m1579o() : ahk.m1578n();
            int g = ahk.m1571g();
            if ((g & 1) != 0) {
                d = ahk.m1567d();
                System.arraycopy(bArr, d + 4, bArr, d, ahk.m1563b() - 4);
                d = o - 4;
                i = g & -2;
                ahk.m1559a(ahk.m1565c() - 4);
            } else {
                i = g;
                d = o;
            }
            if ((i & 2) != 0) {
                o = ahk.m1567d() + 1;
                int i2 = 0;
                int i3 = o;
                while (i2 + 1 < d) {
                    if ((bArr[o - 1] & 255) == 255 && bArr[o] == (byte) 0) {
                        o++;
                        d--;
                    }
                    int i4 = i3 + 1;
                    int i5 = o + 1;
                    bArr[i3] = bArr[o];
                    i2++;
                    i3 = i4;
                    o = i5;
                }
                ahk.m1559a(ahk.m1565c() - (o - i3));
                System.arraycopy(bArr, o, bArr, i3, ahk.m1563b() - o);
                o = i & -3;
            } else {
                o = i;
            }
            if (o != g || z) {
                i = ahk.m1567d() - 6;
                aew.m1142a(bArr, i, d);
                bArr[i + 4] = (byte) (o >> 8);
                bArr[i + 5] = (byte) (o & 255);
            }
            ahk.m1566c(d);
        }
    }

    /* renamed from: a */
    private static void m1142a(byte[] bArr, int i, int i2) {
        bArr[i] = (byte) ((i2 >> 21) & 127);
        bArr[i + 1] = (byte) ((i2 >> 14) & 127);
        bArr[i + 2] = (byte) ((i2 >> 7) & 127);
        bArr[i + 3] = (byte) (i2 & 127);
    }
}
