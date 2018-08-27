package com.p000;

import com.facebook.imageutils.JfifUtil;
import java.util.Enumeration;
import java.util.Vector;

/* renamed from: dng */
public class dng extends dnc implements dnj {
    /* renamed from: a */
    private static final rk f22298a = dnn.m28258a(dng.class);
    /* renamed from: b */
    private Vector f22299b = new Vector();

    public dng() {
        super((short) 16);
    }

    public dng(byte[] bArr) {
        super((short) 16);
        int i = 0;
        while (i < bArr.length) {
            int i2 = i + 1;
            int i3 = bArr[i] & 255;
            i = dnc.m28179a(bArr, i2);
            i2 += dnc.m28178a(i);
            byte[] bArr2 = new byte[i];
            System.arraycopy(bArr, i2, bArr2, 0, bArr2.length);
            i += i2;
            switch (i3) {
                case 4:
                    this.f22299b.addElement(new ta(bArr2));
                    break;
                case 5:
                    this.f22299b.addElement(new dnf());
                    break;
                case 16:
                    this.f22299b.addElement(new dng(bArr2));
                    break;
                case 22:
                    this.f22299b.addElement(new sz(bArr2));
                    break;
                case JfifUtil.MARKER_SOFn /*192*/:
                    this.f22299b.addElement(new dne(bArr2));
                    break;
                case 193:
                    this.f22299b.addElement(new dnh(bArr2));
                    break;
                case 224:
                    this.f22299b.addElement(new dnd(bArr2, (byte) 0));
                    break;
                default:
                    f22298a.mo4281e("PDXSequence() Unknown PDXClass type: " + i3 + ". ");
                    break;
            }
        }
    }

    /* renamed from: a */
    public final int mo4465a() {
        return this.f22299b.size();
    }

    /* renamed from: a */
    public final void mo4466a(dni dni) {
        if (dni == null) {
            throw new IllegalArgumentException("value is null.");
        } else if (((dnc) dni).m28181c() != (short) 224) {
            f22298a.mo4281e("PDXSequence.addDictionary() value is not a valid dictionary.");
            throw new IllegalArgumentException("value is not a valid dictionary. ");
        } else {
            this.f22299b.addElement(dni);
        }
    }

    /* renamed from: a */
    public final void mo4467a(dnj dnj) {
        if (dnj == null) {
            throw new IllegalArgumentException("value is null.");
        } else if (((dnc) dnj).m28181c() != (short) 16) {
            f22298a.mo4281e("PDXSequence.addSequence() value is not a valid sequence.");
            throw new IllegalArgumentException("value is not a valid sequence. ");
        } else {
            this.f22299b.addElement(dnj);
        }
    }

    /* renamed from: a */
    public final void mo4468a(String str) {
        if (str == null) {
            throw new IllegalArgumentException("value is null.");
        }
        this.f22299b.addElement(new dnh(str));
    }

    /* renamed from: b */
    public final dni mo4469b(int i) {
        if (i >= this.f22299b.size()) {
            f22298a.mo4281e("PDXSequence.getDictionary() index " + i + " is out of range. ");
            throw new IndexOutOfBoundsException();
        }
        dnc dnc = (dnc) this.f22299b.elementAt(i);
        if (dnc.m28181c() == (short) 224) {
            return (dnd) dnc;
        }
        f22298a.mo4281e("PDXSequence.getDictionary() index " + i + " is not a PDXDictionary. ");
        throw new RuntimeException("index is of wrong type.");
    }

    /* renamed from: b */
    public final void mo4470b(byte[] bArr) {
        if (bArr == null) {
            throw new IllegalArgumentException("value is null.");
        }
        this.f22299b.addElement(new ta(bArr));
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: b */
    public final byte[] m28232b() {
        /*
        r6 = this;
        r1 = new java.io.ByteArrayOutputStream;
        r1.<init>();
        r0 = r6.f22299b;
        r2 = r0.elements();
    L_0x000b:
        r0 = r2.hasMoreElements();
        if (r0 == 0) goto L_0x0085;
    L_0x0011:
        r0 = r2.nextElement();
        r0 = (p000.dnc) r0;
        r3 = r0.m28181c();	 Catch:{ IOException -> 0x0029 }
        switch(r3) {
            case 4: goto L_0x001f;
            case 5: goto L_0x0067;
            case 16: goto L_0x007b;
            case 22: goto L_0x005d;
            case 192: goto L_0x0049;
            case 193: goto L_0x0053;
            case 224: goto L_0x0071;
            default: goto L_0x001e;
        };	 Catch:{ IOException -> 0x0029 }
    L_0x001e:
        goto L_0x000b;
    L_0x001f:
        r0 = (p000.ta) r0;	 Catch:{ IOException -> 0x0029 }
        r0 = r0.m34172b();	 Catch:{ IOException -> 0x0029 }
        r1.write(r0);	 Catch:{ IOException -> 0x0029 }
        goto L_0x000b;
    L_0x0029:
        r0 = move-exception;
        r3 = f22298a;
        r4 = new java.lang.StringBuilder;
        r5 = "PDXSequence.toByteArray() ";
        r4.<init>(r5);
        r0 = r0.toString();
        r0 = r4.append(r0);
        r4 = ". ";
        r0 = r0.append(r4);
        r0 = r0.toString();
        r3.mo4281e(r0);
        goto L_0x000b;
    L_0x0049:
        r0 = (p000.dne) r0;	 Catch:{ IOException -> 0x0029 }
        r0 = r0.m28217b();	 Catch:{ IOException -> 0x0029 }
        r1.write(r0);	 Catch:{ IOException -> 0x0029 }
        goto L_0x000b;
    L_0x0053:
        r0 = (p000.dnh) r0;	 Catch:{ IOException -> 0x0029 }
        r0 = r0.m28236b();	 Catch:{ IOException -> 0x0029 }
        r1.write(r0);	 Catch:{ IOException -> 0x0029 }
        goto L_0x000b;
    L_0x005d:
        r0 = (p000.sz) r0;	 Catch:{ IOException -> 0x0029 }
        r0 = r0.m34169b();	 Catch:{ IOException -> 0x0029 }
        r1.write(r0);	 Catch:{ IOException -> 0x0029 }
        goto L_0x000b;
    L_0x0067:
        r0 = (p000.dnf) r0;	 Catch:{ IOException -> 0x0029 }
        r0 = r0.m28218a();	 Catch:{ IOException -> 0x0029 }
        r1.write(r0);	 Catch:{ IOException -> 0x0029 }
        goto L_0x000b;
    L_0x0071:
        r0 = (p000.dnd) r0;	 Catch:{ IOException -> 0x0029 }
        r0 = r0.mo4538d();	 Catch:{ IOException -> 0x0029 }
        r1.write(r0);	 Catch:{ IOException -> 0x0029 }
        goto L_0x000b;
    L_0x007b:
        r0 = (p000.dng) r0;	 Catch:{ IOException -> 0x0029 }
        r0 = r0.m28232b();	 Catch:{ IOException -> 0x0029 }
        r1.write(r0);	 Catch:{ IOException -> 0x0029 }
        goto L_0x000b;
    L_0x0085:
        r0 = r1.toByteArray();
        r0 = super.m28180a(r0);
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: dng.b():byte[]");
    }

    /* renamed from: c */
    public final void mo4471c(int i) {
        this.f22299b.addElement(new dne(i));
    }

    /* renamed from: d */
    protected final String m28234d(int i) {
        String str = "";
        String str2 = "";
        int i2 = 0;
        String str3 = "";
        while (i2 < i - 1) {
            i2++;
            str3 = str3 + "    ";
        }
        String str4 = i > 0 ? str3 + "    " : str2;
        Enumeration elements = this.f22299b.elements();
        String str5 = str + "[ \n";
        while (elements.hasMoreElements()) {
            dnc dnc = (dnc) elements.nextElement();
            switch (dnc.m28181c()) {
                case (short) 4:
                    str5 = str5 + str4 + "<BYTES> \"" + ((ta) dnc).m34171a() + "\" ";
                    break;
                case (short) 5:
                    str5 = str5 + str4 + "<NULL> ";
                    break;
                case (short) 16:
                    str5 = str5 + str4 + ((dng) dnc).m28234d(i + 1);
                    break;
                case (short) 22:
                    str5 = str5 + str4 + "<ASCII> \"" + ((sz) dnc).m34168a() + "\" ";
                    break;
                case JfifUtil.MARKER_SOFn /*192*/:
                    str5 = str5 + str4 + "<INT> " + ((dne) dnc).m28216a();
                    break;
                case (short) 193:
                    str5 = str5 + str4 + "<UTF8> \"" + ((dnh) dnc).m28235a() + "\" ";
                    break;
                case (short) 224:
                    str5 = str5 + str4 + ((dnd) dnc).m28206b(i + 1);
                    break;
            }
            if (elements.hasMoreElements()) {
                str5 = str5 + ",";
            }
            str5 = str5 + "\n";
        }
        return str5 + str3 + "] ";
    }

    public String toString() {
        return m28234d(0);
    }
}
