package com.p000;

import android.os.Bundle;
import android.view.ViewGroup;
import com.ninegag.android.app.R;
import com.ninegag.android.app.otto.ApiGotUploadQuotaEvent;
import com.ninegag.android.app.otto.actionbar.AbUploadClickedEvent;
import com.ninegag.android.app.ui.BaseNavActivity;

/* compiled from: UploadQuotaController */
/* renamed from: cht */
public class cht {
    /* renamed from: a */
    private static caf f9281a = caf.m12046a();
    /* renamed from: b */
    private boolean f9282b = false;
    /* renamed from: c */
    private String f9283c;
    /* renamed from: d */
    private BaseNavActivity f9284d;

    /* renamed from: a */
    public void m13605a(BaseNavActivity baseNavActivity) {
        if (caf.m12046a().m12087q().m14410s()) {
            ctx.b(baseNavActivity);
        } else {
            ctx.a(baseNavActivity);
        }
        this.f9284d = baseNavActivity;
        f9281a.m12066c((Object) this);
    }

    /* renamed from: a */
    public void m13603a() {
        f9281a.m12074f((Object) this);
        this.f9284d = null;
    }

    /* renamed from: a */
    public void m13604a(Bundle bundle) {
        bundle.putBoolean("gmc_pending_upload_mode", this.f9282b);
    }

    /* renamed from: b */
    public void m13608b(Bundle bundle) {
        if (bundle != null) {
            this.f9282b = bundle.getBoolean("gmc_pending_upload_mode", false);
        }
    }

    /* renamed from: b */
    public void m13607b() {
        if (!this.f9282b) {
            return;
        }
        if (!f9281a.m12094x().m12104c()) {
            this.f9282b = false;
        } else if (f9281a.m12077h().af() > 0) {
            m13601b(this.f9283c);
            this.f9282b = false;
        } else {
            this.f9284d.showLoadingDialog(R.string.checking_upload_quota);
            f9281a.m12079i().m13588l(-1);
        }
    }

    /* renamed from: a */
    public void m13606a(String str) {
        if (f9281a.m12077h().af() <= 0) {
            long r = f9281a.m12077h().m14013r();
            if (this.f9284d != null) {
                if (r == -1) {
                    this.f9284d.getDialogHelper().m14937d(m13600a((int) R.string.upload_quota_exceeded_unknown_time));
                } else if (r == 0) {
                    this.f9284d.getDialogHelper().m14935c(str);
                } else {
                    String format = String.format(m13600a((int) R.string.upload_quota_exceeded_fs), new Object[]{ctn.b(this.f9284d, r)});
                    crd.a(this.f9284d, (r * 1000) + System.currentTimeMillis());
                    this.f9284d.getDialogHelper().m14937d(format);
                }
            }
            f9281a.m12079i().m13588l(-1);
        } else if (this.f9284d != null) {
            this.f9284d.getDialogHelper().m14935c(str);
        }
    }

    /* renamed from: b */
    private void m13601b(String str) {
        if (f9281a.m12094x().m12104c()) {
            m13602c(str);
        } else {
            this.f9282b = true;
            cre.a(this.f9284d);
        }
        this.f9283c = str;
    }

    @dhg
    public void onApiGotUploadQuota(ApiGotUploadQuotaEvent apiGotUploadQuotaEvent) {
        if (this.f9282b) {
            this.f9284d.hideLoadingDialog();
            m13602c(this.f9283c);
            this.f9282b = false;
        }
    }

    @dhg
    public void onAbUploadClicked(AbUploadClickedEvent abUploadClickedEvent) {
        chn.m13445q("Navigation", "TapUpload");
        chn.m13356R(abUploadClickedEvent.f18302a);
        m13601b(abUploadClickedEvent.f18302a);
    }

    /* renamed from: a */
    private String m13600a(int i) {
        if (this.f9284d == null) {
            return "";
        }
        return this.f9284d.getString(i);
    }

    /* renamed from: c */
    private void m13602c(final String str) {
        if (!bww.m11579a()) {
            String str2 = clt.f9698b[0];
            if (this.f9284d != null) {
                final dhi a = dhj.a((ViewGroup) this.f9284d.findViewById(16908290), R.string.permission_upload_photo_never_asked, str2);
                bww.m11577a(new bxm(new bxo(this) {
                    /* renamed from: c */
                    final /* synthetic */ cht f9280c;

                    /* renamed from: a */
                    public void mo1591a(bxi bxi) {
                        ctx.b(this.f9280c.f9284d);
                        this.f9280c.m13606a(str);
                    }

                    /* renamed from: a */
                    public void mo1590a(bxh bxh) {
                        a.a(bxh);
                    }

                    /* renamed from: a */
                    public void mo1592a(bxj bxj, bxe bxe) {
                        bxe.mo1588a();
                    }
                }), str2);
            }
        }
    }
}
