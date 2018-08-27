package com.p000;

import android.content.Context;
import com.google.android.gms.internal.zzeg;
import com.google.android.gms.internal.zzqh;
import java.util.concurrent.Callable;

@bhd
/* renamed from: blq */
public class blq {
    /* renamed from: a */
    public blo m9441a(Context context, zzeg zzeg, boolean z, boolean z2, avc avc, zzqh zzqh) {
        final Context context2 = context;
        final zzeg zzeg2 = zzeg;
        final boolean z3 = z;
        final boolean z4 = z2;
        final avc avc2 = avc;
        final zzqh zzqh2 = zzqh;
        return (blo) bku.m9268a(new Callable<blo>(this) {
            /* renamed from: g */
            final /* synthetic */ blq f6868g;

            /* renamed from: a */
            public blo m9439a() {
                return this.f6868g.m9442a(context2, zzeg2, z3, z4, avc2, zzqh2, null, null, null);
            }

            public /* synthetic */ Object call() throws Exception {
                return m9439a();
            }
        });
    }

    /* renamed from: a */
    public blo m9442a(Context context, zzeg zzeg, boolean z, boolean z2, avc avc, zzqh zzqh, bbj bbj, akm akm, ajx ajx) {
        final Context context2 = context;
        final zzeg zzeg2 = zzeg;
        final boolean z3 = z;
        final boolean z4 = z2;
        final avc avc2 = avc;
        final zzqh zzqh2 = zzqh;
        final bbj bbj2 = bbj;
        final akm akm2 = akm;
        final ajx ajx2 = ajx;
        return (blo) bku.m9268a(new Callable<blo>(this) {
            /* renamed from: a */
            public blo m9440a() {
                blo blr = new blr(blt.m9512a(context2, zzeg2, z3, z4, avc2, zzqh2, bbj2, akm2, ajx2));
                blr.setWebViewClient(ako.m2345g().mo1264a(blr, z4));
                blr.setWebChromeClient(ako.m2345g().mo1269c(blr));
                return blr;
            }

            public /* synthetic */ Object call() throws Exception {
                return m9440a();
            }
        });
    }
}
