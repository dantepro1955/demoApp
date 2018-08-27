package com.p000;

import android.text.TextUtils;
import com.facebook.internal.NativeProtocol;
import java.util.HashMap;
import java.util.Map;

/* renamed from: bmo */
public final class bmo extends alo<bmo> {
    /* renamed from: a */
    public String f6997a;
    /* renamed from: b */
    public String f6998b;
    /* renamed from: c */
    public String f6999c;

    /* renamed from: a */
    public String m9723a() {
        return this.f6997a;
    }

    /* renamed from: a */
    public /* synthetic */ void mo1348a(alo alo) {
        m9725a((bmo) alo);
    }

    /* renamed from: a */
    public void m9725a(bmo bmo) {
        if (!TextUtils.isEmpty(this.f6997a)) {
            bmo.m9726a(this.f6997a);
        }
        if (!TextUtils.isEmpty(this.f6998b)) {
            bmo.m9728b(this.f6998b);
        }
        if (!TextUtils.isEmpty(this.f6999c)) {
            bmo.m9730c(this.f6999c);
        }
    }

    /* renamed from: a */
    public void m9726a(String str) {
        this.f6997a = str;
    }

    /* renamed from: b */
    public String m9727b() {
        return this.f6998b;
    }

    /* renamed from: b */
    public void m9728b(String str) {
        this.f6998b = str;
    }

    /* renamed from: c */
    public String m9729c() {
        return this.f6999c;
    }

    /* renamed from: c */
    public void m9730c(String str) {
        this.f6999c = str;
    }

    public String toString() {
        Map hashMap = new HashMap();
        hashMap.put("network", this.f6997a);
        hashMap.put(NativeProtocol.WEB_DIALOG_ACTION, this.f6998b);
        hashMap.put("target", this.f6999c);
        return alo.m2502a((Object) hashMap);
    }
}
