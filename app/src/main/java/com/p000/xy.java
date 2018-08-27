package com.p000;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import com.facebook.stetho.common.Utf8Charset;
import com.flurry.android.AdCreative;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: xy */
public class xy extends zn {
    /* renamed from: a */
    private static final char[] f26007a = "0123456789abcdef".toCharArray();
    /* renamed from: b */
    private static final char[] f26008b = "-'".toCharArray();

    /* renamed from: a */
    public static float m34845a(float f) {
        return 1000.0f * f;
    }

    /* renamed from: a */
    public static Bitmap m34846a(File file, int i) {
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2;
        FileInputStream fileInputStream3;
        Throwable th;
        int i2 = 1;
        FileInputStream fileInputStream4 = null;
        try {
            Options options = new Options();
            options.inJustDecodeBounds = true;
            fileInputStream = new FileInputStream(file);
            try {
                BitmapFactory.decodeStream(fileInputStream, null, options);
                fileInputStream.close();
                if (options.outHeight > i || options.outWidth > i) {
                    i2 = (int) Math.pow(2.0d, (double) ((int) Math.ceil(Math.log(((double) i) / ((double) Math.max(options.outHeight, options.outWidth))) / Math.log(0.5d))));
                }
                Options options2 = new Options();
                options2.inSampleSize = i2;
                InputStream fileInputStream5 = new FileInputStream(file);
                try {
                    Bitmap decodeStream = BitmapFactory.decodeStream(fileInputStream5, null, options2);
                    fileInputStream5.close();
                    try {
                        fileInputStream.close();
                        fileInputStream5.close();
                        return decodeStream;
                    } catch (Exception e) {
                        return decodeStream;
                    }
                } catch (Exception e2) {
                    InputStream inputStream = fileInputStream5;
                    fileInputStream2 = fileInputStream;
                    try {
                        fileInputStream2.close();
                        fileInputStream3.close();
                    } catch (Exception e3) {
                    }
                    return null;
                } catch (Throwable th2) {
                    th = th2;
                    InputStream inputStream2 = fileInputStream5;
                    try {
                        fileInputStream.close();
                        fileInputStream4.close();
                    } catch (Exception e4) {
                    }
                    throw th;
                }
            } catch (Exception e5) {
                fileInputStream3 = null;
                fileInputStream2 = fileInputStream;
                fileInputStream2.close();
                fileInputStream3.close();
                return null;
            } catch (Throwable th3) {
                th = th3;
                fileInputStream.close();
                fileInputStream4.close();
                throw th;
            }
        } catch (Exception e6) {
            fileInputStream3 = null;
            fileInputStream2 = null;
            fileInputStream2.close();
            fileInputStream3.close();
            return null;
        } catch (Throwable th4) {
            th = th4;
            fileInputStream = null;
            fileInputStream.close();
            fileInputStream4.close();
            throw th;
        }
    }

    /* renamed from: a */
    public static String m34847a(String str) {
        return (str == null || str.length() <= 4) ? "NOKEY" : str.substring(str.length() - 4);
    }

    /* renamed from: a */
    private static String m34848a(String str, Integer num, String str2) {
        if (str2 == null) {
            throw new IllegalArgumentException("No algorithm specified");
        } else if (str == null || str.length() < 1) {
            return "";
        } else {
            if (str2.length() < 1 || AdCreative.kFixNone.equals(str2)) {
                return str;
            }
            try {
                MessageDigest instance = MessageDigest.getInstance(str2);
                instance.update(str.getBytes(Utf8Charset.NAME));
                str = xy.m34851a(instance.digest());
                return (str == null || num.intValue() <= 0) ? str : str.substring(0, Math.min(num.intValue(), str.length()));
            } catch (Throwable e) {
                throw new RuntimeException("Unknown algorithm \"" + str2 + "\"", e);
            } catch (Throwable e2) {
                throw new RuntimeException("Programming error: UTF-8 is not know encoding", e2);
            }
        }
    }

    /* renamed from: a */
    public static String m34849a(String str, vm vmVar) {
        return xy.m34848a(str, (Integer) vmVar.m34391a(wp.f25910n), (String) vmVar.m34391a(wp.f25909m));
    }

    /* renamed from: a */
    static String m34850a(Map map) {
        if (map == null || map.isEmpty()) {
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (Entry entry : map.entrySet()) {
            if (stringBuilder.length() > 0) {
                stringBuilder.append("&");
            }
            stringBuilder.append(entry.getKey()).append('=').append(entry.getValue());
        }
        return stringBuilder.toString();
    }

    /* renamed from: a */
    public static String m34851a(byte[] bArr) {
        if (bArr == null) {
            throw new IllegalArgumentException("No data specified");
        }
        char[] cArr = new char[(bArr.length * 2)];
        for (int i = 0; i < bArr.length; i++) {
            cArr[i * 2] = f26007a[(bArr[i] & 240) >>> 4];
            cArr[(i * 2) + 1] = f26007a[bArr[i] & 15];
        }
        return new String(cArr);
    }

    /* renamed from: a */
    public static vi m34852a() {
        return new vk().m34338a("").m34341a(zd.f26072a).m34342a(ze.f26079a).m34344b("").m34340a(vj.DEFAULT).m34339a(vd.WhiteXOnOpaqueBlack).m34335a(0.0f).m34343b(0.0f).m34336a(0).m34337a(-1).m34345c("").m34334a();
    }

    /* renamed from: b */
    public static long m34853b(float f) {
        return (long) Math.round(f);
    }

    /* renamed from: b */
    public static String m34854b(String str) {
        return xy.m34848a(str, Integer.valueOf(-1), "SHA-1");
    }

    /* renamed from: c */
    public static long m34855c(float f) {
        return xy.m34853b(xy.m34845a(f));
    }

    /* renamed from: c */
    static String m34856c(String str) {
        if (!zn.m34841d(str)) {
            return "";
        }
        try {
            return URLEncoder.encode(str, Utf8Charset.NAME);
        } catch (Throwable e) {
            throw new UnsupportedOperationException(e);
        }
    }
}
