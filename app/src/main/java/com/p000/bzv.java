package com.p000;

import com.facebook.stetho.server.http.HttpStatus;
import com.mopub.common.logging.MoPubLog;
import com.mopub.nativeads.MoPubNativeAdPositioning.MoPubClientPositioning;
import com.mopub.nativeads.NativeAd;
import java.util.List;

/* compiled from: PlacementData */
/* renamed from: bzv */
public class bzv {
    public static final int NOT_FOUND = -1;
    /* renamed from: a */
    private final int[] f8346a = new int[HttpStatus.HTTP_OK];
    /* renamed from: b */
    private final int[] f8347b = new int[HttpStatus.HTTP_OK];
    /* renamed from: c */
    private int f8348c = 0;
    /* renamed from: d */
    private final int[] f8349d = new int[HttpStatus.HTTP_OK];
    /* renamed from: e */
    private final int[] f8350e = new int[HttpStatus.HTTP_OK];
    /* renamed from: f */
    private final NativeAd[] f8351f = new NativeAd[HttpStatus.HTTP_OK];
    /* renamed from: g */
    private int f8352g = 0;

    private bzv(int[] iArr) {
        this.f8348c = Math.min(iArr.length, HttpStatus.HTTP_OK);
        System.arraycopy(iArr, 0, this.f8347b, 0, this.f8348c);
        System.arraycopy(iArr, 0, this.f8346a, 0, this.f8348c);
    }

    /* renamed from: a */
    public static bzv m11965a(MoPubClientPositioning moPubClientPositioning) {
        int i = 0;
        List<Integer> a = moPubClientPositioning.a();
        int b = moPubClientPositioning.b();
        int size = b == MoPubClientPositioning.NO_REPEAT ? a.size() : HttpStatus.HTTP_OK;
        int[] iArr = new int[size];
        int i2 = 0;
        for (Integer intValue : a) {
            i2 = intValue.intValue() - i;
            int i3 = i + 1;
            iArr[i] = i2;
            i = i3;
        }
        while (i < size) {
            i2 = (i2 + b) - 1;
            i3 = i + 1;
            iArr[i] = i2;
            i = i3;
        }
        return new bzv(iArr);
    }

    /* renamed from: a */
    public static bzv m11964a() {
        return new bzv(new int[0]);
    }

    /* renamed from: a */
    public boolean m11969a(int i) {
        if (bzv.m11963a(this.f8347b, 0, this.f8348c, i) >= 0) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public int m11970b(int i) {
        int b = bzv.m11966b(this.f8347b, this.f8348c, i);
        if (b == this.f8348c) {
            return -1;
        }
        return this.f8347b[b];
    }

    /* renamed from: a */
    public void m11968a(int i, NativeAd nativeAd) {
        int a = bzv.m11962a(this.f8347b, this.f8348c, i);
        if (a == this.f8348c || this.f8347b[a] != i) {
            MoPubLog.w("Attempted to insert an ad at an invalid position");
            return;
        }
        int i2 = this.f8346a[a];
        int b = bzv.m11966b(this.f8349d, this.f8352g, i2);
        if (b < this.f8352g) {
            int i3 = this.f8352g - b;
            System.arraycopy(this.f8349d, b, this.f8349d, b + 1, i3);
            System.arraycopy(this.f8350e, b, this.f8350e, b + 1, i3);
            System.arraycopy(this.f8351f, b, this.f8351f, b + 1, i3);
        }
        this.f8349d[b] = i2;
        this.f8350e[b] = i;
        this.f8351f[b] = nativeAd;
        this.f8352g++;
        i2 = (this.f8348c - a) - 1;
        System.arraycopy(this.f8347b, a + 1, this.f8347b, a, i2);
        System.arraycopy(this.f8346a, a + 1, this.f8346a, a, i2);
        this.f8348c--;
        while (a < this.f8348c) {
            int[] iArr = this.f8347b;
            iArr[a] = iArr[a] + 1;
            a++;
        }
        for (a = b + 1; a < this.f8352g; a++) {
            iArr = this.f8350e;
            iArr[a] = iArr[a] + 1;
        }
    }

    /* renamed from: c */
    public boolean m11974c(int i) {
        if (bzv.m11963a(this.f8350e, 0, this.f8352g, i) >= 0) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public NativeAd m11975d(int i) {
        int a = bzv.m11963a(this.f8350e, 0, this.f8352g, i);
        if (a < 0) {
            return null;
        }
        return this.f8351f[a];
    }

    /* renamed from: b */
    public int[] m11972b() {
        Object obj = new int[this.f8352g];
        System.arraycopy(this.f8350e, 0, obj, 0, this.f8352g);
        return obj;
    }

    /* renamed from: e */
    public int m11976e(int i) {
        int a = bzv.m11963a(this.f8350e, 0, this.f8352g, i);
        if (a < 0) {
            return i - (a ^ -1);
        }
        return -1;
    }

    /* renamed from: f */
    public int m11977f(int i) {
        return bzv.m11966b(this.f8349d, this.f8352g, i) + i;
    }

    /* renamed from: g */
    public int m11978g(int i) {
        if (i == 0) {
            return 0;
        }
        int e = m11976e(i - 1);
        if (e != -1) {
            return e + 1;
        }
        return -1;
    }

    /* renamed from: h */
    public int m11979h(int i) {
        if (i == 0) {
            return 0;
        }
        return m11977f(i - 1) + 1;
    }

    /* renamed from: a */
    public int m11967a(int i, int i2) {
        int i3;
        int i4 = 0;
        int[] iArr = new int[this.f8352g];
        int[] iArr2 = new int[this.f8352g];
        int i5 = 0;
        for (i3 = 0; i3 < this.f8352g; i3++) {
            int i6 = this.f8349d[i3];
            int i7 = this.f8350e[i3];
            if (i <= i7 && i7 < i2) {
                iArr[i5] = i6;
                iArr2[i5] = i7 - i5;
                this.f8351f[i3].destroy();
                this.f8351f[i3] = null;
                i5++;
            } else if (i5 > 0) {
                int i8 = i3 - i5;
                this.f8349d[i8] = i6;
                this.f8350e[i8] = i7 - i5;
                this.f8351f[i8] = this.f8351f[i3];
            }
        }
        if (i5 == 0) {
            return 0;
        }
        i6 = bzv.m11962a(this.f8347b, this.f8348c, iArr2[0]);
        for (i3 = this.f8348c - 1; i3 >= i6; i3--) {
            this.f8346a[i3 + i5] = this.f8346a[i3];
            this.f8347b[i3 + i5] = this.f8347b[i3] - i5;
        }
        while (i4 < i5) {
            this.f8346a[i6 + i4] = iArr[i4];
            this.f8347b[i6 + i4] = iArr2[i4];
            i4++;
        }
        this.f8348c += i5;
        this.f8352g -= i5;
        return i5;
    }

    /* renamed from: c */
    public void m11973c() {
        if (this.f8352g != 0) {
            m11967a(0, this.f8350e[this.f8352g - 1] + 1);
        }
    }

    /* renamed from: i */
    public void m11980i(int i) {
        int a;
        for (a = bzv.m11962a(this.f8346a, this.f8348c, i); a < this.f8348c; a++) {
            int[] iArr = this.f8346a;
            iArr[a] = iArr[a] + 1;
            iArr = this.f8347b;
            iArr[a] = iArr[a] + 1;
        }
        for (a = bzv.m11962a(this.f8349d, this.f8352g, i); a < this.f8352g; a++) {
            iArr = this.f8349d;
            iArr[a] = iArr[a] + 1;
            iArr = this.f8350e;
            iArr[a] = iArr[a] + 1;
        }
    }

    /* renamed from: j */
    public void m11981j(int i) {
        int b;
        for (b = bzv.m11966b(this.f8346a, this.f8348c, i); b < this.f8348c; b++) {
            int[] iArr = this.f8346a;
            iArr[b] = iArr[b] - 1;
            iArr = this.f8347b;
            iArr[b] = iArr[b] - 1;
        }
        for (b = bzv.m11966b(this.f8349d, this.f8352g, i); b < this.f8352g; b++) {
            iArr = this.f8349d;
            iArr[b] = iArr[b] - 1;
            iArr = this.f8350e;
            iArr[b] = iArr[b] - 1;
        }
    }

    /* renamed from: b */
    public void m11971b(int i, int i2) {
        m11981j(i);
        m11980i(i2);
    }

    /* renamed from: a */
    private static int m11962a(int[] iArr, int i, int i2) {
        int a = bzv.m11963a(iArr, 0, i, i2);
        if (a < 0) {
            return a ^ -1;
        }
        int i3 = iArr[a];
        while (a >= 0 && iArr[a] == i3) {
            a--;
        }
        return a + 1;
    }

    /* renamed from: b */
    private static int m11966b(int[] iArr, int i, int i2) {
        int a = bzv.m11963a(iArr, 0, i, i2);
        if (a < 0) {
            return a ^ -1;
        }
        int i3 = iArr[a];
        while (a < i && iArr[a] == i3) {
            a++;
        }
        return a;
    }

    /* renamed from: a */
    private static int m11963a(int[] iArr, int i, int i2, int i3) {
        int i4 = i2 - 1;
        int i5 = i;
        while (i5 <= i4) {
            int i6 = (i5 + i4) >>> 1;
            int i7 = iArr[i6];
            if (i7 < i3) {
                i5 = i6 + 1;
            } else if (i7 <= i3) {
                return i6;
            } else {
                i4 = i6 - 1;
            }
        }
        return i5 ^ -1;
    }
}
