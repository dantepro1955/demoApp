package com.p000;

/* compiled from: MissingArgumentException */
/* renamed from: dsp */
public class dsp extends dsv {
    /* renamed from: a */
    private dsr f22820a;

    public dsp(String str) {
        super(str);
    }

    public dsp(dsr dsr) {
        this(new StringBuffer().append("Missing argument for option: ").append(dsr.m29165a()).toString());
        this.f22820a = dsr;
    }
}
