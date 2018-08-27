package com.p000;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: ald */
public class ald {

    /* renamed from: ald$d */
    public static class C0275d<T extends C0275d> {
        /* renamed from: a */
        alh f1960a;
        /* renamed from: b */
        Map<String, List<alg>> f1961b = new HashMap();
        /* renamed from: c */
        List<ali> f1962c = new ArrayList();
        /* renamed from: d */
        List<alg> f1963d = new ArrayList();
        /* renamed from: e */
        private Map<String, String> f1964e = new HashMap();

        protected C0275d() {
        }

        /* renamed from: a */
        public final T m2437a(String str, String str2) {
            if (str != null) {
                this.f1964e.put(str, str2);
            } else {
                bnw.m10037b("HitBuilder.set() called with a null paramName.");
            }
            return this;
        }

        /* renamed from: a */
        public Map<String, String> mo319a() {
            Map<String, String> hashMap = new HashMap(this.f1964e);
            if (this.f1960a != null) {
                hashMap.putAll(this.f1960a.m2458a());
            }
            int i = 1;
            for (ali a : this.f1962c) {
                hashMap.putAll(a.m2459a(all.m2478e(i)));
                i++;
            }
            i = 1;
            for (alg a2 : this.f1963d) {
                hashMap.putAll(a2.m2457a(all.m2476c(i)));
                i++;
            }
            int i2 = 1;
            for (Entry entry : this.f1961b.entrySet()) {
                List<alg> list = (List) entry.getValue();
                String h = all.m2481h(i2);
                int i3 = 1;
                for (alg alg : list) {
                    String valueOf = String.valueOf(h);
                    String valueOf2 = String.valueOf(all.m2480g(i3));
                    hashMap.putAll(alg.m2457a(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf)));
                    i3++;
                }
                if (!TextUtils.isEmpty((CharSequence) entry.getKey())) {
                    String valueOf3 = String.valueOf(h);
                    String valueOf4 = String.valueOf("nm");
                    hashMap.put(valueOf4.length() != 0 ? valueOf3.concat(valueOf4) : new String(valueOf3), (String) entry.getKey());
                }
                i2++;
            }
            return hashMap;
        }
    }

    @Deprecated
    /* renamed from: ald$a */
    public static class C0276a extends C0275d<C0276a> {
        public C0276a() {
            m2437a("&t", "screenview");
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Map mo319a() {
            return super.mo319a();
        }
    }

    /* renamed from: ald$b */
    public static class C0277b extends C0275d<C0277b> {
        public C0277b() {
            m2437a("&t", "event");
        }

        /* renamed from: a */
        public C0277b m2440a(long j) {
            m2437a("&ev", Long.toString(j));
            return this;
        }

        /* renamed from: a */
        public C0277b m2441a(String str) {
            m2437a("&ec", str);
            return this;
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Map mo319a() {
            return super.mo319a();
        }

        /* renamed from: b */
        public C0277b m2443b(String str) {
            m2437a("&ea", str);
            return this;
        }

        /* renamed from: c */
        public C0277b m2444c(String str) {
            m2437a("&el", str);
            return this;
        }
    }

    /* renamed from: ald$c */
    public static class C0278c extends C0275d<C0278c> {
        public C0278c() {
            m2437a("&t", "exception");
        }

        /* renamed from: a */
        public C0278c m2445a(String str) {
            m2437a("&exd", str);
            return this;
        }

        /* renamed from: a */
        public C0278c m2446a(boolean z) {
            m2437a("&exf", bof.m10132a(z));
            return this;
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Map mo319a() {
            return super.mo319a();
        }
    }
}
