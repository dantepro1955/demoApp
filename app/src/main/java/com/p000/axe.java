package com.p000;

import java.io.IOException;

/* renamed from: axe */
public class axe extends IOException {
    public axe(String str) {
        super(str);
    }

    /* renamed from: a */
    static axe m6294a() {
        return new axe("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.");
    }

    /* renamed from: b */
    static axe m6295b() {
        return new axe("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* renamed from: c */
    static axe m6296c() {
        return new axe("CodedInputStream encountered a malformed varint.");
    }

    /* renamed from: d */
    static axe m6297d() {
        return new axe("Protocol message contained an invalid tag (zero).");
    }

    /* renamed from: e */
    static axe m6298e() {
        return new axe("Protocol message end-group tag did not match expected tag.");
    }

    /* renamed from: f */
    static axe m6299f() {
        return new axe("Protocol message tag had invalid wire type.");
    }

    /* renamed from: g */
    static axe m6300g() {
        return new axe("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }
}
