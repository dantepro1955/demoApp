package com.p000;

import com.facebook.internal.Utility;
import com.mopub.common.DiskLruCacheUtil;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* compiled from: DiskLruCacheStrictLineReader */
/* renamed from: byx */
public class byx implements Closeable {
    /* renamed from: a */
    private final InputStream f8240a;
    /* renamed from: b */
    private final Charset f8241b;
    /* renamed from: c */
    private byte[] f8242c;
    /* renamed from: d */
    private int f8243d;
    /* renamed from: e */
    private int f8244e;

    public byx(InputStream inputStream, Charset charset) {
        this(inputStream, Utility.DEFAULT_STREAM_BUFFER_SIZE, charset);
    }

    public byx(InputStream inputStream, int i, Charset charset) {
        if (inputStream == null || charset == null) {
            throw new NullPointerException();
        } else if (i < 0) {
            throw new IllegalArgumentException("capacity <= 0");
        } else if (charset.equals(DiskLruCacheUtil.f16981a)) {
            this.f8240a = inputStream;
            this.f8241b = charset;
            this.f8242c = new byte[i];
        } else {
            throw new IllegalArgumentException("Unsupported encoding");
        }
    }

    public void close() throws IOException {
        synchronized (this.f8240a) {
            if (this.f8242c != null) {
                this.f8242c = null;
                this.f8240a.close();
            }
        }
    }

    public String readLine() throws IOException {
        String str;
        synchronized (this.f8240a) {
            if (this.f8242c == null) {
                throw new IOException("LineReader is closed");
            }
            int i;
            if (this.f8243d >= this.f8244e) {
                m11837a();
            }
            int i2 = this.f8243d;
            while (i2 != this.f8244e) {
                if (this.f8242c[i2] == (byte) 10) {
                    int i3 = (i2 == this.f8243d || this.f8242c[i2 - 1] != (byte) 13) ? i2 : i2 - 1;
                    str = new String(this.f8242c, this.f8243d, i3 - this.f8243d, this.f8241b.name());
                    this.f8243d = i2 + 1;
                } else {
                    i2++;
                }
            }
            ByteArrayOutputStream c16101 = new ByteArrayOutputStream(this, (this.f8244e - this.f8243d) + 80) {
                /* renamed from: a */
                final /* synthetic */ byx f8239a;

                public String toString() {
                    int i = (this.count <= 0 || this.buf[this.count - 1] != (byte) 13) ? this.count : this.count - 1;
                    try {
                        return new String(this.buf, 0, i, this.f8239a.f8241b.name());
                    } catch (UnsupportedEncodingException e) {
                        throw new AssertionError(e);
                    }
                }
            };
            loop1:
            while (true) {
                c16101.write(this.f8242c, this.f8243d, this.f8244e - this.f8243d);
                this.f8244e = -1;
                m11837a();
                i = this.f8243d;
                while (i != this.f8244e) {
                    if (this.f8242c[i] == (byte) 10) {
                        break loop1;
                    }
                    i++;
                }
            }
            if (i != this.f8243d) {
                c16101.write(this.f8242c, this.f8243d, i - this.f8243d);
            }
            this.f8243d = i + 1;
            str = c16101.toString();
        }
        return str;
    }

    /* renamed from: a */
    private void m11837a() throws IOException {
        int read = this.f8240a.read(this.f8242c, 0, this.f8242c.length);
        if (read == -1) {
            throw new EOFException();
        }
        this.f8243d = 0;
        this.f8244e = read;
    }
}
