package com.p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.design.widget.BottomSheetBehavior;
import android.support.design.widget.BottomSheetBehavior.C0336a;
import android.support.design.widget.CoordinatorLayout;
import android.util.TypedValue;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import com.facebook.common.util.ByteConstants;
import p000.C3589n.C3587j;

/* compiled from: BottomSheetDialog */
/* renamed from: x */
public class C5796x extends mq {
    /* renamed from: a */
    boolean f25950a = true;
    /* renamed from: b */
    private BottomSheetBehavior<FrameLayout> f25951b;
    /* renamed from: c */
    private boolean f25952c = true;
    /* renamed from: d */
    private boolean f25953d;
    /* renamed from: e */
    private C0336a f25954e = new C57953(this);

    /* compiled from: BottomSheetDialog */
    /* renamed from: x$1 */
    class C57931 implements View.OnClickListener {
        /* renamed from: a */
        final /* synthetic */ C5796x f25947a;

        C57931(C5796x c5796x) {
            this.f25947a = c5796x;
        }

        public void onClick(View view) {
            if (this.f25947a.f25950a && this.f25947a.isShowing() && this.f25947a.m34745a()) {
                this.f25947a.cancel();
            }
        }
    }

    /* compiled from: BottomSheetDialog */
    /* renamed from: x$2 */
    class C57942 extends hu {
        /* renamed from: a */
        final /* synthetic */ C5796x f25948a;

        C57942(C5796x c5796x) {
            this.f25948a = c5796x;
        }

        /* renamed from: a */
        public void m34739a(View view, kg kgVar) {
            super.a(view, kgVar);
            if (this.f25948a.f25950a) {
                kgVar.m32141a((int) ByteConstants.MB);
                kgVar.m32181m(true);
                return;
            }
            kgVar.m32181m(false);
        }

        /* renamed from: a */
        public boolean m34740a(View view, int i, Bundle bundle) {
            if (i != ByteConstants.MB || !this.f25948a.f25950a) {
                return super.a(view, i, bundle);
            }
            this.f25948a.cancel();
            return true;
        }
    }

    /* compiled from: BottomSheetDialog */
    /* renamed from: x$3 */
    class C57953 extends C0336a {
        /* renamed from: a */
        final /* synthetic */ C5796x f25949a;

        C57953(C5796x c5796x) {
            this.f25949a = c5796x;
        }

        /* renamed from: a */
        public void m34742a(View view, int i) {
            if (i == 5) {
                this.f25949a.cancel();
            }
        }

        /* renamed from: a */
        public void m34741a(View view, float f) {
        }
    }

    public C5796x(Context context, int i) {
        super(context, C5796x.m34743a(context, i));
        m32638a(1);
    }

    public void setContentView(int i) {
        super.setContentView(m34744a(i, null, null));
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setLayout(-1, -1);
    }

    public void setContentView(View view) {
        super.setContentView(m34744a(0, view, null));
    }

    public void setContentView(View view, LayoutParams layoutParams) {
        super.setContentView(m34744a(0, view, layoutParams));
    }

    public void setCancelable(boolean z) {
        super.setCancelable(z);
        if (this.f25950a != z) {
            this.f25950a = z;
            if (this.f25951b != null) {
                this.f25951b.a(z);
            }
        }
    }

    protected void onStart() {
        super.onStart();
        if (this.f25951b != null) {
            this.f25951b.b(4);
        }
    }

    public void setCanceledOnTouchOutside(boolean z) {
        super.setCanceledOnTouchOutside(z);
        if (z && !this.f25950a) {
            this.f25950a = true;
        }
        this.f25952c = z;
        this.f25953d = true;
    }

    /* renamed from: a */
    private View m34744a(int i, View view, LayoutParams layoutParams) {
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) View.inflate(getContext(), n$h.design_bottom_sheet_dialog, null);
        if (i != 0 && view == null) {
            view = getLayoutInflater().inflate(i, coordinatorLayout, false);
        }
        FrameLayout frameLayout = (FrameLayout) coordinatorLayout.findViewById(n$f.design_bottom_sheet);
        this.f25951b = BottomSheetBehavior.a(frameLayout);
        this.f25951b.a(this.f25954e);
        this.f25951b.a(this.f25950a);
        if (layoutParams == null) {
            frameLayout.addView(view);
        } else {
            frameLayout.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(n$f.touch_outside).setOnClickListener(new C57931(this));
        jd.a(frameLayout, new C57942(this));
        return coordinatorLayout;
    }

    /* renamed from: a */
    boolean m34745a() {
        if (!this.f25953d) {
            if (VERSION.SDK_INT < 11) {
                this.f25952c = true;
            } else {
                TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{16843611});
                this.f25952c = obtainStyledAttributes.getBoolean(0, true);
                obtainStyledAttributes.recycle();
            }
            this.f25953d = true;
        }
        return this.f25952c;
    }

    /* renamed from: a */
    private static int m34743a(Context context, int i) {
        if (i != 0) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(n$b.bottomSheetDialogTheme, typedValue, true)) {
            return typedValue.resourceId;
        }
        return C3587j.Theme_Design_Light_BottomSheetDialog;
    }
}
