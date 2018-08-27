package com.p000;

import java.io.IOException;

/* compiled from: DefaultTrackOutput */
/* renamed from: aee */
public class aee implements aep {
    /* renamed from: a */
    private final aen f753a;
    /* renamed from: b */
    private final adr f754b = new adr(0);
    /* renamed from: c */
    private boolean f755c = true;
    /* renamed from: d */
    private long f756d = Long.MIN_VALUE;
    /* renamed from: e */
    private long f757e = Long.MIN_VALUE;
    /* renamed from: f */
    private volatile long f758f = Long.MIN_VALUE;
    /* renamed from: g */
    private volatile ado f759g;

    public aee(agl agl) {
        this.f753a = new aen(agl);
    }

    /* renamed from: a */
    public void m976a() {
        this.f753a.m1091a();
        this.f755c = true;
        this.f756d = Long.MIN_VALUE;
        this.f757e = Long.MIN_VALUE;
        this.f758f = Long.MIN_VALUE;
    }

    /* renamed from: b */
    public boolean m982b() {
        return this.f759g != null;
    }

    /* renamed from: c */
    public ado m984c() {
        return this.f759g;
    }

    /* renamed from: d */
    public long m985d() {
        return this.f758f;
    }

    /* renamed from: e */
    public boolean m986e() {
        return !m974f();
    }

    /* renamed from: a */
    public boolean m981a(adr adr) {
        if (!m974f()) {
            return false;
        }
        this.f753a.m1097b(adr);
        this.f755c = false;
        this.f756d = adr.f647e;
        return true;
    }

    /* renamed from: a */
    public void m977a(long j) {
        while (this.f753a.m1095a(this.f754b) && this.f754b.f647e < j) {
            this.f753a.m1096b();
            this.f755c = true;
        }
        this.f756d = Long.MIN_VALUE;
    }

    /* renamed from: b */
    public boolean m983b(long j) {
        return this.f753a.m1094a(j);
    }

    /* renamed from: f */
    private boolean m974f() {
        boolean a = this.f753a.m1095a(this.f754b);
        if (this.f755c) {
            while (a && !this.f754b.m829c()) {
                this.f753a.m1096b();
                a = this.f753a.m1095a(this.f754b);
            }
        }
        if (!a) {
            return false;
        }
        if (this.f757e == Long.MIN_VALUE || this.f754b.f647e < this.f757e) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public void mo126a(ado ado) {
        this.f759g = ado;
    }

    /* renamed from: a */
    public int mo124a(aeh aeh, int i, boolean z) throws IOException, InterruptedException {
        return this.f753a.m1090a(aeh, i, z);
    }

    /* renamed from: a */
    public void mo127a(ahk ahk, int i) {
        this.f753a.m1093a(ahk, i);
    }

    /* renamed from: a */
    public void mo125a(long j, int i, int i2, int i3, byte[] bArr) {
        this.f758f = Math.max(this.f758f, j);
        this.f753a.m1092a(j, i, (this.f753a.m1098c() - ((long) i2)) - ((long) i3), i2, bArr);
    }
}
