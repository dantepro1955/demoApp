package com.p000;

import com.facebook.common.util.ByteConstants;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.StatusLine;
import org.apache.http.impl.cookie.DateUtils;
import p000.avg.C0846a;

/* renamed from: boh */
public class boh implements bax {
    /* renamed from: a */
    protected static final boolean f7257a = bnt.f7178b;
    /* renamed from: d */
    private static int f7258d = 3000;
    /* renamed from: e */
    private static int f7259e = 4096;
    /* renamed from: b */
    protected final bpe f7260b;
    /* renamed from: c */
    protected final boo f7261c;

    public boh(bpe bpe) {
        this(bpe, new boo(f7259e));
    }

    public boh(bpe bpe, boo boo) {
        this.f7260b = bpe;
        this.f7261c = boo;
    }

    /* renamed from: a */
    protected static Map<String, String> m10154a(Header[] headerArr) {
        Map<String, String> treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (int i = 0; i < headerArr.length; i++) {
            treeMap.put(headerArr[i].getName(), headerArr[i].getValue());
        }
        return treeMap;
    }

    /* renamed from: a */
    private void m10155a(long j, bfx<?> bfx, byte[] bArr, StatusLine statusLine) {
        if (f7257a || j > ((long) f7258d)) {
            String str = "HTTP response for request=<%s> [lifetime=%d], [size=%s], [rc=%d], [retryCount=%s]";
            Object[] objArr = new Object[5];
            objArr[0] = bfx;
            objArr[1] = Long.valueOf(j);
            objArr[2] = bArr != null ? Integer.valueOf(bArr.length) : "null";
            objArr[3] = Integer.valueOf(statusLine.getStatusCode());
            objArr[4] = Integer.valueOf(bfx.m5559o().mo866b());
            bnt.m10021b(str, objArr);
        }
    }

    /* renamed from: a */
    private static void m10156a(String str, bfx<?> bfx, bmt bmt) throws bmt {
        bjr o = bfx.m5559o();
        int n = bfx.m5558n();
        try {
            o.mo865a(bmt);
            bfx.m5545b(String.format("%s-retry [timeout=%s]", new Object[]{str, Integer.valueOf(n)}));
        } catch (bmt e) {
            bfx.m5545b(String.format("%s-timeout-giveup [timeout=%s]", new Object[]{str, Integer.valueOf(n)}));
            throw e;
        }
    }

    /* renamed from: a */
    private void m10157a(Map<String, String> map, C0846a c0846a) {
        if (c0846a != null) {
            if (c0846a.f4659b != null) {
                map.put("If-None-Match", c0846a.f4659b);
            }
            if (c0846a.f4661d > 0) {
                map.put("If-Modified-Since", DateUtils.formatDate(new Date(c0846a.f4661d)));
            }
        }
    }

    /* renamed from: a */
    private byte[] m10158a(HttpEntity httpEntity) throws IOException, bks {
        asc asc = new asc(this.f7261c, (int) httpEntity.getContentLength());
        byte[] bArr = null;
        try {
            InputStream content = httpEntity.getContent();
            if (content == null) {
                throw new bks();
            }
            bArr = this.f7261c.m10174a((int) ByteConstants.KB);
            while (true) {
                int read = content.read(bArr);
                if (read == -1) {
                    break;
                }
                asc.write(bArr, 0, read);
            }
            byte[] toByteArray = asc.toByteArray();
            return toByteArray;
        } finally {
            try {
                httpEntity.consumeContent();
            } catch (IOException e) {
                bnt.m10019a("Error occured when calling consumingContent", new Object[0]);
            }
            this.f7261c.m10173a(bArr);
            asc.close();
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public p000.bdv mo1364a(p000.bfx<?> r19) throws p000.bmt {
        /*
        r18 = this;
        r16 = android.os.SystemClock.elapsedRealtime();
    L_0x0004:
        r3 = 0;
        r14 = 0;
        r6 = java.util.Collections.emptyMap();
        r2 = new java.util.HashMap;	 Catch:{ SocketTimeoutException -> 0x0090, ConnectTimeoutException -> 0x00b1, MalformedURLException -> 0x00c0, IOException -> 0x00de }
        r2.<init>();	 Catch:{ SocketTimeoutException -> 0x0090, ConnectTimeoutException -> 0x00b1, MalformedURLException -> 0x00c0, IOException -> 0x00de }
        r4 = r19.m5549e();	 Catch:{ SocketTimeoutException -> 0x0090, ConnectTimeoutException -> 0x00b1, MalformedURLException -> 0x00c0, IOException -> 0x00de }
        r0 = r18;
        r0.m10157a(r2, r4);	 Catch:{ SocketTimeoutException -> 0x0090, ConnectTimeoutException -> 0x00b1, MalformedURLException -> 0x00c0, IOException -> 0x00de }
        r0 = r18;
        r4 = r0.f7260b;	 Catch:{ SocketTimeoutException -> 0x0090, ConnectTimeoutException -> 0x00b1, MalformedURLException -> 0x00c0, IOException -> 0x00de }
        r0 = r19;
        r15 = r4.mo619a(r0, r2);	 Catch:{ SocketTimeoutException -> 0x0090, ConnectTimeoutException -> 0x00b1, MalformedURLException -> 0x00c0, IOException -> 0x00de }
        r12 = r15.getStatusLine();	 Catch:{ SocketTimeoutException -> 0x0090, ConnectTimeoutException -> 0x00b1, MalformedURLException -> 0x00c0, IOException -> 0x015a }
        r4 = r12.getStatusCode();	 Catch:{ SocketTimeoutException -> 0x0090, ConnectTimeoutException -> 0x00b1, MalformedURLException -> 0x00c0, IOException -> 0x015a }
        r2 = r15.getAllHeaders();	 Catch:{ SocketTimeoutException -> 0x0090, ConnectTimeoutException -> 0x00b1, MalformedURLException -> 0x00c0, IOException -> 0x015a }
        r6 = p000.boh.m10154a(r2);	 Catch:{ SocketTimeoutException -> 0x0090, ConnectTimeoutException -> 0x00b1, MalformedURLException -> 0x00c0, IOException -> 0x015a }
        r2 = 304; // 0x130 float:4.26E-43 double:1.5E-321;
        if (r4 != r2) goto L_0x0065;
    L_0x0036:
        r2 = r19.m5549e();	 Catch:{ SocketTimeoutException -> 0x0090, ConnectTimeoutException -> 0x00b1, MalformedURLException -> 0x00c0, IOException -> 0x015a }
        if (r2 != 0) goto L_0x004c;
    L_0x003c:
        r3 = new bdv;	 Catch:{ SocketTimeoutException -> 0x0090, ConnectTimeoutException -> 0x00b1, MalformedURLException -> 0x00c0, IOException -> 0x015a }
        r4 = 304; // 0x130 float:4.26E-43 double:1.5E-321;
        r5 = 0;
        r7 = 1;
        r8 = android.os.SystemClock.elapsedRealtime();	 Catch:{ SocketTimeoutException -> 0x0090, ConnectTimeoutException -> 0x00b1, MalformedURLException -> 0x00c0, IOException -> 0x015a }
        r8 = r8 - r16;
        r3.<init>(r4, r5, r6, r7, r8);	 Catch:{ SocketTimeoutException -> 0x0090, ConnectTimeoutException -> 0x00b1, MalformedURLException -> 0x00c0, IOException -> 0x015a }
    L_0x004b:
        return r3;
    L_0x004c:
        r3 = r2.f4664g;	 Catch:{ SocketTimeoutException -> 0x0090, ConnectTimeoutException -> 0x00b1, MalformedURLException -> 0x00c0, IOException -> 0x015a }
        r3.putAll(r6);	 Catch:{ SocketTimeoutException -> 0x0090, ConnectTimeoutException -> 0x00b1, MalformedURLException -> 0x00c0, IOException -> 0x015a }
        r7 = new bdv;	 Catch:{ SocketTimeoutException -> 0x0090, ConnectTimeoutException -> 0x00b1, MalformedURLException -> 0x00c0, IOException -> 0x015a }
        r8 = 304; // 0x130 float:4.26E-43 double:1.5E-321;
        r9 = r2.f4658a;	 Catch:{ SocketTimeoutException -> 0x0090, ConnectTimeoutException -> 0x00b1, MalformedURLException -> 0x00c0, IOException -> 0x015a }
        r10 = r2.f4664g;	 Catch:{ SocketTimeoutException -> 0x0090, ConnectTimeoutException -> 0x00b1, MalformedURLException -> 0x00c0, IOException -> 0x015a }
        r11 = 1;
        r2 = android.os.SystemClock.elapsedRealtime();	 Catch:{ SocketTimeoutException -> 0x0090, ConnectTimeoutException -> 0x00b1, MalformedURLException -> 0x00c0, IOException -> 0x015a }
        r12 = r2 - r16;
        r7.<init>(r8, r9, r10, r11, r12);	 Catch:{ SocketTimeoutException -> 0x0090, ConnectTimeoutException -> 0x00b1, MalformedURLException -> 0x00c0, IOException -> 0x015a }
        r3 = r7;
        goto L_0x004b;
    L_0x0065:
        r2 = r15.getEntity();	 Catch:{ SocketTimeoutException -> 0x0090, ConnectTimeoutException -> 0x00b1, MalformedURLException -> 0x00c0, IOException -> 0x015a }
        if (r2 == 0) goto L_0x009f;
    L_0x006b:
        r2 = r15.getEntity();	 Catch:{ SocketTimeoutException -> 0x0090, ConnectTimeoutException -> 0x00b1, MalformedURLException -> 0x00c0, IOException -> 0x015a }
        r0 = r18;
        r11 = r0.m10158a(r2);	 Catch:{ SocketTimeoutException -> 0x0090, ConnectTimeoutException -> 0x00b1, MalformedURLException -> 0x00c0, IOException -> 0x015a }
    L_0x0075:
        r2 = android.os.SystemClock.elapsedRealtime();	 Catch:{ SocketTimeoutException -> 0x0090, ConnectTimeoutException -> 0x00b1, MalformedURLException -> 0x00c0, IOException -> 0x015e }
        r8 = r2 - r16;
        r7 = r18;
        r10 = r19;
        r7.m10155a(r8, r10, r11, r12);	 Catch:{ SocketTimeoutException -> 0x0090, ConnectTimeoutException -> 0x00b1, MalformedURLException -> 0x00c0, IOException -> 0x015e }
        r2 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;
        if (r4 < r2) goto L_0x008a;
    L_0x0086:
        r2 = 299; // 0x12b float:4.19E-43 double:1.477E-321;
        if (r4 <= r2) goto L_0x00a3;
    L_0x008a:
        r2 = new java.io.IOException;	 Catch:{ SocketTimeoutException -> 0x0090, ConnectTimeoutException -> 0x00b1, MalformedURLException -> 0x00c0, IOException -> 0x015e }
        r2.<init>();	 Catch:{ SocketTimeoutException -> 0x0090, ConnectTimeoutException -> 0x00b1, MalformedURLException -> 0x00c0, IOException -> 0x015e }
        throw r2;	 Catch:{ SocketTimeoutException -> 0x0090, ConnectTimeoutException -> 0x00b1, MalformedURLException -> 0x00c0, IOException -> 0x015e }
    L_0x0090:
        r2 = move-exception;
        r2 = "socket";
        r3 = new bls;
        r3.<init>();
        r0 = r19;
        p000.boh.m10156a(r2, r0, r3);
        goto L_0x0004;
    L_0x009f:
        r2 = 0;
        r11 = new byte[r2];	 Catch:{ SocketTimeoutException -> 0x0090, ConnectTimeoutException -> 0x00b1, MalformedURLException -> 0x00c0, IOException -> 0x015a }
        goto L_0x0075;
    L_0x00a3:
        r3 = new bdv;	 Catch:{ SocketTimeoutException -> 0x0090, ConnectTimeoutException -> 0x00b1, MalformedURLException -> 0x00c0, IOException -> 0x015e }
        r7 = 0;
        r8 = android.os.SystemClock.elapsedRealtime();	 Catch:{ SocketTimeoutException -> 0x0090, ConnectTimeoutException -> 0x00b1, MalformedURLException -> 0x00c0, IOException -> 0x015e }
        r8 = r8 - r16;
        r5 = r11;
        r3.<init>(r4, r5, r6, r7, r8);	 Catch:{ SocketTimeoutException -> 0x0090, ConnectTimeoutException -> 0x00b1, MalformedURLException -> 0x00c0, IOException -> 0x015e }
        goto L_0x004b;
    L_0x00b1:
        r2 = move-exception;
        r2 = "connection";
        r3 = new bls;
        r3.<init>();
        r0 = r19;
        p000.boh.m10156a(r2, r0, r3);
        goto L_0x0004;
    L_0x00c0:
        r2 = move-exception;
        r3 = new java.lang.RuntimeException;
        r4 = new java.lang.StringBuilder;
        r4.<init>();
        r5 = "Bad URL ";
        r4 = r4.append(r5);
        r5 = r19.m5546c();
        r4 = r4.append(r5);
        r4 = r4.toString();
        r3.<init>(r4, r2);
        throw r3;
    L_0x00de:
        r2 = move-exception;
        r5 = r14;
    L_0x00e0:
        if (r3 == 0) goto L_0x0124;
    L_0x00e2:
        r2 = r3.getStatusLine();
        r4 = r2.getStatusCode();
        r2 = "Unexpected response code %d for %s";
        r3 = 2;
        r3 = new java.lang.Object[r3];
        r7 = 0;
        r8 = java.lang.Integer.valueOf(r4);
        r3[r7] = r8;
        r7 = 1;
        r8 = r19.m5546c();
        r3[r7] = r8;
        p000.bnt.m10022c(r2, r3);
        if (r5 == 0) goto L_0x014c;
    L_0x0102:
        r3 = new bdv;
        r7 = 0;
        r8 = android.os.SystemClock.elapsedRealtime();
        r8 = r8 - r16;
        r3.<init>(r4, r5, r6, r7, r8);
        r2 = 401; // 0x191 float:5.62E-43 double:1.98E-321;
        if (r4 == r2) goto L_0x0116;
    L_0x0112:
        r2 = 403; // 0x193 float:5.65E-43 double:1.99E-321;
        if (r4 != r2) goto L_0x012a;
    L_0x0116:
        r2 = "auth";
        r4 = new ard;
        r4.<init>(r3);
        r0 = r19;
        p000.boh.m10156a(r2, r0, r4);
        goto L_0x0004;
    L_0x0124:
        r3 = new bew;
        r3.<init>(r2);
        throw r3;
    L_0x012a:
        r2 = 400; // 0x190 float:5.6E-43 double:1.976E-321;
        if (r4 < r2) goto L_0x0138;
    L_0x012e:
        r2 = 499; // 0x1f3 float:6.99E-43 double:2.465E-321;
        if (r4 > r2) goto L_0x0138;
    L_0x0132:
        r2 = new ayh;
        r2.<init>(r3);
        throw r2;
    L_0x0138:
        r2 = 500; // 0x1f4 float:7.0E-43 double:2.47E-321;
        if (r4 < r2) goto L_0x0146;
    L_0x013c:
        r2 = 599; // 0x257 float:8.4E-43 double:2.96E-321;
        if (r4 > r2) goto L_0x0146;
    L_0x0140:
        r2 = new bks;
        r2.<init>(r3);
        throw r2;
    L_0x0146:
        r2 = new bks;
        r2.<init>(r3);
        throw r2;
    L_0x014c:
        r2 = "network";
        r3 = new bcu;
        r3.<init>();
        r0 = r19;
        p000.boh.m10156a(r2, r0, r3);
        goto L_0x0004;
    L_0x015a:
        r2 = move-exception;
        r5 = r14;
        r3 = r15;
        goto L_0x00e0;
    L_0x015e:
        r2 = move-exception;
        r5 = r11;
        r3 = r15;
        goto L_0x00e0;
        */
        throw new UnsupportedOperationException("Method not decompiled: boh.a(bfx):bdv");
    }
}
