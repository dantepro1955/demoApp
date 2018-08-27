package com.p000;

import android.content.Context;
import android.text.Html;
import android.text.TextUtils;
import com.ninegag.android.app.R;

/* compiled from: FeaturedPostItemWrapper */
/* renamed from: cru */
public class cru extends crz<cka> {
    /* renamed from: c */
    private static caf f20014c = caf.a();
    /* renamed from: a */
    public String f20015a;
    /* renamed from: d */
    private cka f20016d;
    /* renamed from: e */
    private String f20017e;
    /* renamed from: f */
    private String f20018f;
    /* renamed from: g */
    private String f20019g;

    public cru(cka cka) {
        super(cka);
        this.f20016d = cka;
    }

    /* renamed from: a */
    public cka m24643a() {
        return this.f20016d;
    }

    /* renamed from: b */
    public String m24645b() {
        if (this.f20015a != null) {
            return this.f20015a;
        }
        Object obj = null;
        switch (this.f20016d.d().intValue()) {
            case 1:
                obj = this.f20016d.g().d();
                break;
            case 2:
                obj = this.f20016d.h().d();
                break;
        }
        if (!TextUtils.isEmpty(obj)) {
            this.f20015a = Html.fromHtml(obj).toString();
        }
        if (this.f20015a == null) {
            return "";
        }
        return this.f20015a;
    }

    /* renamed from: c */
    public String m24647c() {
        return this.f20016d.f();
    }

    /* renamed from: d */
    public boolean m24649d() {
        switch (this.f20016d.d().intValue()) {
            case 1:
                if (this.f20016d.g().l().intValue() != 1) {
                    return false;
                }
                return true;
            case 2:
                return true;
            default:
                return false;
        }
    }

    /* renamed from: a */
    public String m24644a(Context context) {
        String c = m24648c(context);
        String b = m24646b(context);
        if (c == null || b == null) {
            this.f20019g = null;
            return this.f20019g;
        }
        this.f20019g = c + " \t " + b;
        return this.f20019g;
    }

    /* renamed from: b */
    public String m24646b(Context context) {
        if (1 == ((cka) m24642R()).d().intValue()) {
            this.f20017e = String.format(djo.m27600a(context, R.plurals.comments_count, ((cka) m24642R()).g().i().intValue()), new Object[]{djo.m27598a(r0)});
        } else {
            this.f20017e = null;
        }
        return this.f20017e;
    }

    /* renamed from: c */
    public String m24648c(Context context) {
        if (1 == ((cka) m24642R()).d().intValue()) {
            this.f20018f = String.format(djo.m27600a(context, R.plurals.points_count, ((cka) m24642R()).g().j().intValue()), new Object[]{djo.m27598a(r0)});
            return this.f20018f;
        }
        this.f20018f = null;
        return this.f20018f;
    }
}
