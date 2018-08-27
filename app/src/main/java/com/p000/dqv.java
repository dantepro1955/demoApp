package com.p000;

import java.io.UnsupportedEncodingException;
import java.util.Hashtable;
import java.util.Vector;

/* renamed from: dqv */
public class dqv implements dqu {
    /* renamed from: a */
    private static final rk f22642a = dnn.m28258a(dqv.class);
    /* renamed from: b */
    private byte[] f22643b;
    /* renamed from: c */
    private String f22644c = "Cp1252";
    /* renamed from: d */
    private C50421 f22645d = null;

    /* renamed from: dqv$1 */
    static /* synthetic */ class C50421 {
        /* renamed from: a */
        public int f22631a;
        /* renamed from: b */
        public int f22632b;
        /* renamed from: c */
        public int f22633c;
        /* renamed from: d */
        public int f22634d;
        /* renamed from: e */
        public int f22635e;

        private C50421() {
            this.f22631a = -1;
            this.f22632b = -1;
            this.f22633c = -1;
            this.f22634d = -1;
            this.f22635e = -1;
        }
    }

    /* renamed from: dqv$a */
    class C5043a {
        /* renamed from: a */
        public dqs f22636a;
        /* renamed from: b */
        public int f22637b;
        /* renamed from: c */
        public int f22638c;

        private C5043a() {
            this.f22636a = new dqs();
            Vector vector = new Vector();
            this.f22637b = 0;
            this.f22638c = 0;
        }
    }

    /* renamed from: dqv$b */
    class C5044b {
        /* renamed from: a */
        public int f22639a;
        /* renamed from: b */
        public int f22640b;
        /* renamed from: c */
        public dqt f22641c;

        private C5044b() {
            this.f22639a = 0;
            this.f22640b = 0;
            this.f22641c = null;
        }
    }

    public dqv(byte[] bArr) {
        String str;
        this.f22643b = bArr;
        C50421 c50421 = new C50421();
        int a = m28772a(2, m28780b());
        c50421.f22635e = a;
        a = m28782b(a + 4, m28771a(a));
        c50421.f22634d = a;
        a = m28772a(a + 2, m28787e(a));
        c50421.f22632b = m28773a(3, a, bArr.length);
        c50421.f22633c = m28773a(4, a, bArr.length);
        c50421.f22631a = m28773a(1, a, bArr.length);
        this.f22645d = c50421;
        c50421 = this.f22645d;
        if (c50421.f22633c == -1) {
            str = "Cp1252";
        } else {
            int i = c50421.f22633c + 4;
            str = drd.m28806a(this.f22643b, i + 4, ((int) drd.m28808c(this.f22643b, i)) - 1, "Cp1252");
            if (!dqv.m28779a(str == "Windows-1252" ? "Cp1252" : str)) {
                str = "Cp1252";
            }
        }
        this.f22644c = str;
    }

    /* renamed from: a */
    private int m28771a(int i) {
        int b = drd.m28807b(this.f22643b, i);
        if (f22642a.mo4274a()) {
            f22642a.mo4272a("Number of sentences: " + b);
        }
        return b;
    }

    /* renamed from: a */
    private int m28772a(int i, int i2) {
        int i3 = 0;
        while (i < this.f22643b.length && i3 < i2) {
            if (this.f22643b[i] == (byte) 0) {
                i3++;
            }
            i++;
        }
        return i;
    }

    /* renamed from: a */
    private int m28773a(int i, int i2, int i3) {
        int i4 = i2;
        while (i4 < i3) {
            long c = drd.m28808c(this.f22643b, i4);
            if (f22642a.mo4274a()) {
                f22642a.mo4272a("Received extension id=" + c);
            }
            if (c == ((long) i)) {
                return i4;
            }
            i4 += 4;
            c = drd.m28808c(this.f22643b, i4);
            if (f22642a.mo4274a()) {
                f22642a.mo4272a("Received payload size: " + c);
            }
            i4 = (i4 + ((int) c)) + 4;
        }
        return -1;
    }

    /* renamed from: a */
    private C5043a m28774a(int i, int i2, Vector vector) {
        int i3 = 0;
        int b = m28781b(i);
        int i4 = i + 4;
        dqs dqs = new dqs();
        C5043a c5043a = new C5043a();
        while (i3 < b) {
            C5044b a = m28775a(i4, i2, 2, vector);
            dqs.m28760a(a.f22641c);
            i4 = a.f22639a;
            i2 = a.f22640b;
            if (f22642a.mo4274a()) {
                dqt dqt = a.f22641c;
                f22642a.mo4272a("Extracted word: startTime [" + dqt.m28765b() + "] endTime [" + dqt.m28766c() + "] content [" + dqt.m28763a() + "]");
            }
            i3++;
        }
        c5043a.f22637b = i4;
        c5043a.f22638c = i2;
        c5043a.f22636a = dqs;
        return c5043a;
    }

    /* renamed from: a */
    private C5044b m28775a(int i, int i2, int i3, Vector vector) {
        long d;
        long d2;
        int i4;
        C5044b c5044b = new C5044b();
        int i5 = i + 2;
        String str = (String) vector.elementAt(drd.m28804a(this.f22643b, i) - 1);
        int i6;
        if (i3 == 4) {
            d = m28786d(i5);
            i6 = i5 + i3;
            d2 = m28786d(i6);
            i4 = i6 + i3;
        } else {
            d = (long) m28784c(i5);
            i6 = i5 + i3;
            d2 = (long) m28784c(i6);
            i4 = i6 + i3;
        }
        double d3 = 0.0d;
        if (i2 != -1) {
            d3 = (double) drd.m28804a(this.f22643b, i2);
            i2 += 2;
        }
        c5044b.f22641c = new dqt(str, d, d2, d3, true, (byte) 0);
        c5044b.f22639a = i4;
        c5044b.f22640b = i2;
        return c5044b;
    }

    /* renamed from: a */
    private Vector m28776a(C50421 c50421, Vector vector) {
        int i = 0;
        int i2 = c50421.f22631a != -1 ? 1 : 0;
        int i3 = i2 != 0 ? c50421.f22631a : c50421.f22635e;
        int i4 = c50421.f22632b != -1 ? 1 : 0;
        if (i2 != 0) {
            i3 = (i3 + 4) + 4;
        }
        int a = m28771a(i3);
        int i5 = i3 + 4;
        i3 = c50421.f22632b;
        if (i4 != 0) {
            i3 = (((i3 + 4) + 4) + 4) + 4;
        }
        Vector vector2 = new Vector();
        int i6 = i5;
        i5 = i3;
        i3 = i6;
        while (i < a) {
            C5043a b = i2 != 0 ? m28783b(i3, i5, vector) : m28774a(i3, i5, vector);
            if (f22642a.mo4274a()) {
                f22642a.mo4272a("Number of words in Sentence " + i + ": [" + b.f22636a.m28761b() + "]");
            }
            vector2.addElement(b.f22636a);
            i5 = b.f22637b;
            i4 = b.f22638c;
            if (f22642a.mo4274a()) {
                f22642a.mo4272a("Extracted sentence: [" + b.f22636a + "]");
            }
            i++;
            i3 = i5;
            i5 = i4;
        }
        return vector2;
    }

    /* renamed from: a */
    private static void m28777a(Hashtable hashtable) {
        for (int i = 0; hashtable.remove("CFD" + i) != null; i++) {
        }
        if (hashtable.containsKey("IAL")) {
            hashtable.put("InputAudioLength", hashtable.get("IAL"));
        }
    }

    /* renamed from: a */
    private static void m28778a(Hashtable hashtable, Vector vector) {
        for (int i = 0; i < vector.size(); i++) {
            String str = (String) hashtable.get("CFD" + i);
            if (str != null) {
                try {
                    ((dqs) vector.elementAt(i)).m28758a(Double.parseDouble(str));
                } catch (NumberFormatException e) {
                }
            }
        }
    }

    /* renamed from: a */
    private static boolean m28779a(String str) {
        try {
            new byte[1][0] = (byte) 20;
            return true;
        } catch (UnsupportedEncodingException e) {
            if (f22642a.mo4280d()) {
                f22642a.mo4279d(str + " character encoding is not available in your VM. Using the default one.");
            }
            return false;
        }
    }

    /* renamed from: b */
    private int m28780b() {
        int a = drd.m28804a(this.f22643b, 0);
        if (f22642a.mo4274a()) {
            f22642a.mo4272a("Number of words: " + a);
        }
        return a;
    }

    /* renamed from: b */
    private int m28781b(int i) {
        return drd.m28807b(this.f22643b, i);
    }

    /* renamed from: b */
    private int m28782b(int i, int i2) {
        int i3 = 0;
        while (i3 < i2) {
            int i4 = i + 4;
            for (int i5 = 0; i5 < m28781b(i); i5++) {
                i4 += 6;
            }
            i3++;
            i = i4;
        }
        return i;
    }

    /* renamed from: b */
    private C5043a m28783b(int i, int i2, Vector vector) {
        int i3 = 0;
        int b = m28781b(i);
        int i4 = i + 4;
        C5043a c5043a = new C5043a();
        while (i3 < b) {
            C5044b a = m28775a(i4, i2, 4, vector);
            c5043a.f22636a.m28760a(a.f22641c);
            i4 = a.f22639a;
            i2 = a.f22640b;
            if (f22642a.mo4274a()) {
                dqt dqt = a.f22641c;
                f22642a.mo4272a("Extracted word: startTime [" + dqt.m28765b() + "] endTime [" + dqt.m28766c() + "] content [" + dqt.m28763a() + "]");
            }
            i3++;
        }
        c5043a.f22637b = i4;
        c5043a.f22638c = i2;
        return c5043a;
    }

    /* renamed from: c */
    private int m28784c(int i) {
        return drd.m28804a(this.f22643b, i);
    }

    /* renamed from: c */
    private Vector m28785c(int i, int i2) {
        Vector vector = new Vector();
        for (int i3 = 0; i3 < i; i3++) {
            int d = drd.m28809d(this.f22643b, i2);
            String a = drd.m28806a(this.f22643b, i2, d, this.f22644c.equals("Cp1252") ? "Windows-1252" : this.f22644c);
            vector.addElement(a);
            if (f22642a.mo4274a()) {
                f22642a.mo4272a("Added a word to the list: [" + a + "] offset [" + i2 + "] len [" + d + "]");
            }
            i2 += d + 1;
        }
        return vector;
    }

    /* renamed from: d */
    private long m28786d(int i) {
        return drd.m28808c(this.f22643b, i);
    }

    /* renamed from: e */
    private int m28787e(int i) {
        int a = drd.m28804a(this.f22643b, i);
        if (f22642a.mo4274a()) {
            f22642a.mo4272a("Number of key-value pairs: " + a);
        }
        return a;
    }

    /* renamed from: f */
    private Hashtable m28788f(int i) {
        int e = m28787e(i);
        int i2 = i + 2;
        Hashtable hashtable = new Hashtable();
        Vector c = m28785c(e, i2);
        if (f22642a.mo4274a()) {
            f22642a.mo4272a("Extracted " + c.size() + " words from the set of key-value pairs.");
        }
        for (i2 = 0; i2 < c.size(); i2++) {
            String str = (String) c.elementAt(i2);
            int indexOf = str.indexOf(61);
            if (indexOf == -1) {
                throw new IllegalArgumentException("Received an invalid key-value pair: " + ((String) c.elementAt(i2)));
            }
            hashtable.put(str.substring(0, indexOf), str.substring(indexOf + 1, str.length()));
        }
        return hashtable;
    }

    /* renamed from: a */
    public final dqn mo4554a() {
        int i = 0;
        f22642a.mo4275b((Object) "Unpacking DNS binary version 3.2 results.");
        Vector c = m28785c(m28780b(), 2);
        if (f22642a.mo4276b()) {
            f22642a.mo4275b("Found " + c.size() + " in word list");
            if (f22642a.mo4274a()) {
                for (int i2 = 0; i2 < c.size(); i2++) {
                    f22642a.mo4272a(c.elementAt(i2).toString());
                }
            }
        }
        Vector a = m28776a(this.f22645d, c);
        if (f22642a.mo4276b()) {
            f22642a.mo4275b("Found " + a.size() + " in n-best list");
            if (f22642a.mo4274a()) {
                while (i < a.size()) {
                    f22642a.mo4272a(a.elementAt(i).toString());
                    i++;
                }
            }
        }
        Hashtable f = m28788f(this.f22645d.f22634d);
        dqv.m28778a(f, a);
        dqv.m28777a(f);
        return new dqr(a);
    }
}
