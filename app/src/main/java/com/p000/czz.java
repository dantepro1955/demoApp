package com.p000;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import p000.rj.C5720a;

/* renamed from: czz */
public final class czz implements rj {
    /* renamed from: a */
    private File f20874a = null;
    /* renamed from: b */
    private FileInputStream f20875b = null;

    static {
        dnn.m28258a(dad.class);
    }

    /* renamed from: a */
    public final int mo4266a(byte[] bArr, int i) {
        int i2 = -1;
        if (this.f20874a != null) {
            if (this.f20875b == null) {
                try {
                    this.f20875b = new FileInputStream(this.f20874a);
                } catch (FileNotFoundException e) {
                    this.f20874a = null;
                }
            }
            try {
                i2 = this.f20875b.read(bArr, 0, i);
            } catch (Exception e2) {
                try {
                    this.f20875b.close();
                } catch (IOException e3) {
                }
                this.f20875b = null;
                this.f20874a = null;
            }
        }
        return i2;
    }

    /* renamed from: a */
    public final void mo4267a() {
        if (this.f20875b != null) {
            try {
                this.f20875b.close();
            } catch (IOException e) {
            }
        }
        this.f20875b = null;
        this.f20874a = null;
    }

    /* renamed from: a */
    public final boolean mo4268a(String str, C5720a c5720a) {
        this.f20874a = new File(str);
        boolean z = c5720a == C5720a.f25335a ? !this.f20874a.exists() : false;
        if (z) {
            this.f20874a = null;
        }
        return !z;
    }

    /* renamed from: b */
    public final long mo4269b() {
        return this.f20874a == null ? -1 : this.f20874a.length();
    }

    /* renamed from: c */
    public final boolean mo4270c() {
        if (this.f20874a == null) {
            return false;
        }
        if (this.f20875b != null) {
            try {
                this.f20875b.close();
            } catch (IOException e) {
            }
        }
        this.f20875b = null;
        File file = this.f20874a;
        this.f20874a = null;
        return file.delete();
    }
}
