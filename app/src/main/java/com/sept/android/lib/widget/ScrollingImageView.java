package com.sept.android.lib.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Matrix.ScaleToFit;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.View.MeasureSpec;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import p000.dja;
import p000.dnb.C5005h;
import p000.jd;

public class ScrollingImageView extends View {
    /* renamed from: a */
    private List<Bitmap> f19517a;
    /* renamed from: b */
    private float f19518b;
    /* renamed from: c */
    private int[] f19519c;
    /* renamed from: d */
    private int f19520d = 0;
    /* renamed from: e */
    private int f19521e = 0;
    /* renamed from: f */
    private Rect f19522f = new Rect();
    /* renamed from: g */
    private float f19523g = 0.0f;
    /* renamed from: h */
    private boolean f19524h;

    public ScrollingImageView(Context context, AttributeSet attributeSet) {
        int i = 0;
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C5005h.ParallaxView, 0, 0);
        TypedArray obtainTypedArray;
        try {
            int[] intArray;
            Options options = new Options();
            options.inPreferredConfig = m23879b(obtainStyledAttributes.getInt(C5005h.ParallaxView_bitmapMode, 0));
            Object obj = obtainStyledAttributes.getInt(C5005h.ParallaxView_initialState, 0);
            this.f19518b = obtainStyledAttributes.getDimension(C5005h.ParallaxView_speed, 10.0f);
            int i2 = obtainStyledAttributes.getInt(C5005h.ParallaxView_sceneLength, 1000);
            int resourceId = obtainStyledAttributes.getResourceId(C5005h.ParallaxView_randomness, 0);
            int[] iArr = new int[0];
            if (resourceId > 0) {
                intArray = getResources().getIntArray(resourceId);
            } else {
                intArray = iArr;
            }
            int i3 = isInEditMode() ? 3 : obtainStyledAttributes.peekValue(C5005h.ParallaxView_src).type;
            if (i3 == 1) {
                obtainTypedArray = getResources().obtainTypedArray(obtainStyledAttributes.getResourceId(C5005h.ParallaxView_src, 0));
                int i4 = 0;
                for (int i5 : intArray) {
                    i4 += i5;
                }
                this.f19517a = new ArrayList(Math.max(obtainTypedArray.length(), i4));
                i4 = 0;
                while (i4 < obtainTypedArray.length()) {
                    if (intArray.length <= 0 || i4 >= intArray.length) {
                        i3 = 1;
                    } else {
                        i3 = Math.max(1, intArray[i4]);
                    }
                    Bitmap a = m23878a(getResources(), obtainTypedArray.getResourceId(i4, 0), options);
                    for (resourceId = 0; resourceId < i3; resourceId++) {
                        this.f19517a.add(a);
                    }
                    Log.d("ScrollingImageView", "height=" + a.getHeight() + ", width=" + a.getWidth());
                    this.f19521e = Math.max(a.getHeight(), this.f19521e);
                    i4++;
                }
                Random random = new Random();
                this.f19519c = new int[i2];
                while (i < this.f19519c.length) {
                    this.f19519c[i] = random.nextInt(this.f19517a.size());
                    i++;
                }
                obtainStyledAttributes.recycle();
                if (obj == null) {
                    m23880a();
                }
            }
            if (i3 == 3) {
                Bitmap a2 = m23878a(getResources(), obtainStyledAttributes.getResourceId(C5005h.ParallaxView_src, 0), options);
                if (a2 != null) {
                    this.f19517a = Collections.singletonList(a2);
                    this.f19519c = new int[]{0};
                    this.f19521e = ((Bitmap) this.f19517a.get(0)).getHeight();
                    Log.d("ScrollingImageView", "height=" + ((Bitmap) this.f19517a.get(0)).getHeight() + ", width=" + a2.getWidth());
                } else {
                    this.f19517a = Collections.emptyList();
                }
            }
            obtainStyledAttributes.recycle();
            if (obj == null) {
                m23880a();
            }
        } catch (Throwable th) {
        } finally {
            
/*
Method generation error in method: com.sept.android.lib.widget.ScrollingImageView.<init>(android.content.Context, android.util.AttributeSet):void, dex: classes2.dex
jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0127: INVOKE  (wrap: android.content.res.TypedArray
  ?: MERGE  (r10_2 android.content.res.TypedArray) = (r10_1 'obtainTypedArray' android.content.res.TypedArray), (r6_0 'obtainStyledAttributes' android.content.res.TypedArray)) android.content.res.TypedArray.recycle():void type: VIRTUAL in method: com.sept.android.lib.widget.ScrollingImageView.<init>(android.content.Context, android.util.AttributeSet):void, dex: classes2.dex
	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:226)
	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:203)
	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:100)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:50)
	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:87)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:53)
	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:93)
	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:299)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:87)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:53)
	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:187)
	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:320)
	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:257)
	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:220)
	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:110)
	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:75)
	at jadx.core.codegen.CodeGen.visit(CodeGen.java:12)
	at jadx.core.ProcessClass.process(ProcessClass.java:40)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/1976752685.run(Unknown Source)
Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: ?: MERGE  (r10_2 android.content.res.TypedArray) = (r10_1 'obtainTypedArray' android.content.res.TypedArray), (r6_0 'obtainStyledAttributes' android.content.res.TypedArray) in method: com.sept.android.lib.widget.ScrollingImageView.<init>(android.content.Context, android.util.AttributeSet):void, dex: classes2.dex
	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:226)
	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:101)
	at jadx.core.codegen.InsnGen.addArgDot(InsnGen.java:84)
	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:632)
	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:338)
	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:220)
	... 22 more
Caused by: jadx.core.utils.exceptions.CodegenException: MERGE can be used only in fallback mode
	at jadx.core.codegen.InsnGen.fallbackOnlyInsn(InsnGen.java:537)
	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:509)
	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:211)
	... 27 more

*/

            protected void onMeasure(int i, int i2) {
                super.onMeasure(i, i2);
                int i3 = this.f19521e;
                int size = MeasureSpec.getSize(i);
                int i4 = getResources().getDisplayMetrics().heightPixels;
                if (this.f19521e > i4) {
                    i3 = Math.round((((float) i4) / ((float) this.f19521e)) * ((float) this.f19521e));
                }
                setMeasuredDimension(size, i3);
            }

            public void onDraw(Canvas canvas) {
                super.onDraw(canvas);
                if (canvas != null && !this.f19517a.isEmpty()) {
                    canvas.getClipBounds(this.f19522f);
                    while (this.f19523g <= ((float) (-m23877a(this.f19520d).getWidth()))) {
                        this.f19523g += (float) m23877a(this.f19520d).getWidth();
                        this.f19520d = (this.f19520d + 1) % this.f19519c.length;
                    }
                    float f = this.f19523g;
                    int i = 0;
                    while (f < ((float) this.f19522f.width())) {
                        Bitmap a = m23877a((this.f19520d + i) % this.f19519c.length);
                        int width = a.getWidth();
                        canvas.drawBitmap(a, m23876a((float) width, f), 0.0f, null);
                        f += (float) width;
                        i++;
                    }
                    if (this.f19524h && this.f19518b != 0.0f) {
                        this.f19523g -= Math.abs(this.f19518b);
                        jd.c(this);
                    }
                }
            }

            /* renamed from: a */
            private Bitmap m23877a(int i) {
                return (Bitmap) this.f19517a.get(this.f19519c[i]);
            }

            /* renamed from: a */
            private float m23876a(float f, float f2) {
                if (this.f19518b < 0.0f) {
                    return (((float) this.f19522f.width()) - f) - f2;
                }
                return f2;
            }

            /* renamed from: a */
            public void m23880a() {
                if (!this.f19524h) {
                    this.f19524h = true;
                    jd.c(this);
                }
            }

            public void setSpeed(float f) {
                this.f19518b = f;
                if (this.f19524h) {
                    postInvalidate();
                }
            }

            /* renamed from: b */
            private Config m23879b(int i) {
                switch (i) {
                    case 0:
                        return Config.ARGB_8888;
                    case 1:
                        return Config.RGB_565;
                    default:
                        return Config.ARGB_8888;
                }
            }

            /* renamed from: a */
            private static Bitmap m23878a(Resources resources, int i, Options options) {
                dja.m27559a(resources, i, options);
                int i2 = resources.getDisplayMetrics().heightPixels;
                int i3 = options.outHeight;
                if (i3 > i2) {
                    int round = Math.round(((float) i3) / ((float) i2));
                    options.inSampleSize = round;
                    i3 = i2;
                    i2 = round;
                } else {
                    i2 = 1;
                }
                options.inJustDecodeBounds = false;
                Bitmap decodeResource = BitmapFactory.decodeResource(resources, i, options);
                Matrix matrix = new Matrix();
                matrix.setRectToRect(new RectF(0.0f, 0.0f, (float) decodeResource.getWidth(), (float) decodeResource.getHeight()), new RectF(0.0f, 0.0f, ((float) decodeResource.getWidth()) / ((float) i2), (float) i3), ScaleToFit.CENTER);
                return Bitmap.createBitmap(decodeResource, 0, 0, decodeResource.getWidth(), decodeResource.getHeight(), matrix, false);
            }
        }
