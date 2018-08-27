package com.p000;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.util.Log;
import com.facebook.places.model.PlaceFields;
import java.util.Calendar;

/* compiled from: TwilightManager */
/* renamed from: mv */
class mv {
    /* renamed from: a */
    private static mv f24637a;
    /* renamed from: b */
    private final Context f24638b;
    /* renamed from: c */
    private final LocationManager f24639c;
    /* renamed from: d */
    private final C5563a f24640d = new C5563a();

    /* compiled from: TwilightManager */
    /* renamed from: mv$a */
    static class C5563a {
        /* renamed from: a */
        boolean f24631a;
        /* renamed from: b */
        long f24632b;
        /* renamed from: c */
        long f24633c;
        /* renamed from: d */
        long f24634d;
        /* renamed from: e */
        long f24635e;
        /* renamed from: f */
        long f24636f;

        C5563a() {
        }
    }

    /* renamed from: a */
    static mv m32849a(Context context) {
        if (f24637a == null) {
            Context applicationContext = context.getApplicationContext();
            f24637a = new mv(applicationContext, (LocationManager) applicationContext.getSystemService(PlaceFields.LOCATION));
        }
        return f24637a;
    }

    mv(Context context, LocationManager locationManager) {
        this.f24638b = context;
        this.f24639c = locationManager;
    }

    /* renamed from: a */
    boolean m32853a() {
        C5563a c5563a = this.f24640d;
        if (m32852c()) {
            return c5563a.f24631a;
        }
        Location b = m32851b();
        if (b != null) {
            m32850a(b);
            return c5563a.f24631a;
        }
        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
        int i = Calendar.getInstance().get(11);
        return i < 6 || i >= 22;
    }

    /* renamed from: b */
    private Location m32851b() {
        Location a;
        Location location = null;
        if (fi.m30161a(this.f24638b, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
            a = m32848a("network");
        } else {
            a = null;
        }
        if (fi.m30161a(this.f24638b, "android.permission.ACCESS_FINE_LOCATION") == 0) {
            location = m32848a("gps");
        }
        if (location == null || a == null) {
            if (location == null) {
                location = a;
            }
            return location;
        } else if (location.getTime() > a.getTime()) {
            return location;
        } else {
            return a;
        }
    }

    /* renamed from: a */
    private Location m32848a(String str) {
        if (this.f24639c != null) {
            try {
                if (this.f24639c.isProviderEnabled(str)) {
                    return this.f24639c.getLastKnownLocation(str);
                }
            } catch (Throwable e) {
                Log.d("TwilightManager", "Failed to get last known location", e);
            }
        }
        return null;
    }

    /* renamed from: c */
    private boolean m32852c() {
        return this.f24640d != null && this.f24640d.f24636f > System.currentTimeMillis();
    }

    /* renamed from: a */
    private void m32850a(Location location) {
        long j;
        C5563a c5563a = this.f24640d;
        long currentTimeMillis = System.currentTimeMillis();
        mu a = mu.m32846a();
        a.m32847a(currentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
        long j2 = a.f24628a;
        a.m32847a(currentTimeMillis, location.getLatitude(), location.getLongitude());
        boolean z = a.f24630c == 1;
        long j3 = a.f24629b;
        long j4 = a.f24628a;
        a.m32847a(86400000 + currentTimeMillis, location.getLatitude(), location.getLongitude());
        long j5 = a.f24629b;
        if (j3 == -1 || j4 == -1) {
            j = 43200000 + currentTimeMillis;
        } else {
            if (currentTimeMillis > j4) {
                j = 0 + j5;
            } else if (currentTimeMillis > j3) {
                j = 0 + j4;
            } else {
                j = 0 + j3;
            }
            j += 60000;
        }
        c5563a.f24631a = z;
        c5563a.f24632b = j2;
        c5563a.f24633c = j3;
        c5563a.f24634d = j4;
        c5563a.f24635e = j5;
        c5563a.f24636f = j;
    }
}
