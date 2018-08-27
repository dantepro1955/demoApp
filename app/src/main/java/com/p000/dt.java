package com.p000;

import android.graphics.Rect;
import android.os.Build.VERSION;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManagerImpl;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import p000.df.C4866a;

/* compiled from: FragmentTransition */
/* renamed from: dt */
public class dt {
    /* renamed from: a */
    private static final int[] f22871a = new int[]{0, 3, 0, 1, 5, 4, 7, 6};

    /* compiled from: FragmentTransition */
    /* renamed from: dt$a */
    static class C5076a {
        /* renamed from: a */
        public Fragment f22865a;
        /* renamed from: b */
        public boolean f22866b;
        /* renamed from: c */
        public df f22867c;
        /* renamed from: d */
        public Fragment f22868d;
        /* renamed from: e */
        public boolean f22869e;
        /* renamed from: f */
        public df f22870f;

        C5076a() {
        }
    }

    /* renamed from: a */
    public static void m29210a(FragmentManagerImpl fragmentManagerImpl, ArrayList<df> arrayList, ArrayList<Boolean> arrayList2, int i, int i2, boolean z) {
        if (fragmentManagerImpl.mCurState >= 1 && VERSION.SDK_INT >= 21) {
            SparseArray sparseArray = new SparseArray();
            for (int i3 = i; i3 < i2; i3++) {
                df dfVar = (df) arrayList.get(i3);
                if (((Boolean) arrayList2.get(i3)).booleanValue()) {
                    dt.m29226b(dfVar, sparseArray, z);
                } else {
                    dt.m29212a(dfVar, sparseArray, z);
                }
            }
            if (sparseArray.size() != 0) {
                View view = new View(fragmentManagerImpl.mHost.m28356i());
                int size = sparseArray.size();
                for (int i4 = 0; i4 < size; i4++) {
                    int keyAt = sparseArray.keyAt(i4);
                    hh a = dt.m29200a(keyAt, (ArrayList) arrayList, (ArrayList) arrayList2, i, i2);
                    C5076a c5076a = (C5076a) sparseArray.valueAt(i4);
                    if (z) {
                        dt.m29209a(fragmentManagerImpl, keyAt, c5076a, view, a);
                    } else {
                        dt.m29225b(fragmentManagerImpl, keyAt, c5076a, view, a);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private static hh<String, String> m29200a(int i, ArrayList<df> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3) {
        hh<String, String> hhVar = new hh();
        for (int i4 = i3 - 1; i4 >= i2; i4--) {
            df dfVar = (df) arrayList.get(i4);
            if (dfVar.m26947c(i)) {
                boolean booleanValue = ((Boolean) arrayList2.get(i4)).booleanValue();
                if (dfVar.f21464s != null) {
                    ArrayList arrayList3;
                    ArrayList arrayList4;
                    int size = dfVar.f21464s.size();
                    if (booleanValue) {
                        arrayList3 = dfVar.f21464s;
                        arrayList4 = dfVar.f21465t;
                    } else {
                        ArrayList arrayList5 = dfVar.f21464s;
                        arrayList3 = dfVar.f21465t;
                        arrayList4 = arrayList5;
                    }
                    for (int i5 = 0; i5 < size; i5++) {
                        String str = (String) arrayList4.get(i5);
                        String str2 = (String) arrayList3.get(i5);
                        String str3 = (String) hhVar.remove(str2);
                        if (str3 != null) {
                            hhVar.put(str, str3);
                        } else {
                            hhVar.put(str, str2);
                        }
                    }
                }
            }
        }
        return hhVar;
    }

    /* renamed from: a */
    private static void m29209a(FragmentManagerImpl fragmentManagerImpl, int i, C5076a c5076a, View view, hh<String, String> hhVar) {
        ViewGroup viewGroup = null;
        if (fragmentManagerImpl.mContainer.mo4490a()) {
            viewGroup = (ViewGroup) fragmentManagerImpl.mContainer.mo4489a(i);
        }
        if (viewGroup != null) {
            Fragment fragment = c5076a.f22865a;
            Fragment fragment2 = c5076a.f22868d;
            boolean z = c5076a.f22866b;
            boolean z2 = c5076a.f22869e;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            Object a = dt.m29203a(fragment, z);
            Object b = dt.m29221b(fragment2, z2);
            Object a2 = dt.m29204a(viewGroup, view, (hh) hhVar, c5076a, arrayList2, arrayList, a, b);
            if (a != null || a2 != null || b != null) {
                ArrayList b2 = dt.m29223b(b, fragment2, arrayList2, view);
                ArrayList b3 = dt.m29223b(a, fragment, arrayList, view);
                dt.m29227b(b3, 4);
                Object a3 = dt.m29205a(a, b, a2, fragment, z);
                if (a3 != null) {
                    dt.m29215a(b, fragment2, b2);
                    ArrayList a4 = du.m29368a(arrayList);
                    du.m29377a(a3, a, b3, b, b2, a2, arrayList);
                    du.m29372a(viewGroup, a3);
                    du.m29370a(viewGroup, arrayList2, arrayList, a4, hhVar);
                    dt.m29227b(b3, 0);
                    du.m29379a(a2, arrayList2, arrayList);
                }
            }
        }
    }

    /* renamed from: a */
    private static void m29215a(Object obj, Fragment fragment, final ArrayList<View> arrayList) {
        if (fragment != null && obj != null && fragment.mAdded && fragment.mHidden && fragment.mHiddenChanged) {
            fragment.setHideReplaced(true);
            du.m29390b(obj, fragment.getView(), (ArrayList) arrayList);
            en.m30063a(fragment.mContainer, new Runnable() {
                public void run() {
                    dt.m29227b(arrayList, 4);
                }
            });
        }
    }

    /* renamed from: b */
    private static void m29225b(FragmentManagerImpl fragmentManagerImpl, int i, C5076a c5076a, View view, hh<String, String> hhVar) {
        ViewGroup viewGroup = null;
        if (fragmentManagerImpl.mContainer.mo4490a()) {
            viewGroup = (ViewGroup) fragmentManagerImpl.mContainer.mo4489a(i);
        }
        if (viewGroup != null) {
            Fragment fragment = c5076a.f22865a;
            Fragment fragment2 = c5076a.f22868d;
            boolean z = c5076a.f22866b;
            boolean z2 = c5076a.f22869e;
            Object a = dt.m29203a(fragment, z);
            Object b = dt.m29221b(fragment2, z2);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            Object b2 = dt.m29222b(viewGroup, view, hhVar, c5076a, arrayList, arrayList2, a, b);
            if (a != null || b2 != null || b != null) {
                Object obj;
                ArrayList b3 = dt.m29223b(b, fragment2, arrayList, view);
                if (b3 == null || b3.isEmpty()) {
                    obj = null;
                } else {
                    obj = b;
                }
                du.m29389b(a, view);
                b = dt.m29205a(a, obj, b2, fragment, c5076a.f22866b);
                if (b != null) {
                    ArrayList arrayList3 = new ArrayList();
                    du.m29377a(b, a, arrayList3, obj, b3, b2, arrayList2);
                    dt.m29211a(viewGroup, fragment, view, arrayList2, a, arrayList3, obj, b3);
                    du.m29371a((View) viewGroup, arrayList2, (Map) hhVar);
                    du.m29372a(viewGroup, b);
                    du.m29373a(viewGroup, arrayList2, (Map) hhVar);
                }
            }
        }
    }

    /* renamed from: a */
    private static void m29211a(ViewGroup viewGroup, Fragment fragment, View view, ArrayList<View> arrayList, Object obj, ArrayList<View> arrayList2, Object obj2, ArrayList<View> arrayList3) {
        final Object obj3 = obj;
        final View view2 = view;
        final Fragment fragment2 = fragment;
        final ArrayList<View> arrayList4 = arrayList;
        final ArrayList<View> arrayList5 = arrayList2;
        final ArrayList<View> arrayList6 = arrayList3;
        final Object obj4 = obj2;
        en.m30063a(viewGroup, new Runnable() {
            public void run() {
                if (obj3 != null) {
                    du.m29392c(obj3, view2);
                    arrayList5.addAll(dt.m29223b(obj3, fragment2, arrayList4, view2));
                }
                if (arrayList6 != null) {
                    if (obj4 != null) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(view2);
                        du.m29391b(obj4, arrayList6, arrayList);
                    }
                    arrayList6.clear();
                    arrayList6.add(view2);
                }
            }
        });
    }

    /* renamed from: a */
    private static Object m29202a(Fragment fragment, Fragment fragment2, boolean z) {
        if (fragment == null || fragment2 == null) {
            return null;
        }
        Object sharedElementReturnTransition;
        if (z) {
            sharedElementReturnTransition = fragment2.getSharedElementReturnTransition();
        } else {
            sharedElementReturnTransition = fragment.getSharedElementEnterTransition();
        }
        return du.m29386b(du.m29365a(sharedElementReturnTransition));
    }

    /* renamed from: a */
    private static Object m29203a(Fragment fragment, boolean z) {
        if (fragment == null) {
            return null;
        }
        Object reenterTransition;
        if (z) {
            reenterTransition = fragment.getReenterTransition();
        } else {
            reenterTransition = fragment.getEnterTransition();
        }
        return du.m29365a(reenterTransition);
    }

    /* renamed from: b */
    private static Object m29221b(Fragment fragment, boolean z) {
        if (fragment == null) {
            return null;
        }
        Object returnTransition;
        if (z) {
            returnTransition = fragment.getReturnTransition();
        } else {
            returnTransition = fragment.getExitTransition();
        }
        return du.m29365a(returnTransition);
    }

    /* renamed from: a */
    private static Object m29204a(ViewGroup viewGroup, View view, hh<String, String> hhVar, C5076a c5076a, ArrayList<View> arrayList, ArrayList<View> arrayList2, Object obj, Object obj2) {
        View view2 = null;
        final Fragment fragment = c5076a.f22865a;
        final Fragment fragment2 = c5076a.f22868d;
        if (fragment != null) {
            fragment.getView().setVisibility(0);
        }
        if (fragment == null || fragment2 == null) {
            return null;
        }
        Object obj3;
        Object obj4;
        final boolean z = c5076a.f22866b;
        if (hhVar.isEmpty()) {
            obj3 = null;
        } else {
            obj3 = dt.m29202a(fragment, fragment2, z);
        }
        hh b = dt.m29220b((hh) hhVar, obj3, c5076a);
        final hh c = dt.m29228c(hhVar, obj3, c5076a);
        if (hhVar.isEmpty()) {
            if (b != null) {
                b.clear();
            }
            if (c != null) {
                c.clear();
                obj4 = null;
            } else {
                obj4 = null;
            }
        } else {
            dt.m29218a((ArrayList) arrayList, b, hhVar.keySet());
            dt.m29218a((ArrayList) arrayList2, c, hhVar.values());
            obj4 = obj3;
        }
        if (obj == null && obj2 == null && obj4 == null) {
            return null;
        }
        Rect rect;
        dt.m29224b(fragment, fragment2, z, b, true);
        if (obj4 != null) {
            arrayList2.add(view);
            du.m29376a(obj4, view, (ArrayList) arrayList);
            dt.m29216a(obj4, obj2, b, c5076a.f22869e, c5076a.f22870f);
            rect = new Rect();
            view2 = dt.m29219b(c, c5076a, obj, z);
            if (view2 != null) {
                du.m29374a(obj, rect);
            }
        } else {
            rect = null;
        }
        en.m30063a(viewGroup, new Runnable() {
            public void run() {
                dt.m29224b(fragment, fragment2, z, c, false);
                if (view2 != null) {
                    du.m29369a(view2, rect);
                }
            }
        });
        return obj4;
    }

    /* renamed from: a */
    private static void m29218a(ArrayList<View> arrayList, hh<String, View> hhVar, Collection<String> collection) {
        for (int size = hhVar.size() - 1; size >= 0; size--) {
            View view = (View) hhVar.m30557c(size);
            if (collection.contains(jd.w(view))) {
                arrayList.add(view);
            }
        }
    }

    /* renamed from: b */
    private static Object m29222b(ViewGroup viewGroup, View view, hh<String, String> hhVar, C5076a c5076a, ArrayList<View> arrayList, ArrayList<View> arrayList2, Object obj, Object obj2) {
        final Fragment fragment = c5076a.f22865a;
        final Fragment fragment2 = c5076a.f22868d;
        if (fragment == null || fragment2 == null) {
            return null;
        }
        Object obj3;
        Object obj4;
        final boolean z = c5076a.f22866b;
        if (hhVar.isEmpty()) {
            obj3 = null;
        } else {
            obj3 = dt.m29202a(fragment, fragment2, z);
        }
        hh b = dt.m29220b((hh) hhVar, obj3, c5076a);
        if (hhVar.isEmpty()) {
            obj4 = null;
        } else {
            arrayList.addAll(b.values());
            obj4 = obj3;
        }
        if (obj == null && obj2 == null && obj4 == null) {
            return null;
        }
        Rect rect;
        dt.m29224b(fragment, fragment2, z, b, true);
        if (obj4 != null) {
            rect = new Rect();
            du.m29376a(obj4, view, (ArrayList) arrayList);
            dt.m29216a(obj4, obj2, b, c5076a.f22869e, c5076a.f22870f);
            if (obj != null) {
                du.m29374a(obj, rect);
            }
        } else {
            rect = null;
        }
        final hh<String, String> hhVar2 = hhVar;
        final C5076a c5076a2 = c5076a;
        final ArrayList<View> arrayList3 = arrayList2;
        final View view2 = view;
        final ArrayList<View> arrayList4 = arrayList;
        final Object obj5 = obj;
        en.m30063a(viewGroup, new Runnable() {
            public void run() {
                hh a = dt.m29228c(hhVar2, obj4, c5076a2);
                if (a != null) {
                    arrayList3.addAll(a.values());
                    arrayList3.add(view2);
                }
                dt.m29224b(fragment, fragment2, z, a, false);
                if (obj4 != null) {
                    du.m29379a(obj4, arrayList4, arrayList3);
                    View a2 = dt.m29219b(a, c5076a2, obj5, z);
                    if (a2 != null) {
                        du.m29369a(a2, rect);
                    }
                }
            }
        });
        return obj4;
    }

    /* renamed from: b */
    private static hh<String, View> m29220b(hh<String, String> hhVar, Object obj, C5076a c5076a) {
        if (hhVar.isEmpty() || obj == null) {
            hhVar.clear();
            return null;
        }
        List list;
        es esVar;
        Fragment fragment = c5076a.f22868d;
        Map hhVar2 = new hh();
        du.m29382a(hhVar2, fragment.getView());
        df dfVar = c5076a.f22870f;
        es enterTransitionCallback;
        if (c5076a.f22869e) {
            enterTransitionCallback = fragment.getEnterTransitionCallback();
            list = dfVar.f21465t;
            esVar = enterTransitionCallback;
        } else {
            enterTransitionCallback = fragment.getExitTransitionCallback();
            Object obj2 = dfVar.f21464s;
            esVar = enterTransitionCallback;
        }
        hhVar2.m30560a(list);
        if (esVar != null) {
            esVar.m30084a(list, hhVar2);
            for (int size = list.size() - 1; size >= 0; size--) {
                String str = (String) list.get(size);
                View view = (View) hhVar2.get(str);
                if (view == null) {
                    hhVar.remove(str);
                } else if (!str.equals(jd.w(view))) {
                    hhVar.put(jd.w(view), (String) hhVar.remove(str));
                }
            }
        } else {
            hhVar.m30560a(hhVar2.keySet());
        }
        return hhVar2;
    }

    /* renamed from: c */
    private static hh<String, View> m29228c(hh<String, String> hhVar, Object obj, C5076a c5076a) {
        Fragment fragment = c5076a.f22865a;
        View view = fragment.getView();
        if (hhVar.isEmpty() || obj == null || view == null) {
            hhVar.clear();
            return null;
        }
        es esVar;
        hh<String, View> hhVar2 = new hh();
        du.m29382a((Map) hhVar2, view);
        df dfVar = c5076a.f22867c;
        es exitTransitionCallback;
        if (c5076a.f22866b) {
            exitTransitionCallback = fragment.getExitTransitionCallback();
            List list = dfVar.f21464s;
            esVar = exitTransitionCallback;
        } else {
            exitTransitionCallback = fragment.getEnterTransitionCallback();
            Object obj2 = dfVar.f21465t;
            esVar = exitTransitionCallback;
        }
        if (list != null) {
            hhVar2.m30560a(list);
        }
        if (esVar != null) {
            esVar.m30084a(list, (Map) hhVar2);
            for (int size = list.size() - 1; size >= 0; size--) {
                String str = (String) list.get(size);
                view = (View) hhVar2.get(str);
                if (view == null) {
                    str = dt.m29206a((hh) hhVar, str);
                    if (str != null) {
                        hhVar.remove(str);
                    }
                } else if (!str.equals(jd.w(view))) {
                    str = dt.m29206a((hh) hhVar, str);
                    if (str != null) {
                        hhVar.put(str, jd.w(view));
                    }
                }
            }
        } else {
            dt.m29214a((hh) hhVar, (hh) hhVar2);
        }
        return hhVar2;
    }

    /* renamed from: a */
    private static String m29206a(hh<String, String> hhVar, String str) {
        int size = hhVar.size();
        for (int i = 0; i < size; i++) {
            if (str.equals(hhVar.m30557c(i))) {
                return (String) hhVar.m30556b(i);
            }
        }
        return null;
    }

    /* renamed from: b */
    private static View m29219b(hh<String, View> hhVar, C5076a c5076a, Object obj, boolean z) {
        df dfVar = c5076a.f22867c;
        if (obj == null || hhVar == null || dfVar.f21464s == null || dfVar.f21464s.isEmpty()) {
            return null;
        }
        Object obj2;
        if (z) {
            obj2 = (String) dfVar.f21464s.get(0);
        } else {
            String str = (String) dfVar.f21465t.get(0);
        }
        return (View) hhVar.get(obj2);
    }

    /* renamed from: a */
    private static void m29216a(Object obj, Object obj2, hh<String, View> hhVar, boolean z, df dfVar) {
        if (dfVar.f21464s != null && !dfVar.f21464s.isEmpty()) {
            Object obj3;
            if (z) {
                obj3 = (String) dfVar.f21465t.get(0);
            } else {
                String str = (String) dfVar.f21464s.get(0);
            }
            View view = (View) hhVar.get(obj3);
            du.m29375a(obj, view);
            if (obj2 != null) {
                du.m29375a(obj2, view);
            }
        }
    }

    /* renamed from: a */
    private static void m29214a(hh<String, String> hhVar, hh<String, View> hhVar2) {
        for (int size = hhVar.size() - 1; size >= 0; size--) {
            if (!hhVar2.containsKey((String) hhVar.m30557c(size))) {
                hhVar.m30558d(size);
            }
        }
    }

    /* renamed from: b */
    private static void m29224b(Fragment fragment, Fragment fragment2, boolean z, hh<String, View> hhVar, boolean z2) {
        es enterTransitionCallback;
        int i = 0;
        if (z) {
            enterTransitionCallback = fragment2.getEnterTransitionCallback();
        } else {
            enterTransitionCallback = fragment.getEnterTransitionCallback();
        }
        if (enterTransitionCallback != null) {
            List arrayList = new ArrayList();
            List arrayList2 = new ArrayList();
            int size = hhVar == null ? 0 : hhVar.size();
            while (i < size) {
                arrayList2.add(hhVar.m30556b(i));
                arrayList.add(hhVar.m30557c(i));
                i++;
            }
            if (z2) {
                enterTransitionCallback.m30083a(arrayList2, arrayList, null);
            } else {
                enterTransitionCallback.m30085b(arrayList2, arrayList, null);
            }
        }
    }

    /* renamed from: b */
    private static ArrayList<View> m29223b(Object obj, Fragment fragment, ArrayList<View> arrayList, View view) {
        ArrayList<View> arrayList2 = null;
        if (obj != null) {
            arrayList2 = new ArrayList();
            View view2 = fragment.getView();
            if (view2 != null) {
                du.m29380a((ArrayList) arrayList2, view2);
            }
            if (arrayList != null) {
                arrayList2.removeAll(arrayList);
            }
            if (!arrayList2.isEmpty()) {
                arrayList2.add(view);
                du.m29378a(obj, (ArrayList) arrayList2);
            }
        }
        return arrayList2;
    }

    /* renamed from: b */
    private static void m29227b(ArrayList<View> arrayList, int i) {
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((View) arrayList.get(size)).setVisibility(i);
            }
        }
    }

    /* renamed from: a */
    private static Object m29205a(Object obj, Object obj2, Object obj3, Fragment fragment, boolean z) {
        boolean z2 = true;
        if (!(obj == null || obj2 == null || fragment == null)) {
            z2 = z ? fragment.getAllowReturnTransitionOverlap() : fragment.getAllowEnterTransitionOverlap();
        }
        if (z2) {
            return du.m29366a(obj2, obj, obj3);
        }
        return du.m29387b(obj2, obj, obj3);
    }

    /* renamed from: a */
    public static void m29212a(df dfVar, SparseArray<C5076a> sparseArray, boolean z) {
        int size = dfVar.f21448c.size();
        for (int i = 0; i < size; i++) {
            dt.m29213a(dfVar, (C4866a) dfVar.f21448c.get(i), (SparseArray) sparseArray, false, z);
        }
    }

    /* renamed from: b */
    public static void m29226b(df dfVar, SparseArray<C5076a> sparseArray, boolean z) {
        if (dfVar.f21447b.mContainer.mo4490a()) {
            for (int size = dfVar.f21448c.size() - 1; size >= 0; size--) {
                dt.m29213a(dfVar, (C4866a) dfVar.f21448c.get(size), (SparseArray) sparseArray, true, z);
            }
        }
    }

    /* renamed from: a */
    private static void m29213a(df dfVar, C4866a c4866a, SparseArray<C5076a> sparseArray, boolean z, boolean z2) {
        Fragment fragment = c4866a.f21441b;
        int i = fragment.mContainerId;
        if (i != 0) {
            int i2;
            int i3;
            C5076a a;
            boolean z3;
            int i4;
            int i5;
            boolean z4;
            int i6;
            switch (z ? f22871a[c4866a.f21440a] : c4866a.f21440a) {
                case 1:
                case 7:
                    z3 = z2 ? fragment.mIsNewlyAdded : (fragment.mAdded || fragment.mHidden) ? false : true;
                    i4 = 1;
                    i2 = 0;
                    i5 = 0;
                    z4 = z3;
                    break;
                case 3:
                case 6:
                    i6 = z2 ? (fragment.mAdded || fragment.mView == null || fragment.mView.getVisibility() != 0 || fragment.mPostponedAlpha < 0.0f) ? 0 : 1 : (!fragment.mAdded || fragment.mHidden) ? 0 : 1;
                    i4 = 0;
                    i2 = i6;
                    i5 = 1;
                    i3 = 0;
                    break;
                case 4:
                    i6 = z2 ? (fragment.mHiddenChanged && fragment.mAdded && fragment.mHidden) ? 1 : 0 : (!fragment.mAdded || fragment.mHidden) ? 0 : 1;
                    i4 = 0;
                    i2 = i6;
                    i5 = 1;
                    i3 = 0;
                    break;
                case 5:
                    z3 = z2 ? fragment.mHiddenChanged && !fragment.mHidden && fragment.mAdded : fragment.mHidden;
                    i4 = 1;
                    i2 = 0;
                    i5 = 0;
                    z4 = z3;
                    break;
                default:
                    i4 = 0;
                    i2 = 0;
                    i5 = 0;
                    i3 = 0;
                    break;
            }
            C5076a c5076a = (C5076a) sparseArray.get(i);
            if (i3 != 0) {
                a = dt.m29199a(c5076a, (SparseArray) sparseArray, i);
                a.f22865a = fragment;
                a.f22866b = z;
                a.f22867c = dfVar;
            } else {
                a = c5076a;
            }
            if (!(z2 || r4 == 0)) {
                if (a != null && a.f22868d == fragment) {
                    a.f22868d = null;
                }
                FragmentManagerImpl fragmentManagerImpl = dfVar.f21447b;
                if (fragment.mState < 1 && fragmentManagerImpl.mCurState >= 1 && !dfVar.f21466u) {
                    fragmentManagerImpl.makeActive(fragment);
                    fragmentManagerImpl.moveToState(fragment, 1, 0, 0, false);
                }
            }
            if (i2 == 0 || !(a == null || a.f22868d == null)) {
                c5076a = a;
            } else {
                c5076a = dt.m29199a(a, (SparseArray) sparseArray, i);
                c5076a.f22868d = fragment;
                c5076a.f22869e = z;
                c5076a.f22870f = dfVar;
            }
            if (!z2 && r7 != 0 && c5076a != null && c5076a.f22865a == fragment) {
                c5076a.f22865a = null;
            }
        }
    }

    /* renamed from: a */
    private static C5076a m29199a(C5076a c5076a, SparseArray<C5076a> sparseArray, int i) {
        if (c5076a != null) {
            return c5076a;
        }
        c5076a = new C5076a();
        sparseArray.put(i, c5076a);
        return c5076a;
    }
}
