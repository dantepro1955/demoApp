package com.p000;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.zip.CRC32;
import java.util.zip.ZipException;

/* compiled from: ZipUtil */
/* renamed from: be */
final class be {

    /* compiled from: ZipUtil */
    /* renamed from: be$a */
    static class C1083a {
        /* renamed from: a */
        long f5737a;
        /* renamed from: b */
        long f5738b;

        C1083a() {
        }
    }

    /* renamed from: a */
    static long m7746a(File file) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
        try {
            long a = be.m7747a(randomAccessFile, be.m7748a(randomAccessFile));
            return a;
        } finally {
            randomAccessFile.close();
        }
    }

    /* renamed from: a */
    static C1083a m7748a(RandomAccessFile randomAccessFile) throws IOException, ZipException {
        long j = 0;
        long length = randomAccessFile.length() - 22;
        if (length < 0) {
            throw new ZipException("File too short to be a zip file: " + randomAccessFile.length());
        }
        long j2 = length - 65536;
        if (j2 >= 0) {
            j = j2;
        }
        int reverseBytes = Integer.reverseBytes(101010256);
        j2 = length;
        do {
            randomAccessFile.seek(j2);
            if (randomAccessFile.readInt() == reverseBytes) {
                randomAccessFile.skipBytes(2);
                randomAccessFile.skipBytes(2);
                randomAccessFile.skipBytes(2);
                randomAccessFile.skipBytes(2);
                C1083a c1083a = new C1083a();
                c1083a.f5738b = ((long) Integer.reverseBytes(randomAccessFile.readInt())) & 4294967295L;
                c1083a.f5737a = ((long) Integer.reverseBytes(randomAccessFile.readInt())) & 4294967295L;
                return c1083a;
            }
            j2--;
        } while (j2 >= j);
        throw new ZipException("End Of Central Directory signature not found");
    }

    /* renamed from: a */
    static long m7747a(RandomAccessFile randomAccessFile, C1083a c1083a) throws IOException {
        CRC32 crc32 = new CRC32();
        long j = c1083a.f5738b;
        randomAccessFile.seek(c1083a.f5737a);
        byte[] bArr = new byte[16384];
        int read = randomAccessFile.read(bArr, 0, (int) Math.min(16384, j));
        while (read != -1) {
            crc32.update(bArr, 0, read);
            j -= (long) read;
            if (j == 0) {
                break;
            }
            read = randomAccessFile.read(bArr, 0, (int) Math.min(16384, j));
        }
        return crc32.getValue();
    }
}
