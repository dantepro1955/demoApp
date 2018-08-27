package com.p000;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.BitmapFactory.Options;
import android.graphics.BitmapRegionDecoder;
import android.graphics.Rect;
import android.util.Log;
import java.io.FileNotFoundException;
import java.io.IOException;

/* compiled from: AbstractTileBuilder */
/* renamed from: dmb */
public abstract class dmb {
    /* renamed from: a */
    private C4978a f22140a;

    /* compiled from: AbstractTileBuilder */
    /* renamed from: dmb$a */
    public interface C4978a {
        /* renamed from: a */
        void mo4451a(int i, int i2);
    }

    /* compiled from: AbstractTileBuilder */
    /* renamed from: dmb$b */
    public static class C4979b {
        /* renamed from: a */
        public int f22155a = 512;
        /* renamed from: b */
        public int f22156b = 512;
        /* renamed from: c */
        public int f22157c = 100;
        /* renamed from: d */
        public int f22158d = 0;
        /* renamed from: e */
        public int f22159e = 0;
        /* renamed from: f */
        public int f22160f = 0;
        /* renamed from: g */
        public int f22161g = 0;
        /* renamed from: h */
        public int f22162h = 10;
        /* renamed from: i */
        public int f22163i = 10;
        /* renamed from: j */
        public CompressFormat f22164j = CompressFormat.JPEG;
    }

    /* renamed from: a */
    public abstract Options mo4448a();

    /* renamed from: a */
    public abstract String mo4449a(int i, int i2);

    /* renamed from: b */
    public abstract C4979b mo4450b();

    /* renamed from: a */
    public void m27940a(C4978a c4978a) {
        this.f22140a = c4978a;
    }

    /* renamed from: a */
    public void m27938a(Bitmap bitmap) throws IOException {
        m27939a(bitmap, mo4450b());
    }

    /* renamed from: a */
    public void m27939a(Bitmap bitmap, C4979b c4979b) throws IOException {
        if (bitmap != null) {
            int i = c4979b.f22155a;
            int i2 = c4979b.f22156b;
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            int max = Math.max(0, (width - c4979b.f22160f) - c4979b.f22161g);
            int max2 = Math.max(0, (height - c4979b.f22158d) - c4979b.f22159e);
            int max3 = Math.max(0, width - c4979b.f22161g);
            int max4 = Math.max(0, height - c4979b.f22159e);
            int i3 = ((max2 + i2) - 1) / i2;
            int i4 = ((max + i) - 1) / i;
            width = c4979b.f22160f;
            max2 = c4979b.f22158d;
            String str = "";
            Object obj = null;
            for (max = 0; max < i3; max++) {
                int i5 = 0;
                int min = Math.min(i2, max4 - max2);
                for (int i6 = 0; i6 < i4; i6++) {
                    Bitmap createBitmap = Bitmap.createBitmap(bitmap, i5, max2, Math.min(i, max3 - i5), min);
                    String a = mo4449a(max, i6);
                    try {
                        djl.m27586a(createBitmap, c4979b.f22164j, c4979b.f22157c, a);
                    } catch (Throwable e) {
                        obj = 1;
                        str = Log.getStackTraceString(e);
                    } catch (Exception e2) {
                        obj = 1;
                        str = e2.getMessage();
                    }
                    createBitmap.recycle();
                    i5 += i;
                }
                max2 += i2;
            }
            if (obj != null) {
                throw new IOException("Exception caught during generateTile - " + str);
            }
        }
    }

    /* renamed from: a */
    private int m27934a(int i, C4979b c4979b) {
        return c4979b.f22158d + ((c4979b.f22162h * i) * c4979b.f22156b);
    }

    /* renamed from: b */
    private int m27935b(int i, C4979b c4979b) {
        return c4979b.f22160f + ((c4979b.f22163i * i) * c4979b.f22155a);
    }

    /* renamed from: a */
    public void m27941a(String str, int i, int i2) throws IOException {
        m27942a(str, i, i2, mo4450b());
    }

    /* renamed from: a */
    public void m27942a(String str, int i, int i2, C4979b c4979b) throws IOException {
        System.currentTimeMillis();
        BitmapRegionDecoder newInstance = BitmapRegionDecoder.newInstance(str, false);
        Rect rect = new Rect();
        int i3 = c4979b.f22155a;
        int i4 = c4979b.f22156b;
        int max = Math.max(0, (i - c4979b.f22160f) - c4979b.f22161g);
        int max2 = Math.max(0, (i2 - c4979b.f22158d) - c4979b.f22159e);
        int max3 = Math.max(0, i - c4979b.f22161g);
        int max4 = Math.max(0, i2 - c4979b.f22159e);
        int i5 = ((max2 + i4) - 1) / i4;
        int i6 = ((max + i3) - 1) / i3;
        int i7 = ((c4979b.f22162h + i5) - 1) / c4979b.f22162h;
        int i8 = ((c4979b.f22163i + i6) - 1) / c4979b.f22163i;
        for (int i9 = 0; i9 < i7; i9++) {
            for (int i10 = 0; i10 < i8; i10++) {
                max = c4979b.f22162h * i9;
                int i11 = i10 * c4979b.f22163i;
                int min = Math.min(i5, c4979b.f22162h + max);
                int min2 = Math.min(i6, c4979b.f22163i + i11);
                rect.top = m27934a(i9, c4979b);
                rect.bottom = Math.min(max4, m27934a(i9 + 1, c4979b));
                rect.left = m27935b(i10, c4979b);
                rect.right = Math.min(max3, m27935b(i10 + 1, c4979b));
                Bitmap decodeRegion = newInstance.decodeRegion(rect, mo4448a());
                int height = decodeRegion.getHeight();
                int width = decodeRegion.getWidth();
                max2 = 0;
                int i12 = max;
                while (i12 < min) {
                    max = 0;
                    int min3 = Math.min(i4, height - max2);
                    if (min3 <= 0) {
                        max = max2;
                    } else {
                        for (int i13 = i11; i13 < min2; i13++) {
                            int min4 = Math.min(i3, width - max);
                            if (min4 > 0) {
                                Bitmap createBitmap = Bitmap.createBitmap(decodeRegion, max, max2, min4, min3);
                                try {
                                    djl.m27586a(createBitmap, c4979b.f22164j, c4979b.f22157c, mo4449a(i12, i13));
                                    if (this.f22140a != null) {
                                        this.f22140a.mo4451a(i12, i13);
                                    }
                                } catch (FileNotFoundException e) {
                                }
                                createBitmap.recycle();
                                max += i3;
                            }
                        }
                        max = max2 + i4;
                    }
                    i12++;
                    max2 = max;
                }
            }
        }
    }
}
