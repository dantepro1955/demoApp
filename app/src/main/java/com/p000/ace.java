package com.p000;

import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.services.common.CommonUtils;
import io.fabric.sdk.android.services.common.QueueFile;
import io.fabric.sdk.android.services.common.QueueFile.ElementReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: QueueFileLogStore */
/* renamed from: ace */
class ace implements abu {
    /* renamed from: a */
    private final File f346a;
    /* renamed from: b */
    private final int f347b;
    /* renamed from: c */
    private QueueFile f348c;

    public ace(File file, int i) {
        this.f346a = file;
        this.f347b = i;
    }

    /* renamed from: a */
    public abd mo23a() {
        if (!this.f346a.exists()) {
            return null;
        }
        m450d();
        if (this.f348c == null) {
            return null;
        }
        final int[] iArr = new int[]{0};
        final byte[] bArr = new byte[this.f348c.a()];
        try {
            this.f348c.a(new ElementReader(this) {
                /* renamed from: c */
                final /* synthetic */ ace f345c;

                /* renamed from: a */
                public void m449a(InputStream inputStream, int i) throws IOException {
                    try {
                        inputStream.read(bArr, iArr[0], i);
                        int[] iArr = iArr;
                        iArr[0] = iArr[0] + i;
                    } finally {
                        inputStream.close();
                    }
                }
            });
        } catch (Throwable e) {
            Fabric.h().e("CrashlyticsCore", "A problem occurred while reading the Crashlytics log file.", e);
        }
        return abd.m154a(bArr, 0, iArr[0]);
    }

    /* renamed from: b */
    public void mo24b() {
        CommonUtils.a(this.f348c, "There was a problem closing the Crashlytics log file.");
        this.f348c = null;
    }

    /* renamed from: c */
    public void mo25c() {
        mo24b();
        this.f346a.delete();
    }

    /* renamed from: d */
    private void m450d() {
        if (this.f348c == null) {
            try {
                this.f348c = new QueueFile(this.f346a);
            } catch (Throwable e) {
                Fabric.h().e("CrashlyticsCore", "Could not open log file: " + this.f346a, e);
            }
        }
    }
}
