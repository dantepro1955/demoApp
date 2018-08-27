package com.p000;

import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.services.persistence.FileStore;
import java.io.File;

/* compiled from: CrashlyticsFileMarker */
/* renamed from: abl */
class abl {
    /* renamed from: a */
    private final String f270a;
    /* renamed from: b */
    private final FileStore f271b;

    public abl(String str, FileStore fileStore) {
        this.f270a = str;
        this.f271b = fileStore;
    }

    /* renamed from: a */
    public boolean m344a() {
        boolean z = false;
        try {
            z = m343d().createNewFile();
        } catch (Throwable e) {
            Fabric.h().e("CrashlyticsCore", "Error creating marker: " + this.f270a, e);
        }
        return z;
    }

    /* renamed from: b */
    public boolean m345b() {
        return m343d().exists();
    }

    /* renamed from: c */
    public boolean m346c() {
        return m343d().delete();
    }

    /* renamed from: d */
    private File m343d() {
        return new File(this.f271b.a(), this.f270a);
    }
}
