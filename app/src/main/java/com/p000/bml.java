package com.p000;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* renamed from: bml */
public final class bml extends alo<bml> {
    /* renamed from: a */
    public String f6980a;
    /* renamed from: b */
    public boolean f6981b;

    /* renamed from: a */
    public String m9686a() {
        return this.f6980a;
    }

    /* renamed from: a */
    public /* synthetic */ void mo1348a(alo alo) {
        m9688a((bml) alo);
    }

    /* renamed from: a */
    public void m9688a(bml bml) {
        if (!TextUtils.isEmpty(this.f6980a)) {
            bml.m9689a(this.f6980a);
        }
        if (this.f6981b) {
            bml.m9690a(this.f6981b);
        }
    }

    /* renamed from: a */
    public void m9689a(String str) {
        this.f6980a = str;
    }

    /* renamed from: a */
    public void m9690a(boolean z) {
        this.f6981b = z;
    }

    /* renamed from: b */
    public boolean m9691b() {
        return this.f6981b;
    }

    public String toString() {
        Map hashMap = new HashMap();
        hashMap.put("description", this.f6980a);
        hashMap.put("fatal", Boolean.valueOf(this.f6981b));
        return alo.m2502a((Object) hashMap);
    }
}
