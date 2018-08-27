package com.p000;

import android.annotation.TargetApi;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p000.arh.C0722a;

/* renamed from: btu */
public class btu {
    /* renamed from: a */
    static final Map<String, btu> f7633a = new hh();
    /* renamed from: b */
    private static final List<String> f7634b = Arrays.asList(new String[]{"com.google.firebase.auth.FirebaseAuth", "com.google.firebase.iid.FirebaseInstanceId"});
    /* renamed from: c */
    private static final List<String> f7635c = Collections.singletonList("com.google.firebase.crash.FirebaseCrash");
    /* renamed from: d */
    private static final List<String> f7636d = Arrays.asList(new String[]{"com.google.android.gms.measurement.AppMeasurement"});
    /* renamed from: e */
    private static final List<String> f7637e = Arrays.asList(new String[0]);
    /* renamed from: f */
    private static final Set<String> f7638f = Collections.emptySet();
    /* renamed from: g */
    private static final Object f7639g = new Object();
    /* renamed from: h */
    private final Context f7640h;
    /* renamed from: i */
    private final String f7641i;
    /* renamed from: j */
    private final btv f7642j;
    /* renamed from: k */
    private final AtomicBoolean f7643k = new AtomicBoolean(false);
    /* renamed from: l */
    private final AtomicBoolean f7644l = new AtomicBoolean();
    /* renamed from: m */
    private final List<Object> f7645m = new CopyOnWriteArrayList();
    /* renamed from: n */
    private final List<C1485a> f7646n = new CopyOnWriteArrayList();
    /* renamed from: o */
    private final List<Object> f7647o = new CopyOnWriteArrayList();

    /* renamed from: btu$1 */
    class C14841 implements C0722a {
        C14841() {
        }

        /* renamed from: a */
        public void mo701a(boolean z) {
            btu.m10969a(z);
        }
    }

    /* renamed from: btu$a */
    public interface C1485a {
        /* renamed from: a */
        void m10959a(boolean z);
    }

    @TargetApi(24)
    /* renamed from: btu$b */
    static class C1486b extends BroadcastReceiver {
        /* renamed from: a */
        private static AtomicReference<C1486b> f7631a = new AtomicReference();
        /* renamed from: b */
        private final Context f7632b;

        public C1486b(Context context) {
            this.f7632b = context;
        }

        /* renamed from: b */
        private static void m10961b(Context context) {
            if (f7631a.get() == null) {
                BroadcastReceiver c1486b = new C1486b(context);
                if (f7631a.compareAndSet(null, c1486b)) {
                    context.registerReceiver(c1486b, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                }
            }
        }

        /* renamed from: a */
        public void m10962a() {
            this.f7632b.unregisterReceiver(this);
        }

        public void onReceive(Context context, Intent intent) {
            synchronized (btu.f7639g) {
                for (btu a : btu.f7633a.values()) {
                    a.m10975g();
                }
            }
            m10962a();
        }
    }

    protected btu(Context context, String str, btv btv) {
        this.f7640h = (Context) aoi.m4679a((Object) context);
        this.f7641i = aoi.m4681a(str);
        this.f7642j = (btv) aoi.m4679a((Object) btv);
    }

    /* renamed from: a */
    public static btu m10963a(Context context) {
        btu c;
        synchronized (f7639g) {
            if (f7633a.containsKey("[DEFAULT]")) {
                c = btu.m10972c();
            } else {
                btv a = btv.m10979a(context);
                if (a == null) {
                    c = null;
                } else {
                    c = btu.m10964a(context, a);
                }
            }
        }
        return c;
    }

    /* renamed from: a */
    public static btu m10964a(Context context, btv btv) {
        return btu.m10965a(context, btv, "[DEFAULT]");
    }

    /* renamed from: a */
    public static btu m10965a(Context context, btv btv, String str) {
        Object btu;
        awq a = awq.m6166a(context);
        btu.m10970b(context);
        String a2 = btu.m10966a(str);
        if (context.getApplicationContext() != null) {
            Object applicationContext = context.getApplicationContext();
        }
        synchronized (f7639g) {
            aoi.m4685a(!f7633a.containsKey(a2), new StringBuilder(String.valueOf(a2).length() + 33).append("FirebaseApp name ").append(a2).append(" already exists!").toString());
            aoi.m4680a(applicationContext, (Object) "Application context cannot be null.");
            btu = new btu(applicationContext, a2, btv);
            f7633a.put(a2, btu);
        }
        a.m6167a((btu) btu);
        btu.m10968a(btu.class, btu, f7634b);
        if (btu.m10978d()) {
            btu.m10968a(btu.class, btu, f7635c);
            btu.m10968a(Context.class, btu.m10976a(), f7636d);
        }
        return btu;
    }

    /* renamed from: a */
    private static String m10966a(String str) {
        return str.trim();
    }

    /* renamed from: a */
    private <T> void m10968a(Class<T> cls, T t, Iterable<String> iterable) {
        boolean b = ew.m21142b(this.f7640h);
        if (b) {
            C1486b.m10961b(this.f7640h);
        }
        for (String str : iterable) {
            String str2;
            if (b) {
                try {
                    if (!f7637e.contains(str2)) {
                    }
                } catch (ClassNotFoundException e) {
                    if (f7638f.contains(str2)) {
                        throw new IllegalStateException(String.valueOf(str2).concat(" is missing, but is required. Check if it has been removed by Proguard."));
                    }
                    Log.d("FirebaseApp", String.valueOf(str2).concat(" is not linked. Skipping initialization."));
                } catch (NoSuchMethodException e2) {
                    throw new IllegalStateException(String.valueOf(str2).concat("#getInstance has been removed by Proguard. Add keep rule to prevent it."));
                } catch (Throwable e3) {
                    Log.wtf("FirebaseApp", "Firebase API initialization failure.", e3);
                } catch (Throwable e4) {
                    String str3 = "FirebaseApp";
                    String str4 = "Failed to initialize ";
                    str2 = String.valueOf(str2);
                    Log.wtf(str3, str2.length() != 0 ? str4.concat(str2) : new String(str4), e4);
                }
            }
            Method method = Class.forName(str2).getMethod("getInstance", new Class[]{cls});
            int modifiers = method.getModifiers();
            if (Modifier.isPublic(modifiers) && Modifier.isStatic(modifiers)) {
                method.invoke(null, new Object[]{t});
            }
        }
    }

    /* renamed from: a */
    public static void m10969a(boolean z) {
        synchronized (f7639g) {
            Iterator it = new ArrayList(f7633a.values()).iterator();
            while (it.hasNext()) {
                btu btu = (btu) it.next();
                if (btu.f7643k.get()) {
                    btu.m10971b(z);
                }
            }
        }
    }

    @TargetApi(14)
    /* renamed from: b */
    private static void m10970b(Context context) {
        aqd.m4912b();
        if (context.getApplicationContext() instanceof Application) {
            arh.m5109a((Application) context.getApplicationContext());
            arh.m5108a().m5111a(new C14841());
        }
    }

    /* renamed from: b */
    private void m10971b(boolean z) {
        Log.d("FirebaseApp", "Notifying background state change listeners.");
        for (C1485a a : this.f7646n) {
            a.m10959a(z);
        }
    }

    /* renamed from: c */
    public static btu m10972c() {
        btu btu;
        synchronized (f7639g) {
            btu = (btu) f7633a.get("[DEFAULT]");
            if (btu == null) {
                String valueOf = String.valueOf(aqe.m4924a());
                throw new IllegalStateException(new StringBuilder(String.valueOf(valueOf).length() + 116).append("Default FirebaseApp is not initialized in this process ").append(valueOf).append(". Make sure to call FirebaseApp.initializeApp(Context) first.").toString());
            }
        }
        return btu;
    }

    /* renamed from: f */
    private void m10974f() {
        aoi.m4685a(!this.f7644l.get(), (Object) "FirebaseApp was deleted");
    }

    /* renamed from: g */
    private void m10975g() {
        m10968a(btu.class, (Object) this, f7634b);
        if (m10978d()) {
            m10968a(btu.class, (Object) this, f7635c);
            m10968a(Context.class, this.f7640h, f7636d);
        }
    }

    /* renamed from: a */
    public Context m10976a() {
        m10974f();
        return this.f7640h;
    }

    /* renamed from: b */
    public String m10977b() {
        m10974f();
        return this.f7641i;
    }

    /* renamed from: d */
    public boolean m10978d() {
        return "[DEFAULT]".equals(m10977b());
    }

    public boolean equals(Object obj) {
        return !(obj instanceof btu) ? false : this.f7641i.equals(((btu) obj).m10977b());
    }

    public int hashCode() {
        return this.f7641i.hashCode();
    }

    public String toString() {
        return aoh.m4676a((Object) this).m4674a("name", this.f7641i).m4674a("options", this.f7642j).toString();
    }
}
