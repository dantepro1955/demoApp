package com.p000;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.zzaf;
import com.google.android.gms.internal.zzbaw;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;
import p000.ann.C0286b;
import p000.ann.C0296c;
import p000.ann.C0297f;
import p000.ann.C0645d;
import p000.aot.C0665f;
import p000.aou.C0672a;
import p000.ari.C0301a;
import p000.ary.C0738a;

/* renamed from: aru */
public class aru implements arx {
    /* renamed from: a */
    private final ary f4115a;
    /* renamed from: b */
    private final Lock f4116b;
    /* renamed from: c */
    private final Context f4117c;
    /* renamed from: d */
    private final aqm f4118d;
    /* renamed from: e */
    private ConnectionResult f4119e;
    /* renamed from: f */
    private int f4120f;
    /* renamed from: g */
    private int f4121g = 0;
    /* renamed from: h */
    private int f4122h;
    /* renamed from: i */
    private final Bundle f4123i = new Bundle();
    /* renamed from: j */
    private final Set<C0645d> f4124j = new HashSet();
    /* renamed from: k */
    private avj f4125k;
    /* renamed from: l */
    private boolean f4126l;
    /* renamed from: m */
    private boolean f4127m;
    /* renamed from: n */
    private boolean f4128n;
    /* renamed from: o */
    private ape f4129o;
    /* renamed from: p */
    private boolean f4130p;
    /* renamed from: q */
    private boolean f4131q;
    /* renamed from: r */
    private final aou f4132r;
    /* renamed from: s */
    private final Map<ann<?>, Boolean> f4133s;
    /* renamed from: t */
    private final C0286b<? extends avj, avk> f4134t;
    /* renamed from: u */
    private ArrayList<Future<?>> f4135u = new ArrayList();

    /* renamed from: aru$1 */
    class C07411 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ aru f4099a;

        C07411(aru aru) {
            this.f4099a = aru;
        }

        public void run() {
            this.f4099a.f4118d.m4529d(this.f4099a.f4117c);
        }
    }

    /* renamed from: aru$a */
    static class C0742a implements C0665f {
        /* renamed from: a */
        private final WeakReference<aru> f4100a;
        /* renamed from: b */
        private final ann<?> f4101b;
        /* renamed from: c */
        private final boolean f4102c;

        public C0742a(aru aru, ann<?> ann, boolean z) {
            this.f4100a = new WeakReference(aru);
            this.f4101b = ann;
            this.f4102c = z;
        }

        /* renamed from: a */
        public void mo593a(ConnectionResult connectionResult) {
            boolean z = false;
            aru aru = (aru) this.f4100a.get();
            if (aru != null) {
                if (Looper.myLooper() == aru.f4115a.f4180g.getLooper()) {
                    z = true;
                }
                aoi.m4685a(z, (Object) "onReportServiceBinding must be called on the GoogleApiClient handler thread");
                aru.f4116b.lock();
                try {
                    if (aru.m5293b(0)) {
                        if (!connectionResult.m19505b()) {
                            aru.m5292b(connectionResult, this.f4101b, this.f4102c);
                        }
                        if (aru.m5300d()) {
                            aru.m5301e();
                        }
                        aru.f4116b.unlock();
                    }
                } finally {
                    aru.f4116b.unlock();
                }
            }
        }
    }

    /* renamed from: aru$f */
    abstract class C0745f implements Runnable {
        /* renamed from: b */
        final /* synthetic */ aru f4106b;

        private C0745f(aru aru) {
            this.f4106b = aru;
        }

        /* renamed from: a */
        protected abstract void mo679a();

        public void run() {
            this.f4106b.f4116b.lock();
            try {
                if (!Thread.interrupted()) {
                    mo679a();
                    this.f4106b.f4116b.unlock();
                }
            } catch (RuntimeException e) {
                this.f4106b.f4115a.m5366a(e);
            } finally {
                this.f4106b.f4116b.unlock();
            }
        }
    }

    /* renamed from: aru$b */
    class C0746b extends C0745f {
        /* renamed from: a */
        final /* synthetic */ aru f4107a;
        /* renamed from: c */
        private final Map<C0297f, C0742a> f4108c;

        public C0746b(aru aru, Map<C0297f, C0742a> map) {
            this.f4107a = aru;
            super();
            this.f4108c = map;
        }

        /* renamed from: a */
        public void mo679a() {
            int i;
            int i2 = 1;
            int i3 = 0;
            int i4 = 1;
            int i5 = 0;
            for (C0297f c0297f : this.f4108c.keySet()) {
                if (!c0297f.m2650j()) {
                    i = 0;
                    i4 = i5;
                } else if (!((C0742a) this.f4108c.get(c0297f)).f4102c) {
                    i = 1;
                    break;
                } else {
                    i = i4;
                    i4 = 1;
                }
                i5 = i4;
                i4 = i;
            }
            i2 = i5;
            i = 0;
            if (i2 != 0) {
                i3 = this.f4107a.f4118d.mo565a(this.f4107a.f4117c);
            }
            if (i3 == 0 || (r0 == 0 && i4 == 0)) {
                if (this.f4107a.f4127m) {
                    this.f4107a.f4125k.mo800l();
                }
                for (C0297f c0297f2 : this.f4108c.keySet()) {
                    final C0665f c0665f = (C0665f) this.f4108c.get(c0297f2);
                    if (!c0297f2.m2650j() || i3 == 0) {
                        c0297f2.m2641a(c0665f);
                    } else {
                        this.f4107a.f4115a.m5363a(new C0738a(this, this.f4107a) {
                            /* renamed from: a */
                            public void mo670a() {
                                c0665f.mo593a(new ConnectionResult(16, null));
                            }
                        });
                    }
                }
                return;
            }
            final ConnectionResult connectionResult = new ConnectionResult(i3, null);
            this.f4107a.f4115a.m5363a(new C0738a(this, this.f4107a) {
                /* renamed from: b */
                final /* synthetic */ C0746b f4104b;

                /* renamed from: a */
                public void mo670a() {
                    this.f4104b.f4107a.m5298c(connectionResult);
                }
            });
        }
    }

    /* renamed from: aru$c */
    class C0747c extends C0745f {
        /* renamed from: a */
        final /* synthetic */ aru f4109a;
        /* renamed from: c */
        private final ArrayList<C0297f> f4110c;

        public C0747c(aru aru, ArrayList<C0297f> arrayList) {
            this.f4109a = aru;
            super();
            this.f4110c = arrayList;
        }

        /* renamed from: a */
        public void mo679a() {
            this.f4109a.f4115a.f4180g.f4151d = this.f4109a.m5311j();
            Iterator it = this.f4110c.iterator();
            while (it.hasNext()) {
                ((C0297f) it.next()).m2642a(this.f4109a.f4129o, this.f4109a.f4115a.f4180g.f4151d);
            }
        }
    }

    /* renamed from: aru$d */
    static class C0750d extends avm {
        /* renamed from: a */
        private final WeakReference<aru> f4113a;

        C0750d(aru aru) {
            this.f4113a = new WeakReference(aru);
        }

        /* renamed from: a */
        public void mo683a(final zzbaw zzbaw) {
            final aru aru = (aru) this.f4113a.get();
            if (aru != null) {
                aru.f4115a.m5363a(new C0738a(this, aru) {
                    /* renamed from: a */
                    public void mo670a() {
                        aru.m5286a(zzbaw);
                    }
                });
            }
        }
    }

    /* renamed from: aru$e */
    class C0751e implements ConnectionCallbacks, OnConnectionFailedListener {
        /* renamed from: a */
        final /* synthetic */ aru f4114a;

        private C0751e(aru aru) {
            this.f4114a = aru;
        }

        public void onConnected(Bundle bundle) {
            this.f4114a.f4125k.mo798a(new C0750d(this.f4114a));
        }

        public void onConnectionFailed(ConnectionResult connectionResult) {
            this.f4114a.f4116b.lock();
            try {
                if (this.f4114a.m5295b(connectionResult)) {
                    this.f4114a.m5308h();
                    this.f4114a.m5301e();
                } else {
                    this.f4114a.m5298c(connectionResult);
                }
                this.f4114a.f4116b.unlock();
            } catch (Throwable th) {
                this.f4114a.f4116b.unlock();
            }
        }

        public void onConnectionSuspended(int i) {
        }
    }

    public aru(ary ary, aou aou, Map<ann<?>, Boolean> map, aqm aqm, C0286b<? extends avj, avk> c0286b, Lock lock, Context context) {
        this.f4115a = ary;
        this.f4132r = aou;
        this.f4133s = map;
        this.f4118d = aqm;
        this.f4134t = c0286b;
        this.f4116b = lock;
        this.f4117c = context;
    }

    /* renamed from: a */
    private void m5286a(zzbaw zzbaw) {
        if (m5293b(0)) {
            ConnectionResult a = zzbaw.m19657a();
            if (a.m19505b()) {
                zzaf b = zzbaw.m19658b();
                ConnectionResult b2 = b.m19526b();
                if (b2.m19505b()) {
                    this.f4128n = true;
                    this.f4129o = b.m19525a();
                    this.f4130p = b.m19527c();
                    this.f4131q = b.m19528d();
                    m5301e();
                    return;
                }
                String valueOf = String.valueOf(b2);
                Log.wtf("GoogleApiClientConnecting", new StringBuilder(String.valueOf(valueOf).length() + 48).append("Sign-in succeeded with resolve account failure: ").append(valueOf).toString(), new Exception());
                m5298c(b2);
            } else if (m5295b(a)) {
                m5308h();
                m5301e();
            } else {
                m5298c(a);
            }
        }
    }

    /* renamed from: a */
    private void m5287a(boolean z) {
        if (this.f4125k != null) {
            if (this.f4125k.m2647g() && z) {
                this.f4125k.mo344e();
            }
            this.f4125k.mo779f();
            this.f4129o = null;
        }
    }

    /* renamed from: a */
    private boolean m5288a(int i, boolean z, ConnectionResult connectionResult) {
        return (!z || m5290a(connectionResult)) ? this.f4119e == null || i < this.f4120f : false;
    }

    /* renamed from: a */
    private boolean m5290a(ConnectionResult connectionResult) {
        return connectionResult.m19504a() || this.f4118d.mo570b(connectionResult.m19506c()) != null;
    }

    /* renamed from: b */
    private void m5292b(ConnectionResult connectionResult, ann<?> ann, boolean z) {
        int a = ann.m4558a().m2531a();
        if (m5288a(a, z, connectionResult)) {
            this.f4119e = connectionResult;
            this.f4120f = a;
        }
        this.f4115a.f4175b.put(ann.m4560c(), connectionResult);
    }

    /* renamed from: b */
    private boolean m5293b(int i) {
        if (this.f4121g == i) {
            return true;
        }
        Log.w("GoogleApiClientConnecting", this.f4115a.f4180g.m5355e());
        String valueOf = String.valueOf(this);
        Log.w("GoogleApiClientConnecting", new StringBuilder(String.valueOf(valueOf).length() + 23).append("Unexpected callback in ").append(valueOf).toString());
        Log.w("GoogleApiClientConnecting", "mRemainingConnections=" + this.f4122h);
        valueOf = String.valueOf(m5296c(this.f4121g));
        String valueOf2 = String.valueOf(m5296c(i));
        Log.wtf("GoogleApiClientConnecting", new StringBuilder((String.valueOf(valueOf).length() + 70) + String.valueOf(valueOf2).length()).append("GoogleApiClient connecting is in step ").append(valueOf).append(" but received callback for step ").append(valueOf2).toString(), new Exception());
        m5298c(new ConnectionResult(8, null));
        return false;
    }

    /* renamed from: b */
    private boolean m5295b(ConnectionResult connectionResult) {
        return this.f4126l && !connectionResult.m19504a();
    }

    /* renamed from: c */
    private String m5296c(int i) {
        switch (i) {
            case 0:
                return "STEP_SERVICE_BINDINGS_AND_SIGN_IN";
            case 1:
                return "STEP_GETTING_REMOTE_SERVICE";
            default:
                return "UNKNOWN";
        }
    }

    /* renamed from: c */
    private void m5298c(ConnectionResult connectionResult) {
        m5309i();
        m5287a(!connectionResult.m19504a());
        this.f4115a.m5364a(connectionResult);
        this.f4115a.f4181h.mo634a(connectionResult);
    }

    /* renamed from: d */
    private boolean m5300d() {
        this.f4122h--;
        if (this.f4122h > 0) {
            return false;
        }
        if (this.f4122h < 0) {
            Log.w("GoogleApiClientConnecting", this.f4115a.f4180g.m5355e());
            Log.wtf("GoogleApiClientConnecting", "GoogleApiClient received too many callbacks for the given step. Clients may be in an unexpected state; GoogleApiClient will now disconnect.", new Exception());
            m5298c(new ConnectionResult(8, null));
            return false;
        } else if (this.f4119e == null) {
            return true;
        } else {
            this.f4115a.f4179f = this.f4120f;
            m5298c(this.f4119e);
            return false;
        }
    }

    /* renamed from: e */
    private void m5301e() {
        if (this.f4122h == 0) {
            if (!this.f4127m || this.f4128n) {
                m5304f();
            }
        }
    }

    /* renamed from: f */
    private void m5304f() {
        ArrayList arrayList = new ArrayList();
        this.f4121g = 1;
        this.f4122h = this.f4115a.f4174a.size();
        for (C0645d c0645d : this.f4115a.f4174a.keySet()) {
            if (!this.f4115a.f4175b.containsKey(c0645d)) {
                arrayList.add((C0297f) this.f4115a.f4174a.get(c0645d));
            } else if (m5300d()) {
                m5306g();
            }
        }
        if (!arrayList.isEmpty()) {
            this.f4135u.add(arz.m5379a().submit(new C0747c(this, arrayList)));
        }
    }

    /* renamed from: g */
    private void m5306g() {
        this.f4115a.m5377i();
        arz.m5379a().execute(new C07411(this));
        if (this.f4125k != null) {
            if (this.f4130p) {
                this.f4125k.mo797a(this.f4129o, this.f4131q);
            }
            m5287a(false);
        }
        for (C0645d c0645d : this.f4115a.f4175b.keySet()) {
            ((C0297f) this.f4115a.f4174a.get(c0645d)).mo779f();
        }
        this.f4115a.f4181h.mo633a(this.f4123i.isEmpty() ? null : this.f4123i);
    }

    /* renamed from: h */
    private void m5308h() {
        this.f4127m = false;
        this.f4115a.f4180g.f4151d = Collections.emptySet();
        for (C0645d c0645d : this.f4124j) {
            if (!this.f4115a.f4175b.containsKey(c0645d)) {
                this.f4115a.f4175b.put(c0645d, new ConnectionResult(17, null));
            }
        }
    }

    /* renamed from: i */
    private void m5309i() {
        Iterator it = this.f4135u.iterator();
        while (it.hasNext()) {
            ((Future) it.next()).cancel(true);
        }
        this.f4135u.clear();
    }

    /* renamed from: j */
    private Set<Scope> m5311j() {
        if (this.f4132r == null) {
            return Collections.emptySet();
        }
        Set<Scope> hashSet = new HashSet(this.f4132r.m4750d());
        Map f = this.f4132r.m4752f();
        for (ann ann : f.keySet()) {
            if (!this.f4115a.f4175b.containsKey(ann.m4560c())) {
                hashSet.addAll(((C0672a) f.get(ann)).f3841a);
            }
        }
        return hashSet;
    }

    /* renamed from: a */
    public <A extends C0296c, R extends ant, T extends C0301a<R, A>> T mo671a(T t) {
        this.f4115a.f4180g.f4148a.add(t);
        return t;
    }

    /* renamed from: a */
    public void mo672a() {
        this.f4115a.f4175b.clear();
        this.f4127m = false;
        this.f4119e = null;
        this.f4121g = 0;
        this.f4126l = true;
        this.f4128n = false;
        this.f4130p = false;
        Map hashMap = new HashMap();
        int i = 0;
        for (ann ann : this.f4133s.keySet()) {
            C0297f c0297f = (C0297f) this.f4115a.f4174a.get(ann.m4560c());
            int i2 = (ann.m4558a().m2531a() == 1 ? 1 : 0) | i;
            boolean booleanValue = ((Boolean) this.f4133s.get(ann)).booleanValue();
            if (c0297f.mo799i()) {
                this.f4127m = true;
                if (booleanValue) {
                    this.f4124j.add(ann.m4560c());
                } else {
                    this.f4126l = false;
                }
            }
            hashMap.put(c0297f, new C0742a(this, ann, booleanValue));
            i = i2;
        }
        if (i != 0) {
            this.f4127m = false;
        }
        if (this.f4127m) {
            this.f4132r.m4747a(Integer.valueOf(this.f4115a.f4180g.m5356f()));
            ConnectionCallbacks c0751e = new C0751e();
            this.f4125k = (avj) this.f4134t.mo323a(this.f4117c, this.f4115a.f4180g.getLooper(), this.f4132r, this.f4132r.m4755i(), c0751e, c0751e);
        }
        this.f4122h = this.f4115a.f4174a.size();
        this.f4135u.add(arz.m5379a().submit(new C0746b(this, hashMap)));
    }

    /* renamed from: a */
    public void mo673a(int i) {
        m5298c(new ConnectionResult(8, null));
    }

    /* renamed from: a */
    public void mo674a(Bundle bundle) {
        if (m5293b(1)) {
            if (bundle != null) {
                this.f4123i.putAll(bundle);
            }
            if (m5300d()) {
                m5306g();
            }
        }
    }

    /* renamed from: a */
    public void mo675a(ConnectionResult connectionResult, ann<?> ann, boolean z) {
        if (m5293b(1)) {
            m5292b(connectionResult, ann, z);
            if (m5300d()) {
                m5306g();
            }
        }
    }

    /* renamed from: b */
    public <A extends C0296c, T extends C0301a<? extends ant, A>> T mo676b(T t) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    /* renamed from: b */
    public boolean mo677b() {
        m5309i();
        m5287a(true);
        this.f4115a.m5364a(null);
        return true;
    }

    /* renamed from: c */
    public void mo678c() {
    }
}
