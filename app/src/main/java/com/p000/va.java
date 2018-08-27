package com.p000;

import android.util.Log;
import android.view.View;
import android.view.View.OnLongClickListener;

/* renamed from: va */
class va implements OnLongClickListener {
    /* renamed from: a */
    final /* synthetic */ uy f25661a;

    va(uy uyVar) {
        this.f25661a = uyVar;
    }

    public boolean onLongClick(View view) {
        Log.d("AdWebView", "Received a LongClick event.");
        return true;
    }
}
