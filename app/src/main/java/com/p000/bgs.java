package com.p000;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.internal.zzmk;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import p000.bgn.C1170a;
import p000.bgo.C0218a;
import p000.bjt.C1254a;

@bhd
/* renamed from: bgs */
public class bgs extends bgn {
    /* renamed from: g */
    bel f6111g;
    /* renamed from: h */
    protected ber f6112h;
    /* renamed from: i */
    private bex f6113i;
    /* renamed from: j */
    private ben f6114j;
    /* renamed from: k */
    private final bbj f6115k;
    /* renamed from: l */
    private final blo f6116l;
    /* renamed from: m */
    private boolean f6117m;

    bgs(Context context, C1254a c1254a, bex bex, C0218a c0218a, bbj bbj, blo blo) {
        super(context, c1254a, c0218a);
        this.f6113i = bex;
        this.f6114j = c1254a.f6531c;
        this.f6115k = bbj;
        this.f6116l = blo;
    }

    /* renamed from: a */
    private static String m8328a(ber ber) {
        String str = ber.f5879b.f5825d;
        int b = bgs.m8331b(ber.f5878a);
        return new StringBuilder(String.valueOf(str).length() + 33).append(str).append(".").append(b).append(".").append(ber.f5884g).toString();
    }

    /* renamed from: a */
    private static String m8329a(List<ber> list) {
        String str = "";
        if (list == null) {
            return str.toString();
        }
        String str2 = str;
        for (ber ber : list) {
            if (!(ber == null || ber.f5879b == null || TextUtils.isEmpty(ber.f5879b.f5825d))) {
                str2 = String.valueOf(str2);
                str = String.valueOf(bgs.m8328a(ber));
                str2 = new StringBuilder((String.valueOf(str2).length() + 1) + String.valueOf(str).length()).append(str2).append(str).append("_").toString();
            }
        }
        return str2.substring(0, Math.max(0, str2.length() - 1));
    }

    /* renamed from: b */
    private static int m8331b(int i) {
        switch (i) {
            case -1:
                return 4;
            case 0:
                return 0;
            case 1:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 5;
            default:
                return 6;
        }
    }

    /* renamed from: e */
    private void m8332e() throws C1170a {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        bkg.f6710a.post(new Runnable(this) {
            /* renamed from: b */
            final /* synthetic */ bgs f6110b;

            public void run() {
                synchronized (this.f6110b.d) {
                    this.f6110b.f6117m = akh.m2212a(this.f6110b.f6116l, this.f6110b.f6112h, countDownLatch);
                }
            }
        });
        try {
            countDownLatch.await(10, TimeUnit.SECONDS);
            synchronized (this.d) {
                if (!this.f6117m) {
                    throw new C1170a("View could not be prepared", 0);
                } else if (this.f6116l.mo1333r()) {
                    throw new C1170a("Assets not loaded, web view is destroyed", 0);
                }
            }
        } catch (InterruptedException e) {
            String valueOf = String.valueOf(e);
            throw new C1170a(new StringBuilder(String.valueOf(valueOf).length() + 38).append("Interrupted while waiting for latch : ").append(valueOf).toString(), 0);
        }
    }

    /* renamed from: a */
    protected bjt mo1179a(int i) {
        zzmk zzmk = this.e.f6529a;
        return new bjt(zzmk.f15034c, this.f6116l, this.f.f15078d, i, this.f.f15080f, this.f.f15084j, this.f.f15086l, this.f.f15085k, zzmk.f15040i, this.f.f15082h, this.f6112h != null ? this.f6112h.f5879b : null, this.f6112h != null ? this.f6112h.f5880c : null, this.f6112h != null ? this.f6112h.f5881d : AdMobAdapter.class.getName(), this.f6114j, this.f6112h != null ? this.f6112h.f5882e : null, this.f.f15083i, this.e.f6532d, this.f.f15081g, this.e.f6534f, this.f.f15088n, this.f.f15089o, this.e.f6536h, null, this.f.f15060C, this.f.f15061D, this.f.f15062E, this.f6114j != null ? this.f6114j.f5851n : false, this.f.f15064G, this.f6111g != null ? bgs.m8329a(this.f6111g.mo1051b()) : null, this.f.f15067J, this.f.f15071N);
    }

    /* renamed from: a */
    protected void mo1180a(long j) throws C1170a {
        boolean z;
        ListIterator listIterator;
        synchronized (this.d) {
            this.f6111g = m8335b(j);
        }
        List arrayList = new ArrayList(this.f6114j.f5838a);
        Bundle bundle = this.e.f6529a.f15034c.f14925m;
        String str = "com.google.ads.mediation.admob.AdMobAdapter";
        if (bundle != null) {
            bundle = bundle.getBundle(str);
            if (bundle != null) {
                z = bundle.getBoolean("_skipMediation");
                if (z) {
                    listIterator = arrayList.listIterator();
                    while (listIterator.hasNext()) {
                        if (!((bem) listIterator.next()).f5824c.contains(str)) {
                            listIterator.remove();
                        }
                    }
                }
                this.f6112h = this.f6111g.mo1049a(arrayList);
                switch (this.f6112h.f5878a) {
                    case 0:
                        if (this.f6112h.f5879b != null && this.f6112h.f5879b.f5833l != null) {
                            m8332e();
                            return;
                        }
                        return;
                    case 1:
                        throw new C1170a("No fill from any mediation ad networks.", 3);
                    default:
                        throw new C1170a("Unexpected mediation result: " + this.f6112h.f5878a, 0);
                }
            }
        }
        z = false;
        if (z) {
            listIterator = arrayList.listIterator();
            while (listIterator.hasNext()) {
                if (!((bem) listIterator.next()).f5824c.contains(str)) {
                    listIterator.remove();
                }
            }
        }
        this.f6112h = this.f6111g.mo1049a(arrayList);
        switch (this.f6112h.f5878a) {
            case 0:
                if (this.f6112h.f5879b != null) {
                    return;
                }
                return;
            case 1:
                throw new C1170a("No fill from any mediation ad networks.", 3);
            default:
                throw new C1170a("Unexpected mediation result: " + this.f6112h.f5878a, 0);
        }
    }

    /* renamed from: b */
    bel m8335b(long j) {
        if (this.f6114j.f5849l != -1) {
            return new bet(this.b, this.e.f6529a, this.f6113i, this.f6114j, this.f.f15094t, this.f.f15059B, j, ((Long) bbb.bG.m7064c()).longValue(), 2);
        }
        return new beu(this.b, this.e.f6529a, this.f6113i, this.f6114j, this.f.f15094t, this.f.f15059B, j, ((Long) bbb.bG.m7064c()).longValue(), this.f6115k);
    }

    /* renamed from: b */
    public void mo197b() {
        synchronized (this.d) {
            super.mo197b();
            if (this.f6111g != null) {
                this.f6111g.mo1050a();
            }
        }
    }
}
