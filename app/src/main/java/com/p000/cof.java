package com.p000;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;

/* compiled from: SectionMainPostListPagerAdapter */
/* renamed from: cof */
public class cof extends cwi {
    /* renamed from: a */
    private String f9910a;
    /* renamed from: b */
    private int f9911b;
    /* renamed from: c */
    private String f9912c;

    public cof(FragmentManager fragmentManager, String str, int i, String str2) {
        super(fragmentManager);
        this.f9910a = str;
        this.f9911b = i;
        this.f9912c = str2;
    }

    /* renamed from: c */
    public static String m14957c(int i) {
        return "section-post-list-" + i;
    }

    /* renamed from: b */
    public String mo1847b(int i) {
        return cof.m14957c(i);
    }

    /* renamed from: a */
    public Fragment mo1846a(int i) {
        switch (i) {
            case 0:
                return cfs.m13001a().m13003a(String.valueOf(this.f9911b)).m13004b(this.f9910a).m13006c(this.f9912c).m13007d("Hot").m13005b();
            case 1:
                return cfs.m13001a().m13003a(String.valueOf(3)).m13004b(this.f9910a).m13006c(this.f9912c).m13007d("FRESH").m13005b();
            default:
                return null;
        }
    }

    public int getCount() {
        return 2;
    }
}
