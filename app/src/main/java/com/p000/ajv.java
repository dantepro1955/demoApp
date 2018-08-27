package com.p000;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import com.google.android.gms.internal.zzeg;
import com.google.android.gms.internal.zzqh;
import java.util.Map;
import p000.bjt.C1254a;

@bhd
/* renamed from: ajv */
public abstract class ajv extends aju implements akb, bfu {

    /* renamed from: ajv$1 */
    class C02271 implements bcy {
        /* renamed from: a */
        final /* synthetic */ ajv f1743a;

        C02271(ajv ajv) {
            this.f1743a = ajv;
        }

        /* renamed from: a */
        public void mo277a(blo blo, Map<String, String> map) {
            if (this.f1743a.f.f14558j != null) {
                this.f1743a.h.m6452a(this.f1743a.f.f14557i, this.f1743a.f.f14558j, blo.mo1305b(), (bef) blo);
            } else {
                bky.m9011e("Request to enable ActiveView before adState is available.");
            }
        }
    }

    public ajv(Context context, zzeg zzeg, String str, bex bex, zzqh zzqh, ajx ajx) {
        super(context, zzeg, str, bex, zzqh, ajx);
    }

    /* renamed from: J */
    public void mo278J() {
        onAdClicked();
    }

    /* renamed from: K */
    public void mo279K() {
        m2021E();
        mo249l();
    }

    /* renamed from: L */
    public void mo280L() {
        mo309r();
    }

    /* renamed from: a */
    protected blo mo286a(C1254a c1254a, ajy ajy, bjk bjk) {
        blo blo = null;
        View nextView = this.f.f14554f.getNextView();
        if (nextView instanceof blo) {
            blo = (blo) nextView;
            if (((Boolean) bbb.aC.m7064c()).booleanValue()) {
                bky.m9006b("Reusing webview...");
                blo.mo1298a(this.f.f14551c, this.f.f14557i, this.a);
            } else {
                blo.destroy();
                blo = null;
            }
        }
        if (blo == null) {
            if (nextView != null) {
                this.f.f14554f.removeView(nextView);
            }
            blo = ako.m2344f().m9442a(this.f.f14551c, this.f.f14557i, false, false, this.f.f14552d, this.f.f14553e, this.a, this, this.i);
            if (this.f.f14557i.f14937g == null) {
                m1955a(blo.mo1305b());
            }
        }
        bef bef = blo;
        bef.mo1322l().m9411a(this, this, this, this, false, this, null, ajy, this, bjk);
        m2059a(bef);
        bef.mo1308b(c1254a.f6529a.f15053v);
        return bef;
    }

    /* renamed from: a */
    public void mo281a(int i, int i2, int i3, int i4) {
        m2000t();
    }

    /* renamed from: a */
    public void mo230a(bbn bbn) {
        aoi.m4687b("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        this.f.f14574z = bbn;
    }

    /* renamed from: a */
    protected void m2059a(bef bef) {
        bef.mo1023a("/trackActiveViewUnit", new C02271(this));
    }

    /* renamed from: a */
    protected void mo282a(final C1254a c1254a, final bbj bbj) {
        if (c1254a.f6533e != -2) {
            bkg.f6710a.post(new Runnable(this) {
                /* renamed from: b */
                final /* synthetic */ ajv f1745b;

                public void run() {
                    this.f1745b.mo243b(new bjt(c1254a, null, null, null, null, null, null, null));
                }
            });
            return;
        }
        if (c1254a.f6532d != null) {
            this.f.f14557i = c1254a.f6532d;
        }
        if (!c1254a.f6530b.f15082h || c1254a.f6530b.f15059B) {
            bkg.f6710a.post(new Runnable(this, null) {
                /* renamed from: d */
                final /* synthetic */ ajv f1751d;

                public void run() {
                    if (c1254a.f6530b.f15093s && this.f1751d.f.f14574z != null) {
                        String str = null;
                        if (c1254a.f6530b.f15076b != null) {
                            str = ako.m2343e().m9090a(c1254a.f6530b.f15076b);
                        }
                        bbm bbk = new bbk(this.f1751d, str, c1254a.f6530b.f15077c);
                        this.f1751d.f.f14539F = 1;
                        try {
                            this.f1751d.d = false;
                            this.f1751d.f.f14574z.mo920a(bbk);
                            return;
                        } catch (Throwable e) {
                            bky.m9009c("Could not call the onCustomRenderedAdLoadedListener.", e);
                            this.f1751d.d = true;
                        }
                    }
                    final ajy ajy = new ajy(this.f1751d.f.f14551c, c1254a);
                    blo a = this.f1751d.mo286a(c1254a, ajy, null);
                    a.setOnTouchListener(new OnTouchListener(this) {
                        public boolean onTouch(View view, MotionEvent motionEvent) {
                            ajy.m2066a();
                            return false;
                        }
                    });
                    a.setOnClickListener(new OnClickListener(this) {
                        public void onClick(View view) {
                            ajy.m2066a();
                        }
                    });
                    this.f1751d.f.f14539F = 0;
                    this.f1751d.f.f14556h = ako.m2342d().m8315a(this.f1751d.f.f14551c, this.f1751d, c1254a, this.f1751d.f.f14552d, a, this.f1751d.j, this.f1751d, bbj);
                }
            });
            return;
        }
        this.f.f14539F = 0;
        this.f.f14556h = ako.m2342d().m8315a(this.f.f14551c, this, c1254a, this.f.f14552d, null, this.j, this, bbj);
    }

    /* renamed from: a */
    protected boolean mo268a(bjt bjt, bjt bjt2) {
        if (this.f.m19374e() && this.f.f14554f != null) {
            this.f.f14554f.m19362a().m9217c(bjt2.f6539C);
        }
        return super.mo268a(bjt, bjt2);
    }

    /* renamed from: b */
    public void mo283b(View view) {
        this.f.f14538E = view;
        mo243b(new bjt(this.f.f14559k, null, null, null, null, null, null, null));
    }
}
