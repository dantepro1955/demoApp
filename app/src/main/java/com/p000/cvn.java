package com.p000;

import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.C0370e;
import android.support.v7.widget.RecyclerView.C0605t;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.login.widget.ToolTipPopup;
import com.ninegag.android.app.R;
import com.ninegag.android.tv.ui.CustomRatioLinearLayout;
import java.lang.ref.WeakReference;

/* compiled from: HomeFeaturedPostsRenderer */
/* renamed from: cvn */
public class cvn {
    /* renamed from: a */
    private cvm f20317a;
    /* renamed from: b */
    private C0370e f20318b;
    /* renamed from: c */
    private boolean f20319c = false;
    /* renamed from: d */
    private boolean f20320d = false;
    /* renamed from: e */
    private C4608a f20321e;

    /* compiled from: HomeFeaturedPostsRenderer */
    /* renamed from: cvn$a */
    public static class C4608a implements Runnable {
        /* renamed from: a */
        private WeakReference<cvn> f20311a;
        /* renamed from: b */
        private WeakReference<C4609b> f20312b;
        /* renamed from: c */
        private boolean f20313c = false;

        public C4608a(C4609b c4609b, cvn cvn) {
            this.f20312b = new WeakReference(c4609b);
            this.f20311a = new WeakReference(cvn);
        }

        /* renamed from: a */
        public void m25078a(boolean z) {
            this.f20313c = z;
        }

        public void run() {
            try {
                cvn cvn = (cvn) this.f20311a.get();
                C4609b c4609b = (C4609b) this.f20312b.get();
                if (cvn != null && c4609b != null) {
                    if (!cvn.f20319c) {
                        c4609b.f20314a.postDelayed(this, ToolTipPopup.DEFAULT_POPUP_DISPLAY_TIME);
                    } else if (!this.f20313c) {
                        if (!cvn.f20320d) {
                            int i;
                            int currentItem = c4609b.f20314a.getCurrentItem() + 1;
                            if (currentItem > cvn.f20317a.getCount() - 1) {
                                i = 0;
                            } else {
                                i = currentItem;
                            }
                            c4609b.f20314a.setCurrentItem(i, true);
                        }
                        c4609b.f20314a.postDelayed(this, ToolTipPopup.DEFAULT_POPUP_DISPLAY_TIME);
                    }
                }
            } catch (Exception e) {
            }
        }
    }

    /* compiled from: HomeFeaturedPostsRenderer */
    /* renamed from: cvn$b */
    public static class C4609b extends C0605t {
        /* renamed from: a */
        public ViewPager f20314a;

        public C4609b(View view) {
            super(view);
            this.f20314a = (ViewPager) view.findViewById(R.id.view_pager);
        }
    }

    /* compiled from: HomeFeaturedPostsRenderer */
    /* renamed from: cvn$c */
    static class C4610c implements C0370e {
        /* renamed from: a */
        private WeakReference<cvn> f20315a;
        /* renamed from: b */
        private WeakReference<C0370e> f20316b;

        public C4610c(C0370e c0370e, cvn cvn) {
            this.f20316b = new WeakReference(c0370e);
            this.f20315a = new WeakReference(cvn);
        }

        /* renamed from: a */
        public void m25080a(int i, float f, int i2) {
            C0370e c0370e = (C0370e) this.f20316b.get();
            if (c0370e != null) {
                c0370e.a(i, f, i2);
            }
        }

        /* renamed from: b */
        public void m25081b(int i) {
            C0370e c0370e = (C0370e) this.f20316b.get();
            if (c0370e != null) {
                c0370e.b(i);
            }
        }

        /* renamed from: a */
        public void m25079a(int i) {
            C0370e c0370e = (C0370e) this.f20316b.get();
            cvn cvn = (cvn) this.f20315a.get();
            if (cvn != null) {
                if (i == 1) {
                    cvn.f20320d = true;
                } else {
                    cvn.f20320d = false;
                }
            }
            if (c0370e != null) {
                c0370e.a(i);
            }
        }
    }

    public cvn(cvm cvm, C0370e c0370e) {
        this.f20317a = cvm;
        this.f20318b = c0370e;
    }

    /* renamed from: a */
    public C0605t m25086a(ViewGroup viewGroup, int i) {
        CustomRatioLinearLayout customRatioLinearLayout = (CustomRatioLinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.tv_featured_row, viewGroup, false);
        customRatioLinearLayout.setDimension(16, 9);
        C0605t c4609b = new C4609b(customRatioLinearLayout);
        ViewPager viewPager = (ViewPager) customRatioLinearLayout.findViewById(R.id.view_pager);
        viewPager.setAdapter(this.f20317a);
        viewPager.setOnPageChangeListener(new C4610c(this.f20318b, this));
        return c4609b;
    }

    /* renamed from: a */
    public void m25088a(C0605t c0605t, int i) {
        C4609b c4609b = (C4609b) c0605t;
        this.f20319c = true;
        if (this.f20321e != null) {
            this.f20321e.m25078a(true);
        }
        this.f20321e = new C4608a(c4609b, this);
        c4609b.f20314a.postDelayed(this.f20321e, ToolTipPopup.DEFAULT_POPUP_DISPLAY_TIME);
    }

    /* renamed from: a */
    public void m25087a() {
        this.f20319c = false;
    }

    /* renamed from: b */
    public void m25089b() {
        this.f20319c = true;
    }
}
