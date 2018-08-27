package com.p000;

import android.content.Context;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.View;

/* compiled from: BaseFragmentActivityHoneycomb */
/* renamed from: dh */
public abstract class dh extends dg {
    dh() {
    }

    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View dispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(view, str, context, attributeSet);
        if (dispatchFragmentsOnCreateView != null || VERSION.SDK_INT < 11) {
            return dispatchFragmentsOnCreateView;
        }
        return super.onCreateView(view, str, context, attributeSet);
    }
}
