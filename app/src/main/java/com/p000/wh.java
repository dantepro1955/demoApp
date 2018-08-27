package com.p000;

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* renamed from: wh */
public class wh {
    /* renamed from: a */
    private final vm f25846a;
    /* renamed from: b */
    private final zi f25847b;
    /* renamed from: c */
    private ArrayList f25848c;
    /* renamed from: d */
    private ArrayList f25849d;
    /* renamed from: e */
    private final Object f25850e;
    /* renamed from: f */
    private final SharedPreferences f25851f;

    wh(vm vmVar) {
        if (vmVar == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        this.f25846a = vmVar;
        this.f25847b = vmVar.mo5561g();
        this.f25851f = vmVar.m34404i().getSharedPreferences("com.applovin.sdk.impl.postbackQueue.domain", 0);
        this.f25850e = new Object();
        this.f25848c = m34620c();
        this.f25849d = new ArrayList();
    }

    /* renamed from: a */
    private wj m34614a(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new wj(this, jSONObject.getString("targetUrl"), vs.m34472a(jSONObject.getJSONObject("requestBody")), jSONObject.getInt("attemptNumber"));
        } catch (Throwable e) {
            this.f25847b.mo5607a("PersistentPostbackManager", "Unable to inflate postback request from JSON.", e);
            return null;
        }
    }

    /* renamed from: a */
    private void m34617a(wj wjVar) {
        synchronized (this.f25850e) {
            m34619b(wjVar);
            m34621c(wjVar);
        }
    }

    /* renamed from: b */
    private void m34619b(wj wjVar) {
        synchronized (this.f25850e) {
            if (this.f25848c.size() < ((Integer) this.f25846a.m34391a(wp.aY)).intValue()) {
                this.f25848c.add(wjVar);
                m34622d();
                this.f25847b.mo5606a("PersistentPostbackManager", "Enqueued postback: " + wjVar);
            } else {
                this.f25847b.mo5610c("PersistentPostbackManager", "Persistent queue has reached maximum size; postback retried in memory only." + wjVar);
            }
        }
    }

    /* renamed from: c */
    private ArrayList m34620c() {
        if (yi.m34896b()) {
            Set<String> stringSet = this.f25851f.getStringSet("com.applovin.sdk.impl.postbackQueue.key", new LinkedHashSet(0));
            ArrayList arrayList = new ArrayList(Math.max(1, stringSet.size()));
            int intValue = ((Integer) this.f25846a.m34391a(wp.aZ)).intValue();
            this.f25847b.mo5606a("PersistentPostbackManager", "Deserializing " + stringSet.size() + " postback(s).");
            for (String str : stringSet) {
                wj a = m34614a(str);
                if (a == null) {
                    this.f25847b.mo5612d("PersistentPostbackManager", "Unable to deserialize postback json: " + str);
                } else if (a.m34629a() > intValue) {
                    arrayList.add(a);
                } else {
                    this.f25847b.mo5606a("PersistentPostbackManager", "Skipping deserialization because maximum attempt count exceeded for postback: " + a);
                }
            }
            this.f25847b.mo5606a("PersistentPostbackManager", "Successfully loaded postback queue with " + arrayList.size() + " postback(s).");
            return arrayList;
        }
        this.f25847b.mo5606a("PersistentPostbackManager", "Loading new postback queue due to old Android version...");
        return new ArrayList();
    }

    /* renamed from: c */
    private void m34621c(wj wjVar) {
        this.f25847b.mo5606a("PersistentPostbackManager", "Preparing to submit postback..." + wjVar);
        synchronized (this.f25850e) {
            wjVar.m34630a(wjVar.m34629a() + 1);
            m34622d();
        }
        int intValue = ((Integer) this.f25846a.m34391a(wp.aZ)).intValue();
        if (wjVar.m34629a() > intValue) {
            this.f25847b.mo5610c("PersistentPostbackManager", "Exceeded maximum persisted attempt count of " + intValue + ". Dequeuing postback: " + wjVar);
            m34623d(wjVar);
            return;
        }
        this.f25846a.m34412q().m34452a(wjVar.m34631b(), wjVar.m34632c(), new wi(this, wjVar));
    }

    /* renamed from: d */
    private void m34622d() {
        if (yi.m34896b()) {
            Set linkedHashSet = new LinkedHashSet(this.f25848c.size());
            Iterator it = this.f25848c.iterator();
            while (it.hasNext()) {
                String f = m34625f((wj) it.next());
                if (f != null) {
                    linkedHashSet.add(f);
                }
            }
            this.f25851f.edit().putStringSet("com.applovin.sdk.impl.postbackQueue.key", linkedHashSet).commit();
            this.f25847b.mo5606a("PersistentPostbackManager", "Wrote updated postback queue to disk.");
            return;
        }
        this.f25847b.mo5606a("PersistentPostbackManager", "Skipping writing postback queue to disk due to old Android version...");
    }

    /* renamed from: d */
    private void m34623d(wj wjVar) {
        synchronized (this.f25850e) {
            this.f25848c.remove(wjVar);
            m34622d();
        }
        this.f25847b.mo5606a("PersistentPostbackManager", "Dequeued successfully transmitted postback: " + wjVar);
    }

    /* renamed from: e */
    private void m34624e(wj wjVar) {
        synchronized (this.f25850e) {
            this.f25849d.add(wjVar);
        }
    }

    /* renamed from: f */
    private String m34625f(wj wjVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("attemptNumber", wjVar.m34629a()).put("targetUrl", wjVar.m34631b()).put("requestBody", new JSONObject(wjVar.m34632c()));
            return jSONObject.toString();
        } catch (Throwable e) {
            this.f25847b.mo5607a("PersistentPostbackManager", "Unable to serialize postback request to JSON.", e);
            return null;
        }
    }

    /* renamed from: a */
    public void m34626a() {
        synchronized (this.f25850e) {
            Iterator it = this.f25848c.iterator();
            while (it.hasNext()) {
                m34621c((wj) it.next());
            }
        }
    }

    /* renamed from: a */
    public void m34627a(String str, Map map) {
        m34617a(new wj(this, str, map));
    }

    /* renamed from: b */
    public void m34628b() {
        synchronized (this.f25850e) {
            Iterator it = this.f25849d.iterator();
            while (it.hasNext()) {
                m34621c((wj) it.next());
            }
            this.f25849d.clear();
        }
    }
}
