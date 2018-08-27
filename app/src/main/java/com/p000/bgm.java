package com.p000;

import android.content.Context;
import com.google.android.gms.internal.zzmk;
import com.google.android.gms.internal.zzmn;
import java.util.concurrent.atomic.AtomicBoolean;
import p000.bgo.C0218a;
import p000.bjt.C1254a;
import p000.blp.C0197a;

@bhd
/* renamed from: bgm */
public abstract class bgm implements bki<Void>, C0197a {
    /* renamed from: a */
    protected final C0218a f6083a;
    /* renamed from: b */
    protected final Context f6084b;
    /* renamed from: c */
    protected final blo f6085c;
    /* renamed from: d */
    protected final C1254a f6086d;
    /* renamed from: e */
    protected zzmn f6087e;
    /* renamed from: f */
    protected final Object f6088f = new Object();
    /* renamed from: g */
    private Runnable f6089g;
    /* renamed from: h */
    private AtomicBoolean f6090h = new AtomicBoolean(true);

    /* renamed from: bgm$1 */
    class C11671 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ bgm f6082a;

        C11671(bgm bgm) {
            this.f6082a = bgm;
        }

        public void run() {
            if (this.f6082a.f6090h.get()) {
                bky.m9008c("Timed out waiting for WebView to finish loading.");
                this.f6082a.mo194c();
            }
        }
    }

    protected bgm(Context context, C1254a c1254a, blo blo, C0218a c0218a) {
        this.f6084b = context;
        this.f6086d = c1254a;
        this.f6087e = this.f6086d.f6530b;
        this.f6085c = blo;
        this.f6083a = c0218a;
    }

    /* renamed from: b */
    private bjt m8302b(int i) {
        zzmk zzmk = this.f6086d.f6529a;
        return new bjt(zzmk.f15034c, this.f6085c, this.f6087e.f15078d, i, this.f6087e.f15080f, this.f6087e.f15084j, this.f6087e.f15086l, this.f6087e.f15085k, zzmk.f15040i, this.f6087e.f15082h, null, null, null, null, null, this.f6087e.f15083i, this.f6086d.f6532d, this.f6087e.f15081g, this.f6086d.f6534f, this.f6087e.f15088n, this.f6087e.f15089o, this.f6086d.f6536h, null, this.f6087e.f15060C, this.f6087e.f15061D, this.f6087e.f15062E, this.f6087e.f15063F, this.f6087e.f15064G, null, this.f6087e.f15067J, this.f6087e.f15071N);
    }

    /* renamed from: a */
    public final Void m8303a() {
        aoi.m4687b("Webview render task needs to be called on UI thread.");
        this.f6089g = new C11671(this);
        bkg.f6710a.postDelayed(this.f6089g, ((Long) bbb.bG.m7064c()).longValue());
        mo1176b();
        return null;
    }

    /* renamed from: a */
    protected void mo1177a(int i) {
        if (i != -2) {
            this.f6087e = new zzmn(i, this.f6087e.f15085k);
        }
        this.f6085c.mo1315e();
        this.f6083a.mo243b(m8302b(i));
    }

    /* renamed from: a */
    public void mo193a(blo blo, boolean z) {
        int i = 0;
        bky.m9006b("WebView finished loading.");
        if (this.f6090h.getAndSet(false)) {
            if (z) {
                i = -2;
            }
            mo1177a(i);
            bkg.f6710a.removeCallbacks(this.f6089g);
        }
    }

    /* renamed from: b */
    protected abstract void mo1176b();

    /* renamed from: c */
    public void mo194c() {
        if (this.f6090h.getAndSet(false)) {
            this.f6085c.stopLoading();
            ako.m2345g().m9162a(this.f6085c);
            mo1177a(-1);
            bkg.f6710a.removeCallbacks(this.f6089g);
        }
    }

    /* renamed from: d */
    public /* synthetic */ Object mo195d() {
        return m8303a();
    }
}
