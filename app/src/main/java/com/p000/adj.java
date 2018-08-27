package com.p000;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCodec.BufferInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.media.PlaybackParams;
import android.os.Handler;
import android.os.SystemClock;
import java.nio.ByteBuffer;
import p000.adl.C0091b;
import p000.adm.C0100b;
import p000.ady.C0115d;
import p000.ady.C0117f;

@TargetApi(16)
/* compiled from: MediaCodecAudioTrackRenderer */
/* renamed from: adj */
public class adj extends adl implements adi {
    /* renamed from: c */
    private final C0092a f561c;
    /* renamed from: d */
    private final ady f562d;
    /* renamed from: e */
    private boolean f563e;
    /* renamed from: f */
    private MediaFormat f564f;
    /* renamed from: g */
    private int f565g;
    /* renamed from: h */
    private long f566h;
    /* renamed from: i */
    private boolean f567i;
    /* renamed from: j */
    private boolean f568j;
    /* renamed from: k */
    private long f569k;

    /* compiled from: MediaCodecAudioTrackRenderer */
    /* renamed from: adj$a */
    public interface C0092a extends C0091b {
        /* renamed from: a */
        void m672a(int i, long j, long j2);

        /* renamed from: a */
        void m673a(C0115d c0115d);

        /* renamed from: a */
        void m674a(C0117f c0117f);
    }

    public adj(ads ads, adk adk) {
        this(ads, adk, null, true);
    }

    public adj(ads ads, adk adk, aeb aeb, boolean z) {
        this(ads, adk, aeb, z, null, null);
    }

    public adj(ads ads, adk adk, aeb aeb, boolean z, Handler handler, C0092a c0092a) {
        this(ads, adk, aeb, z, handler, c0092a, null, 3);
    }

    public adj(ads ads, adk adk, aeb aeb, boolean z, Handler handler, C0092a c0092a, adx adx, int i) {
        super(ads, adk, aeb, z, handler, c0092a);
        this.f561c = c0092a;
        this.f565g = 0;
        this.f562d = new ady(adx, i);
    }

    /* renamed from: a */
    protected boolean mo88a(adk adk, ado ado) throws C0100b {
        String str = ado.f621b;
        if (!ahg.m1531a(str)) {
            return false;
        }
        if ("audio/x-unknown".equals(str) || ((mo89a(str) && adk.mo94a() != null) || adk.mo93a(str, false) != null)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    protected adc mo84a(adk adk, String str, boolean z) throws C0100b {
        if (mo89a(str)) {
            String a = adk.mo94a();
            if (a != null) {
                this.f563e = true;
                return new adc(a, false);
            }
        }
        this.f563e = false;
        return super.mo84a(adk, str, z);
    }

    /* renamed from: a */
    protected boolean mo89a(String str) {
        return this.f562d.m909a(str);
    }

    /* renamed from: a */
    protected void mo85a(MediaCodec mediaCodec, boolean z, MediaFormat mediaFormat, MediaCrypto mediaCrypto) {
        String string = mediaFormat.getString("mime");
        if (this.f563e) {
            mediaFormat.setString("mime", "audio/raw");
            mediaCodec.configure(mediaFormat, null, mediaCrypto, 0);
            mediaFormat.setString("mime", string);
            this.f564f = mediaFormat;
            return;
        }
        mediaCodec.configure(mediaFormat, null, mediaCrypto, 0);
        this.f564f = null;
    }

    /* renamed from: g */
    protected adi mo90g() {
        return this;
    }

    /* renamed from: a */
    protected void mo86a(MediaFormat mediaFormat) {
        boolean z = this.f564f != null;
        ady ady = this.f562d;
        if (z) {
            mediaFormat = this.f564f;
        }
        ady.m905a(mediaFormat, z);
    }

    /* renamed from: b */
    protected void m750b(int i) {
    }

    /* renamed from: h */
    protected void mo81h() {
        super.mo81h();
        this.f562d.m913e();
    }

    /* renamed from: i */
    protected void mo82i() {
        this.f562d.m917i();
        super.mo82i();
    }

    /* renamed from: b */
    protected boolean mo54b() {
        return super.mo54b() && !this.f562d.m916h();
    }

    /* renamed from: c */
    protected boolean mo55c() {
        return this.f562d.m916h() || super.mo55c();
    }

    /* renamed from: a */
    public long mo83a() {
        long a = this.f562d.m903a(mo54b());
        if (a != Long.MIN_VALUE) {
            if (!this.f567i) {
                a = Math.max(this.f566h, a);
            }
            this.f566h = a;
            this.f567i = false;
        }
        return this.f566h;
    }

    /* renamed from: j */
    protected void mo75j() throws ade {
        this.f565g = 0;
        try {
            this.f562d.m919k();
        } finally {
            super.mo75j();
        }
    }

    /* renamed from: c */
    protected void mo79c(long j) throws ade {
        super.mo79c(j);
        this.f562d.m918j();
        this.f566h = j;
        this.f567i = true;
    }

    /* renamed from: a */
    protected boolean mo87a(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, BufferInfo bufferInfo, int i, boolean z) throws ade {
        if (this.f563e && (bufferInfo.flags & 2) != 0) {
            mediaCodec.releaseOutputBuffer(i, false);
            return true;
        } else if (z) {
            mediaCodec.releaseOutputBuffer(i, false);
            r0 = this.a;
            r0.f464f++;
            this.f562d.m914f();
            return true;
        } else {
            if (this.f562d.m908a()) {
                boolean z2 = this.f568j;
                this.f568j = this.f562d.m916h();
                if (z2 && !this.f568j && m593t() == 3) {
                    long elapsedRealtime = SystemClock.elapsedRealtime() - this.f569k;
                    long d = this.f562d.m912d();
                    m739a(this.f562d.m911c(), d == -1 ? -1 : d / 1000, elapsedRealtime);
                }
            } else {
                try {
                    if (this.f565g != 0) {
                        this.f562d.m901a(this.f565g);
                    } else {
                        this.f565g = this.f562d.m910b();
                        m750b(this.f565g);
                    }
                    this.f568j = false;
                    if (m593t() == 3) {
                        this.f562d.m913e();
                    }
                } catch (Throwable e) {
                    m740a((C0115d) e);
                    throw new ade(e);
                }
            }
            try {
                int a = this.f562d.m902a(byteBuffer, bufferInfo.offset, bufferInfo.size, bufferInfo.presentationTimeUs);
                this.f569k = SystemClock.elapsedRealtime();
                if ((a & 1) != 0) {
                    mo92l();
                    this.f567i = true;
                }
                if ((a & 2) == 0) {
                    return false;
                }
                mediaCodec.releaseOutputBuffer(i, false);
                r0 = this.a;
                r0.f463e++;
                return true;
            } catch (Throwable e2) {
                m741a((C0117f) e2);
                throw new ade(e2);
            }
        }
    }

    /* renamed from: k */
    protected void mo91k() {
        this.f562d.m915g();
    }

    /* renamed from: l */
    protected void mo92l() {
    }

    /* renamed from: a */
    public void mo49a(int i, Object obj) throws ade {
        switch (i) {
            case 1:
                this.f562d.m904a(((Float) obj).floatValue());
                return;
            case 2:
                this.f562d.m907a((PlaybackParams) obj);
                return;
            default:
                super.mo49a(i, obj);
                return;
        }
    }

    /* renamed from: a */
    private void m740a(final C0115d c0115d) {
        if (this.b != null && this.f561c != null) {
            this.b.post(new Runnable(this) {
                /* renamed from: b */
                final /* synthetic */ adj f512b;

                public void run() {
                    this.f512b.f561c.m673a(c0115d);
                }
            });
        }
    }

    /* renamed from: a */
    private void m741a(final C0117f c0117f) {
        if (this.b != null && this.f561c != null) {
            this.b.post(new Runnable(this) {
                /* renamed from: b */
                final /* synthetic */ adj f514b;

                public void run() {
                    this.f514b.f561c.m674a(c0117f);
                }
            });
        }
    }

    /* renamed from: a */
    private void m739a(int i, long j, long j2) {
        if (this.b != null && this.f561c != null) {
            final int i2 = i;
            final long j3 = j;
            final long j4 = j2;
            this.b.post(new Runnable(this) {
                /* renamed from: d */
                final /* synthetic */ adj f518d;

                public void run() {
                    this.f518d.f561c.m672a(i2, j3, j4);
                }
            });
        }
    }
}
