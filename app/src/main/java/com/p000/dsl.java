package com.p000;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* compiled from: CommandLine */
/* renamed from: dsl */
public class dsl implements Serializable {
    private static final long serialVersionUID = 1;
    /* renamed from: a */
    private List f22806a = new LinkedList();
    /* renamed from: b */
    private List f22807b = new ArrayList();

    dsl() {
    }

    /* renamed from: a */
    public boolean m29137a(String str) {
        return this.f22807b.contains(m29134c(str));
    }

    /* renamed from: c */
    private dsr m29134c(String str) {
        String a = dsy.m29194a(str);
        for (dsr dsr : this.f22807b) {
            if (a.equals(dsr.m29167b())) {
                return dsr;
            }
            if (a.equals(dsr.m29168c())) {
                return dsr;
            }
        }
        return null;
    }

    /* renamed from: a */
    public List m29135a() {
        return this.f22806a;
    }

    /* renamed from: b */
    void m29138b(String str) {
        this.f22806a.add(str);
    }

    /* renamed from: a */
    void m29136a(dsr dsr) {
        this.f22807b.add(dsr);
    }
}
