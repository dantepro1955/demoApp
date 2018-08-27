package com.p000;

import android.app.Activity;
import android.util.Log;
import android.webkit.WebView;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicReference;
import p000.byh.C1594a;
import p000.byi.C1596b;
import p000.byi.C1597c;
import p000.byi.C1598d;
import p000.byl.C1589a;
import p000.byp.C1608a;

/* compiled from: MoatFactoryImpl */
/* renamed from: byc */
class byc extends byb {
    /* renamed from: c */
    private static final AtomicReference<byj> f8171c = new AtomicReference();
    /* renamed from: a */
    private final byq f8172a = new byr();
    /* renamed from: b */
    private final bxr f8173b;

    byc(Activity activity) throws byu {
        if (f8171c.get() == null) {
            Object byk;
            C1597c c1597c = new C1597c();
            try {
                byk = new byk(bye.instance);
            } catch (Exception e) {
                byt.m11829a(e);
                C1597c c1597c2 = c1597c;
            }
            f8171c.compareAndSet(null, byk);
        }
        this.f8173b = new bxs(activity, (byj) f8171c.get());
        this.f8173b.mo1594b();
    }

    /* renamed from: a */
    public byo mo1602a(WebView webView) {
        try {
            return m11729b(webView);
        } catch (Exception e) {
            byt.m11829a(e);
            return new C1598d();
        }
    }

    /* renamed from: a */
    public byg mo1601a(String str) {
        try {
            return m11728b(str);
        } catch (Exception e) {
            byt.m11829a(e);
            return new C1596b();
        }
    }

    /* renamed from: b */
    private byo m11729b(WebView webView) throws byu {
        bys.m11828a(webView);
        final WeakReference weakReference = new WeakReference(webView);
        final byj byj = (byj) f8171c.get();
        return (byo) byl.m11797a(byj, new C1589a<byo>(this) {
            /* renamed from: c */
            final /* synthetic */ byc f8167c;

            /* renamed from: a */
            public byv<byo> mo1600a() {
                WebView webView = (WebView) weakReference.get();
                boolean b = byj.mo1615b();
                if (webView == null) {
                    if (b) {
                        Log.e("MoatFactory", "Target ViewGroup is null. Not creating WebAdTracker.");
                    }
                    return byv.m11830a();
                }
                if (b) {
                    Log.d("MoatFactory", "Creating WebAdTracker for " + webView.getClass().getSimpleName() + "@" + webView.hashCode());
                }
                return byv.m11831a(new byp(webView, this.f8167c.f8173b, byj));
            }
        }, new C1608a());
    }

    /* renamed from: b */
    private byg m11728b(final String str) throws byu {
        final byj byj = (byj) f8171c.get();
        return (byg) byl.m11797a(byj, new C1589a<byg>(this) {
            /* renamed from: c */
            final /* synthetic */ byc f8170c;

            /* renamed from: a */
            public byv<byg> mo1600a() {
                if (byj.mo1615b()) {
                    Log.d("MoatFactory", "Creating NativeVideo tracker.");
                }
                return byv.m11831a(new byh(str, this.f8170c.f8173b, byj));
            }
        }, new C1594a());
    }
}
