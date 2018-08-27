package com.p000;

import android.media.MediaCodec.CryptoException;
import android.os.Handler;
import android.view.Surface;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import p000.adf.C0085b;
import p000.adf.C0086c;
import p000.adj.C0092a;
import p000.adl.C0097a;
import p000.adn.C0107a;
import p000.ady.C0115d;
import p000.ady.C0117f;
import p000.agn.C0164a;

/* compiled from: ExoMp4Player */
/* renamed from: dlb */
public class dlb implements C0086c, C0092a, C0107a, C0164a {
    /* renamed from: a */
    private final C4964d f21959a;
    /* renamed from: b */
    private final adf f21960b = C0085b.a(4, 1000, 5000);
    /* renamed from: c */
    private final ahl f21961c;
    /* renamed from: d */
    private final Handler f21962d;
    /* renamed from: e */
    private final CopyOnWriteArrayList<C4462c> f21963e;
    /* renamed from: f */
    private int f21964f;
    /* renamed from: g */
    private int f21965g;
    /* renamed from: h */
    private boolean f21966h;
    /* renamed from: i */
    private Surface f21967i;
    /* renamed from: j */
    private adv f21968j;
    /* renamed from: k */
    private adv f21969k;
    /* renamed from: l */
    private ada f21970l;
    /* renamed from: m */
    private adz f21971m;
    /* renamed from: n */
    private agn f21972n;
    /* renamed from: o */
    private C4963b f21973o;
    /* renamed from: p */
    private C4962a f21974p;

    /* compiled from: ExoMp4Player */
    /* renamed from: dlb$c */
    public interface C4462c {
        /* renamed from: a */
        void mo4083a(int i, int i2, int i3, float f);

        /* renamed from: a */
        void mo4084a(Exception exception);

        /* renamed from: a */
        void mo4085a(boolean z, int i);
    }

    /* compiled from: ExoMp4Player */
    /* renamed from: dlb$a */
    public interface C4962a {
        /* renamed from: a */
        void m27769a(int i, long j);

        /* renamed from: a */
        void m27770a(int i, long j, long j2);

        /* renamed from: a */
        void m27771a(String str, long j, long j2);
    }

    /* compiled from: ExoMp4Player */
    /* renamed from: dlb$b */
    public interface C4963b {
        /* renamed from: a */
        void m27772a(int i, long j, long j2);

        /* renamed from: a */
        void m27773a(C0097a c0097a);

        /* renamed from: a */
        void m27774a(C0115d c0115d);

        /* renamed from: a */
        void m27775a(C0117f c0117f);

        /* renamed from: a */
        void m27776a(CryptoException cryptoException);
    }

    /* compiled from: ExoMp4Player */
    /* renamed from: dlb$d */
    public interface C4964d {
        /* renamed from: a */
        void mo4435a();

        /* renamed from: a */
        void mo4436a(dlb dlb);
    }

    public dlb(C4964d c4964d) {
        this.f21959a = c4964d;
        this.f21960b.a(this);
        this.f21961c = new ahl(this.f21960b);
        this.f21962d = new Handler();
        this.f21963e = new CopyOnWriteArrayList();
        this.f21965g = 1;
        this.f21964f = 1;
        this.f21960b.a(2, -1);
    }

    /* renamed from: a */
    public void m27791a(C4462c c4462c) {
        this.f21963e.add(c4462c);
    }

    /* renamed from: b */
    public void m27797b(Surface surface) {
        this.f21967i = surface;
        m27779c(false);
    }

    /* renamed from: a */
    public void m27781a() {
        if (this.f21964f == 3) {
            this.f21960b.c();
        }
        this.f21959a.mo4435a();
        this.f21971m = null;
        this.f21968j = null;
        this.f21969k = null;
        this.f21964f = 2;
        m27780l();
        this.f21959a.mo4436a(this);
    }

    /* renamed from: a */
    void m27794a(adv[] advArr, agn agn) {
        for (int i = 0; i < 4; i++) {
            if (advArr[i] == null) {
                advArr[i] = new add();
            }
        }
        this.f21968j = advArr[0];
        this.f21969k = advArr[1];
        ada ada = this.f21968j instanceof adl ? ((adl) this.f21968j).f535a : advArr[1] instanceof adl ? ((adl) advArr[1]).f535a : null;
        this.f21970l = ada;
        this.f21972n = agn;
        m27779c(false);
        this.f21960b.a(advArr);
        this.f21964f = 3;
        m27798b(false);
    }

    /* renamed from: a */
    public void m27793a(boolean z) {
        this.f21960b.a(z);
    }

    /* renamed from: b */
    public void m27795b() {
        this.f21960b.a(0);
        this.f21960b.a(true);
    }

    /* renamed from: c */
    public void m27799c() {
        m27798b(true);
        this.f21960b.a(true);
    }

    /* renamed from: a */
    public void m27785a(long j) {
        this.f21960b.a(j);
    }

    /* renamed from: d */
    public void m27800d() {
        this.f21959a.mo4435a();
        this.f21964f = 1;
        this.f21967i = null;
        this.f21960b.d();
    }

    /* renamed from: e */
    public int m27801e() {
        if (this.f21964f == 2) {
            return 2;
        }
        int a = this.f21960b.a();
        if (this.f21964f == 3 && this.f21964f == 1) {
            return 2;
        }
        return a;
    }

    /* renamed from: f */
    public void m27802f() {
        this.f21960b.c();
    }

    /* renamed from: g */
    public void m27803g() {
        this.f21960b.a(false);
    }

    /* renamed from: h */
    public boolean m27804h() {
        return this.f21960b.b();
    }

    /* renamed from: i */
    public boolean m27805i() {
        return this.f21960b.a() == 1 || this.f21960b.a() == 2 || this.f21960b.a() == 3 || this.f21960b.f() == 0;
    }

    /* renamed from: b */
    public void m27798b(boolean z) {
        this.f21960b.a(this.f21969k, 1, Float.valueOf(z ? 1.0f : 0.0f));
    }

    /* renamed from: j */
    public boolean m27806j() {
        return m27801e() == 4;
    }

    /* renamed from: k */
    Handler m27807k() {
        return this.f21962d;
    }

    public void onPlayerStateChanged(boolean z, int i) {
        m27780l();
    }

    public void onPlayerError(ade ade) {
        this.f21964f = 1;
        Iterator it = this.f21963e.iterator();
        while (it.hasNext()) {
            ((C4462c) it.next()).mo4084a(ade);
        }
    }

    /* renamed from: a */
    public void m27782a(int i, int i2, int i3, float f) {
        Iterator it = this.f21963e.iterator();
        while (it.hasNext()) {
            ((C4462c) it.next()).mo4083a(i, i2, i3, f);
        }
    }

    /* renamed from: a */
    public void m27783a(int i, long j) {
        if (this.f21974p != null) {
            this.f21974p.m27769a(i, j);
        }
    }

    /* renamed from: b */
    public void m27796b(int i, long j, long j2) {
        if (this.f21974p != null) {
            this.f21974p.m27770a(i, j, j2);
        }
    }

    /* renamed from: a */
    public void m27786a(C0097a c0097a) {
        if (this.f21973o != null) {
            this.f21973o.m27773a(c0097a);
        }
    }

    /* renamed from: a */
    public void m27787a(C0115d c0115d) {
        if (this.f21973o != null) {
            this.f21973o.m27774a(c0115d);
        }
    }

    /* renamed from: a */
    public void m27788a(C0117f c0117f) {
        if (this.f21973o != null) {
            this.f21973o.m27775a(c0117f);
        }
    }

    /* renamed from: a */
    public void m27784a(int i, long j, long j2) {
        if (this.f21973o != null) {
            this.f21973o.m27772a(i, j, j2);
        }
    }

    /* renamed from: a */
    public void m27789a(CryptoException cryptoException) {
        if (this.f21973o != null) {
            this.f21973o.m27776a(cryptoException);
        }
    }

    /* renamed from: a */
    public void m27792a(String str, long j, long j2) {
        if (this.f21974p != null) {
            this.f21974p.m27771a(str, j, j2);
        }
    }

    public void onPlayWhenReadyCommitted() {
    }

    /* renamed from: a */
    public void m27790a(Surface surface) {
    }

    /* renamed from: l */
    private void m27780l() {
        boolean b = this.f21960b.b();
        int e = m27801e();
        if (this.f21966h != b || this.f21965g != e) {
            Iterator it = this.f21963e.iterator();
            while (it.hasNext()) {
                ((C4462c) it.next()).mo4085a(b, e);
            }
            this.f21966h = b;
            this.f21965g = e;
        }
    }

    /* renamed from: c */
    private void m27779c(boolean z) {
        if (this.f21968j != null) {
            if (z) {
                this.f21960b.b(this.f21968j, 1, this.f21967i);
            } else {
                this.f21960b.a(this.f21968j, 1, this.f21967i);
            }
        }
    }
}
