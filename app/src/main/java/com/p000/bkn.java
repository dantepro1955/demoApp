package com.p000;

import android.content.Context;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Map;
import java.util.concurrent.Callable;
import p000.bht.C1220a;
import p000.bht.C1221b;

@bhd
/* renamed from: bkn */
public class bkn {
    /* renamed from: a */
    public static final C1184a<Void> f6770a = new C13041();
    /* renamed from: b */
    private static bgy f6771b;
    /* renamed from: c */
    private static final Object f6772c = new Object();

    /* renamed from: bkn$a */
    public interface C1184a<T> {
        /* renamed from: b */
        T mo1183b();

        /* renamed from: b */
        T mo1184b(InputStream inputStream);
    }

    /* renamed from: bkn$1 */
    class C13041 implements C1184a<Void> {
        C13041() {
        }

        /* renamed from: b */
        public /* bridge */ /* synthetic */ Object mo1183b() {
            return null;
        }

        /* renamed from: b */
        public /* bridge */ /* synthetic */ Object mo1184b(InputStream inputStream) {
            return null;
        }
    }

    /* renamed from: bkn$b */
    static class C1310b<T> extends bfx<InputStream> {
        /* renamed from: a */
        private final C1184a<T> f6768a;
        /* renamed from: b */
        private final C1221b<T> f6769b;

        /* renamed from: bkn$b$1 */
        class C13071 implements C1220a {
            /* renamed from: a */
            final /* synthetic */ C1221b f6762a;
            /* renamed from: b */
            final /* synthetic */ C1184a f6763b;

            C13071(C1221b c1221b, C1184a c1184a) {
                this.f6762a = c1221b;
                this.f6763b = c1184a;
            }

            /* renamed from: a */
            public void mo1282a(bmt bmt) {
                this.f6762a.mo1285a(this.f6763b.mo1183b());
            }
        }

        public C1310b(String str, C1184a<T> c1184a, C1221b<T> c1221b) {
            super(0, str, new C13071(c1221b, c1184a));
            this.f6768a = c1184a;
            this.f6769b = c1221b;
        }

        /* renamed from: a */
        protected bht<InputStream> mo711a(bdv bdv) {
            return bht.m8539a(new ByteArrayInputStream(bdv.f5708b), bpd.m10256a(bdv));
        }

        /* renamed from: a */
        protected void m9249a(final InputStream inputStream) {
            final ble a = bkf.m9060a(new Callable<T>(this) {
                /* renamed from: b */
                final /* synthetic */ C1310b f6765b;

                public T call() {
                    return this.f6765b.f6768a.mo1184b(inputStream);
                }
            });
            a.mo1018b(new Runnable(this) {
                /* renamed from: b */
                final /* synthetic */ C1310b f6767b;

                public void run() {
                    try {
                        this.f6767b.f6769b.mo1285a(a.get());
                    } catch (Throwable e) {
                        bky.m9007b("Error occured while dispatching http response in getter.", e);
                        ako.m2347i().m8934a(e, "HttpGetter.deliverResponse.1");
                    }
                }
            });
        }

        /* renamed from: a */
        protected /* synthetic */ void mo712a(Object obj) {
            m9249a((InputStream) obj);
        }
    }

    /* renamed from: bkn$c */
    class C1311c<T> extends blb<T> implements C1221b<T> {
        private C1311c(bkn bkn) {
        }

        /* renamed from: a */
        public void mo1285a(T t) {
            super.m7770b((Object) t);
        }
    }

    public bkn(Context context) {
        bkn.m9252a(context);
    }

    /* renamed from: a */
    private static bgy m9252a(Context context) {
        bgy bgy;
        synchronized (f6772c) {
            if (f6771b == null) {
                f6771b = ati.m5601a(context.getApplicationContext());
            }
            bgy = f6771b;
        }
        return bgy;
    }

    /* renamed from: a */
    public ble<String> m9253a(int i, final String str, Map<String, String> map, byte[] bArr) {
        final Object c1311c = new C1311c();
        final byte[] bArr2 = bArr;
        final Map<String, String> map2 = map;
        f6771b.m8417a(new asx(this, i, str, c1311c, new C1220a(this) {
            /* renamed from: a */
            public void mo1282a(bmt bmt) {
                String str = str;
                String valueOf = String.valueOf(bmt.toString());
                bky.m9011e(new StringBuilder((String.valueOf(str).length() + 21) + String.valueOf(valueOf).length()).append("Failed to load URL: ").append(str).append("\n").append(valueOf).toString());
                c1311c.mo1285a(null);
            }
        }) {
            /* renamed from: f */
            public Map<String, String> mo1283f() throws ard {
                return map2 == null ? super.mo1283f() : map2;
            }

            /* renamed from: k */
            public byte[] mo1284k() throws ard {
                return bArr2 == null ? super.mo1284k() : bArr2;
            }
        });
        return c1311c;
    }

    /* renamed from: a */
    public <T> ble<T> m9254a(String str, C1184a<T> c1184a) {
        Object c1311c = new C1311c();
        f6771b.m8417a(new C1310b(str, c1184a, c1311c));
        return c1311c;
    }

    /* renamed from: a */
    public ble<String> m9255a(String str, Map<String, String> map) {
        return m9253a(0, str, map, null);
    }
}
