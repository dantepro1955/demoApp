package com.p000;

import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.Matrix;
import android.media.ExifInterface;
import android.net.Uri;
import com.facebook.common.util.UriUtil;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: BitmapUtil */
/* renamed from: dja */
public class dja {
    /* renamed from: a */
    public static Options m27558a(Context context, Uri uri) {
        if (uri == null) {
            return null;
        }
        try {
            InputStream openInputStream = context.getContentResolver().openInputStream(uri);
            Options options = new Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeStream(openInputStream, null, options);
            return options;
        } catch (FileNotFoundException e) {
            return null;
        }
    }

    /* renamed from: a */
    public static Options m27560a(String str) {
        try {
            InputStream fileInputStream = new FileInputStream(str);
            Options options = new Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeStream(fileInputStream, null, options);
            return options;
        } catch (FileNotFoundException e) {
            return null;
        } catch (NullPointerException e2) {
            return null;
        }
    }

    /* renamed from: a */
    public static Options m27559a(Resources resources, int i, Options options) {
        if (options == null) {
            options = new Options();
        }
        BitmapFactory.decodeResource(resources, i, options);
        options.inJustDecodeBounds = true;
        return options;
    }

    /* renamed from: a */
    public static Bitmap m27557a(String str, int i) {
        int a = dja.m27555a(dja.m27560a(str), i);
        try {
            InputStream fileInputStream = new FileInputStream(str);
            Options options = new Options();
            options.inSampleSize = a;
            Bitmap decodeStream = BitmapFactory.decodeStream(fileInputStream, null, options);
            Matrix matrix = new Matrix();
            float b = dja.m27562b(str);
            if (b == 0.0f) {
                return decodeStream;
            }
            matrix.preRotate(b);
            return Bitmap.createBitmap(decodeStream, 0, 0, decodeStream.getWidth(), decodeStream.getHeight(), matrix, false);
        } catch (FileNotFoundException e) {
            return null;
        }
    }

    /* renamed from: a */
    public static Bitmap m27556a(Context context, Uri uri, int i) {
        int a = dja.m27555a(dja.m27558a(context, uri), i);
        try {
            InputStream openInputStream = context.getContentResolver().openInputStream(uri);
            Options options = new Options();
            options.inSampleSize = a;
            Bitmap decodeStream = BitmapFactory.decodeStream(openInputStream, null, options);
            Matrix matrix = new Matrix();
            float b = dja.m27561b(context, uri);
            if (b == 0.0f) {
                return decodeStream;
            }
            matrix.preRotate(b);
            return Bitmap.createBitmap(decodeStream, 0, 0, decodeStream.getWidth(), decodeStream.getHeight(), matrix, false);
        } catch (FileNotFoundException e) {
            return null;
        }
    }

    /* renamed from: a */
    public static int m27555a(Options options, int i) {
        if (options == null || options.outWidth == -1) {
            return 1;
        }
        int i2 = options.outWidth;
        if (i2 > i) {
            return Math.round(((float) i2) / ((float) i));
        }
        return 1;
    }

    /* renamed from: b */
    public static float m27561b(Context context, Uri uri) {
        if (uri.getScheme().equals("content")) {
            Cursor query = context.getContentResolver().query(uri, new String[]{"orientation"}, null, null, null);
            if (query.moveToFirst()) {
                return (float) query.getInt(0);
            }
        } else if (uri.getScheme().equals(UriUtil.LOCAL_FILE_SCHEME)) {
            try {
                return (float) ((int) dja.m27554a(new ExifInterface(uri.getPath()).getAttributeInt("Orientation", 1)));
            } catch (IOException e) {
            }
        }
        return 0.0f;
    }

    /* renamed from: b */
    public static float m27562b(String str) {
        try {
            return (float) ((int) dja.m27554a(new ExifInterface(str).getAttributeInt("Orientation", 1)));
        } catch (IOException e) {
            return 0.0f;
        }
    }

    /* renamed from: a */
    private static float m27554a(int i) {
        if (i == 6) {
            return 90.0f;
        }
        if (i == 3) {
            return 180.0f;
        }
        if (i == 8) {
            return 270.0f;
        }
        return 0.0f;
    }
}
