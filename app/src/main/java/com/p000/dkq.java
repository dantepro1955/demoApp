package com.p000;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.under9.android.lib.widget.TouchEventRelativeLayout;
import com.under9.android.lib.widget.uiv.FrescoTilingView.C4484d;
import com.under9.android.lib.widget.uiv.UniversalImageView;
import com.under9.android.lib.widget.uiv.UniversalImageView.C4060c;
import com.under9.android.lib.widget.uiv.UniversalImageView.C4497b;
import java.util.ArrayList;
import java.util.Iterator;
import p000.dkd.C4946a;
import p000.dlm.C4972a;
import p000.dnb.C5002e;
import p000.dnb.C5003f;

/* compiled from: MultiUIVViewPagerAdapter */
/* renamed from: dkq */
public class dkq extends iv {
    /* renamed from: a */
    Context f21919a;
    /* renamed from: b */
    ArrayList<dkw> f21920b;
    /* renamed from: c */
    private C4060c f21921c = new C49581(this);
    /* renamed from: d */
    private dkd f21922d;

    /* compiled from: MultiUIVViewPagerAdapter */
    /* renamed from: dkq$1 */
    class C49581 implements C4060c {
        /* renamed from: a */
        final /* synthetic */ dkq f21914a;

        C49581(dkq dkq) {
            this.f21914a = dkq;
        }

        /* renamed from: a */
        public void mo3751a(View view, dlm dlm, UniversalImageView universalImageView) {
            dhe.m27286c(new dkt());
        }
    }

    /* compiled from: MultiUIVViewPagerAdapter */
    /* renamed from: dkq$a */
    public static class C4960a {
        /* renamed from: a */
        public UniversalImageView f21917a;
        /* renamed from: b */
        public TouchEventRelativeLayout f21918b;

        public C4960a(View view) {
            this.f21917a = (UniversalImageView) dka.m27651a(view, C5002e.universalImageView);
            this.f21918b = (TouchEventRelativeLayout) dka.m27651a(view, C5002e.width_wrapper);
        }
    }

    public dkq(Context context, ArrayList<dkw> arrayList) {
        this.f21919a = context;
        this.f21920b = arrayList;
    }

    public int getCount() {
        return this.f21920b.size();
    }

    public boolean isViewFromObject(View view, Object obj) {
        if ((obj instanceof LinearLayout) && view == obj) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public View m27748a(ViewGroup viewGroup, int i) {
        View inflate = LayoutInflater.from(this.f21919a).inflate(C5003f.group_post_item_fullscreen_uiv, viewGroup, false);
        inflate.setTag(C5002e.multi_image_overlay_holder_tag, new C4960a(inflate));
        return inflate;
    }

    /* renamed from: a */
    public void m27751a(View view, int i) {
        C4960a c4960a = (C4960a) view.getTag(C5002e.multi_image_overlay_holder_tag);
        dkw dkw = (dkw) this.f21920b.get(i);
        dkv imageWrapper = dkw.getImageWrapper();
        if (imageWrapper != null) {
            m27746a(view.getContext(), imageWrapper);
            if (dkw.isAnimated()) {
                c4960a.f21917a.setAdapter(new C4972a().m27866a(imageWrapper.mo4432a(), imageWrapper.mo4433b(), imageWrapper.mo4434c()).m27870b(dkw.getMp4Url()).m27873c(dkw.getMp4LocalPath()).m27861a(C4497b.ANIMATED).m27862a(this.f21921c).m27877e(true).m27878f(false).m27872b());
            } else {
                C4972a a = new C4972a().m27877e(true).m27881i(true).m27882j(true).m27862a(this.f21921c);
                if (dkw.hasImageTiles()) {
                    a.m27857a(imageWrapper.mo4433b(), imageWrapper.mo4434c());
                    Iterator it = dkw.getImageTiles().iterator();
                    while (it.hasNext()) {
                        dkv dkv = (dkv) it.next();
                        a.m27860a(new C4484d(dkv.mo4432a(), dkv.mo4433b(), dkv.mo4434c()));
                    }
                } else {
                    a.m27866a(imageWrapper.mo4432a(), imageWrapper.mo4433b(), imageWrapper.mo4434c());
                }
                c4960a.f21917a.setAdapter(a.m27872b());
            }
        }
        c4960a.f21917a.m24151a(dks.m27753d());
        c4960a.f21918b.setInterceptTouchEventListener(this.f21922d);
        view.setTag(m27749a(i));
    }

    public Object instantiateItem(ViewGroup viewGroup, int i) {
        View a = m27748a(viewGroup, i);
        m27751a(a, i);
        viewGroup.addView(a);
        return a;
    }

    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        if (obj != null && (obj instanceof View)) {
            View view = (View) obj;
            C4960a c = m27747c(view);
            if (c != null) {
                c.f21917a.m24158e();
                viewGroup.removeView(view);
            }
        }
    }

    /* renamed from: c */
    private C4960a m27747c(View view) {
        Object tag = view.getTag(C5002e.multi_image_overlay_holder_tag);
        if (tag == null || !(tag instanceof C4960a)) {
            return null;
        }
        return (C4960a) tag;
    }

    /* renamed from: a */
    public void m27750a(View view) {
        C4960a c = m27747c(view);
        if (c != null) {
            c.f21917a.postInvalidate();
        }
    }

    /* renamed from: b */
    public void m27752b(View view) {
        C4960a c = m27747c(view);
        if (c != null) {
            dle.m27811a();
            c.f21917a.m24155b();
        }
    }

    /* renamed from: a */
    public String m27749a(int i) {
        return "item-" + i;
    }

    /* renamed from: a */
    private void m27746a(final Context context, dkv dkv) {
        this.f21922d = new dkd(context, C5002e.universalImageView, dkv.mo4434c());
        this.f21922d.m27676a(new C4946a(this) {
            /* renamed from: b */
            final /* synthetic */ dkq f21916b;

            /* renamed from: a */
            public boolean mo4426a() {
                return true;
            }

            /* renamed from: b */
            public void mo4427b() {
            }

            /* renamed from: c */
            public void mo4429c() {
            }

            /* renamed from: d */
            public void mo4430d() {
            }

            /* renamed from: a */
            public void mo4425a(int i) {
            }

            /* renamed from: b */
            public void mo4428b(int i) {
                ((Activity) context).finish();
            }

            /* renamed from: e */
            public void mo4431e() {
            }
        });
    }
}
