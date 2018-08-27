package com.p000;

import android.content.Context;
import android.os.Environment;
import android.text.TextUtils;
import com.under9.android.lib.network.model.Constants;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;

/* compiled from: SourceFileController */
/* renamed from: dfs */
public class dfs {
    /* renamed from: a */
    private Context f21512a;
    /* renamed from: b */
    private boolean f21513b;
    /* renamed from: c */
    private HashMap<String, String> f21514c = new HashMap();
    /* renamed from: d */
    private String f21515d = null;

    public dfs(boolean z) {
        this.f21513b = z;
    }

    /* renamed from: a */
    public void m27054a(Context context) {
        this.f21512a = context;
    }

    /* renamed from: b */
    public String m27056b(Context context) {
        return m27049a(context, "mp4s", true);
    }

    /* renamed from: c */
    public String m27058c(Context context) {
        return m27051f(context, "uploads");
    }

    /* renamed from: f */
    private String m27051f(Context context, String str) {
        return m27049a(context, str, false);
    }

    /* renamed from: a */
    private String m27049a(Context context, String str, boolean z) {
        if (this.f21514c.containsKey(str)) {
            return (String) this.f21514c.get(str);
        }
        File b = z ? m27055b(context, str) : m27052a(context, str);
        if (b == null) {
            return null;
        }
        if (!b.exists()) {
            b.mkdirs();
        }
        String absolutePath = b.getAbsolutePath();
        this.f21514c.put(str, absolutePath);
        return absolutePath;
    }

    /* renamed from: a */
    public File m27052a(Context context, String str) {
        File file = null;
        if (context == null) {
            return null;
        }
        if (this.f21513b) {
            file = context.getExternalFilesDir(str);
        }
        if (file == null) {
            return context.getDir(str, 0);
        }
        return file;
    }

    /* renamed from: b */
    public File m27055b(Context context, String str) {
        File file = null;
        if (this.f21513b) {
            file = m27050d(context);
        }
        if (file == null) {
            file = context.getCacheDir();
        }
        if (str == null || str.length() == 0) {
            return file;
        }
        File file2 = new File(file.getAbsoluteFile() + Constants.SEP + str);
        file2.mkdirs();
        return file2;
    }

    /* renamed from: d */
    private File m27050d(Context context) {
        File externalCacheDir;
        if (Environment.getExternalStorageState().equals("mounted")) {
            externalCacheDir = context.getExternalCacheDir();
        } else {
            externalCacheDir = context.getCacheDir();
        }
        try {
            new File(externalCacheDir, ".nomedia").createNewFile();
        } catch (IOException e) {
        }
        return externalCacheDir;
    }

    /* renamed from: a */
    public String m27053a(String str) {
        if (str == null) {
            return "";
        }
        return djk.m27581a(str);
    }

    /* renamed from: c */
    public File m27057c(Context context, String str) {
        return new File(m27060e(context, str));
    }

    /* renamed from: d */
    public boolean m27059d(Context context, String str) {
        return m27057c(context, str).exists();
    }

    /* renamed from: e */
    public String m27060e(Context context, String str) {
        return TextUtils.join("", new String[]{m27056b(context), Constants.SEP, m27053a(str), ".mp4"});
    }
}
