package com.p000;

import android.os.Handler;
import android.os.Looper;
import com.ninegag.android.app.otto.AutoDarkModeTimeChangedEvent;
import com.ninegag.android.app.otto.ThemeAutoChangedEvent;
import com.ninegag.android.app.ui.BaseActivity;
import java.lang.ref.WeakReference;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Timer;
import java.util.TimerTask;

/* compiled from: AutoDarkModeController */
/* renamed from: chi */
public class chi {
    /* renamed from: c */
    private static caf f9197c = caf.m12046a();
    /* renamed from: a */
    private Timer f9198a;
    /* renamed from: b */
    private WeakReference<BaseActivity> f9199b;

    /* compiled from: AutoDarkModeController */
    /* renamed from: chi$1 */
    class C17241 extends TimerTask {
        /* renamed from: a */
        final /* synthetic */ chi f9195a;

        C17241(chi chi) {
            this.f9195a = chi;
        }

        public void run() {
            this.f9195a.m13262i();
            this.f9195a.m13260g();
        }
    }

    /* compiled from: AutoDarkModeController */
    /* renamed from: chi$2 */
    class C17252 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ chi f9196a;

        C17252(chi chi) {
            this.f9196a = chi;
        }

        public void run() {
            this.f9196a.m13261h();
        }
    }

    public chi(BaseActivity baseActivity) {
        this(baseActivity, false);
    }

    public chi(BaseActivity baseActivity, boolean z) {
        this.f9199b = new WeakReference(baseActivity);
        if (z) {
            m13261h();
        }
    }

    /* renamed from: a */
    public void m13263a() {
        m13265c();
        m13260g();
        f9197c.m12066c((Object) this);
    }

    /* renamed from: b */
    public void m13264b() {
        m13266d();
        f9197c.m12074f((Object) this);
    }

    /* renamed from: c */
    public void m13265c() {
        if (this.f9198a == null) {
            this.f9198a = new Timer("auto-dark-mode-timer");
        }
    }

    /* renamed from: d */
    public void m13266d() {
        if (this.f9198a != null) {
            this.f9198a.cancel();
            this.f9198a = null;
        }
    }

    /* renamed from: e */
    public void m13267e() {
        m13266d();
        m13265c();
        m13260g();
    }

    /* renamed from: f */
    private TimerTask m13259f() {
        return new C17241(this);
    }

    /* renamed from: g */
    private void m13260g() {
        cip h = caf.m12046a().m12077h();
        cqy cqy = new cqy(h.am());
        cqy cqy2 = new cqy(h.aq());
        Calendar a = m13255a(cqy);
        Calendar a2 = m13255a(cqy2);
        Calendar a3 = m13255a(cqy);
        a3.add(5, 1);
        Calendar a4 = m13255a(cqy2);
        a4.add(5, 1);
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        if (!a3.before(a4)) {
            a3 = a4;
        }
        if (a2.before(a3) && a2.after(gregorianCalendar)) {
            a3 = a2;
        }
        if (a.before(a3) && a.after(gregorianCalendar)) {
            a3 = a;
        }
        this.f9198a.schedule(m13259f(), a3.getTime());
    }

    /* renamed from: h */
    private void m13261h() {
        boolean z = true;
        cip h = caf.m12046a().m12077h();
        if (h != null && h.ai()) {
            cqy cqy = new cqy(h.am());
            Calendar a = m13255a(new cqy(h.aq()));
            Calendar a2 = m13255a(cqy);
            Calendar gregorianCalendar = new GregorianCalendar();
            if (a.before(a2)) {
                a.add(5, 1);
            }
            if (!(gregorianCalendar.before(a) && gregorianCalendar.after(a2))) {
                z = false;
            }
            if (h.ah() != z) {
                h.m13891g(z);
                f9197c.m12054a(new ThemeAutoChangedEvent());
            }
        }
    }

    /* renamed from: a */
    private Calendar m13255a(cqy cqy) {
        Calendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(11, cqy.f19997a);
        gregorianCalendar.set(12, cqy.f19998b);
        gregorianCalendar.set(13, 0);
        gregorianCalendar.set(14, 0);
        return gregorianCalendar;
    }

    /* renamed from: i */
    private void m13262i() {
        new Handler(Looper.getMainLooper()).post(new C17252(this));
    }

    @dhg
    public void onAutoDarkModeTimeChanged(AutoDarkModeTimeChangedEvent autoDarkModeTimeChangedEvent) {
        m13267e();
    }
}
