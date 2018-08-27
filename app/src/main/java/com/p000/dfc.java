package com.p000;

import android.content.Context;
import java.util.Date;
import p000.dew.C4864h;
import p000.dew.C4865i;

/* compiled from: TimeAgo */
/* renamed from: dfc */
public class dfc {
    /* renamed from: a */
    protected Context f21468a;

    public dfc(Context context) {
        this.f21468a = context;
    }

    /* renamed from: a */
    public String m26953a(long j) {
        int abs = (int) (Math.abs(new Date().getTime() - j) / 1000);
        int i = abs / 60;
        int i2 = i / 60;
        int i3 = i2 / 24;
        int i4 = i3 / 7;
        int i5 = i3 / 30;
        int i6 = i3 / 365;
        String format = String.format(djo.m27600a(this.f21468a, C4864h.time_ago_years_count, i6), new Object[]{Integer.valueOf(i6)});
        if (abs < 60) {
            return djo.m27599a(this.f21468a, C4865i.time_ago_just_now);
        }
        if (i < 60) {
            return String.format(djo.m27600a(this.f21468a, C4864h.time_ago_minutes_count, i), new Object[]{Integer.valueOf(i)});
        } else if (i2 < 24) {
            return String.format(djo.m27600a(this.f21468a, C4864h.time_ago_hours_count, i2), new Object[]{Integer.valueOf(i2)});
        } else if (i3 < 7) {
            return String.format(djo.m27600a(this.f21468a, C4864h.time_ago_days_count, i3), new Object[]{Integer.valueOf(i3)});
        } else if (i4 < 6) {
            return String.format(djo.m27600a(this.f21468a, C4864h.time_ago_weeks_count, i4), new Object[]{Integer.valueOf(i4)});
        } else if (i6 >= 1) {
            return format;
        } else {
            return String.format(djo.m27600a(this.f21468a, C4864h.time_ago_months_count, i5), new Object[]{Integer.valueOf(i5)});
        }
    }
}
