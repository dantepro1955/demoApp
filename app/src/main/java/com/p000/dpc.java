package com.p000;

import com.facebook.internal.ServerProtocol;
import java.io.ByteArrayOutputStream;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import p000.dnm.C5007a;
import p000.rl.C4177b;
import p000.rl.C5721a;

/* renamed from: dpc */
public class dpc implements dow, dpb, C4177b {
    /* renamed from: g */
    private static final rk f22492g = dnn.m28258a(dpc.class);
    /* renamed from: o */
    private static long f22493o = 1;
    /* renamed from: a */
    protected dpa f22494a;
    /* renamed from: b */
    public Vector f22495b;
    /* renamed from: c */
    protected dot f22496c;
    /* renamed from: d */
    protected int f22497d = 0;
    /* renamed from: e */
    protected Object f22498e;
    /* renamed from: f */
    protected byte f22499f = (byte) 0;
    /* renamed from: h */
    private doy f22500h;
    /* renamed from: i */
    private dpb f22501i;
    /* renamed from: j */
    private rg f22502j;
    /* renamed from: k */
    private rg f22503k;
    /* renamed from: l */
    private byte f22504l;
    /* renamed from: m */
    private rl f22505m;
    /* renamed from: n */
    private Hashtable f22506n;
    /* renamed from: p */
    private long f22507p;
    /* renamed from: q */
    private Hashtable f22508q;

    public dpc(doz doz, doy doy, Vector vector) {
        this.f22496c = doz;
        this.f22494a = doz.m28513h();
        this.f22500h = doy;
        this.f22502j = doz.m28244e();
        this.f22503k = doz.m28245f();
        this.f22504l = (byte) 5;
        this.f22505m = doz.z_();
        this.f22498e = new Object();
        this.f22499f = this.f22494a.m28551h();
        this.f22506n = new Hashtable();
        this.f22508q = new Hashtable();
        this.f22507p = this.f22494a.m28550g();
        this.f22495b = new Vector();
        if (vector != null) {
            for (int i = 0; i < vector.size(); i++) {
                this.f22495b.addElement(((dnm) vector.elementAt(i)).m28252e());
            }
        }
    }

    /* renamed from: a */
    private static C5007a mo4527a(String str) {
        return str.equalsIgnoreCase(ServerProtocol.DIALOG_PARAM_SDK_VERSION) ? C5007a.f22310a : str.equalsIgnoreCase("nmsp") ? C5007a.f22311b : str.equalsIgnoreCase("app") ? C5007a.f22312c : str.equalsIgnoreCase("nss") ? C5007a.f22313d : str.equalsIgnoreCase("slog") ? C5007a.f22314e : str.equalsIgnoreCase("nsslog") ? C5007a.f22315f : str.equalsIgnoreCase("gwlog") ? C5007a.f22316g : str.equalsIgnoreCase("svsp") ? C5007a.f22317h : str.equalsIgnoreCase("sip") ? C5007a.f22318i : str.equalsIgnoreCase("sdp") ? C5007a.f22319j : null;
    }

    /* renamed from: a */
    private void m28567a(Vector vector, long j) {
        if (this.f22497d != 2) {
            doy doy = this.f22500h;
        }
        byte[] bArr = new byte[0];
        this.f22506n.put(new Long(j), new Byte((byte) 2));
        this.f22508q.put(new Long(j), vector);
        String str = "<gp><rid>" + j + "</rid>";
        for (int i = 0; i < vector.size(); i++) {
            dnm dnm = (dnm) vector.elementAt(i);
            if (dnm.m28251d() == C5007a.f22312c || dnm.m28251d() == C5007a.f22311b || dnm.m28251d() == C5007a.f22313d || dnm.m28251d() == C5007a.f22317h) {
                str = str + "<" + dnm.m28251d() + " p=\"" + dnm.m28248a() + "\"/>";
            }
        }
        long j2 = j;
        this.f22494a.m28540a((short) 2583, "SEND_BCP_GET_PARAMS", (str + "</gp>").getBytes(), bArr, this.f22499f, j2, this.f22501i, false);
    }

    /* renamed from: i */
    public static long m28568i() {
        return 0;
    }

    /* renamed from: a */
    public void mo4514a() throws dox {
        f22492g.mo4275b("freeResource, disconnect timeout: " + 0);
        synchronized (this.f22498e) {
            if (this.f22497d == 2) {
                this.f22497d = 0;
                Integer num = new Integer(0);
                rl rlVar = this.f22505m;
                C5721a c5721a = new C5721a((byte) 3, num);
                Thread currentThread = Thread.currentThread();
                this.f22505m.mo4288a();
                rlVar.mo4285a(c5721a, this, currentThread);
            } else {
                f22492g.mo4281e("ResourceException the resource was unloaded. ");
                throw new dox("the resource was unloaded. ");
            }
        }
    }

    /* renamed from: a */
    public final void mo4515a(byte b, long j, short s, short s2, short s3) {
        f22492g.mo4275b("onBcpResponse, TID: " + b + ", RID: " + j + ", status code: " + s + " , request state: " + s2 + ", completion cause: " + s3);
        if (s != (short) 200) {
            Byte b2 = (Byte) this.f22506n.get(new Long(j));
            if (b2 != null) {
                doy doy;
                switch (b2.byteValue()) {
                    case (byte) 1:
                        this.f22506n.remove(new Long(j));
                        doy = this.f22500h;
                        return;
                    case (byte) 2:
                        this.f22506n.remove(new Long(j));
                        doy = this.f22500h;
                        return;
                    default:
                        return;
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo4516a(byte b, long j, short s, byte[] bArr) {
        f22492g.mo4275b("onBcpSetParamsComplete, TID: " + b + ", RID: " + j + ", status code: " + s);
        if (this.f22506n.remove(new Long(j)) == null) {
            f22492g.mo4279d("onBcpSetParamsComplete, RID: " + j + " already removed!");
            return;
        }
        Vector vector = new Vector();
        if (bArr != null) {
            String substring;
            String str = new String(bArr);
            int i = str.startsWith(";") ? 1 : 0;
            while (true) {
                int indexOf = str.indexOf(";", i);
                if (indexOf == -1) {
                    break;
                }
                substring = str.substring(i, indexOf);
                int indexOf2 = substring.indexOf(".");
                if (indexOf2 != -1) {
                    vector.addElement(new dnm(substring.substring(indexOf2 + 1), dpc.mo4527a(substring.substring(0, indexOf2))));
                }
                i = indexOf + 1;
            }
            if (i < str.length()) {
                substring = str.substring(i);
                int indexOf3 = substring.indexOf(".");
                if (indexOf3 != -1) {
                    vector.addElement(new dnm(substring.substring(indexOf3 + 1), dpc.mo4527a(substring.substring(0, indexOf3))));
                }
            }
        }
        doy doy;
        if (s == (short) 200 || s == (short) 201) {
            doy = this.f22500h;
        } else {
            doy = this.f22500h;
        }
    }

    /* renamed from: a */
    public void mo4517a(byte b, short s) {
        f22492g.mo4275b("onBcpEvent, TID: " + b + ", event code: " + s);
        if (this.f22497d == 2) {
            doy doy;
            this.f22497d = 0;
            Enumeration keys = this.f22506n.keys();
            while (keys.hasMoreElements()) {
                switch (((Byte) this.f22506n.remove((Long) keys.nextElement())).byteValue()) {
                    case (byte) 1:
                        doy = this.f22500h;
                        break;
                    case (byte) 2:
                        doy = this.f22500h;
                        break;
                    default:
                        break;
                }
            }
            doy = this.f22500h;
            this.f22494a.m28545b((dpb) this);
        }
    }

    /* renamed from: a */
    public void mo4518a(byte b, byte[] bArr) {
    }

    /* renamed from: a */
    protected final void m28574a(dpb dpb) {
        f22492g.mo4275b((Object) "loadResource");
        if (new czx(this.f22495b).m25913a()) {
            this.f22502j = si.m34096c(this.f22502j);
            this.f22503k = si.m34096c(this.f22503k);
            ((doz) this.f22496c).m28239a(this.f22502j);
            ((doz) this.f22496c).m28241b(this.f22503k);
        }
        this.f22501i = dpb;
        this.f22494a.m28534a(dpb);
        if (this.f22497d == 0) {
            if (this.f22494a.m28549f() != null) {
                this.f22497d = 2;
            } else {
                this.f22494a.m28537a(this.f22502j, this.f22503k);
                this.f22497d = 1;
            }
            long h = mo4535h();
            String str = "<lr><rid>" + h + "</rid>";
            switch (this.f22504l) {
                case (byte) 1:
                    str = str + "<nr9><reco/></nr9>";
                    break;
                case (byte) 2:
                    str = str + "<nr9><tts/></nr9>";
                    break;
                case (byte) 3:
                    str = str + "<oper></oper>";
                    break;
                case (byte) 4:
                    str = (str + "<dict>") + "</dict>";
                    break;
                case (byte) 5:
                    return;
            }
            this.f22494a.m28540a((short) 2599, "SEND_BCP_LOAD_RESOURCE", (str + "</lr>").getBytes(), null, this.f22499f, h, dpb, false);
        }
    }

    /* renamed from: a */
    public void mo3863a(Object obj, Object obj2) {
        C5721a c5721a = (C5721a) obj;
        Object[] objArr;
        long longValue;
        doy doy;
        switch (c5721a.f25336a) {
            case (byte) 1:
                objArr = (Object[]) c5721a.f25337b;
                Vector vector = (Vector) objArr[0];
                longValue = ((Long) objArr[1]).longValue();
                if (this.f22497d != 2) {
                    doy = this.f22500h;
                    return;
                }
                boolean z = true;
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] bArr = new byte[4];
                this.f22506n.put(new Long(longValue), new Byte((byte) 1));
                int i = 1;
                String str = "<sp><rid>" + longValue + "</rid>";
                for (int i2 = 0; i2 < vector.size(); i2++) {
                    dnm dnm = (dnm) vector.elementAt(i2);
                    if (dnm.m28251d() == C5007a.f22312c || dnm.m28251d() == C5007a.f22311b || dnm.m28251d() == C5007a.f22313d) {
                        z = false;
                        str = str + "<" + dnm.m28251d() + " p=\"" + dnm.m28248a() + "\" v=\"" + si.m34091a(new String(dnm.m28249b())) + "\"/>";
                    } else {
                        if (dnm.m28251d() == C5007a.f22317h) {
                            z = false;
                        }
                        StringBuilder append = new StringBuilder().append(str).append("<").append(dnm.m28251d().toString()).append(" p=\"").append(dnm.m28248a()).append("\" v=\"");
                        int i3 = i + 1;
                        str = append.append(i).append("\"/>").toString();
                        byte[] b = dnm.m28249b();
                        sf.m34088a(b.length, bArr, 0);
                        byteArrayOutputStream.write(bArr, 0, 4);
                        byteArrayOutputStream.write(b, 0, b.length);
                        i = i3;
                    }
                }
                this.f22494a.m28540a((short) 2581, "SEND_BCP_SET_PARAMS", (str + "</sp>").getBytes(), byteArrayOutputStream.toByteArray(), this.f22499f, longValue, this.f22501i, z);
                try {
                    byteArrayOutputStream.close();
                    return;
                } catch (Exception e) {
                    return;
                }
            case (byte) 2:
                objArr = (Object[]) c5721a.f25337b;
                m28567a((Vector) objArr[0], ((Long) objArr[1]).longValue());
                return;
            case (byte) 3:
                this.f22494a.m28530a(this.f22499f, ((Integer) c5721a.f25337b).intValue(), this.f22501i);
                doy = this.f22500h;
                return;
            case (byte) 4:
                int intValue = ((Integer) c5721a.f25337b).intValue();
                longValue = mo4535h();
                this.f22494a.m28540a((short) 2608, "SEND_BCP_FREE_RESOURCE_ID", ((((((("<fr><rid>" + longValue + "</rid>") + "<n>1</n>") + "<resids>") + "<res1><id>" + this.f22507p + "</id>") + "<timeout>" + intValue + "<timeout></res1>") + "</resids>") + "</fr>").getBytes(), null, this.f22499f, longValue, this.f22501i, true);
                return;
            default:
                return;
        }
    }

    /* renamed from: a */
    public void mo4519a(short s) {
        if (f22492g.mo4276b()) {
            f22492g.mo4275b("onSessionDisconnected, reason code: " + s);
        }
        Enumeration keys = this.f22506n.keys();
        while (keys.hasMoreElements()) {
            doy doy;
            switch (((Byte) this.f22506n.remove((Long) keys.nextElement())).byteValue()) {
                case (byte) 1:
                    doy = this.f22500h;
                    break;
                case (byte) 2:
                    doy = this.f22500h;
                    break;
                default:
                    break;
            }
        }
        synchronized (this.f22498e) {
            if (this.f22497d == 2) {
                doy = this.f22500h;
            }
            this.f22497d = 0;
        }
    }

    /* renamed from: a */
    public void mo4520a(byte[] bArr) {
        if (f22492g.mo4276b()) {
            f22492g.mo4275b("onSessionConnected, SID: " + bArr);
        }
        synchronized (this.f22498e) {
            this.f22497d = 2;
        }
    }

    /* renamed from: b */
    public final void mo4521b() {
        doy doy = this.f22500h;
    }

    /* renamed from: b */
    public final void mo4522b(byte b, long j, short s, byte[] bArr) {
        int i = 0;
        f22492g.mo4275b("onBcpGetParamsComplete, TID: " + b + ", RID: " + j);
        if (this.f22506n.remove(new Long(j)) == null) {
            f22492g.mo4279d("onBcpGetParamsComplete, RID: " + j + " already removed!");
            this.f22508q.remove(new Long(j));
            return;
        }
        Vector vector = (Vector) this.f22508q.remove(new Long(j));
        if (vector == null) {
            f22492g.mo4281e("Could not find the grammars associated with RID: " + j);
            return;
        }
        int i2;
        String str = new String(bArr);
        if (str.startsWith(";")) {
            i = 1;
            i2 = 0;
        } else {
            i2 = 0;
        }
        while (true) {
            int indexOf = str.indexOf(";", i);
            if (indexOf == -1) {
                break;
            }
            String substring = str.substring(i, indexOf);
            if (substring.indexOf(":") == -1) {
                dnm dnm = (dnm) vector.elementAt(i2);
                vector.setElementAt(new dnm(dnm.m28248a(), substring.getBytes(), dnm.m28251d()), i2);
            }
            i2++;
            i = indexOf + 1;
        }
        if (i < str.length()) {
            String substring2 = str.substring(i);
            if (substring2.indexOf(":") == -1) {
                dnm = (dnm) vector.elementAt(i2);
                vector.setElementAt(new dnm(dnm.m28248a(), substring2.getBytes(), dnm.m28251d()), i2);
            }
        }
        doy doy;
        if (s == (short) 200 || s == (short) 201) {
            doy = this.f22500h;
        } else {
            doy = this.f22500h;
        }
    }

    /* renamed from: c */
    public void mo4523c() {
    }

    /* renamed from: d */
    public void mo4524d() {
    }

    /* renamed from: e */
    public void mo4525e() {
    }

    /* renamed from: f */
    public void mo4526f() {
    }

    /* renamed from: g */
    public final dot m28584g() {
        return this.f22496c;
    }

    /* renamed from: h */
    protected synchronized long mo4535h() {
        long j;
        j = f22493o;
        f22493o = 1 + j;
        if (f22493o == Long.MIN_VALUE) {
            f22493o = 1;
        }
        return j;
    }
}
