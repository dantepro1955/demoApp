package com.p000;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/* compiled from: SnapshotInputStream */
/* renamed from: bwj */
public final class bwj extends FileInputStream {
    /* renamed from: a */
    private final long f8006a;
    /* renamed from: b */
    private final String f8007b;

    bwj(bwf bwf) throws FileNotFoundException {
        super(bwf.m11500a());
        this.f8006a = bwf.m11504c();
        this.f8007b = bwf.m11500a().getAbsolutePath();
    }

    /* renamed from: a */
    public String m11542a() {
        return this.f8007b;
    }
}
