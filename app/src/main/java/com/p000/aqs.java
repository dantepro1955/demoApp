package com.p000;

import android.content.Context;
import android.os.IBinder;

/* renamed from: aqs */
public abstract class aqs<T> {
    /* renamed from: a */
    private final String f3820a;
    /* renamed from: b */
    private T f3821b;

    /* renamed from: aqs$a */
    public static class C0702a extends Exception {
        public C0702a(String str) {
            super(str);
        }

        public C0702a(String str, Throwable th) {
            super(str, th);
        }
    }

    protected aqs(String str) {
        this.f3820a = str;
    }

    /* renamed from: a */
    protected final T m4701a(Context context) throws C0702a {
        if (this.f3821b == null) {
            aoi.m4679a((Object) context);
            Context remoteContext = aqo.getRemoteContext(context);
            if (remoteContext == null) {
                throw new C0702a("Could not get remote context.");
            }
            try {
                this.f3821b = mo589b((IBinder) remoteContext.getClassLoader().loadClass(this.f3820a).newInstance());
            } catch (Throwable e) {
                throw new C0702a("Could not load creator class.", e);
            } catch (Throwable e2) {
                throw new C0702a("Could not instantiate creator.", e2);
            } catch (Throwable e22) {
                throw new C0702a("Could not access creator.", e22);
            }
        }
        return this.f3821b;
    }

    /* renamed from: b */
    protected abstract T mo589b(IBinder iBinder);
}
