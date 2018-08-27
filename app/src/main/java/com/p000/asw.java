package com.p000;

import android.os.IBinder;
import android.os.IBinder.DeathRecipient;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import p000.ann.C0297f;
import p000.ann.C0645d;
import p000.ari.C0301a;

/* renamed from: asw */
public class asw {
    /* renamed from: a */
    public static final Status f4290a = new Status(8, "The connection to Google Play services was lost");
    /* renamed from: c */
    private static final ark<?>[] f4291c = new ark[0];
    /* renamed from: b */
    final Set<ark<?>> f4292b = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));
    /* renamed from: d */
    private final C0776b f4293d = new C07771(this);
    /* renamed from: e */
    private final Map<C0645d<?>, C0297f> f4294e;

    /* renamed from: asw$b */
    interface C0776b {
        /* renamed from: a */
        void mo710a(ark<?> ark);
    }

    /* renamed from: asw$1 */
    class C07771 implements C0776b {
        /* renamed from: a */
        final /* synthetic */ asw f4286a;

        C07771(asw asw) {
            this.f4286a = asw;
        }

        /* renamed from: a */
        public void mo710a(ark<?> ark) {
            this.f4286a.f4292b.remove(ark);
            if (ark.mo347c() != null) {
                null;
            }
        }
    }

    /* renamed from: asw$a */
    static class C0778a implements DeathRecipient, C0776b {
        /* renamed from: a */
        private final WeakReference<ark<?>> f4287a;
        /* renamed from: b */
        private final WeakReference<aob> f4288b;
        /* renamed from: c */
        private final WeakReference<IBinder> f4289c;

        private C0778a(ark<?> ark, aob aob, IBinder iBinder) {
            this.f4288b = new WeakReference(aob);
            this.f4287a = new WeakReference(ark);
            this.f4289c = new WeakReference(iBinder);
        }

        /* renamed from: a */
        private void m5524a() {
            ark ark = (ark) this.f4287a.get();
            aob aob = (aob) this.f4288b.get();
            if (!(aob == null || ark == null)) {
                aob.m4610a(ark.mo347c().intValue());
            }
            IBinder iBinder = (IBinder) this.f4289c.get();
            if (iBinder != null) {
                iBinder.unlinkToDeath(this, 0);
            }
        }

        /* renamed from: a */
        public void mo710a(ark<?> ark) {
            m5524a();
        }

        public void binderDied() {
            m5524a();
        }
    }

    public asw(Map<C0645d<?>, C0297f> map) {
        this.f4294e = map;
    }

    /* renamed from: a */
    private static void m5527a(ark<?> ark, aob aob, IBinder iBinder) {
        if (ark.m2686d()) {
            ark.m2682a(new C0778a(ark, aob, iBinder));
        } else if (iBinder == null || !iBinder.isBinderAlive()) {
            ark.m2682a(null);
            ark.m2687e();
            aob.m4610a(ark.mo347c().intValue());
        } else {
            C0776b c0778a = new C0778a(ark, aob, iBinder);
            ark.m2682a(c0778a);
            try {
                iBinder.linkToDeath(c0778a, 0);
            } catch (RemoteException e) {
                ark.m2687e();
                aob.m4610a(ark.mo347c().intValue());
            }
        }
    }

    /* renamed from: a */
    public void m5528a() {
        for (ark ark : (ark[]) this.f4292b.toArray(f4291c)) {
            ark.m2682a(null);
            if (ark.mo347c() != null) {
                ark.m2690h();
                asw.m5527a(ark, null, ((C0297f) this.f4294e.get(((C0301a) ark).mo348a())).m2651k());
                this.f4292b.remove(ark);
            } else if (ark.m2688f()) {
                this.f4292b.remove(ark);
            }
        }
    }

    /* renamed from: a */
    void m5529a(ark<? extends ant> ark) {
        this.f4292b.add(ark);
        ark.m2682a(this.f4293d);
    }

    /* renamed from: a */
    public void m5530a(PrintWriter printWriter) {
        printWriter.append(" mUnconsumedApiCalls.size()=").println(this.f4292b.size());
    }

    /* renamed from: b */
    public void m5531b() {
        for (ark d : (ark[]) this.f4292b.toArray(f4291c)) {
            d.m2685d(f4290a);
        }
    }
}
