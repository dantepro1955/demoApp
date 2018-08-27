package com.p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import android.text.Layout.Alignment;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;

/* compiled from: CuePainter */
/* renamed from: agi */
public final class agi {
    /* renamed from: A */
    private int f1339A;
    /* renamed from: B */
    private int f1340B;
    /* renamed from: C */
    private int f1341C;
    /* renamed from: D */
    private StaticLayout f1342D;
    /* renamed from: E */
    private int f1343E;
    /* renamed from: F */
    private int f1344F;
    /* renamed from: G */
    private int f1345G;
    /* renamed from: a */
    private final RectF f1346a = new RectF();
    /* renamed from: b */
    private final float f1347b;
    /* renamed from: c */
    private final float f1348c;
    /* renamed from: d */
    private final float f1349d;
    /* renamed from: e */
    private final float f1350e;
    /* renamed from: f */
    private final float f1351f;
    /* renamed from: g */
    private final float f1352g;
    /* renamed from: h */
    private final TextPaint f1353h;
    /* renamed from: i */
    private final Paint f1354i;
    /* renamed from: j */
    private CharSequence f1355j;
    /* renamed from: k */
    private Alignment f1356k;
    /* renamed from: l */
    private float f1357l;
    /* renamed from: m */
    private int f1358m;
    /* renamed from: n */
    private int f1359n;
    /* renamed from: o */
    private float f1360o;
    /* renamed from: p */
    private int f1361p;
    /* renamed from: q */
    private float f1362q;
    /* renamed from: r */
    private boolean f1363r;
    /* renamed from: s */
    private int f1364s;
    /* renamed from: t */
    private int f1365t;
    /* renamed from: u */
    private int f1366u;
    /* renamed from: v */
    private int f1367v;
    /* renamed from: w */
    private int f1368w;
    /* renamed from: x */
    private float f1369x;
    /* renamed from: y */
    private float f1370y;
    /* renamed from: z */
    private int f1371z;

    public agi(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, new int[]{16843287, 16843288}, 0, 0);
        this.f1352g = (float) obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f1351f = obtainStyledAttributes.getFloat(1, 1.0f);
        obtainStyledAttributes.recycle();
        int round = Math.round((((float) context.getResources().getDisplayMetrics().densityDpi) * 2.0f) / 160.0f);
        this.f1347b = (float) round;
        this.f1348c = (float) round;
        this.f1349d = (float) round;
        this.f1350e = (float) round;
        this.f1353h = new TextPaint();
        this.f1353h.setAntiAlias(true);
        this.f1353h.setSubpixelText(true);
        this.f1354i = new Paint();
        this.f1354i.setAntiAlias(true);
        this.f1354i.setStyle(Style.FILL);
    }

    /* renamed from: a */
    public void m1456a(agh agh, boolean z, agg agg, float f, float f2, Canvas canvas, int i, int i2, int i3, int i4) {
        CharSequence charSequence = agh.f1331a;
        if (!TextUtils.isEmpty(charSequence)) {
            if (!z) {
                charSequence = charSequence.toString();
            }
            if (agi.m1455a(this.f1355j, charSequence) && ahr.m1601a(this.f1356k, agh.f1332b) && this.f1357l == agh.f1333c && this.f1358m == agh.f1334d && ahr.m1601a(Integer.valueOf(this.f1359n), Integer.valueOf(agh.f1335e)) && this.f1360o == agh.f1336f && ahr.m1601a(Integer.valueOf(this.f1361p), Integer.valueOf(agh.f1337g)) && this.f1362q == agh.f1338h && this.f1363r == z && this.f1364s == agg.f1325b && this.f1365t == agg.f1326c && this.f1366u == agg.f1327d && this.f1368w == agg.f1328e && this.f1367v == agg.f1329f && ahr.m1601a(this.f1353h.getTypeface(), agg.f1330g) && this.f1369x == f && this.f1370y == f2 && this.f1371z == i && this.f1339A == i2 && this.f1340B == i3 && this.f1341C == i4) {
                m1454a(canvas);
                return;
            }
            this.f1355j = charSequence;
            this.f1356k = agh.f1332b;
            this.f1357l = agh.f1333c;
            this.f1358m = agh.f1334d;
            this.f1359n = agh.f1335e;
            this.f1360o = agh.f1336f;
            this.f1361p = agh.f1337g;
            this.f1362q = agh.f1338h;
            this.f1363r = z;
            this.f1364s = agg.f1325b;
            this.f1365t = agg.f1326c;
            this.f1366u = agg.f1327d;
            this.f1368w = agg.f1328e;
            this.f1367v = agg.f1329f;
            this.f1353h.setTypeface(agg.f1330g);
            this.f1369x = f;
            this.f1370y = f2;
            this.f1371z = i;
            this.f1339A = i2;
            this.f1340B = i3;
            this.f1341C = i4;
            int i5 = this.f1340B - this.f1371z;
            int i6 = this.f1341C - this.f1339A;
            this.f1353h.setTextSize(f);
            int i7 = (int) ((0.125f * f) + 0.5f);
            int i8 = i5 - (i7 * 2);
            if (this.f1362q != Float.MIN_VALUE) {
                i8 = (int) (((float) i8) * this.f1362q);
            }
            if (i8 <= 0) {
                Log.w("CuePainter", "Skipped drawing subtitle cue (insufficient space)");
                return;
            }
            int i9;
            Alignment alignment = this.f1356k == null ? Alignment.ALIGN_CENTER : this.f1356k;
            this.f1342D = new StaticLayout(charSequence, this.f1353h, i8, alignment, this.f1351f, this.f1352g, true);
            i8 = this.f1342D.getHeight();
            int i10 = 0;
            int lineCount = this.f1342D.getLineCount();
            for (i9 = 0; i9 < lineCount; i9++) {
                i10 = Math.max((int) Math.ceil((double) this.f1342D.getLineWidth(i9)), i10);
            }
            lineCount = i10 + (i7 * 2);
            if (this.f1360o != Float.MIN_VALUE) {
                i9 = Math.round(((float) i5) * this.f1360o) + this.f1371z;
                if (this.f1361p == 2) {
                    i9 -= lineCount;
                } else if (this.f1361p == 1) {
                    i9 = ((i9 * 2) - lineCount) / 2;
                }
                i10 = Math.max(i9, this.f1371z);
                i9 = Math.min(i10 + lineCount, this.f1340B);
                i5 = i10;
            } else {
                i10 = (i5 - lineCount) / 2;
                i9 = i10 + lineCount;
                i5 = i10;
            }
            if (this.f1357l != Float.MIN_VALUE) {
                if (this.f1358m == 0) {
                    i10 = Math.round(((float) i6) * this.f1357l) + this.f1339A;
                } else {
                    i10 = this.f1342D.getLineBottom(0) - this.f1342D.getLineTop(0);
                    if (this.f1357l >= 0.0f) {
                        i10 = Math.round(((float) i10) * this.f1357l) + this.f1339A;
                    } else {
                        i10 = Math.round(((float) i10) * this.f1357l) + this.f1341C;
                    }
                }
                if (this.f1359n == 2) {
                    i10 -= i8;
                } else if (this.f1359n == 1) {
                    i10 = ((i10 * 2) - i8) / 2;
                }
                if (i10 + i8 > this.f1341C) {
                    i10 = this.f1341C - i8;
                    i8 = this.f1341C;
                } else if (i10 < this.f1339A) {
                    i10 = this.f1339A;
                    i8 += this.f1339A;
                }
                i6 = i10;
            } else {
                i10 = (this.f1341C - i8) - ((int) (((float) i6) * f2));
                i8 += i10;
                i6 = i10;
            }
            this.f1342D = new StaticLayout(charSequence, this.f1353h, i9 - i5, alignment, this.f1351f, this.f1352g, true);
            this.f1343E = i5;
            this.f1344F = i6;
            this.f1345G = i7;
            m1454a(canvas);
        }
    }

    /* renamed from: a */
    private void m1454a(Canvas canvas) {
        StaticLayout staticLayout = this.f1342D;
        if (staticLayout != null) {
            int lineCount;
            int i;
            int save = canvas.save();
            canvas.translate((float) this.f1343E, (float) this.f1344F);
            if (Color.alpha(this.f1366u) > 0) {
                this.f1354i.setColor(this.f1366u);
                canvas.drawRect((float) (-this.f1345G), 0.0f, (float) (staticLayout.getWidth() + this.f1345G), (float) staticLayout.getHeight(), this.f1354i);
            }
            if (Color.alpha(this.f1365t) > 0) {
                this.f1354i.setColor(this.f1365t);
                float lineTop = (float) staticLayout.getLineTop(0);
                lineCount = staticLayout.getLineCount();
                float f = lineTop;
                for (i = 0; i < lineCount; i++) {
                    this.f1346a.left = staticLayout.getLineLeft(i) - ((float) this.f1345G);
                    this.f1346a.right = staticLayout.getLineRight(i) + ((float) this.f1345G);
                    this.f1346a.top = f;
                    this.f1346a.bottom = (float) staticLayout.getLineBottom(i);
                    f = this.f1346a.bottom;
                    canvas.drawRoundRect(this.f1346a, this.f1347b, this.f1347b, this.f1354i);
                }
            }
            if (this.f1368w == 1) {
                this.f1353h.setStrokeJoin(Join.ROUND);
                this.f1353h.setStrokeWidth(this.f1348c);
                this.f1353h.setColor(this.f1367v);
                this.f1353h.setStyle(Style.FILL_AND_STROKE);
                staticLayout.draw(canvas);
            } else if (this.f1368w == 2) {
                this.f1353h.setShadowLayer(this.f1349d, this.f1350e, this.f1350e, this.f1367v);
            } else if (this.f1368w == 3 || this.f1368w == 4) {
                lineCount = this.f1368w == 3 ? 1 : 0;
                int i2 = lineCount != 0 ? -1 : this.f1367v;
                if (lineCount != 0) {
                    i = this.f1367v;
                } else {
                    i = -1;
                }
                float f2 = this.f1349d / 2.0f;
                this.f1353h.setColor(this.f1364s);
                this.f1353h.setStyle(Style.FILL);
                this.f1353h.setShadowLayer(this.f1349d, -f2, -f2, i2);
                staticLayout.draw(canvas);
                this.f1353h.setShadowLayer(this.f1349d, f2, f2, i);
            }
            this.f1353h.setColor(this.f1364s);
            this.f1353h.setStyle(Style.FILL);
            staticLayout.draw(canvas);
            this.f1353h.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
            canvas.restoreToCount(save);
        }
    }

    /* renamed from: a */
    private static boolean m1455a(CharSequence charSequence, CharSequence charSequence2) {
        return charSequence == charSequence2 || (charSequence != null && charSequence.equals(charSequence2));
    }
}
