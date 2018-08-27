package com.p000;

import android.content.Context;
import android.content.Intent;
import p000.cal.C1638a;

/* compiled from: CommentDownloadController */
/* renamed from: cam */
public class cam {
    /* renamed from: a */
    private static caf f8506a = caf.m12046a();
    /* renamed from: b */
    private static cam f8507b = new cam();
    /* renamed from: c */
    private Context f8508c;
    /* renamed from: d */
    private cal f8509d = new cal(2, 2);

    /* renamed from: a */
    public static cam m12136a() {
        return f8507b;
    }

    /* renamed from: a */
    public void m12141a(Context context) {
        this.f8508c = context;
    }

    /* renamed from: a */
    public void m12142a(Intent intent) {
        switch (intent.getIntExtra("command", -1)) {
            case 400:
                m12139b(intent);
                return;
            case 401:
                m12140c(intent);
                return;
            default:
                return;
        }
    }

    /* renamed from: b */
    private void m12139b(Intent intent) {
        String stringExtra = intent.getStringExtra("gag_id");
        this.f8509d.b(new C1638a(stringExtra, m12137a("a_dd8f2b7d304a10edaf6f29517ea0ca4100a43d1b", cqj.a(stringExtra)), intent.getIntExtra("priority", 0)));
    }

    /* renamed from: c */
    private void m12140c(Intent intent) {
        String stringExtra = intent.getStringExtra("gag_id");
        dhp c1638a = new C1638a(stringExtra, m12138b("a_dd8f2b7d304a10edaf6f29517ea0ca4100a43d1b", cqj.a(stringExtra)), intent.getIntExtra("priority", 0));
        c1638a.m12128a(true);
        this.f8509d.b(c1638a);
    }

    /* renamed from: a */
    private String m12137a(String str, String str2) {
        clz q = f8506a.m12087q();
        return "http://comment-cdn.9gag.com" + "/v1/topComments.json?appId=" + str + "&urls=" + str2 + "&commentL1=" + q.m14365A() + "&commentL2=" + q.m14420z() + "&pretty=0";
    }

    /* renamed from: b */
    private String m12138b(String str, String str2) {
        clz q = f8506a.m12087q();
        return "http://comment-cdn.9gag.com" + "/v1/topComments.json?appId=" + str + "&urls=" + str2 + "&order=ts" + "&commentL1=" + q.m14371G() + "&commentL2=" + q.m14370F() + "&pretty=0";
    }
}
