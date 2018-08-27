package com.p000;

import android.app.Activity;
import android.os.IBinder;
import p000.bsz.C1453a;

/* renamed from: btq */
public final class btq {

    /* renamed from: btq$a */
    public static final class C1483a extends Exception {
        public C1483a(String str) {
            super(str);
        }

        public C1483a(String str, Throwable th) {
            super(str, th);
        }
    }

    /* renamed from: a */
    private static IBinder m10946a(Class<?> cls, IBinder iBinder, IBinder iBinder2, IBinder iBinder3, boolean z) throws C1483a {
        Throwable th;
        String str;
        String valueOf;
        try {
            return (IBinder) cls.getConstructor(new Class[]{IBinder.class, IBinder.class, IBinder.class, Boolean.TYPE}).newInstance(new Object[]{iBinder, iBinder2, iBinder3, Boolean.valueOf(z)});
        } catch (Throwable e) {
            th = e;
            str = "Could not find the right constructor for ";
            valueOf = String.valueOf(cls.getName());
            throw new C1483a(valueOf.length() != 0 ? str.concat(valueOf) : new String(str), th);
        } catch (Throwable e2) {
            th = e2;
            str = "Exception thrown by invoked constructor in ";
            valueOf = String.valueOf(cls.getName());
            throw new C1483a(valueOf.length() != 0 ? str.concat(valueOf) : new String(str), th);
        } catch (Throwable e22) {
            th = e22;
            str = "Unable to instantiate the dynamic class ";
            valueOf = String.valueOf(cls.getName());
            throw new C1483a(valueOf.length() != 0 ? str.concat(valueOf) : new String(str), th);
        } catch (Throwable e222) {
            th = e222;
            str = "Unable to call the default constructor of ";
            valueOf = String.valueOf(cls.getName());
            throw new C1483a(valueOf.length() != 0 ? str.concat(valueOf) : new String(str), th);
        }
    }

    /* renamed from: a */
    private static IBinder m10947a(ClassLoader classLoader, String str, IBinder iBinder, IBinder iBinder2, IBinder iBinder3, boolean z) throws C1483a {
        try {
            return btq.m10946a(classLoader.loadClass(str), iBinder, iBinder2, iBinder3, z);
        } catch (Throwable e) {
            Throwable th = e;
            String str2 = "Unable to find dynamic class ";
            String valueOf = String.valueOf(str);
            throw new C1483a(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), th);
        }
    }

    /* renamed from: a */
    public static bsz m10948a(Activity activity, IBinder iBinder, boolean z) throws C1483a {
        bsv.m10706a((Object) activity);
        bsv.m10706a((Object) iBinder);
        Object b = btt.m10955b(activity);
        if (b != null) {
            return C1453a.m10804a(btq.m10947a(b.getClassLoader(), "com.google.android.youtube.api.jar.client.RemoteEmbeddedPlayer", btp.m10944a(b).asBinder(), btp.m10944a((Object) activity).asBinder(), iBinder, z));
        }
        throw new C1483a("Could not create remote context");
    }
}
