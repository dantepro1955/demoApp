package com.p000;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import com.inmobi.commons.analytics.db.AnalyticsEvent;

@bhd
/* renamed from: aji */
public class aji {
    /* renamed from: a */
    Object f1674a;
    /* renamed from: b */
    private final Context f1675b;
    /* renamed from: c */
    private final boolean f1676c;

    public aji(Context context) {
        this(context, true);
    }

    public aji(Context context, boolean z) {
        this.f1675b = context;
        this.f1676c = z;
    }

    /* renamed from: a */
    public int m1853a(int i, String str, String str2) {
        try {
            Class loadClass = this.f1675b.getClassLoader().loadClass("com.android.vending.billing.IInAppBillingService");
            return ((Integer) loadClass.getDeclaredMethod("isBillingSupported", new Class[]{Integer.TYPE, String.class, String.class}).invoke(loadClass.cast(this.f1674a), new Object[]{Integer.valueOf(i), str, str2})).intValue();
        } catch (Throwable e) {
            if (this.f1676c) {
                bky.m9009c("IInAppBillingService is not available, please add com.android.vending.billing.IInAppBillingService to project.", e);
            }
            return 5;
        }
    }

    /* renamed from: a */
    public int m1854a(String str, String str2) {
        try {
            Class loadClass = this.f1675b.getClassLoader().loadClass("com.android.vending.billing.IInAppBillingService");
            return ((Integer) loadClass.getDeclaredMethod("consumePurchase", new Class[]{Integer.TYPE, String.class, String.class}).invoke(loadClass.cast(this.f1674a), new Object[]{Integer.valueOf(3), str, str2})).intValue();
        } catch (Throwable e) {
            if (this.f1676c) {
                bky.m9009c("IInAppBillingService is not available, please add com.android.vending.billing.IInAppBillingService to project.", e);
            }
            return 5;
        }
    }

    /* renamed from: a */
    public Bundle m1855a(String str, String str2, String str3) {
        try {
            Class loadClass = this.f1675b.getClassLoader().loadClass("com.android.vending.billing.IInAppBillingService");
            return (Bundle) loadClass.getDeclaredMethod("getBuyIntent", new Class[]{Integer.TYPE, String.class, String.class, String.class, String.class}).invoke(loadClass.cast(this.f1674a), new Object[]{Integer.valueOf(3), str, str2, AnalyticsEvent.IN_APP, str3});
        } catch (Throwable e) {
            if (this.f1676c) {
                bky.m9009c("IInAppBillingService is not available, please add com.android.vending.billing.IInAppBillingService to project.", e);
            }
            return null;
        }
    }

    /* renamed from: a */
    public void m1856a() {
        this.f1674a = null;
    }

    /* renamed from: a */
    public void m1857a(IBinder iBinder) {
        try {
            this.f1674a = this.f1675b.getClassLoader().loadClass("com.android.vending.billing.IInAppBillingService$Stub").getDeclaredMethod("asInterface", new Class[]{IBinder.class}).invoke(null, new Object[]{iBinder});
        } catch (Exception e) {
            if (this.f1676c) {
                bky.m9011e("IInAppBillingService is not available, please add com.android.vending.billing.IInAppBillingService to project.");
            }
        }
    }

    /* renamed from: b */
    public Bundle m1858b(String str, String str2) {
        try {
            Class loadClass = this.f1675b.getClassLoader().loadClass("com.android.vending.billing.IInAppBillingService");
            return (Bundle) loadClass.getDeclaredMethod("getPurchases", new Class[]{Integer.TYPE, String.class, String.class, String.class}).invoke(loadClass.cast(this.f1674a), new Object[]{Integer.valueOf(3), str, AnalyticsEvent.IN_APP, str2});
        } catch (Throwable e) {
            if (this.f1676c) {
                bky.m9009c("IInAppBillingService is not available, please add com.android.vending.billing.IInAppBillingService to project.", e);
            }
            return null;
        }
    }
}
