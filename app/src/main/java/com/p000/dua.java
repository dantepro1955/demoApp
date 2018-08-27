package com.p000;

import android.os.Looper;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: AndroidSchedulers */
/* renamed from: dua */
public final class dua {
    /* renamed from: a */
    private static final AtomicReference<dua> f22953a = new AtomicReference();
    /* renamed from: b */
    private final dts f22954b;

    /* renamed from: b */
    private static dua m29394b() {
        dua dua;
        do {
            dua = (dua) f22953a.get();
            if (dua != null) {
                break;
            }
            dua = new dua();
        } while (!f22953a.compareAndSet(null, dua));
        return dua;
    }

    private dua() {
        dts b = dty.m29360a().m29361b().m29364b();
        if (b != null) {
            this.f22954b = b;
        } else {
            this.f22954b = new dub(Looper.getMainLooper());
        }
    }

    /* renamed from: a */
    public static dts m29393a() {
        return dua.m29394b().f22954b;
    }
}
