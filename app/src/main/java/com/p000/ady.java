package com.p000;

import android.annotation.TargetApi;
import android.media.AudioTimestamp;
import android.media.AudioTrack;
import android.media.MediaFormat;
import android.media.PlaybackParams;
import android.os.ConditionVariable;
import android.os.SystemClock;
import android.util.Log;
import com.taplytics.sdk.Taplytics;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;

@TargetApi(16)
/* compiled from: AudioTrack */
/* renamed from: ady */
public final class ady {
    /* renamed from: a */
    public static boolean f693a = false;
    /* renamed from: b */
    public static boolean f694b = false;
    /* renamed from: A */
    private int f695A;
    /* renamed from: B */
    private long f696B;
    /* renamed from: C */
    private long f697C;
    /* renamed from: D */
    private long f698D;
    /* renamed from: E */
    private float f699E;
    /* renamed from: F */
    private byte[] f700F;
    /* renamed from: G */
    private int f701G;
    /* renamed from: H */
    private int f702H;
    /* renamed from: c */
    private final adx f703c;
    /* renamed from: d */
    private final int f704d;
    /* renamed from: e */
    private final ConditionVariable f705e;
    /* renamed from: f */
    private final long[] f706f;
    /* renamed from: g */
    private final C0112a f707g;
    /* renamed from: h */
    private AudioTrack f708h;
    /* renamed from: i */
    private AudioTrack f709i;
    /* renamed from: j */
    private int f710j;
    /* renamed from: k */
    private int f711k;
    /* renamed from: l */
    private int f712l;
    /* renamed from: m */
    private boolean f713m;
    /* renamed from: n */
    private int f714n;
    /* renamed from: o */
    private int f715o;
    /* renamed from: p */
    private long f716p;
    /* renamed from: q */
    private int f717q;
    /* renamed from: r */
    private int f718r;
    /* renamed from: s */
    private long f719s;
    /* renamed from: t */
    private long f720t;
    /* renamed from: u */
    private boolean f721u;
    /* renamed from: v */
    private long f722v;
    /* renamed from: w */
    private Method f723w;
    /* renamed from: x */
    private long f724x;
    /* renamed from: y */
    private long f725y;
    /* renamed from: z */
    private int f726z;

    /* compiled from: AudioTrack */
    /* renamed from: ady$a */
    static class C0112a {
        /* renamed from: a */
        protected AudioTrack f676a;
        /* renamed from: b */
        private boolean f677b;
        /* renamed from: c */
        private int f678c;
        /* renamed from: d */
        private long f679d;
        /* renamed from: e */
        private long f680e;
        /* renamed from: f */
        private long f681f;
        /* renamed from: g */
        private long f682g;
        /* renamed from: h */
        private long f683h;
        /* renamed from: i */
        private long f684i;

        private C0112a() {
        }

        /* renamed from: a */
        public void mo102a(AudioTrack audioTrack, boolean z) {
            this.f676a = audioTrack;
            this.f677b = z;
            this.f682g = -1;
            this.f679d = 0;
            this.f680e = 0;
            this.f681f = 0;
            if (audioTrack != null) {
                this.f678c = audioTrack.getSampleRate();
            }
        }

        /* renamed from: a */
        public void m866a(long j) {
            this.f683h = m869b();
            this.f682g = SystemClock.elapsedRealtime() * 1000;
            this.f684i = j;
            this.f676a.stop();
        }

        /* renamed from: a */
        public void m865a() {
            if (this.f682g == -1) {
                this.f676a.pause();
            }
        }

        /* renamed from: b */
        public long m869b() {
            if (this.f682g != -1) {
                return Math.min(this.f684i, ((((SystemClock.elapsedRealtime() * 1000) - this.f682g) * ((long) this.f678c)) / 1000000) + this.f683h);
            }
            int playState = this.f676a.getPlayState();
            if (playState == 1) {
                return 0;
            }
            long playbackHeadPosition = 4294967295L & ((long) this.f676a.getPlaybackHeadPosition());
            if (this.f677b) {
                if (playState == 2 && playbackHeadPosition == 0) {
                    this.f681f = this.f679d;
                }
                playbackHeadPosition += this.f681f;
            }
            if (this.f679d > playbackHeadPosition) {
                this.f680e++;
            }
            this.f679d = playbackHeadPosition;
            return playbackHeadPosition + (this.f680e << 32);
        }

        /* renamed from: c */
        public long m870c() {
            return (m869b() * 1000000) / ((long) this.f678c);
        }

        /* renamed from: d */
        public boolean mo103d() {
            return false;
        }

        /* renamed from: e */
        public long mo104e() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: f */
        public long mo105f() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: a */
        public void mo106a(PlaybackParams playbackParams) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: g */
        public float mo107g() {
            return 1.0f;
        }
    }

    @TargetApi(19)
    /* compiled from: AudioTrack */
    /* renamed from: ady$b */
    static class C0113b extends C0112a {
        /* renamed from: b */
        private final AudioTimestamp f685b = new AudioTimestamp();
        /* renamed from: c */
        private long f686c;
        /* renamed from: d */
        private long f687d;
        /* renamed from: e */
        private long f688e;

        public C0113b() {
            super();
        }

        /* renamed from: a */
        public void mo102a(AudioTrack audioTrack, boolean z) {
            super.mo102a(audioTrack, z);
            this.f686c = 0;
            this.f687d = 0;
            this.f688e = 0;
        }

        /* renamed from: d */
        public boolean mo103d() {
            boolean timestamp = this.a.getTimestamp(this.f685b);
            if (timestamp) {
                long j = this.f685b.framePosition;
                if (this.f687d > j) {
                    this.f686c++;
                }
                this.f687d = j;
                this.f688e = j + (this.f686c << 32);
            }
            return timestamp;
        }

        /* renamed from: e */
        public long mo104e() {
            return this.f685b.nanoTime;
        }

        /* renamed from: f */
        public long mo105f() {
            return this.f688e;
        }
    }

    @TargetApi(23)
    /* compiled from: AudioTrack */
    /* renamed from: ady$c */
    static class C0114c extends C0113b {
        /* renamed from: b */
        private PlaybackParams f689b;
        /* renamed from: c */
        private float f690c = 1.0f;

        /* renamed from: a */
        public void mo102a(AudioTrack audioTrack, boolean z) {
            super.mo102a(audioTrack, z);
            m879h();
        }

        /* renamed from: a */
        public void mo106a(PlaybackParams playbackParams) {
            if (playbackParams == null) {
                playbackParams = new PlaybackParams();
            }
            PlaybackParams allowDefaults = playbackParams.allowDefaults();
            this.f689b = allowDefaults;
            this.f690c = allowDefaults.getSpeed();
            m879h();
        }

        /* renamed from: g */
        public float mo107g() {
            return this.f690c;
        }

        /* renamed from: h */
        private void m879h() {
            if (this.a != null && this.f689b != null) {
                this.a.setPlaybackParams(this.f689b);
            }
        }
    }

    /* compiled from: AudioTrack */
    /* renamed from: ady$d */
    public static final class C0115d extends Exception {
        /* renamed from: a */
        public final int f691a;

        public C0115d(int i, int i2, int i3, int i4) {
            super("AudioTrack init failed: " + i + ", Config(" + i2 + ", " + i3 + ", " + i4 + ")");
            this.f691a = i;
        }
    }

    /* compiled from: AudioTrack */
    /* renamed from: ady$e */
    public static final class C0116e extends RuntimeException {
        public C0116e(String str) {
            super(str);
        }
    }

    /* compiled from: AudioTrack */
    /* renamed from: ady$f */
    public static final class C0117f extends Exception {
        /* renamed from: a */
        public final int f692a;

        public C0117f(int i) {
            super("AudioTrack write failed: " + i);
            this.f692a = i;
        }
    }

    public ady() {
        this(null, 3);
    }

    public ady(adx adx, int i) {
        this.f703c = adx;
        this.f704d = i;
        this.f705e = new ConditionVariable(true);
        if (ahr.f1511a >= 18) {
            try {
                this.f723w = AudioTrack.class.getMethod("getLatency", (Class[]) null);
            } catch (NoSuchMethodException e) {
            }
        }
        if (ahr.f1511a >= 23) {
            this.f707g = new C0114c();
        } else if (ahr.f1511a >= 19) {
            this.f707g = new C0113b();
        } else {
            this.f707g = new C0112a();
        }
        this.f706f = new long[10];
        this.f699E = 1.0f;
        this.f695A = 0;
    }

    /* renamed from: a */
    public boolean m909a(String str) {
        return this.f703c != null && this.f703c.m864a(ady.m888b(str));
    }

    /* renamed from: a */
    public boolean m908a() {
        return this.f709i != null;
    }

    /* renamed from: a */
    public long m903a(boolean z) {
        if (!m894n()) {
            return Long.MIN_VALUE;
        }
        if (this.f709i.getPlayState() == 3) {
            m895o();
        }
        long nanoTime = System.nanoTime() / 1000;
        if (this.f721u) {
            return m889b(m891c((long) (((float) (nanoTime - (this.f707g.mo104e() / 1000))) * this.f707g.mo107g())) + this.f707g.mo105f()) + this.f696B;
        }
        if (this.f718r == 0) {
            nanoTime = this.f707g.m870c() + this.f696B;
        } else {
            nanoTime = (nanoTime + this.f719s) + this.f696B;
        }
        if (z) {
            return nanoTime;
        }
        return nanoTime - this.f698D;
    }

    /* renamed from: a */
    public void m905a(MediaFormat mediaFormat, boolean z) {
        m906a(mediaFormat, z, 0);
    }

    /* renamed from: a */
    public void m906a(MediaFormat mediaFormat, boolean z, int i) {
        int i2;
        int integer = mediaFormat.getInteger("channel-count");
        switch (integer) {
            case 1:
                i2 = 4;
                break;
            case 2:
                i2 = 12;
                break;
            case 3:
                i2 = 28;
                break;
            case 4:
                i2 = 204;
                break;
            case 5:
                i2 = 220;
                break;
            case 6:
                i2 = 252;
                break;
            case 7:
                i2 = 1276;
                break;
            case 8:
                i2 = acz.f427a;
                break;
            default:
                throw new IllegalArgumentException("Unsupported channel count: " + integer);
        }
        int integer2 = mediaFormat.getInteger("sample-rate");
        int b = z ? ady.m888b(mediaFormat.getString("mime")) : 2;
        if (!m908a() || this.f710j != integer2 || this.f711k != i2 || this.f712l != b) {
            long j;
            m918j();
            this.f712l = b;
            this.f713m = z;
            this.f710j = integer2;
            this.f711k = i2;
            this.f714n = integer * 2;
            if (i != 0) {
                this.f715o = i;
            } else if (!z) {
                b = AudioTrack.getMinBufferSize(integer2, i2, b);
                ahb.m1516b(b != -2);
                integer = b * 4;
                i2 = ((int) m891c(250000)) * this.f714n;
                b = (int) Math.max((long) b, m891c(750000) * ((long) this.f714n));
                if (integer >= i2) {
                    i2 = integer > b ? b : integer;
                }
                this.f715o = i2;
            } else if (b == 5 || b == 6) {
                this.f715o = 20480;
            } else {
                this.f715o = 49152;
            }
            if (z) {
                j = -1;
            } else {
                j = m889b(m885a((long) this.f715o));
            }
            this.f716p = j;
        }
    }

    /* renamed from: b */
    public int m910b() throws C0115d {
        return m901a(0);
    }

    /* renamed from: a */
    public int m901a(int i) throws C0115d {
        this.f705e.block();
        if (i == 0) {
            this.f709i = new AudioTrack(this.f704d, this.f710j, this.f711k, this.f712l, this.f715o, 1);
        } else {
            this.f709i = new AudioTrack(this.f704d, this.f710j, this.f711k, this.f712l, this.f715o, 1, i);
        }
        m896p();
        int audioSessionId = this.f709i.getAudioSessionId();
        if (f693a && ahr.f1511a < 21) {
            if (!(this.f708h == null || audioSessionId == this.f708h.getAudioSessionId())) {
                m893m();
            }
            if (this.f708h == null) {
                this.f708h = new AudioTrack(this.f704d, Taplytics.TAPLYTICS_DEFAULT_TIMEOUT, 4, 2, 2, 0, audioSessionId);
            }
        }
        this.f707g.mo102a(this.f709i, m899s());
        m892l();
        return audioSessionId;
    }

    /* renamed from: c */
    public int m911c() {
        return this.f715o;
    }

    /* renamed from: d */
    public long m912d() {
        return this.f716p;
    }

    /* renamed from: e */
    public void m913e() {
        if (m908a()) {
            this.f697C = System.nanoTime() / 1000;
            this.f709i.play();
        }
    }

    /* renamed from: f */
    public void m914f() {
        if (this.f695A == 1) {
            this.f695A = 2;
        }
    }

    /* renamed from: a */
    public int m902a(ByteBuffer byteBuffer, int i, int i2, long j) throws C0117f {
        if (i2 == 0) {
            return 2;
        }
        int i3;
        if (m899s()) {
            if (this.f709i.getPlayState() == 2) {
                return 0;
            }
            if (this.f709i.getPlayState() == 1 && this.f707g.m869b() != 0) {
                return 0;
            }
        }
        if (this.f702H == 0) {
            this.f702H = i2;
            byteBuffer.position(i);
            if (this.f713m && this.f726z == 0) {
                this.f726z = ady.m883a(this.f712l, byteBuffer);
            }
            long b = j - m889b(this.f713m ? (long) this.f726z : m885a((long) i2));
            if (this.f695A == 0) {
                this.f696B = Math.max(0, b);
                this.f695A = 1;
                i3 = 0;
            } else {
                long b2 = this.f696B + m889b(m897q());
                if (this.f695A == 1 && Math.abs(b2 - b) > 200000) {
                    Log.e("AudioTrack", "Discontinuity detected [expected " + b2 + ", got " + b + "]");
                    this.f695A = 2;
                }
                if (this.f695A == 2) {
                    this.f696B = (b - b2) + this.f696B;
                    this.f695A = 1;
                    i3 = 1;
                } else {
                    i3 = 0;
                }
            }
            if (ahr.f1511a < 21) {
                if (this.f700F == null || this.f700F.length < i2) {
                    this.f700F = new byte[i2];
                }
                byteBuffer.get(this.f700F, 0, i2);
                this.f701G = 0;
            }
        } else {
            i3 = 0;
        }
        int i4 = 0;
        if (ahr.f1511a < 21) {
            int b3 = this.f715o - ((int) (this.f724x - (this.f707g.m869b() * ((long) this.f714n))));
            if (b3 > 0) {
                i4 = this.f709i.write(this.f700F, this.f701G, Math.min(this.f702H, b3));
                if (i4 >= 0) {
                    this.f701G += i4;
                }
            }
        } else {
            i4 = ady.m884a(this.f709i, byteBuffer, this.f702H);
        }
        if (i4 < 0) {
            throw new C0117f(i4);
        }
        this.f702H -= i4;
        if (!this.f713m) {
            this.f724x += (long) i4;
        }
        if (this.f702H != 0) {
            return i3;
        }
        if (this.f713m) {
            this.f725y += (long) this.f726z;
        }
        return i3 | 2;
    }

    /* renamed from: g */
    public void m915g() {
        if (m908a()) {
            this.f707g.m866a(m897q());
        }
    }

    @TargetApi(21)
    /* renamed from: a */
    private static int m884a(AudioTrack audioTrack, ByteBuffer byteBuffer, int i) {
        return audioTrack.write(byteBuffer, i, 1);
    }

    /* renamed from: h */
    public boolean m916h() {
        return m908a() && (m897q() > this.f707g.m869b() || m900t());
    }

    /* renamed from: a */
    public void m907a(PlaybackParams playbackParams) {
        this.f707g.mo106a(playbackParams);
    }

    /* renamed from: a */
    public void m904a(float f) {
        if (this.f699E != f) {
            this.f699E = f;
            m892l();
        }
    }

    /* renamed from: l */
    private void m892l() {
        if (!m908a()) {
            return;
        }
        if (ahr.f1511a >= 21) {
            ady.m887a(this.f709i, this.f699E);
        } else {
            ady.m890b(this.f709i, this.f699E);
        }
    }

    @TargetApi(21)
    /* renamed from: a */
    private static void m887a(AudioTrack audioTrack, float f) {
        audioTrack.setVolume(f);
    }

    /* renamed from: b */
    private static void m890b(AudioTrack audioTrack, float f) {
        audioTrack.setStereoVolume(f, f);
    }

    /* renamed from: i */
    public void m917i() {
        if (m908a()) {
            m898r();
            this.f707g.m865a();
        }
    }

    /* renamed from: j */
    public void m918j() {
        if (m908a()) {
            this.f724x = 0;
            this.f725y = 0;
            this.f726z = 0;
            this.f702H = 0;
            this.f695A = 0;
            this.f698D = 0;
            m898r();
            if (this.f709i.getPlayState() == 3) {
                this.f709i.pause();
            }
            final AudioTrack audioTrack = this.f709i;
            this.f709i = null;
            this.f707g.mo102a(null, false);
            this.f705e.close();
            new Thread(this) {
                /* renamed from: b */
                final /* synthetic */ ady f673b;

                public void run() {
                    try {
                        audioTrack.flush();
                        audioTrack.release();
                    } finally {
                        this.f673b.f705e.open();
                    }
                }
            }.start();
        }
    }

    /* renamed from: k */
    public void m919k() {
        m918j();
        m893m();
    }

    /* renamed from: m */
    private void m893m() {
        if (this.f708h != null) {
            final AudioTrack audioTrack = this.f708h;
            this.f708h = null;
            new Thread(this) {
                /* renamed from: b */
                final /* synthetic */ ady f675b;

                public void run() {
                    audioTrack.release();
                }
            }.start();
        }
    }

    /* renamed from: n */
    private boolean m894n() {
        return m908a() && this.f695A != 0;
    }

    /* renamed from: o */
    private void m895o() {
        long c = this.f707g.m870c();
        if (c != 0) {
            long nanoTime = System.nanoTime() / 1000;
            if (nanoTime - this.f720t >= 30000) {
                this.f706f[this.f717q] = c - nanoTime;
                this.f717q = (this.f717q + 1) % 10;
                if (this.f718r < 10) {
                    this.f718r++;
                }
                this.f720t = nanoTime;
                this.f719s = 0;
                for (int i = 0; i < this.f718r; i++) {
                    this.f719s += this.f706f[i] / ((long) this.f718r);
                }
            }
            if (!m899s() && nanoTime - this.f722v >= 500000) {
                this.f721u = this.f707g.mo103d();
                if (this.f721u) {
                    long e = this.f707g.mo104e() / 1000;
                    long f = this.f707g.mo105f();
                    if (e < this.f697C) {
                        this.f721u = false;
                    } else if (Math.abs(e - nanoTime) > 5000000) {
                        r0 = "Spurious audio timestamp (system clock mismatch): " + f + ", " + e + ", " + nanoTime + ", " + c;
                        if (f694b) {
                            throw new C0116e(r0);
                        }
                        Log.w("AudioTrack", r0);
                        this.f721u = false;
                    } else if (Math.abs(m889b(f) - c) > 5000000) {
                        r0 = "Spurious audio timestamp (frame position mismatch): " + f + ", " + e + ", " + nanoTime + ", " + c;
                        if (f694b) {
                            throw new C0116e(r0);
                        }
                        Log.w("AudioTrack", r0);
                        this.f721u = false;
                    }
                }
                if (!(this.f723w == null || this.f713m)) {
                    try {
                        this.f698D = (((long) ((Integer) this.f723w.invoke(this.f709i, (Object[]) null)).intValue()) * 1000) - this.f716p;
                        this.f698D = Math.max(this.f698D, 0);
                        if (this.f698D > 5000000) {
                            Log.w("AudioTrack", "Ignoring impossibly large audio latency: " + this.f698D);
                            this.f698D = 0;
                        }
                    } catch (Exception e2) {
                        this.f723w = null;
                    }
                }
                this.f722v = nanoTime;
            }
        }
    }

    /* renamed from: p */
    private void m896p() throws C0115d {
        int state = this.f709i.getState();
        if (state != 1) {
            try {
                this.f709i.release();
            } catch (Exception e) {
            } finally {
                this.f709i = null;
            }
            throw new C0115d(state, this.f710j, this.f711k, this.f715o);
        }
    }

    /* renamed from: a */
    private long m885a(long j) {
        return j / ((long) this.f714n);
    }

    /* renamed from: b */
    private long m889b(long j) {
        return (1000000 * j) / ((long) this.f710j);
    }

    /* renamed from: c */
    private long m891c(long j) {
        return (((long) this.f710j) * j) / 1000000;
    }

    /* renamed from: q */
    private long m897q() {
        return this.f713m ? this.f725y : m885a(this.f724x);
    }

    /* renamed from: r */
    private void m898r() {
        this.f719s = 0;
        this.f718r = 0;
        this.f717q = 0;
        this.f720t = 0;
        this.f721u = false;
        this.f722v = 0;
    }

    /* renamed from: s */
    private boolean m899s() {
        return ahr.f1511a < 23 && (this.f712l == 5 || this.f712l == 6);
    }

    /* renamed from: t */
    private boolean m900t() {
        return m899s() && this.f709i.getPlayState() == 2 && this.f709i.getPlaybackHeadPosition() == 0;
    }

    /* renamed from: b */
    private static int m888b(String str) {
        int i = -1;
        switch (str.hashCode()) {
            case -1095064472:
                if (str.equals("audio/vnd.dts")) {
                    i = 2;
                    break;
                }
                break;
            case 187078296:
                if (str.equals("audio/ac3")) {
                    i = 0;
                    break;
                }
                break;
            case 1504578661:
                if (str.equals("audio/eac3")) {
                    i = 1;
                    break;
                }
                break;
            case 1505942594:
                if (str.equals("audio/vnd.dts.hd")) {
                    i = 3;
                    break;
                }
                break;
        }
        switch (i) {
            case 0:
                return 5;
            case 1:
                return 6;
            case 2:
                return 7;
            case 3:
                return 8;
            default:
                return 0;
        }
    }

    /* renamed from: a */
    private static int m883a(int i, ByteBuffer byteBuffer) {
        if (i == 7 || i == 8) {
            return ahe.m1524a(byteBuffer);
        }
        if (i == 5) {
            return aha.m1502a();
        }
        if (i == 6) {
            return aha.m1504a(byteBuffer);
        }
        throw new IllegalStateException("Unexpected audio encoding: " + i);
    }
}
