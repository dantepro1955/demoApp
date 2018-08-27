package com.p000;

import android.os.Build;
import android.os.Build.VERSION;
import com.facebook.imageutils.JfifUtil;
import java.util.Calendar;
import p000.cyt.C4669a;

/* renamed from: drj */
public final class drj {
    /* renamed from: t */
    private static String[][] f22704t;
    /* renamed from: u */
    private static int f22705u = 420611619;
    /* renamed from: v */
    private static int f22706v = 418947094;
    /* renamed from: w */
    private static int f22707w = 1434515842;
    /* renamed from: a */
    private final String f22708a;
    /* renamed from: b */
    private final String f22709b;
    /* renamed from: c */
    private final byte[] f22710c;
    /* renamed from: d */
    private final String f22711d;
    /* renamed from: e */
    private final int f22712e;
    /* renamed from: f */
    private final boolean f22713f;
    /* renamed from: g */
    private final Object f22714g;
    /* renamed from: h */
    private final String f22715h;
    /* renamed from: i */
    private final czl f22716i;
    /* renamed from: j */
    private String f22717j = null;
    /* renamed from: k */
    private boolean f22718k = false;
    /* renamed from: l */
    private String f22719l;
    /* renamed from: m */
    private String f22720m;
    /* renamed from: n */
    private String f22721n;
    /* renamed from: o */
    private String f22722o;
    /* renamed from: p */
    private String f22723p;
    /* renamed from: q */
    private String f22724q;
    /* renamed from: r */
    private String f22725r;
    /* renamed from: s */
    private C4669a f22726s;

    static {
        r0 = new String[2][];
        r0[0] = new String[]{"NVC_ASR_CMD", "NVC_DATA_UPLOAD_CMD", "NVC_LOG_REVISION_CMD", "NVC_RESET_USER_PROFILE_CMD", "NVC_APPSERVER_CMD", "NVC_GET_DICTATION_LANGUAGE", "NVC_TTS_CMD"};
        r0[1] = new String[]{"DRAGON_NLU_ASR_CMD", "DRAGON_NLU_DATA_UPLOAD_CMD", "DRAGON_NLU_LOG_REVISION_CMD", "DRAGON_NLU_RESET_USER_PROFILE_CMD", "DRAGON_NLU_APPSERVER_CMD", "ACADIA_GET_DICTATION_LANGUAGE_V2", "DRAGON_NLU_TTS_CMD"};
        f22704t = r0;
    }

    public drj(Object obj, String str, String str2, int i, String str3, boolean z, String str4, byte[] bArr, C4669a c4669a) {
        this.f22708a = str4;
        this.f22709b = str;
        this.f22710c = bArr;
        this.f22711d = str2;
        this.f22712e = i;
        this.f22713f = z;
        this.f22714g = obj;
        this.f22716i = new czl(obj);
        this.f22715h = this.f22716i.m25839c();
        this.f22719l = str3;
        this.f22726s = c4669a;
        m28845a(this.f22726s);
    }

    /* renamed from: a */
    private void m28845a(C4669a c4669a) {
        this.f22720m = f22704t[c4669a.m25664a()][0];
        this.f22721n = f22704t[c4669a.m25664a()][1];
        this.f22722o = f22704t[c4669a.m25664a()][2];
        this.f22723p = f22704t[c4669a.m25664a()][3];
        this.f22724q = f22704t[c4669a.m25664a()][4];
        String[][] strArr = f22704t;
        c4669a.m25664a();
        this.f22725r = f22704t[c4669a.m25664a()][6];
    }

    /* renamed from: n */
    public static String m28846n() {
        return qt.m33920b();
    }

    /* renamed from: q */
    public static String m28847q() {
        return qt.m33919a();
    }

    /* renamed from: a */
    public final Object m28848a() {
        return this.f22714g;
    }

    /* renamed from: a */
    public final byte[] m28849a(byte[] bArr) {
        int[] iArr = new int[]{26, 233, 231, 106, 177, 47, 122, 185, 154, 158, 116, 173, 122, 152, 94, 156, 182, 175, 122, 187, 114, 37, 234, 222, 155, 36, 165, 106, JfifUtil.MARKER_RST7, 171, 41, 93};
        byte[] bArr2 = new byte[96];
        czl czl = this.f22716i;
        int i = Calendar.getInstance().get(13);
        czl czl2 = this.f22716i;
        int i2 = (i + Calendar.getInstance().get(14)) + 1793583386;
        byte[] f = this.f22716i.m25842f();
        byte[] g = this.f22716i.m25843g();
        int[] iArr2 = new int[f.length];
        int[] iArr3 = new int[g.length];
        for (i = 0; i < iArr2.length; i++) {
            iArr2[i] = f[i];
            if (iArr2[i] < 0) {
                iArr2[i] = iArr2[i] + 256;
            }
        }
        for (i = 0; i < iArr3.length; i++) {
            iArr3[i] = g[i];
            if (iArr3[i] < 0) {
                iArr3[i] = iArr3[i] + 256;
            }
        }
        int i3 = i2;
        int[] iArr4 = iArr2;
        long j = 0;
        int[] iArr5 = iArr4;
        for (int i4 = 0; i4 < 32; i4++) {
            i3 = ((i3 * (f22705u - f22706v)) + f22707w) - f22705u;
            if (iArr5 == null) {
                j = (long) i3;
            } else if (i4 >= iArr5.length) {
                iArr5 = null;
            } else {
                j = (j >> 8) + ((long) ((iArr[i4] + iArr5[i4]) + (i3 & 255)));
            }
            bArr2[i4] = (byte) ((int) j);
        }
        j = 0;
        iArr4 = iArr3;
        int i5 = i3;
        i3 = 0;
        iArr5 = iArr4;
        while (i3 < 64) {
            i5 = ((i5 * (f22705u - f22706v)) + f22707w) - f22705u;
            if (iArr5 == null) {
                j = (long) i5;
            } else if (i3 >= iArr5.length || i3 >= iArr.length) {
                iArr5 = null;
            } else {
                j = (j >> 8) + ((long) ((iArr[i3] + iArr5[i3]) + (i5 & 255)));
            }
            bArr2[i3 + 32] = (byte) ((int) j);
            i3++;
        }
        long j2 = (long) ((((f22705u - f22706v) * i5) + f22707w) - f22705u);
        j2 = j2 == 0 ? 1 : j2 & 127;
        for (int i6 = 0; i6 < bArr2.length; i6++) {
            while (true) {
                j2 = ((((j2 >> 6) ^ (((j2 >> 1) ^ j2) ^ (j2 >> 3))) & 1) << 6) | (j2 >> 1);
                if (j2 <= ((long) bArr2.length) && j2 >= 0) {
                    break;
                }
            }
            if (j2 > 26) {
                bArr[((int) j2) + 3] = bArr2[i6];
            } else {
                bArr[((int) j2) - 1] = bArr2[i6];
            }
        }
        bArr[26] = (byte) (i2 & 255);
        bArr[27] = (byte) ((i2 >> 8) & 255);
        bArr[28] = (byte) ((i2 >> 16) & 255);
        bArr[29] = (byte) ((i2 >> 24) & 255);
        return bArr;
    }

    /* renamed from: b */
    public final String m28850b() {
        return this.f22708a;
    }

    /* renamed from: c */
    public final byte[] m28851c() {
        return this.f22710c;
    }

    /* renamed from: d */
    public final String m28852d() {
        return this.f22711d;
    }

    /* renamed from: e */
    public final String m28853e() {
        return this.f22709b;
    }

    /* renamed from: f */
    public final int m28854f() {
        return this.f22712e;
    }

    /* renamed from: g */
    public final String m28855g() {
        return this.f22719l;
    }

    /* renamed from: h */
    public final boolean m28856h() {
        return this.f22713f;
    }

    /* renamed from: i */
    public final String m28857i() {
        String a = this.f22716i.m25837a();
        return a == null ? "unknown" : a;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: j */
    public final String m28858j() {
        /*
        r2 = this;
        r0 = r2.f22716i;
        r0 = java.util.Locale.getDefault();
        if (r0 == 0) goto L_0x0019;
    L_0x0008:
        r0 = r0.toString();
        if (r0 == 0) goto L_0x0019;
    L_0x000e:
        r1 = r0.length();
        if (r1 <= 0) goto L_0x0019;
    L_0x0014:
        if (r0 != 0) goto L_0x0018;
    L_0x0016:
        r0 = "unknown";
    L_0x0018:
        return r0;
    L_0x0019:
        r0 = 0;
        goto L_0x0014;
        */
        throw new UnsupportedOperationException("Method not decompiled: drj.j():java.lang.String");
    }

    /* renamed from: k */
    public final String m28859k() {
        czl czl = this.f22716i;
        String str = Build.MODEL;
        return str == null ? "unknown" : str;
    }

    /* renamed from: l */
    public final String m28860l() {
        czl czl = this.f22716i;
        String str = VERSION.RELEASE;
        return str == null ? "unknown" : str;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: m */
    public final String m28861m() {
        /*
        r2 = this;
        r0 = r2.f22716i;
        r0 = java.util.Locale.getDefault();
        if (r0 == 0) goto L_0x0019;
    L_0x0008:
        r0 = r0.getCountry();
        if (r0 == 0) goto L_0x0019;
    L_0x000e:
        r1 = r0.length();
        if (r1 <= 0) goto L_0x0019;
    L_0x0014:
        if (r0 != 0) goto L_0x0018;
    L_0x0016:
        r0 = "unknown";
    L_0x0018:
        return r0;
    L_0x0019:
        r0 = 0;
        goto L_0x0014;
        */
        throw new UnsupportedOperationException("Method not decompiled: drj.m():java.lang.String");
    }

    /* renamed from: o */
    public final String m28862o() {
        String b = this.f22716i.m25838b();
        return b == null ? "unknown" : b;
    }

    /* renamed from: p */
    public final String m28863p() {
        return this.f22715h == null ? "unknown" : this.f22715h;
    }

    /* renamed from: r */
    public final rg m28864r() {
        return this.f22716i.m25841e();
    }

    /* renamed from: s */
    public final rg m28865s() {
        return this.f22716i.m25840d();
    }

    /* renamed from: t */
    public final String m28866t() {
        if (!this.f22718k) {
            this.f22718k = true;
            try {
                String str = this.f22711d;
                int i = this.f22712e;
                this.f22717j = dnl.m28238g();
            } catch (RuntimeException e) {
                czl czl = this.f22716i;
                this.f22717j = null;
            }
        }
        return this.f22717j;
    }

    /* renamed from: u */
    public final String m28867u() {
        return this.f22720m;
    }

    /* renamed from: v */
    public final String m28868v() {
        return this.f22721n;
    }

    /* renamed from: w */
    public final String m28869w() {
        return this.f22722o;
    }

    /* renamed from: x */
    public final String m28870x() {
        return this.f22725r;
    }
}
