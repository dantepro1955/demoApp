package com.p000;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import p000.pv.C5656a;

@TargetApi(9)
/* compiled from: CardViewGingerbread */
/* renamed from: pb */
public class pb implements pc {
    /* renamed from: a */
    final RectF f25017a = new RectF();

    /* compiled from: CardViewGingerbread */
    /* renamed from: pb$1 */
    class C56571 implements C5656a {
        /* renamed from: a */
        final /* synthetic */ pb f25016a;

        C56571(pb pbVar) {
            this.f25016a = pbVar;
        }

        /* renamed from: a */
        public void mo5430a(Canvas canvas, RectF rectF, float f, Paint paint) {
            float f2 = 2.0f * f;
            float width = (rectF.width() - f2) - 1.0f;
            float height = (rectF.height() - f2) - 1.0f;
            if (f >= 1.0f) {
                float f3 = f + 0.5f;
                this.f25016a.f25017a.set(-f3, -f3, f3, f3);
                int save = canvas.save();
                canvas.translate(rectF.left + f3, rectF.top + f3);
                canvas.drawArc(this.f25016a.f25017a, 180.0f, 90.0f, true, paint);
                canvas.translate(width, 0.0f);
                canvas.rotate(90.0f);
                canvas.drawArc(this.f25016a.f25017a, 180.0f, 90.0f, true, paint);
                canvas.translate(height, 0.0f);
                canvas.rotate(90.0f);
                canvas.drawArc(this.f25016a.f25017a, 180.0f, 90.0f, true, paint);
                canvas.translate(width, 0.0f);
                canvas.rotate(90.0f);
                canvas.drawArc(this.f25016a.f25017a, 180.0f, 90.0f, true, paint);
                canvas.restoreToCount(save);
                canvas.drawRect((rectF.left + f3) - 1.0f, rectF.top, 1.0f + (rectF.right - f3), rectF.top + f3, paint);
                canvas.drawRect((rectF.left + f3) - 1.0f, rectF.bottom - f3, 1.0f + (rectF.right - f3), rectF.bottom, paint);
            }
            canvas.drawRect(rectF.left, rectF.top + f, rectF.right, rectF.bottom - f, paint);
        }
    }

    /* renamed from: a */
    public void mo5415a() {
        pv.f25136c = new C56571(this);
    }

    /* renamed from: a */
    public void mo5417a(pa paVar, Context context, ColorStateList colorStateList, float f, float f2, float f3) {
        Drawable a = m33442a(context, colorStateList, f, f2, f3);
        a.m33723a(paVar.m33437b());
        paVar.m33435a(a);
        mo5425f(paVar);
    }

    /* renamed from: a */
    private pv m33442a(Context context, ColorStateList colorStateList, float f, float f2, float f3) {
        return new pv(context.getResources(), colorStateList, f, f2, f3);
    }

    /* renamed from: f */
    public void mo5425f(pa paVar) {
        Rect rect = new Rect();
        m33443j(paVar).m33722a(rect);
        paVar.m33433a((int) Math.ceil((double) mo5419b(paVar)), (int) Math.ceil((double) mo5421c(paVar)));
        paVar.m33434a(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* renamed from: g */
    public void mo5426g(pa paVar) {
    }

    /* renamed from: h */
    public void mo5427h(pa paVar) {
        m33443j(paVar).m33723a(paVar.m33437b());
        mo5425f(paVar);
    }

    /* renamed from: a */
    public void mo5418a(pa paVar, ColorStateList colorStateList) {
        m33443j(paVar).m33721a(colorStateList);
    }

    /* renamed from: i */
    public ColorStateList mo5428i(pa paVar) {
        return m33443j(paVar).m33730f();
    }

    /* renamed from: a */
    public void mo5416a(pa paVar, float f) {
        m33443j(paVar).m33719a(f);
        mo5425f(paVar);
    }

    /* renamed from: d */
    public float mo5423d(pa paVar) {
        return m33443j(paVar).m33718a();
    }

    /* renamed from: c */
    public void mo5422c(pa paVar, float f) {
        m33443j(paVar).m33725b(f);
    }

    /* renamed from: e */
    public float mo5424e(pa paVar) {
        return m33443j(paVar).m33724b();
    }

    /* renamed from: b */
    public void mo5420b(pa paVar, float f) {
        m33443j(paVar).m33727c(f);
        mo5425f(paVar);
    }

    /* renamed from: a */
    public float mo5414a(pa paVar) {
        return m33443j(paVar).m33726c();
    }

    /* renamed from: b */
    public float mo5419b(pa paVar) {
        return m33443j(paVar).m33728d();
    }

    /* renamed from: c */
    public float mo5421c(pa paVar) {
        return m33443j(paVar).m33729e();
    }

    /* renamed from: j */
    private pv m33443j(pa paVar) {
        return (pv) paVar.m33438c();
    }
}
