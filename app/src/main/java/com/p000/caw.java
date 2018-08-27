package com.p000;

import android.os.Bundle;
import com.ninegag.android.app.otto.response.GroupListResponseEvent;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* compiled from: ExploreListWrapper */
/* renamed from: caw */
public class caw extends crw<cay> {
    /* renamed from: a */
    public static int f8551a = 0;
    /* renamed from: b */
    public static int f8552b = 1;

    /* renamed from: a */
    protected List<cay> mo1729a() {
        int i = 0;
        List<ckm> a = caf.m12046a().m12075g().f9369b.m13679a("exploreList", 0);
        String[] g = caf.m12046a().m12087q().mo1790g();
        HashSet hashSet = new HashSet();
        int length = g.length;
        while (i < length) {
            hashSet.add(g[i].toLowerCase());
            i++;
        }
        List arrayList = new ArrayList();
        for (ckm ckm : a) {
            if (!cij.m13687a().m13732h()) {
                arrayList.add(new cay(ckm.m14202e()));
            } else if (!hashSet.contains(ckm.m14202e().m14174d().toLowerCase())) {
                arrayList.add(new cay(ckm.m14202e()));
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    protected List<cay> m12192a(int i) {
        return new ArrayList();
    }

    /* renamed from: b */
    protected boolean m12195b() {
        return caf.m12046a().m12075g().f9369b.m13683c("exploreList");
    }

    /* renamed from: c */
    protected void m12196c() {
        caf.m12046a().m12079i().m13574d(-1);
    }

    /* renamed from: d */
    protected void m12197d() {
    }

    @dhg
    public void onGroupListResponse(GroupListResponseEvent groupListResponseEvent) {
        C();
    }

    /* renamed from: e */
    protected String m12198e() {
        return "exploreList";
    }

    /* renamed from: a */
    public void m12193a(Bundle bundle) {
        super.a(bundle);
        bundle.putBoolean("safe_mode_status", cij.m13687a().m13732h());
    }

    /* renamed from: b */
    public void m12194b(Bundle bundle) {
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
