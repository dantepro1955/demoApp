package com.p000;

/* renamed from: sd */
public class sd {
    /* renamed from: d */
    private static final rk f25455d = dnn.m28258a(sd.class);
    /* renamed from: a */
    public byte f25456a;
    /* renamed from: b */
    public short f25457b;
    /* renamed from: c */
    public int f25458c;
    /* renamed from: e */
    private byte f25459e;

    public sd(byte b, byte b2, short s, int i) {
        if (f25455d.mo4276b()) {
            f25455d.mo4275b("Constructing XModeMsgHeader(protocol=" + b + ", version=" + b2 + ", cmd=" + s + ", len=" + i + ")");
        }
        this.f25456a = b;
        this.f25459e = b2;
        this.f25457b = s;
        this.f25458c = i;
    }

    public sd(byte[] bArr) {
        if (f25455d.mo4276b()) {
            f25455d.mo4275b((Object) "Constructing XModeMsgHeader(byte[])");
            f25455d.m25946a(bArr);
        }
        this.f25456a = bArr[0];
        this.f25459e = bArr[1];
        this.f25457b = sf.m34087a(bArr, 2);
        this.f25458c = sf.m34090b(bArr, 4);
    }

    /* renamed from: a */
    public final byte[] m34085a() {
        if (f25455d.mo4276b()) {
            f25455d.mo4275b((Object) "XModeMsgHeader.getBytes()");
        }
        byte[] bArr = new byte[8];
        bArr[0] = this.f25456a;
        bArr[1] = this.f25459e;
        sf.m34089a(this.f25457b, bArr, 2);
        sf.m34088a(this.f25458c, bArr, 4);
        if (f25455d.mo4276b()) {
            f25455d.mo4272a((Object) "Generated: ");
            f25455d.m25946a(bArr);
        }
        return bArr;
    }
}
