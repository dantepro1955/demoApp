package com.p000;

import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import p000.dnb.C5004g;

/* compiled from: ComposerModule */
/* renamed from: dkk$11 */
class dkk$11 implements OnClickListener {
    /* renamed from: a */
    final /* synthetic */ dkk f21874a;

    dkk$11(dkk dkk) {
        this.f21874a = dkk;
    }

    public void onClick(View view) {
        if (this.f21874a.g()) {
            Log.d("ComposerModule", "chooserDialogBtn::onClick()");
        }
        if (!bww.a()) {
            final dhi a = dhj.m27298a((ViewGroup) view.getRootView(), C5004g.permission_upload_photo_never_asked, "android.permission.WRITE_EXTERNAL_STORAGE");
            bww.a(new bxm(new bxo[]{new bxo(this) {
                /* renamed from: b */
                final /* synthetic */ dkk$11 f21873b;

                /* renamed from: a */
                public void m27708a(bxi bxi) {
                    dkk.d(this.f21873b.f21874a);
                }

                /* renamed from: a */
                public void m27707a(bxh bxh) {
                    a.m27297a(bxh);
                }

                /* renamed from: a */
                public void m27709a(bxj bxj, bxe bxe) {
                    bxe.a();
                }
            }}), "android.permission.WRITE_EXTERNAL_STORAGE");
        }
    }
}
