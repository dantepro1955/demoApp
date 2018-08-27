package com.p000;

import com.facebook.imageutils.JfifUtil;
import java.util.Enumeration;
import java.util.Hashtable;

/* renamed from: dnd */
public class dnd extends dnc implements dni {
    /* renamed from: a */
    private static final rk f22295a = dnn.m28258a(dnd.class);
    /* renamed from: b */
    private Hashtable f22296b = new Hashtable();

    public dnd() {
        super((short) 224);
    }

    public dnd(byte[] bArr) {
        super((short) 224);
        if (bArr.length <= 0) {
            return;
        }
        if ((bArr[0] & 255) != 224) {
            f22295a.mo4281e("PDXDictionary() Expected a dictionary. ");
            return;
        }
        int a = dnc.m28179a(bArr, 1);
        byte[] bArr2 = new byte[a];
        System.arraycopy(bArr, bArr.length - a, bArr2, 0, bArr2.length);
        m28195b(bArr2);
    }

    public dnd(byte[] bArr, byte b) {
        super((short) 224);
        m28195b(bArr);
    }

    /* renamed from: b */
    private void m28195b(byte[] bArr) {
        int i = 0;
        while (i < bArr.length) {
            int i2 = i + 1;
            i = bArr[i] & 255;
            if (i == 22) {
                i = dnc.m28179a(bArr, i2);
                i2 += dnc.m28178a(i);
                Object obj = new byte[i];
                System.arraycopy(bArr, i2, obj, 0, obj.length);
                i += i2;
                String str = new String(obj);
                int i3 = i + 1;
                int i4 = bArr[i] & 255;
                i = dnc.m28179a(bArr, i3);
                i3 += dnc.m28178a(i);
                byte[] bArr2 = new byte[i];
                System.arraycopy(bArr, i3, bArr2, 0, bArr2.length);
                i += i3;
                switch (i4) {
                    case 4:
                        this.f22296b.put(str, new ta(bArr2));
                        break;
                    case 5:
                        this.f22296b.put(str, new dnf());
                        break;
                    case 16:
                        this.f22296b.put(str, new dng(bArr2));
                        break;
                    case 22:
                        this.f22296b.put(str, new sz(bArr2));
                        break;
                    case JfifUtil.MARKER_SOFn /*192*/:
                        this.f22296b.put(str, new dne(bArr2));
                        break;
                    case 193:
                        this.f22296b.put(str, new dnh(bArr2));
                        break;
                    case 224:
                        this.f22296b.put(str, new dnd(bArr2, (byte) 0));
                        break;
                    default:
                        f22295a.mo4281e("PDXDictionary.setContent() Unknown PDXClass type: " + i4 + ". ");
                        break;
                }
            }
            f22295a.mo4281e("PDXDictionary.setContent() Expected an ASCII string but got " + i + ". ");
            return;
        }
    }

    /* renamed from: a */
    public final Enumeration mo4452a() {
        return this.f22296b.keys();
    }

    /* renamed from: a */
    protected final void m28197a(String str, int i) {
        this.f22296b.put(str, new dne(i));
    }

    /* renamed from: a */
    public final void mo4453a(String str, dni dni) {
        if (str == null || dni == null) {
            throw new IllegalArgumentException("key is : " + str + " value is : " + dni);
        } else if (((dnc) dni).m28181c() != (short) 224) {
            f22295a.mo4281e("PDXDictionary.addDictionary() value is not a valid dictionary.");
            throw new IllegalArgumentException("value is not a valid dictionary. ");
        } else {
            this.f22296b.put(str, dni);
        }
    }

    /* renamed from: a */
    public final void mo4454a(String str, dnj dnj) {
        if (str == null || dnj == null) {
            throw new IllegalArgumentException("key is : " + str + " value is : " + dnj);
        } else if (((dnc) dnj).m28181c() != (short) 16) {
            f22295a.mo4281e("PDXDictionary.addSequence() value is not a valid sequence.");
            throw new IllegalArgumentException("value is not a valid sequence. ");
        } else {
            this.f22296b.put(str, dnj);
        }
    }

    /* renamed from: a */
    public final void mo4455a(String str, String str2) {
        if (str == null || str2 == null) {
            throw new IllegalArgumentException("key is : " + str + " value is : " + str2);
        }
        this.f22296b.put(str, new sz(str2));
    }

    /* renamed from: a */
    public final void m28201a(String str, String str2, short s) {
        switch (s) {
            case (short) 22:
                this.f22296b.put(str, new sz(str2));
                return;
            case (short) 193:
                this.f22296b.put(str, new dnh(str2));
                return;
            default:
                return;
        }
    }

    /* renamed from: a */
    public final void mo4456a(String str, byte[] bArr) {
        if (str == null || bArr == null) {
            throw new IllegalArgumentException("key is : " + str + " value is : " + bArr);
        }
        this.f22296b.put(str, new ta(bArr));
    }

    /* renamed from: a */
    protected final void m28203a(String str, byte[] bArr, short s) {
        switch (s) {
            case (short) 4:
                this.f22296b.put(str, new ta(bArr));
                return;
            case (short) 5:
                this.f22296b.put(str, new dnf());
                return;
            case (short) 16:
                this.f22296b.put(str, new dng(bArr));
                return;
            case (short) 22:
                this.f22296b.put(str, new sz(bArr));
                return;
            case JfifUtil.MARKER_SOFn /*192*/:
                this.f22296b.put(str, new dne(bArr));
                return;
            case (short) 193:
                this.f22296b.put(str, new dnh(bArr));
                return;
            case (short) 224:
                this.f22296b.put(str, new dnd(bArr, (byte) 0));
                return;
            default:
                f22295a.mo4281e("PDXDictionary.put() Unknown PDXClass type: " + s + ". ");
                return;
        }
    }

    /* renamed from: a */
    public final boolean mo4457a(String str) {
        if (str != null) {
            return this.f22296b.containsKey(str);
        }
        throw new NullPointerException("PDXDictionary.containsKey key is null");
    }

    /* renamed from: b */
    public final dnc m28205b(String str) {
        return (dnc) this.f22296b.get(str);
    }

    /* renamed from: b */
    protected final String m28206b(int i) {
        String str = "";
        String str2 = "";
        int i2 = 0;
        String str3 = "";
        while (i2 < i - 1) {
            i2++;
            str3 = str3 + "    ";
        }
        String str4 = i > 0 ? str3 + "    " : str2;
        Enumeration keys = this.f22296b.keys();
        r3 = i != 0 ? str + "{ \n" : str;
        while (keys.hasMoreElements()) {
            str2 = (String) keys.nextElement();
            dnc dnc = (dnc) this.f22296b.get(str2);
            switch (dnc.m28181c()) {
                case (short) 4:
                    r3 = r3 + str4 + str2 + ": <BYTES> \"" + ((ta) dnc).m34171a() + "\"\n";
                    continue;
                case (short) 5:
                    r3 = r3 + str4 + str2 + ": <NULL> \n";
                    continue;
                case (short) 16:
                    str2 = r3 + str4 + str2 + ": " + ((dng) dnc).m28234d(i + 1) + "\n";
                    break;
                case (short) 22:
                    r3 = r3 + str4 + str2 + ": <ASCII> \"" + ((sz) dnc).m34168a() + "\"\n";
                    continue;
                case JfifUtil.MARKER_SOFn /*192*/:
                    r3 = r3 + str4 + str2 + ": <INT> " + ((dne) dnc).m28216a() + "\n";
                    continue;
                case (short) 193:
                    r3 = r3 + str4 + str2 + ": <UTF8> \"" + ((dnh) dnc).m28235a() + "\"\n";
                    continue;
                case (short) 224:
                    r3 = r3 + str4 + str2 + ": " + ((dnd) dnc).m28206b(i + 1) + "\n";
                    continue;
                default:
                    str2 = r3;
                    break;
            }
            r3 = str2;
        }
        return i != 0 ? r3 + str3 + "} " : r3;
    }

    /* renamed from: b */
    public final void mo4458b(String str, int i) {
        if (str == null) {
            throw new IllegalArgumentException("key is null.");
        }
        this.f22296b.put(str, new dne(i));
    }

    /* renamed from: b */
    public final void mo4459b(String str, String str2) {
        if (str == null || str2 == null) {
            throw new IllegalArgumentException("key is : " + str + " value is : " + str2);
        }
        this.f22296b.put(str, new dnh(str2));
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: b */
    public final byte[] m28209b() {
        /*
        r6 = this;
        r1 = new java.io.ByteArrayOutputStream;
        r1.<init>();
        r0 = r6.f22296b;
        r2 = r0.keys();
    L_0x000b:
        r0 = r2.hasMoreElements();
        if (r0 == 0) goto L_0x009b;
    L_0x0011:
        r0 = r2.nextElement();
        r0 = (java.lang.String) r0;
        r3 = new sz;
        r3.<init>(r0);
        r3 = r3.m34169b();	 Catch:{ IOException -> 0x003d }
        r1.write(r3);	 Catch:{ IOException -> 0x003d }
        r3 = r6.f22296b;	 Catch:{ IOException -> 0x003d }
        r0 = r3.get(r0);	 Catch:{ IOException -> 0x003d }
        r0 = (p000.dnc) r0;	 Catch:{ IOException -> 0x003d }
        r3 = r0.m28181c();	 Catch:{ IOException -> 0x003d }
        switch(r3) {
            case 4: goto L_0x0033;
            case 5: goto L_0x007b;
            case 16: goto L_0x0090;
            case 22: goto L_0x0071;
            case 192: goto L_0x005d;
            case 193: goto L_0x0067;
            case 224: goto L_0x0085;
            default: goto L_0x0032;
        };	 Catch:{ IOException -> 0x003d }
    L_0x0032:
        goto L_0x000b;
    L_0x0033:
        r0 = (p000.ta) r0;	 Catch:{ IOException -> 0x003d }
        r0 = r0.m34172b();	 Catch:{ IOException -> 0x003d }
        r1.write(r0);	 Catch:{ IOException -> 0x003d }
        goto L_0x000b;
    L_0x003d:
        r0 = move-exception;
        r3 = f22295a;
        r4 = new java.lang.StringBuilder;
        r5 = "PDXDictionary.getContent() ";
        r4.<init>(r5);
        r0 = r0.toString();
        r0 = r4.append(r0);
        r4 = ". ";
        r0 = r0.append(r4);
        r0 = r0.toString();
        r3.mo4281e(r0);
        goto L_0x000b;
    L_0x005d:
        r0 = (p000.dne) r0;	 Catch:{ IOException -> 0x003d }
        r0 = r0.m28217b();	 Catch:{ IOException -> 0x003d }
        r1.write(r0);	 Catch:{ IOException -> 0x003d }
        goto L_0x000b;
    L_0x0067:
        r0 = (p000.dnh) r0;	 Catch:{ IOException -> 0x003d }
        r0 = r0.m28236b();	 Catch:{ IOException -> 0x003d }
        r1.write(r0);	 Catch:{ IOException -> 0x003d }
        goto L_0x000b;
    L_0x0071:
        r0 = (p000.sz) r0;	 Catch:{ IOException -> 0x003d }
        r0 = r0.m34169b();	 Catch:{ IOException -> 0x003d }
        r1.write(r0);	 Catch:{ IOException -> 0x003d }
        goto L_0x000b;
    L_0x007b:
        r0 = (p000.dnf) r0;	 Catch:{ IOException -> 0x003d }
        r0 = r0.m28218a();	 Catch:{ IOException -> 0x003d }
        r1.write(r0);	 Catch:{ IOException -> 0x003d }
        goto L_0x000b;
    L_0x0085:
        r0 = (p000.dnd) r0;	 Catch:{ IOException -> 0x003d }
        r0 = r0.mo4538d();	 Catch:{ IOException -> 0x003d }
        r1.write(r0);	 Catch:{ IOException -> 0x003d }
        goto L_0x000b;
    L_0x0090:
        r0 = (p000.dng) r0;	 Catch:{ IOException -> 0x003d }
        r0 = r0.m28232b();	 Catch:{ IOException -> 0x003d }
        r1.write(r0);	 Catch:{ IOException -> 0x003d }
        goto L_0x000b;
    L_0x009b:
        r0 = r1.toByteArray();
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: dnd.b():byte[]");
    }

    /* renamed from: c */
    public final int mo4460c(String str) {
        if (str == null) {
            throw new IllegalArgumentException("key is null.");
        }
        dnc dnc = (dnc) this.f22296b.get(str);
        if (dnc == null) {
            if (f22295a.mo4282e()) {
                f22295a.mo4281e("PDXDictionary.getInteger() " + str + " does not exist. ");
            }
            throw new RuntimeException("key does not exist. ");
        } else if (dnc.m28181c() == (short) 192) {
            return ((dne) dnc).m28216a();
        } else {
            if (f22295a.mo4282e()) {
                f22295a.mo4281e("PDXDictionary.getInteger() " + str + " is not a PDXInteger. ");
            }
            throw new RuntimeException("key is of wrong type. ");
        }
    }

    /* renamed from: d */
    public byte[] mo4538d() {
        return super.m28180a(m28209b());
    }

    /* renamed from: d */
    public final byte[] mo4461d(String str) {
        if (str == null) {
            throw new IllegalArgumentException("key is null.");
        }
        dnc dnc = (dnc) this.f22296b.get(str);
        if (dnc == null) {
            f22295a.mo4281e("PDXDictionary.getByteString() " + str + " does not exist. ");
            throw new RuntimeException("key does not exist. ");
        } else if (dnc.m28181c() == (short) 4) {
            return ((ta) dnc).m34171a();
        } else {
            f22295a.mo4281e("PDXDictionary.getByteString() " + str + " is not a PDXByteString. ");
            throw new RuntimeException("key is of wrong type. ");
        }
    }

    /* renamed from: e */
    public final String mo4462e(String str) {
        if (str == null) {
            throw new IllegalArgumentException("key is null.");
        }
        dnc dnc = (dnc) this.f22296b.get(str);
        if (dnc == null) {
            f22295a.mo4281e("PDXDictionary.getUTF8String() " + str + " does not exist. ");
            throw new RuntimeException("key does not exist. ");
        } else if (dnc.m28181c() == (short) 193) {
            return ((dnh) dnc).m28235a();
        } else {
            f22295a.mo4281e("PDXDictionary.getUTF8String() " + str + " is not a PDXUTF8String. ");
            throw new RuntimeException("key is of wrong type. ");
        }
    }

    /* renamed from: f */
    public final String mo4463f(String str) {
        if (str == null) {
            throw new IllegalArgumentException("key is null.");
        }
        dnc dnc = (dnc) this.f22296b.get(str);
        if (dnc == null) {
            f22295a.mo4281e("PDXDictionary.getAsciiString() " + str + " does not exist. ");
            throw new RuntimeException("key does not exist. ");
        } else if (dnc.m28181c() == (short) 22) {
            return ((sz) dnc).m34168a();
        } else {
            f22295a.mo4281e("PDXDictionary.getAsciiString() " + str + " is not a PDXAsciiString. ");
            throw new RuntimeException("key is of wrong type. ");
        }
    }

    /* renamed from: g */
    public final dnj mo4464g(String str) {
        if (str == null) {
            throw new IllegalArgumentException("key is null.");
        }
        dnc dnc = (dnc) this.f22296b.get(str);
        if (dnc == null) {
            f22295a.mo4281e("PDXDictionary.getSequence() " + str + " does not exist. ");
            throw new RuntimeException("key does not exist. ");
        } else if (dnc.m28181c() == (short) 16) {
            return (dng) dnc;
        } else {
            f22295a.mo4281e("PDXDictionary.getSequence() " + str + " is not a PDXSequence. ");
            throw new RuntimeException("key is of wrong type. ");
        }
    }

    public String toString() {
        return m28206b(0);
    }
}
