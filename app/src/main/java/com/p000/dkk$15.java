package com.p000;

import android.app.Activity;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.EditText;
import p000.dnb.C5004g;

/* compiled from: ComposerModule */
/* renamed from: dkk$15 */
class dkk$15 implements OnClickListener {
    /* renamed from: a */
    final /* synthetic */ EditText f21880a;
    /* renamed from: b */
    final /* synthetic */ dkk f21881b;

    dkk$15(dkk dkk, EditText editText) {
        this.f21881b = dkk;
        this.f21880a = editText;
    }

    public void onClick(View view) {
        if (this.f21881b.g()) {
            Log.d("ComposerModule", "submitBtn::onClick()");
        }
        if ((dkk.g(this.f21881b) == null || dkk.g(this.f21881b).m27717b()) && !bww.a()) {
            final dhi a = dhj.m27298a((ViewGroup) ((Activity) this.f21880a.getContext()).findViewById(16908290), C5004g.permission_comment_never_asked, "android.permission.WRITE_EXTERNAL_STORAGE");
            bww.a(new bxm(new bxo[]{new bxo(this) {
                /* renamed from: b */
                final /* synthetic */ dkk$15 f21879b;

                /* renamed from: a */
                public void m27711a(bxi bxi) {
                    this.f21879b.f21881b.u().m27736i();
                    this.f21879b.f21881b.R();
                }

                /* renamed from: a */
                public void m27710a(bxh bxh) {
                    a.m27297a(bxh);
                }

                /* renamed from: a */
                public void m27712a(bxj bxj, bxe bxe) {
                    bxe.a();
                }
            }}), "android.permission.WRITE_EXTERNAL_STORAGE");
        }
    }
}
