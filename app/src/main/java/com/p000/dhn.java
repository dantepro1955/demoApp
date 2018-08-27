package com.p000;

import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.provider.MediaStore.Images.Media;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: PickImageUtil */
/* renamed from: dhn */
public class dhn {
    /* renamed from: a */
    public static String m27300a(Context context, Uri uri) {
        Cursor query = context.getContentResolver().query(uri, null, null, null, null);
        if (query == null) {
            return uri.getPath();
        }
        query.moveToFirst();
        int columnIndex = query.getColumnIndex("_data");
        if (columnIndex != -1) {
            return query.getString(columnIndex);
        }
        query = context.getContentResolver().query(dhn.m27301b(context, uri), null, null, null, null);
        query.moveToFirst();
        return query.getString(query.getColumnIndex("_data"));
    }

    /* renamed from: b */
    protected static Uri m27301b(Context context, Uri uri) {
        InputStream openInputStream;
        FileNotFoundException e;
        Throwable th;
        Uri uri2 = null;
        if (uri.getAuthority() != null) {
            try {
                openInputStream = context.getContentResolver().openInputStream(uri);
                try {
                    uri2 = dhn.m27299a(context, BitmapFactory.decodeStream(openInputStream));
                    try {
                        openInputStream.close();
                    } catch (IOException e2) {
                        e2.printStackTrace();
                    }
                } catch (FileNotFoundException e3) {
                    e = e3;
                    try {
                        e.printStackTrace();
                        try {
                            openInputStream.close();
                        } catch (IOException e22) {
                            e22.printStackTrace();
                        }
                        return uri2;
                    } catch (Throwable th2) {
                        th = th2;
                        try {
                            openInputStream.close();
                        } catch (IOException e222) {
                            e222.printStackTrace();
                        }
                        throw th;
                    }
                }
            } catch (FileNotFoundException e4) {
                e = e4;
                openInputStream = uri2;
                e.printStackTrace();
                openInputStream.close();
                return uri2;
            } catch (Throwable th3) {
                openInputStream = uri2;
                th = th3;
                openInputStream.close();
                throw th;
            }
        }
        return uri2;
    }

    /* renamed from: a */
    protected static Uri m27299a(Context context, Bitmap bitmap) {
        bitmap.compress(CompressFormat.JPEG, 100, new ByteArrayOutputStream());
        return Uri.parse(Media.insertImage(context.getContentResolver(), bitmap, "Title", null));
    }
}
