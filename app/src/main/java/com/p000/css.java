package com.p000;

import p000.csy.C4559a;

/* compiled from: BaseToggleableAdapter */
/* renamed from: css */
public abstract class css extends csy {
    /* renamed from: a */
    protected boolean f20128a;

    public int getItemCount() {
        return this.f20128a ? 1 : 0;
    }

    /* renamed from: a */
    public void mo4143a(C4559a c4559a, int i) {
        super.mo4143a(c4559a, i);
    }

    /* renamed from: a */
    public void m24814a(boolean z) {
        if (this.f20128a != z) {
            this.f20128a = z;
            if (z) {
                notifyItemInserted(0);
            } else {
                notifyItemRemoved(0);
            }
        }
    }
}
