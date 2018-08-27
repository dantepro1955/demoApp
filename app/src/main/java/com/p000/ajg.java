package com.p000;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.TextureView;
import com.google.android.gms.ads.internal.overlay.zzj;
import com.google.android.gms.internal.zzqh;
import java.util.concurrent.TimeUnit;
import p000.bkm.C1302a;
import p000.bkm.C1303b;

@bhd
/* renamed from: ajg */
public class ajg {
    /* renamed from: a */
    private final Context f1657a;
    /* renamed from: b */
    private final String f1658b;
    /* renamed from: c */
    private final zzqh f1659c;
    /* renamed from: d */
    private final bbh f1660d;
    /* renamed from: e */
    private final bbj f1661e;
    /* renamed from: f */
    private final bkm f1662f = new C1303b().m9235a("min_1", Double.MIN_VALUE, 1.0d).m9235a("1_5", 1.0d, 5.0d).m9235a("5_10", 5.0d, 10.0d).m9235a("10_20", 10.0d, 20.0d).m9235a("20_30", 20.0d, 30.0d).m9235a("30_max", 30.0d, Double.MAX_VALUE).m9236a();
    /* renamed from: g */
    private final long[] f1663g;
    /* renamed from: h */
    private final String[] f1664h;
    /* renamed from: i */
    private boolean f1665i = false;
    /* renamed from: j */
    private boolean f1666j = false;
    /* renamed from: k */
    private boolean f1667k = false;
    /* renamed from: l */
    private boolean f1668l = false;
    /* renamed from: m */
    private boolean f1669m;
    /* renamed from: n */
    private zzj f1670n;
    /* renamed from: o */
    private boolean f1671o;
    /* renamed from: p */
    private boolean f1672p;
    /* renamed from: q */
    private long f1673q = -1;

    public ajg(Context context, zzqh zzqh, String str, bbj bbj, bbh bbh) {
        this.f1657a = context;
        this.f1659c = zzqh;
        this.f1658b = str;
        this.f1661e = bbj;
        this.f1660d = bbh;
        String str2 = (String) bbb.f5419y.m7064c();
        if (str2 == null) {
            this.f1664h = new String[0];
            this.f1663g = new long[0];
            return;
        }
        String[] split = TextUtils.split(str2, ",");
        this.f1664h = new String[split.length];
        this.f1663g = new long[split.length];
        for (int i = 0; i < split.length; i++) {
            try {
                this.f1663g[i] = Long.parseLong(split[i]);
            } catch (Throwable e) {
                bky.m9009c("Unable to parse frame hash target time number.", e);
                this.f1663g[i] = -1;
            }
        }
    }

    /* renamed from: c */
    private void m1841c(zzj zzj) {
        long longValue = ((Long) bbb.f5420z.m7064c()).longValue();
        long currentPosition = (long) zzj.getCurrentPosition();
        int i = 0;
        while (i < this.f1664h.length) {
            if (this.f1664h[i] == null && longValue > Math.abs(currentPosition - this.f1663g[i])) {
                this.f1664h[i] = m1843a((TextureView) zzj);
                return;
            }
            i++;
        }
    }

    /* renamed from: e */
    private void m1842e() {
        if (this.f1667k && !this.f1668l) {
            bbf.m7148a(this.f1661e, this.f1660d, "vff2");
            this.f1668l = true;
        }
        long c = ako.m2349k().mo608c();
        if (this.f1669m && this.f1672p && this.f1673q != -1) {
            this.f1662f.m9239a(((double) TimeUnit.SECONDS.toNanos(1)) / ((double) (c - this.f1673q)));
        }
        this.f1672p = this.f1669m;
        this.f1673q = c;
    }

    @TargetApi(14)
    /* renamed from: a */
    String m1843a(TextureView textureView) {
        Bitmap bitmap = textureView.getBitmap(8, 8);
        long j = 0;
        long j2 = 63;
        int i = 0;
        while (i < 8) {
            long j3 = j;
            j = j2;
            for (int i2 = 0; i2 < 8; i2++) {
                int pixel = bitmap.getPixel(i2, i);
                j3 |= (Color.green(pixel) + (Color.blue(pixel) + Color.red(pixel)) > 128 ? 1 : 0) << ((int) j);
                j--;
            }
            i++;
            j2 = j;
            j = j3;
        }
        return String.format("%016X", new Object[]{Long.valueOf(j)});
    }

    /* renamed from: a */
    public void m1844a() {
        if (this.f1665i && !this.f1666j) {
            bbf.m7148a(this.f1661e, this.f1660d, "vfr2");
            this.f1666j = true;
        }
    }

    /* renamed from: a */
    public void m1845a(zzj zzj) {
        bbf.m7148a(this.f1661e, this.f1660d, "vpc2");
        this.f1665i = true;
        if (this.f1661e != null) {
            this.f1661e.m7165a("vpn", zzj.mo3097b());
        }
        this.f1670n = zzj;
    }

    /* renamed from: b */
    public void m1846b() {
        if (((Boolean) bbb.f5418x.m7064c()).booleanValue() && !this.f1671o) {
            String valueOf;
            String valueOf2;
            Bundle bundle = new Bundle();
            bundle.putString("type", "native-player-metrics");
            bundle.putString("request", this.f1658b);
            bundle.putString("player", this.f1670n.mo3097b());
            for (C1302a c1302a : this.f1662f.m9238a()) {
                valueOf = String.valueOf("fps_c_");
                valueOf2 = String.valueOf(c1302a.f6745a);
                bundle.putString(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf), Integer.toString(c1302a.f6749e));
                valueOf = String.valueOf("fps_p_");
                valueOf2 = String.valueOf(c1302a.f6745a);
                bundle.putString(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf), Double.toString(c1302a.f6748d));
            }
            for (int i = 0; i < this.f1663g.length; i++) {
                valueOf2 = this.f1664h[i];
                if (valueOf2 != null) {
                    String valueOf3 = String.valueOf("fh_");
                    valueOf = String.valueOf(Long.valueOf(this.f1663g[i]));
                    bundle.putString(new StringBuilder(String.valueOf(valueOf3).length() + String.valueOf(valueOf).length()).append(valueOf3).append(valueOf).toString(), valueOf2);
                }
            }
            ako.m2343e().m9101a(this.f1657a, this.f1659c.f15121a, "gmob-apps", bundle, true);
            this.f1671o = true;
        }
    }

    /* renamed from: b */
    public void m1847b(zzj zzj) {
        m1842e();
        m1841c(zzj);
    }

    /* renamed from: c */
    public void m1848c() {
        this.f1669m = true;
        if (this.f1666j && !this.f1667k) {
            bbf.m7148a(this.f1661e, this.f1660d, "vfp2");
            this.f1667k = true;
        }
    }

    /* renamed from: d */
    public void m1849d() {
        this.f1669m = false;
    }
}
