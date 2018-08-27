package com.p000;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcelable;
import android.support.v7.widget.MenuPopupWindow;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnKeyListener;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow.OnDismissListener;
import android.widget.TextView;
import p000.mx.C5571d;
import p000.mx.C5574g;
import p000.oe.C5548a;

/* compiled from: StandardMenuPopup */
/* renamed from: oj */
final class oj extends oc implements OnKeyListener, OnItemClickListener, OnDismissListener, oe {
    /* renamed from: a */
    final MenuPopupWindow f24902a;
    /* renamed from: b */
    View f24903b;
    /* renamed from: c */
    private final Context f24904c;
    /* renamed from: d */
    private final nx f24905d;
    /* renamed from: e */
    private final nw f24906e;
    /* renamed from: f */
    private final boolean f24907f;
    /* renamed from: g */
    private final int f24908g;
    /* renamed from: h */
    private final int f24909h;
    /* renamed from: i */
    private final int f24910i;
    /* renamed from: j */
    private final OnGlobalLayoutListener f24911j = new C56021(this);
    /* renamed from: k */
    private OnDismissListener f24912k;
    /* renamed from: l */
    private View f24913l;
    /* renamed from: m */
    private C5548a f24914m;
    /* renamed from: n */
    private ViewTreeObserver f24915n;
    /* renamed from: o */
    private boolean f24916o;
    /* renamed from: p */
    private boolean f24917p;
    /* renamed from: q */
    private int f24918q;
    /* renamed from: r */
    private int f24919r = 0;
    /* renamed from: s */
    private boolean f24920s;

    /* compiled from: StandardMenuPopup */
    /* renamed from: oj$1 */
    class C56021 implements OnGlobalLayoutListener {
        /* renamed from: a */
        final /* synthetic */ oj f24901a;

        C56021(oj ojVar) {
            this.f24901a = ojVar;
        }

        public void onGlobalLayout() {
            if (this.f24901a.mo5277f() && !this.f24901a.f24902a.c()) {
                View view = this.f24901a.f24903b;
                if (view == null || !view.isShown()) {
                    this.f24901a.mo5276e();
                } else {
                    this.f24901a.f24902a.d();
                }
            }
        }
    }

    public oj(Context context, nx nxVar, View view, int i, int i2, boolean z) {
        this.f24904c = context;
        this.f24905d = nxVar;
        this.f24907f = z;
        this.f24906e = new nw(nxVar, LayoutInflater.from(context), this.f24907f);
        this.f24909h = i;
        this.f24910i = i2;
        Resources resources = context.getResources();
        this.f24908g = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(C5571d.abc_config_prefDialogWidth));
        this.f24913l = view;
        this.f24902a = new MenuPopupWindow(this.f24904c, null, this.f24909h, this.f24910i);
        nxVar.m33150a((oe) this, context);
    }

    /* renamed from: b */
    public void mo5271b(boolean z) {
        this.f24906e.m33123a(z);
    }

    /* renamed from: a */
    public void mo5265a(int i) {
        this.f24919r = i;
    }

    /* renamed from: j */
    private boolean m33227j() {
        if (mo5277f()) {
            return true;
        }
        if (this.f24916o || this.f24913l == null) {
            return false;
        }
        this.f24903b = this.f24913l;
        this.f24902a.a(this);
        this.f24902a.a(this);
        this.f24902a.a(true);
        View view = this.f24903b;
        boolean z = this.f24915n == null;
        this.f24915n = view.getViewTreeObserver();
        if (z) {
            this.f24915n.addOnGlobalLayoutListener(this.f24911j);
        }
        this.f24902a.b(view);
        this.f24902a.e(this.f24919r);
        if (!this.f24917p) {
            this.f24918q = oc.m33059a(this.f24906e, null, this.f24904c, this.f24908g);
            this.f24917p = true;
        }
        this.f24902a.g(this.f24918q);
        this.f24902a.h(2);
        this.f24902a.a(m33076i());
        this.f24902a.d();
        ViewGroup g = this.f24902a.g();
        g.setOnKeyListener(this);
        if (this.f24920s && this.f24905d.m33179m() != null) {
            FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f24904c).inflate(C5574g.abc_popup_menu_header_item_layout, g, false);
            TextView textView = (TextView) frameLayout.findViewById(16908310);
            if (textView != null) {
                textView.setText(this.f24905d.m33179m());
            }
            frameLayout.setEnabled(false);
            g.addHeaderView(frameLayout, null, false);
        }
        this.f24902a.a(this.f24906e);
        this.f24902a.d();
        return true;
    }

    /* renamed from: d */
    public void mo5275d() {
        if (!m33227j()) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    /* renamed from: e */
    public void mo5276e() {
        if (mo5277f()) {
            this.f24902a.e();
        }
    }

    /* renamed from: a */
    public void mo5269a(nx nxVar) {
    }

    /* renamed from: f */
    public boolean mo5277f() {
        return !this.f24916o && this.f24902a.f();
    }

    public void onDismiss() {
        this.f24916o = true;
        this.f24905d.close();
        if (this.f24915n != null) {
            if (!this.f24915n.isAlive()) {
                this.f24915n = this.f24903b.getViewTreeObserver();
            }
            this.f24915n.removeGlobalOnLayoutListener(this.f24911j);
            this.f24915n = null;
        }
        if (this.f24912k != null) {
            this.f24912k.onDismiss();
        }
    }

    /* renamed from: a */
    public void mo5257a(boolean z) {
        this.f24917p = false;
        if (this.f24906e != null) {
            this.f24906e.notifyDataSetChanged();
        }
    }

    /* renamed from: a */
    public void mo5256a(C5548a c5548a) {
        this.f24914m = c5548a;
    }

    /* renamed from: a */
    public boolean mo5260a(ok okVar) {
        if (okVar.hasVisibleItems()) {
            od odVar = new od(this.f24904c, okVar, this.f24903b, this.f24907f, this.f24909h, this.f24910i);
            odVar.m33213a(this.f24914m);
            odVar.m33214a(oc.m33061b((nx) okVar));
            odVar.m33212a(this.f24912k);
            this.f24912k = null;
            this.f24905d.m33159b(false);
            if (odVar.m33215a(this.f24902a.j(), this.f24902a.k())) {
                if (this.f24914m != null) {
                    this.f24914m.mo5222a(okVar);
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public void mo5255a(nx nxVar, boolean z) {
        if (nxVar == this.f24905d) {
            mo5276e();
            if (this.f24914m != null) {
                this.f24914m.mo5221a(nxVar, z);
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
    public void mo5267a(View view) {
        this.f24913l = view;
    }

    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        mo5276e();
        return true;
    }

    /* renamed from: a */
    public void mo5268a(OnDismissListener onDismissListener) {
        this.f24912k = onDismissListener;
    }

    /* renamed from: g */
    public ListView mo5278g() {
        return this.f24902a.g();
    }

    /* renamed from: b */
    public void mo5270b(int i) {
        this.f24902a.c(i);
    }

    /* renamed from: c */
    public void mo5273c(int i) {
        this.f24902a.d(i);
    }

    /* renamed from: c */
    public void mo5274c(boolean z) {
        this.f24920s = z;
    }
}
