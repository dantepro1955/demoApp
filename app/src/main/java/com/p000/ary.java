package com.p000;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import p000.ann.C0286b;
import p000.ann.C0296c;
import p000.ann.C0297f;
import p000.ann.C0645d;
import p000.ari.C0301a;
import p000.ase.C0731a;

/* renamed from: ary */
public class ary implements arm, ase {
    /* renamed from: a */
    final Map<C0645d<?>, C0297f> f4174a;
    /* renamed from: b */
    final Map<C0645d<?>, ConnectionResult> f4175b = new HashMap();
    /* renamed from: c */
    final aou f4176c;
    /* renamed from: d */
    final Map<ann<?>, Boolean> f4177d;
    /* renamed from: e */
    final C0286b<? extends avj, avk> f4178e;
    /* renamed from: f */
    int f4179f;
    /* renamed from: g */
    final arw f4180g;
    /* renamed from: h */
    final C0731a f4181h;
    /* renamed from: i */
    private final Lock f4182i;
    /* renamed from: j */
    private final Condition f4183j;
    /* renamed from: k */
    private final Context f4184k;
    /* renamed from: l */
    private final aqm f4185l;
    /* renamed from: m */
    private final C0758b f4186m;
    /* renamed from: n */
    private volatile arx f4187n;
    /* renamed from: o */
    private ConnectionResult f4188o = null;

    /* renamed from: ary$a */
    static abstract class C0738a {
        /* renamed from: a */
        private final arx f4094a;

        protected C0738a(arx arx) {
            this.f4094a = arx;
        }

        /* renamed from: a */
        protected abstract void mo670a();

        /* renamed from: a */
        public final void m5240a(ary ary) {
            ary.f4182i.lock();
            try {
                if (ary.f4187n == this.f4094a) {
                    mo670a();
                    ary.f4182i.unlock();
                }
            } finally {
                ary.f4182i.unlock();
            }
        }
    }

    /* renamed from: ary$b */
    final class C0758b extends Handler {
        /* renamed from: a */
        final /* synthetic */ ary f4173a;

        C0758b(ary ary, Looper looper) {
            this.f4173a = ary;
            super(looper);
        }

        public void handleMessage(Message message) {
            switch (message.what) {
                case 1:
                    ((C0738a) message.obj).m5240a(this.f4173a);
                    return;
                case 2:
                    throw ((RuntimeException) message.obj);
                default:
                    Log.w("GACStateManager", "Unknown message id: " + message.what);
                    return;
            }
        }
    }

    public ary(Context context, arw arw, Lock lock, Looper looper, aqm aqm, Map<C0645d<?>, C0297f> map, aou aou, Map<ann<?>, Boolean> map2, C0286b<? extends avj, avk> c0286b, ArrayList<arl> arrayList, C0731a c0731a) {
        this.f4184k = context;
        this.f4182i = lock;
        this.f4185l = aqm;
        this.f4174a = map;
        this.f4176c = aou;
        this.f4177d = map2;
        this.f4178e = c0286b;
        this.f4180g = arw;
        this.f4181h = c0731a;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((arl) it.next()).m5121a(this);
        }
        this.f4186m = new C0758b(this, looper);
        this.f4183j = lock.newCondition();
        this.f4187n = new arv(this);
    }

    /* renamed from: a */
    public <A extends C0296c, R extends ant, T extends C0301a<R, A>> T mo635a(T t) {
        t.m2691i();
        return this.f4187n.mo671a((C0301a) t);
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
            toNanos = this.f4183j.awaitNanos(toNanos);
        }
        return mo644d() ? ConnectionResult.f14748a : this.f4188o != null ? this.f4188o : new ConnectionResult(13, null);
    }

    /* renamed from: a */
    public ConnectionResult mo637a(ann<?> ann) {
        C0645d c = ann.m4560c();
        if (this.f4174a.containsKey(c)) {
            if (((C0297f) this.f4174a.get(c)).m2647g()) {
                return ConnectionResult.f14748a;
            }
            if (this.f4175b.containsKey(c)) {
                return (ConnectionResult) this.f4175b.get(c);
            }
        }
        return null;
    }

    /* renamed from: a */
    public void mo638a() {
        this.f4187n.mo678c();
    }

    /* renamed from: a */
    void m5363a(C0738a c0738a) {
        this.f4186m.sendMessage(this.f4186m.obtainMessage(1, c0738a));
    }

    /* renamed from: a */
    void m5364a(ConnectionResult connectionResult) {
        this.f4182i.lock();
        try {
            this.f4188o = connectionResult;
            this.f4187n = new arv(this);
            this.f4187n.mo672a();
            this.f4183j.signalAll();
        } finally {
            this.f4182i.unlock();
        }
    }

    /* renamed from: a */
    public void mo700a(ConnectionResult connectionResult, ann<?> ann, boolean z) {
        this.f4182i.lock();
        try {
            this.f4187n.mo675a(connectionResult, ann, z);
        } finally {
            this.f4182i.unlock();
        }
    }

    /* renamed from: a */
    void m5366a(RuntimeException runtimeException) {
        this.f4186m.sendMessage(this.f4186m.obtainMessage(2, runtimeException));
    }

    /* renamed from: a */
    public void mo639a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String concat = String.valueOf(str).concat("  ");
        printWriter.append(str).append("mState=").println(this.f4187n);
        for (ann ann : this.f4177d.keySet()) {
            printWriter.append(str).append(ann.m4561d()).println(":");
            ((C0297f) this.f4174a.get(ann.m4560c())).m2643a(concat, fileDescriptor, printWriter, strArr);
        }
    }

    /* renamed from: a */
    public boolean mo640a(asr asr) {
        return false;
    }

    /* renamed from: b */
    public <A extends C0296c, T extends C0301a<? extends ant, A>> T mo641b(T t) {
        t.m2691i();
        return this.f4187n.mo676b(t);
    }

    /* renamed from: b */
    public ConnectionResult mo642b() {
        mo638a();
        while (mo645e()) {
            try {
                this.f4183j.await();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return new ConnectionResult(15, null);
            }
        }
        return mo644d() ? ConnectionResult.f14748a : this.f4188o != null ? this.f4188o : new ConnectionResult(13, null);
    }

    /* renamed from: c */
    public void mo643c() {
        if (this.f4187n.mo677b()) {
            this.f4175b.clear();
        }
    }

    /* renamed from: d */
    public boolean mo644d() {
        return this.f4187n instanceof art;
    }

    /* renamed from: e */
    public boolean mo645e() {
        return this.f4187n instanceof aru;
    }

    /* renamed from: f */
    public void mo646f() {
        if (mo644d()) {
            ((art) this.f4187n).m5261d();
        }
    }

    /* renamed from: g */
    public void mo647g() {
    }

    /* renamed from: h */
    void m5376h() {
        this.f4182i.lock();
        try {
            this.f4187n = new aru(this, this.f4176c, this.f4177d, this.f4185l, this.f4178e, this.f4182i, this.f4184k);
            this.f4187n.mo672a();
            this.f4183j.signalAll();
        } finally {
            this.f4182i.unlock();
        }
    }

    /* renamed from: i */
    void m5377i() {
        this.f4182i.lock();
        try {
            this.f4180g.m5353c();
            this.f4187n = new art(this);
            this.f4187n.mo672a();
            this.f4183j.signalAll();
        } finally {
            this.f4182i.unlock();
        }
    }

    /* renamed from: j */
    void m5378j() {
        for (C0297f f : this.f4174a.values()) {
            f.mo779f();
        }
    }

    public void onConnected(Bundle bundle) {
        this.f4182i.lock();
        try {
            this.f4187n.mo674a(bundle);
        } finally {
            this.f4182i.unlock();
        }
    }

    public void onConnectionSuspended(int i) {
        this.f4182i.lock();
        try {
            this.f4187n.mo673a(i);
        } finally {
            this.f4182i.unlock();
        }
    }
}
