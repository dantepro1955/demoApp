package com.p000;

import android.content.Context;
import com.google.android.gms.internal.zzqh;
import java.lang.ref.WeakReference;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p000.bee.C1105b;
import p000.bee.C1115e;
import p000.bjt.C1254a;
import p000.blh.C0242c;
import p000.blh.C0892a;

@bhd
/* renamed from: bgu */
public class bgu {
    /* renamed from: a */
    private static final long f6129a = TimeUnit.SECONDS.toMillis(60);
    /* renamed from: b */
    private static final Object f6130b = new Object();
    /* renamed from: c */
    private static boolean f6131c = false;
    /* renamed from: d */
    private static bee f6132d = null;
    /* renamed from: e */
    private final Context f6133e;
    /* renamed from: f */
    private final zzqh f6134f;
    /* renamed from: g */
    private final akk f6135g;
    /* renamed from: h */
    private final avc f6136h;
    /* renamed from: i */
    private bec f6137i;
    /* renamed from: j */
    private C1115e f6138j;
    /* renamed from: k */
    private beb f6139k;
    /* renamed from: l */
    private boolean f6140l;

    /* renamed from: bgu$a */
    public static abstract class C1002a {
        /* renamed from: a */
        public void mo1181a() {
        }

        /* renamed from: a */
        public abstract void mo975a(bef bef);
    }

    /* renamed from: bgu$3 */
    class C11763 implements bkl<beb> {
        /* renamed from: a */
        final /* synthetic */ bgu f6128a;

        C11763(bgu bgu) {
            this.f6128a = bgu;
        }

        /* renamed from: a */
        public void m8344a(beb beb) {
            akk akk = (akk) new WeakReference(this.f6128a.f6135g).get();
            beb.mo1020a(akk, akk, akk, akk, false, null, null, null, null);
        }

        /* renamed from: a */
        public /* synthetic */ void mo1031a(Object obj) {
            m8344a((beb) obj);
        }
    }

    public bgu(Context context, akk akk, avc avc, zzqh zzqh) {
        this.f6140l = false;
        this.f6133e = context;
        this.f6135g = akk;
        this.f6136h = avc;
        this.f6134f = zzqh;
        this.f6140l = ((Boolean) bbb.cg.m7064c()).booleanValue();
    }

    public bgu(Context context, C1254a c1254a, akk akk, avc avc) {
        zzqh zzqh = (c1254a == null || c1254a.f6529a == null) ? null : c1254a.f6529a.f15042k;
        this(context, akk, avc, zzqh);
    }

    /* renamed from: g */
    private void m8347g() {
        synchronized (f6130b) {
            if (!f6131c) {
                f6132d = new bee(this.f6133e.getApplicationContext() != null ? this.f6133e.getApplicationContext() : this.f6133e, this.f6134f, (String) bbb.cd.m7064c(), new C11763(this), new C1105b());
                f6131c = true;
            }
        }
    }

    /* renamed from: h */
    private void m8348h() {
        this.f6138j = new C1115e(m8356e().m7836b(this.f6136h));
    }

    /* renamed from: i */
    private void m8349i() {
        this.f6137i = new bec();
    }

    /* renamed from: j */
    private void m8350j() throws CancellationException, ExecutionException, InterruptedException, TimeoutException {
        this.f6139k = (beb) m8354c().m7774a(this.f6133e, this.f6134f, (String) bbb.cd.m7064c(), this.f6136h, this.f6135g.m1986f()).get(f6129a, TimeUnit.MILLISECONDS);
        this.f6139k.mo1020a(this.f6135g, this.f6135g, this.f6135g, this.f6135g, false, null, null, null, null);
    }

    /* renamed from: a */
    public void m8351a() {
        if (this.f6140l) {
            m8347g();
        } else {
            m8349i();
        }
    }

    /* renamed from: a */
    public void m8352a(final C1002a c1002a) {
        if (this.f6140l) {
            C1115e f = m8357f();
            if (f == null) {
                bky.m9011e("SharedJavascriptEngine not initialized");
                return;
            } else {
                f.mo1032a(new C0242c<bef>(this) {
                    /* renamed from: a */
                    public void m8341a(bef bef) {
                        c1002a.mo975a(bef);
                    }

                    /* renamed from: a */
                    public /* synthetic */ void mo289a(Object obj) {
                        m8341a((bef) obj);
                    }
                }, new C0892a(this) {
                    /* renamed from: a */
                    public void mo852a() {
                        c1002a.mo1181a();
                    }
                });
                return;
            }
        }
        bef d = m8355d();
        if (d == null) {
            bky.m9011e("JavascriptEngine not initialized");
        } else {
            c1002a.mo975a(d);
        }
    }

    /* renamed from: b */
    public void m8353b() throws CancellationException, ExecutionException, InterruptedException, TimeoutException {
        if (this.f6140l) {
            m8348h();
        } else {
            m8350j();
        }
    }

    /* renamed from: c */
    protected bec m8354c() {
        return this.f6137i;
    }

    /* renamed from: d */
    protected beb m8355d() {
        return this.f6139k;
    }

    /* renamed from: e */
    protected bee m8356e() {
        return f6132d;
    }

    /* renamed from: f */
    protected C1115e m8357f() {
        return this.f6138j;
    }
}
