package com.p000;

import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.VectorDrawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Stack;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p000.ay.C0882b;

/* compiled from: VectorDrawableCompat */
/* renamed from: bb */
public class bb extends ba {
    /* renamed from: a */
    static final Mode f5351a = Mode.SRC_IN;
    /* renamed from: c */
    private C0982f f5352c;
    /* renamed from: d */
    private PorterDuffColorFilter f5353d;
    /* renamed from: e */
    private ColorFilter f5354e;
    /* renamed from: f */
    private boolean f5355f;
    /* renamed from: g */
    private boolean f5356g;
    /* renamed from: h */
    private ConstantState f5357h;
    /* renamed from: i */
    private final float[] f5358i;
    /* renamed from: j */
    private final Matrix f5359j;
    /* renamed from: k */
    private final Rect f5360k;

    /* compiled from: VectorDrawableCompat */
    /* renamed from: bb$d */
    static class C0977d {
        /* renamed from: m */
        protected C0882b[] f5293m = null;
        /* renamed from: n */
        String f5294n;
        /* renamed from: o */
        int f5295o;

        public C0977d(C0977d c0977d) {
            this.f5294n = c0977d.f5294n;
            this.f5295o = c0977d.f5295o;
            this.f5293m = ay.m6470a(c0977d.f5293m);
        }

        /* renamed from: a */
        public void m7082a(Path path) {
            path.reset();
            if (this.f5293m != null) {
                C0882b.m6463a(this.f5293m, path);
            }
        }

        public String getPathName() {
            return this.f5294n;
        }

        /* renamed from: a */
        public boolean mo913a() {
            return false;
        }

        public C0882b[] getPathData() {
            return this.f5293m;
        }

        public void setPathData(C0882b[] c0882bArr) {
            if (ay.m6467a(this.f5293m, c0882bArr)) {
                ay.m6471b(this.f5293m, c0882bArr);
            } else {
                this.f5293m = ay.m6470a(c0882bArr);
            }
        }
    }

    /* compiled from: VectorDrawableCompat */
    /* renamed from: bb$a */
    static class C0978a extends C0977d {
        public C0978a(C0978a c0978a) {
            super(c0978a);
        }

        /* renamed from: a */
        public void m7085a(Resources resources, AttributeSet attributeSet, Theme theme, XmlPullParser xmlPullParser) {
            if (az.m6691a(xmlPullParser, "pathData")) {
                TypedArray a = ba.m6259a(resources, theme, attributeSet, av.f4644d);
                m7084a(a);
                a.recycle();
            }
        }

        /* renamed from: a */
        private void m7084a(TypedArray typedArray) {
            String string = typedArray.getString(0);
            if (string != null) {
                this.n = string;
            }
            string = typedArray.getString(1);
            if (string != null) {
                this.m = ay.m6469a(string);
            }
        }

        /* renamed from: a */
        public boolean mo913a() {
            return true;
        }
    }

    /* compiled from: VectorDrawableCompat */
    /* renamed from: bb$b */
    static class C0979b extends C0977d {
        /* renamed from: a */
        int f5296a = 0;
        /* renamed from: b */
        float f5297b = 0.0f;
        /* renamed from: c */
        int f5298c = 0;
        /* renamed from: d */
        float f5299d = 1.0f;
        /* renamed from: e */
        int f5300e;
        /* renamed from: f */
        float f5301f = 1.0f;
        /* renamed from: g */
        float f5302g = 0.0f;
        /* renamed from: h */
        float f5303h = 1.0f;
        /* renamed from: i */
        float f5304i = 0.0f;
        /* renamed from: j */
        Cap f5305j = Cap.BUTT;
        /* renamed from: k */
        Join f5306k = Join.MITER;
        /* renamed from: l */
        float f5307l = 4.0f;
        /* renamed from: p */
        private int[] f5308p;

        public C0979b(C0979b c0979b) {
            super(c0979b);
            this.f5308p = c0979b.f5308p;
            this.f5296a = c0979b.f5296a;
            this.f5297b = c0979b.f5297b;
            this.f5299d = c0979b.f5299d;
            this.f5298c = c0979b.f5298c;
            this.f5300e = c0979b.f5300e;
            this.f5301f = c0979b.f5301f;
            this.f5302g = c0979b.f5302g;
            this.f5303h = c0979b.f5303h;
            this.f5304i = c0979b.f5304i;
            this.f5305j = c0979b.f5305j;
            this.f5306k = c0979b.f5306k;
            this.f5307l = c0979b.f5307l;
        }

        /* renamed from: a */
        private Cap m7087a(int i, Cap cap) {
            switch (i) {
                case 0:
                    return Cap.BUTT;
                case 1:
                    return Cap.ROUND;
                case 2:
                    return Cap.SQUARE;
                default:
                    return cap;
            }
        }

        /* renamed from: a */
        private Join m7088a(int i, Join join) {
            switch (i) {
                case 0:
                    return Join.MITER;
                case 1:
                    return Join.ROUND;
                case 2:
                    return Join.BEVEL;
                default:
                    return join;
            }
        }

        /* renamed from: a */
        public void m7090a(Resources resources, AttributeSet attributeSet, Theme theme, XmlPullParser xmlPullParser) {
            TypedArray a = ba.m6259a(resources, theme, attributeSet, av.f4643c);
            m7089a(a, xmlPullParser);
            a.recycle();
        }

        /* renamed from: a */
        private void m7089a(TypedArray typedArray, XmlPullParser xmlPullParser) {
            this.f5308p = null;
            if (az.m6691a(xmlPullParser, "pathData")) {
                String string = typedArray.getString(0);
                if (string != null) {
                    this.n = string;
                }
                string = typedArray.getString(2);
                if (string != null) {
                    this.m = ay.m6469a(string);
                }
                this.f5298c = az.m6692b(typedArray, xmlPullParser, "fillColor", 1, this.f5298c);
                this.f5301f = az.m6688a(typedArray, xmlPullParser, "fillAlpha", 12, this.f5301f);
                this.f5305j = m7087a(az.m6689a(typedArray, xmlPullParser, "strokeLineCap", 8, -1), this.f5305j);
                this.f5306k = m7088a(az.m6689a(typedArray, xmlPullParser, "strokeLineJoin", 9, -1), this.f5306k);
                this.f5307l = az.m6688a(typedArray, xmlPullParser, "strokeMiterLimit", 10, this.f5307l);
                this.f5296a = az.m6692b(typedArray, xmlPullParser, "strokeColor", 3, this.f5296a);
                this.f5299d = az.m6688a(typedArray, xmlPullParser, "strokeAlpha", 11, this.f5299d);
                this.f5297b = az.m6688a(typedArray, xmlPullParser, "strokeWidth", 4, this.f5297b);
                this.f5303h = az.m6688a(typedArray, xmlPullParser, "trimPathEnd", 6, this.f5303h);
                this.f5304i = az.m6688a(typedArray, xmlPullParser, "trimPathOffset", 7, this.f5304i);
                this.f5302g = az.m6688a(typedArray, xmlPullParser, "trimPathStart", 5, this.f5302g);
            }
        }

        int getStrokeColor() {
            return this.f5296a;
        }

        void setStrokeColor(int i) {
            this.f5296a = i;
        }

        float getStrokeWidth() {
            return this.f5297b;
        }

        void setStrokeWidth(float f) {
            this.f5297b = f;
        }

        float getStrokeAlpha() {
            return this.f5299d;
        }

        void setStrokeAlpha(float f) {
            this.f5299d = f;
        }

        int getFillColor() {
            return this.f5298c;
        }

        void setFillColor(int i) {
            this.f5298c = i;
        }

        float getFillAlpha() {
            return this.f5301f;
        }

        void setFillAlpha(float f) {
            this.f5301f = f;
        }

        float getTrimPathStart() {
            return this.f5302g;
        }

        void setTrimPathStart(float f) {
            this.f5302g = f;
        }

        float getTrimPathEnd() {
            return this.f5303h;
        }

        void setTrimPathEnd(float f) {
            this.f5303h = f;
        }

        float getTrimPathOffset() {
            return this.f5304i;
        }

        void setTrimPathOffset(float f) {
            this.f5304i = f;
        }
    }

    /* compiled from: VectorDrawableCompat */
    /* renamed from: bb$c */
    static class C0980c {
        /* renamed from: a */
        final ArrayList<Object> f5309a = new ArrayList();
        /* renamed from: b */
        float f5310b = 0.0f;
        /* renamed from: c */
        int f5311c;
        /* renamed from: d */
        private final Matrix f5312d = new Matrix();
        /* renamed from: e */
        private float f5313e = 0.0f;
        /* renamed from: f */
        private float f5314f = 0.0f;
        /* renamed from: g */
        private float f5315g = 1.0f;
        /* renamed from: h */
        private float f5316h = 1.0f;
        /* renamed from: i */
        private float f5317i = 0.0f;
        /* renamed from: j */
        private float f5318j = 0.0f;
        /* renamed from: k */
        private final Matrix f5319k = new Matrix();
        /* renamed from: l */
        private int[] f5320l;
        /* renamed from: m */
        private String f5321m = null;

        public C0980c(C0980c c0980c, hh<String, Object> hhVar) {
            this.f5310b = c0980c.f5310b;
            this.f5313e = c0980c.f5313e;
            this.f5314f = c0980c.f5314f;
            this.f5315g = c0980c.f5315g;
            this.f5316h = c0980c.f5316h;
            this.f5317i = c0980c.f5317i;
            this.f5318j = c0980c.f5318j;
            this.f5320l = c0980c.f5320l;
            this.f5321m = c0980c.f5321m;
            this.f5311c = c0980c.f5311c;
            if (this.f5321m != null) {
                hhVar.put(this.f5321m, this);
            }
            this.f5319k.set(c0980c.f5319k);
            ArrayList arrayList = c0980c.f5309a;
            for (int i = 0; i < arrayList.size(); i++) {
                Object obj = arrayList.get(i);
                if (obj instanceof C0980c) {
                    this.f5309a.add(new C0980c((C0980c) obj, hhVar));
                } else {
                    C0977d c0979b;
                    if (obj instanceof C0979b) {
                        c0979b = new C0979b((C0979b) obj);
                    } else if (obj instanceof C0978a) {
                        c0979b = new C0978a((C0978a) obj);
                    } else {
                        throw new IllegalStateException("Unknown object in the tree!");
                    }
                    this.f5309a.add(c0979b);
                    if (c0979b.f5294n != null) {
                        hhVar.put(c0979b.f5294n, c0979b);
                    }
                }
            }
        }

        public String getGroupName() {
            return this.f5321m;
        }

        public Matrix getLocalMatrix() {
            return this.f5319k;
        }

        /* renamed from: a */
        public void m7095a(Resources resources, AttributeSet attributeSet, Theme theme, XmlPullParser xmlPullParser) {
            TypedArray a = ba.m6259a(resources, theme, attributeSet, av.f4642b);
            m7093a(a, xmlPullParser);
            a.recycle();
        }

        /* renamed from: a */
        private void m7093a(TypedArray typedArray, XmlPullParser xmlPullParser) {
            this.f5320l = null;
            this.f5310b = az.m6688a(typedArray, xmlPullParser, "rotation", 5, this.f5310b);
            this.f5313e = typedArray.getFloat(1, this.f5313e);
            this.f5314f = typedArray.getFloat(2, this.f5314f);
            this.f5315g = az.m6688a(typedArray, xmlPullParser, "scaleX", 3, this.f5315g);
            this.f5316h = az.m6688a(typedArray, xmlPullParser, "scaleY", 4, this.f5316h);
            this.f5317i = az.m6688a(typedArray, xmlPullParser, "translateX", 6, this.f5317i);
            this.f5318j = az.m6688a(typedArray, xmlPullParser, "translateY", 7, this.f5318j);
            String string = typedArray.getString(0);
            if (string != null) {
                this.f5321m = string;
            }
            m7092a();
        }

        /* renamed from: a */
        private void m7092a() {
            this.f5319k.reset();
            this.f5319k.postTranslate(-this.f5313e, -this.f5314f);
            this.f5319k.postScale(this.f5315g, this.f5316h);
            this.f5319k.postRotate(this.f5310b, 0.0f, 0.0f);
            this.f5319k.postTranslate(this.f5317i + this.f5313e, this.f5318j + this.f5314f);
        }

        public float getRotation() {
            return this.f5310b;
        }

        public void setRotation(float f) {
            if (f != this.f5310b) {
                this.f5310b = f;
                m7092a();
            }
        }

        public float getPivotX() {
            return this.f5313e;
        }

        public void setPivotX(float f) {
            if (f != this.f5313e) {
                this.f5313e = f;
                m7092a();
            }
        }

        public float getPivotY() {
            return this.f5314f;
        }

        public void setPivotY(float f) {
            if (f != this.f5314f) {
                this.f5314f = f;
                m7092a();
            }
        }

        public float getScaleX() {
            return this.f5315g;
        }

        public void setScaleX(float f) {
            if (f != this.f5315g) {
                this.f5315g = f;
                m7092a();
            }
        }

        public float getScaleY() {
            return this.f5316h;
        }

        public void setScaleY(float f) {
            if (f != this.f5316h) {
                this.f5316h = f;
                m7092a();
            }
        }

        public float getTranslateX() {
            return this.f5317i;
        }

        public void setTranslateX(float f) {
            if (f != this.f5317i) {
                this.f5317i = f;
                m7092a();
            }
        }

        public float getTranslateY() {
            return this.f5318j;
        }

        public void setTranslateY(float f) {
            if (f != this.f5318j) {
                this.f5318j = f;
                m7092a();
            }
        }
    }

    /* compiled from: VectorDrawableCompat */
    /* renamed from: bb$e */
    static class C0981e {
        /* renamed from: k */
        private static final Matrix f5322k = new Matrix();
        /* renamed from: a */
        final C0980c f5323a;
        /* renamed from: b */
        float f5324b;
        /* renamed from: c */
        float f5325c;
        /* renamed from: d */
        float f5326d;
        /* renamed from: e */
        float f5327e;
        /* renamed from: f */
        int f5328f;
        /* renamed from: g */
        String f5329g;
        /* renamed from: h */
        final hh<String, Object> f5330h;
        /* renamed from: i */
        private final Path f5331i;
        /* renamed from: j */
        private final Path f5332j;
        /* renamed from: l */
        private final Matrix f5333l;
        /* renamed from: m */
        private Paint f5334m;
        /* renamed from: n */
        private Paint f5335n;
        /* renamed from: o */
        private PathMeasure f5336o;
        /* renamed from: p */
        private int f5337p;

        public C0981e() {
            this.f5333l = new Matrix();
            this.f5324b = 0.0f;
            this.f5325c = 0.0f;
            this.f5326d = 0.0f;
            this.f5327e = 0.0f;
            this.f5328f = 255;
            this.f5329g = null;
            this.f5330h = new hh();
            this.f5323a = new C0980c();
            this.f5331i = new Path();
            this.f5332j = new Path();
        }

        public void setRootAlpha(int i) {
            this.f5328f = i;
        }

        public int getRootAlpha() {
            return this.f5328f;
        }

        public void setAlpha(float f) {
            setRootAlpha((int) (255.0f * f));
        }

        public float getAlpha() {
            return ((float) getRootAlpha()) / 255.0f;
        }

        public C0981e(C0981e c0981e) {
            this.f5333l = new Matrix();
            this.f5324b = 0.0f;
            this.f5325c = 0.0f;
            this.f5326d = 0.0f;
            this.f5327e = 0.0f;
            this.f5328f = 255;
            this.f5329g = null;
            this.f5330h = new hh();
            this.f5323a = new C0980c(c0981e.f5323a, this.f5330h);
            this.f5331i = new Path(c0981e.f5331i);
            this.f5332j = new Path(c0981e.f5332j);
            this.f5324b = c0981e.f5324b;
            this.f5325c = c0981e.f5325c;
            this.f5326d = c0981e.f5326d;
            this.f5327e = c0981e.f5327e;
            this.f5337p = c0981e.f5337p;
            this.f5328f = c0981e.f5328f;
            this.f5329g = c0981e.f5329g;
            if (c0981e.f5329g != null) {
                this.f5330h.put(c0981e.f5329g, this);
            }
        }

        /* renamed from: a */
        private void m7100a(C0980c c0980c, Matrix matrix, Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            c0980c.f5312d.set(matrix);
            c0980c.f5312d.preConcat(c0980c.f5319k);
            canvas.save();
            for (int i3 = 0; i3 < c0980c.f5309a.size(); i3++) {
                Object obj = c0980c.f5309a.get(i3);
                if (obj instanceof C0980c) {
                    m7100a((C0980c) obj, c0980c.f5312d, canvas, i, i2, colorFilter);
                } else if (obj instanceof C0977d) {
                    m7101a(c0980c, (C0977d) obj, canvas, i, i2, colorFilter);
                }
            }
            canvas.restore();
        }

        /* renamed from: a */
        public void m7104a(Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            m7100a(this.f5323a, f5322k, canvas, i, i2, colorFilter);
        }

        /* renamed from: a */
        private void m7101a(C0980c c0980c, C0977d c0977d, Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            float f = ((float) i) / this.f5326d;
            float f2 = ((float) i2) / this.f5327e;
            float min = Math.min(f, f2);
            Matrix a = c0980c.f5312d;
            this.f5333l.set(a);
            this.f5333l.postScale(f, f2);
            f = m7097a(a);
            if (f != 0.0f) {
                c0977d.m7082a(this.f5331i);
                Path path = this.f5331i;
                this.f5332j.reset();
                if (c0977d.mo913a()) {
                    this.f5332j.addPath(path, this.f5333l);
                    canvas.clipPath(this.f5332j);
                    return;
                }
                Paint paint;
                C0979b c0979b = (C0979b) c0977d;
                if (!(c0979b.f5302g == 0.0f && c0979b.f5303h == 1.0f)) {
                    float f3 = (c0979b.f5302g + c0979b.f5304i) % 1.0f;
                    float f4 = (c0979b.f5303h + c0979b.f5304i) % 1.0f;
                    if (this.f5336o == null) {
                        this.f5336o = new PathMeasure();
                    }
                    this.f5336o.setPath(this.f5331i, false);
                    float length = this.f5336o.getLength();
                    f3 *= length;
                    f4 *= length;
                    path.reset();
                    if (f3 > f4) {
                        this.f5336o.getSegment(f3, length, path, true);
                        this.f5336o.getSegment(0.0f, f4, path, true);
                    } else {
                        this.f5336o.getSegment(f3, f4, path, true);
                    }
                    path.rLineTo(0.0f, 0.0f);
                }
                this.f5332j.addPath(path, this.f5333l);
                if (c0979b.f5298c != 0) {
                    if (this.f5335n == null) {
                        this.f5335n = new Paint();
                        this.f5335n.setStyle(Style.FILL);
                        this.f5335n.setAntiAlias(true);
                    }
                    paint = this.f5335n;
                    paint.setColor(bb.m7113a(c0979b.f5298c, c0979b.f5301f));
                    paint.setColorFilter(colorFilter);
                    canvas.drawPath(this.f5332j, paint);
                }
                if (c0979b.f5296a != 0) {
                    if (this.f5334m == null) {
                        this.f5334m = new Paint();
                        this.f5334m.setStyle(Style.STROKE);
                        this.f5334m.setAntiAlias(true);
                    }
                    paint = this.f5334m;
                    if (c0979b.f5306k != null) {
                        paint.setStrokeJoin(c0979b.f5306k);
                    }
                    if (c0979b.f5305j != null) {
                        paint.setStrokeCap(c0979b.f5305j);
                    }
                    paint.setStrokeMiter(c0979b.f5307l);
                    paint.setColor(bb.m7113a(c0979b.f5296a, c0979b.f5299d));
                    paint.setColorFilter(colorFilter);
                    paint.setStrokeWidth((f * min) * c0979b.f5297b);
                    canvas.drawPath(this.f5332j, paint);
                }
            }
        }

        /* renamed from: a */
        private static float m7096a(float f, float f2, float f3, float f4) {
            return (f * f4) - (f2 * f3);
        }

        /* renamed from: a */
        private float m7097a(Matrix matrix) {
            float[] fArr = new float[]{0.0f, 1.0f, 1.0f, 0.0f};
            matrix.mapVectors(fArr);
            float hypot = (float) Math.hypot((double) fArr[0], (double) fArr[1]);
            float hypot2 = (float) Math.hypot((double) fArr[2], (double) fArr[3]);
            float a = C0981e.m7096a(fArr[0], fArr[1], fArr[2], fArr[3]);
            hypot = Math.max(hypot, hypot2);
            if (hypot > 0.0f) {
                return Math.abs(a) / hypot;
            }
            return 0.0f;
        }
    }

    /* compiled from: VectorDrawableCompat */
    /* renamed from: bb$f */
    static class C0982f extends ConstantState {
        /* renamed from: a */
        int f5338a;
        /* renamed from: b */
        C0981e f5339b;
        /* renamed from: c */
        ColorStateList f5340c;
        /* renamed from: d */
        Mode f5341d;
        /* renamed from: e */
        boolean f5342e;
        /* renamed from: f */
        Bitmap f5343f;
        /* renamed from: g */
        ColorStateList f5344g;
        /* renamed from: h */
        Mode f5345h;
        /* renamed from: i */
        int f5346i;
        /* renamed from: j */
        boolean f5347j;
        /* renamed from: k */
        boolean f5348k;
        /* renamed from: l */
        Paint f5349l;

        public C0982f(C0982f c0982f) {
            this.f5340c = null;
            this.f5341d = bb.f5351a;
            if (c0982f != null) {
                this.f5338a = c0982f.f5338a;
                this.f5339b = new C0981e(c0982f.f5339b);
                if (c0982f.f5339b.f5335n != null) {
                    this.f5339b.f5335n = new Paint(c0982f.f5339b.f5335n);
                }
                if (c0982f.f5339b.f5334m != null) {
                    this.f5339b.f5334m = new Paint(c0982f.f5339b.f5334m);
                }
                this.f5340c = c0982f.f5340c;
                this.f5341d = c0982f.f5341d;
                this.f5342e = c0982f.f5342e;
            }
        }

        /* renamed from: a */
        public void m7107a(Canvas canvas, ColorFilter colorFilter, Rect rect) {
            canvas.drawBitmap(this.f5343f, null, rect, m7105a(colorFilter));
        }

        /* renamed from: a */
        public boolean m7108a() {
            return this.f5339b.getRootAlpha() < 255;
        }

        /* renamed from: a */
        public Paint m7105a(ColorFilter colorFilter) {
            if (!m7108a() && colorFilter == null) {
                return null;
            }
            if (this.f5349l == null) {
                this.f5349l = new Paint();
                this.f5349l.setFilterBitmap(true);
            }
            this.f5349l.setAlpha(this.f5339b.getRootAlpha());
            this.f5349l.setColorFilter(colorFilter);
            return this.f5349l;
        }

        /* renamed from: a */
        public void m7106a(int i, int i2) {
            this.f5343f.eraseColor(0);
            this.f5339b.m7104a(new Canvas(this.f5343f), i, i2, null);
        }

        /* renamed from: b */
        public void m7109b(int i, int i2) {
            if (this.f5343f == null || !m7112c(i, i2)) {
                this.f5343f = Bitmap.createBitmap(i, i2, Config.ARGB_8888);
                this.f5348k = true;
            }
        }

        /* renamed from: c */
        public boolean m7112c(int i, int i2) {
            if (i == this.f5343f.getWidth() && i2 == this.f5343f.getHeight()) {
                return true;
            }
            return false;
        }

        /* renamed from: b */
        public boolean m7110b() {
            if (!this.f5348k && this.f5344g == this.f5340c && this.f5345h == this.f5341d && this.f5347j == this.f5342e && this.f5346i == this.f5339b.getRootAlpha()) {
                return true;
            }
            return false;
        }

        /* renamed from: c */
        public void m7111c() {
            this.f5344g = this.f5340c;
            this.f5345h = this.f5341d;
            this.f5346i = this.f5339b.getRootAlpha();
            this.f5347j = this.f5342e;
            this.f5348k = false;
        }

        public C0982f() {
            this.f5340c = null;
            this.f5341d = bb.f5351a;
            this.f5339b = new C0981e();
        }

        public Drawable newDrawable() {
            return new bb(this);
        }

        public Drawable newDrawable(Resources resources) {
            return new bb(this);
        }

        public int getChangingConfigurations() {
            return this.f5338a;
        }
    }

    /* compiled from: VectorDrawableCompat */
    /* renamed from: bb$g */
    static class C0983g extends ConstantState {
        /* renamed from: a */
        private final ConstantState f5350a;

        public C0983g(ConstantState constantState) {
            this.f5350a = constantState;
        }

        public Drawable newDrawable() {
            Drawable bbVar = new bb();
            bbVar.b = (VectorDrawable) this.f5350a.newDrawable();
            return bbVar;
        }

        public Drawable newDrawable(Resources resources) {
            Drawable bbVar = new bb();
            bbVar.b = (VectorDrawable) this.f5350a.newDrawable(resources);
            return bbVar;
        }

        public Drawable newDrawable(Resources resources, Theme theme) {
            Drawable bbVar = new bb();
            bbVar.b = (VectorDrawable) this.f5350a.newDrawable(resources, theme);
            return bbVar;
        }

        public boolean canApplyTheme() {
            return this.f5350a.canApplyTheme();
        }

        public int getChangingConfigurations() {
            return this.f5350a.getChangingConfigurations();
        }
    }

    public /* bridge */ /* synthetic */ void applyTheme(Theme theme) {
        super.applyTheme(theme);
    }

    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    public /* bridge */ /* synthetic */ ColorFilter getColorFilter() {
        return super.getColorFilter();
    }

    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i) {
        super.setChangingConfigurations(i);
    }

    public /* bridge */ /* synthetic */ void setColorFilter(int i, Mode mode) {
        super.setColorFilter(i, mode);
    }

    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z) {
        super.setFilterBitmap(z);
    }

    public /* bridge */ /* synthetic */ void setHotspot(float f, float f2) {
        super.setHotspot(f, f2);
    }

    public /* bridge */ /* synthetic */ void setHotspotBounds(int i, int i2, int i3, int i4) {
        super.setHotspotBounds(i, i2, i3, i4);
    }

    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    bb() {
        this.f5356g = true;
        this.f5358i = new float[9];
        this.f5359j = new Matrix();
        this.f5360k = new Rect();
        this.f5352c = new C0982f();
    }

    bb(C0982f c0982f) {
        this.f5356g = true;
        this.f5358i = new float[9];
        this.f5359j = new Matrix();
        this.f5360k = new Rect();
        this.f5352c = c0982f;
        this.f5353d = m7120a(this.f5353d, c0982f.f5340c, c0982f.f5341d);
    }

    public Drawable mutate() {
        if (this.b != null) {
            this.b.mutate();
        } else if (!this.f5355f && super.mutate() == this) {
            this.f5352c = new C0982f(this.f5352c);
            this.f5355f = true;
        }
        return this;
    }

    /* renamed from: a */
    Object m7121a(String str) {
        return this.f5352c.f5339b.f5330h.get(str);
    }

    public ConstantState getConstantState() {
        if (this.b != null) {
            return new C0983g(this.b.getConstantState());
        }
        this.f5352c.f5338a = getChangingConfigurations();
        return this.f5352c;
    }

    public void draw(Canvas canvas) {
        if (this.b != null) {
            this.b.draw(canvas);
            return;
        }
        copyBounds(this.f5360k);
        if (this.f5360k.width() > 0 && this.f5360k.height() > 0) {
            ColorFilter colorFilter = this.f5354e == null ? this.f5353d : this.f5354e;
            canvas.getMatrix(this.f5359j);
            this.f5359j.getValues(this.f5358i);
            float abs = Math.abs(this.f5358i[0]);
            float abs2 = Math.abs(this.f5358i[4]);
            float abs3 = Math.abs(this.f5358i[1]);
            float abs4 = Math.abs(this.f5358i[3]);
            if (!(abs3 == 0.0f && abs4 == 0.0f)) {
                abs2 = 1.0f;
                abs = 1.0f;
            }
            int height = (int) (abs2 * ((float) this.f5360k.height()));
            int min = Math.min(2048, (int) (abs * ((float) this.f5360k.width())));
            height = Math.min(2048, height);
            if (min > 0 && height > 0) {
                int save = canvas.save();
                canvas.translate((float) this.f5360k.left, (float) this.f5360k.top);
                if (m7118a()) {
                    canvas.translate((float) this.f5360k.width(), 0.0f);
                    canvas.scale(-1.0f, 1.0f);
                }
                this.f5360k.offsetTo(0, 0);
                this.f5352c.m7109b(min, height);
                if (!this.f5356g) {
                    this.f5352c.m7106a(min, height);
                } else if (!this.f5352c.m7110b()) {
                    this.f5352c.m7106a(min, height);
                    this.f5352c.m7111c();
                }
                this.f5352c.m7107a(canvas, colorFilter, this.f5360k);
                canvas.restoreToCount(save);
            }
        }
    }

    public int getAlpha() {
        if (this.b != null) {
            return fp.m21155c(this.b);
        }
        return this.f5352c.f5339b.getRootAlpha();
    }

    public void setAlpha(int i) {
        if (this.b != null) {
            this.b.setAlpha(i);
        } else if (this.f5352c.f5339b.getRootAlpha() != i) {
            this.f5352c.f5339b.setRootAlpha(i);
            invalidateSelf();
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        if (this.b != null) {
            this.b.setColorFilter(colorFilter);
            return;
        }
        this.f5354e = colorFilter;
        invalidateSelf();
    }

    /* renamed from: a */
    PorterDuffColorFilter m7120a(PorterDuffColorFilter porterDuffColorFilter, ColorStateList colorStateList, Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @SuppressLint({"NewApi"})
    public void setTint(int i) {
        if (this.b != null) {
            fp.m21146a(this.b, i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        if (this.b != null) {
            fp.m21148a(this.b, colorStateList);
            return;
        }
        C0982f c0982f = this.f5352c;
        if (c0982f.f5340c != colorStateList) {
            c0982f.f5340c = colorStateList;
            this.f5353d = m7120a(this.f5353d, colorStateList, c0982f.f5341d);
            invalidateSelf();
        }
    }

    public void setTintMode(Mode mode) {
        if (this.b != null) {
            fp.m21151a(this.b, mode);
            return;
        }
        C0982f c0982f = this.f5352c;
        if (c0982f.f5341d != mode) {
            c0982f.f5341d = mode;
            this.f5353d = m7120a(this.f5353d, c0982f.f5340c, mode);
            invalidateSelf();
        }
    }

    public boolean isStateful() {
        if (this.b != null) {
            return this.b.isStateful();
        }
        return super.isStateful() || !(this.f5352c == null || this.f5352c.f5340c == null || !this.f5352c.f5340c.isStateful());
    }

    protected boolean onStateChange(int[] iArr) {
        if (this.b != null) {
            return this.b.setState(iArr);
        }
        C0982f c0982f = this.f5352c;
        if (c0982f.f5340c == null || c0982f.f5341d == null) {
            return false;
        }
        this.f5353d = m7120a(this.f5353d, c0982f.f5340c, c0982f.f5341d);
        invalidateSelf();
        return true;
    }

    public int getOpacity() {
        if (this.b != null) {
            return this.b.getOpacity();
        }
        return -3;
    }

    public int getIntrinsicWidth() {
        if (this.b != null) {
            return this.b.getIntrinsicWidth();
        }
        return (int) this.f5352c.f5339b.f5324b;
    }

    public int getIntrinsicHeight() {
        if (this.b != null) {
            return this.b.getIntrinsicHeight();
        }
        return (int) this.f5352c.f5339b.f5325c;
    }

    public boolean canApplyTheme() {
        if (this.b != null) {
            fp.m21156d(this.b);
        }
        return false;
    }

    public boolean isAutoMirrored() {
        if (this.b != null) {
            return fp.m21153b(this.b);
        }
        return this.f5352c.f5342e;
    }

    public void setAutoMirrored(boolean z) {
        if (this.b != null) {
            fp.m21152a(this.b, z);
        } else {
            this.f5352c.f5342e = z;
        }
    }

    @SuppressLint({"NewApi"})
    /* renamed from: a */
    public static bb m7115a(Resources resources, int i, Theme theme) {
        if (VERSION.SDK_INT >= 24) {
            bb bbVar = new bb();
            bbVar.b = fm.a(resources, i, theme);
            bbVar.f5357h = new C0983g(bbVar.b.getConstantState());
            return bbVar;
        }
        try {
            int next;
            XmlPullParser xml = resources.getXml(i);
            AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
            do {
                next = xml.next();
                if (next == 2) {
                    break;
                }
            } while (next != 1);
            if (next == 2) {
                return bb.m7116a(resources, xml, asAttributeSet, theme);
            }
            throw new XmlPullParserException("No start tag found");
        } catch (Throwable e) {
            Log.e("VectorDrawableCompat", "parser error", e);
            return null;
        } catch (Throwable e2) {
            Log.e("VectorDrawableCompat", "parser error", e2);
            return null;
        }
    }

    @SuppressLint({"NewApi"})
    /* renamed from: a */
    public static bb m7116a(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) throws XmlPullParserException, IOException {
        bb bbVar = new bb();
        bbVar.inflate(resources, xmlPullParser, attributeSet, theme);
        return bbVar;
    }

    /* renamed from: a */
    static int m7113a(int i, float f) {
        return (((int) (((float) Color.alpha(i)) * f)) << 24) | (16777215 & i);
    }

    @SuppressLint({"NewApi"})
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        if (this.b != null) {
            this.b.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) throws XmlPullParserException, IOException {
        if (this.b != null) {
            fp.m21150a(this.b, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        C0982f c0982f = this.f5352c;
        c0982f.f5339b = new C0981e();
        TypedArray a = ba.m6259a(resources, theme, attributeSet, av.f4641a);
        m7117a(a, xmlPullParser);
        a.recycle();
        c0982f.f5338a = getChangingConfigurations();
        c0982f.f5348k = true;
        m7119b(resources, xmlPullParser, attributeSet, theme);
        this.f5353d = m7120a(this.f5353d, c0982f.f5340c, c0982f.f5341d);
    }

    /* renamed from: a */
    private static Mode m7114a(int i, Mode mode) {
        switch (i) {
            case 3:
                return Mode.SRC_OVER;
            case 5:
                return Mode.SRC_IN;
            case 9:
                return Mode.SRC_ATOP;
            case 14:
                return Mode.MULTIPLY;
            case 15:
                return Mode.SCREEN;
            case 16:
                if (VERSION.SDK_INT >= 11) {
                    return Mode.ADD;
                }
                return mode;
            default:
                return mode;
        }
    }

    /* renamed from: a */
    private void m7117a(TypedArray typedArray, XmlPullParser xmlPullParser) throws XmlPullParserException {
        C0982f c0982f = this.f5352c;
        C0981e c0981e = c0982f.f5339b;
        c0982f.f5341d = bb.m7114a(az.m6689a(typedArray, xmlPullParser, "tintMode", 6, -1), Mode.SRC_IN);
        ColorStateList colorStateList = typedArray.getColorStateList(1);
        if (colorStateList != null) {
            c0982f.f5340c = colorStateList;
        }
        c0982f.f5342e = az.m6690a(typedArray, xmlPullParser, "autoMirrored", 5, c0982f.f5342e);
        c0981e.f5326d = az.m6688a(typedArray, xmlPullParser, "viewportWidth", 7, c0981e.f5326d);
        c0981e.f5327e = az.m6688a(typedArray, xmlPullParser, "viewportHeight", 8, c0981e.f5327e);
        if (c0981e.f5326d <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        } else if (c0981e.f5327e <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        } else {
            c0981e.f5324b = typedArray.getDimension(3, c0981e.f5324b);
            c0981e.f5325c = typedArray.getDimension(2, c0981e.f5325c);
            if (c0981e.f5324b <= 0.0f) {
                throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires width > 0");
            } else if (c0981e.f5325c <= 0.0f) {
                throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires height > 0");
            } else {
                c0981e.setAlpha(az.m6688a(typedArray, xmlPullParser, "alpha", 4, c0981e.getAlpha()));
                String string = typedArray.getString(0);
                if (string != null) {
                    c0981e.f5329g = string;
                    c0981e.f5330h.put(string, c0981e);
                }
            }
        }
    }

    /* renamed from: b */
    private void m7119b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) throws XmlPullParserException, IOException {
        C0982f c0982f = this.f5352c;
        C0981e c0981e = c0982f.f5339b;
        Stack stack = new Stack();
        stack.push(c0981e.f5323a);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        Object obj = 1;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                Object obj2;
                String name = xmlPullParser.getName();
                C0980c c0980c = (C0980c) stack.peek();
                if ("path".equals(name)) {
                    C0979b c0979b = new C0979b();
                    c0979b.m7090a(resources, attributeSet, theme, xmlPullParser);
                    c0980c.f5309a.add(c0979b);
                    if (c0979b.getPathName() != null) {
                        c0981e.f5330h.put(c0979b.getPathName(), c0979b);
                    }
                    obj2 = null;
                    c0982f.f5338a = c0979b.o | c0982f.f5338a;
                } else if ("clip-path".equals(name)) {
                    C0978a c0978a = new C0978a();
                    c0978a.m7085a(resources, attributeSet, theme, xmlPullParser);
                    c0980c.f5309a.add(c0978a);
                    if (c0978a.getPathName() != null) {
                        c0981e.f5330h.put(c0978a.getPathName(), c0978a);
                    }
                    c0982f.f5338a |= c0978a.o;
                    obj2 = obj;
                } else {
                    if ("group".equals(name)) {
                        C0980c c0980c2 = new C0980c();
                        c0980c2.m7095a(resources, attributeSet, theme, xmlPullParser);
                        c0980c.f5309a.add(c0980c2);
                        stack.push(c0980c2);
                        if (c0980c2.getGroupName() != null) {
                            c0981e.f5330h.put(c0980c2.getGroupName(), c0980c2);
                        }
                        c0982f.f5338a |= c0980c2.f5311c;
                    }
                    obj2 = obj;
                }
                obj = obj2;
            } else if (eventType == 3) {
                if ("group".equals(xmlPullParser.getName())) {
                    stack.pop();
                }
            }
            eventType = xmlPullParser.next();
        }
        if (obj != null) {
            StringBuffer stringBuffer = new StringBuffer();
            if (stringBuffer.length() > 0) {
                stringBuffer.append(" or ");
            }
            stringBuffer.append("path");
            throw new XmlPullParserException("no " + stringBuffer + " defined");
        }
    }

    /* renamed from: a */
    void m7122a(boolean z) {
        this.f5356g = z;
    }

    @SuppressLint({"NewApi"})
    /* renamed from: a */
    private boolean m7118a() {
        boolean z = true;
        if (VERSION.SDK_INT < 17) {
            return false;
        }
        if (!(isAutoMirrored() && getLayoutDirection() == 1)) {
            z = false;
        }
        return z;
    }

    protected void onBoundsChange(Rect rect) {
        if (this.b != null) {
            this.b.setBounds(rect);
        }
    }

    public int getChangingConfigurations() {
        if (this.b != null) {
            return this.b.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.f5352c.getChangingConfigurations();
    }

    public void invalidateSelf() {
        if (this.b != null) {
            this.b.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    public void scheduleSelf(Runnable runnable, long j) {
        if (this.b != null) {
            this.b.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        if (this.b != null) {
            return this.b.setVisible(z, z2);
        }
        return super.setVisible(z, z2);
    }

    public void unscheduleSelf(Runnable runnable) {
        if (this.b != null) {
            this.b.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }
}
