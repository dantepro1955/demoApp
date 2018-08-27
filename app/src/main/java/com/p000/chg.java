package com.p000;

/* compiled from: VideoMetricsHelper */
/* renamed from: chg */
public final class chg {
    /* renamed from: a */
    private final boolean[] f9192a = new boolean[8];

    /* renamed from: a */
    public void m13250a(String str, String str2, String str3, String str4, String str5, long j, long j2, boolean z, chc chc) {
        diu a = diu.a(2);
        if (str != null) {
            a.a(chc.mo1752i(), str);
        }
        if (str2 != null) {
            a.a(chc.mo1753j(), str2);
        }
        a.a(chc.mo1746c(), str3);
        a.a(chc.mo1747d(), str4);
        a.a(chc.mo1748e(), str5);
        a.a(chc.mo1749f(), String.valueOf(j));
        a.a(chc.mo1750g(), String.valueOf(j2));
        if (!(chc.mo1751h() == null || chc.mo1751h().isEmpty())) {
            a.a(chc.mo1751h(), String.valueOf(z));
        }
        chn.m13381a(chc.mo1744a(), chc.mo1745b(), null, null, a);
    }

    /* renamed from: a */
    public void m13248a(String str, String str2, String str3, String str4, String str5, long j, long j2) {
        diu a = diu.a(2);
        if (str != null) {
            a.a("TriggeredFrom", str);
        }
        if (str2 != null) {
            a.a("TriggeredPage", str2);
        }
        a.a("VideoKey", str4);
        a.a("VideoSource", str5);
        a.a("PostKey", str3);
        a.a("SeekFrom", String.valueOf(j));
        a.a("SeekFrom", String.valueOf(j2));
        chn.m13381a("VideoAction", "SeekVideo", null, null, a);
    }

    /* renamed from: a */
    public void m13249a(String str, String str2, String str3, String str4, String str5, long j, long j2, long j3, long j4) {
        long round = (long) Math.round((((float) (j - j2)) / (((float) (j3 - j2)) + 0.0f)) * 100.0f);
        String str6 = "";
        String str7 = "";
        int i = -1;
        if (round >= 1 && round < 5) {
            str6 = "Complete1PercentVideo";
            str7 = "VideoAction";
        } else if (round >= 5 && round < 10) {
            str6 = "Complete5PercentVideo";
            str7 = "VideoAction";
        } else if (round >= 10 && round < 25) {
            str6 = "Complete10PercentVideo";
            str7 = "VideoAction";
        } else if (round >= 25 && round < 50) {
            str6 = "Complete25PercentVideo";
            str7 = "VideoAction";
        } else if (round >= 50 && round < 75) {
            str6 = "Complete50PercentVideo";
            str7 = "VideoAction";
        } else if (round >= 75 && round < 90) {
            str6 = "Complete75PercentVideo";
            str7 = "VideoAction";
        } else if (round >= 90 && round < 95) {
            str6 = "Complete90PercentVideo";
            str7 = "VideoAction";
        } else if (round >= 95) {
            str6 = "Complete95PercentVideo";
            str7 = "VideoAction";
        }
        Object obj = -1;
        switch (str6.hashCode()) {
            case -1806247602:
                if (str6.equals("Complete1PercentVideo")) {
                    obj = null;
                    break;
                }
                break;
            case -234376438:
                if (str6.equals("Complete50PercentVideo")) {
                    obj = 4;
                    break;
                }
                break;
            case -184715598:
                if (str6.equals("Complete25PercentVideo")) {
                    obj = 3;
                    break;
                }
                break;
            case 571341323:
                if (str6.equals("Complete95PercentVideo")) {
                    obj = 7;
                    break;
                }
                break;
            case 1315107666:
                if (str6.equals("Complete5PercentVideo")) {
                    obj = 1;
                    break;
                }
                break;
            case 1582458573:
                if (str6.equals("Complete75PercentVideo")) {
                    obj = 5;
                    break;
                }
                break;
            case 1787858062:
                if (str6.equals("Complete10PercentVideo")) {
                    obj = 2;
                    break;
                }
                break;
            case 2038356358:
                if (str6.equals("Complete90PercentVideo")) {
                    obj = 6;
                    break;
                }
                break;
        }
        switch (obj) {
            case null:
                i = 0;
                break;
            case 1:
                i = 1;
                break;
            case 2:
                i = 2;
                break;
            case 3:
                i = 3;
                break;
            case 4:
                i = 4;
                break;
            case 5:
                i = 5;
                break;
            case 6:
                i = 6;
                break;
            case 7:
                i = 7;
                break;
        }
        if (!str6.isEmpty() && !this.f9192a[i]) {
            diu a = diu.a(2);
            if (str != null) {
                a.a("TriggeredFrom", str);
            }
            if (str2 != null) {
                a.a("TriggeredPage", str2);
            }
            a.a("VideoKey", str4);
            a.a("VideoSource", str5);
            a.a("PostKey", str3);
            a.a("Time", String.valueOf(j));
            a.a("LengthOfVideo", String.valueOf(j4));
            this.f9192a[i] = true;
            chn.m13381a(str7, str6, null, null, a);
        }
    }
}
