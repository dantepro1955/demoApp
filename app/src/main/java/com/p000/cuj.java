package com.p000;

import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.util.Log;
import com.facebook.common.util.ByteConstants;
import com.facebook.imagepipeline.common.RotationOptions;
import com.ninegag.android.library.upload.model.MediaMeta;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/* compiled from: Mp4Processor */
/* renamed from: cuj */
public class cuj extends cug {
    /* renamed from: a */
    public MediaMeta mo4157a(File file) {
        int parseInt;
        Throwable e;
        int i = 0;
        long j = 0;
        try {
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            mediaMetadataRetriever.setDataSource(Uri.fromFile(file).getPath());
            if (Integer.parseInt(mediaMetadataRetriever.extractMetadata(24)) % RotationOptions.ROTATE_180 == 90) {
                parseInt = Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
                try {
                    i = Integer.parseInt(mediaMetadataRetriever.extractMetadata(19));
                } catch (Exception e2) {
                    e = e2;
                    Log.e("Mp4Processor", "getMediaMeta: ", e);
                    return new MediaMeta(file, i, parseInt, j, 2);
                }
            }
            int parseInt2 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
            try {
                parseInt = Integer.parseInt(mediaMetadataRetriever.extractMetadata(19));
                i = parseInt2;
            } catch (Exception e3) {
                e = e3;
                parseInt = 0;
                i = parseInt2;
                Log.e("Mp4Processor", "getMediaMeta: ", e);
                return new MediaMeta(file, i, parseInt, j, 2);
            }
            j = Long.parseLong(mediaMetadataRetriever.extractMetadata(9));
        } catch (Exception e4) {
            e = e4;
            parseInt = 0;
            Log.e("Mp4Processor", "getMediaMeta: ", e);
            return new MediaMeta(file, i, parseInt, j, 2);
        }
        return new MediaMeta(file, i, parseInt, j, 2);
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
