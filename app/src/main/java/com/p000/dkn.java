package com.p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import com.under9.android.lib.widget.inlinecomposer.activity.UploadSourceActivity;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* compiled from: Utils */
/* renamed from: dkn */
public class dkn {
    /* renamed from: a */
    public static String m27737a(Context context, String str) {
        Bitmap a = dja.m27557a(str, 1280);
        UploadSourceActivity.getSFC().m27054a(context);
        String createTmpFile = UploadSourceActivity.createTmpFile(UploadSourceActivity.getSFC().m27058c(context), 1);
        try {
            OutputStream fileOutputStream = new FileOutputStream(createTmpFile);
            a.compress(CompressFormat.JPEG, 80, fileOutputStream);
            fileOutputStream.close();
        } catch (FileNotFoundException e) {
        } catch (IOException e2) {
        }
        return createTmpFile;
    }
}
