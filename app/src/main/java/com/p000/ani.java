package com.p000;

import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.os.Bundle;

/* renamed from: ani */
public class ani extends DialogFragment {
    /* renamed from: a */
    private Dialog f3769a = null;
    /* renamed from: b */
    private OnCancelListener f3770b = null;

    /* renamed from: a */
    public static ani m4516a(Dialog dialog, OnCancelListener onCancelListener) {
        ani ani = new ani();
        Dialog dialog2 = (Dialog) aoi.m4680a((Object) dialog, (Object) "Cannot display null dialog");
        dialog2.setOnCancelListener(null);
        dialog2.setOnDismissListener(null);
        ani.f3769a = dialog2;
        if (onCancelListener != null) {
            ani.f3770b = onCancelListener;
        }
        return ani;
    }

    public void onCancel(DialogInterface dialogInterface) {
        if (this.f3770b != null) {
            this.f3770b.onCancel(dialogInterface);
        }
    }

    public Dialog onCreateDialog(Bundle bundle) {
        if (this.f3769a == null) {
            setShowsDialog(false);
        }
        return this.f3769a;
    }

    public void show(FragmentManager fragmentManager, String str) {
        super.show(fragmentManager, str);
    }
}
