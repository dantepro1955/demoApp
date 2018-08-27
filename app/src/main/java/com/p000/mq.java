package com.p000;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import p000.mx.C5568a;
import p000.ni.C5551a;

/* compiled from: AppCompatDialog */
/* renamed from: mq */
public class mq extends Dialog implements mi {
    /* renamed from: a */
    private mj f24496a;

    public mq(Context context, int i) {
        super(context, mq.m32637a(context, i));
        m32639b().mo5196a(null);
        m32639b().mo5188j();
    }

    protected void onCreate(Bundle bundle) {
        m32639b().mo5213i();
        super.onCreate(bundle);
        m32639b().mo5196a(bundle);
    }

    public void setContentView(int i) {
        m32639b().mo5205b(i);
    }

    public void setContentView(View view) {
        m32639b().mo5198a(view);
    }

    public void setContentView(View view, LayoutParams layoutParams) {
        m32639b().mo5199a(view, layoutParams);
    }

    public View findViewById(int i) {
        return m32639b().mo5192a(i);
    }

    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        m32639b().mo5181a(charSequence);
    }

    public void setTitle(int i) {
        super.setTitle(i);
        m32639b().mo5181a(getContext().getString(i));
    }

    public void addContentView(View view, LayoutParams layoutParams) {
        m32639b().mo5207b(view, layoutParams);
    }

    protected void onStop() {
        super.onStop();
        m32639b().mo5185d();
    }

    /* renamed from: a */
    public boolean m32638a(int i) {
        return m32639b().mo5210c(i);
    }

    public void invalidateOptionsMenu() {
        m32639b().mo5212f();
    }

    /* renamed from: b */
    public mj m32639b() {
        if (this.f24496a == null) {
            this.f24496a = mj.m32642a((Dialog) this, (mi) this);
        }
        return this.f24496a;
    }

    /* renamed from: a */
    private static int m32637a(Context context, int i) {
        if (i != 0) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C5568a.dialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    public void onSupportActionModeStarted(ni niVar) {
    }

    public void onSupportActionModeFinished(ni niVar) {
    }

    public ni onWindowStartingSupportActionMode(C5551a c5551a) {
        return null;
    }
}
