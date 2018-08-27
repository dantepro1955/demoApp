package com.p000;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaCodec.BufferInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.SystemClock;
import android.view.Surface;
import com.facebook.imagepipeline.common.RotationOptions;
import java.nio.ByteBuffer;
import p000.adl.C0091b;
import p000.adm.C0100b;

@TargetApi(16)
/* compiled from: MediaCodecVideoTrackRenderer */
/* renamed from: adn */
public class adn extends adl {
    /* renamed from: c */
    private final adw f598c;
    /* renamed from: d */
    private final C0107a f599d;
    /* renamed from: e */
    private final long f600e;
    /* renamed from: f */
    private final int f601f;
    /* renamed from: g */
    private final int f602g;
    /* renamed from: h */
    private Surface f603h;
    /* renamed from: i */
    private boolean f604i;
    /* renamed from: j */
    private boolean f605j;
    /* renamed from: k */
    private long f606k;
    /* renamed from: l */
    private long f607l;
    /* renamed from: m */
    private int f608m;
    /* renamed from: n */
    private int f609n;
    /* renamed from: o */
    private int f610o;
    /* renamed from: p */
    private float f611p;
    /* renamed from: q */
    private int f612q;
    /* renamed from: r */
    private int f613r;
    /* renamed from: s */
    private int f614s;
    /* renamed from: t */
    private float f615t;
    /* renamed from: u */
    private int f616u;
    /* renamed from: v */
    private int f617v;
    /* renamed from: w */
    private int f618w;
    /* renamed from: x */
    private float f619x;

    /* compiled from: MediaCodecVideoTrackRenderer */
    /* renamed from: adn$a */
    public interface C0107a extends C0091b {
        /* renamed from: a */
        void m786a(int i, int i2, int i3, float f);

        /* renamed from: a */
        void m787a(int i, long j);

        /* renamed from: a */
        void m788a(Surface surface);
    }

    public adn(Context context, ads ads, adk adk, int i, long j, Handler handler, C0107a c0107a, int i2) {
        this(context, ads, adk, i, j, null, false, handler, c0107a, i2);
    }

    public adn(Context context, ads ads, adk adk, int i, long j, aeb aeb, boolean z, Handler handler, C0107a c0107a, int i2) {
        super(ads, adk, aeb, z, handler, c0107a);
        this.f598c = new adw(context);
        this.f601f = i;
        this.f600e = 1000 * j;
        this.f599d = c0107a;
        this.f602g = i2;
        this.f606k = -1;
        this.f612q = -1;
        this.f613r = -1;
        this.f615t = -1.0f;
        this.f611p = -1.0f;
        this.f616u = -1;
        this.f617v = -1;
        this.f619x = -1.0f;
    }

    /* renamed from: a */
    protected boolean mo88a(adk adk, ado ado) throws C0100b {
        String str = ado.f621b;
        if (!ahg.m1532b(str)) {
            return false;
        }
        if ("video/x-unknown".equals(str) || adk.mo93a(str, false) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    protected void mo74a(int i, long j, boolean z) throws ade {
        super.mo74a(i, j, z);
        if (z && this.f600e > 0) {
            this.f606k = (SystemClock.elapsedRealtime() * 1000) + this.f600e;
        }
        this.f598c.m859a();
    }

    /* renamed from: c */
    protected void mo79c(long j) throws ade {
        super.mo79c(j);
        this.f605j = false;
        this.f609n = 0;
        this.f606k = -1;
    }

    /* renamed from: c */
    protected boolean mo55c() {
        if (super.mo55c() && (this.f605j || !m734o() || m736q() == 2)) {
            this.f606k = -1;
            return true;
        } else if (this.f606k == -1) {
            return false;
        } else {
            if (SystemClock.elapsedRealtime() * 1000 < this.f606k) {
                return true;
            }
            this.f606k = -1;
            return false;
        }
    }

    /* renamed from: h */
    protected void mo81h() {
        super.mo81h();
        this.f608m = 0;
        this.f607l = SystemClock.elapsedRealtime();
    }

    /* renamed from: i */
    protected void mo82i() {
        this.f606k = -1;
        m794z();
        super.mo82i();
    }

    /* renamed from: j */
    protected void mo75j() throws ade {
        this.f612q = -1;
        this.f613r = -1;
        this.f615t = -1.0f;
        this.f611p = -1.0f;
        this.f616u = -1;
        this.f617v = -1;
        this.f619x = -1.0f;
        this.f598c.m860b();
        super.mo75j();
    }

    /* renamed from: a */
    public void mo49a(int i, Object obj) throws ade {
        if (i == 1) {
            m791a((Surface) obj);
        } else {
            super.mo49a(i, obj);
        }
    }

    /* renamed from: a */
    private void m791a(Surface surface) throws ade {
        if (this.f603h != surface) {
            this.f603h = surface;
            this.f604i = false;
            int t = m593t();
            if (t == 2 || t == 3) {
                m735p();
                m732m();
            }
        }
    }

    /* renamed from: n */
    protected boolean mo101n() {
        return super.mo101n() && this.f603h != null && this.f603h.isValid();
    }

    /* renamed from: a */
    protected void mo85a(MediaCodec mediaCodec, boolean z, MediaFormat mediaFormat, MediaCrypto mediaCrypto) {
        m790a(mediaFormat, z);
        mediaCodec.configure(mediaFormat, this.f603h, mediaCrypto, 0);
        mediaCodec.setVideoScalingMode(this.f601f);
    }

    /* renamed from: a */
    protected void mo99a(adp adp) throws ade {
        super.mo99a(adp);
        this.f611p = adp.f641a.f632m == -1.0f ? 1.0f : adp.f641a.f632m;
        this.f610o = adp.f641a.f631l == -1 ? 0 : adp.f641a.f631l;
    }

    /* renamed from: a */
    protected void mo86a(MediaFormat mediaFormat) {
        int integer;
        Object obj = (mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top")) ? 1 : null;
        this.f612q = obj != null ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger("width");
        if (obj != null) {
            integer = (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1;
        } else {
            integer = mediaFormat.getInteger("height");
        }
        this.f613r = integer;
        this.f615t = this.f611p;
        if (ahr.f1511a < 21) {
            this.f614s = this.f610o;
        } else if (this.f610o == 90 || this.f610o == RotationOptions.ROTATE_270) {
            integer = this.f612q;
            this.f612q = this.f613r;
            this.f613r = integer;
            this.f615t = 1.0f / this.f615t;
        }
    }

    /* renamed from: a */
    protected boolean mo100a(MediaCodec mediaCodec, boolean z, ado ado, ado ado2) {
        return ado2.f621b.equals(ado.f621b) && (z || (ado.f627h == ado2.f627h && ado.f628i == ado2.f628i));
    }

    /* renamed from: a */
    protected boolean mo87a(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, BufferInfo bufferInfo, int i, boolean z) {
        if (z) {
            m798a(mediaCodec, i);
            this.f609n = 0;
            return true;
        } else if (!this.f605j) {
            if (ahr.f1511a >= 21) {
                m799a(mediaCodec, i, System.nanoTime());
            } else {
                m807c(mediaCodec, i);
            }
            this.f609n = 0;
            return true;
        } else if (m593t() != 3) {
            return false;
        } else {
            long elapsedRealtime = (bufferInfo.presentationTimeUs - j) - ((SystemClock.elapsedRealtime() * 1000) - j2);
            long nanoTime = System.nanoTime();
            elapsedRealtime = this.f598c.m858a(bufferInfo.presentationTimeUs, (elapsedRealtime * 1000) + nanoTime);
            nanoTime = (elapsedRealtime - nanoTime) / 1000;
            if (nanoTime < -30000) {
                m805b(mediaCodec, i);
                return true;
            }
            if (ahr.f1511a >= 21) {
                if (nanoTime < 50000) {
                    m799a(mediaCodec, i, elapsedRealtime);
                    this.f609n = 0;
                    return true;
                }
            } else if (nanoTime < 30000) {
                if (nanoTime > 11000) {
                    try {
                        Thread.sleep((nanoTime - 10000) / 1000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }
                m807c(mediaCodec, i);
                this.f609n = 0;
                return true;
            }
            return false;
        }
    }

    /* renamed from: a */
    protected void m798a(MediaCodec mediaCodec, int i) {
        ahq.m1589a("skipVideoBuffer");
        mediaCodec.releaseOutputBuffer(i, false);
        ahq.m1588a();
        ada ada = this.a;
        ada.f464f++;
    }

    /* renamed from: b */
    protected void m805b(MediaCodec mediaCodec, int i) {
        ahq.m1589a("dropVideoBuffer");
        mediaCodec.releaseOutputBuffer(i, false);
        ahq.m1588a();
        ada ada = this.a;
        ada.f465g++;
        this.f608m++;
        this.f609n++;
        this.a.f466h = Math.max(this.f609n, this.a.f466h);
        if (this.f608m == this.f602g) {
            m794z();
        }
    }

    /* renamed from: c */
    protected void m807c(MediaCodec mediaCodec, int i) {
        m792l();
        ahq.m1589a("releaseOutputBuffer");
        mediaCodec.releaseOutputBuffer(i, true);
        ahq.m1588a();
        ada ada = this.a;
        ada.f463e++;
        this.f605j = true;
        m793y();
    }

    @TargetApi(21)
    /* renamed from: a */
    protected void m799a(MediaCodec mediaCodec, int i, long j) {
        m792l();
        ahq.m1589a("releaseOutputBuffer");
        mediaCodec.releaseOutputBuffer(i, j);
        ahq.m1588a();
        ada ada = this.a;
        ada.f463e++;
        this.f605j = true;
        m793y();
    }

    @SuppressLint({"InlinedApi"})
    /* renamed from: a */
    private void m790a(MediaFormat mediaFormat, boolean z) {
        if (!mediaFormat.containsKey("max-input-size")) {
            int integer = mediaFormat.getInteger("height");
            if (z && mediaFormat.containsKey("max-height")) {
                integer = Math.max(integer, mediaFormat.getInteger("max-height"));
            }
            int integer2 = mediaFormat.getInteger("width");
            if (z && mediaFormat.containsKey("max-width")) {
                integer2 = Math.max(integer, mediaFormat.getInteger("max-width"));
            }
            String string = mediaFormat.getString("mime");
            Object obj = -1;
            switch (string.hashCode()) {
                case -1662541442:
                    if (string.equals("video/hevc")) {
                        int i = 2;
                        break;
                    }
                    break;
                case 1331836730:
                    if (string.equals("video/avc")) {
                        obj = null;
                        break;
                    }
                    break;
                case 1599127256:
                    if (string.equals("video/x-vnd.on2.vp8")) {
                        obj = 1;
                        break;
                    }
                    break;
                case 1599127257:
                    if (string.equals("video/x-vnd.on2.vp9")) {
                        obj = 3;
                        break;
                    }
                    break;
            }
            switch (obj) {
                case null:
                    if (!"BRAVIA 4K 2015".equals(ahr.f1514d)) {
                        integer2 = ((((integer + 15) / 16) * ((integer2 + 15) / 16)) * 16) * 16;
                        integer = 2;
                        break;
                    }
                    return;
                case 1:
                    integer2 = integer * integer2;
                    integer = 2;
                    break;
                case 2:
                case 3:
                    integer2 *= integer;
                    integer = 4;
                    break;
                default:
                    return;
            }
            mediaFormat.setInteger("max-input-size", (integer2 * 3) / (integer * 2));
        }
    }

    /* renamed from: l */
    private void m792l() {
        if (this.b != null && this.f599d != null) {
            if (this.f616u != this.f612q || this.f617v != this.f613r || this.f618w != this.f614s || this.f619x != this.f615t) {
                final int i = this.f612q;
                final int i2 = this.f613r;
                final int i3 = this.f614s;
                final float f = this.f615t;
                this.b.post(new Runnable(this) {
                    /* renamed from: e */
                    final /* synthetic */ adn f592e;

                    public void run() {
                        this.f592e.f599d.m786a(i, i2, i3, f);
                    }
                });
                this.f616u = i;
                this.f617v = i2;
                this.f618w = i3;
                this.f619x = f;
            }
        }
    }

    /* renamed from: y */
    private void m793y() {
        if (this.b != null && this.f599d != null && !this.f604i) {
            final Surface surface = this.f603h;
            this.b.post(new Runnable(this) {
                /* renamed from: b */
                final /* synthetic */ adn f594b;

                public void run() {
                    this.f594b.f599d.m788a(surface);
                }
            });
            this.f604i = true;
        }
    }

    /* renamed from: z */
    private void m794z() {
        if (this.b != null && this.f599d != null && this.f608m != 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            final int i = this.f608m;
            final long j = elapsedRealtime - this.f607l;
            this.b.post(new Runnable(this) {
                /* renamed from: c */
                final /* synthetic */ adn f597c;

                public void run() {
                    this.f597c.f599d.m787a(i, j);
                }
            });
            this.f608m = 0;
            this.f607l = elapsedRealtime;
        }
    }
}
