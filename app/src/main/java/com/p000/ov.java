package com.p000;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.graphics.drawable.shapes.Shape;
import android.util.AttributeSet;
import android.widget.ProgressBar;

/* compiled from: AppCompatProgressBarHelper */
/* renamed from: ov */
public class ov {
    /* renamed from: a */
    private static final int[] f24999a = new int[]{16843067, 16843068};
    /* renamed from: b */
    private final ProgressBar f25000b;
    /* renamed from: c */
    private Bitmap f25001c;

    public ov(ProgressBar progressBar) {
        this.f25000b = progressBar;
    }

    /* renamed from: a */
    public void mo5410a(AttributeSet attributeSet, int i) {
        qf a = qf.m33777a(this.f25000b.getContext(), attributeSet, f24999a, i, 0);
        Drawable b = a.m33784b(0);
        if (b != null) {
            this.f25000b.setIndeterminateDrawable(mo5409a(b));
        }
        b = a.m33784b(1);
        if (b != null) {
            this.f25000b.setProgressDrawable(m33382a(b, false));
        }
        a.m33781a();
    }

    /* renamed from: a */
    private Drawable m33382a(Drawable drawable, boolean z) {
        int i = 0;
        Drawable a;
        if (drawable instanceof fw) {
            a = ((fw) drawable).mo4736a();
            if (a != null) {
                ((fw) drawable).mo4737a(m33382a(a, z));
            }
        } else if (drawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            int numberOfLayers = layerDrawable.getNumberOfLayers();
            Drawable[] drawableArr = new Drawable[numberOfLayers];
            for (int i2 = 0; i2 < numberOfLayers; i2++) {
                boolean z2;
                int id = layerDrawable.getId(i2);
                Drawable drawable2 = layerDrawable.getDrawable(i2);
                if (id == 16908301 || id == 16908303) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                drawableArr[i2] = m33382a(drawable2, z2);
            }
            a = new LayerDrawable(drawableArr);
            while (i < numberOfLayers) {
                a.setId(i, layerDrawable.getId(i));
                i++;
            }
            return a;
        } else if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            Bitmap bitmap = bitmapDrawable.getBitmap();
            if (this.f25001c == null) {
                this.f25001c = bitmap;
            }
            Drawable shapeDrawable = new ShapeDrawable(mo5411b());
            shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, TileMode.REPEAT, TileMode.CLAMP));
            shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
            return z ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
        }
        return drawable;
    }

    /* renamed from: a */
    private Drawable mo5409a(Drawable drawable) {
        if (!(drawable instanceof AnimationDrawable)) {
            return drawable;
        }
        AnimationDrawable animationDrawable = (AnimationDrawable) drawable;
        int numberOfFrames = animationDrawable.getNumberOfFrames();
        Drawable animationDrawable2 = new AnimationDrawable();
        animationDrawable2.setOneShot(animationDrawable.isOneShot());
        for (int i = 0; i < numberOfFrames; i++) {
            Drawable a = m33382a(animationDrawable.getFrame(i), true);
            a.setLevel(10000);
            animationDrawable2.addFrame(a, animationDrawable.getDuration(i));
        }
        animationDrawable2.setLevel(10000);
        return animationDrawable2;
    }

    /* renamed from: b */
    private Shape mo5411b() {
        return new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null);
    }

    /* renamed from: a */
    public Bitmap m33384a() {
        return this.f25001c;
    }
}
