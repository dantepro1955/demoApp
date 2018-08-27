package com.p000;

import com.facebook.imageutils.JfifUtil;
import com.facebook.stetho.server.http.HttpStatus;
import com.inmobi.androidsdk.IMBrowserActivity;
import com.millennialmedia.InterstitialAd.InterstitialErrorStatus;

/* compiled from: Eia608Parser */
/* renamed from: agj */
public final class agj {
    /* renamed from: a */
    private static final int[] f1372a = new int[]{32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, 250, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 231, 247, 209, 241, 9632};
    /* renamed from: b */
    private static final int[] f1373b = new int[]{174, 176, 189, 191, 8482, 162, 163, 9834, 224, 32, 232, IMBrowserActivity.CLOSE_REGION_VIEW_ID, 234, 238, 244, 251};
    /* renamed from: c */
    private static final int[] f1374c = new int[]{193, InterstitialErrorStatus.EXPIRED, 211, JfifUtil.MARKER_SOS, 220, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, JfifUtil.MARKER_SOFn, 194, 199, HttpStatus.HTTP_OK, InterstitialErrorStatus.NOT_LOADED, InterstitialErrorStatus.ALREADY_LOADED, 235, 206, 207, 239, 212, JfifUtil.MARKER_EOI, 249, 219, 171, 187};
    /* renamed from: d */
    private static final int[] f1375d = new int[]{195, 227, 205, 204, 236, 210, 242, 213, 245, 123, 125, 92, 94, 95, 124, 126, 196, 228, 214, 246, 223, 165, 164, 9474, 197, 229, JfifUtil.MARKER_SOI, 248, 9484, 9488, 9492, 9496};

    /* renamed from: a */
    public static boolean m1457a(int i, int i2, ahk ahk) {
        if (i != 4 || i2 < 8) {
            return false;
        }
        int d = ahk.m1567d();
        int f = ahk.m1570f();
        int g = ahk.m1571g();
        int k = ahk.m1575k();
        int f2 = ahk.m1570f();
        ahk.m1564b(d);
        if (f == 181 && g == 49 && k == 1195456820 && f2 == 3) {
            return true;
        }
        return false;
    }
}
