package com.p000;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.net.Uri;
import android.net.Uri.Builder;
import android.text.TextUtils;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.internal.AnalyticsEvents;
import com.mopub.mobileads.resource.DrawableConstants.CtaButton;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

@bhd
/* renamed from: bkk */
public class bkk {
    /* renamed from: a */
    protected String f6740a = "";
    /* renamed from: b */
    private final Object f6741b = new Object();
    /* renamed from: c */
    private String f6742c = "";
    /* renamed from: d */
    private String f6743d = "";
    /* renamed from: e */
    private boolean f6744e = false;

    /* renamed from: b */
    private Uri m9218b(Context context, String str, String str2, String str3) {
        Builder buildUpon = Uri.parse(str).buildUpon();
        buildUpon.appendQueryParameter("linkedDeviceId", m9221a(context));
        buildUpon.appendQueryParameter("adSlotPath", str2);
        buildUpon.appendQueryParameter("afmaVersion", str3);
        return buildUpon.build();
    }

    /* renamed from: f */
    private void m9219f(Context context, String str, String str2) {
        ako.m2343e().m9099a(context, m9218b(context, (String) bbb.dh.m7064c(), str, str2));
    }

    /* renamed from: a */
    public String m9220a() {
        String str;
        synchronized (this.f6741b) {
            str = this.f6743d;
        }
        return str;
    }

    /* renamed from: a */
    public String m9221a(Context context) {
        String str;
        synchronized (this.f6741b) {
            if (TextUtils.isEmpty(this.f6742c)) {
                this.f6742c = ako.m2343e().m9120b(context, "debug_signals_id.txt");
                if (TextUtils.isEmpty(this.f6742c)) {
                    this.f6742c = ako.m2343e().m9126c();
                    ako.m2343e().m9128c(context, "debug_signals_id.txt", this.f6742c);
                }
            }
            str = this.f6742c;
        }
        return str;
    }

    /* renamed from: a */
    public void m9222a(Context context, String str, String str2) {
        if (!m9229c(context, str, str2)) {
            m9224a(context, "In-app preview failed to load because of a system error. Please try again later.", true, true);
        } else if ("2".equals(this.f6740a)) {
            bky.m9006b("Creative is not pushed for this device.");
            m9224a(context, "There was no creative pushed from DFP to the device.", false, false);
        } else if ("1".equals(this.f6740a)) {
            bky.m9006b("The app is not linked for creative preview.");
            m9219f(context, str, str2);
        } else if (AppEventsConstants.EVENT_PARAM_VALUE_NO.equals(this.f6740a)) {
            bky.m9006b("Device is linked for in app preview.");
            m9224a(context, "The device is successfully linked for creative preview.", false, true);
        }
    }

    /* renamed from: a */
    public void m9223a(Context context, String str, String str2, String str3) {
        Builder buildUpon = m9218b(context, (String) bbb.dk.m7064c(), str3, str).buildUpon();
        buildUpon.appendQueryParameter("debugData", str2);
        ako.m2343e().m9122b(context, str, buildUpon.build().toString());
    }

    /* renamed from: a */
    protected void m9224a(Context context, String str, boolean z, boolean z2) {
        if (context instanceof Activity) {
            final Context context2 = context;
            final String str2 = str;
            final boolean z3 = z;
            final boolean z4 = z2;
            bkg.f6710a.post(new Runnable(this) {

                /* renamed from: bkk$1$1 */
                class C12991 implements OnClickListener {
                    /* renamed from: a */
                    final /* synthetic */ C13001 f6735a;

                    C12991(C13001 c13001) {
                        this.f6735a = c13001;
                    }

                    public void onClick(DialogInterface dialogInterface, int i) {
                        ako.m2343e().m9099a(context2, Uri.parse("https://support.google.com/dfp_premium/answer/7160685#push"));
                    }
                }

                public void run() {
                    AlertDialog.Builder builder = new AlertDialog.Builder(context2);
                    builder.setMessage(str2);
                    if (z3) {
                        builder.setTitle("Error");
                    } else {
                        builder.setTitle("Info");
                    }
                    if (z4) {
                        builder.setNeutralButton("Dismiss", null);
                    } else {
                        builder.setPositiveButton(CtaButton.DEFAULT_CTA_TEXT, new C12991(this));
                        builder.setNegativeButton("Dismiss", null);
                    }
                    builder.create().show();
                }
            });
            return;
        }
        bky.m9010d("Can not create dialog without Activity Context");
    }

    /* renamed from: a */
    public void m9225a(String str) {
        synchronized (this.f6741b) {
            this.f6743d = str;
        }
    }

    /* renamed from: a */
    public void m9226a(boolean z) {
        synchronized (this.f6741b) {
            this.f6744e = z;
        }
    }

    /* renamed from: b */
    public void m9227b(Context context, String str, String str2) {
        if (m9230d(context, str, str2)) {
            bky.m9006b("Device is linked for debug signals.");
            m9224a(context, "The device is successfully linked for troubleshooting.", false, true);
            return;
        }
        m9219f(context, str, str2);
    }

    /* renamed from: b */
    public boolean m9228b() {
        boolean z;
        synchronized (this.f6741b) {
            z = this.f6744e;
        }
        return z;
    }

    /* renamed from: c */
    boolean m9229c(Context context, String str, String str2) {
        Object e = m9231e(context, m9218b(context, (String) bbb.di.m7064c(), str, str2).toString(), str2);
        if (TextUtils.isEmpty(e)) {
            bky.m9006b("Not linked for in app preview.");
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject(e.trim());
            String optString = jSONObject.optString("gct");
            this.f6740a = jSONObject.optString(AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_STATUS);
            m9225a(optString);
            return true;
        } catch (Throwable e2) {
            bky.m9009c("Fail to get in app preview response json.", e2);
            return false;
        }
    }

    /* renamed from: d */
    boolean m9230d(Context context, String str, String str2) {
        Object e = m9231e(context, m9218b(context, (String) bbb.dj.m7064c(), str, str2).toString(), str2);
        if (TextUtils.isEmpty(e)) {
            bky.m9006b("Not linked for debug signals.");
            return false;
        }
        try {
            boolean equals = "1".equals(new JSONObject(e.trim()).optString("debug_mode"));
            m9226a(equals);
            return equals;
        } catch (Throwable e2) {
            bky.m9009c("Fail to get debug mode response json.", e2);
            return false;
        }
    }

    /* renamed from: e */
    protected String m9231e(Context context, String str, String str2) {
        Throwable th;
        String str3;
        String valueOf;
        Map hashMap = new HashMap();
        hashMap.put("User-Agent", ako.m2343e().m9087a(context, str2));
        ble a = new bkn(context).m9255a(str, hashMap);
        try {
            return (String) a.get((long) ((Integer) bbb.dl.m7064c()).intValue(), TimeUnit.MILLISECONDS);
        } catch (Throwable e) {
            th = e;
            str3 = "Timeout while retriving a response from: ";
            valueOf = String.valueOf(str);
            bky.m9007b(valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3), th);
            a.cancel(true);
        } catch (Throwable e2) {
            th = e2;
            str3 = "Interrupted while retriving a response from: ";
            valueOf = String.valueOf(str);
            bky.m9007b(valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3), th);
            a.cancel(true);
        } catch (Throwable e22) {
            th = e22;
            String str4 = "Error retriving a response from: ";
            valueOf = String.valueOf(str);
            bky.m9007b(valueOf.length() != 0 ? str4.concat(valueOf) : new String(str4), th);
        }
        return null;
    }
}
