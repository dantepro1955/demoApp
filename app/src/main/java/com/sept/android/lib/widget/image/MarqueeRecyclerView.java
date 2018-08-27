package com.sept.android.lib.widget.image;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.MotionEvent;

import com.Utility.Res.res_id_2;

import java.lang.ref.WeakReference;

//import p000.dnb.C5005h;

public class MarqueeRecyclerView extends RecyclerView {
    /* renamed from: a */
    private SmoothScroll /*C4454a*/ smoothScroll;
    /* renamed from: b */
    private int dimensionPixelSize;
    /* renamed from: c */
    private boolean isEnableScrollingBackground = true;

    /* renamed from: com.sept.android.lib.widget.image.MarqueeRecyclerView$a */
    static class SmoothScroll /*C4454a*/ implements Runnable {
        /* renamed from: a */
        private WeakReference<RecyclerView> weakReference;
        /* renamed from: b */
        private int smoothScroll_x;
        /* renamed from: c */
        private int smoothScroll_y;

        public SmoothScroll(RecyclerView recyclerView, int i, int i2) {
            this.weakReference = new WeakReference(recyclerView);
            this.smoothScroll_x = i;
            this.smoothScroll_y = i2;
        }

        public void run() {
            RecyclerView recyclerView = (RecyclerView) this.weakReference.get();
            if (recyclerView != null) {
                if (this.smoothScroll_y == 0) {
                    recyclerView.smoothScrollBy(this.smoothScroll_x, 0);
                } else if (1 == this.smoothScroll_y) {
                    recyclerView.smoothScrollBy(0, this.smoothScroll_x);
                }
                recyclerView.postDelayed(this, 50);
            }
        }
    }

    public MarqueeRecyclerView(Context context) {
        super(context);
        setHasFixedSize();
    }

    public MarqueeRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setHasFixedSize();
        getDimensionSize(context, attributeSet);
    }

    public MarqueeRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setHasFixedSize();
        getDimensionSize(context, attributeSet);
    }

    /* renamed from: a */
    private void setHasFixedSize/*m23947a*/() {
        setHasFixedSize(true);
    }

    /* renamed from: a */
    private void getDimensionSize(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, res_id_2.mrv, 0, 0);
            try {
                this.dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(res_id_2.mrv_scrollingSpeed, 5);
            } catch (Exception e) {
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.smoothScroll = new SmoothScroll(this, this.dimensionPixelSize, ((LinearLayoutManager) getLayoutManager()).getOrientation());
        if (this.isEnableScrollingBackground) {
            postDelayed(this.smoothScroll, 500);
        }
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.smoothScroll);
    }

    public void setLayoutManager(LayoutManager layoutManager) {
        if (layoutManager instanceof LinearLayoutManager) {
            super.setLayoutManager(layoutManager);
            return;
        }
        throw new IllegalArgumentException("Only LinearLayoutManager is accepted");
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    public void setEnableScrollingBackground(boolean isEnable) {
        this.isEnableScrollingBackground = isEnable;
    }
}
