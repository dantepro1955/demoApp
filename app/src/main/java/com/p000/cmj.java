package com.p000;

import android.content.Context;
import android.content.Intent;
import com.facebook.GraphResponse;
import com.ninegag.android.app.model.api.ApiAvatarResponse;
import com.ninegag.android.app.model.api.ApiBaseResponse;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

/* compiled from: ChangeAvatarTask */
/* renamed from: cmj */
public class cmj extends cmg {
    /* renamed from: b */
    private int f9766b;
    /* renamed from: c */
    private String f9767c;

    public cmj(int i, String str) {
        this.f9766b = i;
        this.f9767c = str;
    }

    /* renamed from: a */
    public void mo1800a(ApiBaseResponse apiBaseResponse) {
        ApiAvatarResponse apiAvatarResponse = (ApiAvatarResponse) apiBaseResponse;
        ckn g = cij.m13687a().m13729g();
        g.f9588y = apiAvatarResponse.data.avatar.avatarUrlMedium;
        g.f9589z = apiAvatarResponse.data.avatar.avatarUrlSmall;
        g.f9560A = apiAvatarResponse.data.avatar.avatarUrlTiny;
        cij.m13687a().m13703a(g);
    }

    /* renamed from: d */
    public void mo1810d(Context context) {
        Intent g = mo1798g();
        g.putExtra("command", 701);
        g.putExtra(GraphResponse.SUCCESS_KEY, true);
        m14474a(context, g);
    }

    /* renamed from: c */
    public void mo1809c(Context context) {
        Intent g = mo1798g();
        g.putExtra("command", 701);
        g.putExtra(GraphResponse.SUCCESS_KEY, false);
        m14474a(context, g);
    }

    /* renamed from: a */
    protected ApiBaseResponse mo1799a(String str) {
        return (ApiBaseResponse) djm.a(str, ApiAvatarResponse.class);
    }

    /* renamed from: f */
    protected dft mo1802f(Context context) {
        dft c = dft.c(m14491g(context));
        cmg.m14468a(c);
        Map hashMap = new HashMap();
        if (this.f9766b == 0) {
            hashMap.put("avatarMethod", "random");
            c.a(hashMap);
        } else if (this.f9766b == 1) {
            hashMap.put("avatarMethod", "remove");
            c.a(hashMap);
        } else if (this.f9766b == 2) {
            File file = new File(this.f9767c);
            c.a("avatar", file.getName(), file);
        }
        return c;
    }

    /* renamed from: h */
    protected String mo1804h(Context context) {
        return String.format("%s/v2/user-change-avatar", new Object[]{cae.m12035a()});
    }

    /* renamed from: m */
    public String mo1806m() {
        return "user-change-avatar";
    }
}
