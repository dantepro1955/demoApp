package com.p000;

import java.io.IOException;

/* compiled from: DataSource */
/* renamed from: agp */
public interface agp {
    void close() throws IOException;

    long open(agq agq) throws IOException;

    int read(byte[] bArr, int i, int i2) throws IOException;
}
