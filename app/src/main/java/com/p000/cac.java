package com.p000;

import android.content.Context;
import android.os.Build;
import android.os.Build.VERSION;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.facebook.common.util.ByteConstants;
import com.ninegag.android.app.GagApplication;
import com.ninegag.android.app.ui.BaseActivity;

/* compiled from: AppRuntime */
/* renamed from: cac */
public class cac {
    /* renamed from: r */
    private static cac f8399r = new cac();
    /* renamed from: s */
    private static caf f8400s = caf.m12046a();
    /* renamed from: A */
    private int f8401A;
    /* renamed from: B */
    private Object f8402B = new Object();
    /* renamed from: C */
    private int f8403C = 0;
    /* renamed from: a */
    public String f8404a;
    /* renamed from: b */
    public int f8405b;
    /* renamed from: c */
    public int f8406c;
    /* renamed from: d */
    public int f8407d;
    /* renamed from: e */
    public int f8408e;
    /* renamed from: f */
    public final int f8409f = 1;
    /* renamed from: g */
    public String f8410g;
    /* renamed from: h */
    public String f8411h;
    /* renamed from: i */
    public String f8412i;
    /* renamed from: j */
    public boolean f8413j;
    /* renamed from: k */
    public boolean f8414k;
    /* renamed from: l */
    public long f8415l;
    /* renamed from: m */
    public long f8416m;
    /* renamed from: n */
    public int f8417n;
    /* renamed from: o */
    public int f8418o;
    /* renamed from: p */
    public int f8419p;
    /* renamed from: q */
    public int f8420q;
    /* renamed from: t */
    private int f8421t = 0;
    /* renamed from: u */
    private int f8422u = -1;
    /* renamed from: v */
    private int f8423v = -1;
    /* renamed from: w */
    private boolean f8424w;
    /* renamed from: x */
    private String f8425x;
    /* renamed from: y */
    private long f8426y;
    /* renamed from: z */
    private String f8427z;

    /* renamed from: a */
    public static cac m12016a() {
        return f8399r;
    }

    private cac() {
    }

    /* renamed from: a */
    public void m12020a(Context context) {
        this.f8425x = null;
        this.f8424w = false;
        m12023b(context);
        if (djy.b(context)) {
            this.f8404a = "android.tablet";
        } else {
            this.f8404a = "android";
        }
        this.f8411h = Build.MANUFACTURER + " " + Build.MODEL;
        this.f8412i = VERSION.RELEASE;
        this.f8410g = m12017n();
        this.f8413j = cpx.a(Build.MANUFACTURER, Build.MODEL);
        if (VERSION.SDK_INT >= 14) {
            this.f8414k = true;
        } else {
            this.f8414k = false;
        }
        this.f8415l = Runtime.getRuntime().maxMemory() / 1024;
        this.f8416m = this.f8415l / 1024;
        if (this.f8416m > 64) {
            this.f8417n = (int) (this.f8415l / 6);
            this.f8420q = 700;
            this.f8419p = 800;
        } else {
            this.f8417n = (int) (this.f8415l / 8);
            this.f8420q = 700;
            this.f8419p = 400;
        }
        this.f8418o = ((this.f8417n * ByteConstants.KB) / this.f8420q) / this.f8419p;
        m12018o();
    }

    /* renamed from: b */
    public void m12023b(Context context) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
        this.f8405b = displayMetrics.widthPixels;
        this.f8406c = displayMetrics.heightPixels;
        this.f8407d = Math.min(this.f8405b, this.f8406c);
        if (this.f8407d >= 600) {
            this.f8408e = 700;
        } else {
            this.f8408e = 460;
        }
    }

    /* renamed from: n */
    private String m12017n() {
        return String.format("9GAG/%s (%s;%s %s)", new Object[]{Integer.valueOf(GagApplication.f16515c), this.f8411h, "Android", this.f8412i});
    }

    /* renamed from: b */
    public int m12022b() {
        if (this.f8423v == -1) {
            this.f8423v = m12024c() * this.f8419p;
        }
        return this.f8423v;
    }

    /* renamed from: c */
    public int m12024c() {
        if (this.f8422u == -1) {
            this.f8422u = (int) ((((Runtime.getRuntime().maxMemory() / 4) / 4) / ((long) this.f8420q)) / ((long) this.f8419p));
        }
        return this.f8422u;
    }

    /* renamed from: d */
    public int m12025d() {
        return 0;
    }

    /* renamed from: e */
    public boolean m12026e() {
        return this.f8421t == 1;
    }

    /* renamed from: f */
    public boolean m12027f() {
        return this.f8424w;
    }

    /* renamed from: g */
    public String m12028g() {
        return this.f8425x;
    }

    /* renamed from: a */
    public void m12021a(String str) {
        this.f8425x = str;
        this.f8424w = true;
    }

    /* renamed from: o */
    private void m12018o() {
        if (this.f8421t == 0) {
            this.f8421t = cqv.a() ? 1 : -1;
        }
    }

    /* renamed from: h */
    public int m12029h() {
        int i;
        synchronized (this.f8402B) {
            i = this.f8401A;
            this.f8401A = i + 1;
        }
        return i;
    }

    /* renamed from: i */
    public boolean m12030i() {
        return f8400s.m12087q().m14406q() && f8400s.m12077h().ay();
    }

    /* renamed from: j */
    public boolean m12031j() {
        return !f8400s.m12077h().aI() && f8400s.m12087q().m14408r();
    }

    /* renamed from: k */
    public long m12032k() {
        return this.f8426y;
    }

    /* renamed from: l */
    public String m12033l() {
        return this.f8427z;
    }

    /* renamed from: a */
    public void m12019a(long j, String str) {
        this.f8426y = j;
        this.f8427z = str;
    }

    /* renamed from: m */
    public boolean m12034m() {
        return BaseActivity.getVisibleActivityCount() > 0;
    }
}
