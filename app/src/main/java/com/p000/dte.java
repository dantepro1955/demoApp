package com.p000;

import android.content.SharedPreferences;
import com.facebook.appevents.AppEventsConstants;
import com.under9.android.lib.network.model.Constants;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* compiled from: Tracker */
/* renamed from: dte */
public class dte {
    /* renamed from: m */
    private static final Pattern f16831m = Pattern.compile("^[0-9a-f]{16}$");
    /* renamed from: a */
    private final int f16832a;
    /* renamed from: b */
    private final URL f16833b;
    /* renamed from: c */
    private final dtb f16834c;
    /* renamed from: d */
    private String f16835d;
    /* renamed from: e */
    private String f16836e;
    /* renamed from: f */
    private long f16837f = 1800000;
    /* renamed from: g */
    private long f16838g;
    /* renamed from: h */
    private final Object f16839h = new Object();
    /* renamed from: i */
    private final dsz f16840i = new dsz();
    /* renamed from: j */
    private final dta f16841j;
    /* renamed from: k */
    private final Random f16842k = new Random(new Date().getTime());
    /* renamed from: l */
    private final dtd f16843l = new dtd();
    /* renamed from: n */
    private CountDownLatch f16844n = new CountDownLatch(0);

    protected dte(String str, int i, String str2, dtb dtb) throws MalformedURLException {
        if (str.endsWith("piwik.php") || str.endsWith("piwik-proxy.php")) {
            this.f16833b = new URL(str);
        } else {
            if (!str.endsWith(Constants.SEP)) {
                str = str + Constants.SEP;
            }
            this.f16833b = new URL(str + "piwik.php");
        }
        this.f16834c = dtb;
        this.f16832a = i;
        this.f16841j = new dta(this.f16834c, this.f16833b, str2);
        String string = m21088k().getString("tracker.userid", null);
        if (string == null) {
            string = UUID.randomUUID().toString();
            m21088k().edit().putString("tracker.userid", string).apply();
        }
        this.f16843l.a(dtc.USER_ID, string);
        this.f16843l.a(dtc.SESSION_START, "1");
        string = "unknown";
        if (dtg.a(this.f16834c.a()) != null) {
            string = String.format("%sx%s", new Object[]{Integer.valueOf(dtg.a(this.f16834c.a())[0]), Integer.valueOf(dtg.a(this.f16834c.a())[1])});
        }
        this.f16843l.a(dtc.SCREEN_RESOLUTION, string);
        this.f16843l.a(dtc.USER_AGENT, dtg.c());
        this.f16843l.a(dtc.LANGUAGE, dtg.a());
        this.f16843l.a(dtc.COUNTRY, dtg.b());
        this.f16843l.a(dtc.VISITOR_ID, dte.m21071j());
    }

    /* renamed from: c */
    public dtb m21081c() {
        return this.f16834c;
    }

    /* renamed from: d */
    protected URL m21082d() {
        return this.f16833b;
    }

    /* renamed from: e */
    protected int m21083e() {
        return this.f16832a;
    }

    /* renamed from: f */
    public dtd m21084f() {
        return this.f16843l;
    }

    /* renamed from: a */
    public void m21077a(int i) {
        synchronized (this.f16839h) {
            this.f16837f = (long) i;
        }
    }

    /* renamed from: a */
    protected boolean m21078a() {
        boolean z;
        synchronized (this.f16839h) {
            z = System.currentTimeMillis() - this.f16838g > this.f16837f;
            this.f16838g = System.currentTimeMillis();
        }
        return z;
    }

    /* renamed from: b */
    public boolean m21080b() {
        if (this.f16834c.b()) {
            return false;
        }
        this.f16841j.b();
        return true;
    }

    /* renamed from: a */
    public dte m21072a(long j) {
        this.f16841j.a(j);
        return this;
    }

    /* renamed from: a */
    public dte m21076a(String str) {
        this.f16843l.a(dtc.USER_ID, str);
        m21088k().edit().putString("tracker.userid", str).apply();
        return this;
    }

    /* renamed from: g */
    public String m21085g() {
        return this.f16843l.b(dtc.USER_ID);
    }

    /* renamed from: b */
    public dte m21079b(String str) throws IllegalArgumentException {
        if (m21070c(str)) {
            this.f16843l.a(dtc.VISITOR_ID, str);
        }
        return this;
    }

    /* renamed from: h */
    public String m21086h() {
        return this.f16843l.b(dtc.VISITOR_ID);
    }

    /* renamed from: c */
    private boolean m21070c(String str) throws IllegalArgumentException {
        if (f16831m.matcher(str).matches()) {
            return true;
        }
        throw new IllegalArgumentException("VisitorId: " + str + " is not of valid format, " + " the format must match the regular expression: " + f16831m.pattern());
    }

    /* renamed from: i */
    protected String m21087i() {
        return this.f16836e != null ? this.f16836e : this.f16834c.d();
    }

    /* renamed from: a */
    public dte m21074a(dtd dtd, String str) {
        return m21075a(dtd, str, null);
    }

    /* renamed from: a */
    public dte m21075a(dtd dtd, String str, String str2) {
        if (str == null) {
            return this;
        }
        dtd.a(dtc.URL_PATH, str);
        dtd.a(dtc.ACTION_NAME, str2);
        return m21073a(dtd);
    }

    /* renamed from: b */
    private void m21068b(dtd dtd) {
        int i;
        long j;
        synchronized (m21088k()) {
            i = m21088k().getInt("tracker.visitcount", 0) + 1;
            m21088k().edit().putInt("tracker.visitcount", i).apply();
        }
        synchronized (m21088k()) {
            j = m21088k().getLong("tracker.firstvisit", -1);
            if (j == -1) {
                j = System.currentTimeMillis() / 1000;
                m21088k().edit().putLong("tracker.firstvisit", j).apply();
            }
        }
        synchronized (m21088k()) {
            long j2 = m21088k().getLong("tracker.previousvisit", -1);
            m21088k().edit().putLong("tracker.previousvisit", System.currentTimeMillis() / 1000).apply();
        }
        this.f16843l.a(dtc.FIRST_VISIT_TIMESTAMP, j);
        this.f16843l.a(dtc.TOTAL_NUMBER_OF_VISITS, i);
        if (j2 != -1) {
            this.f16843l.a(dtc.PREVIOUS_VISIT_TIMESTAMP, j2);
        }
        dtd.b(dtc.SESSION_START, this.f16843l.b(dtc.SESSION_START));
        dtd.b(dtc.SCREEN_RESOLUTION, this.f16843l.b(dtc.SCREEN_RESOLUTION));
        dtd.b(dtc.USER_AGENT, this.f16843l.b(dtc.USER_AGENT));
        dtd.b(dtc.LANGUAGE, this.f16843l.b(dtc.LANGUAGE));
        dtd.b(dtc.COUNTRY, this.f16843l.b(dtc.COUNTRY));
        dtd.b(dtc.FIRST_VISIT_TIMESTAMP, this.f16843l.b(dtc.FIRST_VISIT_TIMESTAMP));
        dtd.b(dtc.TOTAL_NUMBER_OF_VISITS, this.f16843l.b(dtc.TOTAL_NUMBER_OF_VISITS));
        dtd.b(dtc.PREVIOUS_VISIT_TIMESTAMP, this.f16843l.b(dtc.PREVIOUS_VISIT_TIMESTAMP));
    }

    /* renamed from: c */
    private void m21069c(dtd dtd) {
        dtd.a(dtc.SITE_ID, this.f16832a);
        dtd.b(dtc.RECORD, "1");
        dtd.b(dtc.API_VERSION, "1");
        dtd.a(dtc.RANDOM_NUMBER, this.f16842k.nextInt(100000));
        dtd.b(dtc.DATETIME_OF_REQUEST, new SimpleDateFormat("yyyy-MM-dd HH:mm:ssZ").format(new Date()));
        dtd.b(dtc.SEND_IMAGE, AppEventsConstants.EVENT_PARAM_VALUE_NO);
        dtd.b(dtc.VISITOR_ID, this.f16843l.b(dtc.VISITOR_ID));
        dtd.b(dtc.USER_ID, this.f16843l.b(dtc.USER_ID));
        dtd.b(dtc.VISIT_SCOPE_CUSTOM_VARIABLES, this.f16840i.toString());
        String b = dtd.b(dtc.URL_PATH);
        if (b == null) {
            b = m21089l() + Constants.SEP;
        } else if (b.startsWith(Constants.SEP)) {
            b = m21089l() + b;
        } else if (!(b.startsWith("http://") || b.startsWith("https://") || b.startsWith("ftp://") || b.startsWith(Constants.SEP))) {
            b = m21089l() + Constants.SEP + b;
        }
        dtd.a(dtc.URL_PATH, b);
    }

    /* renamed from: a */
    public dte m21073a(dtd dtd) {
        synchronized (this.f16839h) {
            boolean a = m21078a();
            if (a) {
                this.f16844n = new CountDownLatch(1);
            }
        }
        if (a) {
            m21068b(dtd);
        } else {
            try {
                this.f16844n.await((long) this.f16841j.a(), TimeUnit.MILLISECONDS);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        m21069c(dtd);
        String a2 = dtd.a();
        if (this.f16834c.b()) {
            this.f16835d = a2;
            dth.a("PIWIK:Tracker", String.format("URL omitted due to opt out: %s", new Object[]{a2}));
        } else {
            dth.a("PIWIK:Tracker", String.format("URL added to the queue: %s", new Object[]{a2}));
            this.f16841j.a(a2);
        }
        if (a) {
            this.f16844n.countDown();
        }
        return this;
    }

    /* renamed from: j */
    public static String m21071j() {
        return UUID.randomUUID().toString().replaceAll("-", "").substring(0, 16);
    }

    /* renamed from: k */
    public SharedPreferences m21088k() {
        return this.f16834c.e();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        dte dte = (dte) obj;
        if (this.f16832a == dte.f16832a && this.f16833b.equals(dte.f16833b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f16832a * 31) + this.f16833b.hashCode();
    }

    /* renamed from: l */
    protected String m21089l() {
        return String.format("http://%s", new Object[]{m21087i()});
    }
}
