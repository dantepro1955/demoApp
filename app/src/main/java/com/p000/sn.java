package com.p000;

import com.facebook.internal.ServerProtocol;
import java.util.Enumeration;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Vector;
import p000.dnm.C5007a;
import p000.rl.C4177b;
import p000.rl.C5721a;
import p000.sa.C5753a;
import p000.sa.C5754b;
import p000.sa.C5755c;
import p000.sa.C5756d;
import p000.sa.C5757e;
import p000.sa.C5758f;
import p000.sx.C5762a;

/* renamed from: sn */
public class sn implements C4177b, C5753a, C5756d, C5757e, C5758f {
    /* renamed from: c */
    private static rk f25474c = dnn.m28258a(sn.class);
    /* renamed from: A */
    private C5031a f25475A;
    /* renamed from: B */
    private sq f25476B;
    /* renamed from: C */
    private sx f25477C = null;
    /* renamed from: D */
    private Queue f25478D = new LinkedList();
    /* renamed from: E */
    private Queue f25479E = new LinkedList();
    /* renamed from: a */
    protected byte f25480a;
    /* renamed from: b */
    public byte[] f25481b;
    /* renamed from: d */
    private sb f25482d;
    /* renamed from: e */
    private int f25483e = 30;
    /* renamed from: f */
    private sb f25484f;
    /* renamed from: g */
    private int f25485g = 50;
    /* renamed from: h */
    private sb f25486h;
    /* renamed from: i */
    private String f25487i = null;
    /* renamed from: j */
    private short f25488j = (short) 0;
    /* renamed from: k */
    private Vector f25489k;
    /* renamed from: l */
    private boolean f25490l = false;
    /* renamed from: m */
    private Vector f25491m = null;
    /* renamed from: n */
    private rl f25492n = null;
    /* renamed from: o */
    private Object f25493o;
    /* renamed from: p */
    private sd f25494p = null;
    /* renamed from: q */
    private short f25495q = (short) 0;
    /* renamed from: r */
    private short f25496r = (short) 9;
    /* renamed from: s */
    private String f25497s = "Not specified";
    /* renamed from: t */
    private String f25498t = "Not specified";
    /* renamed from: u */
    private byte[] f25499u = null;
    /* renamed from: v */
    private sa f25500v = null;
    /* renamed from: w */
    private String f25501w = "";
    /* renamed from: x */
    private int f25502x;
    /* renamed from: y */
    private short f25503y;
    /* renamed from: z */
    private short f25504z;

    /* renamed from: sn$a */
    public interface C5031a {
        /* renamed from: a */
        void mo4509a();

        /* renamed from: a */
        void mo4510a(String str);

        /* renamed from: a */
        void mo4511a(sd sdVar, byte[] bArr);

        /* renamed from: a */
        void mo4512a(short s, short s2);

        /* renamed from: b */
        void mo4513b(String str);
    }

    /* renamed from: sn$1 */
    class C57591 implements sb {
        /* renamed from: a */
        private /* synthetic */ sn f25464a;

        C57591(sn snVar) {
            this.f25464a = snVar;
        }

        public final void run() {
            try {
                this.f25464a.f25495q = (short) 3;
                if (sn.f25474c.mo4282e()) {
                    sn.f25474c.mo4281e("Session Idle for too long, longer than [" + this.f25464a.f25485g + "] ()");
                }
                this.f25464a.f25480a = (byte) 2;
                this.f25464a.m34100a((byte) 4, null);
            } catch (Exception e) {
                if (sn.f25474c.mo4282e()) {
                    sn.f25474c.mo4281e("XMode.sendXModeMsg() " + e.getClass().getName() + " " + e.getMessage());
                }
            }
        }
    }

    /* renamed from: sn$2 */
    class C57602 implements sb {
        /* renamed from: a */
        private /* synthetic */ sn f25465a;

        C57602(sn snVar) {
            this.f25465a = snVar;
        }

        public final void run() {
            try {
                this.f25465a.m34100a((byte) 5, null);
            } catch (Exception e) {
                if (sn.f25474c.mo4282e()) {
                    sn.f25474c.mo4281e("XMode.readSocketCallback() " + e.getClass().getName() + " " + e.getMessage());
                }
            }
        }
    }

    /* renamed from: sn$3 */
    class C57613 implements sb {
        /* renamed from: a */
        private /* synthetic */ sn f25466a;

        C57613(sn snVar) {
            this.f25466a = snVar;
        }

        public final void run() {
            try {
                this.f25466a.m34100a((byte) 6, null);
            } catch (Exception e) {
                if (sn.f25474c.mo4282e()) {
                    sn.f25474c.mo4281e("XMode.readSocketCallback() " + e.getClass().getName() + " " + e.getMessage());
                }
            }
        }
    }

    /* renamed from: sn$4 */
    class C57634 implements C5762a {
        /* renamed from: a */
        private /* synthetic */ sn f25467a;

        C57634(sn snVar) {
            this.f25467a = snVar;
        }

        /* renamed from: a */
        public final void mo5512a(String str) {
            this.f25467a.m34100a((byte) 7, (Object) str);
        }
    }

    /* renamed from: sn$5 */
    class C57645 implements sb {
        /* renamed from: a */
        private /* synthetic */ sn f25468a;

        C57645(sn snVar) {
            this.f25468a = snVar;
        }

        public final void run() {
            try {
                if (sn.f25474c.mo4282e()) {
                    sn.f25474c.mo4281e("XMode.handleSendCopConnect() COP CONNECT timed out. ");
                }
                if (this.f25468a.f25477C != null) {
                    this.f25468a.f25477C.m34167b();
                    this.f25468a.f25477C = null;
                }
                this.f25468a.m34100a((byte) 9, null);
            } catch (Exception e) {
                if (sn.f25474c.mo4282e()) {
                    sn.f25474c.mo4281e("XMode.handleSendCopConnect() " + e.getClass().getName() + " " + e.getMessage());
                }
            }
        }
    }

    /* renamed from: sn$6 */
    class C57656 implements sb {
        /* renamed from: a */
        private /* synthetic */ sn f25469a;

        C57656(sn snVar) {
            this.f25469a = snVar;
        }

        public final void run() {
            try {
                this.f25469a.f25495q = (short) 3;
                if (sn.f25474c.mo4282e()) {
                    sn.f25474c.mo4281e("Session Idle for too long, longer than [" + this.f25469a.f25485g + "] (initiated from XMode.parseCopConnected)");
                }
                this.f25469a.f25480a = (byte) 2;
                this.f25469a.m34100a((byte) 4, null);
            } catch (Exception e) {
                if (sn.f25474c.mo4282e()) {
                    sn.f25474c.mo4281e("XMode.parseXModeMsg() " + e.getClass().getName() + " " + e.getMessage());
                }
            }
        }
    }

    /* renamed from: sn$7 */
    class C57667 implements sb {
        /* renamed from: a */
        private /* synthetic */ sn f25470a;

        C57667(sn snVar) {
            this.f25470a = snVar;
        }

        public final void run() {
            try {
                this.f25470a.f25495q = (short) 3;
                if (sn.f25474c.mo4282e()) {
                    sn.f25474c.mo4281e("Session Idle for too long, longer than [" + this.f25470a.f25485g + "] (initiated from XMode.parseBcp)");
                }
                this.f25470a.f25480a = (byte) 2;
                this.f25470a.m34100a((byte) 4, null);
            } catch (Exception e) {
                if (sn.f25474c.mo4282e()) {
                    sn.f25474c.mo4281e("XMode.parseXModeMsg() " + e.getClass().getName() + " " + e.getMessage());
                }
            }
        }
    }

    /* renamed from: sn$8 */
    class C57678 implements sb {
        /* renamed from: a */
        private /* synthetic */ sn f25471a;

        C57678(sn snVar) {
            this.f25471a = snVar;
        }

        public final void run() {
            try {
                this.f25471a.f25495q = (short) 3;
                if (sn.f25474c.mo4282e()) {
                    sn.f25474c.mo4281e("Session Idle for too long, longer than [" + this.f25471a.f25485g + "] (initiated from XMode.parseVap)");
                }
                this.f25471a.f25480a = (byte) 2;
                this.f25471a.m34100a((byte) 4, null);
            } catch (Exception e) {
                if (sn.f25474c.mo4282e()) {
                    sn.f25474c.mo4281e("XMode.parseXModeMsg() " + e.getClass().getName() + " " + e.getMessage());
                }
            }
        }
    }

    /* renamed from: sn$b */
    class C5768b {
        /* renamed from: a */
        byte[] f25472a;
        /* renamed from: b */
        Object f25473b;

        public C5768b(byte[] bArr, Object obj) {
            this.f25472a = bArr;
            this.f25473b = obj;
        }
    }

    public sn(String str, short s, String str2, byte[] bArr, String str3, C5031a c5031a, Vector vector, rl rlVar) {
        this.f25487i = str;
        this.f25488j = s;
        this.f25497s = str2;
        this.f25499u = bArr;
        this.f25498t = str3;
        this.f25475A = c5031a;
        if (vector != null) {
            this.f25489k = vector;
        } else {
            this.f25489k = new Vector();
        }
        this.f25492n = rlVar;
        if (f25474c.mo4276b()) {
            f25474c.mo4275b("XMode() server: " + str + " port: " + s);
        }
        Enumeration elements = vector.elements();
        while (elements.hasMoreElements()) {
            dnm dnm = (dnm) elements.nextElement();
            if (f25474c.mo4276b()) {
                f25474c.mo4275b("XMode() " + dnm.m28251d() + " : " + dnm.m28248a() + " = " + new String(dnm.m28249b()));
            }
            if (dnm.m28251d() == C5007a.f22310a) {
                if (dnm.m28248a().equals("IdleSessionTimeout")) {
                    int parseInt = Integer.parseInt(new String(dnm.m28249b()));
                    if (parseInt > 0) {
                        this.f25485g = parseInt;
                    }
                } else if (dnm.m28248a().equals("ConnectionTimeout")) {
                    this.f25483e = Integer.parseInt(new String(dnm.m28249b()));
                } else if (dnm.m28248a().equals("SSL_Socket_Enable") || dnm.m28248a().equals("SSL_Cert_Summary") || dnm.m28248a().equals("SSL_Cert_Data") || dnm.m28248a().equals("SSL_SelfSigned_Cert")) {
                    if (dnm.m28248a().equals("SSL_Socket_Enable") && (new String(dnm.m28249b()).equals("TRUE") || new String(dnm.m28249b()).equals(ServerProtocol.DIALOG_RETURN_SCOPES_TRUE))) {
                        this.f25490l = true;
                    }
                    if (this.f25491m == null) {
                        this.f25491m = new Vector();
                    }
                    this.f25491m.addElement(dnm);
                }
            }
        }
        this.f25480a = (byte) 3;
    }

    /* renamed from: a */
    private void m34100a(byte b, Object obj) {
        try {
            rl rlVar = this.f25492n;
            C5721a c5721a = new C5721a(b, obj);
            Thread currentThread = Thread.currentThread();
            this.f25492n.mo4288a();
            rlVar.mo4285a(c5721a, this, currentThread);
        } catch (Exception e) {
            if (f25474c.mo4282e()) {
                f25474c.mo4281e("XMode.sendCmdMsg() " + e.getMessage());
            }
        }
    }

    /* renamed from: a */
    private void m34101a(String str) {
        if (this.f25476B != null) {
            this.f25476B.mo5518a(str).mo5521a();
        }
    }

    /* renamed from: a */
    private void m34102a(sd sdVar, byte[] bArr) {
        if (f25474c.mo4276b()) {
            f25474c.mo4275b("XMode.parseXModeMsg() protocol: " + sdVar.f25456a + " cmd: " + sdVar.f25457b);
        }
        st stVar;
        switch (sdVar.f25456a) {
            case (byte) 1:
                if (this.f25486h != null && this.f25492n.mo4287a(this.f25486h)) {
                    this.f25486h = new C57678(this);
                    this.f25492n.mo4286a(this.f25486h, (long) (this.f25485g * 1000));
                }
                this.f25475A.mo4511a(sdVar, bArr);
                return;
            case (byte) 2:
                if (this.f25486h != null && this.f25492n.mo4287a(this.f25486h)) {
                    this.f25486h = new C57667(this);
                    this.f25492n.mo4286a(this.f25486h, (long) (this.f25485g * 1000));
                }
                if (sdVar.f25457b == (short) 2641) {
                    int b = sf.m34090b(bArr, 17);
                    short a = sf.m34087a(bArr, 21);
                    stVar = (st) ((sy) this.f25476B).m34147e();
                    if (a == (short) 0 || a == (short) 1 || a == (short) 3) {
                        stVar.m34131a(b);
                        return;
                    } else if (f25474c.mo4282e()) {
                        f25474c.mo4281e("XMode.parseXModeMsgBcpLogResponse() XMODE_BCP_LOG_WRITE_ERROR. ");
                        return;
                    } else {
                        return;
                    }
                }
                this.f25475A.mo4511a(sdVar, bArr);
                return;
            case (byte) 3:
                switch (sdVar.f25457b) {
                    case (short) 257:
                        this.f25492n.mo4287a(this.f25484f);
                        if (this.f25477C != null) {
                            this.f25477C.mo5521a();
                            this.f25477C = null;
                        }
                        this.f25481b = new byte[16];
                        System.arraycopy(bArr, 0, this.f25481b, 0, 16);
                        rl rlVar = this.f25492n;
                        byte[] bArr2 = this.f25481b;
                        sa saVar = this.f25500v;
                        Object obj = this.f25493o;
                        bArr2 = this.f25481b;
                        if (this.f25476B != null) {
                            stVar = (st) ((sy) this.f25476B).m34147e();
                            if (stVar != null) {
                                stVar.m34141c();
                            }
                        }
                        this.f25501w = rk.m25942b(this.f25481b);
                        rk rkVar = f25474c;
                        String str = this.f25501w;
                        rkVar.mo4283f();
                        try {
                            if (f25474c.mo4276b()) {
                                f25474c.mo4275b("Received COP_Connected " + this.f25501w);
                            }
                            m34100a((byte) 10, null);
                            m34101a("SocketOpened");
                            this.f25486h = new C57656(this);
                            this.f25492n.mo4286a(this.f25486h, (long) (this.f25485g * 1000));
                            break;
                        } finally {
                            f25474c.mo4284g();
                        }
                    case (short) 258:
                        this.f25502x = sf.m34090b(bArr, 0);
                        m34100a((byte) 8, null);
                        break;
                    case (short) 512:
                        if (this.f25486h != null) {
                            this.f25492n.mo4287a(this.f25486h);
                        }
                        this.f25496r = sf.m34087a(bArr, 0);
                        this.f25480a = (byte) 2;
                        this.f25495q = (short) 6;
                        if (f25474c.mo4280d()) {
                            f25474c.mo4279d("XMode.parseXModeMsgCopDisconnect() Received COP DISCONNECT. ");
                        }
                        m34100a((byte) 4, null);
                        break;
                    case (short) 768:
                        short a2 = sf.m34087a(bArr, 0);
                        sf.m34090b(bArr, 2);
                        this.f25495q = (short) 7;
                        this.f25496r = a2;
                        this.f25480a = (byte) 2;
                        if (f25474c.mo4282e()) {
                            f25474c.mo4281e("XMode.parseXModeMsgCopConnectFailed() COP CONNECT failure. ");
                        }
                        m34100a((byte) 4, null);
                        break;
                }
                this.f25475A.mo4511a(sdVar, bArr);
                return;
            case (byte) 15:
                return;
            default:
                if (f25474c.mo4282e()) {
                    f25474c.mo4281e("XMode.parseXModeMsg() unknown protocol: " + Integer.toHexString(sdVar.f25456a));
                    return;
                }
                return;
        }
    }

    /* renamed from: a */
    public final void mo5513a() {
        if (f25474c.mo4276b()) {
            f25474c.mo4275b("XMode.closeSocketCallback() " + this.f25501w);
        }
        this.f25480a = (byte) 3;
        if (this.f25482d != null) {
            this.f25492n.mo4287a(this.f25482d);
            this.f25482d = null;
        }
        if (this.f25486h != null) {
            this.f25492n.mo4287a(this.f25486h);
            this.f25486h = null;
        }
        if (this.f25493o != null) {
            this.f25475A.mo4512a(this.f25495q, this.f25496r);
        }
        if (this.f25476B != null) {
            st stVar = (st) ((sy) this.f25476B).m34147e();
            if (stVar != null) {
                stVar.mo4512a(this.f25495q, this.f25496r);
            }
        }
        this.f25493o = null;
        this.f25500v = null;
        this.f25481b = null;
        this.f25501w = "";
    }

    /* renamed from: a */
    public final void m34109a(int i) {
        if (f25474c.mo4276b()) {
            f25474c.mo4275b("XMode.startStreaming() audio id: " + i);
        }
        if (this.f25480a == (byte) 1) {
            byte[] bArr = new byte[6];
            sf.m34088a(i, bArr, 0);
            sf.m34089a(this.f25503y, bArr, 4);
            m34117a(sc.m34083a((byte) 1, (byte) 18, (short) 257, bArr), 3, (Object) "SEND_VAP_RECORD_BEGIN");
        }
    }

    /* renamed from: a */
    public final void mo3863a(Object obj, Object obj2) {
        C5721a c5721a = (C5721a) obj;
        byte[] bArr;
        Object bytes;
        switch (c5721a.f25336a) {
            case (byte) 1:
                if (f25474c.mo4276b()) {
                    f25474c.mo4275b((Object) "XMode.handleMessage() CMD_CONNECT");
                }
                if (this.f25480a == (byte) 0) {
                    m34100a((byte) 3, null);
                    return;
                } else {
                    this.f25475A.mo4512a(this.f25495q, this.f25496r);
                    return;
                }
            case (byte) 2:
                if (f25474c.mo4276b()) {
                    f25474c.mo4275b((Object) "XMode.handleMessage() CMD_DISCONNECT");
                }
                bArr = new byte[2];
                sf.m34089a((short) 0, bArr, 0);
                bArr = sc.m34083a((byte) 3, (byte) 23, (short) 512, bArr);
                this.f25500v.mo4298b(this.f25493o);
                m34117a(bArr, 3, (Object) "SEND_COP_DISCONNECT");
                return;
            case (byte) 3:
                if (f25474c.mo4276b()) {
                    f25474c.mo4275b((Object) "XMode.handleMessage() CMD_OPEN_SOCKET");
                }
                if (this.f25480a == (byte) 0) {
                    this.f25500v = new dad(this.f25492n);
                    if (this.f25490l) {
                        this.f25500v.mo4296a(this.f25487i, this.f25488j, this.f25491m, (C5756d) this, (C5753a) this);
                        return;
                    } else {
                        this.f25500v.mo4297a(this.f25487i, this.f25488j, this, this);
                        return;
                    }
                }
                this.f25475A.mo4512a(this.f25495q, this.f25496r);
                return;
            case (byte) 4:
                if (f25474c.mo4276b()) {
                    f25474c.mo4275b((Object) "XMode.handleMessage() CMD_CLOSE_SOCKET");
                }
                if (this.f25500v != null && this.f25493o != null) {
                    this.f25500v.mo4295a(this.f25493o);
                    return;
                }
                return;
            case (byte) 5:
                if (this.f25500v != null && this.f25493o != null) {
                    this.f25500v.mo4293a(this.f25493o, C5754b.f25450a, new byte[8], 8, this, "READ_XMODE_HEADER");
                    return;
                }
                return;
            case (byte) 6:
                if (this.f25494p.f25458c > 0 && this.f25494p.f25458c <= 512000) {
                    byte[] bArr2 = new byte[this.f25494p.f25458c];
                    if (this.f25500v != null && this.f25493o != null) {
                        this.f25500v.mo4293a(this.f25493o, C5754b.f25450a, bArr2, bArr2.length, this, "READ_XMODE_PAYLOAD");
                        return;
                    }
                    return;
                }
                return;
            case (byte) 7:
                if (f25474c.mo4276b()) {
                    f25474c.mo4275b((Object) "XMode.handleMessage() CMD_COP_CONNECT");
                }
                if (this.f25480a == (byte) 0) {
                    int i;
                    String str = (String) c5721a.f25337b;
                    str = "<?xml version=\"1.0\"?><cc><s></s><t>7</t><b>20091023</b><tsc>" + this.f25503y + "</tsc><fsc>" + this.f25504z + "</fsc><nmaid>" + this.f25497s + "</nmaid><uid>" + this.f25498t + "</uid>" + (str != null ? "<rootlog>" + str + "</rootlog>" : "");
                    Enumeration elements = this.f25489k.elements();
                    String str2 = str;
                    int i2 = 0;
                    while (elements.hasMoreElements()) {
                        String str3;
                        String str4;
                        dnm dnm = (dnm) elements.nextElement();
                        if (dnm.m28251d() == C5007a.f22311b) {
                            str2 = str2 + "<nmsp p=\"" + dnm.m28248a() + "\" v=\"" + si.m34091a(new String(dnm.m28249b())) + "\"/>";
                            if (dnm.m28248a().equals("Ping_IntervalSecs")) {
                                str3 = str2;
                                i = 1;
                                str4 = str3;
                                str = dnm.m28251d() != C5007a.f22312c ? str4 + "<app p=\"" + dnm.m28248a() + "\" v=\"" + si.m34091a(new String(dnm.m28249b())) + "\"/>" : str4;
                                i2 = i;
                                str2 = str;
                            }
                        }
                        str3 = str2;
                        i = i2;
                        str4 = str3;
                        if (dnm.m28251d() != C5007a.f22312c) {
                        }
                        i2 = i;
                        str2 = str;
                    }
                    if (i2 == 0) {
                        str2 = str2 + "<nmsp p=\"Ping_IntervalSecs\" v=\"0\"/>";
                    }
                    bytes = (str2 + "</cc>").getBytes();
                    i = bytes.length;
                    i2 = (i + 4) + 1;
                    byte[] bArr3 = new byte[i2];
                    sf.m34088a(i2 - 4, bArr3, 0);
                    bArr3[4] = (byte) 0;
                    System.arraycopy(bytes, 0, bArr3, 5, i);
                    m34117a(sc.m34083a((byte) 3, (byte) 23, (short) 256, bArr3), 3, (Object) "SEND_COP_CONNECT");
                    this.f25484f = new C57645(this);
                    this.f25492n.mo4286a(this.f25484f, (long) (this.f25483e * 1000));
                    this.f25480a = (byte) 1;
                    this.f25475A.mo4509a();
                    return;
                }
                return;
            case (byte) 8:
                if (f25474c.mo4276b()) {
                    f25474c.mo4275b((Object) "XMode.handleMessage() CMD_COP_PING_RESPONSE");
                }
                bArr = new byte[8];
                sf.m34088a(this.f25502x, bArr, 0);
                sf.m34088a(0, bArr, 4);
                m34117a(sc.m34083a((byte) 3, (byte) 23, (short) 259, bArr), 3, (Object) "SEND_COP_PING_RESPONSE");
                return;
            case (byte) 9:
                if (f25474c.mo4276b()) {
                    f25474c.mo4275b((Object) "XMode.handleMessage() CMD_COP_CONNECT_TIMED_OUT");
                }
                if (this.f25480a == (byte) 1) {
                    this.f25480a = (byte) 2;
                    this.f25495q = (short) 5;
                    if (f25474c.mo4282e()) {
                        f25474c.mo4281e("XMode.handleCopConnectTimeout() COP CONNECT timed out. ");
                    }
                    m34100a((byte) 4, null);
                    return;
                }
                return;
            case (byte) 10:
                if (f25474c.mo4276b()) {
                    f25474c.mo4275b((Object) "XMode.handleMessage() CMD_COP_CONFIRM");
                }
                bytes = rm.m25987b(this.f25499u, this.f25481b);
                byte[] bArr4 = new byte[(bytes.length + 4)];
                sf.m34088a(bytes.length, bArr4, 0);
                System.arraycopy(bytes, 0, bArr4, 4, bytes.length);
                m34117a(sc.m34083a((byte) 3, (byte) 23, (short) 262, bArr4), 3, (Object) "SEND_COP_CONFIRM");
                return;
            case (byte) 11:
                this.f25475A.mo4510a((String) c5721a.f25337b);
                return;
            case (byte) 12:
                this.f25475A.mo4513b((String) c5721a.f25337b);
                return;
            case (byte) 13:
                if (f25474c.mo4276b()) {
                    f25474c.mo4275b((Object) "XMode.handleMessage() CMD_GENERATE_COP_REF_ID");
                }
                this.f25477C = sx.m34161a((sy) ((sy) this.f25476B).m34148f(), "NMSP_GATEWAY", new C57634(this));
                return;
            case (byte) 14:
                if (f25474c.mo4276b()) {
                    f25474c.mo4275b((Object) "XMode.handleMessage() CMD_SEND_LOW_PRIORITY_MSG");
                }
                m34117a(null, 2, null);
                return;
            default:
                return;
        }
    }

    /* renamed from: a */
    public final void mo5514a(C5755c c5755c, Object obj) {
        if (f25474c.mo4276b()) {
            f25474c.mo4275b((Object) "XMode.openSocketCallback() ");
        }
        if (c5755c == C5755c.f25451a) {
            this.f25493o = obj;
            if (this.f25480a != (byte) 0) {
                this.f25480a = (byte) 2;
                this.f25500v.mo4295a(this.f25493o);
            } else if (this.f25476B == null) {
                m34100a((byte) 7, null);
            } else {
                m34100a((byte) 13, null);
            }
        } else if (c5755c == C5755c.f25452b) {
            if (f25474c.mo4282e()) {
                f25474c.mo4281e("XMode.openSocketCallback() NETWORK_ERROR");
            }
            this.f25480a = (byte) 3;
            this.f25495q = (short) 4;
            this.f25475A.mo4512a(this.f25495q, this.f25496r);
            this.f25493o = null;
            this.f25500v = null;
            this.f25481b = null;
            this.f25501w = "";
        } else if (c5755c == C5755c.f25453c) {
            this.f25495q = (short) 4;
            if (f25474c.mo4282e()) {
                f25474c.mo4281e("XMode.openSocketCallback() NETWORK_MEMORY_ERROR");
            }
        }
    }

    /* renamed from: a */
    public final void mo5515a(C5755c c5755c, Object obj, int i, int i2, Object obj2) {
        int i3 = 0;
        Object obj3 = (String) ((C5768b) obj2).f25473b;
        if (c5755c == C5755c.f25451a && i == i2) {
            if (obj3.equals("SEND_COP_CONNECT")) {
                m34100a((byte) 5, null);
            } else if (obj3.equals("SEND_COP_DISCONNECT")) {
                this.f25500v.mo4295a(obj);
            }
            m34100a((byte) 11, obj3);
            this.f25478D.remove(obj2);
            if (this.f25478D.size() == 0 && this.f25479E.size() > 0) {
                m34100a((byte) 14, null);
            }
        } else if (c5755c == C5755c.f25452b) {
            if (!(this.f25495q == (short) 1 || this.f25495q == (short) 3)) {
                this.f25495q = (short) 8;
                if (f25474c.mo4282e()) {
                    f25474c.mo4281e("XMode.writeSocketCallback() NETWORK_ERROR");
                }
            }
            m34100a((byte) 12, obj3);
            this.f25478D.remove(obj2);
            if (this.f25478D.size() == 0) {
                r2 = this.f25479E.size();
                while (i3 < r2) {
                    m34100a((byte) 12, ((C5768b) this.f25479E.remove()).f25473b);
                    i3++;
                }
            }
        } else if (c5755c == C5755c.f25453c) {
            if (!(this.f25495q == (short) 1 || this.f25495q == (short) 3)) {
                this.f25495q = (short) 8;
                if (f25474c.mo4282e()) {
                    f25474c.mo4281e("XMode.writeSocketCallback() NETWORK_MEMORY_ERROR");
                }
            }
            m34100a((byte) 12, obj3);
            this.f25478D.remove(obj2);
            if (this.f25478D.size() == 0) {
                r2 = this.f25479E.size();
                while (i3 < r2) {
                    m34100a((byte) 12, ((C5768b) this.f25479E.remove()).f25473b);
                    i3++;
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo5516a(C5755c c5755c, Object obj, byte[] bArr, int i, int i2, Object obj2) {
        String str = (String) obj2;
        if (f25474c.mo4276b()) {
            f25474c.mo4275b((Object) "Read callback");
        }
        if (f25474c.mo4274a()) {
            f25474c.m25946a(bArr);
        }
        if (c5755c == C5755c.f25451a) {
            if (str.equals("READ_XMODE_HEADER")) {
                if (i2 == 0) {
                    this.f25482d = new C57602(this);
                    this.f25492n.mo4286a(this.f25482d, 20);
                } else if (i2 == i) {
                    this.f25494p = new sd(bArr);
                    if (this.f25494p.f25458c == 0) {
                        m34102a(this.f25494p, null);
                        m34100a((byte) 5, null);
                    } else if (this.f25494p.f25458c > 512000 || this.f25494p.f25458c < 0) {
                        this.f25500v.mo4298b(obj);
                        m34100a((byte) 5, null);
                    } else {
                        m34100a((byte) 6, null);
                    }
                } else if (f25474c.mo4282e()) {
                    f25474c.mo4281e("----***---- readSocketCallback fatal error in readSocketCallback NET_CONTEXT_READ_XMODE_HEADER bytesRead:[" + i2 + "] bufferLen:[" + i + "]");
                }
            } else if (!str.equals("READ_XMODE_PAYLOAD")) {
            } else {
                if (i2 == 0) {
                    if (f25474c.mo4276b()) {
                        f25474c.mo4275b(Integer.toHexString(this.f25494p.f25457b) + " payload not read bytesRead is 0");
                    }
                    this.f25482d = new C57613(this);
                    this.f25492n.mo4286a(this.f25482d, 20);
                } else if (i2 == i) {
                    if (this.f25494p.f25458c <= i) {
                        m34102a(this.f25494p, bArr);
                    }
                    m34100a((byte) 5, null);
                } else if (f25474c.mo4282e()) {
                    f25474c.mo4281e("----***---- readSocketCallback fatal error in readSocketCallback NET_CONTEXT_READ_XMODE_PAYLOAD bytesRead:[" + i2 + "] bufferLen:[" + i + "]");
                }
            }
        } else if (c5755c == C5755c.f25452b) {
            if (!(this.f25495q == (short) 1 || this.f25495q == (short) 3 || this.f25495q == (short) 6)) {
                this.f25495q = (short) 8;
                if (f25474c.mo4282e()) {
                    f25474c.mo4281e("XMode.readSocketCallback() NETWORK_ERROR");
                }
            }
            m34100a((byte) 4, null);
        } else if (c5755c == C5755c.f25453c && this.f25495q != (short) 1 && this.f25495q != (short) 3) {
            this.f25495q = (short) 8;
            if (f25474c.mo4282e()) {
                f25474c.mo4281e("XMode.readSocketCallback() NETWORK_MEMORY_ERROR");
            }
        }
    }

    /* renamed from: a */
    public final void m34114a(sq sqVar) {
        if (sqVar != null) {
            this.f25476B = sqVar.mo5518a("NMSPSocket").mo5521a();
        }
    }

    /* renamed from: a */
    public final void m34115a(short s, short s2) {
        if (f25474c.mo4276b()) {
            f25474c.mo4275b("XMode.connect() codec: " + s2);
        }
        if (this.f25480a != (byte) 1 && this.f25480a != (byte) 0) {
            if (this.f25480a == (byte) 2) {
                if (this.f25482d != null) {
                    this.f25492n.mo4287a(this.f25482d);
                }
                if (this.f25486h != null) {
                    this.f25492n.mo4287a(this.f25486h);
                }
                m34101a("OpenSocket");
                this.f25493o = null;
                this.f25500v = null;
                this.f25481b = null;
                this.f25501w = "";
                this.f25503y = s;
                this.f25504z = s2;
                this.f25480a = (byte) 0;
                m34100a((byte) 1, null);
            } else if (this.f25480a == (byte) 3) {
                m34101a("OpenSocket");
                this.f25503y = s;
                this.f25504z = s2;
                this.f25480a = (byte) 0;
                m34100a((byte) 1, null);
            }
        }
    }

    /* renamed from: a */
    public final void m34116a(byte[] bArr, int i) {
        if (f25474c.mo4276b()) {
            f25474c.mo4275b("XMode.sendVapRecordMsg() audio id: " + i);
        }
        if (this.f25480a == (byte) 1) {
            int length = bArr.length;
            byte[] bArr2 = new byte[(length + 8)];
            sf.m34088a(i, bArr2, 0);
            sf.m34088a(length, bArr2, 4);
            System.arraycopy(bArr, 0, bArr2, 8, length);
            m34117a(sc.m34083a((byte) 1, (byte) 18, (short) 513, bArr2), 3, (Object) "SEND_VAP_RECORD");
        }
    }

    /* renamed from: a */
    public final void m34117a(byte[] bArr, int i, Object obj) {
        if (f25474c.mo4276b()) {
            f25474c.mo4275b("XMode.sendXModeMsg() " + obj + ", buffer.length:" + bArr.length);
        }
        if (this.f25486h != null && this.f25492n.mo4287a(this.f25486h)) {
            this.f25486h = new C57591(this);
            this.f25492n.mo4286a(this.f25486h, (long) (this.f25485g * 1000));
        }
        if (this.f25500v == null || this.f25493o == null) {
            if (i == 1) {
                this.f25479E.add(new C5768b(bArr, obj));
            }
        } else if (i == 3 || i == 2 || (this.f25478D.size() == 0 && this.f25479E.size() == 0)) {
            byte[] bArr2;
            Object obj2;
            if (i == 2) {
                C5768b c5768b = (C5768b) this.f25479E.remove();
                bArr2 = c5768b.f25472a;
                obj2 = c5768b;
            } else {
                obj2 = new C5768b(null, obj);
                bArr2 = bArr;
            }
            this.f25478D.add(obj2);
            this.f25500v.mo4294a(this.f25493o, bArr2, bArr2.length, (C5758f) this, obj2);
        } else {
            this.f25479E.add(new C5768b(bArr, obj));
        }
    }

    /* renamed from: b */
    public final void m34118b() {
        if (f25474c.mo4276b()) {
            f25474c.mo4275b("XMode.disconnect() state:" + this.f25480a + ", socket:" + this.f25493o);
        }
        if (this.f25480a == (byte) 3) {
            this.f25495q = (short) 1;
            this.f25475A.mo4512a(this.f25495q, this.f25496r);
        } else if (this.f25480a == (byte) 2) {
        } else {
            if (this.f25480a == (byte) 0) {
                m34101a("CloseSocket");
                this.f25495q = (short) 1;
                this.f25480a = (byte) 2;
                if (this.f25493o != null) {
                    this.f25500v.mo4295a(this.f25493o);
                }
            } else if (this.f25480a == (byte) 1) {
                this.f25480a = (byte) 2;
                this.f25495q = (short) 1;
                m34100a((byte) 2, null);
            }
        }
    }

    /* renamed from: b */
    public final void m34119b(int i) {
        if (f25474c.mo4276b()) {
            f25474c.mo4275b("XMode.sendVapRecordEnd() audio id: " + i);
        }
        if (this.f25480a == (byte) 1) {
            byte[] bArr = new byte[4];
            sf.m34088a(i, bArr, 0);
            m34117a(sc.m34083a((byte) 1, (byte) 18, (short) 256, bArr), 3, (Object) "SEND_VAP_RECORD_END");
        }
    }
}
