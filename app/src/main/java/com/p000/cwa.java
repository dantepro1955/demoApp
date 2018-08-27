package com.p000;

import android.content.Context;
import android.content.Intent;
import com.facebook.GraphResponse;
import com.ninegag.android.app.GagApplication;
import com.ninegag.android.tv.model.api.ApiResponse;
import java.net.UnknownHostException;
import java.util.HashMap;
import p000.dft.C4882b;

/* compiled from: ApiTask */
/* renamed from: cwa */
public abstract class cwa extends cvy {
    /* renamed from: b */
    protected caf f20350b = caf.a();
    /* renamed from: c */
    private String f20351c = null;
    /* renamed from: d */
    private cvw f20352d = new cvw(this.f20350b.t().mo4407a("http://api.9gag.tv"));

    /* renamed from: a */
    protected abstract ApiResponse mo4175a(String str);

    /* renamed from: a */
    protected abstract void mo4176a(Context context, ApiResponse apiResponse);

    /* renamed from: c */
    protected abstract dft mo4177c(Context context);

    /* renamed from: b */
    protected final void mo4174b(Context context) {
        Object obj = 1;
        if (m25183e(context)) {
            Object obj2 = null;
            try {
                dft c = mo4177c(context);
                m25176b(c);
                mo4178a(c);
                if (c == null) {
                    obj2 = 1;
                } else {
                    c.m27101b(5000);
                    c.m27082a(30000);
                }
                if (obj2 == null && !chp.c(context)) {
                    obj2 = 1;
                }
                if (obj2 == null) {
                    try {
                        ApiResponse a = mo4175a(c.m27114e());
                        if (a != null) {
                            if (a.isSuccess()) {
                                mo4176a(context, a);
                                m25175b(context, a);
                            } else {
                                this.f20351c = a.meta.error_message;
                            }
                        }
                    } catch (Exception e) {
                    }
                    if (obj != null) {
                        m25181d(context);
                    }
                }
                obj = obj2;
            } catch (Exception e2) {
                if ((e2 instanceof C4882b) && (e2.getCause() instanceof UnknownHostException)) {
                    chn.f(e2.getMessage());
                }
            }
            if (obj != null) {
                m25181d(context);
            }
        }
    }

    /* renamed from: a */
    protected void mo4178a(dft dft) {
    }

    /* renamed from: b */
    protected boolean mo4179b() {
        return true;
    }

    /* renamed from: b */
    protected void m25176b(dft dft) {
        if (mo4179b()) {
            dft.m27087a("X-REQUEST-TOKEN", caf.a().l().m25126c());
        }
        long currentTimeMillis = System.currentTimeMillis();
        String n = caf.a().h().n();
        dft.m27087a("X-TIMESTAMP", "" + currentTimeMillis);
        dft.m27087a("X-PACKAGE-ID", "com.ninegag.android.tv");
        dft.m27087a("X-DEVICE-UUID", n);
        dft.m27086a("X-Package-Version", Integer.valueOf(GagApplication.f16515c));
        dft.m27087a("X-DEVICE-TYPE", "Android");
        dft.m27087a("X-REQUEST-SIGNATURE", djj.m27575a(djj.m27580d("SIGNATURE_" + currentTimeMillis + "_" + "com.ninegag.android.tv" + "_" + n)));
    }

    /* renamed from: a */
    protected void m25172a(Context context, ApiResponse apiResponse, Intent intent) {
    }

    /* renamed from: a */
    protected void m25170a(Context context, Intent intent) {
    }

    /* renamed from: b */
    protected void m25175b(Context context, ApiResponse apiResponse) {
        Intent a = m25161a();
        a.putExtra(GraphResponse.SUCCESS_KEY, true);
        m25172a(context, apiResponse, a);
        m25164a(a);
    }

    /* renamed from: d */
    protected void m25181d(Context context) {
        Intent a = m25161a();
        a.putExtra(GraphResponse.SUCCESS_KEY, false);
        a.putExtra("msg", this.f20351c);
        m25170a(context, a);
        m25164a(a);
    }

    /* renamed from: c */
    protected bub m25178c() {
        return new buc().a();
    }

    /* renamed from: d */
    protected HashMap<String, String> m25180d() {
        return new HashMap();
    }

    /* renamed from: e */
    protected boolean m25183e(Context context) {
        return true;
    }

    /* renamed from: e */
    protected cvw m25182e() {
        return this.f20352d;
    }
}
