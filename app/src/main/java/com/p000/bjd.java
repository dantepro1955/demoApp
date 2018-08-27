package com.p000;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Future;
import org.json.JSONObject;
import p000.biy.C1248a;
import p000.bjt.C1254a;

@bhd
/* renamed from: bjd */
public class bjd extends bkb implements bjc {
    /* renamed from: a */
    private final C1254a f6506a;
    /* renamed from: b */
    private final Context f6507b;
    /* renamed from: c */
    private final ArrayList<Future> f6508c;
    /* renamed from: d */
    private final ArrayList<String> f6509d;
    /* renamed from: e */
    private final HashMap<String, bix> f6510e;
    /* renamed from: f */
    private final List<biy> f6511f;
    /* renamed from: g */
    private final HashSet<String> f6512g;
    /* renamed from: h */
    private final Object f6513h;
    /* renamed from: i */
    private final bim f6514i;
    /* renamed from: j */
    private final long f6515j;

    public bjd(Context context, C1254a c1254a, bim bim) {
        this(context, c1254a, bim, ((Long) bbb.aI.m7064c()).longValue());
    }

    bjd(Context context, C1254a c1254a, bim bim, long j) {
        this.f6508c = new ArrayList();
        this.f6509d = new ArrayList();
        this.f6510e = new HashMap();
        this.f6511f = new ArrayList();
        this.f6512g = new HashSet();
        this.f6513h = new Object();
        this.f6507b = context;
        this.f6506a = c1254a;
        this.f6514i = bim;
        this.f6515j = j;
    }

    /* renamed from: a */
    private static int m8827a(int i) {
        switch (i) {
            case 3:
                return 1;
            case 4:
                return 2;
            case 5:
                return 4;
            case 6:
                return 0;
            case 7:
                return 3;
            default:
                return 6;
        }
    }

    /* renamed from: a */
    private bjt m8829a(int i, String str, bem bem) {
        return new bjt(this.f6506a.f6529a.f15034c, null, this.f6506a.f6530b.f15078d, i, this.f6506a.f6530b.f15080f, this.f6506a.f6530b.f15084j, this.f6506a.f6530b.f15086l, this.f6506a.f6530b.f15085k, this.f6506a.f6529a.f15040i, this.f6506a.f6530b.f15082h, bem, null, str, this.f6506a.f6531c, null, this.f6506a.f6530b.f15083i, this.f6506a.f6532d, this.f6506a.f6530b.f15081g, this.f6506a.f6534f, this.f6506a.f6530b.f15088n, this.f6506a.f6530b.f15089o, this.f6506a.f6536h, null, this.f6506a.f6530b.f15060C, this.f6506a.f6530b.f15061D, this.f6506a.f6530b.f15062E, this.f6506a.f6530b.f15063F, this.f6506a.f6530b.f15064G, m8834f(), this.f6506a.f6530b.f15067J, this.f6506a.f6530b.f15071N);
    }

    /* renamed from: a */
    private bjt m8830a(String str, bem bem) {
        return m8829a(-2, str, bem);
    }

    /* renamed from: a */
    private static String m8831a(biy biy) {
        String str = biy.f6494b;
        int a = bjd.m8827a(biy.f6495c);
        return new StringBuilder(String.valueOf(str).length() + 33).append(str).append(".").append(a).append(".").append(biy.f6496d).toString();
    }

    /* renamed from: a */
    private void m8832a(String str, String str2, bem bem) {
        synchronized (this.f6513h) {
            bje c = this.f6514i.m8722c(str);
            if (c == null || c.m8841b() == null || c.m8840a() == null) {
                this.f6511f.add(new C1248a().m8791b(bem.f5825d).m8789a(str).m8788a(0).m8787a(7).m8790a());
                return;
            }
            bkb a = m8835a(str, str2, bem, c);
            this.f6508c.add((Future) a.mo195d());
            this.f6509d.add(str);
            this.f6510e.put(str, a);
        }
    }

    /* renamed from: e */
    private bjt m8833e() {
        return m8829a(3, null, null);
    }

    /* renamed from: f */
    private String m8834f() {
        StringBuilder stringBuilder = new StringBuilder("");
        if (this.f6511f == null) {
            return stringBuilder.toString();
        }
        for (biy biy : this.f6511f) {
            if (!(biy == null || TextUtils.isEmpty(biy.f6494b))) {
                stringBuilder.append(String.valueOf(bjd.m8831a(biy)).concat("_"));
            }
        }
        return stringBuilder.substring(0, Math.max(0, stringBuilder.length() - 1));
    }

    /* renamed from: a */
    protected bix m8835a(String str, String str2, bem bem, bje bje) {
        return new bix(this.f6507b, str, str2, bem, this.f6506a, bje, this, this.f6515j);
    }

    /* renamed from: a */
    public void mo196a() {
        String str;
        bix bix;
        final bjt a;
        for (bem bem : this.f6506a.f6531c.f5838a) {
            String str2 = bem.f5830i;
            for (String str3 : bem.f5824c) {
                String str32;
                if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str32) || "com.google.ads.mediation.customevent.CustomEventAdapter".equals(str32)) {
                    try {
                        str32 = new JSONObject(str2).getString("class_name");
                    } catch (Throwable e) {
                        bky.m9007b("Unable to determine custom event class name, skipping...", e);
                    }
                }
                m8832a(str32, str2, bem);
            }
        }
        int i = 0;
        while (i < this.f6508c.size()) {
            try {
                ((Future) this.f6508c.get(i)).get();
                synchronized (this.f6513h) {
                    str = (String) this.f6509d.get(i);
                    if (!TextUtils.isEmpty(str)) {
                        bix = (bix) this.f6510e.get(str);
                        if (bix != null) {
                            this.f6511f.add(bix.m8780e());
                        }
                    }
                }
                synchronized (this.f6513h) {
                    if (this.f6512g.contains(this.f6509d.get(i))) {
                        str = (String) this.f6509d.get(i);
                        a = m8830a(str, this.f6510e.get(str) != null ? ((bix) this.f6510e.get(str)).m8781f() : null);
                        bkx.f6798a.post(new Runnable(this) {
                            /* renamed from: b */
                            final /* synthetic */ bjd f6503b;

                            public void run() {
                                this.f6503b.f6514i.mo243b(a);
                            }
                        });
                        return;
                    }
                }
            } catch (InterruptedException e2) {
                Thread.currentThread().interrupt();
                synchronized (this.f6513h) {
                    str = (String) this.f6509d.get(i);
                    if (!TextUtils.isEmpty(str)) {
                        bix = (bix) this.f6510e.get(str);
                        if (bix != null) {
                            this.f6511f.add(bix.m8780e());
                        }
                    }
                }
            } catch (Throwable e3) {
                bky.m9009c("Unable to resolve rewarded adapter.", e3);
                synchronized (this.f6513h) {
                    str = (String) this.f6509d.get(i);
                    if (!TextUtils.isEmpty(str)) {
                        bix = (bix) this.f6510e.get(str);
                        if (bix != null) {
                            this.f6511f.add(bix.m8780e());
                        }
                    }
                }
            } catch (Throwable e32) {
                Throwable th = e32;
                synchronized (this.f6513h) {
                    str = (String) this.f6509d.get(i);
                    if (!TextUtils.isEmpty(str)) {
                        bix = (bix) this.f6510e.get(str);
                        if (bix != null) {
                            this.f6511f.add(bix.m8780e());
                        }
                    }
                }
            }
        }
        a = m8833e();
        bkx.f6798a.post(new Runnable(this) {
            /* renamed from: b */
            final /* synthetic */ bjd f6505b;

            public void run() {
                this.f6505b.f6514i.mo243b(a);
            }
        });
        return;
        i++;
    }

    /* renamed from: a */
    public void mo1226a(String str) {
        synchronized (this.f6513h) {
            this.f6512g.add(str);
        }
    }

    /* renamed from: a */
    public void mo1227a(String str, int i) {
    }

    /* renamed from: b */
    public void mo197b() {
    }
}
