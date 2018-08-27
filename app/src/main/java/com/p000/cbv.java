package com.p000;

import com.ninegag.android.app.ui.PollingActivity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* compiled from: PollingLeaderboardListWrapper */
/* renamed from: cbv */
public class cbv extends ccs {
    /* renamed from: b */
    private static Comparator<clf> f8643b = new C16631();

    /* compiled from: PollingLeaderboardListWrapper */
    /* renamed from: cbv$1 */
    static class C16631 implements Comparator<clf> {
        C16631() {
        }

        public /* synthetic */ int compare(Object obj, Object obj2) {
            return m12387a((clf) obj, (clf) obj2);
        }

        /* renamed from: a */
        public int m12387a(clf clf, clf clf2) {
            int intValue = clf2.m14269i().m12643j().intValue() - clf.m14269i().m12643j().intValue();
            if (intValue != 0) {
                return intValue;
            }
            String str;
            String e = clf.m14269i().m12629e();
            String e2 = clf2.m14269i().m12629e();
            if (e == null) {
                str = "";
            } else {
                str = e;
            }
            if (e2 == null) {
                e2 = "";
            }
            int compare = String.CASE_INSENSITIVE_ORDER.compare(str, e2);
            return compare == 0 ? str.compareTo(e2) : compare;
        }
    }

    public cbv(cco cco) {
        super(cco);
    }

    /* renamed from: b */
    protected List<cct> mo1641b(int i) {
        List<clf> c = m12339c(i);
        List arrayList = new ArrayList();
        Collections.sort(c, f8643b);
        int i2 = 1;
        int i3 = 0;
        int i4 = 0;
        for (clf clf : c) {
            int i5;
            if (cbp.m12309a(clf.m14269i().m12623c())) {
                i5 = i2;
                i2 = i3;
                i3 = i4;
            } else {
                int intValue = clf.m14269i().m12643j().intValue();
                if (intValue != i3) {
                    i4 += i2;
                    i2 = 1;
                } else {
                    i2++;
                }
                cbn a = cbn.m12304a(clf.m14269i(), i4);
                a.m12306a(i4);
                arrayList.add(a);
                i5 = i2;
                i3 = i4;
                i2 = intValue;
            }
            i4 = i3;
            i3 = i2;
            i2 = i5;
        }
        return arrayList;
    }

    /* renamed from: c */
    protected void mo1643c() {
        cco a = cco.m12554a(PollingActivity.SCOPE);
        caf.m12046a().m12079i().m13573d(a.f8731c, a.f8733e, a.m12563b(), a.f8730b);
    }

    /* renamed from: f */
    public boolean mo1645f() {
        return true;
    }

    /* renamed from: a */
    protected List<cct> mo1640a(int i) {
        return new ArrayList();
    }

    /* renamed from: b */
    protected boolean mo1642b() {
        return false;
    }

    /* renamed from: d */
    protected void mo1644d() {
    }
}
