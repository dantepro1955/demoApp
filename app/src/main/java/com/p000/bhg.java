package com.p000;

import android.content.Context;
import com.google.android.gms.internal.zzmk;
import com.google.android.gms.internal.zzmn;
import com.google.android.gms.internal.zzqh;
import p000.bhh.C1206a;
import p000.bhh.C1207b;

@bhd
/* renamed from: bhg */
public final class bhg {

    /* renamed from: bhg$a */
    public interface C1201a {
        /* renamed from: a */
        void mo1188a(zzmn zzmn);
    }

    /* renamed from: bhg$b */
    interface C1202b {
        /* renamed from: a */
        boolean mo1189a(zzqh zzqh);
    }

    /* renamed from: bhg$1 */
    class C12031 implements C1202b {
        /* renamed from: a */
        final /* synthetic */ Context f6242a;

        C12031(Context context) {
            this.f6242a = context;
        }

        /* renamed from: a */
        public boolean mo1189a(zzqh zzqh) {
            return zzqh.f15124d || (apw.m4892c(this.f6242a) && !((Boolean) bbb.f5382O.m7064c()).booleanValue());
        }
    }

    /* renamed from: a */
    private static bki m8462a(Context context, blh<zzmk> blh, C1201a c1201a) {
        bky.m9006b("Fetching ad response from local ad request service.");
        bki c1206a = new C1206a(context, blh, c1201a);
        c1206a.mo195d();
        return c1206a;
    }

    /* renamed from: a */
    public static bki m8463a(Context context, zzqh zzqh, blh<zzmk> blh, C1201a c1201a) {
        return bhg.m8464a(context, zzqh, blh, c1201a, new C12031(context));
    }

    /* renamed from: a */
    static bki m8464a(Context context, zzqh zzqh, blh<zzmk> blh, C1201a c1201a, C1202b c1202b) {
        return c1202b.mo1189a(zzqh) ? bhg.m8462a(context, blh, c1201a) : bhg.m8465b(context, zzqh, blh, c1201a);
    }

    /* renamed from: b */
    private static bki m8465b(Context context, zzqh zzqh, blh<zzmk> blh, C1201a c1201a) {
        bky.m9006b("Fetching ad response from remote ad request service.");
        if (azp.m6789a().m9299c(context)) {
            return new C1207b(context, zzqh, blh, c1201a);
        }
        bky.m9011e("Failed to connect to remote ad request service.");
        return null;
    }
}
