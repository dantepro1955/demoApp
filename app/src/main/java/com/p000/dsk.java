package com.p000;

/* compiled from: AlreadySelectedException */
/* renamed from: dsk */
public class dsk extends dsv {
    /* renamed from: a */
    private dss f22804a;
    /* renamed from: b */
    private dsr f22805b;

    public dsk(String str) {
        super(str);
    }

    public dsk(dss dss, dsr dsr) {
        this(new StringBuffer().append("The option '").append(dsr.m29165a()).append("' was specified but an option from this group ").append("has already been selected: '").append(dss.m29183b()).append("'").toString());
        this.f22804a = dss;
        this.f22805b = dsr;
    }
}
