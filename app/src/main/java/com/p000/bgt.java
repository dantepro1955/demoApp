package com.p000;

import android.content.Context;
import com.google.android.gms.internal.zzmn;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p000.bgo.C0218a;
import p000.bjt.C1254a;

@bhd
/* renamed from: bgt */
public class bgt extends bkb {
    /* renamed from: a */
    private final C0218a f6120a;
    /* renamed from: b */
    private final zzmn f6121b;
    /* renamed from: c */
    private final C1254a f6122c;
    /* renamed from: d */
    private final bgv f6123d;
    /* renamed from: e */
    private final Object f6124e;
    /* renamed from: f */
    private Future<bjt> f6125f;

    public bgt(Context context, akk akk, C1254a c1254a, avc avc, C0218a c0218a, bbj bbj) {
        this(c1254a, c0218a, new bgv(context, akk, new bkn(context), avc, c1254a, bbj));
    }

    bgt(C1254a c1254a, C0218a c0218a, bgv bgv) {
        this.f6124e = new Object();
        this.f6122c = c1254a;
        this.f6121b = c1254a.f6530b;
        this.f6120a = c0218a;
        this.f6123d = bgv;
    }

    /* renamed from: a */
    private bjt m8338a(int i) {
        return new bjt(this.f6122c.f6529a.f15034c, null, null, i, null, null, this.f6121b.f15086l, this.f6121b.f15085k, this.f6122c.f6529a.f15040i, false, null, null, null, null, null, this.f6121b.f15083i, this.f6122c.f6532d, this.f6121b.f15081g, this.f6122c.f6534f, this.f6121b.f15088n, this.f6121b.f15089o, this.f6122c.f6536h, null, null, null, null, this.f6122c.f6530b.f15063F, this.f6122c.f6530b.f15064G, null, null, this.f6121b.f15071N);
    }

    /* renamed from: a */
    public void mo196a() {
        bjt bjt;
        int i;
        try {
            synchronized (this.f6124e) {
                this.f6125f = bkf.m9060a(this.f6123d);
            }
            bjt = (bjt) this.f6125f.get(60000, TimeUnit.MILLISECONDS);
            i = -2;
        } catch (TimeoutException e) {
            bky.m9011e("Timed out waiting for native ad.");
            this.f6125f.cancel(true);
            i = 2;
            bjt = null;
        } catch (ExecutionException e2) {
            bjt = null;
            i = 0;
        } catch (InterruptedException e3) {
            bjt = null;
            i = 0;
        } catch (CancellationException e4) {
            bjt = null;
            i = 0;
        }
        if (bjt == null) {
            bjt = m8338a(i);
        }
        bkg.f6710a.post(new Runnable(this) {
            /* renamed from: b */
            final /* synthetic */ bgt f6119b;

            public void run() {
                this.f6119b.f6120a.mo243b(bjt);
            }
        });
    }

    /* renamed from: b */
    public void mo197b() {
        synchronized (this.f6124e) {
            if (this.f6125f != null) {
                this.f6125f.cancel(true);
            }
        }
    }
}
