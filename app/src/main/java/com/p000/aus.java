package com.p000;

import android.content.ContentProviderClient;
import android.content.Context;
import android.location.Location;
import android.os.RemoteException;
import com.google.android.gms.internal.zzask;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;
import java.util.HashMap;
import java.util.Map;
import p000.asj.C0771b;
import p000.asj.C0772c;
import p000.bqe.C0840a;
import p000.bqf.C0843a;

/* renamed from: aus */
public class aus {
    /* renamed from: a */
    private final aux<auq> f4623a;
    /* renamed from: b */
    private final Context f4624b;
    /* renamed from: c */
    private ContentProviderClient f4625c = null;
    /* renamed from: d */
    private boolean f4626d = false;
    /* renamed from: e */
    private final Map<C0771b<bpw>, C0844b> f4627e = new HashMap();
    /* renamed from: f */
    private final Map<C0771b<bpv>, C0841a> f4628f = new HashMap();

    /* renamed from: aus$a */
    static class C0841a extends C0840a {
        /* renamed from: a */
        private final asj<bpv> f4620a;

        /* renamed from: a */
        public void mo776a(final LocationAvailability locationAvailability) {
            this.f4620a.m5481a(new C0772c<bpv>(this) {
                /* renamed from: a */
                public void mo774a() {
                }

                /* renamed from: a */
                public void m5874a(bpv bpv) {
                    bpv.m10373a(locationAvailability);
                }

                /* renamed from: a */
                public /* synthetic */ void mo775a(Object obj) {
                    m5874a((bpv) obj);
                }
            });
        }

        /* renamed from: a */
        public void mo777a(final LocationResult locationResult) {
            this.f4620a.m5481a(new C0772c<bpv>(this) {
                /* renamed from: a */
                public void mo774a() {
                }

                /* renamed from: a */
                public void m5871a(bpv bpv) {
                    bpv.m10374a(locationResult);
                }

                /* renamed from: a */
                public /* synthetic */ void mo775a(Object obj) {
                    m5871a((bpv) obj);
                }
            });
        }
    }

    /* renamed from: aus$b */
    static class C0844b extends C0843a {
        /* renamed from: a */
        private final asj<bpw> f4622a;

        /* renamed from: a */
        public synchronized void mo778a(final Location location) {
            this.f4622a.m5481a(new C0772c<bpw>(this) {
                /* renamed from: a */
                public void mo774a() {
                }

                /* renamed from: a */
                public void m5882a(bpw bpw) {
                    bpw.m10375a(location);
                }

                /* renamed from: a */
                public /* synthetic */ void mo775a(Object obj) {
                    m5882a((bpw) obj);
                }
            });
        }
    }

    public aus(Context context, aux<auq> aux) {
        this.f4624b = context;
        this.f4623a = aux;
    }

    /* renamed from: a */
    public Location m5887a() {
        this.f4623a.mo732a();
        try {
            return ((auq) this.f4623a.mo733c()).mo766b(this.f4624b.getPackageName());
        } catch (Throwable e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: a */
    public void m5888a(boolean z) throws RemoteException {
        this.f4623a.mo732a();
        ((auq) this.f4623a.mo733c()).mo764a(z);
        this.f4626d = z;
    }

    /* renamed from: b */
    public void m5889b() {
        try {
            synchronized (this.f4627e) {
                for (bqf bqf : this.f4627e.values()) {
                    if (bqf != null) {
                        ((auq) this.f4623a.mo733c()).mo754a(zzask.m19632a(bqf, null));
                    }
                }
                this.f4627e.clear();
            }
            synchronized (this.f4628f) {
                for (bqe bqe : this.f4628f.values()) {
                    if (bqe != null) {
                        ((auq) this.f4623a.mo733c()).mo754a(zzask.m19631a(bqe, null));
                    }
                }
                this.f4628f.clear();
            }
        } catch (Throwable e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: c */
    public void m5890c() {
        if (this.f4626d) {
            try {
                m5888a(false);
            } catch (Throwable e) {
                throw new IllegalStateException(e);
            }
        }
    }
}
