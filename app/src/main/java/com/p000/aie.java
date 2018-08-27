package com.p000;

import android.os.Bundle;
import com.google.android.gms.ads.mediation.MediationAdapter;
import java.util.Date;
import p000.bai.C0964a;

/* renamed from: aie */
public final class aie {
    /* renamed from: a */
    private final bai f1563a;

    /* renamed from: aie$a */
    public static final class C0190a {
        /* renamed from: a */
        private final C0964a f1562a = new C0964a();

        /* renamed from: a */
        public C0190a m1662a(int i) {
            this.f1562a.m6912a(i);
            return this;
        }

        /* renamed from: a */
        public C0190a m1663a(Class<? extends MediationAdapter> cls, Bundle bundle) {
            this.f1562a.m6914a(cls, bundle);
            return this;
        }

        /* renamed from: a */
        public C0190a m1664a(Date date) {
            this.f1562a.m6916a(date);
            return this;
        }

        /* renamed from: a */
        public aie m1665a() {
            return new aie();
        }
    }

    private aie(C0190a c0190a) {
        this.f1563a = new bai(c0190a.f1562a);
    }

    /* renamed from: a */
    public bai m1666a() {
        return this.f1563a;
    }
}
