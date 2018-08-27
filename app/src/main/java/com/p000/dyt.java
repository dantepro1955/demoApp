package com.p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: CompositeSubscription */
/* renamed from: dyt */
public final class dyt implements dtw {
    /* renamed from: a */
    private Set<dtw> f23521a;
    /* renamed from: b */
    private volatile boolean f23522b;

    public boolean isUnsubscribed() {
        return this.f23522b;
    }

    /* renamed from: a */
    public void m29887a(dtw dtw) {
        if (!dtw.isUnsubscribed()) {
            if (!this.f23522b) {
                synchronized (this) {
                    if (!this.f23522b) {
                        if (this.f23521a == null) {
                            this.f23521a = new HashSet(4);
                        }
                        this.f23521a.add(dtw);
                        return;
                    }
                }
            }
            dtw.unsubscribe();
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: b */
    public void m29889b(p000.dtw r2) {
        /*
        r1 = this;
        r0 = r1.f23522b;
        if (r0 != 0) goto L_0x000e;
    L_0x0004:
        monitor-enter(r1);
        r0 = r1.f23522b;	 Catch:{ all -> 0x001c }
        if (r0 != 0) goto L_0x000d;
    L_0x0009:
        r0 = r1.f23521a;	 Catch:{ all -> 0x001c }
        if (r0 != 0) goto L_0x000f;
    L_0x000d:
        monitor-exit(r1);	 Catch:{ all -> 0x001c }
    L_0x000e:
        return;
    L_0x000f:
        r0 = r1.f23521a;	 Catch:{ all -> 0x001c }
        r0 = r0.remove(r2);	 Catch:{ all -> 0x001c }
        monitor-exit(r1);	 Catch:{ all -> 0x001c }
        if (r0 == 0) goto L_0x000e;
    L_0x0018:
        r2.unsubscribe();
        goto L_0x000e;
    L_0x001c:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x001c }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: dyt.b(dtw):void");
    }

    public void unsubscribe() {
        if (!this.f23522b) {
            synchronized (this) {
                if (this.f23522b) {
                    return;
                }
                this.f23522b = true;
                Collection collection = this.f23521a;
                this.f23521a = null;
                dyt.m29886a(collection);
            }
        }
    }

    /* renamed from: a */
    private static void m29886a(Collection<dtw> collection) {
        if (collection != null) {
            List list = null;
            for (dtw unsubscribe : collection) {
                try {
                    unsubscribe.unsubscribe();
                } catch (Throwable th) {
                    List arrayList;
                    if (list == null) {
                        arrayList = new ArrayList();
                    } else {
                        arrayList = list;
                    }
                    arrayList.add(th);
                    list = arrayList;
                }
            }
            dud.m29408a(list);
        }
    }

    /* renamed from: a */
    public boolean m29888a() {
        boolean z = false;
        if (!this.f23522b) {
            synchronized (this) {
                if (!(this.f23522b || this.f23521a == null || this.f23521a.isEmpty())) {
                    z = true;
                }
            }
        }
        return z;
    }
}
