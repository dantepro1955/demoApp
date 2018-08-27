package com.p000;

import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: LruCache */
/* renamed from: hn */
public class hn<K, V> {
    /* renamed from: a */
    private final LinkedHashMap<K, V> f17952a;
    /* renamed from: b */
    private int f17953b;
    /* renamed from: c */
    private int f17954c;
    /* renamed from: d */
    private int f17955d;
    /* renamed from: e */
    private int f17956e;
    /* renamed from: f */
    private int f17957f;
    /* renamed from: g */
    private int f17958g;
    /* renamed from: h */
    private int f17959h;

    public hn(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.f17954c = i;
        this.f17952a = new LinkedHashMap(0, 0.75f, true);
    }

    public void resize(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        synchronized (this) {
            this.f17954c = i;
        }
        trimToSize(i);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final V get(K r5) {
        /*
        r4 = this;
        if (r5 != 0) goto L_0x000a;
    L_0x0002:
        r0 = new java.lang.NullPointerException;
        r1 = "key == null";
        r0.<init>(r1);
        throw r0;
    L_0x000a:
        monitor-enter(r4);
        r0 = r4.f17952a;	 Catch:{ all -> 0x002a }
        r0 = r0.get(r5);	 Catch:{ all -> 0x002a }
        if (r0 == 0) goto L_0x001b;
    L_0x0013:
        r1 = r4.f17958g;	 Catch:{ all -> 0x002a }
        r1 = r1 + 1;
        r4.f17958g = r1;	 Catch:{ all -> 0x002a }
        monitor-exit(r4);	 Catch:{ all -> 0x002a }
    L_0x001a:
        return r0;
    L_0x001b:
        r0 = r4.f17959h;	 Catch:{ all -> 0x002a }
        r0 = r0 + 1;
        r4.f17959h = r0;	 Catch:{ all -> 0x002a }
        monitor-exit(r4);	 Catch:{ all -> 0x002a }
        r1 = r4.m22103a(r5);
        if (r1 != 0) goto L_0x002d;
    L_0x0028:
        r0 = 0;
        goto L_0x001a;
    L_0x002a:
        r0 = move-exception;
        monitor-exit(r4);	 Catch:{ all -> 0x002a }
        throw r0;
    L_0x002d:
        monitor-enter(r4);
        r0 = r4.f17956e;	 Catch:{ all -> 0x0053 }
        r0 = r0 + 1;
        r4.f17956e = r0;	 Catch:{ all -> 0x0053 }
        r0 = r4.f17952a;	 Catch:{ all -> 0x0053 }
        r0 = r0.put(r5, r1);	 Catch:{ all -> 0x0053 }
        if (r0 == 0) goto L_0x0049;
    L_0x003c:
        r2 = r4.f17952a;	 Catch:{ all -> 0x0053 }
        r2.put(r5, r0);	 Catch:{ all -> 0x0053 }
    L_0x0041:
        monitor-exit(r4);	 Catch:{ all -> 0x0053 }
        if (r0 == 0) goto L_0x0056;
    L_0x0044:
        r2 = 0;
        r4.m22104a(r2, r5, r1, r0);
        goto L_0x001a;
    L_0x0049:
        r2 = r4.f17953b;	 Catch:{ all -> 0x0053 }
        r3 = r4.m22101b(r5, r1);	 Catch:{ all -> 0x0053 }
        r2 = r2 + r3;
        r4.f17953b = r2;	 Catch:{ all -> 0x0053 }
        goto L_0x0041;
    L_0x0053:
        r0 = move-exception;
        monitor-exit(r4);	 Catch:{ all -> 0x0053 }
        throw r0;
    L_0x0056:
        r0 = r4.f17954c;
        r4.trimToSize(r0);
        r0 = r1;
        goto L_0x001a;
        */
        throw new UnsupportedOperationException("Method not decompiled: hn.get(java.lang.Object):V");
    }

    public final V put(K k, V v) {
        if (k == null || v == null) {
            throw new NullPointerException("key == null || value == null");
        }
        V put;
        synchronized (this) {
            this.f17955d++;
            this.f17953b += m22101b(k, v);
            put = this.f17952a.put(k, v);
            if (put != null) {
                this.f17953b -= m22101b(k, put);
            }
        }
        if (put != null) {
            m22104a(false, k, put, v);
        }
        trimToSize(this.f17954c);
        return put;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void trimToSize(int r5) {
        /*
        r4 = this;
    L_0x0000:
        monitor-enter(r4);
        r0 = r4.f17953b;	 Catch:{ all -> 0x0032 }
        if (r0 < 0) goto L_0x0011;
    L_0x0005:
        r0 = r4.f17952a;	 Catch:{ all -> 0x0032 }
        r0 = r0.isEmpty();	 Catch:{ all -> 0x0032 }
        if (r0 == 0) goto L_0x0035;
    L_0x000d:
        r0 = r4.f17953b;	 Catch:{ all -> 0x0032 }
        if (r0 == 0) goto L_0x0035;
    L_0x0011:
        r0 = new java.lang.IllegalStateException;	 Catch:{ all -> 0x0032 }
        r1 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0032 }
        r1.<init>();	 Catch:{ all -> 0x0032 }
        r2 = r4.getClass();	 Catch:{ all -> 0x0032 }
        r2 = r2.getName();	 Catch:{ all -> 0x0032 }
        r1 = r1.append(r2);	 Catch:{ all -> 0x0032 }
        r2 = ".sizeOf() is reporting inconsistent results!";
        r1 = r1.append(r2);	 Catch:{ all -> 0x0032 }
        r1 = r1.toString();	 Catch:{ all -> 0x0032 }
        r0.<init>(r1);	 Catch:{ all -> 0x0032 }
        throw r0;	 Catch:{ all -> 0x0032 }
    L_0x0032:
        r0 = move-exception;
        monitor-exit(r4);	 Catch:{ all -> 0x0032 }
        throw r0;
    L_0x0035:
        r0 = r4.f17953b;	 Catch:{ all -> 0x0032 }
        if (r0 <= r5) goto L_0x0041;
    L_0x0039:
        r0 = r4.f17952a;	 Catch:{ all -> 0x0032 }
        r0 = r0.isEmpty();	 Catch:{ all -> 0x0032 }
        if (r0 == 0) goto L_0x0043;
    L_0x0041:
        monitor-exit(r4);	 Catch:{ all -> 0x0032 }
        return;
    L_0x0043:
        r0 = r4.f17952a;	 Catch:{ all -> 0x0032 }
        r0 = r0.entrySet();	 Catch:{ all -> 0x0032 }
        r0 = r0.iterator();	 Catch:{ all -> 0x0032 }
        r0 = r0.next();	 Catch:{ all -> 0x0032 }
        r0 = (java.util.Map.Entry) r0;	 Catch:{ all -> 0x0032 }
        r1 = r0.getKey();	 Catch:{ all -> 0x0032 }
        r0 = r0.getValue();	 Catch:{ all -> 0x0032 }
        r2 = r4.f17952a;	 Catch:{ all -> 0x0032 }
        r2.remove(r1);	 Catch:{ all -> 0x0032 }
        r2 = r4.f17953b;	 Catch:{ all -> 0x0032 }
        r3 = r4.m22101b(r1, r0);	 Catch:{ all -> 0x0032 }
        r2 = r2 - r3;
        r4.f17953b = r2;	 Catch:{ all -> 0x0032 }
        r2 = r4.f17957f;	 Catch:{ all -> 0x0032 }
        r2 = r2 + 1;
        r4.f17957f = r2;	 Catch:{ all -> 0x0032 }
        monitor-exit(r4);	 Catch:{ all -> 0x0032 }
        r2 = 1;
        r3 = 0;
        r4.m22104a(r2, r1, r0, r3);
        goto L_0x0000;
        */
        throw new UnsupportedOperationException("Method not decompiled: hn.trimToSize(int):void");
    }

    public final V remove(K k) {
        if (k == null) {
            throw new NullPointerException("key == null");
        }
        V remove;
        synchronized (this) {
            remove = this.f17952a.remove(k);
            if (remove != null) {
                this.f17953b -= m22101b(k, remove);
            }
        }
        if (remove != null) {
            m22104a(false, k, remove, null);
        }
        return remove;
    }

    /* renamed from: a */
    protected void m22104a(boolean z, K k, V v, V v2) {
    }

    /* renamed from: a */
    protected V m22103a(K k) {
        return null;
    }

    /* renamed from: b */
    private int m22101b(K k, V v) {
        int a = mo3708a(k, v);
        if (a >= 0) {
            return a;
        }
        throw new IllegalStateException("Negative size: " + k + "=" + v);
    }

    /* renamed from: a */
    protected int mo3708a(K k, V v) {
        return 1;
    }

    public final void evictAll() {
        trimToSize(-1);
    }

    public final synchronized int size() {
        return this.f17953b;
    }

    public final synchronized int maxSize() {
        return this.f17954c;
    }

    public final synchronized int hitCount() {
        return this.f17958g;
    }

    public final synchronized int missCount() {
        return this.f17959h;
    }

    public final synchronized int createCount() {
        return this.f17956e;
    }

    public final synchronized int putCount() {
        return this.f17955d;
    }

    public final synchronized int evictionCount() {
        return this.f17957f;
    }

    public final synchronized Map<K, V> snapshot() {
        return new LinkedHashMap(this.f17952a);
    }

    public final synchronized String toString() {
        String format;
        int i = 0;
        synchronized (this) {
            int i2 = this.f17958g + this.f17959h;
            if (i2 != 0) {
                i = (this.f17958g * 100) / i2;
            }
            format = String.format("LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", new Object[]{Integer.valueOf(this.f17954c), Integer.valueOf(this.f17958g), Integer.valueOf(this.f17959h), Integer.valueOf(i)});
        }
        return format;
    }
}
