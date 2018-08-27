package com.p000;

import android.os.Process;
import io.fabric.sdk.android.services.common.CommonUtils;
import io.fabric.sdk.android.services.common.IdManager;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: CLSUUID */
/* renamed from: abe */
class abe {
    /* renamed from: a */
    private static final AtomicLong f168a = new AtomicLong(0);
    /* renamed from: b */
    private static String f169b;

    public abe(IdManager idManager) {
        r0 = new byte[10];
        m158a(r0);
        m160b(r0);
        m162c(r0);
        String a = CommonUtils.a(idManager.b());
        String a2 = CommonUtils.a(r0);
        f169b = String.format(Locale.US, "%s-%s-%s-%s", new Object[]{a2.substring(0, 12), a2.substring(12, 16), a2.subSequence(16, 20), a.substring(0, 12)}).toUpperCase(Locale.US);
    }

    /* renamed from: a */
    private void m158a(byte[] bArr) {
        long time = new Date().getTime();
        long j = time / 1000;
        time %= 1000;
        byte[] a = abe.m159a(j);
        bArr[0] = a[0];
        bArr[1] = a[1];
        bArr[2] = a[2];
        bArr[3] = a[3];
        byte[] b = abe.m161b(time);
        bArr[4] = b[0];
        bArr[5] = b[1];
    }

    /* renamed from: b */
    private void m160b(byte[] bArr) {
        byte[] b = abe.m161b(f168a.incrementAndGet());
        bArr[6] = b[0];
        bArr[7] = b[1];
    }

    /* renamed from: c */
    private void m162c(byte[] bArr) {
        byte[] b = abe.m161b((long) Integer.valueOf(Process.myPid()).shortValue());
        bArr[8] = b[0];
        bArr[9] = b[1];
    }

    /* renamed from: a */
    private static byte[] m159a(long j) {
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.putInt((int) j);
        allocate.order(ByteOrder.BIG_ENDIAN);
        allocate.position(0);
        return allocate.array();
    }

    /* renamed from: b */
    private static byte[] m161b(long j) {
        ByteBuffer allocate = ByteBuffer.allocate(2);
        allocate.putShort((short) ((int) j));
        allocate.order(ByteOrder.BIG_ENDIAN);
        allocate.position(0);
        return allocate.array();
    }

    public String toString() {
        return f169b;
    }
}
