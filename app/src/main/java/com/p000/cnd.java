package com.p000;

import android.content.Context;
import com.ninegag.android.app.model.api.ApiBaseResponse;
import com.ninegag.android.app.model.api.ApiReportResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* compiled from: ReportTask */
/* renamed from: cnd */
public class cnd extends cmg {
    /* renamed from: b */
    ArrayList<C1774a> f9831b = new ArrayList();

    /* compiled from: ReportTask */
    /* renamed from: cnd$a */
    static class C1774a {
        /* renamed from: a */
        String f9828a;
        /* renamed from: b */
        String f9829b;
        /* renamed from: c */
        int f9830c;

        C1774a() {
        }

        C1774a(String str, int i, String str2) {
            this.f9828a = str;
            this.f9830c = i;
            this.f9829b = str2;
        }
    }

    /* renamed from: a */
    public void mo1800a(ApiBaseResponse apiBaseResponse) {
        ApiReportResponse apiReportResponse = (ApiReportResponse) apiBaseResponse;
        if (apiReportResponse.success()) {
            for (String str : apiReportResponse.data.entryIds) {
                cld i = cij.m13687a().f9370c.m13832i(str);
                cij.m13687a().m13720c(str);
                cij.m13687a().f9370c.m13819a(i.m12619b().longValue(), true);
            }
        }
    }

    /* renamed from: a */
    public void m14700a(String str, int i, String str2) {
        this.f9831b.add(new C1774a(str, i, str2));
    }

    /* renamed from: f */
    public dft mo1802f(Context context) {
        dft c = dft.c(m14491g(context));
        cmg.m14468a(c);
        Map hashMap = new HashMap();
        hashMap.put("entryIds", m14695n());
        hashMap.put("reasons", m14696r());
        hashMap.put("views", m14697s());
        c.a(hashMap);
        return c;
    }

    /* renamed from: m */
    public String mo1806m() {
        return null;
    }

    /* renamed from: n */
    private String m14695n() {
        StringBuilder stringBuilder = new StringBuilder();
        int size = this.f9831b.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                stringBuilder.append(",");
            }
            stringBuilder.append(((C1774a) this.f9831b.get(i)).f9828a);
        }
        return stringBuilder.toString();
    }

    /* renamed from: r */
    private String m14696r() {
        StringBuilder stringBuilder = new StringBuilder();
        int size = this.f9831b.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                stringBuilder.append(",");
            }
            stringBuilder.append(((C1774a) this.f9831b.get(i)).f9830c);
        }
        return stringBuilder.toString();
    }

    /* renamed from: s */
    private String m14697s() {
        StringBuilder stringBuilder = new StringBuilder();
        int size = this.f9831b.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                stringBuilder.append(",");
            }
            stringBuilder.append(((C1774a) this.f9831b.get(i)).f9829b);
        }
        return stringBuilder.toString();
    }

    /* renamed from: h */
    protected String mo1804h(Context context) {
        return String.format("%s/v2/report", new Object[]{cae.m12035a()});
    }

    /* renamed from: a */
    protected ApiBaseResponse mo1799a(String str) {
        return (ApiBaseResponse) djm.a(str, ApiReportResponse.class);
    }
}
