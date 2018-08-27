package com.p000;

import android.content.SharedPreferences.Editor;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: wv */
class wv {
    /* renamed from: a */
    private final vm f25934a;
    /* renamed from: b */
    private final Map f25935b = new HashMap();

    wv(vm vmVar) {
        if (vmVar == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        this.f25934a = vmVar;
    }

    /* renamed from: a */
    void m34702a() {
        synchronized (this.f25935b) {
            this.f25935b.clear();
        }
        m34710d();
    }

    /* renamed from: a */
    void m34703a(String str) {
        m34704a(str, 1);
    }

    /* renamed from: a */
    void m34704a(String str, long j) {
        synchronized (this.f25935b) {
            Long l = (Long) this.f25935b.get(str);
            if (l == null) {
                l = Long.valueOf(0);
            }
            this.f25935b.put(str, Long.valueOf(l.longValue() + j));
        }
        m34710d();
    }

    /* renamed from: b */
    long m34705b(String str) {
        long longValue;
        synchronized (this.f25935b) {
            Long l = (Long) this.f25935b.get(str);
            if (l == null) {
                l = Long.valueOf(0);
            }
            longValue = l.longValue();
        }
        return longValue;
    }

    /* renamed from: b */
    JSONObject m34706b() {
        JSONObject jSONObject;
        synchronized (this.f25935b) {
            jSONObject = new JSONObject();
            for (Entry entry : this.f25935b.entrySet()) {
                jSONObject.put((String) entry.getKey(), entry.getValue());
            }
        }
        return jSONObject;
    }

    /* renamed from: b */
    void m34707b(String str, long j) {
        synchronized (this.f25935b) {
            this.f25935b.put(str, Long.valueOf(j));
        }
        m34710d();
    }

    /* renamed from: c */
    void m34708c() {
        try {
            JSONObject jSONObject = new JSONObject(this.f25934a.m34403h().m34654a().getString("stats", "{}"));
            synchronized (this.f25935b) {
                Iterator keys = jSONObject.keys();
                while (keys.hasNext()) {
                    try {
                        String str = (String) keys.next();
                        this.f25935b.put(str, Long.valueOf(jSONObject.getLong(str)));
                    } catch (JSONException e) {
                    }
                }
            }
        } catch (Throwable th) {
            this.f25934a.mo5561g().mo5609b("StatsManager", "Unable to load stats", th);
        }
    }

    /* renamed from: c */
    void m34709c(String str) {
        synchronized (this.f25935b) {
            this.f25935b.remove(str);
        }
        m34710d();
    }

    /* renamed from: d */
    void m34710d() {
        try {
            Editor edit = this.f25934a.m34403h().m34654a().edit();
            edit.putString("stats", m34706b().toString());
            edit.commit();
        } catch (Throwable e) {
            this.f25934a.mo5561g().mo5609b("StatsManager", "Unable to save stats", e);
        }
    }
}
