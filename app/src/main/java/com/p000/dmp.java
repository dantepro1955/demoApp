package com.p000;

import com.under9.android.remoteconfig.api.model.ApiBroadcast;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: BroadcastModel */
/* renamed from: dmp */
public class dmp {
    /* renamed from: a */
    ApiBroadcast[] f22250a;
    /* renamed from: b */
    ArrayList<dmq> f22251b;

    /* renamed from: a */
    public ApiBroadcast[] m28083a() {
        return this.f22250a;
    }

    /* renamed from: b */
    public ArrayList<dmq> m28084b() {
        if (this.f22251b == null) {
            this.f22251b = new ArrayList();
        }
        return this.f22251b;
    }

    /* renamed from: a */
    public void m28082a(ApiBroadcast[] apiBroadcastArr) {
        this.f22250a = apiBroadcastArr;
    }

    /* renamed from: a */
    public void m28081a(String str, String str2) {
        this.f22250a = (ApiBroadcast[]) djm.m27592a(str, ApiBroadcast[].class);
        dmq[] dmqArr = (dmq[]) djm.m27592a(str2, dmq[].class);
        this.f22251b = new ArrayList();
        if (dmqArr != null) {
            this.f22251b.addAll(Arrays.asList(dmqArr));
        }
    }
}
