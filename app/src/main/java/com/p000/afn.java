package com.p000;

import android.util.Pair;
import com.facebook.common.util.ByteConstants;
import java.util.Arrays;
import java.util.Collections;

/* compiled from: AdtsReader */
/* renamed from: afn */
final class afn extends afp {
    /* renamed from: b */
    private static final byte[] f1097b = new byte[]{(byte) 73, (byte) 68, (byte) 51};
    /* renamed from: c */
    private final ahj f1098c = new ahj(new byte[7]);
    /* renamed from: d */
    private final ahk f1099d = new ahk(Arrays.copyOf(f1097b, 10));
    /* renamed from: e */
    private final aep f1100e;
    /* renamed from: f */
    private int f1101f;
    /* renamed from: g */
    private int f1102g;
    /* renamed from: h */
    private int f1103h;
    /* renamed from: i */
    private boolean f1104i;
    /* renamed from: j */
    private boolean f1105j;
    /* renamed from: k */
    private long f1106k;
    /* renamed from: l */
    private int f1107l;
    /* renamed from: m */
    private long f1108m;
    /* renamed from: n */
    private aep f1109n;
    /* renamed from: o */
    private long f1110o;

    public afn(aep aep, aep aep2) {
        super(aep);
        this.f1100e = aep2;
        aep2.mo126a(ado.m813a());
        m1274c();
    }

    /* renamed from: a */
    public void mo160a() {
        m1274c();
    }

    /* renamed from: a */
    public void mo161a(long j, boolean z) {
        this.f1108m = j;
    }

    /* renamed from: a */
    public void mo162a(ahk ahk) {
        while (ahk.m1563b() > 0) {
            switch (this.f1101f) {
                case 0:
                    m1273b(ahk);
                    break;
                case 1:
                    if (!m1272a(ahk, this.f1099d.f1493a, 10)) {
                        break;
                    }
                    m1278f();
                    break;
                case 2:
                    if (!m1272a(ahk, this.f1098c.f1489a, this.f1104i ? 7 : 5)) {
                        break;
                    }
                    m1279g();
                    break;
                case 3:
                    m1275c(ahk);
                    break;
                default:
                    break;
            }
        }
    }

    /* renamed from: b */
    public void mo163b() {
    }

    /* renamed from: a */
    private boolean m1272a(ahk ahk, byte[] bArr, int i) {
        int min = Math.min(ahk.m1563b(), i - this.f1102g);
        ahk.m1562a(bArr, this.f1102g, min);
        this.f1102g = min + this.f1102g;
        return this.f1102g == i;
    }

    /* renamed from: c */
    private void m1274c() {
        this.f1101f = 0;
        this.f1102g = 0;
        this.f1103h = 256;
    }

    /* renamed from: d */
    private void m1276d() {
        this.f1101f = 1;
        this.f1102g = f1097b.length;
        this.f1107l = 0;
        this.f1099d.m1564b(0);
    }

    /* renamed from: a */
    private void m1271a(aep aep, long j, int i, int i2) {
        this.f1101f = 3;
        this.f1102g = i;
        this.f1109n = aep;
        this.f1110o = j;
        this.f1107l = i2;
    }

    /* renamed from: e */
    private void m1277e() {
        this.f1101f = 2;
        this.f1102g = 0;
    }

    /* renamed from: b */
    private void m1273b(ahk ahk) {
        byte[] bArr = ahk.f1493a;
        int d = ahk.m1567d();
        int c = ahk.m1565c();
        while (d < c) {
            int i = d + 1;
            d = bArr[d] & 255;
            if (this.f1103h != 512 || d < 240 || d == 255) {
                switch (d | this.f1103h) {
                    case 329:
                        this.f1103h = 768;
                        d = i;
                        break;
                    case 511:
                        this.f1103h = 512;
                        d = i;
                        break;
                    case 836:
                        this.f1103h = ByteConstants.KB;
                        d = i;
                        break;
                    case 1075:
                        m1276d();
                        ahk.m1564b(i);
                        return;
                    default:
                        if (this.f1103h == 256) {
                            d = i;
                            break;
                        }
                        this.f1103h = 256;
                        d = i - 1;
                        break;
                }
            }
            this.f1104i = (d & 1) == 0;
            m1277e();
            ahk.m1564b(i);
            return;
        }
        ahk.m1564b(d);
    }

    /* renamed from: f */
    private void m1278f() {
        this.f1100e.mo127a(this.f1099d, 10);
        this.f1099d.m1564b(6);
        m1271a(this.f1100e, 0, 10, this.f1099d.m1578n() + 10);
    }

    /* renamed from: g */
    private void m1279g() {
        this.f1098c.m1548a(0);
        if (this.f1105j) {
            this.f1098c.m1551b(10);
        } else {
            int c = this.f1098c.m1554c(2) + 1;
            int c2 = this.f1098c.m1554c(4);
            this.f1098c.m1551b(1);
            byte[] a = ahd.m1522a(c, c2, this.f1098c.m1554c(3));
            Pair a2 = ahd.m1520a(a);
            ado a3 = ado.m816a(null, "audio/mp4a-latm", -1, -1, -1, ((Integer) a2.second).intValue(), ((Integer) a2.first).intValue(), Collections.singletonList(a), null);
            this.f1106k = 1024000000 / ((long) a3.f634o);
            this.a.mo126a(a3);
            this.f1105j = true;
        }
        this.f1098c.m1551b(4);
        int c3 = (this.f1098c.m1554c(13) - 2) - 5;
        if (this.f1104i) {
            c3 -= 2;
        }
        m1271a(this.a, this.f1106k, 0, c3);
    }

    /* renamed from: c */
    private void m1275c(ahk ahk) {
        int min = Math.min(ahk.m1563b(), this.f1107l - this.f1102g);
        this.f1109n.mo127a(ahk, min);
        this.f1102g = min + this.f1102g;
        if (this.f1102g == this.f1107l) {
            this.f1109n.mo125a(this.f1108m, 1, this.f1107l, 0, null);
            this.f1108m += this.f1110o;
            m1274c();
        }
    }
}
