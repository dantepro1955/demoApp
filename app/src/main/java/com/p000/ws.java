package com.p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map.Entry;
import org.json.JSONObject;

/* renamed from: ws */
class ws {
    /* renamed from: a */
    private final vm f25927a;
    /* renamed from: b */
    private final zi f25928b;
    /* renamed from: c */
    private final Context f25929c;
    /* renamed from: d */
    private final Object[] f25930d = new Object[wp.m34646b()];

    ws(vm vmVar) {
        this.f25927a = vmVar;
        this.f25928b = vmVar.mo5561g();
        this.f25929c = vmVar.m34404i();
    }

    /* renamed from: a */
    private static Object m34651a(String str, JSONObject jSONObject, Object obj) {
        if (obj instanceof Boolean) {
            return Boolean.valueOf(jSONObject.getBoolean(str));
        }
        if (obj instanceof Float) {
            return Float.valueOf((float) jSONObject.getDouble(str));
        }
        if (obj instanceof Integer) {
            return Integer.valueOf(jSONObject.getInt(str));
        }
        if (obj instanceof Long) {
            return Long.valueOf(jSONObject.getLong(str));
        }
        if (obj instanceof String) {
            return jSONObject.getString(str);
        }
        throw new RuntimeException("SDK Error: unknown value type: " + obj.getClass());
    }

    /* renamed from: a */
    private static wr m34652a(String str) {
        for (wr wrVar : wp.m34644a()) {
            if (wrVar.m34649b().equals(str)) {
                return wrVar;
            }
        }
        return null;
    }

    /* renamed from: e */
    private String m34653e() {
        return "com.applovin.sdk." + xy.m34847a(this.f25927a.mo5557a()) + ".";
    }

    /* renamed from: a */
    public SharedPreferences m34654a() {
        if (this.f25929c != null) {
            return this.f25929c.getSharedPreferences("com.applovin.sdk.1", 0);
        }
        throw new IllegalArgumentException("No context specified");
    }

    /* renamed from: a */
    public Object m34655a(wr wrVar) {
        if (wrVar == null) {
            throw new IllegalArgumentException("No setting type specified");
        }
        Object obj;
        synchronized (this.f25930d) {
            try {
                obj = this.f25930d[wrVar.m34647a()];
                if (obj != null) {
                    obj = wrVar.m34648a(obj);
                } else {
                    obj = wrVar.m34650c();
                }
            } catch (Throwable th) {
                this.f25927a.mo5561g().mo5612d("SettingsManager", "Unable to retrieve value for setting " + wrVar.m34649b() + "; using default...");
                obj = wrVar.m34650c();
            }
        }
        return obj;
    }

    /* renamed from: a */
    void m34656a(JSONObject jSONObject) {
        this.f25928b.mo5606a("SettingsManager", "Loading settings from JSON array...");
        synchronized (this.f25930d) {
            String str = "";
            Iterator keys = jSONObject.keys();
            while (keys.hasNext()) {
                str = (String) keys.next();
                if (str != null && str.length() > 0) {
                    try {
                        wr a = ws.m34652a(str);
                        if (a != null) {
                            Object a2 = ws.m34651a(str, jSONObject, a.m34650c());
                            this.f25930d[a.m34647a()] = a2;
                            this.f25928b.mo5606a("SettingsManager", "Setting update: " + a.m34649b() + " set to \"" + a2 + "\"");
                        } else {
                            this.f25928b.mo5610c("SettingsManager", "Unknown setting recieved: " + str);
                        }
                    } catch (Throwable e) {
                        this.f25928b.mo5609b("SettingsManager", "Unable to parse JSON settings array", e);
                    } catch (Throwable e2) {
                        this.f25928b.mo5609b("SettingsManager", "Unable to convert setting object ", e2);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public void m34657a(wr wrVar, Object obj) {
        if (wrVar == null) {
            throw new IllegalArgumentException("No setting type specified");
        } else if (obj == null) {
            throw new IllegalArgumentException("No new value specified");
        } else {
            synchronized (this.f25930d) {
                this.f25930d[wrVar.m34647a()] = obj;
            }
            this.f25928b.mo5606a("SettingsManager", "Setting update: " + wrVar.m34649b() + " set to \"" + obj + "\"");
        }
    }

    /* renamed from: a */
    void m34658a(zm zmVar) {
        long j = 0;
        boolean z = false;
        this.f25928b.mo5608b("SettingsManager", "Loading user-defined settings...");
        if (zmVar != null) {
            synchronized (this.f25930d) {
                boolean z2;
                boolean z3;
                this.f25930d[wp.f25905i.m34647a()] = Boolean.valueOf(zmVar.m34464c());
                long d = zmVar.m34465d();
                if (d >= 0) {
                    if (d > 0) {
                        j = Math.max(30, d);
                    }
                    this.f25930d[wp.f25917u.m34647a()] = Long.valueOf(j);
                    this.f25930d[wp.f25916t.m34647a()] = Boolean.valueOf(true);
                } else if (d == -1) {
                    this.f25930d[wp.f25916t.m34647a()] = Boolean.valueOf(false);
                }
                String e = zmVar.m34466e();
                if (e == null) {
                    e = "NONE";
                }
                Object[] objArr = this.f25930d;
                int a = wp.f25874D.m34647a();
                if (e.equals("NONE")) {
                    e = "";
                }
                objArr[a] = e;
                e = zmVar.m34467f();
                if (e == null) {
                    e = "NONE";
                }
                if (e.equals("NONE")) {
                    z2 = false;
                    z3 = false;
                } else {
                    z2 = false;
                    z3 = false;
                    for (String str : e.split(",")) {
                        if (str.equals(ze.f26079a.m34954a())) {
                            z3 = true;
                        } else if (str.equals(ze.f26080b.m34954a()) || str.contains("INCENT") || str.contains("REWARD")) {
                            z2 = true;
                        } else if (str.equals(vo.f25749b.m34954a())) {
                            z = true;
                        }
                    }
                }
                if (!z3) {
                    this.f25930d[wp.f25874D.m34647a()] = "";
                }
                this.f25930d[wp.f25875E.m34647a()] = Boolean.valueOf(z2);
                this.f25930d[wp.az.m34647a()] = Boolean.valueOf(z);
                if (zmVar instanceof vr) {
                    for (Entry entry : ((vr) zmVar).m34469b().entrySet()) {
                        this.f25930d[((wr) entry.getKey()).m34647a()] = entry.getValue();
                    }
                }
            }
        }
    }

    /* renamed from: b */
    void m34659b() {
        if (this.f25929c == null) {
            throw new IllegalArgumentException("No context specified");
        }
        this.f25928b.mo5608b("SettingsManager", "Saving settings with the application...");
        String e = m34653e();
        Editor edit = m34654a().edit();
        synchronized (this.f25930d) {
            for (wr wrVar : wp.m34644a()) {
                Object obj = this.f25930d[wrVar.m34647a()];
                if (obj != null) {
                    String str = e + wrVar.m34649b();
                    if (obj instanceof Boolean) {
                        edit.putBoolean(str, ((Boolean) obj).booleanValue());
                    } else if (obj instanceof Float) {
                        edit.putFloat(str, ((Float) obj).floatValue());
                    } else if (obj instanceof Integer) {
                        edit.putInt(str, ((Integer) obj).intValue());
                    } else if (obj instanceof Long) {
                        edit.putLong(str, ((Long) obj).longValue());
                    } else if (obj instanceof String) {
                        edit.putString(str, (String) obj);
                    } else {
                        throw new RuntimeException("SDK Error: unknown value: " + obj.getClass());
                    }
                }
            }
        }
        edit.commit();
        this.f25928b.mo5606a("SettingsManager", "Settings saved with the application.");
    }

    /* renamed from: c */
    void m34660c() {
        if (this.f25929c == null) {
            throw new IllegalArgumentException("No context specified");
        }
        this.f25928b.mo5608b("SettingsManager", "Loading settings saved with the application...");
        String e = m34653e();
        SharedPreferences a = m34654a();
        synchronized (this.f25930d) {
            for (wr wrVar : wp.m34644a()) {
                try {
                    Boolean valueOf;
                    String str = e + wrVar.m34649b();
                    Object c = wrVar.m34650c();
                    if (c instanceof Boolean) {
                        valueOf = Boolean.valueOf(a.getBoolean(str, ((Boolean) c).booleanValue()));
                    } else if (c instanceof Float) {
                        valueOf = Float.valueOf(a.getFloat(str, ((Float) c).floatValue()));
                    } else if (c instanceof Integer) {
                        valueOf = Integer.valueOf(a.getInt(str, ((Integer) c).intValue()));
                    } else if (c instanceof Long) {
                        valueOf = Long.valueOf(a.getLong(str, ((Long) c).longValue()));
                    } else if (c instanceof String) {
                        valueOf = a.getString(str, (String) c);
                    } else {
                        throw new RuntimeException("SDK Error: unknown value: " + c.getClass());
                    }
                    this.f25930d[wrVar.m34647a()] = valueOf;
                } catch (Throwable e2) {
                    this.f25928b.mo5609b("SettingsManager", "Unable to load \"" + wrVar.m34649b() + "\"", e2);
                }
            }
        }
    }

    /* renamed from: d */
    void m34661d() {
        synchronized (this.f25930d) {
            Arrays.fill(this.f25930d, null);
        }
        Editor edit = m34654a().edit();
        edit.clear();
        edit.commit();
    }
}
