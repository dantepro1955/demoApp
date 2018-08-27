package com.p000;

import android.annotation.TargetApi;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import p000.pv.C5656a;

@TargetApi(17)
/* compiled from: CardViewJellybeanMr1 */
/* renamed from: pd */
public class pd extends pb {

    /* compiled from: CardViewJellybeanMr1 */
    /* renamed from: pd$1 */
    class C56581 implements C5656a {
        /* renamed from: a */
        final /* synthetic */ pd f25018a;

        C56581(pd pdVar) {
            this.f25018a = pdVar;
        }

        /* renamed from: a */
        public void mo5430a(Canvas canvas, RectF rectF, float f, Paint paint) {
            canvas.drawRoundRect(rectF, f, f, paint);
        }
    }

    /* renamed from: a */
    public void mo5415a() {
        pv.f25136c = new C56581(this);
    }
}
