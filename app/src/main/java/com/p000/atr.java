package com.p000;

import com.facebook.imagepipeline.memory.BitmapCounterProvider;
import com.facebook.imageutils.JfifUtil;
import com.facebook.stetho.server.http.HttpStatus;
import com.inmobi.commons.analytics.iat.impl.AdTrackerConstants;
import com.millennialmedia.InterstitialAd.InterstitialErrorStatus;
import java.io.IOException;

/* renamed from: atr */
public interface atr {

    /* renamed from: atr$a */
    public static final class C0800a extends awz<C0800a> {
        /* renamed from: A */
        public Long f4374A;
        /* renamed from: B */
        public String f4375B;
        /* renamed from: C */
        public Long f4376C;
        /* renamed from: D */
        public Long f4377D;
        /* renamed from: E */
        public Long f4378E;
        /* renamed from: F */
        public C0801b f4379F;
        /* renamed from: G */
        public Long f4380G;
        /* renamed from: H */
        public Long f4381H;
        /* renamed from: I */
        public Long f4382I;
        /* renamed from: J */
        public Long f4383J;
        /* renamed from: K */
        public Long f4384K;
        /* renamed from: L */
        public Long f4385L;
        /* renamed from: M */
        public String f4386M;
        /* renamed from: N */
        public String f4387N;
        /* renamed from: O */
        public Integer f4388O;
        /* renamed from: P */
        public Integer f4389P;
        /* renamed from: Q */
        public Long f4390Q;
        /* renamed from: R */
        public Long f4391R;
        /* renamed from: S */
        public Long f4392S;
        /* renamed from: T */
        public Long f4393T;
        /* renamed from: U */
        public Long f4394U;
        /* renamed from: V */
        public Integer f4395V;
        /* renamed from: W */
        public C0798a f4396W;
        /* renamed from: X */
        public C0798a[] f4397X;
        /* renamed from: Y */
        public C0799b f4398Y;
        /* renamed from: Z */
        public Long f4399Z;
        /* renamed from: a */
        public String f4400a;
        public String aa;
        public Integer ab;
        public Boolean ac;
        public String ad;
        public Long ae;
        public C0804e af;
        /* renamed from: b */
        public String f4401b;
        /* renamed from: c */
        public Long f4402c;
        /* renamed from: d */
        public Long f4403d;
        /* renamed from: e */
        public Long f4404e;
        /* renamed from: f */
        public Long f4405f;
        /* renamed from: g */
        public Long f4406g;
        /* renamed from: h */
        public Long f4407h;
        /* renamed from: i */
        public Long f4408i;
        /* renamed from: j */
        public Long f4409j;
        /* renamed from: k */
        public Long f4410k;
        /* renamed from: l */
        public Long f4411l;
        /* renamed from: m */
        public String f4412m;
        /* renamed from: n */
        public Long f4413n;
        /* renamed from: o */
        public Long f4414o;
        /* renamed from: p */
        public Long f4415p;
        /* renamed from: q */
        public Long f4416q;
        /* renamed from: r */
        public Long f4417r;
        /* renamed from: s */
        public Long f4418s;
        /* renamed from: t */
        public Long f4419t;
        /* renamed from: u */
        public Long f4420u;
        /* renamed from: v */
        public Long f4421v;
        /* renamed from: w */
        public String f4422w;
        /* renamed from: x */
        public String f4423x;
        /* renamed from: y */
        public Long f4424y;
        /* renamed from: z */
        public Long f4425z;

        /* renamed from: atr$a$a */
        public static final class C0798a extends awz<C0798a> {
            /* renamed from: m */
            private static volatile C0798a[] f4358m;
            /* renamed from: a */
            public Long f4359a;
            /* renamed from: b */
            public Long f4360b;
            /* renamed from: c */
            public Long f4361c;
            /* renamed from: d */
            public Long f4362d;
            /* renamed from: e */
            public Long f4363e;
            /* renamed from: f */
            public Long f4364f;
            /* renamed from: g */
            public Integer f4365g;
            /* renamed from: h */
            public Long f4366h;
            /* renamed from: i */
            public Long f4367i;
            /* renamed from: j */
            public Long f4368j;
            /* renamed from: k */
            public Integer f4369k;
            /* renamed from: l */
            public Long f4370l;

            public C0798a() {
                this.f4359a = null;
                this.f4360b = null;
                this.f4361c = null;
                this.f4362d = null;
                this.f4363e = null;
                this.f4364f = null;
                this.f4365g = null;
                this.f4366h = null;
                this.f4367i = null;
                this.f4368j = null;
                this.f4369k = null;
                this.f4370l = null;
                this.ah = -1;
            }

            /* renamed from: b */
            public static C0798a[] m5646b() {
                if (f4358m == null) {
                    synchronized (axd.f4833c) {
                        if (f4358m == null) {
                            f4358m = new C0798a[0];
                        }
                    }
                }
                return f4358m;
            }

            /* renamed from: a */
            protected int mo718a() {
                int a = super.mo718a();
                if (this.f4359a != null) {
                    a += awy.m6223e(1, this.f4359a.longValue());
                }
                if (this.f4360b != null) {
                    a += awy.m6223e(2, this.f4360b.longValue());
                }
                if (this.f4361c != null) {
                    a += awy.m6223e(3, this.f4361c.longValue());
                }
                if (this.f4362d != null) {
                    a += awy.m6223e(4, this.f4362d.longValue());
                }
                if (this.f4363e != null) {
                    a += awy.m6223e(5, this.f4363e.longValue());
                }
                if (this.f4364f != null) {
                    a += awy.m6223e(6, this.f4364f.longValue());
                }
                if (this.f4365g != null) {
                    a += awy.m6209b(7, this.f4365g.intValue());
                }
                if (this.f4366h != null) {
                    a += awy.m6223e(8, this.f4366h.longValue());
                }
                if (this.f4367i != null) {
                    a += awy.m6223e(9, this.f4367i.longValue());
                }
                if (this.f4368j != null) {
                    a += awy.m6223e(10, this.f4368j.longValue());
                }
                if (this.f4369k != null) {
                    a += awy.m6209b(11, this.f4369k.intValue());
                }
                return this.f4370l != null ? a + awy.m6223e(12, this.f4370l.longValue()) : a;
            }

            /* renamed from: a */
            public C0798a m5648a(awx awx) throws IOException {
                while (true) {
                    int a = awx.m6177a();
                    switch (a) {
                        case 0:
                            break;
                        case 8:
                            this.f4359a = Long.valueOf(awx.m6185d());
                            continue;
                        case 16:
                            this.f4360b = Long.valueOf(awx.m6185d());
                            continue;
                        case 24:
                            this.f4361c = Long.valueOf(awx.m6185d());
                            continue;
                        case 32:
                            this.f4362d = Long.valueOf(awx.m6185d());
                            continue;
                        case 40:
                            this.f4363e = Long.valueOf(awx.m6185d());
                            continue;
                        case 48:
                            this.f4364f = Long.valueOf(awx.m6185d());
                            continue;
                        case 56:
                            a = awx.m6187e();
                            switch (a) {
                                case 0:
                                case 1:
                                case 2:
                                case 1000:
                                    this.f4365g = Integer.valueOf(a);
                                    break;
                                default:
                                    continue;
                            }
                        case 64:
                            this.f4366h = Long.valueOf(awx.m6185d());
                            continue;
                        case 72:
                            this.f4367i = Long.valueOf(awx.m6185d());
                            continue;
                        case 80:
                            this.f4368j = Long.valueOf(awx.m6185d());
                            continue;
                        case 88:
                            a = awx.m6187e();
                            switch (a) {
                                case 0:
                                case 1:
                                case 2:
                                case 1000:
                                    this.f4369k = Integer.valueOf(a);
                                    break;
                                default:
                                    continue;
                            }
                        case 96:
                            this.f4370l = Long.valueOf(awx.m6185d());
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
                if (this.f4359a != null) {
                    awy.m6244b(1, this.f4359a.longValue());
                }
                if (this.f4360b != null) {
                    awy.m6244b(2, this.f4360b.longValue());
                }
                if (this.f4361c != null) {
                    awy.m6244b(3, this.f4361c.longValue());
                }
                if (this.f4362d != null) {
                    awy.m6244b(4, this.f4362d.longValue());
                }
                if (this.f4363e != null) {
                    awy.m6244b(5, this.f4363e.longValue());
                }
                if (this.f4364f != null) {
                    awy.m6244b(6, this.f4364f.longValue());
                }
                if (this.f4365g != null) {
                    awy.m6233a(7, this.f4365g.intValue());
                }
                if (this.f4366h != null) {
                    awy.m6244b(8, this.f4366h.longValue());
                }
                if (this.f4367i != null) {
                    awy.m6244b(9, this.f4367i.longValue());
                }
                if (this.f4368j != null) {
                    awy.m6244b(10, this.f4368j.longValue());
                }
                if (this.f4369k != null) {
                    awy.m6233a(11, this.f4369k.intValue());
                }
                if (this.f4370l != null) {
                    awy.m6244b(12, this.f4370l.longValue());
                }
                super.mo719a(awy);
            }

            /* renamed from: b */
            public /* synthetic */ axf mo722b(awx awx) throws IOException {
                return m5648a(awx);
            }
        }

        /* renamed from: atr$a$b */
        public static final class C0799b extends awz<C0799b> {
            /* renamed from: a */
            public Long f4371a;
            /* renamed from: b */
            public Long f4372b;
            /* renamed from: c */
            public Long f4373c;

            public C0799b() {
                this.f4371a = null;
                this.f4372b = null;
                this.f4373c = null;
                this.ah = -1;
            }

            /* renamed from: a */
            protected int mo718a() {
                int a = super.mo718a();
                if (this.f4371a != null) {
                    a += awy.m6223e(1, this.f4371a.longValue());
                }
                if (this.f4372b != null) {
                    a += awy.m6223e(2, this.f4372b.longValue());
                }
                return this.f4373c != null ? a + awy.m6223e(3, this.f4373c.longValue()) : a;
            }

            /* renamed from: a */
            public C0799b m5652a(awx awx) throws IOException {
                while (true) {
                    int a = awx.m6177a();
                    switch (a) {
                        case 0:
                            break;
                        case 8:
                            this.f4371a = Long.valueOf(awx.m6185d());
                            continue;
                        case 16:
                            this.f4372b = Long.valueOf(awx.m6185d());
                            continue;
                        case 24:
                            this.f4373c = Long.valueOf(awx.m6185d());
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
                if (this.f4371a != null) {
                    awy.m6244b(1, this.f4371a.longValue());
                }
                if (this.f4372b != null) {
                    awy.m6244b(2, this.f4372b.longValue());
                }
                if (this.f4373c != null) {
                    awy.m6244b(3, this.f4373c.longValue());
                }
                super.mo719a(awy);
            }

            /* renamed from: b */
            public /* synthetic */ axf mo722b(awx awx) throws IOException {
                return m5652a(awx);
            }
        }

        public C0800a() {
            this.f4400a = null;
            this.f4401b = null;
            this.f4402c = null;
            this.f4403d = null;
            this.f4404e = null;
            this.f4405f = null;
            this.f4406g = null;
            this.f4407h = null;
            this.f4408i = null;
            this.f4409j = null;
            this.f4410k = null;
            this.f4411l = null;
            this.f4412m = null;
            this.f4413n = null;
            this.f4414o = null;
            this.f4415p = null;
            this.f4416q = null;
            this.f4417r = null;
            this.f4418s = null;
            this.f4419t = null;
            this.f4420u = null;
            this.f4421v = null;
            this.f4422w = null;
            this.f4423x = null;
            this.f4424y = null;
            this.f4425z = null;
            this.f4374A = null;
            this.f4375B = null;
            this.f4376C = null;
            this.f4377D = null;
            this.f4378E = null;
            this.f4380G = null;
            this.f4381H = null;
            this.f4382I = null;
            this.f4383J = null;
            this.f4384K = null;
            this.f4385L = null;
            this.f4386M = null;
            this.f4387N = null;
            this.f4388O = null;
            this.f4389P = null;
            this.f4390Q = null;
            this.f4391R = null;
            this.f4392S = null;
            this.f4393T = null;
            this.f4394U = null;
            this.f4395V = null;
            this.f4397X = C0798a.m5646b();
            this.f4399Z = null;
            this.aa = null;
            this.ab = null;
            this.ac = null;
            this.ad = null;
            this.ae = null;
            this.ah = -1;
        }

        /* renamed from: a */
        public static C0800a m5655a(byte[] bArr) throws axe {
            return (C0800a) axf.m5613a(new C0800a(), bArr);
        }

        /* renamed from: a */
        protected int mo718a() {
            int a = super.mo718a();
            if (this.f4400a != null) {
                a += awy.m6211b(1, this.f4400a);
            }
            if (this.f4401b != null) {
                a += awy.m6211b(2, this.f4401b);
            }
            if (this.f4402c != null) {
                a += awy.m6223e(3, this.f4402c.longValue());
            }
            if (this.f4403d != null) {
                a += awy.m6223e(4, this.f4403d.longValue());
            }
            if (this.f4404e != null) {
                a += awy.m6223e(5, this.f4404e.longValue());
            }
            if (this.f4405f != null) {
                a += awy.m6223e(6, this.f4405f.longValue());
            }
            if (this.f4406g != null) {
                a += awy.m6223e(7, this.f4406g.longValue());
            }
            if (this.f4407h != null) {
                a += awy.m6223e(8, this.f4407h.longValue());
            }
            if (this.f4408i != null) {
                a += awy.m6223e(9, this.f4408i.longValue());
            }
            if (this.f4409j != null) {
                a += awy.m6223e(10, this.f4409j.longValue());
            }
            if (this.f4410k != null) {
                a += awy.m6223e(11, this.f4410k.longValue());
            }
            if (this.f4411l != null) {
                a += awy.m6223e(12, this.f4411l.longValue());
            }
            if (this.f4412m != null) {
                a += awy.m6211b(13, this.f4412m);
            }
            if (this.f4413n != null) {
                a += awy.m6223e(14, this.f4413n.longValue());
            }
            if (this.f4414o != null) {
                a += awy.m6223e(15, this.f4414o.longValue());
            }
            if (this.f4415p != null) {
                a += awy.m6223e(16, this.f4415p.longValue());
            }
            if (this.f4416q != null) {
                a += awy.m6223e(17, this.f4416q.longValue());
            }
            if (this.f4417r != null) {
                a += awy.m6223e(18, this.f4417r.longValue());
            }
            if (this.f4418s != null) {
                a += awy.m6223e(19, this.f4418s.longValue());
            }
            if (this.f4419t != null) {
                a += awy.m6223e(20, this.f4419t.longValue());
            }
            if (this.f4399Z != null) {
                a += awy.m6223e(21, this.f4399Z.longValue());
            }
            if (this.f4420u != null) {
                a += awy.m6223e(22, this.f4420u.longValue());
            }
            if (this.f4421v != null) {
                a += awy.m6223e(23, this.f4421v.longValue());
            }
            if (this.aa != null) {
                a += awy.m6211b(24, this.aa);
            }
            if (this.ae != null) {
                a += awy.m6223e(25, this.ae.longValue());
            }
            if (this.ab != null) {
                a += awy.m6209b(26, this.ab.intValue());
            }
            if (this.f4422w != null) {
                a += awy.m6211b(27, this.f4422w);
            }
            if (this.ac != null) {
                a += awy.m6212b(28, this.ac.booleanValue());
            }
            if (this.f4423x != null) {
                a += awy.m6211b(29, this.f4423x);
            }
            if (this.ad != null) {
                a += awy.m6211b(30, this.ad);
            }
            if (this.f4424y != null) {
                a += awy.m6223e(31, this.f4424y.longValue());
            }
            if (this.f4425z != null) {
                a += awy.m6223e(32, this.f4425z.longValue());
            }
            if (this.f4374A != null) {
                a += awy.m6223e(33, this.f4374A.longValue());
            }
            if (this.f4375B != null) {
                a += awy.m6211b(34, this.f4375B);
            }
            if (this.f4376C != null) {
                a += awy.m6223e(35, this.f4376C.longValue());
            }
            if (this.f4377D != null) {
                a += awy.m6223e(36, this.f4377D.longValue());
            }
            if (this.f4378E != null) {
                a += awy.m6223e(37, this.f4378E.longValue());
            }
            if (this.f4379F != null) {
                a += awy.m6216c(38, this.f4379F);
            }
            if (this.f4380G != null) {
                a += awy.m6223e(39, this.f4380G.longValue());
            }
            if (this.f4381H != null) {
                a += awy.m6223e(40, this.f4381H.longValue());
            }
            if (this.f4382I != null) {
                a += awy.m6223e(41, this.f4382I.longValue());
            }
            if (this.f4383J != null) {
                a += awy.m6223e(42, this.f4383J.longValue());
            }
            if (this.f4397X != null && this.f4397X.length > 0) {
                int i = a;
                for (axf axf : this.f4397X) {
                    if (axf != null) {
                        i += awy.m6216c(43, axf);
                    }
                }
                a = i;
            }
            if (this.f4384K != null) {
                a += awy.m6223e(44, this.f4384K.longValue());
            }
            if (this.f4385L != null) {
                a += awy.m6223e(45, this.f4385L.longValue());
            }
            if (this.f4386M != null) {
                a += awy.m6211b(46, this.f4386M);
            }
            if (this.f4387N != null) {
                a += awy.m6211b(47, this.f4387N);
            }
            if (this.f4388O != null) {
                a += awy.m6209b(48, this.f4388O.intValue());
            }
            if (this.f4389P != null) {
                a += awy.m6209b(49, this.f4389P.intValue());
            }
            if (this.f4396W != null) {
                a += awy.m6216c(50, this.f4396W);
            }
            if (this.f4390Q != null) {
                a += awy.m6223e(51, this.f4390Q.longValue());
            }
            if (this.f4391R != null) {
                a += awy.m6223e(52, this.f4391R.longValue());
            }
            if (this.f4392S != null) {
                a += awy.m6223e(53, this.f4392S.longValue());
            }
            if (this.f4393T != null) {
                a += awy.m6223e(54, this.f4393T.longValue());
            }
            if (this.f4394U != null) {
                a += awy.m6223e(55, this.f4394U.longValue());
            }
            if (this.f4395V != null) {
                a += awy.m6209b(56, this.f4395V.intValue());
            }
            if (this.f4398Y != null) {
                a += awy.m6216c(57, this.f4398Y);
            }
            return this.af != null ? a + awy.m6216c((int) InterstitialErrorStatus.EXPIRED, this.af) : a;
        }

        /* renamed from: a */
        public C0800a m5657a(awx awx) throws IOException {
            while (true) {
                int a = awx.m6177a();
                switch (a) {
                    case 0:
                        break;
                    case 10:
                        this.f4400a = awx.m6191g();
                        continue;
                    case 18:
                        this.f4401b = awx.m6191g();
                        continue;
                    case 24:
                        this.f4402c = Long.valueOf(awx.m6185d());
                        continue;
                    case 32:
                        this.f4403d = Long.valueOf(awx.m6185d());
                        continue;
                    case 40:
                        this.f4404e = Long.valueOf(awx.m6185d());
                        continue;
                    case 48:
                        this.f4405f = Long.valueOf(awx.m6185d());
                        continue;
                    case 56:
                        this.f4406g = Long.valueOf(awx.m6185d());
                        continue;
                    case 64:
                        this.f4407h = Long.valueOf(awx.m6185d());
                        continue;
                    case 72:
                        this.f4408i = Long.valueOf(awx.m6185d());
                        continue;
                    case 80:
                        this.f4409j = Long.valueOf(awx.m6185d());
                        continue;
                    case 88:
                        this.f4410k = Long.valueOf(awx.m6185d());
                        continue;
                    case 96:
                        this.f4411l = Long.valueOf(awx.m6185d());
                        continue;
                    case 106:
                        this.f4412m = awx.m6191g();
                        continue;
                    case 112:
                        this.f4413n = Long.valueOf(awx.m6185d());
                        continue;
                    case 120:
                        this.f4414o = Long.valueOf(awx.m6185d());
                        continue;
                    case 128:
                        this.f4415p = Long.valueOf(awx.m6185d());
                        continue;
                    case 136:
                        this.f4416q = Long.valueOf(awx.m6185d());
                        continue;
                    case 144:
                        this.f4417r = Long.valueOf(awx.m6185d());
                        continue;
                    case 152:
                        this.f4418s = Long.valueOf(awx.m6185d());
                        continue;
                    case 160:
                        this.f4419t = Long.valueOf(awx.m6185d());
                        continue;
                    case 168:
                        this.f4399Z = Long.valueOf(awx.m6185d());
                        continue;
                    case 176:
                        this.f4420u = Long.valueOf(awx.m6185d());
                        continue;
                    case 184:
                        this.f4421v = Long.valueOf(awx.m6185d());
                        continue;
                    case 194:
                        this.aa = awx.m6191g();
                        continue;
                    case HttpStatus.HTTP_OK /*200*/:
                        this.ae = Long.valueOf(awx.m6185d());
                        continue;
                    case JfifUtil.MARKER_RST0 /*208*/:
                        a = awx.m6187e();
                        switch (a) {
                            case 0:
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                                this.ab = Integer.valueOf(a);
                                break;
                            default:
                                continue;
                        }
                    case JfifUtil.MARKER_SOS /*218*/:
                        this.f4422w = awx.m6191g();
                        continue;
                    case 224:
                        this.ac = Boolean.valueOf(awx.m6190f());
                        continue;
                    case 234:
                        this.f4423x = awx.m6191g();
                        continue;
                    case 242:
                        this.ad = awx.m6191g();
                        continue;
                    case 248:
                        this.f4424y = Long.valueOf(awx.m6185d());
                        continue;
                    case 256:
                        this.f4425z = Long.valueOf(awx.m6185d());
                        continue;
                    case 264:
                        this.f4374A = Long.valueOf(awx.m6185d());
                        continue;
                    case TiffUtil.TIFF_TAG_ORIENTATION /*274*/:
                        this.f4375B = awx.m6191g();
                        continue;
                    case 280:
                        this.f4376C = Long.valueOf(awx.m6185d());
                        continue;
                    case 288:
                        this.f4377D = Long.valueOf(awx.m6185d());
                        continue;
                    case 296:
                        this.f4378E = Long.valueOf(awx.m6185d());
                        continue;
                    case 306:
                        if (this.f4379F == null) {
                            this.f4379F = new C0801b();
                        }
                        awx.m6179a(this.f4379F);
                        continue;
                    case 312:
                        this.f4380G = Long.valueOf(awx.m6185d());
                        continue;
                    case 320:
                        this.f4381H = Long.valueOf(awx.m6185d());
                        continue;
                    case 328:
                        this.f4382I = Long.valueOf(awx.m6185d());
                        continue;
                    case 336:
                        this.f4383J = Long.valueOf(awx.m6185d());
                        continue;
                    case 346:
                        int a2 = axi.m6311a(awx, 346);
                        a = this.f4397X == null ? 0 : this.f4397X.length;
                        Object obj = new C0798a[(a2 + a)];
                        if (a != 0) {
                            System.arraycopy(this.f4397X, 0, obj, 0, a);
                        }
                        while (a < obj.length - 1) {
                            obj[a] = new C0798a();
                            awx.m6179a(obj[a]);
                            awx.m6177a();
                            a++;
                        }
                        obj[a] = new C0798a();
                        awx.m6179a(obj[a]);
                        this.f4397X = obj;
                        continue;
                    case 352:
                        this.f4384K = Long.valueOf(awx.m6185d());
                        continue;
                    case 360:
                        this.f4385L = Long.valueOf(awx.m6185d());
                        continue;
                    case 370:
                        this.f4386M = awx.m6191g();
                        continue;
                    case 378:
                        this.f4387N = awx.m6191g();
                        continue;
                    case BitmapCounterProvider.MAX_BITMAP_COUNT /*384*/:
                        a = awx.m6187e();
                        switch (a) {
                            case 0:
                            case 1:
                            case 2:
                            case 1000:
                                this.f4388O = Integer.valueOf(a);
                                break;
                            default:
                                continue;
                        }
                    case 392:
                        a = awx.m6187e();
                        switch (a) {
                            case 0:
                            case 1:
                            case 2:
                            case 1000:
                                this.f4389P = Integer.valueOf(a);
                                break;
                            default:
                                continue;
                        }
                    case 402:
                        if (this.f4396W == null) {
                            this.f4396W = new C0798a();
                        }
                        awx.m6179a(this.f4396W);
                        continue;
                    case AdTrackerConstants.NETWORK_TIMEOUT /*408*/:
                        this.f4390Q = Long.valueOf(awx.m6185d());
                        continue;
                    case 416:
                        this.f4391R = Long.valueOf(awx.m6185d());
                        continue;
                    case AdTrackerConstants.EXCEPTION /*424*/:
                        this.f4392S = Long.valueOf(awx.m6185d());
                        continue;
                    case 432:
                        this.f4393T = Long.valueOf(awx.m6185d());
                        continue;
                    case 440:
                        this.f4394U = Long.valueOf(awx.m6185d());
                        continue;
                    case 448:
                        a = awx.m6187e();
                        switch (a) {
                            case 0:
                            case 1:
                            case 2:
                            case 1000:
                                this.f4395V = Integer.valueOf(a);
                                break;
                            default:
                                continue;
                        }
                    case 458:
                        if (this.f4398Y == null) {
                            this.f4398Y = new C0799b();
                        }
                        awx.m6179a(this.f4398Y);
                        continue;
                    case 1610:
                        if (this.af == null) {
                            this.af = new C0804e();
                        }
                        awx.m6179a(this.af);
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
            if (this.f4400a != null) {
                awy.m6236a(1, this.f4400a);
            }
            if (this.f4401b != null) {
                awy.m6236a(2, this.f4401b);
            }
            if (this.f4402c != null) {
                awy.m6244b(3, this.f4402c.longValue());
            }
            if (this.f4403d != null) {
                awy.m6244b(4, this.f4403d.longValue());
            }
            if (this.f4404e != null) {
                awy.m6244b(5, this.f4404e.longValue());
            }
            if (this.f4405f != null) {
                awy.m6244b(6, this.f4405f.longValue());
            }
            if (this.f4406g != null) {
                awy.m6244b(7, this.f4406g.longValue());
            }
            if (this.f4407h != null) {
                awy.m6244b(8, this.f4407h.longValue());
            }
            if (this.f4408i != null) {
                awy.m6244b(9, this.f4408i.longValue());
            }
            if (this.f4409j != null) {
                awy.m6244b(10, this.f4409j.longValue());
            }
            if (this.f4410k != null) {
                awy.m6244b(11, this.f4410k.longValue());
            }
            if (this.f4411l != null) {
                awy.m6244b(12, this.f4411l.longValue());
            }
            if (this.f4412m != null) {
                awy.m6236a(13, this.f4412m);
            }
            if (this.f4413n != null) {
                awy.m6244b(14, this.f4413n.longValue());
            }
            if (this.f4414o != null) {
                awy.m6244b(15, this.f4414o.longValue());
            }
            if (this.f4415p != null) {
                awy.m6244b(16, this.f4415p.longValue());
            }
            if (this.f4416q != null) {
                awy.m6244b(17, this.f4416q.longValue());
            }
            if (this.f4417r != null) {
                awy.m6244b(18, this.f4417r.longValue());
            }
            if (this.f4418s != null) {
                awy.m6244b(19, this.f4418s.longValue());
            }
            if (this.f4419t != null) {
                awy.m6244b(20, this.f4419t.longValue());
            }
            if (this.f4399Z != null) {
                awy.m6244b(21, this.f4399Z.longValue());
            }
            if (this.f4420u != null) {
                awy.m6244b(22, this.f4420u.longValue());
            }
            if (this.f4421v != null) {
                awy.m6244b(23, this.f4421v.longValue());
            }
            if (this.aa != null) {
                awy.m6236a(24, this.aa);
            }
            if (this.ae != null) {
                awy.m6244b(25, this.ae.longValue());
            }
            if (this.ab != null) {
                awy.m6233a(26, this.ab.intValue());
            }
            if (this.f4422w != null) {
                awy.m6236a(27, this.f4422w);
            }
            if (this.ac != null) {
                awy.m6237a(28, this.ac.booleanValue());
            }
            if (this.f4423x != null) {
                awy.m6236a(29, this.f4423x);
            }
            if (this.ad != null) {
                awy.m6236a(30, this.ad);
            }
            if (this.f4424y != null) {
                awy.m6244b(31, this.f4424y.longValue());
            }
            if (this.f4425z != null) {
                awy.m6244b(32, this.f4425z.longValue());
            }
            if (this.f4374A != null) {
                awy.m6244b(33, this.f4374A.longValue());
            }
            if (this.f4375B != null) {
                awy.m6236a(34, this.f4375B);
            }
            if (this.f4376C != null) {
                awy.m6244b(35, this.f4376C.longValue());
            }
            if (this.f4377D != null) {
                awy.m6244b(36, this.f4377D.longValue());
            }
            if (this.f4378E != null) {
                awy.m6244b(37, this.f4378E.longValue());
            }
            if (this.f4379F != null) {
                awy.m6235a(38, this.f4379F);
            }
            if (this.f4380G != null) {
                awy.m6244b(39, this.f4380G.longValue());
            }
            if (this.f4381H != null) {
                awy.m6244b(40, this.f4381H.longValue());
            }
            if (this.f4382I != null) {
                awy.m6244b(41, this.f4382I.longValue());
            }
            if (this.f4383J != null) {
                awy.m6244b(42, this.f4383J.longValue());
            }
            if (this.f4397X != null && this.f4397X.length > 0) {
                for (axf axf : this.f4397X) {
                    if (axf != null) {
                        awy.m6235a(43, axf);
                    }
                }
            }
            if (this.f4384K != null) {
                awy.m6244b(44, this.f4384K.longValue());
            }
            if (this.f4385L != null) {
                awy.m6244b(45, this.f4385L.longValue());
            }
            if (this.f4386M != null) {
                awy.m6236a(46, this.f4386M);
            }
            if (this.f4387N != null) {
                awy.m6236a(47, this.f4387N);
            }
            if (this.f4388O != null) {
                awy.m6233a(48, this.f4388O.intValue());
            }
            if (this.f4389P != null) {
                awy.m6233a(49, this.f4389P.intValue());
            }
            if (this.f4396W != null) {
                awy.m6235a(50, this.f4396W);
            }
            if (this.f4390Q != null) {
                awy.m6244b(51, this.f4390Q.longValue());
            }
            if (this.f4391R != null) {
                awy.m6244b(52, this.f4391R.longValue());
            }
            if (this.f4392S != null) {
                awy.m6244b(53, this.f4392S.longValue());
            }
            if (this.f4393T != null) {
                awy.m6244b(54, this.f4393T.longValue());
            }
            if (this.f4394U != null) {
                awy.m6244b(55, this.f4394U.longValue());
            }
            if (this.f4395V != null) {
                awy.m6233a(56, this.f4395V.intValue());
            }
            if (this.f4398Y != null) {
                awy.m6235a(57, this.f4398Y);
            }
            if (this.af != null) {
                awy.m6235a((int) InterstitialErrorStatus.EXPIRED, this.af);
            }
            super.mo719a(awy);
        }

        /* renamed from: b */
        public /* synthetic */ axf mo722b(awx awx) throws IOException {
            return m5657a(awx);
        }
    }

    /* renamed from: atr$b */
    public static final class C0801b extends awz<C0801b> {
        /* renamed from: a */
        public Long f4426a;
        /* renamed from: b */
        public Integer f4427b;
        /* renamed from: c */
        public Boolean f4428c;
        /* renamed from: d */
        public int[] f4429d;
        /* renamed from: e */
        public Long f4430e;

        public C0801b() {
            this.f4426a = null;
            this.f4427b = null;
            this.f4428c = null;
            this.f4429d = axi.f4840e;
            this.f4430e = null;
            this.ah = -1;
        }

        /* renamed from: a */
        protected int mo718a() {
            int i = 0;
            int a = super.mo718a();
            if (this.f4426a != null) {
                a += awy.m6223e(1, this.f4426a.longValue());
            }
            if (this.f4427b != null) {
                a += awy.m6209b(2, this.f4427b.intValue());
            }
            if (this.f4428c != null) {
                a += awy.m6212b(3, this.f4428c.booleanValue());
            }
            if (this.f4429d != null && this.f4429d.length > 0) {
                int i2 = 0;
                while (i < this.f4429d.length) {
                    i2 += awy.m6208b(this.f4429d[i]);
                    i++;
                }
                a = (a + i2) + (this.f4429d.length * 1);
            }
            return this.f4430e != null ? a + awy.m6220d(5, this.f4430e.longValue()) : a;
        }

        /* renamed from: a */
        public C0801b m5661a(awx awx) throws IOException {
            while (true) {
                int a = awx.m6177a();
                int a2;
                switch (a) {
                    case 0:
                        break;
                    case 8:
                        this.f4426a = Long.valueOf(awx.m6185d());
                        continue;
                    case 16:
                        this.f4427b = Integer.valueOf(awx.m6187e());
                        continue;
                    case 24:
                        this.f4428c = Boolean.valueOf(awx.m6190f());
                        continue;
                    case 32:
                        a2 = axi.m6311a(awx, 32);
                        a = this.f4429d == null ? 0 : this.f4429d.length;
                        Object obj = new int[(a2 + a)];
                        if (a != 0) {
                            System.arraycopy(this.f4429d, 0, obj, 0, a);
                        }
                        while (a < obj.length - 1) {
                            obj[a] = awx.m6187e();
                            awx.m6177a();
                            a++;
                        }
                        obj[a] = awx.m6187e();
                        this.f4429d = obj;
                        continue;
                    case 34:
                        int c = awx.m6183c(awx.m6194j());
                        a2 = awx.m6200p();
                        a = 0;
                        while (awx.m6198n() > 0) {
                            awx.m6187e();
                            a++;
                        }
                        awx.m6188e(a2);
                        a2 = this.f4429d == null ? 0 : this.f4429d.length;
                        Object obj2 = new int[(a + a2)];
                        if (a2 != 0) {
                            System.arraycopy(this.f4429d, 0, obj2, 0, a2);
                        }
                        while (a2 < obj2.length) {
                            obj2[a2] = awx.m6187e();
                            a2++;
                        }
                        this.f4429d = obj2;
                        awx.m6186d(c);
                        continue;
                    case 40:
                        this.f4430e = Long.valueOf(awx.m6184c());
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
            if (this.f4426a != null) {
                awy.m6244b(1, this.f4426a.longValue());
            }
            if (this.f4427b != null) {
                awy.m6233a(2, this.f4427b.intValue());
            }
            if (this.f4428c != null) {
                awy.m6237a(3, this.f4428c.booleanValue());
            }
            if (this.f4429d != null && this.f4429d.length > 0) {
                for (int a : this.f4429d) {
                    awy.m6233a(4, a);
                }
            }
            if (this.f4430e != null) {
                awy.m6234a(5, this.f4430e.longValue());
            }
            super.mo719a(awy);
        }

        /* renamed from: b */
        public /* synthetic */ axf mo722b(awx awx) throws IOException {
            return m5661a(awx);
        }
    }

    /* renamed from: atr$c */
    public static final class C0802c extends awz<C0802c> {
        /* renamed from: a */
        public byte[] f4431a;
        /* renamed from: b */
        public byte[] f4432b;

        public C0802c() {
            this.f4431a = null;
            this.f4432b = null;
            this.ah = -1;
        }

        /* renamed from: a */
        protected int mo718a() {
            int a = super.mo718a();
            if (this.f4431a != null) {
                a += awy.m6213b(1, this.f4431a);
            }
            return this.f4432b != null ? a + awy.m6213b(2, this.f4432b) : a;
        }

        /* renamed from: a */
        public C0802c m5665a(awx awx) throws IOException {
            while (true) {
                int a = awx.m6177a();
                switch (a) {
                    case 0:
                        break;
                    case 10:
                        this.f4431a = awx.m6192h();
                        continue;
                    case 18:
                        this.f4432b = awx.m6192h();
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
            if (this.f4431a != null) {
                awy.m6238a(1, this.f4431a);
            }
            if (this.f4432b != null) {
                awy.m6238a(2, this.f4432b);
            }
            super.mo719a(awy);
        }

        /* renamed from: b */
        public /* synthetic */ axf mo722b(awx awx) throws IOException {
            return m5665a(awx);
        }
    }

    /* renamed from: atr$d */
    public static final class C0803d extends awz<C0803d> {
        /* renamed from: a */
        public byte[] f4433a;
        /* renamed from: b */
        public byte[] f4434b;
        /* renamed from: c */
        public byte[] f4435c;
        /* renamed from: d */
        public byte[] f4436d;

        public C0803d() {
            this.f4433a = null;
            this.f4434b = null;
            this.f4435c = null;
            this.f4436d = null;
            this.ah = -1;
        }

        /* renamed from: a */
        public static C0803d m5668a(byte[] bArr) throws axe {
            return (C0803d) axf.m5613a(new C0803d(), bArr);
        }

        /* renamed from: a */
        protected int mo718a() {
            int a = super.mo718a();
            if (this.f4433a != null) {
                a += awy.m6213b(1, this.f4433a);
            }
            if (this.f4434b != null) {
                a += awy.m6213b(2, this.f4434b);
            }
            if (this.f4435c != null) {
                a += awy.m6213b(3, this.f4435c);
            }
            return this.f4436d != null ? a + awy.m6213b(4, this.f4436d) : a;
        }

        /* renamed from: a */
        public C0803d m5670a(awx awx) throws IOException {
            while (true) {
                int a = awx.m6177a();
                switch (a) {
                    case 0:
                        break;
                    case 10:
                        this.f4433a = awx.m6192h();
                        continue;
                    case 18:
                        this.f4434b = awx.m6192h();
                        continue;
                    case 26:
                        this.f4435c = awx.m6192h();
                        continue;
                    case 34:
                        this.f4436d = awx.m6192h();
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
            if (this.f4433a != null) {
                awy.m6238a(1, this.f4433a);
            }
            if (this.f4434b != null) {
                awy.m6238a(2, this.f4434b);
            }
            if (this.f4435c != null) {
                awy.m6238a(3, this.f4435c);
            }
            if (this.f4436d != null) {
                awy.m6238a(4, this.f4436d);
            }
            super.mo719a(awy);
        }

        /* renamed from: b */
        public /* synthetic */ axf mo722b(awx awx) throws IOException {
            return m5670a(awx);
        }
    }

    /* renamed from: atr$e */
    public static final class C0804e extends awz<C0804e> {
        /* renamed from: a */
        public Long f4437a;
        /* renamed from: b */
        public String f4438b;
        /* renamed from: c */
        public byte[] f4439c;

        public C0804e() {
            this.f4437a = null;
            this.f4438b = null;
            this.f4439c = null;
            this.ah = -1;
        }

        /* renamed from: a */
        protected int mo718a() {
            int a = super.mo718a();
            if (this.f4437a != null) {
                a += awy.m6223e(1, this.f4437a.longValue());
            }
            if (this.f4438b != null) {
                a += awy.m6211b(3, this.f4438b);
            }
            return this.f4439c != null ? a + awy.m6213b(4, this.f4439c) : a;
        }

        /* renamed from: a */
        public C0804e m5674a(awx awx) throws IOException {
            while (true) {
                int a = awx.m6177a();
                switch (a) {
                    case 0:
                        break;
                    case 8:
                        this.f4437a = Long.valueOf(awx.m6185d());
                        continue;
                    case 26:
                        this.f4438b = awx.m6191g();
                        continue;
                    case 34:
                        this.f4439c = awx.m6192h();
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
            if (this.f4437a != null) {
                awy.m6244b(1, this.f4437a.longValue());
            }
            if (this.f4438b != null) {
                awy.m6236a(3, this.f4438b);
            }
            if (this.f4439c != null) {
                awy.m6238a(4, this.f4439c);
            }
            super.mo719a(awy);
        }

        /* renamed from: b */
        public /* synthetic */ axf mo722b(awx awx) throws IOException {
            return m5674a(awx);
        }
    }

    /* renamed from: atr$f */
    public static final class C0805f extends awz<C0805f> {
        /* renamed from: a */
        public byte[][] f4440a;
        /* renamed from: b */
        public byte[] f4441b;
        /* renamed from: c */
        public Integer f4442c;
        /* renamed from: d */
        public Integer f4443d;

        public C0805f() {
            this.f4440a = axi.f4846k;
            this.f4441b = null;
            this.f4442c = null;
            this.f4443d = null;
            this.ah = -1;
        }

        /* renamed from: a */
        protected int mo718a() {
            int i = 0;
            int a = super.mo718a();
            if (this.f4440a == null || this.f4440a.length <= 0) {
                i = a;
            } else {
                int i2 = 0;
                int i3 = 0;
                while (i < this.f4440a.length) {
                    byte[] bArr = this.f4440a[i];
                    if (bArr != null) {
                        i3++;
                        i2 += awy.m6218c(bArr);
                    }
                    i++;
                }
                i = (a + i2) + (i3 * 1);
            }
            if (this.f4441b != null) {
                i += awy.m6213b(2, this.f4441b);
            }
            if (this.f4442c != null) {
                i += awy.m6209b(3, this.f4442c.intValue());
            }
            return this.f4443d != null ? i + awy.m6209b(4, this.f4443d.intValue()) : i;
        }

        /* renamed from: a */
        public C0805f m5678a(awx awx) throws IOException {
            while (true) {
                int a = awx.m6177a();
                switch (a) {
                    case 0:
                        break;
                    case 10:
                        int a2 = axi.m6311a(awx, 10);
                        a = this.f4440a == null ? 0 : this.f4440a.length;
                        Object obj = new byte[(a2 + a)][];
                        if (a != 0) {
                            System.arraycopy(this.f4440a, 0, obj, 0, a);
                        }
                        while (a < obj.length - 1) {
                            obj[a] = awx.m6192h();
                            awx.m6177a();
                            a++;
                        }
                        obj[a] = awx.m6192h();
                        this.f4440a = obj;
                        continue;
                    case 18:
                        this.f4441b = awx.m6192h();
                        continue;
                    case 24:
                        a = awx.m6187e();
                        switch (a) {
                            case 0:
                            case 1:
                                this.f4442c = Integer.valueOf(a);
                                break;
                            default:
                                continue;
                        }
                    case 32:
                        a = awx.m6187e();
                        switch (a) {
                            case 0:
                            case 1:
                                this.f4443d = Integer.valueOf(a);
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
            if (this.f4440a != null && this.f4440a.length > 0) {
                for (byte[] bArr : this.f4440a) {
                    if (bArr != null) {
                        awy.m6238a(1, bArr);
                    }
                }
            }
            if (this.f4441b != null) {
                awy.m6238a(2, this.f4441b);
            }
            if (this.f4442c != null) {
                awy.m6233a(3, this.f4442c.intValue());
            }
            if (this.f4443d != null) {
                awy.m6233a(4, this.f4443d.intValue());
            }
            super.mo719a(awy);
        }

        /* renamed from: b */
        public /* synthetic */ axf mo722b(awx awx) throws IOException {
            return m5678a(awx);
        }
    }
}
