package com.p000;

import android.os.Bundle;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import p000.dw.C5176a;
import p000.ff.C5225a;
import p000.ff.C5226b;

/* compiled from: LoaderManager */
/* renamed from: dx */
public class dx extends dw {
    /* renamed from: a */
    static boolean f23404a = false;
    /* renamed from: b */
    final hs<C5227a> f23405b = new hs();
    /* renamed from: c */
    final hs<C5227a> f23406c = new hs();
    /* renamed from: d */
    final String f23407d;
    /* renamed from: e */
    boolean f23408e;
    /* renamed from: f */
    boolean f23409f;
    /* renamed from: g */
    boolean f23410g;
    /* renamed from: h */
    C5020do f23411h;

    /* compiled from: LoaderManager */
    /* renamed from: dx$a */
    final class C5227a implements C5225a<Object>, C5226b<Object> {
        /* renamed from: a */
        final int f23389a;
        /* renamed from: b */
        final Bundle f23390b;
        /* renamed from: c */
        C5176a<Object> f23391c;
        /* renamed from: d */
        ff<Object> f23392d;
        /* renamed from: e */
        boolean f23393e;
        /* renamed from: f */
        boolean f23394f;
        /* renamed from: g */
        Object f23395g;
        /* renamed from: h */
        boolean f23396h;
        /* renamed from: i */
        boolean f23397i;
        /* renamed from: j */
        boolean f23398j;
        /* renamed from: k */
        boolean f23399k;
        /* renamed from: l */
        boolean f23400l;
        /* renamed from: m */
        boolean f23401m;
        /* renamed from: n */
        C5227a f23402n;
        /* renamed from: o */
        final /* synthetic */ dx f23403o;

        public C5227a(dx dxVar, int i, Bundle bundle, C5176a<Object> c5176a) {
            this.f23403o = dxVar;
            this.f23389a = i;
            this.f23390b = bundle;
            this.f23391c = c5176a;
        }

        /* renamed from: a */
        void m29705a() {
            if (this.f23397i && this.f23398j) {
                this.f23396h = true;
            } else if (!this.f23396h) {
                this.f23396h = true;
                if (dx.f23404a) {
                    Log.v("LoaderManager", "  Starting: " + this);
                }
                if (this.f23392d == null && this.f23391c != null) {
                    this.f23392d = this.f23391c.m29575a(this.f23389a, this.f23390b);
                }
                if (this.f23392d == null) {
                    return;
                }
                if (!this.f23392d.getClass().isMemberClass() || Modifier.isStatic(this.f23392d.getClass().getModifiers())) {
                    if (!this.f23401m) {
                        this.f23392d.m30106a(this.f23389a, this);
                        this.f23392d.m30107a((C5225a) this);
                        this.f23401m = true;
                    }
                    this.f23392d.m30116i();
                    return;
                }
                throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + this.f23392d);
            }
        }

        /* renamed from: b */
        void m29709b() {
            if (dx.f23404a) {
                Log.v("LoaderManager", "  Retaining: " + this);
            }
            this.f23397i = true;
            this.f23398j = this.f23396h;
            this.f23396h = false;
            this.f23391c = null;
        }

        /* renamed from: c */
        void m29711c() {
            if (this.f23397i) {
                if (dx.f23404a) {
                    Log.v("LoaderManager", "  Finished Retaining: " + this);
                }
                this.f23397i = false;
                if (!(this.f23396h == this.f23398j || this.f23396h)) {
                    m29713e();
                }
            }
            if (this.f23396h && this.f23393e && !this.f23399k) {
                m29710b(this.f23392d, this.f23395g);
            }
        }

        /* renamed from: d */
        void m29712d() {
            if (this.f23396h && this.f23399k) {
                this.f23399k = false;
                if (this.f23393e && !this.f23397i) {
                    m29710b(this.f23392d, this.f23395g);
                }
            }
        }

        /* renamed from: e */
        void m29713e() {
            if (dx.f23404a) {
                Log.v("LoaderManager", "  Stopping: " + this);
            }
            this.f23396h = false;
            if (!this.f23397i && this.f23392d != null && this.f23401m) {
                this.f23401m = false;
                this.f23392d.m30108a((C5226b) this);
                this.f23392d.m30110b((C5225a) this);
                this.f23392d.m30120m();
            }
        }

        /* renamed from: f */
        void m29714f() {
            String str;
            C5176a c5176a = null;
            if (dx.f23404a) {
                Log.v("LoaderManager", "  Destroying: " + this);
            }
            this.f23400l = true;
            boolean z = this.f23394f;
            this.f23394f = false;
            if (this.f23391c != null && this.f23392d != null && this.f23393e && z) {
                if (dx.f23404a) {
                    Log.v("LoaderManager", "  Resetting: " + this);
                }
                if (this.f23403o.f23411h != null) {
                    String str2 = this.f23403o.f23411h.f22374d.mNoTransactionsBecause;
                    this.f23403o.f23411h.f22374d.mNoTransactionsBecause = "onLoaderReset";
                    str = str2;
                } else {
                    str = null;
                }
                try {
                    this.f23391c.m29576a(this.f23392d);
                } finally {
                    c5176a = this.f23403o.f23411h;
                    if (c5176a != null) {
                        c5176a = this.f23403o.f23411h.f22374d;
                        c5176a.mNoTransactionsBecause = str;
                    }
                }
            }
            this.f23391c = c5176a;
            this.f23395g = c5176a;
            this.f23393e = false;
            if (this.f23392d != null) {
                if (this.f23401m) {
                    this.f23401m = false;
                    this.f23392d.m30108a((C5226b) this);
                    this.f23392d.m30110b((C5225a) this);
                }
                this.f23392d.m30122o();
            }
            if (this.f23402n != null) {
                this.f23402n.m29714f();
            }
        }

        /* renamed from: a */
        public void mo4665a(ff<Object> ffVar) {
            if (dx.f23404a) {
                Log.v("LoaderManager", "onLoadCanceled: " + this);
            }
            if (this.f23400l) {
                if (dx.f23404a) {
                    Log.v("LoaderManager", "  Ignoring load canceled -- destroyed");
                }
            } else if (this.f23403o.f23405b.m30604a(this.f23389a) == this) {
                C5227a c5227a = this.f23402n;
                if (c5227a != null) {
                    if (dx.f23404a) {
                        Log.v("LoaderManager", "  Switching to pending loader: " + c5227a);
                    }
                    this.f23402n = null;
                    this.f23403o.f23405b.m30608b(this.f23389a, null);
                    m29714f();
                    this.f23403o.m29719a(c5227a);
                }
            } else if (dx.f23404a) {
                Log.v("LoaderManager", "  Ignoring load canceled -- not active");
            }
        }

        /* renamed from: a */
        public void mo4666a(ff<Object> ffVar, Object obj) {
            if (dx.f23404a) {
                Log.v("LoaderManager", "onLoadComplete: " + this);
            }
            if (this.f23400l) {
                if (dx.f23404a) {
                    Log.v("LoaderManager", "  Ignoring load complete -- destroyed");
                }
            } else if (this.f23403o.f23405b.m30604a(this.f23389a) == this) {
                C5227a c5227a = this.f23402n;
                if (c5227a != null) {
                    if (dx.f23404a) {
                        Log.v("LoaderManager", "  Switching to pending loader: " + c5227a);
                    }
                    this.f23402n = null;
                    this.f23403o.f23405b.m30608b(this.f23389a, null);
                    m29714f();
                    this.f23403o.m29719a(c5227a);
                    return;
                }
                if (!(this.f23395g == obj && this.f23393e)) {
                    this.f23395g = obj;
                    this.f23393e = true;
                    if (this.f23396h) {
                        m29710b(ffVar, obj);
                    }
                }
                c5227a = (C5227a) this.f23403o.f23406c.m30604a(this.f23389a);
                if (!(c5227a == null || c5227a == this)) {
                    c5227a.f23394f = false;
                    c5227a.m29714f();
                    this.f23403o.f23406c.m30610c(this.f23389a);
                }
                if (this.f23403o.f23411h != null && !this.f23403o.mo4668a()) {
                    this.f23403o.f23411h.f22374d.startPendingDeferredFragments();
                }
            } else if (dx.f23404a) {
                Log.v("LoaderManager", "  Ignoring load complete -- not active");
            }
        }

        /* renamed from: b */
        void m29710b(ff<Object> ffVar, Object obj) {
            String str;
            if (this.f23391c != null) {
                if (this.f23403o.f23411h != null) {
                    String str2 = this.f23403o.f23411h.f22374d.mNoTransactionsBecause;
                    this.f23403o.f23411h.f22374d.mNoTransactionsBecause = "onLoadFinished";
                    str = str2;
                } else {
                    str = null;
                }
                try {
                    if (dx.f23404a) {
                        Log.v("LoaderManager", "  onLoadFinished in " + ffVar + ": " + ffVar.m30113c(obj));
                    }
                    this.f23391c.m29577a((ff) ffVar, obj);
                    this.f23394f = true;
                } finally {
                    if (this.f23403o.f23411h != null) {
                        this.f23403o.f23411h.f22374d.mNoTransactionsBecause = str;
                    }
                }
            }
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder(64);
            stringBuilder.append("LoaderInfo{");
            stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
            stringBuilder.append(" #");
            stringBuilder.append(this.f23389a);
            stringBuilder.append(" : ");
            hk.m30585a(this.f23392d, stringBuilder);
            stringBuilder.append("}}");
            return stringBuilder.toString();
        }

        /* renamed from: a */
        public void m29708a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            printWriter.print(str);
            printWriter.print("mId=");
            printWriter.print(this.f23389a);
            printWriter.print(" mArgs=");
            printWriter.println(this.f23390b);
            printWriter.print(str);
            printWriter.print("mCallbacks=");
            printWriter.println(this.f23391c);
            printWriter.print(str);
            printWriter.print("mLoader=");
            printWriter.println(this.f23392d);
            if (this.f23392d != null) {
                this.f23392d.mo4708a(str + "  ", fileDescriptor, printWriter, strArr);
            }
            if (this.f23393e || this.f23394f) {
                printWriter.print(str);
                printWriter.print("mHaveData=");
                printWriter.print(this.f23393e);
                printWriter.print("  mDeliveredData=");
                printWriter.println(this.f23394f);
                printWriter.print(str);
                printWriter.print("mData=");
                printWriter.println(this.f23395g);
            }
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.print(this.f23396h);
            printWriter.print(" mReportNextStart=");
            printWriter.print(this.f23399k);
            printWriter.print(" mDestroyed=");
            printWriter.println(this.f23400l);
            printWriter.print(str);
            printWriter.print("mRetaining=");
            printWriter.print(this.f23397i);
            printWriter.print(" mRetainingStarted=");
            printWriter.print(this.f23398j);
            printWriter.print(" mListenerRegistered=");
            printWriter.println(this.f23401m);
            if (this.f23402n != null) {
                printWriter.print(str);
                printWriter.println("Pending Loader ");
                printWriter.print(this.f23402n);
                printWriter.println(":");
                this.f23402n.m29708a(str + "  ", fileDescriptor, printWriter, strArr);
            }
        }
    }

    dx(String str, C5020do c5020do, boolean z) {
        this.f23407d = str;
        this.f23411h = c5020do;
        this.f23408e = z;
    }

    /* renamed from: a */
    void m29718a(C5020do c5020do) {
        this.f23411h = c5020do;
    }

    /* renamed from: b */
    private C5227a m29715b(int i, Bundle bundle, C5176a<Object> c5176a) {
        C5227a c5227a = new C5227a(this, i, bundle, c5176a);
        c5227a.f23392d = c5176a.m29575a(i, bundle);
        return c5227a;
    }

    /* renamed from: c */
    private C5227a m29716c(int i, Bundle bundle, C5176a<Object> c5176a) {
        try {
            this.f23410g = true;
            C5227a b = m29715b(i, bundle, c5176a);
            m29719a(b);
            return b;
        } finally {
            this.f23410g = false;
        }
    }

    /* renamed from: a */
    void m29719a(C5227a c5227a) {
        this.f23405b.m30608b(c5227a.f23389a, c5227a);
        if (this.f23408e) {
            c5227a.m29705a();
        }
    }

    /* renamed from: a */
    public <D> ff<D> mo4667a(int i, Bundle bundle, C5176a<D> c5176a) {
        if (this.f23410g) {
            throw new IllegalStateException("Called while creating a loader");
        }
        C5227a c5227a = (C5227a) this.f23405b.m30604a(i);
        if (f23404a) {
            Log.v("LoaderManager", "initLoader in " + this + ": args=" + bundle);
        }
        if (c5227a == null) {
            c5227a = m29716c(i, bundle, c5176a);
            if (f23404a) {
                Log.v("LoaderManager", "  Created new loader " + c5227a);
            }
        } else {
            if (f23404a) {
                Log.v("LoaderManager", "  Re-using existing loader " + c5227a);
            }
            c5227a.f23391c = c5176a;
        }
        if (c5227a.f23393e && this.f23408e) {
            c5227a.m29710b(c5227a.f23392d, c5227a.f23395g);
        }
        return c5227a.f23392d;
    }

    /* renamed from: b */
    public void m29722b() {
        if (f23404a) {
            Log.v("LoaderManager", "Starting in " + this);
        }
        if (this.f23408e) {
            Throwable runtimeException = new RuntimeException("here");
            runtimeException.fillInStackTrace();
            Log.w("LoaderManager", "Called doStart when already started: " + this, runtimeException);
            return;
        }
        this.f23408e = true;
        for (int b = this.f23405b.m30606b() - 1; b >= 0; b--) {
            ((C5227a) this.f23405b.m30614f(b)).m29705a();
        }
    }

    /* renamed from: c */
    public void m29723c() {
        if (f23404a) {
            Log.v("LoaderManager", "Stopping in " + this);
        }
        if (this.f23408e) {
            for (int b = this.f23405b.m30606b() - 1; b >= 0; b--) {
                ((C5227a) this.f23405b.m30614f(b)).m29713e();
            }
            this.f23408e = false;
            return;
        }
        Throwable runtimeException = new RuntimeException("here");
        runtimeException.fillInStackTrace();
        Log.w("LoaderManager", "Called doStop when not started: " + this, runtimeException);
    }

    /* renamed from: d */
    public void m29724d() {
        if (f23404a) {
            Log.v("LoaderManager", "Retaining in " + this);
        }
        if (this.f23408e) {
            this.f23409f = true;
            this.f23408e = false;
            for (int b = this.f23405b.m30606b() - 1; b >= 0; b--) {
                ((C5227a) this.f23405b.m30614f(b)).m29709b();
            }
            return;
        }
        Throwable runtimeException = new RuntimeException("here");
        runtimeException.fillInStackTrace();
        Log.w("LoaderManager", "Called doRetain when not started: " + this, runtimeException);
    }

    /* renamed from: e */
    void m29725e() {
        if (this.f23409f) {
            if (f23404a) {
                Log.v("LoaderManager", "Finished Retaining in " + this);
            }
            this.f23409f = false;
            for (int b = this.f23405b.m30606b() - 1; b >= 0; b--) {
                ((C5227a) this.f23405b.m30614f(b)).m29711c();
            }
        }
    }

    /* renamed from: f */
    public void m29726f() {
        for (int b = this.f23405b.m30606b() - 1; b >= 0; b--) {
            ((C5227a) this.f23405b.m30614f(b)).f23399k = true;
        }
    }

    /* renamed from: g */
    public void m29727g() {
        for (int b = this.f23405b.m30606b() - 1; b >= 0; b--) {
            ((C5227a) this.f23405b.m30614f(b)).m29712d();
        }
    }

    /* renamed from: h */
    public void m29728h() {
        int b;
        if (!this.f23409f) {
            if (f23404a) {
                Log.v("LoaderManager", "Destroying Active in " + this);
            }
            for (b = this.f23405b.m30606b() - 1; b >= 0; b--) {
                ((C5227a) this.f23405b.m30614f(b)).m29714f();
            }
            this.f23405b.m30609c();
        }
        if (f23404a) {
            Log.v("LoaderManager", "Destroying Inactive in " + this);
        }
        for (b = this.f23406c.m30606b() - 1; b >= 0; b--) {
            ((C5227a) this.f23406c.m30614f(b)).m29714f();
        }
        this.f23406c.m30609c();
        this.f23411h = null;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(128);
        stringBuilder.append("LoaderManager{");
        stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
        stringBuilder.append(" in ");
        hk.m30585a(this.f23411h, stringBuilder);
        stringBuilder.append("}}");
        return stringBuilder.toString();
    }

    /* renamed from: a */
    public void m29720a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int i = 0;
        if (this.f23405b.m30606b() > 0) {
            printWriter.print(str);
            printWriter.println("Active Loaders:");
            String str2 = str + "    ";
            for (int i2 = 0; i2 < this.f23405b.m30606b(); i2++) {
                C5227a c5227a = (C5227a) this.f23405b.m30614f(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(this.f23405b.m30613e(i2));
                printWriter.print(": ");
                printWriter.println(c5227a.toString());
                c5227a.m29708a(str2, fileDescriptor, printWriter, strArr);
            }
        }
        if (this.f23406c.m30606b() > 0) {
            printWriter.print(str);
            printWriter.println("Inactive Loaders:");
            String str3 = str + "    ";
            while (i < this.f23406c.m30606b()) {
                c5227a = (C5227a) this.f23406c.m30614f(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(this.f23406c.m30613e(i));
                printWriter.print(": ");
                printWriter.println(c5227a.toString());
                c5227a.m29708a(str3, fileDescriptor, printWriter, strArr);
                i++;
            }
        }
    }

    /* renamed from: a */
    public boolean mo4668a() {
        int b = this.f23405b.m30606b();
        boolean z = false;
        for (int i = 0; i < b; i++) {
            int i2;
            C5227a c5227a = (C5227a) this.f23405b.m30614f(i);
            if (!c5227a.f23396h || c5227a.f23394f) {
                i2 = 0;
            } else {
                i2 = 1;
            }
            z |= i2;
        }
        return z;
    }
}
