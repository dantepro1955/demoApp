package com.p000;

import android.os.Build.VERSION;
import com.facebook.stetho.server.http.HttpStatus;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: MoatConfig */
/* renamed from: bya */
public class bya {
    /* renamed from: a */
    private boolean f8162a = false;
    /* renamed from: b */
    private boolean f8163b = false;
    /* renamed from: c */
    private int f8164c = HttpStatus.HTTP_OK;

    public bya(String str) {
        m11717a(str);
    }

    /* renamed from: a */
    public void m11717a(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("sa");
            boolean equals = string.equals("4724e28a731f8ba73e9eecc4d5c807705dd80963");
            if ((string.equals("on") || equals) && !m11716a(jSONObject)) {
                this.f8162a = true;
                this.f8163b = equals;
            }
            if (jSONObject.has("in")) {
                int i = jSONObject.getInt("in");
                if (i >= 100 && i <= 1000) {
                    this.f8164c = i;
                }
            }
        } catch (Exception e) {
            this.f8162a = false;
            this.f8163b = false;
            this.f8164c = HttpStatus.HTTP_OK;
        }
    }

    /* renamed from: a */
    private boolean m11716a(JSONObject jSONObject) {
        try {
            if (jSONObject.has("ob")) {
                JSONArray jSONArray = jSONObject.getJSONArray("ob");
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    if (jSONArray.getInt(i) == VERSION.SDK_INT) {
                        return true;
                    }
                }
            }
            return false;
        } catch (Exception e) {
            return true;
        }
    }

    /* renamed from: a */
    public boolean m11718a() {
        return this.f8163b;
    }

    /* renamed from: b */
    public boolean m11719b() {
        return this.f8162a;
    }

    /* renamed from: c */
    public int m11720c() {
        return this.f8164c;
    }
}
