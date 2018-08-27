package com.p000;

import android.support.v7.widget.LinearLayoutManager;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@bhd
/* renamed from: ayk */
public class ayk {
    /* renamed from: a */
    private final Object f5041a = new Object();
    /* renamed from: b */
    private int f5042b;
    /* renamed from: c */
    private List<ayj> f5043c = new LinkedList();

    /* renamed from: a */
    public ayj m6592a() {
        ayj ayj = null;
        int i = 0;
        synchronized (this.f5041a) {
            if (this.f5043c.size() == 0) {
                bky.m9006b("Queue empty");
                return null;
            } else if (this.f5043c.size() >= 2) {
                int i2 = LinearLayoutManager.INVALID_OFFSET;
                int i3 = 0;
                for (ayj ayj2 : this.f5043c) {
                    ayj ayj3;
                    int i4;
                    int i5 = ayj2.m6590i();
                    if (i5 > i2) {
                        i = i5;
                        ayj3 = ayj2;
                        i4 = i3;
                    } else {
                        i4 = i;
                        ayj3 = ayj;
                        i = i2;
                    }
                    i3++;
                    i2 = i;
                    ayj = ayj3;
                    i = i4;
                }
                this.f5043c.remove(i);
                return ayj;
            } else {
                ayj2 = (ayj) this.f5043c.get(0);
                ayj2.m6586e();
                return ayj2;
            }
        }
    }

    /* renamed from: a */
    public boolean m6593a(ayj ayj) {
        boolean z;
        synchronized (this.f5041a) {
            if (this.f5043c.contains(ayj)) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    /* renamed from: b */
    public boolean m6594b(ayj ayj) {
        synchronized (this.f5041a) {
            Iterator it = this.f5043c.iterator();
            while (it.hasNext()) {
                ayj ayj2 = (ayj) it.next();
                if (!((Boolean) bbb.ac.m7064c()).booleanValue() || ako.m2347i().m8942b()) {
                    if (((Boolean) bbb.ae.m7064c()).booleanValue() && !ako.m2347i().m8944c() && ayj != ayj2 && ayj2.m6585d().equals(ayj.m6585d())) {
                        it.remove();
                        return true;
                    }
                } else if (ayj != ayj2 && ayj2.m6582b().equals(ayj.m6582b())) {
                    it.remove();
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: c */
    public void m6595c(ayj ayj) {
        synchronized (this.f5041a) {
            if (this.f5043c.size() >= 10) {
                bky.m9006b("Queue is full, current size = " + this.f5043c.size());
                this.f5043c.remove(0);
            }
            int i = this.f5042b;
            this.f5042b = i + 1;
            ayj.m6579a(i);
            this.f5043c.add(ayj);
        }
    }
}
