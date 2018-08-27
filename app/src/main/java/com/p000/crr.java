package com.p000;

import android.content.Context;
import com.taplytics.sdk.TaplyticsVar;
import com.taplytics.sdk.TaplyticsVarListener;

/* compiled from: SimpleTaplyticsExperiment */
/* renamed from: crr */
public abstract class crr<T> extends crm {

    /* compiled from: SimpleTaplyticsExperiment */
    /* renamed from: crr$1 */
    class C45351 implements TaplyticsVarListener {
        /* renamed from: a */
        final /* synthetic */ crr f20009a;

        C45351(crr crr) {
            this.f20009a = crr;
        }

        public void variableUpdated(Object obj) {
            this.f20009a.mo4121a(obj);
        }
    }

    /* renamed from: a */
    public abstract void mo4121a(T t);

    /* renamed from: b */
    public abstract String mo4122b();

    /* renamed from: d */
    public abstract T mo4123d();

    /* renamed from: e */
    public abstract T mo4124e();

    public crr(Context context) {
        super(context);
        m24584f();
    }

    /* renamed from: f */
    protected void m24584f() {
        TaplyticsVar taplyticsVar = new TaplyticsVar(mo4122b(), mo4124e(), new C45351(this));
    }

    public String toString() {
        return getClass().getSimpleName() + ", " + "key=" + mo4122b() + ", " + "value=" + mo4123d() + ", " + "default=" + mo4124e();
    }
}
