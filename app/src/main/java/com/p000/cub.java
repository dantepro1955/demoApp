package com.p000;

import android.content.ContentValues;
import com.facebook.internal.AnalyticsEvents;
import com.facebook.share.internal.ShareConstants;
import com.ninegag.android.library.upload.BaseUploadSourceActivity;

/* compiled from: UploadContentValuesFactory */
/* renamed from: cub */
public class cub {
    /* renamed from: a */
    public static ContentValues m24986a(ContentValues contentValues, cus cus) {
        if (contentValues == null) {
            contentValues = new ContentValues();
        }
        contentValues.put("upload_id", cus.f20259b);
        contentValues.put(ShareConstants.WEB_DIALOG_RESULT_PARAM_POST_ID, cus.f20260c);
        contentValues.put("media_status", Integer.valueOf(cus.f20263f));
        contentValues.put("meta_status", Integer.valueOf(cus.f20264g));
        contentValues.put(AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_STATUS, Integer.valueOf(cus.f20265h));
        contentValues.put(BaseUploadSourceActivity.KEY_TMP_PATH, cus.f20261d);
        contentValues.put(AnalyticsEvents.PARAMETER_SHARE_ERROR_MESSAGE, cus.f20262e);
        return contentValues;
    }

    /* renamed from: a */
    public static ContentValues m24987a(ContentValues contentValues, cut cut) {
        if (contentValues == null) {
            contentValues = new ContentValues();
        }
        contentValues.put("upload_id", cut.f20268b);
        contentValues.put("key", cut.f20269c);
        contentValues.put("value", cut.f20270d);
        return contentValues;
    }
}
