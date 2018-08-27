package com.p000;

import com.nuance.nmsp.client.sdk.oem.AudioSystemOEM;
import java.util.Enumeration;
import java.util.Vector;
import p000.dnm.C5007a;
import p000.rh.C5006j;
import p000.rh.C5011a;
import p000.rh.C5013m;
import p000.rh.C5015d;
import p000.rh.C5016e;
import p000.rh.C5017f;
import p000.rh.C5018g;
import p000.rh.C5019l;
import p000.rh.C5716b;
import p000.rh.C5717h;
import p000.rh.C5718i;
import p000.rl.C4177b;
import p000.rl.C5721a;

/* renamed from: dns */
public class dns implements C5011a, C5015d, C5016e, C5017f, C5018g, C5006j, C5019l, C5013m, C4177b, sm {
    /* renamed from: a */
    private static final rk f22349a = dnn.m28258a(dns.class);
    /* renamed from: b */
    private rg f22350b;
    /* renamed from: c */
    private rh f22351c;
    /* renamed from: d */
    private sk f22352d;
    /* renamed from: e */
    private rl f22353e = null;
    /* renamed from: f */
    private dnk f22354f;
    /* renamed from: g */
    private long f22355g;
    /* renamed from: h */
    private sq f22356h;
    /* renamed from: i */
    private int f22357i;
    /* renamed from: j */
    private sb f22358j;
    /* renamed from: k */
    private boolean f22359k = false;
    /* renamed from: l */
    private boolean f22360l = false;
    /* renamed from: m */
    private boolean f22361m = false;
    /* renamed from: n */
    private C5717h f22362n;
    /* renamed from: o */
    private Vector f22363o;
    /* renamed from: p */
    private int f22364p = -1;

    /* renamed from: dns$1 */
    class C50141 implements sb {
        /* renamed from: a */
        private /* synthetic */ dns f22348a;

        C50141(dns dns) {
            this.f22348a = dns;
        }

        public final void run() {
            this.f22348a.f22358j = null;
            if (this.f22348a.f22360l) {
                this.f22348a.m28313a(true);
            } else {
                this.f22348a.m28303b(true);
            }
        }
    }

    public dns(sk skVar, dot dot, Vector vector, re reVar) {
        dns.m28301a(vector);
        this.f22352d = skVar;
        this.f22350b = ((doz) dot).m28244e();
        this.f22358j = null;
        this.f22353e = ((doz) dot).z_();
        this.f22363o = vector;
        this.f22359k = dns.m28302a(vector, "ep.enable");
        this.f22360l = dns.m28302a(vector, "NMSP_DEFINES_RECORDER_CONTINUES_ON_ENDPOINTER_AND_TIMER_STOPPING");
        this.f22361m = dns.m28302a(vector, "NMSP_DEFINES_CAPTURING_CONTINUES_ON_ENDPOINTER");
        this.f22351c = new AudioSystemOEM(this.f22353e, this.f22350b, vector);
        if (reVar.equals(re.f25308c)) {
            this.f22362n = C5717h.f25327c;
        } else if (reVar.equals(re.f25306a)) {
            this.f22362n = C5717h.f25325a;
        } else if (reVar.equals(re.f25307b)) {
            this.f22362n = C5717h.f25326b;
        } else if (reVar.equals(re.f25309d)) {
            this.f22362n = C5717h.f25328d;
        }
        st stVar = (st) dot.mo4507a();
        if (stVar != null) {
            sq b = stVar.m34138b();
            if (b != null) {
                this.f22356h = b.mo5518a("NMSPRecorder").mo5521a();
            }
        }
        this.f22364p = 0;
    }

    /* renamed from: a */
    private void m28298a(dnk dnk, int i) {
        if (f22349a.mo4276b()) {
            f22349a.mo4275b("RecorderImpl.handleStartRecording(" + dnk + ") _state:" + this.f22364p);
        }
        if (new czx(this.f22363o).m25913a()) {
            this.f22350b = si.m34096c(this.f22350b);
        }
        this.f22357i = i;
        if (this.f22364p == 0) {
            this.f22354f = dnk;
            rh rhVar = this.f22351c;
            C5717h c5717h = this.f22362n;
            boolean z = this.f22359k && dnk != null;
            if (rhVar.mo3868a(c5717h, z, this, this, this, this, this, this, this)) {
                if (this.f22359k) {
                    if (dnk == null) {
                        this.f22364p = 1;
                    } else {
                        this.f22364p = 2;
                    }
                } else if (dnk == null) {
                    this.f22364p = 1;
                } else {
                    m28306h();
                    this.f22364p = 4;
                }
                m28300a("STARTED", null);
                return;
            }
            if (f22349a.mo4282e()) {
                f22349a.mo4281e("RecorderImpl.handleStartRecording() startRecording() failed!!!");
            }
            this.f22364p = 8;
            m28300a("RECORD_ERROR", null);
        }
    }

    /* renamed from: a */
    private void m28299a(String str) {
        if (this.f22356h != null) {
            this.f22356h.mo5518a(str).mo5521a();
        }
    }

    /* renamed from: a */
    private void m28300a(String str, Object obj) {
        if (this.f22352d != null) {
            try {
                this.f22352d.mo5489a(this, str, obj);
            } catch (Throwable th) {
                if (f22349a.mo4282e()) {
                    f22349a.mo4281e("Got an exp while calling NMSPAudioRecordListener.recorderUpdate(" + str + ", " + obj + ")[" + th.getClass().getName() + "] msg [" + th.getMessage() + "]");
                }
            }
        }
    }

    /* renamed from: a */
    private static void m28301a(Vector vector) {
        if (vector != null) {
            Enumeration elements = vector.elements();
            while (elements.hasMoreElements()) {
                dnm dnm = (dnm) elements.nextElement();
                if (dnm.m28251d() != C5007a.f22310a) {
                    throw new IllegalArgumentException("Parameter type: " + dnm.m28251d() + " not allowed. ");
                }
            }
        }
    }

    /* renamed from: a */
    private static boolean m28302a(Vector vector, String str) {
        if (vector != null) {
            Enumeration elements = vector.elements();
            while (elements.hasMoreElements()) {
                dnm dnm = (dnm) elements.nextElement();
                if (dnm.m28251d() == C5007a.f22310a && dnm.m28248a().equals(str)) {
                    return new String(dnm.m28249b()).equals("TRUE");
                }
            }
        }
        return false;
    }

    /* renamed from: b */
    private void m28303b(boolean z) {
        if (f22349a.mo4276b()) {
            f22349a.mo4275b("RecorderImpl.handleStopRecording() _state:" + this.f22364p);
        }
        if (this.f22364p == 2 || this.f22364p == 4 || this.f22364p == 5) {
            if (z) {
                m28300a("CAPTURE_TIMEOUT", null);
            }
            if (this.f22364p == 4) {
                m28307i();
            }
            this.f22351c.mo3866a((C5013m) this);
            this.f22364p = 9;
        } else if (this.f22364p == 1 || this.f22364p == 3 || this.f22364p == 6) {
            this.f22351c.mo3866a((C5013m) this);
            this.f22364p = 7;
        }
    }

    /* renamed from: h */
    private void m28306h() {
        if (this.f22357i > 0) {
            this.f22358j = new C50141(this);
            this.f22353e.mo4286a(this.f22358j, (long) this.f22357i);
        }
    }

    /* renamed from: i */
    private void m28307i() {
        if (this.f22358j != null) {
            this.f22353e.mo4287a(this.f22358j);
            this.f22358j = null;
        }
    }

    /* renamed from: j */
    private void m28308j() {
        try {
            this.f22354f.mo4478a(null, 0, 0, true);
        } catch (dnq e) {
            if (f22349a.mo4280d()) {
                f22349a.mo4281e("RecorderImpl.finishAudioSink() TransactionProcessingException:" + e);
            }
        }
        if (f22349a.mo4276b()) {
            f22349a.mo4275b((Object) "RecorderImpl::finishAudioSink send the last audio buffer from recorder");
        }
    }

    /* renamed from: a */
    public final void mo4481a() {
        if (f22349a.mo4276b()) {
            f22349a.mo4275b("RecorderImpl::endOfSpeechCallback() _state:" + this.f22364p);
        }
        if (this.f22364p == 4) {
            m28300a("END_OF_SPEECH", null);
            if (!this.f22361m) {
                m28313a(false);
            }
        }
    }

    /* renamed from: a */
    public final void mo4482a(dnk dnk) {
        if (f22349a.mo4276b()) {
            f22349a.mo4275b("RecorderImpl.startCapturing(" + dnk + ")");
        }
        if (dnk == null) {
            throw new IllegalArgumentException("audioSink cannot be null.");
        }
        rl rlVar = this.f22353e;
        C5721a c5721a = new C5721a((byte) 4, new Object[]{dnk, new Integer(60000)});
        Thread currentThread = Thread.currentThread();
        this.f22353e.mo4288a();
        rlVar.mo4285a(c5721a, this, currentThread);
    }

    /* renamed from: a */
    public final void mo3863a(Object obj, Object obj2) {
        C5721a c5721a = (C5721a) obj;
        Object[] objArr;
        switch (c5721a.f25336a) {
            case (byte) 1:
                m28298a(null, 0);
                return;
            case (byte) 2:
                objArr = (Object[]) c5721a.f25337b;
                m28298a((dnk) objArr[0], ((Integer) objArr[1]).intValue());
                return;
            case (byte) 3:
                m28303b(false);
                return;
            case (byte) 4:
                objArr = (Object[]) c5721a.f25337b;
                dnk dnk = (dnk) objArr[0];
                int intValue = ((Integer) objArr[1]).intValue();
                if (f22349a.mo4276b()) {
                    f22349a.mo4275b("RecorderImpl.handleStartCapturing(" + dnk + ") _state:" + this.f22364p);
                }
                this.f22357i = intValue;
                this.f22354f = dnk;
                if (this.f22364p == 1) {
                    if (this.f22359k) {
                        this.f22351c.mo3864a((C5016e) this);
                        this.f22364p = 2;
                        return;
                    }
                    m28306h();
                    this.f22364p = 4;
                    return;
                } else if (this.f22364p == 3) {
                    this.f22364p = 2;
                    return;
                } else if (this.f22364p == 6) {
                    this.f22364p = 5;
                    return;
                } else {
                    return;
                }
            case (byte) 5:
                m28313a(false);
                return;
            default:
                return;
        }
    }

    /* renamed from: a */
    public final void mo4476a(C5716b c5716b) {
        if (f22349a.mo4276b()) {
            f22349a.mo4275b("RecorderImpl.stopCallback() _state:" + this.f22364p);
        }
        m28299a("StreamStop");
        if (this.f22364p == 1 || this.f22364p == 3 || this.f22364p == 7) {
            m28300a("STOPPED", null);
            this.f22364p = 8;
        } else if (this.f22364p == 2 || this.f22364p == 4 || this.f22364p == 5 || this.f22364p == 6 || this.f22364p == 9) {
            if (this.f22364p == 4) {
                m28307i();
            }
            m28308j();
            m28300a("STOPPED", null);
            this.f22364p = 8;
        }
    }

    /* renamed from: a */
    public final void m28313a(boolean z) {
        if (f22349a.mo4276b()) {
            f22349a.mo4275b("RecorderImpl.handleStopCapturing() _state:" + this.f22364p);
        }
        if (this.f22364p == 2) {
            m28308j();
            if (z) {
                m28300a("CAPTURE_TIMEOUT", null);
            }
            this.f22364p = 3;
        } else if (this.f22364p == 4) {
            m28308j();
            if (z) {
                m28300a("CAPTURE_TIMEOUT", null);
            }
            if (this.f22364p == 4) {
                m28307i();
            }
            if (this.f22359k) {
                this.f22351c.mo3865a((C5017f) this);
                this.f22364p = 6;
                return;
            }
            this.f22364p = 1;
        } else if (this.f22364p == 5) {
            m28308j();
            this.f22364p = 6;
        }
    }

    /* renamed from: a */
    public final void mo4479a(byte[] bArr, Object obj, C5718i c5718i, C5718i c5718i2, Float f) {
        int i = 0;
        if (f22349a.mo4276b()) {
            f22349a.mo4275b("RecorderImpl.audioCallback() _state:" + this.f22364p);
        }
        if (this.f22364p == 4) {
            byte[] bArr2;
            if (this.f22355g == 0) {
                this.f22355g = System.currentTimeMillis();
                m28299a("StreamStart");
            }
            rg rgVar = this.f22350b;
            si.m34092a();
            if (si.m34095b(this.f22350b)) {
                bArr2 = (byte[]) obj;
                i = c5718i2.f25329a;
            } else if (si.m34093a(this.f22350b)) {
                i = c5718i.f25329a;
                bArr2 = bArr;
            } else {
                bArr2 = null;
            }
            if (f22349a.mo4276b()) {
                f22349a.mo4275b("========================= Recorder::audioCallback len[" + i + "] ======================");
            }
            try {
                this.f22354f.mo4478a(bArr2, 0, i, false);
                m28300a("BUFFER_RECORDED", (Object) f);
            } catch (dnq e) {
                if (f22349a.mo4280d()) {
                    f22349a.mo4279d("RecorderImpl.audioCallback() TransactionProcessingException:" + e);
                }
                m28300a("RECORD_ERROR", null);
                if (this.f22364p == 4) {
                    m28307i();
                }
                this.f22351c.mo3866a((C5013m) this);
                this.f22364p = 7;
            }
        }
    }

    /* renamed from: b */
    public final void mo4483b() {
        if (f22349a.mo4276b()) {
            f22349a.mo4275b("RecorderImpl::endPointerStartedCallback() _state:" + this.f22364p);
        }
        if (this.f22364p == 2) {
            m28306h();
            this.f22364p = 4;
        } else if (this.f22364p == 3) {
            this.f22351c.mo3865a((C5017f) this);
            this.f22364p = 6;
        }
    }

    /* renamed from: c */
    public final void mo4484c() {
        if (f22349a.mo4276b()) {
            f22349a.mo4275b("RecorderImpl::endPointerStoppedCallback() _state:" + this.f22364p);
        }
        if (this.f22364p == 5) {
            this.f22351c.mo3864a((C5016e) this);
            this.f22364p = 2;
        } else if (this.f22364p == 6) {
            this.f22364p = 1;
        }
    }

    /* renamed from: d */
    public final void mo4485d() {
        if (f22349a.mo4276b()) {
            f22349a.mo4275b("RecorderImpl.errorCallback() _state:" + this.f22364p);
        }
        if (this.f22364p == 1 || this.f22364p == 2 || this.f22364p == 3 || this.f22364p == 4 || this.f22364p == 5 || this.f22364p == 6) {
            if (this.f22364p == 4) {
                m28307i();
            }
            m28300a("RECORD_ERROR", null);
            this.f22364p = 7;
        }
    }

    /* renamed from: e */
    public final void mo4486e() {
        if (f22349a.mo4276b()) {
            f22349a.mo4275b("RecorderImpl::startOfSpeechCallback() _state:" + this.f22364p);
        }
        if (this.f22364p == 4) {
            m28300a("START_OF_SPEECH", null);
        }
    }

    /* renamed from: f */
    public final void mo4487f() {
        if (f22349a.mo4276b()) {
            f22349a.mo4275b((Object) "RecorderImpl.startRecording()");
        }
        this.f22355g = 0;
        m28299a("RecorderStart");
        rl rlVar = this.f22353e;
        C5721a c5721a = new C5721a((byte) 1, null);
        Thread currentThread = Thread.currentThread();
        this.f22353e.mo4288a();
        rlVar.mo4285a(c5721a, this, currentThread);
    }

    /* renamed from: g */
    public final void mo4488g() {
        if (f22349a.mo4276b()) {
            f22349a.mo4275b((Object) "RecorderImpl.stop()");
        }
        m28299a("RecorderStop");
        rl rlVar = this.f22353e;
        C5721a c5721a = new C5721a((byte) 3, null);
        Thread currentThread = Thread.currentThread();
        this.f22353e.mo4288a();
        rlVar.mo4285a(c5721a, this, currentThread);
    }
}
