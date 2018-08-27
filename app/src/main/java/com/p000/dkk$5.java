package com.p000;

import android.view.View;
import android.view.View.OnClickListener;

/* compiled from: ComposerModule */
/* renamed from: dkk$5 */
class dkk$5 implements OnClickListener {
    /* renamed from: a */
    final /* synthetic */ dkk f21887a;

    dkk$5(dkk dkk) {
        this.f21887a = dkk;
    }

    public void onClick(View view) {
        if (dkk.j(this.f21887a) != null && dkk.j(this.f21887a).isEnabled()) {
            dkk.j(this.f21887a).setChecked(!dkk.j(this.f21887a).isChecked());
        }
    }
}
