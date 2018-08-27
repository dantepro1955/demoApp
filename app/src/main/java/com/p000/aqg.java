package com.p000;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.Log;
import java.io.File;

/* renamed from: aqg */
public class aqg {
    @TargetApi(21)
    /* renamed from: a */
    public static File m4927a(Context context) {
        return aqd.m4920j() ? context.getNoBackupFilesDir() : aqg.m4928a(new File(context.getApplicationInfo().dataDir, "no_backup"));
    }

    /* renamed from: a */
    private static synchronized File m4928a(File file) {
        synchronized (aqg.class) {
            if (!(file.exists() || file.mkdirs() || file.exists())) {
                String str = "SupportV4Utils";
                String str2 = "Unable to create no-backup dir ";
                String valueOf = String.valueOf(file.getPath());
                Log.w(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
                file = null;
            }
        }
        return file;
    }
}
