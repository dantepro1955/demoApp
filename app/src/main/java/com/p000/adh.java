package com.p000;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.HandlerThread;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import com.facebook.common.time.Clock;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import p000.adf.C0084a;

/* compiled from: ExoPlayerImplInternal */
/* renamed from: adh */
final class adh implements Callback {
    /* renamed from: a */
    private final Handler f487a;
    /* renamed from: b */
    private final HandlerThread f488b;
    /* renamed from: c */
    private final Handler f489c;
    /* renamed from: d */
    private final adu f490d;
    /* renamed from: e */
    private final AtomicInteger f491e;
    /* renamed from: f */
    private final List<adv> f492f;
    /* renamed from: g */
    private final ado[][] f493g;
    /* renamed from: h */
    private final int[] f494h;
    /* renamed from: i */
    private final long f495i;
    /* renamed from: j */
    private final long f496j;
    /* renamed from: k */
    private adv[] f497k;
    /* renamed from: l */
    private adv f498l;
    /* renamed from: m */
    private adi f499m;
    /* renamed from: n */
    private boolean f500n;
    /* renamed from: o */
    private boolean f501o;
    /* renamed from: p */
    private boolean f502p;
    /* renamed from: q */
    private int f503q;
    /* renamed from: r */
    private int f504r = 0;
    /* renamed from: s */
    private int f505s = 0;
    /* renamed from: t */
    private long f506t;
    /* renamed from: u */
    private long f507u;
    /* renamed from: v */
    private volatile long f508v;
    /* renamed from: w */
    private volatile long f509w;
    /* renamed from: x */
    private volatile long f510x;

    public adh(Handler handler, boolean z, int[] iArr, int i, int i2) {
        this.f489c = handler;
        this.f501o = z;
        this.f495i = ((long) i) * 1000;
        this.f496j = ((long) i2) * 1000;
        this.f494h = Arrays.copyOf(iArr, iArr.length);
        this.f503q = 1;
        this.f508v = -1;
        this.f510x = -1;
        this.f490d = new adu();
        this.f491e = new AtomicInteger();
        this.f492f = new ArrayList(iArr.length);
        this.f493g = new ado[iArr.length][];
        this.f488b = new ahn("ExoPlayerImplInternal:Handler", -16);
        this.f488b.start();
        this.f487a = new Handler(this.f488b.getLooper(), this);
    }

    /* renamed from: a */
    public long m657a() {
        return this.f491e.get() > 0 ? this.f506t : this.f509w / 1000;
    }

    /* renamed from: b */
    public long m663b() {
        return this.f510x == -1 ? -1 : this.f510x / 1000;
    }

    /* renamed from: c */
    public long m665c() {
        return this.f508v == -1 ? -1 : this.f508v / 1000;
    }

    /* renamed from: a */
    public void m662a(adv... advArr) {
        this.f487a.obtainMessage(1, advArr).sendToTarget();
    }

    /* renamed from: a */
    public void m661a(boolean z) {
        int i;
        Handler handler = this.f487a;
        if (z) {
            i = 1;
        } else {
            i = 0;
        }
        handler.obtainMessage(3, i, 0).sendToTarget();
    }

    /* renamed from: a */
    public void m659a(long j) {
        this.f506t = j;
        this.f491e.incrementAndGet();
        this.f487a.obtainMessage(6, ahr.m1593a(j), ahr.m1602b(j)).sendToTarget();
    }

    /* renamed from: d */
    public void m666d() {
        this.f487a.sendEmptyMessage(4);
    }

    /* renamed from: a */
    public void m658a(int i, int i2) {
        this.f487a.obtainMessage(8, i, i2).sendToTarget();
    }

    /* renamed from: a */
    public void m660a(C0084a c0084a, int i, Object obj) {
        this.f504r++;
        this.f487a.obtainMessage(9, i, 0, Pair.create(c0084a, obj)).sendToTarget();
    }

    /* renamed from: b */
    public synchronized void m664b(C0084a c0084a, int i, Object obj) {
        if (this.f500n) {
            Log.w("ExoPlayerImplInternal", "Sent message(" + i + ") after release. Message ignored.");
        } else {
            int i2 = this.f504r;
            this.f504r = i2 + 1;
            this.f487a.obtainMessage(9, i, 0, Pair.create(c0084a, obj)).sendToTarget();
            while (this.f505s <= i2) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    /* renamed from: e */
    public synchronized void m667e() {
        if (!this.f500n) {
            this.f487a.sendEmptyMessage(5);
            while (!this.f500n) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
            this.f488b.quit();
        }
    }

    public boolean handleMessage(Message message) {
        boolean z = false;
        try {
            switch (message.what) {
                case 1:
                    m646b((adv[]) message.obj);
                    return true;
                case 2:
                    m649f();
                    return true;
                case 3:
                    if (message.arg1 != 0) {
                        z = true;
                    }
                    m645b(z);
                    return true;
                case 4:
                    m654k();
                    return true;
                case 5:
                    m655l();
                    return true;
                case 6:
                    m643b(ahr.m1604b(message.arg1, message.arg2));
                    return true;
                case 7:
                    m653j();
                    return true;
                case 8:
                    m642b(message.arg1, message.arg2);
                    return true;
                case 9:
                    m640a(message.arg1, message.obj);
                    return true;
                default:
                    return false;
            }
        } catch (Throwable e) {
            Log.e("ExoPlayerImplInternal", "Internal track renderer error.", e);
            this.f489c.obtainMessage(4, e).sendToTarget();
            m654k();
            return true;
        } catch (Throwable e2) {
            Log.e("ExoPlayerImplInternal", "Internal runtime error.", e2);
            this.f489c.obtainMessage(4, new ade(e2, true)).sendToTarget();
            m654k();
            return true;
        }
    }

    /* renamed from: a */
    private void m638a(int i) {
        if (this.f503q != i) {
            this.f503q = i;
            this.f489c.obtainMessage(2, i, 0).sendToTarget();
        }
    }

    /* renamed from: b */
    private void m646b(adv[] advArr) throws ade {
        m656m();
        this.f497k = advArr;
        Arrays.fill(this.f493g, null);
        for (int i = 0; i < advArr.length; i++) {
            adi g = advArr[i].mo90g();
            if (g != null) {
                boolean z;
                if (this.f499m == null) {
                    z = true;
                } else {
                    z = false;
                }
                ahb.m1516b(z);
                this.f499m = g;
                this.f498l = advArr[i];
            }
        }
        m638a(2);
        m649f();
    }

    /* renamed from: f */
    private void m649f() throws ade {
        int i;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        Object obj = 1;
        for (adv adv : this.f497k) {
            if (adv.m593t() == 0 && adv.m587g(this.f509w) == 0) {
                adv.mo56d();
                obj = null;
            }
        }
        if (obj == null) {
            m639a(2, elapsedRealtime, 10);
            return;
        }
        long j = 0;
        Object obj2 = 1;
        obj = 1;
        for (i = 0; i < this.f497k.length; i++) {
            int i2;
            adv adv2 = this.f497k[i];
            int g_ = adv2.g_();
            ado[] adoArr = new ado[g_];
            for (i2 = 0; i2 < g_; i2++) {
                adoArr[i2] = adv2.mo50a(i2);
            }
            this.f493g[i] = adoArr;
            if (g_ > 0) {
                if (j != -1) {
                    long e = adv2.mo57e();
                    if (e == -1) {
                        j = -1;
                    } else if (e != -2) {
                        j = Math.max(j, e);
                    }
                }
                i2 = this.f494h[i];
                if (i2 >= 0 && i2 < adoArr.length) {
                    adv2.m580b(i2, this.f509w, false);
                    this.f492f.add(adv2);
                    obj2 = (obj2 == null || !adv2.mo54b()) ? null : 1;
                    if (obj == null || !m641a(adv2)) {
                        obj = null;
                    } else {
                        obj = 1;
                    }
                }
            }
        }
        this.f508v = j;
        if (obj2 == null || (j != -1 && j > this.f509w)) {
            this.f503q = obj != null ? 4 : 3;
        } else {
            this.f503q = 5;
        }
        this.f489c.obtainMessage(1, this.f503q, 0, this.f493g).sendToTarget();
        if (this.f501o && this.f503q == 4) {
            m650g();
        }
        this.f487a.sendEmptyMessage(7);
    }

    /* renamed from: a */
    private boolean m641a(adv adv) {
        boolean z = false;
        if (adv.mo54b()) {
            return true;
        }
        if (!adv.mo55c()) {
            return false;
        }
        if (this.f503q == 4) {
            return true;
        }
        long e = adv.mo57e();
        long f = adv.mo58f();
        long j = this.f502p ? this.f496j : this.f495i;
        if (j <= 0 || f == -1 || f == -3 || f >= j + this.f509w || !(e == -1 || e == -2 || f < e)) {
            z = true;
        }
        return z;
    }

    /* renamed from: b */
    private void m645b(boolean z) throws ade {
        try {
            this.f502p = false;
            this.f501o = z;
            if (!z) {
                m651h();
                m652i();
            } else if (this.f503q == 4) {
                m650g();
                this.f487a.sendEmptyMessage(7);
            } else if (this.f503q == 3) {
                this.f487a.sendEmptyMessage(7);
            }
            this.f489c.obtainMessage(3).sendToTarget();
        } catch (Throwable th) {
            this.f489c.obtainMessage(3).sendToTarget();
        }
    }

    /* renamed from: g */
    private void m650g() throws ade {
        this.f502p = false;
        this.f490d.m847b();
        for (int i = 0; i < this.f492f.size(); i++) {
            ((adv) this.f492f.get(i)).m594u();
        }
    }

    /* renamed from: h */
    private void m651h() throws ade {
        this.f490d.m848c();
        for (int i = 0; i < this.f492f.size(); i++) {
            m648d((adv) this.f492f.get(i));
        }
    }

    /* renamed from: i */
    private void m652i() {
        if (this.f499m == null || !this.f492f.contains(this.f498l) || this.f498l.mo54b()) {
            this.f509w = this.f490d.mo83a();
        } else {
            this.f509w = this.f499m.mo83a();
            this.f490d.m846a(this.f509w);
        }
        this.f507u = SystemClock.elapsedRealtime() * 1000;
    }

    /* renamed from: j */
    private void m653j() throws ade {
        ahq.m1589a("doSomeWork");
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.f508v != -1 ? this.f508v : Clock.MAX_TIME;
        m652i();
        Object obj = 1;
        Object obj2 = 1;
        long j2 = j;
        for (int i = 0; i < this.f492f.size(); i++) {
            adv adv = (adv) this.f492f.get(i);
            adv.mo51a(this.f509w, this.f507u);
            obj2 = (obj2 == null || !adv.mo54b()) ? null : 1;
            boolean a = m641a(adv);
            if (!a) {
                adv.mo56d();
            }
            obj = (obj == null || !a) ? null : 1;
            if (j2 != -1) {
                long e = adv.mo57e();
                long f = adv.mo58f();
                if (f == -1) {
                    j2 = -1;
                } else if (f != -3 && (e == -1 || e == -2 || f < e)) {
                    j2 = Math.min(j2, f);
                }
            }
        }
        this.f510x = j2;
        if (obj2 != null && (this.f508v == -1 || this.f508v <= this.f509w)) {
            m638a(5);
            m651h();
        } else if (this.f503q == 3 && obj != null) {
            m638a(4);
            if (this.f501o) {
                m650g();
            }
        } else if (this.f503q == 4 && obj == null) {
            this.f502p = this.f501o;
            m638a(3);
            m651h();
        }
        this.f487a.removeMessages(7);
        if ((this.f501o && this.f503q == 4) || this.f503q == 3) {
            m639a(7, elapsedRealtime, 10);
        } else if (!this.f492f.isEmpty()) {
            m639a(7, elapsedRealtime, 1000);
        }
        ahq.m1588a();
    }

    /* renamed from: a */
    private void m639a(int i, long j, long j2) {
        long elapsedRealtime = (j + j2) - SystemClock.elapsedRealtime();
        if (elapsedRealtime <= 0) {
            this.f487a.sendEmptyMessage(i);
        } else {
            this.f487a.sendEmptyMessageDelayed(i, elapsedRealtime);
        }
    }

    /* renamed from: b */
    private void m643b(long j) throws ade {
        try {
            if (j != this.f509w / 1000) {
                this.f502p = false;
                this.f509w = j * 1000;
                this.f490d.m848c();
                this.f490d.m846a(this.f509w);
                if (this.f503q == 1 || this.f503q == 2) {
                    this.f491e.decrementAndGet();
                    return;
                }
                for (int i = 0; i < this.f492f.size(); i++) {
                    adv adv = (adv) this.f492f.get(i);
                    m648d(adv);
                    adv.mo53b(this.f509w);
                }
                m638a(3);
                this.f487a.sendEmptyMessage(7);
                this.f491e.decrementAndGet();
            }
        } finally {
            this.f491e.decrementAndGet();
        }
    }

    /* renamed from: k */
    private void m654k() {
        m656m();
        m638a(1);
    }

    /* renamed from: l */
    private void m655l() {
        m656m();
        m638a(1);
        synchronized (this) {
            this.f500n = true;
            notifyAll();
        }
    }

    /* renamed from: m */
    private void m656m() {
        int i = 0;
        this.f487a.removeMessages(7);
        this.f487a.removeMessages(2);
        this.f502p = false;
        this.f490d.m848c();
        if (this.f497k != null) {
            while (i < this.f497k.length) {
                adv adv = this.f497k[i];
                m644b(adv);
                m647c(adv);
                i++;
            }
            this.f497k = null;
            this.f499m = null;
            this.f498l = null;
            this.f492f.clear();
        }
    }

    /* renamed from: b */
    private void m644b(adv adv) {
        try {
            m648d(adv);
            if (adv.m593t() == 2) {
                adv.m596w();
            }
        } catch (Throwable e) {
            Log.e("ExoPlayerImplInternal", "Stop failed.", e);
        } catch (Throwable e2) {
            Log.e("ExoPlayerImplInternal", "Stop failed.", e2);
        }
    }

    /* renamed from: c */
    private void m647c(adv adv) {
        try {
            adv.m597x();
        } catch (Throwable e) {
            Log.e("ExoPlayerImplInternal", "Release failed.", e);
        } catch (Throwable e2) {
            Log.e("ExoPlayerImplInternal", "Release failed.", e2);
        }
    }

    /* renamed from: a */
    private <T> void m640a(int i, Object obj) throws ade {
        try {
            Pair pair = (Pair) obj;
            ((C0084a) pair.first).mo49a(i, pair.second);
            if (!(this.f503q == 1 || this.f503q == 2)) {
                this.f487a.sendEmptyMessage(7);
            }
            synchronized (this) {
                this.f505s++;
                notifyAll();
            }
        } catch (Throwable th) {
            synchronized (this) {
                this.f505s++;
                notifyAll();
            }
        }
    }

    /* renamed from: b */
    private void m642b(int i, int i2) throws ade {
        boolean z = true;
        if (this.f494h[i] != i2) {
            this.f494h[i] = i2;
            if (this.f503q != 1 && this.f503q != 2) {
                adv adv = this.f497k[i];
                int t = adv.m593t();
                if (t != 0 && t != -1 && adv.g_() != 0) {
                    boolean z2;
                    boolean z3 = t == 2 || t == 3;
                    if (i2 < 0 || i2 >= this.f493g[i].length) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    if (z3) {
                        if (!z2 && adv == this.f498l) {
                            this.f490d.m846a(this.f499m.mo83a());
                        }
                        m648d(adv);
                        this.f492f.remove(adv);
                        adv.m596w();
                    }
                    if (z2) {
                        z2 = this.f501o && this.f503q == 4;
                        if (z3 || !z2) {
                            z = false;
                        }
                        adv.m580b(i2, this.f509w, z);
                        this.f492f.add(adv);
                        if (z2) {
                            adv.m594u();
                        }
                        this.f487a.sendEmptyMessage(7);
                    }
                }
            }
        }
    }

    /* renamed from: d */
    private void m648d(adv adv) throws ade {
        if (adv.m593t() == 3) {
            adv.m595v();
        }
    }
}
