package com.p000;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.widget.RecyclerView.C0605t;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ProgressBar;

/* compiled from: HasNextIndicatorRenderer */
/* renamed from: csg */
public class csg {
    /* renamed from: a */
    private ProgressBar f20083a;

    /* compiled from: HasNextIndicatorRenderer */
    /* renamed from: csg$a */
    public static class C4554a extends C0605t {
        public C4554a(View view) {
            super(view);
        }
    }

    /* renamed from: a */
    public C0605t m24763a(ViewGroup viewGroup, int i) {
        Context context = viewGroup.getContext();
        int a = csg.m24762a(16.0f, context.getResources());
        this.f20083a = new ProgressBar(context);
        this.f20083a.setIndeterminate(true);
        View linearLayout = new LinearLayout(context);
        linearLayout.setGravity(1);
        linearLayout.setOrientation(0);
        linearLayout.setPadding(a, a, a, a);
        linearLayout.addView(this.f20083a, new LayoutParams(-1, -2));
        linearLayout.setLayoutParams(new LayoutParams(-1, -2));
        return new C4554a(linearLayout);
    }

    /* renamed from: a */
    public void m24764a(C0605t c0605t, int i) {
    }

    /* renamed from: a */
    private static final int m24762a(float f, Resources resources) {
        return (int) TypedValue.applyDimension(1, f, resources.getDisplayMetrics());
    }

    /* renamed from: a */
    public void m24765a(boolean z) {
        if (z) {
            this.f20083a.setVisibility(0);
        } else {
            this.f20083a.setVisibility(4);
        }
    }
}
