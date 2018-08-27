package com.sept.android.lib.widget;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import com.sept.android.lib.widget.PagerSlidingTabStrip.C4438b;
import com.sept.android.lib.widget.PagerSlidingTabStrip.C4440d;

public class PagerSlidingTabStripWithState extends PagerSlidingTabStrip {
    /* renamed from: b */
    C4442b f19516b = null;

    /* renamed from: com.sept.android.lib.widget.PagerSlidingTabStripWithState$a */
    public class C4441a extends C4440d {
        /* renamed from: b */
        final /* synthetic */ PagerSlidingTabStripWithState f19515b;

        protected C4441a(PagerSlidingTabStripWithState pagerSlidingTabStripWithState) {
            this.f19515b = pagerSlidingTabStripWithState;
            super(pagerSlidingTabStripWithState);
        }

        /* renamed from: b */
        public void mo4067b(int i) {
            super.mo4067b(i);
            this.f19515b.m23873a(i);
        }
    }

    /* renamed from: com.sept.android.lib.widget.PagerSlidingTabStripWithState$b */
    public interface C4442b {
        /* renamed from: a */
        void m23872a(int i);
    }

    public PagerSlidingTabStripWithState(Context context) {
        super(context);
    }

    public PagerSlidingTabStripWithState(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PagerSlidingTabStripWithState(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* renamed from: b */
    protected C4440d mo4068b() {
        return new C4441a(this);
    }

    public void setViewPager(ViewPager viewPager) {
        super.setViewPager(viewPager);
        m23873a(viewPager.getCurrentItem());
    }

    public void setPagerStateListener(C4442b c4442b) {
        this.f19516b = c4442b;
    }

    /* renamed from: a */
    private void m23873a(int i) {
        if (getPager() != null && getPager().getAdapter() != null) {
            if (getPager().getAdapter() instanceof C4438b) {
                int count = getPager().getAdapter().getCount();
                for (int i2 = 0; i2 < count; i2++) {
                    boolean z;
                    CheckableImageView checkableImageView = (CheckableImageView) getTabsContainer().getChildAt(i2);
                    if (i2 == i) {
                        z = true;
                    } else {
                        z = false;
                    }
                    checkableImageView.setChecked(z);
                }
            }
            if (this.f19516b != null) {
                this.f19516b.m23872a(i);
            }
        }
    }
}
