package com.p000;

import android.os.Handler;
import android.os.Message;
import com.google.android.gms.common.api.Status;
import p000.bqr.C1411a;

/* renamed from: bsd */
class bsd implements bqr {
    /* renamed from: a */
    private bqq f7502a;
    /* renamed from: b */
    private bqq f7503b;
    /* renamed from: c */
    private Status f7504c;
    /* renamed from: d */
    private C1436b f7505d;
    /* renamed from: e */
    private C1435a f7506e;
    /* renamed from: f */
    private boolean f7507f;
    /* renamed from: g */
    private bqt f7508g;

    /* renamed from: bsd$a */
    public interface C1435a {
        /* renamed from: a */
        void m10602a();

        /* renamed from: a */
        void m10603a(String str);

        /* renamed from: b */
        String m10604b();
    }

    /* renamed from: bsd$b */
    class C1436b extends Handler {
        /* renamed from: a */
        final /* synthetic */ bsd f7500a;
        /* renamed from: b */
        private final C1411a f7501b;

        /* renamed from: a */
        protected void m10605a(String str) {
            this.f7501b.m10434a(this.f7500a, str);
        }

        public void handleMessage(Message message) {
            switch (message.what) {
                case 1:
                    m10605a((String) message.obj);
                    return;
                default:
                    brd.m10493a("Don't know how to handle this message.");
                    return;
            }
        }
    }

    /* renamed from: a */
    public synchronized void mo1004a() {
        if (this.f7507f) {
            brd.m10493a("Releasing a released ContainerHolder.");
        } else {
            this.f7507f = true;
            this.f7508g.m10468a(this);
            this.f7502a.m10433b();
            this.f7502a = null;
            this.f7503b = null;
            this.f7506e = null;
            this.f7505d = null;
        }
    }

    /* renamed from: a */
    public synchronized void m10607a(String str) {
        if (!this.f7507f) {
            this.f7502a.m10432a(str);
        }
    }

    /* renamed from: b */
    public Status mo325b() {
        return this.f7504c;
    }

    /* renamed from: b */
    void m10609b(String str) {
        if (this.f7507f) {
            brd.m10493a("setCtfeUrlPathAndQuery called on a released ContainerHolder.");
        } else {
            this.f7506e.m10603a(str);
        }
    }

    /* renamed from: c */
    public synchronized void m10610c() {
        if (this.f7507f) {
            brd.m10493a("Refreshing a released ContainerHolder.");
        } else {
            this.f7506e.m10602a();
        }
    }

    /* renamed from: d */
    String m10611d() {
        if (!this.f7507f) {
            return this.f7502a.m10431a();
        }
        brd.m10493a("getContainerId called on a released ContainerHolder.");
        return "";
    }

    /* renamed from: e */
    String m10612e() {
        if (!this.f7507f) {
            return this.f7506e.m10604b();
        }
        brd.m10493a("setCtfeUrlPathAndQuery called on a released ContainerHolder.");
        return "";
    }
}
