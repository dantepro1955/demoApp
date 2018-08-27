package com.p000;

import android.content.Context;
import android.content.Intent;
import com.facebook.GraphResponse;
import com.ninegag.android.app.model.api.ApiBaseResponse;
import com.ninegag.android.app.model.api.ApiLatestEntryIdsResponse;
import java.util.List;

/* compiled from: GetLatestEntryIdsTask */
/* renamed from: cms */
public class cms extends cmg {
    /* renamed from: b */
    private static caf f9801b = caf.m12046a();
    /* renamed from: c */
    private String f9802c;
    /* renamed from: d */
    private int f9803d;
    /* renamed from: e */
    private String f9804e;
    /* renamed from: f */
    private String f9805f;

    public cms(String str, int i, String str2) {
        this.f9805f = str;
        this.f9803d = i;
        this.f9802c = str2;
        this.f9804e = cco.m12557a(i, str2);
    }

    /* renamed from: a */
    public void mo1800a(ApiBaseResponse apiBaseResponse) {
        List<String> a = f9801b.m12075g().f9370c.m13816a(this.f9804e, 3);
        if (a.size() == 0) {
            f9801b.m12077h().m13979a(this.f9803d, this.f9802c, 0);
            return;
        }
        String[] strArr = ((ApiLatestEntryIdsResponse) apiBaseResponse).data.entryIds;
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            String str = strArr[i];
            for (String equals : a) {
                if (str.equals(equals)) {
                    f9801b.m12077h().m13979a(this.f9803d, this.f9802c, i);
                    return;
                }
            }
        }
        f9801b.m12077h().m13979a(this.f9803d, this.f9802c, strArr.length);
    }

    /* renamed from: a */
    protected ApiBaseResponse mo1799a(String str) {
        return (ApiLatestEntryIdsResponse) cpy.a(str, ApiLatestEntryIdsResponse.class, 2);
    }

    /* renamed from: f */
    protected dft mo1802f(Context context) {
        dft b = dft.b(m14491g(context));
        cmg.m14468a(b);
        return b;
    }

    /* renamed from: h */
    protected String mo1804h(Context context) {
        return String.format("%s/v2/latest-entry-ids/group/%s/type/%s/entryTypes/%s", new Object[]{cae.m12035a(), this.f9802c, cqa.a(this.f9803d), cps.a()});
    }

    /* renamed from: m */
    public String mo1806m() {
        return null;
    }

    /* renamed from: g */
    public Intent mo1798g() {
        Intent g = super.mo1798g();
        g.putExtra("command", 115);
        g.putExtra("group_id", this.f9802c);
        g.putExtra("list_type", this.f9803d);
        g.putExtra("scope", this.f9805f);
        g.putExtra("list_key", this.f9804e);
        return g;
    }

    /* renamed from: c */
    public void mo1809c(Context context) {
        Intent g = mo1798g();
        g.putExtra(GraphResponse.SUCCESS_KEY, false);
        m14474a(context, g);
    }

    /* renamed from: d */
    public void mo1810d(Context context) {
        Intent g = mo1798g();
        g.putExtra(GraphResponse.SUCCESS_KEY, true);
        m14474a(context, g);
    }
}
