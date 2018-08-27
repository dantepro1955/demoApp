package com.p000;

import java.io.EOFException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* compiled from: FileDataSource */
/* renamed from: agv */
public final class agv implements agz {
    /* renamed from: a */
    private final agy f1437a;
    /* renamed from: b */
    private RandomAccessFile f1438b;
    /* renamed from: c */
    private String f1439c;
    /* renamed from: d */
    private long f1440d;
    /* renamed from: e */
    private boolean f1441e;

    /* compiled from: FileDataSource */
    /* renamed from: agv$a */
    public static class C0167a extends IOException {
        public C0167a(IOException iOException) {
            super(iOException);
        }
    }

    public agv() {
        this(null);
    }

    public agv(agy agy) {
        this.f1437a = agy;
    }

    public long open(agq agq) throws C0167a {
        try {
            this.f1439c = agq.f1390a.toString();
            this.f1438b = new RandomAccessFile(agq.f1390a.getPath(), "r");
            this.f1438b.seek(agq.f1393d);
            this.f1440d = agq.f1394e == -1 ? this.f1438b.length() - agq.f1393d : agq.f1394e;
            if (this.f1440d < 0) {
                throw new EOFException();
            }
            this.f1441e = true;
            if (this.f1437a != null) {
                this.f1437a.mo188a();
            }
            return this.f1440d;
        } catch (IOException e) {
            throw new C0167a(e);
        }
    }

    public int read(byte[] bArr, int i, int i2) throws C0167a {
        if (this.f1440d == 0) {
            return -1;
        }
        try {
            int read = this.f1438b.read(bArr, i, (int) Math.min(this.f1440d, (long) i2));
            if (read <= 0) {
                return read;
            }
            this.f1440d -= (long) read;
            if (this.f1437a == null) {
                return read;
            }
            this.f1437a.mo189a(read);
            return read;
        } catch (IOException e) {
            throw new C0167a(e);
        }
    }

    public void close() throws C0167a {
        this.f1439c = null;
        if (this.f1438b != null) {
            try {
                this.f1438b.close();
                this.f1438b = null;
                if (this.f1441e) {
                    this.f1441e = false;
                    if (this.f1437a != null) {
                        this.f1437a.mo190b();
                    }
                }
            } catch (IOException e) {
                throw new C0167a(e);
            } catch (Throwable th) {
                this.f1438b = null;
                if (this.f1441e) {
                    this.f1441e = false;
                    if (this.f1437a != null) {
                        this.f1437a.mo190b();
                    }
                }
            }
        }
    }
}
