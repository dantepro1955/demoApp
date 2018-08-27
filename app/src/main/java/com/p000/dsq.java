package com.p000;

import java.util.Iterator;
import java.util.List;

/* compiled from: MissingOptionException */
/* renamed from: dsq */
public class dsq extends dsv {
    /* renamed from: a */
    private List f22821a;

    public dsq(String str) {
        super(str);
    }

    public dsq(List list) {
        this(dsq.m29161a(list));
        this.f22821a = list;
    }

    /* renamed from: a */
    private static String m29161a(List list) {
        StringBuffer stringBuffer = new StringBuffer("Missing required option");
        stringBuffer.append(list.size() == 1 ? "" : "s");
        stringBuffer.append(": ");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            stringBuffer.append(it.next());
            if (it.hasNext()) {
                stringBuffer.append(", ");
            }
        }
        return stringBuffer.toString();
    }
}
