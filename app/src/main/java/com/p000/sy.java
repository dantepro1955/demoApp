package com.p000;

import java.util.Hashtable;
import p000.sx.C5770b;

/* renamed from: sy */
public class sy implements sq {
    /* renamed from: a */
    private sy f25519a;
    /* renamed from: b */
    sw f25520b;
    /* renamed from: c */
    st f25521c;
    /* renamed from: d */
    int f25522d;
    /* renamed from: e */
    private String f25523e;
    /* renamed from: f */
    private Long f25524f;
    /* renamed from: g */
    private Hashtable f25525g;

    sy(String str, sy syVar, sw swVar, st stVar) {
        this.f25523e = str;
        this.f25519a = syVar;
        this.f25520b = swVar;
        this.f25521c = stVar;
    }

    /* renamed from: a */
    protected static boolean m34142a(dnj dnj, String str, Object obj) {
        dni dnd = new dnd();
        String str2 = obj instanceof byte[] ? "bin" : obj instanceof Boolean ? "bool" : obj instanceof Double ? "float" : obj instanceof Integer ? "int" : obj instanceof Long ? "long" : obj instanceof String ? "str" : obj instanceof sq ? "str" : "unknown";
        if (str2.compareTo("unknown") == 0) {
            return false;
        }
        dnd.mo4455a("t", str2);
        dnd.mo4455a("k", str);
        if (obj instanceof byte[]) {
            dnd.mo4456a("v", (byte[]) obj);
        } else if (obj instanceof Boolean) {
            dnd.mo4455a("v", ((Boolean) obj).toString());
        } else if (obj instanceof Double) {
            dnd.mo4455a("v", ((Double) obj).toString());
        } else if (obj instanceof Integer) {
            dnd.mo4458b("v", ((Integer) obj).intValue());
        } else if (obj instanceof Long) {
            dnd.mo4455a("v", ((Long) obj).toString());
        } else if (obj instanceof String) {
            dnd.mo4459b("v", (String) obj);
        } else if (!(obj instanceof sq)) {
            return false;
        } else {
            dnd.mo4455a("v", ((sy) obj).f25520b.m34155b() + "." + ((sy) obj).f25522d);
        }
        dnj.mo4466a(dnd);
        return true;
    }

    /* renamed from: a */
    protected dnj mo5519a() {
        dnj dng = new dng();
        sy.m34142a(dng, "RootParentId", this.f25520b.m34155b());
        if (this.f25519a != null) {
            sy.m34142a(dng, "ParentSeqId", new Integer(this.f25519a.f25522d));
        }
        sy.m34142a(dng, "SeqId", new Integer(this.f25522d));
        sy.m34142a(dng, "Name", this.f25523e);
        sy.m34142a(dng, "Timestamp", this.f25524f);
        return dng;
    }

    /* renamed from: a */
    public final ss mo5518a(String str) {
        return sx.m34160a(this, str);
    }

    /* renamed from: a */
    public final void m34145a(Hashtable hashtable, C5770b c5770b) {
        this.f25525g = hashtable;
        this.f25524f = Long.valueOf(System.currentTimeMillis());
        this.f25521c.m34136a(this, c5770b);
    }

    /* renamed from: c */
    protected void mo5520c() {
        this.f25522d = this.f25520b.m34157d();
    }

    /* renamed from: e */
    public final sp m34147e() {
        return this.f25521c;
    }

    /* renamed from: f */
    public final sq m34148f() {
        return this.f25519a;
    }

    /* renamed from: g */
    public final byte[] m34149g() {
        dni dnd = new dnd();
        dnj a = mo5519a();
        dnj dng = new dng();
        for (String str : this.f25525g.keySet()) {
            sy.m34142a(dng, str, this.f25525g.get(str));
        }
        dnd.mo4454a("meta", a);
        if (dng.mo4465a() > 0) {
            dnd.mo4454a("attr", dng);
        }
        return ((dnd) dnd).mo4538d();
    }
}
