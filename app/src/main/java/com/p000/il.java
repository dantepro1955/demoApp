package com.p000;

import android.os.Build.VERSION;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;

/* compiled from: MenuItemCompat */
/* renamed from: il */
public final class il {
    /* renamed from: a */
    static final C5392d f23868a;

    /* compiled from: MenuItemCompat */
    /* renamed from: il$d */
    interface C5392d {
        /* renamed from: a */
        MenuItem mo4860a(MenuItem menuItem, View view);

        /* renamed from: a */
        View mo4861a(MenuItem menuItem);

        /* renamed from: a */
        void mo4862a(MenuItem menuItem, int i);

        /* renamed from: b */
        MenuItem mo4863b(MenuItem menuItem, int i);

        /* renamed from: b */
        boolean mo4864b(MenuItem menuItem);

        /* renamed from: c */
        boolean mo4865c(MenuItem menuItem);

        /* renamed from: d */
        boolean mo4866d(MenuItem menuItem);
    }

    /* compiled from: MenuItemCompat */
    /* renamed from: il$a */
    static class C5393a implements C5392d {
        C5393a() {
        }

        /* renamed from: a */
        public void mo4862a(MenuItem menuItem, int i) {
        }

        /* renamed from: a */
        public MenuItem mo4860a(MenuItem menuItem, View view) {
            return menuItem;
        }

        /* renamed from: b */
        public MenuItem mo4863b(MenuItem menuItem, int i) {
            return menuItem;
        }

        /* renamed from: a */
        public View mo4861a(MenuItem menuItem) {
            return null;
        }

        /* renamed from: b */
        public boolean mo4864b(MenuItem menuItem) {
            return false;
        }

        /* renamed from: c */
        public boolean mo4865c(MenuItem menuItem) {
            return false;
        }

        /* renamed from: d */
        public boolean mo4866d(MenuItem menuItem) {
            return false;
        }
    }

    /* compiled from: MenuItemCompat */
    /* renamed from: il$b */
    static class C5394b implements C5392d {
        C5394b() {
        }

        /* renamed from: a */
        public void mo4862a(MenuItem menuItem, int i) {
            im.m30815a(menuItem, i);
        }

        /* renamed from: a */
        public MenuItem mo4860a(MenuItem menuItem, View view) {
            return im.m30813a(menuItem, view);
        }

        /* renamed from: b */
        public MenuItem mo4863b(MenuItem menuItem, int i) {
            return im.m30816b(menuItem, i);
        }

        /* renamed from: a */
        public View mo4861a(MenuItem menuItem) {
            return im.m30814a(menuItem);
        }

        /* renamed from: b */
        public boolean mo4864b(MenuItem menuItem) {
            return false;
        }

        /* renamed from: c */
        public boolean mo4865c(MenuItem menuItem) {
            return false;
        }

        /* renamed from: d */
        public boolean mo4866d(MenuItem menuItem) {
            return false;
        }
    }

    /* compiled from: MenuItemCompat */
    /* renamed from: il$c */
    static class C5395c extends C5394b {
        C5395c() {
        }

        /* renamed from: b */
        public boolean mo4864b(MenuItem menuItem) {
            return in.m30817a(menuItem);
        }

        /* renamed from: c */
        public boolean mo4865c(MenuItem menuItem) {
            return in.m30818b(menuItem);
        }

        /* renamed from: d */
        public boolean mo4866d(MenuItem menuItem) {
            return in.m30819c(menuItem);
        }
    }

    /* compiled from: MenuItemCompat */
    /* renamed from: il$e */
    public interface C5396e {
        /* renamed from: a */
        boolean mo5287a(MenuItem menuItem);

        /* renamed from: b */
        boolean mo5288b(MenuItem menuItem);
    }

    static {
        if (VERSION.SDK_INT >= 14) {
            f23868a = new C5395c();
        } else if (VERSION.SDK_INT >= 11) {
            f23868a = new C5394b();
        } else {
            f23868a = new C5393a();
        }
    }

    /* renamed from: a */
    public static void m30808a(MenuItem menuItem, int i) {
        if (menuItem instanceof gd) {
            ((gd) menuItem).setShowAsAction(i);
        } else {
            f23868a.mo4862a(menuItem, i);
        }
    }

    /* renamed from: a */
    public static MenuItem m30805a(MenuItem menuItem, View view) {
        if (menuItem instanceof gd) {
            return ((gd) menuItem).setActionView(view);
        }
        return f23868a.mo4860a(menuItem, view);
    }

    /* renamed from: b */
    public static MenuItem m30809b(MenuItem menuItem, int i) {
        if (menuItem instanceof gd) {
            return ((gd) menuItem).setActionView(i);
        }
        return f23868a.mo4863b(menuItem, i);
    }

    /* renamed from: a */
    public static View m30807a(MenuItem menuItem) {
        if (menuItem instanceof gd) {
            return ((gd) menuItem).getActionView();
        }
        return f23868a.mo4861a(menuItem);
    }

    /* renamed from: a */
    public static MenuItem m30806a(MenuItem menuItem, hx hxVar) {
        if (menuItem instanceof gd) {
            return ((gd) menuItem).mo5243a(hxVar);
        }
        Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
        return menuItem;
    }

    /* renamed from: b */
    public static boolean m30810b(MenuItem menuItem) {
        if (menuItem instanceof gd) {
            return ((gd) menuItem).expandActionView();
        }
        return f23868a.mo4864b(menuItem);
    }

    /* renamed from: c */
    public static boolean m30811c(MenuItem menuItem) {
        if (menuItem instanceof gd) {
            return ((gd) menuItem).collapseActionView();
        }
        return f23868a.mo4865c(menuItem);
    }

    /* renamed from: d */
    public static boolean m30812d(MenuItem menuItem) {
        if (menuItem instanceof gd) {
            return ((gd) menuItem).isActionViewExpanded();
        }
        return f23868a.mo4866d(menuItem);
    }
}
