package com.p000;

import java.io.Closeable;

/* compiled from: IoUtils */
/* renamed from: cyi */
public final class cyi {

    /* compiled from: IoUtils */
    /* renamed from: cyi$a */
    public interface C4653a {
    }

    /* renamed from: a */
    public static void m25642a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception e) {
            }
        }
    }
}
