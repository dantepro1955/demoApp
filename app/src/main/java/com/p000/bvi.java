package com.p000;

import java.io.IOException;
import java.io.Writer;

/* compiled from: Streams */
/* renamed from: bvi */
public final class bvi {

    /* compiled from: Streams */
    /* renamed from: bvi$a */
    static final class C1524a extends Writer {
        /* renamed from: a */
        private final Appendable f7784a;
        /* renamed from: b */
        private final C1523a f7785b = new C1523a();

        /* compiled from: Streams */
        /* renamed from: bvi$a$a */
        static class C1523a implements CharSequence {
            /* renamed from: a */
            char[] f7783a;

            C1523a() {
            }

            public int length() {
                return this.f7783a.length;
            }

            public char charAt(int i) {
                return this.f7783a[i];
            }

            public CharSequence subSequence(int i, int i2) {
                return new String(this.f7783a, i, i2 - i);
            }
        }

        C1524a(Appendable appendable) {
            this.f7784a = appendable;
        }

        public void write(char[] cArr, int i, int i2) throws IOException {
            this.f7785b.f7783a = cArr;
            this.f7784a.append(this.f7785b, i, i + i2);
        }

        public void write(int i) throws IOException {
            this.f7784a.append((char) i);
        }

        public void flush() {
        }

        public void close() {
        }
    }

    /* renamed from: a */
    public static buh m11188a(bwa bwa) throws bul {
        Object obj = 1;
        try {
            bwa.mo1554f();
            obj = null;
            return (buh) bvx.f7926X.mo1537b(bwa);
        } catch (Throwable e) {
            if (obj != null) {
                return buj.f7702a;
            }
            throw new buq(e);
        } catch (Throwable e2) {
            throw new buq(e2);
        } catch (Throwable e22) {
            throw new bui(e22);
        } catch (Throwable e222) {
            throw new buq(e222);
        }
    }

    /* renamed from: a */
    public static void m11190a(buh buh, bwc bwc) throws IOException {
        bvx.f7926X.mo1536a(bwc, buh);
    }

    /* renamed from: a */
    public static Writer m11189a(Appendable appendable) {
        return appendable instanceof Writer ? (Writer) appendable : new C1524a(appendable);
    }
}
