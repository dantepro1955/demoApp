package com.p000;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: asj */
public final class asj<L> {
    /* renamed from: a */
    private final C0770a f4251a;
    /* renamed from: b */
    private volatile L f4252b;
    /* renamed from: c */
    private final C0771b<L> f4253c;

    /* renamed from: asj$a */
    final class C0770a extends Handler {
        /* renamed from: a */
        final /* synthetic */ asj f4248a;

        public C0770a(asj asj, Looper looper) {
            this.f4248a = asj;
            super(looper);
        }

        public void handleMessage(Message message) {
            boolean z = true;
            if (message.what != 1) {
                z = false;
            }
            aoi.m4688b(z);
            this.f4248a.m5482b((C0772c) message.obj);
        }
    }

    /* renamed from: asj$b */
    public static final class C0771b<L> {
        /* renamed from: a */
        private final L f4249a;
        /* renamed from: b */
        private final String f4250b;

        C0771b(L l, String str) {
            this.f4249a = l;
            this.f4250b = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0771b)) {
                return false;
            }
            C0771b c0771b = (C0771b) obj;
            return this.f4249a == c0771b.f4249a && this.f4250b.equals(c0771b.f4250b);
        }

        public int hashCode() {
            return (System.identityHashCode(this.f4249a) * 31) + this.f4250b.hashCode();
        }
    }

    /* renamed from: asj$c */
    public interface C0772c<L> {
        /* renamed from: a */
        void mo774a();

        /* renamed from: a */
        void mo775a(L l);
    }

    asj(Looper looper, L l, String str) {
        this.f4251a = new C0770a(this, looper);
        this.f4252b = aoi.m4680a((Object) l, (Object) "Listener must not be null");
        this.f4253c = new C0771b(l, aoi.m4681a(str));
    }

    /* renamed from: a */
    public void m5480a() {
        this.f4252b = null;
    }

    /* renamed from: a */
    public void m5481a(C0772c<? super L> c0772c) {
        aoi.m4680a((Object) c0772c, (Object) "Notifier must not be null");
        this.f4251a.sendMessage(this.f4251a.obtainMessage(1, c0772c));
    }

    /* renamed from: b */
    void m5482b(C0772c<? super L> c0772c) {
        Object obj = this.f4252b;
        if (obj == null) {
            c0772c.mo774a();
            return;
        }
        try {
            c0772c.mo775a(obj);
        } catch (RuntimeException e) {
            c0772c.mo774a();
            throw e;
        }
    }
}
