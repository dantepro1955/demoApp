package com.p000;

import java.util.Vector;
import p000.dnm.C5007a;

/* renamed from: ra */
public final class ra {
    /* renamed from: a */
    private final sj f25267a = new C57001(this);
    /* renamed from: b */
    private final qw f25268b;
    /* renamed from: c */
    private final dot f25269c;
    /* renamed from: d */
    private dze f25270d;
    /* renamed from: e */
    private final Object f25271e;
    /* renamed from: f */
    private boolean f25272f;
    /* renamed from: g */
    private boolean f25273g;
    /* renamed from: h */
    private boolean f25274h;
    /* renamed from: i */
    private boolean f25275i;
    /* renamed from: j */
    private Object f25276j;
    /* renamed from: k */
    private final Object f25277k;

    /* renamed from: ra$1 */
    class C57001 implements sj {
        /* renamed from: a */
        private boolean f25265a = false;
        /* renamed from: b */
        private /* synthetic */ ra f25266b;

        C57001(ra raVar) {
            this.f25266b = raVar;
        }

        /* renamed from: a */
        private void m33940a() {
            synchronized (this.f25266b.f25276j) {
                this.f25266b.f25274h = true;
                if (this.f25266b.f25275i) {
                    this.f25266b.f25276j.notify();
                    this.f25266b.f25275i = false;
                }
            }
        }

        /* renamed from: a */
        public final void mo5488a(String str) {
            if (str == "BUFFER_PLAYED") {
                if (!this.f25265a) {
                    czl.m25828a(this.f25266b, "First audio buffer played");
                    this.f25266b.f25268b.mo4746b(this.f25266b.f25271e);
                    this.f25265a = true;
                }
            } else if (str == "BUFFERING") {
            } else {
                if (str == "STARTED") {
                    czl.m25828a(this.f25266b, "Audio playback started");
                } else if (str == "STOPPED") {
                    czl.m25828a(this.f25266b, "Audio playback stopped");
                    m33940a();
                    this.f25266b.f25268b.mo4747c(this.f25266b.f25271e);
                } else if (str == "PLAYBACK_ERROR") {
                    czl.m25831c(this.f25266b, "Audio playback error");
                    m33940a();
                    this.f25266b.f25268b.mo4745a(this.f25266b.f25271e);
                }
            }
        }
    }

    public ra(dot dot, Object obj, Object obj2, qw qwVar) {
        this.f25268b = qwVar;
        this.f25269c = dot;
        this.f25271e = obj;
        this.f25272f = false;
        this.f25273g = false;
        this.f25274h = false;
        this.f25275i = false;
        this.f25276j = new Object();
        this.f25277k = obj2;
        qv qvVar = new qv();
        qvVar.m33930a((Object) new dnm("Android_Context", this.f25277k, C5007a.f22310a));
        try {
            sj sjVar = this.f25267a;
            dot dot2 = this.f25269c;
            Vector c = qvVar.m33936c();
            rf rfVar = rf.f25310a;
            if (sjVar == null) {
                throw new NullPointerException("NMSPAudioPlaybackListener can not be null!");
            } else if (dot2 == null) {
                throw new NullPointerException("Manager can not be null!");
            } else {
                this.f25270d = new dnr(sjVar, dot2, c, rfVar);
            }
        } catch (Throwable th) {
            czl.m25829a(this, "Error creating player", th);
            this.f25270d = null;
        }
    }

    /* renamed from: a */
    public final void m33948a() {
        if (this.f25272f) {
            czl.m25831c(this, "Player already started");
        } else if (this.f25270d != null) {
            this.f25272f = true;
            try {
                czl.m25828a((Object) this, "Starting audio player");
                this.f25270d.mo4475a();
                return;
            } catch (Throwable th) {
                czl.m25829a(this, "Error starting player", th);
            }
        }
        this.f25268b.mo4745a(this.f25271e);
    }

    /* renamed from: b */
    public final void m33949b() {
        if (this.f25272f && !this.f25273g) {
            if (this.f25270d != null) {
                this.f25273g = true;
                synchronized (this.f25276j) {
                    try {
                        if (!this.f25274h) {
                            czl.m25828a((Object) this, "Stopping audio player");
                            this.f25270d.mo4480f();
                            this.f25275i = true;
                            while (!this.f25274h) {
                                try {
                                    this.f25276j.wait();
                                } catch (InterruptedException e) {
                                }
                            }
                        }
                    } catch (Throwable th) {
                        czl.m25829a(this, "Error stopping player", th);
                        this.f25274h = true;
                    }
                }
                return;
            }
            this.f25268b.mo4745a(this.f25271e);
        }
    }

    /* renamed from: c */
    public final dze m33950c() {
        return this.f25270d;
    }
}
