package com.p000;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.support.v7.widget.ActionMenuPresenter;
import android.support.v7.widget.ActionMenuView;
import android.support.v7.widget.LinearLayoutManager;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import p000.mx.C5568a;
import p000.mx.C5577j;

/* compiled from: AbsActionBarView */
/* renamed from: om */
public abstract class om extends ViewGroup {
    /* renamed from: a */
    protected final C5642a f24926a;
    /* renamed from: b */
    protected final Context f24927b;
    /* renamed from: c */
    protected ActionMenuView f24928c;
    /* renamed from: d */
    protected ActionMenuPresenter f24929d;
    /* renamed from: e */
    protected int f24930e;
    /* renamed from: f */
    protected ju f24931f;
    /* renamed from: g */
    private boolean f24932g;
    /* renamed from: h */
    private boolean f24933h;

    /* compiled from: AbsActionBarView */
    /* renamed from: om$a */
    public class C5642a implements jy {
        /* renamed from: a */
        int f24923a;
        /* renamed from: b */
        final /* synthetic */ om f24924b;
        /* renamed from: c */
        private boolean f24925c = false;

        protected C5642a(om omVar) {
            this.f24924b = omVar;
        }

        /* renamed from: a */
        public C5642a m33257a(ju juVar, int i) {
            this.f24924b.f24931f = juVar;
            this.f24923a = i;
            return this;
        }

        /* renamed from: a */
        public void mo3877a(View view) {
            super.setVisibility(0);
            this.f24925c = false;
        }

        /* renamed from: b */
        public void mo3878b(View view) {
            if (!this.f24925c) {
                this.f24924b.f24931f = null;
                super.setVisibility(this.f24923a);
            }
        }

        /* renamed from: c */
        public void mo3879c(View view) {
            this.f24925c = true;
        }
    }

    om(Context context) {
        this(context, null);
    }

    om(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    protected om(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f24926a = new C5642a(this);
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(C5568a.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.f24927b = context;
        } else {
            this.f24927b = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }

    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, C5577j.ActionBar, C5568a.actionBarStyle, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(C5577j.ActionBar_height, 0));
        obtainStyledAttributes.recycle();
        if (this.f24929d != null) {
            this.f24929d.a(configuration);
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int a = io.a(motionEvent);
        if (a == 0) {
            this.f24932g = false;
        }
        if (!this.f24932g) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (a == 0 && !onTouchEvent) {
                this.f24932g = true;
            }
        }
        if (a == 1 || a == 3) {
            this.f24932g = false;
        }
        return true;
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int a = io.a(motionEvent);
        if (a == 9) {
            this.f24933h = false;
        }
        if (!this.f24933h) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (a == 9 && !onHoverEvent) {
                this.f24933h = true;
            }
        }
        if (a == 10 || a == 3) {
            this.f24933h = false;
        }
        return true;
    }

    public void setContentHeight(int i) {
        this.f24930e = i;
        requestLayout();
    }

    public int getContentHeight() {
        return this.f24930e;
    }

    public int getAnimatedVisibility() {
        if (this.f24931f != null) {
            return this.f24926a.f24923a;
        }
        return getVisibility();
    }

    /* renamed from: a */
    public ju m33266a(int i, long j) {
        if (this.f24931f != null) {
            this.f24931f.m31859b();
        }
        if (i == 0) {
            if (getVisibility() != 0) {
                jd.c(this, 0.0f);
            }
            ju a = jd.r(this).m31852a(1.0f);
            a.m31853a(j);
            a.m31855a(this.f24926a.m33257a(a, i));
            return a;
        }
        a = jd.r(this).m31852a(0.0f);
        a.m31853a(j);
        a.m31855a(this.f24926a.m33257a(a, i));
        return a;
    }

    public void setVisibility(int i) {
        if (i != getVisibility()) {
            if (this.f24931f != null) {
                this.f24931f.m31859b();
            }
            super.setVisibility(i);
        }
    }

    /* renamed from: a */
    public boolean m33267a() {
        if (this.f24929d != null) {
            return this.f24929d.f();
        }
        return false;
    }

    /* renamed from: a */
    protected int m33264a(View view, int i, int i2, int i3) {
        view.measure(MeasureSpec.makeMeasureSpec(i, LinearLayoutManager.INVALID_OFFSET), i2);
        return Math.max(0, (i - view.getMeasuredWidth()) - i3);
    }

    /* renamed from: a */
    protected static int m33261a(int i, int i2, boolean z) {
        return z ? i - i2 : i + i2;
    }

    /* renamed from: a */
    protected int m33265a(View view, int i, int i2, int i3, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i4 = ((i3 - measuredHeight) / 2) + i2;
        if (z) {
            view.layout(i - measuredWidth, i4, i, measuredHeight + i4);
        } else {
            view.layout(i, i4, i + measuredWidth, measuredHeight + i4);
        }
        return z ? -measuredWidth : measuredWidth;
    }
}
