package com.p000;

import java.io.Closeable;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ScheduledFuture;

/* compiled from: CancellationTokenSource */
/* renamed from: rt */
public class rt implements Closeable {
    /* renamed from: a */
    private final Object f25360a;
    /* renamed from: b */
    private final List<rs> f25361b;
    /* renamed from: c */
    private ScheduledFuture<?> f25362c;
    /* renamed from: d */
    private boolean f25363d;
    /* renamed from: e */
    private boolean f25364e;

    /* renamed from: a */
    public boolean m33988a() {
        boolean z;
        synchronized (this.f25360a) {
            m33985b();
            z = this.f25363d;
        }
        return z;
    }

    public void close() {
        synchronized (this.f25360a) {
            if (this.f25364e) {
                return;
            }
            m33986c();
            for (rs close : this.f25361b) {
                close.close();
            }
            this.f25361b.clear();
            this.f25364e = true;
        }
    }

    /* renamed from: a */
    void m33987a(rs rsVar) {
        synchronized (this.f25360a) {
            m33985b();
            this.f25361b.remove(rsVar);
        }
    }

    public String toString() {
        return String.format(Locale.US, "%s@%s[cancellationRequested=%s]", new Object[]{getClass().getName(), Integer.toHexString(hashCode()), Boolean.toString(m33988a())});
    }

    /* renamed from: b */
    private void m33985b() {
        if (this.f25364e) {
            throw new IllegalStateException("Object already closed");
        }
    }

    /* renamed from: c */
    private void m33986c() {
        if (this.f25362c != null) {
            this.f25362c.cancel(true);
            this.f25362c = null;
        }
    }
}
