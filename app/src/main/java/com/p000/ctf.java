package com.p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.BitmapFactory.Options;
import android.graphics.BitmapRegionDecoder;
import android.graphics.Rect;
import android.util.Log;
import java.io.FileNotFoundException;
import java.io.IOException;

/* compiled from: AbstractTileBuilder */
/* renamed from: ctf */
public abstract class ctf {
    /* renamed from: a */
    private boolean f19974a = false;
    /* renamed from: b */
    private C4578a f19975b;

    /* compiled from: AbstractTileBuilder */
    /* renamed from: ctf$a */
    public interface C4578a {
        /* renamed from: a */
        void m24866a(int i, int i2);
    }

    /* compiled from: AbstractTileBuilder */
    /* renamed from: ctf$b */
    public static class C4579b {
        /* renamed from: a */
        public int f20167a = 512;
        /* renamed from: b */
        public int f20168b = 512;
        /* renamed from: c */
        public int f20169c = 100;
        /* renamed from: d */
        public int f20170d = 0;
        /* renamed from: e */
        public int f20171e = 0;
        /* renamed from: f */
        public int f20172f = 0;
        /* renamed from: g */
        public int f20173g = 0;
        /* renamed from: h */
        public int f20174h = 10;
        /* renamed from: i */
        public int f20175i = 10;
        /* renamed from: j */
        public CompressFormat f20176j = CompressFormat.JPEG;
    }

    /* renamed from: a */
    public abstract C4579b mo4113a();

    /* renamed from: a */
    public abstract String mo4114a(int i, int i2);

    /* renamed from: b */
    public abstract Options mo4115b();

    /* renamed from: a */
    public void m24478a(C4578a c4578a) {
        this.f19975b = c4578a;
    }

    /* renamed from: a */
    public void m24481a(boolean z) {
        this.f19974a = z;
    }

    /* renamed from: a */
    public void m24476a(Bitmap bitmap) throws IOException {
        m24477a(bitmap, mo4113a());
    }

    /* renamed from: a */
    public void m24477a(Bitmap bitmap, C4579b c4579b) throws IOException {
        if (bitmap != null) {
            int i = c4579b.f20167a;
            int i2 = c4579b.f20168b;
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            int max = Math.max(0, (width - c4579b.f20172f) - c4579b.f20173g);
            int max2 = Math.max(0, (height - c4579b.f20170d) - c4579b.f20171e);
            int max3 = Math.max(0, width - c4579b.f20173g);
            int max4 = Math.max(0, height - c4579b.f20171e);
            int i3 = ((max2 + i2) - 1) / i2;
            int i4 = ((max + i) - 1) / i;
            width = c4579b.f20172f;
            max2 = c4579b.f20170d;
            boolean z = this.f19974a;
            Context context = caf.a().f8449a;
            String str = "";
            Object obj = null;
            for (max = 0; max < i3; max++) {
                int i5 = 0;
                int min = Math.min(i2, max4 - max2);
                for (int i6 = 0; i6 < i4; i6++) {
                    Bitmap createBitmap = Bitmap.createBitmap(bitmap, i5, max2, Math.min(i, max3 - i5), min);
                    String a = mo4114a(max, i6);
                    try {
                        djl.m27586a(createBitmap, c4579b.f20176j, c4579b.f20169c, a);
                        if (z) {
                            chn.B(" Mem : " + m24473c() + "KB " + " Path: " + a);
                        }
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
                throw new IOException("Exception caught during generateTile - " + (str + "; Mem: " + m24473c() + "KB"));
            }
        }
    }

    /* renamed from: c */
    private long m24473c() {
        return Runtime.getRuntime().freeMemory() / 1024;
    }

    /* renamed from: a */
    private int m24471a(int i, C4579b c4579b) {
        return c4579b.f20170d + ((c4579b.f20174h * i) * c4579b.f20168b);
    }

    /* renamed from: b */
    private int m24472b(int i, C4579b c4579b) {
        return c4579b.f20172f + ((c4579b.f20175i * i) * c4579b.f20167a);
    }

    /* renamed from: a */
    public void m24479a(String str, int i, int i2) throws IOException {
        m24480a(str, i, i2, mo4113a());
    }

    /* renamed from: a */
    public void m24480a(String str, int i, int i2, C4579b c4579b) throws IOException {
        System.currentTimeMillis();
        BitmapRegionDecoder newInstance = BitmapRegionDecoder.newInstance(str, false);
        Rect rect = new Rect();
        int i3 = c4579b.f20167a;
        int i4 = c4579b.f20168b;
        int max = Math.max(0, (i - c4579b.f20172f) - c4579b.f20173g);
        int max2 = Math.max(0, (i2 - c4579b.f20170d) - c4579b.f20171e);
        int max3 = Math.max(0, i - c4579b.f20173g);
        int max4 = Math.max(0, i2 - c4579b.f20171e);
        int i5 = ((max2 + i4) - 1) / i4;
        int i6 = ((max + i3) - 1) / i3;
        int i7 = ((c4579b.f20174h + i5) - 1) / c4579b.f20174h;
        int i8 = ((c4579b.f20175i + i6) - 1) / c4579b.f20175i;
        boolean z = this.f19974a;
        Context context = caf.a().f8449a;
        for (int i9 = 0; i9 < i7; i9++) {
            for (int i10 = 0; i10 < i8; i10++) {
                max = c4579b.f20174h * i9;
                int i11 = i10 * c4579b.f20175i;
                int min = Math.min(i5, c4579b.f20174h + max);
                int min2 = Math.min(i6, c4579b.f20175i + i11);
                rect.top = m24471a(i9, c4579b);
                rect.bottom = Math.min(max4, m24471a(i9 + 1, c4579b));
                rect.left = m24472b(i10, c4579b);
                rect.right = Math.min(max3, m24472b(i10 + 1, c4579b));
                Bitmap decodeRegion = newInstance.decodeRegion(rect, mo4115b());
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
                                    djl.m27586a(createBitmap, c4579b.f20176j, c4579b.f20169c, mo4114a(i12, i13));
                                    if (z) {
                                        chn.B(" Mem : " + m24473c() + "KB " + " Path: " + str);
                                    }
                                    if (this.f19975b != null) {
                                        this.f19975b.m24866a(i12, i13);
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
