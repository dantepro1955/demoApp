package com.p000;

import android.os.Looper;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: ask */
public class ask {
    /* renamed from: a */
    private final Set<asj<?>> f4254a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: b */
    public static <L> asj<L> m5483b(L l, Looper looper, String str) {
        aoi.m4680a((Object) l, (Object) "Listener must not be null");
        aoi.m4680a((Object) looper, (Object) "Looper must not be null");
        aoi.m4680a((Object) str, (Object) "Listener type must not be null");
        return new asj(looper, l, str);
    }

    /* renamed from: a */
    public <L> asj<L> m5484a(L l, Looper looper) {
        return m5485a(l, looper, "NO_TYPE");
    }

    /* renamed from: a */
    public <L> asj<L> m5485a(L l, Looper looper, String str) {
        asj<L> b = ask.m5483b(l, looper, str);
        this.f4254a.add(b);
        return b;
    }

    /* renamed from: a */
    public void m5486a() {
        for (asj a : this.f4254a) {
            a.m5480a();
        }
        this.f4254a.clear();
    }
}
