package com.p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.CoordinatorLayout.Behavior;
import android.support.design.widget.CoordinatorLayout.C0346c;
import android.support.design.widget.SwipeDismissBehavior;
import android.support.design.widget.SwipeDismissBehavior.C0359a;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import com.facebook.imagepipeline.common.RotationOptions;
import java.util.ArrayList;
import java.util.List;
import p000.C3589n.C3588k;
import p000.C5792w;
import p000.ak.C0239a;

/* compiled from: BaseTransientBottomBar */
/* renamed from: w */
public abstract class C5792w<B extends C5792w<B>> {
    /* renamed from: a */
    static final Handler f25822a = new Handler(Looper.getMainLooper(), new C57761());
    /* renamed from: b */
    protected final C5791f f25823b;
    /* renamed from: c */
    final C0239a f25824c = new C57794(this);
    /* renamed from: d */
    private final ViewGroup f25825d;
    /* renamed from: e */
    private final Context f25826e;
    /* renamed from: f */
    private final C5790c f25827f;
    /* renamed from: g */
    private int f25828g;
    /* renamed from: h */
    private List<C5788a<B>> f25829h;
    /* renamed from: i */
    private final AccessibilityManager f25830i;

    /* compiled from: BaseTransientBottomBar */
    /* renamed from: w$1 */
    static class C57761 implements Callback {
        C57761() {
        }

        public boolean handleMessage(Message message) {
            switch (message.what) {
                case 0:
                    ((C5792w) message.obj).m34600c();
                    return true;
                case 1:
                    ((C5792w) message.obj).m34601c(message.arg1);
                    return true;
                default:
                    return false;
            }
        }
    }

    /* compiled from: BaseTransientBottomBar */
    /* renamed from: w$3 */
    class C57783 implements iu {
        /* renamed from: a */
        final /* synthetic */ C5792w f25811a;

        C57783(C5792w c5792w) {
            this.f25811a = c5792w;
        }

        /* renamed from: a */
        public kb m34572a(View view, kb kbVar) {
            view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), kbVar.d());
            return kbVar;
        }
    }

    /* compiled from: BaseTransientBottomBar */
    /* renamed from: w$4 */
    class C57794 implements C0239a {
        /* renamed from: a */
        final /* synthetic */ C5792w f25812a;

        C57794(C5792w c5792w) {
            this.f25812a = c5792w;
        }

        /* renamed from: a */
        public void m34573a() {
            C5792w.f25822a.sendMessage(C5792w.f25822a.obtainMessage(0, this.f25812a));
        }

        /* renamed from: a */
        public void m34574a(int i) {
            C5792w.f25822a.sendMessage(C5792w.f25822a.obtainMessage(1, i, 0, this.f25812a));
        }
    }

    /* compiled from: BaseTransientBottomBar */
    /* renamed from: w$5 */
    class C57805 implements C0359a {
        /* renamed from: a */
        final /* synthetic */ C5792w f25813a;

        C57805(C5792w c5792w) {
            this.f25813a = c5792w;
        }

        /* renamed from: a */
        public void m34576a(View view) {
            view.setVisibility(8);
            this.f25813a.m34598b(0);
        }

        /* renamed from: a */
        public void m34575a(int i) {
            switch (i) {
                case 0:
                    ak.a().d(this.f25813a.f25824c);
                    return;
                case 1:
                case 2:
                    ak.a().c(this.f25813a.f25824c);
                    return;
                default:
                    return;
            }
        }
    }

    /* compiled from: BaseTransientBottomBar */
    /* renamed from: w$d */
    interface C5782d {
        /* renamed from: a */
        void mo5586a(View view);

        /* renamed from: b */
        void mo5587b(View view);
    }

    /* compiled from: BaseTransientBottomBar */
    /* renamed from: w$6 */
    class C57836 implements C5782d {
        /* renamed from: a */
        final /* synthetic */ C5792w f25815a;

        /* compiled from: BaseTransientBottomBar */
        /* renamed from: w$6$1 */
        class C57811 implements Runnable {
            /* renamed from: a */
            final /* synthetic */ C57836 f25814a;

            C57811(C57836 c57836) {
                this.f25814a = c57836;
            }

            public void run() {
                this.f25814a.f25815a.m34603d(3);
            }
        }

        C57836(C5792w c5792w) {
            this.f25815a = c5792w;
        }

        /* renamed from: a */
        public void mo5586a(View view) {
        }

        /* renamed from: b */
        public void mo5587b(View view) {
            if (this.f25815a.m34599b()) {
                C5792w.f25822a.post(new C57811(this));
            }
        }
    }

    /* compiled from: BaseTransientBottomBar */
    /* renamed from: w$e */
    interface C5784e {
        /* renamed from: a */
        void mo5588a(View view, int i, int i2, int i3, int i4);
    }

    /* compiled from: BaseTransientBottomBar */
    /* renamed from: w$7 */
    class C57857 implements C5784e {
        /* renamed from: a */
        final /* synthetic */ C5792w f25816a;

        C57857(C5792w c5792w) {
            this.f25816a = c5792w;
        }

        /* renamed from: a */
        public void mo5588a(View view, int i, int i2, int i3, int i4) {
            this.f25816a.f25823b.setOnLayoutChangeListener(null);
            if (this.f25816a.m34605f()) {
                this.f25816a.m34602d();
            } else {
                this.f25816a.m34604e();
            }
        }
    }

    /* compiled from: BaseTransientBottomBar */
    /* renamed from: w$8 */
    class C57868 extends jz {
        /* renamed from: a */
        final /* synthetic */ C5792w f25817a;

        C57868(C5792w c5792w) {
            this.f25817a = c5792w;
        }

        /* renamed from: a */
        public void mo3877a(View view) {
            this.f25817a.f25827f.m34590a(70, RotationOptions.ROTATE_180);
        }

        /* renamed from: b */
        public void mo3878b(View view) {
            this.f25817a.m34604e();
        }
    }

    /* compiled from: BaseTransientBottomBar */
    /* renamed from: w$9 */
    class C57879 implements AnimationListener {
        /* renamed from: a */
        final /* synthetic */ C5792w f25818a;

        C57879(C5792w c5792w) {
            this.f25818a = c5792w;
        }

        public void onAnimationEnd(Animation animation) {
            this.f25818a.m34604e();
        }

        public void onAnimationStart(Animation animation) {
        }

        public void onAnimationRepeat(Animation animation) {
        }
    }

    /* compiled from: BaseTransientBottomBar */
    /* renamed from: w$a */
    public static abstract class C5788a<B> {
        /* renamed from: a */
        public void m34586a(B b, int i) {
        }

        /* renamed from: a */
        public void m34585a(B b) {
        }
    }

    /* compiled from: BaseTransientBottomBar */
    /* renamed from: w$b */
    final class C5789b extends SwipeDismissBehavior<C5791f> {
        /* renamed from: a */
        final /* synthetic */ C5792w f25819a;

        C5789b(C5792w c5792w) {
            this.f25819a = c5792w;
        }

        /* renamed from: a */
        public boolean m34589a(View view) {
            return view instanceof C5791f;
        }

        /* renamed from: a */
        public boolean m34588a(CoordinatorLayout coordinatorLayout, C5791f c5791f, MotionEvent motionEvent) {
            switch (motionEvent.getActionMasked()) {
                case 0:
                    if (coordinatorLayout.a(c5791f, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                        ak.a().c(this.f25819a.f25824c);
                        break;
                    }
                    break;
                case 1:
                case 3:
                    ak.a().d(this.f25819a.f25824c);
                    break;
            }
            return super.a(coordinatorLayout, c5791f, motionEvent);
        }
    }

    /* compiled from: BaseTransientBottomBar */
    /* renamed from: w$c */
    public interface C5790c {
        /* renamed from: a */
        void m34590a(int i, int i2);

        /* renamed from: b */
        void m34591b(int i, int i2);
    }

    /* compiled from: BaseTransientBottomBar */
    /* renamed from: w$f */
    public static class C5791f extends FrameLayout {
        /* renamed from: a */
        private C5784e f25820a;
        /* renamed from: b */
        private C5782d f25821b;

        protected C5791f(Context context) {
            this(context, null);
        }

        protected C5791f(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C3588k.SnackbarLayout);
            if (obtainStyledAttributes.hasValue(C3588k.SnackbarLayout_elevation)) {
                jd.h(this, (float) obtainStyledAttributes.getDimensionPixelSize(C3588k.SnackbarLayout_elevation, 0));
            }
            obtainStyledAttributes.recycle();
            setClickable(true);
        }

        protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            if (this.f25820a != null) {
                this.f25820a.mo5588a(this, i, i2, i3, i4);
            }
        }

        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            if (this.f25821b != null) {
                this.f25821b.mo5586a(this);
            }
            jd.y(this);
        }

        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            if (this.f25821b != null) {
                this.f25821b.mo5587b(this);
            }
        }

        void setOnLayoutChangeListener(C5784e c5784e) {
            this.f25820a = c5784e;
        }

        void setOnAttachStateChangeListener(C5782d c5782d) {
            this.f25821b = c5782d;
        }
    }

    protected C5792w(ViewGroup viewGroup, View view, C5790c c5790c) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null parent");
        } else if (view == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null content");
        } else if (c5790c == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null callback");
        } else {
            this.f25825d = viewGroup;
            this.f25827f = c5790c;
            this.f25826e = viewGroup.getContext();
            am.a(this.f25826e);
            this.f25823b = (C5791f) LayoutInflater.from(this.f25826e).inflate(n$h.design_layout_snackbar, this.f25825d, false);
            this.f25823b.addView(view);
            jd.d(this.f25823b, 1);
            jd.c(this.f25823b, 1);
            jd.a(this.f25823b, true);
            jd.a(this.f25823b, new C57783(this));
            this.f25830i = (AccessibilityManager) this.f25826e.getSystemService("accessibility");
        }
    }

    /* renamed from: a */
    public B m34594a(int i) {
        this.f25828g = i;
        return this;
    }

    /* renamed from: a */
    public void m34596a() {
        ak.a().a(this.f25828g, this.f25824c);
    }

    /* renamed from: b */
    public void m34598b(int i) {
        ak.a().a(this.f25824c, i);
    }

    /* renamed from: a */
    public B m34595a(C5788a<B> c5788a) {
        if (c5788a != null) {
            if (this.f25829h == null) {
                this.f25829h = new ArrayList();
            }
            this.f25829h.add(c5788a);
        }
        return this;
    }

    /* renamed from: b */
    public B m34597b(C5788a<B> c5788a) {
        if (!(c5788a == null || this.f25829h == null)) {
            this.f25829h.remove(c5788a);
        }
        return this;
    }

    /* renamed from: b */
    public boolean m34599b() {
        return ak.a().e(this.f25824c);
    }

    /* renamed from: c */
    final void m34600c() {
        if (this.f25823b.getParent() == null) {
            LayoutParams layoutParams = this.f25823b.getLayoutParams();
            if (layoutParams instanceof C0346c) {
                C0346c c0346c = (C0346c) layoutParams;
                Behavior c5789b = new C5789b(this);
                c5789b.a(0.1f);
                c5789b.b(0.6f);
                c5789b.a(0);
                c5789b.a(new C57805(this));
                c0346c.a(c5789b);
                c0346c.f2307g = 80;
            }
            this.f25825d.addView(this.f25823b);
        }
        this.f25823b.setOnAttachStateChangeListener(new C57836(this));
        if (!jd.H(this.f25823b)) {
            this.f25823b.setOnLayoutChangeListener(new C57857(this));
        } else if (m34605f()) {
            m34602d();
        } else {
            m34604e();
        }
    }

    /* renamed from: d */
    void m34602d() {
        if (VERSION.SDK_INT >= 14) {
            jd.b(this.f25823b, (float) this.f25823b.getHeight());
            jd.r(this.f25823b).m31860c(0.0f).m31854a(C5775v.f25657b).m31853a(250).m31855a(new C57868(this)).m31861c();
            return;
        }
        Animation loadAnimation = AnimationUtils.loadAnimation(this.f25823b.getContext(), n$a.design_snackbar_in);
        loadAnimation.setInterpolator(C5775v.f25657b);
        loadAnimation.setDuration(250);
        loadAnimation.setAnimationListener(new C57879(this));
        this.f25823b.startAnimation(loadAnimation);
    }

    /* renamed from: e */
    private void m34593e(final int i) {
        if (VERSION.SDK_INT >= 14) {
            jd.r(this.f25823b).m31860c((float) this.f25823b.getHeight()).m31854a(C5775v.f25657b).m31853a(250).m31855a(new jz(this) {
                /* renamed from: b */
                final /* synthetic */ C5792w f25808b;

                /* renamed from: a */
                public void mo3877a(View view) {
                    this.f25808b.f25827f.m34591b(0, RotationOptions.ROTATE_180);
                }

                /* renamed from: b */
                public void mo3878b(View view) {
                    this.f25808b.m34603d(i);
                }
            }).m31861c();
            return;
        }
        Animation loadAnimation = AnimationUtils.loadAnimation(this.f25823b.getContext(), n$a.design_snackbar_out);
        loadAnimation.setInterpolator(C5775v.f25657b);
        loadAnimation.setDuration(250);
        loadAnimation.setAnimationListener(new AnimationListener(this) {
            /* renamed from: b */
            final /* synthetic */ C5792w f25810b;

            public void onAnimationEnd(Animation animation) {
                this.f25810b.m34603d(i);
            }

            public void onAnimationStart(Animation animation) {
            }

            public void onAnimationRepeat(Animation animation) {
            }
        });
        this.f25823b.startAnimation(loadAnimation);
    }

    /* renamed from: c */
    final void m34601c(int i) {
        if (m34605f() && this.f25823b.getVisibility() == 0) {
            m34593e(i);
        } else {
            m34603d(i);
        }
    }

    /* renamed from: e */
    void m34604e() {
        ak.a().b(this.f25824c);
        if (this.f25829h != null) {
            for (int size = this.f25829h.size() - 1; size >= 0; size--) {
                ((C5788a) this.f25829h.get(size)).m34585a(this);
            }
        }
    }

    /* renamed from: d */
    void m34603d(int i) {
        ak.a().a(this.f25824c);
        if (this.f25829h != null) {
            for (int size = this.f25829h.size() - 1; size >= 0; size--) {
                ((C5788a) this.f25829h.get(size)).m34586a(this, i);
            }
        }
        if (VERSION.SDK_INT < 11) {
            this.f25823b.setVisibility(8);
        }
        ViewParent parent = this.f25823b.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.f25823b);
        }
    }

    /* renamed from: f */
    boolean m34605f() {
        return !this.f25830i.isEnabled();
    }
}
