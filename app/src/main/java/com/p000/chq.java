package com.p000;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Environment;
import android.text.TextUtils;
import com.under9.android.lib.network.model.Constants;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.HashSet;

/* compiled from: SourceFileController */
/* renamed from: chq */
public class chq {
    /* renamed from: e */
    private static caf f9264e = caf.m12046a();
    /* renamed from: a */
    private Context f9265a;
    /* renamed from: b */
    private boolean f9266b;
    /* renamed from: c */
    private HashMap<String, String> f9267c = new HashMap();
    /* renamed from: d */
    private String f9268d = null;
    /* renamed from: f */
    private HashSet<String> f9269f = new HashSet();

    public chq(boolean z) {
        this.f9266b = z;
    }

    /* renamed from: a */
    public void m13502a(Context context) {
        this.f9265a = context;
    }

    /* renamed from: b */
    public String m13504b(Context context) {
        return m13490g(context, "avatar");
    }

    /* renamed from: c */
    public String m13508c(Context context) {
        return m13490g(context, "gags");
    }

    /* renamed from: d */
    public String m13510d(Context context) {
        return m13490g(context, "misc");
    }

    /* renamed from: e */
    public String m13513e(Context context) {
        return m13490g(context, "covers");
    }

    /* renamed from: f */
    public String m13514f(Context context) {
        return m13490g(context, "gags_thumb");
    }

    /* renamed from: g */
    public String m13516g(Context context) {
        return m13490g(context, "gifs");
    }

    /* renamed from: h */
    public String m13517h(Context context) {
        return m13490g(context, "mp4s");
    }

    /* renamed from: i */
    public String m13518i(Context context) {
        return m13490g(context, "uploads");
    }

    /* renamed from: g */
    private String m13490g(Context context, String str) {
        if (this.f9267c.containsKey(str)) {
            return (String) this.f9267c.get(str);
        }
        File b = m13503b(context, str);
        if (b == null) {
            return null;
        }
        if (!b.exists()) {
            b.mkdirs();
        }
        String absolutePath = b.getAbsolutePath();
        this.f9267c.put(str, absolutePath);
        return absolutePath;
    }

    /* renamed from: j */
    public String m13519j(Context context) {
        if (this.f9268d == null) {
            this.f9268d = m13520k(context).getAbsolutePath();
        }
        return this.f9268d;
    }

    /* renamed from: a */
    public String m13495a(Context context, String str) {
        return m13519j(context) + Constants.SEP + m13501a(str);
    }

    /* renamed from: b */
    public File m13503b(Context context, String str) {
        File file = null;
        if (context != null) {
            if (this.f9266b) {
                file = context.getExternalFilesDir(str);
            }
            if (file == null) {
                if (VERSION.SDK_INT >= 24) {
                    file = context.getDir(str, 0);
                } else {
                    file = context.getDir(str, 1);
                }
            }
            m13489a(file);
        }
        return file;
    }

    /* renamed from: a */
    private void m13489a(File file) {
        String absolutePath = file.getAbsolutePath();
        if (!this.f9269f.contains(absolutePath)) {
            this.f9269f.add(absolutePath);
            File file2 = new File(file, ".nomedia");
            if (!file2.exists()) {
                try {
                    file2.createNewFile();
                } catch (IOException e) {
                }
            }
        }
    }

    /* renamed from: k */
    public File m13520k(Context context) {
        File file = null;
        if (this.f9266b) {
            file = m13491m(context);
        }
        if (file == null) {
            file = m13492n(context);
        }
        file.mkdirs();
        return file;
    }

    /* renamed from: m */
    private File m13491m(Context context) {
        File file = new File(new File(new File(new File(Environment.getExternalStorageDirectory(), "Android"), "data"), context.getPackageName()), "cache");
        if (file.exists()) {
            return file;
        }
        if (!file.mkdirs()) {
            return null;
        }
        m13489a(file);
        return file;
    }

    /* renamed from: n */
    private File m13492n(Context context) {
        File cacheDir = context.getCacheDir();
        if (!cacheDir.exists()) {
            cacheDir.mkdirs();
        }
        m13489a(cacheDir);
        return cacheDir;
    }

    /* renamed from: a */
    public File m13494a(String str, int i, int i2) {
        return new File(m13497a(this.f9265a, str, i, i2));
    }

    /* renamed from: b */
    public boolean m13506b(String str, int i, int i2) {
        return m13494a(str, i, i2).exists();
    }

    /* renamed from: c */
    public File m13507c(String str, int i, int i2) {
        return new File(m13505b(this.f9265a, str, i, i2));
    }

    /* renamed from: l */
    public String m13521l(Context context) {
        File file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES).getAbsolutePath() + File.separator + "9GAG");
        file.mkdirs();
        return file.getAbsolutePath();
    }

    /* renamed from: c */
    public String m13509c(Context context, String str) {
        String a;
        try {
            a = djz.a(str);
        } catch (MalformedURLException e) {
            a = "_tmp";
        }
        return String.format("%s/%s", new Object[]{m13504b(context), a});
    }

    /* renamed from: a */
    public String m13501a(String str) {
        if (str == null) {
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt >= 'a' && charAt <= 'z') {
                stringBuilder.append('-');
            }
            stringBuilder.append(charAt);
        }
        return stringBuilder.toString();
    }

    /* renamed from: a */
    public String m13498a(Context context, String str, int i, int i2, int i3) {
        if (i3 != 1) {
            return m13497a(context, str, i, i2);
        }
        return String.format("%s/%s_s%d_v%d_h%s.jpg", new Object[]{m13513e(context), str, Integer.valueOf(i2), Integer.valueOf(i), m13501a(str)});
    }

    /* renamed from: d */
    public String m13511d(Context context, String str) {
        return TextUtils.join("", new String[]{m13510d(context), Constants.SEP, cpr.a(str)});
    }

    /* renamed from: a */
    public String m13497a(Context context, String str, int i, int i2) {
        return TextUtils.join("", new String[]{m13508c(context), Constants.SEP, str, "_s" + i2, "_v" + i, "_h", m13501a(str), ".jpg"});
    }

    /* renamed from: a */
    public String m13496a(Context context, String str, int i) {
        return TextUtils.join("", new String[]{m13514f(context), Constants.SEP, str, "_v" + i, "_h", m13501a(str), ".jpg"});
    }

    /* renamed from: b */
    public String m13505b(Context context, String str, int i, int i2) {
        return m13517h(context) + Constants.SEP + str + "_s" + i2 + "_v" + i + "_h" + m13501a(str) + ".mp4";
    }

    /* renamed from: a */
    public String m13499a(Context context, String str, int i, int i2, int i3, int i4, int i5) {
        return String.format("%s/s%d_v%d_t%d_r%d_c%d.jpg", new Object[]{m13495a(context, str), Integer.valueOf(i5), Integer.valueOf(i4), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)});
    }

    /* renamed from: a */
    public String m13500a(Context context, String str, String str2, String str3) {
        String format = String.format("%s/%s.%s", new Object[]{m13521l(context), str, str3});
        int i = 2;
        while (i <= 10) {
            if (!new File(format).exists()) {
                i = 1;
                break;
            }
            i++;
            format = String.format("%s/%s_%d.%s", new Object[]{m13521l(context), str, Integer.valueOf(i), str3});
        }
        i = 0;
        if (i != 0) {
            return format;
        }
        return String.format("%s/%s_%s.%s", new Object[]{m13521l(context), str, str2, str3});
    }

    /* renamed from: e */
    public File m13512e(Context context, String str) {
        return new File(m13515f(context, str));
    }

    /* renamed from: f */
    public String m13515f(Context context, String str) {
        return String.format("%s/.processing_%s_h%s", new Object[]{m13508c(context), str, m13501a(str)});
    }

    /* renamed from: a */
    public Uri m13493a(Context context, cct cct) {
        String str = "";
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            if (!(applicationInfo == null || applicationInfo.metaData == null)) {
                str = applicationInfo.metaData.getString("com.ninegag.android.app.provider.authorities");
            }
        } catch (NameNotFoundException e) {
        }
        String a = f9264e.m12073f().m13497a(f9264e.f8449a, cct.m12282e(), cct.m12283f(), f9264e.m12068d().f8408e);
        File file = null;
        if (a != null) {
            file = new File(a);
        }
        if (file == null) {
            return Uri.parse("content://" + str + "/invalid");
        }
        return Uri.parse("content://" + str + Constants.SEP + cpo.a(file.getAbsolutePath()));
    }
}
