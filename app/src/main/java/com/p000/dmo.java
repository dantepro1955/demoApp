package com.p000;

import com.under9.android.remoteconfig.api.model.ApiConfigs;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/* compiled from: BaseRemoteConfigModel */
/* renamed from: dmo */
public class dmo {
    /* renamed from: a */
    ApiConfigs f22246a;
    /* renamed from: b */
    dmr f22247b;
    /* renamed from: c */
    HashSet<String> f22248c;
    /* renamed from: d */
    HashSet<String> f22249d;

    /* renamed from: a */
    public void m28073a(ApiConfigs apiConfigs) {
        this.f22246a = apiConfigs;
        this.f22247b = new dmr();
        if (apiConfigs == null) {
            m28072a();
        }
        if (this.f22246a.features == null) {
            this.f22246a.features = new HashMap();
        }
        if (this.f22246a.parameters == null) {
            this.f22246a.parameters = new HashMap();
        }
        if (this.f22246a.immediatelyEffectiveFeatures == null) {
            this.f22246a.immediatelyEffectiveFeatures = new String[0];
        }
        if (this.f22246a.immediatelyEffectiveParameters == null) {
            this.f22246a.immediatelyEffectiveParameters = new String[0];
        }
        m28070J();
    }

    /* renamed from: J */
    protected void m28070J() {
        this.f22248c = new HashSet(Arrays.asList(this.f22246a.immediatelyEffectiveFeatures));
        this.f22249d = new HashSet(Arrays.asList(this.f22246a.immediatelyEffectiveParameters));
    }

    /* renamed from: K */
    public String m28071K() {
        return this.f22246a.name;
    }

    /* renamed from: c */
    protected boolean m28078c(String str) {
        if (!this.f22246a.features.containsKey(str)) {
            return false;
        }
        if (((Integer) this.f22246a.features.get(str)).intValue() == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    protected dmr m28079d(String str) {
        if (this.f22246a.parameters.containsKey(str)) {
            return (dmr) this.f22246a.parameters.get(str);
        }
        return this.f22247b;
    }

    /* renamed from: e */
    protected boolean m28080e(String str) {
        return this.f22246a.parameters.containsKey(str);
    }

    /* renamed from: a */
    protected void m28074a(String str, int i) {
        this.f22246a.parameters.put(str, new dmr(i));
    }

    /* renamed from: a */
    protected void m28075a(String str, String str2) {
        this.f22246a.parameters.put(str, new dmr(str2));
    }

    /* renamed from: b */
    protected void m28076b(String str, int i) {
        this.f22246a.features.put(str, Integer.valueOf(i));
    }

    /* renamed from: b */
    public boolean m28077b(ApiConfigs apiConfigs) {
        boolean z;
        if (apiConfigs.immediatelyEffectiveFeatures == null || apiConfigs.features == null) {
            z = false;
        } else {
            z = false;
            for (Object obj : apiConfigs.immediatelyEffectiveFeatures) {
                if (this.f22246a.features.containsKey(obj) && apiConfigs.features.containsKey(obj) && this.f22246a.features.get(obj) != apiConfigs.features.get(obj)) {
                    this.f22246a.features.put(obj, apiConfigs.features.get(obj));
                    z = true;
                }
            }
        }
        if (apiConfigs.immediatelyEffectiveParameters == null || apiConfigs.parameters == null) {
            return z;
        }
        String[] strArr = apiConfigs.immediatelyEffectiveParameters;
        int length = strArr.length;
        int i = 0;
        boolean z2 = z;
        while (i < length) {
            Object obj2 = strArr[i];
            if (this.f22246a.parameters.containsKey(obj2) && apiConfigs.parameters.containsKey(obj2) && !((dmr) this.f22246a.parameters.get(obj2)).m28091a((dmr) apiConfigs.parameters.get(obj2))) {
                this.f22246a.parameters.put(obj2, apiConfigs.parameters.get(obj2));
                z = true;
            } else {
                z = z2;
            }
            i++;
            z2 = z;
        }
        return z2;
    }

    /* renamed from: a */
    public void m28072a() {
        this.f22246a = new ApiConfigs();
        this.f22246a.name = "__DEFAULT__";
        this.f22246a.features = new HashMap();
        this.f22246a.parameters = new HashMap();
    }
}
