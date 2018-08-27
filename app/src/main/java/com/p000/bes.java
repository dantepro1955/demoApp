package com.p000;

import android.content.Context;
import android.text.TextUtils;
import com.facebook.appevents.AppEventsConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@bhd
/* renamed from: bes */
public class bes {
    /* renamed from: a */
    public List<String> m7901a(JSONObject jSONObject, String str) throws JSONException {
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        if (optJSONArray == null) {
            return null;
        }
        List arrayList = new ArrayList(optJSONArray.length());
        for (int i = 0; i < optJSONArray.length(); i++) {
            arrayList.add(optJSONArray.getString(i));
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* renamed from: a */
    public void m7902a(Context context, String str, bjt bjt, String str2, boolean z, List<String> list) {
        if (list != null && !list.isEmpty()) {
            String str3 = z ? "1" : AppEventsConstants.EVENT_PARAM_VALUE_NO;
            for (String replaceAll : list) {
                String replaceAll2 = replaceAll2.replaceAll("@gw_adlocid@", str2).replaceAll("@gw_adnetrefresh@", str3).replaceAll("@gw_qdata@", bjt.f6563r.f5845h).replaceAll("@gw_sdkver@", str).replaceAll("@gw_sessid@", ako.m2347i().m8923a()).replaceAll("@gw_seqnum@", bjt.f6554i);
                if (!TextUtils.isEmpty(bjt.f6566u)) {
                    replaceAll2 = replaceAll2.replaceAll("@gw_adnetstatus@", bjt.f6566u);
                }
                if (bjt.f6560o != null) {
                    replaceAll2 = replaceAll2.replaceAll("@gw_adnetid@", bjt.f6560o.f5823b).replaceAll("@gw_allocid@", bjt.f6560o.f5825d);
                }
                ako.m2343e().m9122b(context, str, replaceAll2);
            }
        }
    }
}
