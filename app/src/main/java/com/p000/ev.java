package com.p000;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;

/* compiled from: AsyncTaskLoader */
/* renamed from: ev */
public abstract class ev<D> extends ff<D> {
    /* renamed from: a */
    volatile C5302a f23678a;
    /* renamed from: b */
    volatile C5302a f23679b;
    /* renamed from: c */
    long f23680c;
    /* renamed from: d */
    long f23681d;
    /* renamed from: e */
    Handler f23682e;
    /* renamed from: o */
    private final Executor f23683o;

    /* compiled from: AsyncTaskLoader */
    /* renamed from: ev$a */
    final class C5302a extends fh<Void, Void, D> implements Runnable {
        /* renamed from: a */
        boolean f23666a;
        /* renamed from: b */
        final /* synthetic */ ev f23667b;
        /* renamed from: d */
        private final CountDownLatch f23668d = new CountDownLatch(1);

        C5302a(ev evVar) {
            this.f23667b = evVar;
        }

        /* renamed from: a */
        protected D m30102a(Void... voidArr) {
            try {
                return this.f23667b.m30135e();
            } catch (gt e) {
                if (m30098c()) {
                    return null;
                }
                throw e;
            }
        }

        /* renamed from: a */
        protected void mo4705a(D d) {
            try {
                this.f23667b.m30131b(this, d);
            } finally {
                this.f23668d.countDown();
            }
        }

        /* renamed from: b */
        protected void mo4706b(D d) {
            try {
                this.f23667b.m30128a(this, d);
            } finally {
                this.f23668d.countDown();
            }
        }

        public void run() {
            this.f23666a = false;
            this.f23667b.m30133c();
        }
    }

    /* renamed from: d */
    public abstract D m30134d();

    public ev(Context context) {
        this(context, fh.f23658c);
    }

    private ev(Context context, Executor executor) {
        super(context);
        this.f23681d = -10000;
        this.f23683o = executor;
    }

    /* renamed from: a */
    protected void mo4707a() {
        super.mo4707a();
        m30118k();
        this.f23678a = new C5302a(this);
        m30133c();
    }

    /* renamed from: b */
    protected boolean mo4709b() {
        boolean z = false;
        if (this.f23678a != null) {
            if (!this.j) {
                this.m = true;
            }
            if (this.f23679b != null) {
                if (this.f23678a.f23666a) {
                    this.f23678a.f23666a = false;
                    this.f23682e.removeCallbacks(this.f23678a);
                }
                this.f23678a = null;
            } else if (this.f23678a.f23666a) {
                this.f23678a.f23666a = false;
                this.f23682e.removeCallbacks(this.f23678a);
                this.f23678a = null;
            } else {
                z = this.f23678a.m30093a(false);
                if (z) {
                    this.f23679b = this.f23678a;
                    m30136f();
                }
                this.f23678a = null;
            }
        }
        return z;
    }

    /* renamed from: a */
    public void m30129a(D d) {
    }

    /* renamed from: c */
    void m30133c() {
        if (this.f23679b == null && this.f23678a != null) {
            if (this.f23678a.f23666a) {
                this.f23678a.f23666a = false;
                this.f23682e.removeCallbacks(this.f23678a);
            }
            if (this.f23680c <= 0 || SystemClock.uptimeMillis() >= this.f23681d + this.f23680c) {
                this.f23678a.m30089a(this.f23683o, (Void[]) null);
                return;
            }
            this.f23678a.f23666a = true;
            this.f23682e.postAtTime(this.f23678a, this.f23681d + this.f23680c);
        }
    }

    /* renamed from: a */
    void m30128a(C5302a c5302a, D d) {
        m30129a(d);
        if (this.f23679b == c5302a) {
            m30125r();
            this.f23681d = SystemClock.uptimeMillis();
            this.f23679b = null;
            m30114g();
            m30133c();
        }
    }

    /* renamed from: b */
    void m30131b(C5302a c5302a, D d) {
        if (this.f23678a != c5302a) {
            m30128a(c5302a, d);
        } else if (m30115h()) {
            m30129a(d);
        } else {
            m30124q();
            this.f23681d = SystemClock.uptimeMillis();
            this.f23678a = null;
            m30111b((Object) d);
        }
    }

    /* renamed from: e */
    protected D m30135e() {
        return m30134d();
    }

    /* renamed from: f */
    public void m30136f() {
    }

    /* renamed from: a */
    public void mo4708a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.mo4708a(str, fileDescriptor, printWriter, strArr);
        if (this.f23678a != null) {
            printWriter.print(str);
            printWriter.print("mTask=");
            printWriter.print(this.f23678a);
            printWriter.print(" waiting=");
            printWriter.println(this.f23678a.f23666a);
        }
        if (this.f23679b != null) {
            printWriter.print(str);
            printWriter.print("mCancellingTask=");
            printWriter.print(this.f23679b);
            printWriter.print(" waiting=");
            printWriter.println(this.f23679b.f23666a);
        }
        if (this.f23680c != 0) {
            printWriter.print(str);
            printWriter.print("mUpdateThrottle=");
            ht.m30620a(this.f23680c, printWriter);
            printWriter.print(" mLastLoadCompleteTime=");
            ht.m30619a(this.f23681d, SystemClock.uptimeMillis(), printWriter);
            printWriter.println();
        }
    }
}
