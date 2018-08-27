package com.p000;

import com.facebook.stetho.server.http.HttpStatus;
import java.util.Arrays;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: Under9PiwikCustomVariables */
/* renamed from: diu */
public class diu extends HashMap<String, JSONArray> {
    /* renamed from: a */
    private int f21771a = 1;

    public /* synthetic */ Object put(Object obj, Object obj2) {
        return m27497a((String) obj, (JSONArray) obj2);
    }

    public diu() {
        super(10);
    }

    /* renamed from: a */
    public static diu m27494a(int i) {
        diu diu = new diu();
        if (i > 0 && i < 10) {
            diu.f21771a = i;
        }
        return diu;
    }

    /* renamed from: a */
    public JSONArray m27496a(String str, String str2) {
        int i = this.f21771a;
        this.f21771a = i + 1;
        return m27495a(i, str, str2);
    }

    /* renamed from: a */
    public JSONArray m27495a(int i, String str, String str2) {
        if (i <= 0 || str == null || str2 == null) {
            dth.m29259a("PIWIK:CustomVariables", "Index is out of range or name/value is null");
            return null;
        }
        if (str.length() > HttpStatus.HTTP_OK) {
            dth.m29262c("PIWIK:CustomVariables", String.format("Name is too long %s", new Object[]{str}));
            str = str.substring(0, HttpStatus.HTTP_OK);
        }
        if (str2.length() > HttpStatus.HTTP_OK) {
            dth.m29262c("PIWIK:CustomVariables", String.format("Value is too long %s", new Object[]{str2}));
            str2 = str2.substring(0, HttpStatus.HTTP_OK);
        }
        return m27497a(Integer.toString(i), new JSONArray(Arrays.asList(new String[]{str, str2})));
    }

    /* renamed from: a */
    public JSONArray m27497a(String str, JSONArray jSONArray) {
        if (jSONArray.length() == 2 && str != null) {
            return (JSONArray) super.put(str, jSONArray);
        }
        dth.m29259a("PIWIK:CustomVariables", "value length should be equal 2");
        return null;
    }

    public String toString() {
        if (size() == 0) {
            return null;
        }
        return new JSONObject(this).toString();
    }
}
