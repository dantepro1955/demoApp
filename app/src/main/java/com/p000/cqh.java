package com.p000;

/* compiled from: PostListRestoreHelper */
/* renamed from: cqh */
public class cqh {
    /* renamed from: a */
    public long m24468a(int i, String str) {
        if (cip.a().al()) {
            return m24470c(i, str);
        }
        return 10800000;
    }

    /* renamed from: b */
    public long m24469b(int i, String str) {
        return m24470c(i, str);
    }

    /* renamed from: c */
    public long m24470c(int i, String str) {
        if (i == 1 || i == 2) {
            return 259200000;
        }
        if (i == 3) {
            return 43200000;
        }
        return 432000000;
    }
}
