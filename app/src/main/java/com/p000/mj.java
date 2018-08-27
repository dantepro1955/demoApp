package com.p000;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.widget.Toolbar;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import p000.mg.C5529a;
import p000.ni.C5551a;

/* compiled from: AppCompatDelegate */
/* renamed from: mj */
public abstract class mj {
    /* renamed from: a */
    private static int f24498a = -1;
    /* renamed from: b */
    private static boolean f24499b = false;

    /* renamed from: a */
    public abstract ActionBar mo5180a();

    /* renamed from: a */
    public abstract View mo5192a(int i);

    /* renamed from: a */
    public abstract ni mo5193a(C5551a c5551a);

    /* renamed from: a */
    public abstract void mo5195a(Configuration configuration);

    /* renamed from: a */
    public abstract void mo5196a(Bundle bundle);

    /* renamed from: a */
    public abstract void mo5197a(Toolbar toolbar);

    /* renamed from: a */
    public abstract void mo5198a(View view);

    /* renamed from: a */
    public abstract void mo5199a(View view, LayoutParams layoutParams);

    /* renamed from: a */
    public abstract void mo5181a(CharSequence charSequence);

    /* renamed from: b */
    public abstract MenuInflater mo5182b();

    /* renamed from: b */
    public abstract void mo5205b(int i);

    /* renamed from: b */
    public abstract void mo5206b(Bundle bundle);

    /* renamed from: b */
    public abstract void mo5207b(View view, LayoutParams layoutParams);

    /* renamed from: c */
    public abstract void mo5183c();

    /* renamed from: c */
    public abstract void mo5184c(Bundle bundle);

    /* renamed from: c */
    public abstract boolean mo5210c(int i);

    /* renamed from: d */
    public abstract void mo5185d();

    /* renamed from: e */
    public abstract void mo5211e();

    /* renamed from: f */
    public abstract void mo5212f();

    /* renamed from: g */
    public abstract void mo5186g();

    /* renamed from: h */
    public abstract C5529a mo5187h();

    /* renamed from: i */
    public abstract void mo5213i();

    /* renamed from: j */
    public abstract boolean mo5188j();

    /* renamed from: a */
    public static mj m32641a(Activity activity, mi miVar) {
        return mj.m32643a(activity, activity.getWindow(), miVar);
    }

    /* renamed from: a */
    public static mj m32642a(Dialog dialog, mi miVar) {
        return mj.m32643a(dialog.getContext(), dialog.getWindow(), miVar);
    }

    /* renamed from: a */
    private static mj m32643a(Context context, Window window, mi miVar) {
        int i = VERSION.SDK_INT;
        if (gr.m30483a()) {
            return new ml(context, window, miVar);
        }
        if (i >= 23) {
            return new mo(context, window, miVar);
        }
        if (i >= 14) {
            return new mn(context, window, miVar);
        }
        if (i >= 11) {
            return new mm(context, window, miVar);
        }
        return new mp(context, window, miVar);
    }

    mj() {
    }

    /* renamed from: k */
    public static int m32644k() {
        return f24498a;
    }

    /* renamed from: l */
    public static boolean m32645l() {
        return f24499b;
    }
}
