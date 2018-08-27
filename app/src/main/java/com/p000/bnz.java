package com.p000;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Build.VERSION;
import com.facebook.common.util.ByteConstants;
import com.facebook.stetho.common.Utf8Charset;
import com.facebook.stetho.server.http.HttpStatus;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map.Entry;
import java.util.zip.GZIPOutputStream;

/* renamed from: bnz */
class bnz extends bmu {
    /* renamed from: c */
    private static final byte[] f7198c = "\n".getBytes();
    /* renamed from: a */
    private final String f7199a = bnz.m10058a("GoogleAnalytics", bmv.f7023a, VERSION.RELEASE, bof.m10131a(Locale.getDefault()), Build.MODEL, Build.ID);
    /* renamed from: b */
    private final bod f7200b;

    /* renamed from: bnz$a */
    class C1363a {
        /* renamed from: a */
        final /* synthetic */ bnz f7195a;
        /* renamed from: b */
        private int f7196b;
        /* renamed from: c */
        private ByteArrayOutputStream f7197c = new ByteArrayOutputStream();

        public C1363a(bnz bnz) {
            this.f7195a = bnz;
        }

        /* renamed from: a */
        public int m10054a() {
            return this.f7196b;
        }

        /* renamed from: a */
        public boolean m10055a(bns bns) {
            aoi.m4679a((Object) bns);
            if (this.f7196b + 1 > this.f7195a.zznT().m9947l()) {
                return false;
            }
            String a = this.f7195a.m10070a(bns, false);
            if (a == null) {
                this.f7195a.zznS().m10041a(bns, "Error formatting hit");
                return true;
            }
            byte[] bytes = a.getBytes();
            int length = bytes.length;
            if (length > this.f7195a.zznT().m9939d()) {
                this.f7195a.zznS().m10041a(bns, "Hit size exceeds the maximum size limit");
                return true;
            }
            if (this.f7197c.size() > 0) {
                length++;
            }
            if (length + this.f7197c.size() > this.f7195a.zznT().m9941f()) {
                return false;
            }
            try {
                if (this.f7197c.size() > 0) {
                    this.f7197c.write(bnz.f7198c);
                }
                this.f7197c.write(bytes);
                this.f7196b++;
                return true;
            } catch (IOException e) {
                this.f7195a.zze("Failed to write payload when batching hits", e);
                return true;
            }
        }

        /* renamed from: b */
        public byte[] m10056b() {
            return this.f7197c.toByteArray();
        }
    }

    bnz(bmw bmw) {
        super(bmw);
        this.f7200b = new bod(bmw.m9769d());
    }

    /* renamed from: a */
    private int m10057a(URL url, byte[] bArr) {
        Object e;
        Throwable th;
        OutputStream outputStream = null;
        aoi.m4679a((Object) url);
        aoi.m4679a((Object) bArr);
        zzb("POST bytes, url", Integer.valueOf(bArr.length), url);
        if (zzkI()) {
            zza("Post payload\n", new String(bArr));
        }
        HttpURLConnection a;
        try {
            getContext().getPackageName();
            a = m10071a(url);
            try {
                a.setDoOutput(true);
                a.setFixedLengthStreamingMode(bArr.length);
                a.connect();
                outputStream = a.getOutputStream();
                outputStream.write(bArr);
                m10061a(a);
                int responseCode = a.getResponseCode();
                if (responseCode == HttpStatus.HTTP_OK) {
                    zzmA().m9763g();
                }
                zzb("POST status", Integer.valueOf(responseCode));
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (IOException e2) {
                        zze("Error closing http post connection output stream", e2);
                    }
                }
                if (a == null) {
                    return responseCode;
                }
                a.disconnect();
                return responseCode;
            } catch (IOException e3) {
                e = e3;
                try {
                    zzd("Network POST connection error", e);
                    if (outputStream != null) {
                        try {
                            outputStream.close();
                        } catch (IOException e4) {
                            zze("Error closing http post connection output stream", e4);
                        }
                    }
                    if (a != null) {
                        a.disconnect();
                    }
                    return 0;
                } catch (Throwable th2) {
                    th = th2;
                    if (outputStream != null) {
                        try {
                            outputStream.close();
                        } catch (IOException e22) {
                            zze("Error closing http post connection output stream", e22);
                        }
                    }
                    if (a != null) {
                        a.disconnect();
                    }
                    throw th;
                }
            }
        } catch (IOException e5) {
            e = e5;
            a = outputStream;
            zzd("Network POST connection error", e);
            if (outputStream != null) {
                outputStream.close();
            }
            if (a != null) {
                a.disconnect();
            }
            return 0;
        } catch (Throwable th3) {
            th = th3;
            a = outputStream;
            if (outputStream != null) {
                outputStream.close();
            }
            if (a != null) {
                a.disconnect();
            }
            throw th;
        }
    }

    /* renamed from: a */
    private static String m10058a(String str, String str2, String str3, String str4, String str5, String str6) {
        return String.format("%s/%s (Linux; U; Android %s; %s; %s Build/%s)", new Object[]{str, str2, str3, str4, str5, str6});
    }

    /* renamed from: a */
    private URL m10059a(bns bns, String str) {
        String valueOf;
        String valueOf2;
        if (bns.m10013f()) {
            valueOf2 = String.valueOf(zznT().m9949n());
            valueOf = String.valueOf(zznT().m9951p());
            valueOf = new StringBuilder(((String.valueOf(valueOf2).length() + 1) + String.valueOf(valueOf).length()) + String.valueOf(str).length()).append(valueOf2).append(valueOf).append("?").append(str).toString();
        } else {
            valueOf2 = String.valueOf(zznT().m9950o());
            valueOf = String.valueOf(zznT().m9951p());
            valueOf = new StringBuilder(((String.valueOf(valueOf2).length() + 1) + String.valueOf(valueOf).length()) + String.valueOf(str).length()).append(valueOf2).append(valueOf).append("?").append(str).toString();
        }
        try {
            return new URL(valueOf);
        } catch (MalformedURLException e) {
            zze("Error trying to parse the hardcoded host url", e);
            return null;
        }
    }

    /* renamed from: a */
    private void m10060a(StringBuilder stringBuilder, String str, String str2) throws UnsupportedEncodingException {
        if (stringBuilder.length() != 0) {
            stringBuilder.append('&');
        }
        stringBuilder.append(URLEncoder.encode(str, Utf8Charset.NAME));
        stringBuilder.append('=');
        stringBuilder.append(URLEncoder.encode(str2, Utf8Charset.NAME));
    }

    /* renamed from: a */
    private void m10061a(HttpURLConnection httpURLConnection) throws IOException {
        InputStream inputStream = null;
        try {
            inputStream = httpURLConnection.getInputStream();
            do {
            } while (inputStream.read(new byte[ByteConstants.KB]) > 0);
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    zze("Error closing http connection input stream", e);
                }
            }
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e2) {
                    zze("Error closing http connection input stream", e2);
                }
            }
        }
    }

    /* renamed from: a */
    private boolean m10062a(bns bns) {
        aoi.m4679a((Object) bns);
        String a = m10070a(bns, !bns.m10013f());
        if (a == null) {
            zznS().m10041a(bns, "Error formatting hit for upload");
            return true;
        } else if (a.length() <= zznT().m9938c()) {
            URL a2 = m10059a(bns, a);
            if (a2 != null) {
                return m10064b(a2) == HttpStatus.HTTP_OK;
            } else {
                zzbT("Failed to build collect GET endpoint url");
                return false;
            }
        } else {
            a = m10070a(bns, false);
            if (a == null) {
                zznS().m10041a(bns, "Error formatting hit for POST upload");
                return true;
            }
            byte[] bytes = a.getBytes();
            if (bytes.length > zznT().m9940e()) {
                zznS().m10041a(bns, "Hit payload exceeds size limit");
                return true;
            }
            URL b = m10066b(bns);
            if (b != null) {
                return m10057a(b, bytes) == HttpStatus.HTTP_OK;
            } else {
                zzbT("Failed to build collect POST endpoint url");
                return false;
            }
        }
    }

    /* renamed from: a */
    private static byte[] m10063a(byte[] bArr) throws IOException {
        OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
        gZIPOutputStream.write(bArr);
        gZIPOutputStream.close();
        byteArrayOutputStream.close();
        return byteArrayOutputStream.toByteArray();
    }

    /* renamed from: b */
    private int m10064b(URL url) {
        aoi.m4679a((Object) url);
        zzb("GET request", url);
        HttpURLConnection httpURLConnection = null;
        try {
            httpURLConnection = m10071a(url);
            httpURLConnection.connect();
            m10061a(httpURLConnection);
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == HttpStatus.HTTP_OK) {
                zzmA().m9763g();
            }
            zzb("GET status", Integer.valueOf(responseCode));
            if (httpURLConnection == null) {
                return responseCode;
            }
            httpURLConnection.disconnect();
            return responseCode;
        } catch (IOException e) {
            zzd("Network GET connection error", e);
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
            return 0;
        } catch (Throwable th) {
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
            throw th;
        }
    }

    /* renamed from: b */
    private int m10065b(URL url, byte[] bArr) {
        HttpURLConnection a;
        Object e;
        HttpURLConnection httpURLConnection;
        Throwable th;
        OutputStream outputStream = null;
        aoi.m4679a((Object) url);
        aoi.m4679a((Object) bArr);
        try {
            getContext().getPackageName();
            byte[] a2 = bnz.m10063a(bArr);
            zza("POST compressed size, ratio %, url", Integer.valueOf(a2.length), Long.valueOf((100 * ((long) a2.length)) / ((long) bArr.length)), url);
            if (a2.length > bArr.length) {
                zzc("Compressed payload is larger then uncompressed. compressed, uncompressed", Integer.valueOf(a2.length), Integer.valueOf(bArr.length));
            }
            if (zzkI()) {
                String str = "Post payload";
                String str2 = "\n";
                String valueOf = String.valueOf(new String(bArr));
                zza(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
            }
            a = m10071a(url);
            try {
                a.setDoOutput(true);
                a.addRequestProperty("Content-Encoding", "gzip");
                a.setFixedLengthStreamingMode(a2.length);
                a.connect();
                OutputStream outputStream2 = a.getOutputStream();
                try {
                    outputStream2.write(a2);
                    outputStream2.close();
                    m10061a(a);
                    int responseCode = a.getResponseCode();
                    if (responseCode == HttpStatus.HTTP_OK) {
                        zzmA().m9763g();
                    }
                    zzb("POST status", Integer.valueOf(responseCode));
                    if (a == null) {
                        return responseCode;
                    }
                    a.disconnect();
                    return responseCode;
                } catch (IOException e2) {
                    e = e2;
                    outputStream = outputStream2;
                    httpURLConnection = a;
                    try {
                        zzd("Network compressed POST connection error", e);
                        if (outputStream != null) {
                            try {
                                outputStream.close();
                            } catch (IOException e3) {
                                zze("Error closing http compressed post connection output stream", e3);
                            }
                        }
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        return 0;
                    } catch (Throwable th2) {
                        th = th2;
                        a = httpURLConnection;
                        if (outputStream != null) {
                            try {
                                outputStream.close();
                            } catch (IOException e4) {
                                zze("Error closing http compressed post connection output stream", e4);
                            }
                        }
                        if (a != null) {
                            a.disconnect();
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    outputStream = outputStream2;
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    if (a != null) {
                        a.disconnect();
                    }
                    throw th;
                }
            } catch (IOException e5) {
                e = e5;
                httpURLConnection = a;
                zzd("Network compressed POST connection error", e);
                if (outputStream != null) {
                    outputStream.close();
                }
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                return 0;
            } catch (Throwable th4) {
                th = th4;
                if (outputStream != null) {
                    outputStream.close();
                }
                if (a != null) {
                    a.disconnect();
                }
                throw th;
            }
        } catch (IOException e6) {
            e = e6;
            httpURLConnection = null;
            zzd("Network compressed POST connection error", e);
            if (outputStream != null) {
                outputStream.close();
            }
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
            return 0;
        } catch (Throwable th5) {
            th = th5;
            a = null;
            if (outputStream != null) {
                outputStream.close();
            }
            if (a != null) {
                a.disconnect();
            }
            throw th;
        }
    }

    /* renamed from: b */
    private URL m10066b(bns bns) {
        String valueOf;
        String valueOf2;
        if (bns.m10013f()) {
            valueOf = String.valueOf(zznT().m9949n());
            valueOf2 = String.valueOf(zznT().m9951p());
            valueOf = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
        } else {
            valueOf = String.valueOf(zznT().m9950o());
            valueOf2 = String.valueOf(zznT().m9951p());
            valueOf = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
        }
        try {
            return new URL(valueOf);
        } catch (MalformedURLException e) {
            zze("Error trying to parse the hardcoded host url", e);
            return null;
        }
    }

    /* renamed from: c */
    private String m10068c(bns bns) {
        return String.valueOf(bns.m10010c());
    }

    /* renamed from: c */
    private URL m10069c() {
        String valueOf = String.valueOf(zznT().m9949n());
        String valueOf2 = String.valueOf(zznT().m9952q());
        try {
            return new URL(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf));
        } catch (MalformedURLException e) {
            zze("Error trying to parse the hardcoded host url", e);
            return null;
        }
    }

    /* renamed from: a */
    String m10070a(bns bns, boolean z) {
        aoi.m4679a((Object) bns);
        StringBuilder stringBuilder = new StringBuilder();
        try {
            for (Entry entry : bns.m10009b().entrySet()) {
                String str = (String) entry.getKey();
                if (!("ht".equals(str) || "qt".equals(str) || "AppUID".equals(str) || "z".equals(str) || "_gmsv".equals(str))) {
                    m10060a(stringBuilder, str, (String) entry.getValue());
                }
            }
            m10060a(stringBuilder, "ht", String.valueOf(bns.m10011d()));
            m10060a(stringBuilder, "qt", String.valueOf(zznR().mo606a() - bns.m10011d()));
            if (z) {
                long g = bns.m10014g();
                m10060a(stringBuilder, "z", g != 0 ? String.valueOf(g) : m10068c(bns));
            }
            return stringBuilder.toString();
        } catch (UnsupportedEncodingException e) {
            zze("Failed to encode name or value", e);
            return null;
        }
    }

    /* renamed from: a */
    HttpURLConnection m10071a(URL url) throws IOException {
        URLConnection openConnection = url.openConnection();
        if (openConnection instanceof HttpURLConnection) {
            HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
            httpURLConnection.setDefaultUseCaches(false);
            httpURLConnection.setConnectTimeout(zznT().m9932A());
            httpURLConnection.setReadTimeout(zznT().m9933B());
            httpURLConnection.setInstanceFollowRedirects(false);
            httpURLConnection.setRequestProperty("User-Agent", this.f7199a);
            httpURLConnection.setDoInput(true);
            return httpURLConnection;
        }
        throw new IOException("Failed to obtain http connection");
    }

    /* renamed from: a */
    public List<Long> m10072a(List<bns> list) {
        boolean z;
        boolean z2 = true;
        zzmR();
        zzob();
        aoi.m4679a((Object) list);
        if (zznT().m9955t().isEmpty() || !this.f7200b.m10113a(zznT().m9948m() * 1000)) {
            z2 = false;
            z = false;
        } else {
            z = zznT().m9953r() != bnd.NONE;
            if (zznT().m9954s() != bnf.GZIP) {
                z2 = false;
            }
        }
        return z ? m10073a((List) list, z2) : m10075b((List) list);
    }

    /* renamed from: a */
    List<Long> m10073a(List<bns> list, boolean z) {
        aoi.m4688b(!list.isEmpty());
        zza("Uploading batched hits. compression, count", Boolean.valueOf(z), Integer.valueOf(list.size()));
        C1363a c1363a = new C1363a(this);
        List<Long> arrayList = new ArrayList();
        for (bns bns : list) {
            if (!c1363a.m10055a(bns)) {
                break;
            }
            arrayList.add(Long.valueOf(bns.m10010c()));
        }
        if (c1363a.m10054a() == 0) {
            return arrayList;
        }
        URL c = m10069c();
        if (c == null) {
            zzbT("Failed to build batching endpoint url");
            return Collections.emptyList();
        }
        int b = z ? m10065b(c, c1363a.m10056b()) : m10057a(c, c1363a.m10056b());
        if (HttpStatus.HTTP_OK == b) {
            zza("Batched upload completed. Hits batched", Integer.valueOf(c1363a.m10054a()));
            return arrayList;
        }
        zza("Network error uploading hits. status code", Integer.valueOf(b));
        if (zznT().m9955t().contains(Integer.valueOf(b))) {
            zzbS("Server instructed the client to stop batching");
            this.f7200b.m10112a();
        }
        return Collections.emptyList();
    }

    /* renamed from: a */
    public boolean m10074a() {
        NetworkInfo activeNetworkInfo;
        zzmR();
        zzob();
        try {
            activeNetworkInfo = ((ConnectivityManager) getContext().getSystemService("connectivity")).getActiveNetworkInfo();
        } catch (SecurityException e) {
            activeNetworkInfo = null;
        }
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            return true;
        }
        zzbP("No network connectivity");
        return false;
    }

    /* renamed from: b */
    List<Long> m10075b(List<bns> list) {
        List<Long> arrayList = new ArrayList(list.size());
        for (bns bns : list) {
            if (!m10062a(bns)) {
                break;
            }
            arrayList.add(Long.valueOf(bns.m10010c()));
            if (arrayList.size() >= zznT().m9946k()) {
                break;
            }
        }
        return arrayList;
    }

    protected void zzmS() {
        zza("Network initialized. User agent", this.f7199a);
    }
}
