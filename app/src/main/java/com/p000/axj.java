package com.p000;

import java.io.IOException;
import java.util.Arrays;

/* renamed from: axj */
public interface axj {

    /* renamed from: axj$a */
    public static final class C0865a extends awz<C0865a> implements Cloneable {
        /* renamed from: a */
        public String[] f4848a;
        /* renamed from: b */
        public String[] f4849b;
        /* renamed from: c */
        public int[] f4850c;
        /* renamed from: d */
        public long[] f4851d;
        /* renamed from: e */
        public long[] f4852e;

        public C0865a() {
            m6317b();
        }

        /* renamed from: a */
        protected int mo718a() {
            int i;
            int i2;
            int i3;
            int i4 = 0;
            int a = super.mo718a();
            if (this.f4848a == null || this.f4848a.length <= 0) {
                i = a;
            } else {
                i2 = 0;
                i3 = 0;
                for (String str : this.f4848a) {
                    if (str != null) {
                        i3++;
                        i2 += awy.m6214b(str);
                    }
                }
                i = (a + i2) + (i3 * 1);
            }
            if (this.f4849b != null && this.f4849b.length > 0) {
                i3 = 0;
                a = 0;
                for (String str2 : this.f4849b) {
                    if (str2 != null) {
                        a++;
                        i3 += awy.m6214b(str2);
                    }
                }
                i = (i + i3) + (a * 1);
            }
            if (this.f4850c != null && this.f4850c.length > 0) {
                i3 = 0;
                for (int a2 : this.f4850c) {
                    i3 += awy.m6208b(a2);
                }
                i = (i + i3) + (this.f4850c.length * 1);
            }
            if (this.f4851d != null && this.f4851d.length > 0) {
                i3 = 0;
                for (long e : this.f4851d) {
                    i3 += awy.m6224e(e);
                }
                i = (i + i3) + (this.f4851d.length * 1);
            }
            if (this.f4852e == null || this.f4852e.length <= 0) {
                return i;
            }
            i2 = 0;
            while (i4 < this.f4852e.length) {
                i2 += awy.m6224e(this.f4852e[i4]);
                i4++;
            }
            return (i + i2) + (this.f4852e.length * 1);
        }

        /* renamed from: a */
        public C0865a m6314a(awx awx) throws IOException {
            while (true) {
                int a = awx.m6177a();
                int a2;
                Object obj;
                int c;
                Object obj2;
                switch (a) {
                    case 0:
                        break;
                    case 10:
                        a2 = axi.m6311a(awx, 10);
                        a = this.f4848a == null ? 0 : this.f4848a.length;
                        obj = new String[(a2 + a)];
                        if (a != 0) {
                            System.arraycopy(this.f4848a, 0, obj, 0, a);
                        }
                        while (a < obj.length - 1) {
                            obj[a] = awx.m6191g();
                            awx.m6177a();
                            a++;
                        }
                        obj[a] = awx.m6191g();
                        this.f4848a = obj;
                        continue;
                    case 18:
                        a2 = axi.m6311a(awx, 18);
                        a = this.f4849b == null ? 0 : this.f4849b.length;
                        obj = new String[(a2 + a)];
                        if (a != 0) {
                            System.arraycopy(this.f4849b, 0, obj, 0, a);
                        }
                        while (a < obj.length - 1) {
                            obj[a] = awx.m6191g();
                            awx.m6177a();
                            a++;
                        }
                        obj[a] = awx.m6191g();
                        this.f4849b = obj;
                        continue;
                    case 24:
                        a2 = axi.m6311a(awx, 24);
                        a = this.f4850c == null ? 0 : this.f4850c.length;
                        obj = new int[(a2 + a)];
                        if (a != 0) {
                            System.arraycopy(this.f4850c, 0, obj, 0, a);
                        }
                        while (a < obj.length - 1) {
                            obj[a] = awx.m6187e();
                            awx.m6177a();
                            a++;
                        }
                        obj[a] = awx.m6187e();
                        this.f4850c = obj;
                        continue;
                    case 26:
                        c = awx.m6183c(awx.m6194j());
                        a2 = awx.m6200p();
                        a = 0;
                        while (awx.m6198n() > 0) {
                            awx.m6187e();
                            a++;
                        }
                        awx.m6188e(a2);
                        a2 = this.f4850c == null ? 0 : this.f4850c.length;
                        obj2 = new int[(a + a2)];
                        if (a2 != 0) {
                            System.arraycopy(this.f4850c, 0, obj2, 0, a2);
                        }
                        while (a2 < obj2.length) {
                            obj2[a2] = awx.m6187e();
                            a2++;
                        }
                        this.f4850c = obj2;
                        awx.m6186d(c);
                        continue;
                    case 32:
                        a2 = axi.m6311a(awx, 32);
                        a = this.f4851d == null ? 0 : this.f4851d.length;
                        obj = new long[(a2 + a)];
                        if (a != 0) {
                            System.arraycopy(this.f4851d, 0, obj, 0, a);
                        }
                        while (a < obj.length - 1) {
                            obj[a] = awx.m6185d();
                            awx.m6177a();
                            a++;
                        }
                        obj[a] = awx.m6185d();
                        this.f4851d = obj;
                        continue;
                    case 34:
                        c = awx.m6183c(awx.m6194j());
                        a2 = awx.m6200p();
                        a = 0;
                        while (awx.m6198n() > 0) {
                            awx.m6185d();
                            a++;
                        }
                        awx.m6188e(a2);
                        a2 = this.f4851d == null ? 0 : this.f4851d.length;
                        obj2 = new long[(a + a2)];
                        if (a2 != 0) {
                            System.arraycopy(this.f4851d, 0, obj2, 0, a2);
                        }
                        while (a2 < obj2.length) {
                            obj2[a2] = awx.m6185d();
                            a2++;
                        }
                        this.f4851d = obj2;
                        awx.m6186d(c);
                        continue;
                    case 40:
                        a2 = axi.m6311a(awx, 40);
                        a = this.f4852e == null ? 0 : this.f4852e.length;
                        obj = new long[(a2 + a)];
                        if (a != 0) {
                            System.arraycopy(this.f4852e, 0, obj, 0, a);
                        }
                        while (a < obj.length - 1) {
                            obj[a] = awx.m6185d();
                            awx.m6177a();
                            a++;
                        }
                        obj[a] = awx.m6185d();
                        this.f4852e = obj;
                        continue;
                    case 42:
                        c = awx.m6183c(awx.m6194j());
                        a2 = awx.m6200p();
                        a = 0;
                        while (awx.m6198n() > 0) {
                            awx.m6185d();
                            a++;
                        }
                        awx.m6188e(a2);
                        a2 = this.f4852e == null ? 0 : this.f4852e.length;
                        obj2 = new long[(a + a2)];
                        if (a2 != 0) {
                            System.arraycopy(this.f4852e, 0, obj2, 0, a2);
                        }
                        while (a2 < obj2.length) {
                            obj2[a2] = awx.m6185d();
                            a2++;
                        }
                        this.f4852e = obj2;
                        awx.m6186d(c);
                        continue;
                    default:
                        if (!super.m5626a(awx, a)) {
                            break;
                        }
                        continue;
                }
                return this;
            }
        }

        /* renamed from: a */
        public void mo719a(awy awy) throws IOException {
            int i = 0;
            if (this.f4848a != null && this.f4848a.length > 0) {
                for (String str : this.f4848a) {
                    if (str != null) {
                        awy.m6236a(1, str);
                    }
                }
            }
            if (this.f4849b != null && this.f4849b.length > 0) {
                for (String str2 : this.f4849b) {
                    if (str2 != null) {
                        awy.m6236a(2, str2);
                    }
                }
            }
            if (this.f4850c != null && this.f4850c.length > 0) {
                for (int a : this.f4850c) {
                    awy.m6233a(3, a);
                }
            }
            if (this.f4851d != null && this.f4851d.length > 0) {
                for (long b : this.f4851d) {
                    awy.m6244b(4, b);
                }
            }
            if (this.f4852e != null && this.f4852e.length > 0) {
                while (i < this.f4852e.length) {
                    awy.m6244b(5, this.f4852e[i]);
                    i++;
                }
            }
            super.mo719a(awy);
        }

        /* renamed from: b */
        public /* synthetic */ axf mo722b(awx awx) throws IOException {
            return m6314a(awx);
        }

        /* renamed from: b */
        public C0865a m6317b() {
            this.f4848a = axi.f4845j;
            this.f4849b = axi.f4845j;
            this.f4850c = axi.f4840e;
            this.f4851d = axi.f4841f;
            this.f4852e = axi.f4841f;
            this.ag = null;
            this.ah = -1;
            return this;
        }

        /* renamed from: c */
        public C0865a m6318c() {
            try {
                C0865a c0865a = (C0865a) super.mo820d();
                if (this.f4848a != null && this.f4848a.length > 0) {
                    c0865a.f4848a = (String[]) this.f4848a.clone();
                }
                if (this.f4849b != null && this.f4849b.length > 0) {
                    c0865a.f4849b = (String[]) this.f4849b.clone();
                }
                if (this.f4850c != null && this.f4850c.length > 0) {
                    c0865a.f4850c = (int[]) this.f4850c.clone();
                }
                if (this.f4851d != null && this.f4851d.length > 0) {
                    c0865a.f4851d = (long[]) this.f4851d.clone();
                }
                if (this.f4852e != null && this.f4852e.length > 0) {
                    c0865a.f4852e = (long[]) this.f4852e.clone();
                }
                return c0865a;
            } catch (CloneNotSupportedException e) {
                throw new AssertionError(e);
            }
        }

        public /* synthetic */ Object clone() throws CloneNotSupportedException {
            return m6318c();
        }

        /* renamed from: d */
        public /* synthetic */ awz mo820d() throws CloneNotSupportedException {
            return (C0865a) clone();
        }

        /* renamed from: e */
        public /* synthetic */ axf mo721e() throws CloneNotSupportedException {
            return (C0865a) clone();
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C0865a)) {
                return false;
            }
            C0865a c0865a = (C0865a) obj;
            return (axd.m6292a(this.f4848a, c0865a.f4848a) && axd.m6292a(this.f4849b, c0865a.f4849b) && axd.m6290a(this.f4850c, c0865a.f4850c) && axd.m6291a(this.f4851d, c0865a.f4851d) && axd.m6291a(this.f4852e, c0865a.f4852e)) ? (this.ag == null || this.ag.m6278b()) ? c0865a.ag == null || c0865a.ag.m6278b() : this.ag.equals(c0865a.ag) : false;
        }

        public int hashCode() {
            int hashCode = (((((((((((getClass().getName().hashCode() + 527) * 31) + axd.m6287a(this.f4848a)) * 31) + axd.m6287a(this.f4849b)) * 31) + axd.m6285a(this.f4850c)) * 31) + axd.m6286a(this.f4851d)) * 31) + axd.m6286a(this.f4852e)) * 31;
            int hashCode2 = (this.ag == null || this.ag.m6278b()) ? 0 : this.ag.hashCode();
            return hashCode2 + hashCode;
        }
    }

    /* renamed from: axj$b */
    public static final class C0866b extends awz<C0866b> implements Cloneable {
        /* renamed from: a */
        public int f4853a;
        /* renamed from: b */
        public String f4854b;
        /* renamed from: c */
        public String f4855c;

        public C0866b() {
            m6325b();
        }

        /* renamed from: a */
        protected int mo718a() {
            int a = super.mo718a();
            if (this.f4853a != 0) {
                a += awy.m6209b(1, this.f4853a);
            }
            if (!(this.f4854b == null || this.f4854b.equals(""))) {
                a += awy.m6211b(2, this.f4854b);
            }
            return (this.f4855c == null || this.f4855c.equals("")) ? a : a + awy.m6211b(3, this.f4855c);
        }

        /* renamed from: a */
        public C0866b m6322a(awx awx) throws IOException {
            while (true) {
                int a = awx.m6177a();
                switch (a) {
                    case 0:
                        break;
                    case 8:
                        this.f4853a = awx.m6187e();
                        continue;
                    case 18:
                        this.f4854b = awx.m6191g();
                        continue;
                    case 26:
                        this.f4855c = awx.m6191g();
                        continue;
                    default:
                        if (!super.m5626a(awx, a)) {
                            break;
                        }
                        continue;
                }
                return this;
            }
        }

        /* renamed from: a */
        public void mo719a(awy awy) throws IOException {
            if (this.f4853a != 0) {
                awy.m6233a(1, this.f4853a);
            }
            if (!(this.f4854b == null || this.f4854b.equals(""))) {
                awy.m6236a(2, this.f4854b);
            }
            if (!(this.f4855c == null || this.f4855c.equals(""))) {
                awy.m6236a(3, this.f4855c);
            }
            super.mo719a(awy);
        }

        /* renamed from: b */
        public /* synthetic */ axf mo722b(awx awx) throws IOException {
            return m6322a(awx);
        }

        /* renamed from: b */
        public C0866b m6325b() {
            this.f4853a = 0;
            this.f4854b = "";
            this.f4855c = "";
            this.ag = null;
            this.ah = -1;
            return this;
        }

        /* renamed from: c */
        public C0866b m6326c() {
            try {
                return (C0866b) super.mo820d();
            } catch (CloneNotSupportedException e) {
                throw new AssertionError(e);
            }
        }

        public /* synthetic */ Object clone() throws CloneNotSupportedException {
            return m6326c();
        }

        /* renamed from: d */
        public /* synthetic */ awz mo820d() throws CloneNotSupportedException {
            return (C0866b) clone();
        }

        /* renamed from: e */
        public /* synthetic */ axf mo721e() throws CloneNotSupportedException {
            return (C0866b) clone();
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C0866b)) {
                return false;
            }
            C0866b c0866b = (C0866b) obj;
            if (this.f4853a != c0866b.f4853a) {
                return false;
            }
            if (this.f4854b == null) {
                if (c0866b.f4854b != null) {
                    return false;
                }
            } else if (!this.f4854b.equals(c0866b.f4854b)) {
                return false;
            }
            if (this.f4855c == null) {
                if (c0866b.f4855c != null) {
                    return false;
                }
            } else if (!this.f4855c.equals(c0866b.f4855c)) {
                return false;
            }
            return (this.ag == null || this.ag.m6278b()) ? c0866b.ag == null || c0866b.ag.m6278b() : this.ag.equals(c0866b.ag);
        }

        public int hashCode() {
            int i = 0;
            int hashCode = ((this.f4855c == null ? 0 : this.f4855c.hashCode()) + (((this.f4854b == null ? 0 : this.f4854b.hashCode()) + ((((getClass().getName().hashCode() + 527) * 31) + this.f4853a) * 31)) * 31)) * 31;
            if (!(this.ag == null || this.ag.m6278b())) {
                i = this.ag.hashCode();
            }
            return hashCode + i;
        }
    }

    /* renamed from: axj$c */
    public static final class C0867c extends awz<C0867c> implements Cloneable {
        /* renamed from: a */
        public byte[] f4856a;
        /* renamed from: b */
        public String f4857b;
        /* renamed from: c */
        public byte[][] f4858c;
        /* renamed from: d */
        public boolean f4859d;

        public C0867c() {
            m6333b();
        }

        /* renamed from: a */
        protected int mo718a() {
            int i = 0;
            int a = super.mo718a();
            if (!Arrays.equals(this.f4856a, axi.f4847l)) {
                a += awy.m6213b(1, this.f4856a);
            }
            if (this.f4858c != null && this.f4858c.length > 0) {
                int i2 = 0;
                int i3 = 0;
                while (i < this.f4858c.length) {
                    byte[] bArr = this.f4858c[i];
                    if (bArr != null) {
                        i3++;
                        i2 += awy.m6218c(bArr);
                    }
                    i++;
                }
                a = (a + i2) + (i3 * 1);
            }
            if (this.f4859d) {
                a += awy.m6212b(3, this.f4859d);
            }
            return (this.f4857b == null || this.f4857b.equals("")) ? a : a + awy.m6211b(4, this.f4857b);
        }

        /* renamed from: a */
        public C0867c m6330a(awx awx) throws IOException {
            while (true) {
                int a = awx.m6177a();
                switch (a) {
                    case 0:
                        break;
                    case 10:
                        this.f4856a = awx.m6192h();
                        continue;
                    case 18:
                        int a2 = axi.m6311a(awx, 18);
                        a = this.f4858c == null ? 0 : this.f4858c.length;
                        Object obj = new byte[(a2 + a)][];
                        if (a != 0) {
                            System.arraycopy(this.f4858c, 0, obj, 0, a);
                        }
                        while (a < obj.length - 1) {
                            obj[a] = awx.m6192h();
                            awx.m6177a();
                            a++;
                        }
                        obj[a] = awx.m6192h();
                        this.f4858c = obj;
                        continue;
                    case 24:
                        this.f4859d = awx.m6190f();
                        continue;
                    case 34:
                        this.f4857b = awx.m6191g();
                        continue;
                    default:
                        if (!super.m5626a(awx, a)) {
                            break;
                        }
                        continue;
                }
                return this;
            }
        }

        /* renamed from: a */
        public void mo719a(awy awy) throws IOException {
            if (!Arrays.equals(this.f4856a, axi.f4847l)) {
                awy.m6238a(1, this.f4856a);
            }
            if (this.f4858c != null && this.f4858c.length > 0) {
                for (byte[] bArr : this.f4858c) {
                    if (bArr != null) {
                        awy.m6238a(2, bArr);
                    }
                }
            }
            if (this.f4859d) {
                awy.m6237a(3, this.f4859d);
            }
            if (!(this.f4857b == null || this.f4857b.equals(""))) {
                awy.m6236a(4, this.f4857b);
            }
            super.mo719a(awy);
        }

        /* renamed from: b */
        public /* synthetic */ axf mo722b(awx awx) throws IOException {
            return m6330a(awx);
        }

        /* renamed from: b */
        public C0867c m6333b() {
            this.f4856a = axi.f4847l;
            this.f4857b = "";
            this.f4858c = axi.f4846k;
            this.f4859d = false;
            this.ag = null;
            this.ah = -1;
            return this;
        }

        /* renamed from: c */
        public C0867c m6334c() {
            try {
                C0867c c0867c = (C0867c) super.mo820d();
                if (this.f4858c != null && this.f4858c.length > 0) {
                    c0867c.f4858c = (byte[][]) this.f4858c.clone();
                }
                return c0867c;
            } catch (CloneNotSupportedException e) {
                throw new AssertionError(e);
            }
        }

        public /* synthetic */ Object clone() throws CloneNotSupportedException {
            return m6334c();
        }

        /* renamed from: d */
        public /* synthetic */ awz mo820d() throws CloneNotSupportedException {
            return (C0867c) clone();
        }

        /* renamed from: e */
        public /* synthetic */ axf mo721e() throws CloneNotSupportedException {
            return (C0867c) clone();
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C0867c)) {
                return false;
            }
            C0867c c0867c = (C0867c) obj;
            if (!Arrays.equals(this.f4856a, c0867c.f4856a)) {
                return false;
            }
            if (this.f4857b == null) {
                if (c0867c.f4857b != null) {
                    return false;
                }
            } else if (!this.f4857b.equals(c0867c.f4857b)) {
                return false;
            }
            return (axd.m6293a(this.f4858c, c0867c.f4858c) && this.f4859d == c0867c.f4859d) ? (this.ag == null || this.ag.m6278b()) ? c0867c.ag == null || c0867c.ag.m6278b() : this.ag.equals(c0867c.ag) : false;
        }

        public int hashCode() {
            int i = 0;
            int hashCode = ((this.f4859d ? 1231 : 1237) + (((((this.f4857b == null ? 0 : this.f4857b.hashCode()) + ((((getClass().getName().hashCode() + 527) * 31) + Arrays.hashCode(this.f4856a)) * 31)) * 31) + axd.m6288a(this.f4858c)) * 31)) * 31;
            if (!(this.ag == null || this.ag.m6278b())) {
                i = this.ag.hashCode();
            }
            return hashCode + i;
        }
    }

    /* renamed from: axj$d */
    public static final class C0868d extends awz<C0868d> implements Cloneable {
        /* renamed from: a */
        public long f4860a;
        /* renamed from: b */
        public long f4861b;
        /* renamed from: c */
        public long f4862c;
        /* renamed from: d */
        public String f4863d;
        /* renamed from: e */
        public int f4864e;
        /* renamed from: f */
        public int f4865f;
        /* renamed from: g */
        public boolean f4866g;
        /* renamed from: h */
        public C0869e[] f4867h;
        /* renamed from: i */
        public byte[] f4868i;
        /* renamed from: j */
        public C0866b f4869j;
        /* renamed from: k */
        public byte[] f4870k;
        /* renamed from: l */
        public String f4871l;
        /* renamed from: m */
        public String f4872m;
        /* renamed from: n */
        public C0865a f4873n;
        /* renamed from: o */
        public String f4874o;
        /* renamed from: p */
        public long f4875p;
        /* renamed from: q */
        public C0867c f4876q;
        /* renamed from: r */
        public byte[] f4877r;
        /* renamed from: s */
        public String f4878s;
        /* renamed from: t */
        public int f4879t;
        /* renamed from: u */
        public int[] f4880u;
        /* renamed from: v */
        public long f4881v;
        /* renamed from: w */
        public C0870f f4882w;

        public C0868d() {
            m6341b();
        }

        /* renamed from: a */
        protected int mo718a() {
            int i;
            int i2 = 0;
            int a = super.mo718a();
            if (this.f4860a != 0) {
                a += awy.m6223e(1, this.f4860a);
            }
            if (!(this.f4863d == null || this.f4863d.equals(""))) {
                a += awy.m6211b(2, this.f4863d);
            }
            if (this.f4867h != null && this.f4867h.length > 0) {
                i = a;
                for (axf axf : this.f4867h) {
                    if (axf != null) {
                        i += awy.m6216c(3, axf);
                    }
                }
                a = i;
            }
            if (!Arrays.equals(this.f4868i, axi.f4847l)) {
                a += awy.m6213b(4, this.f4868i);
            }
            if (!Arrays.equals(this.f4870k, axi.f4847l)) {
                a += awy.m6213b(6, this.f4870k);
            }
            if (this.f4873n != null) {
                a += awy.m6216c(7, this.f4873n);
            }
            if (!(this.f4871l == null || this.f4871l.equals(""))) {
                a += awy.m6211b(8, this.f4871l);
            }
            if (this.f4869j != null) {
                a += awy.m6216c(9, this.f4869j);
            }
            if (this.f4866g) {
                a += awy.m6212b(10, this.f4866g);
            }
            if (this.f4864e != 0) {
                a += awy.m6209b(11, this.f4864e);
            }
            if (this.f4865f != 0) {
                a += awy.m6209b(12, this.f4865f);
            }
            if (!(this.f4872m == null || this.f4872m.equals(""))) {
                a += awy.m6211b(13, this.f4872m);
            }
            if (!(this.f4874o == null || this.f4874o.equals(""))) {
                a += awy.m6211b(14, this.f4874o);
            }
            if (this.f4875p != 180000) {
                a += awy.m6226f(15, this.f4875p);
            }
            if (this.f4876q != null) {
                a += awy.m6216c(16, this.f4876q);
            }
            if (this.f4861b != 0) {
                a += awy.m6223e(17, this.f4861b);
            }
            if (!Arrays.equals(this.f4877r, axi.f4847l)) {
                a += awy.m6213b(18, this.f4877r);
            }
            if (this.f4879t != 0) {
                a += awy.m6209b(19, this.f4879t);
            }
            if (this.f4880u != null && this.f4880u.length > 0) {
                i = 0;
                while (i2 < this.f4880u.length) {
                    i += awy.m6208b(this.f4880u[i2]);
                    i2++;
                }
                a = (a + i) + (this.f4880u.length * 2);
            }
            if (this.f4862c != 0) {
                a += awy.m6223e(21, this.f4862c);
            }
            if (this.f4881v != 0) {
                a += awy.m6223e(22, this.f4881v);
            }
            if (this.f4882w != null) {
                a += awy.m6216c(23, this.f4882w);
            }
            return (this.f4878s == null || this.f4878s.equals("")) ? a : a + awy.m6211b(24, this.f4878s);
        }

        /* renamed from: a */
        public C0868d m6338a(awx awx) throws IOException {
            while (true) {
                int a = awx.m6177a();
                int a2;
                Object obj;
                switch (a) {
                    case 0:
                        break;
                    case 8:
                        this.f4860a = awx.m6185d();
                        continue;
                    case 18:
                        this.f4863d = awx.m6191g();
                        continue;
                    case 26:
                        a2 = axi.m6311a(awx, 26);
                        a = this.f4867h == null ? 0 : this.f4867h.length;
                        obj = new C0869e[(a2 + a)];
                        if (a != 0) {
                            System.arraycopy(this.f4867h, 0, obj, 0, a);
                        }
                        while (a < obj.length - 1) {
                            obj[a] = new C0869e();
                            awx.m6179a(obj[a]);
                            awx.m6177a();
                            a++;
                        }
                        obj[a] = new C0869e();
                        awx.m6179a(obj[a]);
                        this.f4867h = obj;
                        continue;
                    case 34:
                        this.f4868i = awx.m6192h();
                        continue;
                    case 50:
                        this.f4870k = awx.m6192h();
                        continue;
                    case 58:
                        if (this.f4873n == null) {
                            this.f4873n = new C0865a();
                        }
                        awx.m6179a(this.f4873n);
                        continue;
                    case 66:
                        this.f4871l = awx.m6191g();
                        continue;
                    case 74:
                        if (this.f4869j == null) {
                            this.f4869j = new C0866b();
                        }
                        awx.m6179a(this.f4869j);
                        continue;
                    case 80:
                        this.f4866g = awx.m6190f();
                        continue;
                    case 88:
                        this.f4864e = awx.m6187e();
                        continue;
                    case 96:
                        this.f4865f = awx.m6187e();
                        continue;
                    case 106:
                        this.f4872m = awx.m6191g();
                        continue;
                    case 114:
                        this.f4874o = awx.m6191g();
                        continue;
                    case 120:
                        this.f4875p = awx.m6193i();
                        continue;
                    case 130:
                        if (this.f4876q == null) {
                            this.f4876q = new C0867c();
                        }
                        awx.m6179a(this.f4876q);
                        continue;
                    case 136:
                        this.f4861b = awx.m6185d();
                        continue;
                    case 146:
                        this.f4877r = awx.m6192h();
                        continue;
                    case 152:
                        a = awx.m6187e();
                        switch (a) {
                            case 0:
                            case 1:
                            case 2:
                                this.f4879t = a;
                                break;
                            default:
                                continue;
                        }
                    case 160:
                        a2 = axi.m6311a(awx, 160);
                        a = this.f4880u == null ? 0 : this.f4880u.length;
                        obj = new int[(a2 + a)];
                        if (a != 0) {
                            System.arraycopy(this.f4880u, 0, obj, 0, a);
                        }
                        while (a < obj.length - 1) {
                            obj[a] = awx.m6187e();
                            awx.m6177a();
                            a++;
                        }
                        obj[a] = awx.m6187e();
                        this.f4880u = obj;
                        continue;
                    case 162:
                        int c = awx.m6183c(awx.m6194j());
                        a2 = awx.m6200p();
                        a = 0;
                        while (awx.m6198n() > 0) {
                            awx.m6187e();
                            a++;
                        }
                        awx.m6188e(a2);
                        a2 = this.f4880u == null ? 0 : this.f4880u.length;
                        Object obj2 = new int[(a + a2)];
                        if (a2 != 0) {
                            System.arraycopy(this.f4880u, 0, obj2, 0, a2);
                        }
                        while (a2 < obj2.length) {
                            obj2[a2] = awx.m6187e();
                            a2++;
                        }
                        this.f4880u = obj2;
                        awx.m6186d(c);
                        continue;
                    case 168:
                        this.f4862c = awx.m6185d();
                        continue;
                    case 176:
                        this.f4881v = awx.m6185d();
                        continue;
                    case 186:
                        if (this.f4882w == null) {
                            this.f4882w = new C0870f();
                        }
                        awx.m6179a(this.f4882w);
                        continue;
                    case 194:
                        this.f4878s = awx.m6191g();
                        continue;
                    default:
                        if (!super.m5626a(awx, a)) {
                            break;
                        }
                        continue;
                }
                return this;
            }
        }

        /* renamed from: a */
        public void mo719a(awy awy) throws IOException {
            int i = 0;
            if (this.f4860a != 0) {
                awy.m6244b(1, this.f4860a);
            }
            if (!(this.f4863d == null || this.f4863d.equals(""))) {
                awy.m6236a(2, this.f4863d);
            }
            if (this.f4867h != null && this.f4867h.length > 0) {
                for (axf axf : this.f4867h) {
                    if (axf != null) {
                        awy.m6235a(3, axf);
                    }
                }
            }
            if (!Arrays.equals(this.f4868i, axi.f4847l)) {
                awy.m6238a(4, this.f4868i);
            }
            if (!Arrays.equals(this.f4870k, axi.f4847l)) {
                awy.m6238a(6, this.f4870k);
            }
            if (this.f4873n != null) {
                awy.m6235a(7, this.f4873n);
            }
            if (!(this.f4871l == null || this.f4871l.equals(""))) {
                awy.m6236a(8, this.f4871l);
            }
            if (this.f4869j != null) {
                awy.m6235a(9, this.f4869j);
            }
            if (this.f4866g) {
                awy.m6237a(10, this.f4866g);
            }
            if (this.f4864e != 0) {
                awy.m6233a(11, this.f4864e);
            }
            if (this.f4865f != 0) {
                awy.m6233a(12, this.f4865f);
            }
            if (!(this.f4872m == null || this.f4872m.equals(""))) {
                awy.m6236a(13, this.f4872m);
            }
            if (!(this.f4874o == null || this.f4874o.equals(""))) {
                awy.m6236a(14, this.f4874o);
            }
            if (this.f4875p != 180000) {
                awy.m6251c(15, this.f4875p);
            }
            if (this.f4876q != null) {
                awy.m6235a(16, this.f4876q);
            }
            if (this.f4861b != 0) {
                awy.m6244b(17, this.f4861b);
            }
            if (!Arrays.equals(this.f4877r, axi.f4847l)) {
                awy.m6238a(18, this.f4877r);
            }
            if (this.f4879t != 0) {
                awy.m6233a(19, this.f4879t);
            }
            if (this.f4880u != null && this.f4880u.length > 0) {
                while (i < this.f4880u.length) {
                    awy.m6233a(20, this.f4880u[i]);
                    i++;
                }
            }
            if (this.f4862c != 0) {
                awy.m6244b(21, this.f4862c);
            }
            if (this.f4881v != 0) {
                awy.m6244b(22, this.f4881v);
            }
            if (this.f4882w != null) {
                awy.m6235a(23, this.f4882w);
            }
            if (!(this.f4878s == null || this.f4878s.equals(""))) {
                awy.m6236a(24, this.f4878s);
            }
            super.mo719a(awy);
        }

        /* renamed from: b */
        public /* synthetic */ axf mo722b(awx awx) throws IOException {
            return m6338a(awx);
        }

        /* renamed from: b */
        public C0868d m6341b() {
            this.f4860a = 0;
            this.f4861b = 0;
            this.f4862c = 0;
            this.f4863d = "";
            this.f4864e = 0;
            this.f4865f = 0;
            this.f4866g = false;
            this.f4867h = C0869e.m6345b();
            this.f4868i = axi.f4847l;
            this.f4869j = null;
            this.f4870k = axi.f4847l;
            this.f4871l = "";
            this.f4872m = "";
            this.f4873n = null;
            this.f4874o = "";
            this.f4875p = 180000;
            this.f4876q = null;
            this.f4877r = axi.f4847l;
            this.f4878s = "";
            this.f4879t = 0;
            this.f4880u = axi.f4840e;
            this.f4881v = 0;
            this.f4882w = null;
            this.ag = null;
            this.ah = -1;
            return this;
        }

        /* renamed from: c */
        public C0868d m6342c() {
            try {
                C0868d c0868d = (C0868d) super.mo820d();
                if (this.f4867h != null && this.f4867h.length > 0) {
                    c0868d.f4867h = new C0869e[this.f4867h.length];
                    for (int i = 0; i < this.f4867h.length; i++) {
                        if (this.f4867h[i] != null) {
                            c0868d.f4867h[i] = (C0869e) this.f4867h[i].clone();
                        }
                    }
                }
                if (this.f4869j != null) {
                    c0868d.f4869j = (C0866b) this.f4869j.clone();
                }
                if (this.f4873n != null) {
                    c0868d.f4873n = (C0865a) this.f4873n.clone();
                }
                if (this.f4876q != null) {
                    c0868d.f4876q = (C0867c) this.f4876q.clone();
                }
                if (this.f4880u != null && this.f4880u.length > 0) {
                    c0868d.f4880u = (int[]) this.f4880u.clone();
                }
                if (this.f4882w != null) {
                    c0868d.f4882w = (C0870f) this.f4882w.clone();
                }
                return c0868d;
            } catch (CloneNotSupportedException e) {
                throw new AssertionError(e);
            }
        }

        public /* synthetic */ Object clone() throws CloneNotSupportedException {
            return m6342c();
        }

        /* renamed from: d */
        public /* synthetic */ awz mo820d() throws CloneNotSupportedException {
            return (C0868d) clone();
        }

        /* renamed from: e */
        public /* synthetic */ axf mo721e() throws CloneNotSupportedException {
            return (C0868d) clone();
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C0868d)) {
                return false;
            }
            C0868d c0868d = (C0868d) obj;
            if (this.f4860a != c0868d.f4860a || this.f4861b != c0868d.f4861b || this.f4862c != c0868d.f4862c) {
                return false;
            }
            if (this.f4863d == null) {
                if (c0868d.f4863d != null) {
                    return false;
                }
            } else if (!this.f4863d.equals(c0868d.f4863d)) {
                return false;
            }
            if (this.f4864e != c0868d.f4864e || this.f4865f != c0868d.f4865f || this.f4866g != c0868d.f4866g || !axd.m6292a(this.f4867h, c0868d.f4867h) || !Arrays.equals(this.f4868i, c0868d.f4868i)) {
                return false;
            }
            if (this.f4869j == null) {
                if (c0868d.f4869j != null) {
                    return false;
                }
            } else if (!this.f4869j.equals(c0868d.f4869j)) {
                return false;
            }
            if (!Arrays.equals(this.f4870k, c0868d.f4870k)) {
                return false;
            }
            if (this.f4871l == null) {
                if (c0868d.f4871l != null) {
                    return false;
                }
            } else if (!this.f4871l.equals(c0868d.f4871l)) {
                return false;
            }
            if (this.f4872m == null) {
                if (c0868d.f4872m != null) {
                    return false;
                }
            } else if (!this.f4872m.equals(c0868d.f4872m)) {
                return false;
            }
            if (this.f4873n == null) {
                if (c0868d.f4873n != null) {
                    return false;
                }
            } else if (!this.f4873n.equals(c0868d.f4873n)) {
                return false;
            }
            if (this.f4874o == null) {
                if (c0868d.f4874o != null) {
                    return false;
                }
            } else if (!this.f4874o.equals(c0868d.f4874o)) {
                return false;
            }
            if (this.f4875p != c0868d.f4875p) {
                return false;
            }
            if (this.f4876q == null) {
                if (c0868d.f4876q != null) {
                    return false;
                }
            } else if (!this.f4876q.equals(c0868d.f4876q)) {
                return false;
            }
            if (!Arrays.equals(this.f4877r, c0868d.f4877r)) {
                return false;
            }
            if (this.f4878s == null) {
                if (c0868d.f4878s != null) {
                    return false;
                }
            } else if (!this.f4878s.equals(c0868d.f4878s)) {
                return false;
            }
            if (this.f4879t != c0868d.f4879t || !axd.m6290a(this.f4880u, c0868d.f4880u) || this.f4881v != c0868d.f4881v) {
                return false;
            }
            if (this.f4882w == null) {
                if (c0868d.f4882w != null) {
                    return false;
                }
            } else if (!this.f4882w.equals(c0868d.f4882w)) {
                return false;
            }
            return (this.ag == null || this.ag.m6278b()) ? c0868d.ag == null || c0868d.ag.m6278b() : this.ag.equals(c0868d.ag);
        }

        public int hashCode() {
            int i = 0;
            int hashCode = ((this.f4882w == null ? 0 : this.f4882w.hashCode()) + (((((((((this.f4878s == null ? 0 : this.f4878s.hashCode()) + (((((this.f4876q == null ? 0 : this.f4876q.hashCode()) + (((((this.f4874o == null ? 0 : this.f4874o.hashCode()) + (((this.f4873n == null ? 0 : this.f4873n.hashCode()) + (((this.f4872m == null ? 0 : this.f4872m.hashCode()) + (((this.f4871l == null ? 0 : this.f4871l.hashCode()) + (((((this.f4869j == null ? 0 : this.f4869j.hashCode()) + (((((((this.f4866g ? 1231 : 1237) + (((((((this.f4863d == null ? 0 : this.f4863d.hashCode()) + ((((((((getClass().getName().hashCode() + 527) * 31) + ((int) (this.f4860a ^ (this.f4860a >>> 32)))) * 31) + ((int) (this.f4861b ^ (this.f4861b >>> 32)))) * 31) + ((int) (this.f4862c ^ (this.f4862c >>> 32)))) * 31)) * 31) + this.f4864e) * 31) + this.f4865f) * 31)) * 31) + axd.m6287a(this.f4867h)) * 31) + Arrays.hashCode(this.f4868i)) * 31)) * 31) + Arrays.hashCode(this.f4870k)) * 31)) * 31)) * 31)) * 31)) * 31) + ((int) (this.f4875p ^ (this.f4875p >>> 32)))) * 31)) * 31) + Arrays.hashCode(this.f4877r)) * 31)) * 31) + this.f4879t) * 31) + axd.m6285a(this.f4880u)) * 31) + ((int) (this.f4881v ^ (this.f4881v >>> 32)))) * 31)) * 31;
            if (!(this.ag == null || this.ag.m6278b())) {
                i = this.ag.hashCode();
            }
            return hashCode + i;
        }
    }

    /* renamed from: axj$e */
    public static final class C0869e extends awz<C0869e> implements Cloneable {
        /* renamed from: c */
        private static volatile C0869e[] f4883c;
        /* renamed from: a */
        public String f4884a;
        /* renamed from: b */
        public String f4885b;

        public C0869e() {
            m6350c();
        }

        /* renamed from: b */
        public static C0869e[] m6345b() {
            if (f4883c == null) {
                synchronized (axd.f4833c) {
                    if (f4883c == null) {
                        f4883c = new C0869e[0];
                    }
                }
            }
            return f4883c;
        }

        /* renamed from: a */
        protected int mo718a() {
            int a = super.mo718a();
            if (!(this.f4884a == null || this.f4884a.equals(""))) {
                a += awy.m6211b(1, this.f4884a);
            }
            return (this.f4885b == null || this.f4885b.equals("")) ? a : a + awy.m6211b(2, this.f4885b);
        }

        /* renamed from: a */
        public C0869e m6347a(awx awx) throws IOException {
            while (true) {
                int a = awx.m6177a();
                switch (a) {
                    case 0:
                        break;
                    case 10:
                        this.f4884a = awx.m6191g();
                        continue;
                    case 18:
                        this.f4885b = awx.m6191g();
                        continue;
                    default:
                        if (!super.m5626a(awx, a)) {
                            break;
                        }
                        continue;
                }
                return this;
            }
        }

        /* renamed from: a */
        public void mo719a(awy awy) throws IOException {
            if (!(this.f4884a == null || this.f4884a.equals(""))) {
                awy.m6236a(1, this.f4884a);
            }
            if (!(this.f4885b == null || this.f4885b.equals(""))) {
                awy.m6236a(2, this.f4885b);
            }
            super.mo719a(awy);
        }

        /* renamed from: b */
        public /* synthetic */ axf mo722b(awx awx) throws IOException {
            return m6347a(awx);
        }

        /* renamed from: c */
        public C0869e m6350c() {
            this.f4884a = "";
            this.f4885b = "";
            this.ag = null;
            this.ah = -1;
            return this;
        }

        public /* synthetic */ Object clone() throws CloneNotSupportedException {
            return m6353h();
        }

        /* renamed from: d */
        public /* synthetic */ awz mo820d() throws CloneNotSupportedException {
            return (C0869e) clone();
        }

        /* renamed from: e */
        public /* synthetic */ axf mo721e() throws CloneNotSupportedException {
            return (C0869e) clone();
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C0869e)) {
                return false;
            }
            C0869e c0869e = (C0869e) obj;
            if (this.f4884a == null) {
                if (c0869e.f4884a != null) {
                    return false;
                }
            } else if (!this.f4884a.equals(c0869e.f4884a)) {
                return false;
            }
            if (this.f4885b == null) {
                if (c0869e.f4885b != null) {
                    return false;
                }
            } else if (!this.f4885b.equals(c0869e.f4885b)) {
                return false;
            }
            return (this.ag == null || this.ag.m6278b()) ? c0869e.ag == null || c0869e.ag.m6278b() : this.ag.equals(c0869e.ag);
        }

        /* renamed from: h */
        public C0869e m6353h() {
            try {
                return (C0869e) super.mo820d();
            } catch (CloneNotSupportedException e) {
                throw new AssertionError(e);
            }
        }

        public int hashCode() {
            int i = 0;
            int hashCode = ((this.f4885b == null ? 0 : this.f4885b.hashCode()) + (((this.f4884a == null ? 0 : this.f4884a.hashCode()) + ((getClass().getName().hashCode() + 527) * 31)) * 31)) * 31;
            if (!(this.ag == null || this.ag.m6278b())) {
                i = this.ag.hashCode();
            }
            return hashCode + i;
        }
    }

    /* renamed from: axj$f */
    public static final class C0870f extends awz<C0870f> implements Cloneable {
        /* renamed from: a */
        public int f4886a;
        /* renamed from: b */
        public int f4887b;

        public C0870f() {
            m6358b();
        }

        /* renamed from: a */
        protected int mo718a() {
            int a = super.mo718a();
            if (this.f4886a != -1) {
                a += awy.m6209b(1, this.f4886a);
            }
            return this.f4887b != 0 ? a + awy.m6209b(2, this.f4887b) : a;
        }

        /* renamed from: a */
        public C0870f m6355a(awx awx) throws IOException {
            while (true) {
                int a = awx.m6177a();
                switch (a) {
                    case 0:
                        break;
                    case 8:
                        a = awx.m6187e();
                        switch (a) {
                            case -1:
                            case 0:
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                            case 11:
                            case 12:
                            case 13:
                            case 14:
                            case 15:
                            case 16:
                            case 17:
                                this.f4886a = a;
                                break;
                            default:
                                continue;
                        }
                    case 16:
                        a = awx.m6187e();
                        switch (a) {
                            case 0:
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                            case 11:
                            case 12:
                            case 13:
                            case 14:
                            case 15:
                            case 16:
                            case 100:
                                this.f4887b = a;
                                break;
                            default:
                                continue;
                        }
                    default:
                        if (!super.m5626a(awx, a)) {
                            break;
                        }
                        continue;
                }
                return this;
            }
        }

        /* renamed from: a */
        public void mo719a(awy awy) throws IOException {
            if (this.f4886a != -1) {
                awy.m6233a(1, this.f4886a);
            }
            if (this.f4887b != 0) {
                awy.m6233a(2, this.f4887b);
            }
            super.mo719a(awy);
        }

        /* renamed from: b */
        public /* synthetic */ axf mo722b(awx awx) throws IOException {
            return m6355a(awx);
        }

        /* renamed from: b */
        public C0870f m6358b() {
            this.f4886a = -1;
            this.f4887b = 0;
            this.ag = null;
            this.ah = -1;
            return this;
        }

        /* renamed from: c */
        public C0870f m6359c() {
            try {
                return (C0870f) super.mo820d();
            } catch (CloneNotSupportedException e) {
                throw new AssertionError(e);
            }
        }

        public /* synthetic */ Object clone() throws CloneNotSupportedException {
            return m6359c();
        }

        /* renamed from: d */
        public /* synthetic */ awz mo820d() throws CloneNotSupportedException {
            return (C0870f) clone();
        }

        /* renamed from: e */
        public /* synthetic */ axf mo721e() throws CloneNotSupportedException {
            return (C0870f) clone();
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C0870f)) {
                return false;
            }
            C0870f c0870f = (C0870f) obj;
            return (this.f4886a == c0870f.f4886a && this.f4887b == c0870f.f4887b) ? (this.ag == null || this.ag.m6278b()) ? c0870f.ag == null || c0870f.ag.m6278b() : this.ag.equals(c0870f.ag) : false;
        }

        public int hashCode() {
            int hashCode = (((((getClass().getName().hashCode() + 527) * 31) + this.f4886a) * 31) + this.f4887b) * 31;
            int hashCode2 = (this.ag == null || this.ag.m6278b()) ? 0 : this.ag.hashCode();
            return hashCode2 + hashCode;
        }
    }
}
