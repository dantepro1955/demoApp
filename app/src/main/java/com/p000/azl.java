package com.p000;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.internal.zzec;
import com.google.android.gms.internal.zzfp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.List;

@bhd
/* renamed from: azl */
public class azl {
    /* renamed from: a */
    public static final azl f5145a = new azl();

    protected azl() {
    }

    /* renamed from: a */
    public static azl m6730a() {
        return f5145a;
    }

    /* renamed from: a */
    public zzec m6731a(Context context, bai bai) {
        Date a = bai.m6923a();
        long time = a != null ? a.getTime() : -1;
        String b = bai.m6925b();
        int c = bai.m6926c();
        Collection d = bai.m6927d();
        List unmodifiableList = !d.isEmpty() ? Collections.unmodifiableList(new ArrayList(d)) : null;
        boolean a2 = bai.m6924a(context);
        int l = bai.m6935l();
        Location e = bai.m6928e();
        Bundle a3 = bai.m6922a(AdMobAdapter.class);
        boolean f = bai.m6929f();
        String g = bai.m6930g();
        aky i = bai.m6932i();
        zzfp zzfp = i != null ? new zzfp(i) : null;
        String str = null;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            str = azp.m6789a().m9288a(Thread.currentThread().getStackTrace(), applicationContext.getPackageName());
        }
        return new zzec(7, time, a3, c, unmodifiableList, a2, l, f, g, zzfp, e, b, bai.m6934k(), bai.m6936m(), Collections.unmodifiableList(new ArrayList(bai.m6937n())), bai.m6931h(), str, bai.m6938o());
    }
}
