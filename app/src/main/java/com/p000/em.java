package com.p000;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Message;
import android.os.RemoteException;
import android.provider.Settings.Secure;
import android.util.Log;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import p000.dv.C5124a;

/* compiled from: NotificationManagerCompat */
/* renamed from: em */
public final class em {
    /* renamed from: a */
    static final int f23635a = f23641i.mo4696a();
    /* renamed from: b */
    private static final Object f23636b = new Object();
    /* renamed from: c */
    private static String f23637c;
    /* renamed from: d */
    private static Set<String> f23638d = new HashSet();
    /* renamed from: g */
    private static final Object f23639g = new Object();
    /* renamed from: h */
    private static C5294i f23640h;
    /* renamed from: i */
    private static final C5286b f23641i;
    /* renamed from: e */
    private final Context f23642e;
    /* renamed from: f */
    private final NotificationManager f23643f = ((NotificationManager) this.f23642e.getSystemService("notification"));

    /* compiled from: NotificationManagerCompat */
    /* renamed from: em$j */
    interface C5284j {
        /* renamed from: a */
        void mo4695a(dv dvVar) throws RemoteException;
    }

    /* compiled from: NotificationManagerCompat */
    /* renamed from: em$a */
    static class C5285a implements C5284j {
        /* renamed from: a */
        final String f23615a;
        /* renamed from: b */
        final int f23616b;
        /* renamed from: c */
        final String f23617c;
        /* renamed from: d */
        final boolean f23618d = false;

        public C5285a(String str, int i, String str2) {
            this.f23615a = str;
            this.f23616b = i;
            this.f23617c = str2;
        }

        /* renamed from: a */
        public void mo4695a(dv dvVar) throws RemoteException {
            if (this.f23618d) {
                dvVar.mo4652a(this.f23615a);
            } else {
                dvVar.mo4653a(this.f23615a, this.f23616b, this.f23617c);
            }
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder("CancelTask[");
            stringBuilder.append("packageName:").append(this.f23615a);
            stringBuilder.append(", id:").append(this.f23616b);
            stringBuilder.append(", tag:").append(this.f23617c);
            stringBuilder.append(", all:").append(this.f23618d);
            stringBuilder.append("]");
            return stringBuilder.toString();
        }
    }

    /* compiled from: NotificationManagerCompat */
    /* renamed from: em$b */
    interface C5286b {
        /* renamed from: a */
        int mo4696a();

        /* renamed from: a */
        void mo4697a(NotificationManager notificationManager, String str, int i);

        /* renamed from: a */
        void mo4698a(NotificationManager notificationManager, String str, int i, Notification notification);
    }

    /* compiled from: NotificationManagerCompat */
    /* renamed from: em$d */
    static class C5287d implements C5286b {
        C5287d() {
        }

        /* renamed from: a */
        public void mo4697a(NotificationManager notificationManager, String str, int i) {
            notificationManager.cancel(str, i);
        }

        /* renamed from: a */
        public void mo4698a(NotificationManager notificationManager, String str, int i, Notification notification) {
            notificationManager.notify(str, i, notification);
        }

        /* renamed from: a */
        public int mo4696a() {
            return 1;
        }
    }

    /* compiled from: NotificationManagerCompat */
    /* renamed from: em$e */
    static class C5288e extends C5287d {
        C5288e() {
        }

        /* renamed from: a */
        public int mo4696a() {
            return 33;
        }
    }

    /* compiled from: NotificationManagerCompat */
    /* renamed from: em$f */
    static class C5289f extends C5288e {
        C5289f() {
        }
    }

    /* compiled from: NotificationManagerCompat */
    /* renamed from: em$c */
    static class C5290c extends C5289f {
        C5290c() {
        }
    }

    /* compiled from: NotificationManagerCompat */
    /* renamed from: em$g */
    static class C5291g implements C5284j {
        /* renamed from: a */
        final String f23619a;
        /* renamed from: b */
        final int f23620b;
        /* renamed from: c */
        final String f23621c;
        /* renamed from: d */
        final Notification f23622d;

        public C5291g(String str, int i, String str2, Notification notification) {
            this.f23619a = str;
            this.f23620b = i;
            this.f23621c = str2;
            this.f23622d = notification;
        }

        /* renamed from: a */
        public void mo4695a(dv dvVar) throws RemoteException {
            dvVar.mo4654a(this.f23619a, this.f23620b, this.f23621c, this.f23622d);
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder("NotifyTask[");
            stringBuilder.append("packageName:").append(this.f23619a);
            stringBuilder.append(", id:").append(this.f23620b);
            stringBuilder.append(", tag:").append(this.f23621c);
            stringBuilder.append("]");
            return stringBuilder.toString();
        }
    }

    /* compiled from: NotificationManagerCompat */
    /* renamed from: em$h */
    static class C5292h {
        /* renamed from: a */
        final ComponentName f23623a;
        /* renamed from: b */
        final IBinder f23624b;

        public C5292h(ComponentName componentName, IBinder iBinder) {
            this.f23623a = componentName;
            this.f23624b = iBinder;
        }
    }

    /* compiled from: NotificationManagerCompat */
    /* renamed from: em$i */
    static class C5294i implements ServiceConnection, Callback {
        /* renamed from: a */
        private final Context f23630a;
        /* renamed from: b */
        private final HandlerThread f23631b;
        /* renamed from: c */
        private final Handler f23632c;
        /* renamed from: d */
        private final Map<ComponentName, C5293a> f23633d = new HashMap();
        /* renamed from: e */
        private Set<String> f23634e = new HashSet();

        /* compiled from: NotificationManagerCompat */
        /* renamed from: em$i$a */
        static class C5293a {
            /* renamed from: a */
            public final ComponentName f23625a;
            /* renamed from: b */
            public boolean f23626b = false;
            /* renamed from: c */
            public dv f23627c;
            /* renamed from: d */
            public LinkedList<C5284j> f23628d = new LinkedList();
            /* renamed from: e */
            public int f23629e = 0;

            public C5293a(ComponentName componentName) {
                this.f23625a = componentName;
            }
        }

        public C5294i(Context context) {
            this.f23630a = context;
            this.f23631b = new HandlerThread("NotificationManagerCompat");
            this.f23631b.start();
            this.f23632c = new Handler(this.f23631b.getLooper(), this);
        }

        /* renamed from: a */
        public void m30054a(C5284j c5284j) {
            this.f23632c.obtainMessage(0, c5284j).sendToTarget();
        }

        public boolean handleMessage(Message message) {
            switch (message.what) {
                case 0:
                    m30051b((C5284j) message.obj);
                    return true;
                case 1:
                    C5292h c5292h = (C5292h) message.obj;
                    m30047a(c5292h.f23623a, c5292h.f23624b);
                    return true;
                case 2:
                    m30046a((ComponentName) message.obj);
                    return true;
                case 3:
                    m30049b((ComponentName) message.obj);
                    return true;
                default:
                    return false;
            }
        }

        /* renamed from: b */
        private void m30051b(C5284j c5284j) {
            m30045a();
            for (C5293a c5293a : this.f23633d.values()) {
                c5293a.f23628d.add(c5284j);
                m30053d(c5293a);
            }
        }

        /* renamed from: a */
        private void m30047a(ComponentName componentName, IBinder iBinder) {
            C5293a c5293a = (C5293a) this.f23633d.get(componentName);
            if (c5293a != null) {
                c5293a.f23627c = C5124a.m29462a(iBinder);
                c5293a.f23629e = 0;
                m30053d(c5293a);
            }
        }

        /* renamed from: a */
        private void m30046a(ComponentName componentName) {
            C5293a c5293a = (C5293a) this.f23633d.get(componentName);
            if (c5293a != null) {
                m30050b(c5293a);
            }
        }

        /* renamed from: b */
        private void m30049b(ComponentName componentName) {
            C5293a c5293a = (C5293a) this.f23633d.get(componentName);
            if (c5293a != null) {
                m30053d(c5293a);
            }
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Connected to service " + componentName);
            }
            this.f23632c.obtainMessage(1, new C5292h(componentName, iBinder)).sendToTarget();
        }

        public void onServiceDisconnected(ComponentName componentName) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Disconnected from service " + componentName);
            }
            this.f23632c.obtainMessage(2, componentName).sendToTarget();
        }

        /* renamed from: a */
        private void m30045a() {
            Set b = em.m30058b(this.f23630a);
            if (!b.equals(this.f23634e)) {
                this.f23634e = b;
                List<ResolveInfo> queryIntentServices = this.f23630a.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 4);
                Set<ComponentName> hashSet = new HashSet();
                for (ResolveInfo resolveInfo : queryIntentServices) {
                    if (b.contains(resolveInfo.serviceInfo.packageName)) {
                        ComponentName componentName = new ComponentName(resolveInfo.serviceInfo.packageName, resolveInfo.serviceInfo.name);
                        if (resolveInfo.serviceInfo.permission != null) {
                            Log.w("NotifManCompat", "Permission present on component " + componentName + ", not adding listener record.");
                        } else {
                            hashSet.add(componentName);
                        }
                    }
                }
                for (ComponentName componentName2 : hashSet) {
                    if (!this.f23633d.containsKey(componentName2)) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Adding listener record for " + componentName2);
                        }
                        this.f23633d.put(componentName2, new C5293a(componentName2));
                    }
                }
                Iterator it = this.f23633d.entrySet().iterator();
                while (it.hasNext()) {
                    Entry entry = (Entry) it.next();
                    if (!hashSet.contains(entry.getKey())) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Removing listener record for " + entry.getKey());
                        }
                        m30050b((C5293a) entry.getValue());
                        it.remove();
                    }
                }
            }
        }

        /* renamed from: a */
        private boolean m30048a(C5293a c5293a) {
            if (c5293a.f23626b) {
                return true;
            }
            c5293a.f23626b = this.f23630a.bindService(new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL").setComponent(c5293a.f23625a), this, em.f23635a);
            if (c5293a.f23626b) {
                c5293a.f23629e = 0;
            } else {
                Log.w("NotifManCompat", "Unable to bind to listener " + c5293a.f23625a);
                this.f23630a.unbindService(this);
            }
            return c5293a.f23626b;
        }

        /* renamed from: b */
        private void m30050b(C5293a c5293a) {
            if (c5293a.f23626b) {
                this.f23630a.unbindService(this);
                c5293a.f23626b = false;
            }
            c5293a.f23627c = null;
        }

        /* renamed from: c */
        private void m30052c(C5293a c5293a) {
            if (!this.f23632c.hasMessages(3, c5293a.f23625a)) {
                c5293a.f23629e++;
                if (c5293a.f23629e > 6) {
                    Log.w("NotifManCompat", "Giving up on delivering " + c5293a.f23628d.size() + " tasks to " + c5293a.f23625a + " after " + c5293a.f23629e + " retries");
                    c5293a.f23628d.clear();
                    return;
                }
                int i = (1 << (c5293a.f23629e - 1)) * 1000;
                if (Log.isLoggable("NotifManCompat", 3)) {
                    Log.d("NotifManCompat", "Scheduling retry for " + i + " ms");
                }
                this.f23632c.sendMessageDelayed(this.f23632c.obtainMessage(3, c5293a.f23625a), (long) i);
            }
        }

        /* renamed from: d */
        private void m30053d(C5293a c5293a) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Processing component " + c5293a.f23625a + ", " + c5293a.f23628d.size() + " queued tasks");
            }
            if (!c5293a.f23628d.isEmpty()) {
                if (!m30048a(c5293a) || c5293a.f23627c == null) {
                    m30052c(c5293a);
                    return;
                }
                while (true) {
                    C5284j c5284j = (C5284j) c5293a.f23628d.peek();
                    if (c5284j == null) {
                        break;
                    }
                    try {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Sending task " + c5284j);
                        }
                        c5284j.mo4695a(c5293a.f23627c);
                        c5293a.f23628d.remove();
                    } catch (DeadObjectException e) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Remote service has died: " + c5293a.f23625a);
                        }
                    } catch (Throwable e2) {
                        Log.w("NotifManCompat", "RemoteException communicating with " + c5293a.f23625a, e2);
                    }
                }
                if (!c5293a.f23628d.isEmpty()) {
                    m30052c(c5293a);
                }
            }
        }
    }

    static {
        if (gr.m30483a()) {
            f23641i = new C5290c();
        } else if (VERSION.SDK_INT >= 19) {
            f23641i = new C5289f();
        } else if (VERSION.SDK_INT >= 14) {
            f23641i = new C5288e();
        } else {
            f23641i = new C5287d();
        }
    }

    /* renamed from: a */
    public static em m30055a(Context context) {
        return new em(context);
    }

    private em(Context context) {
        this.f23642e = context;
    }

    /* renamed from: a */
    public void m30059a(int i) {
        m30061a(null, i);
    }

    /* renamed from: a */
    public void m30061a(String str, int i) {
        f23641i.mo4697a(this.f23643f, str, i);
        if (VERSION.SDK_INT <= 19) {
            m30056a(new C5285a(this.f23642e.getPackageName(), i, str));
        }
    }

    /* renamed from: a */
    public void m30060a(int i, Notification notification) {
        m30062a(null, i, notification);
    }

    /* renamed from: a */
    public void m30062a(String str, int i, Notification notification) {
        if (em.m30057a(notification)) {
            m30056a(new C5291g(this.f23642e.getPackageName(), i, str, notification));
            f23641i.mo4697a(this.f23643f, str, i);
            return;
        }
        f23641i.mo4698a(this.f23643f, str, i, notification);
    }

    /* renamed from: b */
    public static Set<String> m30058b(Context context) {
        String string = Secure.getString(context.getContentResolver(), "enabled_notification_listeners");
        synchronized (f23636b) {
            if (string != null) {
                if (!string.equals(f23637c)) {
                    String[] split = string.split(":");
                    Set hashSet = new HashSet(split.length);
                    for (String unflattenFromString : split) {
                        ComponentName unflattenFromString2 = ComponentName.unflattenFromString(unflattenFromString);
                        if (unflattenFromString2 != null) {
                            hashSet.add(unflattenFromString2.getPackageName());
                        }
                    }
                    f23638d = hashSet;
                    f23637c = string;
                }
            }
        }
        return f23638d;
    }

    /* renamed from: a */
    private static boolean m30057a(Notification notification) {
        Bundle a = ed.m30003a(notification);
        return a != null && a.getBoolean("android.support.useSideChannel");
    }

    /* renamed from: a */
    private void m30056a(C5284j c5284j) {
        synchronized (f23639g) {
            if (f23640h == null) {
                f23640h = new C5294i(this.f23642e.getApplicationContext());
            }
            f23640h.m30054a(c5284j);
        }
    }
}
