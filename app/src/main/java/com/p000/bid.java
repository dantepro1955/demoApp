package com.p000;

import android.content.Context;
import java.util.WeakHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import p000.bic.C1232a;

@bhd
/* renamed from: bid */
public final class bid {
    /* renamed from: a */
    private WeakHashMap<Context, C1234a> f6447a = new WeakHashMap();

    /* renamed from: bid$a */
    class C1234a {
        /* renamed from: a */
        public final long f6445a = ako.m2349k().mo606a();
        /* renamed from: b */
        public final bic f6446b;

        public C1234a(bid bid, bic bic) {
            this.f6446b = bic;
        }

        /* renamed from: a */
        public boolean m8663a() {
            return ((Long) bbb.bq.m7064c()).longValue() + this.f6445a < ako.m2349k().mo606a();
        }
    }

    /* renamed from: a */
    public Future<bic> m8665a(final Context context) {
        return bkf.m9060a(new Callable<bic>(this) {
            /* renamed from: b */
            final /* synthetic */ bid f6444b;

            /* renamed from: a */
            public bic m8662a() {
                C1234a c1234a = (C1234a) this.f6444b.f6447a.get(context);
                bic a = (c1234a == null || c1234a.m8663a() || !((Boolean) bbb.bp.m7064c()).booleanValue()) ? new C1232a(context).m8661a() : new C1232a(context, c1234a.f6446b).m8661a();
                this.f6444b.f6447a.put(context, new C1234a(this.f6444b, a));
                return a;
            }

            public /* synthetic */ Object call() throws Exception {
                return m8662a();
            }
        });
    }
}
