package com.p000;

import android.content.Context;
import com.google.android.gms.internal.zzhc;
import com.inmobi.commons.analytics.iat.impl.AdTrackerConstants;
import p000.aii.C0194a;
import p000.aij.C0195a;

/* renamed from: ahu */
public class ahu {
    /* renamed from: a */
    private final azl f1519a;
    /* renamed from: b */
    private final Context f1520b;
    /* renamed from: c */
    private final azu f1521c;

    /* renamed from: ahu$a */
    public static class C0183a {
        /* renamed from: a */
        private final Context f1517a;
        /* renamed from: b */
        private final azv f1518b;

        C0183a(Context context, azv azv) {
            this.f1517a = context;
            this.f1518b = azv;
        }

        public C0183a(Context context, String str) {
            this((Context) aoi.m4680a((Object) context, AdTrackerConstants.MSG_APP_CONTEXT_NULL), azp.m6791b().m6781a(context, str, new bev()));
        }

        /* renamed from: a */
        public C0183a m1607a(aht aht) {
            try {
                this.f1518b.mo298a(new azf(aht));
            } catch (Throwable e) {
                bky.m9009c("Failed to set AdListener.", e);
            }
            return this;
        }

        /* renamed from: a */
        public C0183a m1608a(aih aih) {
            try {
                this.f1518b.mo302a(new zzhc(aih));
            } catch (Throwable e) {
                bky.m9009c("Failed to specify native ad options", e);
            }
            return this;
        }

        /* renamed from: a */
        public C0183a m1609a(C0194a c0194a) {
            try {
                this.f1518b.mo300a(new bcq(c0194a));
            } catch (Throwable e) {
                bky.m9009c("Failed to add app install ad listener", e);
            }
            return this;
        }

        /* renamed from: a */
        public C0183a m1610a(C0195a c0195a) {
            try {
                this.f1518b.mo301a(new bcr(c0195a));
            } catch (Throwable e) {
                bky.m9009c("Failed to add content ad listener", e);
            }
            return this;
        }

        /* renamed from: a */
        public ahu m1611a() {
            try {
                return new ahu(this.f1517a, this.f1518b.mo297a());
            } catch (Throwable e) {
                bky.m9007b("Failed to build AdLoader.", e);
                return null;
            }
        }
    }

    ahu(Context context, azu azu) {
        this(context, azu, azl.m6730a());
    }

    ahu(Context context, azu azu, azl azl) {
        this.f1520b = context;
        this.f1521c = azu;
        this.f1519a = azl;
    }

    /* renamed from: a */
    private void m1612a(bai bai) {
        try {
            this.f1521c.mo295a(this.f1519a.m6731a(this.f1520b, bai));
        } catch (Throwable e) {
            bky.m9007b("Failed to load ad.", e);
        }
    }

    /* renamed from: a */
    public void m1613a(ahv ahv) {
        m1612a(ahv.m1625a());
    }
}
