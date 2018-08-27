package com.p000;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.ActionMode;
import android.view.Window;
import android.view.Window.Callback;
import p000.mk.C5533b;
import p000.ni.C5551a;
import p000.nm.C5584a;

@TargetApi(14)
/* compiled from: AppCompatDelegateImplV14 */
/* renamed from: mn */
class mn extends mm {
    /* renamed from: t */
    private int f24551t = -100;
    /* renamed from: u */
    private boolean f24552u;
    /* renamed from: v */
    private boolean f24553v = true;
    /* renamed from: w */
    private C5539b f24554w;

    /* compiled from: AppCompatDelegateImplV14 */
    /* renamed from: mn$a */
    class C5534a extends C5533b {
        /* renamed from: c */
        final /* synthetic */ mn f24522c;

        C5534a(mn mnVar, Callback callback) {
            this.f24522c = mnVar;
            super(mnVar, callback);
        }

        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            if (this.f24522c.mo5219p()) {
                return m32694a(callback);
            }
            return super.onWindowStartingActionMode(callback);
        }

        /* renamed from: a */
        final ActionMode m32694a(ActionMode.Callback callback) {
            Object c5584a = new C5584a(this.f24522c.a, callback);
            ni a = this.f24522c.mo5193a((C5551a) c5584a);
            if (a != null) {
                return c5584a.m32985b(a);
            }
            return null;
        }
    }

    /* compiled from: AppCompatDelegateImplV14 */
    /* renamed from: mn$b */
    final class C5539b {
        /* renamed from: a */
        final /* synthetic */ mn f24557a;
        /* renamed from: b */
        private mv f24558b;
        /* renamed from: c */
        private boolean f24559c;
        /* renamed from: d */
        private BroadcastReceiver f24560d;
        /* renamed from: e */
        private IntentFilter f24561e;

        /* compiled from: AppCompatDelegateImplV14 */
        /* renamed from: mn$b$1 */
        class C55381 extends BroadcastReceiver {
            /* renamed from: a */
            final /* synthetic */ C5539b f24556a;

            C55381(C5539b c5539b) {
                this.f24556a = c5539b;
            }

            public void onReceive(Context context, Intent intent) {
                this.f24556a.m32773b();
            }
        }

        C5539b(mn mnVar, mv mvVar) {
            this.f24557a = mnVar;
            this.f24558b = mvVar;
            this.f24559c = mvVar.m32853a();
        }

        /* renamed from: a */
        final int m32772a() {
            this.f24559c = this.f24558b.m32853a();
            return this.f24559c ? 2 : 1;
        }

        /* renamed from: b */
        final void m32773b() {
            boolean a = this.f24558b.m32853a();
            if (a != this.f24559c) {
                this.f24559c = a;
                this.f24557a.mo5188j();
            }
        }

        /* renamed from: c */
        final void m32774c() {
            m32775d();
            if (this.f24560d == null) {
                this.f24560d = new C55381(this);
            }
            if (this.f24561e == null) {
                this.f24561e = new IntentFilter();
                this.f24561e.addAction("android.intent.action.TIME_SET");
                this.f24561e.addAction("android.intent.action.TIMEZONE_CHANGED");
                this.f24561e.addAction("android.intent.action.TIME_TICK");
            }
            this.f24557a.a.registerReceiver(this.f24560d, this.f24561e);
        }

        /* renamed from: d */
        final void m32775d() {
            if (this.f24560d != null) {
                this.f24557a.a.unregisterReceiver(this.f24560d);
                this.f24560d = null;
            }
        }
    }

    mn(Context context, Window window, mi miVar) {
        super(context, window, miVar);
    }

    /* renamed from: a */
    public void mo5196a(Bundle bundle) {
        super.mo5196a(bundle);
        if (bundle != null && this.f24551t == -100) {
            this.f24551t = bundle.getInt("appcompat:local_night_mode", -100);
        }
    }

    /* renamed from: a */
    Callback mo5217a(Callback callback) {
        return new C5534a(this, callback);
    }

    /* renamed from: p */
    public boolean mo5219p() {
        return this.f24553v;
    }

    /* renamed from: j */
    public boolean mo5188j() {
        boolean z = false;
        int x = m32757x();
        int d = mo5218d(x);
        if (d != -1) {
            z = m32756h(d);
        }
        if (x == 0) {
            m32758y();
            this.f24554w.m32774c();
        }
        this.f24552u = true;
        return z;
    }

    /* renamed from: c */
    public void mo5183c() {
        super.mo5183c();
        mo5188j();
    }

    /* renamed from: d */
    public void mo5185d() {
        super.mo5185d();
        if (this.f24554w != null) {
            this.f24554w.m32775d();
        }
    }

    /* renamed from: d */
    int mo5218d(int i) {
        switch (i) {
            case -100:
                return -1;
            case 0:
                m32758y();
                return this.f24554w.m32772a();
            default:
                return i;
        }
    }

    /* renamed from: x */
    private int m32757x() {
        return this.f24551t != -100 ? this.f24551t : mj.m32644k();
    }

    /* renamed from: c */
    public void mo5184c(Bundle bundle) {
        super.mo5184c(bundle);
        if (this.f24551t != -100) {
            bundle.putInt("appcompat:local_night_mode", this.f24551t);
        }
    }

    /* renamed from: g */
    public void mo5186g() {
        super.mo5186g();
        if (this.f24554w != null) {
            this.f24554w.m32775d();
        }
    }

    /* renamed from: h */
    private boolean m32756h(int i) {
        Resources resources = this.a.getResources();
        Configuration configuration = resources.getConfiguration();
        int i2 = configuration.uiMode & 48;
        int i3 = i == 2 ? 32 : 16;
        if (i2 == i3) {
            return false;
        }
        if (m32759z()) {
            ((Activity) this.a).recreate();
        } else {
            Configuration configuration2 = new Configuration(configuration);
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            configuration2.uiMode = i3 | (configuration2.uiMode & -49);
            resources.updateConfiguration(configuration2, displayMetrics);
            ms.m32811a(resources);
        }
        return true;
    }

    /* renamed from: y */
    private void m32758y() {
        if (this.f24554w == null) {
            this.f24554w = new C5539b(this, mv.m32849a(this.a));
        }
    }

    /* renamed from: z */
    private boolean m32759z() {
        if (!this.f24552u || !(this.a instanceof Activity)) {
            return false;
        }
        try {
            if ((this.a.getPackageManager().getActivityInfo(new ComponentName(this.a, this.a.getClass()), 0).configChanges & 512) == 0) {
                return true;
            }
            return false;
        } catch (Throwable e) {
            Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e);
            return true;
        }
    }
}
