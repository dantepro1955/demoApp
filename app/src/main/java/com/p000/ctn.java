package com.p000;

import android.content.Context;
import p000.ctd.C4572a;
import p000.ctd.C4573b;

/* compiled from: HumanTimeTextUtil */
/* renamed from: ctn */
public class ctn {
    /* renamed from: a */
    public static String m24901a(Context context, long j) {
        if (j <= 0) {
            return djo.m27599a(context, C4573b.common_human_time_a_while);
        }
        if (j <= 60) {
            return ctn.m24912l(context, j);
        }
        long j2 = j / 60;
        if (j2 <= 60) {
            return ctn.m24913m(context, j2);
        }
        j2 /= 60;
        if (j2 <= 24) {
            return ctn.m24914n(context, j2);
        }
        return ctn.m24915o(context, j2 / 24);
    }

    /* renamed from: b */
    public static String m24902b(Context context, long j) {
        if (j <= 60) {
            return ctn.m24908h(context, j);
        }
        long j2 = j / 60;
        if (j2 <= 60) {
            return ctn.m24909i(context, j2);
        }
        j2 /= 60;
        if (j2 <= 24) {
            return ctn.m24910j(context, j2);
        }
        return ctn.m24911k(context, j2 / 24);
    }

    /* renamed from: c */
    public static String m24903c(Context context, long j) {
        if (j <= 60) {
            return ctn.m24904d(context, j);
        }
        long j2 = j / 60;
        if (j2 <= 60) {
            return ctn.m24905e(context, j2);
        }
        j2 /= 60;
        if (j2 <= 24) {
            return ctn.m24906f(context, j2);
        }
        return ctn.m24907g(context, j2 / 24);
    }

    /* renamed from: d */
    public static String m24904d(Context context, long j) {
        return String.format(context.getString(C4573b.common_human_time_minimal_seconds), new Object[]{Long.valueOf(j)});
    }

    /* renamed from: e */
    public static String m24905e(Context context, long j) {
        return String.format(context.getString(C4573b.common_human_time_minimal_minutes), new Object[]{Long.valueOf(j)});
    }

    /* renamed from: f */
    public static String m24906f(Context context, long j) {
        return String.format(context.getString(C4573b.common_human_time_minimal_hours), new Object[]{Long.valueOf(j)});
    }

    /* renamed from: g */
    public static String m24907g(Context context, long j) {
        return String.format(context.getString(C4573b.common_human_time_minimal_days), new Object[]{Long.valueOf(j)});
    }

    /* renamed from: h */
    public static String m24908h(Context context, long j) {
        return String.format(context.getString(C4573b.common_human_time_short_seconds), new Object[]{Long.valueOf(j)});
    }

    /* renamed from: i */
    public static String m24909i(Context context, long j) {
        return String.format(context.getString(C4573b.common_human_time_short_minutes), new Object[]{Long.valueOf(j)});
    }

    /* renamed from: j */
    public static String m24910j(Context context, long j) {
        return String.format(context.getString(C4573b.common_human_time_short_hours), new Object[]{Long.valueOf(j)});
    }

    /* renamed from: k */
    public static String m24911k(Context context, long j) {
        return String.format(context.getString(C4573b.common_human_time_short_days), new Object[]{Long.valueOf(j)});
    }

    /* renamed from: l */
    public static String m24912l(Context context, long j) {
        return String.format(djo.m27600a(context, C4572a.common_human_time_seconds, (int) j), new Object[]{Integer.valueOf((int) j)});
    }

    /* renamed from: m */
    public static String m24913m(Context context, long j) {
        return String.format(djo.m27600a(context, C4572a.common_human_time_minutes, (int) j), new Object[]{Integer.valueOf((int) j)});
    }

    /* renamed from: n */
    public static String m24914n(Context context, long j) {
        return String.format(djo.m27600a(context, C4572a.common_human_time_hours, (int) j), new Object[]{Integer.valueOf((int) j)});
    }

    /* renamed from: o */
    public static String m24915o(Context context, long j) {
        return String.format(djo.m27600a(context, C4572a.common_human_time_days, (int) j), new Object[]{Integer.valueOf((int) j)});
    }
}
