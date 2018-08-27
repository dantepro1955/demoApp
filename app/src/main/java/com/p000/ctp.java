package com.p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import java.util.UUID;

/* compiled from: RLoggerID */
/* renamed from: ctp */
public class ctp {
    /* renamed from: a */
    private static String f20195a = null;

    /* renamed from: a */
    public static synchronized String m24916a(Context context) {
        String str;
        synchronized (ctp.class) {
            if (f20195a == null) {
                SharedPreferences sharedPreferences = context.getSharedPreferences("PREF_UNIQUE_ID", 0);
                f20195a = sharedPreferences.getString("PREF_UNIQUE_ID", null);
                if (f20195a == null) {
                    f20195a = UUID.randomUUID().toString();
                    Editor edit = sharedPreferences.edit();
                    edit.putString("PREF_UNIQUE_ID", f20195a);
                    edit.commit();
                }
            }
            str = f20195a;
        }
        return str;
    }
}
