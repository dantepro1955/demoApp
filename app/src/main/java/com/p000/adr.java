package com.p000;

import java.nio.ByteBuffer;

/* compiled from: SampleHolder */
/* renamed from: adr */
public final class adr {
    /* renamed from: a */
    public final adb f643a = new adb();
    /* renamed from: b */
    public ByteBuffer f644b;
    /* renamed from: c */
    public int f645c;
    /* renamed from: d */
    public int f646d;
    /* renamed from: e */
    public long f647e;
    /* renamed from: f */
    private final int f648f;

    public adr(int i) {
        this.f648f = i;
    }

    /* renamed from: a */
    public void m826a(int i) throws IllegalStateException {
        if (this.f644b == null) {
            this.f644b = m825b(i);
            return;
        }
        int capacity = this.f644b.capacity();
        int position = this.f644b.position();
        int i2 = position + i;
        if (capacity < i2) {
            ByteBuffer b = m825b(i2);
            if (position > 0) {
                this.f644b.position(0);
                this.f644b.limit(position);
                b.put(this.f644b);
            }
            this.f644b = b;
        }
    }

    /* renamed from: a */
    public boolean m827a() {
        return (this.f646d & 2) != 0;
    }

    /* renamed from: b */
    public boolean m828b() {
        return (this.f646d & 134217728) != 0;
    }

    /* renamed from: c */
    public boolean m829c() {
        return (this.f646d & 1) != 0;
    }

    /* renamed from: d */
    public void m830d() {
        if (this.f644b != null) {
            this.f644b.clear();
        }
    }

    /* renamed from: b */
    private ByteBuffer m825b(int i) {
        if (this.f648f == 1) {
            return ByteBuffer.allocate(i);
        }
        if (this.f648f == 2) {
            return ByteBuffer.allocateDirect(i);
        }
        throw new IllegalStateException("Buffer too small (" + (this.f644b == null ? 0 : this.f644b.capacity()) + " < " + i + ")");
    }
}
