package com.p000;

import android.text.TextUtils;
import android.util.Log;
import com.facebook.drawee.generic.GenericDraweeHierarchyBuilder;
import com.facebook.stetho.server.http.HttpHeaders;
import com.facebook.stetho.server.http.HttpStatus;
import com.millennialmedia.NativeAd.NativeErrorStatus;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.NoRouteToHostException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p000.agw.C0169a;
import p000.agw.C0170b;
import p000.agw.C0171c;

/* compiled from: DefaultHttpDataSource */
/* renamed from: agt */
public class agt implements agw {
    /* renamed from: b */
    private static final Pattern f1415b = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");
    /* renamed from: c */
    private static final AtomicReference<byte[]> f1416c = new AtomicReference();
    /* renamed from: d */
    private final boolean f1417d;
    /* renamed from: e */
    private final int f1418e;
    /* renamed from: f */
    private final int f1419f;
    /* renamed from: g */
    private final String f1420g;
    /* renamed from: h */
    private final ahm<String> f1421h;
    /* renamed from: i */
    private final HashMap<String, String> f1422i = new HashMap();
    /* renamed from: j */
    private final agy f1423j;
    /* renamed from: k */
    private agq f1424k;
    /* renamed from: l */
    private HttpURLConnection f1425l;
    /* renamed from: m */
    private InputStream f1426m;
    /* renamed from: n */
    private boolean f1427n;
    /* renamed from: o */
    private long f1428o;
    /* renamed from: p */
    private long f1429p;
    /* renamed from: q */
    private long f1430q;
    /* renamed from: r */
    private long f1431r;

    public agt(String str, ahm<String> ahm, agy agy, int i, int i2, boolean z) {
        this.f1420g = ahb.m1513a(str);
        this.f1421h = ahm;
        this.f1423j = agy;
        this.f1418e = i;
        this.f1419f = i2;
        this.f1417d = z;
    }

    public long open(agq agq) throws C0169a {
        long j = 0;
        this.f1424k = agq;
        this.f1431r = 0;
        this.f1430q = 0;
        try {
            this.f1425l = m1481a(agq);
            try {
                int responseCode = this.f1425l.getResponseCode();
                if (responseCode < HttpStatus.HTTP_OK || responseCode > 299) {
                    Map headerFields = this.f1425l.getHeaderFields();
                    m1485d();
                    throw new C0171c(responseCode, headerFields, agq);
                }
                String contentType = this.f1425l.getContentType();
                if (this.f1421h == null || this.f1421h.mo191a(contentType)) {
                    if (responseCode == HttpStatus.HTTP_OK && agq.f1393d != 0) {
                        j = agq.f1393d;
                    }
                    this.f1428o = j;
                    if ((agq.f1396g & 1) == 0) {
                        j = agt.m1480a(this.f1425l);
                        j = agq.f1394e != -1 ? agq.f1394e : j != -1 ? j - this.f1428o : -1;
                        this.f1429p = j;
                    } else {
                        this.f1429p = agq.f1394e;
                    }
                    try {
                        this.f1426m = this.f1425l.getInputStream();
                        this.f1427n = true;
                        if (this.f1423j != null) {
                            this.f1423j.mo188a();
                        }
                        return this.f1429p;
                    } catch (IOException e) {
                        m1485d();
                        throw new C0169a(e, agq);
                    }
                }
                m1485d();
                throw new C0170b(contentType, agq);
            } catch (IOException e2) {
                m1485d();
                throw new C0169a("Unable to connect to " + agq.f1390a.toString(), e2, agq);
            }
        } catch (IOException e22) {
            throw new C0169a("Unable to connect to " + agq.f1390a.toString(), e22, agq);
        }
    }

    public int read(byte[] bArr, int i, int i2) throws C0169a {
        try {
            m1484c();
            return m1479a(bArr, i, i2);
        } catch (IOException e) {
            throw new C0169a(e, this.f1424k);
        }
    }

    public void close() throws C0169a {
        try {
            if (this.f1426m != null) {
                ahr.m1598a(this.f1425l, m1487b());
                this.f1426m.close();
            }
            this.f1426m = null;
            m1485d();
            if (this.f1427n) {
                this.f1427n = false;
                if (this.f1423j != null) {
                    this.f1423j.mo190b();
                }
            }
        } catch (IOException e) {
            throw new C0169a(e, this.f1424k);
        } catch (Throwable th) {
            this.f1426m = null;
            m1485d();
            if (this.f1427n) {
                this.f1427n = false;
                if (this.f1423j != null) {
                    this.f1423j.mo190b();
                }
            }
        }
    }

    /* renamed from: a */
    protected final long m1486a() {
        return this.f1431r;
    }

    /* renamed from: b */
    protected final long m1487b() {
        return this.f1429p == -1 ? this.f1429p : this.f1429p - this.f1431r;
    }

    /* renamed from: a */
    private HttpURLConnection m1481a(agq agq) throws IOException {
        URL url = new URL(agq.f1390a.toString());
        byte[] bArr = agq.f1391b;
        long j = agq.f1393d;
        long j2 = agq.f1394e;
        boolean z = (agq.f1396g & 1) != 0;
        if (!this.f1417d) {
            return m1482a(url, bArr, j, j2, z, true);
        }
        HttpURLConnection a;
        int i = 0;
        while (true) {
            int i2 = i + 1;
            if (i <= 20) {
                a = m1482a(url, bArr, j, j2, z, false);
                int responseCode = a.getResponseCode();
                if (responseCode == GenericDraweeHierarchyBuilder.DEFAULT_FADE_DURATION || responseCode == NativeErrorStatus.EXPIRED || responseCode == 302 || responseCode == 303 || (bArr == null && (responseCode == 307 || responseCode == 308))) {
                    bArr = null;
                    String headerField = a.getHeaderField("Location");
                    a.disconnect();
                    url = agt.m1483a(url, headerField);
                    i = i2;
                }
            } else {
                throw new NoRouteToHostException("Too many redirects: " + i2);
            }
        }
        return a;
    }

    /* renamed from: a */
    private HttpURLConnection m1482a(URL url, byte[] bArr, long j, long j2, boolean z, boolean z2) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.f1418e);
        httpURLConnection.setReadTimeout(this.f1419f);
        synchronized (this.f1422i) {
            for (Entry entry : this.f1422i.entrySet()) {
                httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
        }
        if (!(j == 0 && j2 == -1)) {
            String str = "bytes=" + j + "-";
            if (j2 != -1) {
                str = str + ((j + j2) - 1);
            }
            httpURLConnection.setRequestProperty("Range", str);
        }
        httpURLConnection.setRequestProperty("User-Agent", this.f1420g);
        if (!z) {
            httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
        }
        httpURLConnection.setInstanceFollowRedirects(z2);
        httpURLConnection.setDoOutput(bArr != null);
        if (bArr != null) {
            httpURLConnection.setFixedLengthStreamingMode(bArr.length);
            httpURLConnection.connect();
            OutputStream outputStream = httpURLConnection.getOutputStream();
            outputStream.write(bArr);
            outputStream.close();
        } else {
            httpURLConnection.connect();
        }
        return httpURLConnection;
    }

    /* renamed from: a */
    private static URL m1483a(URL url, String str) throws IOException {
        if (str == null) {
            throw new ProtocolException("Null location redirect");
        }
        URL url2 = new URL(url, str);
        String protocol = url2.getProtocol();
        if ("https".equals(protocol) || "http".equals(protocol)) {
            return url2;
        }
        throw new ProtocolException("Unsupported protocol redirect: " + protocol);
    }

    /* renamed from: a */
    private static long m1480a(HttpURLConnection httpURLConnection) {
        long j = -1;
        String headerField = httpURLConnection.getHeaderField(HttpHeaders.CONTENT_LENGTH);
        if (!TextUtils.isEmpty(headerField)) {
            try {
                j = Long.parseLong(headerField);
            } catch (NumberFormatException e) {
                Log.e("DefaultHttpDataSource", "Unexpected Content-Length [" + headerField + "]");
            }
        }
        String headerField2 = httpURLConnection.getHeaderField("Content-Range");
        if (TextUtils.isEmpty(headerField2)) {
            return j;
        }
        Matcher matcher = f1415b.matcher(headerField2);
        if (!matcher.find()) {
            return j;
        }
        try {
            long parseLong = (Long.parseLong(matcher.group(2)) - Long.parseLong(matcher.group(1))) + 1;
            if (j < 0) {
                return parseLong;
            }
            if (j == parseLong) {
                return j;
            }
            Log.w("DefaultHttpDataSource", "Inconsistent headers [" + headerField + "] [" + headerField2 + "]");
            return Math.max(j, parseLong);
        } catch (NumberFormatException e2) {
            Log.e("DefaultHttpDataSource", "Unexpected Content-Range [" + headerField2 + "]");
            return j;
        }
    }

    /* renamed from: c */
    private void m1484c() throws IOException {
        if (this.f1430q != this.f1428o) {
            Object obj = (byte[]) f1416c.getAndSet(null);
            if (obj == null) {
                obj = new byte[4096];
            }
            while (this.f1430q != this.f1428o) {
                int read = this.f1426m.read(obj, 0, (int) Math.min(this.f1428o - this.f1430q, (long) obj.length));
                if (Thread.interrupted()) {
                    throw new InterruptedIOException();
                } else if (read == -1) {
                    throw new EOFException();
                } else {
                    this.f1430q += (long) read;
                    if (this.f1423j != null) {
                        this.f1423j.mo189a(read);
                    }
                }
            }
            f1416c.set(obj);
        }
    }

    /* renamed from: a */
    private int m1479a(byte[] bArr, int i, int i2) throws IOException {
        if (this.f1429p != -1) {
            i2 = (int) Math.min((long) i2, this.f1429p - this.f1431r);
        }
        if (i2 == 0) {
            return -1;
        }
        int read = this.f1426m.read(bArr, i, i2);
        if (read != -1) {
            this.f1431r += (long) read;
            if (this.f1423j != null) {
                this.f1423j.mo189a(read);
            }
            return read;
        } else if (this.f1429p == -1 || this.f1429p == this.f1431r) {
            return -1;
        } else {
            throw new EOFException();
        }
    }

    /* renamed from: d */
    private void m1485d() {
        if (this.f1425l != null) {
            try {
                this.f1425l.disconnect();
            } catch (Throwable e) {
                Log.e("DefaultHttpDataSource", "Unexpected error while disconnecting", e);
            }
            this.f1425l = null;
        }
    }
}
