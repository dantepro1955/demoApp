package com.p000;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import p000.ann.C0286b;
import p000.ann.C0296c;
import p000.ann.C0297f;
import p000.ann.C0645d;
import p000.ari.C0301a;
import p000.ase.C0731a;

/* renamed from: arn */
final class arn implements ase {
    /* renamed from: a */
    private final Context f4048a;
    /* renamed from: b */
    private final arw f4049b;
    /* renamed from: c */
    private final Looper f4050c;
    /* renamed from: d */
    private final ary f4051d;
    /* renamed from: e */
    private final ary f4052e;
    /* renamed from: f */
    private final Map<C0645d<?>, ary> f4053f;
    /* renamed from: g */
    private final Set<asr> f4054g = Collections.newSetFromMap(new WeakHashMap());
    /* renamed from: h */
    private final C0297f f4055h;
    /* renamed from: i */
    private Bundle f4056i;
    /* renamed from: j */
    private ConnectionResult f4057j = null;
    /* renamed from: k */
    private ConnectionResult f4058k = null;
    /* renamed from: l */
    private boolean f4059l = false;
    /* renamed from: m */
    private final Lock f4060m;
    /* renamed from: n */
    private int f4061n = 0;

    /* renamed from: arn$1 */
    class C07301 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ arn f4045a;

        C07301(arn arn) {
            this.f4045a = arn;
        }

        public void run() {
            this.f4045a.f4060m.lock();
            try {
                this.f4045a.m5163j();
            } finally {
                this.f4045a.f4060m.unlock();
            }
        }
    }

    /* renamed from: arn$a */
    class C0732a implements C0731a {
        /* renamed from: a */
        final /* synthetic */ arn f4046a;

        private C0732a(arn arn) {
            this.f4046a = arn;
        }

        /* renamed from: a */
        public void mo632a(int i, boolean z) {
            this.f4046a.f4060m.lock();
            try {
                if (this.f4046a.f4059l || this.f4046a.f4058k == null || !this.f4046a.f4058k.m19505b()) {
                    this.f4046a.f4059l = false;
                    this.f4046a.m5148a(i, z);
                    return;
                }
                this.f4046a.f4059l = true;
                this.f4046a.f4052e.onConnectionSuspended(i);
                this.f4046a.f4060m.unlock();
            } finally {
                this.f4046a.f4060m.unlock();
            }
        }

        /* renamed from: a */
        public void mo633a(Bundle bundle) {
            this.f4046a.f4060m.lock();
            try {
                this.f4046a.m5149a(bundle);
                this.f4046a.f4057j = ConnectionResult.f14748a;
                this.f4046a.m5163j();
            } finally {
                this.f4046a.f4060m.unlock();
            }
        }

        /* renamed from: a */
        public void mo634a(ConnectionResult connectionResult) {
            this.f4046a.f4060m.lock();
            try {
                this.f4046a.f4057j = connectionResult;
                this.f4046a.m5163j();
            } finally {
                this.f4046a.f4060m.unlock();
            }
        }
    }

    /* renamed from: arn$b */
    class C0733b implements C0731a {
        /* renamed from: a */
        final /* synthetic */ arn f4047a;

        private C0733b(arn arn) {
            this.f4047a = arn;
        }

        /* renamed from: a */
        public void mo632a(int i, boolean z) {
            this.f4047a.f4060m.lock();
            try {
                if (this.f4047a.f4059l) {
                    this.f4047a.f4059l = false;
                    this.f4047a.m5148a(i, z);
                    return;
                }
                this.f4047a.f4059l = true;
                this.f4047a.f4051d.onConnectionSuspended(i);
                this.f4047a.f4060m.unlock();
            } finally {
                this.f4047a.f4060m.unlock();
            }
        }

        /* renamed from: a */
        public void mo633a(Bundle bundle) {
            this.f4047a.f4060m.lock();
            try {
                this.f4047a.f4058k = ConnectionResult.f14748a;
                this.f4047a.m5163j();
            } finally {
                this.f4047a.f4060m.unlock();
            }
        }

        /* renamed from: a */
        public void mo634a(ConnectionResult connectionResult) {
            this.f4047a.f4060m.lock();
            try {
                this.f4047a.f4058k = connectionResult;
                this.f4047a.m5163j();
            } finally {
                this.f4047a.f4060m.unlock();
            }
        }
    }

    private arn(Context context, arw arw, Lock lock, Looper looper, aqm aqm, Map<C0645d<?>, C0297f> map, Map<C0645d<?>, C0297f> map2, aou aou, C0286b<? extends avj, avk> c0286b, C0297f c0297f, ArrayList<arl> arrayList, ArrayList<arl> arrayList2, Map<ann<?>, Boolean> map3, Map<ann<?>, Boolean> map4) {
        this.f4048a = context;
        this.f4049b = arw;
        this.f4060m = lock;
        this.f4050c = looper;
        this.f4055h = c0297f;
        this.f4051d = new ary(context, this.f4049b, lock, looper, aqm, map2, null, map4, null, arrayList2, new C0732a());
        this.f4052e = new ary(context, this.f4049b, lock, looper, aqm, map, aou, map3, c0286b, arrayList, new C0733b());
        Map hhVar = new hh();
        for (C0645d put : map2.keySet()) {
            hhVar.put(put, this.f4051d);
        }
        for (C0645d put2 : map.keySet()) {
            hhVar.put(put2, this.f4052e);
        }
        this.f4053f = Collections.unmodifiableMap(hhVar);
    }

    /* renamed from: a */
    public static arn m5145a(Context context, arw arw, Lock lock, Looper looper, aqm aqm, Map<C0645d<?>, C0297f> map, aou aou, Map<ann<?>, Boolean> map2, C0286b<? extends avj, avk> c0286b, ArrayList<arl> arrayList) {
        C0297f c0297f = null;
        Map hhVar = new hh();
        Map hhVar2 = new hh();
        for (Entry entry : map.entrySet()) {
            C0297f c0297f2 = (C0297f) entry.getValue();
            if (c0297f2.mo342c()) {
                c0297f = c0297f2;
            }
            if (c0297f2.mo799i()) {
                hhVar.put((C0645d) entry.getKey(), c0297f2);
            } else {
                hhVar2.put((C0645d) entry.getKey(), c0297f2);
            }
        }
        aoi.m4685a(!hhVar.isEmpty(), (Object) "CompositeGoogleApiClient should not be used without any APIs that require sign-in.");
        Map hhVar3 = new hh();
        Map hhVar4 = new hh();
        for (ann ann : map2.keySet()) {
            C0645d c = ann.m4560c();
            if (hhVar.containsKey(c)) {
                hhVar3.put(ann, (Boolean) map2.get(ann));
            } else if (hhVar2.containsKey(c)) {
                hhVar4.put(ann, (Boolean) map2.get(ann));
            } else {
                throw new IllegalStateException("Each API in the isOptionalMap must have a corresponding client in the clients map.");
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arl arl = (arl) it.next();
            if (hhVar3.containsKey(arl.f4042a)) {
                arrayList2.add(arl);
            } else if (hhVar4.containsKey(arl.f4042a)) {
                arrayList3.add(arl);
            } else {
                throw new IllegalStateException("Each ClientCallbacks must have a corresponding API in the isOptionalMap");
            }
        }
        return new arn(context, arw, lock, looper, aqm, hhVar, hhVar2, aou, c0286b, c0297f, arrayList2, arrayList3, hhVar3, hhVar4);
    }

    /* renamed from: a */
    private void m5148a(int i, boolean z) {
        this.f4049b.mo632a(i, z);
        this.f4058k = null;
        this.f4057j = null;
    }

    /* renamed from: a */
    private void m5149a(Bundle bundle) {
        if (this.f4056i == null) {
            this.f4056i = bundle;
        } else if (bundle != null) {
            this.f4056i.putAll(bundle);
        }
    }

    /* renamed from: a */
    private void m5152a(ConnectionResult connectionResult) {
        switch (this.f4061n) {
            case 1:
                break;
            case 2:
                this.f4049b.mo634a(connectionResult);
                break;
            default:
                Log.wtf("CompositeGAC", "Attempted to call failure callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new Exception());
                break;
        }
        m5165l();
        this.f4061n = 0;
    }

    /* renamed from: b */
    private static boolean m5156b(ConnectionResult connectionResult) {
        return connectionResult != null && connectionResult.m19505b();
    }

    /* renamed from: c */
    private boolean m5157c(C0301a<? extends ant, ? extends C0296c> c0301a) {
        C0645d a = c0301a.mo348a();
        aoi.m4689b(this.f4053f.containsKey(a), "GoogleApiClient is not configured to use the API required for this call.");
        return ((ary) this.f4053f.get(a)).equals(this.f4052e);
    }

    /* renamed from: i */
    private void m5162i() {
        this.f4058k = null;
        this.f4057j = null;
        this.f4051d.mo638a();
        this.f4052e.mo638a();
    }

    /* renamed from: j */
    private void m5163j() {
        if (arn.m5156b(this.f4057j)) {
            if (arn.m5156b(this.f4058k) || m5166m()) {
                m5164k();
            } else if (this.f4058k == null) {
            } else {
                if (this.f4061n == 1) {
                    m5165l();
                    return;
                }
                m5152a(this.f4058k);
                this.f4051d.mo643c();
            }
        } else if (this.f4057j != null && arn.m5156b(this.f4058k)) {
            this.f4052e.mo643c();
            m5152a(this.f4057j);
        } else if (this.f4057j != null && this.f4058k != null) {
            ConnectionResult connectionResult = this.f4057j;
            if (this.f4052e.f4179f < this.f4051d.f4179f) {
                connectionResult = this.f4058k;
            }
            m5152a(connectionResult);
        }
    }

    /* renamed from: k */
    private void m5164k() {
        switch (this.f4061n) {
            case 1:
                break;
            case 2:
                this.f4049b.mo633a(this.f4056i);
                break;
            default:
                Log.wtf("CompositeGAC", "Attempted to call success callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new AssertionError());
                break;
        }
        m5165l();
        this.f4061n = 0;
    }

    /* renamed from: l */
    private void m5165l() {
        for (asr u : this.f4054g) {
            u.mo329u();
        }
        this.f4054g.clear();
    }

    /* renamed from: m */
    private boolean m5166m() {
        return this.f4058k != null && this.f4058k.m19506c() == 4;
    }

    /* renamed from: n */
    private PendingIntent m5167n() {
        return this.f4055h == null ? null : PendingIntent.getActivity(this.f4048a, this.f4049b.m5356f(), this.f4055h.mo343d(), 134217728);
    }

    /* renamed from: a */
    public <A extends C0296c, R extends ant, T extends C0301a<R, A>> T mo635a(T t) {
        if (!m5157c((C0301a) t)) {
            return this.f4051d.mo635a((C0301a) t);
        }
        if (!m5166m()) {
            return this.f4052e.mo635a((C0301a) t);
        }
        t.m2699c(new Status(4, null, m5167n()));
        return t;
    }

    /* renamed from: a */
    public ConnectionResult mo636a(long j, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public ConnectionResult mo637a(ann<?> ann) {
        return ((ary) this.f4053f.get(ann.m4560c())).equals(this.f4052e) ? m5166m() ? new ConnectionResult(4, m5167n()) : this.f4052e.mo637a((ann) ann) : this.f4051d.mo637a((ann) ann);
    }

    /* renamed from: a */
    public void mo638a() {
        this.f4061n = 2;
        this.f4059l = false;
        m5162i();
    }

    /* renamed from: a */
    public void mo639a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append(str).append("authClient").println(":");
        this.f4052e.mo639a(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
        printWriter.append(str).append("anonClient").println(":");
        this.f4051d.mo639a(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
    }

    /* renamed from: a */
    public boolean mo640a(asr asr) {
        this.f4060m.lock();
        try {
            if ((mo645e() || mo644d()) && !m5181h()) {
                this.f4054g.add(asr);
                if (this.f4061n == 0) {
                    this.f4061n = 1;
                }
                this.f4058k = null;
                this.f4052e.mo638a();
                return true;
            }
            this.f4060m.unlock();
            return false;
        } finally {
            this.f4060m.unlock();
        }
    }

    /* renamed from: b */
    public <A extends C0296c, T extends C0301a<? extends ant, A>> T mo641b(T t) {
        if (!m5157c((C0301a) t)) {
            return this.f4051d.mo641b((C0301a) t);
        }
        if (!m5166m()) {
            return this.f4052e.mo641b((C0301a) t);
        }
        t.m2699c(new Status(4, null, m5167n()));
        return t;
    }

    /* renamed from: b */
    public ConnectionResult mo642b() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: c */
    public void mo643c() {
        this.f4058k = null;
        this.f4057j = null;
        this.f4061n = 0;
        this.f4051d.mo643c();
        this.f4052e.mo643c();
        m5165l();
    }

    /* renamed from: d */
    public boolean mo644d() {
        boolean z = true;
        this.f4060m.lock();
        try {
            if (!(this.f4051d.mo644d() && (m5181h() || m5166m() || this.f4061n == 1))) {
                z = false;
            }
            this.f4060m.unlock();
            return z;
        } catch (Throwable th) {
            this.f4060m.unlock();
        }
    }

    /* renamed from: e */
    public boolean mo645e() {
        this.f4060m.lock();
        try {
            boolean z = this.f4061n == 2;
            this.f4060m.unlock();
            return z;
        } catch (Throwable th) {
            this.f4060m.unlock();
        }
    }

    /* renamed from: f */
    public void mo646f() {
        this.f4051d.mo646f();
        this.f4052e.mo646f();
    }

    /* renamed from: g */
    public void mo647g() {
        this.f4060m.lock();
        try {
            boolean e = mo645e();
            this.f4052e.mo643c();
            this.f4058k = new ConnectionResult(4);
            if (e) {
                new Handler(this.f4050c).post(new C07301(this));
            } else {
                m5165l();
            }
            this.f4060m.unlock();
        } catch (Throwable th) {
            this.f4060m.unlock();
        }
    }

    /* renamed from: h */
    public boolean m5181h() {
        return this.f4052e.mo644d();
    }
}
