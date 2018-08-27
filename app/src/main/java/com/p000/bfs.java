package com.p000;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import java.util.Map;
import p000.bfr.C1153a;

@bhd
/* renamed from: bfs */
public class bfs extends bft implements bcy {
    /* renamed from: a */
    DisplayMetrics f6021a;
    /* renamed from: b */
    int f6022b = -1;
    /* renamed from: c */
    int f6023c = -1;
    /* renamed from: d */
    int f6024d = -1;
    /* renamed from: e */
    int f6025e = -1;
    /* renamed from: f */
    int f6026f = -1;
    /* renamed from: g */
    int f6027g = -1;
    /* renamed from: h */
    private final blo f6028h;
    /* renamed from: i */
    private final Context f6029i;
    /* renamed from: j */
    private final WindowManager f6030j;
    /* renamed from: k */
    private final bas f6031k;
    /* renamed from: l */
    private float f6032l;
    /* renamed from: m */
    private int f6033m;

    public bfs(blo blo, Context context, bas bas) {
        super(blo);
        this.f6028h = blo;
        this.f6029i = context;
        this.f6031k = bas;
        this.f6030j = (WindowManager) context.getSystemService("window");
    }

    /* renamed from: g */
    private void m8195g() {
        this.f6021a = new DisplayMetrics();
        Display defaultDisplay = this.f6030j.getDefaultDisplay();
        defaultDisplay.getMetrics(this.f6021a);
        this.f6032l = this.f6021a.density;
        this.f6033m = defaultDisplay.getRotation();
    }

    /* renamed from: h */
    private void m8196h() {
        int[] iArr = new int[2];
        this.f6028h.getLocationOnScreen(iArr);
        m8199a(azp.m6789a().m9295b(this.f6029i, iArr[0]), azp.m6789a().m9295b(this.f6029i, iArr[1]));
    }

    /* renamed from: i */
    private bfr m8197i() {
        return new C1153a().m8190b(this.f6031k.m7046a()).m8188a(this.f6031k.m7048b()).m8191c(this.f6031k.m7050e()).m8192d(this.f6031k.m7049c()).m8193e(true).m8189a();
    }

    /* renamed from: a */
    void m8198a() {
        this.f6022b = azp.m6789a().m9296b(this.f6021a, this.f6021a.widthPixels);
        this.f6023c = azp.m6789a().m9296b(this.f6021a, this.f6021a.heightPixels);
        Activity f = this.f6028h.mo1316f();
        if (f == null || f.getWindow() == null) {
            this.f6024d = this.f6022b;
            this.f6025e = this.f6023c;
            return;
        }
        int[] a = ako.m2343e().m9116a(f);
        this.f6024d = azp.m6789a().m9296b(this.f6021a, a[0]);
        this.f6025e = azp.m6789a().m9296b(this.f6021a, a[1]);
    }

    /* renamed from: a */
    public void m8199a(int i, int i2) {
        int i3 = this.f6029i instanceof Activity ? ako.m2343e().m9133d((Activity) this.f6029i)[0] : 0;
        if (this.f6028h.mo1321k() == null || !this.f6028h.mo1321k().f14934d) {
            this.f6026f = azp.m6789a().m9295b(this.f6029i, this.f6028h.getMeasuredWidth());
            this.f6027g = azp.m6789a().m9295b(this.f6029i, this.f6028h.getMeasuredHeight());
        }
        m8157b(i, i2 - i3, this.f6026f, this.f6027g);
        this.f6028h.mo1322l().m9407a(i, i2);
    }

    /* renamed from: a */
    public void mo277a(blo blo, Map<String, String> map) {
        m8202c();
    }

    /* renamed from: b */
    void m8201b() {
        if (this.f6028h.mo1321k().f14934d) {
            this.f6026f = this.f6022b;
            this.f6027g = this.f6023c;
            return;
        }
        this.f6028h.measure(0, 0);
    }

    /* renamed from: c */
    public void m8202c() {
        m8195g();
        m8198a();
        m8201b();
        m8204e();
        m8205f();
        m8196h();
        m8203d();
    }

    /* renamed from: d */
    void m8203d() {
        if (bky.m9005a(2)) {
            bky.m9010d("Dispatching Ready Event.");
        }
        m8159c(this.f6028h.mo1328o().f15121a);
    }

    /* renamed from: e */
    void m8204e() {
        m8156a(this.f6022b, this.f6023c, this.f6024d, this.f6025e, this.f6032l, this.f6033m);
    }

    /* renamed from: f */
    void m8205f() {
        this.f6028h.mo1029b("onDeviceFeaturesReceived", m8197i().m8194a());
    }
}
