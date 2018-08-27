package com.p000;

import android.graphics.Bitmap.CompressFormat;
import android.graphics.BitmapFactory.Options;
import com.ninegag.android.library.upload.model.MediaMeta;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* compiled from: ImageProcessor */
/* renamed from: cui */
public class cui extends cug {
    /* renamed from: a */
    public MediaMeta mo4157a(File file) {
        int i;
        int i2;
        Options a = dja.m27560a(file.getAbsolutePath());
        if (a != null) {
            i = a.outWidth;
            i2 = a.outHeight;
        } else {
            i2 = 0;
            i = 0;
        }
        return new MediaMeta(file, i, i2, 0);
    }

    /* renamed from: a */
    protected void mo4158a(String str, MediaMeta mediaMeta) throws IOException, NullPointerException {
        OutputStream fileOutputStream = new FileOutputStream(str);
        dja.m27557a(mediaMeta.f18781d.replaceAll("%20", " "), 1280).compress(CompressFormat.JPEG, 80, fileOutputStream);
        fileOutputStream.close();
    }
}
