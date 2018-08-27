package com.p000;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.C0590g;
import android.support.v7.widget.RecyclerView.C0602q;
import android.view.View;

/* compiled from: GridSpaceItemDecoration */
/* renamed from: csd */
public class csd extends C0590g {
    /* renamed from: a */
    private int f20079a;
    /* renamed from: b */
    private boolean f20080b;
    /* renamed from: c */
    private int f20081c;

    public csd(int i, boolean z, int i2) {
        this.f20079a = i;
        this.f20080b = z;
        this.f20081c = i2;
    }

    /* renamed from: a */
    public void m24756a(Rect rect, View view, RecyclerView recyclerView, C0602q c0602q) {
        int childLayoutPosition = recyclerView.getChildLayoutPosition(view);
        if (childLayoutPosition >= this.f20081c) {
            rect.left = this.f20079a;
            rect.top = this.f20079a;
            rect.bottom = this.f20079a;
            rect.right = this.f20079a;
            if (childLayoutPosition % 2 == (this.f20080b ? 0 : 1)) {
                rect.right /= 2;
            } else {
                rect.left /= 2;
            }
        }
    }
}
