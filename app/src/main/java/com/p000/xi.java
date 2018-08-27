package com.p000;

import java.util.Map;
import org.json.JSONObject;

/* renamed from: xi */
class xi extends xg {
    /* renamed from: e */
    private int f25968e;
    /* renamed from: f */
    private final yv f25969f;

    public xi(vm vmVar, int i, yv yvVar) {
        super(vo.f25748a, vo.f25749b, null, vmVar);
        this.f25969f = yvVar;
        this.f25968e = i;
    }

    /* renamed from: a */
    protected wo mo5601a(JSONObject jSONObject) {
        return new xq(jSONObject, this.b, this.f25969f);
    }

    /* renamed from: a */
    protected void mo5602a(int i) {
        if (this.f25969f != null) {
            this.f25969f.onNativeAdsFailedToLoad(i);
        }
    }

    /* renamed from: b */
    protected void mo5603b(Map map) {
        map.put("slot_count", Integer.toString(this.f25968e));
    }

    /* renamed from: c */
    protected void mo5604c(Map map) {
        xw a = xu.m34826a().m34827a("tFNW");
        if (a != null) {
            map.put("etfw", Long.toString(a.m34830b()));
            map.put("ntfw", a.m34829a());
        }
    }

    /* renamed from: d */
    protected String mo5605d() {
        return yl.m34918b("nad", this.b);
    }

    /* renamed from: e */
    public String mo5599e() {
        return "tFNW";
    }
}
