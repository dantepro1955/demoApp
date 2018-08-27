package com.p000;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import com.facebook.internal.NativeProtocol;
import com.inmobi.commons.analytics.db.AnalyticsSQLiteHelper;

/* compiled from: AndroidHomeBadger */
/* renamed from: dcn */
public class dcn extends dcl {
    public dcn(Context context) {
        super(context);
    }

    /* renamed from: a */
    protected void mo4320a(int i) throws dck {
        byte[] a = dcr.m26383a(this.a, i);
        String charSequence = this.a.getResources().getText(this.a.getResources().getIdentifier(NativeProtocol.BRIDGE_ARG_APP_NAME_STRING, "string", m26376b())).toString();
        Uri parse = Uri.parse("content://com.android.launcher2.settings/favorites?notify=true");
        ContentResolver contentResolver = this.a.getContentResolver();
        ContentValues contentValues = new ContentValues();
        contentValues.put("iconType", Integer.valueOf(1));
        contentValues.put(AnalyticsSQLiteHelper.TRANSACTION_ITEM_TYPE, Integer.valueOf(1));
        contentValues.put("icon", a);
        contentResolver.update(parse, contentValues, "title=?", new String[]{charSequence});
    }
}
