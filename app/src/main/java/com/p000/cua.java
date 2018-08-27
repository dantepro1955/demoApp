package com.p000;

import android.database.Cursor;
import com.facebook.internal.AnalyticsEvents;
import com.facebook.share.internal.ShareConstants;
import com.inmobi.commons.analytics.db.AnalyticsSQLiteHelper;
import com.ninegag.android.library.upload.BaseUploadSourceActivity;

/* compiled from: DB */
/* renamed from: cua */
public class cua {

    /* compiled from: DB */
    /* renamed from: cua$a */
    public static class C4598a {
        /* renamed from: a */
        public static cut m24985a(cut cut, Cursor cursor) {
            cut.f20267a = cursor.getLong(cursor.getColumnIndex(AnalyticsSQLiteHelper.GENERAL_ID));
            cut.f20268b = cursor.getString(cursor.getColumnIndex("upload_id"));
            cut.f20269c = cursor.getString(cursor.getColumnIndex("key"));
            cut.f20270d = cursor.getString(cursor.getColumnIndex("value"));
            return cut;
        }

        /* renamed from: a */
        public static cus m24984a(cus cus, Cursor cursor) {
            cus.f20258a = cursor.getLong(cursor.getColumnIndex(AnalyticsSQLiteHelper.GENERAL_ID));
            cus.f20259b = cursor.getString(cursor.getColumnIndex("upload_id"));
            cus.f20260c = cursor.getString(cursor.getColumnIndex(ShareConstants.WEB_DIALOG_RESULT_PARAM_POST_ID));
            cus.f20263f = cursor.getInt(cursor.getColumnIndex("media_status"));
            cus.f20264g = cursor.getInt(cursor.getColumnIndex("meta_status"));
            cus.f20265h = cursor.getInt(cursor.getColumnIndex(AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_STATUS));
            cus.f20261d = cursor.getString(cursor.getColumnIndex(BaseUploadSourceActivity.KEY_TMP_PATH));
            cus.f20262e = cursor.getString(cursor.getColumnIndex(AnalyticsEvents.PARAMETER_SHARE_ERROR_MESSAGE));
            return cus;
        }
    }

    /* compiled from: DB */
    /* renamed from: cua$b */
    public static class C4599b {
        /* renamed from: a */
        public static String[] f20245a = new String[]{AnalyticsSQLiteHelper.GENERAL_ID, "upload_id", "key", "value"};
        /* renamed from: b */
        public static String[] f20246b = new String[]{AnalyticsSQLiteHelper.GENERAL_ID, "upload_id", ShareConstants.WEB_DIALOG_RESULT_PARAM_POST_ID, "media_status", "meta_status", AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_STATUS, BaseUploadSourceActivity.KEY_TMP_PATH, AnalyticsEvents.PARAMETER_SHARE_ERROR_MESSAGE};
    }

    /* compiled from: DB */
    /* renamed from: cua$c */
    public static class C4600c {
        /* renamed from: a */
        public static String f20247a = "metas";
        /* renamed from: b */
        public static String f20248b = "entries";
    }
}
