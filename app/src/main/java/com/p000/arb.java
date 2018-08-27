package com.p000;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ResolveInfo;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.os.Process;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.facebook.stetho.common.Utf8Charset;
import com.google.android.gms.gcm.GoogleCloudMessaging;
import com.google.android.gms.iid.InstanceIDListenerService;
import com.google.android.gms.iid.MessengerCompat;
import com.inmobi.commons.ads.cache.AdDatabaseHelper;
import java.io.IOException;
import java.security.KeyPair;
import java.security.PrivateKey;
import java.security.Signature;
import java.security.interfaces.RSAPrivateKey;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/* renamed from: arb */
public class arb {
    /* renamed from: a */
    static String f3994a = null;
    /* renamed from: b */
    static boolean f3995b = false;
    /* renamed from: c */
    static int f3996c = 0;
    /* renamed from: d */
    static int f3997d = 0;
    /* renamed from: e */
    static int f3998e = 0;
    /* renamed from: f */
    static BroadcastReceiver f3999f = null;
    /* renamed from: g */
    Context f4000g;
    /* renamed from: h */
    Map<String, Object> f4001h = new HashMap();
    /* renamed from: i */
    Messenger f4002i;
    /* renamed from: j */
    Messenger f4003j;
    /* renamed from: k */
    MessengerCompat f4004k;
    /* renamed from: l */
    PendingIntent f4005l;
    /* renamed from: m */
    long f4006m;
    /* renamed from: n */
    long f4007n;
    /* renamed from: o */
    int f4008o;
    /* renamed from: p */
    int f4009p;
    /* renamed from: q */
    long f4010q;

    /* renamed from: arb$2 */
    class C07192 extends BroadcastReceiver {
        /* renamed from: a */
        final /* synthetic */ arb f3993a;

        C07192(arb arb) {
            this.f3993a = arb;
        }

        public void onReceive(Context context, Intent intent) {
            if (Log.isLoggable("InstanceID/Rpc", 3)) {
                Log.d("InstanceID/Rpc", "Received GSF callback via dynamic receiver");
            }
            this.f3993a.m5046d(intent);
        }
    }

    public arb(Context context) {
        this.f4000g = context;
    }

    /* renamed from: a */
    static String m5023a(KeyPair keyPair, String... strArr) {
        String str = null;
        try {
            byte[] bytes = TextUtils.join("\n", strArr).getBytes(Utf8Charset.NAME);
            try {
                PrivateKey privateKey = keyPair.getPrivate();
                Signature instance = Signature.getInstance(privateKey instanceof RSAPrivateKey ? "SHA256withRSA" : "SHA256withECDSA");
                instance.initSign(privateKey);
                instance.update(bytes);
                str = aqy.m5006a(instance.sign());
            } catch (Throwable e) {
                Log.e("InstanceID/Rpc", "Unable to sign registration request", e);
            }
        } catch (Throwable e2) {
            Log.e("InstanceID/Rpc", "Unable to encode string", e2);
        }
        return str;
    }

    /* renamed from: a */
    private void m5024a(Object obj) {
        synchronized (getClass()) {
            for (String str : this.f4001h.keySet()) {
                Object obj2 = this.f4001h.get(str);
                this.f4001h.put(str, obj);
                m5025a(obj2, obj);
            }
        }
    }

    /* renamed from: a */
    private void m5025a(Object obj, Object obj2) {
        if (obj instanceof ConditionVariable) {
            ((ConditionVariable) obj).open();
        }
        if (obj instanceof Messenger) {
            Messenger messenger = (Messenger) obj;
            Message obtain = Message.obtain();
            obtain.obj = obj2;
            try {
                messenger.send(obtain);
            } catch (RemoteException e) {
                String valueOf = String.valueOf(e);
                Log.w("InstanceID/Rpc", new StringBuilder(String.valueOf(valueOf).length() + 24).append("Failed to send response ").append(valueOf).toString());
            }
        }
    }

    /* renamed from: a */
    private void m5026a(String str) {
        if ("com.google.android.gsf".equals(f3994a)) {
            this.f4008o++;
            if (this.f4008o >= 3) {
                if (this.f4008o == 3) {
                    this.f4009p = new Random().nextInt(1000) + 1000;
                }
                this.f4009p *= 2;
                this.f4010q = SystemClock.elapsedRealtime() + ((long) this.f4009p);
                Log.w("InstanceID/Rpc", new StringBuilder(String.valueOf(str).length() + 31).append("Backoff due to ").append(str).append(" for ").append(this.f4009p).toString());
            }
        }
    }

    /* renamed from: a */
    private void m5027a(String str, Object obj) {
        synchronized (getClass()) {
            Object obj2 = this.f4001h.get(str);
            this.f4001h.put(str, obj);
            m5025a(obj2, obj);
        }
    }

    /* renamed from: a */
    public static boolean m5028a(Context context) {
        if (f3994a != null) {
            arb.m5033b(context);
        }
        return f3995b;
    }

    /* renamed from: a */
    private static boolean m5029a(PackageManager packageManager) {
        for (ResolveInfo resolveInfo : packageManager.queryIntentServices(new Intent("com.google.android.c2dm.intent.REGISTER"), 0)) {
            if (arb.m5031a(packageManager, resolveInfo.serviceInfo.packageName, "com.google.android.c2dm.intent.REGISTER")) {
                f3995b = false;
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private static boolean m5030a(PackageManager packageManager, String str) {
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 0);
            f3994a = applicationInfo.packageName;
            f3997d = applicationInfo.uid;
            return true;
        } catch (NameNotFoundException e) {
            return false;
        }
    }

    /* renamed from: a */
    private static boolean m5031a(PackageManager packageManager, String str, String str2) {
        if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", str) == 0) {
            return arb.m5030a(packageManager, str);
        }
        Log.w("InstanceID/Rpc", new StringBuilder((String.valueOf(str).length() + 56) + String.valueOf(str2).length()).append("Possible malicious package ").append(str).append(" declares ").append(str2).append(" without permission").toString());
        return false;
    }

    /* renamed from: b */
    private Intent m5032b(Bundle bundle, KeyPair keyPair) throws IOException {
        Intent intent;
        ConditionVariable conditionVariable = new ConditionVariable();
        String c = arb.m5036c();
        synchronized (getClass()) {
            this.f4001h.put(c, conditionVariable);
        }
        m5041a(bundle, keyPair, c);
        conditionVariable.block(30000);
        synchronized (getClass()) {
            Object remove = this.f4001h.remove(c);
            if (remove instanceof Intent) {
                intent = (Intent) remove;
            } else if (remove instanceof String) {
                throw new IOException((String) remove);
            } else {
                String valueOf = String.valueOf(remove);
                Log.w("InstanceID/Rpc", new StringBuilder(String.valueOf(valueOf).length() + 12).append("No response ").append(valueOf).toString());
                throw new IOException("TIMEOUT");
            }
        }
        return intent;
    }

    /* renamed from: b */
    public static String m5033b(Context context) {
        if (f3994a != null) {
            return f3994a;
        }
        f3996c = Process.myUid();
        PackageManager packageManager = context.getPackageManager();
        if (aqd.m4923m()) {
            if (arb.m5034b(packageManager) || arb.m5029a(packageManager)) {
                return f3994a;
            }
        } else if (arb.m5029a(packageManager) || arb.m5034b(packageManager)) {
            return f3994a;
        }
        Log.w("InstanceID/Rpc", "Failed to resolve IID implementation package, falling back");
        if (arb.m5030a(packageManager, "com.google.android.gms")) {
            f3995b = aqd.m4923m();
            return f3994a;
        } else if (VERSION.SDK_INT >= 21 || !arb.m5030a(packageManager, "com.google.android.gsf")) {
            Log.w("InstanceID/Rpc", "Google Play services is missing, unable to get tokens");
            return null;
        } else {
            f3995b = false;
            return f3994a;
        }
    }

    /* renamed from: b */
    private static boolean m5034b(PackageManager packageManager) {
        for (ResolveInfo resolveInfo : packageManager.queryBroadcastReceivers(new Intent("com.google.iid.TOKEN_REQUEST"), 0)) {
            if (arb.m5031a(packageManager, resolveInfo.activityInfo.packageName, "com.google.iid.TOKEN_REQUEST")) {
                f3995b = true;
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    private static int m5035c(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(arb.m5033b(context), 0).versionCode;
        } catch (NameNotFoundException e) {
            return -1;
        }
    }

    /* renamed from: c */
    public static synchronized String m5036c() {
        String num;
        synchronized (arb.class) {
            int i = f3998e;
            f3998e = i + 1;
            num = Integer.toString(i);
        }
        return num;
    }

    /* renamed from: a */
    Intent m5037a(Bundle bundle, KeyPair keyPair) throws IOException {
        Intent b = m5032b(bundle, keyPair);
        if (b == null || !b.hasExtra("google.messenger")) {
            return b;
        }
        b = m5032b(bundle, keyPair);
        return (b == null || !b.hasExtra("google.messenger")) ? b : null;
    }

    /* renamed from: a */
    void m5038a() {
        if (this.f4002i == null) {
            arb.m5033b(this.f4000g);
            this.f4002i = new Messenger(new Handler(this, Looper.getMainLooper()) {
                /* renamed from: a */
                final /* synthetic */ arb f3992a;

                public void handleMessage(Message message) {
                    this.f3992a.m5042a(message);
                }
            });
        }
    }

    /* renamed from: a */
    synchronized void m5039a(Intent intent) {
        if (this.f4005l == null) {
            Intent intent2 = new Intent();
            intent2.setPackage("com.google.example.invalidpackage");
            this.f4005l = PendingIntent.getBroadcast(this.f4000g, 0, intent2, 0);
        }
        intent.putExtra("app", this.f4005l);
    }

    /* renamed from: a */
    protected void m5040a(Intent intent, String str) {
        this.f4006m = SystemClock.elapsedRealtime();
        intent.putExtra("kid", new StringBuilder(String.valueOf(str).length() + 5).append("|ID|").append(str).append("|").toString());
        intent.putExtra("X-kid", new StringBuilder(String.valueOf(str).length() + 5).append("|ID|").append(str).append("|").toString());
        boolean equals = "com.google.android.gsf".equals(f3994a);
        String stringExtra = intent.getStringExtra("useGsf");
        if (stringExtra != null) {
            equals = "1".equals(stringExtra);
        }
        if (Log.isLoggable("InstanceID/Rpc", 3)) {
            String valueOf = String.valueOf(intent.getExtras());
            Log.d("InstanceID/Rpc", new StringBuilder(String.valueOf(valueOf).length() + 8).append("Sending ").append(valueOf).toString());
        }
        if (this.f4003j != null) {
            intent.putExtra("google.messenger", this.f4002i);
            Message obtain = Message.obtain();
            obtain.obj = intent;
            try {
                this.f4003j.send(obtain);
                return;
            } catch (RemoteException e) {
                if (Log.isLoggable("InstanceID/Rpc", 3)) {
                    Log.d("InstanceID/Rpc", "Messenger failed, fallback to startService");
                }
            }
        }
        if (equals) {
            m5044b();
            this.f4000g.sendBroadcast(intent);
            return;
        }
        intent.putExtra("google.messenger", this.f4002i);
        intent.putExtra("messenger2", "1");
        if (this.f4004k != null) {
            Message obtain2 = Message.obtain();
            obtain2.obj = intent;
            try {
                this.f4004k.m19614a(obtain2);
                return;
            } catch (RemoteException e2) {
                if (Log.isLoggable("InstanceID/Rpc", 3)) {
                    Log.d("InstanceID/Rpc", "Messenger failed, fallback to startService");
                }
            }
        }
        if (f3995b) {
            this.f4000g.sendBroadcast(intent);
        } else {
            this.f4000g.startService(intent);
        }
    }

    /* renamed from: a */
    void m5041a(Bundle bundle, KeyPair keyPair, String str) throws IOException {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.f4010q == 0 || elapsedRealtime > this.f4010q) {
            m5038a();
            if (f3994a == null) {
                throw new IOException("MISSING_INSTANCEID_SERVICE");
            }
            this.f4006m = SystemClock.elapsedRealtime();
            Intent intent = new Intent(f3995b ? "com.google.iid.TOKEN_REQUEST" : "com.google.android.c2dm.intent.REGISTER");
            intent.setPackage(f3994a);
            bundle.putString("gmsv", Integer.toString(arb.m5035c(this.f4000g)));
            bundle.putString("osv", Integer.toString(VERSION.SDK_INT));
            bundle.putString("app_ver", Integer.toString(aqy.m5003a(this.f4000g)));
            bundle.putString("app_ver_name", aqy.m5007b(this.f4000g));
            bundle.putString("cliv", "iid-10260000");
            bundle.putString(AdDatabaseHelper.COLUMN_APPID, aqy.m5005a(keyPair));
            bundle.putString("pub2", aqy.m5006a(keyPair.getPublic().getEncoded()));
            bundle.putString("sig", arb.m5023a(keyPair, this.f4000g.getPackageName(), r0));
            intent.putExtras(bundle);
            m5039a(intent);
            m5040a(intent, str);
            return;
        }
        Log.w("InstanceID/Rpc", "Backoff mode, next request attempt: " + (this.f4010q - elapsedRealtime) + " interval: " + this.f4009p);
        throw new IOException("RETRY_LATER");
    }

    /* renamed from: a */
    public void m5042a(Message message) {
        if (message != null) {
            if (message.obj instanceof Intent) {
                Intent intent = (Intent) message.obj;
                intent.setExtrasClassLoader(MessengerCompat.class.getClassLoader());
                if (intent.hasExtra("google.messenger")) {
                    Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
                    if (parcelableExtra instanceof MessengerCompat) {
                        this.f4004k = (MessengerCompat) parcelableExtra;
                    }
                    if (parcelableExtra instanceof Messenger) {
                        this.f4003j = (Messenger) parcelableExtra;
                    }
                }
                m5046d((Intent) message.obj);
                return;
            }
            Log.w("InstanceID/Rpc", "Dropping invalid message");
        }
    }

    /* renamed from: b */
    String m5043b(Intent intent) throws IOException {
        if (intent == null) {
            throw new IOException(GoogleCloudMessaging.ERROR_SERVICE_NOT_AVAILABLE);
        }
        String stringExtra = intent.getStringExtra("registration_id");
        if (stringExtra == null) {
            stringExtra = intent.getStringExtra("unregistered");
        }
        intent.getLongExtra("Retry-After", 0);
        if (stringExtra != null) {
            return stringExtra;
        }
        stringExtra = intent.getStringExtra("error");
        if (stringExtra != null) {
            throw new IOException(stringExtra);
        }
        String valueOf = String.valueOf(intent.getExtras());
        Log.w("InstanceID/Rpc", new StringBuilder(String.valueOf(valueOf).length() + 29).append("Unexpected response from GCM ").append(valueOf).toString(), new Throwable());
        throw new IOException(GoogleCloudMessaging.ERROR_SERVICE_NOT_AVAILABLE);
    }

    /* renamed from: b */
    void m5044b() {
        synchronized (this) {
            if (f3999f == null) {
                f3999f = new C07192(this);
                if (Log.isLoggable("InstanceID/Rpc", 3)) {
                    Log.d("InstanceID/Rpc", "Registered GSF callback receiver");
                }
                IntentFilter intentFilter = new IntentFilter("com.google.android.c2dm.intent.REGISTRATION");
                intentFilter.addCategory(this.f4000g.getPackageName());
                this.f4000g.registerReceiver(f3999f, intentFilter, "com.google.android.c2dm.permission.SEND", null);
            }
        }
    }

    /* renamed from: c */
    void m5045c(Intent intent) {
        String stringExtra = intent.getStringExtra("error");
        if (stringExtra == null) {
            String valueOf = String.valueOf(intent.getExtras());
            Log.w("InstanceID/Rpc", new StringBuilder(String.valueOf(valueOf).length() + 49).append("Unexpected response, no error or registration id ").append(valueOf).toString());
            return;
        }
        if (Log.isLoggable("InstanceID/Rpc", 3)) {
            valueOf = "InstanceID/Rpc";
            String str = "Received InstanceID error ";
            String valueOf2 = String.valueOf(stringExtra);
            Log.d(valueOf, valueOf2.length() != 0 ? str.concat(valueOf2) : new String(str));
        }
        if (stringExtra.startsWith("|")) {
            String[] split = stringExtra.split("\\|");
            if (!"ID".equals(split[1])) {
                String str2 = "InstanceID/Rpc";
                String str3 = "Unexpected structured response ";
                valueOf2 = String.valueOf(stringExtra);
                Log.w(str2, valueOf2.length() != 0 ? str3.concat(valueOf2) : new String(str3));
            }
            if (split.length > 2) {
                valueOf2 = split[2];
                valueOf = split[3];
                if (valueOf.startsWith(":")) {
                    valueOf = valueOf.substring(1);
                }
            } else {
                valueOf = "UNKNOWN";
                valueOf2 = null;
            }
            intent.putExtra("error", valueOf);
        } else {
            valueOf2 = null;
            valueOf = stringExtra;
        }
        if (valueOf2 == null) {
            m5024a((Object) valueOf);
        } else {
            m5027a(valueOf2, (Object) valueOf);
        }
        long longExtra = intent.getLongExtra("Retry-After", 0);
        if (longExtra > 0) {
            this.f4007n = SystemClock.elapsedRealtime();
            this.f4009p = ((int) longExtra) * 1000;
            this.f4010q = SystemClock.elapsedRealtime() + ((long) this.f4009p);
            Log.w("InstanceID/Rpc", "Explicit request from server to backoff: " + this.f4009p);
        } else if (GoogleCloudMessaging.ERROR_SERVICE_NOT_AVAILABLE.equals(valueOf) || "AUTHENTICATION_FAILED".equals(valueOf)) {
            m5026a(valueOf);
        }
    }

    /* renamed from: d */
    public void m5046d(Intent intent) {
        if (intent != null) {
            String action = intent.getAction();
            String stringExtra;
            if ("com.google.android.c2dm.intent.REGISTRATION".equals(action) || "com.google.android.gms.iid.InstanceID".equals(action)) {
                action = intent.getStringExtra("registration_id");
                stringExtra = action == null ? intent.getStringExtra("unregistered") : action;
                if (stringExtra == null) {
                    m5045c(intent);
                    return;
                }
                this.f4006m = SystemClock.elapsedRealtime();
                this.f4010q = 0;
                this.f4008o = 0;
                this.f4009p = 0;
                action = null;
                if (stringExtra.startsWith("|")) {
                    String[] split = stringExtra.split("\\|");
                    if (!"ID".equals(split[1])) {
                        String str = "InstanceID/Rpc";
                        String str2 = "Unexpected structured response ";
                        action = String.valueOf(stringExtra);
                        Log.w(str, action.length() != 0 ? str2.concat(action) : new String(str2));
                    }
                    stringExtra = split[2];
                    if (split.length > 4) {
                        if ("SYNC".equals(split[3])) {
                            InstanceIDListenerService.m19607a(this.f4000g);
                        } else if ("RST".equals(split[3])) {
                            InstanceIDListenerService.m19608a(this.f4000g, aqy.m5008c(this.f4000g).m5015d());
                            intent.removeExtra("registration_id");
                            m5027a(stringExtra, (Object) intent);
                            return;
                        }
                    }
                    action = split[split.length - 1];
                    if (action.startsWith(":")) {
                        action = action.substring(1);
                    }
                    intent.putExtra("registration_id", action);
                    action = stringExtra;
                }
                if (action == null) {
                    m5024a((Object) intent);
                } else {
                    m5027a(action, (Object) intent);
                }
            } else if (Log.isLoggable("InstanceID/Rpc", 3)) {
                stringExtra = "InstanceID/Rpc";
                String str3 = "Unexpected response ";
                action = String.valueOf(intent.getAction());
                Log.d(stringExtra, action.length() != 0 ? str3.concat(action) : new String(str3));
            }
        } else if (Log.isLoggable("InstanceID/Rpc", 3)) {
            Log.d("InstanceID/Rpc", "Unexpected response: null");
        }
    }
}
