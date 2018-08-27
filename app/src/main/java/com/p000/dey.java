package com.p000;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.Environment;
import java.io.File;
import java.io.IOException;

/* compiled from: FileUtil */
/* renamed from: dey */
public class dey {
    /* renamed from: a */
    private static boolean f21438a = false;

    /* renamed from: a */
    public static String m26901a(String str) {
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
            if ((charAt >= 'a' && charAt <= 'z') || ((charAt >= 'A' && charAt <= 'Z') || (charAt >= '0' && charAt <= '9'))) {
                stringBuilder.append(charAt);
            }
        }
        return stringBuilder.toString();
    }

    /* renamed from: a */
    public static File m26899a(Context context, String str) {
        File file = null;
        if (Environment.getExternalStorageState().equals("mounted")) {
            file = context.getExternalFilesDir(str);
        }
        if (file != null) {
            return file;
        }
        return context.getDir(str, VERSION.SDK_INT >= 24 ? 0 : 1);
    }

    /* renamed from: a */
    public static File m26898a(Context context) {
        File a = dey.m26899a(context, "images");
        if (!f21438a) {
            File file = new File(a, ".nomedia");
            if (!file.exists()) {
                try {
                    file.createNewFile();
                } catch (IOException e) {
                }
            }
            f21438a = true;
        }
        return a;
    }

    /* renamed from: b */
    public static String m26902b(Context context) {
        File a = dey.m26898a(context);
        if (a == null) {
            return null;
        }
        return a.getAbsolutePath();
    }

    /* renamed from: a */
    public static String m26900a(Context context, String str, String str2) {
        String substring = str2.substring(str2.lastIndexOf(47) + 1, str2.length());
        int lastIndexOf = substring.lastIndexOf(46);
        if (lastIndexOf != -1) {
            substring = substring.substring(0, lastIndexOf);
        }
        substring = dey.m26901a(substring);
        return String.format("%s/%s_%s.jpg", new Object[]{dey.m26902b(context), str, substring});
    }
}
