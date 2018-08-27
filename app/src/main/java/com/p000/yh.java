package com.p000;

import android.content.Context;
import android.content.SharedPreferences.Editor;
import com.millennialmedia.android.MMRequest;
import com.ninegag.android.app.ui.HomeActivity;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: yh */
class yh implements zo {
    /* renamed from: a */
    private final Context f26041a;

    yh(vm vmVar) {
        if (vmVar == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        this.f26041a = vmVar.m34404i();
    }

    /* renamed from: a */
    private void m34888a(String str, String str2) {
        if (zn.m34841d(str)) {
            Editor edit = this.f26041a.getSharedPreferences("applovin.sdk.targeting", 0).edit();
            edit.putString(str, xy.m34856c(str2));
            edit.commit();
        }
    }

    /* renamed from: a */
    Map m34889a() {
        Map hashMap = new HashMap();
        Map all = this.f26041a.getSharedPreferences("applovin.sdk.targeting", 0).getAll();
        if (all != null && all.size() > 0) {
            for (Entry entry : all.entrySet()) {
                hashMap.put(entry.getKey(), String.valueOf(entry.getValue()));
            }
        }
        return hashMap;
    }

    /* renamed from: a */
    public void mo5614a(char c) {
        String str = c == 'm' ? "m" : c == 'f' ? "f" : "u";
        m34888a(MMRequest.KEY_GENDER, str);
    }

    /* renamed from: a */
    public void mo5615a(int i) {
        if (i < 9999 && i > HomeActivity.REQ_CODE_SELECT_IMAGE) {
            m34888a("yob", Integer.toString(i));
        }
    }
}
