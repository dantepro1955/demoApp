package com.p000;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBar.C0507a;
import android.support.v7.widget.ActionBarContainer;
import android.support.v7.widget.ActionBarContextView;
import android.support.v7.widget.ActionBarOverlayLayout;
import android.support.v7.widget.ActionBarOverlayLayout.C0529a;
import android.support.v7.widget.ScrollingTabContainerView;
import android.support.v7.widget.Toolbar;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import p000.mx.C5568a;
import p000.mx.C5573f;
import p000.mx.C5577j;
import p000.ni.C5551a;
import p000.nx.C5537a;

/* compiled from: WindowDecorActionBar */
/* renamed from: mw */
public class mw extends ActionBar implements C0529a {
    /* renamed from: s */
    static final /* synthetic */ boolean f24651s = (!mw.class.desiredAssertionStatus());
    /* renamed from: t */
    private static final Interpolator f24652t = new AccelerateInterpolator();
    /* renamed from: u */
    private static final Interpolator f24653u = new DecelerateInterpolator();
    /* renamed from: v */
    private static final boolean f24654v;
    /* renamed from: A */
    private int f24655A = -1;
    /* renamed from: B */
    private boolean f24656B;
    /* renamed from: C */
    private boolean f24657C;
    /* renamed from: D */
    private ArrayList<C0507a> f24658D = new ArrayList();
    /* renamed from: E */
    private boolean f24659E;
    /* renamed from: F */
    private int f24660F = 0;
    /* renamed from: G */
    private boolean f24661G;
    /* renamed from: H */
    private boolean f24662H = true;
    /* renamed from: I */
    private boolean f24663I;
    /* renamed from: a */
    Context f24664a;
    /* renamed from: b */
    ActionBarOverlayLayout f24665b;
    /* renamed from: c */
    ActionBarContainer f24666c;
    /* renamed from: d */
    pg f24667d;
    /* renamed from: e */
    ActionBarContextView f24668e;
    /* renamed from: f */
    View f24669f;
    /* renamed from: g */
    ScrollingTabContainerView f24670g;
    /* renamed from: h */
    C5567a f24671h;
    /* renamed from: i */
    ni f24672i;
    /* renamed from: j */
    C5551a f24673j;
    /* renamed from: k */
    boolean f24674k = true;
    /* renamed from: l */
    boolean f24675l;
    /* renamed from: m */
    boolean f24676m;
    /* renamed from: n */
    no f24677n;
    /* renamed from: o */
    boolean f24678o;
    /* renamed from: p */
    final jy f24679p = new C55641(this);
    /* renamed from: q */
    final jy f24680q = new C55652(this);
    /* renamed from: r */
    final ka f24681r = new C55663(this);
    /* renamed from: w */
    private Context f24682w;
    /* renamed from: x */
    private Activity f24683x;
    /* renamed from: y */
    private Dialog f24684y;
    /* renamed from: z */
    private ArrayList<Object> f24685z = new ArrayList();

    /* compiled from: WindowDecorActionBar */
    /* renamed from: mw$1 */
    class C55641 extends jz {
        /* renamed from: a */
        final /* synthetic */ mw f24641a;

        C55641(mw mwVar) {
            this.f24641a = mwVar;
        }

        /* renamed from: b */
        public void mo3878b(View view) {
            if (this.f24641a.f24674k && this.f24641a.f24669f != null) {
                jd.b(this.f24641a.f24669f, 0.0f);
                jd.b(this.f24641a.f24666c, 0.0f);
            }
            this.f24641a.f24666c.setVisibility(8);
            this.f24641a.f24666c.setTransitioning(false);
            this.f24641a.f24677n = null;
            this.f24641a.m32922i();
            if (this.f24641a.f24665b != null) {
                jd.y(this.f24641a.f24665b);
            }
        }
    }

    /* compiled from: WindowDecorActionBar */
    /* renamed from: mw$2 */
    class C55652 extends jz {
        /* renamed from: a */
        final /* synthetic */ mw f24642a;

        C55652(mw mwVar) {
            this.f24642a = mwVar;
        }

        /* renamed from: b */
        public void mo3878b(View view) {
            this.f24642a.f24677n = null;
            this.f24642a.f24666c.requestLayout();
        }
    }

    /* compiled from: WindowDecorActionBar */
    /* renamed from: mw$3 */
    class C55663 implements ka {
        /* renamed from: a */
        final /* synthetic */ mw f24643a;

        C55663(mw mwVar) {
            this.f24643a = mwVar;
        }

        /* renamed from: a */
        public void mo5228a(View view) {
            ((View) this.f24643a.f24666c.getParent()).invalidate();
        }
    }

    /* compiled from: WindowDecorActionBar */
    /* renamed from: mw$a */
    public class C5567a extends ni implements C5537a {
        /* renamed from: a */
        final /* synthetic */ mw f24646a;
        /* renamed from: b */
        private final Context f24647b;
        /* renamed from: c */
        private final nx f24648c;
        /* renamed from: d */
        private C5551a f24649d;
        /* renamed from: e */
        private WeakReference<View> f24650e;

        public C5567a(mw mwVar, Context context, C5551a c5551a) {
            this.f24646a = mwVar;
            this.f24647b = context;
            this.f24649d = c5551a;
            this.f24648c = new nx(context).m33139a(1);
            this.f24648c.mo5295a((C5537a) this);
        }

        /* renamed from: a */
        public MenuInflater mo5229a() {
            return new nn(this.f24647b);
        }

        /* renamed from: b */
        public Menu mo5234b() {
            return this.f24648c;
        }

        /* renamed from: c */
        public void mo5237c() {
            if (this.f24646a.f24671h == this) {
                if (mw.m32892a(this.f24646a.f24675l, this.f24646a.f24676m, false)) {
                    this.f24649d.mo5223a(this);
                } else {
                    this.f24646a.f24672i = this;
                    this.f24646a.f24673j = this.f24649d;
                }
                this.f24649d = null;
                this.f24646a.m32925j(false);
                this.f24646a.f24668e.b();
                this.f24646a.f24667d.mo5452a().sendAccessibilityEvent(32);
                this.f24646a.f24665b.setHideOnContentScrollEnabled(this.f24646a.f24678o);
                this.f24646a.f24671h = null;
            }
        }

        /* renamed from: d */
        public void mo5238d() {
            if (this.f24646a.f24671h == this) {
                this.f24648c.m33173g();
                try {
                    this.f24649d.mo5226b(this, this.f24648c);
                } finally {
                    this.f24648c.m33174h();
                }
            }
        }

        /* renamed from: e */
        public boolean m32886e() {
            this.f24648c.m33173g();
            try {
                boolean a = this.f24649d.mo5224a((ni) this, this.f24648c);
                return a;
            } finally {
                this.f24648c.m33174h();
            }
        }

        /* renamed from: a */
        public void mo5231a(View view) {
            this.f24646a.f24668e.setCustomView(view);
            this.f24650e = new WeakReference(view);
        }

        /* renamed from: a */
        public void mo5232a(CharSequence charSequence) {
            this.f24646a.f24668e.setSubtitle(charSequence);
        }

        /* renamed from: b */
        public void mo5236b(CharSequence charSequence) {
            this.f24646a.f24668e.setTitle(charSequence);
        }

        /* renamed from: a */
        public void mo5230a(int i) {
            mo5236b(this.f24646a.f24664a.getResources().getString(i));
        }

        /* renamed from: b */
        public void mo5235b(int i) {
            mo5232a(this.f24646a.f24664a.getResources().getString(i));
        }

        /* renamed from: f */
        public CharSequence mo5239f() {
            return this.f24646a.f24668e.getTitle();
        }

        /* renamed from: g */
        public CharSequence mo5240g() {
            return this.f24646a.f24668e.getSubtitle();
        }

        /* renamed from: a */
        public void mo5233a(boolean z) {
            super.mo5233a(z);
            this.f24646a.f24668e.setTitleOptional(z);
        }

        /* renamed from: h */
        public boolean mo5241h() {
            return this.f24646a.f24668e.d();
        }

        /* renamed from: i */
        public View mo5242i() {
            return this.f24650e != null ? (View) this.f24650e.get() : null;
        }

        /* renamed from: a */
        public boolean mo5203a(nx nxVar, MenuItem menuItem) {
            if (this.f24649d != null) {
                return this.f24649d.mo5225a((ni) this, menuItem);
            }
            return false;
        }

        /* renamed from: a */
        public void mo5200a(nx nxVar) {
            if (this.f24649d != null) {
                mo5238d();
                this.f24646a.f24668e.a();
            }
        }
    }

    static {
        boolean z = true;
        if (VERSION.SDK_INT < 14) {
            z = false;
        }
        f24654v = z;
    }

    public mw(Activity activity, boolean z) {
        this.f24683x = activity;
        View decorView = activity.getWindow().getDecorView();
        m32891a(decorView);
        if (!z) {
            this.f24669f = decorView.findViewById(16908290);
        }
    }

    public mw(Dialog dialog) {
        this.f24684y = dialog;
        m32891a(dialog.getWindow().getDecorView());
    }

    /* renamed from: a */
    private void m32891a(View view) {
        this.f24665b = (ActionBarOverlayLayout) view.findViewById(C5573f.decor_content_parent);
        if (this.f24665b != null) {
            this.f24665b.setActionBarVisibilityCallback(this);
        }
        this.f24667d = m32893b(view.findViewById(C5573f.action_bar));
        this.f24668e = (ActionBarContextView) view.findViewById(C5573f.action_context_bar);
        this.f24666c = (ActionBarContainer) view.findViewById(C5573f.action_bar_container);
        if (this.f24667d == null || this.f24668e == null || this.f24666c == null) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used " + "with a compatible window decor layout");
        }
        this.f24664a = this.f24667d.mo5462b();
        boolean z = (this.f24667d.mo5481o() & 4) != 0;
        if (z) {
            this.f24656B = true;
        }
        nh a = nh.m32952a(this.f24664a);
        if (a.m32958f() || z) {
            z = true;
        } else {
            z = false;
        }
        m32906a(z);
        m32894k(a.m32956d());
        TypedArray obtainStyledAttributes = this.f24664a.obtainStyledAttributes(null, C5577j.ActionBar, C5568a.actionBarStyle, 0);
        if (obtainStyledAttributes.getBoolean(C5577j.ActionBar_hideOnContentScroll, false)) {
            m32909b(true);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(C5577j.ActionBar_elevation, 0);
        if (dimensionPixelSize != 0) {
            m32901a((float) dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    /* renamed from: b */
    private pg m32893b(View view) {
        if (view instanceof pg) {
            return (pg) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        throw new IllegalStateException(new StringBuilder().append("Can't make a decor toolbar out of ").append(view).toString() != null ? view.getClass().getSimpleName() : "null");
    }

    /* renamed from: a */
    public void m32901a(float f) {
        jd.h(this.f24666c, f);
    }

    /* renamed from: a */
    public void m32904a(Configuration configuration) {
        m32894k(nh.m32952a(this.f24664a).m32956d());
    }

    /* renamed from: k */
    private void m32894k(boolean z) {
        boolean z2;
        boolean z3;
        boolean z4 = true;
        this.f24659E = z;
        if (this.f24659E) {
            this.f24666c.setTabContainer(null);
            this.f24667d.mo5456a(this.f24670g);
        } else {
            this.f24667d.mo5456a(null);
            this.f24666c.setTabContainer(this.f24670g);
        }
        if (m32924j() == 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (this.f24670g != null) {
            if (z2) {
                this.f24670g.setVisibility(0);
                if (this.f24665b != null) {
                    jd.y(this.f24665b);
                }
            } else {
                this.f24670g.setVisibility(8);
            }
        }
        pg pgVar = this.f24667d;
        if (this.f24659E || !z2) {
            z3 = false;
        } else {
            z3 = true;
        }
        pgVar.mo5461a(z3);
        ActionBarOverlayLayout actionBarOverlayLayout = this.f24665b;
        if (this.f24659E || !z2) {
            z4 = false;
        }
        actionBarOverlayLayout.setHasNonEmbeddedTabs(z4);
    }

    /* renamed from: i */
    void m32922i() {
        if (this.f24673j != null) {
            this.f24673j.mo5223a(this.f24672i);
            this.f24672i = null;
            this.f24673j = null;
        }
    }

    /* renamed from: c */
    public void m32912c(int i) {
        this.f24660F = i;
    }

    /* renamed from: d */
    public void m32915d(boolean z) {
        this.f24663I = z;
        if (!z && this.f24677n != null) {
            this.f24677n.m33009c();
        }
    }

    /* renamed from: e */
    public void m32916e(boolean z) {
        if (z != this.f24657C) {
            this.f24657C = z;
            int size = this.f24658D.size();
            for (int i = 0; i < size; i++) {
                ((C0507a) this.f24658D.get(i)).a(z);
            }
        }
    }

    /* renamed from: f */
    public void m32917f(boolean z) {
        m32903a(z ? 4 : 0, 4);
    }

    /* renamed from: a */
    public void m32906a(boolean z) {
        this.f24667d.mo5465b(z);
    }

    /* renamed from: a */
    public void m32902a(int i) {
        m32905a(this.f24664a.getString(i));
    }

    /* renamed from: a */
    public void m32905a(CharSequence charSequence) {
        this.f24667d.mo5464b(charSequence);
    }

    /* renamed from: b */
    public void m32908b(CharSequence charSequence) {
        this.f24667d.mo5459a(charSequence);
    }

    /* renamed from: g */
    public boolean m32920g() {
        ViewGroup a = this.f24667d.mo5452a();
        if (a == null || a.hasFocus()) {
            return false;
        }
        a.requestFocus();
        return true;
    }

    /* renamed from: a */
    public void m32903a(int i, int i2) {
        int o = this.f24667d.mo5481o();
        if ((i2 & 4) != 0) {
            this.f24656B = true;
        }
        this.f24667d.mo5466c((o & (i2 ^ -1)) | (i & i2));
    }

    /* renamed from: j */
    public int m32924j() {
        return this.f24667d.mo5482p();
    }

    /* renamed from: a */
    public int m32899a() {
        return this.f24667d.mo5481o();
    }

    /* renamed from: a */
    public ni m32900a(C5551a c5551a) {
        if (this.f24671h != null) {
            this.f24671h.mo5237c();
        }
        this.f24665b.setHideOnContentScrollEnabled(false);
        this.f24668e.c();
        ni c5567a = new C5567a(this, this.f24668e.getContext(), c5551a);
        if (!c5567a.m32886e()) {
            return null;
        }
        this.f24671h = c5567a;
        c5567a.mo5238d();
        this.f24668e.a(c5567a);
        m32925j(true);
        this.f24668e.sendAccessibilityEvent(32);
        return c5567a;
    }

    /* renamed from: k */
    public int m32926k() {
        return this.f24666c.getHeight();
    }

    /* renamed from: g */
    public void m32919g(boolean z) {
        this.f24674k = z;
    }

    /* renamed from: p */
    private void m32896p() {
        if (!this.f24661G) {
            this.f24661G = true;
            if (this.f24665b != null) {
                this.f24665b.setShowingForActionMode(true);
            }
            m32895l(false);
        }
    }

    /* renamed from: l */
    public void m32927l() {
        if (this.f24676m) {
            this.f24676m = false;
            m32895l(true);
        }
    }

    /* renamed from: q */
    private void m32897q() {
        if (this.f24661G) {
            this.f24661G = false;
            if (this.f24665b != null) {
                this.f24665b.setShowingForActionMode(false);
            }
            m32895l(false);
        }
    }

    /* renamed from: m */
    public void m32928m() {
        if (!this.f24676m) {
            this.f24676m = true;
            m32895l(true);
        }
    }

    /* renamed from: b */
    public void m32909b(boolean z) {
        if (!z || this.f24665b.a()) {
            this.f24678o = z;
            this.f24665b.setHideOnContentScrollEnabled(z);
            return;
        }
        throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
    }

    /* renamed from: d */
    public int m32914d() {
        return this.f24665b.getActionBarHideOffset();
    }

    /* renamed from: a */
    static boolean m32892a(boolean z, boolean z2, boolean z3) {
        if (z3) {
            return true;
        }
        if (z || z2) {
            return false;
        }
        return true;
    }

    /* renamed from: l */
    private void m32895l(boolean z) {
        if (mw.m32892a(this.f24675l, this.f24676m, this.f24661G)) {
            if (!this.f24662H) {
                this.f24662H = true;
                m32921h(z);
            }
        } else if (this.f24662H) {
            this.f24662H = false;
            m32923i(z);
        }
    }

    /* renamed from: h */
    public void m32921h(boolean z) {
        if (this.f24677n != null) {
            this.f24677n.m33009c();
        }
        this.f24666c.setVisibility(0);
        if (this.f24660F == 0 && f24654v && (this.f24663I || z)) {
            jd.b(this.f24666c, 0.0f);
            float f = (float) (-this.f24666c.getHeight());
            if (z) {
                int[] iArr = new int[]{0, 0};
                this.f24666c.getLocationInWindow(iArr);
                f -= (float) iArr[1];
            }
            jd.b(this.f24666c, f);
            no noVar = new no();
            ju c = jd.r(this.f24666c).m31860c(0.0f);
            c.m31856a(this.f24681r);
            noVar.m33004a(c);
            if (this.f24674k && this.f24669f != null) {
                jd.b(this.f24669f, f);
                noVar.m33004a(jd.r(this.f24669f).m31860c(0.0f));
            }
            noVar.m33003a(f24653u);
            noVar.m33002a(250);
            noVar.m33006a(this.f24680q);
            this.f24677n = noVar;
            noVar.m33007a();
        } else {
            jd.c(this.f24666c, 1.0f);
            jd.b(this.f24666c, 0.0f);
            if (this.f24674k && this.f24669f != null) {
                jd.b(this.f24669f, 0.0f);
            }
            this.f24680q.mo3878b(null);
        }
        if (this.f24665b != null) {
            jd.y(this.f24665b);
        }
    }

    /* renamed from: i */
    public void m32923i(boolean z) {
        if (this.f24677n != null) {
            this.f24677n.m33009c();
        }
        if (this.f24660F == 0 && f24654v && (this.f24663I || z)) {
            jd.c(this.f24666c, 1.0f);
            this.f24666c.setTransitioning(true);
            no noVar = new no();
            float f = (float) (-this.f24666c.getHeight());
            if (z) {
                int[] iArr = new int[]{0, 0};
                this.f24666c.getLocationInWindow(iArr);
                f -= (float) iArr[1];
            }
            ju c = jd.r(this.f24666c).m31860c(f);
            c.m31856a(this.f24681r);
            noVar.m33004a(c);
            if (this.f24674k && this.f24669f != null) {
                noVar.m33004a(jd.r(this.f24669f).m31860c(f));
            }
            noVar.m33003a(f24652t);
            noVar.m33002a(250);
            noVar.m33006a(this.f24679p);
            this.f24677n = noVar;
            noVar.m33007a();
            return;
        }
        this.f24679p.mo3878b(null);
    }

    /* renamed from: b */
    public boolean m32910b() {
        int k = m32926k();
        return this.f24662H && (k == 0 || m32914d() < k);
    }

    /* renamed from: j */
    public void m32925j(boolean z) {
        if (z) {
            m32896p();
        } else {
            m32897q();
        }
        if (m32898r()) {
            ju a;
            ju a2;
            if (z) {
                a = this.f24667d.mo5453a(4, 100);
                a2 = this.f24668e.a(0, 200);
            } else {
                a2 = this.f24667d.mo5453a(0, 200);
                a = this.f24668e.a(8, 100);
            }
            no noVar = new no();
            noVar.m33005a(a, a2);
            noVar.m33007a();
        } else if (z) {
            this.f24667d.mo5471e(4);
            this.f24668e.setVisibility(0);
        } else {
            this.f24667d.mo5471e(0);
            this.f24668e.setVisibility(8);
        }
    }

    /* renamed from: r */
    private boolean m32898r() {
        return jd.H(this.f24666c);
    }

    /* renamed from: c */
    public Context m32911c() {
        if (this.f24682w == null) {
            TypedValue typedValue = new TypedValue();
            this.f24664a.getTheme().resolveAttribute(C5568a.actionBarWidgetTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.f24682w = new ContextThemeWrapper(this.f24664a, i);
            } else {
                this.f24682w = this.f24664a;
            }
        }
        return this.f24682w;
    }

    /* renamed from: b */
    public void m32907b(int i) {
        this.f24667d.mo5469d(i);
    }

    /* renamed from: n */
    public void m32929n() {
        if (this.f24677n != null) {
            this.f24677n.m33009c();
            this.f24677n = null;
        }
    }

    /* renamed from: o */
    public void m32930o() {
    }

    /* renamed from: f */
    public boolean m32918f() {
        if (this.f24667d == null || !this.f24667d.mo5467c()) {
            return false;
        }
        this.f24667d.mo5468d();
        return true;
    }

    /* renamed from: c */
    public void m32913c(boolean z) {
        if (!this.f24656B) {
            m32917f(z);
        }
    }
}
