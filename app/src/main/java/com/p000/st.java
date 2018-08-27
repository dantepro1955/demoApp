package com.p000;

import java.util.LinkedList;
import java.util.List;
import p000.rj.C5720a;
import p000.rl.C4177b;
import p000.rl.C5721a;
import p000.sn.C5031a;
import p000.sx.C5762a;
import p000.sx.C5770b;

/* renamed from: st */
public class st implements C4177b, C5031a, sp {
    /* renamed from: a */
    private static final rk f25507a = dnn.m28258a(st.class);
    /* renamed from: l */
    private static byte[] f25508l = new byte[16];
    /* renamed from: b */
    private final String f25509b;
    /* renamed from: c */
    private final long f25510c;
    /* renamed from: d */
    private final List f25511d = new LinkedList();
    /* renamed from: e */
    private int f25512e = 0;
    /* renamed from: f */
    private long f25513f = 0;
    /* renamed from: g */
    private boolean f25514g = false;
    /* renamed from: h */
    private sq f25515h;
    /* renamed from: i */
    private rl f25516i;
    /* renamed from: j */
    private sn f25517j = null;
    /* renamed from: k */
    private int f25518k = 1;

    /* renamed from: st$1 */
    static /* synthetic */ class C57691 {
        /* renamed from: a */
        public int f25505a;
        /* renamed from: b */
        public byte[] f25506b;

        private C57691() {
        }
    }

    public st(String str, long j, int i, String str2, String str3, String str4, rl rlVar, sn snVar) {
        this.f25509b = str;
        this.f25510c = j;
        this.f25517j = snVar;
        this.f25516i = rlVar;
        String b = (str2 == null || str2.length() == 0) ? rm.m25986b() : str2;
        try {
            this.f25515h = sx.m34158a(b, "CLIENT", "2.0", i, this, "CLIENT").mo5523a("UniqueID", str3).mo5523a("ApplicationID", str4).mo5523a("client_hardware_model", czl.m25833h()).mo5523a("client_hardware_submodel", czl.m25834i()).mo5523a("client_os_type", czl.m25835j()).mo5523a("client_os_version", czl.m25836k()).mo5523a("client_sdk_release", "NMSP 5.0 client SDK - build 009").mo5521a();
        } catch (sr e) {
        }
        rl rlVar2 = this.f25516i;
        C5721a c5721a = new C5721a((byte) 17, null);
        Thread currentThread = Thread.currentThread();
        this.f25516i.mo4288a();
        rlVar2.mo4285a(c5721a, this, currentThread);
    }

    /* renamed from: b */
    private void m34126b(int i) {
        while (this.f25511d.size() > 0) {
            C57691 c57691 = (C57691) this.f25511d.get(0);
            if (i >= c57691.f25505a) {
                this.f25513f -= (long) c57691.f25506b.length;
                this.f25511d.remove(0);
                this.f25512e--;
                m34127d();
            } else {
                return;
            }
        }
    }

    /* renamed from: d */
    private void m34127d() {
        if (this.f25514g) {
            if (f25507a.mo4276b()) {
                f25507a.mo4275b("trySendingLogs() _sessionConnected:" + this.f25514g + ", _outstandingEvents:" + this.f25512e + ", _events.size()" + this.f25511d.size());
            }
            while (this.f25512e < 5 && this.f25512e < this.f25511d.size()) {
                C57691 c57691 = (C57691) this.f25511d.get(this.f25512e);
                if (f25507a.mo4276b()) {
                    f25507a.mo4275b("bcpLog, packet len [" + c57691.f25506b.length + "]");
                }
                rl rlVar = this.f25516i;
                C5721a c5721a = new C5721a((byte) 18, new Object[]{c57691});
                Thread currentThread = Thread.currentThread();
                this.f25516i.mo4288a();
                rlVar.mo4285a(c5721a, this, currentThread);
                this.f25512e++;
            }
        }
    }

    /* renamed from: e */
    private void m34128e() {
        rj czz = new czz();
        if (this.f25509b == null || !czz.mo4268a(this.f25509b, C5720a.f25335a)) {
            if (f25507a.mo4278c()) {
                f25507a.mo4277c("handleLoadFile() cannot open + file:" + this.f25509b);
            }
        } else if (czz.mo4269b() > 2147483647L) {
            if (f25507a.mo4282e()) {
                f25507a.mo4281e("calllog file too big (" + czz.mo4269b() + " > 2147483647" + ")!!!");
            }
            czz.mo4267a();
        } else {
            Object obj;
            long b = czz.mo4269b();
            long j = 0;
            int size = this.f25511d.size();
            while (j < b) {
                byte[] bArr = new byte[1];
                if (czz.mo4266a(bArr, bArr.length) != bArr.length) {
                    obj = 1;
                    break;
                }
                j += (long) bArr.length;
                bArr = new byte[bArr[0]];
                if (czz.mo4266a(bArr, bArr.length) != bArr.length) {
                    obj = 1;
                    break;
                }
                int i;
                j += (long) bArr.length;
                if (bArr.length == 1) {
                    i = bArr[0] & 255;
                } else if (bArr.length == 2) {
                    i = (bArr[0] & 255) + ((bArr[1] & 255) << 8);
                } else if (bArr.length == 3) {
                    i = (bArr[0] & 255) + (((bArr[2] & 255) << 16) + ((bArr[1] & 255) << 8));
                } else {
                    i = (bArr[0] & 255) + ((((bArr[3] & 255) << 24) + ((bArr[2] & 255) << 16)) + ((bArr[1] & 255) << 8));
                }
                bArr = new byte[i];
                if (czz.mo4266a(bArr, bArr.length) != bArr.length) {
                    obj = 1;
                    break;
                }
                C57691 c57691 = new C57691();
                c57691.f25506b = bArr;
                this.f25513f += (long) bArr.length;
                this.f25511d.add(c57691);
                j += (long) bArr.length;
            }
            obj = null;
            czz.mo4267a();
            if (obj != null) {
                czz.mo4270c();
                if (f25507a.mo4282e()) {
                    f25507a.mo4281e("handleLoadFile() failed!!!");
                }
            } else if (f25507a.mo4278c()) {
                f25507a.mo4277c("handleLoadFile() " + (this.f25511d.size() - size) + " events are loaded");
            }
            m34129f();
        }
    }

    /* renamed from: f */
    private void m34129f() {
        if (this.f25513f > this.f25510c) {
            int size = this.f25511d.size();
            while (this.f25513f > this.f25510c) {
                this.f25513f -= (long) ((byte[]) this.f25511d.remove(0)).length;
            }
            if (f25507a.mo4278c()) {
                f25507a.mo4277c("trimEventsList() " + (size - this.f25511d.size()) + " events are removed due to size limit (" + this.f25510c + ")");
            }
        }
    }

    /* renamed from: a */
    public final void mo4509a() {
        if (f25507a.mo4276b()) {
            f25507a.mo4275b((Object) "socketOpened()");
        }
    }

    /* renamed from: a */
    public final void m34131a(int i) {
        if (f25507a.mo4276b()) {
            f25507a.mo4275b("bcpLogResponse requestId = " + i);
        }
        rl rlVar = this.f25516i;
        C5721a c5721a = new C5721a((byte) 19, new Object[]{new Integer(i)});
        Thread currentThread = Thread.currentThread();
        this.f25516i.mo4288a();
        rlVar.mo4285a(c5721a, this, currentThread);
    }

    /* renamed from: a */
    public final void mo3863a(Object obj, Object obj2) {
        C5721a c5721a = (C5721a) obj;
        switch (c5721a.f25336a) {
            case (byte) 16:
                sy syVar = (sy) ((Object[]) c5721a.f25337b)[0];
                C57691 c57691 = new C57691();
                c57691.f25506b = syVar.m34149g();
                if (this.f25513f < this.f25510c) {
                    new StringBuilder().append(syVar.f25520b.m34155b()).append(syVar.f25522d);
                    this.f25511d.add(c57691);
                    this.f25513f = ((long) c57691.f25506b.length) + this.f25513f;
                    m34127d();
                    return;
                }
                return;
            case (byte) 17:
                m34128e();
                return;
            case (byte) 18:
                C57691 c576912 = (C57691) ((Object[]) c5721a.f25337b)[0];
                int i = this.f25518k;
                this.f25518k = i + 1;
                c576912.f25505a = i;
                byte[] bArr = new byte[(c576912.f25506b.length + 25)];
                bArr[0] = (byte) 0;
                sf.m34088a(c576912.f25505a, bArr, 1);
                bArr = sc.m34084a(bArr, f25508l);
                sf.m34088a(c576912.f25506b.length, bArr, 21);
                System.arraycopy(c576912.f25506b, 0, bArr, 25, c576912.f25506b.length);
                this.f25517j.m34117a(sc.m34083a((byte) 2, (byte) 34, (short) 2640, bArr), 1, (Object) "SEND_BCP_LOG");
                return;
            case (byte) 19:
                m34126b(((Integer) ((Object[]) c5721a.f25337b)[0]).intValue());
                return;
            case (byte) 20:
                Object[] objArr = (Object[]) c5721a.f25337b;
                sy syVar2 = (sy) objArr[0];
                C5762a c5762a = (C5762a) objArr[1];
                syVar2.mo5520c();
                if (c5762a == null) {
                    return;
                }
                if (syVar2 instanceof sv) {
                    c5762a.mo5512a(((sv) syVar2).m34152b());
                    return;
                } else {
                    c5762a.mo5512a(null);
                    return;
                }
            default:
                return;
        }
    }

    /* renamed from: a */
    public final void mo4510a(String str) {
        if (str.startsWith("SEND_BCP_LOG") && f25507a.mo4276b()) {
            f25507a.mo4275b("onMsgSent(" + str + ")");
        }
    }

    /* renamed from: a */
    public final void mo4511a(sd sdVar, byte[] bArr) {
    }

    /* renamed from: a */
    public final void m34135a(sy syVar, C5762a c5762a) {
        rl rlVar = this.f25516i;
        C5721a c5721a = new C5721a((byte) 20, new Object[]{syVar, c5762a});
        Thread currentThread = Thread.currentThread();
        this.f25516i.mo4288a();
        rlVar.mo4285a(c5721a, this, currentThread);
    }

    /* renamed from: a */
    final void m34136a(sy syVar, C5770b c5770b) {
        rl rlVar = this.f25516i;
        C5721a c5721a = new C5721a((byte) 16, new Object[]{syVar, c5770b});
        Thread currentThread = Thread.currentThread();
        this.f25516i.mo4288a();
        rlVar.mo4285a(c5721a, this, currentThread);
    }

    /* renamed from: a */
    public final void mo4512a(short s, short s2) {
        if (f25507a.mo4276b()) {
            f25507a.mo4275b("socketClosed() reason [" + s + "] subReason [" + s2 + "]");
        }
        this.f25514g = false;
    }

    /* renamed from: b */
    public final sq m34138b() {
        return this.f25515h;
    }

    /* renamed from: b */
    public final void mo4513b(String str) {
        if (str.startsWith("SEND_BCP_LOG")) {
            if (f25507a.mo4276b()) {
                f25507a.mo4275b("onMsgNotSent(" + str + ")");
            }
            C57691 c57691 = (C57691) this.f25511d.remove(0);
            this.f25513f -= (long) c57691.f25506b.length;
            this.f25512e--;
            this.f25511d.add(this.f25512e, c57691);
            m34127d();
        }
    }

    /* renamed from: c */
    public final ss mo5517c(String str) throws so {
        if (f25507a.mo4276b()) {
            f25507a.mo4275b("openSession(" + str + ")");
        }
        if (((sw) this.f25515h).f25528a != null) {
            throw new so("Application session already opened.");
        }
        sv svVar = (sv) sx.m34161a((sy) this.f25515h, "APP_REMOTEEVENT", null).m34163a(new C5770b());
        ss a = sx.m34159a(svVar, str);
        ((sw) this.f25515h).f25528a = svVar;
        return a;
    }

    /* renamed from: c */
    public final void m34141c() {
        this.f25514g = true;
        m34127d();
    }
}
