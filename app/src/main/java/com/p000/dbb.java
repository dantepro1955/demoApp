package com.p000;

import android.content.Context;
import com.amazon.device.iap.PurchasingListener;
import com.amazon.device.iap.PurchasingService;
import com.amazon.device.iap.model.ProductDataResponse.RequestStatus;
import java.lang.reflect.Field;

/* compiled from: TrackAmazonPurchase */
/* renamed from: dbb */
class dbb {
    /* renamed from: a */
    private Context f21014a;
    /* renamed from: b */
    private boolean f21015b = false;
    /* renamed from: c */
    private C4764a f21016c;
    /* renamed from: d */
    private Class<?> f21017d;
    /* renamed from: e */
    private Object f21018e;
    /* renamed from: f */
    private Field f21019f;

    /* compiled from: TrackAmazonPurchase */
    /* renamed from: dbb$1 */
    static /* synthetic */ class C47631 {
        /* renamed from: a */
        static final /* synthetic */ int[] f21011a = new int[RequestStatus.values().length];

        static {
            try {
                f21011a[RequestStatus.SUCCESSFUL.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
        }
    }

    /* compiled from: TrackAmazonPurchase */
    /* renamed from: dbb$a */
    class C4764a implements PurchasingListener {
        /* renamed from: a */
        public PurchasingListener f21012a;
        /* renamed from: b */
        final /* synthetic */ dbb f21013b;

        private C4764a(dbb dbb) {
            this.f21013b = dbb;
        }
    }

    dbb(Context context) {
        this.f21014a = context;
        try {
            this.f21017d = Class.forName("com.amazon.device.iap.internal.d");
            this.f21018e = this.f21017d.getMethod("d", new Class[0]).invoke(null, new Object[0]);
            this.f21019f = this.f21017d.getDeclaredField("f");
            this.f21019f.setAccessible(true);
            this.f21016c = new C4764a();
            this.f21016c.f21012a = (PurchasingListener) this.f21019f.get(this.f21018e);
            this.f21015b = true;
            m26183b();
        } catch (Throwable th) {
        }
    }

    /* renamed from: b */
    private void m26183b() {
        PurchasingService.registerListener(this.f21014a, this.f21016c);
    }

    /* renamed from: a */
    public void m26184a() {
        if (this.f21015b) {
            try {
                PurchasingListener purchasingListener = (PurchasingListener) this.f21019f.get(this.f21018e);
                if (purchasingListener != this.f21016c) {
                    this.f21016c.f21012a = purchasingListener;
                    m26183b();
                }
            } catch (Throwable th) {
            }
        }
    }
}
