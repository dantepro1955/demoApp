package com.p000;

import android.content.Context;
import android.text.TextUtils;
import com.under9.android.remoteconfig.api.model.ApiAppLink;
import com.under9.android.remoteconfig.api.model.ApiBroadcast;
import com.under9.android.remoteconfig.api.model.ApiBroadcastInfo;
import com.under9.android.remoteconfig.api.model.ApiConfigResponse;
import com.under9.android.remoteconfig.api.model.ApiConfigs;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: RemoteConfigModule */
/* renamed from: dmj */
public class dmj {
    /* renamed from: a */
    public Context f22212a;
    /* renamed from: b */
    private dml f22213b;
    /* renamed from: c */
    private dmo f22214c;
    /* renamed from: d */
    private dmp f22215d;
    /* renamed from: e */
    private dmn f22216e;
    /* renamed from: f */
    private String f22217f;
    /* renamed from: g */
    private String f22218g;
    /* renamed from: h */
    private long f22219h;
    /* renamed from: i */
    private long f22220i;
    /* renamed from: j */
    private long f22221j;
    /* renamed from: k */
    private long f22222k;
    /* renamed from: l */
    private boolean f22223l;
    /* renamed from: m */
    private djt f22224m;

    public dmj(Context context, dml dml, dmo dmo) {
        this(context, dml, dmo, false);
    }

    public dmj(Context context, dml dml, dmo dmo, boolean z) {
        this.f22212a = context;
        this.f22213b = dml;
        this.f22214c = dmo;
        this.f22224m = new djt(context);
        this.f22223l = z;
        ApiConfigResponse a = dna.m28174a(m28022f());
        ApiConfigs apiConfigs = null;
        if (!(a == null || a.payload == null)) {
            apiConfigs = a.payload.configs;
        }
        this.f22214c.m28073a(apiConfigs);
        this.f22215d = new dmp();
        this.f22215d.m28081a(m28026i(), m28027j());
        this.f22216e = new dmn();
        this.f22216e.m28066a(m28028k());
    }

    /* renamed from: a */
    public void m28009a(String str, String str2) {
        this.f22217f = str;
        this.f22218g = str2;
    }

    /* renamed from: b */
    public dml m28011b() {
        return this.f22213b;
    }

    /* renamed from: a */
    public boolean m28010a(boolean z) {
        if (!z && djw.m27633a(this.f22219h) < this.f22213b.m28042h()) {
            return false;
        }
        this.f22219h = djw.m27632a();
        try {
            String a = dmk.m28030a(this, this.f22217f, this.f22218g);
            ApiConfigResponse a2 = dna.m28174a(a);
            ApiConfigs apiConfigs = a2.payload.configs;
            String str = a2.payload.country;
            boolean b = this.f22214c.m28077b(apiConfigs);
            m28012b(a);
            m28015c(str);
            return b;
        } catch (Exception e) {
            return false;
        }
    }

    /* renamed from: b */
    public boolean m28013b(boolean z) {
        if (!z && djw.m27633a(this.f22222k) < this.f22213b.m28045k()) {
            return false;
        }
        this.f22222k = djw.m27632a();
        try {
            this.f22216e.m28067a(dmx.m28129a(dmk.m28033b(this, this.f22217f, this.f22218g)).payload.views);
            m28023f(djm.m27593a(this.f22216e.m28068a()));
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    /* renamed from: c */
    public boolean m28016c(boolean z) {
        if (!z && djw.m27633a(this.f22220i) < this.f22213b.m28043i()) {
            return false;
        }
        this.f22220i = djw.m27632a();
        try {
            this.f22215d.m28082a(dmz.m28132a(dmk.m28031a(this, this.f22217f, this.f22218g, this.f22213b.m28046l(), this.f22223l)).payload.messages);
            m28017d(djm.m27593a(this.f22215d.m28083a()));
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    /* renamed from: d */
    public boolean m28018d(boolean z) {
        if (!z && djw.m27633a(this.f22221j) < this.f22213b.m28044j()) {
            return false;
        }
        this.f22220i = djw.m27632a();
        try {
            m28008a(djm.m27593a(dmy.m28130a(dmk.m28034b(this, this.f22217f, this.f22218g, this.f22213b.m28046l(), this.f22223l)).payload.appLinks));
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    /* renamed from: a */
    public ApiBroadcast m28005a(int i) {
        ApiBroadcast[] a = this.f22215d.m28083a();
        if (a == null) {
            return null;
        }
        ApiBroadcast apiBroadcast = null;
        for (ApiBroadcast apiBroadcast2 : a) {
            if (dmz.m28137c(apiBroadcast2)) {
                ApiBroadcastInfo d = dmz.m28138d(apiBroadcast2);
                if (d == null || TextUtils.isEmpty(d.installedAppIdentifier) || !dmz.m28134a(this.f22212a, d.installedAppIdentifier)) {
                    if (apiBroadcast == null) {
                        apiBroadcast = apiBroadcast2;
                    }
                    if (apiBroadcast2.priority < i) {
                        return apiBroadcast2;
                    }
                }
            }
        }
        return apiBroadcast;
    }

    /* renamed from: c */
    public ApiBroadcast m28014c() {
        return dmz.m28131a(this.f22212a, this.f22215d.m28083a(), this.f22215d.m28084b());
    }

    /* renamed from: a */
    public void m28007a(ApiBroadcast apiBroadcast) {
        int i;
        ArrayList b = this.f22215d.m28084b();
        Iterator it = b.iterator();
        while (it.hasNext()) {
            dmq dmq = (dmq) it.next();
            if (dmq.f22252a == apiBroadcast.id) {
                dmq.f22254c++;
                dmq.f22253b = djw.m27632a();
                i = 1;
                break;
            }
        }
        i = 0;
        if (i == 0) {
            dmq = new dmq();
            dmq.f22252a = apiBroadcast.id;
            dmq.f22254c = 1;
            dmq.f22253b = djw.m27632a();
            b.add(dmq);
        }
        m28021e(djm.m27593a(this.f22215d.m28084b()));
    }

    /* renamed from: d */
    public ApiBroadcast[] m28019d() {
        if (this.f22215d == null) {
            return new ApiBroadcast[0];
        }
        return this.f22215d.m28083a();
    }

    /* renamed from: e */
    public dmn m28020e() {
        if (this.f22216e == null) {
            this.f22216e = dmn.f22242a;
        }
        return this.f22216e;
    }

    /* renamed from: b */
    public void m28012b(String str) {
        this.f22224m.m27622a("u9-rc-config", str);
    }

    /* renamed from: f */
    public String m28022f() {
        return this.f22224m.m27619a("u9-rc-config");
    }

    /* renamed from: c */
    public void m28015c(String str) {
        this.f22224m.m27622a("u9-rc-country", str);
    }

    /* renamed from: g */
    public String m28024g() {
        return this.f22224m.m27619a("u9-rc-country");
    }

    /* renamed from: a */
    public void m28008a(String str) {
        this.f22224m.m27622a("u9-rc-app-links", str);
    }

    /* renamed from: a */
    public String m28006a() {
        return this.f22224m.m27619a("u9-rc-app-links");
    }

    /* renamed from: h */
    public ApiAppLink[] m28025h() {
        return (ApiAppLink[]) djm.m27592a(m28006a(), ApiAppLink[].class);
    }

    /* renamed from: d */
    public void m28017d(String str) {
        this.f22224m.m27622a("u9-rc-braodcasts", str);
    }

    /* renamed from: i */
    public String m28026i() {
        return this.f22224m.m27619a("u9-rc-braodcasts");
    }

    /* renamed from: e */
    public void m28021e(String str) {
        this.f22224m.m27622a("u9-rc-braodcasts-statuses", str);
    }

    /* renamed from: j */
    public String m28027j() {
        return this.f22224m.m27619a("u9-rc-braodcasts-statuses");
    }

    /* renamed from: f */
    public void m28023f(String str) {
        this.f22224m.m27622a("u9-rc-ads", str);
    }

    /* renamed from: k */
    public String m28028k() {
        return this.f22224m.m27619a("u9-rc-ads");
    }
}
