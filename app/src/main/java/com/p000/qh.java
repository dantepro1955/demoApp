package com.p000;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import java.lang.ref.WeakReference;

/* compiled from: VectorEnabledTintResources */
/* renamed from: qh */
public class qh extends Resources {
    /* renamed from: a */
    private final WeakReference<Context> f25225a;

    /* renamed from: a */
    public static boolean m33842a() {
        return mj.m32645l() && VERSION.SDK_INT <= 20;
    }

    public qh(Context context, Resources resources) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        this.f25225a = new WeakReference(context);
    }

    public Drawable getDrawable(int i) throws NotFoundException {
        Context context = (Context) this.f25225a.get();
        if (context != null) {
            return ot.m33355a().m33375a(context, this, i);
        }
        return super.getDrawable(i);
    }

    /* renamed from: a */
    final Drawable m33843a(int i) {
        return super.getDrawable(i);
    }
}
