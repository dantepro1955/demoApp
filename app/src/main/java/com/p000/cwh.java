package com.p000;

import android.content.Intent;
import com.facebook.internal.NativeProtocol;
import com.facebook.stetho.server.http.HttpStatus;
import com.millennialmedia.InterstitialAd.InterstitialErrorStatus;
import java.util.HashMap;

/* compiled from: ApiTaskFactory */
/* renamed from: cwh */
public class cwh extends cvz {
    /* renamed from: a */
    public cvy mo4180a(Intent intent) {
        switch (intent.getIntExtra("command", -1)) {
            case 100:
                return m25212e(intent);
            case HttpStatus.HTTP_OK /*200*/:
                return m25210c(intent);
            case InterstitialErrorStatus.EXPIRED /*201*/:
                return m25209b(intent);
            case InterstitialErrorStatus.NOT_LOADED /*202*/:
                return m25211d(intent);
            default:
                return null;
        }
    }

    /* renamed from: b */
    private cvy m25209b(Intent intent) {
        return new cwe((HashMap) intent.getSerializableExtra(NativeProtocol.WEB_DIALOG_PARAMS));
    }

    /* renamed from: c */
    private cvy m25210c(Intent intent) {
        return new cwb();
    }

    /* renamed from: d */
    private cvy m25211d(Intent intent) {
        return new cwc(intent.getStringExtra("ids"));
    }

    /* renamed from: e */
    private cvy m25212e(Intent intent) {
        return new cwd();
    }
}
