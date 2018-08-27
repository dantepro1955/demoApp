package com.p000;

import android.content.ContentResolver;
import android.content.Context;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: ContentDataSource */
/* renamed from: ago */
public final class ago implements agz {
    /* renamed from: a */
    private final ContentResolver f1384a;
    /* renamed from: b */
    private final agy f1385b;
    /* renamed from: c */
    private InputStream f1386c;
    /* renamed from: d */
    private String f1387d;
    /* renamed from: e */
    private long f1388e;
    /* renamed from: f */
    private boolean f1389f;

    /* compiled from: ContentDataSource */
    /* renamed from: ago$a */
    public static class C0165a extends IOException {
        public C0165a(IOException iOException) {
            super(iOException);
        }
    }

    public ago(Context context, agy agy) {
        this.f1384a = context.getContentResolver();
        this.f1385b = agy;
    }

    public long open(agq agq) throws C0165a {
        try {
            this.f1387d = agq.f1390a.toString();
            this.f1386c = new FileInputStream(this.f1384a.openAssetFileDescriptor(agq.f1390a, "r").getFileDescriptor());
            if (this.f1386c.skip(agq.f1393d) < agq.f1393d) {
                throw new EOFException();
            }
            if (agq.f1394e != -1) {
                this.f1388e = agq.f1394e;
            } else {
                this.f1388e = (long) this.f1386c.available();
                if (this.f1388e == 0) {
                    this.f1388e = -1;
                }
            }
            this.f1389f = true;
            if (this.f1385b != null) {
                this.f1385b.mo188a();
            }
            return this.f1388e;
        } catch (IOException e) {
            throw new C0165a(e);
        }
    }

    public int read(byte[] bArr, int i, int i2) throws C0165a {
        if (this.f1388e == 0) {
            return -1;
        }
        try {
            if (this.f1388e != -1) {
                i2 = (int) Math.min(this.f1388e, (long) i2);
            }
            int read = this.f1386c.read(bArr, i, i2);
            if (read <= 0) {
                return read;
            }
            if (this.f1388e != -1) {
                this.f1388e -= (long) read;
            }
            if (this.f1385b == null) {
                return read;
            }
            this.f1385b.mo189a(read);
            return read;
        } catch (IOException e) {
            throw new C0165a(e);
        }
    }

    public void close() throws C0165a {
        this.f1387d = null;
        if (this.f1386c != null) {
            try {
                this.f1386c.close();
                this.f1386c = null;
                if (this.f1389f) {
                    this.f1389f = false;
                    if (this.f1385b != null) {
                        this.f1385b.mo190b();
                    }
                }
            } catch (IOException e) {
                throw new C0165a(e);
            } catch (Throwable th) {
                this.f1386c = null;
                if (this.f1389f) {
                    this.f1389f = false;
                    if (this.f1385b != null) {
                        this.f1385b.mo190b();
                    }
                }
            }
        }
    }
}
