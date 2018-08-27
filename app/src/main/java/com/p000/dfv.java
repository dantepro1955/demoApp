package com.p000;

/* compiled from: UploadProgressTracker */
/* renamed from: dfv */
public class dfv {
    /* renamed from: a */
    private long f21536a = 0;
    /* renamed from: b */
    private long f21537b = 0;
    /* renamed from: c */
    private C4155a f21538c;

    /* compiled from: UploadProgressTracker */
    /* renamed from: dfv$a */
    public interface C4155a {
        /* renamed from: a */
        int mo3850a(int i);
    }

    /* renamed from: a */
    public void m27135a(long j) {
        this.f21536a += j;
    }

    /* renamed from: b */
    public void m27137b(long j) {
        this.f21537b += j;
        if (this.f21538c != null) {
            this.f21538c.mo3850a(m27133a());
        }
    }

    /* renamed from: a */
    public int m27134a(int i) {
        if (this.f21536a == 0) {
            return 0;
        }
        return this.f21537b <= this.f21536a ? (int) ((this.f21537b * ((long) i)) / this.f21536a) : i;
    }

    /* renamed from: a */
    public int m27133a() {
        return m27134a(100);
    }

    /* renamed from: a */
    public void m27136a(C4155a c4155a) {
        this.f21538c = c4155a;
    }
}
