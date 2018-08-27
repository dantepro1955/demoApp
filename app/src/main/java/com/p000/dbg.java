package com.p000;

import android.app.Activity;
import android.content.Context;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnKeyListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import p000.dbt.C4782d;
import p000.dbt.C4783e;

/* compiled from: DialogPlus */
/* renamed from: dbg */
public class dbg {
    /* renamed from: a */
    private final ViewGroup f21047a;
    /* renamed from: b */
    private final ViewGroup f21048b;
    /* renamed from: c */
    private final boolean f21049c;
    /* renamed from: d */
    private boolean f21050d;
    /* renamed from: e */
    private final dbs f21051e;
    /* renamed from: f */
    private final dbp f21052f;
    /* renamed from: g */
    private final dbq f21053g;
    /* renamed from: h */
    private final dbo f21054h;
    /* renamed from: i */
    private final dbn f21055i;
    /* renamed from: j */
    private final dbk f21056j;
    /* renamed from: k */
    private final ViewGroup f21057k;
    /* renamed from: l */
    private final Animation f21058l;
    /* renamed from: m */
    private final Animation f21059m;
    /* renamed from: n */
    private final OnTouchListener f21060n = new C47745(this);

    /* compiled from: DialogPlus */
    /* renamed from: dbg$1 */
    class C47701 implements AnimationListener {
        /* renamed from: a */
        final /* synthetic */ dbg f21042a;

        /* compiled from: DialogPlus */
        /* renamed from: dbg$1$1 */
        class C47691 implements Runnable {
            /* renamed from: a */
            final /* synthetic */ C47701 f21041a;

            C47691(C47701 c47701) {
                this.f21041a = c47701;
            }

            public void run() {
                this.f21041a.f21042a.f21057k.removeView(this.f21041a.f21042a.f21047a);
                this.f21041a.f21042a.f21050d = false;
                if (this.f21041a.f21042a.f21053g != null) {
                    this.f21041a.f21042a.f21053g.mo4156b(this.f21041a.f21042a);
                }
            }
        }

        C47701(dbg dbg) {
            this.f21042a = dbg;
        }

        public void onAnimationStart(Animation animation) {
        }

        public void onAnimationEnd(Animation animation) {
            this.f21042a.f21057k.post(new C47691(this));
        }

        public void onAnimationRepeat(Animation animation) {
        }
    }

    /* compiled from: DialogPlus */
    /* renamed from: dbg$2 */
    class C47712 implements dbr {
        /* renamed from: a */
        final /* synthetic */ dbg f21043a;

        C47712(dbg dbg) {
            this.f21043a = dbg;
        }

        /* renamed from: a */
        public void mo4306a(Object obj, View view, int i) {
            if (this.f21043a.f21051e != null) {
                this.f21043a.f21051e.m26289a(this.f21043a, obj, view, i);
            }
        }
    }

    /* compiled from: DialogPlus */
    /* renamed from: dbg$3 */
    class C47723 implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ dbg f21044a;

        C47723(dbg dbg) {
            this.f21044a = dbg;
        }

        public void onClick(View view) {
            if (this.f21044a.f21052f != null) {
                this.f21044a.f21052f.mo4155a(this.f21044a, view);
            }
        }
    }

    /* compiled from: DialogPlus */
    /* renamed from: dbg$4 */
    class C47734 implements OnKeyListener {
        /* renamed from: a */
        final /* synthetic */ dbg f21045a;

        C47734(dbg dbg) {
            this.f21045a = dbg;
        }

        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            switch (keyEvent.getAction()) {
                case 1:
                    if (i == 4) {
                        if (this.f21045a.f21055i != null) {
                            this.f21045a.f21055i.m26288a(this.f21045a);
                        }
                        if (this.f21045a.f21049c) {
                            this.f21045a.m26233a(this.f21045a);
                        }
                        return true;
                    }
                    break;
            }
            return false;
        }
    }

    /* compiled from: DialogPlus */
    /* renamed from: dbg$5 */
    class C47745 implements OnTouchListener {
        /* renamed from: a */
        final /* synthetic */ dbg f21046a;

        C47745(dbg dbg) {
            this.f21046a = dbg;
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0) {
                if (this.f21046a.f21054h != null) {
                    this.f21046a.f21054h.mo4154a(this.f21046a);
                }
                this.f21046a.m26235c();
            }
            return false;
        }
    }

    dbg(dbh dbh) {
        LayoutInflater from = LayoutInflater.from(dbh.m26248f());
        Activity activity = (Activity) dbh.m26248f();
        this.f21056j = dbh.m26247e();
        this.f21051e = dbh.m26256n();
        this.f21052f = dbh.m26257o();
        this.f21053g = dbh.m26258p();
        this.f21054h = dbh.m26259q();
        this.f21055i = dbh.m26260r();
        this.f21049c = dbh.m26255m();
        this.f21057k = dbh.m26246d() == null ? (ViewGroup) activity.getWindow().getDecorView().findViewById(16908290) : dbh.m26246d();
        this.f21047a = (ViewGroup) from.inflate(C4783e.base_container, this.f21057k, false);
        this.f21047a.setLayoutParams(dbh.m26254l());
        this.f21047a.findViewById(C4782d.dialogplus_outmost_container).setBackgroundResource(dbh.m26264v());
        this.f21048b = (ViewGroup) this.f21047a.findViewById(C4782d.dialogplus_content_container);
        this.f21048b.setLayoutParams(dbh.m26252j());
        this.f21058l = dbh.m26251i();
        this.f21059m = dbh.m26250h();
        m26218a(from, dbh.m26245c(), dbh.m26244b(), dbh.m26249g(), dbh.m26262t(), dbh.m26261s());
        m26227e();
        if (dbh.m26253k()) {
            m26217a(activity, dbh.m26263u(), dbh.m26252j().gravity);
        }
    }

    /* renamed from: a */
    public static dbh m26216a(Context context) {
        return new dbh(context);
    }

    /* renamed from: a */
    public void m26232a() {
        if (!m26234b()) {
            m26224c(this.f21047a);
        }
    }

    /* renamed from: b */
    public boolean m26234b() {
        return this.f21057k.findViewById(C4782d.dialogplus_outmost_container) != null;
    }

    /* renamed from: c */
    public void m26235c() {
        if (!this.f21050d) {
            this.f21058l.setAnimationListener(new C47701(this));
            this.f21048b.startAnimation(this.f21058l);
            this.f21050d = true;
        }
    }

    /* renamed from: d */
    public View m26236d() {
        return this.f21056j.mo4308a();
    }

    /* renamed from: a */
    private void m26217a(Activity activity, int i, int i2) {
        int i3;
        int height = activity.getWindowManager().getDefaultDisplay().getHeight() - dbv.m26291a((Context) activity);
        if (i == 0) {
            i3 = (height * 2) / 5;
        } else {
            i3 = i;
        }
        View a = this.f21056j.mo4308a();
        if (a instanceof AbsListView) {
            a.setOnTouchListener(dbi.m26266a(activity, (AbsListView) a, this.f21048b, i2, height, i3));
        }
    }

    /* renamed from: a */
    private void m26218a(LayoutInflater layoutInflater, View view, View view2, BaseAdapter baseAdapter, int[] iArr, int[] iArr2) {
        View a = m26215a(layoutInflater, view, view2, baseAdapter);
        LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.setMargins(iArr2[0], iArr2[1], iArr2[2], iArr2[3]);
        a.setLayoutParams(layoutParams);
        m26236d().setPadding(iArr[0], iArr[1], iArr[2], iArr[3]);
        this.f21048b.addView(a);
    }

    /* renamed from: e */
    private void m26227e() {
        if (this.f21049c) {
            this.f21047a.findViewById(C4782d.dialogplus_outmost_container).setOnTouchListener(this.f21060n);
        }
    }

    /* renamed from: a */
    private View m26215a(LayoutInflater layoutInflater, View view, View view2, BaseAdapter baseAdapter) {
        View a = this.f21056j.mo4309a(layoutInflater, this.f21047a);
        if (this.f21056j instanceof dbw) {
            m26219a(a);
        }
        m26219a(view);
        this.f21056j.mo4312a(view);
        m26219a(view2);
        this.f21056j.mo4315b(view2);
        if (baseAdapter != null && (this.f21056j instanceof dbl)) {
            dbl dbl = (dbl) this.f21056j;
            dbl.mo4313a(baseAdapter);
            dbl.mo4314a(new C47712(this));
        }
        return a;
    }

    /* renamed from: a */
    private void m26219a(View view) {
        if (view != null) {
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                    m26219a(viewGroup.getChildAt(childCount));
                }
            }
            m26222b(view);
        }
    }

    /* renamed from: b */
    private void m26222b(View view) {
        if (view.getId() != -1 && !(view instanceof AdapterView)) {
            view.setOnClickListener(new C47723(this));
        }
    }

    /* renamed from: c */
    private void m26224c(View view) {
        this.f21057k.addView(view);
        this.f21048b.startAnimation(this.f21059m);
        this.f21048b.requestFocus();
        this.f21056j.mo4311a(new C47734(this));
    }

    /* renamed from: a */
    public void m26233a(dbg dbg) {
        if (this.f21054h != null) {
            this.f21054h.mo4154a(this);
        }
        m26235c();
    }
}
