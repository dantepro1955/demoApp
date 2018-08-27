package com.p000;

import java.util.Arrays;

/* compiled from: SafeSubscriber */
/* renamed from: dya */
public class dya<T> extends dtv<T> {
    /* renamed from: a */
    boolean f23455a;
    /* renamed from: b */
    private final dtv<? super T> f23456b;

    public dya(dtv<? super T> dtv) {
        super(dtv);
        this.f23456b = dtv;
    }

    public void onCompleted() {
        duj duj;
        if (!this.f23455a) {
            this.f23455a = true;
            try {
                this.f23456b.onCompleted();
                try {
                    unsubscribe();
                } catch (Throwable th) {
                    dyg.m29850a(th);
                    duj = new duj(th.getMessage(), th);
                }
            } catch (Throwable th2) {
                try {
                    unsubscribe();
                } catch (Throwable th3) {
                    dyg.m29850a(th3);
                    duj = new duj(th3.getMessage(), th3);
                }
            }
        }
    }

    public void onError(Throwable th) {
        dud.m29409b(th);
        if (!this.f23455a) {
            this.f23455a = true;
            m29804a(th);
        }
    }

    public void onNext(T t) {
        try {
            if (!this.f23455a) {
                this.f23456b.onNext(t);
            }
        } catch (Throwable th) {
            dud.m29404a(th, (dtq) this);
        }
    }

    /* renamed from: a */
    protected void m29804a(Throwable th) {
        dug dug;
        dyj.a().b().a(th);
        try {
            this.f23456b.onError(th);
            try {
                unsubscribe();
            } catch (Throwable th2) {
                dyg.m29850a(th2);
                dug = new dug(th2);
            }
        } catch (duh e) {
            unsubscribe();
            throw e;
        } catch (Throwable th3) {
            dyg.m29850a(th3);
            dug dug2 = new dug("Error occurred when trying to propagate error to Observer.onError and during unsubscription.", new duc(Arrays.asList(new Throwable[]{th, th2, th3})));
        }
    }
}
