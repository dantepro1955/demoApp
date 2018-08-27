package com.p000;

import android.text.TextUtils;
import com.facebook.internal.NativeProtocol;
import java.util.HashMap;
import java.util.Map;

/* renamed from: bmk */
public final class bmk extends alo<bmk> {
    /* renamed from: a */
    private String f6976a;
    /* renamed from: b */
    private String f6977b;
    /* renamed from: c */
    private String f6978c;
    /* renamed from: d */
    private long f6979d;

    /* renamed from: a */
    public String m9676a() {
        return this.f6976a;
    }

    /* renamed from: a */
    public void m9677a(long j) {
        this.f6979d = j;
    }

    /* renamed from: a */
    public /* synthetic */ void mo1348a(alo alo) {
        m9679a((bmk) alo);
    }

    /* renamed from: a */
    public void m9679a(bmk bmk) {
        if (!TextUtils.isEmpty(this.f6976a)) {
            bmk.m9680a(this.f6976a);
        }
        if (!TextUtils.isEmpty(this.f6977b)) {
            bmk.m9682b(this.f6977b);
        }
        if (!TextUtils.isEmpty(this.f6978c)) {
            bmk.m9684c(this.f6978c);
        }
        if (this.f6979d != 0) {
            bmk.m9677a(this.f6979d);
        }
    }

    /* renamed from: a */
    public void m9680a(String str) {
        this.f6976a = str;
    }

    /* renamed from: b */
    public String m9681b() {
        return this.f6977b;
    }

    /* renamed from: b */
    public void m9682b(String str) {
        this.f6977b = str;
    }

    /* renamed from: c */
    public String m9683c() {
        return this.f6978c;
    }

    /* renamed from: c */
    public void m9684c(String str) {
        this.f6978c = str;
    }

    /* renamed from: d */
    public long m9685d() {
        return this.f6979d;
    }

    public String toString() {
        Map hashMap = new HashMap();
        hashMap.put("category", this.f6976a);
        hashMap.put(NativeProtocol.WEB_DIALOG_ACTION, this.f6977b);
        hashMap.put("label", this.f6978c);
        hashMap.put("value", Long.valueOf(this.f6979d));
        return alo.m2502a((Object) hashMap);
    }
}
