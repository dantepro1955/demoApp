package com.p000;

import com.facebook.internal.ServerProtocol;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.List;
import java.util.ListIterator;
import java.util.Properties;

/* compiled from: Parser */
/* renamed from: dsw */
public abstract class dsw implements dsm {
    /* renamed from: a */
    protected dsl f22808a;
    /* renamed from: b */
    private dsu f22809b;
    /* renamed from: c */
    private List f22810c;

    /* renamed from: b */
    protected abstract String[] mo4632b(dsu dsu, String[] strArr, boolean z);

    /* renamed from: a */
    protected void m29144a(dsu dsu) {
        this.f22809b = dsu;
        this.f22810c = new ArrayList(dsu.m29192b());
    }

    /* renamed from: a */
    protected dsu m29142a() {
        return this.f22809b;
    }

    /* renamed from: b */
    protected List m29147b() {
        return this.f22810c;
    }

    /* renamed from: a */
    public dsl mo4631a(dsu dsu, String[] strArr, boolean z) throws dsv {
        return m29140a(dsu, strArr, null, z);
    }

    /* renamed from: a */
    public dsl m29140a(dsu dsu, String[] strArr, Properties properties, boolean z) throws dsv {
        int i = 0;
        for (dsr o : dsu.m29190a()) {
            o.m29180o();
        }
        m29144a(dsu);
        this.f22808a = new dsl();
        if (strArr == null) {
            strArr = new String[0];
        }
        ListIterator listIterator = Arrays.asList(mo4632b(m29142a(), strArr, z)).listIterator();
        while (listIterator.hasNext()) {
            String str = (String) listIterator.next();
            if ("--".equals(str)) {
                i = 1;
            } else if ("-".equals(str)) {
                if (z) {
                    i = 1;
                } else {
                    this.f22808a.m29138b(str);
                }
            } else if (!str.startsWith("-")) {
                this.f22808a.m29138b(str);
                if (z) {
                    i = 1;
                }
            } else if (!z || m29142a().m29193b(str)) {
                m29145a(str, listIterator);
            } else {
                this.f22808a.m29138b(str);
                i = 1;
            }
            if (i != 0) {
                while (listIterator.hasNext()) {
                    str = (String) listIterator.next();
                    if (!"--".equals(str)) {
                        this.f22808a.m29138b(str);
                    }
                }
            }
        }
        m29146a(properties);
        m29149c();
        return this.f22808a;
    }

    /* renamed from: a */
    protected void m29146a(Properties properties) {
        if (properties != null) {
            Enumeration propertyNames = properties.propertyNames();
            while (propertyNames.hasMoreElements()) {
                String obj = propertyNames.nextElement().toString();
                if (!this.f22808a.m29137a(obj)) {
                    dsr a = m29142a().m29188a(obj);
                    obj = properties.getProperty(obj);
                    if (a.m29171f()) {
                        if (a.m29179n() == null || a.m29179n().length == 0) {
                            try {
                                a.m29166a(obj);
                            } catch (RuntimeException e) {
                            }
                        }
                    } else if (!("yes".equalsIgnoreCase(obj) || ServerProtocol.DIALOG_RETURN_SCOPES_TRUE.equalsIgnoreCase(obj) || "1".equalsIgnoreCase(obj))) {
                        return;
                    }
                    this.f22808a.m29136a(a);
                }
            }
        }
    }

    /* renamed from: c */
    protected void m29149c() throws dsq {
        if (!m29147b().isEmpty()) {
            throw new dsq(m29147b());
        }
    }

    /* renamed from: a */
    public void m29143a(dsr dsr, ListIterator listIterator) throws dsv {
        while (listIterator.hasNext()) {
            String str = (String) listIterator.next();
            if (m29142a().m29193b(str) && str.startsWith("-")) {
                listIterator.previous();
                break;
            } else {
                try {
                    dsr.m29166a(dsy.m29195b(str));
                } catch (RuntimeException e) {
                    listIterator.previous();
                }
            }
        }
        if (dsr.m29179n() == null && !dsr.m29169d()) {
            throw new dsp(dsr);
        }
    }

    /* renamed from: a */
    protected void m29145a(String str, ListIterator listIterator) throws dsv {
        if (m29142a().m29193b(str)) {
            dsr dsr = (dsr) m29142a().m29188a(str).clone();
            if (dsr.m29173h()) {
                m29147b().remove(dsr.m29165a());
            }
            if (m29142a().m29191b(dsr) != null) {
                dss b = m29142a().m29191b(dsr);
                if (b.m29184c()) {
                    m29147b().remove(b);
                }
                b.m29182a(dsr);
            }
            if (dsr.m29171f()) {
                m29143a(dsr, listIterator);
            }
            this.f22808a.m29136a(dsr);
            return;
        }
        throw new dsx(new StringBuffer().append("Unrecognized option: ").append(str).toString(), str);
    }
}
