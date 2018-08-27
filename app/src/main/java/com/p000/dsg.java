package com.p000;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;

/* compiled from: Sink */
/* renamed from: dsg */
public interface dsg extends Closeable, Flushable {
    void close() throws IOException;

    void flush() throws IOException;

    dsi timeout();

    void write(drq drq, long j) throws IOException;
}
