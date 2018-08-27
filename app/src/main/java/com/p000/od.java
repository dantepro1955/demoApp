package com.p000;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow.OnDismissListener;
import p000.mx.C5571d;
import p000.oe.C5548a;

/* compiled from: MenuPopupHelper */
/* renamed from: od */
public class od {
    /* renamed from: a */
    private final Context f24889a;
    /* renamed from: b */
    private final nx f24890b;
    /* renamed from: c */
    private final boolean f24891c;
    /* renamed from: d */
    private final int f24892d;
    /* renamed from: e */
    private final int f24893e;
    /* renamed from: f */
    private View f24894f;
    /* renamed from: g */
    private int f24895g;
    /* renamed from: h */
    private boolean f24896h;
    /* renamed from: i */
    private C5548a f24897i;
    /* renamed from: j */
    private oc f24898j;
    /* renamed from: k */
    private OnDismissListener f24899k;
    /* renamed from: l */
    private final OnDismissListener f24900l;

    /* compiled from: MenuPopupHelper */
    /* renamed from: od$1 */
    class C56001 implements OnDismissListener {
        /* renamed from: a */
        final /* synthetic */ od f24888a;

        C56001(od odVar) {
            this.f24888a = odVar;
        }

        public void onDismiss() {
            this.f24888a.m33219e();
        }
    }

    public od(Context context, nx nxVar, View view, boolean z, int i) {
        this(context, nxVar, view, z, i, 0);
    }

    public od(Context context, nx nxVar, View view, boolean z, int i, int i2) {
        this.f24895g = 8388611;
        this.f24900l = new C56001(this);
        this.f24889a = context;
        this.f24890b = nxVar;
        this.f24894f = view;
        this.f24891c = z;
        this.f24892d = i;
        this.f24893e = i2;
    }

    /* renamed from: a */
    public void m33212a(OnDismissListener onDismissListener) {
        this.f24899k = onDismissListener;
    }

    /* renamed from: a */
    public void m33211a(View view) {
        this.f24894f = view;
    }

    /* renamed from: a */
    public void m33214a(boolean z) {
        this.f24896h = z;
        if (this.f24898j != null) {
            this.f24898j.mo5271b(z);
        }
    }

    /* renamed from: a */
    public void m33210a(int i) {
        this.f24895g = i;
    }

    /* renamed from: a */
    public void m33209a() {
        if (!m33217c()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    /* renamed from: b */
    public oc m33216b() {
        if (this.f24898j == null) {
            this.f24898j = m33208g();
        }
        return this.f24898j;
    }

    /* renamed from: c */
    public boolean m33217c() {
        if (m33220f()) {
            return true;
        }
        if (this.f24894f == null) {
            return false;
        }
        m33207a(0, 0, false, false);
        return true;
    }

    /* renamed from: a */
    public boolean m33215a(int i, int i2) {
        if (m33220f()) {
            return true;
        }
        if (this.f24894f == null) {
            return false;
        }
        m33207a(i, i2, true, true);
        return true;
    }

    /* renamed from: g */
    private oc m33208g() {
        oc nuVar;
        Display defaultDisplay = ((WindowManager) this.f24889a.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        if (VERSION.SDK_INT >= 17) {
            defaultDisplay.getRealSize(point);
        } else if (VERSION.SDK_INT >= 13) {
            defaultDisplay.getSize(point);
        } else {
            point.set(defaultDisplay.getWidth(), defaultDisplay.getHeight());
        }
        if ((Math.min(point.x, point.y) >= this.f24889a.getResources().getDimensionPixelSize(C5571d.abc_cascading_menus_min_smallest_width) ? 1 : null) != null) {
            nuVar = new nu(this.f24889a, this.f24894f, this.f24892d, this.f24893e, this.f24891c);
        } else {
            nuVar = new oj(this.f24889a, this.f24890b, this.f24894f, this.f24892d, this.f24893e, this.f24891c);
        }
        nuVar.mo5269a(this.f24890b);
        nuVar.mo5268a(this.f24900l);
        nuVar.mo5267a(this.f24894f);
        nuVar.mo5256a(this.f24897i);
        nuVar.mo5271b(this.f24896h);
        nuVar.mo5265a(this.f24895g);
        return nuVar;
    }

    /* renamed from: a */
    private void m33207a(int i, int i2, boolean z, boolean z2) {
        oc b = m33216b();
        b.mo5274c(z2);
        if (z) {
            if ((hz.a(this.f24895g, jd.g(this.f24894f)) & 7) == 5) {
                i -= this.f24894f.getWidth();
            }
            b.mo5270b(i);
            b.mo5273c(i2);
            int i3 = (int) ((this.f24889a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            b.m33064a(new Rect(i - i3, i2 - i3, i + i3, i3 + i2));
        }
        b.mo5275d();
    }

    /* renamed from: d */
    public void m33218d() {
        if (m33220f()) {
            this.f24898j.mo5276e();
        }
    }

    /* renamed from: e */
    protected void m33219e() {
        this.f24898j = null;
        if (this.f24899k != null) {
            this.f24899k.onDismiss();
        }
    }

    /* renamed from: f */
    public boolean m33220f() {
        return this.f24898j != null && this.f24898j.mo5277f();
    }

    /* renamed from: a */
    public void m33213a(C5548a c5548a) {
        this.f24897i = c5548a;
        if (this.f24898j != null) {
            this.f24898j.mo5256a(c5548a);
        }
    }
}
