package com.p000;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;

/* compiled from: ContentProviderUtil */
/* renamed from: dje */
public final class dje {
    /* renamed from: a */
    public static String m27568a(Context context, Uri uri, String str, String[] strArr) {
        Cursor query;
        Cursor cursor;
        Throwable th;
        String str2 = "_data";
        try {
            query = context.getContentResolver().query(uri, new String[]{"_data"}, str, strArr, null);
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        str2 = query.getString(query.getColumnIndexOrThrow("_data"));
                        if (query == null) {
                            return str2;
                        }
                        query.close();
                        return str2;
                    }
                } catch (Exception e) {
                    cursor = query;
                    if (cursor != null) {
                        cursor.close();
                    }
                    return null;
                } catch (Throwable th2) {
                    th = th2;
                    if (query != null) {
                        query.close();
                    }
                    throw th;
                }
            }
            if (query != null) {
                query.close();
            }
        } catch (Exception e2) {
            cursor = null;
            if (cursor != null) {
                cursor.close();
            }
            return null;
        } catch (Throwable th3) {
            th = th3;
            query = null;
            if (query != null) {
                query.close();
            }
            throw th;
        }
        return null;
    }

    /* renamed from: a */
    public static boolean m27569a(Uri uri) {
        return "com.android.providers.media.documents".equals(uri.getAuthority());
    }
}
