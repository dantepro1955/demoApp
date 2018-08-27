package com.p000;

import android.content.Context;
import android.content.res.Resources;
import p000.ahs.C0181c;

/* renamed from: aoo */
public class aoo {
    /* renamed from: a */
    private final Resources f3824a;
    /* renamed from: b */
    private final String f3825b = this.f3824a.getResourcePackageName(C0181c.common_google_play_services_unknown_issue);

    public aoo(Context context) {
        aoi.m4679a((Object) context);
        this.f3824a = context.getResources();
    }

    /* renamed from: a */
    public String m4711a(String str) {
        int identifier = this.f3824a.getIdentifier(str, "string", this.f3825b);
        return identifier == 0 ? null : this.f3824a.getString(identifier);
    }
}
