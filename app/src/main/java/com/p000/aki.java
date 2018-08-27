package com.p000;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.internal.zzqh;
import p000.bac.C0259a;

@bhd
/* renamed from: aki */
public class aki extends C0259a {
    /* renamed from: b */
    private static final Object f1844b = new Object();
    /* renamed from: c */
    private static aki f1845c;
    /* renamed from: a */
    private final Context f1846a;
    /* renamed from: d */
    private final Object f1847d = new Object();
    /* renamed from: e */
    private boolean f1848e;
    /* renamed from: f */
    private boolean f1849f;
    /* renamed from: g */
    private float f1850g = -1.0f;
    /* renamed from: h */
    private zzqh f1851h;

    aki(Context context, zzqh zzqh) {
        this.f1846a = context;
        this.f1851h = zzqh;
        this.f1848e = false;
    }

    /* renamed from: a */
    public static aki m2227a() {
        aki aki;
        synchronized (f1844b) {
            aki = f1845c;
        }
        return aki;
    }

    /* renamed from: a */
    public static aki m2228a(Context context, zzqh zzqh) {
        aki aki;
        synchronized (f1844b) {
            if (f1845c == null) {
                f1845c = new aki(context.getApplicationContext(), zzqh);
            }
            aki = f1845c;
        }
        return aki;
    }

    /* renamed from: a */
    bkj m2230a(Context context) {
        return new bkj(context);
    }

    /* renamed from: a */
    public void mo311a(float f) {
        synchronized (this.f1847d) {
            this.f1850g = f;
        }
    }

    /* renamed from: a */
    public void mo312a(aqq aqq, String str) {
        if (aqq == null) {
            bky.m9008c("Wrapped context is null. Failed to open debug menu.");
            return;
        }
        Context context = (Context) aqr.m4968a(aqq);
        if (context == null) {
            bky.m9008c("Context is null. Failed to open debug menu.");
            return;
        }
        bkj a = m2230a(context);
        a.m9215a(str);
        a.m9216b(this.f1851h.f15121a);
        a.m9212a();
    }

    /* renamed from: a */
    public void mo313a(String str) {
        bbb.m7128a(this.f1846a);
        if (!TextUtils.isEmpty(str) && ((Boolean) bbb.cD.m7064c()).booleanValue()) {
            ako.m2333A().m2112a(this.f1846a, this.f1851h, str, null);
        }
    }

    /* renamed from: a */
    public void mo314a(String str, aqq aqq) {
        if (!TextUtils.isEmpty(str)) {
            final Runnable runnable;
            int i;
            bbb.m7128a(this.f1846a);
            int booleanValue = ((Boolean) bbb.cD.m7064c()).booleanValue() | ((Boolean) bbb.aH.m7064c()).booleanValue();
            if (((Boolean) bbb.aH.m7064c()).booleanValue()) {
                runnable = (Runnable) aqr.m4968a(aqq);
                runnable = new Runnable(this) {
                    /* renamed from: b */
                    final /* synthetic */ aki f1843b;

                    /* renamed from: aki$1$1 */
                    class C02571 implements Runnable {
                        /* renamed from: a */
                        final /* synthetic */ C02581 f1841a;

                        C02571(C02581 c02581) {
                            this.f1841a = c02581;
                        }

                        public void run() {
                            biw.m8762a(this.f1841a.f1843b.f1846a, runnable);
                        }
                    }

                    public void run() {
                        ako.m2343e().m9106a(new C02571(this));
                    }
                };
                i = 1;
            } else {
                runnable = null;
                i = booleanValue;
            }
            if (i != 0) {
                ako.m2333A().m2112a(this.f1846a, this.f1851h, str, runnable);
            }
        }
    }

    /* renamed from: a */
    public void mo315a(boolean z) {
        synchronized (this.f1847d) {
            this.f1849f = z;
        }
    }

    /* renamed from: b */
    public void mo316b() {
        synchronized (f1844b) {
            if (this.f1848e) {
                bky.m9011e("Mobile ads is initialized already.");
                return;
            }
            this.f1848e = true;
            bbb.m7128a(this.f1846a);
            ako.m2347i().m8928a(this.f1846a, this.f1851h);
            ako.m2348j().m6675a(this.f1846a);
        }
    }

    /* renamed from: c */
    public float m2237c() {
        float f;
        synchronized (this.f1847d) {
            f = this.f1850g;
        }
        return f;
    }

    /* renamed from: d */
    public boolean m2238d() {
        boolean z;
        synchronized (this.f1847d) {
            z = this.f1850g >= 0.0f;
        }
        return z;
    }

    /* renamed from: e */
    public boolean m2239e() {
        boolean z;
        synchronized (this.f1847d) {
            z = this.f1849f;
        }
        return z;
    }
}
