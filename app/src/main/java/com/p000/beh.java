package com.p000;

import java.util.AbstractMap.SimpleEntry;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONObject;

@bhd
/* renamed from: beh */
public class beh implements beg {
    /* renamed from: a */
    private final bef f5819a;
    /* renamed from: b */
    private final HashSet<SimpleEntry<String, bcy>> f5820b = new HashSet();

    public beh(bef bef) {
        this.f5819a = bef;
    }

    /* renamed from: a */
    public void mo1036a() {
        Iterator it = this.f5820b.iterator();
        while (it.hasNext()) {
            SimpleEntry simpleEntry = (SimpleEntry) it.next();
            String str = "Unregistering eventhandler: ";
            String valueOf = String.valueOf(((bcy) simpleEntry.getValue()).toString());
            bkc.m9012a(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            this.f5819a.mo1028b((String) simpleEntry.getKey(), (bcy) simpleEntry.getValue());
        }
        this.f5820b.clear();
    }

    /* renamed from: a */
    public void mo1023a(String str, bcy bcy) {
        this.f5819a.mo1023a(str, bcy);
        this.f5820b.add(new SimpleEntry(str, bcy));
    }

    /* renamed from: a */
    public void mo1024a(String str, String str2) {
        this.f5819a.mo1024a(str, str2);
    }

    /* renamed from: a */
    public void mo1025a(String str, JSONObject jSONObject) {
        this.f5819a.mo1025a(str, jSONObject);
    }

    /* renamed from: b */
    public void mo1028b(String str, bcy bcy) {
        this.f5819a.mo1028b(str, bcy);
        this.f5820b.remove(new SimpleEntry(str, bcy));
    }

    /* renamed from: b */
    public void mo1029b(String str, JSONObject jSONObject) {
        this.f5819a.mo1029b(str, jSONObject);
    }
}
