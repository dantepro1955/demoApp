package com.p000;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.inmobi.commons.analytics.db.AnalyticsSQLiteHelper;
import com.ninegag.android.library.upload.BaseUploadSourceActivity;

/* compiled from: SamsungHomeBadger */
/* renamed from: dcp */
public class dcp extends dcl {
    public dcp(Context context) {
        super(context);
    }

    /* renamed from: a */
    protected void mo4320a(int i) throws dck {
        Uri parse = Uri.parse("content://com.sec.badge/apps?notify=true");
        ContentResolver contentResolver = this.a.getContentResolver();
        Cursor query = contentResolver.query(parse, new String[]{AnalyticsSQLiteHelper.GENERAL_ID}, "package=?", new String[]{m26376b()}, null);
        if (query.moveToNext()) {
            int i2 = query.getInt(0);
            ContentValues contentValues = new ContentValues();
            contentValues.put("badgecount", Integer.valueOf(i));
            contentResolver.update(parse, contentValues, "_id=?", new String[]{String.valueOf(i2)});
            return;
        }
        ContentValues contentValues2 = new ContentValues();
        contentValues2.put(BaseUploadSourceActivity.KEY_PACKAGE, m26376b());
        contentValues2.put("class", m26374a());
        contentValues2.put("badgecount", Integer.valueOf(i));
        contentResolver.insert(parse, contentValues2);
    }
}
