package com.p000;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCodec.BufferInfo;
import android.media.MediaCodec.CodecException;
import android.media.MediaCodec.CryptoException;
import android.media.MediaCodec.CryptoInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.SystemClock;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import p000.adm.C0100b;

@TargetApi(16)
/* compiled from: MediaCodecTrackRenderer */
/* renamed from: adl */
public abstract class adl extends adt {
    /* renamed from: A */
    private boolean f525A;
    /* renamed from: B */
    private int f526B;
    /* renamed from: C */
    private int f527C;
    /* renamed from: D */
    private boolean f528D;
    /* renamed from: E */
    private boolean f529E;
    /* renamed from: F */
    private int f530F;
    /* renamed from: G */
    private boolean f531G;
    /* renamed from: H */
    private boolean f532H;
    /* renamed from: I */
    private boolean f533I;
    /* renamed from: J */
    private boolean f534J;
    /* renamed from: a */
    public final ada f535a;
    /* renamed from: b */
    protected final Handler f536b;
    /* renamed from: c */
    private final adk f537c;
    /* renamed from: d */
    private final aeb f538d;
    /* renamed from: e */
    private final boolean f539e;
    /* renamed from: f */
    private final adr f540f;
    /* renamed from: g */
    private final adp f541g;
    /* renamed from: h */
    private final List<Long> f542h;
    /* renamed from: i */
    private final BufferInfo f543i;
    /* renamed from: j */
    private final C0091b f544j;
    /* renamed from: k */
    private final boolean f545k;
    /* renamed from: l */
    private ado f546l;
    /* renamed from: m */
    private aea f547m;
    /* renamed from: n */
    private MediaCodec f548n;
    /* renamed from: o */
    private boolean f549o;
    /* renamed from: p */
    private boolean f550p;
    /* renamed from: q */
    private boolean f551q;
    /* renamed from: r */
    private boolean f552r;
    /* renamed from: s */
    private boolean f553s;
    /* renamed from: t */
    private boolean f554t;
    /* renamed from: u */
    private ByteBuffer[] f555u;
    /* renamed from: v */
    private ByteBuffer[] f556v;
    /* renamed from: w */
    private long f557w;
    /* renamed from: x */
    private int f558x;
    /* renamed from: y */
    private int f559y;
    /* renamed from: z */
    private boolean f560z;

    /* compiled from: MediaCodecTrackRenderer */
    /* renamed from: adl$b */
    public interface C0091b {
        /* renamed from: a */
        void m669a(C0097a c0097a);

        /* renamed from: a */
        void m670a(CryptoException cryptoException);

        /* renamed from: a */
        void m671a(String str, long j, long j2);
    }

    /* compiled from: MediaCodecTrackRenderer */
    /* renamed from: adl$a */
    public static class C0097a extends Exception {
        /* renamed from: a */
        public final String f579a;
        /* renamed from: b */
        public final boolean f580b;
        /* renamed from: c */
        public final String f581c;
        /* renamed from: d */
        public final String f582d;

        public C0097a(ado ado, Throwable th, boolean z, int i) {
            super("Decoder init failed: [" + i + "], " + ado, th);
            this.f579a = ado.f621b;
            this.f580b = z;
            this.f581c = null;
            this.f582d = C0097a.m764a(i);
        }

        public C0097a(ado ado, Throwable th, boolean z, String str) {
            super("Decoder init failed: " + str + ", " + ado, th);
            this.f579a = ado.f621b;
            this.f580b = z;
            this.f581c = str;
            this.f582d = ahr.f1511a >= 21 ? C0097a.m765a(th) : null;
        }

        @TargetApi(21)
        /* renamed from: a */
        private static String m765a(Throwable th) {
            if (th instanceof CodecException) {
                return ((CodecException) th).getDiagnosticInfo();
            }
            return null;
        }

        /* renamed from: a */
        private static String m764a(int i) {
            return "com.google.android.exoplayer.MediaCodecTrackRenderer_" + (i < 0 ? "neg_" : "") + Math.abs(i);
        }
    }

    /* renamed from: a */
    protected abstract void mo85a(MediaCodec mediaCodec, boolean z, MediaFormat mediaFormat, MediaCrypto mediaCrypto);

    /* renamed from: a */
    protected abstract boolean mo87a(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, BufferInfo bufferInfo, int i, boolean z) throws ade;

    /* renamed from: a */
    protected abstract boolean mo88a(adk adk, ado ado) throws C0100b;

    public adl(ads ads, adk adk, aeb aeb, boolean z, Handler handler, C0091b c0091b) {
        boolean z2 = true;
        super(ads);
        if (ahr.f1511a < 16) {
            z2 = false;
        }
        ahb.m1516b(z2);
        this.f537c = (adk) ahb.m1512a((Object) adk);
        this.f538d = aeb;
        this.f539e = z;
        this.f536b = handler;
        this.f544j = c0091b;
        this.f545k = adl.m693B();
        this.f535a = new ada();
        this.f540f = new adr(0);
        this.f541g = new adp();
        this.f542h = new ArrayList();
        this.f543i = new BufferInfo();
        this.f526B = 0;
        this.f527C = 0;
    }

    /* renamed from: a */
    protected final boolean mo78a(ado ado) throws C0100b {
        return mo88a(this.f537c, ado);
    }

    /* renamed from: a */
    protected adc mo84a(adk adk, String str, boolean z) throws C0100b {
        return adk.mo93a(str, z);
    }

    /* renamed from: m */
    protected final void m732m() throws ade {
        if (mo101n()) {
            boolean z;
            MediaCrypto mediaCrypto;
            adc a;
            String str = this.f546l.f621b;
            if (this.f547m == null) {
                z = false;
                mediaCrypto = null;
            } else if (this.f538d == null) {
                throw new ade("Media requires a DrmSessionManager");
            } else {
                if (!this.f560z) {
                    this.f538d.m928a(this.f547m);
                    this.f560z = true;
                }
                int b = this.f538d.m930b();
                if (b == 0) {
                    throw new ade(this.f538d.m932d());
                } else if (b == 3 || b == 4) {
                    MediaCrypto c = this.f538d.m931c();
                    z = this.f538d.m929a(str);
                    mediaCrypto = c;
                } else {
                    return;
                }
            }
            try {
                a = mo84a(this.f537c, str, z);
            } catch (Throwable e) {
                m696a(new C0097a(this.f546l, e, z, -49998));
                a = null;
            }
            if (a == null) {
                m696a(new C0097a(this.f546l, null, z, -49999));
            }
            String str2 = a.f474a;
            this.f549o = a.f475b;
            this.f550p = adl.m701a(str2, this.f546l);
            this.f551q = adl.mo89a(str2);
            this.f552r = adl.m706b(str2);
            this.f553s = adl.m708c(str2);
            this.f554t = adl.m707b(str2, this.f546l);
            try {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                ahq.m1589a("createByCodecName(" + str2 + ")");
                this.f548n = MediaCodec.createByCodecName(str2);
                ahq.m1588a();
                ahq.m1589a("configureCodec");
                mo85a(this.f548n, a.f475b, m703b(this.f546l), mediaCrypto);
                ahq.m1588a();
                ahq.m1589a("codec.start()");
                this.f548n.start();
                ahq.m1588a();
                long elapsedRealtime2 = SystemClock.elapsedRealtime();
                m698a(str2, elapsedRealtime2, elapsedRealtime2 - elapsedRealtime);
                this.f555u = this.f548n.getInputBuffers();
                this.f556v = this.f548n.getOutputBuffers();
            } catch (Throwable e2) {
                m696a(new C0097a(this.f546l, e2, z, str2));
            }
            this.f557w = m593t() == 3 ? SystemClock.elapsedRealtime() : -1;
            this.f558x = -1;
            this.f559y = -1;
            this.f534J = true;
            ada ada = this.f535a;
            ada.f459a++;
        }
    }

    /* renamed from: a */
    private void m696a(C0097a c0097a) throws ade {
        m704b(c0097a);
        throw new ade((Throwable) c0097a);
    }

    /* renamed from: n */
    protected boolean mo101n() {
        return this.f548n == null && this.f546l != null;
    }

    /* renamed from: o */
    protected final boolean m734o() {
        return this.f548n != null;
    }

    /* renamed from: j */
    protected void mo75j() throws ade {
        this.f546l = null;
        this.f547m = null;
        try {
            m735p();
            try {
                if (this.f560z) {
                    this.f538d.m927a();
                    this.f560z = false;
                }
                super.mo75j();
            } catch (Throwable th) {
                super.mo75j();
            }
        } catch (Throwable th2) {
            super.mo75j();
        }
    }

    /* renamed from: p */
    protected void m735p() {
        if (this.f548n != null) {
            this.f557w = -1;
            this.f558x = -1;
            this.f559y = -1;
            this.f533I = false;
            this.f542h.clear();
            this.f555u = null;
            this.f556v = null;
            this.f525A = false;
            this.f528D = false;
            this.f549o = false;
            this.f550p = false;
            this.f551q = false;
            this.f552r = false;
            this.f553s = false;
            this.f554t = false;
            this.f529E = false;
            this.f526B = 0;
            this.f527C = 0;
            ada ada = this.f535a;
            ada.f460b++;
            try {
                this.f548n.stop();
                try {
                    this.f548n.release();
                } finally {
                    this.f548n = null;
                }
            } catch (Throwable th) {
                this.f548n.release();
            } finally {
                this.f548n = null;
            }
        }
    }

    /* renamed from: c */
    protected void mo79c(long j) throws ade {
        this.f530F = 0;
        this.f531G = false;
        this.f532H = false;
        if (this.f548n != null) {
            mo92l();
        }
    }

    /* renamed from: h */
    protected void mo81h() {
    }

    /* renamed from: i */
    protected void mo82i() {
    }

    /* renamed from: a */
    protected void mo77a(long j, long j2, boolean z) throws ade {
        int i = z ? this.f530F == 0 ? 1 : this.f530F : 0;
        this.f530F = i;
        if (this.f546l == null) {
            m709h(j);
        }
        m732m();
        if (this.f548n != null) {
            ahq.m1589a("drainAndFeed");
            do {
            } while (m705b(j, j2));
            if (m699a(j, true)) {
                do {
                } while (m699a(j, false));
            }
            ahq.m1588a();
        }
        this.f535a.m569a();
    }

    /* renamed from: h */
    private void m709h(long j) throws ade {
        if (m677a(j, this.f541g, null) == -4) {
            mo99a(this.f541g);
        }
    }

    /* renamed from: l */
    private void mo92l() throws ade {
        this.f557w = -1;
        this.f558x = -1;
        this.f559y = -1;
        this.f534J = true;
        this.f533I = false;
        this.f542h.clear();
        if (this.f551q || (this.f553s && this.f529E)) {
            m735p();
            m732m();
        } else if (this.f527C != 0) {
            m735p();
            m732m();
        } else {
            this.f548n.flush();
            this.f528D = false;
        }
        if (this.f525A && this.f546l != null) {
            this.f526B = 1;
        }
    }

    /* renamed from: a */
    private boolean m699a(long j, boolean z) throws ade {
        if (this.f531G || this.f527C == 2) {
            return false;
        }
        if (this.f558x < 0) {
            this.f558x = this.f548n.dequeueInputBuffer(0);
            if (this.f558x < 0) {
                return false;
            }
            this.f540f.f644b = this.f555u[this.f558x];
            this.f540f.m830d();
        }
        if (this.f527C == 1) {
            if (!this.f552r) {
                this.f529E = true;
                this.f548n.queueInputBuffer(this.f558x, 0, 0, 0, 4);
                this.f558x = -1;
            }
            this.f527C = 2;
            return false;
        }
        int i;
        int i2;
        if (this.f533I) {
            i = -3;
        } else {
            if (this.f526B == 1) {
                for (i2 = 0; i2 < this.f546l.f625f.size(); i2++) {
                    this.f540f.f644b.put((byte[]) this.f546l.f625f.get(i2));
                }
                this.f526B = 2;
            }
            i = m677a(j, this.f541g, this.f540f);
            if (z && this.f530F == 1 && i == -2) {
                this.f530F = 2;
            }
        }
        if (i == -2) {
            return false;
        }
        if (i == -4) {
            if (this.f526B == 2) {
                this.f540f.m830d();
                this.f526B = 1;
            }
            mo99a(this.f541g);
            return true;
        } else if (i == -1) {
            if (this.f526B == 2) {
                this.f540f.m830d();
                this.f526B = 1;
            }
            this.f531G = true;
            if (this.f528D) {
                try {
                    if (this.f552r) {
                        return false;
                    }
                    this.f529E = true;
                    this.f548n.queueInputBuffer(this.f558x, 0, 0, 0, 4);
                    this.f558x = -1;
                    return false;
                } catch (Throwable e) {
                    m697a((CryptoException) e);
                    throw new ade(e);
                }
            }
            m692A();
            return false;
        } else {
            if (this.f534J) {
                if (this.f540f.m829c()) {
                    this.f534J = false;
                } else {
                    this.f540f.m830d();
                    if (this.f526B == 2) {
                        this.f526B = 1;
                    }
                    return true;
                }
            }
            boolean a = this.f540f.m827a();
            this.f533I = m702a(a);
            if (this.f533I) {
                return false;
            }
            if (this.f550p && !a) {
                ahi.m1540a(this.f540f.f644b);
                if (this.f540f.f644b.position() == 0) {
                    return true;
                }
                this.f550p = false;
            }
            try {
                int position = this.f540f.f644b.position();
                i2 = position - this.f540f.f645c;
                long j2 = this.f540f.f647e;
                if (this.f540f.m828b()) {
                    this.f542h.add(Long.valueOf(j2));
                }
                if (a) {
                    this.f548n.queueSecureInputBuffer(this.f558x, 0, adl.m695a(this.f540f, i2), j2, 0);
                } else {
                    this.f548n.queueInputBuffer(this.f558x, 0, position, j2, 0);
                }
                this.f558x = -1;
                this.f528D = true;
                this.f526B = 0;
                mo80d(j2);
                return true;
            } catch (Throwable e2) {
                m697a((CryptoException) e2);
                throw new ade(e2);
            }
        }
    }

    /* renamed from: a */
    private static CryptoInfo m695a(adr adr, int i) {
        CryptoInfo a = adr.f643a.m572a();
        if (i != 0) {
            if (a.numBytesOfClearData == null) {
                a.numBytesOfClearData = new int[1];
            }
            int[] iArr = a.numBytesOfClearData;
            iArr[0] = iArr[0] + i;
        }
        return a;
    }

    /* renamed from: b */
    private MediaFormat m703b(ado ado) {
        MediaFormat b = ado.m824b();
        if (this.f545k) {
            b.setInteger("auto-frc", 0);
        }
        return b;
    }

    /* renamed from: a */
    private boolean m702a(boolean z) throws ade {
        if (!this.f560z) {
            return false;
        }
        int b = this.f538d.m930b();
        if (b == 0) {
            throw new ade(this.f538d.m932d());
        } else if (b == 4) {
            return false;
        } else {
            if (z || !this.f539e) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: a */
    protected void mo99a(adp adp) throws ade {
        ado ado = this.f546l;
        this.f546l = adp.f641a;
        this.f547m = adp.f642b;
        if (this.f548n != null && mo100a(this.f548n, this.f549o, ado, this.f546l)) {
            this.f525A = true;
            this.f526B = 1;
        } else if (this.f528D) {
            this.f527C = 1;
        } else {
            m735p();
            m732m();
        }
    }

    /* renamed from: a */
    protected void mo86a(MediaFormat mediaFormat) throws ade {
    }

    /* renamed from: k */
    protected void mo91k() {
    }

    /* renamed from: d */
    protected void mo80d(long j) {
    }

    /* renamed from: e */
    protected void m727e(long j) {
    }

    /* renamed from: a */
    protected boolean mo100a(MediaCodec mediaCodec, boolean z, ado ado, ado ado2) {
        return false;
    }

    /* renamed from: b */
    protected boolean mo54b() {
        return this.f532H;
    }

    /* renamed from: c */
    protected boolean mo55c() {
        return (this.f546l == null || this.f533I || (this.f530F == 0 && this.f559y < 0 && !m712y())) ? false : true;
    }

    /* renamed from: q */
    protected final int m736q() {
        return this.f530F;
    }

    /* renamed from: y */
    private boolean m712y() {
        return SystemClock.elapsedRealtime() < this.f557w + 1000;
    }

    /* renamed from: r */
    protected long m737r() {
        return 0;
    }

    /* renamed from: b */
    private boolean m705b(long j, long j2) throws ade {
        if (this.f532H) {
            return false;
        }
        if (this.f559y < 0) {
            this.f559y = this.f548n.dequeueOutputBuffer(this.f543i, m737r());
        }
        if (this.f559y == -2) {
            m713z();
            return true;
        } else if (this.f559y == -3) {
            this.f556v = this.f548n.getOutputBuffers();
            ada ada = this.f535a;
            ada.f462d++;
            return true;
        } else if (this.f559y < 0) {
            if (!this.f552r || (!this.f531G && this.f527C != 2)) {
                return false;
            }
            m692A();
            return true;
        } else if ((this.f543i.flags & 4) != 0) {
            m692A();
            return false;
        } else {
            int i = m710i(this.f543i.presentationTimeUs);
            if (!mo87a(j, j2, this.f548n, this.f556v[this.f559y], this.f543i, this.f559y, i != -1)) {
                return false;
            }
            m727e(this.f543i.presentationTimeUs);
            if (i != -1) {
                this.f542h.remove(i);
            }
            this.f559y = -1;
            return true;
        }
    }

    /* renamed from: z */
    private void m713z() throws ade {
        MediaFormat outputFormat = this.f548n.getOutputFormat();
        if (this.f554t) {
            outputFormat.setInteger("channel-count", 1);
        }
        mo86a(outputFormat);
        ada ada = this.f535a;
        ada.f461c++;
    }

    /* renamed from: A */
    private void m692A() throws ade {
        if (this.f527C == 2) {
            m735p();
            m732m();
            return;
        }
        this.f532H = true;
        mo91k();
    }

    /* renamed from: b */
    private void m704b(final C0097a c0097a) {
        if (this.f536b != null && this.f544j != null) {
            this.f536b.post(new Runnable(this) {
                /* renamed from: b */
                final /* synthetic */ adl f572b;

                public void run() {
                    this.f572b.f544j.m669a(c0097a);
                }
            });
        }
    }

    /* renamed from: a */
    private void m697a(final CryptoException cryptoException) {
        if (this.f536b != null && this.f544j != null) {
            this.f536b.post(new Runnable(this) {
                /* renamed from: b */
                final /* synthetic */ adl f574b;

                public void run() {
                    this.f574b.f544j.m670a(cryptoException);
                }
            });
        }
    }

    /* renamed from: a */
    private void m698a(String str, long j, long j2) {
        if (this.f536b != null && this.f544j != null) {
            final String str2 = str;
            final long j3 = j;
            final long j4 = j2;
            this.f536b.post(new Runnable(this) {
                /* renamed from: d */
                final /* synthetic */ adl f578d;

                public void run() {
                    this.f578d.f544j.m671a(str2, j3, j4);
                }
            });
        }
    }

    /* renamed from: i */
    private int m710i(long j) {
        int size = this.f542h.size();
        for (int i = 0; i < size; i++) {
            if (((Long) this.f542h.get(i)).longValue() == j) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: a */
    private static boolean mo89a(String str) {
        return ahr.f1511a < 18 || ((ahr.f1511a == 18 && ("OMX.SEC.avc.dec".equals(str) || "OMX.SEC.avc.dec.secure".equals(str))) || (ahr.f1511a == 19 && ahr.f1514d.startsWith("SM-G800") && ("OMX.Exynos.avc.dec".equals(str) || "OMX.Exynos.avc.dec.secure".equals(str))));
    }

    /* renamed from: a */
    private static boolean m701a(String str, ado ado) {
        return ahr.f1511a < 21 && ado.f625f.isEmpty() && "OMX.MTK.VIDEO.DECODER.AVC".equals(str);
    }

    /* renamed from: b */
    private static boolean m706b(String str) {
        return ahr.f1511a <= 17 && "OMX.rk.video_decoder.avc".equals(str);
    }

    /* renamed from: c */
    private static boolean m708c(String str) {
        return ahr.f1511a <= 23 && "OMX.google.vorbis.decoder".equals(str);
    }

    /* renamed from: b */
    private static boolean m707b(String str, ado ado) {
        return ahr.f1511a <= 18 && ado.f633n == 1 && "OMX.MTK.AUDIO.DECODER.MP3".equals(str);
    }

    /* renamed from: B */
    private static boolean m693B() {
        return ahr.f1511a <= 22 && "foster".equals(ahr.f1512b) && "NVIDIA".equals(ahr.f1513c);
    }
}
