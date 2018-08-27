package com.p000;

import defpackage.bvx.AnonymousClass19;
import defpackage.bvx.AnonymousClass29;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URL;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import p000.bub;
import p000.bue;
import p000.buh;
import p000.bui;
import p000.buj;
import p000.buk;
import p000.bun;
import p000.buq;
import p000.bus;
import p000.bve;
import p000.bvx.C1556a;
import p000.bvz;
import p000.bwa;
import p000.bwb;
import p000.bwc;

/* compiled from: TypeAdapters */
/* renamed from: bvx */
public final class bvx {
    /* renamed from: A */
    public static final bus<String> f7903A = new C15548();
    /* renamed from: B */
    public static final bus<BigDecimal> f7904B = new C15559();
    /* renamed from: C */
    public static final bus<BigInteger> f7905C = new bus<BigInteger>() {
        /* renamed from: b */
        public /* synthetic */ Object mo1537b(bwa bwa) throws IOException {
            return m11357a(bwa);
        }

        /* renamed from: a */
        public BigInteger m11357a(bwa bwa) throws IOException {
            if (bwa.mo1554f() == bwb.NULL) {
                bwa.mo1558j();
                return null;
            }
            try {
                return new BigInteger(bwa.mo1556h());
            } catch (Throwable e) {
                throw new buq(e);
            }
        }

        /* renamed from: a */
        public void m11359a(bwc bwc, BigInteger bigInteger) throws IOException {
            bwc.mo1569a((Number) bigInteger);
        }
    };
    /* renamed from: D */
    public static final but f7906D = bvx.m11487a(String.class, f7903A);
    /* renamed from: E */
    public static final bus<StringBuilder> f7907E = new bus<StringBuilder>() {
        /* renamed from: b */
        public /* synthetic */ Object mo1537b(bwa bwa) throws IOException {
            return m11361a(bwa);
        }

        /* renamed from: a */
        public StringBuilder m11361a(bwa bwa) throws IOException {
            if (bwa.mo1554f() != bwb.NULL) {
                return new StringBuilder(bwa.mo1556h());
            }
            bwa.mo1558j();
            return null;
        }

        /* renamed from: a */
        public void m11363a(bwc bwc, StringBuilder stringBuilder) throws IOException {
            bwc.mo1573b(stringBuilder == null ? null : stringBuilder.toString());
        }
    };
    /* renamed from: F */
    public static final but f7908F = bvx.m11487a(StringBuilder.class, f7907E);
    /* renamed from: G */
    public static final bus<StringBuffer> f7909G = new bus<StringBuffer>() {
        /* renamed from: b */
        public /* synthetic */ Object mo1537b(bwa bwa) throws IOException {
            return m11369a(bwa);
        }

        /* renamed from: a */
        public StringBuffer m11369a(bwa bwa) throws IOException {
            if (bwa.mo1554f() != bwb.NULL) {
                return new StringBuffer(bwa.mo1556h());
            }
            bwa.mo1558j();
            return null;
        }

        /* renamed from: a */
        public void m11371a(bwc bwc, StringBuffer stringBuffer) throws IOException {
            bwc.mo1573b(stringBuffer == null ? null : stringBuffer.toString());
        }
    };
    /* renamed from: H */
    public static final but f7910H = bvx.m11487a(StringBuffer.class, f7909G);
    /* renamed from: I */
    public static final bus<URL> f7911I = new bus<URL>() {
        /* renamed from: b */
        public /* synthetic */ Object mo1537b(bwa bwa) throws IOException {
            return m11373a(bwa);
        }

        /* renamed from: a */
        public URL m11373a(bwa bwa) throws IOException {
            if (bwa.mo1554f() == bwb.NULL) {
                bwa.mo1558j();
                return null;
            }
            String h = bwa.mo1556h();
            if ("null".equals(h)) {
                return null;
            }
            return new URL(h);
        }

        /* renamed from: a */
        public void m11375a(bwc bwc, URL url) throws IOException {
            bwc.mo1573b(url == null ? null : url.toExternalForm());
        }
    };
    /* renamed from: J */
    public static final but f7912J = bvx.m11487a(URL.class, f7911I);
    /* renamed from: K */
    public static final bus<URI> f7913K = new bus<URI>() {
        /* renamed from: b */
        public /* synthetic */ Object mo1537b(bwa bwa) throws IOException {
            return m11377a(bwa);
        }

        /* renamed from: a */
        public URI m11377a(bwa bwa) throws IOException {
            URI uri = null;
            if (bwa.mo1554f() == bwb.NULL) {
                bwa.mo1558j();
            } else {
                try {
                    String h = bwa.mo1556h();
                    if (!"null".equals(h)) {
                        uri = new URI(h);
                    }
                } catch (Throwable e) {
                    throw new bui(e);
                }
            }
            return uri;
        }

        /* renamed from: a */
        public void m11379a(bwc bwc, URI uri) throws IOException {
            bwc.mo1573b(uri == null ? null : uri.toASCIIString());
        }
    };
    /* renamed from: L */
    public static final but f7914L = bvx.m11487a(URI.class, f7913K);
    /* renamed from: M */
    public static final bus<InetAddress> f7915M = new bus<InetAddress>() {
        /* renamed from: b */
        public /* synthetic */ Object mo1537b(bwa bwa) throws IOException {
            return m11381a(bwa);
        }

        /* renamed from: a */
        public InetAddress m11381a(bwa bwa) throws IOException {
            if (bwa.mo1554f() != bwb.NULL) {
                return InetAddress.getByName(bwa.mo1556h());
            }
            bwa.mo1558j();
            return null;
        }

        /* renamed from: a */
        public void m11383a(bwc bwc, InetAddress inetAddress) throws IOException {
            bwc.mo1573b(inetAddress == null ? null : inetAddress.getHostAddress());
        }
    };
    /* renamed from: N */
    public static final but f7916N = bvx.m11489b(InetAddress.class, f7915M);
    /* renamed from: O */
    public static final bus<UUID> f7917O = new bus<UUID>() {
        /* renamed from: b */
        public /* synthetic */ Object mo1537b(bwa bwa) throws IOException {
            return m11385a(bwa);
        }

        /* renamed from: a */
        public UUID m11385a(bwa bwa) throws IOException {
            if (bwa.mo1554f() != bwb.NULL) {
                return UUID.fromString(bwa.mo1556h());
            }
            bwa.mo1558j();
            return null;
        }

        /* renamed from: a */
        public void m11387a(bwc bwc, UUID uuid) throws IOException {
            bwc.mo1573b(uuid == null ? null : uuid.toString());
        }
    };
    /* renamed from: P */
    public static final but f7918P = bvx.m11487a(UUID.class, f7917O);
    /* renamed from: Q */
    public static final bus<Currency> f7919Q = new bus<Currency>() {
        /* renamed from: b */
        public /* synthetic */ Object mo1537b(bwa bwa) throws IOException {
            return m11389a(bwa);
        }

        /* renamed from: a */
        public Currency m11389a(bwa bwa) throws IOException {
            return Currency.getInstance(bwa.mo1556h());
        }

        /* renamed from: a */
        public void m11391a(bwc bwc, Currency currency) throws IOException {
            bwc.mo1573b(currency.getCurrencyCode());
        }
    }.m11007a();
    /* renamed from: R */
    public static final but f7920R = bvx.m11487a(Currency.class, f7919Q);
    /* renamed from: S */
    public static final but f7921S = new but() {
        /* renamed from: a */
        public <T> bus<T> mo1546a(bub bub, bvz<T> bvz) {
            if (bvz.m11004a() != Timestamp.class) {
                return null;
            }
            final bus a = bub.m11042a(Date.class);
            return new bus<Timestamp>(this) {
                /* renamed from: b */
                final /* synthetic */ AnonymousClass19 f7885b;

                /* renamed from: b */
                public /* synthetic */ Object mo1537b(bwa bwa) throws IOException {
                    return m11393a(bwa);
                }

                /* renamed from: a */
                public Timestamp m11393a(bwa bwa) throws IOException {
                    Date date = (Date) a.mo1537b(bwa);
                    return date != null ? new Timestamp(date.getTime()) : null;
                }

                /* renamed from: a */
                public void m11395a(bwc bwc, Timestamp timestamp) throws IOException {
                    a.mo1536a(bwc, timestamp);
                }
            };
        }
    };
    /* renamed from: T */
    public static final bus<Calendar> f7922T = new bus<Calendar>() {
        /* renamed from: b */
        public /* synthetic */ Object mo1537b(bwa bwa) throws IOException {
            return m11402a(bwa);
        }

        /* renamed from: a */
        public Calendar m11402a(bwa bwa) throws IOException {
            int i = 0;
            if (bwa.mo1554f() == bwb.NULL) {
                bwa.mo1558j();
                return null;
            }
            bwa.mo1550c();
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            while (bwa.mo1554f() != bwb.END_OBJECT) {
                String g = bwa.mo1555g();
                int m = bwa.mo1561m();
                if ("year".equals(g)) {
                    i6 = m;
                } else if ("month".equals(g)) {
                    i5 = m;
                } else if ("dayOfMonth".equals(g)) {
                    i4 = m;
                } else if ("hourOfDay".equals(g)) {
                    i3 = m;
                } else if ("minute".equals(g)) {
                    i2 = m;
                } else if ("second".equals(g)) {
                    i = m;
                }
            }
            bwa.mo1552d();
            return new GregorianCalendar(i6, i5, i4, i3, i2, i);
        }

        /* renamed from: a */
        public void m11404a(bwc bwc, Calendar calendar) throws IOException {
            if (calendar == null) {
                bwc.mo1578f();
                return;
            }
            bwc.mo1576d();
            bwc.mo1570a("year");
            bwc.mo1567a((long) calendar.get(1));
            bwc.mo1570a("month");
            bwc.mo1567a((long) calendar.get(2));
            bwc.mo1570a("dayOfMonth");
            bwc.mo1567a((long) calendar.get(5));
            bwc.mo1570a("hourOfDay");
            bwc.mo1567a((long) calendar.get(11));
            bwc.mo1570a("minute");
            bwc.mo1567a((long) calendar.get(12));
            bwc.mo1570a("second");
            bwc.mo1567a((long) calendar.get(13));
            bwc.mo1577e();
        }
    };
    /* renamed from: U */
    public static final but f7923U = bvx.m11490b(Calendar.class, GregorianCalendar.class, f7922T);
    /* renamed from: V */
    public static final bus<Locale> f7924V = new bus<Locale>() {
        /* renamed from: b */
        public /* synthetic */ Object mo1537b(bwa bwa) throws IOException {
            return m11406a(bwa);
        }

        /* renamed from: a */
        public Locale m11406a(bwa bwa) throws IOException {
            if (bwa.mo1554f() == bwb.NULL) {
                bwa.mo1558j();
                return null;
            }
            String nextToken;
            String nextToken2;
            String nextToken3;
            StringTokenizer stringTokenizer = new StringTokenizer(bwa.mo1556h(), "_");
            if (stringTokenizer.hasMoreElements()) {
                nextToken = stringTokenizer.nextToken();
            } else {
                nextToken = null;
            }
            if (stringTokenizer.hasMoreElements()) {
                nextToken2 = stringTokenizer.nextToken();
            } else {
                nextToken2 = null;
            }
            if (stringTokenizer.hasMoreElements()) {
                nextToken3 = stringTokenizer.nextToken();
            } else {
                nextToken3 = null;
            }
            if (nextToken2 == null && nextToken3 == null) {
                return new Locale(nextToken);
            }
            if (nextToken3 == null) {
                return new Locale(nextToken, nextToken2);
            }
            return new Locale(nextToken, nextToken2, nextToken3);
        }

        /* renamed from: a */
        public void m11408a(bwc bwc, Locale locale) throws IOException {
            bwc.mo1573b(locale == null ? null : locale.toString());
        }
    };
    /* renamed from: W */
    public static final but f7925W = bvx.m11487a(Locale.class, f7924V);
    /* renamed from: X */
    public static final bus<buh> f7926X = new bus<buh>() {
        /* renamed from: b */
        public /* synthetic */ Object mo1537b(bwa bwa) throws IOException {
            return m11410a(bwa);
        }

        /* renamed from: a */
        public buh m11410a(bwa bwa) throws IOException {
            buh bue;
            switch (bwa.mo1554f()) {
                case NUMBER:
                    return new bun(new bve(bwa.mo1556h()));
                case BOOLEAN:
                    return new bun(Boolean.valueOf(bwa.mo1557i()));
                case STRING:
                    return new bun(bwa.mo1556h());
                case NULL:
                    bwa.mo1558j();
                    return buj.f7702a;
                case BEGIN_ARRAY:
                    bue = new bue();
                    bwa.mo1548a();
                    while (bwa.mo1553e()) {
                        bue.m11078a(m11410a(bwa));
                    }
                    bwa.mo1549b();
                    return bue;
                case BEGIN_OBJECT:
                    bue = new buk();
                    bwa.mo1550c();
                    while (bwa.mo1553e()) {
                        bue.m11086a(bwa.mo1555g(), m11410a(bwa));
                    }
                    bwa.mo1552d();
                    return bue;
                default:
                    throw new IllegalArgumentException();
            }
        }

        /* renamed from: a */
        public void m11411a(bwc bwc, buh buh) throws IOException {
            if (buh == null || buh.m11071k()) {
                bwc.mo1578f();
            } else if (buh.m11070j()) {
                bun n = buh.m11074n();
                if (n.m11103p()) {
                    bwc.mo1569a(n.mo1538b());
                } else if (n.m11095a()) {
                    bwc.mo1571a(n.mo1543g());
                } else {
                    bwc.mo1573b(n.mo1539c());
                }
            } else if (buh.m11068h()) {
                bwc.mo1572b();
                Iterator it = buh.m11073m().iterator();
                while (it.hasNext()) {
                    m11411a(bwc, (buh) it.next());
                }
                bwc.mo1574c();
            } else if (buh.m11069i()) {
                bwc.mo1576d();
                for (Entry entry : buh.m11072l().m11085a()) {
                    bwc.mo1570a((String) entry.getKey());
                    m11411a(bwc, (buh) entry.getValue());
                }
                bwc.mo1577e();
            } else {
                throw new IllegalArgumentException("Couldn't write " + buh.getClass());
            }
        }
    };
    /* renamed from: Y */
    public static final but f7927Y = bvx.m11489b(buh.class, f7926X);
    /* renamed from: Z */
    public static final but f7928Z = new but() {
        /* renamed from: a */
        public <T> bus<T> mo1546a(bub bub, bvz<T> bvz) {
            Class a = bvz.m11004a();
            if (!Enum.class.isAssignableFrom(a) || a == Enum.class) {
                return null;
            }
            if (!a.isEnum()) {
                a = a.getSuperclass();
            }
            return new C1556a(a);
        }
    };
    /* renamed from: a */
    public static final bus<Class> f7929a = new C15461();
    /* renamed from: b */
    public static final but f7930b = bvx.m11487a(Class.class, f7929a);
    /* renamed from: c */
    public static final bus<BitSet> f7931c = new bus<BitSet>() {
        /* renamed from: b */
        public /* synthetic */ Object mo1537b(bwa bwa) throws IOException {
            return m11365a(bwa);
        }

        /* renamed from: a */
        public BitSet m11365a(bwa bwa) throws IOException {
            if (bwa.mo1554f() == bwb.NULL) {
                bwa.mo1558j();
                return null;
            }
            BitSet bitSet = new BitSet();
            bwa.mo1548a();
            bwb f = bwa.mo1554f();
            int i = 0;
            while (f != bwb.END_ARRAY) {
                boolean z;
                switch (f) {
                    case NUMBER:
                        if (bwa.mo1561m() == 0) {
                            z = false;
                            break;
                        }
                        z = true;
                        break;
                    case BOOLEAN:
                        z = bwa.mo1557i();
                        break;
                    case STRING:
                        String h = bwa.mo1556h();
                        try {
                            if (Integer.parseInt(h) == 0) {
                                z = false;
                                break;
                            }
                            z = true;
                            break;
                        } catch (NumberFormatException e) {
                            throw new buq("Error: Expecting: bitset number value (1, 0), Found: " + h);
                        }
                    default:
                        throw new buq("Invalid bitset value type: " + f);
                }
                if (z) {
                    bitSet.set(i);
                }
                i++;
                f = bwa.mo1554f();
            }
            bwa.mo1549b();
            return bitSet;
        }

        /* renamed from: a */
        public void m11367a(bwc bwc, BitSet bitSet) throws IOException {
            if (bitSet == null) {
                bwc.mo1578f();
                return;
            }
            bwc.mo1572b();
            for (int i = 0; i < bitSet.length(); i++) {
                int i2;
                if (bitSet.get(i)) {
                    i2 = 1;
                } else {
                    i2 = 0;
                }
                bwc.mo1567a((long) i2);
            }
            bwc.mo1574c();
        }
    };
    /* renamed from: d */
    public static final but f7932d = bvx.m11487a(BitSet.class, f7931c);
    /* renamed from: e */
    public static final bus<Boolean> f7933e = new bus<Boolean>() {
        /* renamed from: b */
        public /* synthetic */ Object mo1537b(bwa bwa) throws IOException {
            return m11414a(bwa);
        }

        /* renamed from: a */
        public Boolean m11414a(bwa bwa) throws IOException {
            if (bwa.mo1554f() == bwb.NULL) {
                bwa.mo1558j();
                return null;
            } else if (bwa.mo1554f() == bwb.STRING) {
                return Boolean.valueOf(Boolean.parseBoolean(bwa.mo1556h()));
            } else {
                return Boolean.valueOf(bwa.mo1557i());
            }
        }

        /* renamed from: a */
        public void m11415a(bwc bwc, Boolean bool) throws IOException {
            bwc.mo1568a(bool);
        }
    };
    /* renamed from: f */
    public static final bus<Boolean> f7934f = new bus<Boolean>() {
        /* renamed from: b */
        public /* synthetic */ Object mo1537b(bwa bwa) throws IOException {
            return m11430a(bwa);
        }

        /* renamed from: a */
        public Boolean m11430a(bwa bwa) throws IOException {
            if (bwa.mo1554f() != bwb.NULL) {
                return Boolean.valueOf(bwa.mo1556h());
            }
            bwa.mo1558j();
            return null;
        }

        /* renamed from: a */
        public void m11431a(bwc bwc, Boolean bool) throws IOException {
            bwc.mo1573b(bool == null ? "null" : bool.toString());
        }
    };
    /* renamed from: g */
    public static final but f7935g = bvx.m11488a(Boolean.TYPE, Boolean.class, f7933e);
    /* renamed from: h */
    public static final bus<Number> f7936h = new bus<Number>() {
        /* renamed from: b */
        public /* synthetic */ Object mo1537b(bwa bwa) throws IOException {
            return m11434a(bwa);
        }

        /* renamed from: a */
        public Number m11434a(bwa bwa) throws IOException {
            if (bwa.mo1554f() == bwb.NULL) {
                bwa.mo1558j();
                return null;
            }
            try {
                return Byte.valueOf((byte) bwa.mo1561m());
            } catch (Throwable e) {
                throw new buq(e);
            }
        }

        /* renamed from: a */
        public void m11435a(bwc bwc, Number number) throws IOException {
            bwc.mo1569a(number);
        }
    };
    /* renamed from: i */
    public static final but f7937i = bvx.m11488a(Byte.TYPE, Byte.class, f7936h);
    /* renamed from: j */
    public static final bus<Number> f7938j = new bus<Number>() {
        /* renamed from: b */
        public /* synthetic */ Object mo1537b(bwa bwa) throws IOException {
            return m11438a(bwa);
        }

        /* renamed from: a */
        public Number m11438a(bwa bwa) throws IOException {
            if (bwa.mo1554f() == bwb.NULL) {
                bwa.mo1558j();
                return null;
            }
            try {
                return Short.valueOf((short) bwa.mo1561m());
            } catch (Throwable e) {
                throw new buq(e);
            }
        }

        /* renamed from: a */
        public void m11439a(bwc bwc, Number number) throws IOException {
            bwc.mo1569a(number);
        }
    };
    /* renamed from: k */
    public static final but f7939k = bvx.m11488a(Short.TYPE, Short.class, f7938j);
    /* renamed from: l */
    public static final bus<Number> f7940l = new bus<Number>() {
        /* renamed from: b */
        public /* synthetic */ Object mo1537b(bwa bwa) throws IOException {
            return m11442a(bwa);
        }

        /* renamed from: a */
        public Number m11442a(bwa bwa) throws IOException {
            if (bwa.mo1554f() == bwb.NULL) {
                bwa.mo1558j();
                return null;
            }
            try {
                return Integer.valueOf(bwa.mo1561m());
            } catch (Throwable e) {
                throw new buq(e);
            }
        }

        /* renamed from: a */
        public void m11443a(bwc bwc, Number number) throws IOException {
            bwc.mo1569a(number);
        }
    };
    /* renamed from: m */
    public static final but f7941m = bvx.m11488a(Integer.TYPE, Integer.class, f7940l);
    /* renamed from: n */
    public static final bus<AtomicInteger> f7942n = new bus<AtomicInteger>() {
        /* renamed from: b */
        public /* synthetic */ Object mo1537b(bwa bwa) throws IOException {
            return m11446a(bwa);
        }

        /* renamed from: a */
        public AtomicInteger m11446a(bwa bwa) throws IOException {
            try {
                return new AtomicInteger(bwa.mo1561m());
            } catch (Throwable e) {
                throw new buq(e);
            }
        }

        /* renamed from: a */
        public void m11448a(bwc bwc, AtomicInteger atomicInteger) throws IOException {
            bwc.mo1567a((long) atomicInteger.get());
        }
    }.m11007a();
    /* renamed from: o */
    public static final but f7943o = bvx.m11487a(AtomicInteger.class, f7942n);
    /* renamed from: p */
    public static final bus<AtomicBoolean> f7944p = new bus<AtomicBoolean>() {
        /* renamed from: b */
        public /* synthetic */ Object mo1537b(bwa bwa) throws IOException {
            return m11450a(bwa);
        }

        /* renamed from: a */
        public AtomicBoolean m11450a(bwa bwa) throws IOException {
            return new AtomicBoolean(bwa.mo1557i());
        }

        /* renamed from: a */
        public void m11452a(bwc bwc, AtomicBoolean atomicBoolean) throws IOException {
            bwc.mo1571a(atomicBoolean.get());
        }
    }.m11007a();
    /* renamed from: q */
    public static final but f7945q = bvx.m11487a(AtomicBoolean.class, f7944p);
    /* renamed from: r */
    public static final bus<AtomicIntegerArray> f7946r = new C15482().m11007a();
    /* renamed from: s */
    public static final but f7947s = bvx.m11487a(AtomicIntegerArray.class, f7946r);
    /* renamed from: t */
    public static final bus<Number> f7948t = new C15493();
    /* renamed from: u */
    public static final bus<Number> f7949u = new C15504();
    /* renamed from: v */
    public static final bus<Number> f7950v = new C15515();
    /* renamed from: w */
    public static final bus<Number> f7951w = new C15526();
    /* renamed from: x */
    public static final but f7952x = bvx.m11487a(Number.class, f7951w);
    /* renamed from: y */
    public static final bus<Character> f7953y = new C15537();
    /* renamed from: z */
    public static final but f7954z = bvx.m11488a(Character.TYPE, Character.class, f7953y);

    /* compiled from: TypeAdapters */
    /* renamed from: bvx$1 */
    static class C15461 extends bus<Class> {
        C15461() {
        }

        /* renamed from: b */
        public /* synthetic */ Object mo1537b(bwa bwa) throws IOException {
            return m11398a(bwa);
        }

        /* renamed from: a */
        public void m11399a(bwc bwc, Class cls) throws IOException {
            if (cls == null) {
                bwc.mo1578f();
                return;
            }
            throw new UnsupportedOperationException("Attempted to serialize java.lang.Class: " + cls.getName() + ". Forgot to register a type adapter?");
        }

        /* renamed from: a */
        public Class m11398a(bwa bwa) throws IOException {
            if (bwa.mo1554f() == bwb.NULL) {
                bwa.mo1558j();
                return null;
            }
            throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
        }
    }

    /* compiled from: TypeAdapters */
    /* renamed from: bvx$2 */
    static class C15482 extends bus<AtomicIntegerArray> {
        C15482() {
        }

        /* renamed from: b */
        public /* synthetic */ Object mo1537b(bwa bwa) throws IOException {
            return m11426a(bwa);
        }

        /* renamed from: a */
        public AtomicIntegerArray m11426a(bwa bwa) throws IOException {
            List arrayList = new ArrayList();
            bwa.mo1548a();
            while (bwa.mo1553e()) {
                try {
                    arrayList.add(Integer.valueOf(bwa.mo1561m()));
                } catch (Throwable e) {
                    throw new buq(e);
                }
            }
            bwa.mo1549b();
            int size = arrayList.size();
            AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
            for (int i = 0; i < size; i++) {
                atomicIntegerArray.set(i, ((Integer) arrayList.get(i)).intValue());
            }
            return atomicIntegerArray;
        }

        /* renamed from: a */
        public void m11428a(bwc bwc, AtomicIntegerArray atomicIntegerArray) throws IOException {
            bwc.mo1572b();
            int length = atomicIntegerArray.length();
            for (int i = 0; i < length; i++) {
                bwc.mo1567a((long) atomicIntegerArray.get(i));
            }
            bwc.mo1574c();
        }
    }

    /* compiled from: TypeAdapters */
    /* renamed from: bvx$3 */
    static class C15493 extends bus<Number> {
        C15493() {
        }

        /* renamed from: b */
        public /* synthetic */ Object mo1537b(bwa bwa) throws IOException {
            return m11454a(bwa);
        }

        /* renamed from: a */
        public Number m11454a(bwa bwa) throws IOException {
            if (bwa.mo1554f() == bwb.NULL) {
                bwa.mo1558j();
                return null;
            }
            try {
                return Long.valueOf(bwa.mo1560l());
            } catch (Throwable e) {
                throw new buq(e);
            }
        }

        /* renamed from: a */
        public void m11455a(bwc bwc, Number number) throws IOException {
            bwc.mo1569a(number);
        }
    }

    /* compiled from: TypeAdapters */
    /* renamed from: bvx$4 */
    static class C15504 extends bus<Number> {
        C15504() {
        }

        /* renamed from: b */
        public /* synthetic */ Object mo1537b(bwa bwa) throws IOException {
            return m11458a(bwa);
        }

        /* renamed from: a */
        public Number m11458a(bwa bwa) throws IOException {
            if (bwa.mo1554f() != bwb.NULL) {
                return Float.valueOf((float) bwa.mo1559k());
            }
            bwa.mo1558j();
            return null;
        }

        /* renamed from: a */
        public void m11459a(bwc bwc, Number number) throws IOException {
            bwc.mo1569a(number);
        }
    }

    /* compiled from: TypeAdapters */
    /* renamed from: bvx$5 */
    static class C15515 extends bus<Number> {
        C15515() {
        }

        /* renamed from: b */
        public /* synthetic */ Object mo1537b(bwa bwa) throws IOException {
            return m11462a(bwa);
        }

        /* renamed from: a */
        public Number m11462a(bwa bwa) throws IOException {
            if (bwa.mo1554f() != bwb.NULL) {
                return Double.valueOf(bwa.mo1559k());
            }
            bwa.mo1558j();
            return null;
        }

        /* renamed from: a */
        public void m11463a(bwc bwc, Number number) throws IOException {
            bwc.mo1569a(number);
        }
    }

    /* compiled from: TypeAdapters */
    /* renamed from: bvx$6 */
    static class C15526 extends bus<Number> {
        C15526() {
        }

        /* renamed from: b */
        public /* synthetic */ Object mo1537b(bwa bwa) throws IOException {
            return m11466a(bwa);
        }

        /* renamed from: a */
        public Number m11466a(bwa bwa) throws IOException {
            bwb f = bwa.mo1554f();
            switch (f) {
                case NUMBER:
                    return new bve(bwa.mo1556h());
                case NULL:
                    bwa.mo1558j();
                    return null;
                default:
                    throw new buq("Expecting number, got: " + f);
            }
        }

        /* renamed from: a */
        public void m11467a(bwc bwc, Number number) throws IOException {
            bwc.mo1569a(number);
        }
    }

    /* compiled from: TypeAdapters */
    /* renamed from: bvx$7 */
    static class C15537 extends bus<Character> {
        C15537() {
        }

        /* renamed from: b */
        public /* synthetic */ Object mo1537b(bwa bwa) throws IOException {
            return m11470a(bwa);
        }

        /* renamed from: a */
        public Character m11470a(bwa bwa) throws IOException {
            if (bwa.mo1554f() == bwb.NULL) {
                bwa.mo1558j();
                return null;
            }
            String h = bwa.mo1556h();
            if (h.length() == 1) {
                return Character.valueOf(h.charAt(0));
            }
            throw new buq("Expecting character, got: " + h);
        }

        /* renamed from: a */
        public void m11471a(bwc bwc, Character ch) throws IOException {
            bwc.mo1573b(ch == null ? null : String.valueOf(ch));
        }
    }

    /* compiled from: TypeAdapters */
    /* renamed from: bvx$8 */
    static class C15548 extends bus<String> {
        C15548() {
        }

        /* renamed from: b */
        public /* synthetic */ Object mo1537b(bwa bwa) throws IOException {
            return m11474a(bwa);
        }

        /* renamed from: a */
        public String m11474a(bwa bwa) throws IOException {
            bwb f = bwa.mo1554f();
            if (f == bwb.NULL) {
                bwa.mo1558j();
                return null;
            } else if (f == bwb.BOOLEAN) {
                return Boolean.toString(bwa.mo1557i());
            } else {
                return bwa.mo1556h();
            }
        }

        /* renamed from: a */
        public void m11476a(bwc bwc, String str) throws IOException {
            bwc.mo1573b(str);
        }
    }

    /* compiled from: TypeAdapters */
    /* renamed from: bvx$9 */
    static class C15559 extends bus<BigDecimal> {
        C15559() {
        }

        /* renamed from: b */
        public /* synthetic */ Object mo1537b(bwa bwa) throws IOException {
            return m11478a(bwa);
        }

        /* renamed from: a */
        public BigDecimal m11478a(bwa bwa) throws IOException {
            if (bwa.mo1554f() == bwb.NULL) {
                bwa.mo1558j();
                return null;
            }
            try {
                return new BigDecimal(bwa.mo1556h());
            } catch (Throwable e) {
                throw new buq(e);
            }
        }

        /* renamed from: a */
        public void m11480a(bwc bwc, BigDecimal bigDecimal) throws IOException {
            bwc.mo1569a((Number) bigDecimal);
        }
    }

    /* compiled from: TypeAdapters */
    /* renamed from: bvx$a */
    static final class C1556a<T extends Enum<T>> extends bus<T> {
        /* renamed from: a */
        private final Map<String, T> f7901a = new HashMap();
        /* renamed from: b */
        private final Map<T, String> f7902b = new HashMap();

        /* renamed from: b */
        public /* synthetic */ Object mo1537b(bwa bwa) throws IOException {
            return m11482a(bwa);
        }

        public C1556a(Class<T> cls) {
            try {
                for (Enum enumR : (Enum[]) cls.getEnumConstants()) {
                    String name = enumR.name();
                    buw buw = (buw) cls.getField(name).getAnnotation(buw.class);
                    if (buw != null) {
                        name = buw.m11111a();
                        for (Object put : buw.m11112b()) {
                            this.f7901a.put(put, enumR);
                        }
                    }
                    String str = name;
                    this.f7901a.put(str, enumR);
                    this.f7902b.put(enumR, str);
                }
            } catch (NoSuchFieldException e) {
                throw new AssertionError(e);
            }
        }

        /* renamed from: a */
        public T m11482a(bwa bwa) throws IOException {
            if (bwa.mo1554f() != bwb.NULL) {
                return (Enum) this.f7901a.get(bwa.mo1556h());
            }
            bwa.mo1558j();
            return null;
        }

        /* renamed from: a */
        public void m11483a(bwc bwc, T t) throws IOException {
            bwc.mo1573b(t == null ? null : (String) this.f7902b.get(t));
        }
    }

    /* renamed from: a */
    public static <TT> but m11486a(final bvz<TT> bvz, final bus<TT> bus) {
        return new but() {
            /* renamed from: a */
            public <T> bus<T> mo1546a(bub bub, bvz<T> bvz) {
                return bvz.equals(bvz) ? bus : null;
            }
        };
    }

    /* renamed from: a */
    public static <TT> but m11487a(final Class<TT> cls, final bus<TT> bus) {
        return new but() {
            /* renamed from: a */
            public <T> bus<T> mo1546a(bub bub, bvz<T> bvz) {
                return bvz.m11004a() == cls ? bus : null;
            }

            public String toString() {
                return "Factory[type=" + cls.getName() + ",adapter=" + bus + "]";
            }
        };
    }

    /* renamed from: a */
    public static <TT> but m11488a(final Class<TT> cls, final Class<TT> cls2, final bus<? super TT> bus) {
        return new but() {
            /* renamed from: a */
            public <T> bus<T> mo1546a(bub bub, bvz<T> bvz) {
                Class a = bvz.m11004a();
                return (a == cls || a == cls2) ? bus : null;
            }

            public String toString() {
                return "Factory[type=" + cls2.getName() + "+" + cls.getName() + ",adapter=" + bus + "]";
            }
        };
    }

    /* renamed from: b */
    public static <TT> but m11490b(final Class<TT> cls, final Class<? extends TT> cls2, final bus<? super TT> bus) {
        return new but() {
            /* renamed from: a */
            public <T> bus<T> mo1546a(bub bub, bvz<T> bvz) {
                Class a = bvz.m11004a();
                return (a == cls || a == cls2) ? bus : null;
            }

            public String toString() {
                return "Factory[type=" + cls.getName() + "+" + cls2.getName() + ",adapter=" + bus + "]";
            }
        };
    }

    /* renamed from: b */
    public static <T1> but m11489b(final Class<T1> cls, final bus<T1> bus) {
        return new but() {
            /* renamed from: a */
            public <T2> bus<T2> mo1546a(bub bub, bvz<T2> bvz) {
                final Class a = bvz.m11004a();
                if (cls.isAssignableFrom(a)) {
                    return new bus<T1>(this) {
                        /* renamed from: b */
                        final /* synthetic */ AnonymousClass29 f7897b;

                        /* renamed from: a */
                        public void mo1536a(bwc bwc, T1 t1) throws IOException {
                            bus.mo1536a(bwc, t1);
                        }

                        /* renamed from: b */
                        public T1 mo1537b(bwa bwa) throws IOException {
                            T1 b = bus.mo1537b(bwa);
                            if (b == null || a.isInstance(b)) {
                                return b;
                            }
                            throw new buq("Expected a " + a.getName() + " but was " + b.getClass().getName());
                        }
                    };
                }
                return null;
            }

            public String toString() {
                return "Factory[typeHierarchy=" + cls.getName() + ",adapter=" + bus + "]";
            }
        };
    }
}
