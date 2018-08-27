package com.p000;

import com.facebook.common.util.ByteConstants;
import com.facebook.internal.Utility;

/* compiled from: Segment */
/* renamed from: dsd */
final class dsd {
    /* renamed from: a */
    final byte[] f22792a;
    /* renamed from: b */
    int f22793b;
    /* renamed from: c */
    int f22794c;
    /* renamed from: d */
    boolean f22795d;
    /* renamed from: e */
    boolean f22796e;
    /* renamed from: f */
    dsd f22797f;
    /* renamed from: g */
    dsd f22798g;

    dsd() {
        this.f22792a = new byte[Utility.DEFAULT_STREAM_BUFFER_SIZE];
        this.f22796e = true;
        this.f22795d = false;
    }

    dsd(dsd dsd) {
        this(dsd.f22792a, dsd.f22793b, dsd.f22794c);
        dsd.f22795d = true;
    }

    dsd(byte[] bArr, int i, int i2) {
        this.f22792a = bArr;
        this.f22793b = i;
        this.f22794c = i2;
        this.f22796e = false;
        this.f22795d = true;
    }

    /* renamed from: a */
    public dsd m29105a() {
        dsd dsd = this.f22797f != this ? this.f22797f : null;
        this.f22798g.f22797f = this.f22797f;
        this.f22797f.f22798g = this.f22798g;
        this.f22797f = null;
        this.f22798g = null;
        return dsd;
    }

    /* renamed from: a */
    public dsd m29107a(dsd dsd) {
        dsd.f22798g = this;
        dsd.f22797f = this.f22797f;
        this.f22797f.f22798g = dsd;
        this.f22797f = dsd;
        return dsd;
    }

    /* renamed from: a */
    public dsd m29106a(int i) {
        if (i <= 0 || i > this.f22794c - this.f22793b) {
            throw new IllegalArgumentException();
        }
        dsd dsd;
        if (i >= ByteConstants.KB) {
            dsd = new dsd(this);
        } else {
            dsd = dse.m29110a();
            System.arraycopy(this.f22792a, this.f22793b, dsd.f22792a, 0, i);
        }
        dsd.f22794c = dsd.f22793b + i;
        this.f22793b += i;
        this.f22798g.m29107a(dsd);
        return dsd;
    }

    /* renamed from: b */
    public void m29109b() {
        if (this.f22798g == this) {
            throw new IllegalStateException();
        } else if (this.f22798g.f22796e) {
            int i = this.f22794c - this.f22793b;
            if (i <= (this.f22798g.f22795d ? 0 : this.f22798g.f22793b) + (8192 - this.f22798g.f22794c)) {
                m29108a(this.f22798g, i);
                m29105a();
                dse.m29111a(this);
            }
        }
    }

    /* renamed from: a */
    public void m29108a(dsd dsd, int i) {
        if (dsd.f22796e) {
            if (dsd.f22794c + i > Utility.DEFAULT_STREAM_BUFFER_SIZE) {
                if (dsd.f22795d) {
                    throw new IllegalArgumentException();
                } else if ((dsd.f22794c + i) - dsd.f22793b > Utility.DEFAULT_STREAM_BUFFER_SIZE) {
                    throw new IllegalArgumentException();
                } else {
                    System.arraycopy(dsd.f22792a, dsd.f22793b, dsd.f22792a, 0, dsd.f22794c - dsd.f22793b);
                    dsd.f22794c -= dsd.f22793b;
                    dsd.f22793b = 0;
                }
            }
            System.arraycopy(this.f22792a, this.f22793b, dsd.f22792a, dsd.f22794c, i);
            dsd.f22794c += i;
            this.f22793b += i;
            return;
        }
        throw new IllegalArgumentException();
    }
}
