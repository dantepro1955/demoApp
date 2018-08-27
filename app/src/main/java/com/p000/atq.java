package com.p000;

import java.io.IOException;

/* renamed from: atq */
public interface atq {

    /* renamed from: atq$a */
    public static final class C0797a extends awz<C0797a> {
        /* renamed from: a */
        public String f4348a;
        /* renamed from: b */
        public Long f4349b;
        /* renamed from: c */
        public String f4350c;
        /* renamed from: d */
        public String f4351d;
        /* renamed from: e */
        public String f4352e;
        /* renamed from: f */
        public Long f4353f;
        /* renamed from: g */
        public Long f4354g;
        /* renamed from: h */
        public String f4355h;
        /* renamed from: i */
        public Long f4356i;
        /* renamed from: j */
        public String f4357j;

        public C0797a() {
            this.f4348a = null;
            this.f4349b = null;
            this.f4350c = null;
            this.f4351d = null;
            this.f4352e = null;
            this.f4353f = null;
            this.f4354g = null;
            this.f4355h = null;
            this.f4356i = null;
            this.f4357j = null;
            this.ah = -1;
        }

        /* renamed from: a */
        protected int mo718a() {
            int a = super.mo718a();
            if (this.f4348a != null) {
                a += awy.m6211b(1, this.f4348a);
            }
            if (this.f4349b != null) {
                a += awy.m6223e(2, this.f4349b.longValue());
            }
            if (this.f4350c != null) {
                a += awy.m6211b(3, this.f4350c);
            }
            if (this.f4351d != null) {
                a += awy.m6211b(4, this.f4351d);
            }
            if (this.f4352e != null) {
                a += awy.m6211b(5, this.f4352e);
            }
            if (this.f4353f != null) {
                a += awy.m6223e(6, this.f4353f.longValue());
            }
            if (this.f4354g != null) {
                a += awy.m6223e(7, this.f4354g.longValue());
            }
            if (this.f4355h != null) {
                a += awy.m6211b(8, this.f4355h);
            }
            if (this.f4356i != null) {
                a += awy.m6223e(9, this.f4356i.longValue());
            }
            return this.f4357j != null ? a + awy.m6211b(10, this.f4357j) : a;
        }

        /* renamed from: a */
        public C0797a m5643a(awx awx) throws IOException {
            while (true) {
                int a = awx.m6177a();
                switch (a) {
                    case 0:
                        break;
                    case 10:
                        this.f4348a = awx.m6191g();
                        continue;
                    case 16:
                        this.f4349b = Long.valueOf(awx.m6185d());
                        continue;
                    case 26:
                        this.f4350c = awx.m6191g();
                        continue;
                    case 34:
                        this.f4351d = awx.m6191g();
                        continue;
                    case 42:
                        this.f4352e = awx.m6191g();
                        continue;
                    case 48:
                        this.f4353f = Long.valueOf(awx.m6185d());
                        continue;
                    case 56:
                        this.f4354g = Long.valueOf(awx.m6185d());
                        continue;
                    case 66:
                        this.f4355h = awx.m6191g();
                        continue;
                    case 72:
                        this.f4356i = Long.valueOf(awx.m6185d());
                        continue;
                    case 82:
                        this.f4357j = awx.m6191g();
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
            if (this.f4348a != null) {
                awy.m6236a(1, this.f4348a);
            }
            if (this.f4349b != null) {
                awy.m6244b(2, this.f4349b.longValue());
            }
            if (this.f4350c != null) {
                awy.m6236a(3, this.f4350c);
            }
            if (this.f4351d != null) {
                awy.m6236a(4, this.f4351d);
            }
            if (this.f4352e != null) {
                awy.m6236a(5, this.f4352e);
            }
            if (this.f4353f != null) {
                awy.m6244b(6, this.f4353f.longValue());
            }
            if (this.f4354g != null) {
                awy.m6244b(7, this.f4354g.longValue());
            }
            if (this.f4355h != null) {
                awy.m6236a(8, this.f4355h);
            }
            if (this.f4356i != null) {
                awy.m6244b(9, this.f4356i.longValue());
            }
            if (this.f4357j != null) {
                awy.m6236a(10, this.f4357j);
            }
            super.mo719a(awy);
        }

        /* renamed from: b */
        public /* synthetic */ axf mo722b(awx awx) throws IOException {
            return m5643a(awx);
        }
    }
}
