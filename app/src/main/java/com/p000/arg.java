package com.p000;

import com.google.android.gms.common.ConnectionResult;
import java.util.Set;

/* renamed from: arg */
public final class arg {
    /* renamed from: a */
    private final hh<bps<?>, ConnectionResult> f4029a = new hh();
    /* renamed from: b */
    private final bsk<Void> f4030b = new bsk();
    /* renamed from: c */
    private int f4031c;
    /* renamed from: d */
    private boolean f4032d = false;

    public arg(Iterable<? extends aoa<?>> iterable) {
        for (aoa b : iterable) {
            this.f4029a.put(b.m4604b(), null);
        }
        this.f4031c = this.f4029a.keySet().size();
    }

    /* renamed from: a */
    public Set<bps<?>> m5103a() {
        return this.f4029a.keySet();
    }

    /* renamed from: a */
    public void m5104a(bps<?> bps, ConnectionResult connectionResult) {
        this.f4029a.put(bps, connectionResult);
        this.f4031c--;
        if (!connectionResult.m19505b()) {
            this.f4032d = true;
        }
        if (this.f4031c != 0) {
            return;
        }
        if (this.f4032d) {
            this.f4030b.m10648a(new anz(this.f4029a));
            return;
        }
        this.f4030b.m10649a(null);
    }

    /* renamed from: b */
    public bsj<Void> m5105b() {
        return this.f4030b.m10647a();
    }

    /* renamed from: c */
    public void m5106c() {
        this.f4030b.m10649a(null);
    }
}
