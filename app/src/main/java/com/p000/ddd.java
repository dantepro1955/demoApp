package com.p000;

import android.content.Context;
import android.os.Build.VERSION;
import android.text.TextUtils;
import com.under9.android.lib.network.model.Constants;
import java.io.File;
import java.util.HashMap;

/* compiled from: SourceFileController */
/* renamed from: ddd */
public class ddd {
    /* renamed from: e */
    private static ddd f21228e = new ddd(true);
    /* renamed from: a */
    private Context f21229a;
    /* renamed from: b */
    private boolean f21230b;
    /* renamed from: c */
    private HashMap<String, String> f21231c = new HashMap();
    /* renamed from: d */
    private String f21232d = null;

    public ddd(boolean z) {
        this.f21230b = z;
    }

    /* renamed from: a */
    public void m26581a(Context context) {
        this.f21229a = context;
    }

    /* renamed from: a */
    public static ddd m26577a() {
        return f21228e;
    }

    /* renamed from: b */
    public String m26582b(Context context) {
        return m26578c(context, "mp4s");
    }

    /* renamed from: c */
    private String m26578c(Context context, String str) {
        if (this.f21231c.containsKey(str)) {
            return (String) this.f21231c.get(str);
        }
        File a = m26579a(context, str);
        if (a == null) {
            return null;
        }
        if (!a.exists()) {
            a.mkdirs();
        }
        String absolutePath = a.getAbsolutePath();
        this.f21231c.put(str, absolutePath);
        return absolutePath;
    }

    /* renamed from: a */
    public File m26579a(Context context, String str) {
        File file = null;
        if (context == null) {
            return null;
        }
        if (this.f21230b) {
            file = context.getExternalFilesDir(str);
        }
        if (file != null) {
            return file;
        }
        return context.getDir(str, VERSION.SDK_INT >= 24 ? 0 : 1);
    }

    /* renamed from: a */
    public String m26580a(String str) {
        if (str == null) {
            return "";
        }
        return ddj.m26612a(str);
    }

    /* renamed from: b */
    public String m26583b(Context context, String str) {
        return TextUtils.join("", new String[]{m26582b(context), Constants.SEP, m26580a(str), ".mp4"});
    }
}
