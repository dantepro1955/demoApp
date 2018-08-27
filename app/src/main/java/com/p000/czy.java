package com.p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Build;
import android.os.Build.VERSION;
import com.facebook.places.model.PlaceFields;
import java.util.UUID;

/* renamed from: czy */
public class czy implements ri {
    /* renamed from: a */
    private static final rk f20871a = dnn.m28258a(czy.class);
    /* renamed from: b */
    private static ri f20872b;
    /* renamed from: c */
    private Context f20873c = null;

    private czy() {
    }

    public czy(Context context) {
        this.f20873c = context;
        context.getSystemService(PlaceFields.PHONE);
    }

    /* renamed from: e */
    public static synchronized ri m25918e() {
        ri riVar;
        synchronized (czy.class) {
            if (f20872b == null) {
                f20872b = new czy();
            }
            riVar = f20872b;
        }
        return riVar;
    }

    /* renamed from: a */
    public final String mo4262a() {
        return Build.MODEL;
    }

    /* renamed from: b */
    public final String mo4263b() {
        return Build.DEVICE;
    }

    /* renamed from: c */
    public final String mo4264c() {
        return "Android";
    }

    /* renamed from: d */
    public final String mo4265d() {
        return VERSION.RELEASE;
    }

    /* renamed from: f */
    public final String m25923f() {
        SharedPreferences sharedPreferences = this.f20873c.getSharedPreferences("nuance_sdk_pref", 0);
        String string = sharedPreferences.getString("NUANCE_NMSP_UID", "");
        if (string.length() == 0) {
            string = UUID.randomUUID().toString();
            if (string != null) {
                string = string.replaceAll("-", "");
            }
            Editor edit = sharedPreferences.edit();
            edit.putString("NUANCE_NMSP_UID", string);
            if (!edit.commit()) {
                f20871a.mo4281e("Storing nuance sdk uid has failed");
            }
        }
        return string == null ? "" : string;
    }
}
