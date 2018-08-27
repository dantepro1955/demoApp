package com.p000;

import android.content.Context;
import android.location.Location;
import android.os.Build.VERSION;
import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient.Builder;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.location.LocationServices;
import com.onesignal.PermissionsActivity;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.List;
import p000.dak.C4740c;

/* compiled from: LocationGMS */
/* renamed from: dap */
public class dap {
    /* renamed from: a */
    public static String f20948a;
    /* renamed from: b */
    private static dao f20949b;
    /* renamed from: c */
    private static C4747b f20950c;
    /* renamed from: d */
    private static Thread f20951d;
    /* renamed from: e */
    private static boolean f20952e;

    /* compiled from: LocationGMS */
    /* renamed from: dap$1 */
    static class C47451 implements Runnable {
        C47451() {
        }

        public void run() {
            try {
                Thread.sleep(30000);
                dat.a(dat$c.WARN, "Location permission exists but GoogleApiClient timedout. Maybe related to mismatch google-play aar versions.");
                dap.m26082b();
            } catch (Throwable th) {
            }
        }
    }

    /* compiled from: LocationGMS */
    /* renamed from: dap$a */
    static class C4746a implements ConnectionCallbacks, OnConnectionFailedListener {
        private C4746a() {
        }

        public void onConnected(Bundle bundle) {
            int i = 0;
            PermissionsActivity.answered = false;
            Location a = LocationServices.FusedLocationApi.a(dap.f20949b.m26077c());
            if (a != null) {
                a.getAccuracy();
                Double valueOf = Double.valueOf(new BigDecimal(a.getLatitude()).setScale(7, RoundingMode.HALF_UP).doubleValue());
                Double valueOf2 = Double.valueOf(new BigDecimal(a.getLongitude()).setScale(7, RoundingMode.HALF_UP).doubleValue());
                Float valueOf3 = Float.valueOf(a.getAccuracy());
                if (!dap.f20952e) {
                    i = 1;
                }
                dap.m26083b(valueOf, valueOf2, valueOf3, Integer.valueOf(i));
            } else {
                dap.m26083b(null, null, null, null);
            }
            dap.f20949b.m26076b();
        }

        public void onConnectionSuspended(int i) {
            dap.m26082b();
        }

        public void onConnectionFailed(ConnectionResult connectionResult) {
            dap.m26082b();
        }
    }

    /* compiled from: LocationGMS */
    /* renamed from: dap$b */
    interface C4747b {
        /* renamed from: a */
        void mo4301a(Double d, Double d2, Float f, Integer num);
    }

    /* renamed from: a */
    static void m26080a(Context context, boolean z, C4747b c4747b) {
        int i = -1;
        f20950c = c4747b;
        int a = C4740c.m26044a(context, "android.permission.ACCESS_FINE_LOCATION");
        if (a == -1) {
            i = C4740c.m26044a(context, "android.permission.ACCESS_COARSE_LOCATION");
            f20952e = true;
        }
        if (VERSION.SDK_INT < 23) {
            if (a == 0 || i == 0) {
                dap.m26079a();
            } else {
                c4747b.mo4301a(null, null, null, null);
            }
        } else if (a != 0) {
            try {
                List asList = Arrays.asList(context.getPackageManager().getPackageInfo(context.getPackageName(), 4096).requestedPermissions);
                if (asList.contains("android.permission.ACCESS_FINE_LOCATION")) {
                    f20948a = "android.permission.ACCESS_FINE_LOCATION";
                } else if (asList.contains("android.permission.ACCESS_COARSE_LOCATION") && i != 0) {
                    f20948a = "android.permission.ACCESS_COARSE_LOCATION";
                }
                if (f20948a != null && z) {
                    PermissionsActivity.startPrompt();
                } else if (i == 0) {
                    dap.m26079a();
                } else {
                    dap.m26082b();
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        } else {
            dap.m26079a();
        }
    }

    /* renamed from: a */
    public static void m26079a() {
        try {
            dap.m26086e();
            Object c4746a = new C4746a();
            f20949b = new dao(new Builder(dat.f16711c).addApi(LocationServices.API).addConnectionCallbacks(c4746a).addOnConnectionFailedListener(c4746a).build());
            f20949b.m26075a();
        } catch (Throwable th) {
            dat.a(dat$c.WARN, "Location permission exists but there was an error initializing: ", th);
            dap.m26082b();
        }
    }

    /* renamed from: e */
    private static void m26086e() {
        f20951d = new Thread(new C47451());
        f20951d.start();
    }

    /* renamed from: b */
    public static void m26082b() {
        PermissionsActivity.answered = false;
        dap.m26083b(null, null, null, null);
        if (f20949b != null) {
            f20949b.m26076b();
        }
    }

    /* renamed from: b */
    private static void m26083b(Double d, Double d2, Float f, Integer num) {
        f20950c.mo4301a(d, d2, f, num);
        if (f20951d != null && !Thread.currentThread().equals(f20951d)) {
            f20951d.interrupt();
        }
    }
}
