package com.p000;

import android.annotation.TargetApi;
import android.graphics.SurfaceTexture;
import java.util.concurrent.TimeUnit;

@TargetApi(14)
@bhd
/* renamed from: ajd */
public class ajd {
    /* renamed from: a */
    private final long f1618a = TimeUnit.MILLISECONDS.toNanos(((Long) bbb.f5369B.m7064c()).longValue());
    /* renamed from: b */
    private long f1619b;
    /* renamed from: c */
    private boolean f1620c = true;

    /* renamed from: a */
    public void m1809a() {
        this.f1620c = true;
    }

    /* renamed from: a */
    public void m1810a(SurfaceTexture surfaceTexture, final ais ais) {
        if (ais != null) {
            long timestamp = surfaceTexture.getTimestamp();
            if (this.f1620c || Math.abs(timestamp - this.f1619b) >= this.f1618a) {
                this.f1620c = false;
                this.f1619b = timestamp;
                bkg.f6710a.post(new Runnable(this) {
                    public void run() {
                        ais.mo3114g();
                    }
                });
            }
        }
    }
}
