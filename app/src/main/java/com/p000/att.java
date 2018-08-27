package com.p000;

import java.io.IOException;

/* renamed from: att */
public interface att {

    /* renamed from: att$a */
    public static final class C0806a extends awz<C0806a> {
        /* renamed from: m */
        private static volatile C0806a[] f4497m;
        /* renamed from: a */
        public int f4498a;
        /* renamed from: b */
        public String f4499b;
        /* renamed from: c */
        public C0806a[] f4500c;
        /* renamed from: d */
        public C0806a[] f4501d;
        /* renamed from: e */
        public C0806a[] f4502e;
        /* renamed from: f */
        public String f4503f;
        /* renamed from: g */
        public String f4504g;
        /* renamed from: h */
        public long f4505h;
        /* renamed from: i */
        public boolean f4506i;
        /* renamed from: j */
        public C0806a[] f4507j;
        /* renamed from: k */
        public int[] f4508k;
        /* renamed from: l */
        public boolean f4509l;

        public C0806a() {
            m5686c();
        }

        /* renamed from: b */
        public static C0806a[] m5681b() {
            if (f4497m == null) {
                synchronized (axd.f4833c) {
                    if (f4497m == null) {
                        f4497m = new C0806a[0];
                    }
                }
            }
            return f4497m;
        }

        /* renamed from: a */
        protected int mo718a() {
            int i;
            int i2 = 0;
            int a = super.mo718a() + awy.m6209b(1, this.f4498a);
            if (!(this.f4499b == null || this.f4499b.equals(""))) {
                a += awy.m6211b(2, this.f4499b);
            }
            if (this.f4500c != null && this.f4500c.length > 0) {
                i = a;
                for (axf axf : this.f4500c) {
                    if (axf != null) {
                        i += awy.m6216c(3, axf);
                    }
                }
                a = i;
            }
            if (this.f4501d != null && this.f4501d.length > 0) {
                i = a;
                for (axf axf2 : this.f4501d) {
                    if (axf2 != null) {
                        i += awy.m6216c(4, axf2);
                    }
                }
                a = i;
            }
            if (this.f4502e != null && this.f4502e.length > 0) {
                i = a;
                for (axf axf22 : this.f4502e) {
                    if (axf22 != null) {
                        i += awy.m6216c(5, axf22);
                    }
                }
                a = i;
            }
            if (!(this.f4503f == null || this.f4503f.equals(""))) {
                a += awy.m6211b(6, this.f4503f);
            }
            if (!(this.f4504g == null || this.f4504g.equals(""))) {
                a += awy.m6211b(7, this.f4504g);
            }
            if (this.f4505h != 0) {
                a += awy.m6223e(8, this.f4505h);
            }
            if (this.f4509l) {
                a += awy.m6212b(9, this.f4509l);
            }
            if (this.f4508k != null && this.f4508k.length > 0) {
                int i3 = 0;
                for (int b : this.f4508k) {
                    i3 += awy.m6208b(b);
                }
                a = (a + i3) + (this.f4508k.length * 1);
            }
            if (this.f4507j != null && this.f4507j.length > 0) {
                while (i2 < this.f4507j.length) {
                    axf axf3 = this.f4507j[i2];
                    if (axf3 != null) {
                        a += awy.m6216c(11, axf3);
                    }
                    i2++;
                }
            }
            return this.f4506i ? a + awy.m6212b(12, this.f4506i) : a;
        }

        /* renamed from: a */
        public C0806a m5683a(awx awx) throws IOException {
            while (true) {
                int a = awx.m6177a();
                int a2;
                Object obj;
                int i;
                switch (a) {
                    case 0:
                        break;
                    case 8:
                        a = awx.m6187e();
                        switch (a) {
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                                this.f4498a = a;
                                break;
                            default:
                                continue;
                        }
                    case 18:
                        this.f4499b = awx.m6191g();
                        continue;
                    case 26:
                        a2 = axi.m6311a(awx, 26);
                        a = this.f4500c == null ? 0 : this.f4500c.length;
                        obj = new C0806a[(a2 + a)];
                        if (a != 0) {
                            System.arraycopy(this.f4500c, 0, obj, 0, a);
                        }
                        while (a < obj.length - 1) {
                            obj[a] = new C0806a();
                            awx.m6179a(obj[a]);
                            awx.m6177a();
                            a++;
                        }
                        obj[a] = new C0806a();
                        awx.m6179a(obj[a]);
                        this.f4500c = obj;
                        continue;
                    case 34:
                        a2 = axi.m6311a(awx, 34);
                        a = this.f4501d == null ? 0 : this.f4501d.length;
                        obj = new C0806a[(a2 + a)];
                        if (a != 0) {
                            System.arraycopy(this.f4501d, 0, obj, 0, a);
                        }
                        while (a < obj.length - 1) {
                            obj[a] = new C0806a();
                            awx.m6179a(obj[a]);
                            awx.m6177a();
                            a++;
                        }
                        obj[a] = new C0806a();
                        awx.m6179a(obj[a]);
                        this.f4501d = obj;
                        continue;
                    case 42:
                        a2 = axi.m6311a(awx, 42);
                        a = this.f4502e == null ? 0 : this.f4502e.length;
                        obj = new C0806a[(a2 + a)];
                        if (a != 0) {
                            System.arraycopy(this.f4502e, 0, obj, 0, a);
                        }
                        while (a < obj.length - 1) {
                            obj[a] = new C0806a();
                            awx.m6179a(obj[a]);
                            awx.m6177a();
                            a++;
                        }
                        obj[a] = new C0806a();
                        awx.m6179a(obj[a]);
                        this.f4502e = obj;
                        continue;
                    case 50:
                        this.f4503f = awx.m6191g();
                        continue;
                    case 58:
                        this.f4504g = awx.m6191g();
                        continue;
                    case 64:
                        this.f4505h = awx.m6185d();
                        continue;
                    case 72:
                        this.f4509l = awx.m6190f();
                        continue;
                    case 80:
                        int a3 = axi.m6311a(awx, 80);
                        Object obj2 = new int[a3];
                        i = 0;
                        a2 = 0;
                        while (i < a3) {
                            if (i != 0) {
                                awx.m6177a();
                            }
                            int e = awx.m6187e();
                            switch (e) {
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
                                    a = a2 + 1;
                                    obj2[a2] = e;
                                    break;
                                default:
                                    a = a2;
                                    break;
                            }
                            i++;
                            a2 = a;
                        }
                        if (a2 != 0) {
                            a = this.f4508k == null ? 0 : this.f4508k.length;
                            if (a != 0 || a2 != obj2.length) {
                                Object obj3 = new int[(a + a2)];
                                if (a != 0) {
                                    System.arraycopy(this.f4508k, 0, obj3, 0, a);
                                }
                                System.arraycopy(obj2, 0, obj3, a, a2);
                                this.f4508k = obj3;
                                break;
                            }
                            this.f4508k = obj2;
                            break;
                        }
                        continue;
                    case 82:
                        i = awx.m6183c(awx.m6194j());
                        a2 = awx.m6200p();
                        a = 0;
                        while (awx.m6198n() > 0) {
                            switch (awx.m6187e()) {
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
                                    a++;
                                    break;
                                default:
                                    break;
                            }
                        }
                        if (a != 0) {
                            awx.m6188e(a2);
                            a2 = this.f4508k == null ? 0 : this.f4508k.length;
                            Object obj4 = new int[(a + a2)];
                            if (a2 != 0) {
                                System.arraycopy(this.f4508k, 0, obj4, 0, a2);
                            }
                            while (awx.m6198n() > 0) {
                                int e2 = awx.m6187e();
                                switch (e2) {
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
                                        a = a2 + 1;
                                        obj4[a2] = e2;
                                        a2 = a;
                                        break;
                                    default:
                                        break;
                                }
                            }
                            this.f4508k = obj4;
                        }
                        awx.m6186d(i);
                        continue;
                    case 90:
                        a2 = axi.m6311a(awx, 90);
                        a = this.f4507j == null ? 0 : this.f4507j.length;
                        obj = new C0806a[(a2 + a)];
                        if (a != 0) {
                            System.arraycopy(this.f4507j, 0, obj, 0, a);
                        }
                        while (a < obj.length - 1) {
                            obj[a] = new C0806a();
                            awx.m6179a(obj[a]);
                            awx.m6177a();
                            a++;
                        }
                        obj[a] = new C0806a();
                        awx.m6179a(obj[a]);
                        this.f4507j = obj;
                        continue;
                    case 96:
                        this.f4506i = awx.m6190f();
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
            awy.m6233a(1, this.f4498a);
            if (!(this.f4499b == null || this.f4499b.equals(""))) {
                awy.m6236a(2, this.f4499b);
            }
            if (this.f4500c != null && this.f4500c.length > 0) {
                for (axf axf : this.f4500c) {
                    if (axf != null) {
                        awy.m6235a(3, axf);
                    }
                }
            }
            if (this.f4501d != null && this.f4501d.length > 0) {
                for (axf axf2 : this.f4501d) {
                    if (axf2 != null) {
                        awy.m6235a(4, axf2);
                    }
                }
            }
            if (this.f4502e != null && this.f4502e.length > 0) {
                for (axf axf22 : this.f4502e) {
                    if (axf22 != null) {
                        awy.m6235a(5, axf22);
                    }
                }
            }
            if (!(this.f4503f == null || this.f4503f.equals(""))) {
                awy.m6236a(6, this.f4503f);
            }
            if (!(this.f4504g == null || this.f4504g.equals(""))) {
                awy.m6236a(7, this.f4504g);
            }
            if (this.f4505h != 0) {
                awy.m6244b(8, this.f4505h);
            }
            if (this.f4509l) {
                awy.m6237a(9, this.f4509l);
            }
            if (this.f4508k != null && this.f4508k.length > 0) {
                for (int a : this.f4508k) {
                    awy.m6233a(10, a);
                }
            }
            if (this.f4507j != null && this.f4507j.length > 0) {
                while (i < this.f4507j.length) {
                    axf axf3 = this.f4507j[i];
                    if (axf3 != null) {
                        awy.m6235a(11, axf3);
                    }
                    i++;
                }
            }
            if (this.f4506i) {
                awy.m6237a(12, this.f4506i);
            }
            super.mo719a(awy);
        }

        /* renamed from: b */
        public /* synthetic */ axf mo722b(awx awx) throws IOException {
            return m5683a(awx);
        }

        /* renamed from: c */
        public C0806a m5686c() {
            this.f4498a = 1;
            this.f4499b = "";
            this.f4500c = C0806a.m5681b();
            this.f4501d = C0806a.m5681b();
            this.f4502e = C0806a.m5681b();
            this.f4503f = "";
            this.f4504g = "";
            this.f4505h = 0;
            this.f4506i = false;
            this.f4507j = C0806a.m5681b();
            this.f4508k = axi.f4840e;
            this.f4509l = false;
            this.ag = null;
            this.ah = -1;
            return this;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C0806a)) {
                return false;
            }
            C0806a c0806a = (C0806a) obj;
            if (this.f4498a != c0806a.f4498a) {
                return false;
            }
            if (this.f4499b == null) {
                if (c0806a.f4499b != null) {
                    return false;
                }
            } else if (!this.f4499b.equals(c0806a.f4499b)) {
                return false;
            }
            if (!axd.m6292a(this.f4500c, c0806a.f4500c) || !axd.m6292a(this.f4501d, c0806a.f4501d) || !axd.m6292a(this.f4502e, c0806a.f4502e)) {
                return false;
            }
            if (this.f4503f == null) {
                if (c0806a.f4503f != null) {
                    return false;
                }
            } else if (!this.f4503f.equals(c0806a.f4503f)) {
                return false;
            }
            if (this.f4504g == null) {
                if (c0806a.f4504g != null) {
                    return false;
                }
            } else if (!this.f4504g.equals(c0806a.f4504g)) {
                return false;
            }
            return (this.f4505h == c0806a.f4505h && this.f4506i == c0806a.f4506i && axd.m6292a(this.f4507j, c0806a.f4507j) && axd.m6290a(this.f4508k, c0806a.f4508k) && this.f4509l == c0806a.f4509l) ? (this.ag == null || this.ag.m6278b()) ? c0806a.ag == null || c0806a.ag.m6278b() : this.ag.equals(c0806a.ag) : false;
        }

        public int hashCode() {
            int i = 1231;
            int i2 = 0;
            int hashCode = ((((((this.f4506i ? 1231 : 1237) + (((((this.f4504g == null ? 0 : this.f4504g.hashCode()) + (((this.f4503f == null ? 0 : this.f4503f.hashCode()) + (((((((((this.f4499b == null ? 0 : this.f4499b.hashCode()) + ((((getClass().getName().hashCode() + 527) * 31) + this.f4498a) * 31)) * 31) + axd.m6287a(this.f4500c)) * 31) + axd.m6287a(this.f4501d)) * 31) + axd.m6287a(this.f4502e)) * 31)) * 31)) * 31) + ((int) (this.f4505h ^ (this.f4505h >>> 32)))) * 31)) * 31) + axd.m6287a(this.f4507j)) * 31) + axd.m6285a(this.f4508k)) * 31;
            if (!this.f4509l) {
                i = 1237;
            }
            hashCode = (hashCode + i) * 31;
            if (!(this.ag == null || this.ag.m6278b())) {
                i2 = this.ag.hashCode();
            }
            return hashCode + i2;
        }
    }
}
