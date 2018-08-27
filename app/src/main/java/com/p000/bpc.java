package com.p000;

import com.facebook.stetho.server.http.HttpHeaders;
import com.mopub.volley.toolbox.HttpClientStack.HttpPatch;
import java.io.IOException;
import java.net.URI;
import java.util.Map;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpEntityEnclosingRequestBase;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpHead;
import org.apache.http.client.methods.HttpOptions;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.methods.HttpTrace;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;

/* renamed from: bpc */
public class bpc implements bpe {
    /* renamed from: a */
    protected final HttpClient f7340a;

    /* renamed from: bpc$a */
    public static final class C1389a extends HttpEntityEnclosingRequestBase {
        public C1389a(String str) {
            setURI(URI.create(str));
        }

        public String getMethod() {
            return HttpPatch.METHOD_NAME;
        }
    }

    public bpc(HttpClient httpClient) {
        this.f7340a = httpClient;
    }

    /* renamed from: a */
    private static void m10251a(HttpEntityEnclosingRequestBase httpEntityEnclosingRequestBase, bfx<?> bfx) throws ard {
        byte[] k = bfx.mo1284k();
        if (k != null) {
            httpEntityEnclosingRequestBase.setEntity(new ByteArrayEntity(k));
        }
    }

    /* renamed from: a */
    private static void m10252a(HttpUriRequest httpUriRequest, Map<String, String> map) {
        for (String str : map.keySet()) {
            httpUriRequest.setHeader(str, (String) map.get(str));
        }
    }

    /* renamed from: b */
    static HttpUriRequest m10253b(bfx<?> bfx, Map<String, String> map) throws ard {
        HttpEntityEnclosingRequestBase httpPost;
        switch (bfx.m5534a()) {
            case -1:
                byte[] h = bfx.m5552h();
                if (h == null) {
                    return new HttpGet(bfx.m5546c());
                }
                HttpUriRequest httpPost2 = new HttpPost(bfx.m5546c());
                httpPost2.addHeader(HttpHeaders.CONTENT_TYPE, bfx.m5551g());
                httpPost2.setEntity(new ByteArrayEntity(h));
                return httpPost2;
            case 0:
                return new HttpGet(bfx.m5546c());
            case 1:
                httpPost = new HttpPost(bfx.m5546c());
                httpPost.addHeader(HttpHeaders.CONTENT_TYPE, bfx.m5554j());
                bpc.m10251a(httpPost, (bfx) bfx);
                return httpPost;
            case 2:
                httpPost = new HttpPut(bfx.m5546c());
                httpPost.addHeader(HttpHeaders.CONTENT_TYPE, bfx.m5554j());
                bpc.m10251a(httpPost, (bfx) bfx);
                return httpPost;
            case 3:
                return new HttpDelete(bfx.m5546c());
            case 4:
                return new HttpHead(bfx.m5546c());
            case 5:
                return new HttpOptions(bfx.m5546c());
            case 6:
                return new HttpTrace(bfx.m5546c());
            case 7:
                httpPost = new C1389a(bfx.m5546c());
                httpPost.addHeader(HttpHeaders.CONTENT_TYPE, bfx.m5554j());
                bpc.m10251a(httpPost, (bfx) bfx);
                return httpPost;
            default:
                throw new IllegalStateException("Unknown request method.");
        }
    }

    /* renamed from: a */
    public HttpResponse mo619a(bfx<?> bfx, Map<String, String> map) throws IOException, ard {
        HttpUriRequest b = bpc.m10253b(bfx, map);
        bpc.m10252a(b, (Map) map);
        bpc.m10252a(b, bfx.mo1283f());
        HttpParams params = b.getParams();
        int n = bfx.m5558n();
        HttpConnectionParams.setConnectionTimeout(params, 5000);
        HttpConnectionParams.setSoTimeout(params, n);
        return this.f7340a.execute(b);
    }
}
