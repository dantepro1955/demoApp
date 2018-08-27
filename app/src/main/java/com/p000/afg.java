package com.p000;

import java.io.IOException;

/* compiled from: Sniffer */
/* renamed from: afg */
final class afg {
    /* renamed from: a */
    private static final int[] f1043a = new int[]{ahr.m1606c("isom"), ahr.m1606c("iso2"), ahr.m1606c("avc1"), ahr.m1606c("hvc1"), ahr.m1606c("hev1"), ahr.m1606c("mp41"), ahr.m1606c("mp42"), ahr.m1606c("3g2a"), ahr.m1606c("3g2b"), ahr.m1606c("3gr6"), ahr.m1606c("3gs6"), ahr.m1606c("3ge6"), ahr.m1606c("3gg6"), ahr.m1606c("M4V "), ahr.m1606c("M4A "), ahr.m1606c("f4v "), ahr.m1606c("kddi"), ahr.m1606c("M4VP"), ahr.m1606c("qt  "), ahr.m1606c("MSNV")};

    /* renamed from: a */
    public static boolean m1245a(aeh aeh) throws IOException, InterruptedException {
        return afg.m1246a(aeh, 4096, true);
    }

    /* renamed from: b */
    public static boolean m1247b(aeh aeh) throws IOException, InterruptedException {
        return afg.m1246a(aeh, 128, false);
    }

    /* renamed from: a */
    private static boolean m1246a(aeh aeh, int i, boolean z) throws IOException, InterruptedException {
        long d = aeh.mo123d();
        if (d == -1 || d > ((long) i)) {
            d = (long) i;
        }
        int i2 = (int) d;
        ahk ahk = new ahk(64);
        Object obj = null;
        boolean z2 = false;
        long l;
        for (int i3 = 0; i3 < i2; i3 = (int) (((long) i3) + l)) {
            int i4;
            aeh.mo122c(ahk.f1493a, 0, 8);
            ahk.m1564b(0);
            long j = ahk.m1574j();
            int k = ahk.m1575k();
            if (j == 1) {
                aeh.mo122c(ahk.f1493a, 8, 8);
                i4 = 16;
                l = ahk.m1576l();
            } else {
                long j2 = j;
                i4 = 8;
                l = j2;
            }
            if (l < ((long) i4)) {
                return false;
            }
            i4 = ((int) l) - i4;
            if (k != afa.f960a) {
                if (k != afa.f941H) {
                    if (i4 != 0) {
                        if (((long) i3) + l >= ((long) i2)) {
                            break;
                        }
                        aeh.mo121c(i4);
                    } else {
                        continue;
                    }
                } else {
                    z2 = true;
                    break;
                }
            } else if (i4 < 8) {
                return false;
            } else {
                int i5 = (i4 - 8) / 4;
                aeh.mo122c(ahk.f1493a, 0, (i5 + 2) * 4);
                for (i4 = 0; i4 < i5 + 2; i4++) {
                    if (i4 != 1 && afg.m1244a(ahk.m1575k())) {
                        obj = 1;
                        break;
                    }
                }
                if (obj == null) {
                    return false;
                }
            }
        }
        if (obj == null || z != r3) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private static boolean m1244a(int i) {
        if ((i >>> 8) == ahr.m1606c("3gp")) {
            return true;
        }
        for (int i2 : f1043a) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }
}
