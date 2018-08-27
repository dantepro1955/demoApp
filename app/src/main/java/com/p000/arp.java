package com.p000;

import android.content.Context;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import p000.ann.C0286b;
import p000.ann.C0296c;
import p000.ann.C0297f;
import p000.ann.C0645d;
import p000.aou.C0672a;
import p000.ari.C0301a;

/* renamed from: arp */
public class arp implements ase {
    /* renamed from: a */
    private final Map<C0645d<?>, aro<?>> f4069a = new HashMap();
    /* renamed from: b */
    private final Map<C0645d<?>, aro<?>> f4070b = new HashMap();
    /* renamed from: c */
    private final Map<ann<?>, Boolean> f4071c;
    /* renamed from: d */
    private final asa f4072d;
    /* renamed from: e */
    private final arw f4073e;
    /* renamed from: f */
    private final Lock f4074f;
    /* renamed from: g */
    private final Looper f4075g;
    /* renamed from: h */
    private final aqm f4076h;
    /* renamed from: i */
    private final Condition f4077i;
    /* renamed from: j */
    private final aou f4078j;
    /* renamed from: k */
    private final boolean f4079k;
    /* renamed from: l */
    private final boolean f4080l;
    /* renamed from: m */
    private final Queue<C0301a<?, ?>> f4081m = new LinkedList();
    /* renamed from: n */
    private boolean f4082n;
    /* renamed from: o */
    private Map<bps<?>, ConnectionResult> f4083o;
    /* renamed from: p */
    private Map<bps<?>, ConnectionResult> f4084p;
    /* renamed from: q */
    private C0736b f4085q;
    /* renamed from: r */
    private ConnectionResult f4086r;

    /* renamed from: arp$a */
    class C0735a implements bsi<Void> {
        /* renamed from: a */
        final /* synthetic */ arp f4066a;

        private C0735a(arp arp) {
            this.f4066a = arp;
        }

        /* renamed from: a */
        public void mo650a(bsj<Void> bsj) {
            this.f4066a.f4074f.lock();
            try {
                if (this.f4066a.f4082n) {
                    if (bsj.mo1432a()) {
                        this.f4066a.f4083o = new hh(this.f4066a.f4069a.size());
                        for (aro b : this.f4066a.f4069a.values()) {
                            this.f4066a.f4083o.put(b.m4604b(), ConnectionResult.f14748a);
                        }
                    } else if (bsj.mo1433b() instanceof anz) {
                        anz anz = (anz) bsj.mo1433b();
                        if (this.f4066a.f4080l) {
                            this.f4066a.f4083o = new hh(this.f4066a.f4069a.size());
                            for (aro aro : this.f4066a.f4069a.values()) {
                                bps b2 = aro.m4604b();
                                ConnectionResult a = anz.m4574a(aro);
                                if (this.f4066a.m5193a(aro, a)) {
                                    this.f4066a.f4083o.put(b2, new ConnectionResult(16));
                                } else {
                                    this.f4066a.f4083o.put(b2, a);
                                }
                            }
                        } else {
                            this.f4066a.f4083o = anz.m4575a();
                        }
                        this.f4066a.f4086r = this.f4066a.m5210k();
                    } else {
                        Log.e("ConnectionlessGAC", "Unexpected availability exception", bsj.mo1433b());
                        this.f4066a.f4083o = Collections.emptyMap();
                        this.f4066a.f4086r = new ConnectionResult(8);
                    }
                    if (this.f4066a.f4084p != null) {
                        this.f4066a.f4083o.putAll(this.f4066a.f4084p);
                        this.f4066a.f4086r = this.f4066a.m5210k();
                    }
                    if (this.f4066a.f4086r == null) {
                        this.f4066a.m5205i();
                        this.f4066a.m5207j();
                    } else {
                        this.f4066a.f4082n = false;
                        this.f4066a.f4073e.mo634a(this.f4066a.f4086r);
                    }
                    this.f4066a.f4077i.signalAll();
                    this.f4066a.f4074f.unlock();
                }
            } finally {
                this.f4066a.f4074f.unlock();
            }
        }
    }

    /* renamed from: arp$b */
    class C0736b implements bsi<Void> {
        /* renamed from: a */
        final /* synthetic */ arp f4067a;
        /* renamed from: b */
        private asr f4068b;

        C0736b(arp arp, asr asr) {
            this.f4067a = arp;
            this.f4068b = asr;
        }

        /* renamed from: a */
        void m5187a() {
            this.f4068b.mo329u();
        }

        /* renamed from: a */
        public void mo650a(bsj<Void> bsj) {
            this.f4067a.f4074f.lock();
            try {
                if (this.f4067a.f4082n) {
                    if (bsj.mo1432a()) {
                        this.f4067a.f4084p = new hh(this.f4067a.f4070b.size());
                        for (aro b : this.f4067a.f4070b.values()) {
                            this.f4067a.f4084p.put(b.m4604b(), ConnectionResult.f14748a);
                        }
                    } else if (bsj.mo1433b() instanceof anz) {
                        anz anz = (anz) bsj.mo1433b();
                        if (this.f4067a.f4080l) {
                            this.f4067a.f4084p = new hh(this.f4067a.f4070b.size());
                            for (aro aro : this.f4067a.f4070b.values()) {
                                bps b2 = aro.m4604b();
                                ConnectionResult a = anz.m4574a(aro);
                                if (this.f4067a.m5193a(aro, a)) {
                                    this.f4067a.f4084p.put(b2, new ConnectionResult(16));
                                } else {
                                    this.f4067a.f4084p.put(b2, a);
                                }
                            }
                        } else {
                            this.f4067a.f4084p = anz.m4575a();
                        }
                    } else {
                        Log.e("ConnectionlessGAC", "Unexpected availability exception", bsj.mo1433b());
                        this.f4067a.f4084p = Collections.emptyMap();
                    }
                    if (this.f4067a.mo644d()) {
                        this.f4067a.f4083o.putAll(this.f4067a.f4084p);
                        if (this.f4067a.m5210k() == null) {
                            this.f4067a.m5205i();
                            this.f4067a.m5207j();
                            this.f4067a.f4077i.signalAll();
                        }
                    }
                    this.f4068b.mo329u();
                    this.f4067a.f4074f.unlock();
                    return;
                }
                this.f4068b.mo329u();
            } finally {
                this.f4067a.f4074f.unlock();
            }
        }
    }

    public arp(Context context, Lock lock, Looper looper, aqm aqm, Map<C0645d<?>, C0297f> map, aou aou, Map<ann<?>, Boolean> map2, C0286b<? extends avj, avk> c0286b, ArrayList<arl> arrayList, arw arw, boolean z) {
        this.f4074f = lock;
        this.f4075g = looper;
        this.f4077i = lock.newCondition();
        this.f4076h = aqm;
        this.f4073e = arw;
        this.f4071c = map2;
        this.f4078j = aou;
        this.f4079k = z;
        Map hashMap = new HashMap();
        for (ann ann : map2.keySet()) {
            hashMap.put(ann.m4560c(), ann);
        }
        Map hashMap2 = new HashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arl arl = (arl) it.next();
            hashMap2.put(arl.f4042a, arl);
        }
        Object obj = 1;
        Object obj2 = null;
        Object obj3 = null;
        for (Entry entry : map.entrySet()) {
            Object obj4;
            Object obj5;
            Object obj6;
            ann ann2 = (ann) hashMap.get(entry.getKey());
            C0297f c0297f = (C0297f) entry.getValue();
            if (c0297f.m2650j()) {
                obj4 = 1;
                if (((Boolean) this.f4071c.get(ann2)).booleanValue()) {
                    obj5 = obj;
                    obj6 = obj2;
                } else {
                    obj5 = obj;
                    obj6 = 1;
                }
            } else {
                obj4 = obj3;
                obj5 = null;
                obj6 = obj2;
            }
            aro aro = new aro(context, ann2, looper, c0297f, (arl) hashMap2.get(ann2), aou, c0286b);
            this.f4069a.put((C0645d) entry.getKey(), aro);
            if (c0297f.mo799i()) {
                this.f4070b.put((C0645d) entry.getKey(), aro);
            }
            obj3 = obj4;
            obj = obj5;
            obj2 = obj6;
        }
        boolean z2 = obj3 != null && obj == null && obj2 == null;
        this.f4080l = z2;
        this.f4072d = asa.m5426a();
    }

    /* renamed from: a */
    private ConnectionResult m5189a(C0645d<?> c0645d) {
        this.f4074f.lock();
        try {
            aro aro = (aro) this.f4069a.get(c0645d);
            if (this.f4083o == null || aro == null) {
                this.f4074f.unlock();
                return null;
            }
            ConnectionResult connectionResult = (ConnectionResult) this.f4083o.get(aro.m4604b());
            return connectionResult;
        } finally {
            this.f4074f.unlock();
        }
    }

    /* renamed from: a */
    private boolean m5193a(aro<?> aro, ConnectionResult connectionResult) {
        return !connectionResult.m19505b() && !connectionResult.m19504a() && ((Boolean) this.f4071c.get(aro.m4600a())).booleanValue() && aro.m5184g().m2650j() && this.f4076h.mo568a(connectionResult.m19506c());
    }

    /* renamed from: c */
    private <T extends C0301a<? extends ant, ? extends C0296c>> boolean m5199c(T t) {
        C0645d a = t.mo348a();
        ConnectionResult a2 = m5189a(a);
        if (a2 == null || a2.m19506c() != 4) {
            return false;
        }
        t.m2699c(new Status(4, null, this.f4072d.m5449a(((aro) this.f4069a.get(a)).m4604b(), this.f4073e.m5356f())));
        return true;
    }

    /* renamed from: i */
    private void m5205i() {
        if (this.f4078j == null) {
            this.f4073e.f4151d = Collections.emptySet();
            return;
        }
        Set hashSet = new HashSet(this.f4078j.m4750d());
        Map f = this.f4078j.m4752f();
        for (ann ann : f.keySet()) {
            ConnectionResult a = mo637a(ann);
            if (a != null && a.m19505b()) {
                hashSet.addAll(((C0672a) f.get(ann)).f3841a);
            }
        }
        this.f4073e.f4151d = hashSet;
    }

    /* renamed from: j */
    private void m5207j() {
        while (!this.f4081m.isEmpty()) {
            mo641b((C0301a) this.f4081m.remove());
        }
        this.f4073e.mo633a(null);
    }

    /* renamed from: k */
    private ConnectionResult m5210k() {
        int i = 0;
        ConnectionResult connectionResult = null;
        int i2 = 0;
        ConnectionResult connectionResult2 = null;
        for (aro aro : this.f4069a.values()) {
            ann a = aro.m4600a();
            ConnectionResult connectionResult3 = (ConnectionResult) this.f4083o.get(aro.m4604b());
            if (!connectionResult3.m19505b() && (!((Boolean) this.f4071c.get(a)).booleanValue() || connectionResult3.m19504a() || this.f4076h.mo568a(connectionResult3.m19506c()))) {
                int a2;
                if (connectionResult3.m19506c() == 4 && this.f4079k) {
                    a2 = a.m4558a().m2531a();
                    if (connectionResult == null || i > a2) {
                        i = a2;
                        connectionResult = connectionResult3;
                    }
                } else {
                    ConnectionResult connectionResult4;
                    int i3;
                    a2 = a.m4558a().m2531a();
                    if (connectionResult2 == null || i2 > a2) {
                        int i4 = a2;
                        connectionResult4 = connectionResult3;
                        i3 = i4;
                    } else {
                        i3 = i2;
                        connectionResult4 = connectionResult2;
                    }
                    i2 = i3;
                    connectionResult2 = connectionResult4;
                }
            }
        }
        return (connectionResult2 == null || connectionResult == null || i2 <= i) ? connectionResult2 : connectionResult;
    }

    /* renamed from: a */
    public <A extends C0296c, R extends ant, T extends C0301a<R, A>> T mo635a(T t) {
        if (this.f4079k && m5199c((C0301a) t)) {
            return t;
        }
        if (mo644d()) {
            this.f4073e.f4156i.m5529a((ark) t);
            return ((aro) this.f4069a.get(t.mo348a())).m4601a(t);
        }
        this.f4081m.add(t);
        return t;
    }

    /* renamed from: a */
    public ConnectionResult mo636a(long j, TimeUnit timeUnit) {
        mo638a();
        long toNanos = timeUnit.toNanos(j);
        while (mo645e()) {
            if (toNanos <= 0) {
                try {
                    mo643c();
                    return new ConnectionResult(14, null);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    return new ConnectionResult(15, null);
                }
            }
            toNanos = this.f4077i.awaitNanos(toNanos);
        }
        return mo644d() ? ConnectionResult.f14748a : this.f4086r != null ? this.f4086r : new ConnectionResult(13, null);
    }

    /* renamed from: a */
    public ConnectionResult mo637a(ann<?> ann) {
        return m5189a(ann.m4560c());
    }

    /* renamed from: a */
    public void mo638a() {
        this.f4074f.lock();
        try {
            if (!this.f4082n) {
                this.f4082n = true;
                this.f4083o = null;
                this.f4084p = null;
                this.f4085q = null;
                this.f4086r = null;
                this.f4072d.m5458d();
                this.f4072d.m5450a(this.f4069a.values()).mo1431a(new atj(this.f4075g), new C0735a());
                this.f4074f.unlock();
            }
        } finally {
            this.f4074f.unlock();
        }
    }

    /* renamed from: a */
    public void mo639a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    /* renamed from: a */
    public boolean mo640a(asr asr) {
        this.f4074f.lock();
        try {
            if (!this.f4082n || m5226h()) {
                this.f4074f.unlock();
                return false;
            }
            this.f4072d.m5458d();
            this.f4085q = new C0736b(this, asr);
            this.f4072d.m5450a(this.f4070b.values()).mo1431a(new atj(this.f4075g), this.f4085q);
            return true;
        } finally {
            this.f4074f.unlock();
        }
    }

    /* renamed from: b */
    public <A extends C0296c, T extends C0301a<? extends ant, A>> T mo641b(T t) {
        C0645d a = t.mo348a();
        if (this.f4079k && m5199c((C0301a) t)) {
            return t;
        }
        this.f4073e.f4156i.m5529a((ark) t);
        return ((aro) this.f4069a.get(a)).m4603b(t);
    }

    /* renamed from: b */
    public ConnectionResult mo642b() {
        mo638a();
        while (mo645e()) {
            try {
                this.f4077i.await();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return new ConnectionResult(15, null);
            }
        }
        return mo644d() ? ConnectionResult.f14748a : this.f4086r != null ? this.f4086r : new ConnectionResult(13, null);
    }

    /* renamed from: c */
    public void mo643c() {
        this.f4074f.lock();
        try {
            this.f4082n = false;
            this.f4083o = null;
            this.f4084p = null;
            if (this.f4085q != null) {
                this.f4085q.m5187a();
                this.f4085q = null;
            }
            this.f4086r = null;
            while (!this.f4081m.isEmpty()) {
                C0301a c0301a = (C0301a) this.f4081m.remove();
                c0301a.m2682a(null);
                c0301a.m2687e();
            }
            this.f4077i.signalAll();
        } finally {
            this.f4074f.unlock();
        }
    }

    /* renamed from: d */
    public boolean mo644d() {
        this.f4074f.lock();
        try {
            boolean z = this.f4083o != null && this.f4086r == null;
            this.f4074f.unlock();
            return z;
        } catch (Throwable th) {
            this.f4074f.unlock();
        }
    }

    /* renamed from: e */
    public boolean mo645e() {
        this.f4074f.lock();
        try {
            boolean z = this.f4083o == null && this.f4082n;
            this.f4074f.unlock();
            return z;
        } catch (Throwable th) {
            this.f4074f.unlock();
        }
    }

    /* renamed from: f */
    public void mo646f() {
    }

    /* renamed from: g */
    public void mo647g() {
        this.f4074f.lock();
        try {
            this.f4072d.m5460f();
            if (this.f4085q != null) {
                this.f4085q.m5187a();
                this.f4085q = null;
            }
            if (this.f4084p == null) {
                this.f4084p = new hh(this.f4070b.size());
            }
            ConnectionResult connectionResult = new ConnectionResult(4);
            for (aro b : this.f4070b.values()) {
                this.f4084p.put(b.m4604b(), connectionResult);
            }
            if (this.f4083o != null) {
                this.f4083o.putAll(this.f4084p);
            }
            this.f4074f.unlock();
        } catch (Throwable th) {
            this.f4074f.unlock();
        }
    }

    /* renamed from: h */
    public boolean m5226h() {
        this.f4074f.lock();
        try {
            if (this.f4082n && this.f4079k) {
                for (C0645d a : this.f4070b.keySet()) {
                    ConnectionResult a2 = m5189a(a);
                    if (a2 != null) {
                        if (!a2.m19505b()) {
                        }
                    }
                    this.f4074f.unlock();
                    return false;
                }
                this.f4074f.unlock();
                return true;
            }
            this.f4074f.unlock();
            return false;
        } catch (Throwable th) {
            this.f4074f.unlock();
        }
    }
}
