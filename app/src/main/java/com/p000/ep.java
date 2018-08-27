package com.p000;

import android.annotation.TargetApi;
import android.app.RemoteInput;
import android.app.RemoteInput.Builder;
import p000.eq.C5301a;

@TargetApi(20)
/* compiled from: RemoteInputCompatApi20 */
/* renamed from: ep */
class ep {
    /* renamed from: a */
    static RemoteInput[] m30075a(C5301a[] c5301aArr) {
        if (c5301aArr == null) {
            return null;
        }
        RemoteInput[] remoteInputArr = new RemoteInput[c5301aArr.length];
        for (int i = 0; i < c5301aArr.length; i++) {
            C5301a c5301a = c5301aArr[i];
            remoteInputArr[i] = new Builder(c5301a.mo4699a()).setLabel(c5301a.mo4700b()).setChoices(c5301a.mo4701c()).setAllowFreeFormInput(c5301a.mo4702d()).addExtras(c5301a.mo4703e()).build();
        }
        return remoteInputArr;
    }
}
