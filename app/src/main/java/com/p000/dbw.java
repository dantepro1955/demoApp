package com.p000;

import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnKeyListener;
import android.view.ViewGroup;
import p000.dbt.C4782d;
import p000.dbt.C4783e;

/* compiled from: ViewHolder */
/* renamed from: dbw */
public class dbw implements dbk {
    /* renamed from: a */
    private int f21111a;
    /* renamed from: b */
    private ViewGroup f21112b;
    /* renamed from: c */
    private View f21113c;
    /* renamed from: d */
    private ViewGroup f21114d;
    /* renamed from: e */
    private View f21115e;
    /* renamed from: f */
    private OnKeyListener f21116f;
    /* renamed from: g */
    private View f21117g;
    /* renamed from: h */
    private int f21118h = -1;

    /* compiled from: ViewHolder */
    /* renamed from: dbw$1 */
    class C47841 implements OnKeyListener {
        /* renamed from: a */
        final /* synthetic */ dbw f21110a;

        C47841(dbw dbw) {
            this.f21110a = dbw;
        }

        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            if (this.f21110a.f21116f != null) {
                return this.f21110a.f21116f.onKey(view, i, keyEvent);
            }
            throw new NullPointerException("keyListener should not be null");
        }
    }

    public dbw(View view) {
        this.f21117g = view;
    }

    /* renamed from: a */
    public void mo4312a(View view) {
        if (view != null) {
            this.f21112b.addView(view);
            this.f21113c = view;
        }
    }

    /* renamed from: b */
    public void mo4315b(View view) {
        if (view != null) {
            this.f21114d.addView(view);
            this.f21115e = view;
        }
    }

    /* renamed from: a */
    public void mo4310a(int i) {
        this.f21111a = i;
    }

    /* renamed from: a */
    public View mo4309a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(C4783e.dialog_view, viewGroup, false);
        inflate.findViewById(C4782d.dialogplus_outmost_container).setBackgroundResource(this.f21111a);
        ViewGroup viewGroup2 = (ViewGroup) inflate.findViewById(C4782d.dialogplus_view_container);
        viewGroup2.setOnKeyListener(new C47841(this));
        m26296a(layoutInflater, viewGroup, viewGroup2);
        this.f21112b = (ViewGroup) inflate.findViewById(C4782d.dialogplus_header_container);
        this.f21114d = (ViewGroup) inflate.findViewById(C4782d.dialogplus_footer_container);
        return inflate;
    }

    /* renamed from: a */
    private void m26296a(LayoutInflater layoutInflater, ViewGroup viewGroup, ViewGroup viewGroup2) {
        if (this.f21118h != -1) {
            this.f21117g = layoutInflater.inflate(this.f21118h, viewGroup, false);
        } else {
            ViewGroup viewGroup3 = (ViewGroup) this.f21117g.getParent();
            if (viewGroup3 != null) {
                viewGroup3.removeView(this.f21117g);
            }
        }
        viewGroup2.addView(this.f21117g);
    }

    /* renamed from: a */
    public void mo4311a(OnKeyListener onKeyListener) {
        this.f21116f = onKeyListener;
    }

    /* renamed from: a */
    public View mo4308a() {
        return this.f21117g;
    }
}
