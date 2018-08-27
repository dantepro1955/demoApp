package com.p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import java.util.ArrayList;
import p000.bsy.C1451a;
import p000.bte.C1463a;
import p000.btn.C1479a;
import p000.btn.C1480b;

/* renamed from: btl */
public abstract class btl<T extends IInterface> implements btn {
    /* renamed from: a */
    final Handler f7595a;
    /* renamed from: b */
    private final Context f7596b;
    /* renamed from: c */
    private T f7597c;
    /* renamed from: d */
    private ArrayList<C1479a> f7598d;
    /* renamed from: e */
    private final ArrayList<C1479a> f7599e = new ArrayList();
    /* renamed from: f */
    private boolean f7600f = false;
    /* renamed from: g */
    private ArrayList<C1480b> f7601g;
    /* renamed from: h */
    private boolean f7602h = false;
    /* renamed from: i */
    private final ArrayList<C1472b<?>> f7603i = new ArrayList();
    /* renamed from: j */
    private ServiceConnection f7604j;
    /* renamed from: k */
    private boolean f7605k = false;

    /* renamed from: btl$a */
    final class C1471a extends Handler {
        /* renamed from: a */
        final /* synthetic */ btl f7611a;

        C1471a(btl btl) {
            this.f7611a = btl;
        }

        public final void handleMessage(Message message) {
            if (message.what == 3) {
                this.f7611a.m10872a((bsq) message.obj);
            } else if (message.what == 4) {
                synchronized (this.f7611a.f7598d) {
                    if (this.f7611a.f7605k && this.f7611a.m10879f() && this.f7611a.f7598d.contains(message.obj)) {
                        ((C1479a) message.obj).mo3149a();
                    }
                }
            } else if (message.what == 2 && !this.f7611a.m10879f()) {
            } else {
                if (message.what == 2 || message.what == 1) {
                    ((C1472b) message.obj).m10892a();
                }
            }
        }
    }

    /* renamed from: btl$b */
    public abstract class C1472b<TListener> {
        /* renamed from: a */
        final /* synthetic */ btl f7612a;
        /* renamed from: b */
        private TListener f7613b;

        public C1472b(btl btl, TListener tListener) {
            this.f7612a = btl;
            this.f7613b = tListener;
            synchronized (btl.f7603i) {
                btl.f7603i.add(this);
            }
        }

        /* renamed from: a */
        public final void m10892a() {
            Object obj;
            synchronized (this) {
                obj = this.f7613b;
            }
            mo1515a(obj);
        }

        /* renamed from: a */
        protected abstract void mo1515a(TListener tListener);

        /* renamed from: b */
        public final void m10894b() {
            synchronized (this) {
                this.f7613b = null;
            }
        }
    }

    /* renamed from: btl$c */
    public final class C1473c extends C1472b<Boolean> {
        /* renamed from: b */
        public final bsq f7614b;
        /* renamed from: c */
        public final IBinder f7615c;
        /* renamed from: d */
        final /* synthetic */ btl f7616d;

        public C1473c(btl btl, String str, IBinder iBinder) {
            this.f7616d = btl;
            super(btl, Boolean.valueOf(true));
            this.f7614b = btl.m10866b(str);
            this.f7615c = iBinder;
        }

        /* renamed from: a */
        protected final /* synthetic */ void mo1515a(Object obj) {
            if (((Boolean) obj) != null) {
                switch (this.f7614b) {
                    case SUCCESS:
                        try {
                            if (this.f7616d.mo1513b().equals(this.f7615c.getInterfaceDescriptor())) {
                                this.f7616d.f7597c = this.f7616d.mo1510a(this.f7615c);
                                if (this.f7616d.f7597c != null) {
                                    this.f7616d.m10880g();
                                    return;
                                }
                            }
                        } catch (RemoteException e) {
                        }
                        this.f7616d.mo1509a();
                        this.f7616d.m10872a(bsq.INTERNAL_ERROR);
                        return;
                    default:
                        this.f7616d.m10872a(this.f7614b);
                        return;
                }
            }
        }
    }

    /* renamed from: btl$d */
    public final class C1474d extends C1451a {
        /* renamed from: a */
        final /* synthetic */ btl f7617a;

        protected C1474d(btl btl) {
            this.f7617a = btl;
        }

        /* renamed from: a */
        public final void mo1436a(String str, IBinder iBinder) {
            this.f7617a.f7595a.sendMessage(this.f7617a.f7595a.obtainMessage(1, new C1473c(this.f7617a, str, iBinder)));
        }
    }

    /* renamed from: btl$e */
    final class C1475e implements ServiceConnection {
        /* renamed from: a */
        final /* synthetic */ btl f7618a;

        C1475e(btl btl) {
            this.f7618a = btl;
        }

        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            this.f7618a.m10875b(iBinder);
        }

        public final void onServiceDisconnected(ComponentName componentName) {
            this.f7618a.f7597c = null;
            this.f7618a.m10881h();
        }
    }

    protected btl(Context context, C1479a c1479a, C1480b c1480b) {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Clients must be created on the UI thread.");
        }
        this.f7596b = (Context) bsv.m10706a((Object) context);
        this.f7598d = new ArrayList();
        this.f7598d.add(bsv.m10706a((Object) c1479a));
        this.f7601g = new ArrayList();
        this.f7601g.add(bsv.m10706a((Object) c1480b));
        this.f7595a = new C1471a(this);
    }

    /* renamed from: a */
    private void mo1509a() {
        if (this.f7604j != null) {
            try {
                this.f7596b.unbindService(this.f7604j);
            } catch (Throwable e) {
                Log.w("YouTubeClient", "Unexpected error from unbindService()", e);
            }
        }
        this.f7597c = null;
        this.f7604j = null;
    }

    /* renamed from: b */
    private static bsq m10866b(String str) {
        try {
            return bsq.valueOf(str);
        } catch (IllegalArgumentException e) {
            return bsq.UNKNOWN_ERROR;
        } catch (NullPointerException e2) {
            return bsq.UNKNOWN_ERROR;
        }
    }

    /* renamed from: a */
    protected abstract T mo1510a(IBinder iBinder);

    /* renamed from: a */
    protected final void m10872a(bsq bsq) {
        this.f7595a.removeMessages(4);
        synchronized (this.f7601g) {
            this.f7602h = true;
            ArrayList arrayList = this.f7601g;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                if (this.f7605k) {
                    if (this.f7601g.contains(arrayList.get(i))) {
                        ((C1480b) arrayList.get(i)).mo3151a(bsq);
                    }
                    i++;
                } else {
                    return;
                }
            }
            this.f7602h = false;
        }
    }

    /* renamed from: a */
    protected abstract void mo1511a(bte bte, C1474d c1474d) throws RemoteException;

    /* renamed from: b */
    protected abstract String mo1513b();

    /* renamed from: b */
    protected final void m10875b(IBinder iBinder) {
        try {
            mo1511a(C1463a.m10837a(iBinder), new C1474d(this));
        } catch (RemoteException e) {
            Log.w("YouTubeClient", "service died");
        }
    }

    /* renamed from: c */
    protected abstract String mo1514c();

    /* renamed from: d */
    public void mo1507d() {
        m10881h();
        this.f7605k = false;
        synchronized (this.f7603i) {
            int size = this.f7603i.size();
            for (int i = 0; i < size; i++) {
                ((C1472b) this.f7603i.get(i)).m10894b();
            }
            this.f7603i.clear();
        }
        mo1509a();
    }

    /* renamed from: e */
    public final void mo1508e() {
        this.f7605k = true;
        bsq a = bsp.m10665a(this.f7596b);
        if (a != bsq.SUCCESS) {
            this.f7595a.sendMessage(this.f7595a.obtainMessage(3, a));
            return;
        }
        Intent intent = new Intent(mo1514c()).setPackage(btt.m10953a(this.f7596b));
        if (this.f7604j != null) {
            Log.e("YouTubeClient", "Calling connect() while still connected, missing disconnect().");
            mo1509a();
        }
        this.f7604j = new C1475e(this);
        if (!this.f7596b.bindService(intent, this.f7604j, 129)) {
            this.f7595a.sendMessage(this.f7595a.obtainMessage(3, bsq.ERROR_CONNECTING_TO_SERVICE));
        }
    }

    /* renamed from: f */
    public final boolean m10879f() {
        return this.f7597c != null;
    }

    /* renamed from: g */
    protected final void m10880g() {
        boolean z = true;
        synchronized (this.f7598d) {
            bsv.m10709a(!this.f7600f);
            this.f7595a.removeMessages(4);
            this.f7600f = true;
            if (this.f7599e.size() != 0) {
                z = false;
            }
            bsv.m10709a(z);
            ArrayList arrayList = this.f7598d;
            int size = arrayList.size();
            for (int i = 0; i < size && this.f7605k && m10879f(); i++) {
                if (!this.f7599e.contains(arrayList.get(i))) {
                    ((C1479a) arrayList.get(i)).mo3149a();
                }
            }
            this.f7599e.clear();
            this.f7600f = false;
        }
    }

    /* renamed from: h */
    protected final void m10881h() {
        this.f7595a.removeMessages(4);
        synchronized (this.f7598d) {
            this.f7600f = true;
            ArrayList arrayList = this.f7598d;
            int size = arrayList.size();
            for (int i = 0; i < size && this.f7605k; i++) {
                if (this.f7598d.contains(arrayList.get(i))) {
                    ((C1479a) arrayList.get(i)).mo3150b();
                }
            }
            this.f7600f = false;
        }
    }

    /* renamed from: i */
    protected final void m10882i() {
        if (!m10879f()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    /* renamed from: j */
    protected final T m10883j() {
        m10882i();
        return this.f7597c;
    }
}
