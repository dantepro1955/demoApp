package com.p000;

import com.nuance.nmsp.client.sdk.oem.AudioSystemOEM;
import java.io.ByteArrayOutputStream;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Vector;
import p000.rh.C5011a;
import p000.rh.C5012c;
import p000.rh.C5013m;
import p000.rh.C5716b;
import p000.rh.C5718i;
import p000.rh.C5719k;
import p000.rl.C4177b;
import p000.rl.C5721a;

/* renamed from: dnr */
public class dnr implements dnk, dze, C5011a, C5012c, C5013m, C4177b {
    /* renamed from: a */
    private static final rk f22333a = dnn.m28258a(dnr.class);
    /* renamed from: b */
    private rg f22334b;
    /* renamed from: c */
    private rh f22335c;
    /* renamed from: d */
    private sj f22336d;
    /* renamed from: e */
    private ByteArrayOutputStream f22337e;
    /* renamed from: f */
    private Vector f22338f;
    /* renamed from: g */
    private boolean f22339g;
    /* renamed from: h */
    private LinkedList<byte[]> f22340h;
    /* renamed from: i */
    private boolean f22341i;
    /* renamed from: j */
    private short f22342j = (short) -1;
    /* renamed from: k */
    private Vector f22343k;
    /* renamed from: l */
    private rl f22344l = null;
    /* renamed from: m */
    private Object f22345m = new Object();
    /* renamed from: n */
    private C5719k f22346n;
    /* renamed from: o */
    private sq f22347o;

    public dnr(sj sjVar, dot dot, Vector vector, rf rfVar) {
        this.f22334b = ((doz) dot).m28245f();
        this.f22336d = sjVar;
        this.f22344l = ((doz) dot).z_();
        this.f22343k = vector;
        this.f22335c = new AudioSystemOEM(this.f22344l, this.f22334b, vector);
        this.f22337e = new ByteArrayOutputStream();
        this.f22338f = new Vector();
        this.f22341i = false;
        this.f22339g = false;
        if (rfVar.equals(rf.f25313d)) {
            this.f22346n = C5719k.f25333d;
        } else if (rfVar.equals(rf.f25312c)) {
            this.f22346n = C5719k.f25332c;
        } else if (rfVar.equals(rf.f25311b)) {
            this.f22346n = C5719k.f25331b;
        } else if (rfVar.equals(rf.f25310a)) {
            this.f22346n = C5719k.f25330a;
        } else if (rfVar.equals(rf.f25314e)) {
            this.f22346n = C5719k.f25334e;
        }
        if (si.m34095b(this.f22334b)) {
            this.f22340h = new LinkedList();
        }
        st stVar = (st) dot.mo4507a();
        if (stVar != null) {
            sq b = stVar.m34138b();
            if (b != null) {
                this.f22347o = b.mo5518a("NMSPPlayer").mo5521a();
            }
        }
    }

    /* renamed from: a */
    private void m28280a(String str) {
        if (this.f22336d != null) {
            try {
                this.f22336d.mo5488a(str);
            } catch (Throwable th) {
                if (f22333a.mo4282e()) {
                    f22333a.mo4281e("Got an exp while calling NMSPAudioPlaybackListener.playerUpdate(" + str + ")[" + th.getClass().getName() + "] msg [" + th.getMessage() + "]");
                }
            }
        }
    }

    /* renamed from: b */
    private void m28281b(String str) {
        if (this.f22347o != null) {
            this.f22347o.mo5518a(str).mo5521a();
        }
    }

    /* renamed from: a */
    public final void mo4475a() {
        if (f22333a.mo4276b()) {
            f22333a.mo4275b((Object) "PlayerImpl.start()");
        }
        m28281b("PlayerStart");
        rl rlVar = this.f22344l;
        C5721a c5721a = new C5721a((byte) 1, this);
        Thread currentThread = Thread.currentThread();
        this.f22344l.mo4288a();
        rlVar.mo4285a(c5721a, this, currentThread);
    }

    /* renamed from: a */
    public final void mo3863a(Object obj, Object obj2) {
        C5721a c5721a = (C5721a) obj;
        if (f22333a.mo4276b()) {
            f22333a.mo4275b("\nXMode handleMessage - [" + c5721a.f25336a + "]");
        }
        switch (c5721a.f25336a) {
            case (byte) 1:
                if (f22333a.mo4276b()) {
                    f22333a.mo4275b((Object) "PlayerImpl.handleStartPlayback()");
                }
                if (new czx(this.f22343k).m25913a()) {
                    this.f22334b = si.m34096c(this.f22334b);
                }
                if (this.f22342j == (short) -1) {
                    this.f22342j = (short) 0;
                } else if (this.f22342j == (short) 2) {
                    this.f22342j = (short) 3;
                } else {
                    this.f22342j = (short) 5;
                    if (f22333a.mo4282e()) {
                        f22333a.mo4281e("PlayImpl.handleStartPlayback() wrong state [state != STATE_INIT]!!!");
                    }
                    m28280a("PLAYBACK_ERROR");
                    return;
                }
                if (this.f22342j != (short) 0 && this.f22342j != (short) 3) {
                    this.f22342j = (short) 5;
                    if (f22333a.mo4282e()) {
                        f22333a.mo4281e("PlayImpl.handleStartPlayback() wrong state [state != STATE_STARTING]!!!");
                    }
                    m28280a("PLAYBACK_ERROR");
                    return;
                } else if (this.f22342j != (short) 0) {
                    this.f22335c.mo3867a();
                    this.f22342j = (short) 5;
                    if (f22333a.mo4282e()) {
                        f22333a.mo4281e("PlayImpl.handleStartPlayback() audioSys.pausePlayback() return false!!!");
                    }
                    m28280a("PLAYBACK_ERROR");
                    return;
                } else if (this.f22335c.mo3869a(this.f22346n, this, this)) {
                    m28281b("StreamStart");
                    return;
                } else {
                    this.f22342j = (short) 5;
                    if (f22333a.mo4282e()) {
                        f22333a.mo4281e("PlayImpl.handleStartPlayback() audioSys.startPlayback() return false!!!");
                    }
                    m28280a("PLAYBACK_ERROR");
                    return;
                }
            case (byte) 2:
                if (f22333a.mo4276b()) {
                    f22333a.mo4275b((Object) "PlayerImpl.handleStopPlayback()");
                }
                if (this.f22342j != (short) 5 && this.f22342j != (short) 4) {
                    this.f22342j = (short) 4;
                    this.f22335c.mo3870b(this);
                    return;
                }
                return;
            case (byte) 3:
                if (f22333a.mo4276b()) {
                    f22333a.mo4275b((Object) "PlayerImpl.handlePausePlayback()");
                }
                if (this.f22342j == (short) 5 || this.f22342j == (short) 4) {
                    this.f22342j = (short) 5;
                    if (f22333a.mo4282e()) {
                        f22333a.mo4281e("PlayImpl.handlePausePlayback() wrong state [state == " + this.f22342j + "]!!!");
                    }
                    m28280a("PLAYBACK_ERROR");
                    return;
                }
                this.f22342j = (short) 2;
                this.f22335c.mo3867a();
                this.f22342j = (short) 5;
                if (f22333a.mo4282e()) {
                    f22333a.mo4281e("PlayImpl.handleStartPlayback() audioSys.pausePlayback() return false!!!");
                }
                m28280a("PLAYBACK_ERROR");
                return;
            case (byte) 4:
                if (f22333a.mo4276b()) {
                    f22333a.mo4275b((Object) "PlayerImpl.handlePrevious()");
                }
                if (this.f22342j == (short) 5 || this.f22342j == (short) 4) {
                    this.f22342j = (short) 5;
                    if (f22333a.mo4282e()) {
                        f22333a.mo4281e("PlayImpl.handlePausePlayback() wrong state [state == " + this.f22342j + "]!!!");
                    }
                    m28280a("PLAYBACK_ERROR");
                    return;
                }
                this.f22335c.mo3871b();
                this.f22342j = (short) 5;
                if (f22333a.mo4282e()) {
                    f22333a.mo4281e("PlayImpl.handleStartPlayback() audioSys.previousPlayback() return false!!!");
                }
                m28280a("PLAYBACK_ERROR");
                return;
            case (byte) 5:
                if (f22333a.mo4276b()) {
                    f22333a.mo4275b((Object) "PlayerImpl.handleNext()");
                }
                if (this.f22342j == (short) 5 || this.f22342j == (short) 4) {
                    this.f22342j = (short) 5;
                    if (f22333a.mo4282e()) {
                        f22333a.mo4281e("PlayImpl.handlePausePlayback() wrong state [state == " + this.f22342j + "]!!!");
                    }
                    m28280a("PLAYBACK_ERROR");
                    return;
                }
                this.f22335c.mo3872c();
                this.f22342j = (short) 5;
                if (f22333a.mo4282e()) {
                    f22333a.mo4281e("PlayImpl.handleStartPlayback() audioSys.nextPlayback() return false!!!");
                }
                m28280a("PLAYBACK_ERROR");
                return;
            case (byte) 6:
                Object[] objArr = (Object[]) c5721a.f25337b;
                byte[] bArr = (byte[]) objArr[0];
                boolean booleanValue = ((Boolean) objArr[1]).booleanValue();
                if (f22333a.mo4276b()) {
                    f22333a.mo4275b((Object) "PlayerImpl.handleAddBuffer()");
                }
                synchronized (this.f22345m) {
                    if (bArr != null) {
                        rg rgVar = this.f22334b;
                        si.m34092a();
                        if (si.m34095b(this.f22334b)) {
                            this.f22340h.add(bArr);
                        } else {
                            this.f22337e.write(bArr, 0, bArr.length);
                            this.f22338f.addElement(bArr);
                        }
                    }
                    if (booleanValue) {
                        this.f22341i = true;
                    }
                }
                return;
            case (byte) 7:
                C5716b c5716b = (C5716b) ((Object[]) c5721a.f25337b)[0];
                if (f22333a.mo4276b()) {
                    f22333a.mo4275b((Object) "audio done call back is called");
                }
                if (c5716b.equals(C5716b.f25324b)) {
                    this.f22342j = (short) 5;
                    m28280a("PLAYBACK_ERROR");
                    return;
                }
                this.f22342j = (short) 5;
                m28281b("StreamStop");
                m28280a("STOPPED");
                return;
            default:
                return;
        }
    }

    /* renamed from: a */
    public final void mo4476a(C5716b c5716b) {
        if (f22333a.mo4276b()) {
            f22333a.mo4275b((Object) "audio stop call back is called");
        }
        this.f22342j = (short) 5;
        m28280a(c5716b.equals(C5716b.f25324b) ? "PLAYBACK_ERROR" : "STOPPED");
    }

    /* renamed from: a */
    public final void mo4477a(C5716b c5716b, Object obj) {
        if (f22333a.mo4276b()) {
            f22333a.mo4275b((Object) "PlayerImpl.doneCallback()");
        }
        rl rlVar = this.f22344l;
        C5721a c5721a = new C5721a((byte) 7, new Object[]{c5716b, obj});
        Thread currentThread = Thread.currentThread();
        this.f22344l.mo4288a();
        rlVar.mo4285a(c5721a, this, currentThread);
    }

    /* renamed from: a */
    public final void mo4478a(byte[] bArr, int i, int i2, boolean z) throws dnq {
        if (f22333a.mo4278c()) {
            f22333a.mo4277c("addAudioBuf(" + bArr + ", " + z + ")");
        }
        if (bArr == null && !z) {
            throw new NullPointerException("buffer is null!");
        } else if (bArr != null && i < 0) {
            throw new IllegalArgumentException("offset cannot be negative!!!");
        } else if (bArr != null && i2 <= 0) {
            throw new IllegalArgumentException("length can only be positive!!!");
        } else if ((this.f22334b == rg.f25317c || this.f22334b == rg.f25316b || this.f22334b == rg.f25315a) && i2 > 153600) {
            m28280a("PLAYBACK_ERROR");
            mo4480f();
        } else if (this.f22339g) {
            throw new dnq("audio player is full, the last buffer has already apended!");
        } else {
            if (!this.f22339g && z) {
                this.f22339g = true;
            }
            Object obj = null;
            if (bArr != null) {
                obj = new byte[i2];
                System.arraycopy(bArr, i, obj, 0, i2);
            }
            Object obj2 = new Object[]{obj, new Boolean(z)};
            rl rlVar = this.f22344l;
            C5721a c5721a = new C5721a((byte) 6, obj2);
            Thread currentThread = Thread.currentThread();
            this.f22344l.mo4288a();
            rlVar.mo4285a(c5721a, this, currentThread);
        }
    }

    /* renamed from: a */
    public final void mo4479a(byte[] bArr, Object obj, C5718i c5718i, C5718i c5718i2, Float f) {
        Object obj2;
        int i;
        if (f22333a.mo4276b()) {
            f22333a.mo4275b("audio call back is called time: [" + System.currentTimeMillis() + "]");
        }
        if (this.f22342j == (short) 0) {
            this.f22342j = (short) 1;
            m28280a("STARTED");
        }
        rg rgVar = this.f22334b;
        si.m34092a();
        if (si.m34095b(this.f22334b)) {
            obj2 = (byte[]) obj;
        } else {
            rgVar = this.f22334b;
            si.m34094b();
            if (!si.m34093a(this.f22334b)) {
                obj2 = null;
            }
        }
        int length = obj2.length;
        if (!si.m34095b(this.f22334b)) {
            synchronized (this.f22345m) {
                if (this.f22337e.size() <= 0) {
                    i = this.f22341i ? -1 : 0;
                } else {
                    Object toByteArray = this.f22337e.toByteArray();
                    try {
                        this.f22337e.close();
                    } catch (Exception e) {
                        System.out.println("got an exception [" + e.getClass().getName() + "] message [" + e.getMessage() + "]");
                    }
                    this.f22337e = null;
                    this.f22337e = new ByteArrayOutputStream();
                    rg rgVar2;
                    if (length < toByteArray.length) {
                        rgVar2 = this.f22334b;
                        si.m34092a();
                        if (si.m34093a(this.f22334b)) {
                            i = length;
                        }
                        i = 0;
                    } else {
                        rgVar2 = this.f22334b;
                        si.m34092a();
                        if (si.m34093a(this.f22334b)) {
                            i = toByteArray.length;
                        }
                        i = 0;
                    }
                    if (i < toByteArray.length) {
                        this.f22337e.write(toByteArray, i, toByteArray.length - i);
                    }
                    if (f22333a.mo4276b()) {
                        f22333a.mo4275b("feed oem audio data len [" + i + "] complete buffer size [" + toByteArray.length + "]");
                    }
                    System.arraycopy(toByteArray, 0, obj2, 0, i);
                }
            }
        } else if (this.f22340h.isEmpty()) {
            i = this.f22341i ? -1 : 0;
        } else {
            try {
                byte[] bArr2 = (byte[]) this.f22340h.removeFirst();
                if (length < bArr2.length) {
                    if (f22333a.mo4282e()) {
                        f22333a.mo4281e("Buffer is too small to contain the Speex buffer.");
                    }
                    i = 0;
                } else {
                    int length2 = bArr2.length;
                    System.arraycopy(bArr2, 0, obj2, 0, length2);
                    i = length2;
                }
            } catch (NoSuchElementException e2) {
                i = 0;
            }
        }
        if (i > 0) {
            m28280a("BUFFER_PLAYED");
        }
        rg rgVar3 = this.f22334b;
        si.m34092a();
        if (si.m34095b(this.f22334b)) {
            c5718i2.f25329a = i;
            return;
        }
        rgVar3 = this.f22334b;
        si.m34094b();
        if (si.m34093a(this.f22334b)) {
            c5718i.f25329a = i;
        }
    }

    /* renamed from: f */
    public final void mo4480f() {
        if (f22333a.mo4276b()) {
            f22333a.mo4275b((Object) "PlayerImpl.start()");
        }
        m28281b("PlayerStop");
        rl rlVar = this.f22344l;
        C5721a c5721a = new C5721a((byte) 2, this);
        Thread currentThread = Thread.currentThread();
        this.f22344l.mo4288a();
        rlVar.mo4285a(c5721a, this, currentThread);
    }
}
