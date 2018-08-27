package com.p000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

/* compiled from: SubscriptionList */
/* renamed from: dxa */
public final class dxa implements dtw {
    /* renamed from: a */
    private List<dtw> f23412a;
    /* renamed from: b */
    private volatile boolean f23413b;

    public dxa(dtw... dtwArr) {
        this.f23412a = new LinkedList(Arrays.asList(dtwArr));
    }

    public dxa(dtw dtw) {
        this.f23412a = new LinkedList();
        this.f23412a.add(dtw);
    }

    public boolean isUnsubscribed() {
        return this.f23413b;
    }

    /* renamed from: a */
    public void m29730a(dtw dtw) {
        if (!dtw.isUnsubscribed()) {
            if (!this.f23413b) {
                synchronized (this) {
                    if (!this.f23413b) {
                        List list = this.f23412a;
                        if (list == null) {
                            list = new LinkedList();
                            this.f23412a = list;
                        }
                        list.add(dtw);
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
    public void m29731b(p000.dtw r3) {
        /*
        r2 = this;
        r0 = r2.f23413b;
        if (r0 != 0) goto L_0x000e;
    L_0x0004:
        monitor-enter(r2);
        r0 = r2.f23412a;	 Catch:{ all -> 0x001a }
        r1 = r2.f23413b;	 Catch:{ all -> 0x001a }
        if (r1 != 0) goto L_0x000d;
    L_0x000b:
        if (r0 != 0) goto L_0x000f;
    L_0x000d:
        monitor-exit(r2);	 Catch:{ all -> 0x001a }
    L_0x000e:
        return;
    L_0x000f:
        r0 = r0.remove(r3);	 Catch:{ all -> 0x001a }
        monitor-exit(r2);	 Catch:{ all -> 0x001a }
        if (r0 == 0) goto L_0x000e;
    L_0x0016:
        r3.unsubscribe();
        goto L_0x000e;
    L_0x001a:
        r0 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x001a }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: dxa.b(dtw):void");
    }

    public void unsubscribe() {
        if (!this.f23413b) {
            synchronized (this) {
                if (this.f23413b) {
                    return;
                }
                this.f23413b = true;
                Collection collection = this.f23412a;
                this.f23412a = null;
                dxa.m29729a(collection);
            }
        }
    }

    /* renamed from: a */
    private static void m29729a(Collection<dtw> collection) {
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
}
