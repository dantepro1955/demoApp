package com.p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.os.IBinder;
import com.inmobi.commons.analytics.db.AnalyticsEvent;
import com.inmobi.commons.analytics.db.AnalyticsSQLiteHelper;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p000.dav.C4750a;

/* compiled from: TrackGooglePurchase */
/* renamed from: dbc */
class dbc {
    /* renamed from: a */
    private static int f21026a = -99;
    /* renamed from: c */
    private static Class<?> f21027c;
    /* renamed from: b */
    private ServiceConnection f21028b;
    /* renamed from: d */
    private Object f21029d;
    /* renamed from: e */
    private Method f21030e;
    /* renamed from: f */
    private Method f21031f;
    /* renamed from: g */
    private Context f21032g;
    /* renamed from: h */
    private ArrayList<String> f21033h;
    /* renamed from: i */
    private Editor f21034i;
    /* renamed from: j */
    private boolean f21035j = true;
    /* renamed from: k */
    private boolean f21036k = false;

    /* compiled from: TrackGooglePurchase */
    /* renamed from: dbc$1 */
    class C47651 implements ServiceConnection {
        /* renamed from: a */
        final /* synthetic */ dbc f21020a;

        C47651(dbc dbc) {
            this.f21020a = dbc;
        }

        public void onServiceDisconnected(ComponentName componentName) {
            dbc.f21026a = -99;
            this.f21020a.f21029d = null;
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                Method a = dbc.m26201c(Class.forName("com.android.vending.billing.IInAppBillingService$Stub"));
                a.setAccessible(true);
                this.f21020a.f21029d = a.invoke(null, new Object[]{iBinder});
                this.f21020a.m26202c();
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    /* compiled from: TrackGooglePurchase */
    /* renamed from: dbc$2 */
    class C47662 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ dbc f21021a;

        C47662(dbc dbc) {
            this.f21021a = dbc;
        }

        public void run() {
            this.f21021a.f21036k = true;
            try {
                if (this.f21021a.f21030e == null) {
                    this.f21021a.f21030e = dbc.m26204d(dbc.f21027c);
                    this.f21021a.f21030e.setAccessible(true);
                }
                Bundle bundle = (Bundle) this.f21021a.f21030e.invoke(this.f21021a.f21029d, new Object[]{Integer.valueOf(3), this.f21021a.f21032g.getPackageName(), AnalyticsEvent.IN_APP, null});
                if (bundle.getInt("RESPONSE_CODE") == 0) {
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                    ArrayList stringArrayList2 = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                    for (int i = 0; i < stringArrayList2.size(); i++) {
                        String str = (String) stringArrayList.get(i);
                        String string = new JSONObject((String) stringArrayList2.get(i)).getString("purchaseToken");
                        if (!(this.f21021a.f21033h.contains(string) || arrayList2.contains(string))) {
                            arrayList2.add(string);
                            arrayList.add(str);
                        }
                    }
                    if (arrayList.size() > 0) {
                        this.f21021a.m26193a(arrayList, arrayList2);
                    } else if (stringArrayList2.size() == 0) {
                        this.f21021a.f21035j = false;
                        this.f21021a.f21034i.putBoolean("ExistingPurchases", false);
                        this.f21021a.f21034i.commit();
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
            this.f21021a.f21036k = false;
        }
    }

    dbc(Context context) {
        boolean z = true;
        this.f21032g = context;
        SharedPreferences sharedPreferences = this.f21032g.getSharedPreferences("GTPlayerPurchases", 0);
        this.f21034i = sharedPreferences.edit();
        this.f21033h = new ArrayList();
        try {
            JSONArray jSONArray = new JSONArray(sharedPreferences.getString("purchaseTokens", "[]"));
            for (int i = 0; i < jSONArray.length(); i++) {
                this.f21033h.add(jSONArray.get(i).toString());
            }
            if (jSONArray.length() != 0) {
                z = false;
            }
            this.f21035j = z;
            if (this.f21035j) {
                this.f21035j = sharedPreferences.getBoolean("ExistingPurchases", true);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        m26209a();
    }

    /* renamed from: a */
    static boolean m26194a(Context context) {
        if (f21026a == -99) {
            f21026a = context.checkCallingOrSelfPermission("com.android.vending.BILLING");
        }
        try {
            if (f21026a == 0) {
                f21027c = Class.forName("com.android.vending.billing.IInAppBillingService");
            }
            if (f21026a == 0) {
                return true;
            }
            return false;
        } catch (Throwable th) {
            f21026a = 0;
            return false;
        }
    }

    /* renamed from: a */
    void m26209a() {
        if (this.f21028b == null) {
            this.f21028b = new C47651(this);
            Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
            intent.setPackage("com.android.vending");
            this.f21032g.bindService(intent, this.f21028b, 1);
        } else if (this.f21029d != null) {
            m26202c();
        }
    }

    /* renamed from: c */
    private void m26202c() {
        if (!this.f21036k) {
            new Thread(new C47662(this)).start();
        }
    }

    /* renamed from: a */
    private void m26193a(ArrayList<String> arrayList, final ArrayList<String> arrayList2) {
        try {
            if (this.f21031f == null) {
                this.f21031f = dbc.m26205e(f21027c);
                this.f21031f.setAccessible(true);
            }
            new Bundle().putStringArrayList("ITEM_ID_LIST", arrayList);
            Bundle bundle = (Bundle) this.f21031f.invoke(this.f21029d, new Object[]{Integer.valueOf(3), this.f21032g.getPackageName(), AnalyticsEvent.IN_APP, bundle});
            if (bundle.getInt("RESPONSE_CODE") == 0) {
                String string;
                ArrayList stringArrayList = bundle.getStringArrayList("DETAILS_LIST");
                Map hashMap = new HashMap();
                Iterator it = stringArrayList.iterator();
                while (it.hasNext()) {
                    JSONObject jSONObject = new JSONObject((String) it.next());
                    string = jSONObject.getString(AnalyticsSQLiteHelper.TRANSACTION_PRODUCT_ID);
                    BigDecimal divide = new BigDecimal(jSONObject.getString("price_amount_micros")).divide(new BigDecimal(1000000));
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("sku", string);
                    jSONObject2.put("iso", jSONObject.getString("price_currency_code"));
                    jSONObject2.put("amount", divide.toString());
                    hashMap.put(string, jSONObject2);
                }
                final JSONArray jSONArray = new JSONArray();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    string = (String) it2.next();
                    if (hashMap.containsKey(string)) {
                        jSONArray.put(hashMap.get(string));
                    }
                }
                if (jSONArray.length() > 0) {
                    dat.a(new dat$b(this) {
                        /* renamed from: c */
                        final /* synthetic */ dbc f21025c;

                        /* compiled from: TrackGooglePurchase */
                        /* renamed from: dbc$3$1 */
                        class C47671 extends C4750a {
                            /* renamed from: a */
                            final /* synthetic */ C47683 f21022a;

                            C47671(C47683 c47683) {
                                this.f21022a = c47683;
                            }

                            /* renamed from: a */
                            public void mo4303a(String str) {
                                this.f21022a.f21025c.f21033h.addAll(arrayList2);
                                this.f21022a.f21025c.f21034i.putString("purchaseTokens", this.f21022a.f21025c.f21033h.toString());
                                this.f21022a.f21025c.f21034i.remove("ExistingPurchases");
                                this.f21022a.f21025c.f21034i.commit();
                                this.f21022a.f21025c.f21035j = false;
                                this.f21022a.f21025c.f21036k = false;
                            }
                        }

                        /* renamed from: a */
                        public void mo4305a(String str, String str2) {
                            dat.a(jSONArray, this.f21025c.f21035j, new C47671(this));
                        }
                    });
                }
            }
        } catch (Throwable th) {
            dat.a(dat$c.WARN, "Failed to track IAP purchases", th);
        }
    }

    /* renamed from: c */
    private static Method m26201c(Class cls) {
        for (Method method : cls.getMethods()) {
            Class[] parameterTypes = method.getParameterTypes();
            if (parameterTypes.length == 1 && parameterTypes[0] == IBinder.class) {
                return method;
            }
        }
        return null;
    }

    /* renamed from: d */
    private static Method m26204d(Class cls) {
        for (Method method : cls.getMethods()) {
            Class[] parameterTypes = method.getParameterTypes();
            if (parameterTypes.length == 4 && parameterTypes[0] == Integer.TYPE && parameterTypes[1] == String.class && parameterTypes[2] == String.class && parameterTypes[3] == String.class) {
                return method;
            }
        }
        return null;
    }

    /* renamed from: e */
    private static Method m26205e(Class cls) {
        for (Method method : cls.getMethods()) {
            Class[] parameterTypes = method.getParameterTypes();
            if (parameterTypes.length == 4 && parameterTypes[0] == Integer.TYPE && parameterTypes[1] == String.class && parameterTypes[2] == String.class && parameterTypes[3] == Bundle.class) {
                return method;
            }
        }
        return null;
    }
}
