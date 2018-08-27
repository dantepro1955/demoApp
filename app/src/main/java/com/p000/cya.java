package com.p000;

import android.graphics.Bitmap;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import com.mopub.nativeads.MoPubNativeAdPositioning.MoPubClientPositioning;
import java.lang.reflect.Field;

/* compiled from: ImageViewAware */
/* renamed from: cya */
public class cya extends cyc {
    /* renamed from: d */
    public /* synthetic */ View mo4228d() {
        return m25631g();
    }

    public cya(ImageView imageView) {
        super(imageView);
    }

    /* renamed from: a */
    public int mo4223a() {
        int a = super.mo4223a();
        if (a <= 0) {
            Object obj = (ImageView) this.a.get();
            if (obj != null) {
                return cya.m25624a(obj, "mMaxWidth");
            }
        }
        return a;
    }

    /* renamed from: b */
    public int mo4226b() {
        int b = super.mo4226b();
        if (b <= 0) {
            Object obj = (ImageView) this.a.get();
            if (obj != null) {
                return cya.m25624a(obj, "mMaxHeight");
            }
        }
        return b;
    }

    /* renamed from: c */
    public cxp mo4227c() {
        ImageView imageView = (ImageView) this.a.get();
        if (imageView != null) {
            return cxp.m25540a(imageView);
        }
        return super.mo4227c();
    }

    /* renamed from: g */
    public ImageView m25631g() {
        return (ImageView) super.mo4228d();
    }

    /* renamed from: a */
    protected void mo4232a(Drawable drawable, View view) {
        ((ImageView) view).setImageDrawable(drawable);
        if (drawable instanceof AnimationDrawable) {
            ((AnimationDrawable) drawable).start();
        }
    }

    /* renamed from: a */
    protected void mo4231a(Bitmap bitmap, View view) {
        ((ImageView) view).setImageBitmap(bitmap);
    }

    /* renamed from: a */
    private static int m25624a(Object obj, String str) {
        try {
            Field declaredField = ImageView.class.getDeclaredField(str);
            declaredField.setAccessible(true);
            int intValue = ((Integer) declaredField.get(obj)).intValue();
            if (intValue > 0 && intValue < MoPubClientPositioning.NO_REPEAT) {
                return intValue;
            }
        } catch (Throwable e) {
            cyj.m25645a(e);
        }
        return 0;
    }
}
