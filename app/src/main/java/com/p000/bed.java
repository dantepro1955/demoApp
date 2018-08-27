package com.p000;

import android.content.Context;
import com.facebook.ads.AudienceNetworkActivity;
import com.facebook.stetho.common.Utf8Charset;
import com.google.android.gms.internal.zzeg;
import com.google.android.gms.internal.zzqh;
import org.json.JSONObject;
import p000.beb.C1084a;
import p000.blp.C0197a;

@bhd
/* renamed from: bed */
public class bed implements beb {
    /* renamed from: a */
    private final blo f5770a;

    public bed(Context context, zzqh zzqh, avc avc, ajx ajx) {
        this.f5770a = ako.m2344f().m9442a(context, new zzeg(), false, false, avc, zzqh, null, null, ajx);
        this.f5770a.mo1294a().setWillNotDraw(true);
    }

    /* renamed from: a */
    private void m7777a(Runnable runnable) {
        if (azp.m6789a().m9298b()) {
            runnable.run();
        } else {
            bkg.f6710a.post(runnable);
        }
    }

    /* renamed from: a */
    public void mo1019a() {
        this.f5770a.destroy();
    }

    /* renamed from: a */
    public void mo1020a(azd azd, air air, bct bct, aix aix, boolean z, bda bda, bdc bdc, ajy ajy, bfu bfu) {
        this.f5770a.mo1322l().m9411a(azd, air, bct, aix, z, bda, bdc, new ajy(this.f5770a.getContext(), false), bfu, null);
    }

    /* renamed from: a */
    public void mo1021a(final C1084a c1084a) {
        this.f5770a.mo1322l().m9413a(new C0197a(this) {
            /* renamed from: a */
            public void mo193a(blo blo, boolean z) {
                c1084a.mo1016a();
            }
        });
    }

    /* renamed from: a */
    public void mo1022a(String str) {
        final String format = String.format("<!DOCTYPE html><html><head><script src=\"%s\"></script></head><body></body></html>", new Object[]{str});
        m7777a(new Runnable(this) {
            /* renamed from: b */
            final /* synthetic */ bed f5764b;

            public void run() {
                this.f5764b.f5770a.loadData(format, AudienceNetworkActivity.WEBVIEW_MIME_TYPE, Utf8Charset.NAME);
            }
        });
    }

    /* renamed from: a */
    public void mo1023a(String str, bcy bcy) {
        this.f5770a.mo1322l().m9419a(str, bcy);
    }

    /* renamed from: a */
    public void mo1024a(final String str, final String str2) {
        m7777a(new Runnable(this) {
            /* renamed from: c */
            final /* synthetic */ bed f5762c;

            public void run() {
                this.f5762c.f5770a.mo1024a(str, str2);
            }
        });
    }

    /* renamed from: a */
    public void mo1025a(final String str, final JSONObject jSONObject) {
        m7777a(new Runnable(this) {
            /* renamed from: c */
            final /* synthetic */ bed f5759c;

            public void run() {
                this.f5759c.f5770a.mo1025a(str, jSONObject);
            }
        });
    }

    /* renamed from: b */
    public beg mo1026b() {
        return new beh(this);
    }

    /* renamed from: b */
    public void mo1027b(final String str) {
        m7777a(new Runnable(this) {
            /* renamed from: b */
            final /* synthetic */ bed f5768b;

            public void run() {
                this.f5768b.f5770a.loadUrl(str);
            }
        });
    }

    /* renamed from: b */
    public void mo1028b(String str, bcy bcy) {
        this.f5770a.mo1322l().m9424b(str, bcy);
    }

    /* renamed from: b */
    public void mo1029b(String str, JSONObject jSONObject) {
        this.f5770a.mo1029b(str, jSONObject);
    }

    /* renamed from: c */
    public void mo1030c(final String str) {
        m7777a(new Runnable(this) {
            /* renamed from: b */
            final /* synthetic */ bed f5766b;

            public void run() {
                this.f5766b.f5770a.loadData(str, AudienceNetworkActivity.WEBVIEW_MIME_TYPE, Utf8Charset.NAME);
            }
        });
    }
}
