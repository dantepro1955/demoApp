package com.p000;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v7.widget.AppCompatImageView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.TextView;
import com.roughike.bottombar.BadgeContainer;
import com.roughike.bottombar.BottomBarTab;
import p000.dcf.C4796g;

/* compiled from: BottomBarBadge */
/* renamed from: dbz */
public class dbz extends TextView {
    /* renamed from: a */
    private int f21123a;
    /* renamed from: b */
    private boolean f21124b = false;

    public dbz(Context context) {
        super(context);
    }

    /* renamed from: a */
    public void m26308a(int i) {
        this.f21123a = i;
        setText(String.valueOf(i));
    }

    /* renamed from: a */
    public int m26307a() {
        return this.f21123a;
    }

    /* renamed from: b */
    public void m26311b() {
        this.f21124b = true;
        jd.r(this).m31853a(150).m31852a(1.0f).m31862d(1.0f).m31863e(1.0f).m31861c();
    }

    /* renamed from: c */
    public void m26314c() {
        this.f21124b = false;
        jd.r(this).m31853a(150).m31852a(0.0f).m31862d(0.0f).m31863e(0.0f).m31861c();
    }

    /* renamed from: d */
    public boolean m26315d() {
        return this.f21124b;
    }

    /* renamed from: a */
    public void m26310a(BottomBarTab bottomBarTab, int i) {
        setLayoutParams(new LayoutParams(-2, -2));
        setGravity(17);
        dcb.m26354a((TextView) this, C4796g.BB_BottomBarBadge_Text);
        m26312b(i);
        m26306c(bottomBarTab);
    }

    /* renamed from: b */
    public void m26312b(int i) {
        int a = dcb.m26352a(getContext(), 1.0f);
        Drawable a2 = dbx.m26303a(a * 3, i);
        setPadding(a, a, a, a);
        m26305a(a2);
    }

    /* renamed from: c */
    private void m26306c(final BottomBarTab bottomBarTab) {
        ViewGroup viewGroup = (ViewGroup) bottomBarTab.getParent();
        viewGroup.removeView(bottomBarTab);
        final View badgeContainer = new BadgeContainer(getContext());
        badgeContainer.setLayoutParams(new LayoutParams(-2, -2));
        badgeContainer.addView(bottomBarTab);
        badgeContainer.addView(this);
        viewGroup.addView(badgeContainer, bottomBarTab.getIndexInTabContainer());
        badgeContainer.getViewTreeObserver().addOnGlobalLayoutListener(new OnGlobalLayoutListener(this) {
            /* renamed from: c */
            final /* synthetic */ dbz f21122c;

            public void onGlobalLayout() {
                badgeContainer.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                this.f21122c.m26313b(bottomBarTab);
            }
        });
    }

    /* renamed from: a */
    public void m26309a(BottomBarTab bottomBarTab) {
        BadgeContainer badgeContainer = (BadgeContainer) getParent();
        ViewGroup viewGroup = (ViewGroup) badgeContainer.getParent();
        badgeContainer.removeView(bottomBarTab);
        viewGroup.removeView(badgeContainer);
        viewGroup.addView(bottomBarTab, bottomBarTab.getIndexInTabContainer());
    }

    /* renamed from: b */
    public void m26313b(BottomBarTab bottomBarTab) {
        AppCompatImageView iconView = bottomBarTab.getIconView();
        LayoutParams layoutParams = getLayoutParams();
        int max = Math.max(getWidth(), getHeight());
        setX(iconView.getX() + ((float) (((double) iconView.getWidth()) / 1.25d)));
        setTranslationY(10.0f);
        if (layoutParams.width != max || layoutParams.height != max) {
            layoutParams.width = max;
            layoutParams.height = max;
            setLayoutParams(layoutParams);
        }
    }

    /* renamed from: a */
    private void m26305a(Drawable drawable) {
        if (VERSION.SDK_INT >= 16) {
            setBackground(drawable);
        } else {
            setBackgroundDrawable(drawable);
        }
    }
}
