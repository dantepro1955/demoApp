package com.p000;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.view.ViewConfiguration;
import com.facebook.stetho.server.http.HttpStatus;
import p000.mx.C5568a;
import p000.mx.C5569b;
import p000.mx.C5571d;
import p000.mx.C5577j;

/* compiled from: ActionBarPolicy */
/* renamed from: nh */
public class nh {
    /* renamed from: a */
    private Context f24707a;

    /* renamed from: a */
    public static nh m32952a(Context context) {
        return new nh(context);
    }

    private nh(Context context) {
        this.f24707a = context;
    }

    /* renamed from: a */
    public int m32953a() {
        Resources resources = this.f24707a.getResources();
        int b = fj.m30173b(resources);
        int a = fj.m30172a(resources);
        if (fj.m30174c(resources) > 600 || b > 600 || ((b > 960 && a > 720) || (b > 720 && a > 960))) {
            return 5;
        }
        if (b >= HttpStatus.HTTP_INTERNAL_SERVER_ERROR || ((b > 640 && a > 480) || (b > 480 && a > 640))) {
            return 4;
        }
        if (b >= 360) {
            return 3;
        }
        return 2;
    }

    /* renamed from: b */
    public boolean m32954b() {
        if (VERSION.SDK_INT < 19 && jo.m31763a(ViewConfiguration.get(this.f24707a))) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public int m32955c() {
        return this.f24707a.getResources().getDisplayMetrics().widthPixels / 2;
    }

    /* renamed from: d */
    public boolean m32956d() {
        return this.f24707a.getResources().getBoolean(C5569b.abc_action_bar_embed_tabs);
    }

    /* renamed from: e */
    public int m32957e() {
        TypedArray obtainStyledAttributes = this.f24707a.obtainStyledAttributes(null, C5577j.ActionBar, C5568a.actionBarStyle, 0);
        int layoutDimension = obtainStyledAttributes.getLayoutDimension(C5577j.ActionBar_height, 0);
        Resources resources = this.f24707a.getResources();
        if (!m32956d()) {
            layoutDimension = Math.min(layoutDimension, resources.getDimensionPixelSize(C5571d.abc_action_bar_stacked_max_height));
        }
        obtainStyledAttributes.recycle();
        return layoutDimension;
    }

    /* renamed from: f */
    public boolean m32958f() {
        return this.f24707a.getApplicationInfo().targetSdkVersion < 14;
    }

    /* renamed from: g */
    public int m32959g() {
        return this.f24707a.getResources().getDimensionPixelSize(C5571d.abc_action_bar_stacked_tab_max_width);
    }
}
