package com.p000;

import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import p000.dnb.C5004g;

/* compiled from: ComposerModule */
/* renamed from: dkk$1 */
class dkk$1 implements OnClickListener {
    /* renamed from: a */
    final /* synthetic */ dkk f21883a;

    dkk$1(dkk dkk) {
        this.f21883a = dkk;
    }

    public void onClick(View view) {
        if (this.f21883a.g()) {
            Log.d("ComposerModule", "mediaSourceBtn::onClick()");
        }
        if (!bww.a()) {
            final dhi a = dhj.m27298a((ViewGroup) view.getRootView(), C5004g.permission_upload_photo_never_asked, "android.permission.WRITE_EXTERNAL_STORAGE");
            bww.a(new bxm(new bxo[]{new bxo(this) {
                /* renamed from: b */
                final /* synthetic */ dkk$1 f21870b;

                /* renamed from: a */
                public void m27705a(bxi bxi) {
                    dkk.a(this.f21870b.f21883a);
                }

                /* renamed from: a */
                public void m27704a(bxh bxh) {
                    a.m27297a(bxh);
                }

                /* renamed from: a */
                public void m27706a(bxj bxj, bxe bxe) {
                    bxe.a();
                }
            }}), "android.permission.WRITE_EXTERNAL_STORAGE");
        }
    }
}
