package com.p000;

import java.util.concurrent.TimeUnit;
import p000.dts.C5094a;

/* compiled from: ImmediateScheduler */
/* renamed from: dwh */
public final class dwh extends dts {
    /* renamed from: b */
    public static final dwh f23295b = new dwh();

    /* compiled from: ImmediateScheduler */
    /* renamed from: dwh$a */
    final class C5191a extends C5094a implements dtw {
        /* renamed from: a */
        final dys f23293a = new dys();
        /* renamed from: b */
        final /* synthetic */ dwh f23294b;

        C5191a(dwh dwh) {
            this.f23294b = dwh;
        }

        /* renamed from: a */
        public dtw mo4645a(duk duk, long j, TimeUnit timeUnit) {
            return mo4644a(new dwn(duk, this, this.f23294b.now() + timeUnit.toMillis(j)));
        }

        /* renamed from: a */
        public dtw mo4644a(duk duk) {
            duk.mo4643a();
            return dyw.m29892a();
        }

        public void unsubscribe() {
            this.f23293a.unsubscribe();
        }

        public boolean isUnsubscribed() {
            return this.f23293a.isUnsubscribed();
        }
    }

    private dwh() {
    }

    public C5094a createWorker() {
        return new C5191a(this);
    }
}
