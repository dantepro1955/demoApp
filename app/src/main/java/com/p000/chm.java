package com.p000;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Intent;
import android.content.IntentSender.SendIntentException;
import android.content.ServiceConnection;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import com.android.vending.billing.IInAppBillingService;
import com.android.vending.billing.IInAppBillingService.Stub;
import com.facebook.GraphResponse;
import com.inmobi.commons.analytics.db.AnalyticsEvent;
import com.inmobi.commons.analytics.db.AnalyticsSQLiteHelper;
import com.millennialmedia.InterstitialAd.InterstitialErrorStatus;
import com.ninegag.android.app.otto.setting.AutoDarkModeUnlockedEvent;
import java.lang.ref.WeakReference;
import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;
import javax.crypto.NoSuchPaddingException;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: InAppPurchaseController */
/* renamed from: chm */
public class chm {
    /* renamed from: a */
    private caf f9241a = caf.m12046a();
    /* renamed from: b */
    private C1729a f9242b;

    /* compiled from: InAppPurchaseController */
    /* renamed from: chm$1 */
    class C17271 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ chm f9233a;

        C17271(chm chm) {
            this.f9233a = chm;
        }

        public void run() {
            this.f9233a.f9241a.m12054a(new AutoDarkModeUnlockedEvent());
        }
    }

    /* compiled from: InAppPurchaseController */
    /* renamed from: chm$a */
    static class C1729a implements ServiceConnection {
        /* renamed from: a */
        private WeakReference<Activity> f9238a;
        /* renamed from: b */
        private WeakReference<chm> f9239b;
        /* renamed from: c */
        private IInAppBillingService f9240c;

        private C1729a(Activity activity, chm chm) {
            this.f9238a = new WeakReference(activity);
            this.f9239b = new WeakReference(chm);
        }

        /* renamed from: a */
        IInAppBillingService m13298a() {
            return this.f9240c;
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            this.f9240c = Stub.m14982a(iBinder);
            Activity activity = (Activity) this.f9238a.get();
            chm chm = (chm) this.f9239b.get();
            if (chm != null && activity != null) {
                chm.m13309d(activity);
                chm.m13310e(activity);
            }
        }

        public void onServiceDisconnected(ComponentName componentName) {
            this.f9240c = null;
        }
    }

    /* renamed from: a */
    public void m13312a(Activity activity) {
        this.f9242b = new C1729a(activity, this);
        Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
        intent.setPackage("com.android.vending");
        activity.bindService(intent, this.f9242b, 1);
    }

    /* renamed from: b */
    public void m13315b(Activity activity) {
        if (m13300a() != null) {
            activity.unbindService(this.f9242b);
        }
    }

    /* renamed from: a */
    public void m13311a(int i, int i2, Intent intent) {
        if (i != InterstitialErrorStatus.EXPIRED) {
            return;
        }
        if (i2 == -1) {
            try {
                intent.getIntExtra("RESPONSE_CODE", 0);
                String stringExtra = intent.getStringExtra("INAPP_PURCHASE_DATA");
                intent.getStringExtra("INAPP_DATA_SIGNATURE");
                JSONObject jSONObject = new JSONObject(stringExtra);
                stringExtra = jSONObject.getString(AnalyticsSQLiteHelper.TRANSACTION_PRODUCT_ID);
                jSONObject.getString("packageName");
                jSONObject.getString("purchaseToken");
                chn.m13400c("IAP", "DonePurchase", stringExtra);
                chn.m13439o("done-purchase", stringExtra);
                m13304a(stringExtra);
                return;
            } catch (JSONException e) {
                return;
            }
        }
        chn.m13445q("IAP", "CancelPurchase");
        chn.m13322A();
    }

    /* renamed from: a */
    private IInAppBillingService m13300a() {
        return this.f9242b.m13298a();
    }

    /* renamed from: d */
    private void m13309d(Activity activity) {
        cip h = this.f9241a.m12077h();
        boolean z = m13319e(activity, "com.ninegag.android.app.auto_dark_mode") || m13319e(activity, "com.ninegag.android.app.pro");
        h.mo1762b(z);
    }

    /* renamed from: e */
    private void m13310e(Activity activity) {
        Object obj = null;
        Object obj2 = (m13317c(activity, "com.ninegag.android.app.pro") || m13317c(activity, "com.ninegag.android.app.auto_dark_mode")) ? 1 : null;
        if (m13318d(activity, "com.ninegag.android.app.pro") || m13318d(activity, "com.ninegag.android.app.auto_dark_mode")) {
            obj = 1;
        }
        if (this.f9241a.m12094x().m12104c() && obj2 != null && r1 == null) {
            m13316c(activity);
        }
    }

    /* renamed from: a */
    private void m13304a(String str) {
        if ("com.ninegag.android.app.auto_dark_mode".equals(str) || "com.ninegag.android.app.pro".equals(str)) {
            this.f9241a.m12077h().mo1762b(true);
            this.f9241a.m12077h().m13942s(true);
            new Handler(Looper.getMainLooper()).postDelayed(new C17271(this), 200);
        }
    }

    /* renamed from: b */
    private void m13308b(String str) {
        if ("com.ninegag.android.app.auto_dark_mode".equals(str) || "com.ninegag.android.app.pro".equals(str)) {
            this.f9241a.m12077h().mo1762b(false);
        }
    }

    /* renamed from: c */
    public void m13316c(Activity activity) {
        if (m13300a() != null) {
            try {
                ArrayList stringArrayList = m13300a().mo1851a(3, activity.getPackageName(), AnalyticsEvent.IN_APP, null).getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                if (stringArrayList == null) {
                    chn.m13351O("purchaseDataList is null");
                    return;
                }
                if (stringArrayList.size() == 0) {
                    new Intent().putExtra(GraphResponse.SUCCESS_KEY, false);
                }
                Iterator it = stringArrayList.iterator();
                while (it.hasNext()) {
                    JSONObject jSONObject = new JSONObject((String) it.next());
                    chr.m13522a().m13576d(jSONObject.getString("packageName"), jSONObject.getString(AnalyticsSQLiteHelper.TRANSACTION_PRODUCT_ID), jSONObject.getString("purchaseToken"));
                }
            } catch (RemoteException e) {
            } catch (JSONException e2) {
            }
        }
    }

    /* renamed from: a */
    public void m13313a(final Activity activity, final String str) {
        if (m13300a() != null) {
            try {
                Iterator it = m13300a().mo1851a(3, activity.getPackageName(), AnalyticsEvent.IN_APP, null).getStringArrayList("INAPP_PURCHASE_DATA_LIST").iterator();
                while (it.hasNext()) {
                    JSONObject jSONObject = new JSONObject((String) it.next());
                    String string = jSONObject.getString(AnalyticsSQLiteHelper.TRANSACTION_PRODUCT_ID);
                    final String string2 = jSONObject.getString("purchaseToken");
                    if (str.equals(string)) {
                        new AsyncTask<Void, Void, Void>(this) {
                            /* renamed from: d */
                            final /* synthetic */ chm f9237d;

                            protected /* synthetic */ Object doInBackground(Object[] objArr) {
                                return m13297a((Void[]) objArr);
                            }

                            /* renamed from: a */
                            protected Void m13297a(Void... voidArr) {
                                try {
                                    this.f9237d.m13300a().mo1853b(3, activity.getPackageName(), string2);
                                    this.f9237d.m13308b(str);
                                } catch (RemoteException e) {
                                }
                                return null;
                            }
                        }.execute(new Void[0]);
                        return;
                    }
                }
            } catch (RemoteException e) {
            } catch (JSONException e2) {
            }
        }
    }

    /* renamed from: b */
    public int m13314b(Activity activity, String str) {
        if (m13300a() == null) {
            return 2;
        }
        try {
            Bundle a = m13300a().mo1852a(3, activity.getPackageName(), str, AnalyticsEvent.IN_APP, str);
            int i = a.getInt("RESPONSE_CODE", -1);
            if (i == 0) {
                chn.m13400c("IAP", "Purchase", str);
                chn.m13439o("purchase", str);
                activity.startIntentSenderForResult(((PendingIntent) a.getParcelable("BUY_INTENT")).getIntentSender(), InterstitialErrorStatus.EXPIRED, new Intent(), Integer.valueOf(0).intValue(), Integer.valueOf(0).intValue(), Integer.valueOf(0).intValue());
                return 0;
            }
            chn.m13400c("IAP", "ErrorPurchase ", "" + i);
            chn.m13391b(str, i);
            return i;
        } catch (RemoteException e) {
            chn.m13400c("IAP", "ErrorPurchase ", "100");
            chn.m13391b(str, 100);
            return 2;
        } catch (SendIntentException e2) {
            chn.m13400c("IAP", "ErrorPurchase ", "101");
            chn.m13391b(str, 101);
            return 2;
        } catch (Exception e3) {
            chn.m13400c("IAP", "ErrorPurchase ", "102");
            chn.m13391b(str, 102);
            return 2;
        }
    }

    /* renamed from: c */
    public boolean m13317c(Activity activity, String str) {
        if (m13300a() == null) {
            return false;
        }
        try {
            ArrayList stringArrayList = m13300a().mo1851a(3, activity.getPackageName(), AnalyticsEvent.IN_APP, null).getStringArrayList("INAPP_PURCHASE_DATA_LIST");
            if (stringArrayList == null) {
                return false;
            }
            Iterator it = stringArrayList.iterator();
            while (it.hasNext()) {
                JSONObject jSONObject = new JSONObject((String) it.next());
                String string = jSONObject.getString(AnalyticsSQLiteHelper.TRANSACTION_PRODUCT_ID);
                int i = jSONObject.getInt("purchaseState");
                if (str.equals(string)) {
                    return i == 0;
                }
            }
            return false;
        } catch (RemoteException e) {
        } catch (JSONException e2) {
        } catch (Exception e3) {
            return false;
        }
    }

    /* renamed from: d */
    public boolean m13318d(Activity activity, String str) {
        return this.f9241a.m12094x().m12105d();
    }

    /* renamed from: e */
    public boolean m13319e(Activity activity, String str) {
        if (m13300a() == null) {
            return false;
        }
        if (this.f9241a.m12094x().m12105d()) {
            return true;
        }
        try {
            ArrayList stringArrayList = m13300a().mo1851a(3, activity.getPackageName(), AnalyticsEvent.IN_APP, null).getStringArrayList("INAPP_PURCHASE_DATA_LIST");
            if (stringArrayList == null) {
                return false;
            }
            Iterator it = stringArrayList.iterator();
            while (it.hasNext()) {
                JSONObject jSONObject = new JSONObject((String) it.next());
                String string = jSONObject.getString(AnalyticsSQLiteHelper.TRANSACTION_PRODUCT_ID);
                int i = jSONObject.getInt("purchaseState");
                if (str.equals(string)) {
                    if (i == 0) {
                        return true;
                    }
                    return false;
                }
            }
            return false;
        } catch (RemoteException e) {
        } catch (JSONException e2) {
        } catch (Exception e3) {
            return false;
        }
    }

    /* renamed from: f */
    public String m13320f(Activity activity, String str) {
        if (m13300a() == null) {
            return "";
        }
        try {
            ArrayList arrayList = new ArrayList();
            arrayList.add(str);
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("ITEM_ID_LIST", arrayList);
            Bundle a = m13300a().mo1850a(3, activity.getPackageName(), AnalyticsEvent.IN_APP, bundle);
            if (a.getInt("RESPONSE_CODE") == 0) {
                Iterator it = a.getStringArrayList("DETAILS_LIST").iterator();
                while (it.hasNext()) {
                    JSONObject jSONObject = new JSONObject((String) it.next());
                    String string = jSONObject.getString(AnalyticsSQLiteHelper.TRANSACTION_PRODUCT_ID);
                    String string2 = jSONObject.getString("price");
                    if (str.equals(string)) {
                        return string2;
                    }
                }
            }
            return "";
        } catch (RemoteException e) {
            return "";
        } catch (JSONException e2) {
            return "";
        } catch (Exception e3) {
            return "";
        }
    }

    /* renamed from: a */
    public static String m13301a(String str, String str2) {
        return ctm.c(str + "_" + str2, cip.m13967a().m13976H());
    }

    /* renamed from: a */
    public static boolean m13305a(String str, String str2, String str3) {
        String str4;
        GeneralSecurityException e;
        boolean z = false;
        if (str3 == null) {
            return false;
        }
        if (cag.m12098a("is_pro") != null) {
            return Boolean.valueOf(cag.m12098a("is_pro")).booleanValue();
        }
        String d;
        try {
            d = ctm.d(str3, cip.m13967a().m13976H());
            str4 = str + "_" + str2;
            if (d == null || !d.equals(str4)) {
                chn.m13349N("productId_userName: " + str + "_" + str2 + ":" + str3);
            } else {
                z = true;
            }
            cag.m12099a("is_pro", Boolean.toString(z));
            return z;
        } catch (NoSuchAlgorithmException e2) {
            e = e2;
            str4 = e.getMessage() + str + "_" + str2 + " " + str3;
            d = e instanceof NoSuchAlgorithmException ? str4 + " NoSuchAlgorithmException " : e instanceof NoSuchPaddingException ? str4 + " NoSuchPaddingException " : str4;
            chn.m13349N(d);
            return false;
        } catch (NoSuchPaddingException e3) {
            e = e3;
            str4 = e.getMessage() + str + "_" + str2 + " " + str3;
            if (e instanceof NoSuchAlgorithmException) {
            }
            chn.m13349N(d);
            return false;
        }
    }
}
