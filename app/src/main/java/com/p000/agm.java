package com.p000;

import android.content.Context;
import android.content.res.AssetManager;
import com.under9.android.lib.network.model.Constants;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: AssetDataSource */
/* renamed from: agm */
public final class agm implements agz {
    /* renamed from: a */
    private final AssetManager f1378a;
    /* renamed from: b */
    private final agy f1379b;
    /* renamed from: c */
    private String f1380c;
    /* renamed from: d */
    private InputStream f1381d;
    /* renamed from: e */
    private long f1382e;
    /* renamed from: f */
    private boolean f1383f;

    /* compiled from: AssetDataSource */
    /* renamed from: agm$a */
    public static final class C0163a extends IOException {
        public C0163a(IOException iOException) {
            super(iOException);
        }
    }

    public agm(Context context, agy agy) {
        this.f1378a = context.getAssets();
        this.f1379b = agy;
    }

    public long open(agq agq) throws C0163a {
        try {
            this.f1380c = agq.f1390a.toString();
            String path = agq.f1390a.getPath();
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith(Constants.SEP)) {
                path = path.substring(1);
            }
            this.f1380c = agq.f1390a.toString();
            this.f1381d = this.f1378a.open(path, 1);
            if (this.f1381d.skip(agq.f1393d) < agq.f1393d) {
                throw new EOFException();
            }
            if (agq.f1394e != -1) {
                this.f1382e = agq.f1394e;
            } else {
                this.f1382e = (long) this.f1381d.available();
                if (this.f1382e == 2147483647L) {
                    this.f1382e = -1;
                }
            }
            this.f1383f = true;
            if (this.f1379b != null) {
                this.f1379b.mo188a();
            }
            return this.f1382e;
        } catch (IOException e) {
            throw new C0163a(e);
        }
    }

    public int read(byte[] bArr, int i, int i2) throws C0163a {
        if (this.f1382e == 0) {
            return -1;
        }
        try {
            if (this.f1382e != -1) {
                i2 = (int) Math.min(this.f1382e, (long) i2);
            }
            int read = this.f1381d.read(bArr, i, i2);
            if (read <= 0) {
                return read;
            }
            if (this.f1382e != -1) {
                this.f1382e -= (long) read;
            }
            if (this.f1379b == null) {
                return read;
            }
            this.f1379b.mo189a(read);
            return read;
        } catch (IOException e) {
            throw new C0163a(e);
        }
    }

    public void close() throws C0163a {
        this.f1380c = null;
        if (this.f1381d != null) {
            try {
                this.f1381d.close();
                this.f1381d = null;
                if (this.f1383f) {
                    this.f1383f = false;
                    if (this.f1379b != null) {
                        this.f1379b.mo190b();
                    }
                }
            } catch (IOException e) {
                throw new C0163a(e);
            } catch (Throwable th) {
                this.f1381d = null;
                if (this.f1383f) {
                    this.f1383f = false;
                    if (this.f1379b != null) {
                        this.f1379b.mo190b();
                    }
                }
            }
        }
    }
}
