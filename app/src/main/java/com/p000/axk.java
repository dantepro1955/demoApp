package com.p000;

import com.facebook.stetho.common.Utf8Charset;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import p000.ave.C0845a;

/* renamed from: axk */
public class axk {
    /* renamed from: a */
    protected static final String f4889a = axk.class.getSimpleName();
    /* renamed from: b */
    private final avx f4890b;
    /* renamed from: c */
    private final String f4891c;
    /* renamed from: d */
    private final String f4892d;
    /* renamed from: e */
    private final int f4893e = 2;
    /* renamed from: f */
    private volatile Method f4894f = null;
    /* renamed from: g */
    private List<Class> f4895g;
    /* renamed from: h */
    private CountDownLatch f4896h = new CountDownLatch(1);

    /* renamed from: axk$1 */
    class C08711 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ axk f4888a;

        C08711(axk axk) {
            this.f4888a = axk;
        }

        public void run() {
            this.f4888a.m6364b();
        }
    }

    public axk(avx avx, String str, String str2, List<Class> list) {
        this.f4890b = avx;
        this.f4891c = str;
        this.f4892d = str2;
        this.f4895g = new ArrayList(list);
        this.f4890b.m6097c().submit(new C08711(this));
    }

    /* renamed from: a */
    private String m6362a(byte[] bArr, String str) throws C0845a, UnsupportedEncodingException {
        return new String(this.f4890b.m6099e().m5942a(bArr, str), Utf8Charset.NAME);
    }

    /* renamed from: b */
    private void m6364b() {
        try {
            Class loadClass = this.f4890b.m6098d().loadClass(m6362a(this.f4890b.m6100f(), this.f4891c));
            if (loadClass != null) {
                this.f4894f = loadClass.getMethod(m6362a(this.f4890b.m6100f(), this.f4892d), (Class[]) this.f4895g.toArray(new Class[this.f4895g.size()]));
                if (this.f4894f == null) {
                    this.f4896h.countDown();
                } else {
                    this.f4896h.countDown();
                }
            }
        } catch (C0845a e) {
        } catch (UnsupportedEncodingException e2) {
        } catch (ClassNotFoundException e3) {
        } catch (NoSuchMethodException e4) {
        } catch (NullPointerException e5) {
        } finally {
            this.f4896h.countDown();
        }
    }

    /* renamed from: a */
    public Method m6365a() {
        if (this.f4894f != null) {
            return this.f4894f;
        }
        try {
            return this.f4896h.await(2, TimeUnit.SECONDS) ? this.f4894f : null;
        } catch (InterruptedException e) {
            return null;
        }
    }
}
