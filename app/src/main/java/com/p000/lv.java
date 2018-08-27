package com.p000;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: ResourceCursorAdapter */
/* renamed from: lv */
public abstract class lv extends lf {
    /* renamed from: j */
    private int f16881j;
    /* renamed from: k */
    private int f16882k;
    /* renamed from: l */
    private LayoutInflater f16883l;

    @Deprecated
    public lv(Context context, int i, Cursor cursor, boolean z) {
        super(context, cursor, z);
        this.f16882k = i;
        this.f16881j = i;
        this.f16883l = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    /* renamed from: a */
    public View m21289a(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f16883l.inflate(this.f16881j, viewGroup, false);
    }

    /* renamed from: b */
    public View m21290b(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f16883l.inflate(this.f16882k, viewGroup, false);
    }
}
