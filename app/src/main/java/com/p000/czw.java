package com.p000;

import android.os.Handler;
import android.os.Message;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: czw */
public final class czw extends Handler {
    /* renamed from: a */
    private Handler f20866a;
    /* renamed from: b */
    private final ArrayList<C4720a> f20867b = new ArrayList();

    /* renamed from: czw$a */
    class C4720a {
        /* renamed from: a */
        final Message f20864a;
        /* renamed from: b */
        final long f20865b;

        C4720a(Message message, long j) {
            this.f20864a = message;
            this.f20865b = j;
        }
    }

    /* renamed from: a */
    public final synchronized void m25912a() {
        this.f20866a = new Handler();
        if (this.f20867b.size() > 0) {
            Iterator it = this.f20867b.iterator();
            while (it.hasNext()) {
                C4720a c4720a = (C4720a) it.next();
                this.f20866a.sendMessageAtTime(c4720a.f20864a, c4720a.f20865b);
            }
            this.f20867b.clear();
        }
    }

    public final synchronized boolean sendMessageAtTime(Message message, long j) {
        boolean z = true;
        synchronized (this) {
            if (this.f20866a == null) {
                this.f20867b.add(new C4720a(message, j));
            } else if (this.f20866a.getLooper().getThread().isAlive()) {
                z = this.f20866a.sendMessageAtTime(message, j);
            }
        }
        return z;
    }
}
