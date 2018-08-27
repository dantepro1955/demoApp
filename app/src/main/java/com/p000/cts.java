package com.p000;

import android.util.Log;
import android.widget.Toast;
import com.ninegag.android.library.upload.BaseUploadSourceActivity;
import java.lang.ref.WeakReference;
import p000.ctu.C4583d;
import p000.cug.C4521a;

/* compiled from: BaseUploadSourceActivitySaveMediaCallback */
/* renamed from: cts */
public class cts implements C4521a {
    /* renamed from: a */
    protected WeakReference<BaseUploadSourceActivity> f19900a;

    public cts(BaseUploadSourceActivity baseUploadSourceActivity) {
        this.f19900a = new WeakReference(baseUploadSourceActivity);
    }

    /* renamed from: a */
    public void mo4100a(String str, int i) {
        boolean z = true;
        BaseUploadSourceActivity baseUploadSourceActivity = (BaseUploadSourceActivity) this.f19900a.get();
        if (baseUploadSourceActivity != null) {
            if (i != 1) {
                z = false;
            }
            baseUploadSourceActivity.setIsGif(z);
            baseUploadSourceActivity.goNextStep(z, str);
            if (baseUploadSourceActivity.isDebug()) {
                Log.d("BaseUploadSourceActivitySaveMediaCallback", "onMediaSaveSuccess: " + str);
            }
        }
    }

    /* renamed from: a */
    public void mo4101a(String str, int i, Exception exception) {
        BaseUploadSourceActivity baseUploadSourceActivity = (BaseUploadSourceActivity) this.f19900a.get();
        if (baseUploadSourceActivity != null) {
            if (!baseUploadSourceActivity.isFinishing()) {
                Toast.makeText(baseUploadSourceActivity, C4583d.uploadlib_error_saving_image, 1).show();
            }
            baseUploadSourceActivity.finish();
            if (baseUploadSourceActivity.isDebug()) {
                Log.e("BaseUploadSourceActivitySaveMediaCallback", "onMediaSaveFailed: ", exception);
            }
        }
    }
}
