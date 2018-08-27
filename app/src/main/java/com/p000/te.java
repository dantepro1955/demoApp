package com.p000;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.applovin.adview.AppLovinConfirmationActivity;

/* renamed from: te */
public class te implements OnClickListener {
    /* renamed from: a */
    final /* synthetic */ AppLovinConfirmationActivity f25545a;

    public te(AppLovinConfirmationActivity appLovinConfirmationActivity) {
        this.f25545a = appLovinConfirmationActivity;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        this.f25545a.finish();
    }
}
