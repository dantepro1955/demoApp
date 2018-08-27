package com.p000;

import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build.VERSION;
import android.provider.DocumentsContract;
import android.provider.MediaStore.Images.Media;
import android.provider.MediaStore.Video;
import com.facebook.common.util.ByteConstants;
import com.facebook.internal.AnalyticsEvents;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: MediaResultHandler */
/* renamed from: cuf */
public class cuf {
    /* renamed from: a */
    private Context f20250a;

    public cuf(Context context) {
        this.f20250a = context;
    }

    /* renamed from: a */
    public String m25005a(Uri uri) {
        if (uri == null) {
            return null;
        }
        String c = m25003c(uri);
        if (c == null) {
            return m25004d(uri).getAbsolutePath();
        }
        return c;
    }

    /* renamed from: a */
    private Uri m25001a(Bitmap bitmap) {
        bitmap.compress(CompressFormat.JPEG, 100, new ByteArrayOutputStream());
        return Uri.parse(Media.insertImage(this.f20250a.getContentResolver(), bitmap, "Title", null));
    }

    /* renamed from: b */
    private Uri m25002b(Uri uri) {
        InputStream openInputStream;
        FileNotFoundException e;
        Throwable th;
        Uri uri2 = null;
        if (uri.getAuthority() != null) {
            try {
                openInputStream = this.f20250a.getContentResolver().openInputStream(uri);
                try {
                    uri2 = m25001a(BitmapFactory.decodeStream(openInputStream));
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

    /* renamed from: c */
    private String m25003c(Uri uri) {
        Cursor query;
        Throwable th;
        if (VERSION.SDK_INT < 19 || !dje.m27569a(uri)) {
            String a = dje.m27568a(this.f20250a, uri, null, null);
            if (a != null) {
                return a;
            }
            Cursor query2 = this.f20250a.getContentResolver().query(uri, null, null, null, null);
            if (query2 == null) {
                return uri.getPath();
            }
            query2.moveToFirst();
            int columnIndex = query2.getColumnIndex("_data");
            if (columnIndex != -1) {
                return query2.getString(columnIndex);
            }
            try {
                query = this.f20250a.getContentResolver().query(m25002b(uri), null, null, null, null);
                try {
                    query.moveToFirst();
                    a = query.getString(query.getColumnIndex("_data"));
                    if (query == null) {
                        return a;
                    }
                    query.close();
                    return a;
                } catch (Exception e) {
                    try {
                        a = uri.getPath();
                        if (query != null) {
                            return a;
                        }
                        query.close();
                        return a;
                    } catch (Throwable th2) {
                        th = th2;
                        if (query != null) {
                            query.close();
                        }
                        throw th;
                    }
                }
            } catch (Exception e2) {
                query = query2;
                a = uri.getPath();
                if (query != null) {
                    return a;
                }
                query.close();
                return a;
            } catch (Throwable th3) {
                th = th3;
                query = query2;
                if (query != null) {
                    query.close();
                }
                throw th;
            }
        }
        Uri uri2;
        Object obj = DocumentsContract.getDocumentId(uri).split(":")[0];
        if ("image".equals(obj)) {
            uri2 = Media.EXTERNAL_CONTENT_URI;
        } else if (!AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_VIDEO.equals(obj)) {
            return uri.getPath();
        } else {
            uri2 = Video.Media.EXTERNAL_CONTENT_URI;
        }
        String str = "_id=?";
        String a2 = dje.m27568a(this.f20250a, uri2, "_id=?", new String[]{r1[1]});
        if (a2 == null || a2.isEmpty()) {
            return uri2.getPath();
        }
        return a2;
    }

    /* renamed from: d */
    private File m25004d(Uri uri) {
        File cacheDir = this.f20250a.getCacheDir();
        if (!cacheDir.exists()) {
            cacheDir.mkdirs();
        }
        File file = new File(cacheDir, "tempImage.jpg");
        try {
            InputStream openInputStream = this.f20250a.getContentResolver().openInputStream(uri);
            OutputStream fileOutputStream = new FileOutputStream(file);
            byte[] bArr = new byte[ByteConstants.KB];
            while (true) {
                int read = openInputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                fileOutputStream.write(bArr, 0, read);
            }
            fileOutputStream.close();
        } catch (Exception e) {
        }
        return file;
    }
}
