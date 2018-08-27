package com.p000;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.ActionMenuPresenter;
import android.support.v7.widget.ScrollingTabContainerView;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.Window.Callback;
import p000.mx.C5568a;
import p000.mx.C5572e;
import p000.mx.C5573f;
import p000.mx.C5575h;
import p000.mx.C5577j;
import p000.nx.C5537a;
import p000.oe.C5548a;

/* compiled from: ToolbarWidgetWrapper */
/* renamed from: qg */
public class qg implements pg {
    /* renamed from: a */
    Toolbar f25208a;
    /* renamed from: b */
    CharSequence f25209b;
    /* renamed from: c */
    Callback f25210c;
    /* renamed from: d */
    boolean f25211d;
    /* renamed from: e */
    private int f25212e;
    /* renamed from: f */
    private View f25213f;
    /* renamed from: g */
    private View f25214g;
    /* renamed from: h */
    private Drawable f25215h;
    /* renamed from: i */
    private Drawable f25216i;
    /* renamed from: j */
    private Drawable f25217j;
    /* renamed from: k */
    private boolean f25218k;
    /* renamed from: l */
    private CharSequence f25219l;
    /* renamed from: m */
    private CharSequence f25220m;
    /* renamed from: n */
    private ActionMenuPresenter f25221n;
    /* renamed from: o */
    private int f25222o;
    /* renamed from: p */
    private int f25223p;
    /* renamed from: q */
    private Drawable f25224q;

    /* compiled from: ToolbarWidgetWrapper */
    /* renamed from: qg$1 */
    class C56841 implements OnClickListener {
        /* renamed from: a */
        final nq f25203a = new nq(this.f25204b.f25208a.getContext(), 0, 16908332, 0, 0, this.f25204b.f25209b);
        /* renamed from: b */
        final /* synthetic */ qg f25204b;

        C56841(qg qgVar) {
            this.f25204b = qgVar;
        }

        public void onClick(View view) {
            if (this.f25204b.f25210c != null && this.f25204b.f25211d) {
                this.f25204b.f25210c.onMenuItemSelected(0, this.f25203a);
            }
        }
    }

    public qg(Toolbar toolbar, boolean z) {
        this(toolbar, z, C5575h.abc_action_bar_up_description, C5572e.abc_ic_ab_back_material);
    }

    public qg(Toolbar toolbar, boolean z, int i, int i2) {
        this.f25222o = 0;
        this.f25223p = 0;
        this.f25208a = toolbar;
        this.f25209b = toolbar.getTitle();
        this.f25219l = toolbar.getSubtitle();
        this.f25218k = this.f25209b != null;
        this.f25217j = toolbar.getNavigationIcon();
        qf a = qf.m33777a(toolbar.getContext(), null, C5577j.ActionBar, C5568a.actionBarStyle, 0);
        this.f25224q = a.m33780a(C5577j.ActionBar_homeAsUpIndicator);
        if (z) {
            CharSequence c = a.m33786c(C5577j.ActionBar_title);
            if (!TextUtils.isEmpty(c)) {
                mo5464b(c);
            }
            c = a.m33786c(C5577j.ActionBar_subtitle);
            if (!TextUtils.isEmpty(c)) {
                m33821c(c);
            }
            Drawable a2 = a.m33780a(C5577j.ActionBar_logo);
            if (a2 != null) {
                m33816b(a2);
            }
            a2 = a.m33780a(C5577j.ActionBar_icon);
            if (a2 != null) {
                mo5455a(a2);
            }
            if (this.f25217j == null && this.f25224q != null) {
                m33820c(this.f25224q);
            }
            mo5466c(a.m33779a(C5577j.ActionBar_displayOptions, 0));
            int g = a.m33793g(C5577j.ActionBar_customNavigationLayout, 0);
            if (g != 0) {
                m33809a(LayoutInflater.from(this.f25208a.getContext()).inflate(g, this.f25208a, false));
                mo5466c(this.f25212e | 16);
            }
            g = a.m33791f(C5577j.ActionBar_height, 0);
            if (g > 0) {
                LayoutParams layoutParams = this.f25208a.getLayoutParams();
                layoutParams.height = g;
                this.f25208a.setLayoutParams(layoutParams);
            }
            g = a.m33787d(C5577j.ActionBar_contentInsetStart, -1);
            int d = a.m33787d(C5577j.ActionBar_contentInsetEnd, -1);
            if (g >= 0 || d >= 0) {
                this.f25208a.setContentInsetsRelative(Math.max(g, 0), Math.max(d, 0));
            }
            g = a.m33793g(C5577j.ActionBar_titleTextStyle, 0);
            if (g != 0) {
                this.f25208a.setTitleTextAppearance(this.f25208a.getContext(), g);
            }
            g = a.m33793g(C5577j.ActionBar_subtitleTextStyle, 0);
            if (g != 0) {
                this.f25208a.setSubtitleTextAppearance(this.f25208a.getContext(), g);
            }
            int g2 = a.m33793g(C5577j.ActionBar_popupTheme, 0);
            if (g2 != 0) {
                this.f25208a.setPopupTheme(g2);
            }
        } else {
            this.f25212e = m33799s();
        }
        a.m33781a();
        m33829f(i);
        this.f25220m = this.f25208a.getNavigationContentDescription();
        this.f25208a.setNavigationOnClickListener(new C56841(this));
    }

    /* renamed from: f */
    public void m33829f(int i) {
        if (i != this.f25223p) {
            this.f25223p = i;
            if (TextUtils.isEmpty(this.f25208a.getNavigationContentDescription())) {
                mo5469d(this.f25223p);
            }
        }
    }

    /* renamed from: s */
    private int m33799s() {
        if (this.f25208a.getNavigationIcon() == null) {
            return 11;
        }
        this.f25224q = this.f25208a.getNavigationIcon();
        return 15;
    }

    /* renamed from: a */
    public ViewGroup mo5452a() {
        return this.f25208a;
    }

    /* renamed from: b */
    public Context mo5462b() {
        return this.f25208a.getContext();
    }

    /* renamed from: c */
    public boolean mo5467c() {
        return this.f25208a.g();
    }

    /* renamed from: d */
    public void mo5468d() {
        this.f25208a.h();
    }

    /* renamed from: a */
    public void mo5458a(Callback callback) {
        this.f25210c = callback;
    }

    /* renamed from: a */
    public void mo5459a(CharSequence charSequence) {
        if (!this.f25218k) {
            m33798e(charSequence);
        }
    }

    /* renamed from: e */
    public CharSequence mo5470e() {
        return this.f25208a.getTitle();
    }

    /* renamed from: b */
    public void mo5464b(CharSequence charSequence) {
        this.f25218k = true;
        m33798e(charSequence);
    }

    /* renamed from: e */
    private void m33798e(CharSequence charSequence) {
        this.f25209b = charSequence;
        if ((this.f25212e & 8) != 0) {
            this.f25208a.setTitle(charSequence);
        }
    }

    /* renamed from: c */
    public void m33821c(CharSequence charSequence) {
        this.f25219l = charSequence;
        if ((this.f25212e & 8) != 0) {
            this.f25208a.setSubtitle(charSequence);
        }
    }

    /* renamed from: f */
    public void mo5472f() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    /* renamed from: g */
    public void mo5473g() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    /* renamed from: a */
    public void mo5454a(int i) {
        mo5455a(i != 0 ? na.m32939b(mo5462b(), i) : null);
    }

    /* renamed from: a */
    public void mo5455a(Drawable drawable) {
        this.f25215h = drawable;
        m33800t();
    }

    /* renamed from: b */
    public void mo5463b(int i) {
        m33816b(i != 0 ? na.m32939b(mo5462b(), i) : null);
    }

    /* renamed from: b */
    public void m33816b(Drawable drawable) {
        this.f25216i = drawable;
        m33800t();
    }

    /* renamed from: t */
    private void m33800t() {
        Drawable drawable = null;
        if ((this.f25212e & 2) != 0) {
            drawable = (this.f25212e & 1) != 0 ? this.f25216i != null ? this.f25216i : this.f25215h : this.f25215h;
        }
        this.f25208a.setLogo(drawable);
    }

    /* renamed from: h */
    public boolean mo5474h() {
        return this.f25208a.a();
    }

    /* renamed from: i */
    public boolean mo5475i() {
        return this.f25208a.b();
    }

    /* renamed from: j */
    public boolean mo5476j() {
        return this.f25208a.c();
    }

    /* renamed from: k */
    public boolean mo5477k() {
        return this.f25208a.d();
    }

    /* renamed from: l */
    public boolean mo5478l() {
        return this.f25208a.e();
    }

    /* renamed from: m */
    public void mo5479m() {
        this.f25211d = true;
    }

    /* renamed from: a */
    public void mo5457a(Menu menu, C5548a c5548a) {
        if (this.f25221n == null) {
            this.f25221n = new ActionMenuPresenter(this.f25208a.getContext());
            this.f25221n.a(C5573f.action_menu_presenter);
        }
        this.f25221n.a(c5548a);
        this.f25208a.setMenu((nx) menu, this.f25221n);
    }

    /* renamed from: n */
    public void mo5480n() {
        this.f25208a.f();
    }

    /* renamed from: o */
    public int mo5481o() {
        return this.f25212e;
    }

    /* renamed from: c */
    public void mo5466c(int i) {
        int i2 = this.f25212e ^ i;
        this.f25212e = i;
        if (i2 != 0) {
            if ((i2 & 4) != 0) {
                if ((i & 4) != 0) {
                    m33802v();
                }
                m33801u();
            }
            if ((i2 & 3) != 0) {
                m33800t();
            }
            if ((i2 & 8) != 0) {
                if ((i & 8) != 0) {
                    this.f25208a.setTitle(this.f25209b);
                    this.f25208a.setSubtitle(this.f25219l);
                } else {
                    this.f25208a.setTitle(null);
                    this.f25208a.setSubtitle(null);
                }
            }
            if ((i2 & 16) != 0 && this.f25214g != null) {
                if ((i & 16) != 0) {
                    this.f25208a.addView(this.f25214g);
                } else {
                    this.f25208a.removeView(this.f25214g);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo5456a(ScrollingTabContainerView scrollingTabContainerView) {
        if (this.f25213f != null && this.f25213f.getParent() == this.f25208a) {
            this.f25208a.removeView(this.f25213f);
        }
        this.f25213f = scrollingTabContainerView;
        if (scrollingTabContainerView != null && this.f25222o == 2) {
            this.f25208a.addView(this.f25213f, 0);
            Toolbar.LayoutParams layoutParams = (Toolbar.LayoutParams) this.f25213f.getLayoutParams();
            layoutParams.width = -2;
            layoutParams.height = -2;
            layoutParams.a = 8388691;
            scrollingTabContainerView.setAllowCollapse(true);
        }
    }

    /* renamed from: a */
    public void mo5461a(boolean z) {
        this.f25208a.setCollapsible(z);
    }

    /* renamed from: b */
    public void mo5465b(boolean z) {
    }

    /* renamed from: p */
    public int mo5482p() {
        return this.f25222o;
    }

    /* renamed from: a */
    public void m33809a(View view) {
        if (!(this.f25214g == null || (this.f25212e & 16) == 0)) {
            this.f25208a.removeView(this.f25214g);
        }
        this.f25214g = view;
        if (view != null && (this.f25212e & 16) != 0) {
            this.f25208a.addView(this.f25214g);
        }
    }

    /* renamed from: a */
    public ju mo5453a(final int i, long j) {
        return jd.r(this.f25208a).m31852a(i == 0 ? 1.0f : 0.0f).m31853a(j).m31855a(new jz(this) {
            /* renamed from: b */
            final /* synthetic */ qg f25206b;
            /* renamed from: c */
            private boolean f25207c = false;

            /* renamed from: a */
            public void mo3877a(View view) {
                this.f25206b.f25208a.setVisibility(0);
            }

            /* renamed from: b */
            public void mo3878b(View view) {
                if (!this.f25207c) {
                    this.f25206b.f25208a.setVisibility(i);
                }
            }

            /* renamed from: c */
            public void mo3879c(View view) {
                this.f25207c = true;
            }
        });
    }

    /* renamed from: c */
    public void m33820c(Drawable drawable) {
        this.f25217j = drawable;
        m33801u();
    }

    /* renamed from: u */
    private void m33801u() {
        if ((this.f25212e & 4) != 0) {
            this.f25208a.setNavigationIcon(this.f25217j != null ? this.f25217j : this.f25224q);
        } else {
            this.f25208a.setNavigationIcon(null);
        }
    }

    /* renamed from: d */
    public void m33825d(CharSequence charSequence) {
        this.f25220m = charSequence;
        m33802v();
    }

    /* renamed from: d */
    public void mo5469d(int i) {
        m33825d(i == 0 ? null : mo5462b().getString(i));
    }

    /* renamed from: v */
    private void m33802v() {
        if ((this.f25212e & 4) == 0) {
            return;
        }
        if (TextUtils.isEmpty(this.f25220m)) {
            this.f25208a.setNavigationContentDescription(this.f25223p);
        } else {
            this.f25208a.setNavigationContentDescription(this.f25220m);
        }
    }

    /* renamed from: e */
    public void mo5471e(int i) {
        this.f25208a.setVisibility(i);
    }

    /* renamed from: q */
    public int mo5483q() {
        return this.f25208a.getVisibility();
    }

    /* renamed from: a */
    public void mo5460a(C5548a c5548a, C5537a c5537a) {
        this.f25208a.setMenuCallbacks(c5548a, c5537a);
    }

    /* renamed from: r */
    public Menu mo5484r() {
        return this.f25208a.getMenu();
    }
}
