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
import p000.csa.C4551e;
import p000.csy.C4559a;

/* compiled from: BlitzLoadingIndicatorAdapter */
/* renamed from: csu */
public class csu extends css {

    /* compiled from: BlitzLoadingIndicatorAdapter */
    /* renamed from: csu$a */
    static class C4560a extends C4559a {
        public C4560a(View view) {
            super(view);
        }
    }

    public C0605t onCreateViewHolder(ViewGroup viewGroup, int i) {
        Context context = viewGroup.getContext();
        View progressBar = new ProgressBar(context);
        progressBar.setIndeterminate(true);
        int a = csu.m24818a(16.0f, context.getResources());
        View linearLayout = new LinearLayout(context);
        linearLayout.setGravity(1);
        linearLayout.setOrientation(0);
        linearLayout.setPadding(a, a, a, a);
        linearLayout.addView(progressBar, new LayoutParams(-1, -2));
        linearLayout.setLayoutParams(new LayoutParams(-1, -2));
        return new C4560a(linearLayout);
    }

    /* renamed from: a */
    private static final int m24818a(float f, Resources resources) {
        return (int) TypedValue.applyDimension(1, f, resources.getDisplayMetrics());
    }

    public int getItemViewType(int i) {
        return C4551e.blitz_view_type_loading_indicator_adapter;
    }
}
