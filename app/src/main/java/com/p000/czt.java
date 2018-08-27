package com.p000;

/* renamed from: czt */
final class czt implements cys {
    /* renamed from: a */
    private final int f20836a;
    /* renamed from: b */
    private final String f20837b;
    /* renamed from: c */
    private final String f20838c;

    public czt(int i, String str, String str2) {
        String str3;
        this.f20836a = i;
        this.f20838c = str2;
        if (str == null) {
            switch (i) {
                case 1:
                    str3 = "Failed to connect to speech server.";
                    break;
                case 2:
                    str3 = "Please retry your query.";
                    break;
                case 5:
                    str3 = "Query cancelled.";
                    break;
                default:
                    str3 = "An error occurred.";
                    break;
            }
        }
        str3 = str;
        this.f20837b = str3;
    }

    /* renamed from: a */
    public final int mo4259a() {
        return this.f20836a;
    }

    /* renamed from: b */
    public final String mo4260b() {
        return this.f20837b;
    }

    /* renamed from: c */
    public final String mo4261c() {
        return this.f20838c;
    }
}
