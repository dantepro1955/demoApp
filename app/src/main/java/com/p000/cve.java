package com.p000;

import android.os.Bundle;
import com.ninegag.android.tv.model.PostList;
import com.ninegag.android.tv.otto.AvailablePostListResponseEvent;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* compiled from: CategoryListWrapper */
/* renamed from: cve */
public class cve extends crw<cvf> {
    /* renamed from: a */
    protected List<cvf> m20844a() {
        int i = 0;
        List<PostList> a = caf.m12046a().m12081k().f20339a.a();
        List arrayList = new ArrayList();
        String[] e = caf.m12046a().m12087q().mo1788e();
        HashSet hashSet = new HashSet();
        for (Object add : e) {
            hashSet.add(add);
        }
        if (cij.m13687a().m13732h()) {
            String[] f = caf.m12046a().m12087q().mo1789f();
            int length = f.length;
            while (i < length) {
                hashSet.add(f[i]);
                i++;
            }
        }
        for (PostList postList : a) {
            if (!hashSet.contains(postList.c())) {
                arrayList.add(new cvf(postList));
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    protected List<cvf> m20845a(int i) {
        return new ArrayList();
    }

    /* renamed from: b */
    protected boolean m20848b() {
        return false;
    }

    /* renamed from: c */
    protected void m20849c() {
        caf.m12046a().m12083m().b();
    }

    /* renamed from: d */
    protected void m20850d() {
    }

    /* renamed from: e */
    protected String m20851e() {
        return "category-list";
    }

    @dhg
    public void onAvailablePostListResponse(AvailablePostListResponseEvent availablePostListResponseEvent) {
        C();
    }

    /* renamed from: a */
    public void m20846a(Bundle bundle) {
        super.a(bundle);
        bundle.putBoolean("safe_mode_status", cij.m13687a().m13732h());
    }

    /* renamed from: b */
    public void m20847b(Bundle bundle) {
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
