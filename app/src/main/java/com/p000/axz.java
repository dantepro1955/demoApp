package com.p000;

import android.content.Context;
import android.view.View;
import com.google.android.gms.internal.zzeg;
import com.google.android.gms.internal.zzqh;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.WeakHashMap;
import p000.aya.C0884a;
import p000.aya.C0887d;

@bhd
/* renamed from: axz */
public class axz implements ayb {
    /* renamed from: a */
    private final Object f4923a = new Object();
    /* renamed from: b */
    private final WeakHashMap<bjt, aya> f4924b = new WeakHashMap();
    /* renamed from: c */
    private final ArrayList<aya> f4925c = new ArrayList();
    /* renamed from: d */
    private final Context f4926d;
    /* renamed from: e */
    private final zzqh f4927e;
    /* renamed from: f */
    private final bee f4928f;

    public axz(Context context, zzqh zzqh, bee bee) {
        this.f4926d = context.getApplicationContext();
        this.f4927e = zzqh;
        this.f4928f = bee;
    }

    /* renamed from: a */
    public void mo845a(aya aya) {
        synchronized (this.f4923a) {
            if (!aya.m6508f()) {
                this.f4925c.remove(aya);
                Iterator it = this.f4924b.entrySet().iterator();
                while (it.hasNext()) {
                    if (((Entry) it.next()).getValue() == aya) {
                        it.remove();
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public void m6450a(zzeg zzeg, bjt bjt) {
        m6451a(zzeg, bjt, bjt.f6547b.mo1305b());
    }

    /* renamed from: a */
    public void m6451a(zzeg zzeg, bjt bjt, View view) {
        m6453a(zzeg, bjt, new C0887d(view, bjt), null);
    }

    /* renamed from: a */
    public void m6452a(zzeg zzeg, bjt bjt, View view, bef bef) {
        m6453a(zzeg, bjt, new C0887d(view, bjt), bef);
    }

    /* renamed from: a */
    public void m6453a(zzeg zzeg, bjt bjt, ayi ayi, bef bef) {
        synchronized (this.f4923a) {
            aya aya;
            if (m6455a(bjt)) {
                aya = (aya) this.f4924b.get(bjt);
            } else {
                aya = new aya(this.f4926d, zzeg, bjt, this.f4927e, ayi);
                aya.m6494a((ayb) this);
                this.f4924b.put(bjt, aya);
                this.f4925c.add(aya);
            }
            if (bef != null) {
                aya.m6495a(new ayc(aya, bef));
            } else {
                aya.m6495a(new ayd(aya, this.f4928f));
            }
        }
    }

    /* renamed from: a */
    public void m6454a(zzeg zzeg, bjt bjt, bby bby) {
        m6453a(zzeg, bjt, new C0884a(bby), null);
    }

    /* renamed from: a */
    public boolean m6455a(bjt bjt) {
        boolean z;
        synchronized (this.f4923a) {
            aya aya = (aya) this.f4924b.get(bjt);
            z = aya != null && aya.m6508f();
        }
        return z;
    }

    /* renamed from: b */
    public void m6456b(bjt bjt) {
        synchronized (this.f4923a) {
            aya aya = (aya) this.f4924b.get(bjt);
            if (aya != null) {
                aya.m6506d();
            }
        }
    }

    /* renamed from: c */
    public void m6457c(bjt bjt) {
        synchronized (this.f4923a) {
            aya aya = (aya) this.f4924b.get(bjt);
            if (aya != null) {
                aya.m6517o();
            }
        }
    }

    /* renamed from: d */
    public void m6458d(bjt bjt) {
        synchronized (this.f4923a) {
            aya aya = (aya) this.f4924b.get(bjt);
            if (aya != null) {
                aya.m6518p();
            }
        }
    }

    /* renamed from: e */
    public void m6459e(bjt bjt) {
        synchronized (this.f4923a) {
            aya aya = (aya) this.f4924b.get(bjt);
            if (aya != null) {
                aya.m6519q();
            }
        }
    }
}
