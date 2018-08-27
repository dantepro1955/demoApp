package com.p000;

import com.under9.android.feedback.model.ReportType;
import java.util.ArrayList;

/* compiled from: FeedbackRuntime */
/* renamed from: dfe */
public class dfe {
    /* renamed from: a */
    ArrayList<ReportType> f21477a;
    /* renamed from: b */
    ArrayList<ReportType> f21478b;
    /* renamed from: c */
    ArrayList<ReportType> f21479c;

    /* renamed from: a */
    public void m26964a(ArrayList<ReportType> arrayList) {
        this.f21477a = arrayList;
    }

    /* renamed from: b */
    public void m26966b(ArrayList<ReportType> arrayList) {
        this.f21478b = arrayList;
    }

    /* renamed from: c */
    public void m26968c(ArrayList<ReportType> arrayList) {
        this.f21479c = arrayList;
    }

    /* renamed from: a */
    public ArrayList<ReportType> m26962a() {
        return this.f21477a;
    }

    /* renamed from: b */
    public ArrayList<ReportType> m26965b() {
        return this.f21478b;
    }

    /* renamed from: c */
    public ArrayList<ReportType> m26967c() {
        return this.f21479c;
    }

    /* renamed from: a */
    public ArrayList<ReportType> m26963a(String str) {
        if ("1".equals(str)) {
            return m26962a();
        }
        if ("2".equals(str)) {
            return m26965b();
        }
        if ("3".equals(str)) {
            return m26967c();
        }
        return m26962a();
    }
}
