package com.p000;

import android.content.Context;
import com.google.android.gms.internal.zzmn;
import p000.bjt.C1254a;

@bhd
/* renamed from: bgo */
public class bgo {

    /* renamed from: bgo$a */
    public interface C0218a {
        /* renamed from: b */
        void mo243b(bjt bjt);
    }

    /* renamed from: a */
    public bki m8315a(Context context, ajt ajt, C1254a c1254a, avc avc, blo blo, bex bex, C0218a c0218a, bbj bbj) {
        zzmn zzmn = c1254a.f6530b;
        bki bgs = zzmn.f15082h ? new bgs(context, c1254a, bex, c0218a, bbj, blo) : (zzmn.f15094t || (ajt instanceof akk)) ? (zzmn.f15094t && (ajt instanceof akk)) ? new bgt(context, (akk) ajt, c1254a, avc, c0218a, bbj) : new bgq(c1254a, c0218a) : (((Boolean) bbb.ao.m7064c()).booleanValue() && aqd.m4917g() && !aqd.m4919i() && blo != null && blo.mo1321k().f14934d) ? new bgr(context, c1254a, blo, c0218a) : new bgp(context, c1254a, blo, c0218a);
        String str = "AdRenderer: ";
        String valueOf = String.valueOf(bgs.getClass().getName());
        bky.m9006b(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        bgs.mo195d();
        return bgs;
    }

    /* renamed from: a */
    public bki m8316a(Context context, C1254a c1254a, bim bim) {
        bki bjd = new bjd(context, c1254a, bim);
        String str = "AdRenderer: ";
        String valueOf = String.valueOf(bjd.getClass().getName());
        bky.m9006b(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        bjd.mo195d();
        return bjd;
    }
}
