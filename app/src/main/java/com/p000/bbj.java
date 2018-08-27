package com.p000;

import android.text.TextUtils;
import com.facebook.internal.NativeProtocol;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

@bhd
/* renamed from: bbj */
public class bbj {
    /* renamed from: a */
    boolean f5444a;
    /* renamed from: b */
    private final List<bbh> f5445b = new LinkedList();
    /* renamed from: c */
    private final Map<String, String> f5446c = new LinkedHashMap();
    /* renamed from: d */
    private final Object f5447d = new Object();
    /* renamed from: e */
    private String f5448e;
    /* renamed from: f */
    private bbh f5449f;
    /* renamed from: g */
    private bbj f5450g;

    public bbj(boolean z, String str, String str2) {
        this.f5444a = z;
        this.f5446c.put(NativeProtocol.WEB_DIALOG_ACTION, str);
        this.f5446c.put("ad_format", str2);
    }

    /* renamed from: a */
    public bbh m7161a() {
        return m7162a(ako.m2349k().mo607b());
    }

    /* renamed from: a */
    public bbh m7162a(long j) {
        return !this.f5444a ? null : new bbh(j, null, null);
    }

    /* renamed from: a */
    public void m7163a(bbj bbj) {
        synchronized (this.f5447d) {
            this.f5450g = bbj;
        }
    }

    /* renamed from: a */
    public void m7164a(String str) {
        if (this.f5444a) {
            synchronized (this.f5447d) {
                this.f5448e = str;
            }
        }
    }

    /* renamed from: a */
    public void m7165a(String str, String str2) {
        if (this.f5444a && !TextUtils.isEmpty(str2)) {
            bbd f = ako.m2347i().m8951f();
            if (f != null) {
                synchronized (this.f5447d) {
                    f.m7139a(str).m7150a(this.f5446c, str, str2);
                }
            }
        }
    }

    /* renamed from: a */
    public boolean m7166a(bbh bbh, long j, String... strArr) {
        synchronized (this.f5447d) {
            for (String bbh2 : strArr) {
                this.f5445b.add(new bbh(j, bbh2, bbh));
            }
        }
        return true;
    }

    /* renamed from: a */
    public boolean m7167a(bbh bbh, String... strArr) {
        return (!this.f5444a || bbh == null) ? false : m7166a(bbh, ako.m2349k().mo607b(), strArr);
    }

    /* renamed from: b */
    public void m7168b() {
        synchronized (this.f5447d) {
            this.f5449f = m7161a();
        }
    }

    /* renamed from: c */
    public String m7169c() {
        String stringBuilder;
        StringBuilder stringBuilder2 = new StringBuilder();
        synchronized (this.f5447d) {
            for (bbh bbh : this.f5445b) {
                long a = bbh.m7155a();
                String b = bbh.m7156b();
                bbh bbh2 = bbh2.m7157c();
                if (bbh2 != null && a > 0) {
                    stringBuilder2.append(b).append('.').append(a - bbh2.m7155a()).append(',');
                }
            }
            this.f5445b.clear();
            if (!TextUtils.isEmpty(this.f5448e)) {
                stringBuilder2.append(this.f5448e);
            } else if (stringBuilder2.length() > 0) {
                stringBuilder2.setLength(stringBuilder2.length() - 1);
            }
            stringBuilder = stringBuilder2.toString();
        }
        return stringBuilder;
    }

    /* renamed from: d */
    Map<String, String> m7170d() {
        Map<String, String> map;
        synchronized (this.f5447d) {
            bbd f = ako.m2347i().m8951f();
            if (f == null || this.f5450g == null) {
                map = this.f5446c;
            } else {
                map = f.m7141a(this.f5446c, this.f5450g.m7170d());
            }
        }
        return map;
    }

    /* renamed from: e */
    public bbh m7171e() {
        bbh bbh;
        synchronized (this.f5447d) {
            bbh = this.f5449f;
        }
        return bbh;
    }
}
