package com.p000;

import android.util.Pair;
import android.util.SparseArray;
import com.facebook.imageutils.JfifUtil;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import p000.aea.C0121b;
import p000.aea.C0122c;

/* compiled from: WebmExtractor */
/* renamed from: agf */
public final class agf implements aeg {
    /* renamed from: a */
    private static final byte[] f1279a = new byte[]{Framer.STDOUT_FRAME_PREFIX, (byte) 10, (byte) 48, (byte) 48, (byte) 58, (byte) 48, (byte) 48, (byte) 58, (byte) 48, (byte) 48, (byte) 44, (byte) 48, (byte) 48, (byte) 48, (byte) 32, Framer.STDIN_FRAME_PREFIX, Framer.STDIN_FRAME_PREFIX, (byte) 62, (byte) 32, (byte) 48, (byte) 48, (byte) 58, (byte) 48, (byte) 48, (byte) 58, (byte) 48, (byte) 48, (byte) 44, (byte) 48, (byte) 48, (byte) 48, (byte) 10};
    /* renamed from: b */
    private static final byte[] f1280b = new byte[]{(byte) 32, (byte) 32, (byte) 32, (byte) 32, (byte) 32, (byte) 32, (byte) 32, (byte) 32, (byte) 32, (byte) 32, (byte) 32, (byte) 32};
    /* renamed from: A */
    private ahf f1281A;
    /* renamed from: B */
    private ahf f1282B;
    /* renamed from: C */
    private boolean f1283C;
    /* renamed from: D */
    private int f1284D;
    /* renamed from: E */
    private long f1285E;
    /* renamed from: F */
    private long f1286F;
    /* renamed from: G */
    private int f1287G;
    /* renamed from: H */
    private int f1288H;
    /* renamed from: I */
    private int[] f1289I;
    /* renamed from: J */
    private int f1290J;
    /* renamed from: K */
    private int f1291K;
    /* renamed from: L */
    private int f1292L;
    /* renamed from: M */
    private int f1293M;
    /* renamed from: N */
    private boolean f1294N;
    /* renamed from: O */
    private int f1295O;
    /* renamed from: P */
    private int f1296P;
    /* renamed from: Q */
    private boolean f1297Q;
    /* renamed from: R */
    private boolean f1298R;
    /* renamed from: S */
    private aei f1299S;
    /* renamed from: c */
    private final agb f1300c;
    /* renamed from: d */
    private final age f1301d;
    /* renamed from: e */
    private final SparseArray<C0162b> f1302e;
    /* renamed from: f */
    private final ahk f1303f;
    /* renamed from: g */
    private final ahk f1304g;
    /* renamed from: h */
    private final ahk f1305h;
    /* renamed from: i */
    private final ahk f1306i;
    /* renamed from: j */
    private final ahk f1307j;
    /* renamed from: k */
    private final ahk f1308k;
    /* renamed from: l */
    private final ahk f1309l;
    /* renamed from: m */
    private long f1310m;
    /* renamed from: n */
    private long f1311n;
    /* renamed from: o */
    private long f1312o;
    /* renamed from: p */
    private long f1313p;
    /* renamed from: q */
    private long f1314q;
    /* renamed from: r */
    private C0162b f1315r;
    /* renamed from: s */
    private boolean f1316s;
    /* renamed from: t */
    private boolean f1317t;
    /* renamed from: u */
    private int f1318u;
    /* renamed from: v */
    private long f1319v;
    /* renamed from: w */
    private boolean f1320w;
    /* renamed from: x */
    private long f1321x;
    /* renamed from: y */
    private long f1322y;
    /* renamed from: z */
    private long f1323z;

    /* compiled from: WebmExtractor */
    /* renamed from: agf$a */
    final class C0161a implements agc {
        /* renamed from: a */
        final /* synthetic */ agf f1261a;

        private C0161a(agf agf) {
            this.f1261a = agf;
        }

        /* renamed from: a */
        public int mo172a(int i) {
            return this.f1261a.m1442a(i);
        }

        /* renamed from: b */
        public boolean mo178b(int i) {
            return this.f1261a.m1452b(i);
        }

        /* renamed from: a */
        public void mo176a(int i, long j, long j2) throws adq {
            this.f1261a.m1447a(i, j, j2);
        }

        /* renamed from: c */
        public void mo179c(int i) throws adq {
            this.f1261a.m1453c(i);
        }

        /* renamed from: a */
        public void mo175a(int i, long j) throws adq {
            this.f1261a.m1446a(i, j);
        }

        /* renamed from: a */
        public void mo173a(int i, double d) throws adq {
            this.f1261a.m1444a(i, d);
        }

        /* renamed from: a */
        public void mo177a(int i, String str) throws adq {
            this.f1261a.m1448a(i, str);
        }

        /* renamed from: a */
        public void mo174a(int i, int i2, aeh aeh) throws IOException, InterruptedException {
            this.f1261a.m1445a(i, i2, aeh);
        }
    }

    /* compiled from: WebmExtractor */
    /* renamed from: agf$b */
    static final class C0162b {
        /* renamed from: a */
        public String f1262a;
        /* renamed from: b */
        public int f1263b;
        /* renamed from: c */
        public int f1264c;
        /* renamed from: d */
        public int f1265d;
        /* renamed from: e */
        public boolean f1266e;
        /* renamed from: f */
        public byte[] f1267f;
        /* renamed from: g */
        public byte[] f1268g;
        /* renamed from: h */
        public byte[] f1269h;
        /* renamed from: i */
        public int f1270i;
        /* renamed from: j */
        public int f1271j;
        /* renamed from: k */
        public int f1272k;
        /* renamed from: l */
        public int f1273l;
        /* renamed from: m */
        public long f1274m;
        /* renamed from: n */
        public long f1275n;
        /* renamed from: o */
        public aep f1276o;
        /* renamed from: p */
        public int f1277p;
        /* renamed from: q */
        private String f1278q;

        private C0162b() {
            this.f1270i = -1;
            this.f1271j = -1;
            this.f1272k = 1;
            this.f1273l = 8000;
            this.f1274m = 0;
            this.f1275n = 0;
            this.f1278q = "eng";
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        /* renamed from: a */
        public void m1428a(p000.aei r12, int r13, long r14) throws p000.adq {
            /*
            r11 = this;
            r0 = 0;
            r4 = 3;
            r5 = 8;
            r2 = -1;
            r1 = r11.f1262a;
            r3 = r1.hashCode();
            switch(r3) {
                case -2095576542: goto L_0x004c;
                case -2095575984: goto L_0x0038;
                case -1784763192: goto L_0x00ae;
                case -1730367663: goto L_0x006a;
                case -1482641357: goto L_0x008a;
                case -538363189: goto L_0x0042;
                case -538363109: goto L_0x0056;
                case -356037306: goto L_0x00d2;
                case 62923557: goto L_0x007f;
                case 62923603: goto L_0x0096;
                case 62927045: goto L_0x00ba;
                case 82338133: goto L_0x001a;
                case 82338134: goto L_0x0024;
                case 542569478: goto L_0x00c6;
                case 855502857: goto L_0x0060;
                case 1422270023: goto L_0x00de;
                case 1809237540: goto L_0x002e;
                case 1950749482: goto L_0x00a2;
                case 1951062397: goto L_0x0074;
                default: goto L_0x000e;
            };
        L_0x000e:
            r1 = r2;
        L_0x000f:
            switch(r1) {
                case 0: goto L_0x00ea;
                case 1: goto L_0x0111;
                case 2: goto L_0x0116;
                case 3: goto L_0x011b;
                case 4: goto L_0x011b;
                case 5: goto L_0x011b;
                case 6: goto L_0x012b;
                case 7: goto L_0x014a;
                case 8: goto L_0x0169;
                case 9: goto L_0x0176;
                case 10: goto L_0x01b5;
                case 11: goto L_0x01c1;
                case 12: goto L_0x01c8;
                case 13: goto L_0x01ce;
                case 14: goto L_0x01d4;
                case 15: goto L_0x01da;
                case 16: goto L_0x01da;
                case 17: goto L_0x01e0;
                case 18: goto L_0x01e6;
                default: goto L_0x0012;
            };
        L_0x0012:
            r0 = new adq;
            r1 = "Unrecognized codec identifier.";
            r0.<init>(r1);
            throw r0;
        L_0x001a:
            r3 = "V_VP8";
            r1 = r1.equals(r3);
            if (r1 == 0) goto L_0x000e;
        L_0x0022:
            r1 = 0;
            goto L_0x000f;
        L_0x0024:
            r3 = "V_VP9";
            r1 = r1.equals(r3);
            if (r1 == 0) goto L_0x000e;
        L_0x002c:
            r1 = 1;
            goto L_0x000f;
        L_0x002e:
            r3 = "V_MPEG2";
            r1 = r1.equals(r3);
            if (r1 == 0) goto L_0x000e;
        L_0x0036:
            r1 = 2;
            goto L_0x000f;
        L_0x0038:
            r3 = "V_MPEG4/ISO/SP";
            r1 = r1.equals(r3);
            if (r1 == 0) goto L_0x000e;
        L_0x0040:
            r1 = r4;
            goto L_0x000f;
        L_0x0042:
            r3 = "V_MPEG4/ISO/ASP";
            r1 = r1.equals(r3);
            if (r1 == 0) goto L_0x000e;
        L_0x004a:
            r1 = 4;
            goto L_0x000f;
        L_0x004c:
            r3 = "V_MPEG4/ISO/AP";
            r1 = r1.equals(r3);
            if (r1 == 0) goto L_0x000e;
        L_0x0054:
            r1 = 5;
            goto L_0x000f;
        L_0x0056:
            r3 = "V_MPEG4/ISO/AVC";
            r1 = r1.equals(r3);
            if (r1 == 0) goto L_0x000e;
        L_0x005e:
            r1 = 6;
            goto L_0x000f;
        L_0x0060:
            r3 = "V_MPEGH/ISO/HEVC";
            r1 = r1.equals(r3);
            if (r1 == 0) goto L_0x000e;
        L_0x0068:
            r1 = 7;
            goto L_0x000f;
        L_0x006a:
            r3 = "A_VORBIS";
            r1 = r1.equals(r3);
            if (r1 == 0) goto L_0x000e;
        L_0x0072:
            r1 = r5;
            goto L_0x000f;
        L_0x0074:
            r3 = "A_OPUS";
            r1 = r1.equals(r3);
            if (r1 == 0) goto L_0x000e;
        L_0x007c:
            r1 = 9;
            goto L_0x000f;
        L_0x007f:
            r3 = "A_AAC";
            r1 = r1.equals(r3);
            if (r1 == 0) goto L_0x000e;
        L_0x0087:
            r1 = 10;
            goto L_0x000f;
        L_0x008a:
            r3 = "A_MPEG/L3";
            r1 = r1.equals(r3);
            if (r1 == 0) goto L_0x000e;
        L_0x0092:
            r1 = 11;
            goto L_0x000f;
        L_0x0096:
            r3 = "A_AC3";
            r1 = r1.equals(r3);
            if (r1 == 0) goto L_0x000e;
        L_0x009e:
            r1 = 12;
            goto L_0x000f;
        L_0x00a2:
            r3 = "A_EAC3";
            r1 = r1.equals(r3);
            if (r1 == 0) goto L_0x000e;
        L_0x00aa:
            r1 = 13;
            goto L_0x000f;
        L_0x00ae:
            r3 = "A_TRUEHD";
            r1 = r1.equals(r3);
            if (r1 == 0) goto L_0x000e;
        L_0x00b6:
            r1 = 14;
            goto L_0x000f;
        L_0x00ba:
            r3 = "A_DTS";
            r1 = r1.equals(r3);
            if (r1 == 0) goto L_0x000e;
        L_0x00c2:
            r1 = 15;
            goto L_0x000f;
        L_0x00c6:
            r3 = "A_DTS/EXPRESS";
            r1 = r1.equals(r3);
            if (r1 == 0) goto L_0x000e;
        L_0x00ce:
            r1 = 16;
            goto L_0x000f;
        L_0x00d2:
            r3 = "A_DTS/LOSSLESS";
            r1 = r1.equals(r3);
            if (r1 == 0) goto L_0x000e;
        L_0x00da:
            r1 = 17;
            goto L_0x000f;
        L_0x00de:
            r3 = "S_TEXT/UTF8";
            r1 = r1.equals(r3);
            if (r1 == 0) goto L_0x000e;
        L_0x00e6:
            r1 = 18;
            goto L_0x000f;
        L_0x00ea:
            r1 = "video/x-vnd.on2.vp8";
            r8 = r0;
            r3 = r2;
        L_0x00ee:
            r0 = p000.ahg.m1531a(r1);
            if (r0 == 0) goto L_0x01ec;
        L_0x00f4:
            r0 = java.lang.Integer.toString(r13);
            r6 = r11.f1272k;
            r7 = r11.f1273l;
            r9 = r11.f1278q;
            r4 = r14;
            r0 = p000.ado.m816a(r0, r1, r2, r3, r4, r6, r7, r8, r9);
        L_0x0103:
            r1 = r11.f1263b;
            r1 = r12.mo148d(r1);
            r11.f1276o = r1;
            r1 = r11.f1276o;
            r1.mo126a(r0);
            return;
        L_0x0111:
            r1 = "video/x-vnd.on2.vp9";
            r8 = r0;
            r3 = r2;
            goto L_0x00ee;
        L_0x0116:
            r1 = "video/mpeg2";
            r8 = r0;
            r3 = r2;
            goto L_0x00ee;
        L_0x011b:
            r1 = "video/mp4v-es";
            r3 = r11.f1269h;
            if (r3 != 0) goto L_0x0124;
        L_0x0121:
            r8 = r0;
            r3 = r2;
            goto L_0x00ee;
        L_0x0124:
            r0 = r11.f1269h;
            r0 = java.util.Collections.singletonList(r0);
            goto L_0x0121;
        L_0x012b:
            r3 = "video/avc";
            r0 = new ahk;
            r1 = r11.f1269h;
            r0.<init>(r1);
            r1 = p000.agf.C0162b.m1424a(r0);
            r0 = r1.first;
            r0 = (java.util.List) r0;
            r1 = r1.second;
            r1 = (java.lang.Integer) r1;
            r1 = r1.intValue();
            r11.f1277p = r1;
            r8 = r0;
            r1 = r3;
            r3 = r2;
            goto L_0x00ee;
        L_0x014a:
            r3 = "video/hevc";
            r0 = new ahk;
            r1 = r11.f1269h;
            r0.<init>(r1);
            r1 = p000.agf.C0162b.m1427b(r0);
            r0 = r1.first;
            r0 = (java.util.List) r0;
            r1 = r1.second;
            r1 = (java.lang.Integer) r1;
            r1 = r1.intValue();
            r11.f1277p = r1;
            r8 = r0;
            r1 = r3;
            r3 = r2;
            goto L_0x00ee;
        L_0x0169:
            r1 = "audio/vorbis";
            r3 = 8192; // 0x2000 float:1.14794E-41 double:4.0474E-320;
            r0 = r11.f1269h;
            r0 = p000.agf.C0162b.m1426a(r0);
            r8 = r0;
            goto L_0x00ee;
        L_0x0176:
            r1 = "audio/opus";
            r3 = 5760; // 0x1680 float:8.071E-42 double:2.846E-320;
            r0 = new java.util.ArrayList;
            r0.<init>(r4);
            r4 = r11.f1269h;
            r0.add(r4);
            r4 = java.nio.ByteBuffer.allocate(r5);
            r6 = java.nio.ByteOrder.LITTLE_ENDIAN;
            r4 = r4.order(r6);
            r6 = r11.f1274m;
            r4 = r4.putLong(r6);
            r4 = r4.array();
            r0.add(r4);
            r4 = java.nio.ByteBuffer.allocate(r5);
            r5 = java.nio.ByteOrder.LITTLE_ENDIAN;
            r4 = r4.order(r5);
            r6 = r11.f1275n;
            r4 = r4.putLong(r6);
            r4 = r4.array();
            r0.add(r4);
            r8 = r0;
            goto L_0x00ee;
        L_0x01b5:
            r1 = "audio/mp4a-latm";
            r0 = r11.f1269h;
            r0 = java.util.Collections.singletonList(r0);
            r8 = r0;
            r3 = r2;
            goto L_0x00ee;
        L_0x01c1:
            r1 = "audio/mpeg";
            r3 = 4096; // 0x1000 float:5.74E-42 double:2.0237E-320;
            r8 = r0;
            goto L_0x00ee;
        L_0x01c8:
            r1 = "audio/ac3";
            r8 = r0;
            r3 = r2;
            goto L_0x00ee;
        L_0x01ce:
            r1 = "audio/eac3";
            r8 = r0;
            r3 = r2;
            goto L_0x00ee;
        L_0x01d4:
            r1 = "audio/true-hd";
            r8 = r0;
            r3 = r2;
            goto L_0x00ee;
        L_0x01da:
            r1 = "audio/vnd.dts";
            r8 = r0;
            r3 = r2;
            goto L_0x00ee;
        L_0x01e0:
            r1 = "audio/vnd.dts.hd";
            r8 = r0;
            r3 = r2;
            goto L_0x00ee;
        L_0x01e6:
            r1 = "application/x-subrip";
            r8 = r0;
            r3 = r2;
            goto L_0x00ee;
        L_0x01ec:
            r0 = p000.ahg.m1532b(r1);
            if (r0 == 0) goto L_0x0201;
        L_0x01f2:
            r0 = java.lang.Integer.toString(r13);
            r6 = r11.f1270i;
            r7 = r11.f1271j;
            r4 = r14;
            r0 = p000.ado.m814a(r0, r1, r2, r3, r4, r6, r7, r8);
            goto L_0x0103;
        L_0x0201:
            r0 = "application/x-subrip";
            r0 = r0.equals(r1);
            if (r0 == 0) goto L_0x0216;
        L_0x0209:
            r0 = java.lang.Integer.toString(r13);
            r5 = r11.f1278q;
            r3 = r14;
            r0 = p000.ado.m818a(r0, r1, r2, r3, r5);
            goto L_0x0103;
        L_0x0216:
            r0 = new adq;
            r1 = "Unexpected MIME type.";
            r0.<init>(r1);
            throw r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: agf.b.a(aei, int, long):void");
        }

        /* renamed from: a */
        private static Pair<List<byte[]>, Integer> m1424a(ahk ahk) throws adq {
            int i = 0;
            try {
                ahk.m1564b(4);
                int f = (ahk.m1570f() & 3) + 1;
                if (f == 3) {
                    throw new adq();
                }
                int i2;
                List arrayList = new ArrayList();
                int f2 = ahk.m1570f() & 31;
                for (i2 = 0; i2 < f2; i2++) {
                    arrayList.add(ahi.m1542a(ahk));
                }
                i2 = ahk.m1570f();
                while (i < i2) {
                    arrayList.add(ahi.m1542a(ahk));
                    i++;
                }
                return Pair.create(arrayList, Integer.valueOf(f));
            } catch (ArrayIndexOutOfBoundsException e) {
                throw new adq("Error parsing AVC codec private");
            }
        }

        /* renamed from: b */
        private static Pair<List<byte[]>, Integer> m1427b(ahk ahk) throws adq {
            try {
                int g;
                int i;
                int i2;
                ahk.m1564b(21);
                int f = ahk.m1570f() & 3;
                int f2 = ahk.m1570f();
                int d = ahk.m1567d();
                int i3 = 0;
                int i4 = 0;
                while (i3 < f2) {
                    ahk.m1566c(1);
                    g = ahk.m1571g();
                    i = i4;
                    for (i2 = 0; i2 < g; i2++) {
                        i4 = ahk.m1571g();
                        i += i4 + 4;
                        ahk.m1566c(i4);
                    }
                    i3++;
                    i4 = i;
                }
                ahk.m1564b(d);
                Object obj = new byte[i4];
                i3 = 0;
                i2 = 0;
                while (i3 < f2) {
                    ahk.m1566c(1);
                    g = ahk.m1571g();
                    i = i2;
                    for (i2 = 0; i2 < g; i2++) {
                        int g2 = ahk.m1571g();
                        System.arraycopy(ahi.f1485a, 0, obj, i, ahi.f1485a.length);
                        i += ahi.f1485a.length;
                        System.arraycopy(ahk.f1493a, ahk.m1567d(), obj, i, g2);
                        i += g2;
                        ahk.m1566c(g2);
                    }
                    i3++;
                    i2 = i;
                }
                return Pair.create(i4 == 0 ? null : Collections.singletonList(obj), Integer.valueOf(f + 1));
            } catch (ArrayIndexOutOfBoundsException e) {
                throw new adq("Error parsing HEVC codec private");
            }
        }

        /* renamed from: a */
        private static List<byte[]> m1426a(byte[] bArr) throws adq {
            int i = 0;
            try {
                if (bArr[0] != (byte) 2) {
                    throw new adq("Error parsing vorbis codec private");
                }
                int i2 = 0;
                int i3 = 1;
                while (bArr[i3] == (byte) -1) {
                    i3++;
                    i2 += 255;
                }
                int i4 = i3 + 1;
                i2 += bArr[i3];
                while (bArr[i4] == (byte) -1) {
                    i += 255;
                    i4++;
                }
                i3 = i4 + 1;
                i += bArr[i4];
                if (bArr[i3] != (byte) 1) {
                    throw new adq("Error parsing vorbis codec private");
                }
                Object obj = new byte[i2];
                System.arraycopy(bArr, i3, obj, 0, i2);
                i2 += i3;
                if (bArr[i2] != (byte) 3) {
                    throw new adq("Error parsing vorbis codec private");
                }
                i += i2;
                if (bArr[i] != (byte) 5) {
                    throw new adq("Error parsing vorbis codec private");
                }
                Object obj2 = new byte[(bArr.length - i)];
                System.arraycopy(bArr, i, obj2, 0, bArr.length - i);
                List<byte[]> arrayList = new ArrayList(2);
                arrayList.add(obj);
                arrayList.add(obj2);
                return arrayList;
            } catch (ArrayIndexOutOfBoundsException e) {
                throw new adq("Error parsing vorbis codec private");
            }
        }
    }

    public agf() {
        this(new aga());
    }

    agf(agb agb) {
        this.f1310m = -1;
        this.f1311n = -1;
        this.f1312o = -1;
        this.f1313p = -1;
        this.f1314q = -1;
        this.f1321x = -1;
        this.f1322y = -1;
        this.f1323z = -1;
        this.f1300c = agb;
        this.f1300c.mo170a(new C0161a());
        this.f1301d = new age();
        this.f1302e = new SparseArray();
        this.f1305h = new ahk(4);
        this.f1306i = new ahk(ByteBuffer.allocate(4).putInt(-1).array());
        this.f1307j = new ahk(4);
        this.f1303f = new ahk(ahi.f1485a);
        this.f1304g = new ahk(4);
        this.f1308k = new ahk();
        this.f1309l = new ahk();
    }

    /* renamed from: a */
    public boolean mo155a(aeh aeh) throws IOException, InterruptedException {
        return new agd().m1410a(aeh);
    }

    /* renamed from: a */
    public void mo154a(aei aei) {
        this.f1299S = aei;
    }

    /* renamed from: b */
    public void mo156b() {
        this.f1323z = -1;
        this.f1284D = 0;
        this.f1300c.mo169a();
        this.f1301d.m1414a();
        m1431a();
    }

    /* renamed from: a */
    public int mo153a(aeh aeh, aem aem) throws IOException, InterruptedException {
        this.f1297Q = false;
        boolean z = true;
        while (z && !this.f1297Q) {
            z = this.f1300c.mo171a(aeh);
            if (z && m1438a(aem, aeh.mo120c())) {
                return 1;
            }
        }
        if (z) {
            return 0;
        }
        return -1;
    }

    /* renamed from: a */
    int m1442a(int i) {
        switch (i) {
            case 131:
            case 155:
            case 159:
            case 176:
            case 179:
            case 186:
            case JfifUtil.MARKER_RST7 /*215*/:
            case 231:
            case 241:
            case 251:
            case 16980:
            case 17029:
            case 17143:
            case 18401:
            case 18408:
            case 20529:
            case 20530:
            case 21420:
            case 22186:
            case 22203:
            case 2352003:
            case 2807729:
                return 2;
            case 134:
            case 17026:
            case 2274716:
                return 3;
            case 160:
            case 174:
            case 183:
            case 187:
            case 224:
            case 225:
            case 18407:
            case 19899:
            case 20532:
            case 20533:
            case 25152:
            case 28032:
            case 290298740:
            case 357149030:
            case 374648427:
            case 408125543:
            case 440786851:
            case 475249515:
            case 524531317:
                return 1;
            case 161:
            case 163:
            case 16981:
            case 18402:
            case 21419:
            case 25506:
                return 4;
            case 181:
            case 17545:
                return 5;
            default:
                return 0;
        }
    }

    /* renamed from: b */
    boolean m1452b(int i) {
        return i == 357149030 || i == 524531317 || i == 475249515 || i == 374648427;
    }

    /* renamed from: a */
    void m1447a(int i, long j, long j2) throws adq {
        switch (i) {
            case 160:
                this.f1298R = false;
                return;
            case 174:
                this.f1315r = new C0162b();
                return;
            case 187:
                this.f1283C = false;
                return;
            case 19899:
                this.f1318u = -1;
                this.f1319v = -1;
                return;
            case 20533:
                this.f1315r.f1266e = true;
                return;
            case 408125543:
                if (this.f1310m == -1 || this.f1310m == j) {
                    this.f1310m = j;
                    this.f1311n = j2;
                    return;
                }
                throw new adq("Multiple Segment elements not supported");
            case 475249515:
                this.f1281A = new ahf();
                this.f1282B = new ahf();
                return;
            case 524531317:
                if (!this.f1317t) {
                    if (this.f1321x != -1) {
                        this.f1320w = true;
                        return;
                    }
                    this.f1299S.mo136a(aeo.f740f);
                    this.f1317t = true;
                    return;
                }
                return;
            default:
                return;
        }
    }

    /* renamed from: c */
    void m1453c(int i) throws adq {
        switch (i) {
            case 160:
                if (this.f1284D == 2) {
                    if (!this.f1298R) {
                        this.f1292L |= 1;
                    }
                    m1436a((C0162b) this.f1302e.get(this.f1290J), this.f1285E);
                    this.f1284D = 0;
                    return;
                }
                return;
            case 174:
                if (this.f1302e.get(this.f1315r.f1263b) == null && agf.m1439a(this.f1315r.f1262a)) {
                    this.f1315r.m1428a(this.f1299S, this.f1315r.f1263b, this.f1314q);
                    this.f1302e.put(this.f1315r.f1263b, this.f1315r);
                }
                this.f1315r = null;
                return;
            case 19899:
                if (this.f1318u == -1 || this.f1319v == -1) {
                    throw new adq("Mandatory element SeekID or SeekPosition not found");
                } else if (this.f1318u == 475249515) {
                    this.f1321x = this.f1319v;
                    return;
                } else {
                    return;
                }
            case 25152:
                if (!this.f1315r.f1266e) {
                    return;
                }
                if (this.f1315r.f1268g == null) {
                    throw new adq("Encrypted Track found but ContentEncKeyID was not found");
                } else if (!this.f1316s) {
                    this.f1299S.mo135a(new C0122c(new C0121b("video/webm", this.f1315r.f1268g)));
                    this.f1316s = true;
                    return;
                } else {
                    return;
                }
            case 28032:
                if (this.f1315r.f1266e && this.f1315r.f1267f != null) {
                    throw new adq("Combining encryption and compression is not supported");
                }
                return;
            case 357149030:
                if (this.f1312o == -1) {
                    this.f1312o = 1000000;
                }
                if (this.f1313p != -1) {
                    this.f1314q = m1430a(this.f1313p);
                    return;
                }
                return;
            case 374648427:
                if (this.f1302e.size() == 0) {
                    throw new adq("No valid tracks were found");
                }
                this.f1299S.mo150f();
                return;
            case 475249515:
                if (!this.f1317t) {
                    this.f1299S.mo136a(m1441c());
                    this.f1317t = true;
                    return;
                }
                return;
            default:
                return;
        }
    }

    /* renamed from: a */
    void m1446a(int i, long j) throws adq {
        switch (i) {
            case 131:
                this.f1315r.f1264c = (int) j;
                return;
            case 155:
                this.f1286F = m1430a(j);
                return;
            case 159:
                this.f1315r.f1272k = (int) j;
                return;
            case 176:
                this.f1315r.f1270i = (int) j;
                return;
            case 179:
                this.f1281A.m1530a(m1430a(j));
                return;
            case 186:
                this.f1315r.f1271j = (int) j;
                return;
            case JfifUtil.MARKER_RST7 /*215*/:
                this.f1315r.f1263b = (int) j;
                return;
            case 231:
                this.f1323z = m1430a(j);
                return;
            case 241:
                if (!this.f1283C) {
                    this.f1282B.m1530a(j);
                    this.f1283C = true;
                    return;
                }
                return;
            case 251:
                this.f1298R = true;
                return;
            case 16980:
                if (j != 3) {
                    throw new adq("ContentCompAlgo " + j + " not supported");
                }
                return;
            case 17029:
                if (j < 1 || j > 2) {
                    throw new adq("DocTypeReadVersion " + j + " not supported");
                }
                return;
            case 17143:
                if (j != 1) {
                    throw new adq("EBMLReadVersion " + j + " not supported");
                }
                return;
            case 18401:
                if (j != 5) {
                    throw new adq("ContentEncAlgo " + j + " not supported");
                }
                return;
            case 18408:
                if (j != 1) {
                    throw new adq("AESSettingsCipherMode " + j + " not supported");
                }
                return;
            case 20529:
                if (j != 0) {
                    throw new adq("ContentEncodingOrder " + j + " not supported");
                }
                return;
            case 20530:
                if (j != 1) {
                    throw new adq("ContentEncodingScope " + j + " not supported");
                }
                return;
            case 21420:
                this.f1319v = this.f1310m + j;
                return;
            case 22186:
                this.f1315r.f1274m = j;
                return;
            case 22203:
                this.f1315r.f1275n = j;
                return;
            case 2352003:
                this.f1315r.f1265d = (int) j;
                return;
            case 2807729:
                this.f1312o = j;
                return;
            default:
                return;
        }
    }

    /* renamed from: a */
    void m1444a(int i, double d) {
        switch (i) {
            case 181:
                this.f1315r.f1273l = (int) d;
                return;
            case 17545:
                this.f1313p = (long) d;
                return;
            default:
                return;
        }
    }

    /* renamed from: a */
    void m1448a(int i, String str) throws adq {
        switch (i) {
            case 134:
                this.f1315r.f1262a = str;
                return;
            case 17026:
                if (!"webm".equals(str) && !"matroska".equals(str)) {
                    throw new adq("DocType " + str + " not supported");
                }
                return;
            case 2274716:
                this.f1315r.f1278q = str;
                return;
            default:
                return;
        }
    }

    /* renamed from: a */
    void m1445a(int i, int i2, aeh aeh) throws IOException, InterruptedException {
        switch (i) {
            case 161:
            case 163:
                if (this.f1284D == 0) {
                    this.f1290J = (int) this.f1301d.m1413a(aeh, false, true, 8);
                    this.f1291K = this.f1301d.m1415b();
                    this.f1286F = -1;
                    this.f1284D = 1;
                    this.f1305h.m1558a();
                }
                C0162b c0162b = (C0162b) this.f1302e.get(this.f1290J);
                if (c0162b == null) {
                    aeh.mo117b(i2 - this.f1291K);
                    this.f1284D = 0;
                    return;
                }
                if (this.f1284D == 1) {
                    int i3;
                    m1432a(aeh, 3);
                    int i4 = (this.f1305h.f1493a[2] & 6) >> 1;
                    if (i4 == 0) {
                        this.f1288H = 1;
                        this.f1289I = agf.m1440a(this.f1289I, 1);
                        this.f1289I[0] = (i2 - this.f1291K) - 3;
                    } else if (i != 163) {
                        throw new adq("Lacing only supported in SimpleBlocks.");
                    } else {
                        m1432a(aeh, 4);
                        this.f1288H = (this.f1305h.f1493a[3] & 255) + 1;
                        this.f1289I = agf.m1440a(this.f1289I, this.f1288H);
                        if (i4 == 2) {
                            Arrays.fill(this.f1289I, 0, this.f1288H, ((i2 - this.f1291K) - 4) / this.f1288H);
                        } else if (i4 == 1) {
                            r5 = 0;
                            i3 = 4;
                            for (i4 = 0; i4 < this.f1288H - 1; i4++) {
                                this.f1289I[i4] = 0;
                                do {
                                    i3++;
                                    m1432a(aeh, i3);
                                    r6 = this.f1305h.f1493a[i3 - 1] & 255;
                                    r7 = this.f1289I;
                                    r7[i4] = r7[i4] + r6;
                                } while (r6 == 255);
                                r5 += this.f1289I[i4];
                            }
                            this.f1289I[this.f1288H - 1] = ((i2 - this.f1291K) - i3) - r5;
                        } else if (i4 == 3) {
                            r5 = 0;
                            i3 = 4;
                            i4 = 0;
                            while (i4 < this.f1288H - 1) {
                                this.f1289I[i4] = 0;
                                i3++;
                                m1432a(aeh, i3);
                                if (this.f1305h.f1493a[i3 - 1] == (byte) 0) {
                                    throw new adq("No valid varint length mask found");
                                }
                                long j = 0;
                                int i5 = 0;
                                while (i5 < 8) {
                                    int i6 = 1 << (7 - i5);
                                    if ((this.f1305h.f1493a[i3 - 1] & i6) != 0) {
                                        int i7 = i3 - 1;
                                        i3 += i5;
                                        m1432a(aeh, i3);
                                        j = (long) ((this.f1305h.f1493a[i7] & 255) & (i6 ^ -1));
                                        for (i6 = i7 + 1; i6 < i3; i6++) {
                                            j = ((long) (this.f1305h.f1493a[i6] & 255)) | (j << 8);
                                        }
                                        if (i4 > 0) {
                                            j -= (1 << ((i5 * 7) + 6)) - 1;
                                        }
                                        if (j >= -2147483648L || j > 2147483647L) {
                                            throw new adq("EBML lacing sample size out of range.");
                                        }
                                        r6 = (int) j;
                                        r7 = this.f1289I;
                                        if (i4 != 0) {
                                            r6 += this.f1289I[i4 - 1];
                                        }
                                        r7[i4] = r6;
                                        r5 += this.f1289I[i4];
                                        i4++;
                                    } else {
                                        i5++;
                                    }
                                }
                                if (j >= -2147483648L) {
                                    break;
                                }
                                throw new adq("EBML lacing sample size out of range.");
                            }
                            this.f1289I[this.f1288H - 1] = ((i2 - this.f1291K) - i3) - r5;
                        } else {
                            throw new adq("Unexpected lacing value: " + i4);
                        }
                    }
                    this.f1285E = this.f1323z + m1430a((long) ((this.f1305h.f1493a[0] << 8) | (this.f1305h.f1493a[1] & 255)));
                    Object obj = (this.f1305h.f1493a[2] & 8) == 8 ? 1 : null;
                    Object obj2 = (c0162b.f1264c == 2 || (i == 163 && (this.f1305h.f1493a[2] & 128) == 128)) ? 1 : null;
                    i3 = obj2 != null ? 1 : 0;
                    if (obj != null) {
                        i4 = 134217728;
                    } else {
                        i4 = 0;
                    }
                    this.f1292L = i4 | i3;
                    this.f1284D = 2;
                    this.f1287G = 0;
                }
                if (i == 163) {
                    while (this.f1287G < this.f1288H) {
                        m1433a(aeh, c0162b, this.f1289I[this.f1287G]);
                        m1436a(c0162b, this.f1285E + ((long) ((this.f1287G * c0162b.f1265d) / 1000)));
                        this.f1287G++;
                    }
                    this.f1284D = 0;
                    return;
                }
                m1433a(aeh, c0162b, this.f1289I[0]);
                return;
            case 16981:
                this.f1315r.f1267f = new byte[i2];
                aeh.mo118b(this.f1315r.f1267f, 0, i2);
                return;
            case 18402:
                this.f1315r.f1268g = new byte[i2];
                aeh.mo118b(this.f1315r.f1268g, 0, i2);
                return;
            case 21419:
                Arrays.fill(this.f1307j.f1493a, (byte) 0);
                aeh.mo118b(this.f1307j.f1493a, 4 - i2, i2);
                this.f1307j.m1564b(0);
                this.f1318u = (int) this.f1307j.m1574j();
                return;
            case 25506:
                this.f1315r.f1269h = new byte[i2];
                aeh.mo118b(this.f1315r.f1269h, 0, i2);
                return;
            default:
                throw new adq("Unexpected id: " + i);
        }
    }

    /* renamed from: a */
    private void m1436a(C0162b c0162b, long j) {
        if ("S_TEXT/UTF8".equals(c0162b.f1262a)) {
            m1435a(c0162b);
        }
        c0162b.f1276o.mo125a(j, this.f1292L, this.f1296P, 0, c0162b.f1268g);
        this.f1297Q = true;
        m1431a();
    }

    /* renamed from: a */
    private void m1431a() {
        this.f1293M = 0;
        this.f1296P = 0;
        this.f1295O = 0;
        this.f1294N = false;
        this.f1308k.m1558a();
    }

    /* renamed from: a */
    private void m1432a(aeh aeh, int i) throws IOException, InterruptedException {
        if (this.f1305h.m1565c() < i) {
            if (this.f1305h.m1569e() < i) {
                this.f1305h.m1561a(Arrays.copyOf(this.f1305h.f1493a, Math.max(this.f1305h.f1493a.length * 2, i)), this.f1305h.m1565c());
            }
            aeh.mo118b(this.f1305h.f1493a, this.f1305h.m1565c(), i - this.f1305h.m1565c());
            this.f1305h.m1559a(i);
        }
    }

    /* renamed from: a */
    private void m1433a(aeh aeh, C0162b c0162b, int i) throws IOException, InterruptedException {
        if ("S_TEXT/UTF8".equals(c0162b.f1262a)) {
            int length = f1279a.length + i;
            if (this.f1309l.m1569e() < length) {
                this.f1309l.f1493a = Arrays.copyOf(f1279a, length + i);
            }
            aeh.mo118b(this.f1309l.f1493a, f1279a.length, i);
            this.f1309l.m1564b(0);
            this.f1309l.m1559a(length);
            return;
        }
        aep aep = c0162b.f1276o;
        if (!this.f1294N) {
            if (c0162b.f1266e) {
                this.f1292L &= -3;
                aeh.mo118b(this.f1305h.f1493a, 0, 1);
                this.f1293M++;
                if ((this.f1305h.f1493a[0] & 128) == 128) {
                    throw new adq("Extension bit is set in signal byte");
                } else if ((this.f1305h.f1493a[0] & 1) == 1) {
                    this.f1305h.f1493a[0] = (byte) 8;
                    this.f1305h.m1564b(0);
                    aep.mo127a(this.f1305h, 1);
                    this.f1296P++;
                    this.f1292L |= 2;
                }
            } else if (c0162b.f1267f != null) {
                this.f1308k.m1561a(c0162b.f1267f, c0162b.f1267f.length);
            }
            this.f1294N = true;
        }
        int c = this.f1308k.m1565c() + i;
        if ("V_MPEG4/ISO/AVC".equals(c0162b.f1262a) || "V_MPEGH/ISO/HEVC".equals(c0162b.f1262a)) {
            byte[] bArr = this.f1304g.f1493a;
            bArr[0] = (byte) 0;
            bArr[1] = (byte) 0;
            bArr[2] = (byte) 0;
            int i2 = c0162b.f1277p;
            int i3 = 4 - c0162b.f1277p;
            while (this.f1293M < c) {
                if (this.f1295O == 0) {
                    m1434a(aeh, bArr, i3, i2);
                    this.f1304g.m1564b(0);
                    this.f1295O = this.f1304g.m1579o();
                    this.f1303f.m1564b(0);
                    aep.mo127a(this.f1303f, 4);
                    this.f1296P += 4;
                } else {
                    this.f1295O -= m1429a(aeh, aep, this.f1295O);
                }
            }
        } else {
            while (this.f1293M < c) {
                m1429a(aeh, aep, c - this.f1293M);
            }
        }
        if ("A_VORBIS".equals(c0162b.f1262a)) {
            this.f1306i.m1564b(0);
            aep.mo127a(this.f1306i, 4);
            this.f1296P += 4;
        }
    }

    /* renamed from: a */
    private void m1435a(C0162b c0162b) {
        agf.m1437a(this.f1309l.f1493a, this.f1286F);
        c0162b.f1276o.mo127a(this.f1309l, this.f1309l.m1565c());
        this.f1296P += this.f1309l.m1565c();
    }

    /* renamed from: a */
    private static void m1437a(byte[] bArr, long j) {
        Object obj;
        if (j == -1) {
            obj = f1280b;
        } else {
            long j2 = j - (((long) ((int) (j / 3600000000L))) * 3600000000L);
            j2 -= (long) (60000000 * ((int) (j2 / 60000000)));
            int i = (int) ((j2 - ((long) (1000000 * ((int) (j2 / 1000000))))) / 1000);
            obj = String.format(Locale.US, "%02d:%02d:%02d,%03d", new Object[]{Integer.valueOf((int) (j / 3600000000L)), Integer.valueOf(r1), Integer.valueOf(r4), Integer.valueOf(i)}).getBytes();
        }
        System.arraycopy(obj, 0, bArr, 19, 12);
    }

    /* renamed from: a */
    private void m1434a(aeh aeh, byte[] bArr, int i, int i2) throws IOException, InterruptedException {
        int min = Math.min(i2, this.f1308k.m1563b());
        aeh.mo118b(bArr, i + min, i2 - min);
        if (min > 0) {
            this.f1308k.m1562a(bArr, i, min);
        }
        this.f1293M += i2;
    }

    /* renamed from: a */
    private int m1429a(aeh aeh, aep aep, int i) throws IOException, InterruptedException {
        int b = this.f1308k.m1563b();
        if (b > 0) {
            b = Math.min(i, b);
            aep.mo127a(this.f1308k, b);
        } else {
            b = aep.mo124a(aeh, i, false);
        }
        this.f1293M += b;
        this.f1296P += b;
        return b;
    }

    /* renamed from: c */
    private aeo m1441c() {
        int i = 0;
        if (this.f1310m == -1 || this.f1314q == -1 || this.f1281A == null || this.f1281A.m1528a() == 0 || this.f1282B == null || this.f1282B.m1528a() != this.f1281A.m1528a()) {
            this.f1281A = null;
            this.f1282B = null;
            return aeo.f740f;
        }
        int a = this.f1281A.m1528a();
        int[] iArr = new int[a];
        long[] jArr = new long[a];
        long[] jArr2 = new long[a];
        long[] jArr3 = new long[a];
        for (int i2 = 0; i2 < a; i2++) {
            jArr3[i2] = this.f1281A.m1529a(i2);
            jArr[i2] = this.f1310m + this.f1282B.m1529a(i2);
        }
        while (i < a - 1) {
            iArr[i] = (int) (jArr[i + 1] - jArr[i]);
            jArr2[i] = jArr3[i + 1] - jArr3[i];
            i++;
        }
        iArr[a - 1] = (int) ((this.f1310m + this.f1311n) - jArr[a - 1]);
        jArr2[a - 1] = this.f1314q - jArr3[a - 1];
        this.f1281A = null;
        this.f1282B = null;
        return new aec(iArr, jArr, jArr2, jArr3);
    }

    /* renamed from: a */
    private boolean m1438a(aem aem, long j) {
        if (this.f1320w) {
            this.f1322y = j;
            aem.f853a = this.f1321x;
            this.f1320w = false;
            return true;
        } else if (!this.f1317t || this.f1322y == -1) {
            return false;
        } else {
            aem.f853a = this.f1322y;
            this.f1322y = -1;
            return true;
        }
    }

    /* renamed from: a */
    private long m1430a(long j) throws adq {
        if (this.f1312o == -1) {
            throw new adq("Can't scale timecode prior to timecodeScale being set.");
        }
        return ahr.m1595a(j, this.f1312o, 1000);
    }

    /* renamed from: a */
    private static boolean m1439a(String str) {
        return "V_VP8".equals(str) || "V_VP9".equals(str) || "V_MPEG2".equals(str) || "V_MPEG4/ISO/SP".equals(str) || "V_MPEG4/ISO/ASP".equals(str) || "V_MPEG4/ISO/AP".equals(str) || "V_MPEG4/ISO/AVC".equals(str) || "V_MPEGH/ISO/HEVC".equals(str) || "A_OPUS".equals(str) || "A_VORBIS".equals(str) || "A_AAC".equals(str) || "A_MPEG/L3".equals(str) || "A_AC3".equals(str) || "A_EAC3".equals(str) || "A_TRUEHD".equals(str) || "A_DTS".equals(str) || "A_DTS/EXPRESS".equals(str) || "A_DTS/LOSSLESS".equals(str) || "S_TEXT/UTF8".equals(str);
    }

    /* renamed from: a */
    private static int[] m1440a(int[] iArr, int i) {
        if (iArr == null) {
            return new int[i];
        }
        return iArr.length < i ? new int[Math.max(iArr.length * 2, i)] : iArr;
    }
}
