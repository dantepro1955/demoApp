package com.sept.android.lib.widget.universalimageview.imagetile;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import p000.dmc;
import p000.dmg;
import p000.dmh;

public class ZoomTilingView extends AbstractTilingView {
    /* renamed from: e */
    int f19875e;
    /* renamed from: f */
    RectF f19876f;
    /* renamed from: g */
    Rect f19877g;
    /* renamed from: h */
    Rect f19878h;
    /* renamed from: i */
    dmg f19879i;
    /* renamed from: j */
    int f19880j;
    /* renamed from: k */
    int f19881k;
    /* renamed from: l */
    Paint f19882l;
    /* renamed from: m */
    private dmh f19883m;
    /* renamed from: n */
    private int f19884n = 100;

    public ZoomTilingView(Context context) {
        super(context);
        m24204a(context);
    }

    public ZoomTilingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m24204a(context);
    }

    public ZoomTilingView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m24204a(context);
    }

    /* renamed from: a */
    private void m24204a(Context context) {
        this.f19879i = new dmg(this);
        this.f19876f = new RectF();
        this.f19877g = new Rect();
        this.f19878h = new Rect();
        this.f19882l = new Paint();
        this.f19882l.setAntiAlias(true);
        this.f19882l.setFilterBitmap(true);
        this.f19882l.setDither(true);
        this.f19875e = 0;
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f19880j = getMeasuredWidth();
        this.f19881k = getMeasuredHeight();
        dmc tileAdapter = getTileAdapter();
        if (tileAdapter != null) {
            this.f19879i.m27992a(this.f19880j, this.f19881k, tileAdapter.m27918d(), tileAdapter.m27919e(), this.f19875e);
        }
    }

    public void setZoomControllerListener(dmh dmh) {
        this.f19883m = dmh;
        if (this.f19879i != null) {
            this.f19879i.m27993a(this.f19883m);
        }
    }

    public void setTileAdapter(dmc dmc) {
        super.setTileAdapter(dmc);
        if (dmc != null) {
            int d = dmc.m27918d();
            int e = dmc.m27919e();
            int f = dmc.m27920f();
            int g = dmc.m27921g();
            this.f19879i.m28001d().right = (float) d;
            this.f19879i.m28001d().bottom = (float) e;
            this.f19879i.m27997b(dmc.m27922h());
            this.f19879i.m28000c(dmc.m27923i());
            int i = 0;
            for (int i2 = 0; i2 < this.b; i2++) {
                int i3 = 0;
                for (int i4 = 0; i4 < this.c; i4++) {
                    int min = Math.min(i3 + f, d);
                    int min2 = Math.min(i + g, e);
                    RectF rectF = this.d[i2][i4];
                    rectF.top = (float) i;
                    rectF.left = (float) i3;
                    rectF.bottom = (float) min2;
                    rectF.right = (float) min;
                    i3 += f;
                }
                i += g;
            }
            this.f19879i.m27992a(this.f19880j, this.f19881k, d, e, this.f19875e);
        }
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        getLocalVisibleRect(this.f19878h);
        if (this.a != null) {
            this.f19879i.m27996b();
            int a = this.a.mo4446a();
            int b = this.a.mo4447b();
            int i = 0;
            for (int i2 = 0; i2 < a; i2++) {
                int i3 = 0;
                int i4 = 0;
                while (i3 < b) {
                    this.f19879i.m27999c().mapRect(this.f19876f, this.d[i2][i3]);
                    if (i3 == 0) {
                        if (i2 == 0) {
                            i = (int) this.f19876f.top;
                        }
                        this.f19877g.top = i;
                        this.f19877g.bottom = (int) this.f19876f.bottom;
                        i = this.f19877g.bottom;
                        i4 = (int) this.f19876f.left;
                    }
                    this.f19877g.left = i4;
                    this.f19877g.right = (int) this.f19876f.right;
                    int i5 = this.f19877g.right;
                    if (this.f19877g.left <= this.f19878h.right + this.f19884n && this.f19877g.right >= this.f19878h.left - this.f19884n && this.f19877g.top <= this.f19878h.bottom + this.f19884n && this.f19877g.bottom >= this.f19878h.top - this.f19884n) {
                        try {
                            Bitmap a2 = this.a.mo4443a(i2, i3);
                            if (a2 != null) {
                                canvas.drawBitmap(a2, null, this.f19877g, this.f19882l);
                            }
                            this.a.m27917c(i2, i3);
                        } catch (Throwable th) {
                            this.a.m27917c(i2, i3);
                        }
                    }
                    i3++;
                    i4 = i5;
                }
            }
        }
    }

    public dmg getZoomController() {
        return this.f19879i;
    }

    public void setZoomMode(int i) {
        this.f19875e = i;
        requestLayout();
    }
}
