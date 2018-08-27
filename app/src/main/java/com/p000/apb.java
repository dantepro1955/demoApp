package com.p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.IBinder;
import android.os.Message;
import android.util.Log;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import p000.apa.C0680a;

/* renamed from: apb */
final class apb extends apa implements Callback {
    /* renamed from: a */
    private final HashMap<C0680a, C0681a> f3890a = new HashMap();
    /* renamed from: b */
    private final Context f3891b;
    /* renamed from: c */
    private final Handler f3892c;
    /* renamed from: d */
    private final apm f3893d;
    /* renamed from: e */
    private final long f3894e;
    /* renamed from: f */
    private final long f3895f;

    /* renamed from: apb$a */
    final class C0681a implements ServiceConnection {
        /* renamed from: a */
        final /* synthetic */ apb f3883a;
        /* renamed from: b */
        private final Set<ServiceConnection> f3884b = new HashSet();
        /* renamed from: c */
        private int f3885c = 2;
        /* renamed from: d */
        private boolean f3886d;
        /* renamed from: e */
        private IBinder f3887e;
        /* renamed from: f */
        private final C0680a f3888f;
        /* renamed from: g */
        private ComponentName f3889g;

        public C0681a(apb apb, C0680a c0680a) {
            this.f3883a = apb;
            this.f3888f = c0680a;
        }

        /* renamed from: a */
        public void m4813a(ServiceConnection serviceConnection, String str) {
            this.f3883a.f3893d.m4858a(this.f3883a.f3891b, serviceConnection, str, this.f3888f.m4805c());
            this.f3884b.add(serviceConnection);
        }

        /* renamed from: a */
        public void m4814a(String str) {
            this.f3885c = 3;
            this.f3886d = this.f3883a.f3893d.m4860a(this.f3883a.f3891b, str, this.f3888f.m4805c(), this, 129);
            if (this.f3886d) {
                this.f3883a.f3892c.sendMessageDelayed(this.f3883a.f3892c.obtainMessage(1, this.f3888f), this.f3883a.f3895f);
                return;
            }
            this.f3885c = 2;
            try {
                this.f3883a.f3893d.m4857a(this.f3883a.f3891b, (ServiceConnection) this);
            } catch (IllegalArgumentException e) {
            }
        }

        /* renamed from: a */
        public boolean m4815a() {
            return this.f3886d;
        }

        /* renamed from: a */
        public boolean m4816a(ServiceConnection serviceConnection) {
            return this.f3884b.contains(serviceConnection);
        }

        /* renamed from: b */
        public int m4817b() {
            return this.f3885c;
        }

        /* renamed from: b */
        public void m4818b(ServiceConnection serviceConnection, String str) {
            this.f3883a.f3893d.m4861b(this.f3883a.f3891b, serviceConnection);
            this.f3884b.remove(serviceConnection);
        }

        /* renamed from: b */
        public void m4819b(String str) {
            this.f3883a.f3892c.removeMessages(1, this.f3888f);
            this.f3883a.f3893d.m4857a(this.f3883a.f3891b, (ServiceConnection) this);
            this.f3886d = false;
            this.f3885c = 2;
        }

        /* renamed from: c */
        public boolean m4820c() {
            return this.f3884b.isEmpty();
        }

        /* renamed from: d */
        public IBinder m4821d() {
            return this.f3887e;
        }

        /* renamed from: e */
        public ComponentName m4822e() {
            return this.f3889g;
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            synchronized (this.f3883a.f3890a) {
                this.f3883a.f3892c.removeMessages(1, this.f3888f);
                this.f3887e = iBinder;
                this.f3889g = componentName;
                for (ServiceConnection onServiceConnected : this.f3884b) {
                    onServiceConnected.onServiceConnected(componentName, iBinder);
                }
                this.f3885c = 1;
            }
        }

        public void onServiceDisconnected(ComponentName componentName) {
            synchronized (this.f3883a.f3890a) {
                this.f3883a.f3892c.removeMessages(1, this.f3888f);
                this.f3887e = null;
                this.f3889g = componentName;
                for (ServiceConnection onServiceDisconnected : this.f3884b) {
                    onServiceDisconnected.onServiceDisconnected(componentName);
                }
                this.f3885c = 2;
            }
        }
    }

    apb(Context context) {
        this.f3891b = context.getApplicationContext();
        this.f3892c = new Handler(context.getMainLooper(), this);
        this.f3893d = apm.m4855a();
        this.f3894e = 5000;
        this.f3895f = 300000;
    }

    /* renamed from: a */
    protected boolean mo600a(C0680a c0680a, ServiceConnection serviceConnection, String str) {
        boolean a;
        aoi.m4680a((Object) serviceConnection, (Object) "ServiceConnection must not be null");
        synchronized (this.f3890a) {
            C0681a c0681a = (C0681a) this.f3890a.get(c0680a);
            if (c0681a != null) {
                this.f3892c.removeMessages(0, c0680a);
                if (!c0681a.m4816a(serviceConnection)) {
                    c0681a.m4813a(serviceConnection, str);
                    switch (c0681a.m4817b()) {
                        case 1:
                            serviceConnection.onServiceConnected(c0681a.m4822e(), c0681a.m4821d());
                            break;
                        case 2:
                            c0681a.m4814a(str);
                            break;
                        default:
                            break;
                    }
                }
                String valueOf = String.valueOf(c0680a);
                throw new IllegalStateException(new StringBuilder(String.valueOf(valueOf).length() + 81).append("Trying to bind a GmsServiceConnection that was already connected before.  config=").append(valueOf).toString());
            }
            c0681a = new C0681a(this, c0680a);
            c0681a.m4813a(serviceConnection, str);
            c0681a.m4814a(str);
            this.f3890a.put(c0680a, c0681a);
            a = c0681a.m4815a();
        }
        return a;
    }

    /* renamed from: b */
    protected void mo601b(C0680a c0680a, ServiceConnection serviceConnection, String str) {
        aoi.m4680a((Object) serviceConnection, (Object) "ServiceConnection must not be null");
        synchronized (this.f3890a) {
            C0681a c0681a = (C0681a) this.f3890a.get(c0680a);
            String valueOf;
            if (c0681a == null) {
                valueOf = String.valueOf(c0680a);
                throw new IllegalStateException(new StringBuilder(String.valueOf(valueOf).length() + 50).append("Nonexistent connection status for service config: ").append(valueOf).toString());
            } else if (c0681a.m4816a(serviceConnection)) {
                c0681a.m4818b(serviceConnection, str);
                if (c0681a.m4820c()) {
                    this.f3892c.sendMessageDelayed(this.f3892c.obtainMessage(0, c0680a), this.f3894e);
                }
            } else {
                valueOf = String.valueOf(c0680a);
                throw new IllegalStateException(new StringBuilder(String.valueOf(valueOf).length() + 76).append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=").append(valueOf).toString());
            }
        }
    }

    public boolean handleMessage(Message message) {
        C0680a c0680a;
        C0681a c0681a;
        switch (message.what) {
            case 0:
                synchronized (this.f3890a) {
                    c0680a = (C0680a) message.obj;
                    c0681a = (C0681a) this.f3890a.get(c0680a);
                    if (c0681a != null && c0681a.m4820c()) {
                        if (c0681a.m4815a()) {
                            c0681a.m4819b("GmsClientSupervisor");
                        }
                        this.f3890a.remove(c0680a);
                    }
                }
                return true;
            case 1:
                synchronized (this.f3890a) {
                    c0680a = (C0680a) message.obj;
                    c0681a = (C0681a) this.f3890a.get(c0680a);
                    if (c0681a != null && c0681a.m4817b() == 3) {
                        String valueOf = String.valueOf(c0680a);
                        Log.wtf("GmsClientSupervisor", new StringBuilder(String.valueOf(valueOf).length() + 47).append("Timeout waiting for ServiceConnection callback ").append(valueOf).toString(), new Exception());
                        ComponentName e = c0681a.m4822e();
                        if (e == null) {
                            e = c0680a.m4804b();
                        }
                        c0681a.onServiceDisconnected(e == null ? new ComponentName(c0680a.m4803a(), "unknown") : e);
                    }
                }
                return true;
            default:
                return false;
        }
    }
}
