package com.p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.design.widget.CoordinatorLayout.C0346c;
import android.text.Html;
import android.view.View;
import android.widget.TextView;
import com.facebook.internal.AnalyticsEvents;
import com.ninegag.android.app.R;
import com.ninegag.android.app.component.postlist.GagPostListFragment;
import com.ninegag.android.app.model.api.ApiUser;
import com.ninegag.android.app.otto.UpdateToolbarBehaviorEvent;
import com.ninegag.android.app.otto.gagpostlist.RemoteRefreshRequestEvent;
import com.ninegag.android.app.otto.upload.CancelUploadEvent;
import com.ninegag.android.blitz.ui.behaviors.QuickHideBehavior;
import java.util.List;
import p000.cfb.C1703b;
import p000.coq.C4520a;

/* compiled from: UserGagPostListFragmentModule */
/* renamed from: cfg */
public class cfg extends cfa {
    /* renamed from: k */
    private boolean f9027k = false;
    /* renamed from: l */
    private C1703b f9028l;
    /* renamed from: m */
    private cff f9029m;
    /* renamed from: n */
    private cfl f9030n;
    /* renamed from: o */
    private BroadcastReceiver f9031o = new C17061(this);

    /* compiled from: UserGagPostListFragmentModule */
    /* renamed from: cfg$1 */
    class C17061 extends BroadcastReceiver {
        /* renamed from: a */
        final /* synthetic */ cfg f9024a;

        C17061(cfg cfg) {
            this.f9024a = cfg;
        }

        public void onReceive(Context context, Intent intent) {
            if (intent.getAction().equals("com.ninegag.android.library.upload.PROGRES_CALLBACK")) {
                String stringExtra = intent.getStringExtra("upload_id");
                for (int i = 0; i < this.f9024a.f9030n.getItemCount(); i++) {
                    C4520a c4520a = (C4520a) this.f9024a.f9030n.m12974a().get(i);
                    if (c4520a.f19893a != null && c4520a.f19893a.equals(stringExtra)) {
                        c4520a.a(intent.getIntExtra("progress", 0), intent.getIntExtra(AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_STATUS, 0), intent.getStringExtra(AnalyticsEvents.PARAMETER_SHARE_ERROR_MESSAGE));
                        if (c4520a.f19896d == 101) {
                            this.f9024a.f9030n.m12976b(i);
                            dhe.c(this.f9024a.a.f8730b, new RemoteRefreshRequestEvent());
                        }
                    }
                }
            }
        }
    }

    public cfg(cco cco, GagPostListFragment gagPostListFragment, com com, boolean z) {
        super(cco, gagPostListFragment, com);
        this.f9027k = z;
        this.f9030n = new cfl(cco.f8730b, m12516l(), z);
    }

    /* renamed from: a */
    protected csb mo1681a(crw crw, cse cse) {
        ApiUser h = cij.m13687a().m13731h(this.a.f8733e);
        if (h == null || this.a.f8731c != 10) {
            return super.mo1681a(crw, cse);
        }
        this.f9028l = new C1703b(h.getUsername(), Html.fromHtml(h.getAbout()).toString(), h.avatarUrlSmall);
        this.f9029m = new cff(this.e, crw, cse, this.a, this.f9028l, this.f9030n);
        this.f9029m.m12475a(this.d);
        return this.f9029m;
    }

    /* renamed from: b */
    protected cse mo1702b() {
        this.b = new cfk(this.e, this.a.f8730b, m12516l(), this.f9027k, cij.m13687a().m13731h(this.a.f8733e), this.f.m12077h().mo1769i(), m12521q());
        ((cdn) this.b).m12681a(this.e);
        return this.b;
    }

    public void a_(String str) {
        z().post(cfh.m12967a(this));
    }

    /* renamed from: a */
    static /* synthetic */ void m12951a(cfg cfg) {
        cfg.m12953a(false, null);
        if (cfg.H() != null) {
            cfg.H().post(cfi.m12968a(cfg));
        }
        dhe.c(cfg.a.f8730b, new UpdateToolbarBehaviorEvent(cfg.m12526v()));
    }

    /* renamed from: d */
    public void mo1697d(final String str) {
        if (z() != null) {
            z().post(new Runnable(this) {
                /* renamed from: b */
                final /* synthetic */ cfg f9026b;

                public void run() {
                    this.f9026b.m12953a(true, this.f9026b.f.f8449a.getString(R.string.error_private).equals(str) ? str : null);
                    if (this.f9026b.H() != null) {
                        this.f9026b.H().post(cfj.m12969a(this));
                    }
                    dhe.c(this.f9026b.a.f8730b, new UpdateToolbarBehaviorEvent(this.f9026b.m12526v()));
                }
            });
        }
    }

    /* renamed from: a */
    private void m12953a(boolean z, String str) {
        int i = 0;
        if (m12523s() != null) {
            m12523s().setVisibility(z ? 0 : 8);
            G().setVisibility(0);
            TextView textView = (TextView) m12523s().findViewById(R.id.emptyText);
            if (str != null) {
                textView.setText(str);
            }
            if (!z) {
                i = 8;
            }
            textView.setVisibility(i);
        }
    }

    @dhg
    public void onUpdateToolbarBehavior(UpdateToolbarBehaviorEvent updateToolbarBehaviorEvent) {
        if (F() != null) {
            View findViewById = m12527w().findViewById(R.id.appBar);
            if (findViewById != null) {
                ((C0346c) findViewById.getLayoutParams()).m3097a(updateToolbarBehaviorEvent.a() ? new QuickHideBehavior(m12527w(), null) : null);
            }
        }
    }

    /* renamed from: a */
    protected void mo1683a(ccs ccs) {
        if (this.f9030n.getItemCount() != 0) {
            if (B() != null) {
                B().scrollToPosition(0);
            }
        } else if (this.a.f8731c != 10 || ccs == null || ccs.r() != 0) {
            super.mo1683a(ccs);
        }
    }

    /* renamed from: c */
    public void mo1684c() {
        super.mo1684c();
        dhe.a(this.a.f8730b, this);
    }

    /* renamed from: e */
    public void mo1685e() {
        dhe.b(this.a.f8730b, this);
        super.mo1685e();
    }

    /* renamed from: d */
    public void mo1708d() {
        super.mo1708d();
        if (m12527w() != null && this.a.f8731c == 10 && this.f9027k) {
            ApiUser h = cij.m13687a().m13731h(this.a.f8733e);
            if (!(h == null || this.a.f8731c != 10 || this.f9028l == null || this.f9029m == null)) {
                this.f9028l.m12935a(h.getUsername());
                this.f9028l.m12937b(Html.fromHtml(h.getAbout()).toString());
                this.f9028l.m12939c(h.avatarUrlSmall);
                this.f9029m.notifyItemChanged(0);
            }
            m12527w().registerReceiver(this.f9031o, new IntentFilter("com.ninegag.android.library.upload.META_CALLBACK"));
            m12527w().registerReceiver(this.f9031o, new IntentFilter("com.ninegag.android.library.upload.IMAGE_CALLBACK"));
            m12527w().registerReceiver(this.f9031o, new IntentFilter("com.ninegag.android.library.upload.PROGRES_CALLBACK"));
        }
    }

    /* renamed from: h */
    public void mo1709h() {
        super.mo1709h();
        if (m12527w() != null && this.a.f8731c == 10 && this.f9027k) {
            m12527w().unregisterReceiver(this.f9031o);
        }
    }

    @dhg
    public void onUploadCancel(CancelUploadEvent cancelUploadEvent) {
        List a = this.f9030n.m12974a();
        for (int i = 0; i < a.size(); i++) {
            C4520a c4520a = (C4520a) a.get(i);
            if (c4520a.f19893a != null && c4520a.f19893a.equals(cancelUploadEvent.f18358a)) {
                this.f9030n.m12976b(i);
                ctz.a().d(cancelUploadEvent.f18358a);
            }
        }
    }
}
