package com.p000;

import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.gms.internal.zzec;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

@bhd
/* renamed from: bju */
public class bju {
    /* renamed from: a */
    private final bjw f6574a;
    /* renamed from: b */
    private final LinkedList<C1255a> f6575b;
    /* renamed from: c */
    private final Object f6576c;
    /* renamed from: d */
    private final String f6577d;
    /* renamed from: e */
    private final String f6578e;
    /* renamed from: f */
    private long f6579f;
    /* renamed from: g */
    private long f6580g;
    /* renamed from: h */
    private boolean f6581h;
    /* renamed from: i */
    private long f6582i;
    /* renamed from: j */
    private long f6583j;
    /* renamed from: k */
    private long f6584k;
    /* renamed from: l */
    private long f6585l;

    @bhd
    /* renamed from: bju$a */
    static final class C1255a {
        /* renamed from: a */
        private long f6572a = -1;
        /* renamed from: b */
        private long f6573b = -1;

        /* renamed from: a */
        public long m8900a() {
            return this.f6573b;
        }

        /* renamed from: b */
        public void m8901b() {
            this.f6573b = SystemClock.elapsedRealtime();
        }

        /* renamed from: c */
        public void m8902c() {
            this.f6572a = SystemClock.elapsedRealtime();
        }

        /* renamed from: d */
        public Bundle m8903d() {
            Bundle bundle = new Bundle();
            bundle.putLong("topen", this.f6572a);
            bundle.putLong("tclose", this.f6573b);
            return bundle;
        }
    }

    public bju(bjw bjw, String str, String str2) {
        this.f6576c = new Object();
        this.f6579f = -1;
        this.f6580g = -1;
        this.f6581h = false;
        this.f6582i = -1;
        this.f6583j = 0;
        this.f6584k = -1;
        this.f6585l = -1;
        this.f6574a = bjw;
        this.f6577d = str;
        this.f6578e = str2;
        this.f6575b = new LinkedList();
    }

    public bju(String str, String str2) {
        this(ako.m2347i(), str, str2);
    }

    /* renamed from: a */
    public void m8904a() {
        synchronized (this.f6576c) {
            if (this.f6585l != -1 && this.f6580g == -1) {
                this.f6580g = SystemClock.elapsedRealtime();
                this.f6574a.m8931a(this);
            }
            this.f6574a.m8949e().m8978c();
        }
    }

    /* renamed from: a */
    public void m8905a(long j) {
        synchronized (this.f6576c) {
            this.f6585l = j;
            if (this.f6585l != -1) {
                this.f6574a.m8931a(this);
            }
        }
    }

    /* renamed from: a */
    public void m8906a(zzec zzec) {
        synchronized (this.f6576c) {
            this.f6584k = SystemClock.elapsedRealtime();
            this.f6574a.m8949e().m8976a(zzec, this.f6584k);
        }
    }

    /* renamed from: a */
    public void m8907a(boolean z) {
        synchronized (this.f6576c) {
            if (this.f6585l != -1) {
                this.f6582i = SystemClock.elapsedRealtime();
                if (!z) {
                    this.f6580g = this.f6582i;
                    this.f6574a.m8931a(this);
                }
            }
        }
    }

    /* renamed from: b */
    public void m8908b() {
        synchronized (this.f6576c) {
            if (this.f6585l != -1) {
                C1255a c1255a = new C1255a();
                c1255a.m8902c();
                this.f6575b.add(c1255a);
                this.f6583j++;
                this.f6574a.m8949e().m8977b();
                this.f6574a.m8931a(this);
            }
        }
    }

    /* renamed from: b */
    public void m8909b(long j) {
        synchronized (this.f6576c) {
            if (this.f6585l != -1) {
                this.f6579f = j;
                this.f6574a.m8931a(this);
            }
        }
    }

    /* renamed from: b */
    public void m8910b(boolean z) {
        synchronized (this.f6576c) {
            if (this.f6585l != -1) {
                this.f6581h = z;
                this.f6574a.m8931a(this);
            }
        }
    }

    /* renamed from: c */
    public void m8911c() {
        synchronized (this.f6576c) {
            if (!(this.f6585l == -1 || this.f6575b.isEmpty())) {
                C1255a c1255a = (C1255a) this.f6575b.getLast();
                if (c1255a.m8900a() == -1) {
                    c1255a.m8901b();
                    this.f6574a.m8931a(this);
                }
            }
        }
    }

    /* renamed from: d */
    public Bundle m8912d() {
        Bundle bundle;
        synchronized (this.f6576c) {
            bundle = new Bundle();
            bundle.putString("seq_num", this.f6577d);
            bundle.putString("slotid", this.f6578e);
            bundle.putBoolean("ismediation", this.f6581h);
            bundle.putLong("treq", this.f6584k);
            bundle.putLong("tresponse", this.f6585l);
            bundle.putLong("timp", this.f6580g);
            bundle.putLong("tload", this.f6582i);
            bundle.putLong("pcc", this.f6583j);
            bundle.putLong("tfetch", this.f6579f);
            ArrayList arrayList = new ArrayList();
            Iterator it = this.f6575b.iterator();
            while (it.hasNext()) {
                arrayList.add(((C1255a) it.next()).m8903d());
            }
            bundle.putParcelableArrayList("tclick", arrayList);
        }
        return bundle;
    }
}
