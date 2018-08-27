package com.p000;

import android.content.Context;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;

/* compiled from: NoSaveStateFrameLayout */
/* renamed from: ea */
public class ea extends FrameLayout {
    /* renamed from: a */
    public static ViewGroup m29927a(View view) {
        ViewGroup eaVar = new ea(view.getContext());
        LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            eaVar.setLayoutParams(layoutParams);
        }
        view.setLayoutParams(new LayoutParams(-1, -1));
        eaVar.addView(view);
        return eaVar;
    }

    public ea(Context context) {
        super(context);
    }

    protected void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    protected void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }
}
