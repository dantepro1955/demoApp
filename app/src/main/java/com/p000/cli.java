package com.p000;

import android.content.Context;
import android.net.Uri;
import com.ninegag.android.app.R;

/* compiled from: GagItemSharingWrapper */
/* renamed from: cli */
public class cli extends clh<cct> {
    public cli(Context context, cct cct) {
        super(context, cct);
        this.b = cct.m12282e();
        this.c = a.m12073f().m13493a(context, cct);
    }

    /* renamed from: a */
    public String mo1780a() {
        return this.d.getString(R.string.share_gag_subject);
    }

    /* renamed from: b */
    public String mo1781b() {
        return ((cct) this.e).m12281d() + " " + String.format("http://9gag.com/gag/%s?ref=android", new Object[]{this.b});
    }

    /* renamed from: c */
    public String mo1782c() {
        return String.format("http://9gag.com/gag/%s?ref=android", new Object[]{this.b});
    }

    /* renamed from: d */
    public Uri mo1783d() {
        return this.c;
    }
}
