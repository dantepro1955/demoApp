package com.p000;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;

/* compiled from: JsonElement */
/* renamed from: buh */
public abstract class buh {
    /* renamed from: h */
    public boolean m11068h() {
        return this instanceof bue;
    }

    /* renamed from: i */
    public boolean m11069i() {
        return this instanceof buk;
    }

    /* renamed from: j */
    public boolean m11070j() {
        return this instanceof bun;
    }

    /* renamed from: k */
    public boolean m11071k() {
        return this instanceof buj;
    }

    /* renamed from: l */
    public buk m11072l() {
        if (m11069i()) {
            return (buk) this;
        }
        throw new IllegalStateException("Not a JSON Object: " + this);
    }

    /* renamed from: m */
    public bue m11073m() {
        if (m11068h()) {
            return (bue) this;
        }
        throw new IllegalStateException("This is not a JSON Array.");
    }

    /* renamed from: n */
    public bun m11074n() {
        if (m11070j()) {
            return (bun) this;
        }
        throw new IllegalStateException("This is not a JSON Primitive.");
    }

    /* renamed from: g */
    public boolean mo1543g() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    /* renamed from: o */
    Boolean mo1544o() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    /* renamed from: b */
    public Number mo1538b() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    /* renamed from: c */
    public String mo1539c() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    /* renamed from: d */
    public double mo1540d() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    /* renamed from: e */
    public long mo1541e() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    /* renamed from: f */
    public int mo1542f() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public String toString() {
        try {
            Writer stringWriter = new StringWriter();
            bwc bwc = new bwc(stringWriter);
            bwc.m11289b(true);
            bvi.m11190a(this, bwc);
            return stringWriter.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
