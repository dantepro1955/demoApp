package com.p000;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

/* compiled from: TintResources */
/* renamed from: qe */
class qe extends pt {
    /* renamed from: a */
    private final WeakReference<Context> f25200a;

    public qe(Context context, Resources resources) {
        super(resources);
        this.f25200a = new WeakReference(context);
    }

    public Drawable getDrawable(int i) throws NotFoundException {
        Drawable drawable = super.getDrawable(i);
        Context context = (Context) this.f25200a.get();
        if (!(drawable == null || context == null)) {
            ot.m33355a();
            ot.m33361a(context, i, drawable);
        }
        return drawable;
    }
}
