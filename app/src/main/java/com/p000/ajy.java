package com.p000;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.zzmp;
import p000.bjt.C1254a;

@bhd
/* renamed from: ajy */
public class ajy {
    /* renamed from: a */
    private final Context f1756a;
    /* renamed from: b */
    private final zzmp f1757b;
    /* renamed from: c */
    private boolean f1758c;

    public ajy(Context context) {
        this(context, false);
    }

    public ajy(Context context, C1254a c1254a) {
        this.f1756a = context;
        if (c1254a == null || c1254a.f6530b.f15064G == null) {
            this.f1757b = new zzmp();
        } else {
            this.f1757b = c1254a.f6530b.f15064G;
        }
    }

    public ajy(Context context, boolean z) {
        this.f1756a = context;
        this.f1757b = new zzmp(z);
    }

    /* renamed from: a */
    public void m2066a() {
        this.f1758c = true;
    }

    /* renamed from: a */
    public void m2067a(String str) {
        if (str == null) {
            str = "";
        }
        bky.m9010d("Action was blocked because no touch was detected.");
        if (this.f1757b.f15101a && this.f1757b.f15102b != null) {
            for (String str2 : this.f1757b.f15102b) {
                if (!TextUtils.isEmpty(str2)) {
                    ako.m2343e().m9122b(this.f1756a, "", str2.replace("{NAVIGATION_URL}", Uri.encode(str)));
                }
            }
        }
    }

    /* renamed from: b */
    public boolean m2068b() {
        return !this.f1757b.f15101a || this.f1758c;
    }
}
