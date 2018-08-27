package com.p000;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.C0590g;
import android.support.v7.widget.RecyclerView.C0602q;
import android.view.View;

/* compiled from: ImageItemDecorator */
/* renamed from: ctt */
public class ctt extends C0590g {
    /* renamed from: a */
    private int f20196a;

    public ctt(int i) {
        this.f20196a = i;
    }

    /* renamed from: a */
    public void m24919a(Rect rect, View view, RecyclerView recyclerView, C0602q c0602q) {
        rect.top = this.f20196a;
        rect.bottom = this.f20196a;
        rect.left = this.f20196a;
        if (recyclerView.getChildAdapterPosition(view) == c0602q.e() - 1) {
            rect.right = this.f20196a;
        }
    }
}
