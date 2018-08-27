package com.p000;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/* renamed from: dqd */
public final class dqd {
    /* renamed from: a */
    public static final String f22574a;
    /* renamed from: b */
    public static final String f22575b;
    /* renamed from: c */
    public static final int f22576c;
    /* renamed from: d */
    private static final Constructor<?> f22577d;
    /* renamed from: e */
    private static final Method f22578e;
    /* renamed from: f */
    private static final Method f22579f;
    /* renamed from: g */
    private static final Method f22580g;
    /* renamed from: h */
    private static final Method f22581h;
    /* renamed from: i */
    private static final Class<?> f22582i;
    /* renamed from: j */
    private Object f22583j;
    /* renamed from: k */
    private C5037a f22584k;

    /* renamed from: dqd$1 */
    class C50361 implements InvocationHandler {
        /* renamed from: a */
        private /* synthetic */ dqd f22572a;

        C50361(dqd dqd) {
            this.f22572a = dqd;
        }

        public final Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            if (method.getName().equals("onServiceConnected")) {
                if (this.f22572a.f22584k != null) {
                    this.f22572a.f22584k.m28696a();
                }
            } else if (method.getName().equals("onServiceDisconnected") && this.f22572a.f22584k != null) {
                this.f22572a.f22584k.m28697b();
            }
            return null;
        }
    }

    /* renamed from: dqd$a */
    public interface C5037a {
        /* renamed from: a */
        /* synthetic */ dqe f22573a;

        C5037a(dqe dqe) {
            this.f22573a = dqe;
        }

        /* renamed from: a */
        final void m28696a() {
            if (dqe.f22590d.mo4278c()) {
                dqe.f22590d.mo4277c((Object) "BluetoothHeadsetOEM reflected onServiceConnected()");
            }
            synchronized (this.f22573a.f22598l) {
                if (this.f22573a.f22594h) {
                    this.f22573a.m28711f();
                } else {
                    this.f22573a.f22595i = true;
                    this.f22573a.f22598l.notify();
                }
            }
        }

        /* renamed from: b */
        final void m28697b() {
            if (dqe.f22590d.mo4278c()) {
                dqe.f22590d.mo4277c((Object) "BluetoothHeadsetOEM reflected onServiceDisconnected()");
            }
            synchronized (this.f22573a.f22598l) {
                this.f22573a.m28711f();
                if (!this.f22573a.f22594h) {
                    this.f22573a.f22595i = true;
                    this.f22573a.f22598l.notify();
                }
            }
        }
    }

    static {
        dqf dqf = new dqf();
        Class a = dqf.m28716a("android.bluetooth.BluetoothHeadset");
        f22577d = dqf.m28719a(a, Context.class, dqf.m28716a("android.bluetooth.BluetoothHeadset$ServiceListener"));
        if (dqf.m28721b(a, "getState", new Class[0]) == null) {
            dqf.m28720a(a, "getState", BluetoothDevice.class);
        }
        f22580g = dqf.m28720a(a, "getCurrentHeadset", new Class[0]);
        dqf.m28720a(a, "connectHeadset", BluetoothDevice.class);
        if (dqf.m28721b(a, "disconnectHeadset", new Class[0]) == null) {
            dqf.m28720a(a, "disconnectHeadset", BluetoothDevice.class);
        }
        f22578e = dqf.m28720a(a, "startVoiceRecognition", new Class[0]);
        f22579f = dqf.m28720a(a, "stopVoiceRecognition", new Class[0]);
        f22581h = dqf.m28720a(a, "close", new Class[0]);
        dqf.m28720a(a, "getPriority", BluetoothDevice.class);
        dqf.m28720a(a, "setPriority", BluetoothDevice.class, Integer.TYPE);
        f22582i = r0;
        dqf.m28717a(a, "ACTION_STATE_CHANGED");
        f22574a = (String) dqf.m28717a(a, "ACTION_AUDIO_STATE_CHANGED");
        dqf.m28717a(a, "EXTRA_STATE");
        f22575b = (String) dqf.m28717a(a, "EXTRA_AUDIO_STATE");
        dqf.m28717a(a, "STATE_ERROR");
        dqf.m28717a(a, "STATE_DISCONNECTED");
        dqf.m28717a(a, "STATE_CONNECTING");
        dqf.m28717a(a, "STATE_CONNECTED");
        dqf.m28717a(a, "AUDIO_STATE_DISCONNECTED");
        f22576c = ((Integer) dqf.m28717a(a, "AUDIO_STATE_CONNECTED")).intValue();
        dqf.m28717a(a, "PRIORITY_OFF");
        dqf.m28718a(a, "PRIORITY_UNDEFINED", Integer.valueOf(-1));
    }

    public dqd(Context context, C5037a c5037a) {
        this.f22584k = c5037a;
        Object newProxyInstance = Proxy.newProxyInstance(getClass().getClassLoader(), new Class[]{f22582i}, new C50361(this));
        try {
            this.f22583j = f22577d.newInstance(new Object[]{context, newProxyInstance});
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public final BluetoothDevice m28699a() {
        try {
            if (f22580g != null) {
                return (BluetoothDevice) f22580g.invoke(this.f22583j, new Object[0]);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /* renamed from: b */
    public final boolean m28700b() {
        try {
            return ((Boolean) f22578e.invoke(this.f22583j, new Object[0])).booleanValue();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: c */
    public final boolean m28701c() {
        try {
            return ((Boolean) f22579f.invoke(this.f22583j, new Object[0])).booleanValue();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: d */
    public final void m28702d() {
        try {
            f22581h.invoke(this.f22583j, new Object[0]);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
