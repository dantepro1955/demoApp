package com.p000;

/* compiled from: Notification */
/* renamed from: dto */
public final class dto<T> {
    /* renamed from: d */
    private static final dto<Void> f22921d = new dto(C5091a.OnCompleted, null, null);
    /* renamed from: a */
    private final C5091a f22922a;
    /* renamed from: b */
    private final Throwable f22923b;
    /* renamed from: c */
    private final T f22924c;

    /* compiled from: Notification */
    /* renamed from: dto$a */
    public enum C5091a {
        OnNext,
        OnError,
        OnCompleted
    }

    /* renamed from: a */
    public static <T> dto<T> m29297a(T t) {
        return new dto(C5091a.OnNext, t, null);
    }

    /* renamed from: a */
    public static <T> dto<T> m29298a(Throwable th) {
        return new dto(C5091a.OnError, null, th);
    }

    /* renamed from: a */
    public static <T> dto<T> m29296a() {
        return f22921d;
    }

    private dto(C5091a c5091a, T t, Throwable th) {
        this.f22924c = t;
        this.f22923b = th;
        this.f22922a = c5091a;
    }

    /* renamed from: b */
    public Throwable m29299b() {
        return this.f22923b;
    }

    /* renamed from: c */
    public T m29300c() {
        return this.f22924c;
    }

    /* renamed from: d */
    public boolean m29301d() {
        return m29306i() && this.f22924c != null;
    }

    /* renamed from: e */
    public boolean m29302e() {
        return m29304g() && this.f22923b != null;
    }

    /* renamed from: f */
    public C5091a m29303f() {
        return this.f22922a;
    }

    /* renamed from: g */
    public boolean m29304g() {
        return m29303f() == C5091a.OnError;
    }

    /* renamed from: h */
    public boolean m29305h() {
        return m29303f() == C5091a.OnCompleted;
    }

    /* renamed from: i */
    public boolean m29306i() {
        return m29303f() == C5091a.OnNext;
    }

    public String toString() {
        StringBuilder append = new StringBuilder(64).append('[').append(super.toString()).append(' ').append(m29303f());
        if (m29301d()) {
            append.append(' ').append(m29300c());
        }
        if (m29302e()) {
            append.append(' ').append(m29299b().getMessage());
        }
        append.append(']');
        return append.toString();
    }

    public int hashCode() {
        int hashCode = m29303f().hashCode();
        if (m29301d()) {
            hashCode = (hashCode * 31) + m29300c().hashCode();
        }
        if (m29302e()) {
            return (hashCode * 31) + m29299b().hashCode();
        }
        return hashCode;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj.getClass() != getClass()) {
            return false;
        }
        dto dto = (dto) obj;
        if (dto.m29303f() != m29303f() || ((this.f22924c != dto.f22924c && (this.f22924c == null || !this.f22924c.equals(dto.f22924c))) || (this.f22923b != dto.f22923b && (this.f22923b == null || !this.f22923b.equals(dto.f22923b))))) {
            z = false;
        }
        return z;
    }
}
