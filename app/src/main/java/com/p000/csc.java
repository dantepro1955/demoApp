package com.p000;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.C0590g;
import android.support.v7.widget.RecyclerView.C0602q;
import android.support.v7.widget.RecyclerView.LayoutParams;
import android.view.View;
import p000.csa.C4550d;

/* compiled from: DividerItemDecoration */
/* renamed from: csc */
public class csc extends C0590g {
    /* renamed from: a */
    private Drawable f20078a;

    public csc(Context context) {
        this.f20078a = ew.a(context, C4550d.line_divider);
    }

    /* renamed from: b */
    public void m24755b(Canvas canvas, RecyclerView recyclerView, C0602q c0602q) {
        int paddingLeft = recyclerView.getPaddingLeft();
        int width = recyclerView.getWidth() - recyclerView.getPaddingRight();
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            int bottom = layoutParams.bottomMargin + childAt.getBottom();
            this.f20078a.setBounds(paddingLeft, bottom, width, this.f20078a.getIntrinsicHeight() + bottom);
            this.f20078a.draw(canvas);
        }
    }
}
