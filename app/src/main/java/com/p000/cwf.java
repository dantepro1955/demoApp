package com.p000;

import android.content.Context;
import android.content.Intent;
import com.facebook.internal.NativeProtocol;
import com.facebook.stetho.server.http.HttpStatus;
import com.millennialmedia.InterstitialAd.InterstitialErrorStatus;
import com.ninegag.android.tv.task.service.ApiTaskService;
import java.util.HashMap;
import p000.cwe.C4622b;

/* compiled from: ApiTaskController */
/* renamed from: cwf */
public class cwf extends cwg {
    public cwf(Context context) {
        super(context);
    }

    /* renamed from: a */
    public void m25205a() {
        m25202a(m25204a(100));
    }

    /* renamed from: b */
    public void m25208b() {
        m25203c();
        m25202a(m25204a((int) HttpStatus.HTTP_OK));
    }

    /* renamed from: a */
    public void m25207a(HashMap<String, C4622b> hashMap) {
        m25203c();
        Intent a = m25204a((int) InterstitialErrorStatus.EXPIRED);
        a.putExtra(NativeProtocol.WEB_DIALOG_PARAMS, hashMap);
        m25202a(a);
    }

    /* renamed from: a */
    public void m25206a(String str) {
        m25203c();
        Intent a = m25204a((int) InterstitialErrorStatus.NOT_LOADED);
        a.putExtra("ids", str);
        m25202a(a);
    }

    /* renamed from: c */
    private void m25203c() {
        if (cvt.m25127a()) {
            m25205a();
        }
    }

    /* renamed from: a */
    protected Intent m25204a(int i) {
        return super.m25201a(ApiTaskService.class, i);
    }
}
