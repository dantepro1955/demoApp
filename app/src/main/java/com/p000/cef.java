package com.p000;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;

/* compiled from: OverlayAdapter */
/* renamed from: cef */
public class cef extends cwi {
    /* renamed from: a */
    private ccs f8873a;
    /* renamed from: b */
    private cco f8874b;
    /* renamed from: c */
    private String f8875c;

    public cef(FragmentManager fragmentManager, ccs ccs, cco cco, String str) {
        super(fragmentManager);
        this.f8873a = ccs;
        this.f8874b = cco;
        this.f8875c = str;
    }

    /* renamed from: a */
    public Fragment m12733a(int i) {
        return a_(i);
    }

    public Fragment a_(int i) {
        return coe.m14956a(i, ((cct) this.f8873a.get(i)).m12282e(), this.f8874b, this.f8875c);
    }

    public int getCount() {
        return this.f8873a.size();
    }

    public int getItemPosition(Object obj) {
        return -2;
    }
}
