package com.p000;

import android.content.Context;
import android.content.Intent;
import com.facebook.GraphResponse;
import com.millennialmedia.InterstitialAd.InterstitialErrorStatus;
import com.ninegag.android.app.model.api.ApiBaseResponse;
import com.ninegag.android.app.model.api.ApiNotifResponse;
import com.ninegag.android.app.model.api.ApiNotifResponse.Item;

/* compiled from: GetNotifTask */
/* renamed from: cmt */
public class cmt extends cmg {
    /* renamed from: b */
    private final caf f9806b = caf.m12046a();
    /* renamed from: c */
    private int f9807c = 0;

    public cmt(int i) {
        this.f9807c = i;
    }

    /* renamed from: a */
    protected boolean mo1812a() {
        if (this.f9807c == 1 && this.f9806b.m12077h().bf()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public void mo1800a(ApiBaseResponse apiBaseResponse) {
        boolean z = true;
        ApiNotifResponse apiNotifResponse = (ApiNotifResponse) apiBaseResponse;
        if (this.f9807c == 0) {
            this.f9806b.m12075g().m13738m();
        }
        for (Item item : apiNotifResponse.data.items) {
            if (item != null) {
                ckp a = cko.m14207a(item);
                a.f9596h = 2;
                this.f9806b.m12075g().m13704a(a);
            }
        }
        cip h = this.f9806b.m12077h();
        if (apiNotifResponse.data.didEndOfList != 1) {
            z = false;
        }
        h.m13964z(z);
        this.f9806b.m12077h().m13948u(apiNotifResponse.data.nextKey);
    }

    /* renamed from: a */
    protected ApiBaseResponse mo1799a(String str) {
        return (ApiNotifResponse) cpy.a(str, ApiNotifResponse.class, 2);
    }

    /* renamed from: f */
    protected dft mo1802f(Context context) {
        dft b = dft.b(m14491g(context));
        cmg.m14468a(b);
        return b;
    }

    /* renamed from: h */
    protected String mo1804h(Context context) {
        String format = String.format("%s/v2/user-notifications/locale/%s", new Object[]{cae.m12035a(), djo.a()});
        if (this.f9807c != 0 && this.f9807c == 1) {
            return format + "?refKey=" + this.f9806b.m12077h().bd();
        }
        return format;
    }

    /* renamed from: m */
    public String mo1806m() {
        return null;
    }

    /* renamed from: d */
    public void mo1810d(Context context) {
        Intent g = mo1798g();
        g.putExtra(GraphResponse.SUCCESS_KEY, true);
        g.putExtra("command", InterstitialErrorStatus.NOT_LOADED);
        g.putExtra("type", this.f9807c);
        m14474a(context, g);
    }

    /* renamed from: c */
    public void mo1809c(Context context) {
        Intent g = mo1798g();
        g.putExtra(GraphResponse.SUCCESS_KEY, false);
        g.putExtra("command", InterstitialErrorStatus.NOT_LOADED);
        g.putExtra("type", this.f9807c);
        m14474a(context, g);
    }
}
