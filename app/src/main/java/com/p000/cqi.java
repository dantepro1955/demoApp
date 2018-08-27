package com.p000;

import android.content.Context;
import android.graphics.BitmapFactory.Options;
import p000.ctf.C4579b;

/* compiled from: PostTileBuilder */
/* renamed from: cqi */
public class cqi extends ctf {
    /* renamed from: a */
    private static caf f19976a = caf.a();
    /* renamed from: b */
    private Context f19977b;
    /* renamed from: c */
    private String f19978c;
    /* renamed from: d */
    private int f19979d;
    /* renamed from: e */
    private int f19980e;
    /* renamed from: f */
    private int f19981f;
    /* renamed from: g */
    private int f19982g;
    /* renamed from: h */
    private C4579b f19983h = new C4579b();

    public cqi(Context context, String str, int i, int i2, int i3, int i4, int i5) {
        this.f19977b = context;
        this.f19978c = str;
        this.f19979d = i;
        this.f19980e = i2;
        this.f19981f = i3;
        this.f19983h.f20167a = i;
        this.f19983h.f20168b = i2;
        this.f19983h.f20171e = i4;
        this.f19982g = i5;
        this.f19983h.f20174h = f19976a.d().c();
        djl.m27591c(f19976a.f().a(context, str));
    }

    /* renamed from: a */
    public String mo4114a(int i, int i2) {
        return f19976a.e().a(this.f19977b, this.f19978c, this.f19980e, i, i2, this.f19981f, this.f19982g);
    }

    /* renamed from: a */
    public C4579b mo4113a() {
        return this.f19983h;
    }

    /* renamed from: b */
    public Options mo4115b() {
        return new Options();
    }
}
