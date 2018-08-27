package com.p000;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.os.Looper;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.List;

/* renamed from: dqe */
public final class dqe {
    /* renamed from: a */
    public static String f22587a;
    /* renamed from: b */
    public static String f22588b;
    /* renamed from: c */
    public static int f22589c;
    /* renamed from: d */
    private static final rk f22590d = dnn.m28258a(dqc.class);
    /* renamed from: e */
    private Context f22591e;
    /* renamed from: f */
    private boolean f22592f;
    /* renamed from: g */
    private dqd f22593g = null;
    /* renamed from: h */
    private boolean f22594h = false;
    /* renamed from: i */
    private boolean f22595i = false;
    /* renamed from: j */
    private Object f22596j = null;
    /* renamed from: k */
    private final dqf f22597k;
    /* renamed from: l */
    private Object f22598l = new Object();

    /* renamed from: dqe$1 */
    class C50381 implements Runnable {
        /* renamed from: a */
        private /* synthetic */ Object[] f22585a;

        C50381(Object[] objArr) {
            this.f22585a = objArr;
        }

        public final void run() {
            Looper.prepare();
            this.f22585a[1] = BluetoothAdapter.getDefaultAdapter();
            this.f22585a[0] = new Boolean(true);
            Looper.loop();
        }
    }

    /* renamed from: dqe$2 */
    class C50392 implements InvocationHandler {
        /* renamed from: a */
        private /* synthetic */ dqe f22586a;

        C50392(dqe dqe) {
            this.f22586a = dqe;
        }

        public final Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            if (method.getName().equals("onServiceConnected")) {
                if (dqe.f22590d.mo4278c()) {
                    dqe.f22590d.mo4277c((Object) "BluetoothHeadsetOEM native onServiceConnected()");
                }
                synchronized (this.f22586a.f22598l) {
                    if (this.f22586a.f22594h) {
                        this.f22586a.m28705a(objArr[1]);
                    } else {
                        this.f22586a.f22595i = true;
                        this.f22586a.f22596j = objArr[1];
                        this.f22586a.f22598l.notify();
                    }
                }
            } else if (method.getName().equals("onServiceDisconnected")) {
                if (dqe.f22590d.mo4278c()) {
                    dqe.f22590d.mo4277c((Object) "BluetoothHeadsetOEM native onServiceDisconnected()");
                }
                synchronized (this.f22586a.f22598l) {
                    if (!this.f22586a.f22594h) {
                        this.f22586a.f22595i = true;
                        this.f22586a.f22598l.notify();
                    }
                }
            }
            return null;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public dqe(Context r13) {
        /*
        r12 = this;
        r0 = 0;
        r2 = 2;
        r5 = 1;
        r4 = 0;
        r12.<init>();
        r12.f22593g = r0;
        r12.f22594h = r4;
        r12.f22595i = r4;
        r12.f22596j = r0;
        r0 = new java.lang.Object;
        r0.<init>();
        r12.f22598l = r0;
        r12.f22591e = r13;
        r0 = new dqf;
        r0.<init>();
        r12.f22597k = r0;
        r0 = p000.dqa.f22560a;
        r1 = 10;
        if (r0 > r1) goto L_0x00b4;
    L_0x0025:
        r12.f22592f = r5;
        r0 = p000.dqd.f22574a;
        f22587a = r0;
        r0 = p000.dqd.f22575b;
        f22588b = r0;
        r0 = p000.dqd.f22576c;
        f22589c = r0;
        r0 = new dqd$a;
        r0.<init>(r12);
        r1 = r12.f22598l;
        monitor-enter(r1);
        r2 = java.lang.System.currentTimeMillis();	 Catch:{ all -> 0x0088 }
        r4 = new dqd;	 Catch:{ all -> 0x0088 }
        r5 = r12.f22591e;	 Catch:{ all -> 0x0088 }
        r4.<init>(r5, r0);	 Catch:{ all -> 0x0088 }
        r12.f22593g = r4;	 Catch:{ all -> 0x0088 }
        r0 = r12.f22598l;	 Catch:{ InterruptedException -> 0x006a }
        r4 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r0.wait(r4);	 Catch:{ InterruptedException -> 0x006a }
    L_0x004f:
        r0 = r12.f22595i;	 Catch:{ all -> 0x0088 }
        if (r0 != 0) goto L_0x008b;
    L_0x0053:
        r0 = f22590d;	 Catch:{ all -> 0x0088 }
        r0 = r0.mo4282e();	 Catch:{ all -> 0x0088 }
        if (r0 == 0) goto L_0x0062;
    L_0x005b:
        r0 = f22590d;	 Catch:{ all -> 0x0088 }
        r2 = "BluetoothHeadsetOEM reflected service NOT connected in time. Gave up!!!";
        r0.mo4281e(r2);	 Catch:{ all -> 0x0088 }
    L_0x0062:
        r0 = 1;
        r12.f22594h = r0;	 Catch:{ all -> 0x0088 }
        r12.m28711f();	 Catch:{ all -> 0x0088 }
    L_0x0068:
        monitor-exit(r1);	 Catch:{ all -> 0x0088 }
    L_0x0069:
        return;
    L_0x006a:
        r0 = move-exception;
        r4 = f22590d;	 Catch:{ all -> 0x0088 }
        r4 = r4.mo4282e();	 Catch:{ all -> 0x0088 }
        if (r4 == 0) goto L_0x004f;
    L_0x0073:
        r4 = f22590d;	 Catch:{ all -> 0x0088 }
        r5 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0088 }
        r6 = "BluetoothHeadsetOEM reflected mHeadsetSyncObj.wait() threw exception:";
        r5.<init>(r6);	 Catch:{ all -> 0x0088 }
        r0 = r5.append(r0);	 Catch:{ all -> 0x0088 }
        r0 = r0.toString();	 Catch:{ all -> 0x0088 }
        r4.mo4281e(r0);	 Catch:{ all -> 0x0088 }
        goto L_0x004f;
    L_0x0088:
        r0 = move-exception;
        monitor-exit(r1);
        throw r0;
    L_0x008b:
        r0 = f22590d;	 Catch:{ all -> 0x0088 }
        r0 = r0.mo4278c();	 Catch:{ all -> 0x0088 }
        if (r0 == 0) goto L_0x0068;
    L_0x0093:
        r0 = f22590d;	 Catch:{ all -> 0x0088 }
        r4 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0088 }
        r5 = "BluetoothHeadsetOEM reflected service connection took ";
        r4.<init>(r5);	 Catch:{ all -> 0x0088 }
        r6 = java.lang.System.currentTimeMillis();	 Catch:{ all -> 0x0088 }
        r2 = r6 - r2;
        r2 = r4.append(r2);	 Catch:{ all -> 0x0088 }
        r3 = "ms";
        r2 = r2.append(r3);	 Catch:{ all -> 0x0088 }
        r2 = r2.toString();	 Catch:{ all -> 0x0088 }
        r0.mo4277c(r2);	 Catch:{ all -> 0x0088 }
        goto L_0x0068;
    L_0x00b4:
        r12.f22592f = r4;
        r0 = r12.f22597k;
        r0 = "android.bluetooth.BluetoothHeadset";
        r1 = p000.dqf.m28716a(r0);
        r0 = r12.f22597k;
        r0 = "ACTION_AUDIO_STATE_CHANGED";
        r0 = p000.dqf.m28717a(r1, r0);
        r0 = (java.lang.String) r0;
        f22587a = r0;
        r0 = r12.f22597k;
        r0 = "EXTRA_STATE";
        r0 = p000.dqf.m28717a(r1, r0);
        r0 = (java.lang.String) r0;
        f22588b = r0;
        r0 = r12.f22597k;
        r0 = "STATE_AUDIO_CONNECTED";
        r0 = p000.dqf.m28717a(r1, r0);
        r0 = (java.lang.Integer) r0;
        r0 = r0.intValue();
        f22589c = r0;
        r0 = p000.dqa.f22560a;
        r1 = 11;
        if (r0 == r1) goto L_0x00f8;
    L_0x00ec:
        r0 = p000.dqa.f22560a;
        r1 = 12;
        if (r0 == r1) goto L_0x00f8;
    L_0x00f2:
        r0 = p000.dqa.f22560a;
        r1 = 13;
        if (r0 != r1) goto L_0x016c;
    L_0x00f8:
        r0 = new java.lang.Object[r2];
        r1 = new java.lang.Thread;
        r2 = new dqe$1;
        r2.<init>(r0);
        r1.<init>(r2);
        r1.start();
    L_0x0107:
        r1 = r0[r4];
        if (r1 != 0) goto L_0x0113;
    L_0x010b:
        r2 = 10;
        java.lang.Thread.sleep(r2);	 Catch:{ Exception -> 0x0111 }
        goto L_0x0107;
    L_0x0111:
        r1 = move-exception;
        goto L_0x0107;
    L_0x0113:
        r0 = r0[r5];
        r0 = (android.bluetooth.BluetoothAdapter) r0;
        r1 = r0;
    L_0x0118:
        r0 = r12.f22597k;
        r0 = "android.bluetooth.BluetoothProfile$ServiceListener";
        r2 = p000.dqf.m28716a(r0);
        r0 = r12.getClass();
        r0 = r0.getClassLoader();
        r3 = new java.lang.Class[r5];
        r3[r4] = r2;
        r4 = new dqe$2;
        r4.<init>(r12);
        r3 = java.lang.reflect.Proxy.newProxyInstance(r0, r3, r4);
        r4 = r12.f22598l;
        monitor-enter(r4);
        r6 = java.lang.System.currentTimeMillis();	 Catch:{ all -> 0x0169 }
        r0 = r12.f22597k;	 Catch:{ all -> 0x0169 }
        r0 = "android.bluetooth.BluetoothProfile";
        r5 = p000.dqf.m28716a(r0);	 Catch:{ all -> 0x0169 }
        r0 = r12.f22597k;	 Catch:{ all -> 0x0169 }
        r0 = "android.bluetooth.BluetoothAdapter";
        r8 = p000.dqf.m28716a(r0);	 Catch:{ all -> 0x0169 }
        r0 = r12.f22597k;	 Catch:{ Exception -> 0x0172 }
        r0 = "isEnabled";
        r9 = 0;
        r9 = new java.lang.Class[r9];	 Catch:{ Exception -> 0x0172 }
        r0 = p000.dqf.m28720a(r8, r0, r9);	 Catch:{ Exception -> 0x0172 }
        r9 = 0;
        r9 = new java.lang.Object[r9];	 Catch:{ Exception -> 0x0172 }
        r0 = r0.invoke(r1, r9);	 Catch:{ Exception -> 0x0172 }
        r0 = (java.lang.Boolean) r0;	 Catch:{ Exception -> 0x0172 }
        r0 = r0.booleanValue();	 Catch:{ Exception -> 0x0172 }
        if (r0 != 0) goto L_0x0176;
    L_0x0166:
        monitor-exit(r4);	 Catch:{ all -> 0x0169 }
        goto L_0x0069;
    L_0x0169:
        r0 = move-exception;
        monitor-exit(r4);
        throw r0;
    L_0x016c:
        r0 = android.bluetooth.BluetoothAdapter.getDefaultAdapter();
        r1 = r0;
        goto L_0x0118;
    L_0x0172:
        r0 = move-exception;
        r0.printStackTrace();	 Catch:{ all -> 0x0169 }
    L_0x0176:
        r0 = r12.f22597k;	 Catch:{ all -> 0x0169 }
        r0 = "getProfileProxy";
        r9 = 3;
        r9 = new java.lang.Class[r9];	 Catch:{ all -> 0x0169 }
        r10 = 0;
        r11 = android.content.Context.class;
        r9[r10] = r11;	 Catch:{ all -> 0x0169 }
        r10 = 1;
        r9[r10] = r2;	 Catch:{ all -> 0x0169 }
        r2 = 2;
        r10 = java.lang.Integer.TYPE;	 Catch:{ all -> 0x0169 }
        r9[r2] = r10;	 Catch:{ all -> 0x0169 }
        r0 = p000.dqf.m28720a(r8, r0, r9);	 Catch:{ all -> 0x0169 }
        r2 = 3;
        r2 = new java.lang.Object[r2];	 Catch:{ Exception -> 0x01c5 }
        r8 = 0;
        r2[r8] = r13;	 Catch:{ Exception -> 0x01c5 }
        r8 = 1;
        r2[r8] = r3;	 Catch:{ Exception -> 0x01c5 }
        r3 = 2;
        r8 = r12.f22597k;	 Catch:{ Exception -> 0x01c5 }
        r8 = "HEADSET";
        r5 = p000.dqf.m28717a(r5, r8);	 Catch:{ Exception -> 0x01c5 }
        r2[r3] = r5;	 Catch:{ Exception -> 0x01c5 }
        r0.invoke(r1, r2);	 Catch:{ Exception -> 0x01c5 }
    L_0x01a5:
        r0 = r12.f22598l;	 Catch:{ InterruptedException -> 0x01ca }
        r2 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r0.wait(r2);	 Catch:{ InterruptedException -> 0x01ca }
    L_0x01ac:
        r0 = r12.f22595i;	 Catch:{ all -> 0x0169 }
        if (r0 != 0) goto L_0x01e8;
    L_0x01b0:
        r0 = f22590d;	 Catch:{ all -> 0x0169 }
        r0 = r0.mo4282e();	 Catch:{ all -> 0x0169 }
        if (r0 == 0) goto L_0x01bf;
    L_0x01b8:
        r0 = f22590d;	 Catch:{ all -> 0x0169 }
        r1 = "BluetoothHeadsetOEM native service NOT connected in time. Gave up!!!";
        r0.mo4281e(r1);	 Catch:{ all -> 0x0169 }
    L_0x01bf:
        r0 = 1;
        r12.f22594h = r0;	 Catch:{ all -> 0x0169 }
    L_0x01c2:
        monitor-exit(r4);	 Catch:{ all -> 0x0169 }
        goto L_0x0069;
    L_0x01c5:
        r0 = move-exception;
        r0.printStackTrace();	 Catch:{ all -> 0x0169 }
        goto L_0x01a5;
    L_0x01ca:
        r0 = move-exception;
        r1 = f22590d;	 Catch:{ all -> 0x0169 }
        r1 = r1.mo4282e();	 Catch:{ all -> 0x0169 }
        if (r1 == 0) goto L_0x01ac;
    L_0x01d3:
        r1 = f22590d;	 Catch:{ all -> 0x0169 }
        r2 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0169 }
        r3 = "BluetoothHeadsetOEM native mHeadsetSyncObj.wait() threw exception:";
        r2.<init>(r3);	 Catch:{ all -> 0x0169 }
        r0 = r2.append(r0);	 Catch:{ all -> 0x0169 }
        r0 = r0.toString();	 Catch:{ all -> 0x0169 }
        r1.mo4281e(r0);	 Catch:{ all -> 0x0169 }
        goto L_0x01ac;
    L_0x01e8:
        r0 = f22590d;	 Catch:{ all -> 0x0169 }
        r0 = r0.mo4278c();	 Catch:{ all -> 0x0169 }
        if (r0 == 0) goto L_0x01c2;
    L_0x01f0:
        r0 = f22590d;	 Catch:{ all -> 0x0169 }
        r1 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0169 }
        r2 = "BluetoothHeadsetOEM native service connection took ";
        r1.<init>(r2);	 Catch:{ all -> 0x0169 }
        r2 = java.lang.System.currentTimeMillis();	 Catch:{ all -> 0x0169 }
        r2 = r2 - r6;
        r1 = r1.append(r2);	 Catch:{ all -> 0x0169 }
        r2 = "ms";
        r1 = r1.append(r2);	 Catch:{ all -> 0x0169 }
        r1 = r1.toString();	 Catch:{ all -> 0x0169 }
        r0.mo4277c(r1);	 Catch:{ all -> 0x0169 }
        goto L_0x01c2;
        */
        throw new UnsupportedOperationException("Method not decompiled: dqe.<init>(android.content.Context):void");
    }

    /* renamed from: a */
    private void m28705a(Object obj) {
        dqf dqf = this.f22597k;
        Class a = dqf.m28716a("android.bluetooth.BluetoothProfile");
        dqf dqf2 = this.f22597k;
        Class a2 = dqf.m28716a("android.bluetooth.BluetoothAdapter");
        dqf dqf3 = this.f22597k;
        Method b = dqf.m28721b(a2, "closeProfileProxy", Integer.TYPE, a);
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        try {
            r3 = new Object[2];
            dqf dqf4 = this.f22597k;
            r3[0] = (Integer) dqf.m28717a(a, "HEADSET");
            r3[1] = obj;
            b.invoke(defaultAdapter, r3);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: f */
    private void m28711f() {
        if (this.f22593g != null) {
            this.f22593g.m28702d();
            this.f22593g = null;
        }
    }

    /* renamed from: a */
    public final BluetoothDevice m28712a() {
        if (this.f22592f && this.f22593g != null) {
            return this.f22593g.m28699a();
        }
        if (this.f22592f || this.f22596j == null) {
            return null;
        }
        List list;
        dqf dqf = this.f22597k;
        Class a = dqf.m28716a("android.bluetooth.BluetoothProfile");
        dqf dqf2 = this.f22597k;
        try {
            list = (List) dqf.m28721b(a, "getConnectedDevices", new Class[0]).invoke(this.f22596j, new Object[0]);
        } catch (Exception e) {
            e.printStackTrace();
            list = null;
        }
        return (list == null || list.size() <= 0) ? null : (BluetoothDevice) list.get(0);
    }

    /* renamed from: b */
    public final boolean m28713b() {
        if (this.f22592f) {
            return this.f22593g == null ? false : this.f22593g.m28700b();
        } else {
            if (!f22590d.mo4282e()) {
                return false;
            }
            f22590d.mo4281e("BluetoothHeadsetOEM startVoiceRecognition() called on native headset!!!");
            return false;
        }
    }

    /* renamed from: c */
    public final boolean m28714c() {
        if (this.f22592f) {
            return this.f22593g == null ? false : this.f22593g.m28701c();
        } else {
            if (!f22590d.mo4282e()) {
                return false;
            }
            f22590d.mo4281e("BluetoothHeadsetOEM stopVoiceRecognition() called on native headset!!!");
            return false;
        }
    }

    /* renamed from: d */
    public final void m28715d() {
        if (this.f22592f) {
            m28711f();
        } else if (this.f22596j != null) {
            m28705a(this.f22596j);
            this.f22596j = null;
        }
    }
}
