package com.p000;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Parcelable;
import android.os.SystemClock;
import android.support.v7.widget.MenuPopupWindow;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnKeyListener;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow.OnDismissListener;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import p000.mx.C5571d;
import p000.mx.C5574g;
import p000.oe.C5548a;

/* compiled from: CascadingMenuPopup */
/* renamed from: nu */
final class nu extends oc implements OnKeyListener, OnDismissListener, oe {
    /* renamed from: a */
    final Handler f24806a;
    /* renamed from: b */
    final List<C5591a> f24807b = new ArrayList();
    /* renamed from: c */
    View f24808c;
    /* renamed from: d */
    boolean f24809d;
    /* renamed from: e */
    private final Context f24810e;
    /* renamed from: f */
    private final int f24811f;
    /* renamed from: g */
    private final int f24812g;
    /* renamed from: h */
    private final int f24813h;
    /* renamed from: i */
    private final boolean f24814i;
    /* renamed from: j */
    private final List<nx> f24815j = new LinkedList();
    /* renamed from: k */
    private final OnGlobalLayoutListener f24816k = new C55881(this);
    /* renamed from: l */
    private final pp f24817l = new C55902(this);
    /* renamed from: m */
    private int f24818m = 0;
    /* renamed from: n */
    private int f24819n = 0;
    /* renamed from: o */
    private View f24820o;
    /* renamed from: p */
    private int f24821p;
    /* renamed from: q */
    private boolean f24822q;
    /* renamed from: r */
    private boolean f24823r;
    /* renamed from: s */
    private int f24824s;
    /* renamed from: t */
    private int f24825t;
    /* renamed from: u */
    private boolean f24826u;
    /* renamed from: v */
    private boolean f24827v;
    /* renamed from: w */
    private C5548a f24828w;
    /* renamed from: x */
    private ViewTreeObserver f24829x;
    /* renamed from: y */
    private OnDismissListener f24830y;

    /* compiled from: CascadingMenuPopup */
    /* renamed from: nu$1 */
    class C55881 implements OnGlobalLayoutListener {
        /* renamed from: a */
        final /* synthetic */ nu f24796a;

        C55881(nu nuVar) {
            this.f24796a = nuVar;
        }

        public void onGlobalLayout() {
            if (this.f24796a.mo5277f() && this.f24796a.f24807b.size() > 0 && !((C5591a) this.f24796a.f24807b.get(0)).f24802a.c()) {
                View view = this.f24796a.f24808c;
                if (view == null || !view.isShown()) {
                    this.f24796a.mo5276e();
                    return;
                }
                for (C5591a c5591a : this.f24796a.f24807b) {
                    c5591a.f24802a.d();
                }
            }
        }
    }

    /* compiled from: CascadingMenuPopup */
    /* renamed from: nu$2 */
    class C55902 implements pp {
        /* renamed from: a */
        final /* synthetic */ nu f24801a;

        C55902(nu nuVar) {
            this.f24801a = nuVar;
        }

        /* renamed from: a */
        public void mo5263a(nx nxVar, MenuItem menuItem) {
            this.f24801a.f24806a.removeCallbacksAndMessages(nxVar);
        }

        /* renamed from: b */
        public void mo5264b(final nx nxVar, final MenuItem menuItem) {
            int i;
            this.f24801a.f24806a.removeCallbacksAndMessages(null);
            int size = this.f24801a.f24807b.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (nxVar == ((C5591a) this.f24801a.f24807b.get(i2)).f24803b) {
                    i = i2;
                    break;
                }
            }
            i = -1;
            if (i != -1) {
                C5591a c5591a;
                i++;
                if (i < this.f24801a.f24807b.size()) {
                    c5591a = (C5591a) this.f24801a.f24807b.get(i);
                } else {
                    c5591a = null;
                }
                this.f24801a.f24806a.postAtTime(new Runnable(this) {
                    /* renamed from: d */
                    final /* synthetic */ C55902 f24800d;

                    public void run() {
                        if (c5591a != null) {
                            this.f24800d.f24801a.f24809d = true;
                            c5591a.f24803b.m33159b(false);
                            this.f24800d.f24801a.f24809d = false;
                        }
                        if (menuItem.isEnabled() && menuItem.hasSubMenu()) {
                            nxVar.m33152a(menuItem, 4);
                        }
                    }
                }, nxVar, SystemClock.uptimeMillis() + 200);
            }
        }
    }

    /* compiled from: CascadingMenuPopup */
    /* renamed from: nu$a */
    static class C5591a {
        /* renamed from: a */
        public final MenuPopupWindow f24802a;
        /* renamed from: b */
        public final nx f24803b;
        /* renamed from: c */
        public final int f24804c;

        public C5591a(MenuPopupWindow menuPopupWindow, nx nxVar, int i) {
            this.f24802a = menuPopupWindow;
            this.f24803b = nxVar;
            this.f24804c = i;
        }

        /* renamed from: a */
        public ListView m33054a() {
            return this.f24802a.g();
        }
    }

    public nu(Context context, View view, int i, int i2, boolean z) {
        this.f24810e = context;
        this.f24820o = view;
        this.f24812g = i;
        this.f24813h = i2;
        this.f24814i = z;
        this.f24826u = false;
        this.f24821p = m33083k();
        Resources resources = context.getResources();
        this.f24811f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(C5571d.abc_config_prefDialogWidth));
        this.f24806a = new Handler();
    }

    /* renamed from: b */
    public void mo5271b(boolean z) {
        this.f24826u = z;
    }

    /* renamed from: j */
    private MenuPopupWindow m33082j() {
        MenuPopupWindow menuPopupWindow = new MenuPopupWindow(this.f24810e, null, this.f24812g, this.f24813h);
        menuPopupWindow.a(this.f24817l);
        menuPopupWindow.a(this);
        menuPopupWindow.a(this);
        menuPopupWindow.b(this.f24820o);
        menuPopupWindow.e(this.f24819n);
        menuPopupWindow.a(true);
        return menuPopupWindow;
    }

    /* renamed from: d */
    public void mo5275d() {
        if (!mo5277f()) {
            for (nx c : this.f24815j) {
                m33079c(c);
            }
            this.f24815j.clear();
            this.f24808c = this.f24820o;
            if (this.f24808c != null) {
                Object obj = this.f24829x == null ? 1 : null;
                this.f24829x = this.f24808c.getViewTreeObserver();
                if (obj != null) {
                    this.f24829x.addOnGlobalLayoutListener(this.f24816k);
                }
            }
        }
    }

    /* renamed from: e */
    public void mo5276e() {
        int size = this.f24807b.size();
        if (size > 0) {
            C5591a[] c5591aArr = (C5591a[]) this.f24807b.toArray(new C5591a[size]);
            for (size--; size >= 0; size--) {
                C5591a c5591a = c5591aArr[size];
                if (c5591a.f24802a.f()) {
                    c5591a.f24802a.e();
                }
            }
        }
    }

    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        mo5276e();
        return true;
    }

    /* renamed from: k */
    private int m33083k() {
        if (jd.g(this.f24820o) == 1) {
            return 0;
        }
        return 1;
    }

    /* renamed from: d */
    private int m33080d(int i) {
        ListView a = ((C5591a) this.f24807b.get(this.f24807b.size() - 1)).m33054a();
        int[] iArr = new int[2];
        a.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        this.f24808c.getWindowVisibleDisplayFrame(rect);
        if (this.f24821p == 1) {
            if ((a.getWidth() + iArr[0]) + i > rect.right) {
                return 0;
            }
            return 1;
        } else if (iArr[0] - i < 0) {
            return 1;
        } else {
            return 0;
        }
    }

    /* renamed from: a */
    public void mo5269a(nx nxVar) {
        nxVar.m33150a((oe) this, this.f24810e);
        if (mo5277f()) {
            m33079c(nxVar);
        } else {
            this.f24815j.add(nxVar);
        }
    }

    /* renamed from: c */
    private void m33079c(nx nxVar) {
        View a;
        C5591a c5591a;
        LayoutInflater from = LayoutInflater.from(this.f24810e);
        Object nwVar = new nw(nxVar, from, this.f24814i);
        if (!mo5277f() && this.f24826u) {
            nwVar.m33123a(true);
        } else if (mo5277f()) {
            nwVar.m33123a(oc.m33061b(nxVar));
        }
        int a2 = oc.m33059a(nwVar, null, this.f24810e, this.f24811f);
        MenuPopupWindow j = m33082j();
        j.a(nwVar);
        j.g(a2);
        j.e(this.f24819n);
        if (this.f24807b.size() > 0) {
            C5591a c5591a2 = (C5591a) this.f24807b.get(this.f24807b.size() - 1);
            a = m33078a(c5591a2, nxVar);
            c5591a = c5591a2;
        } else {
            a = null;
            c5591a = null;
        }
        if (a != null) {
            boolean z;
            int i;
            j.b(false);
            j.a(null);
            int d = m33080d(a2);
            if (d == 1) {
                z = true;
            } else {
                z = false;
            }
            this.f24821p = d;
            int[] iArr = new int[2];
            a.getLocationInWindow(iArr);
            int j2 = c5591a.f24802a.j() + iArr[0];
            int k = iArr[1] + c5591a.f24802a.k();
            if ((this.f24819n & 5) == 5) {
                if (z) {
                    i = j2 + a2;
                } else {
                    i = j2 - a.getWidth();
                }
            } else if (z) {
                i = a.getWidth() + j2;
            } else {
                i = j2 - a2;
            }
            j.c(i);
            j.d(k);
        } else {
            if (this.f24822q) {
                j.c(this.f24824s);
            }
            if (this.f24823r) {
                j.d(this.f24825t);
            }
            j.a(m33076i());
        }
        this.f24807b.add(new C5591a(j, nxVar, this.f24821p));
        j.d();
        if (c5591a == null && this.f24827v && nxVar.m33179m() != null) {
            ViewGroup g = j.g();
            FrameLayout frameLayout = (FrameLayout) from.inflate(C5574g.abc_popup_menu_header_item_layout, g, false);
            TextView textView = (TextView) frameLayout.findViewById(16908310);
            frameLayout.setEnabled(false);
            textView.setText(nxVar.m33179m());
            g.addHeaderView(frameLayout, null, false);
            j.d();
        }
    }

    /* renamed from: a */
    private MenuItem m33077a(nx nxVar, nx nxVar2) {
        int size = nxVar.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = nxVar.getItem(i);
            if (item.hasSubMenu() && nxVar2 == item.getSubMenu()) {
                return item;
            }
        }
        return null;
    }

    /* renamed from: a */
    private View m33078a(C5591a c5591a, nx nxVar) {
        int i = 0;
        MenuItem a = m33077a(c5591a.f24803b, nxVar);
        if (a == null) {
            return null;
        }
        int headersCount;
        nw nwVar;
        int i2;
        ListView a2 = c5591a.m33054a();
        ListAdapter adapter = a2.getAdapter();
        if (adapter instanceof HeaderViewListAdapter) {
            HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
            headersCount = headerViewListAdapter.getHeadersCount();
            nwVar = (nw) headerViewListAdapter.getWrappedAdapter();
        } else {
            nwVar = (nw) adapter;
            headersCount = 0;
        }
        int count = nwVar.getCount();
        while (i < count) {
            if (a == nwVar.m33122a(i)) {
                i2 = i;
                break;
            }
            i++;
        }
        i2 = -1;
        if (i2 == -1) {
            return null;
        }
        i2 = (i2 + headersCount) - a2.getFirstVisiblePosition();
        if (i2 < 0 || i2 >= a2.getChildCount()) {
            return null;
        }
        return a2.getChildAt(i2);
    }

    /* renamed from: f */
    public boolean mo5277f() {
        return this.f24807b.size() > 0 && ((C5591a) this.f24807b.get(0)).f24802a.f();
    }

    public void onDismiss() {
        C5591a c5591a;
        int size = this.f24807b.size();
        for (int i = 0; i < size; i++) {
            c5591a = (C5591a) this.f24807b.get(i);
            if (!c5591a.f24802a.f()) {
                break;
            }
        }
        c5591a = null;
        if (c5591a != null) {
            c5591a.f24803b.m33159b(false);
        }
    }

    /* renamed from: a */
    public void mo5257a(boolean z) {
        for (C5591a a : this.f24807b) {
            oc.m33060a(a.m33054a().getAdapter()).notifyDataSetChanged();
        }
    }

    /* renamed from: a */
    public void mo5256a(C5548a c5548a) {
        this.f24828w = c5548a;
    }

    /* renamed from: a */
    public boolean mo5260a(ok okVar) {
        for (C5591a c5591a : this.f24807b) {
            if (okVar == c5591a.f24803b) {
                c5591a.m33054a().requestFocus();
                return true;
            }
        }
        if (!okVar.hasVisibleItems()) {
            return false;
        }
        mo5269a((nx) okVar);
        if (this.f24828w != null) {
            this.f24828w.mo5222a(okVar);
        }
        return true;
    }

    /* renamed from: d */
    private int m33081d(nx nxVar) {
        int size = this.f24807b.size();
        for (int i = 0; i < size; i++) {
            if (nxVar == ((C5591a) this.f24807b.get(i)).f24803b) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: a */
    public void mo5255a(nx nxVar, boolean z) {
        int d = m33081d(nxVar);
        if (d >= 0) {
            int i = d + 1;
            if (i < this.f24807b.size()) {
                ((C5591a) this.f24807b.get(i)).f24803b.m33159b(false);
            }
            C5591a c5591a = (C5591a) this.f24807b.remove(d);
            c5591a.f24803b.m33158b((oe) this);
            if (this.f24809d) {
                c5591a.f24802a.b(null);
                c5591a.f24802a.b(0);
            }
            c5591a.f24802a.e();
            d = this.f24807b.size();
            if (d > 0) {
                this.f24821p = ((C5591a) this.f24807b.get(d - 1)).f24804c;
            } else {
                this.f24821p = m33083k();
            }
            if (d == 0) {
                mo5276e();
                if (this.f24828w != null) {
                    this.f24828w.mo5221a(nxVar, true);
                }
                if (this.f24829x != null) {
                    if (this.f24829x.isAlive()) {
                        this.f24829x.removeGlobalOnLayoutListener(this.f24816k);
                    }
                    this.f24829x = null;
                }
                this.f24830y.onDismiss();
            } else if (z) {
                ((C5591a) this.f24807b.get(0)).f24803b.m33159b(false);
            }
        }
    }

    /* renamed from: a */
    public boolean mo5258a() {
        return false;
    }

    /* renamed from: c */
    public Parcelable mo5272c() {
        return null;
    }

    /* renamed from: a */
    public void mo5266a(Parcelable parcelable) {
    }

    /* renamed from: a */
    public void mo5265a(int i) {
        if (this.f24818m != i) {
            this.f24818m = i;
            this.f24819n = hz.a(i, jd.g(this.f24820o));
        }
    }

    /* renamed from: a */
    public void mo5267a(View view) {
        if (this.f24820o != view) {
            this.f24820o = view;
            this.f24819n = hz.a(this.f24818m, jd.g(this.f24820o));
        }
    }

    /* renamed from: a */
    public void mo5268a(OnDismissListener onDismissListener) {
        this.f24830y = onDismissListener;
    }

    /* renamed from: g */
    public ListView mo5278g() {
        if (this.f24807b.isEmpty()) {
            return null;
        }
        return ((C5591a) this.f24807b.get(this.f24807b.size() - 1)).m33054a();
    }

    /* renamed from: b */
    public void mo5270b(int i) {
        this.f24822q = true;
        this.f24824s = i;
    }

    /* renamed from: c */
    public void mo5273c(int i) {
        this.f24823r = true;
        this.f24825t = i;
    }

    /* renamed from: c */
    public void mo5274c(boolean z) {
        this.f24827v = z;
    }

    /* renamed from: h */
    protected boolean mo5279h() {
        return false;
    }
}
