package com.p000;

import android.os.Build.VERSION;
import java.util.Vector;
import p000.dpt.C5033a;
import p000.rh.C5006j;
import p000.rl.C5721a;

/* renamed from: dpd */
public class dpd extends dpc implements dpv {
    /* renamed from: g */
    private static final rk f22509g = dnn.m28258a(dpd.class);
    /* renamed from: k */
    private static String f22510k = VERSION.RELEASE;
    /* renamed from: h */
    private rl f22511h;
    /* renamed from: i */
    private doy f22512i;
    /* renamed from: j */
    private dpt f22513j = null;

    public dpd(doz doz, doy doy, Vector vector) {
        super(doz, doy, vector);
        this.f22512i = doy;
        this.f22511h = doz.z_();
        this.a = doz.m28513h();
        this.a.m28533a((dow) this);
        rl rlVar = this.f22511h;
        C5721a c5721a = new C5721a((byte) 0, null);
        Thread currentThread = Thread.currentThread();
        this.f22511h.mo4288a();
        rlVar.mo4285a(c5721a, this, currentThread);
    }

    /* renamed from: a */
    private void m28596a(byte b) {
        if (b == this.f22513j.f22543a) {
            Vector vector = (Vector) ((doz) m28584g()).m28514i();
            if (vector != null && vector.size() > 0) {
                f22509g.mo4275b("clearResLogsToServer() before clean the log vector tranId[" + b + "] log list size [" + vector.size() + "]");
                int i = 0;
                while (i < vector.size()) {
                    C5033a c5033a = (C5033a) vector.elementAt(i);
                    if (c5033a.m28652e()) {
                        vector.removeElement(c5033a);
                    } else {
                        i++;
                    }
                }
                f22509g.mo4275b("clearResLogsToServer() after clean the log vector tranId[" + b + "] log list size [" + vector.size() + "]");
            }
        }
    }

    /* renamed from: a */
    public final dnk mo4527a(String str) {
        if (str != null) {
            return new dpe(str, this.a, this.f22511h);
        }
        throw new NullPointerException("name can not be null");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public final p000.dpu mo4528a(p000.dpx r26, String r27, String r28, String r29, String r30, String r31, p000.dni r32) throws p000.dox {
        /*
        r25 = this;
        r2 = "";
        if (r26 != 0) goto L_0x0017;
    L_0x0004:
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r2 = r3.append(r2);
        r3 = "commandListener is invalid; ";
        r2 = r2.append(r3);
        r2 = r2.toString();
    L_0x0017:
        if (r27 == 0) goto L_0x0023;
    L_0x0019:
        r3 = "";
        r0 = r27;
        r3 = r0.equals(r3);
        if (r3 == 0) goto L_0x0036;
    L_0x0023:
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r2 = r3.append(r2);
        r3 = "cmd should be non-null; ";
        r2 = r2.append(r3);
        r2 = r2.toString();
    L_0x0036:
        if (r28 == 0) goto L_0x0042;
    L_0x0038:
        r3 = "";
        r0 = r28;
        r3 = r0.equals(r3);
        if (r3 == 0) goto L_0x0055;
    L_0x0042:
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r2 = r3.append(r2);
        r3 = "scriptVersion should be non-null; ";
        r2 = r2.append(r3);
        r2 = r2.toString();
    L_0x0055:
        if (r29 == 0) goto L_0x0061;
    L_0x0057:
        r3 = "";
        r0 = r29;
        r3 = r0.equals(r3);
        if (r3 == 0) goto L_0x0074;
    L_0x0061:
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r2 = r3.append(r2);
        r3 = "dictationLanguage should be non-null; ";
        r2 = r2.append(r3);
        r2 = r2.toString();
    L_0x0074:
        if (r31 == 0) goto L_0x0080;
    L_0x0076:
        r3 = "";
        r0 = r31;
        r3 = r0.equals(r3);
        if (r3 == 0) goto L_0x0093;
    L_0x0080:
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r2 = r3.append(r2);
        r3 = "phoneModel should be non-null; ";
        r2 = r2.append(r3);
        r2 = r2.toString();
    L_0x0093:
        r4 = 30000; // 0x7530 float:4.2039E-41 double:1.4822E-319;
        r6 = 0;
        r3 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r3 > 0) goto L_0x00ae;
    L_0x009b:
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r2 = r3.append(r2);
        r3 = "commandTimeout is invalid; ";
        r2 = r2.append(r3);
        r2 = r2.toString();
    L_0x00ae:
        r3 = "";
        r3 = r2.equals(r3);
        if (r3 != 0) goto L_0x00d0;
    L_0x00b6:
        r3 = f22509g;
        r4 = new java.lang.StringBuilder;
        r5 = "NMASResourceImpl.createCommand() ";
        r4.<init>(r5);
        r4 = r4.append(r2);
        r4 = r4.toString();
        r3.mo4281e(r4);
        r3 = new java.lang.IllegalArgumentException;
        r3.<init>(r2);
        throw r3;
    L_0x00d0:
        r0 = r25;
        r0 = r0.e;
        r24 = r0;
        monitor-enter(r24);
        r0 = r25;
        r2 = r0.f22513j;	 Catch:{ all -> 0x017b }
        if (r2 == 0) goto L_0x00e4;
    L_0x00dd:
        r0 = r25;
        r2 = r0.f22513j;	 Catch:{ all -> 0x017b }
        r2.m28679e();	 Catch:{ all -> 0x017b }
    L_0x00e4:
        r0 = r25;
        r2 = r0.a;	 Catch:{ all -> 0x017b }
        p000.dpa.m28527d();	 Catch:{ all -> 0x017b }
        r0 = r25;
        r2 = r0.d;	 Catch:{ all -> 0x017b }
        if (r2 != 0) goto L_0x010c;
    L_0x00f1:
        r0 = r25;
        r2 = r0.f22511h;	 Catch:{ all -> 0x017b }
        r3 = new rl$a;	 Catch:{ all -> 0x017b }
        r4 = 0;
        r5 = 0;
        r3.<init>(r4, r5);	 Catch:{ all -> 0x017b }
        r4 = java.lang.Thread.currentThread();	 Catch:{ all -> 0x017b }
        r0 = r25;
        r5 = r0.f22511h;	 Catch:{ all -> 0x017b }
        r5.mo4288a();	 Catch:{ all -> 0x017b }
        r0 = r25;
        r2.mo4285a(r3, r0, r4);	 Catch:{ all -> 0x017b }
    L_0x010c:
        r0 = r25;
        r2 = r0.a;	 Catch:{ all -> 0x017b }
        r2 = r2.m28551h();	 Catch:{ all -> 0x017b }
        r0 = r25;
        r0.f = r2;	 Catch:{ all -> 0x017b }
        r2 = new dpt;	 Catch:{ all -> 0x017b }
        r0 = r25;
        r3 = r0.f22511h;	 Catch:{ all -> 0x017b }
        r0 = r25;
        r4 = r0.c;	 Catch:{ all -> 0x017b }
        r4 = (p000.doz) r4;	 Catch:{ all -> 0x017b }
        r6 = r4.f22464b;	 Catch:{ all -> 0x017b }
        r0 = r25;
        r7 = r0.a;	 Catch:{ all -> 0x017b }
        r0 = r25;
        r4 = r0.c;	 Catch:{ all -> 0x017b }
        r4 = (p000.doz) r4;	 Catch:{ all -> 0x017b }
        r8 = r4.m28243d();	 Catch:{ all -> 0x017b }
        r9 = "1";
        r10 = f22510k;	 Catch:{ all -> 0x017b }
        r12 = "enus";
        r13 = "ne";
        r0 = r25;
        r4 = r0.c;	 Catch:{ all -> 0x017b }
        r4 = (p000.doz) r4;	 Catch:{ all -> 0x017b }
        r14 = r4.m28244e();	 Catch:{ all -> 0x017b }
        r0 = r25;
        r4 = r0.c;	 Catch:{ all -> 0x017b }
        r4 = (p000.doz) r4;	 Catch:{ all -> 0x017b }
        r18 = r4.m28243d();	 Catch:{ all -> 0x017b }
        r19 = "";
        r0 = r25;
        r0 = r0.f22512i;	 Catch:{ all -> 0x017b }
        r22 = r0;
        r0 = r25;
        r0 = r0.f;	 Catch:{ all -> 0x017b }
        r23 = r0;
        r4 = r26;
        r5 = r27;
        r11 = r28;
        r15 = r29;
        r16 = r30;
        r17 = r31;
        r20 = r32;
        r21 = r25;
        r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23);	 Catch:{ all -> 0x017b }
        r0 = r25;
        r0.f22513j = r2;	 Catch:{ all -> 0x017b }
        r0 = r25;
        r2 = r0.f22513j;	 Catch:{ all -> 0x017b }
        monitor-exit(r24);	 Catch:{ all -> 0x017b }
        return r2;
    L_0x017b:
        r2 = move-exception;
        monitor-exit(r24);
        throw r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: dpd.a(dpx, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, dni):dpu");
    }

    /* renamed from: a */
    public final C5006j mo4529a(String str, dni dni) {
        if (str == null) {
            throw new NullPointerException("name can not be null");
        } else if (dni != null) {
            return new dpf(str, (dnd) dni);
        } else {
            throw new NullPointerException("dict can not be null");
        }
    }

    /* renamed from: a */
    public final C5006j mo4530a(String str, dni dni, dnk dnk) {
        if (str == null) {
            throw new NullPointerException("name can not be null");
        } else if (dni == null) {
            throw new NullPointerException("tts_dict can not be null");
        } else if (dnk != null) {
            return new dpr(str, this.a, (dnd) dni, dnk);
        } else {
            throw new NullPointerException("audioSink can not be null");
        }
    }

    /* renamed from: a */
    public final C5006j mo4531a(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("name can not be null");
        } else if (str2 != null) {
            return new dps(str, str2);
        } else {
            throw new NullPointerException("text can not be null");
        }
    }

    /* renamed from: a */
    public final void mo4514a() throws dox {
        f22509g.mo4275b("freeResource() disconnectTimeout:" + 0);
        if (this.f22513j != null) {
            this.f22513j.m28679e();
        }
        synchronized (this.e) {
            if (this.d == 2) {
                this.d = 0;
                Integer num = new Integer(0);
                rl rlVar = this.f22511h;
                C5721a c5721a = new C5721a((byte) 3, num);
                Thread currentThread = Thread.currentThread();
                this.f22511h.mo4288a();
                rlVar.mo4285a(c5721a, this, currentThread);
            } else {
                throw new dox("the resource was unloaded. ");
            }
        }
    }

    /* renamed from: a */
    public final void mo4517a(byte b, short s) {
        if (b == this.f) {
            if (this.f22513j != null) {
                this.f22513j.m28679e();
            }
            super.mo4517a(b, s);
        }
    }

    /* renamed from: a */
    public final void mo4518a(byte b, byte[] bArr) {
        dph a = dpi.m28628a(bArr);
        switch (a.m28626e()) {
            case (short) 29185:
                m28596a(b);
                if (this.f22513j != null) {
                    this.f22513j.m28670a((dpo) a, b);
                    return;
                }
                return;
            case (short) 29186:
                if (this.f22513j != null) {
                    this.f22513j.m28669a((dpm) a, b);
                    return;
                }
                return;
            case (short) 29189:
                m28596a(b);
                if (this.f22513j != null) {
                    this.f22513j.m28671a((dpp) a, b);
                    return;
                }
                return;
            default:
                f22509g.mo4281e("Session.parseXModeMsgBcpData() Unknown command: " + a.m28626e() + ". ");
                return;
        }
    }

    /* renamed from: a */
    public final void mo3863a(Object obj, Object obj2) {
        switch (((C5721a) obj).f25336a) {
            case (byte) 0:
                super.m28574a((dpb) this);
                return;
            case (byte) 3:
                this.a.m28545b((dpb) this);
                doy doy = this.f22512i;
                return;
            default:
                super.mo3863a(obj, obj2);
                return;
        }
    }

    /* renamed from: a */
    public final void mo4519a(short s) {
        f22509g.mo4275b("onSessionDisconnected() reasonCode:" + s);
        if (this.f22513j != null) {
            this.f22513j.m28674a(s);
        }
        super.mo4519a(s);
    }

    /* renamed from: a */
    public final void mo4520a(byte[] bArr) {
        super.mo4520a(bArr);
        if (this.f22513j != null) {
            this.f22513j.m28675a(bArr);
        }
    }

    /* renamed from: b */
    public final C5006j mo4532b(String str, dni dni) {
        if (str == null) {
            throw new NullPointerException("name can not be null");
        } else if (dni != null) {
            return new dpq(str, (dnd) dni, (byte) 2);
        } else {
            throw new NullPointerException("dict can not be null");
        }
    }

    /* renamed from: c */
    public final C5006j mo4533c(String str, dni dni) {
        if (str == null) {
            throw new NullPointerException("name can not be null");
        } else if (dni != null) {
            return new dpq(str, (dnd) dni, (byte) 3);
        } else {
            throw new NullPointerException("dict can not be null");
        }
    }

    /* renamed from: c */
    public final void mo4523c() {
        this.f22513j.m28680f();
    }

    /* renamed from: d */
    public final C5006j mo4534d(String str, dni dni) {
        if (str == null) {
            throw new NullPointerException("name can not be null");
        } else if (dni != null) {
            return new dpq(str, (dnd) dni, (byte) 1);
        } else {
            throw new NullPointerException("dict can not be null");
        }
    }

    /* renamed from: d */
    public final void mo4524d() {
        this.f22513j.m28676b();
    }

    /* renamed from: e */
    public final void mo4525e() {
        this.f22513j.m28677c();
    }

    /* renamed from: f */
    public final void mo4526f() {
        this.f22513j.m28678d();
    }

    /* renamed from: h */
    public final long mo4535h() {
        return super.mo4535h();
    }

    /* renamed from: j */
    public final dni mo4536j() {
        return new dnd();
    }

    /* renamed from: k */
    public final dnj mo4537k() {
        return new dng();
    }
}
