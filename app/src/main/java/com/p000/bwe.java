package com.p000;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* compiled from: EditorOutputStream */
/* renamed from: bwe */
public final class bwe extends FileOutputStream {
    /* renamed from: a */
    private bwg f7967a;
    /* renamed from: b */
    private bwf f7968b;
    /* renamed from: c */
    private boolean f7969c = false;
    /* renamed from: d */
    private boolean f7970d;

    bwe(bwf bwf, bwg bwg) throws FileNotFoundException {
        super(bwf.m11503b());
        this.f7967a = bwg;
        this.f7968b = bwf;
    }

    /* renamed from: a */
    public synchronized boolean m11497a() {
        boolean z = true;
        synchronized (this) {
            m11496d();
            close();
            this.f7970d = true;
            if (this.f7969c) {
                this.f7967a.m11523b(this.f7968b);
                this.f7967a.m11524c(this.f7968b.m11507f());
                z = false;
            } else {
                this.f7967a.m11520a(this.f7968b);
            }
        }
        return z;
    }

    /* renamed from: b */
    public synchronized void m11498b() {
        m11496d();
        close();
        this.f7970d = true;
        this.f7967a.m11523b(this.f7968b);
    }

    /* renamed from: c */
    public synchronized void m11499c() {
        if (!this.f7970d) {
            m11498b();
        }
    }

    public void write(byte[] bArr) {
        try {
            super.write(bArr);
        } catch (IOException e) {
            this.f7969c = true;
        }
    }

    public void write(byte[] bArr, int i, int i2) {
        try {
            super.write(bArr, i, i2);
        } catch (IOException e) {
            this.f7969c = true;
        }
    }

    @Deprecated
    public void close() {
        try {
            super.close();
        } catch (IOException e) {
            this.f7969c = true;
        }
    }

    public void flush() {
        try {
            super.flush();
        } catch (IOException e) {
            this.f7969c = true;
        }
    }

    /* renamed from: d */
    private void m11496d() {
        if (this.f7970d) {
            throw new IllegalStateException("Try to operate on an EditorOutputStream that is already closed");
        } else if (this.f7968b.m11506e() != this) {
            throw new IllegalStateException("Two editors trying to write to the same cached file");
        }
    }
}
