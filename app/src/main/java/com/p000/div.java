package com.p000;

import android.os.Process;
import com.facebook.stetho.server.http.HttpHeaders;
import com.facebook.stetho.server.http.HttpStatus;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
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

/* compiled from: Under9PiwikDispatcher */
/* renamed from: div */
class div extends dta {
    /* renamed from: a */
    private final BlockingQueue<String> f21784a = new LinkedBlockingQueue();
    /* renamed from: b */
    private final Object f21785b = new Object();
    /* renamed from: c */
    private final Semaphore f21786c = new Semaphore(0);
    /* renamed from: d */
    private final dtb f21787d;
    /* renamed from: e */
    private final URL f21788e;
    /* renamed from: f */
    private final String f21789f;
    /* renamed from: g */
    private List<HttpRequestBase> f21790g = Collections.synchronizedList(new ArrayList());
    /* renamed from: h */
    private volatile int f21791h = 5000;
    /* renamed from: i */
    private volatile boolean f21792i = false;
    /* renamed from: j */
    private volatile long f21793j = 120000;
    /* renamed from: k */
    private Runnable f21794k = new C49361(this);

    /* compiled from: Under9PiwikDispatcher */
    /* renamed from: div$1 */
    class C49361 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ div f21772a;

        C49361(div div) {
            this.f21772a = div;
        }

        public void run() {
            Process.setThreadPriority(10);
            while (this.f21772a.f21792i) {
                try {
                    this.f21772a.f21786c.tryAcquire(this.f21772a.f21793j, TimeUnit.MILLISECONDS);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                List arrayList = new ArrayList();
                this.f21772a.f21784a.drainTo(arrayList);
                dth.m29259a("PIWIK:Dispatcher", "Drained " + arrayList.size() + " events.");
                dtf dtf = new dtf(this.f21772a.f21788e, arrayList, this.f21772a.f21789f);
                Iterator a = dtf.m29251a();
                int i = 0;
                while (a.hasNext()) {
                    int a2;
                    C5079a c5079a = (C5079a) a.next();
                    if (c5079a.m29245a() > 1) {
                        if (this.f21772a.m27522a(dtf.m29254b(), dtf.m29252a(c5079a))) {
                            a2 = i + c5079a.m29245a();
                        }
                        a2 = i;
                    } else {
                        if (this.f21772a.m27527c(dtf.m29253b(c5079a))) {
                            a2 = i + 1;
                        }
                        a2 = i;
                    }
                    i = a2;
                }
                dth.m29259a("PIWIK:Dispatcher", "Dispatched " + i + " events.");
                synchronized (this.f21772a.f21785b) {
                    if (this.f21772a.f21784a.isEmpty() || this.f21772a.f21793j < 0) {
                        this.f21772a.f21792i = false;
                        return;
                    }
                }
            }
        }
    }

    public div(dtb dtb, URL url, String str) {
        super(dtb, url, str);
        this.f21787d = dtb;
        this.f21788e = url;
        this.f21789f = str;
    }

    /* renamed from: a */
    public int mo4417a() {
        return this.f21791h;
    }

    /* renamed from: a */
    public void mo4418a(long j) {
        this.f21793j = j;
        if (this.f21793j != -1) {
            m27526c();
        }
    }

    /* renamed from: c */
    private boolean m27526c() {
        synchronized (this.f21785b) {
            if (this.f21792i) {
                return false;
            }
            this.f21792i = true;
            new Thread(this.f21794k).start();
            return true;
        }
    }

    /* renamed from: b */
    public void mo4420b() {
        if (!m27526c()) {
            this.f21786c.release();
        }
    }

    /* renamed from: a */
    public void mo4419a(String str) {
        this.f21784a.add(str);
        if (this.f21793j != -1) {
            m27526c();
        }
    }

    /* renamed from: c */
    private boolean m27527c(String str) {
        if (str == null) {
            return false;
        }
        return m27523a(new HttpGet(str));
    }

    /* renamed from: a */
    private boolean m27522a(URL url, JSONObject jSONObject) {
        boolean z = false;
        if (!(url == null || jSONObject == null)) {
            String jSONObject2 = jSONObject.toString();
            try {
                HttpRequestBase httpPost = new HttpPost(url.toURI());
                HttpEntity stringEntity = new StringEntity(jSONObject2);
                stringEntity.setContentType(new BasicHeader(HttpHeaders.CONTENT_TYPE, "application/json"));
                httpPost.setEntity(stringEntity);
                z = m27523a(httpPost);
            } catch (Throwable e) {
                dth.m29260a("PIWIK:Dispatcher", String.format("URI Syntax Error %s", new Object[]{url.toString()}), e);
            } catch (Throwable e2) {
                dth.m29260a("PIWIK:Dispatcher", String.format("Unsupported Encoding %s", new Object[]{jSONObject2}), e2);
            }
        }
        return z;
    }

    /* renamed from: a */
    private boolean m27523a(HttpRequestBase httpRequestBase) {
        httpRequestBase.setHeader("X-RequestTimestamp", String.valueOf(System.currentTimeMillis() / 1000));
        HttpClient defaultHttpClient = new DefaultHttpClient();
        HttpConnectionParams.setConnectionTimeout(defaultHttpClient.getParams(), this.f21791h);
        if (this.f21787d.m29232c()) {
            dth.m29259a("PIWIK:Dispatcher", "DryRun, stored HttpRequest, now " + this.f21790g.size());
            this.f21790g.add(httpRequestBase);
            return false;
        }
        if (!this.f21790g.isEmpty()) {
            this.f21790g.clear();
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
}
