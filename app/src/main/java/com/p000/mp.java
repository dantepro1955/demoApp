package com.p000;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.media.AudioManager;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.widget.ActionBarContextView;
import android.support.v7.widget.ContentFrameLayout;
import android.support.v7.widget.ContentFrameLayout.C0555a;
import android.support.v7.widget.Toolbar;
import android.support.v7.widget.ViewStubCompat;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.LayoutInflater.Factory;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import android.view.Window;
import android.view.Window.Callback;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import org.xmlpull.v1.XmlPullParser;
import p000.mx.C5568a;
import p000.mx.C5570c;
import p000.mx.C5573f;
import p000.mx.C5574g;
import p000.mx.C5576i;
import p000.mx.C5577j;
import p000.ni.C5551a;
import p000.nx.C5537a;
import p000.oe.C5548a;
import p000.pk.C5542a;

@TargetApi(9)
/* compiled from: AppCompatDelegateImplV9 */
/* renamed from: mp */
class mp extends mk implements ih, C5537a {
    /* renamed from: t */
    private static final boolean f24525t = (VERSION.SDK_INT < 21);
    /* renamed from: A */
    private View f24526A;
    /* renamed from: B */
    private boolean f24527B;
    /* renamed from: C */
    private boolean f24528C;
    /* renamed from: D */
    private boolean f24529D;
    /* renamed from: E */
    private C5554d[] f24530E;
    /* renamed from: F */
    private C5554d f24531F;
    /* renamed from: G */
    private boolean f24532G;
    /* renamed from: H */
    private final Runnable f24533H = new C55401(this);
    /* renamed from: I */
    private boolean f24534I;
    /* renamed from: J */
    private Rect f24535J;
    /* renamed from: K */
    private Rect f24536K;
    /* renamed from: L */
    private mr f24537L;
    /* renamed from: m */
    ni f24538m;
    /* renamed from: n */
    ActionBarContextView f24539n;
    /* renamed from: o */
    PopupWindow f24540o;
    /* renamed from: p */
    Runnable f24541p;
    /* renamed from: q */
    ju f24542q = null;
    /* renamed from: r */
    boolean f24543r;
    /* renamed from: s */
    int f24544s;
    /* renamed from: u */
    private pf f24545u;
    /* renamed from: v */
    private C5549a f24546v;
    /* renamed from: w */
    private C5555e f24547w;
    /* renamed from: x */
    private boolean f24548x;
    /* renamed from: y */
    private ViewGroup f24549y;
    /* renamed from: z */
    private TextView f24550z;

    /* compiled from: AppCompatDelegateImplV9 */
    /* renamed from: mp$1 */
    class C55401 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ mp f24562a;

        C55401(mp mpVar) {
            this.f24562a = mpVar;
        }

        public void run() {
            if ((this.f24562a.f24544s & 1) != 0) {
                this.f24562a.m32746f(0);
            }
            if ((this.f24562a.f24544s & 4096) != 0) {
                this.f24562a.m32746f(108);
            }
            this.f24562a.f24543r = false;
            this.f24562a.f24544s = 0;
        }
    }

    /* compiled from: AppCompatDelegateImplV9 */
    /* renamed from: mp$2 */
    class C55412 implements iu {
        /* renamed from: a */
        final /* synthetic */ mp f24563a;

        C55412(mp mpVar) {
            this.f24563a = mpVar;
        }

        /* renamed from: a */
        public kb m32776a(View view, kb kbVar) {
            int b = kbVar.b();
            int g = this.f24563a.m32747g(b);
            if (b != g) {
                kbVar = kbVar.a(kbVar.a(), g, kbVar.c(), kbVar.d());
            }
            return jd.a(view, kbVar);
        }
    }

    /* compiled from: AppCompatDelegateImplV9 */
    /* renamed from: mp$3 */
    class C55433 implements C5542a {
        /* renamed from: a */
        final /* synthetic */ mp f24564a;

        C55433(mp mpVar) {
            this.f24564a = mpVar;
        }

        /* renamed from: a */
        public void mo5220a(Rect rect) {
            rect.top = this.f24564a.m32747g(rect.top);
        }
    }

    /* compiled from: AppCompatDelegateImplV9 */
    /* renamed from: mp$4 */
    class C55444 implements C0555a {
        /* renamed from: a */
        final /* synthetic */ mp f24565a;

        C55444(mp mpVar) {
            this.f24565a = mpVar;
        }

        /* renamed from: a */
        public void m32779a() {
        }

        /* renamed from: b */
        public void m32780b() {
            this.f24565a.m32754w();
        }
    }

    /* compiled from: AppCompatDelegateImplV9 */
    /* renamed from: mp$5 */
    class C55465 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ mp f24567a;

        /* compiled from: AppCompatDelegateImplV9 */
        /* renamed from: mp$5$1 */
        class C55451 extends jz {
            /* renamed from: a */
            final /* synthetic */ C55465 f24566a;

            C55451(C55465 c55465) {
                this.f24566a = c55465;
            }

            /* renamed from: a */
            public void mo3877a(View view) {
                this.f24566a.f24567a.f24539n.setVisibility(0);
            }

            /* renamed from: b */
            public void mo3878b(View view) {
                jd.c(this.f24566a.f24567a.f24539n, 1.0f);
                this.f24566a.f24567a.f24542q.m31855a(null);
                this.f24566a.f24567a.f24542q = null;
            }
        }

        C55465(mp mpVar) {
            this.f24567a = mpVar;
        }

        public void run() {
            this.f24567a.f24540o.showAtLocation(this.f24567a.f24539n, 55, 0, 0);
            this.f24567a.m32752u();
            if (this.f24567a.m32751t()) {
                jd.c(this.f24567a.f24539n, 0.0f);
                this.f24567a.f24542q = jd.r(this.f24567a.f24539n).m31852a(1.0f);
                this.f24567a.f24542q.m31855a(new C55451(this));
                return;
            }
            jd.c(this.f24567a.f24539n, 1.0f);
            this.f24567a.f24539n.setVisibility(0);
        }
    }

    /* compiled from: AppCompatDelegateImplV9 */
    /* renamed from: mp$6 */
    class C55476 extends jz {
        /* renamed from: a */
        final /* synthetic */ mp f24568a;

        C55476(mp mpVar) {
            this.f24568a = mpVar;
        }

        /* renamed from: a */
        public void mo3877a(View view) {
            this.f24568a.f24539n.setVisibility(0);
            this.f24568a.f24539n.sendAccessibilityEvent(32);
            if (this.f24568a.f24539n.getParent() instanceof View) {
                jd.y((View) this.f24568a.f24539n.getParent());
            }
        }

        /* renamed from: b */
        public void mo3878b(View view) {
            jd.c(this.f24568a.f24539n, 1.0f);
            this.f24568a.f24542q.m31855a(null);
            this.f24568a.f24542q = null;
        }
    }

    /* compiled from: AppCompatDelegateImplV9 */
    /* renamed from: mp$a */
    final class C5549a implements C5548a {
        /* renamed from: a */
        final /* synthetic */ mp f24569a;

        C5549a(mp mpVar) {
            this.f24569a = mpVar;
        }

        /* renamed from: a */
        public boolean mo5222a(nx nxVar) {
            Callback r = this.f24569a.m32692r();
            if (r != null) {
                r.onMenuOpened(108, nxVar);
            }
            return true;
        }

        /* renamed from: a */
        public void mo5221a(nx nxVar, boolean z) {
            this.f24569a.m32737b(nxVar);
        }
    }

    /* compiled from: AppCompatDelegateImplV9 */
    /* renamed from: mp$b */
    class C5552b implements C5551a {
        /* renamed from: a */
        final /* synthetic */ mp f24571a;
        /* renamed from: b */
        private C5551a f24572b;

        /* compiled from: AppCompatDelegateImplV9 */
        /* renamed from: mp$b$1 */
        class C55501 extends jz {
            /* renamed from: a */
            final /* synthetic */ C5552b f24570a;

            C55501(C5552b c5552b) {
                this.f24570a = c5552b;
            }

            /* renamed from: b */
            public void mo3878b(View view) {
                this.f24570a.f24571a.f24539n.setVisibility(8);
                if (this.f24570a.f24571a.f24540o != null) {
                    this.f24570a.f24571a.f24540o.dismiss();
                } else if (this.f24570a.f24571a.f24539n.getParent() instanceof View) {
                    jd.y((View) this.f24570a.f24571a.f24539n.getParent());
                }
                this.f24570a.f24571a.f24539n.removeAllViews();
                this.f24570a.f24571a.f24542q.m31855a(null);
                this.f24570a.f24571a.f24542q = null;
            }
        }

        public C5552b(mp mpVar, C5551a c5551a) {
            this.f24571a = mpVar;
            this.f24572b = c5551a;
        }

        /* renamed from: a */
        public boolean mo5224a(ni niVar, Menu menu) {
            return this.f24572b.mo5224a(niVar, menu);
        }

        /* renamed from: b */
        public boolean mo5226b(ni niVar, Menu menu) {
            return this.f24572b.mo5226b(niVar, menu);
        }

        /* renamed from: a */
        public boolean mo5225a(ni niVar, MenuItem menuItem) {
            return this.f24572b.mo5225a(niVar, menuItem);
        }

        /* renamed from: a */
        public void mo5223a(ni niVar) {
            this.f24572b.mo5223a(niVar);
            if (this.f24571a.f24540o != null) {
                this.f24571a.b.getDecorView().removeCallbacks(this.f24571a.f24541p);
            }
            if (this.f24571a.f24539n != null) {
                this.f24571a.m32752u();
                this.f24571a.f24542q = jd.r(this.f24571a.f24539n).m31852a(0.0f);
                this.f24571a.f24542q.m31855a(new C55501(this));
            }
            if (this.f24571a.e != null) {
                this.f24571a.e.onSupportActionModeFinished(this.f24571a.f24538m);
            }
            this.f24571a.f24538m = null;
        }
    }

    /* compiled from: AppCompatDelegateImplV9 */
    /* renamed from: mp$c */
    class C5553c extends ContentFrameLayout {
        /* renamed from: a */
        final /* synthetic */ mp f24573a;

        public C5553c(mp mpVar, Context context) {
            this.f24573a = mpVar;
            super(context);
        }

        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return this.f24573a.mo5202a(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() != 0 || !m32798a((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            this.f24573a.m32744e(0);
            return true;
        }

        public void setBackgroundResource(int i) {
            setBackgroundDrawable(na.m32939b(getContext(), i));
        }

        /* renamed from: a */
        private boolean m32798a(int i, int i2) {
            return i < -5 || i2 < -5 || i > getWidth() + 5 || i2 > getHeight() + 5;
        }
    }

    /* compiled from: AppCompatDelegateImplV9 */
    /* renamed from: mp$d */
    public static final class C5554d {
        /* renamed from: a */
        int f24574a;
        /* renamed from: b */
        int f24575b;
        /* renamed from: c */
        int f24576c;
        /* renamed from: d */
        int f24577d;
        /* renamed from: e */
        int f24578e;
        /* renamed from: f */
        int f24579f;
        /* renamed from: g */
        ViewGroup f24580g;
        /* renamed from: h */
        View f24581h;
        /* renamed from: i */
        View f24582i;
        /* renamed from: j */
        nx f24583j;
        /* renamed from: k */
        nv f24584k;
        /* renamed from: l */
        Context f24585l;
        /* renamed from: m */
        boolean f24586m;
        /* renamed from: n */
        boolean f24587n;
        /* renamed from: o */
        boolean f24588o;
        /* renamed from: p */
        public boolean f24589p;
        /* renamed from: q */
        boolean f24590q = false;
        /* renamed from: r */
        boolean f24591r;
        /* renamed from: s */
        Bundle f24592s;

        C5554d(int i) {
            this.f24574a = i;
        }

        /* renamed from: a */
        public boolean m32802a() {
            if (this.f24581h == null) {
                return false;
            }
            if (this.f24582i != null || this.f24584k.m33120d().getCount() > 0) {
                return true;
            }
            return false;
        }

        /* renamed from: a */
        void m32800a(Context context) {
            TypedValue typedValue = new TypedValue();
            Theme newTheme = context.getResources().newTheme();
            newTheme.setTo(context.getTheme());
            newTheme.resolveAttribute(C5568a.actionBarPopupTheme, typedValue, true);
            if (typedValue.resourceId != 0) {
                newTheme.applyStyle(typedValue.resourceId, true);
            }
            newTheme.resolveAttribute(C5568a.panelMenuListTheme, typedValue, true);
            if (typedValue.resourceId != 0) {
                newTheme.applyStyle(typedValue.resourceId, true);
            } else {
                newTheme.applyStyle(C5576i.Theme_AppCompat_CompactMenu, true);
            }
            Context nkVar = new nk(context, 0);
            nkVar.getTheme().setTo(newTheme);
            this.f24585l = nkVar;
            TypedArray obtainStyledAttributes = nkVar.obtainStyledAttributes(C5577j.AppCompatTheme);
            this.f24575b = obtainStyledAttributes.getResourceId(C5577j.AppCompatTheme_panelBackground, 0);
            this.f24579f = obtainStyledAttributes.getResourceId(C5577j.AppCompatTheme_android_windowAnimationStyle, 0);
            obtainStyledAttributes.recycle();
        }

        /* renamed from: a */
        void m32801a(nx nxVar) {
            if (nxVar != this.f24583j) {
                if (this.f24583j != null) {
                    this.f24583j.m33158b(this.f24584k);
                }
                this.f24583j = nxVar;
                if (nxVar != null && this.f24584k != null) {
                    nxVar.m33149a(this.f24584k);
                }
            }
        }

        /* renamed from: a */
        of m32799a(C5548a c5548a) {
            if (this.f24583j == null) {
                return null;
            }
            if (this.f24584k == null) {
                this.f24584k = new nv(this.f24585l, C5574g.abc_list_menu_item_layout);
                this.f24584k.mo5256a(c5548a);
                this.f24583j.m33149a(this.f24584k);
            }
            return this.f24584k.m33106a(this.f24580g);
        }
    }

    /* compiled from: AppCompatDelegateImplV9 */
    /* renamed from: mp$e */
    final class C5555e implements C5548a {
        /* renamed from: a */
        final /* synthetic */ mp f24593a;

        C5555e(mp mpVar) {
            this.f24593a = mpVar;
        }

        /* renamed from: a */
        public void mo5221a(nx nxVar, boolean z) {
            Menu menu;
            nx p = nxVar.mo5301p();
            boolean z2 = p != nxVar;
            mp mpVar = this.f24593a;
            if (z2) {
                menu = p;
            }
            C5554d a = mpVar.m32716a(menu);
            if (a == null) {
                return;
            }
            if (z2) {
                this.f24593a.m32719a(a.f24574a, a, p);
                this.f24593a.m32726a(a, true);
                return;
            }
            this.f24593a.m32726a(a, z);
        }

        /* renamed from: a */
        public boolean mo5222a(nx nxVar) {
            if (nxVar == null && this.f24593a.h) {
                Callback r = this.f24593a.m32692r();
                if (!(r == null || this.f24593a.m32691q())) {
                    r.onMenuOpened(108, nxVar);
                }
            }
            return true;
        }
    }

    mp(Context context, Window window, mi miVar) {
        super(context, window, miVar);
    }

    /* renamed from: a */
    public void mo5196a(Bundle bundle) {
        if ((this.c instanceof Activity) && dy.m29801b((Activity) this.c) != null) {
            ActionBar n = m32688n();
            if (n == null) {
                this.f24534I = true;
            } else {
                n.c(true);
            }
        }
    }

    /* renamed from: b */
    public void mo5206b(Bundle bundle) {
        m32710x();
    }

    /* renamed from: m */
    public void mo5214m() {
        m32710x();
        if (this.h && this.f == null) {
            if (this.c instanceof Activity) {
                this.f = new mw((Activity) this.c, this.i);
            } else if (this.c instanceof Dialog) {
                this.f = new mw((Dialog) this.c);
            }
            if (this.f != null) {
                this.f.c(this.f24534I);
            }
        }
    }

    /* renamed from: a */
    public void mo5197a(Toolbar toolbar) {
        if (this.c instanceof Activity) {
            ActionBar a = mo5180a();
            if (a instanceof mw) {
                throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
            }
            this.g = null;
            if (a != null) {
                a.h();
            }
            if (toolbar != null) {
                ActionBar mtVar = new mt(toolbar, ((Activity) this.c).getTitle(), this.d);
                this.f = mtVar;
                this.b.setCallback(mtVar.m32844i());
            } else {
                this.f = null;
                this.b.setCallback(this.d);
            }
            mo5212f();
        }
    }

    /* renamed from: a */
    public View mo5192a(int i) {
        m32710x();
        return this.b.findViewById(i);
    }

    /* renamed from: a */
    public void mo5195a(Configuration configuration) {
        if (this.h && this.f24548x) {
            ActionBar a = mo5180a();
            if (a != null) {
                a.a(configuration);
            }
        }
        ot.m33355a().m33376a(this.a);
        mo5188j();
    }

    /* renamed from: d */
    public void mo5185d() {
        ActionBar a = mo5180a();
        if (a != null) {
            a.d(false);
        }
    }

    /* renamed from: e */
    public void mo5211e() {
        ActionBar a = mo5180a();
        if (a != null) {
            a.d(true);
        }
    }

    /* renamed from: a */
    public void mo5198a(View view) {
        m32710x();
        ViewGroup viewGroup = (ViewGroup) this.f24549y.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.c.onContentChanged();
    }

    /* renamed from: b */
    public void mo5205b(int i) {
        m32710x();
        ViewGroup viewGroup = (ViewGroup) this.f24549y.findViewById(16908290);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.a).inflate(i, viewGroup);
        this.c.onContentChanged();
    }

    /* renamed from: a */
    public void mo5199a(View view, LayoutParams layoutParams) {
        m32710x();
        ViewGroup viewGroup = (ViewGroup) this.f24549y.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.c.onContentChanged();
    }

    /* renamed from: b */
    public void mo5207b(View view, LayoutParams layoutParams) {
        m32710x();
        ((ViewGroup) this.f24549y.findViewById(16908290)).addView(view, layoutParams);
        this.c.onContentChanged();
    }

    /* renamed from: g */
    public void mo5186g() {
        if (this.f24543r) {
            this.b.getDecorView().removeCallbacks(this.f24533H);
        }
        super.mo5186g();
        if (this.f != null) {
            this.f.h();
        }
    }

    /* renamed from: x */
    private void m32710x() {
        if (!this.f24548x) {
            this.f24549y = m32711y();
            CharSequence s = m32693s();
            if (!TextUtils.isEmpty(s)) {
                mo5208b(s);
            }
            m32712z();
            m32725a(this.f24549y);
            this.f24548x = true;
            C5554d a = m32715a(0, false);
            if (!m32691q()) {
                if (a == null || a.f24583j == null) {
                    mo5218d(108);
                }
            }
        }
    }

    /* renamed from: y */
    private ViewGroup m32711y() {
        TypedArray obtainStyledAttributes = this.a.obtainStyledAttributes(C5577j.AppCompatTheme);
        if (obtainStyledAttributes.hasValue(C5577j.AppCompatTheme_windowActionBar)) {
            View view;
            if (obtainStyledAttributes.getBoolean(C5577j.AppCompatTheme_windowNoTitle, false)) {
                mo5210c(1);
            } else if (obtainStyledAttributes.getBoolean(C5577j.AppCompatTheme_windowActionBar, false)) {
                mo5210c(108);
            }
            if (obtainStyledAttributes.getBoolean(C5577j.AppCompatTheme_windowActionBarOverlay, false)) {
                mo5210c(109);
            }
            if (obtainStyledAttributes.getBoolean(C5577j.AppCompatTheme_windowActionModeOverlay, false)) {
                mo5210c(10);
            }
            this.k = obtainStyledAttributes.getBoolean(C5577j.AppCompatTheme_android_windowIsFloating, false);
            obtainStyledAttributes.recycle();
            this.b.getDecorView();
            LayoutInflater from = LayoutInflater.from(this.a);
            if (this.l) {
                View view2;
                if (this.j) {
                    view2 = (ViewGroup) from.inflate(C5574g.abc_screen_simple_overlay_action_mode, null);
                } else {
                    view2 = (ViewGroup) from.inflate(C5574g.abc_screen_simple, null);
                }
                if (VERSION.SDK_INT >= 21) {
                    jd.a(view2, new C55412(this));
                    view = view2;
                } else {
                    ((pk) view2).setOnFitSystemWindowsListener(new C55433(this));
                    view = view2;
                }
            } else if (this.k) {
                r0 = (ViewGroup) from.inflate(C5574g.abc_dialog_title_material, null);
                this.i = false;
                this.h = false;
                view = r0;
            } else if (this.h) {
                Context nkVar;
                TypedValue typedValue = new TypedValue();
                this.a.getTheme().resolveAttribute(C5568a.actionBarTheme, typedValue, true);
                if (typedValue.resourceId != 0) {
                    nkVar = new nk(this.a, typedValue.resourceId);
                } else {
                    nkVar = this.a;
                }
                r0 = (ViewGroup) LayoutInflater.from(nkVar).inflate(C5574g.abc_screen_toolbar, null);
                this.f24545u = (pf) r0.findViewById(C5573f.decor_content_parent);
                this.f24545u.setWindowCallback(m32692r());
                if (this.i) {
                    this.f24545u.m33500a(109);
                }
                if (this.f24527B) {
                    this.f24545u.m33500a(2);
                }
                if (this.f24528C) {
                    this.f24545u.m33500a(5);
                }
                view = r0;
            } else {
                view = null;
            }
            if (view == null) {
                throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.h + ", windowActionBarOverlay: " + this.i + ", android:windowIsFloating: " + this.k + ", windowActionModeOverlay: " + this.j + ", windowNoTitle: " + this.l + " }");
            }
            if (this.f24545u == null) {
                this.f24550z = (TextView) view.findViewById(C5573f.title);
            }
            qk.m33883b(view);
            ContentFrameLayout contentFrameLayout = (ContentFrameLayout) view.findViewById(C5573f.action_bar_activity_content);
            ViewGroup viewGroup = (ViewGroup) this.b.findViewById(16908290);
            if (viewGroup != null) {
                while (viewGroup.getChildCount() > 0) {
                    View childAt = viewGroup.getChildAt(0);
                    viewGroup.removeViewAt(0);
                    contentFrameLayout.addView(childAt);
                }
                viewGroup.setId(-1);
                contentFrameLayout.setId(16908290);
                if (viewGroup instanceof FrameLayout) {
                    ((FrameLayout) viewGroup).setForeground(null);
                }
            }
            this.b.setContentView(view);
            contentFrameLayout.setAttachListener(new C55444(this));
            return view;
        }
        obtainStyledAttributes.recycle();
        throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
    }

    /* renamed from: a */
    void m32725a(ViewGroup viewGroup) {
    }

    /* renamed from: z */
    private void m32712z() {
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) this.f24549y.findViewById(16908290);
        View decorView = this.b.getDecorView();
        contentFrameLayout.setDecorPadding(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        TypedArray obtainStyledAttributes = this.a.obtainStyledAttributes(C5577j.AppCompatTheme);
        obtainStyledAttributes.getValue(C5577j.AppCompatTheme_windowMinWidthMajor, contentFrameLayout.getMinWidthMajor());
        obtainStyledAttributes.getValue(C5577j.AppCompatTheme_windowMinWidthMinor, contentFrameLayout.getMinWidthMinor());
        if (obtainStyledAttributes.hasValue(C5577j.AppCompatTheme_windowFixedWidthMajor)) {
            obtainStyledAttributes.getValue(C5577j.AppCompatTheme_windowFixedWidthMajor, contentFrameLayout.getFixedWidthMajor());
        }
        if (obtainStyledAttributes.hasValue(C5577j.AppCompatTheme_windowFixedWidthMinor)) {
            obtainStyledAttributes.getValue(C5577j.AppCompatTheme_windowFixedWidthMinor, contentFrameLayout.getFixedWidthMinor());
        }
        if (obtainStyledAttributes.hasValue(C5577j.AppCompatTheme_windowFixedHeightMajor)) {
            obtainStyledAttributes.getValue(C5577j.AppCompatTheme_windowFixedHeightMajor, contentFrameLayout.getFixedHeightMajor());
        }
        if (obtainStyledAttributes.hasValue(C5577j.AppCompatTheme_windowFixedHeightMinor)) {
            obtainStyledAttributes.getValue(C5577j.AppCompatTheme_windowFixedHeightMinor, contentFrameLayout.getFixedHeightMinor());
        }
        obtainStyledAttributes.recycle();
        contentFrameLayout.requestLayout();
    }

    /* renamed from: c */
    public boolean mo5210c(int i) {
        int h = m32709h(i);
        if (this.l && h == 108) {
            return false;
        }
        if (this.h && h == 1) {
            this.h = false;
        }
        switch (h) {
            case 1:
                m32697A();
                this.l = true;
                return true;
            case 2:
                m32697A();
                this.f24527B = true;
                return true;
            case 5:
                m32697A();
                this.f24528C = true;
                return true;
            case 10:
                m32697A();
                this.j = true;
                return true;
            case 108:
                m32697A();
                this.h = true;
                return true;
            case 109:
                m32697A();
                this.i = true;
                return true;
            default:
                return this.b.requestFeature(h);
        }
    }

    /* renamed from: b */
    void mo5208b(CharSequence charSequence) {
        if (this.f24545u != null) {
            this.f24545u.setWindowTitle(charSequence);
        } else if (m32688n() != null) {
            m32688n().b(charSequence);
        } else if (this.f24550z != null) {
            this.f24550z.setText(charSequence);
        }
    }

    /* renamed from: a */
    void mo5194a(int i, Menu menu) {
        if (i == 108) {
            ActionBar a = mo5180a();
            if (a != null) {
                a.e(false);
            }
        } else if (i == 0) {
            C5554d a2 = m32715a(i, true);
            if (a2.f24588o) {
                m32726a(a2, false);
            }
        }
    }

    /* renamed from: b */
    boolean mo5209b(int i, Menu menu) {
        if (i != 108) {
            return false;
        }
        ActionBar a = mo5180a();
        if (a == null) {
            return true;
        }
        a.e(true);
        return true;
    }

    /* renamed from: a */
    public boolean mo5203a(nx nxVar, MenuItem menuItem) {
        Callback r = m32692r();
        if (!(r == null || m32691q())) {
            C5554d a = m32716a(nxVar.mo5301p());
            if (a != null) {
                return r.onMenuItemSelected(a.f24574a, menuItem);
            }
        }
        return false;
    }

    /* renamed from: a */
    public void mo5200a(nx nxVar) {
        m32699a(nxVar, true);
    }

    /* renamed from: a */
    public ni mo5193a(C5551a c5551a) {
        if (c5551a == null) {
            throw new IllegalArgumentException("ActionMode callback can not be null.");
        }
        if (this.f24538m != null) {
            this.f24538m.mo5237c();
        }
        C5551a c5552b = new C5552b(this, c5551a);
        ActionBar a = mo5180a();
        if (a != null) {
            this.f24538m = a.a(c5552b);
            if (!(this.f24538m == null || this.e == null)) {
                this.e.onSupportActionModeStarted(this.f24538m);
            }
        }
        if (this.f24538m == null) {
            this.f24538m = mo5204b(c5552b);
        }
        return this.f24538m;
    }

    /* renamed from: f */
    public void mo5212f() {
        ActionBar a = mo5180a();
        if (a == null || !a.e()) {
            mo5218d(0);
        }
    }

    /* renamed from: b */
    ni mo5204b(C5551a c5551a) {
        ni niVar;
        m32752u();
        if (this.f24538m != null) {
            this.f24538m.mo5237c();
        }
        if (!(c5551a instanceof C5552b)) {
            c5551a = new C5552b(this, c5551a);
        }
        if (this.e == null || m32691q()) {
            niVar = null;
        } else {
            try {
                niVar = this.e.onWindowStartingSupportActionMode(c5551a);
            } catch (AbstractMethodError e) {
                niVar = null;
            }
        }
        if (niVar != null) {
            this.f24538m = niVar;
        } else {
            if (this.f24539n == null) {
                if (this.k) {
                    Context nkVar;
                    TypedValue typedValue = new TypedValue();
                    Theme theme = this.a.getTheme();
                    theme.resolveAttribute(C5568a.actionBarTheme, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        Theme newTheme = this.a.getResources().newTheme();
                        newTheme.setTo(theme);
                        newTheme.applyStyle(typedValue.resourceId, true);
                        nkVar = new nk(this.a, 0);
                        nkVar.getTheme().setTo(newTheme);
                    } else {
                        nkVar = this.a;
                    }
                    this.f24539n = new ActionBarContextView(nkVar);
                    this.f24540o = new PopupWindow(nkVar, null, C5568a.actionModePopupWindowStyle);
                    lr.m32502a(this.f24540o, 2);
                    this.f24540o.setContentView(this.f24539n);
                    this.f24540o.setWidth(-1);
                    nkVar.getTheme().resolveAttribute(C5568a.actionBarSize, typedValue, true);
                    this.f24539n.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, nkVar.getResources().getDisplayMetrics()));
                    this.f24540o.setHeight(-2);
                    this.f24541p = new C55465(this);
                } else {
                    ViewStubCompat viewStubCompat = (ViewStubCompat) this.f24549y.findViewById(C5573f.action_mode_bar_stub);
                    if (viewStubCompat != null) {
                        viewStubCompat.setLayoutInflater(LayoutInflater.from(m32689o()));
                        this.f24539n = (ActionBarContextView) viewStubCompat.a();
                    }
                }
            }
            if (this.f24539n != null) {
                boolean z;
                m32752u();
                this.f24539n.c();
                Context context = this.f24539n.getContext();
                ActionBarContextView actionBarContextView = this.f24539n;
                if (this.f24540o == null) {
                    z = true;
                } else {
                    z = false;
                }
                ni nlVar = new nl(context, actionBarContextView, c5551a, z);
                if (c5551a.mo5224a(nlVar, nlVar.mo5234b())) {
                    nlVar.mo5238d();
                    this.f24539n.a(nlVar);
                    this.f24538m = nlVar;
                    if (m32751t()) {
                        jd.c(this.f24539n, 0.0f);
                        this.f24542q = jd.r(this.f24539n).m31852a(1.0f);
                        this.f24542q.m31855a(new C55476(this));
                    } else {
                        jd.c(this.f24539n, 1.0f);
                        this.f24539n.setVisibility(0);
                        this.f24539n.sendAccessibilityEvent(32);
                        if (this.f24539n.getParent() instanceof View) {
                            jd.y((View) this.f24539n.getParent());
                        }
                    }
                    if (this.f24540o != null) {
                        this.b.getDecorView().post(this.f24541p);
                    }
                } else {
                    this.f24538m = null;
                }
            }
        }
        if (!(this.f24538m == null || this.e == null)) {
            this.e.onSupportActionModeStarted(this.f24538m);
        }
        return this.f24538m;
    }

    /* renamed from: t */
    final boolean m32751t() {
        return this.f24548x && this.f24549y != null && jd.H(this.f24549y);
    }

    /* renamed from: u */
    void m32752u() {
        if (this.f24542q != null) {
            this.f24542q.m31859b();
        }
    }

    /* renamed from: v */
    boolean m32753v() {
        if (this.f24538m != null) {
            this.f24538m.mo5237c();
            return true;
        }
        ActionBar a = mo5180a();
        if (a == null || !a.f()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    boolean mo5201a(int i, KeyEvent keyEvent) {
        ActionBar a = mo5180a();
        if (a != null && a.a(i, keyEvent)) {
            return true;
        }
        if (this.f24531F == null || !m32702a(this.f24531F, keyEvent.getKeyCode(), keyEvent, 1)) {
            if (this.f24531F == null) {
                C5554d a2 = m32715a(0, true);
                m32704b(a2, keyEvent);
                boolean a3 = m32702a(a2, keyEvent.getKeyCode(), keyEvent, 1);
                a2.f24586m = false;
                if (a3) {
                    return true;
                }
            }
            return false;
        } else if (this.f24531F == null) {
            return true;
        } else {
            this.f24531F.f24587n = true;
            return true;
        }
    }

    /* renamed from: a */
    boolean mo5202a(KeyEvent keyEvent) {
        boolean z = true;
        if (keyEvent.getKeyCode() == 82 && this.c.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyEvent.getAction() != 0) {
            z = false;
        }
        return z ? m32741c(keyCode, keyEvent) : m32738b(keyCode, keyEvent);
    }

    /* renamed from: b */
    boolean m32738b(int i, KeyEvent keyEvent) {
        switch (i) {
            case 4:
                boolean z = this.f24532G;
                this.f24532G = false;
                C5554d a = m32715a(0, false);
                if (a == null || !a.f24588o) {
                    if (m32753v()) {
                        return true;
                    }
                } else if (z) {
                    return true;
                } else {
                    m32726a(a, true);
                    return true;
                }
                break;
            case 82:
                m32708e(0, keyEvent);
                return true;
        }
        return false;
    }

    /* renamed from: c */
    boolean m32741c(int i, KeyEvent keyEvent) {
        boolean z = true;
        switch (i) {
            case 4:
                if ((keyEvent.getFlags() & 128) == 0) {
                    z = false;
                }
                this.f24532G = z;
                break;
            case 82:
                m32707d(0, keyEvent);
                return true;
        }
        if (VERSION.SDK_INT < 11) {
            mo5201a(i, keyEvent);
        }
        return false;
    }

    /* renamed from: b */
    public View m32731b(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z;
        if (this.f24537L == null) {
            this.f24537L = new mr();
        }
        if (f24525t) {
            boolean a = attributeSet instanceof XmlPullParser ? ((XmlPullParser) attributeSet).getDepth() > 1 : m32700a((ViewParent) view);
            z = a;
        } else {
            z = false;
        }
        return this.f24537L.m32810a(view, str, context, attributeSet, z, f24525t, true, qh.m33842a());
    }

    /* renamed from: a */
    private boolean m32700a(ViewParent viewParent) {
        if (viewParent == null) {
            return false;
        }
        ViewParent decorView = this.b.getDecorView();
        ViewParent viewParent2 = viewParent;
        while (viewParent2 != null) {
            if (viewParent2 == decorView || !(viewParent2 instanceof View) || jd.J((View) viewParent2)) {
                return false;
            }
            viewParent2 = viewParent2.getParent();
        }
        return true;
    }

    /* renamed from: i */
    public void mo5213i() {
        LayoutInflater from = LayoutInflater.from(this.a);
        if (from.getFactory() == null) {
            id.m30763a(from, this);
        } else if (!(id.m30762a(from) instanceof mp)) {
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View a = mo5216a(view, str, context, attributeSet);
        return a != null ? a : m32731b(view, str, context, attributeSet);
    }

    /* renamed from: a */
    View mo5216a(View view, String str, Context context, AttributeSet attributeSet) {
        if (this.c instanceof Factory) {
            View onCreateView = ((Factory) this.c).onCreateView(str, context, attributeSet);
            if (onCreateView != null) {
                return onCreateView;
            }
        }
        return null;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    private void m32698a(p000.mp.C5554d r11, KeyEvent r12) {
        /*
        r10 = this;
        r1 = -1;
        r3 = 0;
        r9 = 1;
        r2 = -2;
        r0 = r11.f24588o;
        if (r0 != 0) goto L_0x000e;
    L_0x0008:
        r0 = r10.m32691q();
        if (r0 == 0) goto L_0x000f;
    L_0x000e:
        return;
    L_0x000f:
        r0 = r11.f24574a;
        if (r0 != 0) goto L_0x0034;
    L_0x0013:
        r4 = r10.a;
        r0 = r4.getResources();
        r0 = r0.getConfiguration();
        r0 = r0.screenLayout;
        r0 = r0 & 15;
        r5 = 4;
        if (r0 != r5) goto L_0x0048;
    L_0x0024:
        r0 = r9;
    L_0x0025:
        r4 = r4.getApplicationInfo();
        r4 = r4.targetSdkVersion;
        r5 = 11;
        if (r4 < r5) goto L_0x004a;
    L_0x002f:
        r4 = r9;
    L_0x0030:
        if (r0 == 0) goto L_0x0034;
    L_0x0032:
        if (r4 != 0) goto L_0x000e;
    L_0x0034:
        r0 = r10.m32692r();
        if (r0 == 0) goto L_0x004c;
    L_0x003a:
        r4 = r11.f24574a;
        r5 = r11.f24583j;
        r0 = r0.onMenuOpened(r4, r5);
        if (r0 != 0) goto L_0x004c;
    L_0x0044:
        r10.m32726a(r11, r9);
        goto L_0x000e;
    L_0x0048:
        r0 = r3;
        goto L_0x0025;
    L_0x004a:
        r4 = r3;
        goto L_0x0030;
    L_0x004c:
        r0 = r10.a;
        r4 = "window";
        r0 = r0.getSystemService(r4);
        r8 = r0;
        r8 = (android.view.WindowManager) r8;
        if (r8 == 0) goto L_0x000e;
    L_0x0059:
        r0 = r10.m32704b(r11, r12);
        if (r0 == 0) goto L_0x000e;
    L_0x005f:
        r0 = r11.f24580g;
        if (r0 == 0) goto L_0x0067;
    L_0x0063:
        r0 = r11.f24590q;
        if (r0 == 0) goto L_0x00f1;
    L_0x0067:
        r0 = r11.f24580g;
        if (r0 != 0) goto L_0x00df;
    L_0x006b:
        r0 = r10.m32701a(r11);
        if (r0 == 0) goto L_0x000e;
    L_0x0071:
        r0 = r11.f24580g;
        if (r0 == 0) goto L_0x000e;
    L_0x0075:
        r0 = r10.m32705c(r11);
        if (r0 == 0) goto L_0x000e;
    L_0x007b:
        r0 = r11.m32802a();
        if (r0 == 0) goto L_0x000e;
    L_0x0081:
        r0 = r11.f24581h;
        r0 = r0.getLayoutParams();
        if (r0 != 0) goto L_0x0103;
    L_0x0089:
        r0 = new android.view.ViewGroup$LayoutParams;
        r0.<init>(r2, r2);
        r1 = r0;
    L_0x008f:
        r0 = r11.f24575b;
        r4 = r11.f24580g;
        r4.setBackgroundResource(r0);
        r0 = r11.f24581h;
        r0 = r0.getParent();
        if (r0 == 0) goto L_0x00a9;
    L_0x009e:
        r4 = r0 instanceof android.view.ViewGroup;
        if (r4 == 0) goto L_0x00a9;
    L_0x00a2:
        r0 = (android.view.ViewGroup) r0;
        r4 = r11.f24581h;
        r0.removeView(r4);
    L_0x00a9:
        r0 = r11.f24580g;
        r4 = r11.f24581h;
        r0.addView(r4, r1);
        r0 = r11.f24581h;
        r0 = r0.hasFocus();
        if (r0 != 0) goto L_0x00bd;
    L_0x00b8:
        r0 = r11.f24581h;
        r0.requestFocus();
    L_0x00bd:
        r1 = r2;
    L_0x00be:
        r11.f24587n = r3;
        r0 = new android.view.WindowManager$LayoutParams;
        r3 = r11.f24577d;
        r4 = r11.f24578e;
        r5 = 1002; // 0x3ea float:1.404E-42 double:4.95E-321;
        r6 = 8519680; // 0x820000 float:1.1938615E-38 double:4.209281E-317;
        r7 = -3;
        r0.<init>(r1, r2, r3, r4, r5, r6, r7);
        r1 = r11.f24576c;
        r0.gravity = r1;
        r1 = r11.f24579f;
        r0.windowAnimations = r1;
        r1 = r11.f24580g;
        r8.addView(r1, r0);
        r11.f24588o = r9;
        goto L_0x000e;
    L_0x00df:
        r0 = r11.f24590q;
        if (r0 == 0) goto L_0x0075;
    L_0x00e3:
        r0 = r11.f24580g;
        r0 = r0.getChildCount();
        if (r0 <= 0) goto L_0x0075;
    L_0x00eb:
        r0 = r11.f24580g;
        r0.removeAllViews();
        goto L_0x0075;
    L_0x00f1:
        r0 = r11.f24582i;
        if (r0 == 0) goto L_0x0101;
    L_0x00f5:
        r0 = r11.f24582i;
        r0 = r0.getLayoutParams();
        if (r0 == 0) goto L_0x0101;
    L_0x00fd:
        r0 = r0.width;
        if (r0 == r1) goto L_0x00be;
    L_0x0101:
        r1 = r2;
        goto L_0x00be;
    L_0x0103:
        r1 = r0;
        goto L_0x008f;
        */
        throw new UnsupportedOperationException("Method not decompiled: mp.a(mp$d, android.view.KeyEvent):void");
    }

    /* renamed from: a */
    private boolean m32701a(C5554d c5554d) {
        c5554d.m32800a(m32689o());
        c5554d.f24580g = new C5553c(this, c5554d.f24585l);
        c5554d.f24576c = 81;
        return true;
    }

    /* renamed from: a */
    private void m32699a(nx nxVar, boolean z) {
        if (this.f24545u == null || !this.f24545u.m33501e() || (jo.m31763a(ViewConfiguration.get(this.a)) && !this.f24545u.m33503g())) {
            C5554d a = m32715a(0, true);
            a.f24590q = true;
            m32726a(a, false);
            m32698a(a, null);
            return;
        }
        Callback r = m32692r();
        if (this.f24545u.m33502f() && z) {
            this.f24545u.m33505i();
            if (!m32691q()) {
                r.onPanelClosed(108, m32715a(0, true).f24583j);
            }
        } else if (r != null && !m32691q()) {
            if (this.f24543r && (this.f24544s & 1) != 0) {
                this.b.getDecorView().removeCallbacks(this.f24533H);
                this.f24533H.run();
            }
            C5554d a2 = m32715a(0, true);
            if (a2.f24583j != null && !a2.f24591r && r.onPreparePanel(0, a2.f24582i, a2.f24583j)) {
                r.onMenuOpened(108, a2.f24583j);
                this.f24545u.m33504h();
            }
        }
    }

    /* renamed from: b */
    private boolean m32703b(C5554d c5554d) {
        Context nkVar;
        nx nxVar;
        Context context = this.a;
        if ((c5554d.f24574a == 0 || c5554d.f24574a == 108) && this.f24545u != null) {
            TypedValue typedValue = new TypedValue();
            Theme theme = context.getTheme();
            theme.resolveAttribute(C5568a.actionBarTheme, typedValue, true);
            Theme theme2 = null;
            if (typedValue.resourceId != 0) {
                theme2 = context.getResources().newTheme();
                theme2.setTo(theme);
                theme2.applyStyle(typedValue.resourceId, true);
                theme2.resolveAttribute(C5568a.actionBarWidgetTheme, typedValue, true);
            } else {
                theme.resolveAttribute(C5568a.actionBarWidgetTheme, typedValue, true);
            }
            if (typedValue.resourceId != 0) {
                if (theme2 == null) {
                    theme2 = context.getResources().newTheme();
                    theme2.setTo(theme);
                }
                theme2.applyStyle(typedValue.resourceId, true);
            }
            Theme theme3 = theme2;
            if (theme3 != null) {
                nkVar = new nk(context, 0);
                nkVar.getTheme().setTo(theme3);
                nxVar = new nx(nkVar);
                nxVar.mo5295a((C5537a) this);
                c5554d.m32801a(nxVar);
                return true;
            }
        }
        nkVar = context;
        nxVar = new nx(nkVar);
        nxVar.mo5295a((C5537a) this);
        c5554d.m32801a(nxVar);
        return true;
    }

    /* renamed from: c */
    private boolean m32705c(C5554d c5554d) {
        if (c5554d.f24582i != null) {
            c5554d.f24581h = c5554d.f24582i;
            return true;
        } else if (c5554d.f24583j == null) {
            return false;
        } else {
            if (this.f24547w == null) {
                this.f24547w = new C5555e(this);
            }
            c5554d.f24581h = (View) c5554d.m32799a(this.f24547w);
            return c5554d.f24581h != null;
        }
    }

    /* renamed from: b */
    private boolean m32704b(C5554d c5554d, KeyEvent keyEvent) {
        if (m32691q()) {
            return false;
        }
        if (c5554d.f24586m) {
            return true;
        }
        if (!(this.f24531F == null || this.f24531F == c5554d)) {
            m32726a(this.f24531F, false);
        }
        Callback r = m32692r();
        if (r != null) {
            c5554d.f24582i = r.onCreatePanelView(c5554d.f24574a);
        }
        boolean z = c5554d.f24574a == 0 || c5554d.f24574a == 108;
        if (z && this.f24545u != null) {
            this.f24545u.setMenuPrepared();
        }
        if (c5554d.f24582i == null && !(z && (m32688n() instanceof mt))) {
            if (c5554d.f24583j == null || c5554d.f24591r) {
                if (c5554d.f24583j == null && (!m32703b(c5554d) || c5554d.f24583j == null)) {
                    return false;
                }
                if (z && this.f24545u != null) {
                    if (this.f24546v == null) {
                        this.f24546v = new C5549a(this);
                    }
                    this.f24545u.setMenu(c5554d.f24583j, this.f24546v);
                }
                c5554d.f24583j.m33173g();
                if (r.onCreatePanelMenu(c5554d.f24574a, c5554d.f24583j)) {
                    c5554d.f24591r = false;
                } else {
                    c5554d.m32801a(null);
                    if (!z || this.f24545u == null) {
                        return false;
                    }
                    this.f24545u.setMenu(null, this.f24546v);
                    return false;
                }
            }
            c5554d.f24583j.m33173g();
            if (c5554d.f24592s != null) {
                c5554d.f24583j.m33168d(c5554d.f24592s);
                c5554d.f24592s = null;
            }
            if (r.onPreparePanel(0, c5554d.f24582i, c5554d.f24583j)) {
                if (KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1) {
                    z = true;
                } else {
                    z = false;
                }
                c5554d.f24589p = z;
                c5554d.f24583j.setQwertyMode(c5554d.f24589p);
                c5554d.f24583j.m33174h();
            } else {
                if (z && this.f24545u != null) {
                    this.f24545u.setMenu(null, this.f24546v);
                }
                c5554d.f24583j.m33174h();
                return false;
            }
        }
        c5554d.f24586m = true;
        c5554d.f24587n = false;
        this.f24531F = c5554d;
        return true;
    }

    /* renamed from: b */
    void m32737b(nx nxVar) {
        if (!this.f24529D) {
            this.f24529D = true;
            this.f24545u.m33506j();
            Callback r = m32692r();
            if (!(r == null || m32691q())) {
                r.onPanelClosed(108, nxVar);
            }
            this.f24529D = false;
        }
    }

    /* renamed from: e */
    void m32744e(int i) {
        m32726a(m32715a(i, true), true);
    }

    /* renamed from: a */
    void m32726a(C5554d c5554d, boolean z) {
        if (z && c5554d.f24574a == 0 && this.f24545u != null && this.f24545u.m33502f()) {
            m32737b(c5554d.f24583j);
            return;
        }
        WindowManager windowManager = (WindowManager) this.a.getSystemService("window");
        if (!(windowManager == null || !c5554d.f24588o || c5554d.f24580g == null)) {
            windowManager.removeView(c5554d.f24580g);
            if (z) {
                m32719a(c5554d.f24574a, c5554d, null);
            }
        }
        c5554d.f24586m = false;
        c5554d.f24587n = false;
        c5554d.f24588o = false;
        c5554d.f24581h = null;
        c5554d.f24590q = true;
        if (this.f24531F == c5554d) {
            this.f24531F = null;
        }
    }

    /* renamed from: d */
    private boolean m32707d(int i, KeyEvent keyEvent) {
        if (keyEvent.getRepeatCount() == 0) {
            C5554d a = m32715a(i, true);
            if (!a.f24588o) {
                return m32704b(a, keyEvent);
            }
        }
        return false;
    }

    /* renamed from: e */
    private boolean m32708e(int i, KeyEvent keyEvent) {
        boolean z = true;
        if (this.f24538m != null) {
            return false;
        }
        C5554d a = m32715a(i, true);
        if (i != 0 || this.f24545u == null || !this.f24545u.m33501e() || jo.m31763a(ViewConfiguration.get(this.a))) {
            boolean z2;
            if (a.f24588o || a.f24587n) {
                z2 = a.f24588o;
                m32726a(a, true);
                z = z2;
            } else {
                if (a.f24586m) {
                    if (a.f24591r) {
                        a.f24586m = false;
                        z2 = m32704b(a, keyEvent);
                    } else {
                        z2 = true;
                    }
                    if (z2) {
                        m32698a(a, keyEvent);
                    }
                }
                z = false;
            }
        } else if (this.f24545u.m33502f()) {
            z = this.f24545u.m33505i();
        } else {
            if (!m32691q() && m32704b(a, keyEvent)) {
                z = this.f24545u.m33504h();
            }
            z = false;
        }
        if (z) {
            AudioManager audioManager = (AudioManager) this.a.getSystemService("audio");
            if (audioManager != null) {
                audioManager.playSoundEffect(0);
            } else {
                Log.w("AppCompatDelegate", "Couldn't get audio manager");
            }
        }
        return z;
    }

    /* renamed from: a */
    void m32719a(int i, C5554d c5554d, Menu menu) {
        if (menu == null) {
            if (c5554d == null && i >= 0 && i < this.f24530E.length) {
                c5554d = this.f24530E[i];
            }
            if (c5554d != null) {
                menu = c5554d.f24583j;
            }
        }
        if ((c5554d == null || c5554d.f24588o) && !m32691q()) {
            this.c.onPanelClosed(i, menu);
        }
    }

    /* renamed from: a */
    C5554d m32716a(Menu menu) {
        C5554d[] c5554dArr = this.f24530E;
        int length = c5554dArr != null ? c5554dArr.length : 0;
        for (int i = 0; i < length; i++) {
            C5554d c5554d = c5554dArr[i];
            if (c5554d != null && c5554d.f24583j == menu) {
                return c5554d;
            }
        }
        return null;
    }

    /* renamed from: a */
    protected C5554d m32715a(int i, boolean z) {
        Object obj = this.f24530E;
        if (obj == null || obj.length <= i) {
            Object obj2 = new C5554d[(i + 1)];
            if (obj != null) {
                System.arraycopy(obj, 0, obj2, 0, obj.length);
            }
            this.f24530E = obj2;
            obj = obj2;
        }
        C5554d c5554d = obj[i];
        if (c5554d != null) {
            return c5554d;
        }
        c5554d = new C5554d(i);
        obj[i] = c5554d;
        return c5554d;
    }

    /* renamed from: a */
    private boolean m32702a(C5554d c5554d, int i, KeyEvent keyEvent, int i2) {
        boolean z = false;
        if (!keyEvent.isSystem()) {
            if ((c5554d.f24586m || m32704b(c5554d, keyEvent)) && c5554d.f24583j != null) {
                z = c5554d.f24583j.performShortcut(i, keyEvent, i2);
            }
            if (z && (i2 & 1) == 0 && this.f24545u == null) {
                m32726a(c5554d, true);
            }
        }
        return z;
    }

    /* renamed from: d */
    private void mo5218d(int i) {
        this.f24544s |= 1 << i;
        if (!this.f24543r) {
            jd.a(this.b.getDecorView(), this.f24533H);
            this.f24543r = true;
        }
    }

    /* renamed from: f */
    void m32746f(int i) {
        C5554d a = m32715a(i, true);
        if (a.f24583j != null) {
            Bundle bundle = new Bundle();
            a.f24583j.m33162c(bundle);
            if (bundle.size() > 0) {
                a.f24592s = bundle;
            }
            a.f24583j.m33173g();
            a.f24583j.clear();
        }
        a.f24591r = true;
        a.f24590q = true;
        if ((i == 108 || i == 0) && this.f24545u != null) {
            a = m32715a(0, false);
            if (a != null) {
                a.f24586m = false;
                m32704b(a, null);
            }
        }
    }

    /* renamed from: g */
    int m32747g(int i) {
        int i2;
        int i3 = 1;
        int i4 = 0;
        if (this.f24539n == null || !(this.f24539n.getLayoutParams() instanceof MarginLayoutParams)) {
            i2 = 0;
        } else {
            int i5;
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.f24539n.getLayoutParams();
            if (this.f24539n.isShown()) {
                if (this.f24535J == null) {
                    this.f24535J = new Rect();
                    this.f24536K = new Rect();
                }
                Rect rect = this.f24535J;
                Rect rect2 = this.f24536K;
                rect.set(0, i, 0, 0);
                qk.m33881a(this.f24549y, rect, rect2);
                if (marginLayoutParams.topMargin != (rect2.top == 0 ? i : 0)) {
                    marginLayoutParams.topMargin = i;
                    if (this.f24526A == null) {
                        this.f24526A = new View(this.a);
                        this.f24526A.setBackgroundColor(this.a.getResources().getColor(C5570c.abc_input_method_navigation_guard));
                        this.f24549y.addView(this.f24526A, -1, new LayoutParams(-1, i));
                        i5 = 1;
                    } else {
                        LayoutParams layoutParams = this.f24526A.getLayoutParams();
                        if (layoutParams.height != i) {
                            layoutParams.height = i;
                            this.f24526A.setLayoutParams(layoutParams);
                        }
                        i5 = 1;
                    }
                } else {
                    i5 = 0;
                }
                if (this.f24526A == null) {
                    i3 = 0;
                }
                if (!(this.j || i3 == 0)) {
                    i = 0;
                }
                int i6 = i5;
                i5 = i3;
                i3 = i6;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                i5 = 0;
            } else {
                i3 = 0;
                i5 = 0;
            }
            if (i3 != 0) {
                this.f24539n.setLayoutParams(marginLayoutParams);
            }
            i2 = i5;
        }
        if (this.f24526A != null) {
            View view = this.f24526A;
            if (i2 == 0) {
                i4 = 8;
            }
            view.setVisibility(i4);
        }
        return i;
    }

    /* renamed from: A */
    private void m32697A() {
        if (this.f24548x) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    /* renamed from: h */
    private int m32709h(int i) {
        if (i == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            return 108;
        } else if (i != 9) {
            return i;
        } else {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            return 109;
        }
    }

    /* renamed from: w */
    void m32754w() {
        if (this.f24545u != null) {
            this.f24545u.m33506j();
        }
        if (this.f24540o != null) {
            this.b.getDecorView().removeCallbacks(this.f24541p);
            if (this.f24540o.isShowing()) {
                try {
                    this.f24540o.dismiss();
                } catch (IllegalArgumentException e) {
                }
            }
            this.f24540o = null;
        }
        m32752u();
        C5554d a = m32715a(0, false);
        if (a != null && a.f24583j != null) {
            a.f24583j.close();
        }
    }
}
