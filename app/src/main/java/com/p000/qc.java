package com.p000;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.os.Build.VERSION;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* compiled from: TintContextWrapper */
/* renamed from: qc */
public class qc extends ContextWrapper {
    /* renamed from: a */
    private static final Object f25192a = new Object();
    /* renamed from: b */
    private static ArrayList<WeakReference<qc>> f25193b;
    /* renamed from: c */
    private final Resources f25194c;
    /* renamed from: d */
    private final Theme f25195d;

    /* renamed from: a */
    public static Context m33772a(Context context) {
        if (!qc.m33773b(context)) {
            return context;
        }
        synchronized (f25192a) {
            Context context2;
            if (f25193b == null) {
                f25193b = new ArrayList();
            } else {
                int size;
                WeakReference weakReference;
                for (size = f25193b.size() - 1; size >= 0; size--) {
                    weakReference = (WeakReference) f25193b.get(size);
                    if (weakReference == null || weakReference.get() == null) {
                        f25193b.remove(size);
                    }
                }
                size = f25193b.size() - 1;
                while (size >= 0) {
                    weakReference = (WeakReference) f25193b.get(size);
                    context2 = weakReference != null ? (qc) weakReference.get() : null;
                    if (context2 == null || context2.getBaseContext() != context) {
                        size--;
                    } else {
                        return context2;
                    }
                }
            }
            context2 = new qc(context);
            f25193b.add(new WeakReference(context2));
            return context2;
        }
    }

    /* renamed from: b */
    private static boolean m33773b(Context context) {
        if ((context instanceof qc) || (context.getResources() instanceof qe) || (context.getResources() instanceof qh)) {
            return false;
        }
        if (VERSION.SDK_INT < 21 || qh.m33842a()) {
            return true;
        }
        return false;
    }

    private qc(Context context) {
        super(context);
        if (qh.m33842a()) {
            this.f25194c = new qh(this, context.getResources());
            this.f25195d = this.f25194c.newTheme();
            this.f25195d.setTo(context.getTheme());
            return;
        }
        this.f25194c = new qe(this, context.getResources());
        this.f25195d = null;
    }

    public Theme getTheme() {
        return this.f25195d == null ? super.getTheme() : this.f25195d;
    }

    public void setTheme(int i) {
        if (this.f25195d == null) {
            super.setTheme(i);
        } else {
            this.f25195d.applyStyle(i, true);
        }
    }

    public Resources getResources() {
        return this.f25194c;
    }

    public AssetManager getAssets() {
        return this.f25194c.getAssets();
    }
}
