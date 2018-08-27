package com.p000;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Matrix.ScaleToFit;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.Log;
import android.widget.ImageView.ScaleType;
import com.mopub.mobileads.resource.DrawableConstants.CtaButton;
import java.util.HashSet;
import java.util.Set;

/* compiled from: RoundedDrawable */
/* renamed from: bxq */
public class bxq extends Drawable {
    /* renamed from: a */
    private final RectF f8073a = new RectF();
    /* renamed from: b */
    private final RectF f8074b = new RectF();
    /* renamed from: c */
    private final RectF f8075c = new RectF();
    /* renamed from: d */
    private final Bitmap f8076d;
    /* renamed from: e */
    private final Paint f8077e;
    /* renamed from: f */
    private final int f8078f;
    /* renamed from: g */
    private final int f8079g;
    /* renamed from: h */
    private final RectF f8080h = new RectF();
    /* renamed from: i */
    private final Paint f8081i;
    /* renamed from: j */
    private final Matrix f8082j = new Matrix();
    /* renamed from: k */
    private final RectF f8083k = new RectF();
    /* renamed from: l */
    private TileMode f8084l = TileMode.CLAMP;
    /* renamed from: m */
    private TileMode f8085m = TileMode.CLAMP;
    /* renamed from: n */
    private boolean f8086n = true;
    /* renamed from: o */
    private float f8087o = 0.0f;
    /* renamed from: p */
    private final boolean[] f8088p = new boolean[]{true, true, true, true};
    /* renamed from: q */
    private boolean f8089q = false;
    /* renamed from: r */
    private float f8090r = 0.0f;
    /* renamed from: s */
    private ColorStateList f8091s = ColorStateList.valueOf(CtaButton.BACKGROUND_COLOR);
    /* renamed from: t */
    private ScaleType f8092t = ScaleType.FIT_CENTER;

    /* compiled from: RoundedDrawable */
    /* renamed from: bxq$1 */
    static /* synthetic */ class C15761 {
        /* renamed from: a */
        static final /* synthetic */ int[] f8072a = new int[ScaleType.values().length];

        static {
            try {
                f8072a[ScaleType.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                f8072a[ScaleType.CENTER_CROP.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                f8072a[ScaleType.CENTER_INSIDE.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                f8072a[ScaleType.FIT_CENTER.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
            try {
                f8072a[ScaleType.FIT_END.ordinal()] = 5;
            } catch (NoSuchFieldError e5) {
            }
            try {
                f8072a[ScaleType.FIT_START.ordinal()] = 6;
            } catch (NoSuchFieldError e6) {
            }
            try {
                f8072a[ScaleType.FIT_XY.ordinal()] = 7;
            } catch (NoSuchFieldError e7) {
            }
        }
    }

    public bxq(Bitmap bitmap) {
        this.f8076d = bitmap;
        this.f8078f = bitmap.getWidth();
        this.f8079g = bitmap.getHeight();
        this.f8075c.set(0.0f, 0.0f, (float) this.f8078f, (float) this.f8079g);
        this.f8077e = new Paint();
        this.f8077e.setStyle(Style.FILL);
        this.f8077e.setAntiAlias(true);
        this.f8081i = new Paint();
        this.f8081i.setStyle(Style.STROKE);
        this.f8081i.setAntiAlias(true);
        this.f8081i.setColor(this.f8091s.getColorForState(getState(), CtaButton.BACKGROUND_COLOR));
        this.f8081i.setStrokeWidth(this.f8090r);
    }

    /* renamed from: a */
    public static bxq m11645a(Bitmap bitmap) {
        if (bitmap != null) {
            return new bxq(bitmap);
        }
        return null;
    }

    /* renamed from: a */
    public static Drawable m11644a(Drawable drawable) {
        if (drawable == null || (drawable instanceof bxq)) {
            return drawable;
        }
        if (drawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            int numberOfLayers = layerDrawable.getNumberOfLayers();
            for (int i = 0; i < numberOfLayers; i++) {
                layerDrawable.setDrawableByLayerId(layerDrawable.getId(i), bxq.m11644a(layerDrawable.getDrawable(i)));
            }
            return layerDrawable;
        }
        Bitmap b = bxq.m11649b(drawable);
        if (b != null) {
            return new bxq(b);
        }
        return drawable;
    }

    /* renamed from: b */
    public static Bitmap m11649b(Drawable drawable) {
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        try {
            Bitmap createBitmap = Bitmap.createBitmap(Math.max(drawable.getIntrinsicWidth(), 2), Math.max(drawable.getIntrinsicHeight(), 2), Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            drawable.draw(canvas);
            return createBitmap;
        } catch (Exception e) {
            e.printStackTrace();
            Log.w("RoundedDrawable", "Failed to create bitmap from drawable!");
            return null;
        }
    }

    public boolean isStateful() {
        return this.f8091s.isStateful();
    }

    protected boolean onStateChange(int[] iArr) {
        int colorForState = this.f8091s.getColorForState(iArr, 0);
        if (this.f8081i.getColor() == colorForState) {
            return super.onStateChange(iArr);
        }
        this.f8081i.setColor(colorForState);
        return true;
    }

    /* renamed from: a */
    private void m11646a() {
        float f = 0.0f;
        float height;
        float width;
        switch (C15761.f8072a[this.f8092t.ordinal()]) {
            case 1:
                this.f8080h.set(this.f8073a);
                this.f8080h.inset(this.f8090r / 2.0f, this.f8090r / 2.0f);
                this.f8082j.reset();
                this.f8082j.setTranslate((float) ((int) (((this.f8080h.width() - ((float) this.f8078f)) * 0.5f) + 0.5f)), (float) ((int) (((this.f8080h.height() - ((float) this.f8079g)) * 0.5f) + 0.5f)));
                break;
            case 2:
                this.f8080h.set(this.f8073a);
                this.f8080h.inset(this.f8090r / 2.0f, this.f8090r / 2.0f);
                this.f8082j.reset();
                if (((float) this.f8078f) * this.f8080h.height() > this.f8080h.width() * ((float) this.f8079g)) {
                    height = this.f8080h.height() / ((float) this.f8079g);
                    width = (this.f8080h.width() - (((float) this.f8078f) * height)) * 0.5f;
                } else {
                    height = this.f8080h.width() / ((float) this.f8078f);
                    width = 0.0f;
                    f = (this.f8080h.height() - (((float) this.f8079g) * height)) * 0.5f;
                }
                this.f8082j.setScale(height, height);
                this.f8082j.postTranslate(((float) ((int) (width + 0.5f))) + (this.f8090r / 2.0f), ((float) ((int) (f + 0.5f))) + (this.f8090r / 2.0f));
                break;
            case 3:
                this.f8082j.reset();
                if (((float) this.f8078f) > this.f8073a.width() || ((float) this.f8079g) > this.f8073a.height()) {
                    f = Math.min(this.f8073a.width() / ((float) this.f8078f), this.f8073a.height() / ((float) this.f8079g));
                } else {
                    f = 1.0f;
                }
                width = (float) ((int) (((this.f8073a.width() - (((float) this.f8078f) * f)) * 0.5f) + 0.5f));
                height = (float) ((int) (((this.f8073a.height() - (((float) this.f8079g) * f)) * 0.5f) + 0.5f));
                this.f8082j.setScale(f, f);
                this.f8082j.postTranslate(width, height);
                this.f8080h.set(this.f8075c);
                this.f8082j.mapRect(this.f8080h);
                this.f8080h.inset(this.f8090r / 2.0f, this.f8090r / 2.0f);
                this.f8082j.setRectToRect(this.f8075c, this.f8080h, ScaleToFit.FILL);
                break;
            case 5:
                this.f8080h.set(this.f8075c);
                this.f8082j.setRectToRect(this.f8075c, this.f8073a, ScaleToFit.END);
                this.f8082j.mapRect(this.f8080h);
                this.f8080h.inset(this.f8090r / 2.0f, this.f8090r / 2.0f);
                this.f8082j.setRectToRect(this.f8075c, this.f8080h, ScaleToFit.FILL);
                break;
            case 6:
                this.f8080h.set(this.f8075c);
                this.f8082j.setRectToRect(this.f8075c, this.f8073a, ScaleToFit.START);
                this.f8082j.mapRect(this.f8080h);
                this.f8080h.inset(this.f8090r / 2.0f, this.f8090r / 2.0f);
                this.f8082j.setRectToRect(this.f8075c, this.f8080h, ScaleToFit.FILL);
                break;
            case 7:
                this.f8080h.set(this.f8073a);
                this.f8080h.inset(this.f8090r / 2.0f, this.f8090r / 2.0f);
                this.f8082j.reset();
                this.f8082j.setRectToRect(this.f8075c, this.f8080h, ScaleToFit.FILL);
                break;
            default:
                this.f8080h.set(this.f8075c);
                this.f8082j.setRectToRect(this.f8075c, this.f8073a, ScaleToFit.CENTER);
                this.f8082j.mapRect(this.f8080h);
                this.f8080h.inset(this.f8090r / 2.0f, this.f8090r / 2.0f);
                this.f8082j.setRectToRect(this.f8075c, this.f8080h, ScaleToFit.FILL);
                break;
        }
        this.f8074b.set(this.f8080h);
    }

    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f8073a.set(rect);
        m11646a();
    }

    public void draw(Canvas canvas) {
        if (this.f8086n) {
            Shader bitmapShader = new BitmapShader(this.f8076d, this.f8084l, this.f8085m);
            if (this.f8084l == TileMode.CLAMP && this.f8085m == TileMode.CLAMP) {
                bitmapShader.setLocalMatrix(this.f8082j);
            }
            this.f8077e.setShader(bitmapShader);
            this.f8086n = false;
        }
        if (this.f8089q) {
            if (this.f8090r > 0.0f) {
                canvas.drawOval(this.f8074b, this.f8077e);
                canvas.drawOval(this.f8080h, this.f8081i);
                return;
            }
            canvas.drawOval(this.f8074b, this.f8077e);
        } else if (bxq.m11648a(this.f8088p)) {
            float f = this.f8087o;
            if (this.f8090r > 0.0f) {
                canvas.drawRoundRect(this.f8074b, f, f, this.f8077e);
                canvas.drawRoundRect(this.f8080h, f, f, this.f8081i);
                m11647a(canvas);
                m11650b(canvas);
                return;
            }
            canvas.drawRoundRect(this.f8074b, f, f, this.f8077e);
            m11647a(canvas);
        } else {
            canvas.drawRect(this.f8074b, this.f8077e);
            if (this.f8090r > 0.0f) {
                canvas.drawRect(this.f8080h, this.f8081i);
            }
        }
    }

    /* renamed from: a */
    private void m11647a(Canvas canvas) {
        if (!bxq.m11651b(this.f8088p) && this.f8087o != 0.0f) {
            float f = this.f8074b.left;
            float f2 = this.f8074b.top;
            float width = this.f8074b.width() + f;
            float height = this.f8074b.height() + f2;
            float f3 = this.f8087o;
            if (!this.f8088p[0]) {
                this.f8083k.set(f, f2, f + f3, f2 + f3);
                canvas.drawRect(this.f8083k, this.f8077e);
            }
            if (!this.f8088p[1]) {
                this.f8083k.set(width - f3, f2, width, f3);
                canvas.drawRect(this.f8083k, this.f8077e);
            }
            if (!this.f8088p[2]) {
                this.f8083k.set(width - f3, height - f3, width, height);
                canvas.drawRect(this.f8083k, this.f8077e);
            }
            if (!this.f8088p[3]) {
                this.f8083k.set(f, height - f3, f3 + f, height);
                canvas.drawRect(this.f8083k, this.f8077e);
            }
        }
    }

    /* renamed from: b */
    private void m11650b(Canvas canvas) {
        if (!bxq.m11651b(this.f8088p) && this.f8087o != 0.0f) {
            float f = this.f8074b.left;
            float f2 = this.f8074b.top;
            float width = f + this.f8074b.width();
            float height = f2 + this.f8074b.height();
            float f3 = this.f8087o;
            float f4 = this.f8090r / 2.0f;
            if (!this.f8088p[0]) {
                canvas.drawLine(f - f4, f2, f + f3, f2, this.f8081i);
                canvas.drawLine(f, f2 - f4, f, f2 + f3, this.f8081i);
            }
            if (!this.f8088p[1]) {
                canvas.drawLine((width - f3) - f4, f2, width, f2, this.f8081i);
                canvas.drawLine(width, f2 - f4, width, f2 + f3, this.f8081i);
            }
            if (!this.f8088p[2]) {
                canvas.drawLine((width - f3) - f4, height, width + f4, height, this.f8081i);
                canvas.drawLine(width, height - f3, width, height, this.f8081i);
            }
            if (!this.f8088p[3]) {
                canvas.drawLine(f - f4, height, f + f3, height, this.f8081i);
                canvas.drawLine(f, height - f3, f, height, this.f8081i);
            }
        }
    }

    public int getOpacity() {
        return -3;
    }

    public int getAlpha() {
        return this.f8077e.getAlpha();
    }

    public void setAlpha(int i) {
        this.f8077e.setAlpha(i);
        invalidateSelf();
    }

    public ColorFilter getColorFilter() {
        return this.f8077e.getColorFilter();
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f8077e.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public void setDither(boolean z) {
        this.f8077e.setDither(z);
        invalidateSelf();
    }

    public void setFilterBitmap(boolean z) {
        this.f8077e.setFilterBitmap(z);
        invalidateSelf();
    }

    public int getIntrinsicWidth() {
        return this.f8078f;
    }

    public int getIntrinsicHeight() {
        return this.f8079g;
    }

    /* renamed from: a */
    public bxq m11653a(float f, float f2, float f3, float f4) {
        boolean z = true;
        Set hashSet = new HashSet(4);
        hashSet.add(Float.valueOf(f));
        hashSet.add(Float.valueOf(f2));
        hashSet.add(Float.valueOf(f3));
        hashSet.add(Float.valueOf(f4));
        hashSet.remove(Float.valueOf(0.0f));
        if (hashSet.size() > 1) {
            throw new IllegalArgumentException("Multiple nonzero corner radii not yet supported.");
        }
        boolean z2;
        if (hashSet.isEmpty()) {
            this.f8087o = 0.0f;
        } else {
            float floatValue = ((Float) hashSet.iterator().next()).floatValue();
            if (Float.isInfinite(floatValue) || Float.isNaN(floatValue) || floatValue < 0.0f) {
                throw new IllegalArgumentException("Invalid radius value: " + floatValue);
            }
            this.f8087o = floatValue;
        }
        boolean[] zArr = this.f8088p;
        if (f > 0.0f) {
            z2 = true;
        } else {
            z2 = false;
        }
        zArr[0] = z2;
        zArr = this.f8088p;
        if (f2 > 0.0f) {
            z2 = true;
        } else {
            z2 = false;
        }
        zArr[1] = z2;
        zArr = this.f8088p;
        if (f3 > 0.0f) {
            z2 = true;
        } else {
            z2 = false;
        }
        zArr[2] = z2;
        boolean[] zArr2 = this.f8088p;
        if (f4 <= 0.0f) {
            z = false;
        }
        zArr2[3] = z;
        return this;
    }

    /* renamed from: a */
    public bxq m11652a(float f) {
        this.f8090r = f;
        this.f8081i.setStrokeWidth(this.f8090r);
        return this;
    }

    /* renamed from: a */
    public bxq m11654a(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f8091s = colorStateList;
        this.f8081i.setColor(this.f8091s.getColorForState(getState(), CtaButton.BACKGROUND_COLOR));
        return this;
    }

    /* renamed from: a */
    public bxq m11657a(boolean z) {
        this.f8089q = z;
        return this;
    }

    /* renamed from: a */
    public bxq m11656a(ScaleType scaleType) {
        if (scaleType == null) {
            scaleType = ScaleType.FIT_CENTER;
        }
        if (this.f8092t != scaleType) {
            this.f8092t = scaleType;
            m11646a();
        }
        return this;
    }

    /* renamed from: a */
    public bxq m11655a(TileMode tileMode) {
        if (this.f8084l != tileMode) {
            this.f8084l = tileMode;
            this.f8086n = true;
            invalidateSelf();
        }
        return this;
    }

    /* renamed from: b */
    public bxq m11658b(TileMode tileMode) {
        if (this.f8085m != tileMode) {
            this.f8085m = tileMode;
            this.f8086n = true;
            invalidateSelf();
        }
        return this;
    }

    /* renamed from: a */
    private static boolean m11648a(boolean[] zArr) {
        for (boolean z : zArr) {
            if (z) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    private static boolean m11651b(boolean[] zArr) {
        for (boolean z : zArr) {
            if (z) {
                return false;
            }
        }
        return true;
    }
}
