package com.p000;

import android.location.Location;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.MediationAdapter;
import java.util.Date;
import p000.bai.C0964a;

/* renamed from: ahv */
public final class ahv {
    /* renamed from: a */
    public static final String f1523a = "B3EEABB8EE11C2BE770B684D95219ECB";
    /* renamed from: b */
    private final bai f1524b;

    /* renamed from: ahv$a */
    public static final class C0185a {
        /* renamed from: a */
        private final C0964a f1522a = new C0964a();

        public C0185a() {
            this.f1522a.m6918b(ahv.f1523a);
        }

        /* renamed from: a */
        public C0185a m1615a(int i) {
            this.f1522a.m6912a(i);
            return this;
        }

        /* renamed from: a */
        public C0185a m1616a(Location location) {
            this.f1522a.m6913a(location);
            return this;
        }

        /* renamed from: a */
        public C0185a m1617a(Class<? extends MediationAdapter> cls, Bundle bundle) {
            this.f1522a.m6914a(cls, bundle);
            if (cls.equals(AdMobAdapter.class) && bundle.getBoolean("_emulatorLiveAds")) {
                this.f1522a.m6920c(ahv.f1523a);
            }
            return this;
        }

        /* renamed from: a */
        public C0185a m1618a(String str) {
            this.f1522a.m6915a(str);
            return this;
        }

        /* renamed from: a */
        public C0185a m1619a(Date date) {
            this.f1522a.m6916a(date);
            return this;
        }

        /* renamed from: a */
        public C0185a m1620a(boolean z) {
            this.f1522a.m6917a(z);
            return this;
        }

        /* renamed from: a */
        public ahv m1621a() {
            return new ahv();
        }

        /* renamed from: b */
        public C0185a m1622b(String str) {
            this.f1522a.m6918b(str);
            return this;
        }

        /* renamed from: b */
        public C0185a m1623b(boolean z) {
            this.f1522a.m6919b(z);
            return this;
        }

        /* renamed from: c */
        public C0185a m1624c(String str) {
            aoi.m4680a((Object) str, (Object) "Content URL must be non-null.");
            aoi.m4682a(str, (Object) "Content URL must be non-empty.");
            aoi.m4690b(str.length() <= 512, "Content URL must not exceed %d in length.  Provided length was %d.", Integer.valueOf(512), Integer.valueOf(str.length()));
            this.f1522a.m6921d(str);
            return this;
        }
    }

    private ahv(C0185a c0185a) {
        this.f1524b = new bai(c0185a.f1522a);
    }

    /* renamed from: a */
    public bai m1625a() {
        return this.f1524b;
    }
}
