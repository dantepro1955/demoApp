package com.p000;

import android.view.View;
import android.view.View.OnLongClickListener;
import com.ninegag.android.app.ui.HomeActivity;

/* renamed from: cnz */
public final /* synthetic */ class cnz implements OnLongClickListener {
    /* renamed from: a */
    private static final cnz f9903a = new cnz();

    private cnz() {
    }

    /* renamed from: a */
    public static OnLongClickListener m14941a() {
        return f9903a;
    }

    public boolean onLongClick(View view) {
        return HomeActivity.lambda$initDebugLayer$51(view);
    }
}
