package com.sept.android.lib.widget.uiv;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.sept.android.lib.widget.mp4.TextureMp4PlayerView;
import com.sept.android.lib.widget.uiv.FrescoTilingView.C4483c;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import p000.djh;
import p000.djw;
import p000.dkc.C4941a;
import p000.dkc.C4942b;
import p000.dkc.C4943c;
import p000.dkc.C4944d;
import p000.dle;
import p000.dle.C4500a;
import p000.dlf;
import p000.dlm;
import p000.dln;
import p000.dln.C4974a;
import p000.dlo;
import p000.dlp;
import p000.dlr;
import p000.ew;

public class UniversalImageView extends FrameLayout implements OnClickListener, OnLongClickListener, dlr {
    /* renamed from: c */
    private static HashMap<String, Runnable> f19802c = new HashMap();
    /* renamed from: a */
    public C4502h f19803a;
    /* renamed from: b */
    dlm f19804b;
    /* renamed from: d */
    private long f19805d = 0;
    /* renamed from: e */
    private boolean f19806e = false;
    /* renamed from: f */
    private boolean f19807f = false;
    /* renamed from: g */
    private boolean f19808g = true;
    /* renamed from: h */
    private Handler f19809h = new Handler();
    /* renamed from: i */
    private Runnable f19810i = new C44881(this);
    /* renamed from: j */
    private Runnable f19811j = new C44892(this);
    /* renamed from: k */
    private Runnable f19812k = new C44903(this);
    /* renamed from: l */
    private Runnable f19813l = new C44914(this);
    /* renamed from: m */
    private final dlo f19814m = new dlo(this);
    /* renamed from: n */
    private final dlp f19815n = new dlp(this);
    /* renamed from: o */
    private String f19816o = null;
    /* renamed from: p */
    private int f19817p = 0;
    /* renamed from: q */
    private int f19818q = 0;
    /* renamed from: r */
    private int f19819r = 0;

    /* renamed from: com.sept.android.lib.widget.uiv.UniversalImageView$d */
    public interface C4059d {
        /* renamed from: a */
        void mo3750a(View view, dlm dlm, UniversalImageView universalImageView);
    }

    /* renamed from: com.sept.android.lib.widget.uiv.UniversalImageView$c */
    public interface C4060c {
        /* renamed from: a */
        void mo3751a(View view, dlm dlm, UniversalImageView universalImageView);
    }

    /* renamed from: com.sept.android.lib.widget.uiv.UniversalImageView$1 */
    class C44881 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ UniversalImageView f19763a;

        C44881(UniversalImageView universalImageView) {
            this.f19763a = universalImageView;
        }

        public void run() {
            if (this.f19763a.f19809h == null) {
                return;
            }
            if (this.f19763a.isShown()) {
                this.f19763a.f19809h.postDelayed(this, 1000);
            } else {
                this.f19763a.m24144n();
            }
        }
    }

    /* renamed from: com.sept.android.lib.widget.uiv.UniversalImageView$2 */
    class C44892 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ UniversalImageView f19764a;

        C44892(UniversalImageView universalImageView) {
            this.f19764a = universalImageView;
        }

        public void run() {
            if (!this.f19764a.m24148r() && this.f19764a.f19803a != null && this.f19764a.f19803a.f19798n != null) {
                boolean b = dlf.m27824b(this.f19764a.f19803a.f19791g);
                this.f19764a.f19803a.f19798n.setVisibility(b ? 0 : 4);
                if (b) {
                    this.f19764a.f19809h.postDelayed(this, 100);
                    return;
                }
                this.f19764a.f19809h.removeCallbacks(this);
                if (this.f19764a.f19804b.f22084x) {
                    this.f19764a.f19803a.f19798n.setVisibility(4);
                    this.f19764a.f19803a.f19791g.setVisibility(0);
                    this.f19764a.f19803a.f19792h.setVisibility(4);
                    this.f19764a.f19803a.f19785a.setVisibility(4);
                    return;
                }
                this.f19764a.f19809h.postDelayed(this.f19764a.f19812k, 500);
            }
        }
    }

    /* renamed from: com.sept.android.lib.widget.uiv.UniversalImageView$3 */
    class C44903 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ UniversalImageView f19765a;

        C44903(UniversalImageView universalImageView) {
            this.f19765a = universalImageView;
        }

        public void run() {
            if (dlf.m27824b(this.f19765a.f19803a.f19791g)) {
                this.f19765a.f19809h.postDelayed(this, 500);
                return;
            }
            this.f19765a.f19803a.f19798n.setVisibility(4);
            this.f19765a.f19803a.f19791g.setVisibility(0);
            this.f19765a.f19803a.f19792h.setVisibility(4);
            this.f19765a.f19803a.f19785a.setVisibility(4);
        }
    }

    /* renamed from: com.sept.android.lib.widget.uiv.UniversalImageView$4 */
    class C44914 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ UniversalImageView f19766a;

        C44914(UniversalImageView universalImageView) {
            this.f19766a = universalImageView;
        }

        public void run() {
            if (this.f19766a.f19803a != null && this.f19766a.f19804b.f22059I) {
                Animation loadAnimation = AnimationUtils.loadAnimation(this.f19766a.getContext(), 17432577);
                loadAnimation.setDuration(500);
                loadAnimation.setFillEnabled(true);
                loadAnimation.setFillAfter(true);
                this.f19766a.f19803a.f19789e.startAnimation(loadAnimation);
            }
        }
    }

    /* renamed from: com.sept.android.lib.widget.uiv.UniversalImageView$6 */
    class C44936 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ UniversalImageView f19770a;

        C44936(UniversalImageView universalImageView) {
            this.f19770a = universalImageView;
        }

        public void run() {
            this.f19770a.f19803a.f19797m.setVisibility(8);
        }
    }

    /* renamed from: com.sept.android.lib.widget.uiv.UniversalImageView$a */
    static class C4496a implements OnPreDrawListener {
        /* renamed from: a */
        private final WeakReference<UniversalImageView> f19777a;
        /* renamed from: b */
        private final String f19778b;
        /* renamed from: c */
        private final boolean f19779c;
        /* renamed from: d */
        private final boolean f19780d;

        public C4496a(UniversalImageView universalImageView, String str, boolean z, boolean z2) {
            this.f19777a = new WeakReference(universalImageView);
            this.f19778b = str;
            this.f19780d = z;
            this.f19779c = z2;
        }

        public boolean onPreDraw() {
            UniversalImageView universalImageView = (UniversalImageView) this.f19777a.get();
            if (universalImageView != null) {
                universalImageView.m24150a((OnPreDrawListener) this);
                universalImageView.setIsViewAttached(true);
                if (universalImageView.m24154a()) {
                    universalImageView.setIsPendingStart(false);
                    universalImageView.m24152a(universalImageView.f19803a, this.f19778b, this.f19780d, this.f19779c);
                }
            }
            return true;
        }
    }

    /* renamed from: com.sept.android.lib.widget.uiv.UniversalImageView$b */
    public enum C4497b {
        f19781a,
        ANIMATED
    }

    /* renamed from: com.sept.android.lib.widget.uiv.UniversalImageView$e */
    public interface C4498e {
    }

    /* renamed from: com.sept.android.lib.widget.uiv.UniversalImageView$f */
    public static abstract class C4499f {
        /* renamed from: a */
        public abstract int mo4358a();

        /* renamed from: a */
        public abstract Drawable mo4359a(Context context);

        /* renamed from: b */
        public abstract int mo4360b();

        /* renamed from: b */
        public abstract Drawable mo4361b(Context context);

        /* renamed from: c */
        public abstract int mo4362c();

        /* renamed from: c */
        public abstract Drawable mo4363c(Context context);
    }

    /* renamed from: com.sept.android.lib.widget.uiv.UniversalImageView$g */
    static class C4501g implements C4500a {
        /* renamed from: a */
        private WeakReference<UniversalImageView> f19784a;

        private C4501g(UniversalImageView universalImageView) {
            this.f19784a = new WeakReference(universalImageView);
        }

        /* renamed from: a */
        public void mo4087a() {
            UniversalImageView universalImageView = (UniversalImageView) this.f19784a.get();
            if (universalImageView != null) {
                universalImageView.m24136c(false);
            }
        }
    }

    /* renamed from: com.sept.android.lib.widget.uiv.UniversalImageView$h */
    public class C4502h {
        /* renamed from: a */
        FrescoTilingView f19785a;
        /* renamed from: b */
        ImageView f19786b;
        /* renamed from: c */
        ImageView f19787c;
        /* renamed from: d */
        TextView f19788d;
        /* renamed from: e */
        TextView f19789e;
        /* renamed from: f */
        ImageView f19790f;
        /* renamed from: g */
        public View f19791g;
        /* renamed from: h */
        View f19792h;
        /* renamed from: i */
        public View f19793i;
        /* renamed from: j */
        LinearLayout f19794j;
        /* renamed from: k */
        View f19795k;
        /* renamed from: l */
        TextView f19796l;
        /* renamed from: m */
        ProgressBar f19797m;
        /* renamed from: n */
        ProgressBar f19798n;
        /* renamed from: o */
        View f19799o;
        /* renamed from: p */
        View f19800p;
        /* renamed from: q */
        final /* synthetic */ UniversalImageView f19801q;

        C4502h(UniversalImageView universalImageView) {
            this.f19801q = universalImageView;
        }

        /* renamed from: a */
        public void m24118a(View view) {
            this.f19785a = (FrescoTilingView) view.findViewById(C4943c.image);
            this.f19786b = (ImageView) view.findViewById(C4943c.badge);
            this.f19787c = (ImageView) view.findViewById(C4943c.retryImage);
            this.f19788d = (TextView) view.findViewById(C4943c.failMessage);
            this.f19794j = (LinearLayout) view.findViewById(C4943c.mobileCover);
            this.f19795k = view.findViewById(C4943c.mobileCoverSaw);
            this.f19796l = (TextView) view.findViewById(C4943c.mobileCoverMessage);
            this.f19797m = (ProgressBar) view.findViewById(C4943c.uivProgressBar);
            this.f19791g = view.findViewById(C4943c.gifView);
            this.f19792h = view.findViewById(C4943c.playerCover);
            this.f19793i = view.findViewById(C4943c.gifViewControlAnchor);
            this.f19789e = (TextView) view.findViewById(C4943c.duration);
            this.f19790f = (ImageView) view.findViewById(C4943c.soundToggle);
            this.f19798n = (ProgressBar) view.findViewById(C4943c.bufferingIndicator);
            this.f19800p = view.findViewById(C4943c.imageContainer);
            this.f19799o = view;
        }

        /* renamed from: a */
        public void m24116a(OnClickListener onClickListener) {
            this.f19785a.setOnClickListener(onClickListener);
            this.f19800p.setOnClickListener(onClickListener);
            this.f19791g.setOnClickListener(onClickListener);
            this.f19790f.setOnClickListener(onClickListener);
        }

        /* renamed from: a */
        public void m24117a(OnLongClickListener onLongClickListener) {
            this.f19785a.setOnLongClickListener(onLongClickListener);
            this.f19791g.setOnLongClickListener(onLongClickListener);
        }
    }

    public UniversalImageView(Context context) {
        super(context);
        m24126a(null);
    }

    public UniversalImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m24126a(attributeSet);
    }

    public UniversalImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m24126a(attributeSet);
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f19803a != null) {
            this.f19803a.f19785a.setVisibility(0);
            this.f19803a.f19786b.setVisibility(0);
            LayoutParams layoutParams = this.f19803a.f19793i.getLayoutParams();
            layoutParams.height = -2;
            layoutParams.width = -2;
            this.f19803a.f19793i.setLayoutParams(layoutParams);
            this.f19803a.f19791g.getViewTreeObserver().addOnGlobalLayoutListener(this.f19815n);
        }
    }

    /* renamed from: k */
    private boolean m24141k() {
        return "wrap_content".equals(this.f19816o);
    }

    private int getContentWidth() {
        return this.f19817p;
    }

    private int getMaxContentWidth() {
        return this.f19818q;
    }

    private int getMaxContentHeight() {
        return this.f19819r;
    }

    protected void onMeasure(int i, int i2) {
        int i3;
        int size = MeasureSpec.getSize(i);
        int i4 = 0;
        if (this.f19804b == null || this.f19804b.f22067g == 0 || this.f19804b.f22068h == 0) {
            i3 = size;
        } else {
            float f = (((float) this.f19804b.f22068h) * 1.0f) / ((float) this.f19804b.f22067g);
            i3 = djh.m27572a(getContext(), this.f19804b.f22067g);
            if (m24141k() && i3 < size) {
                i4 = djh.m27572a(getContext(), this.f19804b.f22068h);
            } else if (getContentWidth() > 0) {
                f = (((float) size) * 1.0f) / ((float) getContentWidth());
                i3 = getContentWidth();
                i4 = (int) ((((float) null) * 1.0f) / f);
            } else {
                i4 = (int) (((float) size) * f);
                i3 = size;
            }
            if (getMaxContentHeight() > 0 && i4 > getMaxContentHeight()) {
                f = (((float) i4) * 1.0f) / ((float) getMaxContentHeight());
                i4 = getMaxContentHeight();
                i3 = (int) ((((float) i3) * 1.0f) / f);
            }
            if (getMaxContentWidth() > 0 && i3 > getMaxContentWidth()) {
                f = (((float) i3) * 1.0f) / ((float) getMaxContentWidth());
                i3 = getMaxContentWidth();
                i4 = (int) ((((float) i4) * 1.0f) / f);
            }
        }
        if (i3 != size) {
            i = MeasureSpec.makeMeasureSpec(i3, 1073741824);
            setMeasuredDimension(i3, i4);
        }
        super.onMeasure(i, i2);
    }

    /* renamed from: a */
    private void m24126a(AttributeSet attributeSet) {
        Context context = getContext();
        m24125a(context, attributeSet);
        View inflate = View.inflate(context, C4944d.uiv, null);
        this.f19803a = new C4502h(this);
        this.f19803a.m24118a(inflate);
        this.f19803a.m24116a((OnClickListener) this);
        this.f19803a.m24117a((OnLongClickListener) this);
        this.f19803a.f19791g.setTag(C4943c.mp4_view_on_stop_listener, new C4501g());
        addView(inflate);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    private void m24125a(Context r4, AttributeSet r5) {
        /*
        r3 = this;
        r2 = 0;
        if (r5 != 0) goto L_0x0004;
    L_0x0003:
        return;
    L_0x0004:
        r0 = r4.getTheme();
        r1 = p000.dkc.C4945e.uiv;
        r1 = r0.obtainStyledAttributes(r5, r1, r2, r2);
        r0 = p000.dkc.C4945e.uiv_contentWidth;	 Catch:{ Exception -> 0x0035, all -> 0x003a }
        r0 = r1.getString(r0);	 Catch:{ Exception -> 0x0035, all -> 0x003a }
        r3.f19816o = r0;	 Catch:{ Exception -> 0x0035, all -> 0x003a }
        r0 = p000.dkc.C4945e.uiv_contentWidth;	 Catch:{ Exception -> 0x003f, all -> 0x003a }
        r2 = 0;
        r0 = r1.getDimensionPixelSize(r0, r2);	 Catch:{ Exception -> 0x003f, all -> 0x003a }
        r3.f19817p = r0;	 Catch:{ Exception -> 0x003f, all -> 0x003a }
    L_0x001f:
        r0 = p000.dkc.C4945e.uiv_maxContentWidth;	 Catch:{ Exception -> 0x0035, all -> 0x003a }
        r2 = 0;
        r0 = r1.getDimensionPixelSize(r0, r2);	 Catch:{ Exception -> 0x0035, all -> 0x003a }
        r3.f19818q = r0;	 Catch:{ Exception -> 0x0035, all -> 0x003a }
        r0 = p000.dkc.C4945e.uiv_maxContentHeight;	 Catch:{ Exception -> 0x0035, all -> 0x003a }
        r2 = 0;
        r0 = r1.getDimensionPixelSize(r0, r2);	 Catch:{ Exception -> 0x0035, all -> 0x003a }
        r3.f19819r = r0;	 Catch:{ Exception -> 0x0035, all -> 0x003a }
        r1.recycle();
        goto L_0x0003;
    L_0x0035:
        r0 = move-exception;
        r1.recycle();
        goto L_0x0003;
    L_0x003a:
        r0 = move-exception;
        r1.recycle();
        throw r0;
    L_0x003f:
        r0 = move-exception;
        goto L_0x001f;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sept.android.lib.widget.uiv.UniversalImageView.a(android.content.Context, android.util.AttributeSet):void");
    }

    public void setAdapter(dlm dlm) {
        if (dlm == null) {
            m24159f();
            this.f19804b = null;
            return;
        }
        if (dlm.f22063c) {
            this.f19803a.f19794j.setVisibility(0);
            int dimensionPixelSize = getResources().getDimensionPixelSize(C4941a.cover_padding);
            this.f19803a.f19799o.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
            if (dlm.f22077q != null) {
                this.f19803a.f19796l.setText(dlm.f22077q);
            }
        } else {
            this.f19803a.f19794j.setVisibility(8);
            this.f19803a.f19799o.setPadding(0, 0, 0, 0);
        }
        LayoutParams layoutParams;
        if (dlm.f22080t) {
            layoutParams = this.f19803a.f19800p.getLayoutParams();
            layoutParams.height = -1;
            this.f19803a.f19800p.setLayoutParams(layoutParams);
        } else {
            layoutParams = this.f19803a.f19800p.getLayoutParams();
            layoutParams.height = -2;
            this.f19803a.f19800p.setLayoutParams(layoutParams);
        }
        if (dlm.f22065e != -1) {
            this.f19803a.f19786b.setImageResource(dlm.f22065e);
        } else {
            this.f19803a.f19786b.setImageBitmap(null);
        }
        if (dlm.f22066f != -1) {
            this.f19803a.f19787c.setImageResource(dlm.f22066f);
            this.f19803a.f19787c.setVisibility(8);
        } else {
            this.f19803a.f19787c.setImageBitmap(null);
        }
        this.f19803a.f19785a.setEnabledGesture(dlm.f22083w);
        this.f19803a.f19785a.setBoundedHeight(dlm.f22079s);
        dlf.m27823b(this.f19803a.f19791g, dlm.f22079s);
        this.f19803a.f19790f.setVisibility(4);
        if (dlm.f22064d == C4497b.ANIMATED) {
            dlf.m27826c(this.f19803a.f19791g, dlm.f22084x);
            if (dlm.f22084x) {
                ((TextureMp4PlayerView) this.f19803a.f19791g).m24037b(this.f19814m);
                this.f19814m.m27898a(dlm);
                this.f19814m.m27896a();
                ((TextureMp4PlayerView) this.f19803a.f19791g).m24034a(this.f19814m);
            }
            this.f19803a.f19797m.setVisibility(8);
            this.f19803a.f19798n.setVisibility(8);
            this.f19803a.f19789e.setVisibility(dlm.f22059I ? 0 : 4);
            if (dlm.f22059I) {
                this.f19803a.f19789e.setText(dlm.f22058H);
            }
            m24124a(dlm.f22067g, dlm.f22068h);
            if (this.f19804b == null || !dlm.f22075o.equals(this.f19804b.f22075o)) {
                m24144n();
                this.f19803a.f19786b.setVisibility(0);
                if (!(this.f19804b == null || this.f19804b.f22075o == null)) {
                    f19802c.remove(this.f19804b.f22075o);
                }
            }
            this.f19803a.f19791g.setTag(C4943c.universal_image_view_mp4_uri, dlm.f22075o);
        } else {
            m24124a(dlm.f22067g, dlm.f22068h);
            dle.m27812a(this.f19803a.f19791g);
            this.f19803a.f19792h.setVisibility(8);
            this.f19803a.f19785a.setVisibility(0);
            this.f19803a.f19789e.setVisibility(8);
            if (dlm.f22065e != -1) {
                this.f19803a.f19786b.setVisibility(0);
            } else {
                this.f19803a.f19786b.setVisibility(8);
            }
            this.f19803a.f19791g.setTag(C4943c.universal_image_view_mp4_uri, null);
        }
        this.f19803a.f19791g.requestLayout();
        this.f19804b = dlm;
        this.f19803a.f19785a.setVisibility(0);
        if (this.f19804b.f22081u) {
            this.f19803a.f19797m.setVisibility(0);
            if (this.f19804b.f22064d == C4497b.ANIMATED) {
                this.f19803a.f19797m.setVisibility(8);
            }
        } else {
            this.f19803a.f19797m.setVisibility(8);
        }
        m24130a(dlm);
        requestLayout();
    }

    /* renamed from: a */
    private void m24130a(dlm dlm) {
        C4483c c4483c = new C4483c(dlm.f22069i, dlm.f22067g, dlm.f22068h, dlm.f22072l);
        if (dlm.f22074n) {
            c4483c.m24078a();
        }
        c4483c.m24082a(dlm.m27885b());
        c4483c.m24080a(dlm.f22053C);
        c4483c.m24083a(dlm.f22055E);
        c4483c.m24079a(dlm.f22073m);
        c4483c.m24081a(dlm.f22054D);
        this.f19803a.f19785a.setAggregateUniversalImageViewProgressListener(this);
        this.f19803a.f19785a.setAdapter(c4483c);
        this.f19803a.f19785a.setFillParentHeight(dlm.f22080t);
        this.f19803a.f19785a.setDimension(dlm.f22067g, dlm.f22068h);
        this.f19803a.f19785a.setAllowZooming(dlm.f22082v);
        this.f19803a.f19785a.setScrollingBottomOffset(dlm.f22071k);
        this.f19803a.f19785a.setScrollingTopOffset(dlm.f22070j);
        if (this.f19804b.f22064d == C4497b.ANIMATED) {
            this.f19806e = false;
            if (!TextUtils.isEmpty(dlm.f22076p)) {
                this.f19803a.f19785a.getViewTreeObserver().addOnPreDrawListener(new C4496a(this, dlm.f22076p, false, dlm.f22059I));
            }
        }
    }

    /* renamed from: a */
    void m24150a(OnPreDrawListener onPreDrawListener) {
        if (this.f19803a != null) {
            try {
                this.f19803a.f19785a.getViewTreeObserver().removeOnPreDrawListener(onPreDrawListener);
            } catch (Exception e) {
            }
        }
    }

    public void setIsViewAttached(boolean z) {
        this.f19807f = z;
    }

    /* renamed from: a */
    public boolean m24154a() {
        return this.f19806e;
    }

    public void setIsPendingStart(boolean z) {
        this.f19806e = z;
    }

    /* renamed from: a */
    private void m24124a(int i, int i2) {
        dlf.m27817a(this.f19803a.f19791g, i, i2, false);
    }

    /* renamed from: b */
    public void m24155b() {
        m24134b(false);
    }

    /* renamed from: c */
    public void m24156c() {
        m24134b(true);
    }

    /* renamed from: d */
    public void m24157d() {
        if (this.f19804b != null && this.f19804b.f22064d == C4497b.ANIMATED) {
            if (dlf.m27821a(this.f19803a.f19791g)) {
                this.f19803a.f19786b.setVisibility(8);
                this.f19803a.f19785a.setVisibility(8);
                this.f19803a.f19792h.setVisibility(8);
                return;
            }
            m24145o();
        }
    }

    /* renamed from: b */
    private void m24134b(boolean z) {
        Object obj = 1;
        if (this.f19804b != null) {
            Object obj2 = (this.f19804b.f22064d != C4497b.ANIMATED || this.f19804b.f22059I) ? null : 1;
            if (!(this.f19804b.f22064d == C4497b.ANIMATED && this.f19804b.f22059I)) {
                obj = null;
            }
            if ((z && r1 != null) || (!z && obj2 != null)) {
                if (dlf.m27821a(this.f19803a.f19791g)) {
                    this.f19803a.f19786b.setVisibility(8);
                    this.f19803a.f19785a.setVisibility(8);
                    this.f19803a.f19792h.setVisibility(8);
                    return;
                }
                m24145o();
            }
        }
    }

    /* renamed from: e */
    public void m24158e() {
        if (this.f19804b != null && this.f19804b.f22064d == C4497b.ANIMATED) {
            m24136c(false);
            m24144n();
        }
    }

    /* renamed from: l */
    private void m24142l() {
        if (!dlf.m27821a(this.f19803a.f19791g)) {
            m24146p();
        } else if (this.f19804b.f22059I) {
            m24147q();
        } else {
            m24143m();
        }
    }

    /* renamed from: c */
    private void m24136c(boolean z) {
        this.f19808g = true;
        if (this.f19804b != null && this.f19803a != null && this.f19804b.f22064d == C4497b.ANIMATED) {
            this.f19803a.f19786b.setVisibility(0);
            if (!z) {
                this.f19803a.f19785a.setVisibility(0);
            }
            if (!z) {
                this.f19803a.f19792h.setVisibility(0);
            }
        }
    }

    public View getPlayerView() {
        return this.f19803a.f19791g;
    }

    /* renamed from: m */
    private void m24143m() {
        if (this.f19804b.f22059I) {
            m24147q();
            return;
        }
        this.f19806e = false;
        this.f19805d = 0;
        this.f19809h.removeCallbacks(this.f19810i);
        m24136c(true);
        dle.m27815b(this.f19803a.f19791g);
        m24139d(true);
    }

    /* renamed from: n */
    private void m24144n() {
        this.f19806e = false;
        this.f19805d = 0;
        this.f19809h.removeCallbacks(this.f19810i);
        m24136c(false);
        dle.m27812a(this.f19803a.f19791g);
        m24139d(true);
    }

    /* renamed from: o */
    private void m24145o() {
        this.f19805d = djw.m27632a();
        m24131a(false, false);
        if (this.f19804b.f22059I) {
            setMuted(true);
        }
    }

    /* renamed from: p */
    private void m24146p() {
        this.f19805d = djw.m27632a();
        m24131a(false, true);
        if (this.f19804b.f22059I) {
            setMuted(false);
        }
    }

    /* renamed from: d */
    private void m24139d(boolean z) {
        int i = 4;
        this.f19809h.removeCallbacks(this.f19811j);
        this.f19809h.removeCallbacks(this.f19813l);
        this.f19803a.f19789e.clearAnimation();
        this.f19803a.f19789e.setAlpha(1.0f);
        if (z) {
            this.f19803a.f19790f.setVisibility(4);
            this.f19803a.f19798n.setVisibility(4);
            return;
        }
        ImageView imageView = this.f19803a.f19790f;
        if (this.f19804b.f22059I) {
            i = 0;
        }
        imageView.setVisibility(i);
        this.f19809h.post(this.f19811j);
        this.f19809h.postDelayed(this.f19813l, 3000);
        if (m24148r()) {
            this.f19809h.postDelayed(this.f19812k, 500);
        }
    }

    /* renamed from: a */
    public void m24153a(boolean z) {
        if (this.f19803a != null) {
            this.f19803a.f19798n.setVisibility(z ? 0 : 4);
        }
    }

    /* renamed from: a */
    private void m24131a(boolean z, final boolean z2) {
        if (!m24148r()) {
            this.f19803a.f19786b.setVisibility(4);
        }
        if (this.f19804b.f22076p != null) {
            this.f19809h.removeCallbacks(this.f19810i);
            this.f19809h.postDelayed(this.f19810i, 1000);
            String str = this.f19804b.f22075o;
            if (this.f19804b.f22055E != null) {
                str = this.f19804b.f22055E.mo4407a(str);
            }
            String str2 = this.f19804b.f22076p;
            if (dln.m27890a(str, str2) || z) {
                if (this.f19807f) {
                    m24152a(this.f19803a, str2, z2, this.f19804b.f22059I);
                    m24139d(false);
                    return;
                }
                this.f19806e = true;
            } else if (!m24148r() && this.f19807f && this.f19804b.f22060J) {
                m24152a(this.f19803a, str, z2, this.f19804b.f22059I);
                m24139d(false);
            } else {
                dln.m27888a(getContext()).m27895a(str, str2, dlm.m27883a());
                f19802c.put(str, new Runnable(this) {
                    /* renamed from: c */
                    final /* synthetic */ UniversalImageView f19769c;

                    public void run() {
                        Object tag = this.f19769c.f19803a.f19791g.getTag(C4943c.universal_image_view_mp4_uri);
                        if (tag != null && (tag instanceof String) && tag.equals(str)) {
                            this.f19769c.f19803a.f19797m.setVisibility(0);
                            C4974a a = dln.m27887a(tag.toString());
                            if (a != null) {
                                this.f19769c.mo4088a(a.f22093b, a.f22092a);
                                this.f19769c.post(this);
                                return;
                            } else if (tag.equals(str)) {
                                this.f19769c.m24131a(true, z2);
                                UniversalImageView.f19802c.remove(str);
                                return;
                            } else {
                                return;
                            }
                        }
                        this.f19769c.f19803a.f19797m.setVisibility(8);
                        UniversalImageView.f19802c.remove(str);
                    }
                });
                Object tag = this.f19803a.f19791g.getTag(C4943c.universal_image_view_mp4_uri);
                if (tag != null && (tag instanceof String) && tag.equals(str)) {
                    Runnable runnable = (Runnable) f19802c.get(tag);
                    if (runnable != null) {
                        post(runnable);
                        return;
                    }
                    return;
                }
                post(new C44936(this));
            }
        }
    }

    /* renamed from: f */
    public void m24159f() {
        this.f19803a.f19794j.setVisibility(8);
        this.f19803a.f19785a.setAdapter(null);
        this.f19803a.f19791g.setVisibility(8);
    }

    public void onClick(View view) {
        int id = view.getId();
        if (id == C4943c.image || id == C4943c.imageContainer) {
            m24132b(view);
        } else if (id == C4943c.gifView) {
            m24127a(view);
        } else if (id == C4943c.retryImage) {
            m24135c(view);
        } else if (id == C4943c.soundToggle) {
            m24147q();
        }
    }

    public boolean onLongClick(View view) {
        if (!(this.f19804b == null || this.f19804b.f22051A == null)) {
            this.f19804b.f22051A.mo3750a(view, this.f19804b, this);
        }
        return false;
    }

    /* renamed from: a */
    private void m24127a(View view) {
        if (this.f19804b != null && this.f19804b.f22064d == C4497b.ANIMATED && this.f19804b.f22078r) {
            m24142l();
        }
    }

    /* renamed from: b */
    private void m24132b(View view) {
        if (this.f19804b != null) {
            if (view.getId() == C4943c.image) {
                if (this.f19804b.f22064d == C4497b.ANIMATED && this.f19804b.f22078r) {
                    m24142l();
                }
                if (this.f19803a.f19787c.getVisibility() == 0 && this.f19804b.f22066f != -1) {
                    m24135c(view);
                    return;
                }
            }
            if (this.f19804b.f22086z != null) {
                this.f19804b.f22086z.mo3751a(view, this.f19804b, this);
            }
        }
    }

    /* renamed from: c */
    private void m24135c(View view) {
        if (this.f19804b != null) {
            this.f19803a.f19787c.setVisibility(8);
            m24159f();
            m24130a(this.f19804b);
        }
    }

    /* renamed from: q */
    private void m24147q() {
        setMuted(!this.f19808g);
    }

    private void setMuted(boolean z) {
        this.f19808g = z;
        this.f19803a.f19790f.setImageResource(z ? C4942b.ic_sound_off_white : C4942b.ic_sound_on_white);
        dlf.m27820a(this.f19803a.f19791g, z);
    }

    /* renamed from: a */
    public void m24151a(C4499f c4499f) {
        if (c4499f != null) {
            Context context = getContext();
            this.f19803a.f19797m.setProgressDrawable(c4499f.mo4359a(context));
            this.f19803a.f19785a.setBackgroundDrawable(c4499f.mo4361b(context));
            this.f19803a.f19792h.setBackgroundResource(c4499f.mo4358a());
            this.f19803a.f19796l.setTextColor(ew.c(context, c4499f.mo4360b()));
            this.f19803a.f19796l.setBackgroundColor(ew.c(context, c4499f.mo4362c()));
            this.f19803a.f19795k.setBackgroundDrawable(c4499f.mo4363c(context));
        }
    }

    /* renamed from: a */
    public void mo4088a(long j, long j2) {
        if (m24148r()) {
            int i = (int) ((((float) j) / (((float) j2) + 0.0f)) * 100.0f);
            if (i <= 0) {
                i = 1;
            }
            this.f19803a.f19797m.setProgress(i);
        }
    }

    /* renamed from: g */
    public void mo4089g() {
        if (this.f19804b != null) {
            if (m24148r()) {
                this.f19803a.f19797m.setVisibility(8);
                this.f19803a.f19797m.setProgress(100);
            }
            if (this.f19804b.f22081u) {
                this.f19803a.f19798n.setVisibility(8);
            }
        }
    }

    /* renamed from: h */
    public void mo4090h() {
        if (this.f19804b != null && m24148r() && this.f19804b.f22081u) {
            this.f19803a.f19797m.setProgress(0);
            this.f19803a.f19797m.setVisibility(0);
        }
        if (this.f19804b != null && this.f19804b.f22066f != -1) {
            this.f19803a.f19787c.setVisibility(8);
        }
    }

    /* renamed from: i */
    public void mo4091i() {
        if (this.f19804b != null) {
            this.f19803a.f19787c.setVisibility(0);
        }
    }

    /* renamed from: r */
    private boolean m24148r() {
        return VERSION.SDK_INT == 23;
    }

    /* renamed from: a */
    public void m24152a(final C4502h c4502h, String str, boolean z, final boolean z2) {
        if (c4502h != null && c4502h.f19791g != null && c4502h.f19785a != null && !TextUtils.isEmpty(str)) {
            dlf.m27819a(c4502h.f19791g, str);
            if (z) {
                dle.m27816b(c4502h.f19791g, new Runnable(this) {
                    /* renamed from: c */
                    final /* synthetic */ UniversalImageView f19773c;

                    public void run() {
                        int i = 8;
                        c4502h.f19786b.setVisibility(8);
                        c4502h.f19797m.setVisibility(8);
                        ImageView imageView = c4502h.f19790f;
                        if (z2) {
                            i = 0;
                        }
                        imageView.setVisibility(i);
                        dlf.m27820a(c4502h.f19791g, false);
                    }
                });
            } else {
                dle.m27813a(c4502h.f19791g, new Runnable(this) {
                    /* renamed from: c */
                    final /* synthetic */ UniversalImageView f19776c;

                    public void run() {
                        int i = 8;
                        c4502h.f19786b.setVisibility(8);
                        c4502h.f19797m.setVisibility(8);
                        ImageView imageView = c4502h.f19790f;
                        if (z2) {
                            i = 0;
                        }
                        imageView.setVisibility(i);
                        dlf.m27820a(c4502h.f19791g, true);
                    }
                });
            }
        }
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f19809h.removeCallbacks(this.f19810i);
        m24136c(false);
        m24144n();
        if (this.f19803a == null) {
            return;
        }
        if (VERSION.SDK_INT >= 16) {
            this.f19803a.f19793i.getViewTreeObserver().removeOnGlobalLayoutListener(this.f19815n);
        } else {
            this.f19803a.f19793i.getViewTreeObserver().removeGlobalOnLayoutListener(this.f19815n);
        }
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        this.f19809h.removeCallbacks(this.f19810i);
        if (!z) {
            m24144n();
        }
    }
}
