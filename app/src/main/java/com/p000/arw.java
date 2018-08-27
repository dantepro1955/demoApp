package com.p000;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.v4.app.FragmentActivity;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.GoogleApiClient.Builder;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.zzaaz;
import com.google.android.gms.internal.zzaaz.C0724a;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import p000.ann.C0286b;
import p000.ann.C0296c;
import p000.ann.C0297f;
import p000.ann.C0645d;
import p000.aoz.C0298a;
import p000.ari.C0301a;
import p000.ase.C0731a;

/* renamed from: arw */
public final class arw extends GoogleApiClient implements C0731a {
    /* renamed from: a */
    final Queue<C0301a<?, ?>> f4148a = new LinkedList();
    /* renamed from: b */
    zzaaz f4149b;
    /* renamed from: c */
    final Map<C0645d<?>, C0297f> f4150c;
    /* renamed from: d */
    Set<Scope> f4151d = new HashSet();
    /* renamed from: e */
    final aou f4152e;
    /* renamed from: f */
    final Map<ann<?>, Boolean> f4153f;
    /* renamed from: g */
    final C0286b<? extends avj, avk> f4154g;
    /* renamed from: h */
    Set<asv> f4155h = null;
    /* renamed from: i */
    final asw f4156i;
    /* renamed from: j */
    private final Lock f4157j;
    /* renamed from: k */
    private boolean f4158k;
    /* renamed from: l */
    private final aoz f4159l;
    /* renamed from: m */
    private ase f4160m = null;
    /* renamed from: n */
    private final int f4161n;
    /* renamed from: o */
    private final Context f4162o;
    /* renamed from: p */
    private final Looper f4163p;
    /* renamed from: q */
    private volatile boolean f4164q;
    /* renamed from: r */
    private long f4165r = 120000;
    /* renamed from: s */
    private long f4166s = 5000;
    /* renamed from: t */
    private final C0756a f4167t;
    /* renamed from: u */
    private final anj f4168u;
    /* renamed from: v */
    private final ask f4169v = new ask();
    /* renamed from: w */
    private final ArrayList<arl> f4170w;
    /* renamed from: x */
    private Integer f4171x = null;
    /* renamed from: y */
    private final C0298a f4172y = new C07521(this);

    /* renamed from: arw$1 */
    class C07521 implements C0298a {
        /* renamed from: a */
        final /* synthetic */ arw f4137a;

        C07521(arw arw) {
            this.f4137a = arw;
        }

        /* renamed from: g */
        public boolean mo685g() {
            return this.f4137a.isConnected();
        }

        /* renamed from: u */
        public Bundle mo686u() {
            return null;
        }
    }

    /* renamed from: arw$a */
    final class C0756a extends Handler {
        /* renamed from: a */
        final /* synthetic */ arw f4146a;

        C0756a(arw arw, Looper looper) {
            this.f4146a = arw;
            super(looper);
        }

        public void handleMessage(Message message) {
            switch (message.what) {
                case 1:
                    this.f4146a.m5346i();
                    return;
                case 2:
                    this.f4146a.m5345h();
                    return;
                default:
                    Log.w("GoogleApiClientImpl", "Unknown message id: " + message.what);
                    return;
            }
        }
    }

    /* renamed from: arw$b */
    static class C0757b extends C0724a {
        /* renamed from: a */
        private WeakReference<arw> f4147a;

        C0757b(arw arw) {
            this.f4147a = new WeakReference(arw);
        }

        /* renamed from: a */
        public void mo629a() {
            arw arw = (arw) this.f4147a.get();
            if (arw != null) {
                arw.m5345h();
            }
        }
    }

    public arw(Context context, Lock lock, Looper looper, aou aou, anj anj, C0286b<? extends avj, avk> c0286b, Map<ann<?>, Boolean> map, List<ConnectionCallbacks> list, List<OnConnectionFailedListener> list2, Map<C0645d<?>, C0297f> map2, int i, int i2, ArrayList<arl> arrayList, boolean z) {
        this.f4162o = context;
        this.f4157j = lock;
        this.f4158k = z;
        this.f4159l = new aoz(looper, this.f4172y);
        this.f4163p = looper;
        this.f4167t = new C0756a(this, looper);
        this.f4168u = anj;
        this.f4161n = i;
        if (this.f4161n >= 0) {
            this.f4171x = Integer.valueOf(i2);
        }
        this.f4153f = map;
        this.f4150c = map2;
        this.f4170w = arrayList;
        this.f4156i = new asw(this.f4150c);
        for (ConnectionCallbacks a : list) {
            this.f4159l.m4782a(a);
        }
        for (OnConnectionFailedListener a2 : list2) {
            this.f4159l.m4783a(a2);
        }
        this.f4152e = aou;
        this.f4154g = c0286b;
    }

    /* renamed from: a */
    public static int m5335a(Iterable<C0297f> iterable, boolean z) {
        int i = 0;
        int i2 = 0;
        for (C0297f c0297f : iterable) {
            if (c0297f.mo799i()) {
                i2 = 1;
            }
            i = c0297f.mo342c() ? 1 : i;
        }
        return i2 != 0 ? (i == 0 || !z) ? 1 : 2 : 3;
    }

    /* renamed from: a */
    static String m5336a(int i) {
        switch (i) {
            case 1:
                return "SIGN_IN_MODE_REQUIRED";
            case 2:
                return "SIGN_IN_MODE_OPTIONAL";
            case 3:
                return "SIGN_IN_MODE_NONE";
            default:
                return "UNKNOWN";
        }
    }

    /* renamed from: a */
    private void m5339a(asf asf) {
        if (this.f4161n >= 0) {
            arf.m5095a(asf).m5097a(this.f4161n);
            return;
        }
        throw new IllegalStateException("Called stopAutoManage but automatic lifecycle management is not enabled.");
    }

    /* renamed from: a */
    private void m5340a(final GoogleApiClient googleApiClient, final asu asu, final boolean z) {
        ata.f4319c.mo716a(googleApiClient).mo346a(new anu<Status>(this) {
            /* renamed from: d */
            final /* synthetic */ arw f4145d;

            /* renamed from: a */
            public /* synthetic */ void mo687a(ant ant) {
                m5333a((Status) ant);
            }

            /* renamed from: a */
            public void m5333a(Status status) {
                amw.m2747a(this.f4145d.f4162o).m2757c();
                if (status.m19519e() && this.f4145d.isConnected()) {
                    this.f4145d.reconnect();
                }
                asu.m2680a((ant) status);
                if (z) {
                    googleApiClient.disconnect();
                }
            }
        });
    }

    /* renamed from: b */
    private void m5341b(int i) {
        if (this.f4171x == null) {
            this.f4171x = Integer.valueOf(i);
        } else if (this.f4171x.intValue() != i) {
            String valueOf = String.valueOf(arw.m5336a(i));
            String valueOf2 = String.valueOf(arw.m5336a(this.f4171x.intValue()));
            throw new IllegalStateException(new StringBuilder((String.valueOf(valueOf).length() + 51) + String.valueOf(valueOf2).length()).append("Cannot use sign-in mode: ").append(valueOf).append(". Mode was already set to ").append(valueOf2).toString());
        }
        if (this.f4160m == null) {
            boolean z = false;
            boolean z2 = false;
            for (C0297f c0297f : this.f4150c.values()) {
                if (c0297f.mo799i()) {
                    z2 = true;
                }
                z = c0297f.mo342c() ? true : z;
            }
            switch (this.f4171x.intValue()) {
                case 1:
                    if (!z2) {
                        throw new IllegalStateException("SIGN_IN_MODE_REQUIRED cannot be used on a GoogleApiClient that does not contain any authenticated APIs. Use connect() instead.");
                    } else if (z) {
                        throw new IllegalStateException("Cannot use SIGN_IN_MODE_REQUIRED with GOOGLE_SIGN_IN_API. Use connect(SIGN_IN_MODE_OPTIONAL) instead.");
                    }
                    break;
                case 2:
                    if (z2) {
                        if (this.f4158k) {
                            this.f4160m = new arp(this.f4162o, this.f4157j, this.f4163p, this.f4168u, this.f4150c, this.f4152e, this.f4153f, this.f4154g, this.f4170w, this, true);
                            return;
                        } else {
                            this.f4160m = arn.m5145a(this.f4162o, this, this.f4157j, this.f4163p, this.f4168u, this.f4150c, this.f4152e, this.f4153f, this.f4154g, this.f4170w);
                            return;
                        }
                    }
                    break;
            }
            if (!this.f4158k || z) {
                this.f4160m = new ary(this.f4162o, this, this.f4157j, this.f4163p, this.f4168u, this.f4150c, this.f4152e, this.f4153f, this.f4154g, this.f4170w, this);
            } else {
                this.f4160m = new arp(this.f4162o, this.f4157j, this.f4163p, this.f4168u, this.f4150c, this.f4152e, this.f4153f, this.f4154g, this.f4170w, this, false);
            }
        }
    }

    /* renamed from: g */
    private void m5344g() {
        this.f4159l.m4784b();
        this.f4160m.mo638a();
    }

    /* renamed from: h */
    private void m5345h() {
        this.f4157j.lock();
        try {
            if (m5351a()) {
                m5344g();
            }
            this.f4157j.unlock();
        } catch (Throwable th) {
            this.f4157j.unlock();
        }
    }

    /* renamed from: i */
    private void m5346i() {
        this.f4157j.lock();
        try {
            if (m5353c()) {
                m5344g();
            }
            this.f4157j.unlock();
        } catch (Throwable th) {
            this.f4157j.unlock();
        }
    }

    /* renamed from: a */
    <C extends C0297f> C m5347a(C0645d<?> c0645d) {
        Object obj = (C0297f) this.f4150c.get(c0645d);
        aoi.m4680a(obj, (Object) "Appropriate Api was not requested.");
        return obj;
    }

    /* renamed from: a */
    public void mo632a(int i, boolean z) {
        if (i == 1 && !z) {
            m5352b();
        }
        this.f4156i.m5531b();
        this.f4159l.m4779a(i);
        this.f4159l.m4778a();
        if (i == 2) {
            m5344g();
        }
    }

    /* renamed from: a */
    public void mo633a(Bundle bundle) {
        while (!this.f4148a.isEmpty()) {
            zzb((C0301a) this.f4148a.remove());
        }
        this.f4159l.m4780a(bundle);
    }

    /* renamed from: a */
    public void mo634a(ConnectionResult connectionResult) {
        if (!this.f4168u.mo572b(this.f4162o, connectionResult.m19506c())) {
            m5353c();
        }
        if (!m5351a()) {
            this.f4159l.m4781a(connectionResult);
            this.f4159l.m4778a();
        }
    }

    /* renamed from: a */
    boolean m5351a() {
        return this.f4164q;
    }

    /* renamed from: b */
    void m5352b() {
        if (!m5351a()) {
            this.f4164q = true;
            if (this.f4149b == null) {
                this.f4149b = this.f4168u.m4538a(this.f4162o.getApplicationContext(), new C0757b(this));
            }
            this.f4167t.sendMessageDelayed(this.f4167t.obtainMessage(1), this.f4165r);
            this.f4167t.sendMessageDelayed(this.f4167t.obtainMessage(2), this.f4166s);
        }
    }

    public ConnectionResult blockingConnect() {
        boolean z = true;
        aoi.m4685a(Looper.myLooper() != Looper.getMainLooper(), (Object) "blockingConnect must not be called on the UI thread");
        this.f4157j.lock();
        try {
            if (this.f4161n >= 0) {
                if (this.f4171x == null) {
                    z = false;
                }
                aoi.m4685a(z, (Object) "Sign-in mode should have been set explicitly by auto-manage.");
            } else if (this.f4171x == null) {
                this.f4171x = Integer.valueOf(arw.m5335a(this.f4150c.values(), false));
            } else if (this.f4171x.intValue() == 2) {
                throw new IllegalStateException("Cannot call blockingConnect() when sign-in mode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
            }
            m5341b(this.f4171x.intValue());
            this.f4159l.m4784b();
            ConnectionResult b = this.f4160m.mo642b();
            return b;
        } finally {
            this.f4157j.unlock();
        }
    }

    public ConnectionResult blockingConnect(long j, TimeUnit timeUnit) {
        boolean z = false;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            z = true;
        }
        aoi.m4685a(z, (Object) "blockingConnect must not be called on the UI thread");
        aoi.m4680a((Object) timeUnit, (Object) "TimeUnit must not be null");
        this.f4157j.lock();
        try {
            if (this.f4171x == null) {
                this.f4171x = Integer.valueOf(arw.m5335a(this.f4150c.values(), false));
            } else if (this.f4171x.intValue() == 2) {
                throw new IllegalStateException("Cannot call blockingConnect() when sign-in mode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
            }
            m5341b(this.f4171x.intValue());
            this.f4159l.m4784b();
            ConnectionResult a = this.f4160m.mo636a(j, timeUnit);
            return a;
        } finally {
            this.f4157j.unlock();
        }
    }

    /* renamed from: c */
    boolean m5353c() {
        if (!m5351a()) {
            return false;
        }
        this.f4164q = false;
        this.f4167t.removeMessages(2);
        this.f4167t.removeMessages(1);
        if (this.f4149b != null) {
            this.f4149b.m19615a();
            this.f4149b = null;
        }
        return true;
    }

    public anq<Status> clearDefaultAccountAndReconnect() {
        aoi.m4685a(isConnected(), (Object) "GoogleApiClient is not connected yet.");
        aoi.m4685a(this.f4171x.intValue() != 2, (Object) "Cannot use clearDefaultAccountAndReconnect with GOOGLE_SIGN_IN_API");
        final anq asu = new asu((GoogleApiClient) this);
        if (this.f4150c.containsKey(ata.f4317a)) {
            m5340a(this, asu, false);
        } else {
            final AtomicReference atomicReference = new AtomicReference();
            GoogleApiClient build = new Builder(this.f4162o).addApi(ata.f4318b).addConnectionCallbacks(new ConnectionCallbacks(this) {
                /* renamed from: c */
                final /* synthetic */ arw f4140c;

                public void onConnected(Bundle bundle) {
                    this.f4140c.m5340a((GoogleApiClient) atomicReference.get(), asu, true);
                }

                public void onConnectionSuspended(int i) {
                }
            }).addOnConnectionFailedListener(new OnConnectionFailedListener(this) {
                public void onConnectionFailed(ConnectionResult connectionResult) {
                    asu.m2680a(new Status(8));
                }
            }).setHandler(this.f4167t).build();
            atomicReference.set(build);
            build.connect();
        }
        return asu;
    }

    public void connect() {
        boolean z = false;
        this.f4157j.lock();
        try {
            if (this.f4161n >= 0) {
                if (this.f4171x != null) {
                    z = true;
                }
                aoi.m4685a(z, (Object) "Sign-in mode should have been set explicitly by auto-manage.");
            } else if (this.f4171x == null) {
                this.f4171x = Integer.valueOf(arw.m5335a(this.f4150c.values(), false));
            } else if (this.f4171x.intValue() == 2) {
                throw new IllegalStateException("Cannot call connect() when SignInMode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
            }
            connect(this.f4171x.intValue());
        } finally {
            this.f4157j.unlock();
        }
    }

    public void connect(int i) {
        boolean z = true;
        this.f4157j.lock();
        if (!(i == 3 || i == 1 || i == 2)) {
            z = false;
        }
        try {
            aoi.m4689b(z, "Illegal sign-in mode: " + i);
            m5341b(i);
            m5344g();
        } finally {
            this.f4157j.unlock();
        }
    }

    /* renamed from: d */
    boolean m5354d() {
        boolean z = false;
        this.f4157j.lock();
        try {
            if (this.f4155h != null) {
                if (!this.f4155h.isEmpty()) {
                    z = true;
                }
                this.f4157j.unlock();
            }
            return z;
        } finally {
            this.f4157j.unlock();
        }
    }

    public void disconnect() {
        this.f4157j.lock();
        try {
            this.f4156i.m5528a();
            if (this.f4160m != null) {
                this.f4160m.mo643c();
            }
            this.f4169v.m5486a();
            for (C0301a c0301a : this.f4148a) {
                c0301a.m2682a(null);
                c0301a.m2687e();
            }
            this.f4148a.clear();
            if (this.f4160m != null) {
                m5353c();
                this.f4159l.m4778a();
                this.f4157j.unlock();
            }
        } finally {
            this.f4157j.unlock();
        }
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append(str).append("mContext=").println(this.f4162o);
        printWriter.append(str).append("mResuming=").print(this.f4164q);
        printWriter.append(" mWorkQueue.size()=").print(this.f4148a.size());
        this.f4156i.m5530a(printWriter);
        if (this.f4160m != null) {
            this.f4160m.mo639a(str, fileDescriptor, printWriter, strArr);
        }
    }

    /* renamed from: e */
    String m5355e() {
        Writer stringWriter = new StringWriter();
        dump("", null, new PrintWriter(stringWriter), null);
        return stringWriter.toString();
    }

    /* renamed from: f */
    public int m5356f() {
        return System.identityHashCode(this);
    }

    public ConnectionResult getConnectionResult(ann<?> ann) {
        this.f4157j.lock();
        try {
            if (!isConnected() && !m5351a()) {
                throw new IllegalStateException("Cannot invoke getConnectionResult unless GoogleApiClient is connected");
            } else if (this.f4150c.containsKey(ann.m4560c())) {
                ConnectionResult a = this.f4160m.mo637a((ann) ann);
                if (a != null) {
                    this.f4157j.unlock();
                } else if (m5351a()) {
                    a = ConnectionResult.f14748a;
                } else {
                    Log.w("GoogleApiClientImpl", m5355e());
                    Log.wtf("GoogleApiClientImpl", String.valueOf(ann.m4561d()).concat(" requested in getConnectionResult is not connected but is not present in the failed  connections map"), new Exception());
                    a = new ConnectionResult(8, null);
                    this.f4157j.unlock();
                }
                return a;
            } else {
                throw new IllegalArgumentException(String.valueOf(ann.m4561d()).concat(" was never registered with GoogleApiClient"));
            }
        } finally {
            this.f4157j.unlock();
        }
    }

    public Context getContext() {
        return this.f4162o;
    }

    public Looper getLooper() {
        return this.f4163p;
    }

    public boolean hasConnectedApi(ann<?> ann) {
        if (!isConnected()) {
            return false;
        }
        C0297f c0297f = (C0297f) this.f4150c.get(ann.m4560c());
        boolean z = c0297f != null && c0297f.m2647g();
        return z;
    }

    public boolean isConnected() {
        return this.f4160m != null && this.f4160m.mo644d();
    }

    public boolean isConnecting() {
        return this.f4160m != null && this.f4160m.mo645e();
    }

    public boolean isConnectionCallbacksRegistered(ConnectionCallbacks connectionCallbacks) {
        return this.f4159l.m4785b(connectionCallbacks);
    }

    public boolean isConnectionFailedListenerRegistered(OnConnectionFailedListener onConnectionFailedListener) {
        return this.f4159l.m4786b(onConnectionFailedListener);
    }

    public void reconnect() {
        disconnect();
        connect();
    }

    public void registerConnectionCallbacks(ConnectionCallbacks connectionCallbacks) {
        this.f4159l.m4782a(connectionCallbacks);
    }

    public void registerConnectionFailedListener(OnConnectionFailedListener onConnectionFailedListener) {
        this.f4159l.m4783a(onConnectionFailedListener);
    }

    public void stopAutoManage(FragmentActivity fragmentActivity) {
        m5339a(new asf(fragmentActivity));
    }

    public void unregisterConnectionCallbacks(ConnectionCallbacks connectionCallbacks) {
        this.f4159l.m4787c(connectionCallbacks);
    }

    public void unregisterConnectionFailedListener(OnConnectionFailedListener onConnectionFailedListener) {
        this.f4159l.m4788c(onConnectionFailedListener);
    }

    public <C extends C0297f> C zza(C0645d<C> c0645d) {
        Object obj = (C0297f) this.f4150c.get(c0645d);
        aoi.m4680a(obj, (Object) "Appropriate Api was not requested.");
        return obj;
    }

    public <A extends C0296c, R extends ant, T extends C0301a<R, A>> T zza(T t) {
        aoi.m4689b(t.mo348a() != null, "This task can not be enqueued (it's probably a Batch or malformed)");
        boolean containsKey = this.f4150c.containsKey(t.mo348a());
        String d = t.mo350b() != null ? t.mo350b().m4561d() : "the API";
        aoi.m4689b(containsKey, new StringBuilder(String.valueOf(d).length() + 65).append("GoogleApiClient is not configured to use ").append(d).append(" required for this call.").toString());
        this.f4157j.lock();
        try {
            if (this.f4160m == null) {
                this.f4148a.add(t);
            } else {
                t = this.f4160m.mo635a((C0301a) t);
                this.f4157j.unlock();
            }
            return t;
        } finally {
            this.f4157j.unlock();
        }
    }

    public void zza(asv asv) {
        this.f4157j.lock();
        try {
            if (this.f4155h == null) {
                this.f4155h = new HashSet();
            }
            this.f4155h.add(asv);
        } finally {
            this.f4157j.unlock();
        }
    }

    public boolean zza(ann<?> ann) {
        return this.f4150c.containsKey(ann.m4560c());
    }

    public boolean zza(asr asr) {
        return this.f4160m != null && this.f4160m.mo640a(asr);
    }

    public <A extends C0296c, T extends C0301a<? extends ant, A>> T zzb(T t) {
        aoi.m4689b(t.mo348a() != null, "This task can not be executed (it's probably a Batch or malformed)");
        boolean containsKey = this.f4150c.containsKey(t.mo348a());
        String d = t.mo350b() != null ? t.mo350b().m4561d() : "the API";
        aoi.m4689b(containsKey, new StringBuilder(String.valueOf(d).length() + 65).append("GoogleApiClient is not configured to use ").append(d).append(" required for this call.").toString());
        this.f4157j.lock();
        try {
            if (this.f4160m == null) {
                throw new IllegalStateException("GoogleApiClient is not connected yet.");
            }
            if (m5351a()) {
                this.f4148a.add(t);
                while (!this.f4148a.isEmpty()) {
                    ark ark = (C0301a) this.f4148a.remove();
                    this.f4156i.m5529a(ark);
                    ark.m2699c(Status.f14763c);
                }
            } else {
                t = this.f4160m.mo641b(t);
                this.f4157j.unlock();
            }
            return t;
        } finally {
            this.f4157j.unlock();
        }
    }

    public void zzb(asv asv) {
        this.f4157j.lock();
        try {
            if (this.f4155h == null) {
                Log.wtf("GoogleApiClientImpl", "Attempted to remove pending transform when no transforms are registered.", new Exception());
            } else if (!this.f4155h.remove(asv)) {
                Log.wtf("GoogleApiClientImpl", "Failed to remove pending transform - this may lead to memory leaks!", new Exception());
            } else if (!m5354d()) {
                this.f4160m.mo646f();
            }
            this.f4157j.unlock();
        } catch (Throwable th) {
            this.f4157j.unlock();
        }
    }

    public <L> asj<L> zzr(L l) {
        this.f4157j.lock();
        try {
            asj<L> a = this.f4169v.m5484a(l, this.f4163p);
            return a;
        } finally {
            this.f4157j.unlock();
        }
    }

    public void zzvn() {
        if (this.f4160m != null) {
            this.f4160m.mo647g();
        }
    }
}
