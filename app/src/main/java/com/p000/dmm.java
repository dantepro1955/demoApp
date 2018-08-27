package com.p000;

import java.util.ArrayList;
import java.util.List;

/* compiled from: AdConfig */
/* renamed from: dmm */
public class dmm implements Cloneable {
    /* renamed from: a */
    private String f22234a;
    /* renamed from: b */
    private boolean f22235b;
    /* renamed from: c */
    private List<Integer> f22236c;
    /* renamed from: d */
    private int f22237d;

    public dmm(String str, boolean z, String str2) {
        this.f22234a = str;
        this.f22235b = z;
        this.f22236c = new ArrayList();
        try {
            String[] split = str2.split("\\.\\.\\.");
            for (String parseInt : split[0].contains(",") ? split[0].split(",") : new String[]{split[0]}) {
                this.f22236c.add(Integer.valueOf(Integer.parseInt(parseInt)));
            }
            this.f22237d = Integer.parseInt(split[1]);
        } catch (Exception e) {
            this.f22236c.clear();
            this.f22236c.add(Integer.valueOf(10));
            this.f22237d = 10;
        }
    }

    private dmm(String str, boolean z, List<Integer> list, int i) {
        this.f22234a = str;
        this.f22235b = z;
        this.f22236c = list;
        this.f22237d = i;
    }

    /* renamed from: a */
    public String m28047a() {
        return this.f22234a;
    }

    /* renamed from: b */
    public boolean m28051b() {
        return this.f22235b;
    }

    /* renamed from: a */
    public void m28048a(boolean z) {
        this.f22235b = z;
    }

    /* renamed from: a */
    public boolean m28049a(int i) {
        if (!this.f22235b) {
            return false;
        }
        if (this.f22236c.contains(Integer.valueOf(i))) {
            return true;
        }
        int intValue = ((Integer) this.f22236c.get(this.f22236c.size() - 1)).intValue();
        if (i < intValue) {
            return false;
        }
        boolean z;
        if ((i - intValue) % this.f22237d == 0) {
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    /* renamed from: b */
    public int m28050b(int i) {
        if (!this.f22235b) {
            return 0;
        }
        int i2 = 0;
        for (Integer num : this.f22236c) {
            if (i < num.intValue()) {
                return i2;
            }
            i2++;
            if (i == num.intValue()) {
                return i2;
            }
        }
        int intValue = ((Integer) this.f22236c.get(this.f22236c.size() - 1)).intValue();
        if (i >= this.f22237d + intValue) {
            return i2 + ((i - intValue) / this.f22237d);
        }
        return i2;
    }

    protected Object clone() {
        return new dmm(this.f22234a, this.f22235b, this.f22236c, this.f22237d);
    }

    public String toString() {
        return "AdConfig{mAdUnitId='" + this.f22234a + '\'' + ", mDisplayAdEnabled=" + this.f22235b + ", mInitialOccurrences=" + this.f22236c + ", mRepeatingOccurrence=" + this.f22237d + '}';
    }
}
