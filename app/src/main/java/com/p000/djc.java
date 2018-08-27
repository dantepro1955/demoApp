package com.p000;

import android.annotation.TargetApi;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;

/* compiled from: ClipBoardUtil */
/* renamed from: djc */
public class djc {
    @TargetApi(11)
    /* renamed from: a */
    public static ClipData m27564a(Context context) {
        return ((ClipboardManager) context.getSystemService("clipboard")).getPrimaryClip();
    }

    @TargetApi(11)
    /* renamed from: b */
    public static String m27565b(Context context) {
        try {
            return djc.m27564a(context).getItemAt(0).getText().toString();
        } catch (Exception e) {
            return null;
        }
    }
}
