package com.p000;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.PackageManager.NameNotFoundException;
import android.support.v7.widget.LinearLayoutManager;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.gcm.GoogleCloudMessaging;
import com.ninegag.android.app.GagApplication;
import java.io.IOException;

/* compiled from: GcmHelper */
/* renamed from: clv */
public class clv {
    /* renamed from: a */
    Activity f9701a;
    /* renamed from: b */
    String f9702b;
    /* renamed from: c */
    Thread f9703c;
    /* renamed from: d */
    GoogleCloudMessaging f9704d;
    /* renamed from: e */
    String f9705e;
    /* renamed from: f */
    C1762a f9706f;

    /* compiled from: GcmHelper */
    /* renamed from: clv$1 */
    class C17611 extends Thread {
        /* renamed from: a */
        final /* synthetic */ clv f9700a;

        /* compiled from: GcmHelper */
        /* renamed from: clv$1$1 */
        class C17601 implements Runnable {
            /* renamed from: a */
            final /* synthetic */ C17611 f9699a;

            C17601(C17611 c17611) {
                this.f9699a = c17611;
            }

            public void run() {
                try {
                    this.f9699a.f9700a.f9706f.m14345a(this.f9699a.f9700a.f9705e);
                } catch (Exception e) {
                }
            }
        }

        C17611(clv clv) {
            this.f9700a = clv;
        }

        public void run() {
            try {
                if (this.f9700a.m14353c()) {
                    this.f9700a.f9705e = this.f9700a.m14346a(this.f9700a.f9701a);
                    if (this.f9700a.f9705e != null && this.f9700a.f9705e.isEmpty()) {
                        this.f9700a.m14354d();
                    }
                }
                if (this.f9700a.f9706f != null) {
                    this.f9700a.f9701a.runOnUiThread(new C17601(this));
                }
            } catch (Exception e) {
                chn.m13371a(e);
            }
        }
    }

    /* compiled from: GcmHelper */
    /* renamed from: clv$a */
    public interface C1762a {
        /* renamed from: a */
        void m14345a(String str);
    }

    public clv(Activity activity, String str, C1762a c1762a) {
        this.f9701a = activity;
        this.f9702b = str;
        this.f9706f = c1762a;
    }

    /* renamed from: a */
    public void m14355a() {
        this.f9703c = new C17611(this);
        this.f9703c.start();
    }

    /* renamed from: b */
    public void m14356b() {
        if (this.f9703c != null) {
            if (this.f9703c.isAlive()) {
                this.f9703c.interrupt();
            }
            this.f9703c = null;
        }
        this.f9701a = null;
        this.f9706f = null;
    }

    /* renamed from: c */
    private boolean m14353c() {
        int isGooglePlayServicesAvailable = GooglePlayServicesUtil.isGooglePlayServicesAvailable(this.f9701a);
        if (isGooglePlayServicesAvailable == 0) {
            return true;
        }
        if (GooglePlayServicesUtil.isUserRecoverableError(isGooglePlayServicesAvailable)) {
        }
        return false;
    }

    /* renamed from: a */
    private void m14348a(Context context, String str) {
        SharedPreferences c = m14352c(context);
        int b = clv.m14350b(context);
        Editor edit = c.edit();
        edit.putString("registration_id", str);
        edit.putInt("appVersion", b);
        edit.commit();
    }

    /* renamed from: a */
    private String m14346a(Context context) {
        SharedPreferences c = m14352c(context);
        String string = c.getString("registration_id", "");
        if (string.isEmpty()) {
            return "";
        }
        if (c.getInt("appVersion", LinearLayoutManager.INVALID_OFFSET) != clv.m14350b(context)) {
            return "";
        }
        return string;
    }

    /* renamed from: d */
    private String m14354d() {
        String str = "";
        try {
            if (this.f9704d == null) {
                this.f9704d = GoogleCloudMessaging.getInstance(this.f9701a);
            }
            this.f9705e = this.f9704d.register(this.f9702b);
            m14348a(this.f9701a, this.f9705e);
            return str;
        } catch (IOException e) {
            return "Error :" + e.getMessage();
        }
    }

    /* renamed from: b */
    private static int m14350b(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (NameNotFoundException e) {
            throw new RuntimeException("Could not get package name: " + e);
        }
    }

    /* renamed from: c */
    private SharedPreferences m14352c(Context context) {
        return this.f9701a.getSharedPreferences(GagApplication.f16513a + ".gcm", 0);
    }
}
