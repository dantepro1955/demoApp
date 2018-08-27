package com.p000;

import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import p000.ann.C0290a;
import p000.ann.C0296c;
import p000.ann.C0297f;
import p000.aot.C0665f;
import p000.arh.C0722a;
import p000.ari.C0301a;
import p000.asj.C0771b;
import p000.ass.C0765a;
import p000.bpq.C1405b;
import p000.bpq.C1406c;

/* renamed from: asa */
public class asa implements Callback {
    /* renamed from: a */
    public static final Status f4220a = new Status(4, "Sign-out occurred while this API call was in progress.");
    /* renamed from: b */
    private static final Status f4221b = new Status(4, "The user must be signed in to make this API call.");
    /* renamed from: f */
    private static final Object f4222f = new Object();
    /* renamed from: g */
    private static asa f4223g;
    /* renamed from: c */
    private long f4224c = 5000;
    /* renamed from: d */
    private long f4225d = 120000;
    /* renamed from: e */
    private long f4226e = 10000;
    /* renamed from: h */
    private final Context f4227h;
    /* renamed from: i */
    private final anj f4228i;
    /* renamed from: j */
    private int f4229j = -1;
    /* renamed from: k */
    private final AtomicInteger f4230k = new AtomicInteger(1);
    /* renamed from: l */
    private final AtomicInteger f4231l = new AtomicInteger(0);
    /* renamed from: m */
    private final Map<bps<?>, C0763a<?>> f4232m = new ConcurrentHashMap(5, 0.75f, 1);
    /* renamed from: n */
    private arr f4233n = null;
    /* renamed from: o */
    private final Set<bps<?>> f4234o = new apr();
    /* renamed from: p */
    private final Set<bps<?>> f4235p = new apr();
    /* renamed from: q */
    private final Handler f4236q;

    /* renamed from: asa$1 */
    class C07591 implements C0722a {
        /* renamed from: a */
        final /* synthetic */ asa f4195a;

        C07591(asa asa) {
            this.f4195a = asa;
        }

        /* renamed from: a */
        public void mo701a(boolean z) {
            this.f4195a.f4236q.sendMessage(this.f4195a.f4236q.obtainMessage(1, Boolean.valueOf(z)));
        }
    }

    /* renamed from: asa$a */
    public class C0763a<O extends C0290a> implements arm, ConnectionCallbacks, OnConnectionFailedListener {
        /* renamed from: a */
        final /* synthetic */ asa f4200a;
        /* renamed from: b */
        private final Queue<bpq> f4201b = new LinkedList();
        /* renamed from: c */
        private final C0297f f4202c;
        /* renamed from: d */
        private final C0296c f4203d;
        /* renamed from: e */
        private final bps<O> f4204e;
        /* renamed from: f */
        private final arq f4205f;
        /* renamed from: g */
        private final Set<arg> f4206g = new HashSet();
        /* renamed from: h */
        private final Map<C0771b<?>, aso> f4207h = new HashMap();
        /* renamed from: i */
        private final int f4208i;
        /* renamed from: j */
        private final ass f4209j;
        /* renamed from: k */
        private boolean f4210k;
        /* renamed from: l */
        private ConnectionResult f4211l = null;

        /* renamed from: asa$a$1 */
        class C07601 implements Runnable {
            /* renamed from: a */
            final /* synthetic */ C0763a f4196a;

            C07601(C0763a c0763a) {
                this.f4196a = c0763a;
            }

            public void run() {
                this.f4196a.m5391n();
            }
        }

        /* renamed from: asa$a$2 */
        class C07612 implements Runnable {
            /* renamed from: a */
            final /* synthetic */ C0763a f4197a;

            C07612(C0763a c0763a) {
                this.f4197a = c0763a;
            }

            public void run() {
                this.f4197a.m5392o();
            }
        }

        public C0763a(asa asa, aoa<O> aoa) {
            this.f4200a = asa;
            this.f4202c = aoa.mo648a(asa.f4236q.getLooper(), this);
            if (this.f4202c instanceof aon) {
                this.f4203d = ((aon) this.f4202c).mo344e();
            } else {
                this.f4203d = this.f4202c;
            }
            this.f4204e = aoa.m4604b();
            this.f4205f = new arq();
            this.f4208i = aoa.m4605c();
            if (this.f4202c.mo799i()) {
                this.f4209j = aoa.mo649a(asa.f4227h, asa.f4236q);
            } else {
                this.f4209j = null;
            }
        }

        /* renamed from: b */
        private void m5389b(bpq bpq) {
            bpq.mo1395a(this.f4205f, m5411k());
            try {
                bpq.mo1396a(this);
            } catch (DeadObjectException e) {
                onConnectionSuspended(1);
                this.f4202c.mo779f();
            }
        }

        /* renamed from: b */
        private void m5390b(ConnectionResult connectionResult) {
            for (arg a : this.f4206g) {
                a.m5104a(this.f4204e, connectionResult);
            }
            this.f4206g.clear();
        }

        /* renamed from: n */
        private void m5391n() {
            m5404d();
            m5390b(ConnectionResult.f14748a);
            m5394q();
            Iterator it = this.f4207h.values().iterator();
            while (it.hasNext()) {
                it.next();
                try {
                    bsk bsk = new bsk();
                } catch (DeadObjectException e) {
                    onConnectionSuspended(1);
                    this.f4202c.mo779f();
                } catch (RemoteException e2) {
                }
            }
            m5393p();
            m5395r();
        }

        /* renamed from: o */
        private void m5392o() {
            m5404d();
            this.f4210k = true;
            this.f4205f.m5233c();
            this.f4200a.f4236q.sendMessageDelayed(Message.obtain(this.f4200a.f4236q, 9, this.f4204e), this.f4200a.f4224c);
            this.f4200a.f4236q.sendMessageDelayed(Message.obtain(this.f4200a.f4236q, 11, this.f4204e), this.f4200a.f4225d);
            this.f4200a.f4229j = -1;
        }

        /* renamed from: p */
        private void m5393p() {
            while (this.f4202c.m2647g() && !this.f4201b.isEmpty()) {
                m5389b((bpq) this.f4201b.remove());
            }
        }

        /* renamed from: q */
        private void m5394q() {
            if (this.f4210k) {
                this.f4200a.f4236q.removeMessages(11, this.f4204e);
                this.f4200a.f4236q.removeMessages(9, this.f4204e);
                this.f4210k = false;
            }
        }

        /* renamed from: r */
        private void m5395r() {
            this.f4200a.f4236q.removeMessages(12, this.f4204e);
            this.f4200a.f4236q.sendMessageDelayed(this.f4200a.f4236q.obtainMessage(12, this.f4204e), this.f4200a.f4226e);
        }

        /* renamed from: a */
        public void m5396a() {
            aoi.m4683a(this.f4200a.f4236q);
            m5401a(asa.f4220a);
            this.f4205f.m5232b();
            for (C0771b c1406c : this.f4207h.keySet()) {
                m5398a(new C1406c(c1406c, new bsk()));
            }
            m5390b(new ConnectionResult(4));
            this.f4202c.mo779f();
        }

        /* renamed from: a */
        public void m5397a(arg arg) {
            aoi.m4683a(this.f4200a.f4236q);
            this.f4206g.add(arg);
        }

        /* renamed from: a */
        public void m5398a(bpq bpq) {
            aoi.m4683a(this.f4200a.f4236q);
            if (this.f4202c.m2647g()) {
                m5389b(bpq);
                m5395r();
                return;
            }
            this.f4201b.add(bpq);
            if (this.f4211l == null || !this.f4211l.m19504a()) {
                m5409i();
            } else {
                onConnectionFailed(this.f4211l);
            }
        }

        /* renamed from: a */
        public void m5399a(ConnectionResult connectionResult) {
            aoi.m4683a(this.f4200a.f4236q);
            this.f4202c.mo779f();
            onConnectionFailed(connectionResult);
        }

        /* renamed from: a */
        public void mo700a(final ConnectionResult connectionResult, ann<?> ann, boolean z) {
            if (Looper.myLooper() == this.f4200a.f4236q.getLooper()) {
                onConnectionFailed(connectionResult);
            } else {
                this.f4200a.f4236q.post(new Runnable(this) {
                    /* renamed from: b */
                    final /* synthetic */ C0763a f4199b;

                    public void run() {
                        this.f4199b.onConnectionFailed(connectionResult);
                    }
                });
            }
        }

        /* renamed from: a */
        public void m5401a(Status status) {
            aoi.m4683a(this.f4200a.f4236q);
            for (bpq a : this.f4201b) {
                a.mo1397a(status);
            }
            this.f4201b.clear();
        }

        /* renamed from: b */
        public C0297f m5402b() {
            return this.f4202c;
        }

        /* renamed from: c */
        public Map<C0771b<?>, aso> m5403c() {
            return this.f4207h;
        }

        /* renamed from: d */
        public void m5404d() {
            aoi.m4683a(this.f4200a.f4236q);
            this.f4211l = null;
        }

        /* renamed from: e */
        public ConnectionResult m5405e() {
            aoi.m4683a(this.f4200a.f4236q);
            return this.f4211l;
        }

        /* renamed from: f */
        public void m5406f() {
            aoi.m4683a(this.f4200a.f4236q);
            if (this.f4210k) {
                m5409i();
            }
        }

        /* renamed from: g */
        public void m5407g() {
            aoi.m4683a(this.f4200a.f4236q);
            if (this.f4210k) {
                m5394q();
                m5401a(this.f4200a.f4228i.mo565a(this.f4200a.f4227h) == 18 ? new Status(8, "Connection timed out while waiting for Google Play services update to complete.") : new Status(8, "API failed to connect while resuming due to an unknown error."));
                this.f4202c.mo779f();
            }
        }

        /* renamed from: h */
        public void m5408h() {
            aoi.m4683a(this.f4200a.f4236q);
            if (!this.f4202c.m2647g() || this.f4207h.size() != 0) {
                return;
            }
            if (this.f4205f.m5231a()) {
                m5395r();
            } else {
                this.f4202c.mo779f();
            }
        }

        /* renamed from: i */
        public void m5409i() {
            aoi.m4683a(this.f4200a.f4236q);
            if (!this.f4202c.m2647g() && !this.f4202c.m2648h()) {
                if (this.f4202c.m2650j() && this.f4200a.f4229j != 0) {
                    this.f4200a.f4229j = this.f4200a.f4228i.mo565a(this.f4200a.f4227h);
                    if (this.f4200a.f4229j != 0) {
                        onConnectionFailed(new ConnectionResult(this.f4200a.f4229j, null));
                        return;
                    }
                }
                C0765a c0766b = new C0766b(this.f4200a, this.f4202c, this.f4204e);
                if (this.f4202c.mo799i()) {
                    this.f4209j.m5502a(c0766b);
                }
                this.f4202c.m2641a(c0766b);
            }
        }

        /* renamed from: j */
        boolean m5410j() {
            return this.f4202c.m2647g();
        }

        /* renamed from: k */
        public boolean m5411k() {
            return this.f4202c.mo799i();
        }

        /* renamed from: l */
        public int m5412l() {
            return this.f4208i;
        }

        /* renamed from: m */
        avj m5413m() {
            return this.f4209j == null ? null : this.f4209j.m5501a();
        }

        public void onConnected(Bundle bundle) {
            if (Looper.myLooper() == this.f4200a.f4236q.getLooper()) {
                m5391n();
            } else {
                this.f4200a.f4236q.post(new C07601(this));
            }
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onConnectionFailed(ConnectionResult r6) {
            /*
            r5 = this;
            r0 = r5.f4200a;
            r0 = r0.f4236q;
            p000.aoi.m4683a(r0);
            r0 = r5.f4209j;
            if (r0 == 0) goto L_0x0012;
        L_0x000d:
            r0 = r5.f4209j;
            r0.m5504b();
        L_0x0012:
            r5.m5404d();
            r0 = r5.f4200a;
            r1 = -1;
            r0.f4229j = r1;
            r5.m5390b(r6);
            r0 = r6.m19506c();
            r1 = 4;
            if (r0 != r1) goto L_0x002d;
        L_0x0025:
            r0 = p000.asa.f4221b;
            r5.m5401a(r0);
        L_0x002c:
            return;
        L_0x002d:
            r0 = r5.f4201b;
            r0 = r0.isEmpty();
            if (r0 == 0) goto L_0x0038;
        L_0x0035:
            r5.f4211l = r6;
            goto L_0x002c;
        L_0x0038:
            r1 = p000.asa.f4222f;
            monitor-enter(r1);
            r0 = r5.f4200a;	 Catch:{ all -> 0x0060 }
            r0 = r0.f4233n;	 Catch:{ all -> 0x0060 }
            if (r0 == 0) goto L_0x0063;
        L_0x0045:
            r0 = r5.f4200a;	 Catch:{ all -> 0x0060 }
            r0 = r0.f4234o;	 Catch:{ all -> 0x0060 }
            r2 = r5.f4204e;	 Catch:{ all -> 0x0060 }
            r0 = r0.contains(r2);	 Catch:{ all -> 0x0060 }
            if (r0 == 0) goto L_0x0063;
        L_0x0053:
            r0 = r5.f4200a;	 Catch:{ all -> 0x0060 }
            r0 = r0.f4233n;	 Catch:{ all -> 0x0060 }
            r2 = r5.f4208i;	 Catch:{ all -> 0x0060 }
            r0.m5092b(r6, r2);	 Catch:{ all -> 0x0060 }
            monitor-exit(r1);	 Catch:{ all -> 0x0060 }
            goto L_0x002c;
        L_0x0060:
            r0 = move-exception;
            monitor-exit(r1);	 Catch:{ all -> 0x0060 }
            throw r0;
        L_0x0063:
            monitor-exit(r1);	 Catch:{ all -> 0x0060 }
            r0 = r5.f4200a;
            r1 = r5.f4208i;
            r0 = r0.m5454a(r6, r1);
            if (r0 != 0) goto L_0x002c;
        L_0x006e:
            r0 = r6.m19506c();
            r1 = 18;
            if (r0 != r1) goto L_0x0079;
        L_0x0076:
            r0 = 1;
            r5.f4210k = r0;
        L_0x0079:
            r0 = r5.f4210k;
            if (r0 == 0) goto L_0x009b;
        L_0x007d:
            r0 = r5.f4200a;
            r0 = r0.f4236q;
            r1 = r5.f4200a;
            r1 = r1.f4236q;
            r2 = 9;
            r3 = r5.f4204e;
            r1 = android.os.Message.obtain(r1, r2, r3);
            r2 = r5.f4200a;
            r2 = r2.f4224c;
            r0.sendMessageDelayed(r1, r2);
            goto L_0x002c;
        L_0x009b:
            r0 = new com.google.android.gms.common.api.Status;
            r1 = 17;
            r2 = r5.f4204e;
            r2 = r2.m10372a();
            r2 = java.lang.String.valueOf(r2);
            r3 = java.lang.String.valueOf(r2);
            r3 = r3.length();
            r3 = r3 + 38;
            r4 = new java.lang.StringBuilder;
            r4.<init>(r3);
            r3 = "API: ";
            r3 = r4.append(r3);
            r2 = r3.append(r2);
            r3 = " is not available on this device.";
            r2 = r2.append(r3);
            r2 = r2.toString();
            r0.<init>(r1, r2);
            r5.m5401a(r0);
            goto L_0x002c;
            */
            throw new UnsupportedOperationException("Method not decompiled: asa.a.onConnectionFailed(com.google.android.gms.common.ConnectionResult):void");
        }

        public void onConnectionSuspended(int i) {
            if (Looper.myLooper() == this.f4200a.f4236q.getLooper()) {
                m5392o();
            } else {
                this.f4200a.f4236q.post(new C07612(this));
            }
        }
    }

    /* renamed from: asa$b */
    class C0766b implements C0665f, C0765a {
        /* renamed from: a */
        final /* synthetic */ asa f4214a;
        /* renamed from: b */
        private final C0297f f4215b;
        /* renamed from: c */
        private final bps<?> f4216c;
        /* renamed from: d */
        private ape f4217d = null;
        /* renamed from: e */
        private Set<Scope> f4218e = null;
        /* renamed from: f */
        private boolean f4219f = false;

        public C0766b(asa asa, C0297f c0297f, bps<?> bps) {
            this.f4214a = asa;
            this.f4215b = c0297f;
            this.f4216c = bps;
        }

        /* renamed from: a */
        private void m5417a() {
            if (this.f4219f && this.f4217d != null) {
                this.f4215b.m2642a(this.f4217d, this.f4218e);
            }
        }

        /* renamed from: a */
        public void mo702a(ape ape, Set<Scope> set) {
            if (ape == null || set == null) {
                Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
                mo703b(new ConnectionResult(4));
                return;
            }
            this.f4217d = ape;
            this.f4218e = set;
            m5417a();
        }

        /* renamed from: a */
        public void mo593a(final ConnectionResult connectionResult) {
            this.f4214a.f4236q.post(new Runnable(this) {
                /* renamed from: b */
                final /* synthetic */ C0766b f4213b;

                public void run() {
                    if (connectionResult.m19505b()) {
                        this.f4213b.f4219f = true;
                        if (this.f4213b.f4215b.mo799i()) {
                            this.f4213b.m5417a();
                            return;
                        } else {
                            this.f4213b.f4215b.m2642a(null, Collections.emptySet());
                            return;
                        }
                    }
                    ((C0763a) this.f4213b.f4214a.f4232m.get(this.f4213b.f4216c)).onConnectionFailed(connectionResult);
                }
            });
        }

        /* renamed from: b */
        public void mo703b(ConnectionResult connectionResult) {
            ((C0763a) this.f4214a.f4232m.get(this.f4216c)).m5399a(connectionResult);
        }
    }

    private asa(Context context, Looper looper, anj anj) {
        this.f4227h = context;
        this.f4236q = new Handler(looper, this);
        this.f4228i = anj;
        this.f4236q.sendMessage(this.f4236q.obtainMessage(6));
    }

    /* renamed from: a */
    public static asa m5426a() {
        asa asa;
        synchronized (f4222f) {
            aoi.m4680a(f4223g, (Object) "Must guarantee manager is non-null before using getInstance");
            asa = f4223g;
        }
        return asa;
    }

    /* renamed from: a */
    public static asa m5427a(Context context) {
        asa asa;
        synchronized (f4222f) {
            if (f4223g == null) {
                f4223g = new asa(context.getApplicationContext(), asa.m5444i(), anj.m4530a());
            }
            asa = f4223g;
        }
        return asa;
    }

    /* renamed from: a */
    private void m5428a(int i, ConnectionResult connectionResult) {
        for (C0763a c0763a : this.f4232m.values()) {
            if (c0763a.m5412l() == i) {
                break;
            }
        }
        C0763a c0763a2 = null;
        if (c0763a2 != null) {
            String valueOf = String.valueOf(this.f4228i.mo573c(connectionResult.m19506c()));
            String valueOf2 = String.valueOf(connectionResult.m19508e());
            c0763a2.m5401a(new Status(17, new StringBuilder((String.valueOf(valueOf).length() + 69) + String.valueOf(valueOf2).length()).append("Error resolution was canceled by the user, original error message: ").append(valueOf).append(": ").append(valueOf2).toString()));
            return;
        }
        Log.wtf("GoogleApiManager", "Could not find API instance " + i + " while trying to fail enqueued calls.", new Exception());
    }

    /* renamed from: a */
    private void m5429a(arg arg) {
        for (bps bps : arg.m5103a()) {
            C0763a c0763a = (C0763a) this.f4232m.get(bps);
            if (c0763a == null) {
                arg.m5104a(bps, new ConnectionResult(13));
                return;
            } else if (c0763a.m5410j()) {
                arg.m5104a(bps, ConnectionResult.f14748a);
            } else if (c0763a.m5405e() != null) {
                arg.m5104a(bps, c0763a.m5405e());
            } else {
                c0763a.m5397a(arg);
            }
        }
    }

    /* renamed from: a */
    private void m5430a(asm asm) {
        C0763a c0763a = (C0763a) this.f4232m.get(asm.f4258c.m4604b());
        if (c0763a == null) {
            m5434b(asm.f4258c);
            c0763a = (C0763a) this.f4232m.get(asm.f4258c.m4604b());
        }
        if (!c0763a.m5411k() || this.f4231l.get() == asm.f4257b) {
            c0763a.m5398a(asm.f4256a);
            return;
        }
        asm.f4256a.mo1397a(f4220a);
        c0763a.m5396a();
    }

    /* renamed from: a */
    private void m5431a(boolean z) {
        this.f4226e = z ? 10000 : 300000;
        this.f4236q.removeMessages(12);
        for (bps obtainMessage : this.f4232m.keySet()) {
            this.f4236q.sendMessageDelayed(this.f4236q.obtainMessage(12, obtainMessage), this.f4226e);
        }
    }

    /* renamed from: b */
    public static void m5433b() {
        synchronized (f4222f) {
            if (f4223g != null) {
                f4223g.m5459e();
            }
        }
    }

    /* renamed from: b */
    private void m5434b(aoa<?> aoa) {
        bps b = aoa.m4604b();
        C0763a c0763a = (C0763a) this.f4232m.get(b);
        if (c0763a == null) {
            c0763a = new C0763a(this, aoa);
            this.f4232m.put(b, c0763a);
        }
        if (c0763a.m5411k()) {
            this.f4235p.add(b);
        }
        c0763a.m5409i();
    }

    /* renamed from: i */
    private static Looper m5444i() {
        HandlerThread handlerThread = new HandlerThread("GoogleApiHandler", 9);
        handlerThread.start();
        return handlerThread.getLooper();
    }

    /* renamed from: j */
    private void m5446j() {
        aqd.m4912b();
        if (this.f4227h.getApplicationContext() instanceof Application) {
            arh.m5109a((Application) this.f4227h.getApplicationContext());
            arh.m5108a().m5111a(new C07591(this));
            if (!arh.m5108a().m5112a(true)) {
                this.f4226e = 300000;
            }
        }
    }

    /* renamed from: k */
    private void m5447k() {
        for (C0763a c0763a : this.f4232m.values()) {
            c0763a.m5404d();
            c0763a.m5409i();
        }
    }

    /* renamed from: l */
    private void m5448l() {
        for (bps remove : this.f4235p) {
            ((C0763a) this.f4232m.remove(remove)).m5396a();
        }
        this.f4235p.clear();
    }

    /* renamed from: a */
    PendingIntent m5449a(bps<?> bps, int i) {
        if (((C0763a) this.f4232m.get(bps)) == null) {
            return null;
        }
        avj m = ((C0763a) this.f4232m.get(bps)).m5413m();
        return m == null ? null : PendingIntent.getActivity(this.f4227h, i, m.mo343d(), 134217728);
    }

    /* renamed from: a */
    public bsj<Void> m5450a(Iterable<? extends aoa<?>> iterable) {
        arg arg = new arg(iterable);
        for (aoa b : iterable) {
            C0763a c0763a = (C0763a) this.f4232m.get(b.m4604b());
            if (c0763a != null) {
                if (!c0763a.m5410j()) {
                }
            }
            this.f4236q.sendMessage(this.f4236q.obtainMessage(2, arg));
            return arg.m5105b();
        }
        arg.m5106c();
        return arg.m5105b();
    }

    /* renamed from: a */
    public void m5451a(aoa<?> aoa) {
        this.f4236q.sendMessage(this.f4236q.obtainMessage(7, aoa));
    }

    /* renamed from: a */
    public <O extends C0290a> void m5452a(aoa<O> aoa, int i, C0301a<? extends ant, C0296c> c0301a) {
        this.f4236q.sendMessage(this.f4236q.obtainMessage(4, new asm(new C1405b(i, c0301a), this.f4231l.get(), aoa)));
    }

    /* renamed from: a */
    public void m5453a(arr arr) {
        synchronized (f4222f) {
            if (this.f4233n != arr) {
                this.f4233n = arr;
                this.f4234o.clear();
                this.f4234o.addAll(arr.m5238e());
            }
        }
    }

    /* renamed from: a */
    boolean m5454a(ConnectionResult connectionResult, int i) {
        return this.f4228i.m4545a(this.f4227h, connectionResult, i);
    }

    /* renamed from: b */
    void m5455b(arr arr) {
        synchronized (f4222f) {
            if (this.f4233n == arr) {
                this.f4233n = null;
                this.f4234o.clear();
            }
        }
    }

    /* renamed from: b */
    public void m5456b(ConnectionResult connectionResult, int i) {
        if (!m5454a(connectionResult, i)) {
            this.f4236q.sendMessage(this.f4236q.obtainMessage(5, i, 0, connectionResult));
        }
    }

    /* renamed from: c */
    public int m5457c() {
        return this.f4230k.getAndIncrement();
    }

    /* renamed from: d */
    public void m5458d() {
        this.f4236q.sendMessage(this.f4236q.obtainMessage(3));
    }

    /* renamed from: e */
    public void m5459e() {
        this.f4231l.incrementAndGet();
        this.f4236q.sendMessageAtFrontOfQueue(this.f4236q.obtainMessage(10));
    }

    /* renamed from: f */
    void m5460f() {
        this.f4231l.incrementAndGet();
        this.f4236q.sendMessage(this.f4236q.obtainMessage(10));
    }

    public boolean handleMessage(Message message) {
        switch (message.what) {
            case 1:
                m5431a(((Boolean) message.obj).booleanValue());
                break;
            case 2:
                m5429a((arg) message.obj);
                break;
            case 3:
                m5447k();
                break;
            case 4:
            case 8:
            case 13:
                m5430a((asm) message.obj);
                break;
            case 5:
                m5428a(message.arg1, (ConnectionResult) message.obj);
                break;
            case 6:
                m5446j();
                break;
            case 7:
                m5434b((aoa) message.obj);
                break;
            case 9:
                if (this.f4232m.containsKey(message.obj)) {
                    ((C0763a) this.f4232m.get(message.obj)).m5406f();
                    break;
                }
                break;
            case 10:
                m5448l();
                break;
            case 11:
                if (this.f4232m.containsKey(message.obj)) {
                    ((C0763a) this.f4232m.get(message.obj)).m5407g();
                    break;
                }
                break;
            case 12:
                if (this.f4232m.containsKey(message.obj)) {
                    ((C0763a) this.f4232m.get(message.obj)).m5408h();
                    break;
                }
                break;
            default:
                Log.w("GoogleApiManager", "Unknown message id: " + message.what);
                return false;
        }
        return true;
    }
}
