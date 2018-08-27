package com.p000;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import p000.oe.C5548a;
import p000.of.C5601a;

/* compiled from: BaseMenuPresenter */
/* renamed from: nr */
public abstract class nr implements oe {
    /* renamed from: a */
    protected Context f24782a;
    /* renamed from: b */
    protected Context f24783b;
    /* renamed from: c */
    protected nx f24784c;
    /* renamed from: d */
    protected LayoutInflater f24785d;
    /* renamed from: e */
    protected LayoutInflater f24786e;
    /* renamed from: f */
    protected of f24787f;
    /* renamed from: g */
    private C5548a f24788g;
    /* renamed from: h */
    private int f24789h;
    /* renamed from: i */
    private int f24790i;
    /* renamed from: j */
    private int f24791j;

    /* renamed from: a */
    public abstract void m33033a(nz nzVar, C5601a c5601a);

    public nr(Context context, int i, int i2) {
        this.f24782a = context;
        this.f24785d = LayoutInflater.from(context);
        this.f24789h = i;
        this.f24790i = i2;
    }

    /* renamed from: a */
    public void mo5254a(Context context, nx nxVar) {
        this.f24783b = context;
        this.f24786e = LayoutInflater.from(this.f24783b);
        this.f24784c = nxVar;
    }

    /* renamed from: a */
    public of m33028a(ViewGroup viewGroup) {
        if (this.f24787f == null) {
            this.f24787f = (of) this.f24785d.inflate(this.f24789h, viewGroup, false);
            this.f24787f.m33223a(this.f24784c);
            mo5257a(true);
        }
        return this.f24787f;
    }

    /* renamed from: a */
    public void mo5257a(boolean z) {
        ViewGroup viewGroup = (ViewGroup) this.f24787f;
        if (viewGroup != null) {
            int i;
            if (this.f24784c != null) {
                this.f24784c.m33176j();
                ArrayList i2 = this.f24784c.m33175i();
                int size = i2.size();
                int i3 = 0;
                i = 0;
                while (i3 < size) {
                    int i4;
                    nz nzVar = (nz) i2.get(i3);
                    if (m33037a(i, nzVar)) {
                        View childAt = viewGroup.getChildAt(i);
                        nz itemData = childAt instanceof C5601a ? ((C5601a) childAt).getItemData() : null;
                        View a = m33027a(nzVar, childAt, viewGroup);
                        if (nzVar != itemData) {
                            a.setPressed(false);
                            jd.A(a);
                        }
                        if (a != childAt) {
                            m33031a(a, i);
                        }
                        i4 = i + 1;
                    } else {
                        i4 = i;
                    }
                    i3++;
                    i = i4;
                }
            } else {
                i = 0;
            }
            while (i < viewGroup.getChildCount()) {
                if (!m33038a(viewGroup, i)) {
                    i++;
                }
            }
        }
    }

    /* renamed from: a */
    protected void m33031a(View view, int i) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        ((ViewGroup) this.f24787f).addView(view, i);
    }

    /* renamed from: a */
    public boolean m33038a(ViewGroup viewGroup, int i) {
        viewGroup.removeViewAt(i);
        return true;
    }

    /* renamed from: a */
    public void mo5256a(C5548a c5548a) {
        this.f24788g = c5548a;
    }

    /* renamed from: d */
    public C5548a m33044d() {
        return this.f24788g;
    }

    /* renamed from: b */
    public C5601a m33042b(ViewGroup viewGroup) {
        return (C5601a) this.f24785d.inflate(this.f24790i, viewGroup, false);
    }

    /* renamed from: a */
    public View m33027a(nz nzVar, View view, ViewGroup viewGroup) {
        C5601a c5601a;
        if (view instanceof C5601a) {
            c5601a = (C5601a) view;
        } else {
            c5601a = m33042b(viewGroup);
        }
        m33033a(nzVar, c5601a);
        return (View) c5601a;
    }

    /* renamed from: a */
    public boolean m33037a(int i, nz nzVar) {
        return true;
    }

    /* renamed from: a */
    public void mo5255a(nx nxVar, boolean z) {
        if (this.f24788g != null) {
            this.f24788g.mo5221a(nxVar, z);
        }
    }

    /* renamed from: a */
    public boolean mo5260a(ok okVar) {
        if (this.f24788g != null) {
            return this.f24788g.mo5222a(okVar);
        }
        return false;
    }

    /* renamed from: a */
    public boolean mo5258a() {
        return false;
    }

    /* renamed from: a */
    public boolean mo5259a(nx nxVar, nz nzVar) {
        return false;
    }

    /* renamed from: b */
    public boolean mo5262b(nx nxVar, nz nzVar) {
        return false;
    }

    /* renamed from: b */
    public int mo5261b() {
        return this.f24791j;
    }

    /* renamed from: a */
    public void m33029a(int i) {
        this.f24791j = i;
    }
}
