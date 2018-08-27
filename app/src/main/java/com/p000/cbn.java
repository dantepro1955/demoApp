package com.p000;

import android.text.Html;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* compiled from: PollingLanguageItemWrapper */
/* renamed from: cbn */
public class cbn extends cct {
    /* renamed from: c */
    private static WeakHashMap<cld, WeakReference<cbn>> f8619c = new WeakHashMap();
    /* renamed from: a */
    private int f8620a;

    protected cbn(cld cld, int i) {
        super(cld);
        this.f8620a = i;
    }

    /* renamed from: a */
    public static cbn m12304a(cld cld, int i) {
        cbn cbn;
        WeakReference weakReference = (WeakReference) f8619c.get(cld);
        if (weakReference != null) {
            cbn = (cbn) weakReference.get();
            if (cbn != null) {
                return cbn;
            }
        }
        cbn = new cbn(cld, i);
        f8619c.put(cld, new WeakReference(cbn));
        return cbn;
    }

    /* renamed from: a */
    public void m12306a(int i) {
        this.f8620a = i;
    }

    /* renamed from: a */
    public String mo1639a() {
        return Html.fromHtml(((cld) R()).m12626d()).toString();
    }

    /* renamed from: b */
    public String m12307b() {
        return ((cld) R()).m12629e();
    }

    /* renamed from: c */
    public int m12308c() {
        return this.f8620a;
    }
}
