package com.p000;

import android.os.SystemClock;
import com.facebook.stetho.common.Utf8Charset;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import p000.avg.C0846a;

/* renamed from: bpb */
public class bpb implements avg {
    /* renamed from: a */
    private final Map<String, C1387a> f7336a;
    /* renamed from: b */
    private long f7337b;
    /* renamed from: c */
    private final File f7338c;
    /* renamed from: d */
    private final int f7339d;

    /* renamed from: bpb$a */
    static class C1387a {
        /* renamed from: a */
        public long f7327a;
        /* renamed from: b */
        public String f7328b;
        /* renamed from: c */
        public String f7329c;
        /* renamed from: d */
        public long f7330d;
        /* renamed from: e */
        public long f7331e;
        /* renamed from: f */
        public long f7332f;
        /* renamed from: g */
        public long f7333g;
        /* renamed from: h */
        public Map<String, String> f7334h;

        private C1387a() {
        }

        public C1387a(String str, C0846a c0846a) {
            this.f7328b = str;
            this.f7327a = (long) c0846a.f4658a.length;
            this.f7329c = c0846a.f4659b;
            this.f7330d = c0846a.f4660c;
            this.f7331e = c0846a.f4661d;
            this.f7332f = c0846a.f4662e;
            this.f7333g = c0846a.f4663f;
            this.f7334h = c0846a.f4664g;
        }

        /* renamed from: a */
        public static C1387a m10228a(InputStream inputStream) throws IOException {
            C1387a c1387a = new C1387a();
            if (bpb.m10232a(inputStream) != 538247942) {
                throw new IOException();
            }
            c1387a.f7328b = bpb.m10241c(inputStream);
            c1387a.f7329c = bpb.m10241c(inputStream);
            if (c1387a.f7329c.equals("")) {
                c1387a.f7329c = null;
            }
            c1387a.f7330d = bpb.m10240b(inputStream);
            c1387a.f7331e = bpb.m10240b(inputStream);
            c1387a.f7332f = bpb.m10240b(inputStream);
            c1387a.f7333g = bpb.m10240b(inputStream);
            c1387a.f7334h = bpb.m10243d(inputStream);
            return c1387a;
        }

        /* renamed from: a */
        public C0846a m10229a(byte[] bArr) {
            C0846a c0846a = new C0846a();
            c0846a.f4658a = bArr;
            c0846a.f4659b = this.f7329c;
            c0846a.f4660c = this.f7330d;
            c0846a.f4661d = this.f7331e;
            c0846a.f4662e = this.f7332f;
            c0846a.f4663f = this.f7333g;
            c0846a.f4664g = this.f7334h;
            return c0846a;
        }

        /* renamed from: a */
        public boolean m10230a(OutputStream outputStream) {
            try {
                bpb.m10234a(outputStream, 538247942);
                bpb.m10236a(outputStream, this.f7328b);
                bpb.m10236a(outputStream, this.f7329c == null ? "" : this.f7329c);
                bpb.m10235a(outputStream, this.f7330d);
                bpb.m10235a(outputStream, this.f7331e);
                bpb.m10235a(outputStream, this.f7332f);
                bpb.m10235a(outputStream, this.f7333g);
                bpb.m10238a(this.f7334h, outputStream);
                outputStream.flush();
                return true;
            } catch (IOException e) {
                bnt.m10021b("%s", e.toString());
                return false;
            }
        }
    }

    /* renamed from: bpb$b */
    static class C1388b extends FilterInputStream {
        /* renamed from: a */
        private int f7335a;

        private C1388b(InputStream inputStream) {
            super(inputStream);
            this.f7335a = 0;
        }

        public int read() throws IOException {
            int read = super.read();
            if (read != -1) {
                this.f7335a++;
            }
            return read;
        }

        public int read(byte[] bArr, int i, int i2) throws IOException {
            int read = super.read(bArr, i, i2);
            if (read != -1) {
                this.f7335a += read;
            }
            return read;
        }
    }

    public bpb(File file) {
        this(file, 5242880);
    }

    public bpb(File file, int i) {
        this.f7336a = new LinkedHashMap(16, 0.75f, true);
        this.f7337b = 0;
        this.f7338c = file;
        this.f7339d = i;
    }

    /* renamed from: a */
    static int m10232a(InputStream inputStream) throws IOException {
        return ((((bpb.m10244e(inputStream) << 0) | 0) | (bpb.m10244e(inputStream) << 8)) | (bpb.m10244e(inputStream) << 16)) | (bpb.m10244e(inputStream) << 24);
    }

    /* renamed from: a */
    private void m10233a(int i) {
        if (this.f7337b + ((long) i) >= ((long) this.f7339d)) {
            int i2;
            if (bnt.f7178b) {
                bnt.m10019a("Pruning old cache entries.", new Object[0]);
            }
            long j = this.f7337b;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            Iterator it = this.f7336a.entrySet().iterator();
            int i3 = 0;
            while (it.hasNext()) {
                C1387a c1387a = (C1387a) ((Entry) it.next()).getValue();
                if (m10250c(c1387a.f7328b).delete()) {
                    this.f7337b -= c1387a.f7327a;
                } else {
                    bnt.m10021b("Could not delete cache entry for key=%s, filename=%s", c1387a.f7328b, m10242d(c1387a.f7328b));
                }
                it.remove();
                i2 = i3 + 1;
                if (((float) (this.f7337b + ((long) i))) < ((float) this.f7339d) * 0.9f) {
                    break;
                }
                i3 = i2;
            }
            i2 = i3;
            if (bnt.f7178b) {
                bnt.m10019a("pruned %d files, %d bytes, %d ms", Integer.valueOf(i2), Long.valueOf(this.f7337b - j), Long.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime));
            }
        }
    }

    /* renamed from: a */
    static void m10234a(OutputStream outputStream, int i) throws IOException {
        outputStream.write((i >> 0) & 255);
        outputStream.write((i >> 8) & 255);
        outputStream.write((i >> 16) & 255);
        outputStream.write((i >> 24) & 255);
    }

    /* renamed from: a */
    static void m10235a(OutputStream outputStream, long j) throws IOException {
        outputStream.write((byte) ((int) (j >>> null)));
        outputStream.write((byte) ((int) (j >>> 8)));
        outputStream.write((byte) ((int) (j >>> 16)));
        outputStream.write((byte) ((int) (j >>> 24)));
        outputStream.write((byte) ((int) (j >>> 32)));
        outputStream.write((byte) ((int) (j >>> 40)));
        outputStream.write((byte) ((int) (j >>> 48)));
        outputStream.write((byte) ((int) (j >>> 56)));
    }

    /* renamed from: a */
    static void m10236a(OutputStream outputStream, String str) throws IOException {
        byte[] bytes = str.getBytes(Utf8Charset.NAME);
        bpb.m10235a(outputStream, (long) bytes.length);
        outputStream.write(bytes, 0, bytes.length);
    }

    /* renamed from: a */
    private void m10237a(String str, C1387a c1387a) {
        if (this.f7336a.containsKey(str)) {
            C1387a c1387a2 = (C1387a) this.f7336a.get(str);
            this.f7337b = (c1387a.f7327a - c1387a2.f7327a) + this.f7337b;
        } else {
            this.f7337b += c1387a.f7327a;
        }
        this.f7336a.put(str, c1387a);
    }

    /* renamed from: a */
    static void m10238a(Map<String, String> map, OutputStream outputStream) throws IOException {
        if (map != null) {
            bpb.m10234a(outputStream, map.size());
            for (Entry entry : map.entrySet()) {
                bpb.m10236a(outputStream, (String) entry.getKey());
                bpb.m10236a(outputStream, (String) entry.getValue());
            }
            return;
        }
        bpb.m10234a(outputStream, 0);
    }

    /* renamed from: a */
    private static byte[] m10239a(InputStream inputStream, int i) throws IOException {
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int read = inputStream.read(bArr, i2, i - i2);
            if (read == -1) {
                break;
            }
            i2 += read;
        }
        if (i2 == i) {
            return bArr;
        }
        throw new IOException("Expected " + i + " bytes, read " + i2 + " bytes");
    }

    /* renamed from: b */
    static long m10240b(InputStream inputStream) throws IOException {
        return (((((((0 | ((((long) bpb.m10244e(inputStream)) & 255) << null)) | ((((long) bpb.m10244e(inputStream)) & 255) << 8)) | ((((long) bpb.m10244e(inputStream)) & 255) << 16)) | ((((long) bpb.m10244e(inputStream)) & 255) << 24)) | ((((long) bpb.m10244e(inputStream)) & 255) << 32)) | ((((long) bpb.m10244e(inputStream)) & 255) << 40)) | ((((long) bpb.m10244e(inputStream)) & 255) << 48)) | ((((long) bpb.m10244e(inputStream)) & 255) << 56);
    }

    /* renamed from: c */
    static String m10241c(InputStream inputStream) throws IOException {
        return new String(bpb.m10239a(inputStream, (int) bpb.m10240b(inputStream)), Utf8Charset.NAME);
    }

    /* renamed from: d */
    private String m10242d(String str) {
        int length = str.length() / 2;
        return String.valueOf(str.substring(0, length).hashCode()) + String.valueOf(str.substring(length).hashCode());
    }

    /* renamed from: d */
    static Map<String, String> m10243d(InputStream inputStream) throws IOException {
        int a = bpb.m10232a(inputStream);
        Map<String, String> emptyMap = a == 0 ? Collections.emptyMap() : new HashMap(a);
        for (int i = 0; i < a; i++) {
            emptyMap.put(bpb.m10241c(inputStream).intern(), bpb.m10241c(inputStream).intern());
        }
        return emptyMap;
    }

    /* renamed from: e */
    private static int m10244e(InputStream inputStream) throws IOException {
        int read = inputStream.read();
        if (read != -1) {
            return read;
        }
        throw new EOFException();
    }

    /* renamed from: e */
    private void m10245e(String str) {
        C1387a c1387a = (C1387a) this.f7336a.get(str);
        if (c1387a != null) {
            this.f7337b -= c1387a.f7327a;
            this.f7336a.remove(str);
        }
    }

    /* renamed from: a */
    public synchronized C0846a mo1380a(String str) {
        C0846a c0846a;
        IOException e;
        Throwable th;
        C1387a c1387a = (C1387a) this.f7336a.get(str);
        if (c1387a == null) {
            c0846a = null;
        } else {
            File c = m10250c(str);
            C1388b c1388b;
            try {
                c1388b = new C1388b(new BufferedInputStream(new FileInputStream(c)));
                try {
                    C1387a.m10228a((InputStream) c1388b);
                    c0846a = c1387a.m10229a(bpb.m10239a((InputStream) c1388b, (int) (c.length() - ((long) c1388b.f7335a))));
                    try {
                        c1388b.close();
                    } catch (IOException e2) {
                        c0846a = null;
                    }
                } catch (IOException e3) {
                    e = e3;
                    try {
                        bnt.m10021b("%s: %s", c.getAbsolutePath(), e.toString());
                        m10249b(str);
                        if (c1388b != null) {
                            try {
                                c1388b.close();
                            } catch (IOException e4) {
                                c0846a = null;
                            }
                        }
                        c0846a = null;
                        return c0846a;
                    } catch (Throwable th2) {
                        th = th2;
                        if (c1388b != null) {
                            try {
                                c1388b.close();
                            } catch (IOException e5) {
                                c0846a = null;
                            }
                        }
                        throw th;
                    }
                }
            } catch (IOException e6) {
                e = e6;
                c1388b = null;
                bnt.m10021b("%s: %s", c.getAbsolutePath(), e.toString());
                m10249b(str);
                if (c1388b != null) {
                    c1388b.close();
                }
                c0846a = null;
                return c0846a;
            } catch (Throwable th3) {
                th = th3;
                c1388b = null;
                if (c1388b != null) {
                    c1388b.close();
                }
                throw th;
            }
        }
        return c0846a;
    }

    /* renamed from: a */
    public synchronized void mo1381a() {
        BufferedInputStream bufferedInputStream;
        Throwable th;
        if (this.f7338c.exists()) {
            File[] listFiles = this.f7338c.listFiles();
            if (listFiles != null) {
                for (File file : listFiles) {
                    BufferedInputStream bufferedInputStream2 = null;
                    try {
                        bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
                        try {
                            C1387a a = C1387a.m10228a((InputStream) bufferedInputStream);
                            a.f7327a = file.length();
                            m10237a(a.f7328b, a);
                            try {
                                bufferedInputStream.close();
                            } catch (IOException e) {
                            }
                        } catch (IOException e2) {
                            if (file != null) {
                                try {
                                    file.delete();
                                } catch (Throwable th2) {
                                    Throwable th3 = th2;
                                    bufferedInputStream2 = bufferedInputStream;
                                    th = th3;
                                }
                            }
                            if (bufferedInputStream != null) {
                                try {
                                    bufferedInputStream.close();
                                } catch (IOException e3) {
                                }
                            }
                        }
                    } catch (IOException e4) {
                        bufferedInputStream = null;
                        if (file != null) {
                            file.delete();
                        }
                        if (bufferedInputStream != null) {
                            bufferedInputStream.close();
                        }
                    } catch (Throwable th4) {
                        th = th4;
                    }
                }
            }
        } else if (!this.f7338c.mkdirs()) {
            bnt.m10022c("Unable to create cache dir %s", this.f7338c.getAbsolutePath());
        }
        return;
        if (bufferedInputStream2 != null) {
            try {
                bufferedInputStream2.close();
            } catch (IOException e5) {
            }
        }
        throw th;
        throw th;
    }

    /* renamed from: a */
    public synchronized void mo1382a(String str, C0846a c0846a) {
        m10233a(c0846a.f4658a.length);
        File c = m10250c(str);
        try {
            OutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(c));
            C1387a c1387a = new C1387a(str, c0846a);
            if (c1387a.m10230a(bufferedOutputStream)) {
                bufferedOutputStream.write(c0846a.f4658a);
                bufferedOutputStream.close();
                m10237a(str, c1387a);
            } else {
                bufferedOutputStream.close();
                bnt.m10021b("Failed to write header for %s", c.getAbsolutePath());
                throw new IOException();
            }
        } catch (IOException e) {
            if (!c.delete()) {
                bnt.m10021b("Could not clean up file %s", c.getAbsolutePath());
            }
        }
    }

    /* renamed from: b */
    public synchronized void m10249b(String str) {
        boolean delete = m10250c(str).delete();
        m10245e(str);
        if (!delete) {
            bnt.m10021b("Could not delete cache entry for key=%s, filename=%s", str, m10242d(str));
        }
    }

    /* renamed from: c */
    public File m10250c(String str) {
        return new File(this.f7338c, m10242d(str));
    }
}
