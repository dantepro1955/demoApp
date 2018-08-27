package com.p000;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.internal.zzaqi;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import p000.aot.C0662b;
import p000.aot.C0663c;
import p000.atr.C0800a;

/* renamed from: auc */
public class auc {

    /* renamed from: auc$a */
    static class C0826a implements C0662b, C0663c {
        /* renamed from: a */
        protected aud f4593a;
        /* renamed from: b */
        private final String f4594b;
        /* renamed from: c */
        private final String f4595c;
        /* renamed from: d */
        private final LinkedBlockingQueue<C0800a> f4596d;
        /* renamed from: e */
        private final HandlerThread f4597e = new HandlerThread("GassClient");

        public C0826a(Context context, String str, String str2) {
            this.f4594b = str;
            this.f4595c = str2;
            this.f4597e.start();
            this.f4593a = new aud(context, this.f4597e.getLooper(), this, this);
            this.f4596d = new LinkedBlockingQueue();
            m5740c();
        }

        /* renamed from: a */
        public C0800a m5734a() {
            return m5738b(5000);
        }

        /* renamed from: a */
        public void mo597a(int i) {
            try {
                this.f4596d.put(new C0800a());
            } catch (InterruptedException e) {
            }
        }

        /* renamed from: a */
        public void mo598a(Bundle bundle) {
            aug b = m5739b();
            if (b != null) {
                try {
                    this.f4596d.put(b.mo731a(new zzaqi(this.f4594b, this.f4595c)).m19629b());
                } catch (Throwable th) {
                } finally {
                    m5741d();
                    this.f4597e.quit();
                }
            }
        }

        /* renamed from: a */
        public void mo599a(ConnectionResult connectionResult) {
            try {
                this.f4596d.put(new C0800a());
            } catch (InterruptedException e) {
            }
        }

        /* renamed from: b */
        public C0800a m5738b(int i) {
            C0800a c0800a;
            try {
                c0800a = (C0800a) this.f4596d.poll((long) i, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e) {
                c0800a = null;
            }
            return c0800a == null ? new C0800a() : c0800a;
        }

        /* renamed from: b */
        protected aug m5739b() {
            try {
                return this.f4593a.mo344e();
            } catch (IllegalStateException e) {
                return null;
            } catch (DeadObjectException e2) {
                return null;
            }
        }

        /* renamed from: c */
        protected void m5740c() {
            this.f4593a.m2630n();
        }

        /* renamed from: d */
        public void m5741d() {
            if (this.f4593a == null) {
                return;
            }
            if (this.f4593a.m2624g() || this.f4593a.m2625h()) {
                this.f4593a.mo779f();
            }
        }
    }

    /* renamed from: a */
    public static C0800a m5742a(Context context, String str, String str2) {
        return new C0826a(context, str, str2).m5734a();
    }
}
