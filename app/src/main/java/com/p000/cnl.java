package com.p000;

import android.content.Context;
import com.ninegag.android.app.model.api.ApiBaseResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* compiled from: UpdateNotifReadStateTask */
/* renamed from: cnl */
public class cnl extends cmg {
    /* renamed from: b */
    private ArrayList<C1776a> f9860b = new ArrayList();

    /* compiled from: UpdateNotifReadStateTask */
    /* renamed from: cnl$a */
    public static class C1776a {
        /* renamed from: a */
        public String f9858a;
        /* renamed from: b */
        public int f9859b;

        public C1776a(String str, int i) {
            this.f9858a = str;
            this.f9859b = i;
        }
    }

    /* renamed from: a */
    public void m14786a(String str, int i) {
        this.f9860b.add(new C1776a(str, i));
    }

    /* renamed from: a */
    public void mo1800a(ApiBaseResponse apiBaseResponse) {
        if (!apiBaseResponse.success()) {
        }
    }

    /* renamed from: a */
    protected ApiBaseResponse mo1799a(String str) {
        return (ApiBaseResponse) djm.a(str, ApiBaseResponse.class);
    }

    /* renamed from: f */
    protected dft mo1802f(Context context) {
        dft c = dft.c(m14491g(context));
        cmg.m14468a(c);
        Map hashMap = new HashMap();
        hashMap.put("itemKeys", m14782n());
        hashMap.put("states", m14783r());
        c.a(hashMap);
        return c;
    }

    /* renamed from: h */
    protected String mo1804h(Context context) {
        return String.format("%s/v2/user-notifications-item-read-state", new Object[]{cae.m12035a()});
    }

    /* renamed from: m */
    public String mo1806m() {
        return toString();
    }

    /* renamed from: n */
    private String m14782n() {
        StringBuilder stringBuilder = new StringBuilder();
        int size = this.f9860b.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                stringBuilder.append(",");
            }
            stringBuilder.append(((C1776a) this.f9860b.get(i)).f9858a);
        }
        return stringBuilder.toString();
    }

    /* renamed from: r */
    private String m14783r() {
        StringBuilder stringBuilder = new StringBuilder();
        int size = this.f9860b.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                stringBuilder.append(",");
            }
            stringBuilder.append(((C1776a) this.f9860b.get(i)).f9859b);
        }
        return stringBuilder.toString();
    }
}
