package com.p000;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import com.facebook.internal.NativeProtocol;
import com.inmobi.commons.analytics.db.AnalyticsSQLiteHelper;

/* compiled from: hTCHomeBadger */
/* renamed from: dcq */
public class dcq extends dcl {
    public dcq(Context context) {
        super(context);
    }

    /* renamed from: a */
    protected void mo4320a(int i) throws dck {
        int i2;
        ContentResolver contentResolver = this.a.getContentResolver();
        Uri parse = Uri.parse("content://com.htc.launcher.settings/favorites?notify=true");
        String charSequence = this.a.getResources().getText(this.a.getResources().getIdentifier(NativeProtocol.BRIDGE_ARG_APP_NAME_STRING, "string", m26376b())).toString();
        try {
            contentResolver.query(parse, new String[]{"notifyCount"}, "title=?", new String[]{charSequence}, null);
            i2 = 1;
        } catch (Throwable th) {
            i2 = 0;
        }
        if (i2 != 0) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("notifyCount", Integer.valueOf(i));
            contentResolver.update(parse, contentValues, "title=?", new String[]{charSequence});
            return;
        }
        byte[] a = dcr.m26383a(this.a, i);
        ContentValues contentValues2 = new ContentValues();
        contentValues2.put("iconType", Integer.valueOf(1));
        contentValues2.put(AnalyticsSQLiteHelper.TRANSACTION_ITEM_TYPE, Integer.valueOf(1));
        contentValues2.put("icon", a);
        contentResolver.update(parse, contentValues2, "title=?", new String[]{charSequence});
    }
}
