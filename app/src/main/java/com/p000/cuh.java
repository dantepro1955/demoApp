package com.p000;

import com.facebook.common.util.ByteConstants;
import com.ninegag.android.library.upload.model.MediaMeta;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: GifProcessor */
/* renamed from: cuh */
public class cuh extends cug {
    /* renamed from: a */
    public MediaMeta mo4157a(File file) {
        try {
            InputStream fileInputStream = new FileInputStream(file);
            dri dri = new dri();
            dri.m28836a(fileInputStream);
            return new MediaMeta(file, dri.m28835a(), dri.m28838b(), 1);
        } catch (Exception e) {
            return new MediaMeta(file, 0, 0, 1);
        }
    }

    /* renamed from: a */
    protected void mo4158a(String str, MediaMeta mediaMeta) throws IOException, NullPointerException {
        FileOutputStream fileOutputStream = new FileOutputStream(str);
        FileInputStream fileInputStream = new FileInputStream(mediaMeta.f18781d);
        byte[] bArr = new byte[ByteConstants.KB];
        while (true) {
            int read = fileInputStream.read(bArr);
            if (read > 0) {
                fileOutputStream.write(bArr, 0, read);
            } else {
                fileInputStream.close();
                fileOutputStream.close();
                return;
            }
        }
    }
}
