package com.p000;

import java.util.ArrayList;
import java.util.List;

/* compiled from: GnuParser */
/* renamed from: dsn */
public class dsn extends dsw {
    /* renamed from: b */
    protected String[] mo4632b(dsu dsu, String[] strArr, boolean z) {
        List arrayList = new ArrayList();
        int i = 0;
        int i2 = 0;
        while (i < strArr.length) {
            String str = strArr[i];
            if ("--".equals(str)) {
                i2 = 1;
                arrayList.add("--");
            } else if ("-".equals(str)) {
                arrayList.add("-");
            } else if (str.startsWith("-")) {
                String a = dsy.m29194a(str);
                if (dsu.m29193b(a)) {
                    arrayList.add(str);
                } else if (a.indexOf(61) != -1 && dsu.m29193b(a.substring(0, a.indexOf(61)))) {
                    arrayList.add(str.substring(0, str.indexOf(61)));
                    arrayList.add(str.substring(str.indexOf(61) + 1));
                } else if (dsu.m29193b(str.substring(0, 2))) {
                    arrayList.add(str.substring(0, 2));
                    arrayList.add(str.substring(2));
                } else {
                    arrayList.add(str);
                    boolean z2 = z;
                }
            } else {
                arrayList.add(str);
            }
            if (i2 != 0) {
                i++;
                while (i < strArr.length) {
                    arrayList.add(strArr[i]);
                    i++;
                }
            }
            i++;
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }
}
