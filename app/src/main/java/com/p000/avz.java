package com.p000;

import android.os.Looper;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.nio.ByteBuffer;
import java.util.Calendar;
import java.util.TimeZone;
import java.util.UUID;

/* renamed from: avz */
public final class avz {
    /* renamed from: a */
    private static final char[] f4743a = "0123456789abcdef".toCharArray();

    /* renamed from: a */
    public static Long m6115a() {
        return Long.valueOf(Calendar.getInstance(TimeZone.getTimeZone("America/Los_Angeles")).getTime().getTime());
    }

    /* renamed from: a */
    public static String m6116a(String str) {
        if (str == null || !str.matches("^[a-fA-F0-9]{8}-([a-fA-F0-9]{4}-){3}[a-fA-F0-9]{12}$")) {
            return str;
        }
        UUID fromString = UUID.fromString(str);
        byte[] bArr = new byte[16];
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        wrap.putLong(fromString.getMostSignificantBits());
        wrap.putLong(fromString.getLeastSignificantBits());
        return atv.m5690a(bArr, true);
    }

    /* renamed from: a */
    public static String m6117a(Throwable th) {
        Writer stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    /* renamed from: b */
    public static boolean m6118b() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    /* renamed from: b */
    public static boolean m6119b(String str) {
        return str == null || str.isEmpty();
    }
}
