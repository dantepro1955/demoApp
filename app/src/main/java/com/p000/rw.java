package com.p000;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* compiled from: Task */
/* renamed from: rw */
public class rw<TResult> {
    /* renamed from: a */
    public static final ExecutorService f25392a = rq.m33981a();
    /* renamed from: b */
    public static final Executor f25393b = rn.m33976b();
    /* renamed from: c */
    private static final Executor f25394c = rq.m33982b();
    /* renamed from: d */
    private static volatile C5735b f25395d;
    /* renamed from: m */
    private static rw<?> f25396m = new rw(null);
    /* renamed from: n */
    private static rw<Boolean> f25397n = new rw(Boolean.valueOf(true));
    /* renamed from: o */
    private static rw<Boolean> f25398o = new rw(Boolean.valueOf(false));
    /* renamed from: p */
    private static rw<?> f25399p = new rw(true);
    /* renamed from: e */
    private final Object f25400e = new Object();
    /* renamed from: f */
    private boolean f25401f;
    /* renamed from: g */
    private boolean f25402g;
    /* renamed from: h */
    private TResult f25403h;
    /* renamed from: i */
    private Exception f25404i;
    /* renamed from: j */
    private boolean f25405j;
    /* renamed from: k */
    private ry f25406k;
    /* renamed from: l */
    private List<ru<TResult, Void>> f25407l = new ArrayList();

    /* compiled from: Task */
    /* renamed from: rw$a */
    public class C5734a extends rx<TResult> {
        /* renamed from: a */
        final /* synthetic */ rw f25391a;

        C5734a(rw rwVar) {
            this.f25391a = rwVar;
        }
    }

    /* compiled from: Task */
    /* renamed from: rw$b */
    public interface C5735b {
        /* renamed from: a */
        void m34000a(rw<?> rwVar, rz rzVar);
    }

    /* renamed from: a */
    public static C5735b m34001a() {
        return f25395d;
    }

    rw() {
    }

    private rw(TResult tResult) {
        m34019b((Object) tResult);
    }

    private rw(boolean z) {
        if (z) {
            m34027i();
        } else {
            m34019b(null);
        }
    }

    /* renamed from: b */
    public static <TResult> C5734a m34007b() {
        rw rwVar = new rw();
        rwVar.getClass();
        return new C5734a(rwVar);
    }

    /* renamed from: c */
    public boolean m34022c() {
        boolean z;
        synchronized (this.f25400e) {
            z = this.f25401f;
        }
        return z;
    }

    /* renamed from: d */
    public boolean m34023d() {
        boolean z;
        synchronized (this.f25400e) {
            z = this.f25402g;
        }
        return z;
    }

    /* renamed from: e */
    public boolean m34024e() {
        boolean z;
        synchronized (this.f25400e) {
            z = m34026g() != null;
        }
        return z;
    }

    /* renamed from: f */
    public TResult m34025f() {
        TResult tResult;
        synchronized (this.f25400e) {
            tResult = this.f25403h;
        }
        return tResult;
    }

    /* renamed from: g */
    public Exception m34026g() {
        Exception exception;
        synchronized (this.f25400e) {
            if (this.f25404i != null) {
                this.f25405j = true;
                if (this.f25406k != null) {
                    this.f25406k.m34039a();
                    this.f25406k = null;
                }
            }
            exception = this.f25404i;
        }
        return exception;
    }

    /* renamed from: a */
    public static <TResult> rw<TResult> m34003a(TResult tResult) {
        if (tResult == null) {
            return f25396m;
        }
        if (tResult instanceof Boolean) {
            return ((Boolean) tResult).booleanValue() ? f25397n : f25398o;
        } else {
            rx rxVar = new rx();
            rxVar.m33997b((Object) tResult);
            return rxVar.m33993a();
        }
    }

    /* renamed from: a */
    public static <TResult> rw<TResult> m34002a(Exception exception) {
        rx rxVar = new rx();
        rxVar.m33996b(exception);
        return rxVar.m33993a();
    }

    /* renamed from: h */
    public static <TResult> rw<TResult> m34011h() {
        return f25399p;
    }

    /* renamed from: a */
    public static <TResult> rw<TResult> m34004a(Callable<TResult> callable, Executor executor) {
        return rw.m34005a((Callable) callable, executor, null);
    }

    /* renamed from: a */
    public static <TResult> rw<TResult> m34005a(final Callable<TResult> callable, Executor executor, final rr rrVar) {
        final rx rxVar = new rx();
        try {
            executor.execute(new Runnable() {
                public void run() {
                    if (rrVar == null || !rrVar.m33984a()) {
                        try {
                            rxVar.m33997b(callable.call());
                            return;
                        } catch (CancellationException e) {
                            rxVar.m33999c();
                            return;
                        } catch (Exception e2) {
                            rxVar.m33996b(e2);
                            return;
                        }
                    }
                    rxVar.m33999c();
                }
            });
        } catch (Exception e) {
            rxVar.m33996b(new rv(e));
        }
        return rxVar.m33993a();
    }

    /* renamed from: a */
    public <TContinuationResult> rw<TContinuationResult> m34015a(ru<TResult, TContinuationResult> ruVar, Executor executor, rr rrVar) {
        final rx rxVar = new rx();
        synchronized (this.f25400e) {
            boolean c = m34022c();
            if (!c) {
                final ru<TResult, TContinuationResult> ruVar2 = ruVar;
                final Executor executor2 = executor;
                final rr rrVar2 = rrVar;
                this.f25407l.add(new ru<TResult, Void>(this) {
                    /* renamed from: e */
                    final /* synthetic */ rw f25369e;

                    public /* synthetic */ Object then(rw rwVar) throws Exception {
                        return m33989a(rwVar);
                    }

                    /* renamed from: a */
                    public Void m33989a(rw<TResult> rwVar) {
                        rw.m34009c(rxVar, ruVar2, rwVar, executor2, rrVar2);
                        return null;
                    }
                });
            }
        }
        if (c) {
            rw.m34009c(rxVar, ruVar, this, executor, rrVar);
        }
        return rxVar.m33993a();
    }

    /* renamed from: a */
    public <TContinuationResult> rw<TContinuationResult> m34013a(ru<TResult, TContinuationResult> ruVar) {
        return m34015a((ru) ruVar, f25394c, null);
    }

    /* renamed from: a */
    public <TContinuationResult> rw<TContinuationResult> m34014a(ru<TResult, rw<TContinuationResult>> ruVar, Executor executor) {
        return m34017b(ruVar, executor, null);
    }

    /* renamed from: b */
    public <TContinuationResult> rw<TContinuationResult> m34017b(ru<TResult, rw<TContinuationResult>> ruVar, Executor executor, rr rrVar) {
        final rx rxVar = new rx();
        synchronized (this.f25400e) {
            boolean c = m34022c();
            if (!c) {
                final ru<TResult, rw<TContinuationResult>> ruVar2 = ruVar;
                final Executor executor2 = executor;
                final rr rrVar2 = rrVar;
                this.f25407l.add(new ru<TResult, Void>(this) {
                    /* renamed from: e */
                    final /* synthetic */ rw f25374e;

                    public /* synthetic */ Object then(rw rwVar) throws Exception {
                        return m33990a(rwVar);
                    }

                    /* renamed from: a */
                    public Void m33990a(rw<TResult> rwVar) {
                        rw.m34010d(rxVar, ruVar2, rwVar, executor2, rrVar2);
                        return null;
                    }
                });
            }
        }
        if (c) {
            rw.m34010d(rxVar, ruVar, this, executor, rrVar);
        }
        return rxVar.m33993a();
    }

    /* renamed from: b */
    public <TContinuationResult> rw<TContinuationResult> m34016b(ru<TResult, rw<TContinuationResult>> ruVar) {
        return m34017b(ruVar, f25394c, null);
    }

    /* renamed from: c */
    public <TContinuationResult> rw<TContinuationResult> m34021c(final ru<TResult, TContinuationResult> ruVar, Executor executor, final rr rrVar) {
        return m34014a(new ru<TResult, rw<TContinuationResult>>(this) {
            /* renamed from: c */
            final /* synthetic */ rw f25377c;

            public /* synthetic */ Object then(rw rwVar) throws Exception {
                return m33991a(rwVar);
            }

            /* renamed from: a */
            public rw<TContinuationResult> m33991a(rw<TResult> rwVar) {
                if (rrVar != null && rrVar.m33984a()) {
                    return rw.m34011h();
                }
                if (rwVar.m34024e()) {
                    return rw.m34002a(rwVar.m34026g());
                }
                if (rwVar.m34023d()) {
                    return rw.m34011h();
                }
                return rwVar.m34013a(ruVar);
            }
        }, executor);
    }

    /* renamed from: c */
    public <TContinuationResult> rw<TContinuationResult> m34020c(ru<TResult, TContinuationResult> ruVar) {
        return m34021c(ruVar, f25394c, null);
    }

    /* renamed from: c */
    private static <TContinuationResult, TResult> void m34009c(final rx<TContinuationResult> rxVar, final ru<TResult, TContinuationResult> ruVar, final rw<TResult> rwVar, Executor executor, final rr rrVar) {
        try {
            executor.execute(new Runnable() {
                public void run() {
                    if (rrVar == null || !rrVar.m33984a()) {
                        try {
                            rxVar.m33997b(ruVar.then(rwVar));
                            return;
                        } catch (CancellationException e) {
                            rxVar.m33999c();
                            return;
                        } catch (Exception e2) {
                            rxVar.m33996b(e2);
                            return;
                        }
                    }
                    rxVar.m33999c();
                }
            });
        } catch (Exception e) {
            rxVar.m33996b(new rv(e));
        }
    }

    /* renamed from: d */
    private static <TContinuationResult, TResult> void m34010d(final rx<TContinuationResult> rxVar, final ru<TResult, rw<TContinuationResult>> ruVar, final rw<TResult> rwVar, Executor executor, final rr rrVar) {
        try {
            executor.execute(new Runnable() {

                /* compiled from: Task */
                /* renamed from: rw$5$1 */
                class C57311 implements ru<TContinuationResult, Void> {
                    /* renamed from: a */
                    final /* synthetic */ C57325 f25382a;

                    C57311(C57325 c57325) {
                        this.f25382a = c57325;
                    }

                    public /* synthetic */ Object then(rw rwVar) throws Exception {
                        return m33992a(rwVar);
                    }

                    /* renamed from: a */
                    public Void m33992a(rw<TContinuationResult> rwVar) {
                        if (rrVar != null && rrVar.m33984a()) {
                            rxVar.m33999c();
                        } else if (rwVar.m34023d()) {
                            rxVar.m33999c();
                        } else if (rwVar.m34024e()) {
                            rxVar.m33996b(rwVar.m34026g());
                        } else {
                            rxVar.m33997b(rwVar.m34025f());
                        }
                        return null;
                    }
                }

                public void run() {
                    if (rrVar == null || !rrVar.m33984a()) {
                        try {
                            rw rwVar = (rw) ruVar.then(rwVar);
                            if (rwVar == null) {
                                rxVar.m33997b(null);
                                return;
                            } else {
                                rwVar.m34013a(new C57311(this));
                                return;
                            }
                        } catch (CancellationException e) {
                            rxVar.m33999c();
                            return;
                        } catch (Exception e2) {
                            rxVar.m33996b(e2);
                            return;
                        }
                    }
                    rxVar.m33999c();
                }
            });
        } catch (Exception e) {
            rxVar.m33996b(new rv(e));
        }
    }

    /* renamed from: j */
    private void m34012j() {
        synchronized (this.f25400e) {
            for (ru then : this.f25407l) {
                try {
                    then.then(this);
                } catch (RuntimeException e) {
                    throw e;
                } catch (Throwable e2) {
                    throw new RuntimeException(e2);
                }
            }
            this.f25407l = null;
        }
    }

    /* renamed from: i */
    boolean m34027i() {
        boolean z = true;
        synchronized (this.f25400e) {
            if (this.f25401f) {
                z = false;
            } else {
                this.f25401f = true;
                this.f25402g = true;
                this.f25400e.notifyAll();
                m34012j();
            }
        }
        return z;
    }

    /* renamed from: b */
    boolean m34019b(TResult tResult) {
        boolean z = true;
        synchronized (this.f25400e) {
            if (this.f25401f) {
                z = false;
            } else {
                this.f25401f = true;
                this.f25403h = tResult;
                this.f25400e.notifyAll();
                m34012j();
            }
        }
        return z;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: b */
    boolean m34018b(Exception r5) {
        /*
        r4 = this;
        r1 = 1;
        r0 = 0;
        r2 = r4.f25400e;
        monitor-enter(r2);
        r3 = r4.f25401f;	 Catch:{ all -> 0x002f }
        if (r3 == 0) goto L_0x000b;
    L_0x0009:
        monitor-exit(r2);	 Catch:{ all -> 0x002f }
    L_0x000a:
        return r0;
    L_0x000b:
        r0 = 1;
        r4.f25401f = r0;	 Catch:{ all -> 0x002f }
        r4.f25404i = r5;	 Catch:{ all -> 0x002f }
        r0 = 0;
        r4.f25405j = r0;	 Catch:{ all -> 0x002f }
        r0 = r4.f25400e;	 Catch:{ all -> 0x002f }
        r0.notifyAll();	 Catch:{ all -> 0x002f }
        r4.m34012j();	 Catch:{ all -> 0x002f }
        r0 = r4.f25405j;	 Catch:{ all -> 0x002f }
        if (r0 != 0) goto L_0x002c;
    L_0x001f:
        r0 = p000.rw.m34001a();	 Catch:{ all -> 0x002f }
        if (r0 == 0) goto L_0x002c;
    L_0x0025:
        r0 = new ry;	 Catch:{ all -> 0x002f }
        r0.<init>(r4);	 Catch:{ all -> 0x002f }
        r4.f25406k = r0;	 Catch:{ all -> 0x002f }
    L_0x002c:
        monitor-exit(r2);	 Catch:{ all -> 0x002f }
        r0 = r1;
        goto L_0x000a;
    L_0x002f:
        r0 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x002f }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: rw.b(java.lang.Exception):boolean");
    }
}
