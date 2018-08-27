package com.p000;

import android.content.Context;
import io.fabric.sdk.android.services.common.CommonUtils;
import io.fabric.sdk.android.services.common.IdManager;
import io.fabric.sdk.android.services.common.IdManager.DeviceIdentifierType;
import java.util.Map;
import java.util.UUID;

/* compiled from: SessionMetadataCollector */
/* renamed from: aar */
class aar {
    /* renamed from: a */
    private final Context f122a;
    /* renamed from: b */
    private final IdManager f123b;
    /* renamed from: c */
    private final String f124c;
    /* renamed from: d */
    private final String f125d;

    public aar(Context context, IdManager idManager, String str, String str2) {
        this.f122a = context;
        this.f123b = idManager;
        this.f124c = str;
        this.f125d = str2;
    }

    /* renamed from: a */
    public aap m108a() {
        Map i = this.f123b.i();
        return new aap(this.f123b.c(), UUID.randomUUID().toString(), this.f123b.b(), (String) i.get(DeviceIdentifierType.f23998d), (String) i.get(DeviceIdentifierType.f24001g), this.f123b.l(), (String) i.get(DeviceIdentifierType.f23997c), CommonUtils.m(this.f122a), this.f123b.d(), this.f123b.g(), this.f124c, this.f125d);
    }
}
