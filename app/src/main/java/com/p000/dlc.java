package com.p000;

import android.content.Context;
import android.net.Uri;
import android.os.Build.VERSION;
import com.facebook.internal.NativeProtocol;
import p000.dlb.C4964d;

/* compiled from: ExtractorRendererBuilder */
/* renamed from: dlc */
public class dlc implements C4964d {
    /* renamed from: a */
    private final Context f21975a;
    /* renamed from: b */
    private final String f21976b;
    /* renamed from: c */
    private final Uri f21977c;
    /* renamed from: d */
    private dfs f21978d = new dfs(true);

    public dlc(Context context, String str, Uri uri) {
        this.f21975a = context;
        this.f21976b = str;
        this.f21977c = uri;
    }

    /* renamed from: a */
    public void mo4436a(dlb dlb) {
        agp agu;
        agl agr = new agr(NativeProtocol.MESSAGE_GET_ACCESS_TOKEN_REQUEST);
        agn ags = new ags(dlb.m27807k(), null);
        if (VERSION.SDK_INT == 23) {
            agu = new agu(this.f21975a, ags, this.f21976b);
        } else {
            agu = new dkz(this.f21975a, ags, this.f21976b, this.f21978d);
        }
        aek aek = new aek(this.f21977c, agu, agr, 16777216, new aeg[0]);
        adn adn = new adn(this.f21975a, aek, adk.f570a, 1, 5000, dlb.m27807k(), dlb, 50);
        adj adj = new adj(aek, adk.f570a, null, true, dlb.m27807k(), dlb, adx.a(this.f21975a), 3);
        adv[] advArr = new adv[4];
        advArr[0] = adn;
        advArr[1] = adj;
        dlb.m27794a(advArr, ags);
    }

    /* renamed from: a */
    public void mo4435a() {
    }
}
