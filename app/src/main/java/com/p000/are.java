package com.p000;

import com.facebook.stetho.server.http.HttpHeaders;
import com.facebook.stetho.server.http.HttpStatus;
import com.mopub.volley.toolbox.HttpClientStack.HttpPatch;
import com.ninegag.android.tv.model.PostDao;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.ProtocolVersion;
import org.apache.http.StatusLine;
import org.apache.http.entity.BasicHttpEntity;
import org.apache.http.message.BasicHeader;
import org.apache.http.message.BasicHttpResponse;
import org.apache.http.message.BasicStatusLine;

/* renamed from: are */
public class are implements bpe {
    /* renamed from: a */
    private final C0720a f4015a;
    /* renamed from: b */
    private final SSLSocketFactory f4016b;

    /* renamed from: are$a */
    public interface C0720a {
        /* renamed from: a */
        String m5064a(String str);
    }

    public are() {
        this(null);
    }

    public are(C0720a c0720a) {
        this(c0720a, null);
    }

    public are(C0720a c0720a, SSLSocketFactory sSLSocketFactory) {
        this.f4015a = c0720a;
        this.f4016b = sSLSocketFactory;
    }

    /* renamed from: a */
    private HttpURLConnection m5066a(URL url, bfx<?> bfx) throws IOException {
        HttpURLConnection a = m5071a(url);
        int n = bfx.m5558n();
        a.setConnectTimeout(n);
        a.setReadTimeout(n);
        a.setUseCaches(false);
        a.setDoInput(true);
        if ("https".equals(url.getProtocol()) && this.f4016b != null) {
            ((HttpsURLConnection) a).setSSLSocketFactory(this.f4016b);
        }
        return a;
    }

    /* renamed from: a */
    private static HttpEntity m5067a(HttpURLConnection httpURLConnection) {
        InputStream inputStream;
        HttpEntity basicHttpEntity = new BasicHttpEntity();
        try {
            inputStream = httpURLConnection.getInputStream();
        } catch (IOException e) {
            inputStream = httpURLConnection.getErrorStream();
        }
        basicHttpEntity.setContent(inputStream);
        basicHttpEntity.setContentLength((long) httpURLConnection.getContentLength());
        basicHttpEntity.setContentEncoding(httpURLConnection.getContentEncoding());
        basicHttpEntity.setContentType(httpURLConnection.getContentType());
        return basicHttpEntity;
    }

    /* renamed from: a */
    static void m5068a(HttpURLConnection httpURLConnection, bfx<?> bfx) throws IOException, ard {
        switch (bfx.m5534a()) {
            case -1:
                byte[] h = bfx.m5552h();
                if (h != null) {
                    httpURLConnection.setDoOutput(true);
                    httpURLConnection.setRequestMethod(PostDao.TABLENAME);
                    httpURLConnection.addRequestProperty(HttpHeaders.CONTENT_TYPE, bfx.m5551g());
                    DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
                    dataOutputStream.write(h);
                    dataOutputStream.close();
                    return;
                }
                return;
            case 0:
                httpURLConnection.setRequestMethod("GET");
                return;
            case 1:
                httpURLConnection.setRequestMethod(PostDao.TABLENAME);
                are.m5070b(httpURLConnection, bfx);
                return;
            case 2:
                httpURLConnection.setRequestMethod("PUT");
                are.m5070b(httpURLConnection, bfx);
                return;
            case 3:
                httpURLConnection.setRequestMethod("DELETE");
                return;
            case 4:
                httpURLConnection.setRequestMethod("HEAD");
                return;
            case 5:
                httpURLConnection.setRequestMethod("OPTIONS");
                return;
            case 6:
                httpURLConnection.setRequestMethod("TRACE");
                return;
            case 7:
                httpURLConnection.setRequestMethod(HttpPatch.METHOD_NAME);
                are.m5070b(httpURLConnection, bfx);
                return;
            default:
                throw new IllegalStateException("Unknown method type.");
        }
    }

    /* renamed from: a */
    private static boolean m5069a(int i, int i2) {
        return (i == 4 || ((100 <= i2 && i2 < HttpStatus.HTTP_OK) || i2 == 204 || i2 == 304)) ? false : true;
    }

    /* renamed from: b */
    private static void m5070b(HttpURLConnection httpURLConnection, bfx<?> bfx) throws IOException, ard {
        byte[] k = bfx.mo1284k();
        if (k != null) {
            httpURLConnection.setDoOutput(true);
            httpURLConnection.addRequestProperty(HttpHeaders.CONTENT_TYPE, bfx.m5554j());
            DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
            dataOutputStream.write(k);
            dataOutputStream.close();
        }
    }

    /* renamed from: a */
    protected HttpURLConnection m5071a(URL url) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setInstanceFollowRedirects(HttpURLConnection.getFollowRedirects());
        return httpURLConnection;
    }

    /* renamed from: a */
    public HttpResponse mo619a(bfx<?> bfx, Map<String, String> map) throws IOException, ard {
        String a;
        String c = bfx.m5546c();
        HashMap hashMap = new HashMap();
        hashMap.putAll(bfx.mo1283f());
        hashMap.putAll(map);
        if (this.f4015a != null) {
            a = this.f4015a.m5064a(c);
            if (a == null) {
                throw new IOException("URL blocked by rewriter: " + c);
            }
        }
        a = c;
        HttpURLConnection a2 = m5066a(new URL(a), (bfx) bfx);
        for (String a3 : hashMap.keySet()) {
            a2.addRequestProperty(a3, (String) hashMap.get(a3));
        }
        are.m5068a(a2, (bfx) bfx);
        ProtocolVersion protocolVersion = new ProtocolVersion("HTTP", 1, 1);
        if (a2.getResponseCode() == -1) {
            throw new IOException("Could not retrieve response code from HttpUrlConnection.");
        }
        StatusLine basicStatusLine = new BasicStatusLine(protocolVersion, a2.getResponseCode(), a2.getResponseMessage());
        HttpResponse basicHttpResponse = new BasicHttpResponse(basicStatusLine);
        if (are.m5069a(bfx.m5534a(), basicStatusLine.getStatusCode())) {
            basicHttpResponse.setEntity(are.m5067a(a2));
        }
        for (Entry entry : a2.getHeaderFields().entrySet()) {
            if (entry.getKey() != null) {
                basicHttpResponse.addHeader(new BasicHeader((String) entry.getKey(), (String) ((List) entry.getValue()).get(0)));
            }
        }
        return basicHttpResponse;
    }
}
