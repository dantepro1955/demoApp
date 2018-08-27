package com.p000;

import android.os.Bundle;
import com.ninegag.android.tv.model.PostListItem;
import com.ninegag.android.tv.model.PostVideo;
import com.ninegag.android.tv.otto.PostListResponseEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p000.cwe.C4621a;

/* compiled from: PostListWrapper */
/* renamed from: cvj */
public class cvj extends crw<cvl> {
    /* renamed from: a */
    private cvj$a f16700a;
    /* renamed from: b */
    private int f16701b;

    public cvj(cvj$a cvj_a) {
        this.f16700a = cvj_a;
    }

    /* renamed from: a */
    public void m20854a(Bundle bundle) {
        super.a(bundle);
        bundle.putBoolean("safe_mode_status", cij.m13687a().m13732h());
    }

    /* renamed from: b */
    public void m20856b(Bundle bundle) {
        if (bundle != null) {
            if (cij.m13687a().m13732h() == bundle.getBoolean("safe_mode_status")) {
                super.b(bundle);
                return;
            }
            return;
        }
        super.b(bundle);
    }

    /* renamed from: b */
    protected List<cvl> m20855b(int i) {
        List<PostListItem> a = caf.m12046a().m12081k().f20339a.a(this.f16700a.f20291a, i);
        List arrayList = new ArrayList();
        for (PostListItem d : a) {
            arrayList.add(d.d());
        }
        Map a2 = caf.m12046a().m12081k().f20339a.a(arrayList);
        List arrayList2 = new ArrayList();
        for (PostListItem d2 : a) {
            cvl cvl = new cvl(d2.f());
            cvl.a((PostVideo) a2.get(d2.d()));
            arrayList2.add(cvl);
            dlq.a(cvl.b());
        }
        return arrayList2;
    }

    /* renamed from: a */
    protected List<cvl> m20852a() {
        return m20855b(0);
    }

    /* renamed from: a */
    protected List<cvl> m20853a(int i) {
        return m20855b(this.f16701b + i);
    }

    /* renamed from: b */
    protected boolean m20857b() {
        return caf.m12046a().m12081k().f20339a.d(this.f16700a.f20291a);
    }

    /* renamed from: c */
    protected void m20858c() {
        caf.m12046a().m12083m().a(C4621a.b(this.f16700a.f20291a, this.f16700a.f20292b, 0));
    }

    /* renamed from: d */
    protected void m20859d() {
        caf.m12046a().m12083m().a(C4621a.b(this.f16700a.f20291a, this.f16700a.f20292b, 1));
    }

    /* renamed from: e */
    protected String m20860e() {
        return this.f16700a.f20291a;
    }

    @dhg
    public void onPostListResponse(PostListResponseEvent postListResponseEvent) {
        if (postListResponseEvent.f18867b == 0) {
            C();
        } else {
            D();
        }
    }
}
