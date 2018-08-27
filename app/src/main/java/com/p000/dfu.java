package com.p000;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* compiled from: ProgressFileOutputStream */
/* renamed from: dfu */
public class dfu extends FileOutputStream {
    /* renamed from: a */
    private C4884a f21532a;
    /* renamed from: b */
    private long f21533b;
    /* renamed from: c */
    private long f21534c;
    /* renamed from: d */
    private File f21535d;

    /* compiled from: ProgressFileOutputStream */
    /* renamed from: dfu$a */
    public interface C4884a {
        /* renamed from: a */
        void mo4411a(long j, long j2);
    }

    public dfu(File file) throws FileNotFoundException {
        super(file);
        this.f21535d = file;
        m27130a();
    }

    /* renamed from: a */
    public void m27132a(C4884a c4884a) {
        this.f21532a = c4884a;
    }

    /* renamed from: a */
    public void m27131a(int i) {
        this.f21533b = (long) i;
    }

    /* renamed from: a */
    public void m27130a() {
        this.f21534c = 0;
    }

    public void write(byte[] bArr, int i, int i2) throws IOException {
        super.write(bArr, i, i2);
        m27128b();
        m27129c();
    }

    public void write(int i) throws IOException {
        super.write(i);
        m27128b();
        m27129c();
    }

    public void write(byte[] bArr) throws IOException {
        super.write(bArr);
        m27128b();
        m27129c();
    }

    /* renamed from: b */
    private void m27128b() {
        this.f21534c = this.f21535d.length();
    }

    /* renamed from: c */
    private void m27129c() {
        if (this.f21532a != null && this.f21533b != 0) {
            this.f21532a.mo4411a(this.f21534c, this.f21533b);
        }
    }
}
