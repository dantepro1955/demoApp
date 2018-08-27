package com.p000;

import android.os.Process;
import com.facebook.stetho.common.Utf8Charset;
import com.facebook.stetho.server.http.HttpHeaders;
import com.facebook.stetho.server.http.HttpStatus;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import org.apache.http.HttpEntity;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicHeader;
import org.apache.http.params.HttpConnectionParams;
import org.json.JSONObject;
import p000.dtf.C5079a;

/* compiled from: Dispatcher */
/* renamed from: dta */
public class dta {
    /* renamed from: a */
    private final BlockingQueue<String> f21773a = new LinkedBlockingQueue();
    /* renamed from: b */
    private final Object f21774b = new Object();
    /* renamed from: c */
    private final Semaphore f21775c = new Semaphore(0);
    /* renamed from: d */
    private final dtb f21776d;
    /* renamed from: e */
    private final URL f21777e;
    /* renamed from: f */
    private final String f21778f;
    /* renamed from: g */
    private List<HttpRequestBase> f21779g = Collections.synchronizedList(new ArrayList());
    /* renamed from: h */
    private volatile int f21780h = 5000;
    /* renamed from: i */
    private volatile boolean f21781i = false;
    /* renamed from: j */
    private volatile long f21782j = 120000;
    /* renamed from: k */
    private Runnable f21783k = new C50771(this);

    /* compiled from: Dispatcher */
    /* renamed from: dta$1 */
    class C50771 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ dta f22872a;

        C50771(dta dta) {
            this.f22872a = dta;
        }

        public void run() {
            Process.setThreadPriority(10);
            while (this.f22872a.f21781i) {
                try {
                    this.f22872a.f21775c.tryAcquire(this.f22872a.f21782j, TimeUnit.MILLISECONDS);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                List arrayList = new ArrayList();
                this.f22872a.f21773a.drainTo(arrayList);
                dth.m29259a("PIWIK:Dispatcher", "Drained " + arrayList.size() + " events.");
                dtf dtf = new dtf(this.f22872a.f21777e, arrayList, this.f22872a.f21778f);
                Iterator a = dtf.m29251a();
                int i = 0;
                while (a.hasNext()) {
                    int a2;
                    C5079a c5079a = (C5079a) a.next();
                    if (c5079a.m29245a() > 1) {
                        if (this.f22872a.m27503a(dtf.m29254b(), dtf.m29252a(c5079a))) {
                            a2 = i + c5079a.m29245a();
                        }
                        a2 = i;
                    } else {
                        if (this.f22872a.m27509c(dtf.m29253b(c5079a))) {
                            a2 = i + 1;
                        }
                        a2 = i;
                    }
                    i = a2;
                }
                dth.m29259a("PIWIK:Dispatcher", "Dispatched " + i + " events.");
                synchronized (this.f22872a.f21774b) {
                    if (this.f22872a.f21773a.isEmpty() || this.f22872a.f21782j < 0) {
                        this.f22872a.f21781i = false;
                        return;
                    }
                }
            }
        }
    }

    public dta(dtb dtb, URL url, String str) {
        this.f21776d = dtb;
        this.f21777e = url;
        this.f21778f = str;
    }

    /* renamed from: a */
    public int mo4417a() {
        return this.f21780h;
    }

    /* renamed from: a */
    public void mo4418a(long j) {
        this.f21782j = j;
        if (this.f21782j != -1) {
            m27508c();
        }
    }

    /* renamed from: c */
    private boolean m27508c() {
        synchronized (this.f21774b) {
            if (this.f21781i) {
                return false;
            }
            this.f21781i = true;
            new Thread(this.f21783k).start();
            return true;
        }
    }

    /* renamed from: b */
    public void mo4420b() {
        if (!m27508c()) {
            this.f21775c.release();
        }
    }

    /* renamed from: a */
    public void mo4419a(String str) {
        this.f21773a.add(str);
        if (this.f21782j != -1) {
            m27508c();
        }
    }

    /* renamed from: c */
    private boolean m27509c(String str) {
        if (str == null) {
            return false;
        }
        return m27504a(new HttpGet(str));
    }

    /* renamed from: a */
    private boolean m27503a(URL url, JSONObject jSONObject) {
        boolean z = false;
        if (!(url == null || jSONObject == null)) {
            String jSONObject2 = jSONObject.toString();
            try {
                HttpRequestBase httpPost = new HttpPost(url.toURI());
                HttpEntity stringEntity = new StringEntity(jSONObject2);
                stringEntity.setContentType(new BasicHeader(HttpHeaders.CONTENT_TYPE, "application/json"));
                httpPost.setEntity(stringEntity);
                z = m27504a(httpPost);
            } catch (Throwable e) {
                dth.m29260a("PIWIK:Dispatcher", String.format("URI Syntax Error %s", new Object[]{url.toString()}), e);
            } catch (Throwable e2) {
                dth.m29260a("PIWIK:Dispatcher", String.format("Unsupported Encoding %s", new Object[]{jSONObject2}), e2);
            }
        }
        return z;
    }

    /* renamed from: a */
    private boolean m27504a(HttpRequestBase httpRequestBase) {
        HttpClient defaultHttpClient = new DefaultHttpClient();
        HttpConnectionParams.setConnectionTimeout(defaultHttpClient.getParams(), this.f21780h);
        if (this.f21776d.m29232c()) {
            dth.m29259a("PIWIK:Dispatcher", "DryRun, stored HttpRequest, now " + this.f21779g.size());
            this.f21779g.add(httpRequestBase);
            return false;
        }
        if (!this.f21779g.isEmpty()) {
            this.f21779g.clear();
        }
        try {
            int statusCode = defaultHttpClient.execute(httpRequestBase).getStatusLine().getStatusCode();
            dth.m29259a("PIWIK:Dispatcher", String.format("status code %s", new Object[]{Integer.valueOf(statusCode)}));
            if (statusCode == 204 || statusCode == HttpStatus.HTTP_OK) {
                return true;
            }
            return false;
        } catch (Throwable e) {
            dth.m29260a("PIWIK:Dispatcher", "Cannot send request", e);
            return false;
        }
    }

    /* renamed from: b */
    public static String m27506b(String str) {
        try {
            return URLEncoder.encode(str, Utf8Charset.NAME).replaceAll("\\+", "%20");
        } catch (Throwable e) {
            dth.m29260a("PIWIK:Dispatcher", String.format("Cannot encode %s", new Object[]{str}), e);
            return "";
        } catch (NullPointerException e2) {
            return "";
        }
    }

    /* renamed from: a */
    public static String m27498a(Map<String, String> map) {
        StringBuilder stringBuilder = new StringBuilder(100);
        stringBuilder.append('?');
        for (Entry entry : map.entrySet()) {
            stringBuilder.append(dta.m27506b((String) entry.getKey()));
            stringBuilder.append('=');
            stringBuilder.append(dta.m27506b((String) entry.getValue()));
            stringBuilder.append('&');
        }
        return stringBuilder.substring(0, stringBuilder.length() - 1);
    }
}
