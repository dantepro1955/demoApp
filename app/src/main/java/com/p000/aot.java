package com.p000;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.zzj;
import com.google.android.gms.common.zzc;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import p000.aph.C0666a;
import p000.api.C0686a;

/* renamed from: aot */
public abstract class aot<T extends IInterface> {
    /* renamed from: d */
    public static final String[] f2030d = new String[]{"service_esmobile", "service_googleme"};
    /* renamed from: a */
    final Handler f2031a;
    /* renamed from: b */
    protected C0665f f2032b;
    /* renamed from: c */
    protected AtomicInteger f2033c;
    /* renamed from: e */
    private int f2034e;
    /* renamed from: f */
    private long f2035f;
    /* renamed from: g */
    private long f2036g;
    /* renamed from: h */
    private int f2037h;
    /* renamed from: i */
    private long f2038i;
    /* renamed from: j */
    private final Context f2039j;
    /* renamed from: k */
    private final Looper f2040k;
    /* renamed from: l */
    private final apa f2041l;
    /* renamed from: m */
    private final aqm f2042m;
    /* renamed from: n */
    private final Object f2043n;
    /* renamed from: o */
    private final Object f2044o;
    /* renamed from: p */
    private api f2045p;
    /* renamed from: q */
    private T f2046q;
    /* renamed from: r */
    private final ArrayList<C0660e<?>> f2047r;
    /* renamed from: s */
    private C0668h f2048s;
    /* renamed from: t */
    private int f2049t;
    /* renamed from: u */
    private final C0662b f2050u;
    /* renamed from: v */
    private final C0663c f2051v;
    /* renamed from: w */
    private final int f2052w;
    /* renamed from: x */
    private final String f2053x;

    /* renamed from: aot$e */
    public abstract class C0660e<TListener> {
        /* renamed from: a */
        private TListener f3826a;
        /* renamed from: b */
        private boolean f3827b = false;
        /* renamed from: d */
        final /* synthetic */ aot f3828d;

        public C0660e(aot aot, TListener tListener) {
            this.f3828d = aot;
            this.f3826a = tListener;
        }

        /* renamed from: a */
        protected abstract void mo590a(TListener tListener);

        /* renamed from: b */
        public void m4721b() {
            synchronized (this) {
                Object obj = this.f3826a;
                if (this.f3827b) {
                    String valueOf = String.valueOf(this);
                    Log.w("GmsClient", new StringBuilder(String.valueOf(valueOf).length() + 47).append("Callback proxy ").append(valueOf).append(" being reused. This is not safe.").toString());
                }
            }
            if (obj != null) {
                try {
                    mo590a(obj);
                } catch (RuntimeException e) {
                    throw e;
                }
            }
            synchronized (this) {
                this.f3827b = true;
            }
            m4722c();
        }

        /* renamed from: c */
        public void m4722c() {
            m4723d();
            synchronized (this.f3828d.f2047r) {
                this.f3828d.f2047r.remove(this);
            }
        }

        /* renamed from: d */
        public void m4723d() {
            synchronized (this) {
                this.f3826a = null;
            }
        }
    }

    /* renamed from: aot$a */
    abstract class C0661a extends C0660e<Boolean> {
        /* renamed from: a */
        public final int f3829a;
        /* renamed from: b */
        public final Bundle f3830b;
        /* renamed from: c */
        final /* synthetic */ aot f3831c;

        protected C0661a(aot aot, int i, Bundle bundle) {
            this.f3831c = aot;
            super(aot, Boolean.valueOf(true));
            this.f3829a = i;
            this.f3830b = bundle;
        }

        /* renamed from: a */
        protected abstract void mo594a(ConnectionResult connectionResult);

        /* renamed from: a */
        protected void m4725a(Boolean bool) {
            PendingIntent pendingIntent = null;
            if (bool == null) {
                this.f3831c.m2599a(1, null);
                return;
            }
            switch (this.f3829a) {
                case 0:
                    if (!mo595a()) {
                        this.f3831c.m2599a(1, null);
                        mo594a(new ConnectionResult(8, null));
                        return;
                    }
                    return;
                case 10:
                    this.f3831c.m2599a(1, null);
                    throw new IllegalStateException("A fatal developer error has occurred. Check the logs for further information.");
                default:
                    this.f3831c.m2599a(1, null);
                    if (this.f3830b != null) {
                        pendingIntent = (PendingIntent) this.f3830b.getParcelable("pendingIntent");
                    }
                    mo594a(new ConnectionResult(this.f3829a, pendingIntent));
                    return;
            }
        }

        /* renamed from: a */
        protected /* synthetic */ void mo590a(Object obj) {
            m4725a((Boolean) obj);
        }

        /* renamed from: a */
        protected abstract boolean mo595a();
    }

    /* renamed from: aot$b */
    public interface C0662b {
        /* renamed from: a */
        void mo597a(int i);

        /* renamed from: a */
        void mo598a(Bundle bundle);
    }

    /* renamed from: aot$c */
    public interface C0663c {
        /* renamed from: a */
        void mo599a(ConnectionResult connectionResult);
    }

    /* renamed from: aot$d */
    final class C0664d extends Handler {
        /* renamed from: a */
        final /* synthetic */ aot f3832a;

        public C0664d(aot aot, Looper looper) {
            this.f3832a = aot;
            super(looper);
        }

        /* renamed from: a */
        private void m4731a(Message message) {
            ((C0660e) message.obj).m4722c();
        }

        /* renamed from: b */
        private boolean m4732b(Message message) {
            return message.what == 2 || message.what == 1 || message.what == 5;
        }

        public void handleMessage(Message message) {
            PendingIntent pendingIntent = null;
            if (this.f3832a.f2033c.get() != message.arg1) {
                if (m4732b(message)) {
                    m4731a(message);
                }
            } else if ((message.what == 1 || message.what == 5) && !this.f3832a.m2625h()) {
                m4731a(message);
            } else if (message.what == 3) {
                if (message.obj instanceof PendingIntent) {
                    pendingIntent = (PendingIntent) message.obj;
                }
                ConnectionResult connectionResult = new ConnectionResult(message.arg2, pendingIntent);
                this.f3832a.f2032b.mo593a(connectionResult);
                this.f3832a.m2616a(connectionResult);
            } else if (message.what == 4) {
                this.f3832a.m2599a(4, null);
                if (this.f3832a.f2050u != null) {
                    this.f3832a.f2050u.mo597a(message.arg2);
                }
                this.f3832a.m2609a(message.arg2);
                this.f3832a.m2601a(4, 1, null);
            } else if (message.what == 2 && !this.f3832a.m2624g()) {
                m4731a(message);
            } else if (m4732b(message)) {
                ((C0660e) message.obj).m4721b();
            } else {
                Log.wtf("GmsClient", "Don't know how to handle message: " + message.what, new Exception());
            }
        }
    }

    /* renamed from: aot$f */
    public interface C0665f {
        /* renamed from: a */
        void mo593a(ConnectionResult connectionResult);
    }

    /* renamed from: aot$g */
    public static final class C0667g extends C0666a {
        /* renamed from: a */
        private aot f3833a;
        /* renamed from: b */
        private final int f3834b;

        public C0667g(aot aot, int i) {
            this.f3833a = aot;
            this.f3834b = i;
        }

        /* renamed from: a */
        private void m4737a() {
            this.f3833a = null;
        }

        /* renamed from: a */
        public void mo591a(int i, Bundle bundle) {
            Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
        }

        /* renamed from: a */
        public void mo592a(int i, IBinder iBinder, Bundle bundle) {
            aoi.m4680a(this.f3833a, (Object) "onPostInitComplete can be called only once per call to getRemoteService");
            this.f3833a.m2611a(i, iBinder, bundle, this.f3834b);
            m4737a();
        }
    }

    /* renamed from: aot$h */
    public final class C0668h implements ServiceConnection {
        /* renamed from: a */
        final /* synthetic */ aot f3835a;
        /* renamed from: b */
        private final int f3836b;

        public C0668h(aot aot, int i) {
            this.f3835a = aot;
            this.f3836b = i;
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (iBinder == null) {
                this.f3835a.m2610a(8, null, this.f3836b);
                return;
            }
            synchronized (this.f3835a.f2044o) {
                this.f3835a.f2045p = C0686a.m4842a(iBinder);
            }
            this.f3835a.m2610a(0, null, this.f3836b);
        }

        public void onServiceDisconnected(ComponentName componentName) {
            synchronized (this.f3835a.f2044o) {
                this.f3835a.f2045p = null;
            }
            this.f3835a.f2031a.sendMessage(this.f3835a.f2031a.obtainMessage(4, this.f3836b, 1));
        }
    }

    /* renamed from: aot$i */
    public class C0669i implements C0665f {
        /* renamed from: a */
        final /* synthetic */ aot f3837a;

        public C0669i(aot aot) {
            this.f3837a = aot;
        }

        /* renamed from: a */
        public void mo593a(ConnectionResult connectionResult) {
            if (connectionResult.m19505b()) {
                this.f3837a.m2615a(null, this.f3837a.mo337x());
            } else if (this.f3837a.f2051v != null) {
                this.f3837a.f2051v.mo599a(connectionResult);
            }
        }
    }

    /* renamed from: aot$j */
    public final class C0670j extends C0661a {
        /* renamed from: e */
        public final IBinder f3838e;
        /* renamed from: f */
        final /* synthetic */ aot f3839f;

        public C0670j(aot aot, int i, IBinder iBinder, Bundle bundle) {
            this.f3839f = aot;
            super(aot, i, bundle);
            this.f3838e = iBinder;
        }

        /* renamed from: a */
        protected void mo594a(ConnectionResult connectionResult) {
            if (this.f3839f.f2051v != null) {
                this.f3839f.f2051v.mo599a(connectionResult);
            }
            this.f3839f.m2616a(connectionResult);
        }

        /* renamed from: a */
        protected boolean mo595a() {
            try {
                String interfaceDescriptor = this.f3838e.getInterfaceDescriptor();
                if (this.f3839f.mo341b().equals(interfaceDescriptor)) {
                    IInterface b = this.f3839f.mo340b(this.f3838e);
                    if (b == null || !this.f3839f.m2601a(2, 3, b)) {
                        return false;
                    }
                    Bundle u = this.f3839f.m2637u();
                    if (this.f3839f.f2050u != null) {
                        this.f3839f.f2050u.mo598a(u);
                    }
                    return true;
                }
                String valueOf = String.valueOf(this.f3839f.mo341b());
                Log.e("GmsClient", new StringBuilder((String.valueOf(valueOf).length() + 34) + String.valueOf(interfaceDescriptor).length()).append("service descriptor mismatch: ").append(valueOf).append(" vs. ").append(interfaceDescriptor).toString());
                return false;
            } catch (RemoteException e) {
                Log.w("GmsClient", "service probably died");
                return false;
            }
        }
    }

    /* renamed from: aot$k */
    public final class C0671k extends C0661a {
        /* renamed from: e */
        final /* synthetic */ aot f3840e;

        public C0671k(aot aot, int i, Bundle bundle) {
            this.f3840e = aot;
            super(aot, i, bundle);
        }

        /* renamed from: a */
        protected void mo594a(ConnectionResult connectionResult) {
            this.f3840e.f2032b.mo593a(connectionResult);
            this.f3840e.m2616a(connectionResult);
        }

        /* renamed from: a */
        protected boolean mo595a() {
            this.f3840e.f2032b.mo593a(ConnectionResult.f14748a);
            return true;
        }
    }

    protected aot(Context context, Looper looper, int i, C0662b c0662b, C0663c c0663c, String str) {
        this(context, looper, apa.m4806a(context), aqm.m4517b(), i, (C0662b) aoi.m4679a((Object) c0662b), (C0663c) aoi.m4679a((Object) c0663c), str);
    }

    protected aot(Context context, Looper looper, apa apa, aqm aqm, int i, C0662b c0662b, C0663c c0663c, String str) {
        this.f2043n = new Object();
        this.f2044o = new Object();
        this.f2047r = new ArrayList();
        this.f2049t = 1;
        this.f2033c = new AtomicInteger(0);
        this.f2039j = (Context) aoi.m4680a((Object) context, (Object) "Context must not be null");
        this.f2040k = (Looper) aoi.m4680a((Object) looper, (Object) "Looper must not be null");
        this.f2041l = (apa) aoi.m4680a((Object) apa, (Object) "Supervisor must not be null");
        this.f2042m = (aqm) aoi.m4680a((Object) aqm, (Object) "API availability must not be null");
        this.f2031a = new C0664d(this, looper);
        this.f2052w = i;
        this.f2050u = c0662b;
        this.f2051v = c0663c;
        this.f2053x = str;
    }

    /* renamed from: a */
    private void m2599a(int i, T t) {
        boolean z = true;
        if ((i == 3) != (t != null)) {
            z = false;
        }
        aoi.m4688b(z);
        synchronized (this.f2043n) {
            this.f2049t = i;
            this.f2046q = t;
            switch (i) {
                case 1:
                    mo338y();
                    break;
                case 2:
                    mo344e();
                    break;
                case 3:
                    m2612a((IInterface) t);
                    break;
            }
        }
    }

    /* renamed from: a */
    private boolean m2601a(int i, int i2, T t) {
        boolean z;
        synchronized (this.f2043n) {
            if (this.f2049t != i) {
                z = false;
            } else {
                m2599a(i2, (IInterface) t);
                z = true;
            }
        }
        return z;
    }

    /* renamed from: e */
    private void mo344e() {
        if (this.f2048s != null) {
            String valueOf = String.valueOf(mo339a());
            String valueOf2 = String.valueOf(i_());
            Log.e("GmsClient", new StringBuilder((String.valueOf(valueOf).length() + 70) + String.valueOf(valueOf2).length()).append("Calling connect() while still connected, missing disconnect() for ").append(valueOf).append(" on ").append(valueOf2).toString());
            this.f2041l.m4812b(mo339a(), i_(), this.f2048s, m2629m());
            this.f2033c.incrementAndGet();
        }
        this.f2048s = new C0668h(this, this.f2033c.get());
        if (!this.f2041l.m4809a(mo339a(), i_(), this.f2048s, m2629m())) {
            valueOf = String.valueOf(mo339a());
            valueOf2 = String.valueOf(i_());
            Log.e("GmsClient", new StringBuilder((String.valueOf(valueOf).length() + 34) + String.valueOf(valueOf2).length()).append("unable to connect to service: ").append(valueOf).append(" on ").append(valueOf2).toString());
            m2610a(16, null, this.f2033c.get());
        }
    }

    /* renamed from: y */
    private void mo338y() {
        if (this.f2048s != null) {
            this.f2041l.m4812b(mo339a(), i_(), this.f2048s, m2629m());
            this.f2048s = null;
        }
    }

    /* renamed from: a */
    protected abstract String mo339a();

    /* renamed from: a */
    protected void m2609a(int i) {
        this.f2034e = i;
        this.f2035f = System.currentTimeMillis();
    }

    /* renamed from: a */
    protected void m2610a(int i, Bundle bundle, int i2) {
        this.f2031a.sendMessage(this.f2031a.obtainMessage(5, i2, -1, new C0671k(this, i, bundle)));
    }

    /* renamed from: a */
    protected void m2611a(int i, IBinder iBinder, Bundle bundle, int i2) {
        this.f2031a.sendMessage(this.f2031a.obtainMessage(1, i2, -1, new C0670j(this, i, iBinder, bundle)));
    }

    /* renamed from: a */
    protected void m2612a(T t) {
        this.f2036g = System.currentTimeMillis();
    }

    /* renamed from: a */
    public void m2613a(C0665f c0665f) {
        this.f2032b = (C0665f) aoi.m4680a((Object) c0665f, (Object) "Connection progress callbacks cannot be null.");
        m2599a(2, null);
    }

    /* renamed from: a */
    public void m2614a(C0665f c0665f, int i, PendingIntent pendingIntent) {
        this.f2032b = (C0665f) aoi.m4680a((Object) c0665f, (Object) "Connection progress callbacks cannot be null.");
        this.f2031a.sendMessage(this.f2031a.obtainMessage(3, this.f2033c.get(), i, pendingIntent));
    }

    /* renamed from: a */
    public void m2615a(ape ape, Set<Scope> set) {
        Throwable e;
        zzj a = new zzj(this.f2052w).m19542a(this.f2039j.getPackageName()).m19540a(mo734s());
        if (set != null) {
            a.m19543a((Collection) set);
        }
        if (mo799i()) {
            a.m19539a(m2634r()).m19541a(ape);
        } else if (m2639w()) {
            a.m19539a(mo335p());
        }
        a.m19544a(mo336q());
        try {
            synchronized (this.f2044o) {
                if (this.f2045p != null) {
                    this.f2045p.mo602a(new C0667g(this, this.f2033c.get()), a);
                } else {
                    Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                }
            }
        } catch (Throwable e2) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e2);
            m2620b(1);
        } catch (SecurityException e3) {
            throw e3;
        } catch (RemoteException e4) {
            e2 = e4;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e2);
            m2611a(8, null, null, this.f2033c.get());
        } catch (RuntimeException e5) {
            e2 = e5;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e2);
            m2611a(8, null, null, this.f2033c.get());
        }
    }

    /* renamed from: a */
    protected void m2616a(ConnectionResult connectionResult) {
        this.f2037h = connectionResult.m19506c();
        this.f2038i = System.currentTimeMillis();
    }

    /* renamed from: a */
    public void m2617a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        synchronized (this.f2043n) {
            int i = this.f2049t;
            IInterface iInterface = this.f2046q;
        }
        synchronized (this.f2044o) {
            api api = this.f2045p;
        }
        printWriter.append(str).append("mConnectState=");
        switch (i) {
            case 1:
                printWriter.print("DISCONNECTED");
                break;
            case 2:
                printWriter.print("CONNECTING");
                break;
            case 3:
                printWriter.print("CONNECTED");
                break;
            case 4:
                printWriter.print("DISCONNECTING");
                break;
            default:
                printWriter.print("UNKNOWN");
                break;
        }
        printWriter.append(" mService=");
        if (iInterface == null) {
            printWriter.append("null");
        } else {
            printWriter.append(mo341b()).append("@").append(Integer.toHexString(System.identityHashCode(iInterface.asBinder())));
        }
        printWriter.append(" mServiceBroker=");
        if (api == null) {
            printWriter.println("null");
        } else {
            printWriter.append("IGmsServiceBroker@").println(Integer.toHexString(System.identityHashCode(api.asBinder())));
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
        if (this.f2036g > 0) {
            PrintWriter append = printWriter.append(str).append("lastConnectedTime=");
            long j = this.f2036g;
            String valueOf = String.valueOf(simpleDateFormat.format(new Date(this.f2036g)));
            append.println(new StringBuilder(String.valueOf(valueOf).length() + 21).append(j).append(" ").append(valueOf).toString());
        }
        if (this.f2035f > 0) {
            printWriter.append(str).append("lastSuspendedCause=");
            switch (this.f2034e) {
                case 1:
                    printWriter.append("CAUSE_SERVICE_DISCONNECTED");
                    break;
                case 2:
                    printWriter.append("CAUSE_NETWORK_LOST");
                    break;
                default:
                    printWriter.append(String.valueOf(this.f2034e));
                    break;
            }
            append = printWriter.append(" lastSuspendedTime=");
            j = this.f2035f;
            valueOf = String.valueOf(simpleDateFormat.format(new Date(this.f2035f)));
            append.println(new StringBuilder(String.valueOf(valueOf).length() + 21).append(j).append(" ").append(valueOf).toString());
        }
        if (this.f2038i > 0) {
            printWriter.append(str).append("lastFailedStatus=").append(ano.m2577b(this.f2037h));
            append = printWriter.append(" lastFailedTime=");
            j = this.f2038i;
            String valueOf2 = String.valueOf(simpleDateFormat.format(new Date(this.f2038i)));
            append.println(new StringBuilder(String.valueOf(valueOf2).length() + 21).append(j).append(" ").append(valueOf2).toString());
        }
    }

    /* renamed from: b */
    protected abstract T mo340b(IBinder iBinder);

    /* renamed from: b */
    protected abstract String mo341b();

    /* renamed from: b */
    public void m2620b(int i) {
        this.f2031a.sendMessage(this.f2031a.obtainMessage(4, this.f2033c.get(), i));
    }

    /* renamed from: c */
    public boolean mo342c() {
        return false;
    }

    /* renamed from: d */
    public Intent mo343d() {
        throw new UnsupportedOperationException("Not a sign in API");
    }

    /* renamed from: f */
    public void mo779f() {
        this.f2033c.incrementAndGet();
        synchronized (this.f2047r) {
            int size = this.f2047r.size();
            for (int i = 0; i < size; i++) {
                ((C0660e) this.f2047r.get(i)).m4723d();
            }
            this.f2047r.clear();
        }
        synchronized (this.f2044o) {
            this.f2045p = null;
        }
        m2599a(1, null);
    }

    /* renamed from: g */
    public boolean m2624g() {
        boolean z;
        synchronized (this.f2043n) {
            z = this.f2049t == 3;
        }
        return z;
    }

    /* renamed from: h */
    public boolean m2625h() {
        boolean z;
        synchronized (this.f2043n) {
            z = this.f2049t == 2;
        }
        return z;
    }

    /* renamed from: i */
    public boolean mo799i() {
        return false;
    }

    protected String i_() {
        return "com.google.android.gms";
    }

    /* renamed from: j */
    public boolean m2627j() {
        return true;
    }

    /* renamed from: k */
    public IBinder m2628k() {
        IBinder iBinder;
        synchronized (this.f2044o) {
            if (this.f2045p == null) {
                iBinder = null;
            } else {
                iBinder = this.f2045p.asBinder();
            }
        }
        return iBinder;
    }

    /* renamed from: m */
    protected final String m2629m() {
        return this.f2053x == null ? this.f2039j.getClass().getName() : this.f2053x;
    }

    /* renamed from: n */
    public void m2630n() {
        int a = this.f2042m.mo565a(this.f2039j);
        if (a != 0) {
            m2599a(1, null);
            m2614a(new C0669i(this), a, null);
            return;
        }
        m2613a(new C0669i(this));
    }

    /* renamed from: o */
    public final Context m2631o() {
        return this.f2039j;
    }

    /* renamed from: p */
    public Account mo335p() {
        return null;
    }

    /* renamed from: q */
    public zzc[] mo336q() {
        return new zzc[0];
    }

    /* renamed from: r */
    public final Account m2634r() {
        return mo335p() != null ? mo335p() : new Account("<<default account>>", "com.google");
    }

    /* renamed from: s */
    protected Bundle mo734s() {
        return new Bundle();
    }

    /* renamed from: t */
    protected final void m2636t() {
        if (!m2624g()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    /* renamed from: u */
    public Bundle m2637u() {
        return null;
    }

    /* renamed from: v */
    public final T m2638v() throws DeadObjectException {
        T t;
        synchronized (this.f2043n) {
            if (this.f2049t == 4) {
                throw new DeadObjectException();
            }
            m2636t();
            aoi.m4685a(this.f2046q != null, (Object) "Client is connected but service is null");
            t = this.f2046q;
        }
        return t;
    }

    /* renamed from: w */
    public boolean m2639w() {
        return false;
    }

    /* renamed from: x */
    protected Set<Scope> mo337x() {
        return Collections.EMPTY_SET;
    }
}
