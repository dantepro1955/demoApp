package com.p000;

import android.text.TextUtils;

@bhd
/* renamed from: bbe */
public class bbe {
    /* renamed from: a */
    public bbd m7144a(bbc bbc) {
        if (bbc == null) {
            throw new IllegalArgumentException("CSI configuration can't be null. ");
        } else if (!bbc.m7130a()) {
            bkc.m9012a("CsiReporterFactory: CSI is not enabled. No CSI reporter created.");
            return null;
        } else if (bbc.m7132c() == null) {
            throw new IllegalArgumentException("Context can't be null. Please set up context in CsiConfiguration.");
        } else if (!TextUtils.isEmpty(bbc.m7133d())) {
            return new bbd(bbc.m7132c(), bbc.m7133d(), bbc.m7131b(), bbc.m7134e());
        } else {
            throw new IllegalArgumentException("AfmaVersion can't be null or empty. Please set up afmaVersion in CsiConfiguration.");
        }
    }
}
