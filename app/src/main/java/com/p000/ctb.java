package com.p000;

import android.support.v4.widget.SwipeRefreshLayout;

/* compiled from: DefaultViewStateCallback */
/* renamed from: ctb */
public class ctb implements cta {
    /* renamed from: a */
    private SwipeRefreshLayout f20164a;
    /* renamed from: b */
    private csx f20165b;
    /* renamed from: c */
    private csu f20166c;

    /* compiled from: DefaultViewStateCallback */
    /* renamed from: ctb$1 */
    class C45681 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ ctb f20160a;

        C45681(ctb ctb) {
            this.f20160a = ctb;
        }

        public void run() {
            this.f20160a.f20164a.setRefreshing(true);
        }
    }

    /* compiled from: DefaultViewStateCallback */
    /* renamed from: ctb$2 */
    class C45692 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ ctb f20161a;

        C45692(ctb ctb) {
            this.f20161a = ctb;
        }

        public void run() {
            this.f20161a.f20164a.setRefreshing(false);
        }
    }

    /* compiled from: DefaultViewStateCallback */
    /* renamed from: ctb$3 */
    class C45703 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ ctb f20162a;

        C45703(ctb ctb) {
            this.f20162a = ctb;
        }

        public void run() {
            this.f20162a.f20164a.setRefreshing(false);
        }
    }

    /* compiled from: DefaultViewStateCallback */
    /* renamed from: ctb$4 */
    class C45714 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ ctb f20163a;

        C45714(ctb ctb) {
            this.f20163a = ctb;
        }

        public void run() {
            this.f20163a.f20164a.setRefreshing(true);
        }
    }

    public ctb(SwipeRefreshLayout swipeRefreshLayout, csx csx, csu csu) {
        this.f20164a = swipeRefreshLayout;
        this.f20165b = csx;
        this.f20166c = csu;
    }

    /* renamed from: a */
    public void mo4146a() {
        this.f20164a.post(new C45681(this));
        this.f20165b.m24848a(true, true);
    }

    /* renamed from: b */
    public void mo4147b() {
        this.f20164a.setRefreshing(false);
        this.f20165b.m24848a(true, false);
    }

    /* renamed from: c */
    public void mo4148c() {
    }

    /* renamed from: d */
    public void mo4149d() {
        this.f20164a.post(new C45692(this));
        this.f20165b.m24848a(false, false);
        this.f20166c.m24814a(true);
    }

    /* renamed from: e */
    public void mo4150e() {
    }

    /* renamed from: f */
    public void mo4151f() {
        this.f20164a.post(new C45703(this));
        this.f20165b.m24848a(false, false);
        this.f20166c.m24814a(false);
    }

    /* renamed from: g */
    public void mo4152g() {
        this.f20164a.post(new C45714(this));
    }
}
