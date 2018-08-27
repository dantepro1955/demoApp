package com.p000;

import android.net.Uri;
import android.os.Build;
import android.os.Build.VERSION;
import android.text.TextUtils;
import com.facebook.common.util.UriUtil;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.regex.Pattern;

/* compiled from: Util */
/* renamed from: ahr */
public final class ahr {
    /* renamed from: a */
    public static final int f1511a;
    /* renamed from: b */
    public static final String f1512b = Build.DEVICE;
    /* renamed from: c */
    public static final String f1513c = Build.MANUFACTURER;
    /* renamed from: d */
    public static final String f1514d = Build.MODEL;
    /* renamed from: e */
    private static final Pattern f1515e = Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)(\\.(\\d+))?([Zz]|((\\+|\\-)(\\d\\d):(\\d\\d)))?");
    /* renamed from: f */
    private static final Pattern f1516f = Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");

    static {
        int i = (VERSION.SDK_INT == 23 && VERSION.CODENAME.charAt(0) == 'N') ? 24 : VERSION.SDK_INT;
        f1511a = i;
    }

    /* renamed from: a */
    public static boolean m1600a(Uri uri) {
        Object scheme = uri.getScheme();
        return TextUtils.isEmpty(scheme) || scheme.equals(UriUtil.LOCAL_FILE_SCHEME);
    }

    /* renamed from: a */
    public static boolean m1601a(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        } else {
            return obj.equals(obj2);
        }
    }

    /* renamed from: a */
    public static ExecutorService m1597a(final String str) {
        return Executors.newSingleThreadExecutor(new ThreadFactory() {
            public Thread newThread(Runnable runnable) {
                return new Thread(runnable, str);
            }
        });
    }

    /* renamed from: b */
    public static String m1605b(String str) {
        return str == null ? null : str.toLowerCase(Locale.US);
    }

    /* renamed from: a */
    public static int m1592a(int i, int i2) {
        return ((i + i2) - 1) / i2;
    }

    /* renamed from: a */
    public static int m1594a(long[] jArr, long j, boolean z, boolean z2) {
        int binarySearch = Arrays.binarySearch(jArr, j);
        if (binarySearch < 0) {
            binarySearch = -(binarySearch + 2);
        } else if (!z) {
            binarySearch--;
        }
        return z2 ? Math.max(0, binarySearch) : binarySearch;
    }

    /* renamed from: b */
    public static int m1603b(long[] jArr, long j, boolean z, boolean z2) {
        int binarySearch = Arrays.binarySearch(jArr, j);
        if (binarySearch < 0) {
            binarySearch ^= -1;
        } else if (!z) {
            binarySearch++;
        }
        return z2 ? Math.min(jArr.length - 1, binarySearch) : binarySearch;
    }

    /* renamed from: a */
    public static long m1595a(long j, long j2, long j3) {
        if (j3 >= j2 && j3 % j2 == 0) {
            return j / (j3 / j2);
        }
        if (j3 >= j2 || j2 % j3 != 0) {
            return (long) ((((double) j2) / ((double) j3)) * ((double) j));
        }
        return (j2 / j3) * j;
    }

    /* renamed from: a */
    public static void m1599a(long[] jArr, long j, long j2) {
        int i = 0;
        long j3;
        if (j2 >= j && j2 % j == 0) {
            j3 = j2 / j;
            while (i < jArr.length) {
                jArr[i] = jArr[i] / j3;
                i++;
            }
        } else if (j2 >= j || j % j2 != 0) {
            double d = ((double) j) / ((double) j2);
            while (i < jArr.length) {
                jArr[i] = (long) (((double) jArr[i]) * d);
                i++;
            }
        } else {
            j3 = j / j2;
            while (i < jArr.length) {
                jArr[i] = jArr[i] * j3;
                i++;
            }
        }
    }

    /* renamed from: a */
    public static void m1598a(HttpURLConnection httpURLConnection, long j) {
        if (f1511a == 19 || f1511a == 20) {
            try {
                InputStream inputStream = httpURLConnection.getInputStream();
                if (j == -1) {
                    if (inputStream.read() == -1) {
                        return;
                    }
                } else if (j <= 2048) {
                    return;
                }
                String name = inputStream.getClass().getName();
                if (name.equals("com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream") || name.equals("com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream")) {
                    Method declaredMethod = inputStream.getClass().getSuperclass().getDeclaredMethod("unexpectedEndOfInput", new Class[0]);
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(inputStream, new Object[0]);
                }
            } catch (IOException e) {
            } catch (Exception e2) {
            }
        }
    }

    /* renamed from: c */
    public static int m1606c(String str) {
        boolean z;
        int i = 0;
        int length = str.length();
        if (length <= 4) {
            z = true;
        } else {
            z = false;
        }
        ahb.m1514a(z);
        int i2 = 0;
        while (i < length) {
            i2 = (i2 << 8) | str.charAt(i);
            i++;
        }
        return i2;
    }

    /* renamed from: a */
    public static int m1593a(long j) {
        return (int) (j >>> 32);
    }

    /* renamed from: b */
    public static int m1602b(long j) {
        return (int) j;
    }

    /* renamed from: b */
    public static long m1604b(int i, int i2) {
        return (((long) i) << 32) | (((long) i2) & 4294967295L);
    }

    /* renamed from: a */
    public static <T> String m1596a(T[] tArr) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < tArr.length; i++) {
            stringBuilder.append(tArr[i].getClass().getSimpleName());
            if (i < tArr.length - 1) {
                stringBuilder.append(", ");
            }
        }
        return stringBuilder.toString();
    }
}
