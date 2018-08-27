package com.p000;

import java.util.HashMap;

/* compiled from: TrackMe */
/* renamed from: dtd */
public class dtd {
    /* renamed from: a */
    private final HashMap<String, String> f22879a = new HashMap(14);
    /* renamed from: b */
    private final dsz f22880b = new dsz();

    /* renamed from: a */
    public synchronized dtd m29239a(dtc dtc, String str) {
        if (str == null) {
            this.f22879a.remove(dtc.toString());
        } else if (str.length() > 0) {
            this.f22879a.put(dtc.toString(), str);
        }
        return this;
    }

    /* renamed from: a */
    public synchronized dtd m29236a(dtc dtc, float f) {
        m29239a(dtc, Float.toString(f));
        return this;
    }

    /* renamed from: a */
    public synchronized boolean m29241a(dtc dtc) {
        return this.f22879a.containsKey(dtc.toString());
    }

    /* renamed from: a */
    public synchronized dtd m29237a(dtc dtc, int i) {
        return m29242b(dtc, String.valueOf(i));
    }

    /* renamed from: a */
    public synchronized dtd m29238a(dtc dtc, long j) {
        return m29242b(dtc, String.valueOf(j));
    }

    /* renamed from: b */
    public synchronized dtd m29242b(dtc dtc, String str) {
        if (!m29241a(dtc)) {
            m29239a(dtc, str);
        }
        return this;
    }

    /* renamed from: a */
    public synchronized String m29240a() {
        m29239a(dtc.SCREEN_SCOPE_CUSTOM_VARIABLES, this.f22880b.toString());
        return dta.m27498a(this.f22879a);
    }

    /* renamed from: b */
    public synchronized String m29243b(dtc dtc) {
        return (String) this.f22879a.get(dtc.toString());
    }

    /* renamed from: a */
    public synchronized dtd m29235a(int i, String str, String str2) {
        this.f22880b.m29196a(i, str, str2);
        return this;
    }
}
