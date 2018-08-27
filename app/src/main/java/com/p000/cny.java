package com.p000;

import android.support.v4.view.ViewPager;
import com.ninegag.android.app.R;
import com.ninegag.android.app.ui.HomeActivity;
import com.under9.android.lib.widget.NonSwipeableViewPager;
import java.lang.ref.WeakReference;
import p000.coh.C1787a;
import p000.coh.C1788b;

/* compiled from: BottomNavigationViewListener */
/* renamed from: cny */
public class cny implements dcd, dce {
    /* renamed from: a */
    private WeakReference<HomeActivity> f9901a;
    /* renamed from: b */
    private WeakReference<NonSwipeableViewPager> f9902b;

    public cny(HomeActivity homeActivity, NonSwipeableViewPager nonSwipeableViewPager) {
        this.f9901a = new WeakReference(homeActivity);
        this.f9902b = new WeakReference(nonSwipeableViewPager);
    }

    /* renamed from: a */
    public void m14939a(int i) {
        HomeActivity homeActivity = (HomeActivity) this.f9901a.get();
        if (homeActivity != null) {
            coh coh = homeActivity.mMainPagerAdapter;
            if (coh != null) {
                int i2 = -1;
                switch (i) {
                    case R.id.action_home_tab:
                        i2 = 0;
                        break;
                    case R.id.action_explore_tab:
                        i2 = 1;
                        break;
                    case R.id.action_video_tab:
                        i2 = 2;
                        break;
                    case R.id.action_activity_tab:
                        i2 = 3;
                        break;
                    case R.id.action_profile_tab:
                        i2 = 4;
                        break;
                }
                homeActivity.sendBroadcast(new C1787a(coh.m14967b(i2), i2).m14963a());
            }
        }
    }

    /* renamed from: b */
    public void m14940b(int i) {
        ViewPager viewPager = (ViewPager) this.f9902b.get();
        if (viewPager != null) {
            int i2;
            switch (i) {
                case R.id.action_home_tab:
                    i2 = 0;
                    break;
                case R.id.action_explore_tab:
                    i2 = 1;
                    break;
                case R.id.action_video_tab:
                    i2 = 2;
                    break;
                case R.id.action_activity_tab:
                    i2 = 3;
                    break;
                case R.id.action_profile_tab:
                    i2 = 4;
                    break;
                default:
                    i2 = -1;
                    break;
            }
            viewPager.setCurrentItem(i2, false);
            HomeActivity homeActivity = (HomeActivity) this.f9901a.get();
            if (homeActivity != null) {
                coh coh = homeActivity.mMainPagerAdapter;
                if (coh != null) {
                    homeActivity.sendBroadcast(new C1788b(coh.m14967b(i2), i2).m14964a());
                    if (i2 == 3) {
                        homeActivity.mNotiUnreadCount = 0;
                    }
                    homeActivity.updateNotiTab(homeActivity.mNotiUnreadCount);
                }
            }
        }
    }
}
