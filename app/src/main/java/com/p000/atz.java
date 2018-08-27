package com.p000;

import android.os.Build.VERSION;
import android.os.ConditionVariable;
import java.io.IOException;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadLocalRandom;
import p000.atq.C0797a;
import p000.bpf.C1391a;

/* renamed from: atz */
public class atz {
    /* renamed from: a */
    protected static volatile bpf f4586a = null;
    /* renamed from: d */
    private static final ConditionVariable f4587d = new ConditionVariable();
    /* renamed from: e */
    private static volatile Random f4588e = null;
    /* renamed from: b */
    protected volatile Boolean f4589b;
    /* renamed from: c */
    private avx f4590c;

    /* renamed from: atz$1 */
    class C08231 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ atz f4585a;

        C08231(atz atz) {
            this.f4585a = atz;
        }

        public void run() {
            if (this.f4585a.f4589b == null) {
                synchronized (atz.f4587d) {
                    if (this.f4585a.f4589b != null) {
                        return;
                    }
                    boolean booleanValue = ((Boolean) bbb.bH.m7064c()).booleanValue();
                    if (booleanValue) {
                        try {
                            atz.f4586a = new bpf(this.f4585a.f4590c.m6093a(), "ADSHIELD", null);
                        } catch (Throwable th) {
                            booleanValue = false;
                        }
                    }
                    this.f4585a.f4589b = Boolean.valueOf(booleanValue);
                    atz.f4587d.open();
                }
            }
        }
    }

    public atz(avx avx) {
        this.f4590c = avx;
        m5725a(avx.m6097c());
    }

    /* renamed from: a */
    private void m5725a(Executor executor) {
        executor.execute(new C08231(this));
    }

    /* renamed from: c */
    private static Random m5727c() {
        if (f4588e == null) {
            synchronized (atz.class) {
                if (f4588e == null) {
                    f4588e = new Random();
                }
            }
        }
        return f4588e;
    }

    /* renamed from: a */
    public int m5728a() {
        try {
            return VERSION.SDK_INT >= 21 ? ThreadLocalRandom.current().nextInt() : atz.m5727c().nextInt();
        } catch (RuntimeException e) {
            return atz.m5727c().nextInt();
        }
    }

    /* renamed from: a */
    public void m5729a(int i, int i2, long j) throws IOException {
        try {
            f4587d.block();
            if (this.f4589b.booleanValue() && f4586a != null && this.f4590c.m6103i()) {
                axf c0797a = new C0797a();
                c0797a.f4348a = this.f4590c.m6093a().getPackageName();
                c0797a.f4349b = Long.valueOf(j);
                C1391a a = f4586a.m10288a(axf.m5615a(c0797a));
                a.m10265b(i2);
                a.m10262a(i);
                a.m10261a(this.f4590c.m6101g());
            }
        } catch (Exception e) {
        }
    }
}
