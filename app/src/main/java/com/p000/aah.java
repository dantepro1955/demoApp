package com.p000;

import io.fabric.sdk.android.services.concurrency.internal.Backoff;
import java.util.Random;

/* compiled from: RandomBackoff */
/* renamed from: aah */
class aah implements Backoff {
    /* renamed from: a */
    final Backoff f70a;
    /* renamed from: b */
    final Random f71b;
    /* renamed from: c */
    final double f72c;

    public aah(Backoff backoff, double d) {
        this(backoff, d, new Random());
    }

    public aah(Backoff backoff, double d, Random random) {
        if (d < 0.0d || d > 1.0d) {
            throw new IllegalArgumentException("jitterPercent must be between 0.0 and 1.0");
        } else if (backoff == null) {
            throw new NullPointerException("backoff must not be null");
        } else if (random == null) {
            throw new NullPointerException("random must not be null");
        } else {
            this.f70a = backoff;
            this.f72c = d;
            this.f71b = random;
        }
    }

    /* renamed from: a */
    public long m79a(int i) {
        return (long) (m78a() * ((double) this.f70a.a(i)));
    }

    /* renamed from: a */
    double m78a() {
        double d = 1.0d - this.f72c;
        return d + (((this.f72c + 1.0d) - d) * this.f71b.nextDouble());
    }
}
