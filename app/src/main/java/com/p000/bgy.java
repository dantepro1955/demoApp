package com.p000;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: bgy */
public class bgy {
    /* renamed from: a */
    private AtomicInteger f6205a;
    /* renamed from: b */
    private final Map<String, Queue<bfx<?>>> f6206b;
    /* renamed from: c */
    private final Set<bfx<?>> f6207c;
    /* renamed from: d */
    private final PriorityBlockingQueue<bfx<?>> f6208d;
    /* renamed from: e */
    private final PriorityBlockingQueue<bfx<?>> f6209e;
    /* renamed from: f */
    private final avg f6210f;
    /* renamed from: g */
    private final bax f6211g;
    /* renamed from: h */
    private final biu f6212h;
    /* renamed from: i */
    private bbx[] f6213i;
    /* renamed from: j */
    private axo f6214j;
    /* renamed from: k */
    private List<Object> f6215k;

    public bgy(avg avg, bax bax) {
        this(avg, bax, 4);
    }

    public bgy(avg avg, bax bax, int i) {
        this(avg, bax, i, new bae(new Handler(Looper.getMainLooper())));
    }

    public bgy(avg avg, bax bax, int i, biu biu) {
        this.f6205a = new AtomicInteger();
        this.f6206b = new HashMap();
        this.f6207c = new HashSet();
        this.f6208d = new PriorityBlockingQueue();
        this.f6209e = new PriorityBlockingQueue();
        this.f6215k = new ArrayList();
        this.f6210f = avg;
        this.f6211g = bax;
        this.f6213i = new bbx[i];
        this.f6212h = biu;
    }

    /* renamed from: a */
    public <T> bfx<T> m8417a(bfx<T> bfx) {
        bfx.m5538a(this);
        synchronized (this.f6207c) {
            this.f6207c.add(bfx);
        }
        bfx.m5536a(m8421c());
        bfx.m5545b("add-to-queue");
        if (bfx.m5556l()) {
            synchronized (this.f6206b) {
                String d = bfx.m5548d();
                if (this.f6206b.containsKey(d)) {
                    Queue queue = (Queue) this.f6206b.get(d);
                    if (queue == null) {
                        queue = new LinkedList();
                    }
                    queue.add(bfx);
                    this.f6206b.put(d, queue);
                    if (bnt.f7178b) {
                        bnt.m10019a("Request for cacheKey=%s is in flight, putting on hold.", d);
                    }
                } else {
                    this.f6206b.put(d, null);
                    this.f6208d.add(bfx);
                }
            }
        } else {
            this.f6209e.add(bfx);
        }
        return bfx;
    }

    /* renamed from: a */
    public void m8418a() {
        m8419b();
        this.f6214j = new axo(this.f6208d, this.f6209e, this.f6210f, this.f6212h);
        this.f6214j.start();
        for (int i = 0; i < this.f6213i.length; i++) {
            bbx bbx = new bbx(this.f6209e, this.f6211g, this.f6210f, this.f6212h);
            this.f6213i[i] = bbx;
            bbx.start();
        }
    }

    /* renamed from: b */
    public void m8419b() {
        if (this.f6214j != null) {
            this.f6214j.m6369a();
        }
        for (int i = 0; i < this.f6213i.length; i++) {
            if (this.f6213i[i] != null) {
                this.f6213i[i].m7356a();
            }
        }
    }

    /* renamed from: b */
    <T> void m8420b(bfx<T> bfx) {
        synchronized (this.f6207c) {
            this.f6207c.remove(bfx);
        }
        synchronized (this.f6215k) {
            Iterator it = this.f6215k.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
        if (bfx.m5556l()) {
            synchronized (this.f6206b) {
                Queue queue = (Queue) this.f6206b.remove(bfx.m5548d());
                if (queue != null) {
                    if (bnt.f7178b) {
                        bnt.m10019a("Releasing %d waiting requests for cacheKey=%s.", Integer.valueOf(queue.size()), r2);
                    }
                    this.f6208d.addAll(queue);
                }
            }
        }
    }

    /* renamed from: c */
    public int m8421c() {
        return this.f6205a.incrementAndGet();
    }
}
