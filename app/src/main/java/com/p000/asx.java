package com.p000;

import java.io.UnsupportedEncodingException;
import p000.bht.C1220a;
import p000.bht.C1221b;

/* renamed from: asx */
public class asx extends bfx<String> {
    /* renamed from: a */
    private final C1221b<String> f4308a;

    public asx(int i, String str, C1221b<String> c1221b, C1220a c1220a) {
        super(i, str, c1220a);
        this.f4308a = c1221b;
    }

    /* renamed from: a */
    protected bht<String> mo711a(bdv bdv) {
        Object str;
        try {
            str = new String(bdv.f5708b, bpd.m10257a(bdv.f5709c));
        } catch (UnsupportedEncodingException e) {
            str = new String(bdv.f5708b);
        }
        return bht.m8539a(str, bpd.m10256a(bdv));
    }

    /* renamed from: a */
    protected /* synthetic */ void mo712a(Object obj) {
        mo713a((String) obj);
    }

    /* renamed from: a */
    protected void mo713a(String str) {
        this.f4308a.mo1285a(str);
    }
}
