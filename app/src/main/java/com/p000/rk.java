package com.p000;

import com.facebook.appevents.AppEventsConstants;
import java.io.UnsupportedEncodingException;

/* renamed from: rk */
public abstract class rk {
    /* renamed from: a */
    private static String[] f20879a = new String[]{AppEventsConstants.EVENT_PARAM_VALUE_NO, "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F"};

    /* renamed from: a */
    private static String m25941a(byte b) {
        return f20879a[(byte) (((byte) (((byte) (b & 240)) >>> 4)) & 15)] + f20879a[(byte) (b & 15)];
    }

    /* renamed from: b */
    public static String m25942b(byte[] bArr) {
        if (bArr == null) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer();
        int i = 0;
        while (i < 16) {
            stringBuffer.append(rk.m25941a(bArr[i]));
            if (i == 3 || i == 5 || i == 7 || i == 9) {
                stringBuffer.append("-");
            }
            i++;
        }
        return stringBuffer.toString().toLowerCase();
    }

    /* renamed from: c */
    private static String[] m25943c(byte[] bArr) {
        String str;
        int length = bArr.length / 8;
        if (bArr.length % 8 != 0) {
            length++;
        }
        String[] strArr = new String[length];
        try {
            str = new String(bArr, "ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            str = new String(bArr);
        }
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            int i3;
            char[] cArr = new char[41];
            for (i3 = 0; i3 < cArr.length; i3++) {
                cArr[i3] = ' ';
            }
            for (i3 = 0; i3 < 8 && i < bArr.length; i3++) {
                String a = rk.m25941a(bArr[i]);
                cArr[i3 * 3] = a.charAt(0);
                cArr[(i3 * 3) + 1] = a.charAt(1);
                cArr[(i3 << 1) + 26] = str.charAt(i);
                i++;
            }
            strArr[i2] = new String(cArr);
        }
        return strArr;
    }

    /* renamed from: a */
    public abstract void mo4272a(Object obj);

    /* renamed from: a */
    public abstract void mo4273a(Object obj, Throwable th);

    /* renamed from: a */
    public final void m25946a(byte[] bArr) {
        if (mo4274a()) {
            mo4272a((Object) "Buffer dump:");
            String[] c = rk.m25943c(bArr);
            for (Object a : c) {
                mo4272a(a);
            }
        }
    }

    /* renamed from: a */
    public abstract boolean mo4274a();

    /* renamed from: b */
    public abstract void mo4275b(Object obj);

    /* renamed from: b */
    public abstract boolean mo4276b();

    /* renamed from: c */
    public abstract void mo4277c(Object obj);

    /* renamed from: c */
    public abstract boolean mo4278c();

    /* renamed from: d */
    public abstract void mo4279d(Object obj);

    /* renamed from: d */
    public abstract boolean mo4280d();

    /* renamed from: e */
    public abstract void mo4281e(Object obj);

    /* renamed from: e */
    public abstract boolean mo4282e();

    /* renamed from: f */
    public abstract void mo4283f();

    /* renamed from: g */
    public abstract void mo4284g();
}
