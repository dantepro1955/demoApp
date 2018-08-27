package com.p000;

import android.os.Bundle;
import java.util.List;

/* compiled from: GagPostListViewStateListener */
/* renamed from: cgd */
public class cgd extends cfo<cct> {
    cgd(cst<cct> cst, csn<cct> csn, Bundle bundle) {
        super(cst, csn, bundle);
    }

    /* renamed from: a */
    void mo1719a(csz csz) {
        this.b = csz;
    }

    /* renamed from: a */
    void mo1718a() {
        this.b = null;
    }

    /* renamed from: b */
    public void m13077b() {
    }

    /* renamed from: c */
    public void m13079c() {
    }

    /* renamed from: a */
    public void m13076a(List<cct> list, boolean z) {
        this.c.notifyDataSetChanged();
        if (list.size() == 0) {
            this.d.a(cgb.m13070a(this.e));
        }
    }

    /* renamed from: b */
    public void m13078b(List<cct> list, boolean z) {
        this.c.notifyDataSetChanged();
    }

    /* renamed from: c */
    public void m13080c(List<cct> list, boolean z) {
        this.c.notifyDataSetChanged();
    }
}
