package com.p000;

import android.annotation.TargetApi;
import android.os.Bundle;
import com.facebook.applinks.AppLinkData;
import p000.eq.C5301a;

@TargetApi(16)
/* compiled from: RemoteInputCompatJellybean */
/* renamed from: er */
class er {
    /* renamed from: a */
    static Bundle m30076a(C5301a c5301a) {
        Bundle bundle = new Bundle();
        bundle.putString("resultKey", c5301a.mo4699a());
        bundle.putCharSequence("label", c5301a.mo4700b());
        bundle.putCharSequenceArray("choices", c5301a.mo4701c());
        bundle.putBoolean("allowFreeFormInput", c5301a.mo4702d());
        bundle.putBundle(AppLinkData.ARGUMENTS_EXTRAS_KEY, c5301a.mo4703e());
        return bundle;
    }

    /* renamed from: a */
    static Bundle[] m30077a(C5301a[] c5301aArr) {
        if (c5301aArr == null) {
            return null;
        }
        Bundle[] bundleArr = new Bundle[c5301aArr.length];
        for (int i = 0; i < c5301aArr.length; i++) {
            bundleArr[i] = er.m30076a(c5301aArr[i]);
        }
        return bundleArr;
    }
}
