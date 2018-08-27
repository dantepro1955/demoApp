package com.p000;

import android.content.Context;
import java.io.EOFException;
import java.io.IOException;
import java.io.RandomAccessFile;
import p000.agv.C0167a;

/* compiled from: DiskCacheDataSource */
/* renamed from: dla */
public class dla implements agz {
    /* renamed from: a */
    private final dfs f21952a;
    /* renamed from: b */
    private final agy f21953b;
    /* renamed from: c */
    private RandomAccessFile f21954c;
    /* renamed from: d */
    private String f21955d;
    /* renamed from: e */
    private long f21956e;
    /* renamed from: f */
    private boolean f21957f;
    /* renamed from: g */
    private final Context f21958g;

    /* compiled from: DiskCacheDataSource */
    /* renamed from: dla$a */
    public static class C4961a extends IOException {
        public C4961a(IOException iOException) {
            super(iOException);
        }
    }

    public dla(Context context, agy agy, dfs dfs) {
        this.f21958g = context;
        this.f21953b = agy;
        this.f21952a = dfs;
    }

    public long open(agq agq) throws IOException {
        try {
            this.f21955d = this.f21952a.m27060e(this.f21958g, agq.f1390a.toString());
            this.f21954c = new RandomAccessFile(this.f21955d, "r");
            this.f21954c.seek(agq.f1393d);
            this.f21956e = agq.f1394e == -1 ? this.f21954c.length() - agq.f1393d : agq.f1394e;
            if (this.f21956e < 0) {
                throw new EOFException();
            }
            this.f21957f = true;
            if (this.f21953b != null) {
                this.f21953b.a();
            }
            return this.f21956e;
        } catch (IOException e) {
            throw new C4961a(e);
        }
    }

    public void close() throws IOException {
        this.f21955d = null;
        if (this.f21954c != null) {
            try {
                this.f21954c.close();
                this.f21954c = null;
                if (this.f21957f) {
                    this.f21957f = false;
                    if (this.f21953b != null) {
                        this.f21953b.b();
                    }
                }
            } catch (IOException e) {
                throw new C4961a(e);
            } catch (Throwable th) {
                this.f21954c = null;
                if (this.f21957f) {
                    this.f21957f = false;
                    if (this.f21953b != null) {
                        this.f21953b.b();
                    }
                }
            }
        }
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (this.f21956e == 0) {
            return -1;
        }
        try {
            int read = this.f21954c.read(bArr, i, (int) Math.min(this.f21956e, (long) i2));
            if (read <= 0) {
                return read;
            }
            this.f21956e -= (long) read;
            if (this.f21953b == null) {
                return read;
            }
            this.f21953b.a(read);
            return read;
        } catch (IOException e) {
            throw new C0167a(e);
        }
    }
}
