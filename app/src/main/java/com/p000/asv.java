package com.p000;

import android.os.Handler;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import java.lang.ref.WeakReference;

/* renamed from: asv */
public class asv<R extends ant> extends anx<R> implements anu<R> {
    /* renamed from: a */
    private anw<? super R, ? extends ant> f4277a;
    /* renamed from: b */
    private asv<? extends ant> f4278b;
    /* renamed from: c */
    private volatile anv<? super R> f4279c;
    /* renamed from: d */
    private anq<R> f4280d;
    /* renamed from: e */
    private final Object f4281e;
    /* renamed from: f */
    private Status f4282f;
    /* renamed from: g */
    private final WeakReference<GoogleApiClient> f4283g;
    /* renamed from: h */
    private final C0775a f4284h;
    /* renamed from: i */
    private boolean f4285i;

    /* renamed from: asv$a */
    final class C0775a extends Handler {
        /* renamed from: a */
        final /* synthetic */ asv f4276a;

        public void handleMessage(Message message) {
            switch (message.what) {
                case 0:
                    anq anq = (anq) message.obj;
                    synchronized (this.f4276a.f4281e) {
                        if (anq == null) {
                            this.f4276a.f4278b.m5510a(new Status(13, "Transform returned null"));
                        } else if (anq instanceof asq) {
                            this.f4276a.f4278b.m5510a(((asq) anq).m5495a());
                        } else {
                            this.f4276a.f4278b.m5520a(anq);
                        }
                    }
                    return;
                case 1:
                    RuntimeException runtimeException = (RuntimeException) message.obj;
                    String str = "TransformedResultImpl";
                    String str2 = "Runtime exception on the transformation worker thread: ";
                    String valueOf = String.valueOf(runtimeException.getMessage());
                    Log.e(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
                    throw runtimeException;
                default:
                    Log.e("TransformedResultImpl", "TransformationResultHandler received unknown message type: " + message.what);
                    return;
            }
        }
    }

    /* renamed from: a */
    private void m5510a(Status status) {
        synchronized (this.f4281e) {
            this.f4282f = status;
            m5514b(this.f4282f);
        }
    }

    /* renamed from: b */
    private void m5512b() {
        if (this.f4277a != null || this.f4279c != null) {
            GoogleApiClient googleApiClient = (GoogleApiClient) this.f4283g.get();
            if (!(this.f4285i || this.f4277a == null || googleApiClient == null)) {
                googleApiClient.zza(this);
                this.f4285i = true;
            }
            if (this.f4282f != null) {
                m5514b(this.f4282f);
            } else if (this.f4280d != null) {
                this.f4280d.mo346a((anu) this);
            }
        }
    }

    /* renamed from: b */
    private void m5513b(ant ant) {
        if (ant instanceof ans) {
            try {
                ((ans) ant).mo1004a();
            } catch (Throwable e) {
                String valueOf = String.valueOf(ant);
                Log.w("TransformedResultImpl", new StringBuilder(String.valueOf(valueOf).length() + 18).append("Unable to release ").append(valueOf).toString(), e);
            }
        }
    }

    /* renamed from: b */
    private void m5514b(Status status) {
        synchronized (this.f4281e) {
            if (this.f4277a != null) {
                Status a = this.f4277a.m4573a(status);
                aoi.m4680a((Object) a, (Object) "onFailure must not return null");
                this.f4278b.m5510a(a);
            } else if (m5516c()) {
                this.f4279c.m4570a(status);
            }
        }
    }

    /* renamed from: c */
    private boolean m5516c() {
        return (this.f4279c == null || ((GoogleApiClient) this.f4283g.get()) == null) ? false : true;
    }

    /* renamed from: a */
    void m5519a() {
        this.f4279c = null;
    }

    /* renamed from: a */
    public void m5520a(anq<?> anq) {
        synchronized (this.f4281e) {
            this.f4280d = anq;
            m5512b();
        }
    }

    /* renamed from: a */
    public void mo687a(final R r) {
        synchronized (this.f4281e) {
            if (!r.mo325b().m19519e()) {
                m5510a(r.mo325b());
                m5513b((ant) r);
            } else if (this.f4277a != null) {
                asp.m5494a().submit(new Runnable(this) {
                    /* renamed from: b */
                    final /* synthetic */ asv f4275b;

                    public void run() {
                        GoogleApiClient googleApiClient;
                        try {
                            ark.f2059c.set(Boolean.valueOf(true));
                            this.f4275b.f4284h.sendMessage(this.f4275b.f4284h.obtainMessage(0, this.f4275b.f4277a.m4572a(r)));
                            ark.f2059c.set(Boolean.valueOf(false));
                            this.f4275b.m5513b(r);
                            googleApiClient = (GoogleApiClient) this.f4275b.f4283g.get();
                            if (googleApiClient != null) {
                                googleApiClient.zzb(this.f4275b);
                            }
                        } catch (RuntimeException e) {
                            this.f4275b.f4284h.sendMessage(this.f4275b.f4284h.obtainMessage(1, e));
                            ark.f2059c.set(Boolean.valueOf(false));
                            this.f4275b.m5513b(r);
                            googleApiClient = (GoogleApiClient) this.f4275b.f4283g.get();
                            if (googleApiClient != null) {
                                googleApiClient.zzb(this.f4275b);
                            }
                        } catch (Throwable th) {
                            Throwable th2 = th;
                            ark.f2059c.set(Boolean.valueOf(false));
                            this.f4275b.m5513b(r);
                            googleApiClient = (GoogleApiClient) this.f4275b.f4283g.get();
                            if (googleApiClient != null) {
                                googleApiClient.zzb(this.f4275b);
                            }
                        }
                    }
                });
            } else if (m5516c()) {
                this.f4279c.m4571b(r);
            }
        }
    }
}
