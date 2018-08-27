package com.p000;

import android.content.Context;
import android.content.res.Resources;
import java.util.Locale;
import java.util.Map;

/* renamed from: bti */
public final class bti {
    /* renamed from: a */
    public final String f7585a;
    /* renamed from: b */
    public final String f7586b;
    /* renamed from: c */
    public final String f7587c;
    /* renamed from: d */
    public final String f7588d;
    /* renamed from: e */
    public final String f7589e;
    /* renamed from: f */
    public final String f7590f;
    /* renamed from: g */
    public final String f7591g;
    /* renamed from: h */
    public final String f7592h;
    /* renamed from: i */
    public final String f7593i;
    /* renamed from: j */
    public final String f7594j;

    public bti(Context context) {
        Resources resources = context.getResources();
        Locale locale = (resources == null || resources.getConfiguration() == null || resources.getConfiguration().locale == null) ? Locale.getDefault() : resources.getConfiguration().locale;
        Map a = btr.m10949a(locale);
        this.f7585a = (String) a.get("error_initializing_player");
        this.f7586b = (String) a.get("get_youtube_app_title");
        this.f7587c = (String) a.get("get_youtube_app_text");
        this.f7588d = (String) a.get("get_youtube_app_action");
        this.f7589e = (String) a.get("enable_youtube_app_title");
        this.f7590f = (String) a.get("enable_youtube_app_text");
        this.f7591g = (String) a.get("enable_youtube_app_action");
        this.f7592h = (String) a.get("update_youtube_app_title");
        this.f7593i = (String) a.get("update_youtube_app_text");
        this.f7594j = (String) a.get("update_youtube_app_action");
    }
}
