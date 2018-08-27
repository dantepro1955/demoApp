package com.p000;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.internal.zzx;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

@bhd
/* renamed from: akc */
public class akc implements auh, Runnable {
    /* renamed from: a */
    CountDownLatch f1786a = new CountDownLatch(1);
    /* renamed from: b */
    private final List<Object[]> f1787b = new Vector();
    /* renamed from: c */
    private final AtomicReference<auh> f1788c = new AtomicReference();
    /* renamed from: d */
    private zzx f1789d;

    public akc(zzx zzx) {
        this.f1789d = zzx;
        if (azp.m6789a().m9298b()) {
            bkf.m9059a((Runnable) this);
        } else {
            run();
        }
    }

    /* renamed from: b */
    private Context m2118b(Context context) {
        if (!((Boolean) bbb.f5407m.m7064c()).booleanValue()) {
            return context;
        }
        Context applicationContext = context.getApplicationContext();
        return applicationContext != null ? applicationContext : context;
    }

    /* renamed from: b */
    private void m2119b() {
        if (!this.f1787b.isEmpty()) {
            for (Object[] objArr : this.f1787b) {
                if (objArr.length == 1) {
                    ((auh) this.f1788c.get()).mo293a((MotionEvent) objArr[0]);
                } else if (objArr.length == 3) {
                    ((auh) this.f1788c.get()).mo292a(((Integer) objArr[0]).intValue(), ((Integer) objArr[1]).intValue(), ((Integer) objArr[2]).intValue());
                }
            }
            this.f1787b.clear();
        }
    }

    /* renamed from: a */
    protected auh m2120a(String str, Context context, boolean z) {
        return avb.m5922a(str, context, z);
    }

    /* renamed from: a */
    public String mo290a(Context context) {
        return m2123a(context, null);
    }

    /* renamed from: a */
    public String mo291a(Context context, String str, View view) {
        if (m2127a()) {
            auh auh = (auh) this.f1788c.get();
            if (auh != null) {
                m2119b();
                return auh.mo291a(m2118b(context), str, view);
            }
        }
        return "";
    }

    /* renamed from: a */
    public String m2123a(Context context, byte[] bArr) {
        if (m2127a()) {
            auh auh = (auh) this.f1788c.get();
            if (auh != null) {
                m2119b();
                return auh.mo290a(m2118b(context));
            }
        }
        return "";
    }

    /* renamed from: a */
    public void mo292a(int i, int i2, int i3) {
        auh auh = (auh) this.f1788c.get();
        if (auh != null) {
            m2119b();
            auh.mo292a(i, i2, i3);
            return;
        }
        this.f1787b.add(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)});
    }

    /* renamed from: a */
    public void mo293a(MotionEvent motionEvent) {
        auh auh = (auh) this.f1788c.get();
        if (auh != null) {
            m2119b();
            auh.mo293a(motionEvent);
            return;
        }
        this.f1787b.add(new Object[]{motionEvent});
    }

    /* renamed from: a */
    protected void m2126a(auh auh) {
        this.f1788c.set(auh);
    }

    /* renamed from: a */
    protected boolean m2127a() {
        try {
            this.f1786a.await();
            return true;
        } catch (Throwable e) {
            bky.m9009c("Interrupted during GADSignals creation.", e);
            return false;
        }
    }

    public void run() {
        try {
            Object obj = (this.f1789d.f14553e.f15124d || !((Boolean) bbb.f5376I.m7064c()).booleanValue()) ? 1 : null;
            boolean z = (((Boolean) bbb.aO.m7064c()).booleanValue() || obj == null) ? false : true;
            m2126a(m2120a(this.f1789d.f14553e.f15121a, m2118b(this.f1789d.f14551c), z));
        } finally {
            this.f1786a.countDown();
            this.f1789d = null;
        }
    }
}
