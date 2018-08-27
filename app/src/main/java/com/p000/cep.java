package com.p000;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;

/* compiled from: OverlayAdapterV2 */
/* renamed from: cep */
public class cep extends cwi {
    /* renamed from: a */
    protected cge f8934a;
    /* renamed from: b */
    protected cco f8935b;
    /* renamed from: c */
    private String f8936c;

    public cep(AppCompatActivity appCompatActivity, cge cge, cco cco, String str) {
        super(appCompatActivity.getSupportFragmentManager());
        this.f8934a = cge;
        this.f8935b = cco;
        this.f8936c = str;
    }

    /* renamed from: b */
    public int mo1691b() {
        return this.f8934a.m13100l();
    }

    /* renamed from: d */
    public cge m12818d() {
        return this.f8934a;
    }

    /* renamed from: e */
    public cct mo1693e(int i) {
        return (cct) this.f8934a.get(i);
    }

    /* renamed from: c */
    public cct mo1692c() {
        return mo1693e(this.f8934a.m13100l());
    }

    /* renamed from: f */
    public void mo1694f(int i) {
        this.f8934a.remove(i);
    }

    /* renamed from: a */
    public Fragment mo1690a(int i) {
        return m12822h(i);
    }

    /* renamed from: h */
    public Fragment m12822h(int i) {
        return coe.m14956a(i, ((cct) this.f8934a.get(i)).m12282e(), this.f8935b, this.f8936c);
    }

    public int getCount() {
        return this.f8934a.size();
    }

    public int getItemPosition(Object obj) {
        return -2;
    }

    /* renamed from: e */
    protected String m12820e() {
        return this.f8936c;
    }
}
