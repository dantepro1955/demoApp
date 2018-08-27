package com.p000;

import java.util.ArrayList;
import java.util.List;

/* compiled from: UploadSectionListWrapper */
/* renamed from: cgz */
public class cgz extends caw {
    /* renamed from: a */
    protected List<cay> mo1729a() {
        List a = caf.m12046a().m12075g().f9369b.m13679a("exploreList", 0);
        List arrayList = new ArrayList();
        int size = a.size();
        for (int i = 0; i < size; i++) {
            if (((ckm) a.get(i)).m14202e().m14182h().booleanValue()) {
                arrayList.add(new cay(((ckm) a.get(i)).m14202e()));
            }
        }
        return arrayList;
    }
}
