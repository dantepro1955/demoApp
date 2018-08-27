package com.sept.android.lib.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Typeface;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.C0370e;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.View.BaseSavedState;
import android.view.View.OnClickListener;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import java.util.Locale;
import p000.dnb.C5001d;
import p000.dnb.C5005h;

public class PagerSlidingTabStrip extends HorizontalScrollView {
    /* renamed from: b */
    private static final int[] f19481b = new int[]{16842901, 16842904};
    /* renamed from: A */
    private int f19482A;
    /* renamed from: B */
    private Typeface f19483B;
    /* renamed from: C */
    private int f19484C;
    /* renamed from: D */
    private int f19485D;
    /* renamed from: E */
    private int f19486E;
    /* renamed from: F */
    private Locale f19487F;
    /* renamed from: G */
    private C4439c f19488G;
    /* renamed from: H */
    private boolean f19489H;
    /* renamed from: a */
    public C0370e f19490a;
    /* renamed from: c */
    private LayoutParams f19491c;
    /* renamed from: d */
    private LayoutParams f19492d;
    /* renamed from: e */
    private C4440d f19493e;
    /* renamed from: f */
    private LinearLayout f19494f;
    /* renamed from: g */
    private ViewPager f19495g;
    /* renamed from: h */
    private int f19496h;
    /* renamed from: i */
    private int f19497i;
    /* renamed from: j */
    private float f19498j;
    /* renamed from: k */
    private Paint f19499k;
    /* renamed from: l */
    private Paint f19500l;
    /* renamed from: m */
    private int f19501m;
    /* renamed from: n */
    private int f19502n;
    /* renamed from: o */
    private int f19503o;
    /* renamed from: p */
    private int f19504p;
    /* renamed from: q */
    private boolean f19505q;
    /* renamed from: r */
    private boolean f19506r;
    /* renamed from: s */
    private int f19507s;
    /* renamed from: t */
    private int f19508t;
    /* renamed from: u */
    private int f19509u;
    /* renamed from: v */
    private int f19510v;
    /* renamed from: w */
    private int f19511w;
    /* renamed from: x */
    private int f19512x;
    /* renamed from: y */
    private int f19513y;
    /* renamed from: z */
    private int f19514z;

    /* renamed from: com.sept.android.lib.widget.PagerSlidingTabStrip$1 */
    class C44341 implements OnGlobalLayoutListener {
        /* renamed from: a */
        final /* synthetic */ PagerSlidingTabStrip f19476a;

        C44341(PagerSlidingTabStrip pagerSlidingTabStrip) {
            this.f19476a = pagerSlidingTabStrip;
        }

        @SuppressLint({"NewApi"})
        public void onGlobalLayout() {
            if (VERSION.SDK_INT < 16) {
                this.f19476a.getViewTreeObserver().removeGlobalOnLayoutListener(this);
            } else {
                this.f19476a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            }
            this.f19476a.f19497i = this.f19476a.f19495g.getCurrentItem();
            this.f19476a.m23862b(this.f19476a.f19497i, 0);
        }
    }

    static class SavedState extends BaseSavedState {
        public static final Creator<SavedState> CREATOR = new C44361();
        /* renamed from: a */
        int f19479a;

        /* renamed from: com.sept.android.lib.widget.PagerSlidingTabStrip$SavedState$1 */
        static class C44361 implements Creator<SavedState> {
            C44361() {
            }

            public /* synthetic */ Object createFromParcel(Parcel parcel) {
                return m23845a(parcel);
            }

            public /* synthetic */ Object[] newArray(int i) {
                return m23846a(i);
            }

            /* renamed from: a */
            public SavedState m23845a(Parcel parcel) {
                return new SavedState(parcel);
            }

            /* renamed from: a */
            public SavedState[] m23846a(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            this.f19479a = parcel.readInt();
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f19479a);
        }
    }

    /* renamed from: com.sept.android.lib.widget.PagerSlidingTabStrip$a */
    public interface C4437a {
        /* renamed from: a */
        View m23847a(int i, Context context);
    }

    /* renamed from: com.sept.android.lib.widget.PagerSlidingTabStrip$b */
    public interface C4438b {
        /* renamed from: a */
        int m23848a(int i);
    }

    /* renamed from: com.sept.android.lib.widget.PagerSlidingTabStrip$c */
    public interface C4439c {
        /* renamed from: a */
        boolean m23849a(int i);
    }

    /* renamed from: com.sept.android.lib.widget.PagerSlidingTabStrip$d */
    public class C4440d implements C0370e {
        /* renamed from: a */
        final /* synthetic */ PagerSlidingTabStrip f19480a;

        protected C4440d(PagerSlidingTabStrip pagerSlidingTabStrip) {
            this.f19480a = pagerSlidingTabStrip;
        }

        /* renamed from: a */
        public void m23851a(int i, float f, int i2) {
            this.f19480a.f19497i = i;
            this.f19480a.f19498j = f;
            if (this.f19480a.f19494f.getChildAt(i) != null) {
                this.f19480a.m23862b(i, (int) (((float) this.f19480a.f19494f.getChildAt(i).getWidth()) * f));
            }
            this.f19480a.invalidate();
            if (this.f19480a.f19490a != null) {
                this.f19480a.f19490a.a(i, f, i2);
            }
        }

        /* renamed from: a */
        public void m23850a(int i) {
            if (i == 0) {
                this.f19480a.m23862b(this.f19480a.f19495g.getCurrentItem(), 0);
            }
            if (this.f19480a.f19490a != null) {
                this.f19480a.f19490a.a(i);
            }
        }

        /* renamed from: b */
        public void mo4067b(int i) {
            if (this.f19480a.f19490a != null) {
                this.f19480a.f19490a.b(i);
            }
        }
    }

    public PagerSlidingTabStrip(Context context) {
        this(context, null);
    }

    public PagerSlidingTabStrip(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PagerSlidingTabStrip(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f19497i = 0;
        this.f19498j = 0.0f;
        this.f19501m = -10066330;
        this.f19502n = 436207616;
        this.f19503o = -10066330;
        this.f19504p = 436207616;
        this.f19505q = false;
        this.f19506r = true;
        this.f19507s = 52;
        this.f19508t = 8;
        this.f19509u = 2;
        this.f19510v = 2;
        this.f19511w = 12;
        this.f19512x = 16;
        this.f19513y = 1;
        this.f19514z = 12;
        this.f19482A = -10066330;
        this.f19483B = null;
        this.f19484C = 1;
        this.f19485D = 0;
        this.f19486E = C5001d.background_tab;
        this.f19489H = true;
        setFillViewport(true);
        setWillNotDraw(false);
        this.f19493e = mo4068b();
        this.f19494f = new LinearLayout(context);
        this.f19494f.setOrientation(0);
        this.f19494f.setLayoutParams(new LayoutParams(-1, -1));
        addView(this.f19494f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.f19507s = (int) TypedValue.applyDimension(1, (float) this.f19507s, displayMetrics);
        this.f19508t = (int) TypedValue.applyDimension(1, (float) this.f19508t, displayMetrics);
        this.f19509u = (int) TypedValue.applyDimension(1, (float) this.f19509u, displayMetrics);
        this.f19511w = (int) TypedValue.applyDimension(1, (float) this.f19511w, displayMetrics);
        this.f19512x = (int) TypedValue.applyDimension(1, (float) this.f19512x, displayMetrics);
        this.f19513y = (int) TypedValue.applyDimension(1, (float) this.f19513y, displayMetrics);
        this.f19514z = (int) TypedValue.applyDimension(2, (float) this.f19514z, displayMetrics);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f19481b);
        this.f19514z = obtainStyledAttributes.getDimensionPixelSize(0, this.f19514z);
        this.f19482A = obtainStyledAttributes.getColor(1, this.f19482A);
        obtainStyledAttributes.recycle();
        obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C5005h.PagerSlidingTabStrip);
        this.f19501m = obtainStyledAttributes.getColor(C5005h.PagerSlidingTabStrip_pstsIndicatorColor, this.f19501m);
        this.f19502n = obtainStyledAttributes.getColor(C5005h.PagerSlidingTabStrip_pstsUnderlineColor, this.f19502n);
        this.f19503o = obtainStyledAttributes.getColor(C5005h.PagerSlidingTabStrip_pstsUpperlineColor, this.f19503o);
        this.f19504p = obtainStyledAttributes.getColor(C5005h.PagerSlidingTabStrip_pstsDividerColor, this.f19504p);
        this.f19508t = obtainStyledAttributes.getDimensionPixelSize(C5005h.PagerSlidingTabStrip_pstsIndicatorHeight, this.f19508t);
        this.f19509u = obtainStyledAttributes.getDimensionPixelSize(C5005h.PagerSlidingTabStrip_pstsUnderlineHeight, this.f19509u);
        this.f19510v = obtainStyledAttributes.getDimensionPixelSize(C5005h.PagerSlidingTabStrip_pstsUpperlineHeight, this.f19510v);
        this.f19511w = obtainStyledAttributes.getDimensionPixelSize(C5005h.PagerSlidingTabStrip_pstsDividerPadding, this.f19511w);
        this.f19512x = obtainStyledAttributes.getDimensionPixelSize(C5005h.PagerSlidingTabStrip_pstsTabPaddingLeftRight, this.f19512x);
        this.f19486E = obtainStyledAttributes.getResourceId(C5005h.PagerSlidingTabStrip_pstsTabBackground, this.f19486E);
        this.f19505q = obtainStyledAttributes.getBoolean(C5005h.PagerSlidingTabStrip_pstsShouldExpand, this.f19505q);
        this.f19507s = obtainStyledAttributes.getDimensionPixelSize(C5005h.PagerSlidingTabStrip_pstsScrollOffset, this.f19507s);
        this.f19506r = obtainStyledAttributes.getBoolean(C5005h.PagerSlidingTabStrip_pstsTextAllCaps, this.f19506r);
        obtainStyledAttributes.recycle();
        this.f19499k = new Paint();
        this.f19499k.setAntiAlias(true);
        this.f19499k.setStyle(Style.FILL);
        this.f19500l = new Paint();
        this.f19500l.setAntiAlias(true);
        this.f19500l.setStrokeWidth((float) this.f19513y);
        this.f19491c = new LayoutParams(-2, -1);
        this.f19492d = new LayoutParams(0, -1, 1.0f);
        if (this.f19487F == null) {
            this.f19487F = getResources().getConfiguration().locale;
        }
    }

    public void setViewPager(ViewPager viewPager) {
        this.f19495g = viewPager;
        if (viewPager.getAdapter() == null) {
            throw new IllegalStateException("ViewPager does not have adapter instance.");
        }
        viewPager.setOnPageChangeListener(this.f19493e);
        m23868a();
    }

    public void setOnPageChangeListener(C0370e c0370e) {
        this.f19490a = c0370e;
    }

    public void setOnTabClickListener(C4439c c4439c) {
        this.f19488G = c4439c;
    }

    /* renamed from: a */
    public void m23868a() {
        m23869a(true);
    }

    /* renamed from: a */
    public void m23869a(boolean z) {
        this.f19494f.removeAllViews();
        this.f19496h = this.f19495g.getAdapter().getCount();
        for (int i = 0; i < this.f19496h; i++) {
            if (this.f19495g.getAdapter() instanceof C4438b) {
                m23857a(i, ((C4438b) this.f19495g.getAdapter()).m23848a(i));
            } else if (this.f19495g.getAdapter() instanceof C4437a) {
                m23858a(i, ((C4437a) this.f19495g.getAdapter()).m23847a(i, getContext()));
            } else {
                m23859a(i, this.f19495g.getAdapter().getPageTitle(i).toString());
            }
        }
        m23864c();
        if (z) {
            getViewTreeObserver().addOnGlobalLayoutListener(new C44341(this));
        }
    }

    /* renamed from: a */
    private void m23859a(int i, String str) {
        View textView = new TextView(getContext());
        textView.setText(str);
        textView.setGravity(17);
        textView.setSingleLine();
        m23858a(i, textView);
    }

    /* renamed from: a */
    private void m23857a(int i, int i2) {
        View checkableImageView = new CheckableImageView(getContext());
        checkableImageView.setImageResource(i2);
        m23858a(i, checkableImageView);
    }

    /* renamed from: a */
    private void m23858a(final int i, View view) {
        view.setFocusable(true);
        view.setOnClickListener(new OnClickListener(this) {
            /* renamed from: b */
            final /* synthetic */ PagerSlidingTabStrip f19478b;

            public void onClick(View view) {
                boolean z = false;
                if (this.f19478b.f19488G != null) {
                    z = this.f19478b.f19488G.m23849a(i);
                }
                if (!z) {
                    this.f19478b.f19495g.setCurrentItem(i, this.f19478b.f19489H);
                    this.f19478b.f19493e.m23850a(2);
                }
            }
        });
        view.setPadding(this.f19512x, 0, this.f19512x, 0);
        this.f19494f.addView(view, i, this.f19505q ? this.f19492d : this.f19491c);
    }

    /* renamed from: c */
    private void m23864c() {
        for (int i = 0; i < this.f19496h; i++) {
            m23856a(i);
        }
    }

    /* renamed from: a */
    private void m23856a(int i) {
        View childAt = this.f19494f.getChildAt(i);
        childAt.setBackgroundResource(this.f19486E);
        if (childAt instanceof TextView) {
            TextView textView = (TextView) childAt;
            textView.setTextSize(0, (float) this.f19514z);
            textView.setTypeface(this.f19483B, this.f19484C);
            textView.setTextColor(this.f19482A);
            if (!this.f19506r) {
                return;
            }
            if (VERSION.SDK_INT >= 14) {
                textView.setAllCaps(true);
            } else {
                textView.setText(textView.getText().toString().toUpperCase(this.f19487F));
            }
        }
    }

    /* renamed from: b */
    private void m23862b(int i, int i2) {
        if (this.f19496h != 0) {
            int left = this.f19494f.getChildAt(i).getLeft() + i2;
            if (i > 0 || i2 > 0) {
                left -= this.f19507s;
            }
            if (left != this.f19485D) {
                this.f19485D = left;
                scrollTo(left, 0);
            }
        }
    }

    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!isInEditMode() && this.f19496h != 0) {
            int height = getHeight();
            this.f19499k.setColor(this.f19501m);
            View childAt = this.f19494f.getChildAt(this.f19497i);
            float left = (float) childAt.getLeft();
            float right = (float) childAt.getRight();
            if (this.f19498j > 0.0f && this.f19497i < this.f19496h - 1) {
                childAt = this.f19494f.getChildAt(this.f19497i + 1);
                float left2 = (float) childAt.getLeft();
                left = (left * (1.0f - this.f19498j)) + (left2 * this.f19498j);
                right = (((float) childAt.getRight()) * this.f19498j) + ((1.0f - this.f19498j) * right);
            }
            canvas.drawRect(left, (float) (height - this.f19508t), right, (float) height, this.f19499k);
            this.f19499k.setColor(this.f19502n);
            canvas.drawRect(0.0f, (float) (height - this.f19509u), (float) this.f19494f.getWidth(), (float) height, this.f19499k);
            this.f19499k.setColor(this.f19503o);
            canvas.drawRect(0.0f, 0.0f, (float) this.f19494f.getWidth(), (float) this.f19510v, this.f19499k);
            this.f19500l.setColor(this.f19504p);
            for (int i = 0; i < this.f19496h - 1; i++) {
                childAt = this.f19494f.getChildAt(i);
                canvas.drawLine((float) childAt.getRight(), (float) this.f19511w, (float) childAt.getRight(), (float) (height - this.f19511w), this.f19500l);
            }
        }
    }

    /* renamed from: b */
    protected C4440d mo4068b() {
        return new C4440d(this);
    }

    public void setIndicatorColor(int i) {
        this.f19501m = i;
        invalidate();
    }

    public void setIndicatorColorResource(int i) {
        this.f19501m = getResources().getColor(i);
        invalidate();
    }

    public int getIndicatorColor() {
        return this.f19501m;
    }

    public void setIndicatorHeight(int i) {
        this.f19508t = i;
        invalidate();
    }

    public int getIndicatorHeight() {
        return this.f19508t;
    }

    public void setUnderlineColor(int i) {
        this.f19502n = i;
        invalidate();
    }

    public void setUnderlineColorResource(int i) {
        this.f19502n = getResources().getColor(i);
        invalidate();
    }

    public int getUnderlineColor() {
        return this.f19502n;
    }

    public void setDividerColor(int i) {
        this.f19504p = i;
        invalidate();
    }

    public void setDividerColorResource(int i) {
        this.f19504p = getResources().getColor(i);
        invalidate();
    }

    public int getDividerColor() {
        return this.f19504p;
    }

    public void setUnderlineHeight(int i) {
        this.f19509u = i;
        invalidate();
    }

    public int getUnderlineHeight() {
        return this.f19509u;
    }

    public void setDividerPadding(int i) {
        this.f19511w = i;
        invalidate();
    }

    public int getDividerPadding() {
        return this.f19511w;
    }

    public void setScrollOffset(int i) {
        this.f19507s = i;
        invalidate();
    }

    public int getScrollOffset() {
        return this.f19507s;
    }

    public void setShouldExpand(boolean z) {
        this.f19505q = z;
        requestLayout();
    }

    public boolean getShouldExpand() {
        return this.f19505q;
    }

    public void setAllCaps(boolean z) {
        this.f19506r = z;
    }

    public void setTextSize(int i) {
        this.f19514z = i;
        m23864c();
    }

    public int getTextSize() {
        return this.f19514z;
    }

    public void setTextColor(int i) {
        this.f19482A = i;
        m23864c();
    }

    public void setTextColorResource(int i) {
        this.f19482A = getResources().getColor(i);
        m23864c();
    }

    public int getTextColor() {
        return this.f19482A;
    }

    public void setTypeface(Typeface typeface, int i) {
        this.f19483B = typeface;
        this.f19484C = i;
        m23864c();
    }

    public void setTabBackground(int i) {
        this.f19486E = i;
    }

    public int getTabBackground() {
        return this.f19486E;
    }

    public void setTabPaddingLeftRight(int i) {
        this.f19512x = i;
        m23864c();
    }

    public int getTabPaddingLeftRight() {
        return this.f19512x;
    }

    public ViewPager getPager() {
        return this.f19495g;
    }

    public LinearLayout getTabsContainer() {
        return this.f19494f;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f19497i = savedState.f19479a;
        requestLayout();
    }

    public Parcelable onSaveInstanceState() {
        Parcelable savedState = new SavedState(super.onSaveInstanceState());
        savedState.f19479a = this.f19497i;
        return savedState;
    }

    public void setSmoothScroll(boolean z) {
        this.f19489H = z;
    }
}
