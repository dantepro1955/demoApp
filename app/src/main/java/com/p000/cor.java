package com.p000;

import android.util.Log;
import com.ninegag.android.library.upload.BaseUploadSourceActivity;

/* compiled from: UploadSourceActivitySaveMediaCallback */
/* renamed from: cor */
public class cor extends cts {
    public cor(BaseUploadSourceActivity baseUploadSourceActivity) {
        super(baseUploadSourceActivity);
    }

    /* renamed from: a */
    public void mo4101a(String str, int i, Exception exception) {
        super.mo4101a(str, i, exception);
        chn.t("UPLOAD_SAVE_MEDIA", Log.getStackTraceString(exception));
    }
}
