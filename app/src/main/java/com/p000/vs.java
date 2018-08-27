package com.p000;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: vs */
public class vs {
    /* renamed from: a */
    private static Object m34470a(Object obj) {
        return obj == JSONObject.NULL ? null : obj instanceof JSONObject ? vs.m34472a((JSONObject) obj) : obj instanceof JSONArray ? vs.m34471a((JSONArray) obj) : obj;
    }

    /* renamed from: a */
    public static List m34471a(JSONArray jSONArray) {
        List arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(vs.m34470a(jSONArray.get(i)));
        }
        return arrayList;
    }

    /* renamed from: a */
    public static Map m34472a(JSONObject jSONObject) {
        Map hashMap = new HashMap();
        Iterator keys = jSONObject.keys();
        while (keys.hasNext()) {
            String str = (String) keys.next();
            hashMap.put(str, vs.m34470a(jSONObject.get(str)).toString());
        }
        return hashMap;
    }

    /* renamed from: a */
    static JSONObject m34473a(Map map) {
        JSONObject jSONObject = new JSONObject();
        for (Entry entry : map.entrySet()) {
            jSONObject.put((String) entry.getKey(), entry.getValue());
        }
        return jSONObject;
    }
}
