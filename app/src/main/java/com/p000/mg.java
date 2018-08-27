package com.p000;

import android.support.v4.widget.DrawerLayout.C0482f;
import android.view.View;

/* compiled from: ActionBarDrawerToggle */
/* renamed from: mg */
public class mg implements C0482f {
    /* renamed from: a */
    boolean f24488a;
    /* renamed from: b */
    private final C5529a f24489b;
    /* renamed from: c */
    private nd f24490c;
    /* renamed from: d */
    private boolean f24491d;
    /* renamed from: e */
    private final int f24492e;
    /* renamed from: f */
    private final int f24493f;

    /* compiled from: ActionBarDrawerToggle */
    /* renamed from: mg$a */
    public interface C5529a {
        /* renamed from: a */
        void mo5172a(int i);
    }

    /* renamed from: a */
    public void m32619a(View view, float f) {
        if (this.f24491d) {
            m32616a(Math.min(1.0f, Math.max(0.0f, f)));
        } else {
            m32616a(0.0f);
        }
    }

    /* renamed from: a */
    public void m32618a(View view) {
        m32616a(1.0f);
        if (this.f24488a) {
            m32620b(this.f24493f);
        }
    }

    /* renamed from: b */
    public void m32621b(View view) {
        m32616a(0.0f);
        if (this.f24488a) {
            m32620b(this.f24492e);
        }
    }

    /* renamed from: a */
    public void m32617a(int i) {
    }

    /* renamed from: b */
    void m32620b(int i) {
        this.f24489b.mo5172a(i);
    }

    /* renamed from: a */
    private void m32616a(float f) {
        if (f == 1.0f) {
            this.f24490c.m32950a(true);
        } else if (f == 0.0f) {
            this.f24490c.m32950a(false);
        }
        this.f24490c.m32949a(f);
    }
}
