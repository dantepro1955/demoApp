package com.p000;

import java.io.IOException;

/* compiled from: ForwardingSource */
/* renamed from: drw */
public abstract class drw implements dsh {
    private final dsh delegate;

    public drw(dsh dsh) {
        if (dsh == null) {
            throw new IllegalArgumentException("delegate == null");
        }
        this.delegate = dsh;
    }

    public final dsh delegate() {
        return this.delegate;
    }

    public long read(drq drq, long j) throws IOException {
        return this.delegate.read(drq, j);
    }

    public dsi timeout() {
        return this.delegate.timeout();
    }

    public void close() throws IOException {
        this.delegate.close();
    }

    public String toString() {
        return getClass().getSimpleName() + "(" + this.delegate.toString() + ")";
    }
}
