package com.p000;

import java.util.Map;

/* renamed from: wj */
class wj {
    /* renamed from: a */
    final /* synthetic */ wh f25854a;
    /* renamed from: b */
    private int f25855b;
    /* renamed from: c */
    private String f25856c;
    /* renamed from: d */
    private Map f25857d;

    wj(wh whVar, String str, Map map) {
        this(whVar, str, map, 0);
    }

    wj(wh whVar, String str, Map map, int i) {
        this.f25854a = whVar;
        this.f25855b = i;
        this.f25856c = str + "&postback_ts=" + System.currentTimeMillis();
        this.f25857d = map;
    }

    /* renamed from: a */
    public int m34629a() {
        return this.f25855b;
    }

    /* renamed from: a */
    public void m34630a(int i) {
        this.f25855b = i;
    }

    /* renamed from: b */
    public String m34631b() {
        return this.f25856c;
    }

    /* renamed from: c */
    public Map m34632c() {
        return this.f25857d;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(Object r5) {
        /*
        r4 = this;
        r0 = 1;
        r1 = 0;
        if (r4 != r5) goto L_0x0006;
    L_0x0004:
        r1 = r0;
    L_0x0005:
        return r1;
    L_0x0006:
        if (r5 == 0) goto L_0x0005;
    L_0x0008:
        r2 = r4.getClass();
        r3 = r5.getClass();
        if (r2 != r3) goto L_0x0005;
    L_0x0012:
        r5 = (p000.wj) r5;
        r2 = r4.f25855b;
        r3 = r5.f25855b;
        if (r2 != r3) goto L_0x0005;
    L_0x001a:
        r2 = r4.f25856c;
        if (r2 == 0) goto L_0x0039;
    L_0x001e:
        r2 = r4.f25856c;
        r3 = r5.f25856c;
        r2 = r2.equals(r3);
        if (r2 == 0) goto L_0x0005;
    L_0x0028:
        r2 = r4.f25857d;
        if (r2 == 0) goto L_0x003e;
    L_0x002c:
        r2 = r4.f25857d;
        r3 = r5.f25857d;
        r2 = r2.equals(r3);
        if (r2 != 0) goto L_0x0037;
    L_0x0036:
        r0 = r1;
    L_0x0037:
        r1 = r0;
        goto L_0x0005;
    L_0x0039:
        r2 = r5.f25856c;
        if (r2 == 0) goto L_0x0028;
    L_0x003d:
        goto L_0x0005;
    L_0x003e:
        r2 = r5.f25857d;
        if (r2 != 0) goto L_0x0036;
    L_0x0042:
        goto L_0x0037;
        */
        throw new UnsupportedOperationException("Method not decompiled: wj.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((this.f25856c != null ? this.f25856c.hashCode() : 0) + (this.f25855b * 31)) * 31;
        if (this.f25857d != null) {
            i = this.f25857d.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "PostbackRequest{attemptNumber=" + this.f25855b + ", targetUrl='" + this.f25856c + '\'' + ", requestBody=" + this.f25857d + '}';
    }
}
