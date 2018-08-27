package com.p000;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import java.util.HashMap;
import java.util.Map;

/* renamed from: vq */
class vq {
    /* renamed from: a */
    private static final Object f25771a = new Object();
    /* renamed from: b */
    private static final Map f25772b = new HashMap();

    /* renamed from: a */
    static Map m34454a(vm vmVar) {
        Map c;
        synchronized (f25771a) {
            vmVar.mo5561g().mo5606a("AdDataCache", "Reading cached device data...");
            c = vq.m34459c(vmVar);
        }
        return c;
    }

    /* renamed from: a */
    private static void m34455a(String str, Map map) {
        String[] split = str.split("=");
        if (split.length == 2) {
            map.put(split[0], split[1]);
        }
    }

    /* renamed from: a */
    static void m34456a(Map map, vm vmVar) {
        vq.m34457b(map, vmVar);
    }

    /* renamed from: b */
    private static void m34457b(Map map, vm vmVar) {
        if (map == null) {
            throw new IllegalArgumentException("No ad aata specified");
        } else if (vmVar == null) {
            throw new IllegalArgumentException("No sdk specified");
        } else {
            try {
                synchronized (f25772b) {
                    Map map2 = (Map) f25772b.get("ad_data_cache");
                    if (map2 == null) {
                        map2 = new HashMap();
                    }
                    map2.clear();
                    map2.putAll(map);
                    f25772b.put("ad_data_cache", map2);
                }
                Editor edit = vmVar.m34403h().m34654a().edit();
                edit.putString("ad_data_cache", xy.m34850a(map));
                edit.commit();
                vmVar.mo5561g().mo5606a("AdDataCache", map.size() + " " + "ad_data_cache" + " entries saved in cache");
            } catch (Throwable e) {
                vmVar.mo5561g().mo5609b("AdDataCache", "Unable to save ad data entries", e);
            }
        }
    }

    /* renamed from: b */
    static void m34458b(vm vmVar) {
        synchronized (f25771a) {
            vmVar.mo5561g().mo5606a("AdDataCache", "Clearing old device data cache...");
            vq.m34456a(new HashMap(0), vmVar);
        }
    }

    /* renamed from: c */
    private static Map m34459c(vm vmVar) {
        Map map;
        Map hashMap;
        Throwable e;
        synchronized (f25772b) {
            map = (Map) f25772b.get("ad_data_cache");
        }
        if (map == null) {
            SharedPreferences a = vmVar.m34403h().m34654a();
            String string = a.getString("ad_data_cache", "");
            if (string != null && string.length() > 0) {
                try {
                    hashMap = new HashMap();
                    try {
                        for (String a2 : string.split("&")) {
                            vq.m34455a(a2, hashMap);
                        }
                        synchronized (f25772b) {
                            f25772b.put("ad_data_cache", hashMap);
                        }
                        vmVar.mo5561g().mo5606a("AdDataCache", hashMap.size() + " " + "ad_data_cache" + " entries loaded from cache");
                    } catch (Exception e2) {
                        e = e2;
                    }
                } catch (Throwable e3) {
                    Throwable th = e3;
                    hashMap = map;
                    e = th;
                    vmVar.mo5561g().mo5609b("AdDataCache", "Unable to load ad data", e);
                    Editor edit = a.edit();
                    edit.putString("ad_data_cache", "");
                    edit.commit();
                    return hashMap != null ? new HashMap(hashMap) : new HashMap();
                }
                if (hashMap != null) {
                }
            }
        }
        hashMap = map;
        if (hashMap != null) {
        }
    }
}
