package com.p000;

import android.content.Context;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import com.google.android.gms.internal.zzeg;
import java.lang.ref.WeakReference;
import java.util.Map;
import org.json.JSONObject;
import p000.bjt.C1254a;
import p000.blp.C0197a;
import p000.blp.C1188b;

@bhd
/* renamed from: bgw */
public class bgw {
    /* renamed from: a */
    private final Object f6192a = new Object();
    /* renamed from: b */
    private final Context f6193b;
    /* renamed from: c */
    private final avc f6194c;
    /* renamed from: d */
    private final C1254a f6195d;
    /* renamed from: e */
    private final bbj f6196e;
    /* renamed from: f */
    private final akk f6197f;
    /* renamed from: g */
    private OnGlobalLayoutListener f6198g;
    /* renamed from: h */
    private OnScrollChangedListener f6199h;
    /* renamed from: i */
    private bkr f6200i;
    /* renamed from: j */
    private int f6201j = -1;
    /* renamed from: k */
    private int f6202k = -1;

    /* renamed from: bgw$2 */
    class C11922 implements bcy {
        /* renamed from: a */
        final /* synthetic */ bgw f6187a;

        C11922(bgw bgw) {
            this.f6187a = bgw;
        }

        /* renamed from: a */
        public void mo277a(blo blo, Map<String, String> map) {
            this.f6187a.f6197f.m2247J();
        }
    }

    public bgw(Context context, avc avc, C1254a c1254a, bbj bbj, akk akk) {
        this.f6193b = context;
        this.f6194c = avc;
        this.f6195d = c1254a;
        this.f6196e = bbj;
        this.f6197f = akk;
        this.f6200i = new bkr(200);
    }

    /* renamed from: a */
    private OnGlobalLayoutListener m8406a(final WeakReference<blo> weakReference) {
        if (this.f6198g == null) {
            this.f6198g = new OnGlobalLayoutListener(this) {
                /* renamed from: b */
                final /* synthetic */ bgw f6189b;

                public void onGlobalLayout() {
                    this.f6189b.m8410a(weakReference, false);
                }
            };
        }
        return this.f6198g;
    }

    /* renamed from: a */
    private void m8409a(blo blo) {
        blp l = blo.mo1322l();
        l.m9419a("/video", bcx.f5606n);
        l.m9419a("/videoMeta", bcx.f5607o);
        l.m9419a("/precache", bcx.f5609q);
        l.m9419a("/delayPageLoaded", bcx.f5612t);
        l.m9419a("/instrument", bcx.f5610r);
        l.m9419a("/log", bcx.f5601i);
        l.m9419a("/videoClicked", bcx.f5602j);
        l.m9419a("/trackActiveViewUnit", new C11922(this));
    }

    /* renamed from: a */
    private void m8410a(WeakReference<blo> weakReference, boolean z) {
        if (weakReference != null) {
            blo blo = (blo) weakReference.get();
            if (blo != null && blo.mo1305b() != null) {
                if (!z || this.f6200i.m9265a()) {
                    int[] iArr = new int[2];
                    blo.mo1305b().getLocationOnScreen(iArr);
                    int b = azp.m6789a().m9295b(this.f6193b, iArr[0]);
                    int b2 = azp.m6789a().m9295b(this.f6193b, iArr[1]);
                    synchronized (this.f6192a) {
                        if (!(this.f6201j == b && this.f6202k == b2)) {
                            this.f6201j = b;
                            this.f6202k = b2;
                            blo.mo1322l().m9408a(this.f6201j, this.f6202k, !z);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: b */
    private OnScrollChangedListener m8412b(final WeakReference<blo> weakReference) {
        if (this.f6199h == null) {
            this.f6199h = new OnScrollChangedListener(this) {
                /* renamed from: b */
                final /* synthetic */ bgw f6191b;

                public void onScrollChanged() {
                    this.f6191b.m8410a(weakReference, true);
                }
            };
        }
        return this.f6199h;
    }

    /* renamed from: a */
    public ble<blo> m8413a(final JSONObject jSONObject) {
        final ble blb = new blb();
        ako.m2343e().m9106a(new Runnable(this) {
            /* renamed from: c */
            final /* synthetic */ bgw f6186c;

            /* renamed from: bgw$1$2 */
            class C11902 implements C0197a {
                /* renamed from: a */
                final /* synthetic */ C11911 f6183a;

                C11902(C11911 c11911) {
                    this.f6183a = c11911;
                }

                /* renamed from: a */
                public void mo193a(blo blo, boolean z) {
                    this.f6183a.f6186c.f6197f.m2251N();
                    blb.m7770b((Object) blo);
                }
            }

            public void run() {
                try {
                    final blo a = this.f6186c.m8414a();
                    this.f6186c.f6197f.m2260a(a);
                    WeakReference weakReference = new WeakReference(a);
                    a.mo1322l().m9410a(this.f6186c.m8406a(weakReference), this.f6186c.m8412b(weakReference));
                    this.f6186c.m8409a(a);
                    a.mo1322l().m9414a(new C1188b(this) {
                        /* renamed from: b */
                        final /* synthetic */ C11911 f6182b;

                        /* renamed from: a */
                        public void mo1185a(blo blo) {
                            a.mo1025a("google.afma.nativeAds.renderVideo", jSONObject);
                        }
                    });
                    a.mo1322l().m9413a(new C11902(this));
                    a.loadUrl((String) bbb.cf.m7064c());
                } catch (Throwable e) {
                    bky.m9009c("Exception occurred while getting video view", e);
                    blb.m7770b(null);
                }
            }
        });
        return blb;
    }

    /* renamed from: a */
    blo m8414a() {
        return ako.m2344f().m9442a(this.f6193b, zzeg.m19667a(this.f6193b), false, false, this.f6194c, this.f6195d.f6529a.f15042k, this.f6196e, null, this.f6197f.m1986f());
    }
}
