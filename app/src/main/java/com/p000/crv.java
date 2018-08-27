package com.p000;

import android.os.Bundle;
import com.ninegag.android.app.otto.response.FeaturedListResponseEvent;
import java.util.ArrayList;
import java.util.List;

/* compiled from: FeaturedPostsList */
/* renamed from: crv */
public class crv extends crw<cru> {
    /* renamed from: a */
    private static final caf f16698a = caf.m12046a();

    /* renamed from: a */
    protected List<cru> m20836a() {
        List<cka> d = caf.m12046a().m12075g().m13723d(false);
        List arrayList = new ArrayList(d.size());
        boolean h = cij.m13687a().m13732h();
        for (cka cru : d) {
            cru cru2 = new cru(cru);
            if (!h || !cru2.d()) {
                arrayList.add(cru2);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    protected List<cru> m20837a(int i) {
        return new ArrayList();
    }

    /* renamed from: b */
    protected boolean m20840b() {
        return false;
    }

    /* renamed from: c */
    protected void m20841c() {
        f16698a.m12079i().m13580f(-1);
    }

    /* renamed from: d */
    protected void m20842d() {
    }

    /* renamed from: e */
    protected String m20843e() {
        return "featuredList";
    }

    @dhg
    public void onFeaturedPostListResponse(FeaturedListResponseEvent featuredListResponseEvent) {
        C();
    }

    /* renamed from: a */
    public void m20838a(Bundle bundle) {
        super.a(bundle);
        bundle.putBoolean("safe_mode_status", cij.m13687a().m13732h());
    }

    /* renamed from: b */
    public void m20839b(Bundle bundle) {
        if (bundle != null) {
            if (cij.m13687a().m13732h() == bundle.getBoolean("safe_mode_status")) {
                super.b(bundle);
                return;
            }
            return;
        }
        super.b(bundle);
    }
}
