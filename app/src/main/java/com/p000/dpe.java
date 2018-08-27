package com.p000;

import java.io.ByteArrayOutputStream;
import p000.rl.C4177b;
import p000.rl.C5721a;

/* renamed from: dpe */
public class dpe extends dpj implements dnk, C4177b {
    /* renamed from: a */
    private static final rk f22516a = dnn.m28258a(dpe.class);
    /* renamed from: b */
    private int f22517b;
    /* renamed from: c */
    private dpa f22518c;
    /* renamed from: d */
    private boolean f22519d = false;
    /* renamed from: e */
    private rl f22520e;

    public dpe(String str, dpa dpa, rl rlVar) {
        super(str, (byte) 1);
        this.f22518c = dpa;
        this.f22520e = rlVar;
        this.f22517b = dpa.m28547c();
        C5721a c5721a = new C5721a((byte) 1, null);
        Thread currentThread = Thread.currentThread();
        rlVar.mo4288a();
        rlVar.mo4285a(c5721a, this, currentThread);
    }

    /* renamed from: a */
    protected final int m28621a() {
        return this.f22517b;
    }

    /* renamed from: a */
    public final void mo3863a(Object obj, Object obj2) {
        C5721a c5721a = (C5721a) obj;
        switch (c5721a.f25336a) {
            case (byte) 1:
                this.f22518c.m28531a(this.f22517b);
                return;
            case (byte) 2:
                Object[] objArr = (Object[]) c5721a.f25337b;
                byte[] bArr = (byte[]) objArr[0];
                boolean booleanValue = ((Boolean) objArr[1]).booleanValue();
                if (bArr != null) {
                    if (si.m34095b(this.f22518c.m28552i())) {
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        if (bArr.length < 128) {
                            byteArrayOutputStream.write(bArr.length & 127);
                        } else if (bArr.length < 16384) {
                            byteArrayOutputStream.write(((bArr.length >> 7) & 127) | 128);
                            byteArrayOutputStream.write(bArr.length & 127);
                        } else if (bArr.length < 2097152) {
                            byteArrayOutputStream.write(((bArr.length >> 14) & 127) | 128);
                            byteArrayOutputStream.write(((bArr.length >> 7) & 127) | 128);
                            byteArrayOutputStream.write(bArr.length & 127);
                        } else if (bArr.length < 268435456) {
                            byteArrayOutputStream.write(((bArr.length >> 21) & 127) | 128);
                            byteArrayOutputStream.write(((bArr.length >> 14) & 127) | 128);
                            byteArrayOutputStream.write(((bArr.length >> 7) & 127) | 128);
                            byteArrayOutputStream.write(bArr.length & 127);
                        } else {
                            f22516a.mo4281e("buffer size is too big!");
                            return;
                        }
                        byteArrayOutputStream.write(bArr, 0, bArr.length);
                        this.f22518c.m28542a(byteArrayOutputStream.toByteArray(), this.f22517b);
                    } else {
                        this.f22518c.m28542a(bArr, this.f22517b);
                    }
                }
                if (booleanValue) {
                    this.f22518c.m28544b(this.f22517b);
                    return;
                }
                return;
            default:
                return;
        }
    }

    /* renamed from: a */
    public final void mo4478a(byte[] bArr, int i, int i2, boolean z) throws dnq {
        if (bArr == null && !z) {
            f22516a.mo4281e("PDXAudioParam.addAudioBuf() in (NMSPAudioSink)PDXAudioParam.addAudioBuf(), the param \"buffer\" is null.");
            throw new NullPointerException("in (NMSPAudioSink)PDXAudioParam.addAudioBuf(), the param \"buffer\" is null.");
        } else if (bArr != null && i < 0) {
            f22516a.mo4281e("PDXAudioParam.addAudioBuf() the offset of the \"buffer\" is less than 0");
            throw new IllegalArgumentException("the offset of the \"buffer\" is less than 0");
        } else if (bArr != null && i2 <= 0) {
            f22516a.mo4281e("PDXAudioParam.addAudioBuf() the indicated length of the \"buffer\" is less than 1 byte");
            throw new IllegalArgumentException("the indicated length of the \"buffer\" is less than 1 byte");
        } else if (this.f22519d) {
            f22516a.mo4281e("PDXAudioParam.addAudioBuf() last audio buffer already added!");
            throw new dnq("last audio buffer already added!");
        } else {
            if (z) {
                this.f22519d = true;
            }
            Object obj = null;
            if (bArr != null) {
                obj = new byte[i2];
                System.arraycopy(bArr, i, obj, 0, i2);
            }
            Object obj2 = new Object[]{obj, new Boolean(z)};
            rl rlVar = this.f22520e;
            C5721a c5721a = new C5721a((byte) 2, obj2);
            Thread currentThread = Thread.currentThread();
            this.f22520e.mo4288a();
            rlVar.mo4285a(c5721a, this, currentThread);
        }
    }
}
