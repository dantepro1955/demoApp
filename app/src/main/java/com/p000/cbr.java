package com.p000;

import com.ninegag.android.app.ui.PollingActivity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* compiled from: PollingLanguageListWrapper */
/* renamed from: cbr */
public class cbr extends ccs {
    /* renamed from: b */
    private static Comparator<clf> f8634b = new C16591();

    /* compiled from: PollingLanguageListWrapper */
    /* renamed from: cbr$1 */
    static class C16591 implements Comparator<clf> {
        C16591() {
        }

        public /* synthetic */ int compare(Object obj, Object obj2) {
            return m12330a((clf) obj, (clf) obj2);
        }

        /* renamed from: a */
        public int m12330a(clf clf, clf clf2) {
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
            if (compare == 0) {
                return str.compareTo(e2);
            }
            return compare;
        }
    }

    public cbr(cco cco) {
        super(cco);
    }

    /* renamed from: b */
    protected List<cct> mo1641b(int i) {
        List<clf> c = m12339c(i);
        List arrayList = new ArrayList();
        Collections.sort(c, f8634b);
        int i2 = 1;
        for (clf i3 : c) {
            arrayList.add(cbn.m12304a(i3.m14269i(), i2));
            i2++;
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
