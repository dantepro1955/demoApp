package com.p000;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.text.TextUtils;
import android.util.Pair;
import com.facebook.common.time.Clock;
import java.util.UUID;

/* renamed from: boa */
public class boa extends bmu {
    /* renamed from: a */
    private SharedPreferences f7224a;
    /* renamed from: b */
    private long f7225b;
    /* renamed from: c */
    private long f7226c = -1;
    /* renamed from: d */
    private final C1368a f7227d = new C1368a("monitoring", zznT().m9935D());

    /* renamed from: boa$a */
    public final class C1368a {
        /* renamed from: a */
        final /* synthetic */ boa f7221a;
        /* renamed from: b */
        private final String f7222b;
        /* renamed from: c */
        private final long f7223c;

        private C1368a(boa boa, String str, long j) {
            this.f7221a = boa;
            aoi.m4681a(str);
            aoi.m4688b(j > 0);
            this.f7222b = str;
            this.f7223c = j;
        }

        /* renamed from: c */
        private void m10084c() {
            long a = this.f7221a.zznR().mo606a();
            Editor edit = this.f7221a.f7224a.edit();
            edit.remove(m10088g());
            edit.remove(m10091b());
            edit.putLong(m10087f(), a);
            edit.commit();
        }

        /* renamed from: d */
        private long m10085d() {
            long e = m10086e();
            return e == 0 ? 0 : Math.abs(e - this.f7221a.zznR().mo606a());
        }

        /* renamed from: e */
        private long m10086e() {
            return this.f7221a.f7224a.getLong(m10087f(), 0);
        }

        /* renamed from: f */
        private String m10087f() {
            return String.valueOf(this.f7222b).concat(":start");
        }

        /* renamed from: g */
        private String m10088g() {
            return String.valueOf(this.f7222b).concat(":count");
        }

        /* renamed from: a */
        public Pair<String, Long> m10089a() {
            long d = m10085d();
            if (d < this.f7223c) {
                return null;
            }
            if (d > this.f7223c * 2) {
                m10084c();
                return null;
            }
            String string = this.f7221a.f7224a.getString(m10091b(), null);
            d = this.f7221a.f7224a.getLong(m10088g(), 0);
            m10084c();
            return (string == null || d <= 0) ? null : new Pair(string, Long.valueOf(d));
        }

        /* renamed from: a */
        public void m10090a(String str) {
            if (m10086e() == 0) {
                m10084c();
            }
            if (str == null) {
                str = "";
            }
            synchronized (this) {
                long j = this.f7221a.f7224a.getLong(m10088g(), 0);
                if (j <= 0) {
                    Editor edit = this.f7221a.f7224a.edit();
                    edit.putString(m10091b(), str);
                    edit.putLong(m10088g(), 1);
                    edit.apply();
                    return;
                }
                Object obj = (UUID.randomUUID().getLeastSignificantBits() & Clock.MAX_TIME) < Clock.MAX_TIME / (j + 1) ? 1 : null;
                Editor edit2 = this.f7221a.f7224a.edit();
                if (obj != null) {
                    edit2.putString(m10091b(), str);
                }
                edit2.putLong(m10088g(), j + 1);
                edit2.apply();
            }
        }

        /* renamed from: b */
        protected String m10091b() {
            return String.valueOf(this.f7222b).concat(":value");
        }
    }

    protected boa(bmw bmw) {
        super(bmw);
    }

    /* renamed from: a */
    public long m10093a() {
        zzmR();
        zzob();
        if (this.f7225b == 0) {
            long j = this.f7224a.getLong("first_run", 0);
            if (j != 0) {
                this.f7225b = j;
            } else {
                j = zznR().mo606a();
                Editor edit = this.f7224a.edit();
                edit.putLong("first_run", j);
                if (!edit.commit()) {
                    zzbS("Failed to commit first run time");
                }
                this.f7225b = j;
            }
        }
        return this.f7225b;
    }

    /* renamed from: a */
    public void m10094a(String str) {
        zzmR();
        zzob();
        Editor edit = this.f7224a.edit();
        if (TextUtils.isEmpty(str)) {
            edit.remove("installation_campaign");
        } else {
            edit.putString("installation_campaign", str);
        }
        if (!edit.commit()) {
            zzbS("Failed to commit campaign data");
        }
    }

    /* renamed from: b */
    public bod m10095b() {
        return new bod(zznR(), m10093a());
    }

    /* renamed from: c */
    public long m10096c() {
        zzmR();
        zzob();
        if (this.f7226c == -1) {
            this.f7226c = this.f7224a.getLong("last_dispatch", 0);
        }
        return this.f7226c;
    }

    /* renamed from: d */
    public void m10097d() {
        zzmR();
        zzob();
        long a = zznR().mo606a();
        Editor edit = this.f7224a.edit();
        edit.putLong("last_dispatch", a);
        edit.apply();
        this.f7226c = a;
    }

    /* renamed from: e */
    public String m10098e() {
        zzmR();
        zzob();
        CharSequence string = this.f7224a.getString("installation_campaign", null);
        return TextUtils.isEmpty(string) ? null : string;
    }

    /* renamed from: f */
    public C1368a m10099f() {
        return this.f7227d;
    }

    protected void zzmS() {
        this.f7224a = getContext().getSharedPreferences("com.google.android.gms.analytics.prefs", 0);
    }
}
