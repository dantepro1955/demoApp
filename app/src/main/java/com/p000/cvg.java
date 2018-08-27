package com.p000;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import com.ninegag.android.app.R;
import com.ninegag.android.tv.component.postlist.PostListFragment;
import com.ninegag.android.tv.component.postlist.home.HomePostListFragment;
import com.ninegag.android.tv.model.PostList;

/* compiled from: MainPagerAdapter */
/* renamed from: cvg */
public class cvg extends cwi {
    /* renamed from: a */
    private cve f20282a;
    /* renamed from: b */
    private String f20283b;
    /* renamed from: c */
    private Context f20284c;

    public cvg(Context context, FragmentManager fragmentManager, cve cve) {
        super(fragmentManager);
        this.f20284c = context;
        this.f20282a = cve;
    }

    public cvg(Context context, FragmentManager fragmentManager, cve cve, String str) {
        this(context, fragmentManager, cve);
        this.f20283b = str;
    }

    /* renamed from: c */
    public static String m25041c(int i) {
        return "list-" + i;
    }

    /* renamed from: b */
    public String mo3771b(int i) {
        return cvg.m25041c(i);
    }

    public CharSequence getPageTitle(int i) {
        if (i == 0) {
            return djo.m27599a(this.f20284c, R.string.title_home);
        }
        return ((cvf) this.f20282a.get(i - 1)).m25039a();
    }

    /* renamed from: a */
    public Fragment mo3743a(int i) {
        if (i == 0) {
            return HomePostListFragment.m23001b();
        }
        cvf cvf = (cvf) this.f20282a.get(i - 1);
        if (this.f20283b == null) {
            return PostListFragment.m22997a(cvf.m25040b());
        }
        Fragment a = PostListFragment.m22998a(cvf.m25040b(), this.f20283b);
        this.f20283b = null;
        return a;
    }

    public int getCount() {
        return this.f20282a.size() + 1;
    }

    /* renamed from: d */
    public String m25044d(int i) {
        return ((PostList) ((cvf) this.f20282a.get(i)).m24642R()).m23106c();
    }
}
