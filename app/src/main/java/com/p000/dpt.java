package com.p000;

import com.facebook.internal.AnalyticsEvents;
import java.util.Vector;
import p000.dpu.C5034a;
import p000.rh.C5006j;
import p000.rl.C4177b;
import p000.rl.C5721a;

/* renamed from: dpt */
public class dpt implements dpu, C4177b {
    /* renamed from: b */
    private static final rk f22542b = dnn.m28258a(dpt.class);
    /* renamed from: a */
    protected byte f22543a;
    /* renamed from: c */
    private dpd f22544c;
    /* renamed from: d */
    private doy f22545d;
    /* renamed from: e */
    private dpx f22546e = null;
    /* renamed from: f */
    private dpa f22547f = null;
    /* renamed from: g */
    private sq f22548g;
    /* renamed from: h */
    private short f22549h = (short) -1;
    /* renamed from: i */
    private rl f22550i;
    /* renamed from: j */
    private sb f22551j;
    /* renamed from: k */
    private long f22552k;
    /* renamed from: l */
    private boolean f22553l;
    /* renamed from: m */
    private String f22554m;
    /* renamed from: n */
    private boolean f22555n = false;
    /* renamed from: o */
    private C5033a f22556o;
    /* renamed from: p */
    private Object f22557p;

    /* renamed from: dpt$1 */
    class C50321 implements sb {
        /* renamed from: a */
        private /* synthetic */ dpt f22536a;

        C50321(dpt dpt) {
            this.f22536a = dpt;
        }

        public final void run() {
            try {
                synchronized (this.f22536a.f22557p) {
                    this.f22536a.f22549h = (short) -1;
                }
                this.f22536a.m28659a("CommandExpired");
                if (this.f22536a.f22546e != null) {
                    dpt.f22542b.mo4275b((Object) "PDXTransactionImpl.end() timed out waiting for results. ");
                    try {
                        dpt dpt = this.f22536a;
                        dpt.m28663b(this.f22536a.f22556o, "TIMEOUT_CMD");
                        this.f22536a.f22546e.mo4562a((short) 1);
                    } catch (Throwable th) {
                        dpt.f22542b.mo4281e("got exp in PDXCommandListener.PDXCommandEvent(TIMED_OUT_WAITING_FOR_RESULT) [" + th.getClass().getName() + "] msg [" + th.getMessage() + "]");
                    }
                }
            } catch (Exception e) {
                dpt.f22542b.mo4281e("PDXTransactionImpl.run() " + e.getClass().getName() + " " + e.getMessage());
            }
        }
    }

    /* renamed from: dpt$a */
    public static class C5033a {
        /* renamed from: a */
        private int f22537a;
        /* renamed from: b */
        private String f22538b;
        /* renamed from: c */
        private String f22539c;
        /* renamed from: d */
        private dpt f22540d;
        /* renamed from: e */
        private boolean f22541e;

        protected C5033a(int i, dpt dpt) {
            this.f22537a = i;
            if (dpt.f22547f.m28549f() != null) {
                this.f22538b = dpa.m28522a(dpt.f22547f.m28549f());
            } else {
                this.f22538b = "";
            }
            this.f22539c = "INTERNAL_ERROR";
            this.f22540d = dpt;
            this.f22541e = false;
        }

        /* renamed from: a */
        static /* synthetic */ void m28645a(C5033a c5033a, String str) {
            if (c5033a.f22539c.equals("INTERNAL_ERROR")) {
                c5033a.f22539c = str;
            } else {
                c5033a.f22539c += ":" + str;
            }
            dpt.m28657a(c5033a.f22540d, c5033a);
        }

        /* renamed from: a */
        protected final int m28646a() {
            return this.f22537a;
        }

        /* renamed from: a */
        protected final void m28647a(C5034a c5034a) {
            if (this.f22539c.equals("INTERNAL_ERROR")) {
                this.f22539c = c5034a.toString();
            } else {
                this.f22539c += ":" + c5034a.toString();
            }
            dpt.m28657a(this.f22540d, this);
        }

        /* renamed from: a */
        protected final void m28648a(String str) {
            this.f22538b = str;
        }

        /* renamed from: b */
        protected final String m28649b() {
            return this.f22538b;
        }

        /* renamed from: c */
        protected final String m28650c() {
            return this.f22539c;
        }

        /* renamed from: d */
        protected final void m28651d() {
            this.f22541e = true;
        }

        /* renamed from: e */
        protected final boolean m28652e() {
            return this.f22541e;
        }
    }

    protected dpt(rl rlVar, dpx dpx, String str, String str2, dpa dpa, String str3, String str4, String str5, String str6, String str7, String str8, rg rgVar, String str9, String str10, String str11, String str12, String str13, dni dni, dpd dpd, doy doy, byte b) {
        if (f22542b.mo4276b()) {
            f22542b.mo4275b((Object) "PDXTransactionImpl()");
        }
        this.f22557p = new Object();
        this.f22550i = rlVar;
        this.f22547f = dpa;
        this.f22546e = dpx;
        this.f22552k = 30000;
        this.f22544c = dpd;
        this.f22545d = doy;
        this.f22543a = b;
        this.f22554m = str;
        this.f22553l = false;
        if (((doz) dpd.m28584g()).m28514i() != null) {
            this.f22556o = new C5033a(this.f22543a, this);
            dpt.m28663b(this.f22556o, "INTERNAL_ERROR");
        }
        synchronized (this.f22557p) {
            this.f22549h = (short) 0;
        }
        Object obj = new Object[18];
        obj[0] = str3;
        obj[1] = str4;
        obj[2] = str5;
        obj[3] = str6;
        obj[4] = str7;
        obj[5] = str8;
        obj[6] = rgVar;
        obj[7] = str9;
        obj[8] = new Short((short) 1);
        obj[9] = new Short((short) 1);
        obj[10] = str10;
        obj[11] = str11;
        obj[12] = str12;
        obj[13] = str13;
        obj[14] = str2;
        obj[15] = str;
        obj[16] = dni;
        C5721a c5721a = new C5721a((byte) 1, obj);
        Thread currentThread = Thread.currentThread();
        rlVar.mo4288a();
        rlVar.mo4285a(c5721a, this, currentThread);
    }

    /* renamed from: a */
    static /* synthetic */ void m28657a(dpt dpt, C5033a c5033a) {
        Vector vector = (Vector) ((doz) dpt.f22544c.m28584g()).m28514i();
        if (vector == null) {
            f22542b.mo4277c((Object) "appendLogToResLogs: NMSPDefines.DEVICE_CMD_LOG_TO_SERVER_ENABLED is disabled.");
        } else if (!vector.contains(c5033a)) {
            vector.addElement(c5033a);
        }
    }

    /* renamed from: a */
    private void m28659a(String str) {
        if (this.f22548g != null) {
            this.f22548g.mo5518a(str).mo5521a();
        }
    }

    /* renamed from: a */
    private void m28660a(String str, boolean z) {
        if (this.f22548g != null) {
            ss a = this.f22548g.mo5518a("NMASResponse");
            try {
                a = a.mo5523a("ResultType", str);
                if (str.compareTo("QUERY_RESULT") == 0) {
                    a = a.mo5524a("IsFinal", z);
                }
            } catch (sr e) {
            }
            a.mo5521a();
        }
    }

    /* renamed from: b */
    private static String m28661b(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer();
        int i = 0;
        while (i < bArr.length) {
            String toHexString = Integer.toHexString(bArr[i]);
            if (toHexString.length() > 1) {
                stringBuffer.append(toHexString.substring(toHexString.length() - 2));
            } else {
                stringBuffer.append(toHexString);
            }
            if (i == 3 || i == 5 || i == 7 || i == 9) {
                stringBuffer.append('-');
            }
            i++;
        }
        return stringBuffer.toString();
    }

    /* renamed from: b */
    private static void m28663b(C5033a c5033a, String str) {
        if (c5033a != null) {
            C5033a.m28645a(c5033a, str);
        }
    }

    /* renamed from: a */
    public final void mo4544a() throws dno, dnp {
        if (f22542b.mo4276b()) {
            f22542b.mo4275b((Object) "PDXTransactionImpl.end()");
        }
        synchronized (this.f22557p) {
            if (this.f22549h == (short) -1) {
                f22542b.mo4281e("PDXTransactionImpl.end() transaction already finished!");
                throw new dno("transaction already finished!");
            }
            if (this.f22549h == (short) 0) {
                this.f22549h = (short) 1;
                rl rlVar = this.f22550i;
                C5721a c5721a = new C5721a((byte) 4, null);
                Thread currentThread = Thread.currentThread();
                this.f22550i.mo4288a();
                rlVar.mo4285a(c5721a, this, currentThread);
            } else if (this.f22549h == (short) 1) {
                f22542b.mo4281e("PDXTransactionImpl.end() transaction already finished!");
                throw new dno("transaction already finished!");
            } else if (this.f22549h == (short) 2) {
                f22542b.mo4281e("PDXTransactionImpl.end() transaction already expired!");
                throw new dnp("transaction already expired!");
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public final void m28669a(p000.dpm r6, byte r7) {
        /*
        r5 = this;
        r2 = -1;
        r0 = f22542b;
        r1 = "PDXTransactionImpl.onQueryError()";
        r0.mo4275b(r1);
        r0 = r5.f22543a;
        if (r7 == r0) goto L_0x000d;
    L_0x000c:
        return;
    L_0x000d:
        r1 = r5.f22557p;
        monitor-enter(r1);
        r0 = r5.f22549h;	 Catch:{ all -> 0x001b }
        if (r0 == r2) goto L_0x0019;
    L_0x0014:
        r0 = r5.f22549h;	 Catch:{ all -> 0x001b }
        r2 = 2;
        if (r0 != r2) goto L_0x001e;
    L_0x0019:
        monitor-exit(r1);	 Catch:{ all -> 0x001b }
        goto L_0x000c;
    L_0x001b:
        r0 = move-exception;
        monitor-exit(r1);
        throw r0;
    L_0x001e:
        r0 = -1;
        r5.f22549h = r0;	 Catch:{ all -> 0x001b }
        r0 = "QUERY_ERROR";
        r2 = 1;
        r5.m28660a(r0, r2);	 Catch:{ all -> 0x001b }
        r0 = r5.f22551j;	 Catch:{ all -> 0x001b }
        if (r0 == 0) goto L_0x0032;
    L_0x002b:
        r0 = r5.f22550i;	 Catch:{ all -> 0x001b }
        r2 = r5.f22551j;	 Catch:{ all -> 0x001b }
        r0.mo4287a(r2);	 Catch:{ all -> 0x001b }
    L_0x0032:
        r0 = r5.f22546e;	 Catch:{ all -> 0x001b }
        if (r0 == 0) goto L_0x0042;
    L_0x0036:
        r0 = r5.f22556o;	 Catch:{ Throwable -> 0x0044 }
        r2 = "QUERY_ERROR";
        p000.dpt.m28663b(r0, r2);	 Catch:{ Throwable -> 0x0044 }
        r0 = r5.f22546e;	 Catch:{ Throwable -> 0x0044 }
        r0.mo4560a(r6);	 Catch:{ Throwable -> 0x0044 }
    L_0x0042:
        monitor-exit(r1);	 Catch:{ all -> 0x001b }
        goto L_0x000c;
    L_0x0044:
        r0 = move-exception;
        r2 = f22542b;	 Catch:{ all -> 0x001b }
        r3 = new java.lang.StringBuilder;	 Catch:{ all -> 0x001b }
        r4 = "got exp in PDXCommandListener.PDXQueryErrorReturned() [";
        r3.<init>(r4);	 Catch:{ all -> 0x001b }
        r4 = r0.getClass();	 Catch:{ all -> 0x001b }
        r4 = r4.getName();	 Catch:{ all -> 0x001b }
        r3 = r3.append(r4);	 Catch:{ all -> 0x001b }
        r4 = "] msg [";
        r3 = r3.append(r4);	 Catch:{ all -> 0x001b }
        r0 = r0.getMessage();	 Catch:{ all -> 0x001b }
        r0 = r3.append(r0);	 Catch:{ all -> 0x001b }
        r3 = "]";
        r0 = r0.append(r3);	 Catch:{ all -> 0x001b }
        r0 = r0.toString();	 Catch:{ all -> 0x001b }
        r2.mo4281e(r0);	 Catch:{ all -> 0x001b }
        goto L_0x0042;
        */
        throw new UnsupportedOperationException("Method not decompiled: dpt.a(dpm, byte):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public final void m28670a(p000.dpo r6, byte r7) {
        /*
        r5 = this;
        r0 = f22542b;
        r0 = r0.mo4276b();
        if (r0 == 0) goto L_0x000f;
    L_0x0008:
        r0 = f22542b;
        r1 = "PDXTransactionImpl.onQueryResults()";
        r0.mo4275b(r1);
    L_0x000f:
        r0 = r5.f22543a;
        if (r7 == r0) goto L_0x0014;
    L_0x0013:
        return;
    L_0x0014:
        r1 = r5.f22557p;
        monitor-enter(r1);
        r0 = r5.f22549h;	 Catch:{ all -> 0x0023 }
        r2 = -1;
        if (r0 == r2) goto L_0x0021;
    L_0x001c:
        r0 = r5.f22549h;	 Catch:{ all -> 0x0023 }
        r2 = 2;
        if (r0 != r2) goto L_0x0026;
    L_0x0021:
        monitor-exit(r1);	 Catch:{ all -> 0x0023 }
        goto L_0x0013;
    L_0x0023:
        r0 = move-exception;
        monitor-exit(r1);
        throw r0;
    L_0x0026:
        r0 = 1;
        r5.f22553l = r0;	 Catch:{ all -> 0x0023 }
        r0 = "QUERY_RESULT";
        r2 = r6.m28633g();	 Catch:{ all -> 0x0023 }
        r5.m28660a(r0, r2);	 Catch:{ all -> 0x0023 }
        r0 = r5.f22551j;	 Catch:{ all -> 0x0023 }
        if (r0 == 0) goto L_0x0043;
    L_0x0036:
        r0 = r6.m28633g();	 Catch:{ all -> 0x0023 }
        if (r0 == 0) goto L_0x0043;
    L_0x003c:
        r0 = r5.f22550i;	 Catch:{ all -> 0x0023 }
        r2 = r5.f22551j;	 Catch:{ all -> 0x0023 }
        r0.mo4287a(r2);	 Catch:{ all -> 0x0023 }
    L_0x0043:
        r0 = r5.f22546e;	 Catch:{ all -> 0x0023 }
        if (r0 == 0) goto L_0x0059;
    L_0x0047:
        r0 = r6.m28633g();	 Catch:{ Throwable -> 0x005b }
        if (r0 == 0) goto L_0x0054;
    L_0x004d:
        r0 = r5.f22556o;	 Catch:{ Throwable -> 0x005b }
        r2 = "FINAL_RESULT";
        p000.dpt.m28663b(r0, r2);	 Catch:{ Throwable -> 0x005b }
    L_0x0054:
        r0 = r5.f22546e;	 Catch:{ Throwable -> 0x005b }
        r0.mo4559a(r6);	 Catch:{ Throwable -> 0x005b }
    L_0x0059:
        monitor-exit(r1);	 Catch:{ all -> 0x0023 }
        goto L_0x0013;
    L_0x005b:
        r0 = move-exception;
        r2 = f22542b;	 Catch:{ all -> 0x0023 }
        r3 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0023 }
        r4 = "got exp in PDXCommandListener.PDXQueryResultReturned() [";
        r3.<init>(r4);	 Catch:{ all -> 0x0023 }
        r4 = r0.getClass();	 Catch:{ all -> 0x0023 }
        r4 = r4.getName();	 Catch:{ all -> 0x0023 }
        r3 = r3.append(r4);	 Catch:{ all -> 0x0023 }
        r4 = "] msg [";
        r3 = r3.append(r4);	 Catch:{ all -> 0x0023 }
        r0 = r0.getMessage();	 Catch:{ all -> 0x0023 }
        r0 = r3.append(r0);	 Catch:{ all -> 0x0023 }
        r3 = "]";
        r0 = r0.append(r3);	 Catch:{ all -> 0x0023 }
        r0 = r0.toString();	 Catch:{ all -> 0x0023 }
        r2.mo4281e(r0);	 Catch:{ all -> 0x0023 }
        goto L_0x0059;
        */
        throw new UnsupportedOperationException("Method not decompiled: dpt.a(dpo, byte):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public final void m28671a(p000.dpp r6, byte r7) {
        /*
        r5 = this;
        r2 = -1;
        r0 = f22542b;
        r1 = "PDXTransactionImpl.onQueryRetry()";
        r0.mo4275b(r1);
        r0 = r5.f22543a;
        if (r7 == r0) goto L_0x000d;
    L_0x000c:
        return;
    L_0x000d:
        r1 = r5.f22557p;
        monitor-enter(r1);
        r0 = r5.f22549h;	 Catch:{ all -> 0x001b }
        if (r0 == r2) goto L_0x0019;
    L_0x0014:
        r0 = r5.f22549h;	 Catch:{ all -> 0x001b }
        r2 = 2;
        if (r0 != r2) goto L_0x001e;
    L_0x0019:
        monitor-exit(r1);	 Catch:{ all -> 0x001b }
        goto L_0x000c;
    L_0x001b:
        r0 = move-exception;
        monitor-exit(r1);
        throw r0;
    L_0x001e:
        r0 = -1;
        r5.f22549h = r0;	 Catch:{ all -> 0x001b }
        r0 = "QUERY_RETRY";
        r2 = 1;
        r5.m28660a(r0, r2);	 Catch:{ all -> 0x001b }
        r0 = r5.f22551j;	 Catch:{ all -> 0x001b }
        if (r0 == 0) goto L_0x0032;
    L_0x002b:
        r0 = r5.f22550i;	 Catch:{ all -> 0x001b }
        r2 = r5.f22551j;	 Catch:{ all -> 0x001b }
        r0.mo4287a(r2);	 Catch:{ all -> 0x001b }
    L_0x0032:
        r0 = r5.f22546e;	 Catch:{ all -> 0x001b }
        if (r0 == 0) goto L_0x0042;
    L_0x0036:
        r0 = r5.f22556o;	 Catch:{ Throwable -> 0x0044 }
        r2 = "QUERY_RETRY";
        p000.dpt.m28663b(r0, r2);	 Catch:{ Throwable -> 0x0044 }
        r0 = r5.f22546e;	 Catch:{ Throwable -> 0x0044 }
        r0.mo4561a(r6);	 Catch:{ Throwable -> 0x0044 }
    L_0x0042:
        monitor-exit(r1);	 Catch:{ all -> 0x001b }
        goto L_0x000c;
    L_0x0044:
        r0 = move-exception;
        r2 = f22542b;	 Catch:{ all -> 0x001b }
        r3 = new java.lang.StringBuilder;	 Catch:{ all -> 0x001b }
        r4 = "got exp in PDXCommandListener.PDXQueryRetryReturned() [";
        r3.<init>(r4);	 Catch:{ all -> 0x001b }
        r4 = r0.getClass();	 Catch:{ all -> 0x001b }
        r4 = r4.getName();	 Catch:{ all -> 0x001b }
        r3 = r3.append(r4);	 Catch:{ all -> 0x001b }
        r4 = "] msg [";
        r3 = r3.append(r4);	 Catch:{ all -> 0x001b }
        r0 = r0.getMessage();	 Catch:{ all -> 0x001b }
        r0 = r3.append(r0);	 Catch:{ all -> 0x001b }
        r3 = "]";
        r0 = r0.append(r3);	 Catch:{ all -> 0x001b }
        r0 = r0.toString();	 Catch:{ all -> 0x001b }
        r2.mo4281e(r0);	 Catch:{ all -> 0x001b }
        goto L_0x0042;
        */
        throw new UnsupportedOperationException("Method not decompiled: dpt.a(dpp, byte):void");
    }

    /* renamed from: a */
    public final void mo3863a(Object obj, Object obj2) {
        C5721a c5721a = (C5721a) obj;
        Object obj3 = c5721a.f25337b;
        String str;
        switch (c5721a.f25336a) {
            case (byte) 1:
                Object[] objArr = (Object[]) obj3;
                String str2 = (String) objArr[0];
                str = (String) objArr[1];
                String str3 = (String) objArr[2];
                String str4 = (String) objArr[3];
                String str5 = (String) objArr[4];
                String str6 = (String) objArr[5];
                rg rgVar = (rg) objArr[6];
                String str7 = (String) objArr[7];
                short shortValue = ((Short) objArr[8]).shortValue();
                short shortValue2 = ((Short) objArr[9]).shortValue();
                String str8 = (String) objArr[10];
                String str9 = (String) objArr[11];
                String str10 = (String) objArr[12];
                String str11 = (String) objArr[13];
                byte[] f = this.f22547f.m28549f();
                String str12 = (String) objArr[14];
                String str13 = (String) objArr[15];
                dni dni = (dni) objArr[16];
                if (new czx(this.f22544c.b).m25913a()) {
                    rgVar = si.m34096c(rgVar);
                }
                dpc.m28568i();
                sq j = this.f22547f.m28553j();
                if (j != null) {
                    ss a = j.mo5518a("NMASCommand");
                    try {
                        this.f22548g = a.mo5523a("Name", this.f22554m).mo5523a("TransID", new Integer(this.f22543a).toString()).mo5521a();
                    } catch (sr e) {
                    }
                }
                dpk dpk = new dpk(str2, str, str3, str4, str5, str6, rgVar, str7, shortValue, shortValue2, str8, str9, str10, str11, f, str12, str13, dni);
                Vector vector = (Vector) ((doz) this.f22544c.m28584g()).m28514i();
                if (vector == null) {
                    f22542b.mo4277c((Object) "appendLogToQueryBegin: NMSPDefines.DEVICE_CMD_LOG_TO_SERVER_ENABLED is disabled");
                } else if (vector.size() == 0) {
                    f22542b.mo4277c((Object) "appendLogToQueryBegin: nmasResLogsToServer is empty, nothing to log to server");
                } else {
                    int size = vector.size();
                    dni dnd = new dnd();
                    dnj dng = new dng();
                    for (int i = 0; i < size; i++) {
                        C5033a c5033a = (C5033a) vector.elementAt(i);
                        if (c5033a.m28646a() != this.f22543a) {
                            dni dnd2 = new dnd();
                            dnd2.m28201a("id", c5033a.m28649b() + ":" + c5033a.m28646a(), (short) 193);
                            dnd2.m28201a(AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_STATUS, c5033a.m28650c().toString(), (short) 193);
                            dng.mo4466a(dnd2);
                            c5033a.m28651d();
                        }
                    }
                    dnd.mo4454a("device_log", dng);
                    dpk.mo4453a("app_info", dnd);
                }
                this.f22547f.m28540a((short) 2597, "SEND_BCP_BEGIN" + this.f22543a, dpk.m28627f(), null, this.f22543a, 0, this.f22544c, false);
                if (f != null) {
                    try {
                        if (!this.f22555n) {
                            this.f22555n = true;
                            f22542b.mo4275b("PDXCommandCreated() called from handleInit()" + dpt.m28661b(f) + ":" + this.f22543a + " (" + this + "," + this.f22545d + ")");
                            this.f22545d.mo4558a(dpt.m28661b(f) + ":" + this.f22543a);
                            return;
                        }
                        return;
                    } catch (Throwable th) {
                        f22542b.mo4281e("got exp in PDXCommandListener.PDXCommandCreated() [" + th.getClass().getName() + "] msg [" + th.getMessage() + "]");
                        return;
                    }
                }
                return;
            case (byte) 2:
                C5006j c5006j = (C5006j) obj3;
                if (((dpj) c5006j).m28620c() == Byte.MAX_VALUE) {
                    this.f22547f.m28532a(((dpr) c5006j).m28641a(), ((dpr) c5006j).m28643e(), this.f22544c);
                }
                dpc.m28568i();
                if (c5006j instanceof dpe) {
                    str = ((dpe) c5006j).m28619b();
                    int a2 = ((dpe) c5006j).m28621a();
                    if (this.f22548g != null) {
                        try {
                            this.f22548g.mo5518a("NMASAudioParameter").mo5523a("Name", str).mo5522a("AudioID", a2).mo5521a();
                        } catch (sr e2) {
                        }
                    }
                }
                this.f22547f.m28540a((short) 2585, "SEND_BCP_DATA", new dpn((dpj) c5006j).mo4538d(), null, this.f22543a, 0, this.f22544c, false);
                return;
            case (byte) 3:
                byte[] bArr = (byte[]) obj3;
                dpc.m28568i();
                this.f22547f.m28540a((short) 2585, "SEND_BCP_DATA", new dpg(bArr).mo4538d(), null, this.f22543a, 0, this.f22544c, false);
                return;
            case (byte) 4:
                dpc.m28568i();
                this.f22547f.m28540a((short) 2585, "SEND_BCP_DATA", new dpl().mo4538d(), null, this.f22543a, 0, this.f22544c, false);
                this.f22551j = new C50321(this);
                this.f22550i.mo4286a(this.f22551j, this.f22552k);
                return;
            case (byte) 5:
                this.f22546e.mo4562a((short) 4);
                return;
            case (byte) 6:
                C5034a c5034a = (C5034a) obj3;
                C5033a c5033a2 = this.f22556o;
                if (c5033a2 != null) {
                    c5033a2.m28647a(c5034a);
                    return;
                }
                return;
            default:
                return;
        }
    }

    /* renamed from: a */
    public final void mo4545a(C5006j c5006j) throws dno, dnp {
        if (f22542b.mo4276b()) {
            f22542b.mo4275b((Object) "PDXTransactionImpl.sendParam()");
        }
        if (c5006j == null) {
            throw new NullPointerException("Parameter cannot be null");
        }
        synchronized (this.f22557p) {
            if (this.f22549h == (short) -1) {
                f22542b.mo4281e("PDXTransactionImpl.sendParam() transaction already finished!");
                throw new dno("transaction already finished!");
            }
            if (this.f22549h == (short) 0) {
                rl rlVar = this.f22550i;
                C5721a c5721a = new C5721a((byte) 2, c5006j);
                Thread currentThread = Thread.currentThread();
                this.f22550i.mo4288a();
                rlVar.mo4285a(c5721a, this, currentThread);
            } else if (this.f22549h == (short) 1) {
                f22542b.mo4281e("PDXTransactionImpl.sendParam() transaction already finished!");
                throw new dno("transaction already finished!");
            } else if (this.f22549h == (short) 2) {
                f22542b.mo4281e("PDXTransactionImpl.sendParam() transaction already expired!");
                throw new dnp("transaction already expired!");
            }
        }
    }

    /* renamed from: a */
    public final void m28674a(short s) {
        if (f22542b.mo4276b()) {
            f22542b.mo4275b("PDXTransactionImpl.onSessionDisconnected() " + s);
        }
        synchronized (this.f22557p) {
            if (this.f22549h == (short) 1 && this.f22551j != null) {
                this.f22550i.mo4287a(this.f22551j);
            }
            if (this.f22549h == (short) 2) {
                return;
            }
            if (s == (short) 0) {
                try {
                    if (this.f22549h != (short) -1) {
                        dpt.m28663b(this.f22556o, "REMOTE_DISC");
                        this.f22546e.mo4562a((short) 3);
                    }
                } catch (Throwable th) {
                    f22542b.mo4281e("got exp in PDXCommandListener.PDXCommandEvent() or PDXManagerListener.PDXManagerError() or PDXManagerListener.PDXManagerDisconnected() reasonCode [" + s + "] [" + th.getClass().getName() + "] msg [" + th.getMessage() + "]");
                }
            } else if (s == (short) 1) {
                if (this.f22549h != (short) -1) {
                    this.f22546e.mo4562a((short) 4);
                }
            } else if (s == (short) 3) {
                if (this.f22549h != (short) -1) {
                    dpt.m28663b(this.f22556o, "TIMEOUT_IDLE");
                    this.f22546e.mo4562a((short) 5);
                }
            } else if (s == (short) 4) {
                if (this.f22549h != (short) -1) {
                    dpt.m28663b(this.f22556o, "CONN_FAILED");
                    this.f22545d.mo4557a();
                }
            } else if (s == (short) 5) {
                if (this.f22549h != (short) -1) {
                    dpt.m28663b(this.f22556o, "CONN_FAILED");
                    this.f22545d.mo4557a();
                }
            } else if (s == (short) 6) {
                if (this.f22549h != (short) -1) {
                    dpt.m28663b(this.f22556o, "REMOTE_DISC");
                    this.f22546e.mo4562a((short) 3);
                }
            } else if (s == (short) 7) {
                if (this.f22549h != (short) -1) {
                    dpt.m28663b(this.f22556o, "CONN_FAILED");
                    this.f22545d.mo4557a();
                }
            } else if (s == (short) 8 && this.f22549h != (short) -1) {
                dpt.m28663b(this.f22556o, "REMOTE_DISC");
                this.f22546e.mo4562a((short) 3);
            }
            this.f22549h = (short) 2;
        }
    }

    /* renamed from: a */
    public final void m28675a(byte[] bArr) {
        if (f22542b.mo4276b()) {
            f22542b.mo4275b((Object) "PDXTransactionImpl.onSessionConnected()");
        }
        synchronized (this.f22557p) {
            if (this.f22549h == (short) 0 || this.f22549h == (short) 1) {
                try {
                    String b = dpt.m28661b(bArr);
                    C5033a c5033a = this.f22556o;
                    if (c5033a != null) {
                        c5033a.m28648a(b);
                    }
                    if (!this.f22555n) {
                        this.f22555n = true;
                        f22542b.mo4275b("PDXCommandCreated() called from onSessionConnected()" + b + ":" + this.f22543a + " (" + this + "," + this.f22545d + ")");
                        this.f22545d.mo4558a(b + ":" + this.f22543a);
                    }
                } catch (Throwable th) {
                    f22542b.mo4281e("got exp in PDXCommandListener.PDXCommandCreated() [" + th.getClass().getName() + "] msg [" + th.getMessage() + "]");
                }
            }
        }
    }

    /* renamed from: b */
    public final void m28676b() {
        m28680f();
    }

    /* renamed from: c */
    public final void m28677c() {
        m28680f();
    }

    /* renamed from: d */
    public final void m28678d() {
        m28680f();
    }

    /* renamed from: e */
    public final void m28679e() {
        synchronized (this.f22557p) {
            if (this.f22549h == (short) 1 && this.f22551j != null) {
                this.f22550i.mo4287a(this.f22551j);
            }
            if (this.f22549h == (short) 2) {
                return;
            }
            if (this.f22549h != (short) -1) {
                if (!this.f22553l) {
                    m28659a("CommandAbort");
                }
                rl rlVar = this.f22550i;
                C5721a c5721a = new C5721a((byte) 5, null);
                Thread currentThread = Thread.currentThread();
                this.f22550i.mo4288a();
                rlVar.mo4285a(c5721a, this, currentThread);
            }
            this.f22549h = (short) 2;
        }
    }

    /* renamed from: f */
    protected final void m28680f() {
        if (this.f22551j != null) {
            this.f22550i.mo4287a(this.f22551j);
            this.f22550i.mo4286a(this.f22551j, this.f22552k);
        }
    }
}
