package com.p000;

import java.io.Closeable;
import java.io.IOException;

/* compiled from: Source */
/* renamed from: dsh */
public interface dsh extends Closeable {
    void close() throws IOException;

    long read(drq drq, long j) throws IOException;

    dsi timeout();
}
