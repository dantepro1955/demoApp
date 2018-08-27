package com.p000;

import java.io.Serializable;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: OptionGroup */
/* renamed from: dss */
public class dss implements Serializable {
    private static final long serialVersionUID = 1;
    /* renamed from: a */
    private Map f22832a = new HashMap();
    /* renamed from: b */
    private String f22833b;
    /* renamed from: c */
    private boolean f22834c;

    /* renamed from: a */
    public Collection m29181a() {
        return this.f22832a.values();
    }

    /* renamed from: a */
    public void m29182a(dsr dsr) throws dsk {
        if (this.f22833b == null || this.f22833b.equals(dsr.m29167b())) {
            this.f22833b = dsr.m29167b();
            return;
        }
        throw new dsk(this, dsr);
    }

    /* renamed from: b */
    public String m29183b() {
        return this.f22833b;
    }

    /* renamed from: c */
    public boolean m29184c() {
        return this.f22834c;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        Iterator it = m29181a().iterator();
        stringBuffer.append("[");
        while (it.hasNext()) {
            dsr dsr = (dsr) it.next();
            if (dsr.m29167b() != null) {
                stringBuffer.append("-");
                stringBuffer.append(dsr.m29167b());
            } else {
                stringBuffer.append("--");
                stringBuffer.append(dsr.m29168c());
            }
            stringBuffer.append(" ");
            stringBuffer.append(dsr.m29172g());
            if (it.hasNext()) {
                stringBuffer.append(", ");
            }
        }
        stringBuffer.append("]");
        return stringBuffer.toString();
    }
}
