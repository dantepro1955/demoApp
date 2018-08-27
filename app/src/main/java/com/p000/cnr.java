package com.p000;

import android.content.Context;
import com.ninegag.android.app.model.api.ApiBaseResponse;
import com.ninegag.android.app.model.api.ApiReportResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* compiled from: VoteTask */
/* renamed from: cnr */
public class cnr extends cmg {
    /* renamed from: b */
    ArrayList<C1777a> f9881b = new ArrayList();

    /* compiled from: VoteTask */
    /* renamed from: cnr$a */
    static class C1777a {
        /* renamed from: a */
        String f9878a;
        /* renamed from: b */
        String f9879b;
        /* renamed from: c */
        int f9880c;

        C1777a() {
        }

        C1777a(String str, int i, String str2) {
            this.f9878a = str;
            this.f9880c = i;
            this.f9879b = str2;
        }
    }

    /* renamed from: f */
    public dft mo1802f(Context context) {
        dft c = dft.c(m14491g(context));
        cmg.m14468a(c);
        Map hashMap = new HashMap();
        hashMap.put("entryIds", m14825n());
        hashMap.put("scores", m14826r());
        hashMap.put("views", m14827s());
        c.a(hashMap);
        return c;
    }

    /* renamed from: n */
    private String m14825n() {
        StringBuilder stringBuilder = new StringBuilder();
        int size = this.f9881b.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                stringBuilder.append(",");
            }
            stringBuilder.append(((C1777a) this.f9881b.get(i)).f9878a);
        }
        return stringBuilder.toString();
    }

    /* renamed from: r */
    private String m14826r() {
        StringBuilder stringBuilder = new StringBuilder();
        int size = this.f9881b.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                stringBuilder.append(",");
            }
            stringBuilder.append(((C1777a) this.f9881b.get(i)).f9880c);
        }
        return stringBuilder.toString();
    }

    /* renamed from: s */
    private String m14827s() {
        StringBuilder stringBuilder = new StringBuilder();
        int size = this.f9881b.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                stringBuilder.append(",");
            }
            stringBuilder.append(((C1777a) this.f9881b.get(i)).f9879b);
        }
        return stringBuilder.toString();
    }

    /* renamed from: a */
    public void mo1800a(ApiBaseResponse apiBaseResponse) {
        ApiReportResponse apiReportResponse = (ApiReportResponse) apiBaseResponse;
        if (apiReportResponse.success()) {
            for (String b : apiReportResponse.data.entryIds) {
                cij.m13687a().m13715b(b);
            }
        }
    }

    /* renamed from: a */
    public void m14830a(String str, int i, String str2) {
        this.f9881b.add(new C1777a(str, i, str2));
    }

    /* renamed from: m */
    public String mo1806m() {
        return toString();
    }

    /* renamed from: h */
    protected String mo1804h(Context context) {
        return String.format("%s/v2/vote", new Object[]{cae.m12035a()});
    }

    /* renamed from: a */
    protected ApiBaseResponse mo1799a(String str) {
        return (ApiBaseResponse) djm.a(str, ApiReportResponse.class);
    }
}
