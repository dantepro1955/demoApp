package com.p000;

import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;

/* compiled from: BadgeCircle */
/* renamed from: dbx */
class dbx {
    /* renamed from: a */
    static ShapeDrawable m26303a(int i, int i2) {
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        shapeDrawable.setIntrinsicWidth(i);
        shapeDrawable.setIntrinsicHeight(i);
        shapeDrawable.getPaint().setColor(i2);
        return shapeDrawable;
    }
}
