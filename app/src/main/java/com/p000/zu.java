package com.p000;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.util.DisplayMetrics;
import android.view.ViewConfiguration;
import android.view.Window;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;
import com.facebook.appevents.AppEventsConstants;
import java.lang.reflect.Method;

@TargetApi(19)
/* compiled from: TranslucentHelper */
/* renamed from: zu */
class zu {
    /* renamed from: a */
    boolean f26167a;
    /* renamed from: b */
    int f26168b;
    /* renamed from: c */
    private final Dialog f26169c;
    /* renamed from: d */
    private boolean f26170d;
    /* renamed from: e */
    private String f26171e;
    /* renamed from: f */
    private float f26172f;

    zu(Dialog dialog, Context context) {
        this.f26169c = dialog;
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        this.f26170d = context.getResources().getConfiguration().orientation == 1;
        try {
            Method declaredMethod = Class.forName("android.os.SystemProperties").getDeclaredMethod("get", new Class[]{String.class});
            declaredMethod.setAccessible(true);
            this.f26171e = (String) declaredMethod.invoke(null, new Object[]{"qemu.hw.mainkeys"});
        } catch (Throwable th) {
            this.f26171e = null;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{16843760});
        try {
            this.f26167a = obtainStyledAttributes.getBoolean(0, false);
            if ((((Activity) context).getWindow().getAttributes().flags & 134217728) != 0) {
                this.f26167a = true;
            }
            this.f26172f = m35025a(windowManager);
            if (this.f26167a) {
                m35027a(true);
            }
            this.f26168b = m35026a(context.getResources(), "status_bar_height");
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: a */
    private void m35027a(boolean z) {
        Window window = this.f26169c.getWindow();
        LayoutParams attributes = window.getAttributes();
        if (z) {
            attributes.flags |= 67108864;
        } else {
            attributes.flags &= -67108865;
        }
        window.setAttributes(attributes);
        window.setFlags(134217728, 134217728);
    }

    /* renamed from: a */
    private float m35025a(WindowManager windowManager) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        if (VERSION.SDK_INT >= 16) {
            windowManager.getDefaultDisplay().getRealMetrics(displayMetrics);
        } else {
            windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        }
        return Math.min(((float) displayMetrics.widthPixels) / displayMetrics.density, ((float) displayMetrics.heightPixels) / displayMetrics.density);
    }

    /* renamed from: a */
    int m35030a(Context context) {
        Resources resources = context.getResources();
        if (VERSION.SDK_INT < 14 || !m35029b(context)) {
            return 0;
        }
        String str;
        if (this.f26170d) {
            str = "navigation_bar_height";
        } else if (!m35028a()) {
            return 0;
        } else {
            str = "navigation_bar_height_landscape";
        }
        return m35026a(resources, str);
    }

    /* renamed from: b */
    private boolean m35029b(Context context) {
        boolean z = true;
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("config_showNavigationBar", "bool", "android");
        if (identifier != 0) {
            boolean z2 = resources.getBoolean(identifier);
            if ("1".equals(this.f26171e)) {
                return false;
            }
            if (AppEventsConstants.EVENT_PARAM_VALUE_NO.equals(this.f26171e)) {
                return true;
            }
            return z2;
        }
        if (ViewConfiguration.get(context).hasPermanentMenuKey()) {
            z = false;
        }
        return z;
    }

    /* renamed from: a */
    private int m35026a(Resources resources, String str) {
        int identifier = resources.getIdentifier(str, "dimen", "android");
        if (identifier > 0) {
            return resources.getDimensionPixelSize(identifier);
        }
        return 0;
    }

    /* renamed from: a */
    private boolean m35028a() {
        return this.f26172f >= 600.0f || this.f26170d;
    }
}
