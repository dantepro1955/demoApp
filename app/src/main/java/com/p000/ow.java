package com.p000;

import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import p000.mx.C5577j;

/* compiled from: AppCompatSeekBarHelper */
/* renamed from: ow */
public class ow extends ov {
    /* renamed from: a */
    private final SeekBar f25002a;
    /* renamed from: b */
    private Drawable f25003b;
    /* renamed from: c */
    private ColorStateList f25004c = null;
    /* renamed from: d */
    private Mode f25005d = null;
    /* renamed from: e */
    private boolean f25006e = false;
    /* renamed from: f */
    private boolean f25007f = false;

    public ow(SeekBar seekBar) {
        super(seekBar);
        this.f25002a = seekBar;
    }

    /* renamed from: a */
    public void mo5410a(AttributeSet attributeSet, int i) {
        super.mo5410a(attributeSet, i);
        qf a = qf.m33777a(this.f25002a.getContext(), attributeSet, C5577j.AppCompatSeekBar, i, 0);
        Drawable b = a.m33784b(C5577j.AppCompatSeekBar_android_thumb);
        if (b != null) {
            this.f25002a.setThumb(b);
        }
        mo5409a(a.m33780a(C5577j.AppCompatSeekBar_tickMark));
        if (a.m33794g(C5577j.AppCompatSeekBar_tickMarkTintMode)) {
            this.f25005d = pi.m33599a(a.m33779a(C5577j.AppCompatSeekBar_tickMarkTintMode, -1), this.f25005d);
            this.f25007f = true;
        }
        if (a.m33794g(C5577j.AppCompatSeekBar_tickMarkTint)) {
            this.f25004c = a.m33790e(C5577j.AppCompatSeekBar_tickMarkTint);
            this.f25006e = true;
        }
        a.m33781a();
        m33386d();
    }

    /* renamed from: a */
    void mo5409a(Drawable drawable) {
        if (this.f25003b != null) {
            this.f25003b.setCallback(null);
        }
        this.f25003b = drawable;
        if (drawable != null) {
            drawable.setCallback(this.f25002a);
            fp.b(drawable, jd.g(this.f25002a));
            if (drawable.isStateful()) {
                drawable.setState(this.f25002a.getDrawableState());
            }
            m33386d();
        }
        this.f25002a.invalidate();
    }

    /* renamed from: d */
    private void m33386d() {
        if (this.f25003b == null) {
            return;
        }
        if (this.f25006e || this.f25007f) {
            this.f25003b = fp.g(this.f25003b.mutate());
            if (this.f25006e) {
                fp.a(this.f25003b, this.f25004c);
            }
            if (this.f25007f) {
                fp.a(this.f25003b, this.f25005d);
            }
            if (this.f25003b.isStateful()) {
                this.f25003b.setState(this.f25002a.getDrawableState());
            }
        }
    }

    @TargetApi(11)
    /* renamed from: b */
    public void mo5411b() {
        if (this.f25003b != null) {
            this.f25003b.jumpToCurrentState();
        }
    }

    /* renamed from: c */
    public void m33391c() {
        Drawable drawable = this.f25003b;
        if (drawable != null && drawable.isStateful() && drawable.setState(this.f25002a.getDrawableState())) {
            this.f25002a.invalidateDrawable(drawable);
        }
    }

    /* renamed from: a */
    public void m33387a(Canvas canvas) {
        int i = 1;
        if (this.f25003b != null) {
            int max = this.f25002a.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f25003b.getIntrinsicWidth();
                int intrinsicHeight = this.f25003b.getIntrinsicHeight();
                intrinsicWidth = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                if (intrinsicHeight >= 0) {
                    i = intrinsicHeight / 2;
                }
                this.f25003b.setBounds(-intrinsicWidth, -i, intrinsicWidth, i);
                float width = ((float) ((this.f25002a.getWidth() - this.f25002a.getPaddingLeft()) - this.f25002a.getPaddingRight())) / ((float) max);
                intrinsicHeight = canvas.save();
                canvas.translate((float) this.f25002a.getPaddingLeft(), (float) (this.f25002a.getHeight() / 2));
                for (i = 0; i <= max; i++) {
                    this.f25003b.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(intrinsicHeight);
            }
        }
    }
}
