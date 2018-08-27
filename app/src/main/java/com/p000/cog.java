package com.p000;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import com.ninegag.android.app.component.postlist.user.UserGagPostListFragment;

/* compiled from: ProfileMainPostListPagerAdapter */
/* renamed from: cog */
public class cog extends cof {
    /* renamed from: a */
    private String f9913a;
    /* renamed from: b */
    private String f9914b;

    public cog(FragmentManager fragmentManager, String str, String str2) {
        super(fragmentManager, str, 10, "Profile");
        this.f9914b = str;
        this.f9913a = str2;
    }

    /* renamed from: a */
    public static String m14960a(int i, String str) {
        return "profile-post-list-" + i + "-" + str;
    }

    /* renamed from: b */
    public String mo1847b(int i) {
        return cog.m14960a(i, this.f9913a);
    }

    /* renamed from: a */
    public Fragment mo1846a(int i) {
        switch (i) {
            case 0:
                return UserGagPostListFragment.a(10, this.f9913a, "Profile", null);
            case 1:
                return UserGagPostListFragment.a(6, this.f9913a, "Profile", null);
            case 2:
                return UserGagPostListFragment.a(7, this.f9913a, "Profile", null);
            case 3:
                return UserGagPostListFragment.a(11, this.f9913a, "Profile", null);
            default:
                return null;
        }
    }

    public int getCount() {
        return 4;
    }
}
