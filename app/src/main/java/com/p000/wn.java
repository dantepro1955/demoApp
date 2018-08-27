package com.p000;

import java.util.Map;

/* renamed from: wn */
public class wn {
    /* renamed from: a */
    private final String f25863a;
    /* renamed from: b */
    private final Map f25864b;
    /* renamed from: c */
    private final long f25865c;
    /* renamed from: d */
    private final String f25866d;

    public wn(String str, Map map, long j, String str2) {
        this.f25863a = str;
        this.f25864b = map;
        this.f25865c = j;
        this.f25866d = str2;
    }

    /* renamed from: a */
    public String m34639a() {
        return this.f25863a;
    }

    /* renamed from: b */
    public Map m34640b() {
        return this.f25864b;
    }

    /* renamed from: c */
    public long m34641c() {
        return this.f25865c;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(Object r7) {
        /*
        r6 = this;
        r0 = 1;
        r1 = 0;
        if (r6 != r7) goto L_0x0006;
    L_0x0004:
        r1 = r0;
    L_0x0005:
        return r1;
    L_0x0006:
        if (r7 == 0) goto L_0x0005;
    L_0x0008:
        r2 = r6.getClass();
        r3 = r7.getClass();
        if (r2 != r3) goto L_0x0005;
    L_0x0012:
        r7 = (p000.wn) r7;
        r2 = r6.f25865c;
        r4 = r7.f25865c;
        r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r2 != 0) goto L_0x0005;
    L_0x001c:
        r2 = r6.f25863a;
        if (r2 == 0) goto L_0x0049;
    L_0x0020:
        r2 = r6.f25863a;
        r3 = r7.f25863a;
        r2 = r2.equals(r3);
        if (r2 == 0) goto L_0x0005;
    L_0x002a:
        r2 = r6.f25864b;
        if (r2 == 0) goto L_0x004e;
    L_0x002e:
        r2 = r6.f25864b;
        r3 = r7.f25864b;
        r2 = r2.equals(r3);
        if (r2 == 0) goto L_0x0005;
    L_0x0038:
        r2 = r6.f25866d;
        if (r2 == 0) goto L_0x0053;
    L_0x003c:
        r2 = r6.f25866d;
        r3 = r7.f25866d;
        r2 = r2.equals(r3);
        if (r2 != 0) goto L_0x0047;
    L_0x0046:
        r0 = r1;
    L_0x0047:
        r1 = r0;
        goto L_0x0005;
    L_0x0049:
        r2 = r7.f25863a;
        if (r2 == 0) goto L_0x002a;
    L_0x004d:
        goto L_0x0005;
    L_0x004e:
        r2 = r7.f25864b;
        if (r2 == 0) goto L_0x0038;
    L_0x0052:
        goto L_0x0005;
    L_0x0053:
        r2 = r7.f25866d;
        if (r2 != 0) goto L_0x0046;
    L_0x0057:
        goto L_0x0047;
        */
        throw new UnsupportedOperationException("Method not decompiled: wn.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((((this.f25864b != null ? this.f25864b.hashCode() : 0) + ((this.f25863a != null ? this.f25863a.hashCode() : 0) * 31)) * 31) + ((int) (this.f25865c ^ (this.f25865c >>> 32)))) * 31;
        if (this.f25866d != null) {
            i = this.f25866d.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "SdkEvent{eventType='" + this.f25863a + '\'' + ", parameters=" + this.f25864b + ", creationTsMillis=" + this.f25865c + ", uniqueIdentifier='" + this.f25866d + '\'' + '}';
    }
}
