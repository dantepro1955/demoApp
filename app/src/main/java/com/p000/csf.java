package com.p000;

import android.support.v7.widget.RecyclerView.C0605t;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout.LayoutParams;

/* compiled from: EmptySpaceRenderer */
/* renamed from: csf */
public class csf {
    /* renamed from: a */
    private View f20082a;

    /* compiled from: EmptySpaceRenderer */
    /* renamed from: csf$a */
    public static class C4553a extends C0605t {
        public C4553a(View view) {
            super(view);
        }
    }

    /* renamed from: a */
    public C0605t m24759a(ViewGroup viewGroup, int i, int i2) {
        this.f20082a = new View(viewGroup.getContext());
        this.f20082a.setBackgroundColor(-16776961);
        this.f20082a.setLayoutParams(new LayoutParams(-1, i2));
        return new C4553a(this.f20082a);
    }

    /* renamed from: a */
    public void m24761a(C0605t c0605t, int i) {
    }

    /* renamed from: a */
    public View m24760a() {
        return this.f20082a;
    }
}
