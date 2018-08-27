package com.p000;

import com.facebook.stetho.server.http.HttpStatus;
import java.util.Arrays;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: CustomVariables */
/* renamed from: dsz */
public class dsz extends HashMap<String, JSONArray> {
    public /* synthetic */ Object put(Object obj, Object obj2) {
        return m29197a((String) obj, (JSONArray) obj2);
    }

    public dsz() {
        super(5);
    }

    /* renamed from: a */
    public JSONArray m29196a(int i, String str, String str2) {
        if (i > 0 && i <= 5) {
            int i2;
            int i3 = str != null ? 1 : 0;
            if (str2 != null) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            if ((i2 & i3) != 0) {
                if (str.length() > HttpStatus.HTTP_OK) {
                    dth.m29262c("PIWIK:CustomVariables", String.format("Name is too long %s", new Object[]{str}));
                    str = str.substring(0, HttpStatus.HTTP_OK);
                }
                if (str2.length() > HttpStatus.HTTP_OK) {
                    dth.m29262c("PIWIK:CustomVariables", String.format("Value is too long %s", new Object[]{str2}));
                    str2 = str2.substring(0, HttpStatus.HTTP_OK);
                }
                return m29197a(Integer.toString(i), new JSONArray(Arrays.asList(new String[]{str, str2})));
            }
        }
        dth.m29259a("PIWIK:CustomVariables", "Index is out of range or name/value is null");
        return null;
    }

    /* renamed from: a */
    public JSONArray m29197a(String str, JSONArray jSONArray) {
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
