package com.p000;

import android.support.v7.widget.LinearLayoutManager;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.common.util.ByteConstants;
import java.io.ByteArrayOutputStream;
import java.util.Hashtable;
import java.util.Vector;
import p000.rl.C4177b;
import p000.rl.C5721a;
import p000.sn.C5031a;

/* renamed from: dpa */
public class dpa implements C4177b, C5031a {
    /* renamed from: a */
    private static final rk f22470a = dnn.m28258a(dpa.class);
    /* renamed from: m */
    private static byte[] f22471m = new byte[16];
    /* renamed from: p */
    private static int f22472p = 1;
    /* renamed from: v */
    private static String[] f22473v = new String[]{AppEventsConstants.EVENT_PARAM_VALUE_NO, "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F"};
    /* renamed from: b */
    private Hashtable f22474b;
    /* renamed from: c */
    private Hashtable f22475c;
    /* renamed from: d */
    private Hashtable f22476d;
    /* renamed from: e */
    private sn f22477e;
    /* renamed from: f */
    private String f22478f;
    /* renamed from: g */
    private short f22479g;
    /* renamed from: h */
    private Vector f22480h;
    /* renamed from: i */
    private rl f22481i;
    /* renamed from: j */
    private dov f22482j;
    /* renamed from: k */
    private Vector f22483k;
    /* renamed from: l */
    private byte[] f22484l = null;
    /* renamed from: n */
    private rg f22485n;
    /* renamed from: o */
    private rg f22486o;
    /* renamed from: q */
    private boolean f22487q = false;
    /* renamed from: r */
    private dow f22488r;
    /* renamed from: s */
    private long f22489s = 1;
    /* renamed from: t */
    private byte f22490t = (byte) 1;
    /* renamed from: u */
    private sq f22491u;

    public dpa(String str, short s, String str2, byte[] bArr, String str3, Vector vector, rl rlVar, dov dov) {
        this.f22478f = str;
        this.f22479g = s;
        this.f22481i = rlVar;
        this.f22482j = dov;
        this.f22488r = null;
        this.f22483k = new Vector();
        this.f22474b = new Hashtable();
        this.f22475c = new Hashtable();
        this.f22476d = new Hashtable();
        this.f22480h = new Vector();
        this.f22477e = new sn(this.f22478f, this.f22479g, str2, bArr, str3, this, vector, rlVar);
    }

    /* renamed from: a */
    public static String m28522a(byte[] bArr) {
        if (bArr == null) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer();
        int i = 0;
        while (i < 16) {
            byte b = bArr[i];
            stringBuffer.append(f22473v[(byte) (((byte) (((byte) (b & 240)) >>> 4)) & 15)] + f22473v[(byte) (b & 15)]);
            if (i == 3 || i == 5 || i == 7 || i == 9) {
                stringBuffer.append("-");
            }
            i++;
        }
        return stringBuffer.toString().toLowerCase();
    }

    /* renamed from: a */
    private void m28523a(byte b, Object obj) {
        rl rlVar = this.f22481i;
        C5721a c5721a = new C5721a(b, obj);
        Thread currentThread = Thread.currentThread();
        this.f22481i.mo4288a();
        rlVar.mo4285a(c5721a, this, currentThread);
    }

    /* renamed from: b */
    private void m28524b(byte[] bArr) {
        byte b = bArr[16];
        short a = sf.m34087a(bArr, 17);
        for (int i = 0; i < this.f22480h.size(); i++) {
            ((dpb) this.f22480h.elementAt(i)).mo4517a(b, a);
        }
    }

    /* renamed from: c */
    private void m28525c(String str) {
        if (this.f22491u != null) {
            ss a = this.f22491u.mo5518a(str);
            if (str.compareTo("ConnectionEstablished") == 0) {
                try {
                    a.mo5523a("SessionID", dpa.m28522a(this.f22484l));
                } catch (sr e) {
                }
            }
            a.mo5521a();
        }
    }

    /* renamed from: c */
    private void m28526c(byte[] bArr) {
        int b = sf.m34090b(bArr, 0);
        if (this.f22475c.size() != 0) {
            dnk dnk = (dnk) this.f22475c.get(new Integer(b));
            if (dnk == null) {
                f22470a.mo4281e("Could not find the audio sink associated with AID: " + b);
                return;
            }
            int b2 = sf.m34090b(bArr, 4);
            int i = 8;
            if (si.m34095b(this.f22486o)) {
                while ((bArr[i] & 128) > 0) {
                    i++;
                    b2--;
                }
                i++;
                b2--;
            }
            if (b2 > 0 && b2 <= bArr.length - i) {
                try {
                    dnk.mo4478a(bArr, i, b2, false);
                } catch (dnq e) {
                    f22470a.mo4281e(e.getMessage());
                }
            }
            if (this.f22476d.size() != 0) {
                dpb dpb = (dpb) this.f22476d.get(new Integer(b));
                if (dpb == null) {
                    f22470a.mo4281e("parseXModeMsgVapPlay:: Could not find the session listener associated with AID: " + b);
                } else {
                    dpb.mo4525e();
                }
            }
        }
    }

    /* renamed from: d */
    public static void m28527d() {
    }

    /* renamed from: k */
    private void m28528k() {
        while (!this.f22483k.isEmpty()) {
            C5721a c5721a = (C5721a) this.f22483k.firstElement();
            this.f22483k.removeElementAt(0);
            switch (c5721a.f25336a) {
                case (byte) 1:
                    m28523a((byte) 1, c5721a.f25337b);
                    break;
                case (byte) 2:
                    m28523a((byte) 2, c5721a.f25337b);
                    break;
                case (byte) 4:
                    m28523a((byte) 4, c5721a.f25337b);
                    break;
                case (byte) 5:
                    m28523a((byte) 5, c5721a.f25337b);
                    break;
                case (byte) 6:
                    m28523a((byte) 6, c5721a.f25337b);
                    break;
                case (byte) 7:
                    m28523a((byte) 7, c5721a.f25337b);
                    break;
                case (byte) 8:
                    m28523a((byte) 8, c5721a.f25337b);
                    break;
                default:
                    break;
            }
        }
    }

    /* renamed from: a */
    public final void mo4509a() {
    }

    /* renamed from: a */
    public final void m28530a(byte b, int i, dpb dpb) {
        f22470a.mo4275b("freeResource, TID: " + b + ", disconnect timeout: " + i);
        this.f22480h.removeElement(dpb);
        Object obj = new Object[]{new Byte(b), new Integer(i)};
        if (this.f22484l == null || !this.f22483k.isEmpty()) {
            this.f22483k.addElement(new C5721a((byte) 4, obj));
        } else {
            m28523a((byte) 4, obj);
        }
    }

    /* renamed from: a */
    public final void m28531a(int i) {
        if (f22470a.mo4276b()) {
            f22470a.mo4275b("vapRecordBegin, AID: " + i);
        }
        Object num = new Integer(i);
        if (this.f22484l == null || !this.f22483k.isEmpty()) {
            this.f22483k.addElement(new C5721a((byte) 5, num));
        } else {
            m28523a((byte) 5, num);
        }
    }

    /* renamed from: a */
    public final void m28532a(int i, dnk dnk, dpb dpb) {
        this.f22475c.put(new Integer(i), dnk);
        this.f22476d.put(new Integer(i), dpb);
    }

    /* renamed from: a */
    public final void m28533a(dow dow) {
        this.f22488r = dow;
    }

    /* renamed from: a */
    public final void m28534a(dpb dpb) {
        if (!this.f22480h.contains(dpb)) {
            this.f22480h.addElement(dpb);
        }
    }

    /* renamed from: a */
    public final void mo3863a(Object obj, Object obj2) {
        C5721a c5721a = (C5721a) obj;
        Object[] objArr;
        byte byteValue;
        switch (c5721a.f25336a) {
            case (byte) 1:
                this.f22477e.m34115a(this.f22485n.m28246a(), this.f22486o.m28246a());
                return;
            case (byte) 2:
                this.f22477e.m34118b();
                return;
            case (byte) 3:
                this.f22487q = true;
                this.f22477e.m34118b();
                return;
            case (byte) 4:
                if (this.f22484l != null) {
                    objArr = (Object[]) c5721a.f25337b;
                    byteValue = ((Byte) objArr[0]).byteValue();
                    int intValue = ((Integer) objArr[1]).intValue();
                    byte[] bArr = new byte[5];
                    bArr[0] = byteValue;
                    sf.m34088a(intValue, bArr, 1);
                    this.f22477e.m34117a(sc.m34083a((byte) 2, (byte) 34, (short) 2601, sc.m34084a(bArr, this.f22484l)), 3, (Object) "SEND_BCP_FREE_RESOURCE");
                    return;
                }
                return;
            case (byte) 5:
                if (this.f22484l != null) {
                    this.f22477e.m34109a(((Integer) c5721a.f25337b).intValue());
                    return;
                }
                return;
            case (byte) 6:
                if (this.f22484l != null) {
                    objArr = (Object[]) c5721a.f25337b;
                    byte[] bArr2 = (byte[]) objArr[0];
                    int intValue2 = ((Integer) objArr[1]).intValue();
                    for (int i = 0; i < this.f22480h.size(); i++) {
                        ((dpb) this.f22480h.elementAt(i)).mo4523c();
                    }
                    this.f22477e.m34116a(bArr2, intValue2);
                    return;
                }
                return;
            case (byte) 7:
                if (this.f22484l != null) {
                    this.f22477e.m34119b(((Integer) c5721a.f25337b).intValue());
                    return;
                }
                return;
            case (byte) 8:
                if (this.f22484l != null) {
                    Object[] objArr2 = (Object[]) c5721a.f25337b;
                    short shortValue = ((Short) objArr2[0]).shortValue();
                    Object obj3 = (String) objArr2[1];
                    byte[] bArr3 = (byte[]) objArr2[2];
                    byte[] bArr4 = (byte[]) objArr2[3];
                    byteValue = ((Byte) objArr2[4]).byteValue();
                    long longValue = ((Long) objArr2[5]).longValue();
                    dpb dpb = (dpb) objArr2[6];
                    boolean booleanValue = ((Boolean) objArr2[7]).booleanValue();
                    this.f22474b.put(new Long(longValue), dpb);
                    int length = bArr3.length + 5;
                    if (shortValue == (short) 2585) {
                        length += 4;
                    }
                    byte[] bArr5 = new byte[length];
                    bArr5[0] = byteValue;
                    length = 1;
                    if (shortValue == (short) 2585) {
                        sf.m34088a((int) longValue, bArr5, 1);
                        length = 5;
                    }
                    sf.m34088a(bArr3.length, bArr5, length);
                    System.arraycopy(bArr3, 0, bArr5, length + 4, bArr3.length);
                    byte[] a = sc.m34084a(bArr5, this.f22484l != null ? this.f22484l : f22471m);
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    byteArrayOutputStream.write(a, 0, a.length);
                    if (bArr4 != null) {
                        byteArrayOutputStream.write(bArr4, 0, bArr4.length);
                    }
                    this.f22477e.m34117a(sc.m34083a((byte) 2, (byte) 34, shortValue, byteArrayOutputStream.toByteArray()), 3, obj3);
                    if (!booleanValue) {
                        return;
                    }
                    if (shortValue == (short) 2581) {
                        if (dpb != null) {
                            dpb.mo4516a(byteValue, longValue, (short) 200, null);
                            return;
                        }
                        return;
                    } else if (shortValue == (short) 2608 && dpb != null) {
                        this.f22480h.removeElement(dpb);
                        dpb.mo4521b();
                        return;
                    } else {
                        return;
                    }
                }
                return;
            default:
                f22470a.mo4281e("Unknown command");
                return;
        }
    }

    /* renamed from: a */
    public final void mo4510a(String str) {
    }

    /* renamed from: a */
    public final void m28537a(rg rgVar, rg rgVar2) {
        if (f22470a.mo4276b()) {
            f22470a.mo4275b((Object) "connect()");
        }
        m28525c("Connect");
        this.f22485n = rgVar;
        this.f22486o = rgVar2;
        m28523a((byte) 1, null);
    }

    /* renamed from: a */
    public final void mo4511a(sd sdVar, byte[] bArr) {
        if (f22470a.mo4276b()) {
            f22470a.mo4275b("xmodeMsgCallback, protocol: " + sdVar.f25456a + ", command: " + sdVar.f25457b);
        }
        int b;
        dpb dpb;
        switch (sdVar.f25456a) {
            case (byte) 1:
                switch (sdVar.f25457b) {
                    case (short) 512:
                        m28526c(bArr);
                        return;
                    case (short) 528:
                        b = sf.m34090b(bArr, 0);
                        if (this.f22476d.size() != 0) {
                            dpb = (dpb) this.f22476d.get(new Integer(b));
                            if (dpb == null) {
                                f22470a.mo4281e("parseVapPlayBegin:: Could not find the session listener associated with AID: " + b);
                                return;
                            } else {
                                dpb.mo4524d();
                                return;
                            }
                        }
                        return;
                    case ByteConstants.KB /*1024*/:
                        b = sf.m34090b(bArr, 0);
                        if (this.f22475c.size() != 0) {
                            dnk dnk = (dnk) this.f22475c.remove(new Integer(b));
                            if (dnk == null) {
                                f22470a.mo4281e("Could not find the audio sink associated with AID: " + b);
                                return;
                            }
                            try {
                                dnk.mo4478a(null, 0, 0, true);
                            } catch (dnq e) {
                                f22470a.mo4281e(e.getMessage());
                            }
                            dpb = (dpb) this.f22476d.remove(new Integer(b));
                            if (dpb == null) {
                                f22470a.mo4281e("parseXModeMsgVapPlayEnd:: Could not find the session listener associated with AID: " + b);
                                return;
                            } else {
                                dpb.mo4526f();
                                return;
                            }
                        }
                        return;
                    default:
                        return;
                }
            case (byte) 2:
                byte b2;
                short a;
                long b3;
                byte[] bArr2;
                int b4;
                int b5;
                switch (sdVar.f25457b) {
                    case (short) 2576:
                        b2 = bArr[16];
                        int b6 = sf.m34090b(bArr, 17);
                        a = sf.m34087a(bArr, 21);
                        short a2 = sf.m34087a(bArr, 23);
                        short a3 = sf.m34087a(bArr, 25);
                        dpb = (dpb) this.f22474b.get(new Long((long) b6));
                        if (dpb != null) {
                            dpb.mo4515a(b2, (long) b6, a, a2, a3);
                            if (a != (short) 200) {
                                this.f22474b.remove(new Long((long) b6));
                                return;
                            }
                            return;
                        }
                        return;
                    case (short) 2577:
                        long b7 = (long) sf.m34090b(bArr, 17);
                        sf.m34090b(bArr, 21);
                        sf.m34087a(bArr, 25);
                        this.f22474b.remove(new Long(b7));
                        return;
                    case (short) 2578:
                        return;
                    case (short) 2579:
                        b3 = (long) sf.m34090b(bArr, 17);
                        sf.m34087a(bArr, 21);
                        b = sf.m34090b(bArr, 23);
                        if (b > 0 && b <= bArr.length - 27) {
                            System.arraycopy(bArr, 27, new byte[b], 0, b);
                        }
                        this.f22474b.remove(new Long(b3));
                        return;
                    case (short) 2580:
                        b3 = (long) sf.m34090b(bArr, 17);
                        sf.m34087a(bArr, 21);
                        b = sf.m34090b(bArr, 23);
                        if (b > 0 && b <= bArr.length - 27) {
                            System.arraycopy(bArr, 27, new byte[b], 0, b);
                        }
                        this.f22474b.get(new Long(b3));
                        return;
                    case (short) 2582:
                        bArr2 = null;
                        b2 = bArr[16];
                        b4 = sf.m34090b(bArr, 17);
                        a = sf.m34087a(bArr, 21);
                        b5 = sf.m34090b(bArr, 23);
                        if (b5 > 0 && b5 <= bArr.length - 27) {
                            bArr2 = new byte[b5];
                            System.arraycopy(bArr, 27, bArr2, 0, b5);
                        }
                        dpb = (dpb) this.f22474b.remove(new Long((long) b4));
                        if (dpb != null) {
                            dpb.mo4516a(b2, (long) b4, a, bArr2);
                            return;
                        }
                        return;
                    case (short) 2584:
                        bArr2 = null;
                        b2 = bArr[16];
                        b4 = sf.m34090b(bArr, 17);
                        a = sf.m34087a(bArr, 21);
                        b5 = sf.m34090b(bArr, 23);
                        if (b5 > 0 && b5 <= bArr.length - 27) {
                            bArr2 = new byte[b5];
                            System.arraycopy(bArr, 27, bArr2, 0, b5);
                        }
                        dpb = (dpb) this.f22474b.remove(new Long((long) b4));
                        if (dpb != null) {
                            dpb.mo4522b(b2, (long) b4, a, bArr2);
                            return;
                        }
                        return;
                    case (short) 2585:
                        b2 = bArr[16];
                        b4 = sf.m34090b(bArr, 21);
                        if (b4 > 0 && b4 <= bArr.length - 25) {
                            byte[] bArr3 = new byte[b4];
                            System.arraycopy(bArr, 25, bArr3, 0, b4);
                            dpb = (dpb) this.f22474b.get(new Long(0));
                            if (dpb != null) {
                                dpb.mo4518a(b2, bArr3);
                                return;
                            }
                            return;
                        }
                        return;
                    case (short) 2600:
                        m28524b(bArr);
                        return;
                    default:
                        f22470a.mo4281e("Unknown BCP command");
                        return;
                }
            case (byte) 3:
                switch (sdVar.f25457b) {
                    case (short) 257:
                        this.f22484l = this.f22477e.f25481b;
                        if (f22470a.mo4276b()) {
                            f22470a.mo4275b("connected(" + dpa.m28522a(this.f22484l) + ") called on " + this.f22482j);
                        }
                        m28525c("ConnectionEstablished");
                        dov dov = this.f22482j;
                        String a4 = dpa.m28522a(this.f22484l);
                        dow dow = this.f22488r;
                        dov.mo4565a(a4);
                        for (b = 0; b < this.f22480h.size(); b++) {
                            ((dpb) this.f22480h.elementAt(b)).mo4520a(this.f22484l);
                        }
                        m28528k();
                        return;
                    case (short) 512:
                    case (short) 768:
                        return;
                    default:
                        return;
                }
            default:
                f22470a.mo4281e("Unknown Xmode protocol");
                return;
        }
    }

    /* renamed from: a */
    public final void m28539a(sq sqVar) {
        this.f22491u = sqVar.mo5518a("NMSPSession").mo5521a();
        this.f22477e.m34114a(this.f22491u);
    }

    /* renamed from: a */
    public final void m28540a(short s, String str, byte[] bArr, byte[] bArr2, byte b, long j, dpb dpb, boolean z) {
        if (f22470a.mo4276b()) {
            f22470a.mo4275b("postBcpMessage, BCP: " + s + ", TID: " + b + ", RID: " + j);
        }
        Object obj = new Object[]{new Short(s), str, bArr, bArr2, new Byte(b), new Long(j), dpb, new Boolean(z)};
        if (this.f22484l == null || !this.f22483k.isEmpty()) {
            this.f22483k.addElement(new C5721a((byte) 8, obj));
        } else {
            m28523a((byte) 8, obj);
        }
    }

    /* renamed from: a */
    public final void mo4512a(short s, short s2) {
        if (f22470a.mo4276b()) {
            f22470a.mo4275b("socketClosed, reason: " + s);
        }
        if (f22470a.mo4276b()) {
            f22470a.mo4275b("socketClosed() sessionListeners.size():" + this.f22480h.size());
        }
        for (int i = 0; i < this.f22480h.size(); i++) {
            ((dpb) this.f22480h.elementAt(i)).mo4519a(s);
        }
        if (!this.f22483k.isEmpty()) {
            this.f22483k.removeAllElements();
        }
        this.f22480h.removeAllElements();
        dov dov;
        dow dow;
        if (s == (short) 4 || s == (short) 5) {
            dov = this.f22482j;
            dow = this.f22488r;
            dov.mo4567b((short) 9);
        } else if (s == (short) 7) {
            dov = this.f22482j;
            dow = this.f22488r;
            dov.mo4567b(s2);
        } else if (s == (short) 8 && this.f22484l == null) {
            dov = this.f22482j;
            dow = this.f22488r;
            dov.mo4567b((short) 9);
        } else if (this.f22484l != null) {
            dov = this.f22482j;
            dow = this.f22488r;
            dov.mo4566a(s2);
        }
        if (s == (short) 1 && this.f22487q) {
            this.f22481i.mo4290c();
            this.f22482j.mo4564a();
        }
        this.f22484l = null;
    }

    /* renamed from: a */
    public final void m28542a(byte[] bArr, int i) {
        if (f22470a.mo4276b()) {
            f22470a.mo4275b("vapRecord, AID: " + i);
        }
        Object obj = new Object[]{bArr, new Integer(i)};
        if (this.f22484l == null || !this.f22483k.isEmpty()) {
            this.f22483k.addElement(new C5721a((byte) 6, obj));
        } else {
            m28523a((byte) 6, obj);
        }
    }

    /* renamed from: b */
    public final sn m28543b() {
        return this.f22477e;
    }

    /* renamed from: b */
    public final void m28544b(int i) {
        if (f22470a.mo4276b()) {
            f22470a.mo4275b("vapRecordEnd, AID: " + i);
        }
        Object num = new Integer(i);
        if (this.f22484l == null || !this.f22483k.isEmpty()) {
            this.f22483k.addElement(new C5721a((byte) 7, num));
        } else {
            m28523a((byte) 7, num);
        }
    }

    /* renamed from: b */
    public final void m28545b(dpb dpb) {
        this.f22480h.removeElement(dpb);
    }

    /* renamed from: b */
    public final void mo4513b(String str) {
    }

    /* renamed from: c */
    public final synchronized int m28547c() {
        int i;
        i = f22472p;
        f22472p = i + 1;
        if (f22472p == LinearLayoutManager.INVALID_OFFSET) {
            f22472p = 1;
        }
        return i;
    }

    /* renamed from: e */
    public final void m28548e() {
        if (f22470a.mo4276b()) {
            f22470a.mo4275b((Object) "disconnectAndShutdown");
        }
        m28523a((byte) 3, null);
    }

    /* renamed from: f */
    public final byte[] m28549f() {
        return this.f22484l;
    }

    /* renamed from: g */
    public final long m28550g() {
        long j = this.f22489s;
        this.f22489s = j + 1;
        if (this.f22489s == Long.MIN_VALUE) {
            this.f22489s = 1;
        }
        return j;
    }

    /* renamed from: h */
    public final byte m28551h() {
        byte b = this.f22490t;
        this.f22490t = (byte) (b + 1);
        if (this.f22490t == Byte.MIN_VALUE) {
            this.f22490t = (byte) 1;
        }
        return b;
    }

    /* renamed from: i */
    public final rg m28552i() {
        return this.f22485n;
    }

    /* renamed from: j */
    public final sq m28553j() {
        return this.f22491u;
    }
}
