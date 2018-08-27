package com.p000;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.facebook.stetho.common.Utf8Charset;
import java.util.Collections;
import java.util.Map;
import p000.avg.C0846a;
import p000.bht.C1220a;
import p000.bnt.C1360a;

/* renamed from: bfx */
public abstract class bfx<T> implements Comparable<bfx<T>> {
    /* renamed from: a */
    private final C1360a f4295a;
    /* renamed from: b */
    private final int f4296b;
    /* renamed from: c */
    private final String f4297c;
    /* renamed from: d */
    private final int f4298d;
    /* renamed from: e */
    private final C1220a f4299e;
    /* renamed from: f */
    private Integer f4300f;
    /* renamed from: g */
    private bgy f4301g;
    /* renamed from: h */
    private boolean f4302h;
    /* renamed from: i */
    private boolean f4303i;
    /* renamed from: j */
    private boolean f4304j;
    /* renamed from: k */
    private boolean f4305k;
    /* renamed from: l */
    private bjr f4306l;
    /* renamed from: m */
    private C0846a f4307m;

    /* renamed from: bfx$a */
    public enum C1156a {
        LOW,
        NORMAL,
        HIGH,
        IMMEDIATE
    }

    public bfx(int i, String str, C1220a c1220a) {
        this.f4295a = C1360a.f7174a ? new C1360a() : null;
        this.f4302h = true;
        this.f4303i = false;
        this.f4304j = false;
        this.f4305k = false;
        this.f4307m = null;
        this.f4296b = i;
        this.f4297c = str;
        this.f4299e = c1220a;
        m5539a(new azg());
        this.f4298d = bfx.mo713a(str);
    }

    /* renamed from: a */
    private static int mo713a(String str) {
        if (!TextUtils.isEmpty(str)) {
            Uri parse = Uri.parse(str);
            if (parse != null) {
                String host = parse.getHost();
                if (host != null) {
                    return host.hashCode();
                }
            }
        }
        return 0;
    }

    /* renamed from: a */
    public int m5534a() {
        return this.f4296b;
    }

    /* renamed from: a */
    public int m5535a(bfx<T> bfx) {
        C1156a m = m5557m();
        C1156a m2 = bfx.m5557m();
        return m == m2 ? this.f4300f.intValue() - bfx.f4300f.intValue() : m2.ordinal() - m.ordinal();
    }

    /* renamed from: a */
    public final bfx<?> m5536a(int i) {
        this.f4300f = Integer.valueOf(i);
        return this;
    }

    /* renamed from: a */
    public bfx<?> m5537a(C0846a c0846a) {
        this.f4307m = c0846a;
        return this;
    }

    /* renamed from: a */
    public bfx<?> m5538a(bgy bgy) {
        this.f4301g = bgy;
        return this;
    }

    /* renamed from: a */
    public bfx<?> m5539a(bjr bjr) {
        this.f4306l = bjr;
        return this;
    }

    /* renamed from: a */
    protected abstract bht<T> mo711a(bdv bdv);

    /* renamed from: a */
    protected bmt m5541a(bmt bmt) {
        return bmt;
    }

    /* renamed from: a */
    protected abstract void mo712a(T t);

    /* renamed from: b */
    public int m5543b() {
        return this.f4298d;
    }

    /* renamed from: b */
    public void m5544b(bmt bmt) {
        if (this.f4299e != null) {
            this.f4299e.mo1282a(bmt);
        }
    }

    /* renamed from: b */
    public void m5545b(String str) {
        if (C1360a.f7174a) {
            this.f4295a.m10018a(str, Thread.currentThread().getId());
        }
    }

    /* renamed from: c */
    public String m5546c() {
        return this.f4297c;
    }

    /* renamed from: c */
    void m5547c(final String str) {
        if (this.f4301g != null) {
            this.f4301g.m8420b(this);
        }
        if (C1360a.f7174a) {
            final long id = Thread.currentThread().getId();
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new Runnable(this) {
                    /* renamed from: c */
                    final /* synthetic */ bfx f6037c;

                    public void run() {
                        this.f6037c.f4295a.m10018a(str, id);
                        this.f6037c.f4295a.m10017a(toString());
                    }
                });
                return;
            }
            this.f4295a.m10018a(str, id);
            this.f4295a.m10017a(toString());
        }
    }

    public /* synthetic */ int compareTo(Object obj) {
        return m5535a((bfx) obj);
    }

    /* renamed from: d */
    public String m5548d() {
        return m5546c();
    }

    /* renamed from: e */
    public C0846a m5549e() {
        return this.f4307m;
    }

    /* renamed from: f */
    public Map<String, String> mo1283f() throws ard {
        return Collections.emptyMap();
    }

    @Deprecated
    /* renamed from: g */
    public String m5551g() {
        return m5554j();
    }

    @Deprecated
    /* renamed from: h */
    public byte[] m5552h() throws ard {
        return null;
    }

    /* renamed from: i */
    protected String m5553i() {
        return Utf8Charset.NAME;
    }

    /* renamed from: j */
    public String m5554j() {
        return "application/x-www-form-urlencoded; charset=" + m5553i();
    }

    /* renamed from: k */
    public byte[] mo1284k() throws ard {
        return null;
    }

    /* renamed from: l */
    public final boolean m5556l() {
        return this.f4302h;
    }

    /* renamed from: m */
    public C1156a m5557m() {
        return C1156a.NORMAL;
    }

    /* renamed from: n */
    public final int m5558n() {
        return this.f4306l.mo864a();
    }

    /* renamed from: o */
    public bjr m5559o() {
        return this.f4306l;
    }

    /* renamed from: p */
    public void m5560p() {
        this.f4304j = true;
    }

    /* renamed from: q */
    public boolean m5561q() {
        return this.f4304j;
    }

    public String toString() {
        return "[ ] " + m5546c() + " " + ("0x" + Integer.toHexString(m5543b())) + " " + m5557m() + " " + this.f4300f;
    }
}
