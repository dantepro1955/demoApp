package com.p000;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

@bhd
/* renamed from: bdh */
public class bdh implements bcy {
    /* renamed from: a */
    private final Object f5646a = new Object();
    /* renamed from: b */
    private final Map<String, C1049a> f5647b = new HashMap();

    /* renamed from: bdh$a */
    public interface C1049a {
    }

    /* renamed from: a */
    public void mo277a(blo blo, Map<String, String> map) {
        String str = (String) map.get("id");
        String str2 = (String) map.get("fail");
        map.get("fail_reason");
        String str3 = (String) map.get("result");
        synchronized (this.f5646a) {
            if (((C1049a) this.f5647b.remove(str)) == null) {
                str2 = "Received result for unexpected method invocation: ";
                str = String.valueOf(str);
                bky.m9011e(str.length() != 0 ? str2.concat(str) : new String(str2));
            } else if (!TextUtils.isEmpty(str2)) {
            } else if (str3 == null) {
            } else {
                try {
                    JSONObject jSONObject = new JSONObject(str3);
                } catch (JSONException e) {
                    e.getMessage();
                }
            }
        }
    }
}
