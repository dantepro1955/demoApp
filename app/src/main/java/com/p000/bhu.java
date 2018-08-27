package com.p000;

import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.ads.identifier.AdvertisingIdClient.Info;
import com.google.android.gms.internal.zzmk;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;
import p000.big.C1235a;

@bhd
/* renamed from: bhu */
public class bhu {
    /* renamed from: a */
    public Bundle f6285a;
    /* renamed from: b */
    public Bundle f6286b;
    /* renamed from: c */
    public List<String> f6287c = new ArrayList();
    /* renamed from: d */
    public Location f6288d;
    /* renamed from: e */
    public C1235a f6289e;
    /* renamed from: f */
    public String f6290f;
    /* renamed from: g */
    public String f6291g;
    /* renamed from: h */
    public Info f6292h;
    /* renamed from: i */
    public zzmk f6293i;
    /* renamed from: j */
    public bic f6294j;
    /* renamed from: k */
    public JSONObject f6295k = new JSONObject();

    /* renamed from: a */
    public bhu m8541a(Location location) {
        this.f6288d = location;
        return this;
    }

    /* renamed from: a */
    public bhu m8542a(Bundle bundle) {
        this.f6286b = bundle;
        return this;
    }

    /* renamed from: a */
    public bhu m8543a(bic bic) {
        this.f6294j = bic;
        return this;
    }

    /* renamed from: a */
    public bhu m8544a(C1235a c1235a) {
        this.f6289e = c1235a;
        return this;
    }

    /* renamed from: a */
    public bhu m8545a(Info info) {
        this.f6292h = info;
        return this;
    }

    /* renamed from: a */
    public bhu m8546a(zzmk zzmk) {
        this.f6293i = zzmk;
        return this;
    }

    /* renamed from: a */
    public bhu m8547a(String str) {
        this.f6291g = str;
        return this;
    }

    /* renamed from: a */
    public bhu m8548a(List<String> list) {
        if (list == null) {
            this.f6287c.clear();
        }
        this.f6287c = list;
        return this;
    }

    /* renamed from: a */
    public bhu m8549a(JSONObject jSONObject) {
        this.f6295k = jSONObject;
        return this;
    }

    /* renamed from: b */
    public bhu m8550b(Bundle bundle) {
        this.f6285a = bundle;
        return this;
    }

    /* renamed from: b */
    public bhu m8551b(String str) {
        this.f6290f = str;
        return this;
    }
}
