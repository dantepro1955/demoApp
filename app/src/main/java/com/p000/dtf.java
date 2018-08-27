package com.p000;

import android.text.TextUtils;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: TrackerBulkURLWrapper */
/* renamed from: dtf */
public class dtf {
    /* renamed from: a */
    private int f22885a = 0;
    /* renamed from: b */
    private final int f22886b;
    /* renamed from: c */
    private final URL f22887c;
    /* renamed from: d */
    private final String f22888d;
    /* renamed from: e */
    private final List<String> f22889e;

    /* compiled from: TrackerBulkURLWrapper */
    /* renamed from: dtf$1 */
    class C50781 implements Iterator<C5079a> {
        /* renamed from: a */
        final /* synthetic */ dtf f22881a;

        C50781(dtf dtf) {
            this.f22881a = dtf;
        }

        public /* synthetic */ Object next() {
            return m29244a();
        }

        public boolean hasNext() {
            return this.f22881a.f22885a < this.f22881a.f22886b;
        }

        /* renamed from: a */
        public C5079a m29244a() {
            if (hasNext()) {
                return new C5079a(this.f22881a, this.f22881a.f22885a = this.f22881a.f22885a + 1);
            }
            return null;
        }

        public void remove() {
        }
    }

    /* compiled from: TrackerBulkURLWrapper */
    /* renamed from: dtf$a */
    public final class C5079a {
        /* renamed from: a */
        protected final int f22882a;
        /* renamed from: b */
        protected final int f22883b;
        /* renamed from: c */
        final /* synthetic */ dtf f22884c;

        protected C5079a(dtf dtf, int i) {
            this.f22884c = dtf;
            if (i >= 0 || i < dtf.f22886b) {
                this.f22882a = i * 20;
                this.f22883b = Math.min(this.f22882a + 20, dtf.f22889e.size());
                return;
            }
            this.f22883b = -1;
            this.f22882a = -1;
        }

        /* renamed from: a */
        public int m29245a() {
            return this.f22883b - this.f22882a;
        }

        /* renamed from: b */
        public boolean m29246b() {
            return this.f22882a == -1 || m29245a() == 0;
        }
    }

    public dtf(URL url, List<String> list, String str) {
        this.f22887c = url;
        this.f22888d = str;
        this.f22886b = (int) Math.ceil((((double) list.size()) * 1.0d) / 20.0d);
        this.f22889e = list;
    }

    /* renamed from: a */
    public Iterator<C5079a> m29251a() {
        return new C50781(this);
    }

    /* renamed from: b */
    public URL m29254b() {
        return this.f22887c;
    }

    /* renamed from: a */
    public JSONObject m29252a(C5079a c5079a) {
        if (c5079a == null || c5079a.m29246b()) {
            return null;
        }
        Iterable subList = this.f22889e.subList(c5079a.f22882a, c5079a.f22883b);
        if (subList.size() == 0) {
            dth.m29262c("PIWIK:TrackerBulkURLWrapper", "Empty page");
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("requests", new JSONArray(subList));
            if (this.f22888d != null) {
                jSONObject.put(dtc.AUTHENTICATION_TOKEN.toString(), this.f22888d);
            }
            return jSONObject;
        } catch (Throwable e) {
            dth.m29260a("PIWIK:TrackerBulkURLWrapper", "Cannot create json object", e);
            dth.m29261b("PIWIK:TrackerBulkURLWrapper", TextUtils.join(", ", subList));
            return null;
        }
    }

    /* renamed from: b */
    public String m29253b(C5079a c5079a) {
        if (c5079a == null || c5079a.m29246b()) {
            return null;
        }
        return m29254b().toString() + ((String) this.f22889e.get(c5079a.f22882a));
    }
}
