package com.p000;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.lang.reflect.Method;
import java.util.ArrayList;

@TargetApi(14)
/* compiled from: ViewOverlay */
/* renamed from: cm */
class cm {
    /* renamed from: a */
    protected C1763a f9623a;

    /* compiled from: ViewOverlay */
    /* renamed from: cm$a */
    static class C1763a extends ViewGroup {
        /* renamed from: a */
        static Method f9709a;
        /* renamed from: b */
        ViewGroup f9710b;
        /* renamed from: c */
        View f9711c;
        /* renamed from: d */
        ArrayList<Drawable> f9712d = null;
        /* renamed from: e */
        cm f9713e;

        static {
            try {
                f9709a = ViewGroup.class.getDeclaredMethod("invalidateChildInParentFast", new Class[]{Integer.TYPE, Integer.TYPE, Rect.class});
            } catch (NoSuchMethodException e) {
            }
        }

        C1763a(Context context, ViewGroup viewGroup, View view, cm cmVar) {
            super(context);
            this.f9710b = viewGroup;
            this.f9711c = view;
            setRight(viewGroup.getWidth());
            setBottom(viewGroup.getHeight());
            viewGroup.addView(this);
            this.f9713e = cmVar;
        }

        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            return false;
        }

        /* renamed from: a */
        public void m14436a(Drawable drawable) {
            if (this.f9712d == null) {
                this.f9712d = new ArrayList();
            }
            if (!this.f9712d.contains(drawable)) {
                this.f9712d.add(drawable);
                invalidate(drawable.getBounds());
                drawable.setCallback(this);
            }
        }

        /* renamed from: b */
        public void m14439b(Drawable drawable) {
            if (this.f9712d != null) {
                this.f9712d.remove(drawable);
                invalidate(drawable.getBounds());
                drawable.setCallback(null);
            }
        }

        protected boolean verifyDrawable(Drawable drawable) {
            return super.verifyDrawable(drawable) || (this.f9712d != null && this.f9712d.contains(drawable));
        }

        /* renamed from: a */
        public void m14437a(View view) {
            if (view.getParent() instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (!(viewGroup == this.f9710b || viewGroup.getParent() == null)) {
                    int[] iArr = new int[2];
                    int[] iArr2 = new int[2];
                    viewGroup.getLocationOnScreen(iArr);
                    this.f9710b.getLocationOnScreen(iArr2);
                    jd.m21240f(view, iArr[0] - iArr2[0]);
                    jd.m21237e(view, iArr[1] - iArr2[1]);
                }
                viewGroup.removeView(view);
                if (view.getParent() != null) {
                    viewGroup.removeView(view);
                }
            }
            super.addView(view, getChildCount() - 1);
        }

        /* renamed from: b */
        public void m14440b(View view) {
            super.removeView(view);
            if (m14438a()) {
                this.f9710b.removeView(this);
            }
        }

        /* renamed from: a */
        boolean m14438a() {
            if (getChildCount() == 0 && (this.f9712d == null || this.f9712d.size() == 0)) {
                return true;
            }
            return false;
        }

        public void invalidateDrawable(Drawable drawable) {
            invalidate(drawable.getBounds());
        }

        protected void dispatchDraw(Canvas canvas) {
            int i = 0;
            int[] iArr = new int[2];
            int[] iArr2 = new int[2];
            ViewGroup viewGroup = (ViewGroup) getParent();
            this.f9710b.getLocationOnScreen(iArr);
            this.f9711c.getLocationOnScreen(iArr2);
            canvas.translate((float) (iArr2[0] - iArr[0]), (float) (iArr2[1] - iArr[1]));
            canvas.clipRect(new Rect(0, 0, this.f9711c.getWidth(), this.f9711c.getHeight()));
            super.dispatchDraw(canvas);
            int size = this.f9712d == null ? 0 : this.f9712d.size();
            while (i < size) {
                ((Drawable) this.f9712d.get(i)).draw(canvas);
                i++;
            }
        }

        protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        }

        /* renamed from: a */
        private void m14435a(int[] iArr) {
            int[] iArr2 = new int[2];
            int[] iArr3 = new int[2];
            ViewGroup viewGroup = (ViewGroup) getParent();
            this.f9710b.getLocationOnScreen(iArr2);
            this.f9711c.getLocationOnScreen(iArr3);
            iArr[0] = iArr3[0] - iArr2[0];
            iArr[1] = iArr3[1] - iArr2[1];
        }

        public ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
            if (this.f9710b != null) {
                rect.offset(iArr[0], iArr[1]);
                if (this.f9710b instanceof ViewGroup) {
                    iArr[0] = 0;
                    iArr[1] = 0;
                    int[] iArr2 = new int[2];
                    m14435a(iArr2);
                    rect.offset(iArr2[0], iArr2[1]);
                    return super.invalidateChildInParent(iArr, rect);
                }
                invalidate(rect);
            }
            return null;
        }
    }

    cm(Context context, ViewGroup viewGroup, View view) {
        this.f9623a = new C1763a(context, viewGroup, view, this);
    }

    /* renamed from: c */
    static ViewGroup m14221c(View view) {
        View view2 = view;
        while (view2 != null) {
            if (view2.getId() == 16908290 && (view2 instanceof ViewGroup)) {
                return (ViewGroup) view2;
            }
            if (view2.getParent() instanceof ViewGroup) {
                view2 = (ViewGroup) view2.getParent();
            }
        }
        return null;
    }

    /* renamed from: d */
    public static cm m14222d(View view) {
        ViewGroup c = cm.m14221c(view);
        if (c == null) {
            return null;
        }
        int childCount = c.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = c.getChildAt(i);
            if (childAt instanceof C1763a) {
                return ((C1763a) childAt).f9713e;
            }
        }
        return new cl(c.getContext(), c, view);
    }

    /* renamed from: a */
    public void m14223a(Drawable drawable) {
        this.f9623a.m14436a(drawable);
    }

    /* renamed from: b */
    public void m14224b(Drawable drawable) {
        this.f9623a.m14439b(drawable);
    }
}
