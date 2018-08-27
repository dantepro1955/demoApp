package com.p000;

import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v4.widget.SwipeRefreshLayout.C0506b;
import android.support.v7.widget.RecyclerView.C0581a;
import android.support.v7.widget.RecyclerView.C0590g;
import android.support.v7.widget.RecyclerView.C0594k;
import android.support.v7.widget.RecyclerView.LayoutManager;
import android.view.View.OnTouchListener;
import java.util.ArrayList;

/* compiled from: BlitzViewConfig */
/* renamed from: csq */
public class csq {
    /* renamed from: a */
    public ArrayList<C0594k> f20114a;
    /* renamed from: b */
    public OnTouchListener f20115b;
    /* renamed from: c */
    public ctc f20116c;
    /* renamed from: d */
    public C0581a f20117d;
    /* renamed from: e */
    public LayoutManager f20118e;
    /* renamed from: f */
    public C0506b f20119f;
    /* renamed from: g */
    public int[] f20120g;
    /* renamed from: h */
    public int f20121h;
    /* renamed from: i */
    public SwipeRefreshLayout f20122i;
    /* renamed from: j */
    public boolean f20123j;
    /* renamed from: k */
    public C0590g[] f20124k;
    /* renamed from: l */
    public int[] f20125l;
    /* renamed from: m */
    public cta f20126m;

    /* compiled from: BlitzViewConfig */
    /* renamed from: csq$a */
    public static class C4558a {
        /* renamed from: a */
        ArrayList<C0594k> f20101a;
        /* renamed from: b */
        OnTouchListener f20102b;
        /* renamed from: c */
        ctc f20103c;
        /* renamed from: d */
        LayoutManager f20104d;
        /* renamed from: e */
        C0581a f20105e;
        /* renamed from: f */
        C0506b f20106f;
        /* renamed from: g */
        int[] f20107g;
        /* renamed from: h */
        boolean f20108h = true;
        /* renamed from: i */
        C0590g[] f20109i;
        /* renamed from: j */
        final int[] f20110j = new int[4];
        /* renamed from: k */
        SwipeRefreshLayout f20111k;
        /* renamed from: l */
        cta f20112l;
        /* renamed from: m */
        int f20113m = -1;

        private C4558a() {
        }

        /* renamed from: a */
        public static C4558a m24797a() {
            return new C4558a();
        }

        /* renamed from: a */
        public C4558a m24802a(C0581a c0581a) {
            this.f20105e = c0581a;
            return this;
        }

        /* renamed from: a */
        public C4558a m24801a(LayoutManager layoutManager) {
            this.f20104d = layoutManager;
            return this;
        }

        /* renamed from: a */
        public C4558a m24806a(int... iArr) {
            this.f20107g = iArr;
            return this;
        }

        /* renamed from: a */
        public C4558a m24798a(int i) {
            this.f20113m = i;
            return this;
        }

        /* renamed from: a */
        public C4558a m24800a(C0506b c0506b) {
            this.f20106f = c0506b;
            return this;
        }

        /* renamed from: a */
        public C4558a m24805a(ctc ctc) {
            this.f20103c = ctc;
            return this;
        }

        /* renamed from: a */
        public C4558a m24799a(int i, int i2, int i3, int i4) {
            this.f20110j[0] = i;
            this.f20110j[1] = i2;
            this.f20110j[2] = i3;
            this.f20110j[3] = i4;
            return this;
        }

        /* renamed from: a */
        public C4558a m24803a(C0594k c0594k) {
            if (this.f20101a == null) {
                this.f20101a = new ArrayList();
            }
            this.f20101a.add(c0594k);
            return this;
        }

        /* renamed from: b */
        public csq m24807b() {
            csq csq = new csq();
            csq.f20117d = this.f20105e;
            csq.f20118e = this.f20104d;
            csq.f20116c = this.f20103c;
            csq.f20119f = this.f20106f;
            csq.f20120g = this.f20107g;
            csq.f20123j = this.f20108h;
            csq.f20124k = this.f20109i;
            csq.f20125l = this.f20110j;
            csq.f20114a = this.f20101a;
            csq.f20122i = this.f20111k;
            csq.f20126m = this.f20112l;
            csq.f20121h = this.f20113m;
            csq.f20115b = this.f20102b;
            return csq;
        }

        /* renamed from: a */
        public C4558a m24804a(OnTouchListener onTouchListener) {
            this.f20102b = onTouchListener;
            return this;
        }
    }
}
