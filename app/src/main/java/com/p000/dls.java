package com.p000;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: AggregateProgressListener */
/* renamed from: dls */
public class dls implements cye {
    /* renamed from: a */
    public static HashMap<String, WeakReference<dls>> f22104a = new HashMap();
    /* renamed from: b */
    private ArrayList<cye> f22105b = new ArrayList();

    /* renamed from: a */
    public static dls m27903a(String str) {
        dls dls;
        WeakReference weakReference = (WeakReference) f22104a.get(str);
        if (weakReference != null) {
            dls = (dls) weakReference.get();
            if (dls != null) {
                return dls;
            }
        }
        dls = new dls();
        f22104a.put(str, new WeakReference(dls));
        return dls;
    }

    /* renamed from: a */
    public dls m27904a(cye cye) {
        this.f22105b.add(cye);
        return this;
    }
}
