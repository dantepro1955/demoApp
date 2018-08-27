package com.p000;

/* compiled from: BackpressureOverflow */
/* renamed from: dtl */
public final class dtl {
    /* renamed from: a */
    public static final C5080d f22905a = C5083c.f22904a;
    /* renamed from: b */
    public static final C5080d f22906b = f22905a;
    /* renamed from: c */
    public static final C5080d f22907c = C5082b.f22903a;
    /* renamed from: d */
    public static final C5080d f22908d = C5081a.f22902a;

    /* compiled from: BackpressureOverflow */
    /* renamed from: dtl$d */
    public interface C5080d {
        /* renamed from: a */
        boolean mo4634a() throws due;
    }

    /* compiled from: BackpressureOverflow */
    /* renamed from: dtl$a */
    static final class C5081a implements C5080d {
        /* renamed from: a */
        static final C5081a f22902a = new C5081a();

        private C5081a() {
        }

        /* renamed from: a */
        public boolean mo4634a() {
            return false;
        }
    }

    /* compiled from: BackpressureOverflow */
    /* renamed from: dtl$b */
    static final class C5082b implements C5080d {
        /* renamed from: a */
        static final C5082b f22903a = new C5082b();

        private C5082b() {
        }

        /* renamed from: a */
        public boolean mo4634a() {
            return true;
        }
    }

    /* compiled from: BackpressureOverflow */
    /* renamed from: dtl$c */
    static final class C5083c implements C5080d {
        /* renamed from: a */
        static final C5083c f22904a = new C5083c();

        private C5083c() {
        }

        /* renamed from: a */
        public boolean mo4634a() throws due {
            throw new due("Overflowed buffer");
        }
    }
}
