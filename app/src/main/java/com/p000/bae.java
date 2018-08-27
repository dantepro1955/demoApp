package com.p000;

import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: bae */
public class bae implements biu {
    /* renamed from: a */
    private final Executor f5208a;

    /* renamed from: bae$a */
    class C0959a implements Runnable {
        /* renamed from: a */
        final /* synthetic */ bae f5204a;
        /* renamed from: b */
        private final bfx f5205b;
        /* renamed from: c */
        private final bht f5206c;
        /* renamed from: d */
        private final Runnable f5207d;

        public C0959a(bae bae, bfx bfx, bht bht, Runnable runnable) {
            this.f5204a = bae;
            this.f5205b = bfx;
            this.f5206c = bht;
            this.f5207d = runnable;
        }

        public void run() {
            if (this.f5206c.m8540a()) {
                this.f5205b.mo712a(this.f5206c.f6281a);
            } else {
                this.f5205b.m5544b(this.f5206c.f6283c);
            }
            if (this.f5206c.f6284d) {
                this.f5205b.m5545b("intermediate-response");
            } else {
                this.f5205b.m5547c("done");
            }
            if (this.f5207d != null) {
                this.f5207d.run();
            }
        }
    }

    public bae(final Handler handler) {
        this.f5208a = new Executor(this) {
            /* renamed from: b */
            final /* synthetic */ bae f5203b;

            public void execute(Runnable runnable) {
                handler.post(runnable);
            }
        };
    }

    /* renamed from: a */
    public void mo890a(bfx<?> bfx, bht<?> bht) {
        mo891a(bfx, bht, null);
    }

    /* renamed from: a */
    public void mo891a(bfx<?> bfx, bht<?> bht, Runnable runnable) {
        bfx.m5560p();
        bfx.m5545b("post-response");
        this.f5208a.execute(new C0959a(this, bfx, bht, runnable));
    }

    /* renamed from: a */
    public void mo892a(bfx<?> bfx, bmt bmt) {
        bfx.m5545b("post-error");
        this.f5208a.execute(new C0959a(this, bfx, bht.m8538a(bmt), null));
    }
}
