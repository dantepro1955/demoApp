package com.p000;

import com.inmobi.commons.analytics.db.AnalyticsSQLiteHelper;

/* compiled from: Time */
/* renamed from: cqy */
public class cqy {
    /* renamed from: a */
    public int f19997a;
    /* renamed from: b */
    public int f19998b;

    public cqy(int i) {
        this.f19997a = i / 60;
        this.f19998b = i % 60;
    }

    /* renamed from: a */
    public int m24527a() {
        return (this.f19997a * 60) + this.f19998b;
    }

    /* renamed from: a */
    public static cqy m24526a(int i) {
        return new cqy(i);
    }

    public String toString() {
        int i = 12;
        StringBuilder stringBuilder = new StringBuilder();
        if (!(this.f19997a == 0 || this.f19997a == 12)) {
            i = this.f19997a % 12;
        }
        return stringBuilder.append(i).append(":").append(String.format("%02d", new Object[]{Integer.valueOf(this.f19998b)})).append(" ").append(this.f19997a > 11 ? "pm" : AnalyticsSQLiteHelper.EVENT_LIST_AM).toString();
    }
}
