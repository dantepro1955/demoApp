package com.p000;

import com.under9.android.lib.network.model.Constants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

/* compiled from: ActionSorter */
/* renamed from: dif */
public class dif {
    /* renamed from: a */
    private HashMap<String, Integer> f21693a;
    /* renamed from: b */
    private HashMap<String, Integer> f21694b;
    /* renamed from: c */
    private int f21695c;
    /* renamed from: d */
    private int f21696d;

    public dif(List<String> list, List<String> list2) {
        if (list == null) {
            list = new ArrayList();
        }
        if (list2 == null) {
            list2 = new ArrayList();
        }
        this.f21693a = new HashMap();
        this.f21694b = new HashMap();
        this.f21695c = list.size();
        this.f21696d = list2.size();
        int i = 0;
        for (String put : list) {
            this.f21693a.put(put, Integer.valueOf(i));
            i++;
        }
        i = 10;
        for (String put2 : list2) {
            this.f21694b.put(put2, Integer.valueOf(i));
            i++;
        }
    }

    /* renamed from: a */
    public void m27366a(List<dhx> list) {
        final HashMap hashMap = new HashMap();
        int size = list.size() + this.f21695c;
        for (dhx a : list) {
            String a2 = a.mo4414a();
            String[] split = a2.split(Constants.SEP);
            Object obj = null;
            if (split.length > 1) {
                obj = split[0];
            }
            if (this.f21693a.containsKey(a2)) {
                hashMap.put(a2, this.f21693a.get(a2));
            } else if (this.f21693a.containsKey(obj)) {
                hashMap.put(a2, this.f21693a.get(obj));
            } else if (this.f21694b.containsKey(a2)) {
                hashMap.put(a2, Integer.valueOf(((Integer) this.f21694b.get(a2)).intValue() + size));
            } else if (this.f21694b.containsKey(obj)) {
                hashMap.put(a2, Integer.valueOf(((Integer) this.f21694b.get(obj)).intValue() + size));
            } else {
                hashMap.put(a2, Integer.valueOf(size));
            }
        }
        Collections.sort(list, new Comparator<dhx>(this) {
            /* renamed from: b */
            final /* synthetic */ dif f21692b;

            public /* synthetic */ int compare(Object obj, Object obj2) {
                return m27365a((dhx) obj, (dhx) obj2);
            }

            /* renamed from: a */
            public int m27365a(dhx dhx, dhx dhx2) {
                Integer num = (Integer) hashMap.get(dhx.mo4414a());
                Integer num2 = (Integer) hashMap.get(dhx2.mo4414a());
                int intValue = num == null ? 999 : num.intValue();
                int intValue2 = num2 == null ? 999 : num2.intValue();
                if (intValue != intValue2) {
                    return intValue < intValue2 ? -1 : 1;
                } else {
                    try {
                        return dhx.m27345b().toString().compareTo(dhx2.m27345b().toString());
                    } catch (Exception e) {
                        return 0;
                    }
                }
            }
        });
    }
}
