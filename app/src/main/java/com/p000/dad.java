package com.p000;

import com.facebook.internal.ServerProtocol;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Enumeration;
import java.util.Vector;
import p000.rl.C4177b;
import p000.sa.C5753a;
import p000.sa.C5754b;
import p000.sa.C5755c;
import p000.sa.C5756d;
import p000.sa.C5757e;
import p000.sa.C5758f;

/* renamed from: dad */
public class dad implements C4177b, sa {
    /* renamed from: a */
    private static final rk f20913a = dnn.m28258a(dad.class);
    /* renamed from: c */
    private static final Integer f20914c = new Integer(0);
    /* renamed from: d */
    private static final Integer f20915d = new Integer(1);
    /* renamed from: e */
    private static final Integer f20916e = new Integer(2);
    /* renamed from: f */
    private static final Integer f20917f = new Integer(3);
    /* renamed from: b */
    private rl f20918b = null;
    /* renamed from: g */
    private Object f20919g = new Object();

    /* renamed from: dad$a */
    static class C4730a {
        /* renamed from: a */
        Socket f20893a;
        /* renamed from: b */
        C5753a f20894b;
        /* renamed from: c */
        InputStream f20895c = null;
        /* renamed from: d */
        OutputStream f20896d = null;
        /* renamed from: e */
        Object f20897e = null;
        /* renamed from: f */
        C4732c f20898f = null;

        public C4730a(Socket socket, C5753a c5753a, InputStream inputStream, OutputStream outputStream, C4732c c4732c) {
            this.f20893a = socket;
            this.f20894b = c5753a;
            this.f20897e = null;
            this.f20895c = inputStream;
            this.f20896d = outputStream;
            this.f20898f = c4732c;
        }
    }

    /* renamed from: dad$b */
    class C4731b {
        /* renamed from: a */
        byte[] f20899a;
        /* renamed from: b */
        int f20900b;
        /* renamed from: c */
        C5757e f20901c;
        /* renamed from: d */
        Object f20902d;

        public C4731b(byte[] bArr, int i, C5757e c5757e, Object obj) {
            this.f20899a = bArr;
            this.f20900b = i;
            this.f20901c = c5757e;
            this.f20902d = obj;
        }
    }

    /* renamed from: dad$c */
    class C4732c extends Thread {
        /* renamed from: a */
        private String f20903a = null;
        /* renamed from: b */
        private int f20904b;
        /* renamed from: c */
        private C5756d f20905c = null;
        /* renamed from: d */
        private C5753a f20906d = null;
        /* renamed from: e */
        private C5755c f20907e = C5755c.f25451a;
        /* renamed from: f */
        private boolean f20908f = false;
        /* renamed from: g */
        private Vector f20909g = null;
        /* renamed from: h */
        private dql f20910h = null;
        /* renamed from: i */
        private boolean f20911i = false;
        /* renamed from: j */
        private /* synthetic */ dad f20912j;

        public C4732c(dad dad, String str, int i, dql dql, C5756d c5756d, C5753a c5753a) {
            this.f20912j = dad;
            this.f20903a = str;
            this.f20904b = i;
            this.f20905c = c5756d;
            this.f20906d = c5753a;
            this.f20909g = new Vector();
            this.f20911i = true;
            this.f20910h = dql;
        }

        public C4732c(dad dad, String str, int i, C5756d c5756d, C5753a c5753a) {
            this.f20912j = dad;
            this.f20903a = str;
            this.f20904b = i;
            this.f20905c = c5756d;
            this.f20906d = c5753a;
            this.f20909g = new Vector();
        }

        /* renamed from: a */
        public final C5755c m25993a(C4731b c4731b) {
            if (this.f20908f) {
                if (dad.f20913a.mo4282e()) {
                    dad.f20913a.mo4281e("SocketReadThread is already stopping!");
                }
                return C5755c.f25452b;
            }
            C5755c c5755c;
            Object obj;
            C5755c c5755c2 = C5755c.f25451a;
            synchronized (this.f20912j.f20919g) {
                if (this.f20909g == null) {
                    c5755c = C5755c.f25452b;
                    obj = "SocketReadThread: queue is null!!";
                } else {
                    this.f20909g.addElement(c4731b);
                    c5755c = c5755c2;
                    obj = null;
                }
                if (dad.f20913a.mo4276b()) {
                    dad.f20913a.mo4275b((Object) "addNewJob() notifying");
                }
                this.f20912j.f20919g.notify();
            }
            if (!dad.f20913a.mo4282e() || obj == null) {
                return c5755c;
            }
            dad.f20913a.mo4281e(obj);
            return c5755c;
        }

        /* renamed from: a */
        public final void m25994a() {
            synchronized (this.f20912j.f20919g) {
                this.f20908f = true;
                this.f20909g.removeAllElements();
                this.f20909g = null;
                this.f20912j.f20919g.notify();
            }
        }

        /* renamed from: b */
        public final void m25995b() {
            Object obj = null;
            synchronized (this.f20912j.f20919g) {
                if (this.f20909g == null) {
                    obj = "SocketReadThread.cleanPendingJobs(): queue is null!!";
                } else {
                    this.f20909g.removeAllElements();
                }
            }
            if (dad.f20913a.mo4282e() && obj != null) {
                dad.f20913a.mo4281e(obj);
            }
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
            r12 = this;
            r11 = 3;
            r10 = 2;
            r9 = 0;
            r8 = 1;
            r7 = 0;
            r1 = p000.dad.f20913a;
            r1 = r1.mo4276b();
            if (r1 == 0) goto L_0x0039;
        L_0x000f:
            r1 = p000.dad.f20913a;
            r2 = new java.lang.StringBuilder;
            r3 = "Open Socket connection on host:- [";
            r2.<init>(r3);
            r3 = r12.f20903a;
            r2 = r2.append(r3);
            r3 = "] and port[";
            r2 = r2.append(r3);
            r3 = r12.f20904b;
            r2 = r2.append(r3);
            r3 = "]";
            r2 = r2.append(r3);
            r2 = r2.toString();
            r1.mo4275b(r2);
        L_0x0039:
            r1 = r12.f20911i;	 Catch:{ UnknownHostException -> 0x008c, IOException -> 0x00e5, SecurityException -> 0x013f, Throwable -> 0x0199 }
            if (r1 == 0) goto L_0x0082;
        L_0x003d:
            r1 = r12.f20903a;	 Catch:{ UnknownHostException -> 0x008c, IOException -> 0x00e5, SecurityException -> 0x013f, Throwable -> 0x0199 }
            r2 = r12.f20904b;	 Catch:{ UnknownHostException -> 0x008c, IOException -> 0x00e5, SecurityException -> 0x013f, Throwable -> 0x0199 }
            r3 = r12.f20910h;	 Catch:{ UnknownHostException -> 0x008c, IOException -> 0x00e5, SecurityException -> 0x013f, Throwable -> 0x0199 }
            r2 = p000.dqj.m28734a(r1, r2, r3);	 Catch:{ UnknownHostException -> 0x008c, IOException -> 0x00e5, SecurityException -> 0x013f, Throwable -> 0x0199 }
        L_0x0047:
            r1 = r2.isConnected();	 Catch:{ UnknownHostException -> 0x008c, IOException -> 0x00e5, SecurityException -> 0x013f, Throwable -> 0x0199 }
            if (r1 != 0) goto L_0x01f3;
        L_0x004d:
            r1 = p000.dad.f20913a;	 Catch:{ UnknownHostException -> 0x008c, IOException -> 0x00e5, SecurityException -> 0x013f, Throwable -> 0x0199 }
            r1 = r1.mo4282e();	 Catch:{ UnknownHostException -> 0x008c, IOException -> 0x00e5, SecurityException -> 0x013f, Throwable -> 0x0199 }
            if (r1 == 0) goto L_0x0060;
        L_0x0057:
            r1 = p000.dad.f20913a;	 Catch:{ UnknownHostException -> 0x008c, IOException -> 0x00e5, SecurityException -> 0x013f, Throwable -> 0x0199 }
            r2 = "SocketReadThread NETWORK_ERROR. !sock.isConnected()";
            r1.mo4281e(r2);	 Catch:{ UnknownHostException -> 0x008c, IOException -> 0x00e5, SecurityException -> 0x013f, Throwable -> 0x0199 }
        L_0x0060:
            r1 = r12.f20912j;	 Catch:{ UnknownHostException -> 0x008c, IOException -> 0x00e5, SecurityException -> 0x013f, Throwable -> 0x0199 }
            r2 = 5;
            r2 = new java.lang.Object[r2];	 Catch:{ UnknownHostException -> 0x008c, IOException -> 0x00e5, SecurityException -> 0x013f, Throwable -> 0x0199 }
            r3 = 0;
            r4 = p000.dad.f20914c;	 Catch:{ UnknownHostException -> 0x008c, IOException -> 0x00e5, SecurityException -> 0x013f, Throwable -> 0x0199 }
            r2[r3] = r4;	 Catch:{ UnknownHostException -> 0x008c, IOException -> 0x00e5, SecurityException -> 0x013f, Throwable -> 0x0199 }
            r3 = 1;
            r4 = r12.f20905c;	 Catch:{ UnknownHostException -> 0x008c, IOException -> 0x00e5, SecurityException -> 0x013f, Throwable -> 0x0199 }
            r2[r3] = r4;	 Catch:{ UnknownHostException -> 0x008c, IOException -> 0x00e5, SecurityException -> 0x013f, Throwable -> 0x0199 }
            r3 = 2;
            r4 = p000.sa.C5755c.f25452b;	 Catch:{ UnknownHostException -> 0x008c, IOException -> 0x00e5, SecurityException -> 0x013f, Throwable -> 0x0199 }
            r2[r3] = r4;	 Catch:{ UnknownHostException -> 0x008c, IOException -> 0x00e5, SecurityException -> 0x013f, Throwable -> 0x0199 }
            r3 = 3;
            r4 = 0;
            r2[r3] = r4;	 Catch:{ UnknownHostException -> 0x008c, IOException -> 0x00e5, SecurityException -> 0x013f, Throwable -> 0x0199 }
            r3 = 4;
            r4 = 0;
            r2[r3] = r4;	 Catch:{ UnknownHostException -> 0x008c, IOException -> 0x00e5, SecurityException -> 0x013f, Throwable -> 0x0199 }
            r1.m26005a(r2);	 Catch:{ UnknownHostException -> 0x008c, IOException -> 0x00e5, SecurityException -> 0x013f, Throwable -> 0x0199 }
        L_0x0081:
            return;
        L_0x0082:
            r2 = new java.net.Socket;	 Catch:{ UnknownHostException -> 0x008c, IOException -> 0x00e5, SecurityException -> 0x013f, Throwable -> 0x0199 }
            r1 = r12.f20903a;	 Catch:{ UnknownHostException -> 0x008c, IOException -> 0x00e5, SecurityException -> 0x013f, Throwable -> 0x0199 }
            r3 = r12.f20904b;	 Catch:{ UnknownHostException -> 0x008c, IOException -> 0x00e5, SecurityException -> 0x013f, Throwable -> 0x0199 }
            r2.<init>(r1, r3);	 Catch:{ UnknownHostException -> 0x008c, IOException -> 0x00e5, SecurityException -> 0x013f, Throwable -> 0x0199 }
            goto L_0x0047;
        L_0x008c:
            r1 = move-exception;
            r2 = p000.dad.f20913a;
            r2 = r2.mo4282e();
            if (r2 == 0) goto L_0x00c9;
        L_0x0097:
            r2 = p000.dad.f20913a;
            r3 = new java.lang.StringBuilder;
            r4 = "Open Streams Exception - [";
            r3.<init>(r4);
            r4 = r1.getClass();
            r4 = r4.getName();
            r3 = r3.append(r4);
            r4 = "] Message - [";
            r3 = r3.append(r4);
            r1 = r1.getMessage();
            r1 = r3.append(r1);
            r3 = "]";
            r1 = r1.append(r3);
            r1 = r1.toString();
            r2.mo4281e(r1);
        L_0x00c9:
            r1 = r12.f20912j;
            r2 = 5;
            r2 = new java.lang.Object[r2];
            r3 = p000.dad.f20914c;
            r2[r7] = r3;
            r3 = r12.f20905c;
            r2[r8] = r3;
            r3 = p000.sa.C5755c.f25452b;
            r2[r10] = r3;
            r2[r11] = r9;
            r3 = 4;
            r2[r3] = r9;
            r1.m26005a(r2);
            goto L_0x0081;
        L_0x00e5:
            r1 = move-exception;
            r2 = p000.dad.f20913a;
            r2 = r2.mo4282e();
            if (r2 == 0) goto L_0x0122;
        L_0x00f0:
            r2 = p000.dad.f20913a;
            r3 = new java.lang.StringBuilder;
            r4 = "Open Streams Exception - [";
            r3.<init>(r4);
            r4 = r1.getClass();
            r4 = r4.getName();
            r3 = r3.append(r4);
            r4 = "] Message - [";
            r3 = r3.append(r4);
            r1 = r1.getMessage();
            r1 = r3.append(r1);
            r3 = "]";
            r1 = r1.append(r3);
            r1 = r1.toString();
            r2.mo4281e(r1);
        L_0x0122:
            r1 = r12.f20912j;
            r2 = 5;
            r2 = new java.lang.Object[r2];
            r3 = p000.dad.f20914c;
            r2[r7] = r3;
            r3 = r12.f20905c;
            r2[r8] = r3;
            r3 = p000.sa.C5755c.f25452b;
            r2[r10] = r3;
            r2[r11] = r9;
            r3 = 4;
            r2[r3] = r9;
            r1.m26005a(r2);
            goto L_0x0081;
        L_0x013f:
            r1 = move-exception;
            r2 = p000.dad.f20913a;
            r2 = r2.mo4282e();
            if (r2 == 0) goto L_0x017c;
        L_0x014a:
            r2 = p000.dad.f20913a;
            r3 = new java.lang.StringBuilder;
            r4 = "Open Streams Exception - [";
            r3.<init>(r4);
            r4 = r1.getClass();
            r4 = r4.getName();
            r3 = r3.append(r4);
            r4 = "] Message - [";
            r3 = r3.append(r4);
            r1 = r1.getMessage();
            r1 = r3.append(r1);
            r3 = "]";
            r1 = r1.append(r3);
            r1 = r1.toString();
            r2.mo4281e(r1);
        L_0x017c:
            r1 = r12.f20912j;
            r2 = 5;
            r2 = new java.lang.Object[r2];
            r3 = p000.dad.f20914c;
            r2[r7] = r3;
            r3 = r12.f20905c;
            r2[r8] = r3;
            r3 = p000.sa.C5755c.f25452b;
            r2[r10] = r3;
            r2[r11] = r9;
            r3 = 4;
            r2[r3] = r9;
            r1.m26005a(r2);
            goto L_0x0081;
        L_0x0199:
            r1 = move-exception;
            r2 = p000.dad.f20913a;
            r2 = r2.mo4282e();
            if (r2 == 0) goto L_0x01d6;
        L_0x01a4:
            r2 = p000.dad.f20913a;
            r3 = new java.lang.StringBuilder;
            r4 = "Open Streams Exception - [";
            r3.<init>(r4);
            r4 = r1.getClass();
            r4 = r4.getName();
            r3 = r3.append(r4);
            r4 = "] Message - [";
            r3 = r3.append(r4);
            r1 = r1.getMessage();
            r1 = r3.append(r1);
            r3 = "]";
            r1 = r1.append(r3);
            r1 = r1.toString();
            r2.mo4281e(r1);
        L_0x01d6:
            r1 = r12.f20912j;
            r2 = 5;
            r2 = new java.lang.Object[r2];
            r3 = p000.dad.f20914c;
            r2[r7] = r3;
            r3 = r12.f20905c;
            r2[r8] = r3;
            r3 = p000.sa.C5755c.f25452b;
            r2[r10] = r3;
            r2[r11] = r9;
            r3 = 4;
            r2[r3] = r9;
            r1.m26005a(r2);
            goto L_0x0081;
        L_0x01f3:
            r1 = r12.f20911i;	 Catch:{ Exception -> 0x02bf }
            if (r1 == 0) goto L_0x01ff;
        L_0x01f7:
            r0 = r2;
            r0 = (javax.net.ssl.SSLSocket) r0;	 Catch:{ Exception -> 0x02bf }
            r1 = r0;
            r3 = 1;
            r1.setUseClientMode(r3);	 Catch:{ Exception -> 0x02bf }
        L_0x01ff:
            r1 = 1;
            r2.setTcpNoDelay(r1);	 Catch:{ Exception -> 0x02bf }
            r1 = 1;
            r2.setKeepAlive(r1);	 Catch:{ Exception -> 0x02bf }
            r1 = 1;
            r3 = 40;
            r2.setSoLinger(r1, r3);	 Catch:{ Exception -> 0x02bf }
        L_0x020d:
            r4 = r2.getInputStream();	 Catch:{ IOException -> 0x02fe }
            r5 = r2.getOutputStream();	 Catch:{ IOException -> 0x02fe }
            r1 = new dad$a;
            r3 = r12.f20906d;
            r6 = r12;
            r1.<init>(r2, r3, r4, r5, r6);
            r2 = r12.f20912j;
            r3 = 5;
            r3 = new java.lang.Object[r3];
            r5 = p000.dad.f20914c;
            r3[r7] = r5;
            r5 = r12.f20905c;
            r3[r8] = r5;
            r5 = p000.sa.C5755c.f25451a;
            r3[r10] = r5;
            r3[r11] = r1;
            r5 = 4;
            r3[r5] = r9;
            r2.m26005a(r3);
        L_0x0238:
            r2 = r12.f20908f;	 Catch:{ Exception -> 0x0286 }
            if (r2 != 0) goto L_0x0081;
        L_0x023c:
            r2 = r12.f20912j;	 Catch:{ Exception -> 0x0286 }
            r3 = r2.f20919g;	 Catch:{ Exception -> 0x0286 }
            monitor-enter(r3);	 Catch:{ Exception -> 0x0286 }
        L_0x0243:
            r2 = r12.f20908f;	 Catch:{ all -> 0x0283 }
            if (r2 != 0) goto L_0x037e;
        L_0x0247:
            r2 = r12.f20909g;	 Catch:{ all -> 0x0283 }
            if (r2 == 0) goto L_0x037e;
        L_0x024b:
            r2 = r12.f20909g;	 Catch:{ all -> 0x0283 }
            r2 = r2.isEmpty();	 Catch:{ all -> 0x0283 }
            if (r2 == 0) goto L_0x037e;
        L_0x0253:
            r2 = p000.dad.f20913a;	 Catch:{ all -> 0x0283 }
            r2 = r2.mo4276b();	 Catch:{ all -> 0x0283 }
            if (r2 == 0) goto L_0x0266;
        L_0x025d:
            r2 = p000.dad.f20913a;	 Catch:{ all -> 0x0283 }
            r5 = "socket read thread. waiting syncObj in.";
            r2.mo4275b(r5);	 Catch:{ all -> 0x0283 }
        L_0x0266:
            r2 = r12.f20912j;	 Catch:{ Exception -> 0x035b }
            r2 = r2.f20919g;	 Catch:{ Exception -> 0x035b }
            r2.wait();	 Catch:{ Exception -> 0x035b }
        L_0x026f:
            r2 = p000.dad.f20913a;	 Catch:{ all -> 0x0283 }
            r2 = r2.mo4276b();	 Catch:{ all -> 0x0283 }
            if (r2 == 0) goto L_0x0243;
        L_0x0279:
            r2 = p000.dad.f20913a;	 Catch:{ all -> 0x0283 }
            r5 = "socket read thread. waiting syncObj out.";
            r2.mo4275b(r5);	 Catch:{ all -> 0x0283 }
            goto L_0x0243;
        L_0x0283:
            r1 = move-exception;
            monitor-exit(r3);	 Catch:{ Exception -> 0x0286 }
            throw r1;	 Catch:{ Exception -> 0x0286 }
        L_0x0286:
            r1 = move-exception;
            r2 = p000.dad.f20913a;
            r2 = r2.mo4282e();
            if (r2 == 0) goto L_0x0081;
        L_0x0291:
            r2 = p000.dad.f20913a;
            r3 = new java.lang.StringBuilder;
            r4 = "NetworkSystemJ2me.run() ";
            r3.<init>(r4);
            r4 = r1.getClass();
            r4 = r4.getName();
            r3 = r3.append(r4);
            r4 = " ";
            r3 = r3.append(r4);
            r1 = r1.getMessage();
            r1 = r3.append(r1);
            r1 = r1.toString();
            r2.mo4281e(r1);
            goto L_0x0081;
        L_0x02bf:
            r1 = move-exception;
            r3 = p000.dad.f20913a;
            r3 = r3.mo4282e();
            if (r3 == 0) goto L_0x020d;
        L_0x02ca:
            r3 = p000.dad.f20913a;
            r4 = new java.lang.StringBuilder;
            r5 = "Set Socket Option Exception - [";
            r4.<init>(r5);
            r5 = r1.getClass();
            r5 = r5.getName();
            r4 = r4.append(r5);
            r5 = "] Message - [";
            r4 = r4.append(r5);
            r1 = r1.getMessage();
            r1 = r4.append(r1);
            r4 = "]";
            r1 = r1.append(r4);
            r1 = r1.toString();
            r3.mo4281e(r1);
            goto L_0x020d;
        L_0x02fe:
            r1 = move-exception;
            r2.close();	 Catch:{ IOException -> 0x04d7 }
        L_0x0302:
            r2 = p000.dad.f20913a;
            r2 = r2.mo4282e();
            if (r2 == 0) goto L_0x033e;
        L_0x030c:
            r2 = p000.dad.f20913a;
            r3 = new java.lang.StringBuilder;
            r4 = "Set Socket Option Exception - [";
            r3.<init>(r4);
            r4 = r1.getClass();
            r4 = r4.getName();
            r3 = r3.append(r4);
            r4 = "] Message - [";
            r3 = r3.append(r4);
            r1 = r1.getMessage();
            r1 = r3.append(r1);
            r3 = "]";
            r1 = r1.append(r3);
            r1 = r1.toString();
            r2.mo4281e(r1);
        L_0x033e:
            r1 = r12.f20912j;
            r2 = 5;
            r2 = new java.lang.Object[r2];
            r3 = p000.dad.f20914c;
            r2[r7] = r3;
            r3 = r12.f20905c;
            r2[r8] = r3;
            r3 = p000.sa.C5755c.f25452b;
            r2[r10] = r3;
            r2[r11] = r9;
            r3 = 4;
            r2[r3] = r9;
            r1.m26005a(r2);
            goto L_0x0081;
        L_0x035b:
            r2 = move-exception;
            r5 = p000.dad.f20913a;	 Catch:{ all -> 0x0283 }
            r5 = r5.mo4282e();	 Catch:{ all -> 0x0283 }
            if (r5 == 0) goto L_0x026f;
        L_0x0366:
            r5 = p000.dad.f20913a;	 Catch:{ all -> 0x0283 }
            r6 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0283 }
            r8 = "InterruptedException ie:";
            r6.<init>(r8);	 Catch:{ all -> 0x0283 }
            r2 = r6.append(r2);	 Catch:{ all -> 0x0283 }
            r2 = r2.toString();	 Catch:{ all -> 0x0283 }
            r5.mo4281e(r2);	 Catch:{ all -> 0x0283 }
            goto L_0x026f;
        L_0x037e:
            r2 = r12.f20908f;	 Catch:{ all -> 0x0283 }
            if (r2 != 0) goto L_0x0386;
        L_0x0382:
            r2 = r12.f20909g;	 Catch:{ all -> 0x0283 }
            if (r2 != 0) goto L_0x0389;
        L_0x0386:
            monitor-exit(r3);	 Catch:{ all -> 0x0283 }
            goto L_0x0081;
        L_0x0389:
            r2 = r12.f20909g;	 Catch:{ all -> 0x0283 }
            r5 = 0;
            r2 = r2.elementAt(r5);	 Catch:{ all -> 0x0283 }
            r2 = (p000.dad.C4731b) r2;	 Catch:{ all -> 0x0283 }
            r5 = r12.f20909g;	 Catch:{ all -> 0x0283 }
            r6 = 0;
            r5.removeElementAt(r6);	 Catch:{ all -> 0x0283 }
            monitor-exit(r3);	 Catch:{ all -> 0x0283 }
            r3 = p000.dad.f20913a;	 Catch:{ IOException -> 0x0449 }
            r3 = r3.mo4276b();	 Catch:{ IOException -> 0x0449 }
            if (r3 == 0) goto L_0x03ac;
        L_0x03a3:
            r3 = p000.dad.f20913a;	 Catch:{ IOException -> 0x0449 }
            r5 = "socket read thread. reading socket in.";
            r3.mo4275b(r5);	 Catch:{ IOException -> 0x0449 }
        L_0x03ac:
            r3 = r7;
        L_0x03ad:
            r5 = r2.f20900b;	 Catch:{ IOException -> 0x0449 }
            if (r3 >= r5) goto L_0x03e6;
        L_0x03b1:
            r5 = r2.f20899a;	 Catch:{ IOException -> 0x0449 }
            r6 = r3 + 0;
            r8 = r2.f20900b;	 Catch:{ IOException -> 0x0449 }
            r8 = r8 - r3;
            r5 = r4.read(r5, r6, r8);	 Catch:{ IOException -> 0x0449 }
            r6 = p000.dad.f20913a;	 Catch:{ IOException -> 0x0449 }
            r6 = r6.mo4276b();	 Catch:{ IOException -> 0x0449 }
            if (r6 == 0) goto L_0x03dc;
        L_0x03c6:
            r6 = p000.dad.f20913a;	 Catch:{ IOException -> 0x0449 }
            r8 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x0449 }
            r9 = "socket read thread. bytesRead:";
            r8.<init>(r9);	 Catch:{ IOException -> 0x0449 }
            r8 = r8.append(r5);	 Catch:{ IOException -> 0x0449 }
            r8 = r8.toString();	 Catch:{ IOException -> 0x0449 }
            r6.mo4275b(r8);	 Catch:{ IOException -> 0x0449 }
        L_0x03dc:
            if (r5 >= 0) goto L_0x0446;
        L_0x03de:
            r3 = r12.f20908f;	 Catch:{ IOException -> 0x0449 }
            if (r3 != 0) goto L_0x03e6;
        L_0x03e2:
            r3 = p000.sa.C5755c.f25452b;	 Catch:{ IOException -> 0x0449 }
            r12.f20907e = r3;	 Catch:{ IOException -> 0x0449 }
        L_0x03e6:
            r3 = p000.dad.f20913a;	 Catch:{ IOException -> 0x0449 }
            r3 = r3.mo4276b();	 Catch:{ IOException -> 0x0449 }
            if (r3 == 0) goto L_0x03f9;
        L_0x03f0:
            r3 = p000.dad.f20913a;	 Catch:{ IOException -> 0x0449 }
            r5 = "socket read thread. reading socket out.";
            r3.mo4275b(r5);	 Catch:{ IOException -> 0x0449 }
        L_0x03f9:
            r3 = r12.f20907e;	 Catch:{ Exception -> 0x0286 }
            r5 = p000.sa.C5755c.f25451a;	 Catch:{ Exception -> 0x0286 }
            if (r3 != r5) goto L_0x048c;
        L_0x03ff:
            r3 = r12.f20912j;	 Catch:{ Exception -> 0x0286 }
            r5 = 9;
            r5 = new java.lang.Object[r5];	 Catch:{ Exception -> 0x0286 }
            r6 = 0;
            r8 = p000.dad.f20916e;	 Catch:{ Exception -> 0x0286 }
            r5[r6] = r8;	 Catch:{ Exception -> 0x0286 }
            r6 = 1;
            r8 = r2.f20901c;	 Catch:{ Exception -> 0x0286 }
            r5[r6] = r8;	 Catch:{ Exception -> 0x0286 }
            r6 = 2;
            r8 = p000.sa.C5755c.f25451a;	 Catch:{ Exception -> 0x0286 }
            r5[r6] = r8;	 Catch:{ Exception -> 0x0286 }
            r6 = 3;
            r5[r6] = r1;	 Catch:{ Exception -> 0x0286 }
            r6 = 4;
            r8 = r2.f20899a;	 Catch:{ Exception -> 0x0286 }
            r5[r6] = r8;	 Catch:{ Exception -> 0x0286 }
            r6 = 5;
            r8 = new java.lang.Integer;	 Catch:{ Exception -> 0x0286 }
            r9 = 0;
            r8.<init>(r9);	 Catch:{ Exception -> 0x0286 }
            r5[r6] = r8;	 Catch:{ Exception -> 0x0286 }
            r6 = 6;
            r8 = new java.lang.Integer;	 Catch:{ Exception -> 0x0286 }
            r9 = r2.f20900b;	 Catch:{ Exception -> 0x0286 }
            r8.<init>(r9);	 Catch:{ Exception -> 0x0286 }
            r5[r6] = r8;	 Catch:{ Exception -> 0x0286 }
            r6 = 7;
            r8 = new java.lang.Integer;	 Catch:{ Exception -> 0x0286 }
            r9 = r2.f20900b;	 Catch:{ Exception -> 0x0286 }
            r8.<init>(r9);	 Catch:{ Exception -> 0x0286 }
            r5[r6] = r8;	 Catch:{ Exception -> 0x0286 }
            r6 = 8;
            r2 = r2.f20902d;	 Catch:{ Exception -> 0x0286 }
            r5[r6] = r2;	 Catch:{ Exception -> 0x0286 }
            r3.m26005a(r5);	 Catch:{ Exception -> 0x0286 }
            goto L_0x0238;
        L_0x0446:
            r3 = r3 + r5;
            goto L_0x03ad;
        L_0x0449:
            r3 = move-exception;
            r5 = p000.dad.f20913a;	 Catch:{ Exception -> 0x0286 }
            r5 = r5.mo4282e();	 Catch:{ Exception -> 0x0286 }
            if (r5 == 0) goto L_0x0486;
        L_0x0454:
            r5 = p000.dad.f20913a;	 Catch:{ Exception -> 0x0286 }
            r6 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x0286 }
            r8 = "Socket Read/Available Expception - [";
            r6.<init>(r8);	 Catch:{ Exception -> 0x0286 }
            r8 = r3.getClass();	 Catch:{ Exception -> 0x0286 }
            r8 = r8.getName();	 Catch:{ Exception -> 0x0286 }
            r6 = r6.append(r8);	 Catch:{ Exception -> 0x0286 }
            r8 = "] Message - [";
            r6 = r6.append(r8);	 Catch:{ Exception -> 0x0286 }
            r3 = r3.getMessage();	 Catch:{ Exception -> 0x0286 }
            r3 = r6.append(r3);	 Catch:{ Exception -> 0x0286 }
            r6 = "]";
            r3 = r3.append(r6);	 Catch:{ Exception -> 0x0286 }
            r3 = r3.toString();	 Catch:{ Exception -> 0x0286 }
            r5.mo4281e(r3);	 Catch:{ Exception -> 0x0286 }
        L_0x0486:
            r3 = p000.sa.C5755c.f25452b;	 Catch:{ Exception -> 0x0286 }
            r12.f20907e = r3;	 Catch:{ Exception -> 0x0286 }
            goto L_0x03f9;
        L_0x048c:
            r3 = r12.f20912j;	 Catch:{ Exception -> 0x0286 }
            r5 = 9;
            r5 = new java.lang.Object[r5];	 Catch:{ Exception -> 0x0286 }
            r6 = 0;
            r8 = p000.dad.f20916e;	 Catch:{ Exception -> 0x0286 }
            r5[r6] = r8;	 Catch:{ Exception -> 0x0286 }
            r6 = 1;
            r8 = r2.f20901c;	 Catch:{ Exception -> 0x0286 }
            r5[r6] = r8;	 Catch:{ Exception -> 0x0286 }
            r6 = 2;
            r8 = p000.sa.C5755c.f25452b;	 Catch:{ Exception -> 0x0286 }
            r5[r6] = r8;	 Catch:{ Exception -> 0x0286 }
            r6 = 3;
            r5[r6] = r1;	 Catch:{ Exception -> 0x0286 }
            r6 = 4;
            r8 = r2.f20899a;	 Catch:{ Exception -> 0x0286 }
            r5[r6] = r8;	 Catch:{ Exception -> 0x0286 }
            r6 = 5;
            r8 = new java.lang.Integer;	 Catch:{ Exception -> 0x0286 }
            r9 = 0;
            r8.<init>(r9);	 Catch:{ Exception -> 0x0286 }
            r5[r6] = r8;	 Catch:{ Exception -> 0x0286 }
            r6 = 6;
            r8 = new java.lang.Integer;	 Catch:{ Exception -> 0x0286 }
            r9 = r2.f20900b;	 Catch:{ Exception -> 0x0286 }
            r8.<init>(r9);	 Catch:{ Exception -> 0x0286 }
            r5[r6] = r8;	 Catch:{ Exception -> 0x0286 }
            r6 = 7;
            r8 = new java.lang.Integer;	 Catch:{ Exception -> 0x0286 }
            r9 = 0;
            r8.<init>(r9);	 Catch:{ Exception -> 0x0286 }
            r5[r6] = r8;	 Catch:{ Exception -> 0x0286 }
            r6 = 8;
            r2 = r2.f20902d;	 Catch:{ Exception -> 0x0286 }
            r5[r6] = r2;	 Catch:{ Exception -> 0x0286 }
            r3.m26005a(r5);	 Catch:{ Exception -> 0x0286 }
            r2 = r12.f20912j;	 Catch:{ Exception -> 0x0286 }
            r2.mo4295a(r1);	 Catch:{ Exception -> 0x0286 }
            goto L_0x0238;
        L_0x04d7:
            r2 = move-exception;
            goto L_0x0302;
            */
            throw new UnsupportedOperationException("Method not decompiled: dad.c.run():void");
        }
    }

    public dad(rl rlVar) {
        this.f20918b = rlVar;
    }

    /* renamed from: a */
    private void m26005a(Object[] objArr) {
        rl rlVar = this.f20918b;
        Object b = this.f20918b.mo4289b();
        this.f20918b.mo4288a();
        rlVar.mo4285a(objArr, this, b);
    }

    /* renamed from: a */
    public final C5755c mo4293a(Object obj, C5754b c5754b, byte[] bArr, int i, C5757e c5757e, Object obj2) {
        if (c5754b != C5754b.f25450a) {
            if (f20913a.mo4282e()) {
                f20913a.mo4281e("Blackberry NetworkSystem only supports NETWORK_READ_FULL");
            }
            return C5755c.f25452b;
        }
        C4730a c4730a = (C4730a) obj;
        if (c4730a.f20898f == null) {
            if (f20913a.mo4276b()) {
                f20913a.mo4275b((Object) "SOCKET READ ERROR: socket read thread is null");
            }
            return C5755c.f25452b;
        } else if (c4730a.f20898f.f20908f) {
            if (f20913a.mo4282e()) {
                f20913a.mo4281e("socket read thread is stopping");
            }
            return C5755c.f25452b;
        } else {
            return c4730a.f20898f.m25993a(new C4731b(bArr, i, c5757e, obj2));
        }
    }

    /* renamed from: a */
    public final C5755c mo4294a(Object obj, byte[] bArr, int i, C5758f c5758f, Object obj2) {
        if (f20913a.mo4276b()) {
            f20913a.mo4275b("socketWrite(bufferLen:" + i + ") start");
        }
        C4730a c4730a = (C4730a) obj;
        if (c4730a.f20893a == null || c4730a.f20896d == null) {
            return C5755c.f25452b;
        }
        OutputStream outputStream = c4730a.f20896d;
        try {
            outputStream.write(bArr, 0, i);
            outputStream.flush();
            m26005a(new Object[]{f20917f, c5758f, C5755c.f25451a, obj, bArr, new Integer(0), new Integer(i), new Integer(i), obj2});
            if (f20913a.mo4276b()) {
                f20913a.mo4275b("socketWrite(bufferLen:" + i + ") end");
            }
            return C5755c.f25451a;
        } catch (Exception e) {
            if (f20913a.mo4282e()) {
                f20913a.mo4281e("Socket Write Exception - [" + e.getClass().getName() + "] Message - [" + e.getMessage() + "]");
            }
            m26005a(new Object[]{f20917f, c5758f, C5755c.f25452b, obj, bArr, new Integer(0), new Integer(i), new Integer(0), obj2});
            mo4295a(obj);
            return C5755c.f25452b;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public final void mo4295a(Object r11) {
        /*
        r10 = this;
        r9 = 3;
        r8 = 2;
        r2 = 1;
        r3 = 0;
        r7 = 0;
        r0 = r11;
        r0 = (p000.dad.C4730a) r0;
        if (r0 != 0) goto L_0x000b;
    L_0x000a:
        return;
    L_0x000b:
        r4 = r10.f20919g;
        monitor-enter(r4);
        r1 = r0.f20898f;	 Catch:{ all -> 0x0014 }
        if (r1 != 0) goto L_0x0017;
    L_0x0012:
        monitor-exit(r4);	 Catch:{ all -> 0x0014 }
        goto L_0x000a;
    L_0x0014:
        r0 = move-exception;
        monitor-exit(r4);
        throw r0;
    L_0x0017:
        r1 = r0.f20898f;	 Catch:{ all -> 0x0014 }
        r1 = r1.f20908f;	 Catch:{ all -> 0x0014 }
        if (r1 != 0) goto L_0x00a9;
    L_0x001f:
        r1 = r0.f20898f;	 Catch:{ all -> 0x0014 }
        r1.m25994a();	 Catch:{ all -> 0x0014 }
        r1 = 0;
        r0.f20898f = r1;	 Catch:{ all -> 0x0014 }
        r1 = r2;
    L_0x0028:
        monitor-exit(r4);	 Catch:{ all -> 0x0014 }
        r4 = r0.f20893a;
        if (r4 == 0) goto L_0x000a;
    L_0x002d:
        if (r1 == 0) goto L_0x000a;
    L_0x002f:
        r1 = r0.f20895c;	 Catch:{ Throwable -> 0x0057 }
        r1.close();	 Catch:{ Throwable -> 0x0057 }
        r1 = 0;
        r0.f20895c = r1;	 Catch:{ Throwable -> 0x0057 }
        r1 = r0.f20893a;	 Catch:{ Throwable -> 0x0057 }
        r1.close();	 Catch:{ Throwable -> 0x0057 }
        r1 = 0;
        r0.f20893a = r1;	 Catch:{ Throwable -> 0x0057 }
        r1 = 5;
        r1 = new java.lang.Object[r1];
        r4 = f20915d;
        r1[r3] = r4;
        r0 = r0.f20894b;
        r1[r2] = r0;
        r0 = p000.sa.C5755c.f25451a;
        r1[r8] = r0;
        r1[r9] = r11;
        r0 = 4;
        r1[r0] = r7;
        r10.m26005a(r1);
        goto L_0x000a;
    L_0x0057:
        r1 = move-exception;
        r4 = f20913a;
        r4 = r4.mo4282e();
        if (r4 == 0) goto L_0x0090;
    L_0x0060:
        r4 = f20913a;
        r5 = new java.lang.StringBuilder;
        r6 = "Socket Close Expception - [";
        r5.<init>(r6);
        r6 = r1.getClass();
        r6 = r6.getName();
        r5 = r5.append(r6);
        r6 = "] Message - [";
        r5 = r5.append(r6);
        r1 = r1.getMessage();
        r1 = r5.append(r1);
        r5 = "]";
        r1 = r1.append(r5);
        r1 = r1.toString();
        r4.mo4281e(r1);
    L_0x0090:
        r1 = 5;
        r1 = new java.lang.Object[r1];
        r4 = f20915d;
        r1[r3] = r4;
        r0 = r0.f20894b;
        r1[r2] = r0;
        r0 = p000.sa.C5755c.f25452b;
        r1[r8] = r0;
        r1[r9] = r11;
        r0 = 4;
        r1[r0] = r7;
        r10.m26005a(r1);
        goto L_0x000a;
    L_0x00a9:
        r1 = r3;
        goto L_0x0028;
        */
        throw new UnsupportedOperationException("Method not decompiled: dad.a(java.lang.Object):void");
    }

    /* renamed from: a */
    public final void mo3863a(Object obj, Object obj2) {
        Object[] objArr = (Object[]) obj;
        if (objArr[0] == f20914c) {
            ((C5756d) objArr[1]).mo5514a((C5755c) objArr[2], objArr[3]);
        } else if (objArr[0] == f20915d) {
            ((C5753a) objArr[1]).mo5513a();
        } else if (objArr[0] == f20916e) {
            ((C5757e) objArr[1]).mo5516a((C5755c) objArr[2], objArr[3], (byte[]) objArr[4], ((Integer) objArr[6]).intValue(), ((Integer) objArr[7]).intValue(), objArr[8]);
        } else if (objArr[0] == f20917f) {
            ((C5758f) objArr[1]).mo5515a((C5755c) objArr[2], objArr[3], ((Integer) objArr[6]).intValue(), ((Integer) objArr[7]).intValue(), objArr[8]);
        }
    }

    /* renamed from: a */
    public final void mo4296a(String str, int i, Vector vector, C5756d c5756d, C5753a c5753a) {
        dql dql = new dql();
        Enumeration elements = vector.elements();
        while (elements.hasMoreElements()) {
            dnm dnm = (dnm) elements.nextElement();
            if (dnm.m28248a().equals("SSL_SelfSigned_Cert") && (new String(dnm.m28249b()).equals("TRUE") || new String(dnm.m28249b()).equals(ServerProtocol.DIALOG_RETURN_SCOPES_TRUE))) {
                dql.f22606a = true;
            }
            if (dnm.m28248a().equals("SSL_Cert_Summary")) {
                dql.f22607b = new String(dnm.m28249b());
            }
            if (dnm.m28248a().equals("SSL_Cert_Data")) {
                dql.f22608c = new String(dnm.m28249b());
            }
        }
        try {
            new C4732c(this, str, i, dql, c5756d, c5753a).start();
        } catch (Exception e) {
            if (f20913a.mo4282e()) {
                f20913a.mo4281e("Open Socket Exception - [" + e.getClass().getName() + "] Message - [" + e.getMessage() + "]");
            }
            m26005a(new Object[]{f20914c, c5756d, C5755c.f25452b, null, null});
        }
    }

    /* renamed from: a */
    public final void mo4297a(String str, int i, C5756d c5756d, C5753a c5753a) {
        try {
            new C4732c(this, str, i, c5756d, c5753a).start();
        } catch (Exception e) {
            if (f20913a.mo4282e()) {
                f20913a.mo4281e("Open Socket Exception - [" + e.getClass().getName() + "] Message - [" + e.getMessage() + "]");
            }
            m26005a(new Object[]{f20914c, c5756d, C5755c.f25452b, null, null});
        }
    }

    /* renamed from: b */
    public final void mo4298b(Object obj) {
        C4730a c4730a = (C4730a) obj;
        if (c4730a.f20898f != null) {
            c4730a.f20898f.m25995b();
            return;
        }
        if (f20913a.mo4276b()) {
            f20913a.mo4275b((Object) "SOCKET WRITE ERROR: socket read thread is null");
        }
        mo4295a(obj);
    }
}
