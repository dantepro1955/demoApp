package com.p000;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.util.Log;
import com.ninegag.android.app.R;
import com.ninegag.android.app.component.explore.ExploreListFragment;
import com.ninegag.android.app.model.api.ApiUser;
import com.ninegag.android.app.notif.GagNotifFragment;
import com.ninegag.android.app.ui.fragments.HomeMainPostListFragment;
import com.ninegag.android.app.ui.fragments.StandaloneAuthFragment;
import com.ninegag.android.app.ui.fragments.user.ProfileMainPostListFragment;
import com.ninegag.android.tv.component.main.TVMainFragment;

/* compiled from: MainPagerAdapter */
/* renamed from: coh */
public class coh extends cwi {
    /* renamed from: a */
    private int f9919a = 0;
    /* renamed from: b */
    private String f9920b;
    /* renamed from: c */
    private boolean f9921c;

    /* compiled from: MainPagerAdapter */
    /* renamed from: coh$a */
    public static class C1787a {
        /* renamed from: a */
        public String f9915a;
        /* renamed from: b */
        public int f9916b;

        public C1787a(String str, int i) {
            this.f9915a = str;
            this.f9916b = i;
        }

        /* renamed from: a */
        public Intent m14963a() {
            Intent intent = new Intent("com.ninegag.android.app.ui.main.MainPagerAdapter.INTENT_FILTER_TAB_EVENT");
            intent.putExtra("pos", this.f9916b);
            intent.putExtra("tag", this.f9915a);
            intent.putExtra("is_reselect", true);
            return intent;
        }
    }

    /* compiled from: MainPagerAdapter */
    /* renamed from: coh$b */
    public static class C1788b {
        /* renamed from: a */
        public String f9917a;
        /* renamed from: b */
        public int f9918b;

        public C1788b(String str, int i) {
            this.f9917a = str;
            this.f9918b = i;
        }

        /* renamed from: a */
        public Intent m14964a() {
            Intent intent = new Intent("com.ninegag.android.app.ui.main.MainPagerAdapter.INTENT_FILTER_TAB_EVENT");
            intent.putExtra("pos", this.f9918b);
            intent.putExtra("tag", this.f9917a);
            intent.putExtra("is_reselect", false);
            return intent;
        }
    }

    public coh(FragmentManager fragmentManager) {
        super(fragmentManager);
    }

    /* renamed from: c */
    public void m14968c(int i) {
        this.f9919a = i;
    }

    /* renamed from: a */
    public void m14966a(Context context, String str) {
        this.f9920b = str;
        if (this.f9921c) {
            this.f9920b = null;
            cvi.a(context, str);
        }
    }

    public void restoreState(Parcelable parcelable, ClassLoader classLoader) {
        super.restoreState(parcelable, classLoader);
        Log.d("MainPagerAdapter", "restoreState() returned: " + parcelable);
    }

    /* renamed from: b */
    public String m14967b(int i) {
        switch (i) {
            case 0:
                return "home-main-post-list";
            case 1:
                return "explore";
            case 2:
                return "videos";
            case 3:
                if (!caf.m12046a().m12094x().m12104c()) {
                    return "login";
                }
                caf.m12046a().m12054a(new clq());
                return "activities";
            case 4:
                return "profile-main-post-list";
            default:
                return null;
        }
    }

    /* renamed from: a */
    public Fragment m14965a(int i) {
        boolean c = caf.m12046a().m12094x().m12104c();
        switch (i) {
            case 0:
                return HomeMainPostListFragment.a(this.f9919a);
            case 1:
                return new ExploreListFragment();
            case 2:
                this.f9921c = true;
                if (this.f9920b == null) {
                    return TVMainFragment.m20802d();
                }
                String str = this.f9920b;
                this.f9920b = null;
                return TVMainFragment.m20796a(str);
            case 3:
                if (c) {
                    return new GagNotifFragment();
                }
                return StandaloneAuthFragment.m20539a(caf.m12046a().f8449a.getString(R.string.title_news), StandaloneAuthFragment.f16563a);
            case 4:
                if (!c) {
                    return StandaloneAuthFragment.m20539a(caf.m12046a().f8449a.getString(R.string.title_profile_menu), StandaloneAuthFragment.f16564b);
                }
                ApiUser a = caf.m12046a().m12075g().m13729g().m14203a();
                return ProfileMainPostListFragment.m20783a(a.userId, a.getUsername(), true, true, "Profile");
            default:
                return null;
        }
    }

    public int getItemPosition(Object obj) {
        boolean c = caf.m12046a().m12094x().m12104c();
        if ((obj instanceof StandaloneAuthFragment) && c) {
            return -2;
        }
        if ((obj instanceof GagNotifFragment) && !c) {
            return -2;
        }
        if (!(obj instanceof ProfileMainPostListFragment) || c) {
            return super.getItemPosition(obj);
        }
        return -2;
    }

    public int getCount() {
        return 5;
    }
}
