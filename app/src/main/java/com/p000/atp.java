package com.p000;

import com.facebook.imageutils.JfifUtil;
import java.io.IOException;

/* renamed from: atp */
public interface atp {

    /* renamed from: atp$a */
    public static final class C0794a extends awz<C0794a> {
        /* renamed from: a */
        public C0795b f4340a;
        /* renamed from: b */
        public C0796c f4341b;

        public C0794a() {
            this.ah = -1;
        }

        /* renamed from: a */
        public static C0794a m5629a(byte[] bArr) throws axe {
            return (C0794a) axf.m5613a(new C0794a(), bArr);
        }

        /* renamed from: a */
        protected int mo718a() {
            int a = super.mo718a();
            if (this.f4340a != null) {
                a += awy.m6216c(1, this.f4340a);
            }
            return this.f4341b != null ? a + awy.m6216c(2, this.f4341b) : a;
        }

        /* renamed from: a */
        public C0794a m5631a(awx awx) throws IOException {
            while (true) {
                int a = awx.m6177a();
                switch (a) {
                    case 0:
                        break;
                    case 10:
                        if (this.f4340a == null) {
                            this.f4340a = new C0795b();
                        }
                        awx.m6179a(this.f4340a);
                        continue;
                    case 18:
                        if (this.f4341b == null) {
                            this.f4341b = new C0796c();
                        }
                        awx.m6179a(this.f4341b);
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
            if (this.f4340a != null) {
                awy.m6235a(1, this.f4340a);
            }
            if (this.f4341b != null) {
                awy.m6235a(2, this.f4341b);
            }
            super.mo719a(awy);
        }

        /* renamed from: b */
        public /* synthetic */ axf mo722b(awx awx) throws IOException {
            return m5631a(awx);
        }
    }

    /* renamed from: atp$b */
    public static final class C0795b extends awz<C0795b> {
        /* renamed from: a */
        public Integer f4342a;

        public C0795b() {
            this.f4342a = null;
            this.ah = -1;
        }

        /* renamed from: a */
        protected int mo718a() {
            int a = super.mo718a();
            return this.f4342a != null ? a + awy.m6209b(27, this.f4342a.intValue()) : a;
        }

        /* renamed from: a */
        public C0795b m5635a(awx awx) throws IOException {
            while (true) {
                int a = awx.m6177a();
                switch (a) {
                    case 0:
                        break;
                    case JfifUtil.MARKER_SOI /*216*/:
                        a = awx.m6187e();
                        switch (a) {
                            case 0:
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                                this.f4342a = Integer.valueOf(a);
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
            if (this.f4342a != null) {
                awy.m6233a(27, this.f4342a.intValue());
            }
            super.mo719a(awy);
        }

        /* renamed from: b */
        public /* synthetic */ axf mo722b(awx awx) throws IOException {
            return m5635a(awx);
        }
    }

    /* renamed from: atp$c */
    public static final class C0796c extends awz<C0796c> {
        /* renamed from: a */
        public String f4343a;
        /* renamed from: b */
        public String f4344b;
        /* renamed from: c */
        public String f4345c;
        /* renamed from: d */
        public String f4346d;
        /* renamed from: e */
        public String f4347e;

        public C0796c() {
            this.f4343a = null;
            this.f4344b = null;
            this.f4345c = null;
            this.f4346d = null;
            this.f4347e = null;
            this.ah = -1;
        }

        /* renamed from: a */
        protected int mo718a() {
            int a = super.mo718a();
            if (this.f4343a != null) {
                a += awy.m6211b(1, this.f4343a);
            }
            if (this.f4344b != null) {
                a += awy.m6211b(2, this.f4344b);
            }
            if (this.f4345c != null) {
                a += awy.m6211b(3, this.f4345c);
            }
            if (this.f4346d != null) {
                a += awy.m6211b(4, this.f4346d);
            }
            return this.f4347e != null ? a + awy.m6211b(5, this.f4347e) : a;
        }

        /* renamed from: a */
        public C0796c m5639a(awx awx) throws IOException {
            while (true) {
                int a = awx.m6177a();
                switch (a) {
                    case 0:
                        break;
                    case 10:
                        this.f4343a = awx.m6191g();
                        continue;
                    case 18:
                        this.f4344b = awx.m6191g();
                        continue;
                    case 26:
                        this.f4345c = awx.m6191g();
                        continue;
                    case 34:
                        this.f4346d = awx.m6191g();
                        continue;
                    case 42:
                        this.f4347e = awx.m6191g();
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
            if (this.f4343a != null) {
                awy.m6236a(1, this.f4343a);
            }
            if (this.f4344b != null) {
                awy.m6236a(2, this.f4344b);
            }
            if (this.f4345c != null) {
                awy.m6236a(3, this.f4345c);
            }
            if (this.f4346d != null) {
                awy.m6236a(4, this.f4346d);
            }
            if (this.f4347e != null) {
                awy.m6236a(5, this.f4347e);
            }
            super.mo719a(awy);
        }

        /* renamed from: b */
        public /* synthetic */ axf mo722b(awx awx) throws IOException {
            return m5639a(awx);
        }
    }
}
