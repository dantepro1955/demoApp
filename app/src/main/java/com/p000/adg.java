package com.p000;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import p000.adf.C0084a;
import p000.adf.C0086c;

/* compiled from: ExoPlayerImpl */
/* renamed from: adg */
final class adg implements adf {
    /* renamed from: a */
    private final Handler f479a;
    /* renamed from: b */
    private final adh f480b;
    /* renamed from: c */
    private final CopyOnWriteArraySet<C0086c> f481c = new CopyOnWriteArraySet();
    /* renamed from: d */
    private final ado[][] f482d;
    /* renamed from: e */
    private final int[] f483e;
    /* renamed from: f */
    private boolean f484f = false;
    /* renamed from: g */
    private int f485g = 1;
    /* renamed from: h */
    private int f486h;

    /* compiled from: ExoPlayerImpl */
    /* renamed from: adg$1 */
    class C00871 extends Handler {
        /* renamed from: a */
        final /* synthetic */ adg f478a;

        C00871(adg adg) {
            this.f478a = adg;
        }

        public void handleMessage(Message message) {
            this.f478a.m627a(message);
        }
    }

    @SuppressLint({"HandlerLeak"})
    public adg(int i, int i2, int i3) {
        Log.i("ExoPlayerImpl", "Init 1.5.6");
        this.f482d = new ado[i][];
        this.f483e = new int[i];
        this.f479a = new C00871(this);
        this.f480b = new adh(this.f479a, this.f484f, this.f483e, i2, i3);
    }

    /* renamed from: a */
    public void mo64a(C0086c c0086c) {
        this.f481c.add(c0086c);
    }

    /* renamed from: a */
    public int mo60a() {
        return this.f485g;
    }

    /* renamed from: a */
    public void mo66a(adv... advArr) {
        Arrays.fill(this.f482d, null);
        this.f480b.m662a(advArr);
    }

    /* renamed from: a */
    public void mo61a(int i, int i2) {
        if (this.f483e[i] != i2) {
            this.f483e[i] = i2;
            this.f480b.m658a(i, i2);
        }
    }

    /* renamed from: a */
    public void mo65a(boolean z) {
        if (this.f484f != z) {
            this.f484f = z;
            this.f486h++;
            this.f480b.m661a(z);
            Iterator it = this.f481c.iterator();
            while (it.hasNext()) {
                ((C0086c) it.next()).onPlayerStateChanged(z, this.f485g);
            }
        }
    }

    /* renamed from: b */
    public boolean mo68b() {
        return this.f484f;
    }

    /* renamed from: a */
    public void mo62a(long j) {
        this.f480b.m659a(j);
    }

    /* renamed from: c */
    public void mo69c() {
        this.f480b.m666d();
    }

    /* renamed from: d */
    public void mo70d() {
        this.f480b.m667e();
        this.f479a.removeCallbacksAndMessages(null);
    }

    /* renamed from: a */
    public void mo63a(C0084a c0084a, int i, Object obj) {
        this.f480b.m660a(c0084a, i, obj);
    }

    /* renamed from: b */
    public void mo67b(C0084a c0084a, int i, Object obj) {
        this.f480b.m664b(c0084a, i, obj);
    }

    /* renamed from: e */
    public long mo71e() {
        return this.f480b.m665c();
    }

    /* renamed from: f */
    public long mo72f() {
        return this.f480b.m657a();
    }

    /* renamed from: h */
    public long m637h() {
        return this.f480b.m663b();
    }

    /* renamed from: g */
    public int mo73g() {
        long j = 100;
        long h = m637h();
        long e = mo71e();
        if (h == -1 || e == -1) {
            return 0;
        }
        if (e != 0) {
            j = (100 * h) / e;
        }
        return (int) j;
    }

    /* renamed from: a */
    void m627a(Message message) {
        Iterator it;
        switch (message.what) {
            case 1:
                System.arraycopy(message.obj, 0, this.f482d, 0, this.f482d.length);
                this.f485g = message.arg1;
                it = this.f481c.iterator();
                while (it.hasNext()) {
                    ((C0086c) it.next()).onPlayerStateChanged(this.f484f, this.f485g);
                }
                return;
            case 2:
                this.f485g = message.arg1;
                it = this.f481c.iterator();
                while (it.hasNext()) {
                    ((C0086c) it.next()).onPlayerStateChanged(this.f484f, this.f485g);
                }
                return;
            case 3:
                this.f486h--;
                if (this.f486h == 0) {
                    it = this.f481c.iterator();
                    while (it.hasNext()) {
                        ((C0086c) it.next()).onPlayWhenReadyCommitted();
                    }
                    return;
                }
                return;
            case 4:
                ade ade = (ade) message.obj;
                Iterator it2 = this.f481c.iterator();
                while (it2.hasNext()) {
                    ((C0086c) it2.next()).onPlayerError(ade);
                }
                return;
            default:
                return;
        }
    }
}
