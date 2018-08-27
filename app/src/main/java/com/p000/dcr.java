package com.p000;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;

/* compiled from: ImageUtil */
/* renamed from: dcr */
public class dcr {
    /* renamed from: a */
    public static Bitmap m26382a(Drawable drawable) {
        Bitmap createBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), drawable.getOpacity() != -1 ? Config.ARGB_8888 : Config.RGB_565);
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        drawable.draw(canvas);
        return createBitmap;
    }

    /* renamed from: a */
    public static byte[] m26384a(Bitmap bitmap) {
        OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(CompressFormat.PNG, 100, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    /* renamed from: a */
    public static byte[] m26383a(Context context, int i) throws dck {
        Bitmap bitmap = null;
        String valueOf = String.valueOf(i);
        for (PackageInfo packageInfo : context.getPackageManager().getInstalledPackages(0)) {
            Bitmap a;
            if (context.getPackageName().equals(packageInfo.packageName)) {
                a = dcr.m26382a(packageInfo.applicationInfo.loadIcon(context.getPackageManager()));
            } else {
                a = bitmap;
            }
            bitmap = a;
        }
        if (bitmap == null) {
            throw new dck("count not load the app Icon");
        } else if (i == 0) {
            return dcr.m26384a(bitmap);
        } else {
            float f = context.getResources().getDisplayMetrics().density;
            Config config = bitmap.getConfig();
            if (config == null) {
                config = Config.ARGB_8888;
            }
            Bitmap copy = bitmap.copy(config, true);
            float width = (float) copy.getWidth();
            float height = (float) copy.getHeight();
            if (width <= height) {
                width = height;
            }
            height = width / 4.0f;
            float width2 = ((float) copy.getWidth()) - height;
            Paint paint = new Paint();
            paint.setColor(-65536);
            Paint paint2 = new Paint();
            paint2.setColor(-1);
            Canvas canvas = new Canvas(copy);
            canvas.drawCircle(width2, height, height, paint2);
            canvas.drawCircle(width2, height, (6.0f * height) / 7.0f, paint);
            paint2 = new Paint(1);
            paint2.setColor(-1);
            int i2 = (int) (((double) height) * 0.7d);
            if (valueOf.length() > 1) {
                i2 = (int) (((double) height) * 0.5d);
            }
            paint2.setTextSize((float) ((int) (((float) i2) * f)));
            paint2.setFakeBoldText(true);
            Rect rect = new Rect();
            paint2.getTextBounds(valueOf, 0, valueOf.length(), rect);
            width = (float) (rect.width() / 2);
            if (valueOf.endsWith("1")) {
                width = (float) (((double) width) * 1.25d);
            }
            canvas.drawText(valueOf, width2 - width, height + ((float) (rect.height() / 2)), paint2);
            return dcr.m26384a(copy);
        }
    }
}
