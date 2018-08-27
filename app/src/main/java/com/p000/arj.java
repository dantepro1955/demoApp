package com.p000;

import android.app.Dialog;
import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.internal.zzaaz.C0724a;

/* renamed from: arj */
public abstract class arj extends asg implements OnCancelListener {
    /* renamed from: a */
    protected boolean f4022a;
    /* renamed from: b */
    protected boolean f4023b;
    /* renamed from: c */
    protected final anj f4024c;
    /* renamed from: e */
    private ConnectionResult f4025e;
    /* renamed from: f */
    private int f4026f;
    /* renamed from: g */
    private final Handler f4027g;

    /* renamed from: arj$a */
    class C0726a implements Runnable {
        /* renamed from: a */
        final /* synthetic */ arj f4040a;

        private C0726a(arj arj) {
            this.f4040a = arj;
        }

        public void run() {
            if (!this.f4040a.f4022a) {
                return;
            }
            if (this.f4040a.f4025e.m19504a()) {
                this.f4040a.d.startActivityForResult(GoogleApiActivity.zzb(this.f4040a.m5082f(), this.f4040a.f4025e.m19507d(), this.f4040a.f4026f, false), 1);
            } else if (this.f4040a.f4024c.mo568a(this.f4040a.f4025e.m19506c())) {
                this.f4040a.f4024c.m4544a(this.f4040a.m5082f(), this.f4040a.d, this.f4040a.f4025e.m19506c(), 2, this.f4040a);
            } else if (this.f4040a.f4025e.m19506c() == 18) {
                final Dialog a = this.f4040a.f4024c.m4533a(this.f4040a.m5082f(), this.f4040a);
                this.f4040a.f4024c.m4538a(this.f4040a.m5082f().getApplicationContext(), new C0724a(this) {
                    /* renamed from: b */
                    final /* synthetic */ C0726a f4039b;

                    /* renamed from: a */
                    public void mo629a() {
                        this.f4039b.f4040a.m5094d();
                        if (a.isShowing()) {
                            a.dismiss();
                        }
                    }
                });
            } else {
                this.f4040a.mo626a(this.f4040a.f4025e, this.f4040a.f4026f);
            }
        }
    }

    protected arj(ash ash) {
        this(ash, anj.m4530a());
    }

    arj(ash ash, anj anj) {
        super(ash);
        this.f4026f = -1;
        this.f4027g = new Handler(Looper.getMainLooper());
        this.f4024c = anj;
    }

    /* renamed from: a */
    public void mo621a() {
        super.mo621a();
        this.f4022a = true;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public void mo622a(int r6, int r7, android.content.Intent r8) {
        /*
        r5 = this;
        r4 = 18;
        r2 = 13;
        r0 = 1;
        r1 = 0;
        switch(r6) {
            case 1: goto L_0x0027;
            case 2: goto L_0x0010;
            default: goto L_0x0009;
        };
    L_0x0009:
        r0 = r1;
    L_0x000a:
        if (r0 == 0) goto L_0x003d;
    L_0x000c:
        r5.m5094d();
    L_0x000f:
        return;
    L_0x0010:
        r2 = r5.f4024c;
        r3 = r5.m5082f();
        r2 = r2.mo565a(r3);
        if (r2 != 0) goto L_0x0047;
    L_0x001c:
        r1 = r5.f4025e;
        r1 = r1.m19506c();
        if (r1 != r4) goto L_0x000a;
    L_0x0024:
        if (r2 != r4) goto L_0x000a;
    L_0x0026:
        goto L_0x000f;
    L_0x0027:
        r3 = -1;
        if (r7 == r3) goto L_0x000a;
    L_0x002a:
        if (r7 != 0) goto L_0x0009;
    L_0x002c:
        if (r8 == 0) goto L_0x0045;
    L_0x002e:
        r0 = "<<ResolutionFailureErrorDetail>>";
        r0 = r8.getIntExtra(r0, r2);
    L_0x0034:
        r2 = new com.google.android.gms.common.ConnectionResult;
        r3 = 0;
        r2.<init>(r0, r3);
        r5.f4025e = r2;
        goto L_0x0009;
    L_0x003d:
        r0 = r5.f4025e;
        r1 = r5.f4026f;
        r5.mo626a(r0, r1);
        goto L_0x000f;
    L_0x0045:
        r0 = r2;
        goto L_0x0034;
    L_0x0047:
        r0 = r1;
        goto L_0x001c;
        */
        throw new UnsupportedOperationException("Method not decompiled: arj.a(int, int, android.content.Intent):void");
    }

    /* renamed from: a */
    public void mo623a(Bundle bundle) {
        super.mo623a(bundle);
        if (bundle != null) {
            this.f4023b = bundle.getBoolean("resolving_error", false);
            if (this.f4023b) {
                this.f4026f = bundle.getInt("failed_client_id", -1);
                this.f4025e = new ConnectionResult(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution"));
            }
        }
    }

    /* renamed from: a */
    protected abstract void mo626a(ConnectionResult connectionResult, int i);

    /* renamed from: b */
    public void mo624b() {
        super.mo624b();
        this.f4022a = false;
    }

    /* renamed from: b */
    public void mo625b(Bundle bundle) {
        super.mo625b(bundle);
        bundle.putBoolean("resolving_error", this.f4023b);
        if (this.f4023b) {
            bundle.putInt("failed_client_id", this.f4026f);
            bundle.putInt("failed_status", this.f4025e.m19506c());
            bundle.putParcelable("failed_resolution", this.f4025e.m19507d());
        }
    }

    /* renamed from: b */
    public void m5092b(ConnectionResult connectionResult, int i) {
        if (!this.f4023b) {
            this.f4023b = true;
            this.f4026f = i;
            this.f4025e = connectionResult;
            this.f4027g.post(new C0726a());
        }
    }

    /* renamed from: c */
    protected abstract void mo628c();

    /* renamed from: d */
    protected void m5094d() {
        this.f4026f = -1;
        this.f4023b = false;
        this.f4025e = null;
        mo628c();
    }

    public void onCancel(DialogInterface dialogInterface) {
        mo626a(new ConnectionResult(13, null), this.f4026f);
        m5094d();
    }
}
