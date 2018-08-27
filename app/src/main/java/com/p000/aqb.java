package com.p000;

import com.facebook.common.util.ByteConstants;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: aqb */
public final class aqb {
    /* renamed from: a */
    public static long m4906a(InputStream inputStream, OutputStream outputStream, boolean z) throws IOException {
        return aqb.m4907a(inputStream, outputStream, z, ByteConstants.KB);
    }

    /* renamed from: a */
    public static long m4907a(InputStream inputStream, OutputStream outputStream, boolean z, int i) throws IOException {
        byte[] bArr = new byte[i];
        long j = 0;
        while (true) {
            try {
                int read = inputStream.read(bArr, 0, i);
                if (read == -1) {
                    break;
                }
                j += (long) read;
                outputStream.write(bArr, 0, read);
            } finally {
                if (z) {
                    aqb.m4908a(inputStream);
                    aqb.m4908a(outputStream);
                }
            }
        }
        return j;
    }

    /* renamed from: a */
    public static void m4908a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
            }
        }
    }

    /* renamed from: a */
    public static byte[] m4909a(InputStream inputStream, boolean z) throws IOException {
        OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        aqb.m4906a(inputStream, byteArrayOutputStream, z);
        return byteArrayOutputStream.toByteArray();
    }
}
