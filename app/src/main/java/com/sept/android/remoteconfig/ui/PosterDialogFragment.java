package com.sept.android.remoteconfig.ui;

import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import p000.dka;
import p000.dmi.C4986b;
import p000.dmi.C4988d;
import p000.dmw;
import p000.dmw.C4517a;

public class PosterDialogFragment extends DialogFragment implements C4517a {
    /* renamed from: a */
    OnClickListener f19886a = new C45161(this);
    /* renamed from: b */
    private dmw f19887b;

    /* renamed from: com.sept.android.remoteconfig.ui.PosterDialogFragment$1 */
    class C45161 implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ PosterDialogFragment f19885a;

        C45161(PosterDialogFragment posterDialogFragment) {
            this.f19885a = posterDialogFragment;
        }

        public void onClick(View view) {
            this.f19885a.dismissAllowingStateLoss();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (this.f19887b == null) {
            dismissAllowingStateLoss();
        } else {
            setStyle(2, C4988d.FancyDialogTheme);
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (this.f19887b == null) {
            return null;
        }
        View a = this.f19887b.m28125a(getActivity(), (C4517a) this);
        View a2 = dka.m27651a(a, C4986b.backdrop);
        if (a2 == null) {
            return a;
        }
        a2.setOnClickListener(this.f19886a);
        return a;
    }

    /* renamed from: a */
    public void m24207a(dmw dmw) {
        this.f19887b = dmw;
    }

    /* renamed from: a */
    public void mo4098a() {
        dismissAllowingStateLoss();
    }

    public void dismissAllowingStateLoss() {
        super.dismissAllowingStateLoss();
        if (this.f19887b != null) {
            this.f19887b.m28128c();
        }
    }
}
