package com.p000;

import android.app.Activity;
import java.lang.ref.WeakReference;

/* renamed from: tz */
public class tz {
    /* renamed from: a */
    private static final Object f25598a = new Object();
    /* renamed from: b */
    private static WeakReference f25599b = new WeakReference(null);
    /* renamed from: c */
    private static WeakReference f25600c = new WeakReference(null);

    /* renamed from: a */
    public tc m34238a(zl zlVar, Activity activity) {
        tc tcVar;
        if (zlVar == null) {
            zlVar = zl.m34380c(activity);
        }
        synchronized (f25598a) {
            tcVar = (ug) f25599b.get();
            if (tcVar != null && tcVar.m34269g() && f25600c.get() == activity) {
                zlVar.mo5561g().mo5610c("InterstitialAdDialogCreator", "An interstitial dialog is already showing, returning it");
            } else {
                tcVar = new ug(zlVar, activity);
                f25599b = new WeakReference(tcVar);
                f25600c = new WeakReference(activity);
            }
        }
        return tcVar;
    }
}
