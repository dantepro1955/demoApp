package com.p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import com.facebook.common.util.ByteConstants;
import java.util.List;
import java.util.Map;

/* compiled from: SharedElementCallback */
/* renamed from: es */
public abstract class es {
    /* renamed from: b */
    private static int f23654b = ByteConstants.MB;
    /* renamed from: a */
    private Matrix f23655a;

    /* compiled from: SharedElementCallback */
    /* renamed from: es$a */
    public interface C4665a {
        /* renamed from: a */
        void mo4221a();
    }

    /* renamed from: a */
    public void m30083a(List<String> list, List<View> list2, List<View> list3) {
    }

    /* renamed from: b */
    public void m30085b(List<String> list, List<View> list2, List<View> list3) {
    }

    /* renamed from: a */
    public void m30081a(List<View> list) {
    }

    /* renamed from: a */
    public void m30084a(List<String> list, Map<String, View> map) {
    }

    /* renamed from: a */
    public Parcelable m30079a(View view, Matrix matrix, RectF rectF) {
        if (view instanceof ImageView) {
            ImageView imageView = (ImageView) view;
            Drawable drawable = imageView.getDrawable();
            Drawable background = imageView.getBackground();
            if (drawable != null && background == null) {
                Parcelable a = es.m30078a(drawable);
                if (a != null) {
                    Bundle bundle = new Bundle();
                    bundle.putParcelable("sharedElement:snapshot:bitmap", a);
                    bundle.putString("sharedElement:snapshot:imageScaleType", imageView.getScaleType().toString());
                    if (imageView.getScaleType() == ScaleType.MATRIX) {
                        float[] fArr = new float[9];
                        imageView.getImageMatrix().getValues(fArr);
                        bundle.putFloatArray("sharedElement:snapshot:imageMatrix", fArr);
                    }
                    return bundle;
                }
            }
        }
        int round = Math.round(rectF.width());
        int round2 = Math.round(rectF.height());
        if (round <= 0 || round2 <= 0) {
            return null;
        }
        float min = Math.min(1.0f, ((float) f23654b) / ((float) (round * round2)));
        round = (int) (((float) round) * min);
        round2 = (int) (((float) round2) * min);
        if (this.f23655a == null) {
            this.f23655a = new Matrix();
        }
        this.f23655a.set(matrix);
        this.f23655a.postTranslate(-rectF.left, -rectF.top);
        this.f23655a.postScale(min, min);
        Parcelable createBitmap = Bitmap.createBitmap(round, round2, Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.concat(this.f23655a);
        view.draw(canvas);
        return createBitmap;
    }

    /* renamed from: a */
    private static Bitmap m30078a(Drawable drawable) {
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            return null;
        }
        float min = Math.min(1.0f, ((float) f23654b) / ((float) (intrinsicWidth * intrinsicHeight)));
        if ((drawable instanceof BitmapDrawable) && min == 1.0f) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        int i = (int) (((float) intrinsicWidth) * min);
        intrinsicHeight = (int) (((float) intrinsicHeight) * min);
        Bitmap createBitmap = Bitmap.createBitmap(i, intrinsicHeight, Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Rect bounds = drawable.getBounds();
        int i2 = bounds.left;
        int i3 = bounds.top;
        int i4 = bounds.right;
        int i5 = bounds.bottom;
        drawable.setBounds(0, 0, i, intrinsicHeight);
        drawable.draw(canvas);
        drawable.setBounds(i2, i3, i4, i5);
        return createBitmap;
    }

    /* renamed from: a */
    public View m30080a(Context context, Parcelable parcelable) {
        View view;
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            Bitmap bitmap = (Bitmap) bundle.getParcelable("sharedElement:snapshot:bitmap");
            if (bitmap == null) {
                return null;
            }
            View imageView = new ImageView(context);
            imageView.setImageBitmap(bitmap);
            imageView.setScaleType(ScaleType.valueOf(bundle.getString("sharedElement:snapshot:imageScaleType")));
            if (imageView.getScaleType() == ScaleType.MATRIX) {
                float[] floatArray = bundle.getFloatArray("sharedElement:snapshot:imageMatrix");
                Matrix matrix = new Matrix();
                matrix.setValues(floatArray);
                imageView.setImageMatrix(matrix);
            }
            view = imageView;
        } else if (parcelable instanceof Bitmap) {
            Bitmap bitmap2 = (Bitmap) parcelable;
            view = new ImageView(context);
            view.setImageBitmap(bitmap2);
        } else {
            view = null;
        }
        return view;
    }

    /* renamed from: a */
    public void m30082a(List<String> list, List<View> list2, C4665a c4665a) {
        c4665a.mo4221a();
    }
}
