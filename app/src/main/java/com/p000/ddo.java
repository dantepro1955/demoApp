package com.p000;

import android.content.Context;
import java.io.File;

/* compiled from: ClearImageCacheTask */
/* renamed from: ddo */
public class ddo extends deb {
    /* renamed from: f */
    public void mo4336f(Context context) {
        File a = dey.m26898a(context);
        if (a != null) {
            File[] listFiles = a.listFiles();
            long currentTimeMillis = System.currentTimeMillis();
            for (File file : listFiles) {
                if (file.isFile() && !file.getName().endsWith(".nomedia") && currentTimeMillis - file.lastModified() > 172800000) {
                    file.delete();
                }
            }
        }
    }
}
