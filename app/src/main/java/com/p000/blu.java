package com.p000;

import com.facebook.appevents.AppEventsConstants;
import com.facebook.internal.NativeProtocol;
import java.util.HashMap;
import java.util.Map;
import p000.baf.C0961a;

@bhd
/* renamed from: blu */
public class blu extends C0961a {
    /* renamed from: a */
    private final blo f6929a;
    /* renamed from: b */
    private final Object f6930b = new Object();
    /* renamed from: c */
    private final float f6931c;
    /* renamed from: d */
    private int f6932d;
    /* renamed from: e */
    private bag f6933e;
    /* renamed from: f */
    private boolean f6934f;
    /* renamed from: g */
    private boolean f6935g;
    /* renamed from: h */
    private float f6936h;
    /* renamed from: i */
    private boolean f6937i = true;
    /* renamed from: j */
    private float f6938j;

    public blu(blo blo, float f) {
        this.f6929a = blo;
        this.f6931c = f;
    }

    /* renamed from: a */
    private void m9582a(final int i, final int i2) {
        ako.m2343e().m9106a(new Runnable(this) {
            /* renamed from: c */
            final /* synthetic */ blu f6928c;

            public void run() {
                boolean z = false;
                synchronized (this.f6928c.f6930b) {
                    boolean z2 = i != i2;
                    boolean z3 = !this.f6928c.f6934f && i2 == 1;
                    boolean z4 = z2 && i2 == 1;
                    boolean z5 = z2 && i2 == 2;
                    z2 = z2 && i2 == 3;
                    blu blu = this.f6928c;
                    if (this.f6928c.f6934f || z3) {
                        z = true;
                    }
                    blu.f6934f = z;
                    if (this.f6928c.f6933e == null) {
                        return;
                    }
                    if (z3) {
                        try {
                            this.f6928c.f6933e.mo902a();
                        } catch (Throwable e) {
                            bky.m9009c("Unable to call onVideoStart()", e);
                        }
                    }
                    if (z4) {
                        try {
                            this.f6928c.f6933e.mo903b();
                        } catch (Throwable e2) {
                            bky.m9009c("Unable to call onVideoPlay()", e2);
                        }
                    }
                    if (z5) {
                        try {
                            this.f6928c.f6933e.mo904c();
                        } catch (Throwable e22) {
                            bky.m9009c("Unable to call onVideoPause()", e22);
                        }
                    }
                    if (z2) {
                        try {
                            this.f6928c.f6933e.mo905d();
                        } catch (Throwable e222) {
                            bky.m9009c("Unable to call onVideoEnd()", e222);
                        }
                    }
                }
            }
        });
    }

    /* renamed from: a */
    private void m9583a(String str) {
        m9584a(str, null);
    }

    /* renamed from: a */
    private void m9584a(String str, Map<String, String> map) {
        final Map hashMap = map == null ? new HashMap() : new HashMap(map);
        hashMap.put(NativeProtocol.WEB_DIALOG_ACTION, str);
        ako.m2343e().m9106a(new Runnable(this) {
            /* renamed from: b */
            final /* synthetic */ blu f6925b;

            public void run() {
                this.f6925b.f6929a.mo1303a("pubVideoCmd", hashMap);
            }
        });
    }

    /* renamed from: a */
    public void mo893a() {
        m9583a("play");
    }

    /* renamed from: a */
    public void m9590a(float f, int i, boolean z, float f2) {
        int i2;
        synchronized (this.f6930b) {
            this.f6936h = f;
            this.f6935g = z;
            i2 = this.f6932d;
            this.f6932d = i;
            this.f6938j = f2;
        }
        m9582a(i2, i);
    }

    /* renamed from: a */
    public void mo894a(bag bag) {
        synchronized (this.f6930b) {
            this.f6933e = bag;
        }
    }

    /* renamed from: a */
    public void mo895a(boolean z) {
        m9583a(z ? "mute" : "unmute");
    }

    /* renamed from: b */
    public void mo896b() {
        m9583a("pause");
    }

    /* renamed from: b */
    public void m9594b(boolean z) {
        synchronized (this.f6930b) {
            this.f6937i = z;
        }
        m9584a("initialState", apu.m4884b("muteStart", z ? "1" : AppEventsConstants.EVENT_PARAM_VALUE_NO));
    }

    /* renamed from: c */
    public boolean mo897c() {
        boolean z;
        synchronized (this.f6930b) {
            z = this.f6935g;
        }
        return z;
    }

    /* renamed from: d */
    public int mo898d() {
        int i;
        synchronized (this.f6930b) {
            i = this.f6932d;
        }
        return i;
    }

    /* renamed from: e */
    public float mo899e() {
        return this.f6931c;
    }

    /* renamed from: f */
    public float mo900f() {
        float f;
        synchronized (this.f6930b) {
            f = this.f6936h;
        }
        return f;
    }

    /* renamed from: g */
    public float mo901g() {
        float f;
        synchronized (this.f6930b) {
            f = this.f6938j;
        }
        return f;
    }
}
