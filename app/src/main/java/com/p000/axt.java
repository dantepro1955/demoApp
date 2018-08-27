package com.p000;

import android.content.Context;
import android.net.Uri;
import android.view.MotionEvent;
import com.google.android.gms.ads.identifier.AdvertisingIdClient.Info;
import p000.axv.C0875a;

@bhd
/* renamed from: axt */
public final class axt extends C0875a {
    /* renamed from: a */
    private final avb f4909a;
    /* renamed from: b */
    private final avc f4910b;
    /* renamed from: c */
    private final auz f4911c;
    /* renamed from: d */
    private boolean f4912d = false;

    public axt(String str, Context context, boolean z) {
        this.f4909a = avb.m5922a(str, context, z);
        this.f4910b = new avc(this.f4909a);
        this.f4911c = z ? null : auz.m5916b(context);
    }

    /* renamed from: a */
    private aqq m6399a(aqq aqq, aqq aqq2, boolean z) {
        try {
            Uri uri = (Uri) aqr.m4968a(aqq);
            Context context = (Context) aqr.m4968a(aqq2);
            return aqr.m4967a(z ? this.f4910b.m5927a(uri, context) : this.f4910b.m5934b(uri, context));
        } catch (avd e) {
            return null;
        }
    }

    /* renamed from: a */
    public aqq mo827a(aqq aqq, aqq aqq2) {
        return m6399a(aqq, aqq2, true);
    }

    /* renamed from: a */
    public String mo828a() {
        return "ms";
    }

    /* renamed from: a */
    public String mo829a(aqq aqq, String str) {
        return this.f4909a.m5781a((Context) aqr.m4968a(aqq), str);
    }

    /* renamed from: a */
    public String mo830a(aqq aqq, byte[] bArr) {
        Context context = (Context) aqr.m4968a(aqq);
        String a = this.f4909a.m5783a(context, bArr);
        if (this.f4911c == null || !this.f4912d) {
            return a;
        }
        String a2 = this.f4911c.m5918a(a, this.f4911c.m5783a(context, bArr));
        this.f4912d = false;
        return a2;
    }

    /* renamed from: a */
    public void mo831a(String str) {
        this.f4910b.m5931a(str);
    }

    /* renamed from: a */
    public void mo832a(String str, String str2) {
        this.f4910b.m5932a(str, str2);
    }

    /* renamed from: a */
    public boolean mo833a(aqq aqq) {
        return this.f4910b.m5933a((Uri) aqr.m4968a(aqq));
    }

    /* renamed from: a */
    public boolean mo834a(String str, boolean z) {
        if (this.f4911c == null) {
            return false;
        }
        this.f4911c.m5920a(new Info(str, z));
        this.f4912d = true;
        return true;
    }

    /* renamed from: b */
    public aqq mo835b(aqq aqq, aqq aqq2) {
        return m6399a(aqq, aqq2, false);
    }

    /* renamed from: b */
    public boolean mo836b(aqq aqq) {
        return this.f4910b.m5936c((Uri) aqr.m4968a(aqq));
    }

    /* renamed from: c */
    public String mo837c(aqq aqq) {
        return mo830a(aqq, null);
    }

    /* renamed from: d */
    public void mo838d(aqq aqq) {
        this.f4910b.m5930a((MotionEvent) aqr.m4968a(aqq));
    }
}
