package com.p000;

import android.os.Build.VERSION;
import android.support.v4.app.Fragment;
import android.support.v4.app.Fragment.C0387c;
import android.support.v4.app.FragmentManager.BackStackEntry;
import android.support.v4.app.FragmentManagerImpl;
import android.support.v4.app.FragmentManagerImpl.C0396c;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* compiled from: BackStackRecord */
/* renamed from: df */
public final class df extends ds implements BackStackEntry, C0396c {
    /* renamed from: a */
    static final boolean f21446a = (VERSION.SDK_INT >= 21);
    /* renamed from: b */
    public final FragmentManagerImpl f21447b;
    /* renamed from: c */
    public ArrayList<C4866a> f21448c = new ArrayList();
    /* renamed from: d */
    public int f21449d;
    /* renamed from: e */
    public int f21450e;
    /* renamed from: f */
    public int f21451f;
    /* renamed from: g */
    public int f21452g;
    /* renamed from: h */
    public int f21453h;
    /* renamed from: i */
    public int f21454i;
    /* renamed from: j */
    public boolean f21455j;
    /* renamed from: k */
    boolean f21456k = true;
    /* renamed from: l */
    public String f21457l;
    /* renamed from: m */
    boolean f21458m;
    /* renamed from: n */
    public int f21459n = -1;
    /* renamed from: o */
    public int f21460o;
    /* renamed from: p */
    public CharSequence f21461p;
    /* renamed from: q */
    public int f21462q;
    /* renamed from: r */
    public CharSequence f21463r;
    /* renamed from: s */
    public ArrayList<String> f21464s;
    /* renamed from: t */
    public ArrayList<String> f21465t;
    /* renamed from: u */
    public boolean f21466u = false;

    /* compiled from: BackStackRecord */
    /* renamed from: df$a */
    public static final class C4866a {
        /* renamed from: a */
        public int f21440a;
        /* renamed from: b */
        public Fragment f21441b;
        /* renamed from: c */
        public int f21442c;
        /* renamed from: d */
        public int f21443d;
        /* renamed from: e */
        public int f21444e;
        /* renamed from: f */
        public int f21445f;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(128);
        stringBuilder.append("BackStackEntry{");
        stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f21459n >= 0) {
            stringBuilder.append(" #");
            stringBuilder.append(this.f21459n);
        }
        if (this.f21457l != null) {
            stringBuilder.append(" ");
            stringBuilder.append(this.f21457l);
        }
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    /* renamed from: a */
    public void m26934a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        m26935a(str, printWriter, true);
    }

    /* renamed from: a */
    public void m26935a(String str, PrintWriter printWriter, boolean z) {
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f21457l);
            printWriter.print(" mIndex=");
            printWriter.print(this.f21459n);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f21458m);
            if (this.f21453h != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f21453h));
                printWriter.print(" mTransitionStyle=#");
                printWriter.println(Integer.toHexString(this.f21454i));
            }
            if (!(this.f21449d == 0 && this.f21450e == 0)) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f21449d));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f21450e));
            }
            if (!(this.f21451f == 0 && this.f21452g == 0)) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f21451f));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f21452g));
            }
            if (!(this.f21460o == 0 && this.f21461p == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f21460o));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f21461p);
            }
            if (!(this.f21462q == 0 && this.f21463r == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f21462q));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f21463r);
            }
        }
        if (!this.f21448c.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Operations:");
            str + "    ";
            int size = this.f21448c.size();
            for (int i = 0; i < size; i++) {
                String str2;
                C4866a c4866a = (C4866a) this.f21448c.get(i);
                switch (c4866a.f21440a) {
                    case 0:
                        str2 = "NULL";
                        break;
                    case 1:
                        str2 = "ADD";
                        break;
                    case 2:
                        str2 = "REPLACE";
                        break;
                    case 3:
                        str2 = "REMOVE";
                        break;
                    case 4:
                        str2 = "HIDE";
                        break;
                    case 5:
                        str2 = "SHOW";
                        break;
                    case 6:
                        str2 = "DETACH";
                        break;
                    case 7:
                        str2 = "ATTACH";
                        break;
                    default:
                        str2 = "cmd=" + c4866a.f21440a;
                        break;
                }
                printWriter.print(str);
                printWriter.print("  Op #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.print(str2);
                printWriter.print(" ");
                printWriter.println(c4866a.f21441b);
                if (z) {
                    if (!(c4866a.f21442c == 0 && c4866a.f21443d == 0)) {
                        printWriter.print(str);
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(c4866a.f21442c));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(c4866a.f21443d));
                    }
                    if (c4866a.f21444e != 0 || c4866a.f21445f != 0) {
                        printWriter.print(str);
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(c4866a.f21444e));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(c4866a.f21445f));
                    }
                }
            }
        }
    }

    public df(FragmentManagerImpl fragmentManagerImpl) {
        this.f21447b = fragmentManagerImpl;
    }

    public int getId() {
        return this.f21459n;
    }

    public int getBreadCrumbTitleRes() {
        return this.f21460o;
    }

    public int getBreadCrumbShortTitleRes() {
        return this.f21462q;
    }

    public CharSequence getBreadCrumbTitle() {
        if (this.f21460o != 0) {
            return this.f21447b.mHost.m28356i().getText(this.f21460o);
        }
        return this.f21461p;
    }

    public CharSequence getBreadCrumbShortTitle() {
        if (this.f21462q != 0) {
            return this.f21447b.mHost.m28356i().getText(this.f21462q);
        }
        return this.f21463r;
    }

    /* renamed from: a */
    public void m26933a(C4866a c4866a) {
        this.f21448c.add(c4866a);
        c4866a.f21442c = this.f21449d;
        c4866a.f21443d = this.f21450e;
        c4866a.f21444e = this.f21451f;
        c4866a.f21445f = this.f21452g;
    }

    /* renamed from: a */
    public ds mo4381a(Fragment fragment, String str) {
        m26921a(0, fragment, str, 1);
        return this;
    }

    /* renamed from: a */
    public ds mo4379a(int i, Fragment fragment, String str) {
        m26921a(i, fragment, str, 1);
        return this;
    }

    /* renamed from: a */
    private void m26921a(int i, Fragment fragment, String str, int i2) {
        Class cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from" + " instance state.");
        }
        fragment.mFragmentManager = this.f21447b;
        if (str != null) {
            if (fragment.mTag == null || str.equals(fragment.mTag)) {
                fragment.mTag = str;
            } else {
                throw new IllegalStateException("Can't change tag of fragment " + fragment + ": was " + fragment.mTag + " now " + str);
            }
        }
        if (i != 0) {
            if (i == -1) {
                throw new IllegalArgumentException("Can't add fragment " + fragment + " with tag " + str + " to container view with no id");
            } else if (fragment.mFragmentId == 0 || fragment.mFragmentId == i) {
                fragment.mFragmentId = i;
                fragment.mContainerId = i;
            } else {
                throw new IllegalStateException("Can't change container ID of fragment " + fragment + ": was " + fragment.mFragmentId + " now " + i);
            }
        }
        C4866a c4866a = new C4866a();
        c4866a.f21440a = i2;
        c4866a.f21441b = fragment;
        m26933a(c4866a);
    }

    /* renamed from: a */
    public ds mo4378a(int i, Fragment fragment) {
        return mo4384b(i, fragment, null);
    }

    /* renamed from: b */
    public ds mo4384b(int i, Fragment fragment, String str) {
        if (i == 0) {
            throw new IllegalArgumentException("Must use non-zero containerViewId");
        }
        m26921a(i, fragment, str, 2);
        return this;
    }

    /* renamed from: a */
    public ds mo4380a(Fragment fragment) {
        C4866a c4866a = new C4866a();
        c4866a.f21440a = 3;
        c4866a.f21441b = fragment;
        m26933a(c4866a);
        return this;
    }

    /* renamed from: b */
    public ds mo4385b(Fragment fragment) {
        C4866a c4866a = new C4866a();
        c4866a.f21440a = 6;
        c4866a.f21441b = fragment;
        m26933a(c4866a);
        return this;
    }

    /* renamed from: c */
    public ds mo4386c(Fragment fragment) {
        C4866a c4866a = new C4866a();
        c4866a.f21440a = 7;
        c4866a.f21441b = fragment;
        m26933a(c4866a);
        return this;
    }

    /* renamed from: a */
    public ds mo4377a(int i, int i2, int i3, int i4) {
        this.f21449d = i;
        this.f21450e = i2;
        this.f21451f = i3;
        this.f21452g = i4;
        return this;
    }

    /* renamed from: a */
    public ds mo4376a(int i) {
        this.f21453h = i;
        return this;
    }

    /* renamed from: a */
    public ds mo4382a(String str) {
        if (this.f21456k) {
            this.f21455j = true;
            this.f21457l = str;
            return this;
        }
        throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
    }

    /* renamed from: b */
    public void m26942b(int i) {
        if (this.f21455j) {
            if (FragmentManagerImpl.DEBUG) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i);
            }
            int size = this.f21448c.size();
            for (int i2 = 0; i2 < size; i2++) {
                C4866a c4866a = (C4866a) this.f21448c.get(i2);
                if (c4866a.f21441b != null) {
                    Fragment fragment = c4866a.f21441b;
                    fragment.mBackStackNesting += i;
                    if (FragmentManagerImpl.DEBUG) {
                        Log.v("FragmentManager", "Bump nesting of " + c4866a.f21441b + " to " + c4866a.f21441b.mBackStackNesting);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public int mo4375a() {
        return m26924a(false);
    }

    /* renamed from: b */
    public int mo4383b() {
        return m26924a(true);
    }

    /* renamed from: a */
    int m26924a(boolean z) {
        if (this.f21458m) {
            throw new IllegalStateException("commit already called");
        }
        if (FragmentManagerImpl.DEBUG) {
            Log.v("FragmentManager", "Commit: " + this);
            PrintWriter printWriter = new PrintWriter(new hl("FragmentManager"));
            m26934a("  ", null, printWriter, null);
            printWriter.close();
        }
        this.f21458m = true;
        if (this.f21455j) {
            this.f21459n = this.f21447b.allocBackStackIndex(this);
        } else {
            this.f21459n = -1;
        }
        this.f21447b.enqueueAction(this, z);
        return this.f21459n;
    }

    /* renamed from: a */
    public boolean m26938a(ArrayList<df> arrayList, ArrayList<Boolean> arrayList2) {
        if (FragmentManagerImpl.DEBUG) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.valueOf(false));
        if (this.f21455j) {
            this.f21447b.addBackStackState(this);
        }
        return true;
    }

    /* renamed from: c */
    public boolean m26947c(int i) {
        int size = this.f21448c.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (((C4866a) this.f21448c.get(i2)).f21441b.mContainerId == i) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public boolean m26937a(ArrayList<df> arrayList, int i, int i2) {
        if (i2 == i) {
            return false;
        }
        int size = this.f21448c.size();
        int i3 = -1;
        int i4 = 0;
        while (i4 < size) {
            int i5;
            int i6 = ((C4866a) this.f21448c.get(i4)).f21441b.mContainerId;
            if (i6 == 0 || i6 == i3) {
                i5 = i3;
            } else {
                for (int i7 = i; i7 < i2; i7++) {
                    df dfVar = (df) arrayList.get(i7);
                    int size2 = dfVar.f21448c.size();
                    for (int i8 = 0; i8 < size2; i8++) {
                        if (((C4866a) dfVar.f21448c.get(i8)).f21441b.mContainerId == i6) {
                            return true;
                        }
                    }
                }
                i5 = i6;
            }
            i4++;
            i3 = i5;
        }
        return false;
    }

    /* renamed from: c */
    public void m26946c() {
        int size = this.f21448c.size();
        for (int i = 0; i < size; i++) {
            C4866a c4866a = (C4866a) this.f21448c.get(i);
            Fragment fragment = c4866a.f21441b;
            fragment.setNextTransition(this.f21453h, this.f21454i);
            switch (c4866a.f21440a) {
                case 1:
                    fragment.setNextAnim(c4866a.f21442c);
                    this.f21447b.addFragment(fragment, false);
                    break;
                case 3:
                    fragment.setNextAnim(c4866a.f21443d);
                    this.f21447b.removeFragment(fragment);
                    break;
                case 4:
                    fragment.setNextAnim(c4866a.f21443d);
                    this.f21447b.hideFragment(fragment);
                    break;
                case 5:
                    fragment.setNextAnim(c4866a.f21442c);
                    this.f21447b.showFragment(fragment);
                    break;
                case 6:
                    fragment.setNextAnim(c4866a.f21443d);
                    this.f21447b.detachFragment(fragment);
                    break;
                case 7:
                    fragment.setNextAnim(c4866a.f21442c);
                    this.f21447b.attachFragment(fragment);
                    break;
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + c4866a.f21440a);
            }
            if (!(this.f21466u || c4866a.f21440a == 1)) {
                this.f21447b.moveFragmentToExpectedState(fragment);
            }
        }
        if (!this.f21466u) {
            this.f21447b.moveToState(this.f21447b.mCurState, true);
        }
    }

    /* renamed from: b */
    public void m26944b(boolean z) {
        for (int size = this.f21448c.size() - 1; size >= 0; size--) {
            C4866a c4866a = (C4866a) this.f21448c.get(size);
            Fragment fragment = c4866a.f21441b;
            fragment.setNextTransition(FragmentManagerImpl.reverseTransit(this.f21453h), this.f21454i);
            switch (c4866a.f21440a) {
                case 1:
                    fragment.setNextAnim(c4866a.f21445f);
                    this.f21447b.removeFragment(fragment);
                    break;
                case 3:
                    fragment.setNextAnim(c4866a.f21444e);
                    this.f21447b.addFragment(fragment, false);
                    break;
                case 4:
                    fragment.setNextAnim(c4866a.f21444e);
                    this.f21447b.showFragment(fragment);
                    break;
                case 5:
                    fragment.setNextAnim(c4866a.f21445f);
                    this.f21447b.hideFragment(fragment);
                    break;
                case 6:
                    fragment.setNextAnim(c4866a.f21444e);
                    this.f21447b.attachFragment(fragment);
                    break;
                case 7:
                    fragment.setNextAnim(c4866a.f21445f);
                    this.f21447b.detachFragment(fragment);
                    break;
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + c4866a.f21440a);
            }
            if (!(this.f21466u || c4866a.f21440a == 3)) {
                this.f21447b.moveFragmentToExpectedState(fragment);
            }
        }
        if (!this.f21466u && z) {
            this.f21447b.moveToState(this.f21447b.mCurState, true);
        }
    }

    /* renamed from: a */
    public void m26936a(ArrayList<Fragment> arrayList) {
        int i = 0;
        while (i < this.f21448c.size()) {
            C4866a c4866a = (C4866a) this.f21448c.get(i);
            switch (c4866a.f21440a) {
                case 1:
                case 7:
                    arrayList.add(c4866a.f21441b);
                    break;
                case 2:
                    Fragment fragment = c4866a.f21441b;
                    int i2 = fragment.mContainerId;
                    int size = arrayList.size() - 1;
                    int i3 = i;
                    int i4 = 0;
                    while (size >= 0) {
                        Fragment fragment2 = (Fragment) arrayList.get(size);
                        if (fragment2.mContainerId != i2) {
                            i = i4;
                            i4 = i3;
                        } else if (fragment2 == fragment) {
                            i = 1;
                            i4 = i3;
                        } else {
                            C4866a c4866a2 = new C4866a();
                            c4866a2.f21440a = 3;
                            c4866a2.f21441b = fragment2;
                            c4866a2.f21442c = c4866a.f21442c;
                            c4866a2.f21444e = c4866a.f21444e;
                            c4866a2.f21443d = c4866a.f21443d;
                            c4866a2.f21445f = c4866a.f21445f;
                            this.f21448c.add(i3, c4866a2);
                            arrayList.remove(fragment2);
                            int i5 = i4;
                            i4 = i3 + 1;
                            i = i5;
                        }
                        size--;
                        i3 = i4;
                        i4 = i;
                    }
                    if (i4 == 0) {
                        c4866a.f21440a = 1;
                        arrayList.add(fragment);
                        i = i3;
                        break;
                    }
                    this.f21448c.remove(i3);
                    i = i3 - 1;
                    break;
                case 3:
                case 6:
                    arrayList.remove(c4866a.f21441b);
                    break;
                default:
                    break;
            }
            i++;
        }
    }

    /* renamed from: b */
    public void m26943b(ArrayList<Fragment> arrayList) {
        for (int i = 0; i < this.f21448c.size(); i++) {
            C4866a c4866a = (C4866a) this.f21448c.get(i);
            switch (c4866a.f21440a) {
                case 1:
                case 7:
                    arrayList.remove(c4866a.f21441b);
                    break;
                case 3:
                case 6:
                    arrayList.add(c4866a.f21441b);
                    break;
                default:
                    break;
            }
        }
    }

    /* renamed from: d */
    public boolean m26948d() {
        for (int i = 0; i < this.f21448c.size(); i++) {
            if (df.m26922b((C4866a) this.f21448c.get(i))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public void m26932a(C0387c c0387c) {
        for (int i = 0; i < this.f21448c.size(); i++) {
            C4866a c4866a = (C4866a) this.f21448c.get(i);
            if (df.m26922b(c4866a)) {
                c4866a.f21441b.setOnStartEnterTransitionListener(c0387c);
            }
        }
    }

    /* renamed from: b */
    private static boolean m26922b(C4866a c4866a) {
        Fragment fragment = c4866a.f21441b;
        return (!fragment.mAdded || fragment.mView == null || fragment.mDetached || fragment.mHidden || !fragment.isPostponed()) ? false : true;
    }

    public String getName() {
        return this.f21457l;
    }
}
