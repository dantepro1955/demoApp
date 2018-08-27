package com.p000;

import com.google.android.gms.common.api.Status;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.WeakHashMap;
import p000.anq.C0650a;

/* renamed from: arq */
public class arq {
    /* renamed from: a */
    private final Map<ark<?>, Boolean> f4089a = Collections.synchronizedMap(new WeakHashMap());
    /* renamed from: b */
    private final Map<bsk<?>, Boolean> f4090b = Collections.synchronizedMap(new WeakHashMap());

    /* renamed from: a */
    private void m5229a(boolean z, Status status) {
        synchronized (this.f4089a) {
            Map hashMap = new HashMap(this.f4089a);
        }
        synchronized (this.f4090b) {
            Map hashMap2 = new HashMap(this.f4090b);
        }
        for (Entry entry : hashMap.entrySet()) {
            if (z || ((Boolean) entry.getValue()).booleanValue()) {
                ((ark) entry.getKey()).m2685d(status);
            }
        }
        for (Entry entry2 : hashMap2.entrySet()) {
            if (z || ((Boolean) entry2.getValue()).booleanValue()) {
                ((bsk) entry2.getKey()).m10650b(new any(status));
            }
        }
    }

    /* renamed from: a */
    void m5230a(final ark<? extends ant> ark, boolean z) {
        this.f4089a.put(ark, Boolean.valueOf(z));
        ark.mo345a(new C0650a(this) {
            /* renamed from: b */
            final /* synthetic */ arq f4088b;

            /* renamed from: a */
            public void mo651a(Status status) {
                this.f4088b.f4089a.remove(ark);
            }
        });
    }

    /* renamed from: a */
    boolean m5231a() {
        return (this.f4089a.isEmpty() && this.f4090b.isEmpty()) ? false : true;
    }

    /* renamed from: b */
    public void m5232b() {
        m5229a(false, asa.f4220a);
    }

    /* renamed from: c */
    public void m5233c() {
        m5229a(true, asw.f4290a);
    }
}
