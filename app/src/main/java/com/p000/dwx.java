package com.p000;

import java.util.Queue;

/* compiled from: RxRingBuffer */
/* renamed from: dwx */
public class dwx implements dtw {
    /* renamed from: b */
    public static final int f23363b;
    /* renamed from: a */
    public volatile Object f23364a;
    /* renamed from: c */
    private Queue<Object> f23365c;
    /* renamed from: d */
    private final int f23366d;

    static {
        int i = 128;
        if (dww.m29675a()) {
            i = 16;
        }
        String property = System.getProperty("rx.ring-buffer.size");
        if (property != null) {
            try {
                i = Integer.parseInt(property);
            } catch (NumberFormatException e) {
                System.err.println("Failed to set 'rx.buffer.size' with value " + property + " => " + e.getMessage());
            }
        }
        f23363b = i;
    }

    /* renamed from: a */
    public static dwx m29679a() {
        if (dxy.m29783a()) {
            return new dwx(false, f23363b);
        }
        return new dwx();
    }

    /* renamed from: b */
    public static dwx m29680b() {
        if (dxy.m29783a()) {
            return new dwx(true, f23363b);
        }
        return new dwx();
    }

    private dwx(Queue<Object> queue, int i) {
        this.f23365c = queue;
        this.f23366d = i;
    }

    private dwx(boolean z, int i) {
        this.f23365c = z ? new dxj(i) : new dxr(i);
        this.f23366d = i;
    }

    /* renamed from: c */
    public synchronized void m29684c() {
    }

    public void unsubscribe() {
        m29684c();
    }

    dwx() {
        this(new dxd(f23363b), f23363b);
    }

    /* renamed from: a */
    public void m29681a(Object obj) throws due {
        Object obj2 = 1;
        Object obj3 = null;
        synchronized (this) {
            Queue queue = this.f23365c;
            if (queue == null) {
                int i = 1;
                obj2 = null;
            } else if (queue.offer(duw.m29441a(obj))) {
                obj2 = null;
            }
        }
        if (obj3 != null) {
            throw new IllegalStateException("This instance has been unsubscribed and the queue is no longer usable.");
        } else if (obj2 != null) {
            throw new due();
        }
    }

    /* renamed from: d */
    public void m29685d() {
        if (this.f23364a == null) {
            this.f23364a = duw.m29440a();
        }
    }

    /* renamed from: e */
    public boolean m29686e() {
        Queue queue = this.f23365c;
        return queue == null || queue.isEmpty();
    }

    /* renamed from: f */
    public Object m29687f() {
        Object obj = null;
        synchronized (this) {
            Queue queue = this.f23365c;
            if (queue == null) {
            } else {
                Object poll = queue.poll();
                obj = this.f23364a;
                if (poll == null && obj != null && queue.peek() == null) {
                    this.f23364a = null;
                } else {
                    obj = poll;
                }
            }
        }
        return obj;
    }

    /* renamed from: g */
    public Object m29688g() {
        Object obj;
        synchronized (this) {
            Queue queue = this.f23365c;
            if (queue == null) {
                obj = null;
            } else {
                Object peek = queue.peek();
                obj = this.f23364a;
                if (!(peek == null && obj != null && queue.peek() == null)) {
                    obj = peek;
                }
            }
        }
        return obj;
    }

    /* renamed from: b */
    public boolean m29682b(Object obj) {
        return duw.m29444b(obj);
    }

    /* renamed from: c */
    public Object m29683c(Object obj) {
        return duw.m29445c(obj);
    }

    public boolean isUnsubscribed() {
        return this.f23365c == null;
    }
}
