package com.p000;

import com.facebook.appevents.AppEventsConstants;
import com.under9.android.lib.network.model.Constants;
import java.net.MalformedURLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* compiled from: Under9PiwikTracker */
/* renamed from: diw */
class diw extends dte {
    /* renamed from: a */
    private String f21795a;
    /* renamed from: b */
    private long f21796b = 1800000;
    /* renamed from: c */
    private long f21797c;
    /* renamed from: d */
    private final Object f21798d = new Object();
    /* renamed from: e */
    private final dsz f21799e = new dsz();
    /* renamed from: f */
    private final dta f21800f;
    /* renamed from: g */
    private final Random f21801g = new Random(new Date().getTime());
    /* renamed from: h */
    private CountDownLatch f21802h = new CountDownLatch(0);

    public diw(String str, int i, String str2, dtb dtb) throws MalformedURLException {
        super(str, i, null, dtb);
        this.f21800f = new div(c(), d(), str2);
    }

    /* renamed from: a */
    public void m27540a(int i) {
        synchronized (this.f21798d) {
            this.f21796b = (long) i;
        }
    }

    /* renamed from: a */
    protected boolean m27541a() {
        boolean z;
        synchronized (this.f21798d) {
            z = System.currentTimeMillis() - this.f21797c > this.f21796b;
            this.f21797c = System.currentTimeMillis();
        }
        return z;
    }

    /* renamed from: b */
    public boolean m27542b() {
        if (c().m29231b()) {
            return false;
        }
        this.f21800f.mo4420b();
        return true;
    }

    /* renamed from: a */
    public dte m27538a(long j) {
        this.f21800f.mo4418a(j);
        return this;
    }

    /* renamed from: b */
    private void m27536b(dtd dtd) {
        int i;
        long j;
        synchronized (k()) {
            i = k().getInt("tracker.visitcount", 0) + 1;
            k().edit().putInt("tracker.visitcount", i).apply();
        }
        synchronized (k()) {
            j = k().getLong("tracker.firstvisit", -1);
            if (j == -1) {
                j = System.currentTimeMillis() / 1000;
                k().edit().putLong("tracker.firstvisit", j).apply();
            }
        }
        synchronized (k()) {
            long j2 = k().getLong("tracker.previousvisit", -1);
            k().edit().putLong("tracker.previousvisit", System.currentTimeMillis() / 1000).apply();
        }
        dtd f = f();
        f.m29238a(dtc.FIRST_VISIT_TIMESTAMP, j);
        f.m29237a(dtc.TOTAL_NUMBER_OF_VISITS, i);
        if (j2 != -1) {
            f.m29238a(dtc.PREVIOUS_VISIT_TIMESTAMP, j2);
        }
        dtd.m29242b(dtc.SESSION_START, f.m29243b(dtc.SESSION_START));
        dtd.m29242b(dtc.SCREEN_RESOLUTION, f.m29243b(dtc.SCREEN_RESOLUTION));
        dtd.m29242b(dtc.USER_AGENT, f.m29243b(dtc.USER_AGENT));
        dtd.m29242b(dtc.LANGUAGE, f.m29243b(dtc.LANGUAGE));
        dtd.m29242b(dtc.COUNTRY, f.m29243b(dtc.COUNTRY));
        dtd.m29242b(dtc.FIRST_VISIT_TIMESTAMP, f.m29243b(dtc.FIRST_VISIT_TIMESTAMP));
        dtd.m29242b(dtc.TOTAL_NUMBER_OF_VISITS, f.m29243b(dtc.TOTAL_NUMBER_OF_VISITS));
        dtd.m29242b(dtc.PREVIOUS_VISIT_TIMESTAMP, f.m29243b(dtc.PREVIOUS_VISIT_TIMESTAMP));
    }

    /* renamed from: c */
    private void m27537c(dtd dtd) {
        dtd f = f();
        dtd.m29237a(dtc.SITE_ID, e());
        dtd.m29242b(dtc.RECORD, "1");
        dtd.m29242b(dtc.API_VERSION, "1");
        dtd.m29237a(dtc.RANDOM_NUMBER, this.f21801g.nextInt(100000));
        dtd.m29242b(dtc.DATETIME_OF_REQUEST, new SimpleDateFormat("yyyy-MM-dd HH:mm:ssZ").format(new Date()));
        dtd.m29242b(dtc.SEND_IMAGE, AppEventsConstants.EVENT_PARAM_VALUE_NO);
        dtd.m29242b(dtc.VISITOR_ID, f.m29243b(dtc.VISITOR_ID));
        dtd.m29242b(dtc.USER_ID, f.m29243b(dtc.USER_ID));
        dtd.m29242b(dtc.VISIT_SCOPE_CUSTOM_VARIABLES, this.f21799e.toString());
        String b = dtd.m29243b(dtc.URL_PATH);
        if (b == null) {
            b = l() + Constants.SEP;
        } else if (b.startsWith(Constants.SEP)) {
            b = l() + b;
        } else if (!(b.startsWith("http://") || b.startsWith("https://") || b.startsWith("ftp://") || b.startsWith(Constants.SEP))) {
            b = l() + Constants.SEP + b;
        }
        dtd.m29239a(dtc.URL_PATH, b);
    }

    /* renamed from: a */
    public dte m27539a(dtd dtd) {
        synchronized (this.f21798d) {
            boolean a = m27541a();
            if (a) {
                this.f21802h = new CountDownLatch(1);
            }
        }
        if (a) {
            m27536b(dtd);
        } else {
            try {
                this.f21802h.await((long) this.f21800f.mo4417a(), TimeUnit.MILLISECONDS);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        m27537c(dtd);
        String a2 = dtd.m29240a();
        if (c().m29231b()) {
            this.f21795a = a2;
            dth.m29259a("PIWIK:Tracker", String.format("URL omitted due to opt out: %s", new Object[]{a2}));
        } else {
            dth.m29259a("PIWIK:Tracker", String.format("URL added to the queue: %s", new Object[]{a2}));
            this.f21800f.mo4419a(a2);
        }
        if (a) {
            this.f21802h.countDown();
        }
        return this;
    }
}
