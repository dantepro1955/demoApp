package com.p000;

/* compiled from: TagPayloadReader */
/* renamed from: aet */
abstract class aet {
    /* renamed from: a */
    protected final aep f876a;
    /* renamed from: b */
    private long f877b = -1;

    /* compiled from: TagPayloadReader */
    /* renamed from: aet$a */
    public static final class C0137a extends adq {
        public C0137a(String str) {
            super(str);
        }
    }

    /* renamed from: a */
    protected abstract void mo151a(ahk ahk, long j) throws adq;

    /* renamed from: a */
    protected abstract boolean mo152a(ahk ahk) throws adq;

    protected aet(aep aep) {
        this.f876a = aep;
    }

    /* renamed from: a */
    public final void m1102a(long j) {
        this.f877b = j;
    }

    /* renamed from: a */
    public final long m1101a() {
        return this.f877b;
    }

    /* renamed from: b */
    public final void m1105b(ahk ahk, long j) throws adq {
        if (mo152a(ahk)) {
            mo151a(ahk, j);
        }
    }
}
