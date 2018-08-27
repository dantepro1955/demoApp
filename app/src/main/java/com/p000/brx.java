package com.p000;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences.Editor;
import android.os.Build.VERSION;

/* renamed from: brx */
class brx {
    @SuppressLint({"CommitPrefEdits"})
    /* renamed from: a */
    static void m10575a(Context context, String str, String str2, String str3) {
        Editor edit = context.getSharedPreferences(str, 0).edit();
        edit.putString(str2, str3);
        brx.m10576a(edit);
    }

    /* renamed from: a */
    static void m10576a(Editor editor) {
        int i = VERSION.SDK_INT;
        editor.apply();
    }
}
