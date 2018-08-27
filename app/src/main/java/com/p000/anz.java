package com.p000;

import android.text.TextUtils;
import com.google.android.gms.common.ConnectionResult;
import java.util.ArrayList;
import p000.ann.C0290a;

/* renamed from: anz */
public class anz extends Exception {
    /* renamed from: a */
    private final hh<bps<?>, ConnectionResult> f3786a;

    public anz(hh<bps<?>, ConnectionResult> hhVar) {
        this.f3786a = hhVar;
    }

    /* renamed from: a */
    public ConnectionResult m4574a(aoa<? extends C0290a> aoa) {
        bps b = aoa.m4604b();
        aoi.m4689b(this.f3786a.get(b) != null, "The given API was not part of the availability request.");
        return (ConnectionResult) this.f3786a.get(b);
    }

    /* renamed from: a */
    public hh<bps<?>, ConnectionResult> m4575a() {
        return this.f3786a;
    }

    public String getMessage() {
        Iterable arrayList = new ArrayList();
        Object obj = 1;
        for (bps bps : this.f3786a.keySet()) {
            ConnectionResult connectionResult = (ConnectionResult) this.f3786a.get(bps);
            if (connectionResult.m19505b()) {
                obj = null;
            }
            String valueOf = String.valueOf(bps.m10372a());
            String valueOf2 = String.valueOf(connectionResult);
            arrayList.add(new StringBuilder((String.valueOf(valueOf).length() + 2) + String.valueOf(valueOf2).length()).append(valueOf).append(": ").append(valueOf2).toString());
        }
        StringBuilder stringBuilder = new StringBuilder();
        if (obj != null) {
            stringBuilder.append("None of the queried APIs are available. ");
        } else {
            stringBuilder.append("Some of the queried APIs are unavailable. ");
        }
        stringBuilder.append(TextUtils.join("; ", arrayList));
        return stringBuilder.toString();
    }
}
