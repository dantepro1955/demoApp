package com.p000;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

@bhd
/* renamed from: bkd */
public class bkd extends Handler {
    public bkd(Looper looper) {
        super(looper);
    }

    public void handleMessage(Message message) {
        try {
            super.handleMessage(message);
        } catch (Throwable e) {
            ako.m2347i().m8934a(e, "AdMobHandler.handleMessage");
        }
    }
}
