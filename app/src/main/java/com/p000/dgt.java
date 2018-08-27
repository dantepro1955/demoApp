package com.p000;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import p000.dgu.C4899c;

/* compiled from: TracerouteHealthChecker */
/* renamed from: dgt */
public class dgt {
    /* renamed from: a */
    private ArrayList<String> f21584a;
    /* renamed from: b */
    private List<Callable<C4899c>> f21585b;
    /* renamed from: c */
    private ThreadPoolExecutor f21586c;
    /* renamed from: d */
    private Context f21587d;
    /* renamed from: e */
    private djt f21588e;

    public dgt(ArrayList<String> arrayList, Context context) {
        if (arrayList == null) {
            throw new IllegalArgumentException("hosts cannot be null");
        }
        this.f21584a = arrayList;
        this.f21585b = new ArrayList();
        this.f21586c = (ThreadPoolExecutor) djx.m27634a();
        this.f21587d = context;
        this.f21588e = new djt(context);
    }

    /* renamed from: b */
    private boolean m27233b() {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.f21588e.m27625b("u9-dm-traceroute-last", -1) < 1800000) {
            return false;
        }
        this.f21588e.m27621a("u9-dm-traceroute-last", currentTimeMillis);
        return true;
    }

    /* renamed from: a */
    public ArrayList<String> m27234a() {
        if (!m27233b()) {
            return null;
        }
        ArrayList<String> arrayList = new ArrayList();
        Iterator it = this.f21584a.iterator();
        while (it.hasNext()) {
            this.f21585b.add(new dgu((String) it.next()));
        }
        try {
            for (Future future : this.f21586c.invokeAll(this.f21585b)) {
                arrayList.add(((C4899c) future.get()).m27237a());
            }
        } catch (InterruptedException e) {
        } catch (ExecutionException e2) {
        }
        return arrayList;
    }
}
