package com.p000;

import android.annotation.TargetApi;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Build.VERSION;
import com.inmobi.commons.analytics.iat.impl.AdTrackerConstants;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import p000.bqs.C1417b;

/* renamed from: bqt */
public class bqt {
    /* renamed from: g */
    private static bqt f7411g;
    /* renamed from: a */
    private final C1419a f7412a;
    /* renamed from: b */
    private final Context f7413b;
    /* renamed from: c */
    private final bqs f7414c;
    /* renamed from: d */
    private final brv f7415d;
    /* renamed from: e */
    private final ConcurrentMap<String, bsd> f7416e;
    /* renamed from: f */
    private final bse f7417f;

    /* renamed from: bqt$1 */
    class C14181 implements C1417b {
        /* renamed from: a */
        final /* synthetic */ bqt f7408a;

        C14181(bqt bqt) {
            this.f7408a = bqt;
        }

        /* renamed from: a */
        public void mo1404a(Map<String, Object> map) {
            Object obj = map.get("event");
            if (obj != null) {
                this.f7408a.m10463a(obj.toString());
            }
        }
    }

    /* renamed from: bqt$a */
    public interface C1419a {
    }

    /* renamed from: bqt$2 */
    class C14202 implements C1419a {
        C14202() {
        }
    }

    /* renamed from: bqt$3 */
    class C14213 implements ComponentCallbacks2 {
        /* renamed from: a */
        final /* synthetic */ bqt f7409a;

        C14213(bqt bqt) {
            this.f7409a = bqt;
        }

        public void onConfigurationChanged(Configuration configuration) {
        }

        public void onLowMemory() {
        }

        public void onTrimMemory(int i) {
            if (i == 20) {
                this.f7409a.m10466a();
            }
        }
    }

    bqt(Context context, C1419a c1419a, bqs bqs, brv brv) {
        if (context == null) {
            throw new NullPointerException(AdTrackerConstants.MSG_APP_CONTEXT_NULL);
        }
        this.f7413b = context.getApplicationContext();
        this.f7415d = brv;
        this.f7412a = c1419a;
        this.f7416e = new ConcurrentHashMap();
        this.f7414c = bqs;
        this.f7414c.m10456a(new C14181(this));
        this.f7414c.m10456a(new bru(this.f7413b));
        this.f7417f = new bse();
        m10464b();
        m10465c();
    }

    /* renamed from: a */
    public static bqt m10461a(Context context) {
        bqt bqt;
        synchronized (bqt.class) {
            if (f7411g == null) {
                if (context == null) {
                    brd.m10493a("TagManager.getInstance requires non-null context.");
                    throw new NullPointerException();
                }
                f7411g = new bqt(context, new C14202(), new bqs(new bsg(context)), brw.m10573b());
            }
            bqt = f7411g;
        }
        return bqt;
    }

    /* renamed from: a */
    private void m10463a(String str) {
        for (bsd a : this.f7416e.values()) {
            a.m10607a(str);
        }
    }

    @TargetApi(14)
    /* renamed from: b */
    private void m10464b() {
        int i = VERSION.SDK_INT;
        this.f7413b.registerComponentCallbacks(new C14213(this));
    }

    /* renamed from: c */
    private void m10465c() {
        bqu.m10472a(this.f7413b);
    }

    /* renamed from: a */
    public void m10466a() {
        this.f7415d.mo1423a();
    }

    /* renamed from: a */
    public synchronized boolean m10467a(Uri uri) {
        boolean z;
        brn a = brn.m10539a();
        if (a.m10542a(uri)) {
            String d = a.m10545d();
            switch (a.m10543b()) {
                case NONE:
                    bsd bsd = (bsd) this.f7416e.get(d);
                    if (bsd != null) {
                        bsd.m10609b(null);
                        bsd.m10610c();
                        break;
                    }
                    break;
                case CONTAINER:
                case CONTAINER_DEBUG:
                    for (String str : this.f7416e.keySet()) {
                        bsd bsd2 = (bsd) this.f7416e.get(str);
                        if (str.equals(d)) {
                            bsd2.m10609b(a.m10544c());
                            bsd2.m10610c();
                        } else if (bsd2.m10612e() != null) {
                            bsd2.m10609b(null);
                            bsd2.m10610c();
                        }
                    }
                    break;
            }
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    /* renamed from: a */
    public boolean m10468a(bsd bsd) {
        return this.f7416e.remove(bsd.m10611d()) != null;
    }
}
