package com.p000;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Looper;
import com.facebook.internal.NativeProtocol;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.internal.zzmk;
import com.google.android.gms.internal.zzmn;
import com.google.android.gms.internal.zzqh;
import p000.aot.C0662b;
import p000.aot.C0663c;
import p000.bhg.C1201a;
import p000.blh.C0242c;
import p000.blh.C0892a;

@bhd
/* renamed from: bhh */
public abstract class bhh implements C1201a, bki<Void> {
    /* renamed from: a */
    private final blh<zzmk> f6246a;
    /* renamed from: b */
    private final C1201a f6247b;
    /* renamed from: c */
    private final Object f6248c = new Object();

    /* renamed from: bhh$2 */
    class C12052 implements C0892a {
        /* renamed from: a */
        final /* synthetic */ bhh f6245a;

        C12052(bhh bhh) {
            this.f6245a = bhh;
        }

        /* renamed from: a */
        public void mo852a() {
            this.f6245a.mo1190a();
        }
    }

    @bhd
    /* renamed from: bhh$a */
    public static final class C1206a extends bhh {
        /* renamed from: a */
        private final Context f6249a;

        public C1206a(Context context, blh<zzmk> blh, C1201a c1201a) {
            super(blh, c1201a);
            this.f6249a = context;
        }

        /* renamed from: a */
        public void mo1190a() {
        }

        /* renamed from: b */
        public bho mo1191b() {
            return bhw.m8559a(this.f6249a, new bat((String) bbb.f5395b.m7064c()), bhv.m8552a());
        }
    }

    @bhd
    /* renamed from: bhh$b */
    public static class C1207b extends bhh implements C0662b, C0663c {
        /* renamed from: a */
        protected bhi f6250a;
        /* renamed from: b */
        private Context f6251b;
        /* renamed from: c */
        private zzqh f6252c;
        /* renamed from: d */
        private blh<zzmk> f6253d;
        /* renamed from: e */
        private final C1201a f6254e;
        /* renamed from: f */
        private final Object f6255f = new Object();
        /* renamed from: g */
        private boolean f6256g;

        public C1207b(Context context, zzqh zzqh, blh<zzmk> blh, C1201a c1201a) {
            Looper a;
            super(blh, c1201a);
            this.f6251b = context;
            this.f6252c = zzqh;
            this.f6253d = blh;
            this.f6254e = c1201a;
            if (((Boolean) bbb.f5381N.m7064c()).booleanValue()) {
                this.f6256g = true;
                a = ako.m2359u().m9258a();
            } else {
                a = context.getMainLooper();
            }
            this.f6250a = new bhi(context, a, this, this, this.f6252c.f15123c);
            m8483f();
        }

        /* renamed from: a */
        public void mo1190a() {
            synchronized (this.f6255f) {
                if (this.f6250a.m2624g() || this.f6250a.m2625h()) {
                    this.f6250a.mo779f();
                }
                Binder.flushPendingCommands();
                if (this.f6256g) {
                    ako.m2359u().m9259b();
                    this.f6256g = false;
                }
            }
        }

        /* renamed from: a */
        public void mo597a(int i) {
            bky.m9006b("Disconnected from remote ad request service.");
        }

        /* renamed from: a */
        public void mo598a(Bundle bundle) {
            mo195d();
        }

        /* renamed from: a */
        public void mo599a(ConnectionResult connectionResult) {
            bky.m9006b("Cannot connect to remote service, fallback to local instance.");
            m8484g().mo195d();
            Bundle bundle = new Bundle();
            bundle.putString(NativeProtocol.WEB_DIALOG_ACTION, "gms_connection_failed_fallback_to_local");
            ako.m2343e().m9123b(this.f6251b, this.f6252c.f15121a, "gmob-apps", bundle, true);
        }

        /* renamed from: b */
        public bho mo1191b() {
            bho e;
            synchronized (this.f6255f) {
                try {
                    e = this.f6250a.mo344e();
                } catch (IllegalStateException e2) {
                    e = null;
                    return e;
                } catch (DeadObjectException e3) {
                    e = null;
                    return e;
                }
            }
            return e;
        }

        /* renamed from: f */
        protected void m8483f() {
            this.f6250a.m2630n();
        }

        /* renamed from: g */
        bki m8484g() {
            return new C1206a(this.f6251b, this.f6253d, this.f6254e);
        }
    }

    public bhh(blh<zzmk> blh, C1201a c1201a) {
        this.f6246a = blh;
        this.f6247b = c1201a;
    }

    /* renamed from: a */
    public abstract void mo1190a();

    /* renamed from: a */
    public void mo1188a(zzmn zzmn) {
        synchronized (this.f6248c) {
            this.f6247b.mo1188a(zzmn);
            mo1190a();
        }
    }

    /* renamed from: a */
    boolean m8471a(bho bho, zzmk zzmk) {
        try {
            bho.mo1194a(zzmk, new bhk(this));
            return true;
        } catch (Throwable th) {
            bky.m9009c("Could not fetch ad response from ad request service due to an Exception.", th);
            ako.m2347i().m8934a(th, "AdRequestClientTask.getAdResponseFromService");
            this.f6247b.mo1188a(new zzmn(0));
            return false;
        }
    }

    /* renamed from: b */
    public abstract bho mo1191b();

    /* renamed from: c */
    public void mo194c() {
        mo1190a();
    }

    /* renamed from: d */
    public /* synthetic */ Object mo195d() {
        return m8475e();
    }

    /* renamed from: e */
    public Void m8475e() {
        final bho b = mo1191b();
        if (b == null) {
            this.f6247b.mo1188a(new zzmn(0));
            mo1190a();
        } else {
            this.f6246a.mo1032a(new C0242c<zzmk>(this) {
                /* renamed from: b */
                final /* synthetic */ bhh f6244b;

                /* renamed from: a */
                public void m8466a(zzmk zzmk) {
                    if (!this.f6244b.m8471a(b, zzmk)) {
                        this.f6244b.mo1190a();
                    }
                }

                /* renamed from: a */
                public /* synthetic */ void mo289a(Object obj) {
                    m8466a((zzmk) obj);
                }
            }, new C12052(this));
        }
        return null;
    }
}
