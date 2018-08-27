package com.p000;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Options */
/* renamed from: dsu */
public class dsu implements Serializable {
    private static final long serialVersionUID = 1;
    /* renamed from: a */
    private Map f22835a = new HashMap();
    /* renamed from: b */
    private Map f22836b = new HashMap();
    /* renamed from: c */
    private List f22837c = new ArrayList();
    /* renamed from: d */
    private Map f22838d = new HashMap();

    /* renamed from: a */
    public dsu m29189a(dsr dsr) {
        String a = dsr.m29165a();
        if (dsr.m29170e()) {
            this.f22836b.put(dsr.m29168c(), dsr);
        }
        if (dsr.m29173h()) {
            if (this.f22837c.contains(a)) {
                this.f22837c.remove(this.f22837c.indexOf(a));
            }
            this.f22837c.add(a);
        }
        this.f22835a.put(a, dsr);
        return this;
    }

    /* renamed from: a */
    List m29190a() {
        return new ArrayList(this.f22835a.values());
    }

    /* renamed from: b */
    public List m29192b() {
        return this.f22837c;
    }

    /* renamed from: a */
    public dsr m29188a(String str) {
        String a = dsy.m29194a(str);
        if (this.f22835a.containsKey(a)) {
            return (dsr) this.f22835a.get(a);
        }
        return (dsr) this.f22836b.get(a);
    }

    /* renamed from: b */
    public boolean m29193b(String str) {
        String a = dsy.m29194a(str);
        return this.f22835a.containsKey(a) || this.f22836b.containsKey(a);
    }

    /* renamed from: b */
    public dss m29191b(dsr dsr) {
        return (dss) this.f22838d.get(dsr.m29165a());
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[ Options: [ short ");
        stringBuffer.append(this.f22835a.toString());
        stringBuffer.append(" ] [ long ");
        stringBuffer.append(this.f22836b);
        stringBuffer.append(" ]");
        return stringBuffer.toString();
    }
}
