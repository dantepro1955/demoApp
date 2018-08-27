package com.p000;

import android.graphics.Rect;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView.LayoutManager;
import android.support.v7.widget.RecyclerView.LayoutParams;
import android.view.View;

/* compiled from: OrientationHelper */
/* renamed from: pr */
public abstract class pr {
    /* renamed from: a */
    protected final LayoutManager f25117a;
    /* renamed from: b */
    final Rect f25118b;
    /* renamed from: c */
    private int f25119c;

    /* renamed from: a */
    public abstract int mo5435a(View view);

    /* renamed from: a */
    public abstract void mo5436a(int i);

    /* renamed from: b */
    public abstract int mo5437b(View view);

    /* renamed from: c */
    public abstract int mo5438c();

    /* renamed from: c */
    public abstract int mo5439c(View view);

    /* renamed from: d */
    public abstract int mo5440d();

    /* renamed from: d */
    public abstract int mo5441d(View view);

    /* renamed from: e */
    public abstract int mo5442e();

    /* renamed from: e */
    public abstract int mo5443e(View view);

    /* renamed from: f */
    public abstract int mo5444f();

    /* renamed from: f */
    public abstract int mo5445f(View view);

    /* renamed from: g */
    public abstract int mo5446g();

    /* renamed from: h */
    public abstract int mo5447h();

    /* renamed from: i */
    public abstract int mo5448i();

    private pr(LayoutManager layoutManager) {
        this.f25119c = LinearLayoutManager.INVALID_OFFSET;
        this.f25118b = new Rect();
        this.f25117a = layoutManager;
    }

    /* renamed from: a */
    public void m33652a() {
        this.f25119c = mo5444f();
    }

    /* renamed from: b */
    public int m33654b() {
        return LinearLayoutManager.INVALID_OFFSET == this.f25119c ? 0 : mo5444f() - this.f25119c;
    }

    /* renamed from: a */
    public static pr m33649a(LayoutManager layoutManager, int i) {
        switch (i) {
            case 0:
                return pr.m33648a(layoutManager);
            case 1:
                return pr.m33650b(layoutManager);
            default:
                throw new IllegalArgumentException("invalid orientation");
        }
    }

    /* renamed from: a */
    public static pr m33648a(LayoutManager layoutManager) {
        return new pr(layoutManager) {
            /* renamed from: d */
            public int mo5440d() {
                return this.a.getWidth() - this.a.getPaddingRight();
            }

            /* renamed from: e */
            public int mo5442e() {
                return this.a.getWidth();
            }

            /* renamed from: a */
            public void mo5436a(int i) {
                this.a.offsetChildrenHorizontal(i);
            }

            /* renamed from: c */
            public int mo5438c() {
                return this.a.getPaddingLeft();
            }

            /* renamed from: e */
            public int mo5443e(View view) {
                LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
                return layoutParams.rightMargin + (this.a.getDecoratedMeasuredWidth(view) + layoutParams.leftMargin);
            }

            /* renamed from: f */
            public int mo5445f(View view) {
                LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
                return layoutParams.bottomMargin + (this.a.getDecoratedMeasuredHeight(view) + layoutParams.topMargin);
            }

            /* renamed from: b */
            public int mo5437b(View view) {
                LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
                return layoutParams.rightMargin + this.a.getDecoratedRight(view);
            }

            /* renamed from: a */
            public int mo5435a(View view) {
                return this.a.getDecoratedLeft(view) - ((LayoutParams) view.getLayoutParams()).leftMargin;
            }

            /* renamed from: c */
            public int mo5439c(View view) {
                this.a.getTransformedBoundingBox(view, true, this.b);
                return this.b.right;
            }

            /* renamed from: d */
            public int mo5441d(View view) {
                this.a.getTransformedBoundingBox(view, true, this.b);
                return this.b.left;
            }

            /* renamed from: f */
            public int mo5444f() {
                return (this.a.getWidth() - this.a.getPaddingLeft()) - this.a.getPaddingRight();
            }

            /* renamed from: g */
            public int mo5446g() {
                return this.a.getPaddingRight();
            }

            /* renamed from: h */
            public int mo5447h() {
                return this.a.getWidthMode();
            }

            /* renamed from: i */
            public int mo5448i() {
                return this.a.getHeightMode();
            }
        };
    }

    /* renamed from: b */
    public static pr m33650b(LayoutManager layoutManager) {
        return new pr(layoutManager) {
            /* renamed from: d */
            public int mo5440d() {
                return this.a.getHeight() - this.a.getPaddingBottom();
            }

            /* renamed from: e */
            public int mo5442e() {
                return this.a.getHeight();
            }

            /* renamed from: a */
            public void mo5436a(int i) {
                this.a.offsetChildrenVertical(i);
            }

            /* renamed from: c */
            public int mo5438c() {
                return this.a.getPaddingTop();
            }

            /* renamed from: e */
            public int mo5443e(View view) {
                LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
                return layoutParams.bottomMargin + (this.a.getDecoratedMeasuredHeight(view) + layoutParams.topMargin);
            }

            /* renamed from: f */
            public int mo5445f(View view) {
                LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
                return layoutParams.rightMargin + (this.a.getDecoratedMeasuredWidth(view) + layoutParams.leftMargin);
            }

            /* renamed from: b */
            public int mo5437b(View view) {
                LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
                return layoutParams.bottomMargin + this.a.getDecoratedBottom(view);
            }

            /* renamed from: a */
            public int mo5435a(View view) {
                return this.a.getDecoratedTop(view) - ((LayoutParams) view.getLayoutParams()).topMargin;
            }

            /* renamed from: c */
            public int mo5439c(View view) {
                this.a.getTransformedBoundingBox(view, true, this.b);
                return this.b.bottom;
            }

            /* renamed from: d */
            public int mo5441d(View view) {
                this.a.getTransformedBoundingBox(view, true, this.b);
                return this.b.top;
            }

            /* renamed from: f */
            public int mo5444f() {
                return (this.a.getHeight() - this.a.getPaddingTop()) - this.a.getPaddingBottom();
            }

            /* renamed from: g */
            public int mo5446g() {
                return this.a.getPaddingBottom();
            }

            /* renamed from: h */
            public int mo5447h() {
                return this.a.getHeightMode();
            }

            /* renamed from: i */
            public int mo5448i() {
                return this.a.getWidthMode();
            }
        };
    }
}
