package com.p000;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: cev */
final /* synthetic */ class cev implements OnClickListener {
    /* renamed from: a */
    private final ceu f8998a;

    private cev(ceu ceu) {
        this.f8998a = ceu;
    }

    /* renamed from: a */
    public static OnClickListener m12913a(ceu ceu) {
        return new cev(ceu);
    }

    public void onClick(View view) {
        ceu.m12892a(this.f8998a, view);
    }
}
