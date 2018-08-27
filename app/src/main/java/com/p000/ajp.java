package com.p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import com.google.android.gms.ads.internal.purchase.GInAppPurchaseManagerInfoParcel;
import com.google.android.gms.ads.purchase.InAppPurchaseActivity;
import com.inmobi.commons.analytics.db.AnalyticsEvent;
import org.json.JSONException;
import org.json.JSONObject;

@bhd
/* renamed from: ajp */
public class ajp {
    /* renamed from: a */
    public int m1905a(Intent intent) {
        if (intent == null) {
            return 5;
        }
        Object obj = intent.getExtras().get("RESPONSE_CODE");
        if (obj == null) {
            bky.m9011e("Intent with no response code, assuming OK (known issue)");
            return 0;
        } else if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        } else {
            if (obj instanceof Long) {
                return (int) ((Long) obj).longValue();
            }
            String str = "Unexpected type for intent response code. ";
            String valueOf = String.valueOf(obj.getClass().getName());
            bky.m9011e(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            return 5;
        }
    }

    /* renamed from: a */
    public int m1906a(Bundle bundle) {
        Object obj = bundle.get("RESPONSE_CODE");
        if (obj == null) {
            bky.m9011e("Bundle with null response code, assuming OK (known issue)");
            return 0;
        } else if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        } else {
            if (obj instanceof Long) {
                return (int) ((Long) obj).longValue();
            }
            String str = "Unexpected type for intent response code. ";
            String valueOf = String.valueOf(obj.getClass().getName());
            bky.m9011e(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            return 5;
        }
    }

    /* renamed from: a */
    public String m1907a(String str) {
        String str2 = null;
        if (str != null) {
            try {
                str2 = new JSONObject(str).getString("developerPayload");
            } catch (JSONException e) {
                bky.m9011e("Fail to parse purchase data");
            }
        }
        return str2;
    }

    /* renamed from: a */
    public void m1908a(final Context context) {
        bkg.m9074b(new Runnable(this) {

            /* renamed from: ajp$1$1 */
            class C02141 implements ServiceConnection {
                /* renamed from: a */
                final /* synthetic */ C02151 f1715a;

                C02141(C02151 c02151) {
                    this.f1715a = c02151;
                }

                public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                    boolean z = false;
                    aji aji = new aji(context.getApplicationContext(), false);
                    aji.m1857a(iBinder);
                    int a = aji.m1853a(3, context.getPackageName(), AnalyticsEvent.IN_APP);
                    bjw i = ako.m2347i();
                    if (a == 0) {
                        z = true;
                    }
                    i.m8950e(z);
                    apm.m4855a().m4857a(context, (ServiceConnection) this);
                    aji.m1856a();
                }

                public void onServiceDisconnected(ComponentName componentName) {
                }
            }

            public void run() {
                ServiceConnection c02141 = new C02141(this);
                Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
                intent.setPackage("com.android.vending");
                apm.m4855a().m4859a(context, intent, c02141, 1);
            }
        });
    }

    /* renamed from: a */
    public void m1909a(Context context, boolean z, GInAppPurchaseManagerInfoParcel gInAppPurchaseManagerInfoParcel) {
        Intent intent = new Intent();
        intent.setClassName(context, InAppPurchaseActivity.CLASS_NAME);
        intent.putExtra("com.google.android.gms.ads.internal.purchase.useClientJar", z);
        GInAppPurchaseManagerInfoParcel.m19357a(intent, gInAppPurchaseManagerInfoParcel);
        ako.m2343e().m9098a(context, intent);
    }

    /* renamed from: b */
    public String m1910b(Intent intent) {
        return intent == null ? null : intent.getStringExtra("INAPP_PURCHASE_DATA");
    }

    /* renamed from: b */
    public String m1911b(String str) {
        String str2 = null;
        if (str != null) {
            try {
                str2 = new JSONObject(str).getString("purchaseToken");
            } catch (JSONException e) {
                bky.m9011e("Fail to parse purchase data");
            }
        }
        return str2;
    }

    /* renamed from: c */
    public String m1912c(Intent intent) {
        return intent == null ? null : intent.getStringExtra("INAPP_DATA_SIGNATURE");
    }
}
