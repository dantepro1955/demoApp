package com.p000;

import java.io.IOException;

/* compiled from: ForwardingSink */
/* renamed from: drv */
public abstract class drv implements dsg {
    private final dsg delegate;

    public drv(dsg dsg) {
        if (dsg == null) {
            throw new IllegalArgumentException("delegate == null");
        }
        this.delegate = dsg;
    }

    public final dsg delegate() {
        return this.delegate;
    }

    public void write(drq drq, long j) throws IOException {
        this.delegate.write(drq, j);
    }

    public void flush() throws IOException {
        this.delegate.flush();
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
