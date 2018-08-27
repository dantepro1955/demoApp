package com.p000;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.C0590g;
import android.support.v7.widget.RecyclerView.C0602q;
import android.view.View;

/* compiled from: SpaceItemDecoration */
/* renamed from: coi */
public class coi extends C0590g {
    /* renamed from: a */
    private int f9922a;
    /* renamed from: b */
    private int f9923b;

    public coi(int i, int i2) {
        this.f9922a = i;
        this.f9923b = i2;
    }

    /* renamed from: a */
    public void mo1677a(Rect rect, View view, RecyclerView recyclerView, C0602q c0602q) {
        if (recyclerView.getChildPosition(view) == 0) {
            rect.left = this.f9922a;
            rect.top = this.f9923b;
        }
        rect.right = this.f9922a;
        rect.bottom = this.f9923b;
    }
}
