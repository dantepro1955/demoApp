package com.p000;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.app.Fragment;
import android.support.v4.app.Fragment.SavedState;
import android.support.v4.app.FragmentManager;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* compiled from: FixedFragmentStatePagerAdapter */
/* renamed from: cwi */
public abstract class cwi extends iv {
    /* renamed from: a */
    private final FragmentManager f18099a;
    /* renamed from: b */
    private ds f18100b = null;
    /* renamed from: c */
    private ArrayList<SavedState> f18101c = new ArrayList();
    /* renamed from: d */
    private ArrayList<String> f18102d = new ArrayList();
    /* renamed from: e */
    private ArrayList<Fragment> f18103e = new ArrayList();
    /* renamed from: f */
    private Fragment f18104f = null;

    /* renamed from: a */
    public abstract Fragment mo3743a(int i);

    public cwi(FragmentManager fragmentManager) {
        this.f18099a = fragmentManager;
    }

    /* renamed from: i */
    public Fragment m22230i(int i) {
        return (Fragment) this.f18103e.get(i);
    }

    /* renamed from: b */
    public String mo3771b(int i) {
        return null;
    }

    public void startUpdate(ViewGroup viewGroup) {
    }

    public Object instantiateItem(ViewGroup viewGroup, int i) {
        if (this.f18103e.size() > i) {
            Fragment fragment = (Fragment) this.f18103e.get(i);
            if (fragment != null) {
                return fragment;
            }
        }
        if (this.f18100b == null) {
            this.f18100b = this.f18099a.beginTransaction();
        }
        Fragment a = mo3743a(i);
        Object b = mo3771b(i);
        if (this.f18101c.size() > i && TextUtils.equals(b, (String) this.f18102d.get(i))) {
            SavedState savedState = (SavedState) this.f18101c.get(i);
            if (savedState != null) {
                a.setInitialSavedState(savedState);
            }
        }
        while (this.f18103e.size() <= i) {
            this.f18103e.add(null);
        }
        a.setMenuVisibility(false);
        a.setUserVisibleHint(false);
        this.f18103e.set(i, a);
        this.f18100b.mo4379a(viewGroup.getId(), a, b);
        return a;
    }

    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        Fragment fragment = (Fragment) obj;
        if (this.f18100b == null) {
            this.f18100b = this.f18099a.beginTransaction();
        }
        while (this.f18101c.size() <= i) {
            this.f18101c.add(null);
            this.f18102d.add(null);
        }
        this.f18101c.set(i, this.f18099a.saveFragmentInstanceState(fragment));
        this.f18102d.set(i, fragment.getTag());
        this.f18103e.set(i, null);
        this.f18100b.mo4380a(fragment);
    }

    public void setPrimaryItem(ViewGroup viewGroup, int i, Object obj) {
        Fragment fragment = (Fragment) obj;
        if (fragment != this.f18104f) {
            if (this.f18104f != null) {
                this.f18104f.setMenuVisibility(false);
                this.f18104f.setUserVisibleHint(false);
            }
            if (fragment != null) {
                fragment.setMenuVisibility(true);
                fragment.setUserVisibleHint(true);
            }
            this.f18104f = fragment;
        }
    }

    public void finishUpdate(ViewGroup viewGroup) {
        if (this.f18100b != null) {
            this.f18100b.mo4383b();
            this.f18100b = null;
            this.f18099a.executePendingTransactions();
        }
    }

    public boolean isViewFromObject(View view, Object obj) {
        return ((Fragment) obj).getView() == view;
    }

    public Parcelable saveState() {
        Bundle bundle = null;
        if (this.f18101c.size() > 0) {
            bundle = new Bundle();
            Parcelable[] parcelableArr = new SavedState[this.f18101c.size()];
            this.f18101c.toArray(parcelableArr);
            bundle.putParcelableArray("states", parcelableArr);
            bundle.putStringArrayList("tags", this.f18102d);
        }
        Parcelable parcelable = bundle;
        for (int i = 0; i < this.f18103e.size(); i++) {
            Fragment fragment = (Fragment) this.f18103e.get(i);
            if (fragment != null) {
                if (parcelable == null) {
                    parcelable = new Bundle();
                }
                this.f18099a.putFragment(parcelable, "f" + i, fragment);
            }
        }
        return parcelable;
    }

    public void restoreState(Parcelable parcelable, ClassLoader classLoader) {
        if (parcelable != null) {
            Bundle bundle = (Bundle) parcelable;
            bundle.setClassLoader(classLoader);
            Parcelable[] parcelableArray = bundle.getParcelableArray("states");
            this.f18101c.clear();
            this.f18103e.clear();
            ArrayList stringArrayList = bundle.getStringArrayList("tags");
            if (stringArrayList != null) {
                this.f18102d = stringArrayList;
            } else {
                this.f18102d.clear();
            }
            if (parcelableArray != null) {
                for (Parcelable parcelable2 : parcelableArray) {
                    this.f18101c.add((SavedState) parcelable2);
                }
            }
            for (String str : bundle.keySet()) {
                if (str.startsWith("f")) {
                    int parseInt = Integer.parseInt(str.substring(1));
                    Fragment fragment = this.f18099a.getFragment(bundle, str);
                    if (fragment != null) {
                        while (this.f18103e.size() <= parseInt) {
                            this.f18103e.add(null);
                        }
                        fragment.setMenuVisibility(false);
                        this.f18103e.set(parseInt, fragment);
                    } else {
                        Log.w("FragmentStatePagerAdapter", "Bad fragment at key " + str);
                    }
                }
            }
        }
    }
}
