package com.p000;

import android.graphics.Path;
import android.util.Log;
import java.util.ArrayList;

/* compiled from: PathParser */
/* renamed from: ay */
class ay {

    /* compiled from: PathParser */
    /* renamed from: ay$a */
    static class C0881a {
        /* renamed from: a */
        int f4929a;
        /* renamed from: b */
        boolean f4930b;

        C0881a() {
        }
    }

    /* compiled from: PathParser */
    /* renamed from: ay$b */
    public static class C0882b {
        /* renamed from: a */
        char f4931a;
        /* renamed from: b */
        float[] f4932b;

        C0882b(char c, float[] fArr) {
            this.f4931a = c;
            this.f4932b = fArr;
        }

        C0882b(C0882b c0882b) {
            this.f4931a = c0882b.f4931a;
            this.f4932b = ay.m6468a(c0882b.f4932b, 0, c0882b.f4932b.length);
        }

        /* renamed from: a */
        public static void m6463a(C0882b[] c0882bArr, Path path) {
            float[] fArr = new float[6];
            char c = 'm';
            for (int i = 0; i < c0882bArr.length; i++) {
                C0882b.m6462a(path, fArr, c, c0882bArr[i].f4931a, c0882bArr[i].f4932b);
                c = c0882bArr[i].f4931a;
            }
        }

        /* renamed from: a */
        private static void m6462a(Path path, float[] fArr, char c, char c2, float[] fArr2) {
            int i;
            float f = fArr[0];
            float f2 = fArr[1];
            float f3 = fArr[2];
            float f4 = fArr[3];
            float f5 = fArr[4];
            float f6 = fArr[5];
            switch (c2) {
                case 'A':
                case 'a':
                    i = 7;
                    break;
                case 'C':
                case 'c':
                    i = 6;
                    break;
                case 'H':
                case 'V':
                case 'h':
                case 'v':
                    i = 1;
                    break;
                case 'L':
                case 'M':
                case 'T':
                case 'l':
                case 'm':
                case 't':
                    i = 2;
                    break;
                case 'Q':
                case 'S':
                case 'q':
                case 's':
                    i = 4;
                    break;
                case 'Z':
                case 'z':
                    path.close();
                    path.moveTo(f5, f6);
                    f4 = f6;
                    f3 = f5;
                    f2 = f6;
                    f = f5;
                    i = 2;
                    break;
                default:
                    i = 2;
                    break;
            }
            int i2 = 0;
            float f7 = f6;
            float f8 = f5;
            float f9 = f2;
            float f10 = f;
            while (i2 < fArr2.length) {
                float f11;
                float f12;
                boolean z;
                boolean z2;
                switch (c2) {
                    case 'A':
                        f5 = fArr2[i2 + 5];
                        f2 = fArr2[i2 + 6];
                        f = fArr2[i2 + 0];
                        f11 = fArr2[i2 + 1];
                        f12 = fArr2[i2 + 2];
                        z = fArr2[i2 + 3] != 0.0f;
                        if (fArr2[i2 + 4] != 0.0f) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        C0882b.m6461a(path, f10, f9, f5, f2, f, f11, f12, z, z2);
                        f3 = fArr2[i2 + 5];
                        f4 = fArr2[i2 + 6];
                        f6 = f7;
                        f5 = f8;
                        f2 = f3;
                        f = f4;
                        f11 = f3;
                        f3 = f4;
                        break;
                    case 'C':
                        path.cubicTo(fArr2[i2 + 0], fArr2[i2 + 1], fArr2[i2 + 2], fArr2[i2 + 3], fArr2[i2 + 4], fArr2[i2 + 5]);
                        f5 = fArr2[i2 + 4];
                        f6 = fArr2[i2 + 5];
                        f2 = fArr2[i2 + 2];
                        f = f6;
                        f11 = f5;
                        f6 = f7;
                        f5 = f8;
                        f3 = fArr2[i2 + 3];
                        break;
                    case 'H':
                        path.lineTo(fArr2[i2 + 0], f9);
                        f6 = f7;
                        f2 = f3;
                        f = f9;
                        f11 = fArr2[i2 + 0];
                        f3 = f4;
                        f5 = f8;
                        break;
                    case 'L':
                        path.lineTo(fArr2[i2 + 0], fArr2[i2 + 1]);
                        f5 = fArr2[i2 + 0];
                        f2 = f3;
                        f = fArr2[i2 + 1];
                        f11 = f5;
                        f6 = f7;
                        f5 = f8;
                        f3 = f4;
                        break;
                    case 'M':
                        f5 = fArr2[i2 + 0];
                        f6 = fArr2[i2 + 1];
                        if (i2 <= 0) {
                            path.moveTo(fArr2[i2 + 0], fArr2[i2 + 1]);
                            f2 = f3;
                            f = f6;
                            f11 = f5;
                            f3 = f4;
                            break;
                        }
                        path.lineTo(fArr2[i2 + 0], fArr2[i2 + 1]);
                        f2 = f3;
                        f = f6;
                        f11 = f5;
                        f6 = f7;
                        f5 = f8;
                        f3 = f4;
                        break;
                    case 'Q':
                        path.quadTo(fArr2[i2 + 0], fArr2[i2 + 1], fArr2[i2 + 2], fArr2[i2 + 3]);
                        f3 = fArr2[i2 + 0];
                        f4 = fArr2[i2 + 1];
                        f5 = fArr2[i2 + 2];
                        f2 = f3;
                        f = fArr2[i2 + 3];
                        f11 = f5;
                        f6 = f7;
                        f5 = f8;
                        f3 = f4;
                        break;
                    case 'S':
                        if (c == 'c' || c == 's' || c == 'C' || c == 'S') {
                            f6 = (2.0f * f10) - f3;
                            f3 = (2.0f * f9) - f4;
                        } else {
                            f3 = f9;
                            f6 = f10;
                        }
                        path.cubicTo(f6, f3, fArr2[i2 + 0], fArr2[i2 + 1], fArr2[i2 + 2], fArr2[i2 + 3]);
                        f3 = fArr2[i2 + 0];
                        f4 = fArr2[i2 + 1];
                        f5 = fArr2[i2 + 2];
                        f2 = f3;
                        f = fArr2[i2 + 3];
                        f11 = f5;
                        f6 = f7;
                        f5 = f8;
                        f3 = f4;
                        break;
                    case 'T':
                        if (c == 'q' || c == 't' || c == 'Q' || c == 'T') {
                            f10 = (2.0f * f10) - f3;
                            f9 = (2.0f * f9) - f4;
                        }
                        path.quadTo(f10, f9, fArr2[i2 + 0], fArr2[i2 + 1]);
                        f5 = fArr2[i2 + 0];
                        f3 = f9;
                        f2 = f10;
                        f = fArr2[i2 + 1];
                        f11 = f5;
                        f6 = f7;
                        f5 = f8;
                        break;
                    case 'V':
                        path.lineTo(f10, fArr2[i2 + 0]);
                        f5 = f8;
                        f2 = f3;
                        f = fArr2[i2 + 0];
                        f11 = f10;
                        f3 = f4;
                        f6 = f7;
                        break;
                    case 'a':
                        f5 = fArr2[i2 + 5] + f10;
                        f2 = fArr2[i2 + 6] + f9;
                        f = fArr2[i2 + 0];
                        f11 = fArr2[i2 + 1];
                        f12 = fArr2[i2 + 2];
                        z = fArr2[i2 + 3] != 0.0f;
                        if (fArr2[i2 + 4] != 0.0f) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        C0882b.m6461a(path, f10, f9, f5, f2, f, f11, f12, z, z2);
                        f3 = f10 + fArr2[i2 + 5];
                        f4 = fArr2[i2 + 6] + f9;
                        f6 = f7;
                        f5 = f8;
                        f2 = f3;
                        f = f4;
                        f11 = f3;
                        f3 = f4;
                        break;
                    case 'c':
                        path.rCubicTo(fArr2[i2 + 0], fArr2[i2 + 1], fArr2[i2 + 2], fArr2[i2 + 3], fArr2[i2 + 4], fArr2[i2 + 5]);
                        f2 = f10 + fArr2[i2 + 2];
                        f = fArr2[i2 + 5] + f9;
                        f11 = f10 + fArr2[i2 + 4];
                        f6 = f7;
                        f5 = f8;
                        f3 = fArr2[i2 + 3] + f9;
                        break;
                    case 'h':
                        path.rLineTo(fArr2[i2 + 0], 0.0f);
                        f6 = f7;
                        f2 = f3;
                        f = f9;
                        f11 = f10 + fArr2[i2 + 0];
                        f3 = f4;
                        f5 = f8;
                        break;
                    case 'l':
                        path.rLineTo(fArr2[i2 + 0], fArr2[i2 + 1]);
                        f2 = f3;
                        f = fArr2[i2 + 1] + f9;
                        f11 = f10 + fArr2[i2 + 0];
                        f6 = f7;
                        f5 = f8;
                        f3 = f4;
                        break;
                    case 'm':
                        f5 = f10 + fArr2[i2 + 0];
                        f6 = fArr2[i2 + 1] + f9;
                        if (i2 <= 0) {
                            path.rMoveTo(fArr2[i2 + 0], fArr2[i2 + 1]);
                            f2 = f3;
                            f = f6;
                            f11 = f5;
                            f3 = f4;
                            break;
                        }
                        path.rLineTo(fArr2[i2 + 0], fArr2[i2 + 1]);
                        f2 = f3;
                        f = f6;
                        f11 = f5;
                        f6 = f7;
                        f5 = f8;
                        f3 = f4;
                        break;
                    case 'q':
                        path.rQuadTo(fArr2[i2 + 0], fArr2[i2 + 1], fArr2[i2 + 2], fArr2[i2 + 3]);
                        f2 = f10 + fArr2[i2 + 0];
                        f = fArr2[i2 + 3] + f9;
                        f11 = f10 + fArr2[i2 + 2];
                        f6 = f7;
                        f5 = f8;
                        f3 = fArr2[i2 + 1] + f9;
                        break;
                    case 's':
                        if (c == 'c' || c == 's' || c == 'C' || c == 'S') {
                            f6 = f10 - f3;
                            f3 = f9 - f4;
                        } else {
                            f3 = 0.0f;
                            f6 = 0.0f;
                        }
                        path.rCubicTo(f6, f3, fArr2[i2 + 0], fArr2[i2 + 1], fArr2[i2 + 2], fArr2[i2 + 3]);
                        f2 = f10 + fArr2[i2 + 0];
                        f = fArr2[i2 + 3] + f9;
                        f11 = f10 + fArr2[i2 + 2];
                        f6 = f7;
                        f5 = f8;
                        f3 = fArr2[i2 + 1] + f9;
                        break;
                    case 't':
                        if (c == 'q' || c == 't' || c == 'Q' || c == 'T') {
                            f6 = f10 - f3;
                            f4 = f9 - f4;
                        } else {
                            f4 = 0.0f;
                            f6 = 0.0f;
                        }
                        path.rQuadTo(f6, f4, fArr2[i2 + 0], fArr2[i2 + 1]);
                        f2 = f10 + f6;
                        f = fArr2[i2 + 1] + f9;
                        f11 = f10 + fArr2[i2 + 0];
                        f6 = f7;
                        f5 = f8;
                        f3 = f4 + f9;
                        break;
                    case 'v':
                        path.rLineTo(0.0f, fArr2[i2 + 0]);
                        f5 = f8;
                        f2 = f3;
                        f = fArr2[i2 + 0] + f9;
                        f11 = f10;
                        f3 = f4;
                        f6 = f7;
                        break;
                    default:
                        f6 = f7;
                        f5 = f8;
                        f2 = f3;
                        f = f9;
                        f11 = f10;
                        f3 = f4;
                        break;
                }
                i2 += i;
                f7 = f6;
                f8 = f5;
                f9 = f;
                f10 = f11;
                c = c2;
                f4 = f3;
                f3 = f2;
            }
            fArr[0] = f10;
            fArr[1] = f9;
            fArr[2] = f3;
            fArr[3] = f4;
            fArr[4] = f8;
            fArr[5] = f7;
        }

        /* renamed from: a */
        private static void m6461a(Path path, float f, float f2, float f3, float f4, float f5, float f6, float f7, boolean z, boolean z2) {
            double toRadians = Math.toRadians((double) f7);
            double cos = Math.cos(toRadians);
            double sin = Math.sin(toRadians);
            double d = ((((double) f) * cos) + (((double) f2) * sin)) / ((double) f5);
            double d2 = ((((double) (-f)) * sin) + (((double) f2) * cos)) / ((double) f6);
            double d3 = ((((double) f3) * cos) + (((double) f4) * sin)) / ((double) f5);
            double d4 = ((((double) (-f3)) * sin) + (((double) f4) * cos)) / ((double) f6);
            double d5 = d - d3;
            double d6 = d2 - d4;
            double d7 = (d + d3) / 2.0d;
            double d8 = (d2 + d4) / 2.0d;
            double d9 = (d5 * d5) + (d6 * d6);
            if (d9 == 0.0d) {
                Log.w("PathParser", " Points are coincident");
                return;
            }
            double d10 = (1.0d / d9) - 0.25d;
            if (d10 < 0.0d) {
                Log.w("PathParser", "Points are too far apart " + d9);
                float sqrt = (float) (Math.sqrt(d9) / 1.99999d);
                C0882b.m6461a(path, f, f2, f3, f4, f5 * sqrt, f6 * sqrt, f7, z, z2);
                return;
            }
            d9 = Math.sqrt(d10);
            d5 *= d9;
            d6 *= d9;
            if (z == z2) {
                d6 = d7 - d6;
                d5 += d8;
            } else {
                d6 += d7;
                d5 = d8 - d5;
            }
            d7 = Math.atan2(d2 - d5, d - d6);
            d4 = Math.atan2(d4 - d5, d3 - d6) - d7;
            if (z2 != (d4 >= 0.0d)) {
                if (d4 > 0.0d) {
                    d4 -= 6.283185307179586d;
                } else {
                    d4 += 6.283185307179586d;
                }
            }
            d = ((double) f5) * d6;
            d5 *= (double) f6;
            C0882b.m6460a(path, (d * cos) - (d5 * sin), (d * sin) + (d5 * cos), (double) f5, (double) f6, (double) f, (double) f2, toRadians, d7, d4);
        }

        /* renamed from: a */
        private static void m6460a(Path path, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9) {
            int ceil = (int) Math.ceil(Math.abs((4.0d * d9) / 3.141592653589793d));
            double cos = Math.cos(d7);
            double sin = Math.sin(d7);
            double cos2 = Math.cos(d8);
            double sin2 = Math.sin(d8);
            double d10 = (((-d3) * cos) * sin2) - ((d4 * sin) * cos2);
            double d11 = d9 / ((double) ceil);
            int i = 0;
            cos2 = (sin2 * ((-d3) * sin)) + (cos2 * (d4 * cos));
            sin2 = d10;
            while (i < ceil) {
                double d12 = d8 + d11;
                d10 = Math.sin(d12);
                double cos3 = Math.cos(d12);
                double d13 = (((d3 * cos) * cos3) + d) - ((d4 * sin) * d10);
                double d14 = ((d4 * cos) * d10) + (((d3 * sin) * cos3) + d2);
                double d15 = (((-d3) * cos) * d10) - ((d4 * sin) * cos3);
                cos3 = (cos3 * (d4 * cos)) + (d10 * ((-d3) * sin));
                d10 = Math.tan((d12 - d8) / 2.0d);
                d10 = ((Math.sqrt((d10 * (3.0d * d10)) + 4.0d) - 1.0d) * Math.sin(d12 - d8)) / 3.0d;
                sin2 = (sin2 * d10) + d5;
                double d16 = d6 + (cos2 * d10);
                double d17 = d13 - (d10 * d15);
                d10 = d14 - (d10 * cos3);
                path.rLineTo(0.0f, 0.0f);
                path.cubicTo((float) sin2, (float) d16, (float) d17, (float) d10, (float) d13, (float) d14);
                i++;
                sin2 = d15;
                d8 = d12;
                d6 = d14;
                d5 = d13;
                cos2 = cos3;
            }
        }
    }

    /* renamed from: a */
    static float[] m6468a(float[] fArr, int i, int i2) {
        if (i > i2) {
            throw new IllegalArgumentException();
        }
        int length = fArr.length;
        if (i < 0 || i > length) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int i3 = i2 - i;
        length = Math.min(i3, length - i);
        Object obj = new float[i3];
        System.arraycopy(fArr, i, obj, 0, length);
        return obj;
    }

    /* renamed from: a */
    public static C0882b[] m6469a(String str) {
        if (str == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i = 1;
        int i2 = 0;
        while (i < str.length()) {
            int a = ay.m6464a(str, i);
            String trim = str.substring(i2, a).trim();
            if (trim.length() > 0) {
                ay.m6466a(arrayList, trim.charAt(0), ay.m6472b(trim));
            }
            i = a + 1;
            i2 = a;
        }
        if (i - i2 == 1 && i2 < str.length()) {
            ay.m6466a(arrayList, str.charAt(i2), new float[0]);
        }
        return (C0882b[]) arrayList.toArray(new C0882b[arrayList.size()]);
    }

    /* renamed from: a */
    public static C0882b[] m6470a(C0882b[] c0882bArr) {
        if (c0882bArr == null) {
            return null;
        }
        C0882b[] c0882bArr2 = new C0882b[c0882bArr.length];
        for (int i = 0; i < c0882bArr.length; i++) {
            c0882bArr2[i] = new C0882b(c0882bArr[i]);
        }
        return c0882bArr2;
    }

    /* renamed from: a */
    public static boolean m6467a(C0882b[] c0882bArr, C0882b[] c0882bArr2) {
        if (c0882bArr == null || c0882bArr2 == null || c0882bArr.length != c0882bArr2.length) {
            return false;
        }
        int i = 0;
        while (i < c0882bArr.length) {
            if (c0882bArr[i].f4931a != c0882bArr2[i].f4931a || c0882bArr[i].f4932b.length != c0882bArr2[i].f4932b.length) {
                return false;
            }
            i++;
        }
        return true;
    }

    /* renamed from: b */
    public static void m6471b(C0882b[] c0882bArr, C0882b[] c0882bArr2) {
        for (int i = 0; i < c0882bArr2.length; i++) {
            c0882bArr[i].f4931a = c0882bArr2[i].f4931a;
            for (int i2 = 0; i2 < c0882bArr2[i].f4932b.length; i2++) {
                c0882bArr[i].f4932b[i2] = c0882bArr2[i].f4932b[i2];
            }
        }
    }

    /* renamed from: a */
    private static int m6464a(String str, int i) {
        while (i < str.length()) {
            char charAt = str.charAt(i);
            if (((charAt - 65) * (charAt - 90) <= 0 || (charAt - 97) * (charAt - 122) <= 0) && charAt != 'e' && charAt != 'E') {
                break;
            }
            i++;
        }
        return i;
    }

    /* renamed from: a */
    private static void m6466a(ArrayList<C0882b> arrayList, char c, float[] fArr) {
        arrayList.add(new C0882b(c, fArr));
    }

    /* renamed from: b */
    private static float[] m6472b(String str) {
        if (((str.charAt(0) == 'z' ? 1 : 0) | (str.charAt(0) == 'Z' ? 1 : 0)) != 0) {
            return new float[0];
        }
        try {
            float[] fArr = new float[str.length()];
            C0881a c0881a = new C0881a();
            int length = str.length();
            int i = 0;
            int i2 = 1;
            while (i2 < length) {
                int i3;
                ay.m6465a(str, i2, c0881a);
                int i4 = c0881a.f4929a;
                if (i2 < i4) {
                    i3 = i + 1;
                    fArr[i] = Float.parseFloat(str.substring(i2, i4));
                } else {
                    i3 = i;
                }
                if (c0881a.f4930b) {
                    i2 = i4;
                    i = i3;
                } else {
                    i2 = i4 + 1;
                    i = i3;
                }
            }
            return ay.m6468a(fArr, 0, i);
        } catch (Throwable e) {
            throw new RuntimeException("error in parsing \"" + str + "\"", e);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    private static void m6465a(String r7, int r8, p000.ay.C0881a r9) {
        /*
        r1 = 0;
        r5 = 1;
        r9.f4930b = r1;
        r0 = r1;
        r2 = r1;
        r3 = r1;
        r4 = r8;
    L_0x0008:
        r6 = r7.length();
        if (r4 >= r6) goto L_0x0018;
    L_0x000e:
        r6 = r7.charAt(r4);
        switch(r6) {
            case 32: goto L_0x001b;
            case 44: goto L_0x001b;
            case 45: goto L_0x001e;
            case 46: goto L_0x0027;
            case 69: goto L_0x0031;
            case 101: goto L_0x0031;
            default: goto L_0x0015;
        };
    L_0x0015:
        r0 = r1;
    L_0x0016:
        if (r3 == 0) goto L_0x0033;
    L_0x0018:
        r9.f4929a = r4;
        return;
    L_0x001b:
        r0 = r1;
        r3 = r5;
        goto L_0x0016;
    L_0x001e:
        if (r4 == r8) goto L_0x0015;
    L_0x0020:
        if (r0 != 0) goto L_0x0015;
    L_0x0022:
        r9.f4930b = r5;
        r0 = r1;
        r3 = r5;
        goto L_0x0016;
    L_0x0027:
        if (r2 != 0) goto L_0x002c;
    L_0x0029:
        r0 = r1;
        r2 = r5;
        goto L_0x0016;
    L_0x002c:
        r9.f4930b = r5;
        r0 = r1;
        r3 = r5;
        goto L_0x0016;
    L_0x0031:
        r0 = r5;
        goto L_0x0016;
    L_0x0033:
        r4 = r4 + 1;
        goto L_0x0008;
        */
        throw new UnsupportedOperationException("Method not decompiled: ay.a(java.lang.String, int, ay$a):void");
    }
}
