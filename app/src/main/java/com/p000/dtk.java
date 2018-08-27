package com.p000;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import p000.czs.C4707a;
import p000.czs.C4709b;
import p000.czs.C4710d;
import p000.czs.C4711e;
import p000.czs.C4712f;

/* renamed from: dtk */
public final class dtk {
    /* renamed from: a */
    private final int f22896a;
    /* renamed from: b */
    private final int f22897b;
    /* renamed from: c */
    private final String f22898c;
    /* renamed from: d */
    private final byte[] f22899d;
    /* renamed from: e */
    private final Map<String, dtk> f22900e;
    /* renamed from: f */
    private final List<dtk> f22901f;

    public dtk(czs czs) {
        this.f22896a = czs.m25861a();
        switch (this.f22896a) {
            case 0:
                this.f22897b = 0;
                this.f22898c = ((C4712f) czs).m25874b();
                this.f22899d = null;
                this.f22901f = null;
                this.f22900e = null;
                return;
            case 1:
                this.f22897b = ((C4710d) czs).m25868b();
                this.f22898c = null;
                this.f22899d = null;
                this.f22901f = null;
                this.f22900e = null;
                return;
            case 2:
                this.f22897b = 0;
                this.f22898c = null;
                this.f22899d = null;
                this.f22901f = null;
                this.f22900e = new HashMap();
                for (Entry entry : ((C4709b) czs).m25867b()) {
                    this.f22900e.put(entry.getKey(), new dtk((czs) entry.getValue()));
                }
                return;
            case 3:
                C4711e c4711e = (C4711e) czs;
                this.f22897b = 0;
                this.f22898c = null;
                this.f22899d = null;
                this.f22901f = new ArrayList(c4711e.m25873c());
                this.f22900e = null;
                for (czs dtk : c4711e.m25872b()) {
                    this.f22901f.add(new dtk(dtk));
                }
                return;
            case 4:
                this.f22897b = 0;
                this.f22898c = null;
                this.f22899d = ((C4707a) czs).m25862b();
                this.f22901f = null;
                this.f22900e = null;
                return;
            default:
                this.f22897b = 0;
                this.f22898c = null;
                this.f22899d = null;
                this.f22901f = null;
                this.f22900e = null;
                return;
        }
    }

    /* renamed from: a */
    public final Map<String, dtk> m29270a() {
        return this.f22900e;
    }

    /* renamed from: b */
    public final List<dtk> m29271b() {
        return this.f22901f;
    }

    /* renamed from: c */
    public final String m29272c() {
        return this.f22898c;
    }

    /* renamed from: d */
    public final int m29273d() {
        return this.f22897b;
    }

    /* renamed from: e */
    public final byte[] m29274e() {
        return this.f22899d;
    }

    /* renamed from: f */
    public final int m29275f() {
        return this.f22896a;
    }
}
