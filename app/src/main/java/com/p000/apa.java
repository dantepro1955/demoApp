package com.p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;

/* renamed from: apa */
public abstract class apa {
    /* renamed from: a */
    private static final Object f3881a = new Object();
    /* renamed from: b */
    private static apa f3882b;

    /* renamed from: apa$a */
    public static final class C0680a {
        /* renamed from: a */
        private final String f3878a;
        /* renamed from: b */
        private final String f3879b;
        /* renamed from: c */
        private final ComponentName f3880c;

        public C0680a(ComponentName componentName) {
            this.f3878a = null;
            this.f3879b = null;
            this.f3880c = (ComponentName) aoi.m4679a((Object) componentName);
        }

        public C0680a(String str, String str2) {
            this.f3878a = aoi.m4681a(str);
            this.f3879b = aoi.m4681a(str2);
            this.f3880c = null;
        }

        /* renamed from: a */
        public String m4803a() {
            return this.f3879b;
        }

        /* renamed from: b */
        public ComponentName m4804b() {
            return this.f3880c;
        }

        /* renamed from: c */
        public Intent m4805c() {
            return this.f3878a != null ? new Intent(this.f3878a).setPackage(this.f3879b) : new Intent().setComponent(this.f3880c);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0680a)) {
                return false;
            }
            C0680a c0680a = (C0680a) obj;
            return aoh.m4677a(this.f3878a, c0680a.f3878a) && aoh.m4677a(this.f3880c, c0680a.f3880c);
        }

        public int hashCode() {
            return aoh.m4675a(this.f3878a, this.f3880c);
        }

        public String toString() {
            return this.f3878a == null ? this.f3880c.flattenToString() : this.f3878a;
        }
    }

    /* renamed from: a */
    public static apa m4806a(Context context) {
        synchronized (f3881a) {
            if (f3882b == null) {
                f3882b = new apb(context.getApplicationContext());
            }
        }
        return f3882b;
    }

    /* renamed from: a */
    public boolean m4807a(ComponentName componentName, ServiceConnection serviceConnection, String str) {
        return mo600a(new C0680a(componentName), serviceConnection, str);
    }

    /* renamed from: a */
    protected abstract boolean mo600a(C0680a c0680a, ServiceConnection serviceConnection, String str);

    /* renamed from: a */
    public boolean m4809a(String str, String str2, ServiceConnection serviceConnection, String str3) {
        return mo600a(new C0680a(str, str2), serviceConnection, str3);
    }

    /* renamed from: b */
    public void m4810b(ComponentName componentName, ServiceConnection serviceConnection, String str) {
        mo601b(new C0680a(componentName), serviceConnection, str);
    }

    /* renamed from: b */
    protected abstract void mo601b(C0680a c0680a, ServiceConnection serviceConnection, String str);

    /* renamed from: b */
    public void m4812b(String str, String str2, ServiceConnection serviceConnection, String str3) {
        mo601b(new C0680a(str, str2), serviceConnection, str3);
    }
}
