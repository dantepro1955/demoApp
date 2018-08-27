package com.p000;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.BaseAdapter;
import android.widget.FrameLayout.LayoutParams;
import java.util.Arrays;
import p000.dbt.C4780b;
import p000.dbt.C4781c;

/* compiled from: DialogPlusBuilder */
/* renamed from: dbh */
public class dbh {
    /* renamed from: a */
    private final int[] f21061a;
    /* renamed from: b */
    private final int[] f21062b;
    /* renamed from: c */
    private final int[] f21063c;
    /* renamed from: d */
    private final LayoutParams f21064d;
    /* renamed from: e */
    private BaseAdapter f21065e;
    /* renamed from: f */
    private Context f21066f;
    /* renamed from: g */
    private View f21067g;
    /* renamed from: h */
    private View f21068h;
    /* renamed from: i */
    private ViewGroup f21069i;
    /* renamed from: j */
    private dbk f21070j;
    /* renamed from: k */
    private int f21071k;
    /* renamed from: l */
    private dbs f21072l;
    /* renamed from: m */
    private dbp f21073m;
    /* renamed from: n */
    private dbq f21074n;
    /* renamed from: o */
    private dbo f21075o;
    /* renamed from: p */
    private dbn f21076p;
    /* renamed from: q */
    private boolean f21077q;
    /* renamed from: r */
    private int f21078r;
    /* renamed from: s */
    private int f21079s;
    /* renamed from: t */
    private int f21080t;
    /* renamed from: u */
    private int f21081u;
    /* renamed from: v */
    private int f21082v;
    /* renamed from: w */
    private boolean f21083w;
    /* renamed from: x */
    private int f21084x;
    /* renamed from: y */
    private int f21085y;

    private dbh() {
        this.f21061a = new int[4];
        this.f21062b = new int[4];
        this.f21063c = new int[4];
        this.f21064d = new LayoutParams(-1, -2, 80);
        this.f21071k = 80;
        this.f21077q = true;
        this.f21078r = 17170443;
        this.f21079s = -1;
        this.f21080t = -1;
        this.f21081u = -1;
        this.f21082v = -1;
        this.f21085y = C4780b.dialogplus_black_overlay;
    }

    dbh(Context context) {
        this.f21061a = new int[4];
        this.f21062b = new int[4];
        this.f21063c = new int[4];
        this.f21064d = new LayoutParams(-1, -2, 80);
        this.f21071k = 80;
        this.f21077q = true;
        this.f21078r = 17170443;
        this.f21079s = -1;
        this.f21080t = -1;
        this.f21081u = -1;
        this.f21082v = -1;
        this.f21085y = C4780b.dialogplus_black_overlay;
        if (context == null) {
            throw new NullPointerException("Context may not be null");
        }
        this.f21066f = context;
        Arrays.fill(this.f21061a, -1);
    }

    /* renamed from: a */
    public dbh m26240a(dbk dbk) {
        this.f21070j = dbk;
        return this;
    }

    /* renamed from: a */
    public dbh m26239a(int i) {
        this.f21071k = i;
        this.f21064d.gravity = i;
        return this;
    }

    /* renamed from: a */
    public dbh m26242a(dbp dbp) {
        this.f21073m = dbp;
        return this;
    }

    /* renamed from: a */
    public dbh m26243a(dbq dbq) {
        this.f21074n = dbq;
        return this;
    }

    /* renamed from: a */
    public dbh m26241a(dbo dbo) {
        this.f21075o = dbo;
        return this;
    }

    /* renamed from: a */
    public dbg m26238a() {
        m26247e().mo4310a(m26265w());
        return new dbg(this);
    }

    /* renamed from: b */
    public View m26244b() {
        return dbv.m26292a(this.f21066f, this.f21080t, this.f21067g);
    }

    /* renamed from: c */
    public View m26245c() {
        return dbv.m26292a(this.f21066f, this.f21079s, this.f21068h);
    }

    /* renamed from: d */
    public ViewGroup m26246d() {
        return this.f21069i;
    }

    /* renamed from: e */
    public dbk m26247e() {
        if (this.f21070j == null) {
            this.f21070j = new dbm();
        }
        return this.f21070j;
    }

    /* renamed from: f */
    public Context m26248f() {
        return this.f21066f;
    }

    /* renamed from: g */
    public BaseAdapter m26249g() {
        return this.f21065e;
    }

    /* renamed from: h */
    public Animation m26250h() {
        return AnimationUtils.loadAnimation(this.f21066f, this.f21081u == -1 ? dbv.m26290a(this.f21071k, true) : this.f21081u);
    }

    /* renamed from: i */
    public Animation m26251i() {
        return AnimationUtils.loadAnimation(this.f21066f, this.f21082v == -1 ? dbv.m26290a(this.f21071k, false) : this.f21082v);
    }

    /* renamed from: j */
    public LayoutParams m26252j() {
        if (this.f21083w) {
            this.f21064d.height = m26263u();
        }
        return this.f21064d;
    }

    /* renamed from: k */
    public boolean m26253k() {
        return this.f21083w;
    }

    /* renamed from: l */
    public LayoutParams m26254l() {
        LayoutParams layoutParams = new LayoutParams(-1, -1);
        layoutParams.setMargins(this.f21063c[0], this.f21063c[1], this.f21063c[2], this.f21063c[3]);
        return layoutParams;
    }

    /* renamed from: m */
    public boolean m26255m() {
        return this.f21077q;
    }

    /* renamed from: n */
    public dbs m26256n() {
        return this.f21072l;
    }

    /* renamed from: o */
    public dbp m26257o() {
        return this.f21073m;
    }

    /* renamed from: p */
    public dbq m26258p() {
        return this.f21074n;
    }

    /* renamed from: q */
    public dbo m26259q() {
        return this.f21075o;
    }

    /* renamed from: r */
    public dbn m26260r() {
        return this.f21076p;
    }

    /* renamed from: s */
    public int[] m26261s() {
        int dimensionPixelSize = this.f21066f.getResources().getDimensionPixelSize(C4781c.dialogplus_default_center_margin);
        for (int i = 0; i < this.f21061a.length; i++) {
            this.f21061a[i] = m26237a(this.f21071k, this.f21061a[i], dimensionPixelSize);
        }
        return this.f21061a;
    }

    /* renamed from: t */
    public int[] m26262t() {
        return this.f21062b;
    }

    /* renamed from: u */
    public int m26263u() {
        Context context = (Activity) this.f21066f;
        int height = context.getWindowManager().getDefaultDisplay().getHeight() - dbv.m26291a(context);
        if (this.f21084x == 0) {
            this.f21084x = (height * 2) / 5;
        }
        return this.f21084x;
    }

    /* renamed from: v */
    public int m26264v() {
        return this.f21085y;
    }

    /* renamed from: w */
    public int m26265w() {
        return this.f21078r;
    }

    /* renamed from: a */
    private int m26237a(int i, int i2, int i3) {
        switch (i) {
            case 17:
                if (i2 != -1) {
                    return i2;
                }
                return i3;
            default:
                if (i2 == -1) {
                    i2 = 0;
                }
                return i2;
        }
    }
}
