package com.p000;

import com.facebook.internal.Utility;
import com.facebook.stetho.common.Utf8Charset;
import com.facebook.stetho.server.http.HttpHeaders;
import com.ninegag.android.tv.model.PostDao;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.Flushable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.Callable;
import java.util.zip.GZIPInputStream;
import p000.dfv.C4155a;

/* compiled from: HttpRequest */
/* renamed from: dft */
public class dft {
    /* renamed from: a */
    private static final String[] f21523a = new String[0];
    /* renamed from: b */
    private final HttpURLConnection f21524b;
    /* renamed from: c */
    private C4883d f21525c;
    /* renamed from: d */
    private boolean f21526d;
    /* renamed from: e */
    private boolean f21527e;
    /* renamed from: f */
    private boolean f21528f = true;
    /* renamed from: g */
    private boolean f21529g = false;
    /* renamed from: h */
    private int f21530h = Utility.DEFAULT_STREAM_BUFFER_SIZE;
    /* renamed from: i */
    private dfv f21531i;

    /* compiled from: HttpRequest */
    /* renamed from: dft$c */
    public static abstract class C4879c<V> implements Callable<V> {
        /* renamed from: b */
        protected abstract V mo4392b() throws C4882b, IOException;

        /* renamed from: c */
        protected abstract void mo4391c() throws IOException;

        protected C4879c() {
        }

        public V call() throws C4882b {
            Throwable th;
            Object obj = 1;
            try {
                V b = mo4392b();
                try {
                    mo4391c();
                    return b;
                } catch (IOException e) {
                    throw new C4882b(e);
                }
            } catch (C4882b e2) {
                throw e2;
            } catch (IOException e3) {
                throw new C4882b(e3);
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                mo4391c();
            } catch (IOException e4) {
                if (obj == null) {
                    throw new C4882b(e4);
                }
            }
            throw th;
        }
    }

    /* compiled from: HttpRequest */
    /* renamed from: dft$a */
    public static abstract class C4880a<V> extends C4879c<V> {
        /* renamed from: a */
        private final Closeable f21516a;
        /* renamed from: b */
        private final boolean f21517b;

        protected C4880a(Closeable closeable, boolean z) {
            this.f21516a = closeable;
            this.f21517b = z;
        }

        /* renamed from: c */
        protected void mo4391c() throws IOException {
            if (this.f21516a instanceof Flushable) {
                ((Flushable) this.f21516a).flush();
            }
            if (this.f21517b) {
                try {
                    this.f21516a.close();
                    return;
                } catch (IOException e) {
                    return;
                }
            }
            this.f21516a.close();
        }
    }

    /* compiled from: HttpRequest */
    /* renamed from: dft$b */
    public static class C4882b extends RuntimeException {
        private static final long serialVersionUID = -1170466989781746231L;

        public /* synthetic */ Throwable getCause() {
            return m27066a();
        }

        protected C4882b(IOException iOException) {
            super(iOException);
        }

        /* renamed from: a */
        public IOException m27066a() {
            return (IOException) super.getCause();
        }
    }

    /* compiled from: HttpRequest */
    /* renamed from: dft$d */
    public static class C4883d extends BufferedOutputStream {
        /* renamed from: a */
        private final CharsetEncoder f21521a;
        /* renamed from: b */
        private final dfv f21522b;

        public C4883d(OutputStream outputStream, String str, int i, dfv dfv) {
            super(outputStream, i);
            this.f21521a = Charset.forName(dft.m27079g(str)).newEncoder();
            this.f21522b = dfv;
        }

        /* renamed from: a */
        public C4883d m27067a(String str) throws IOException {
            ByteBuffer encode = this.f21521a.encode(CharBuffer.wrap(str));
            byte[] array = encode.array();
            int limit = encode.limit();
            this.f21522b.m27137b((long) limit);
            super.write(array, 0, limit);
            return this;
        }

        public void write(byte[] bArr, int i, int i2) throws IOException {
            super.write(bArr, i, i2);
            this.f21522b.m27137b((long) i2);
        }

        public void write(byte[] bArr) throws IOException {
            super.write(bArr);
            this.f21522b.m27137b((long) bArr.length);
        }
    }

    /* renamed from: g */
    private static String m27079g(String str) {
        return (str == null || str.length() <= 0) ? Utf8Charset.NAME : str;
    }

    /* renamed from: a */
    private static StringBuilder m27072a(String str, StringBuilder stringBuilder) {
        if (str.indexOf(58) + 2 == str.lastIndexOf(47)) {
            stringBuilder.append('/');
        }
        return stringBuilder;
    }

    /* renamed from: b */
    private static StringBuilder m27075b(String str, StringBuilder stringBuilder) {
        int indexOf = str.indexOf(63);
        int length = stringBuilder.length() - 1;
        if (indexOf == -1) {
            stringBuilder.append('?');
        } else if (indexOf < length && str.charAt(length) != '&') {
            stringBuilder.append('&');
        }
        return stringBuilder;
    }

    /* renamed from: a */
    public static String m27070a(CharSequence charSequence) throws C4882b {
        try {
            URL url = new URL(charSequence.toString());
            String host = url.getHost();
            int port = url.getPort();
            if (port != -1) {
                host = host + ':' + Integer.toString(port);
            }
            try {
                return new URI(url.getProtocol(), host, url.getPath(), url.getQuery(), null).toASCIIString();
            } catch (Throwable e) {
                IOException iOException = new IOException("Parsing URI failed");
                iOException.initCause(e);
                throw new C4882b(iOException);
            }
        } catch (IOException e2) {
            throw new C4882b(e2);
        }
    }

    /* renamed from: a */
    public static String m27071a(CharSequence charSequence, Map<?, ?> map) {
        String charSequence2 = charSequence.toString();
        if (map == null || map.isEmpty()) {
            return charSequence2;
        }
        StringBuilder stringBuilder = new StringBuilder(charSequence2);
        dft.m27072a(charSequence2, stringBuilder);
        dft.m27075b(charSequence2, stringBuilder);
        Iterator it = map.entrySet().iterator();
        Entry entry = (Entry) it.next();
        stringBuilder.append(entry.getKey().toString());
        stringBuilder.append('=');
        Object value = entry.getValue();
        if (value != null) {
            stringBuilder.append(value);
        }
        while (it.hasNext()) {
            stringBuilder.append('&');
            entry = (Entry) it.next();
            stringBuilder.append(entry.getKey().toString());
            stringBuilder.append('=');
            value = entry.getValue();
            if (value != null) {
                stringBuilder.append(value);
            }
        }
        return stringBuilder.toString();
    }

    /* renamed from: b */
    public static dft m27073b(CharSequence charSequence) throws C4882b {
        return new dft(charSequence, "GET");
    }

    /* renamed from: a */
    public static dft m27069a(CharSequence charSequence, Map<?, ?> map, boolean z) {
        CharSequence a = dft.m27071a(charSequence, (Map) map);
        if (z) {
            a = dft.m27070a(a);
        }
        return dft.m27073b(a);
    }

    /* renamed from: c */
    public static dft m27076c(CharSequence charSequence) throws C4882b {
        return new dft(charSequence, PostDao.TABLENAME);
    }

    /* renamed from: b */
    public static dft m27074b(CharSequence charSequence, Map<?, ?> map, boolean z) {
        CharSequence a = dft.m27071a(charSequence, (Map) map);
        if (z) {
            a = dft.m27070a(a);
        }
        return dft.m27076c(a);
    }

    /* renamed from: d */
    public static dft m27077d(CharSequence charSequence) throws C4882b {
        return new dft(charSequence, "DELETE");
    }

    public dft(CharSequence charSequence, String str) throws C4882b {
        try {
            this.f21524b = (HttpURLConnection) new URL(charSequence.toString()).openConnection();
            this.f21524b.setRequestMethod(str);
        } catch (IOException e) {
            throw new C4882b(e);
        }
    }

    public String toString() {
        return m27126p() + ' ' + m27125o();
    }

    /* renamed from: a */
    public HttpURLConnection m27098a() {
        return this.f21524b;
    }

    /* renamed from: b */
    public int m27100b() throws C4882b {
        try {
            m27121k();
            return this.f21524b.getResponseCode();
        } catch (IOException e) {
            throw new C4882b(e);
        }
    }

    /* renamed from: c */
    public dft m27106c() {
        this.f21524b.disconnect();
        return this;
    }

    /* renamed from: d */
    protected ByteArrayOutputStream m27110d() {
        int j = m27120j();
        if (j > 0) {
            return new ByteArrayOutputStream(j);
        }
        return new ByteArrayOutputStream();
    }

    /* renamed from: a */
    public String m27097a(String str) throws C4882b {
        OutputStream d = m27110d();
        try {
            m27083a(m27116f(), d);
            return d.toString(dft.m27079g(str));
        } catch (IOException e) {
            throw new C4882b(e);
        }
    }

    /* renamed from: e */
    public String m27114e() throws C4882b {
        return m27097a(m27118h());
    }

    /* renamed from: f */
    public BufferedInputStream m27116f() throws C4882b {
        return new BufferedInputStream(m27117g(), this.f21530h);
    }

    /* renamed from: g */
    public InputStream m27117g() throws C4882b {
        if (m27100b() < 400) {
            try {
                InputStream inputStream = this.f21524b.getInputStream();
            } catch (IOException e) {
                throw new C4882b(e);
            }
        }
        inputStream = this.f21524b.getErrorStream();
        if (inputStream == null) {
            try {
                inputStream = this.f21524b.getInputStream();
            } catch (IOException e2) {
                throw new C4882b(e2);
            }
        }
        if (!this.f21529g || !"gzip".equals(m27119i())) {
            return inputStream;
        }
        try {
            return new GZIPInputStream(inputStream);
        } catch (IOException e22) {
            throw new C4882b(e22);
        }
    }

    /* renamed from: a */
    public dft m27084a(OutputStream outputStream) throws C4882b {
        try {
            return m27083a(m27116f(), outputStream);
        } catch (IOException e) {
            throw new C4882b(e);
        }
    }

    /* renamed from: a */
    public dft m27082a(int i) {
        this.f21524b.setReadTimeout(i);
        return this;
    }

    /* renamed from: b */
    public dft m27101b(int i) {
        this.f21524b.setConnectTimeout(i);
        return this;
    }

    /* renamed from: a */
    public dft m27087a(String str, String str2) {
        this.f21524b.setRequestProperty(str, str2);
        return this;
    }

    /* renamed from: a */
    public dft m27086a(String str, Number number) {
        return m27087a(str, number != null ? number.toString() : null);
    }

    /* renamed from: b */
    public String m27103b(String str) throws C4882b {
        m27122l();
        return this.f21524b.getHeaderField(str);
    }

    /* renamed from: c */
    public int m27105c(String str) throws C4882b {
        return m27081a(str, -1);
    }

    /* renamed from: a */
    public int m27081a(String str, int i) throws C4882b {
        m27122l();
        return this.f21524b.getHeaderFieldInt(str, i);
    }

    /* renamed from: b */
    public String m27104b(String str, String str2) {
        return m27107c(m27103b(str), str2);
    }

    /* renamed from: c */
    protected String m27107c(String str, String str2) {
        if (str == null || str.length() == 0) {
            return null;
        }
        int length = str.length();
        int indexOf = str.indexOf(59) + 1;
        if (indexOf == 0 || indexOf == length) {
            return null;
        }
        int indexOf2 = str.indexOf(59, indexOf);
        if (indexOf2 == -1) {
            indexOf2 = indexOf;
            indexOf = length;
        } else {
            int i = indexOf2;
            indexOf2 = indexOf;
            indexOf = i;
        }
        while (indexOf2 < indexOf) {
            int indexOf3 = str.indexOf(61, indexOf2);
            if (indexOf3 != -1 && indexOf3 < indexOf && str2.equals(str.substring(indexOf2, indexOf3).trim())) {
                String trim = str.substring(indexOf3 + 1, indexOf).trim();
                indexOf3 = trim.length();
                if (indexOf3 != 0) {
                    if (indexOf3 > 2 && '\"' == trim.charAt(0) && '\"' == trim.charAt(indexOf3 - 1)) {
                        return trim.substring(1, indexOf3 - 1);
                    }
                    return trim;
                }
            }
            indexOf++;
            indexOf2 = str.indexOf(59, indexOf);
            if (indexOf2 == -1) {
                indexOf2 = length;
            }
            i = indexOf2;
            indexOf2 = indexOf;
            indexOf = i;
        }
        return null;
    }

    /* renamed from: h */
    public String m27118h() {
        return m27104b(HttpHeaders.CONTENT_TYPE, "charset");
    }

    /* renamed from: d */
    public dft m27108d(String str) {
        return m27087a("User-Agent", str);
    }

    /* renamed from: a */
    public dft m27096a(boolean z) {
        this.f21524b.setUseCaches(z);
        return this;
    }

    /* renamed from: i */
    public String m27119i() {
        return m27103b("Content-Encoding");
    }

    /* renamed from: e */
    public dft m27112e(String str) {
        return m27109d(str, null);
    }

    /* renamed from: d */
    public dft m27109d(String str, String str2) {
        if (str2 == null || str2.length() <= 0) {
            return m27087a(HttpHeaders.CONTENT_TYPE, str);
        }
        String str3 = "; charset=";
        return m27087a(HttpHeaders.CONTENT_TYPE, str + "; charset=" + str2);
    }

    /* renamed from: j */
    public int m27120j() {
        return m27105c(HttpHeaders.CONTENT_LENGTH);
    }

    /* renamed from: a */
    protected dft m27083a(InputStream inputStream, OutputStream outputStream) throws IOException {
        final InputStream inputStream2 = inputStream;
        final OutputStream outputStream2 = outputStream;
        return (dft) new C4880a<dft>(this, inputStream, this.f21528f) {
            /* renamed from: c */
            final /* synthetic */ dft f21520c;

            /* renamed from: b */
            public /* synthetic */ Object mo4392b() throws C4882b, IOException {
                return m27064a();
            }

            /* renamed from: a */
            public dft m27064a() throws IOException {
                byte[] bArr = new byte[this.f21520c.f21530h];
                while (true) {
                    int read = inputStream2.read(bArr);
                    if (read == -1) {
                        return this.f21520c;
                    }
                    outputStream2.write(bArr, 0, read);
                }
            }
        }.call();
    }

    /* renamed from: k */
    protected dft m27121k() throws IOException {
        if (this.f21525c != null) {
            if (this.f21526d) {
                this.f21525c.m27067a("\r\n--00content0boundary00--\r\n");
            }
            if (this.f21528f) {
                try {
                    this.f21525c.close();
                } catch (IOException e) {
                }
            } else {
                this.f21525c.close();
            }
            this.f21525c = null;
        }
        return this;
    }

    /* renamed from: l */
    protected dft m27122l() throws C4882b {
        try {
            return m27121k();
        } catch (IOException e) {
            throw new C4882b(e);
        }
    }

    /* renamed from: m */
    protected dft m27123m() throws IOException {
        if (this.f21525c == null) {
            this.f21524b.setDoOutput(true);
            this.f21525c = new C4883d(this.f21524b.getOutputStream(), m27107c(this.f21524b.getRequestProperty(HttpHeaders.CONTENT_TYPE), "charset"), this.f21530h, m27080q());
        }
        return this;
    }

    /* renamed from: n */
    protected dft m27124n() throws IOException {
        if (this.f21526d) {
            this.f21525c.m27067a("\r\n--00content0boundary00\r\n");
        } else {
            this.f21526d = true;
            m27112e("multipart/form-data; boundary=00content0boundary00").m27123m();
            this.f21525c.m27067a("--00content0boundary00\r\n");
        }
        return this;
    }

    /* renamed from: a */
    protected dft m27089a(String str, String str2, String str3) throws IOException {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("form-data; name=\"").append(str);
        if (str2 != null) {
            stringBuilder.append("\"; filename=\"").append(str2);
        }
        stringBuilder.append('\"');
        m27115f("Content-Disposition", stringBuilder.toString());
        if (str3 != null) {
            m27115f(HttpHeaders.CONTENT_TYPE, str3);
        }
        return m27111e((CharSequence) "\r\n");
    }

    /* renamed from: e */
    public dft m27113e(String str, String str2) {
        return m27102b(str, null, str2);
    }

    /* renamed from: b */
    public dft m27102b(String str, String str2, String str3) throws C4882b {
        return m27092a(str, str2, null, str3);
    }

    /* renamed from: a */
    public dft m27092a(String str, String str2, String str3, String str4) throws C4882b {
        try {
            m27124n();
            m27089a(str, str2, str3);
            this.f21525c.m27067a(str4);
            return this;
        } catch (IOException e) {
            throw new C4882b(e);
        }
    }

    /* renamed from: a */
    public dft m27088a(String str, String str2, File file) throws C4882b {
        return m27090a(str, str2, null, file);
    }

    /* renamed from: a */
    public dft m27090a(String str, String str2, String str3, File file) throws C4882b {
        m27080q().m27135a(file.length());
        try {
            return m27091a(str, str2, str3, new BufferedInputStream(new FileInputStream(file)));
        } catch (IOException e) {
            throw new C4882b(e);
        }
    }

    /* renamed from: a */
    public dft m27091a(String str, String str2, String str3, InputStream inputStream) throws C4882b {
        try {
            m27124n();
            m27089a(str, str2, str3);
            m27083a(inputStream, this.f21525c);
            return this;
        } catch (IOException e) {
            throw new C4882b(e);
        }
    }

    /* renamed from: f */
    public dft m27115f(String str, String str2) throws C4882b {
        return m27111e((CharSequence) str).m27111e((CharSequence) ": ").m27111e((CharSequence) str2).m27111e((CharSequence) "\r\n");
    }

    /* renamed from: e */
    public dft m27111e(CharSequence charSequence) throws C4882b {
        try {
            m27123m();
            this.f21525c.m27067a(charSequence.toString());
            return this;
        } catch (IOException e) {
            throw new C4882b(e);
        }
    }

    /* renamed from: a */
    public dft m27094a(Map<?, ?> map) throws C4882b {
        return m27095a((Map) map, Utf8Charset.NAME);
    }

    /* renamed from: a */
    public dft m27093a(Entry<?, ?> entry, String str) throws C4882b {
        return m27085a(entry.getKey(), entry.getValue(), str);
    }

    /* renamed from: a */
    public dft m27085a(Object obj, Object obj2, String str) throws C4882b {
        boolean z = !this.f21527e;
        if (z) {
            m27109d("application/x-www-form-urlencoded", str);
            this.f21527e = true;
        }
        String g = dft.m27079g(str);
        try {
            m27123m();
            if (!z) {
                this.f21525c.write(38);
            }
            this.f21525c.m27067a(URLEncoder.encode(obj.toString(), g));
            this.f21525c.write(61);
            if (obj2 != null) {
                this.f21525c.m27067a(URLEncoder.encode(obj2.toString(), g));
            }
            return this;
        } catch (IOException e) {
            throw new C4882b(e);
        }
    }

    /* renamed from: a */
    public dft m27095a(Map<?, ?> map, String str) throws C4882b {
        if (!map.isEmpty()) {
            for (Entry a : map.entrySet()) {
                m27093a(a, str);
            }
        }
        return this;
    }

    /* renamed from: o */
    public URL m27125o() {
        return this.f21524b.getURL();
    }

    /* renamed from: p */
    public String m27126p() {
        return this.f21524b.getRequestMethod();
    }

    /* renamed from: q */
    private dfv m27080q() {
        if (this.f21531i == null) {
            this.f21531i = new dfv();
        }
        return this.f21531i;
    }

    /* renamed from: a */
    public void m27099a(C4155a c4155a) {
        m27080q().m27136a(c4155a);
    }
}
