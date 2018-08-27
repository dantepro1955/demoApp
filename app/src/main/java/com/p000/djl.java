package com.p000;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore.Files;
import android.provider.MediaStore.Images.Media;
import android.util.Log;
import com.facebook.common.util.ByteConstants;
import com.inmobi.commons.analytics.db.AnalyticsSQLiteHelper;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

/* compiled from: FileUtil */
/* renamed from: djl */
public class djl {

    /* compiled from: FileUtil */
    /* renamed from: djl$a */
    public interface C4586a {
        /* renamed from: a */
        void mo4153a(String str, String str2);
    }

    /* renamed from: a */
    public static void m27586a(Bitmap bitmap, CompressFormat compressFormat, int i, String str) throws FileNotFoundException {
        OutputStream fileOutputStream = new FileOutputStream(new File(str));
        bitmap.compress(compressFormat, i, fileOutputStream);
        try {
            fileOutputStream.close();
        } catch (IOException e) {
        }
    }

    /* renamed from: a */
    public static void m27587a(File file, File file2) throws IOException {
        InputStream fileInputStream = new FileInputStream(file);
        OutputStream fileOutputStream = new FileOutputStream(file2);
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

    /* renamed from: a */
    public static String m27583a(String str) {
        return str.replaceAll(" ", "-").replaceAll("[^0-9a-zA-Z\\-]", "");
    }

    /* renamed from: b */
    public static void m27590b(String str) {
        new File(str).delete();
    }

    /* renamed from: a */
    public static boolean m27588a(File file) {
        if (file.exists()) {
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                return true;
            }
            for (int i = 0; i < listFiles.length; i++) {
                if (listFiles[i].isDirectory()) {
                    djl.m27588a(listFiles[i]);
                } else {
                    listFiles[i].delete();
                }
            }
        }
        return file.delete();
    }

    /* renamed from: c */
    public static void m27591c(String str) {
        try {
            new File(str).mkdirs();
        } catch (Exception e) {
        }
    }

    @TargetApi(11)
    /* renamed from: a */
    public static void m27584a(Context context, int i, C4586a c4586a) {
        ArrayList arrayList = new ArrayList();
        try {
            String[] strArr = new String[]{AnalyticsSQLiteHelper.GENERAL_ID, "title", "_data", "mime_type", "_size"};
            Cursor query = context.getContentResolver().query(Files.getContentUri("external"), strArr, "media_type=1 OR media_type=3", null, "date_added DESC");
            if (query.moveToFirst()) {
                int columnIndexOrThrow = query.getColumnIndexOrThrow("_data");
                int columnIndexOrThrow2 = query.getColumnIndexOrThrow("mime_type");
                do {
                    String string = query.getString(columnIndexOrThrow);
                    String string2 = query.getString(columnIndexOrThrow2);
                    arrayList.add(string);
                    if (c4586a != null) {
                        c4586a.mo4153a(string, string2);
                    }
                    if (!query.moveToNext()) {
                        return;
                    }
                } while (arrayList.size() < i);
            }
        } catch (Throwable e) {
            Log.e("FileUtil", "getMediaByContentResolver: ", e);
        }
    }

    /* renamed from: b */
    public static List<String> m27589b(Context context, int i, C4586a c4586a) {
        List arrayList = new ArrayList();
        try {
            Cursor query = context.getContentResolver().query(Media.EXTERNAL_CONTENT_URI, new String[]{AnalyticsSQLiteHelper.GENERAL_ID, "title", "_data", "mime_type", "_size"}, null, null, "date_added DESC");
            if (query.moveToFirst()) {
                int columnIndexOrThrow = query.getColumnIndexOrThrow("_data");
                int columnIndexOrThrow2 = query.getColumnIndexOrThrow("mime_type");
                do {
                    String string = query.getString(columnIndexOrThrow);
                    String columnName = query.getColumnName(columnIndexOrThrow2);
                    arrayList.add(string);
                    if (c4586a != null) {
                        c4586a.mo4153a(string, columnName);
                    }
                    if (!query.moveToNext()) {
                        break;
                    }
                } while (arrayList.size() < i);
            }
        } catch (Throwable e) {
            Log.e("FileUtil", "getPhotosByContentResolver: ", e);
        }
        return arrayList;
    }

    /* renamed from: a */
    public static void m27585a(Context context, String str) {
        if (str == null) {
            try {
                context.sendBroadcast(new Intent("android.intent.action.MEDIA_MOUNTED", Uri.parse("file://" + Environment.getExternalStorageDirectory())));
                return;
            } catch (Exception e) {
                return;
            }
        }
        Intent intent = new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE");
        intent.setData(Uri.fromFile(new File(str)));
        context.sendBroadcast(intent);
    }
}
