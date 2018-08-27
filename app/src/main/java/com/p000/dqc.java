package com.p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* renamed from: dqc */
public abstract class dqc {
    /* renamed from: c */
    private static final rk f22568c = dnn.m28258a(dqc.class);
    /* renamed from: a */
    protected Context f22569a;
    /* renamed from: b */
    protected dqe f22570b;
    /* renamed from: d */
    private Object f22571d = new Object();

    /* renamed from: dqc$1 */
    class C50351 extends BroadcastReceiver {
        /* renamed from: a */
        private /* synthetic */ dqc f22567a;

        C50351(dqc dqc) {
            this.f22567a = dqc;
        }

        public final void onReceive(Context context, Intent intent) {
            int intExtra = intent.getIntExtra(dqe.f22588b, -1);
            if (dqc.f22568c.mo4278c()) {
                dqc.f22568c.mo4277c("BluetoothHeadset BroadcastReceiver " + intExtra);
            }
            synchronized (this.f22567a.f22571d) {
                if (intExtra == dqe.f22589c) {
                    if (dqc.f22568c.mo4278c()) {
                        dqc.f22568c.mo4277c((Object) "BluetoothHeadset SCO connected. Notify wait lock.");
                    }
                    this.f22567a.f22571d.notify();
                }
            }
        }
    }

    protected dqc(Context context) {
        this.f22569a = context;
        this.f22570b = new dqe(this.f22569a);
    }

    /* renamed from: a */
    public static dqc m28686a(Context context) {
        int i = dqa.f22560a;
        return (i < 8 || dqa.f22561b) ? new dqh(context) : i < 9 ? new dqi(context) : new dqg(context);
    }

    /* renamed from: a */
    public final void m28689a() {
        IntentFilter intentFilter = new IntentFilter(dqe.f22587a);
        BroadcastReceiver c50351 = new C50351(this);
        synchronized (this.f22571d) {
            this.f22569a.registerReceiver(c50351, intentFilter);
            long currentTimeMillis = System.currentTimeMillis();
            mo4546d();
            try {
                this.f22571d.wait(3000);
            } catch (InterruptedException e) {
                if (f22568c.mo4282e()) {
                    f22568c.mo4281e("BluetoothHeadset mHeadsetScoSyncObj.wait() threw exception:" + e);
                }
            }
            if (f22568c.mo4278c()) {
                f22568c.mo4277c("BluetoothHeadset " + (System.currentTimeMillis() - currentTimeMillis) + "ms to wait for SCO");
            }
        }
        this.f22569a.unregisterReceiver(c50351);
    }

    /* renamed from: b */
    public final boolean m28690b() {
        return this.f22570b.m28712a() != null;
    }

    /* renamed from: c */
    public final void m28691c() {
        if (this.f22570b != null) {
            try {
                this.f22570b.m28715d();
            } catch (Throwable th) {
            }
            this.f22570b = null;
        }
    }

    /* renamed from: d */
    public abstract void mo4546d();

    /* renamed from: e */
    public abstract void mo4547e();

    /* renamed from: f */
    public abstract int mo4548f();

    /* renamed from: g */
    public abstract int mo4549g();
}
