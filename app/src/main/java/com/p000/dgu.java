package com.p000;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.Callable;

/* compiled from: TracerouteTask */
/* renamed from: dgu */
public class dgu implements Callable<C4899c> {
    /* renamed from: a */
    private String f21596a;
    /* renamed from: b */
    private Process f21597b = null;
    /* renamed from: c */
    private boolean f21598c = false;
    /* renamed from: d */
    private HashMap<String, String> f21599d;
    /* renamed from: e */
    private long f21600e;

    /* compiled from: TracerouteTask */
    /* renamed from: dgu$a */
    static class C4897a {
        /* renamed from: a */
        public HashSet<String> f21589a;
        /* renamed from: b */
        public double f21590b;

        protected C4897a(HashSet<String> hashSet, double d) {
            this.f21589a = hashSet;
            this.f21590b = d;
        }
    }

    /* compiled from: TracerouteTask */
    /* renamed from: dgu$b */
    static class C4898b extends Thread {
        /* renamed from: a */
        public long f21591a;
        /* renamed from: b */
        private final Process f21592b;
        /* renamed from: c */
        private Integer f21593c;

        private C4898b(Process process) {
            this.f21591a = 0;
            this.f21593c = null;
            this.f21592b = process;
        }

        public void run() {
            try {
                long currentTimeMillis = System.currentTimeMillis();
                this.f21593c = Integer.valueOf(this.f21592b.waitFor());
                this.f21591a = System.currentTimeMillis() - currentTimeMillis;
            } catch (InterruptedException e) {
                dgu.m27244e("Traceroute thread gets interrupted");
            }
        }
    }

    /* compiled from: TracerouteTask */
    /* renamed from: dgu$c */
    static class C4899c {
        /* renamed from: a */
        private String f21594a;
        /* renamed from: b */
        private String f21595b;

        private C4899c(String str, String str2) {
            this.f21594a = str;
            this.f21595b = str2;
        }

        /* renamed from: a */
        public static C4899c m27236a(String str, String str2) {
            return new C4899c(str, str2);
        }

        /* renamed from: a */
        public String m27237a() {
            return this.f21595b;
        }
    }

    public /* synthetic */ Object call() throws Exception {
        return m27245a();
    }

    public dgu(String str) {
        this.f21596a = str;
        this.f21599d = new HashMap();
    }

    /* renamed from: a */
    private void m27238a(BufferedReader bufferedReader, HashSet<String> hashSet, String str) throws IOException {
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                return;
            }
            if (readLine.startsWith("From")) {
                readLine = m27241b(readLine);
                if (!(readLine == null || readLine.compareTo(str) == 0)) {
                    hashSet.add(readLine);
                }
            } else if (readLine.contains("time=")) {
                hashSet.add(str);
            }
        }
    }

    /* renamed from: b */
    private String m27241b(String str) {
        String[] split = str.split(" ");
        String str2 = split[1];
        if (split[1].charAt(split[1].length() - 1) == ':') {
            str2 = split[1].substring(0, split[1].length() - 1);
        }
        if (m27242c(str2) || m27243d(str2)) {
            return str2;
        }
        int i = 0;
        while (i < split.length) {
            if (i != 1 && (m27242c(split[i]) || m27243d(split[i]))) {
                return split[i];
            }
            i++;
        }
        return null;
    }

    /* renamed from: c */
    private boolean m27242c(String str) {
        String[] split = str.split("\\.");
        if (split.length != 4) {
            return false;
        }
        int i = 0;
        while (i < 4) {
            try {
                int parseInt = Integer.parseInt(split[i]);
                if (parseInt < 0 || parseInt > 255) {
                    return false;
                }
                i++;
            } catch (NumberFormatException e) {
                dgu.m27244e(str + " is not a valid IPv4 address");
                return false;
            }
        }
        return true;
    }

    /* renamed from: d */
    private boolean m27243d(String str) {
        int intValue = Integer.valueOf("FFFF", 16).intValue();
        String[] split = str.split("\\:");
        if (split.length > 8) {
            return false;
        }
        int i = 0;
        while (i < split.length) {
            try {
                if (!split[i].isEmpty()) {
                    int parseInt = Integer.parseInt(split[i], 16);
                    if (parseInt < 0 || parseInt > intValue) {
                        return false;
                    }
                }
                i++;
            } catch (NumberFormatException e) {
                dgu.m27244e(str + " is not a valid IPv6 address");
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    private void m27239a(Process process) {
        if (process != null) {
            process.destroy();
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public p000.dgu.C4899c m27245a() throws Exception {
        /*
        r19 = this;
        r3 = 30;
        r2 = 1;
        r0 = r19;
        r9 = r0.f21596a;
        r10 = new java.util.ArrayList;
        r10.<init>();
        r4 = new java.lang.StringBuilder;
        r4.<init>();
        r5 = "Starting traceroute on host ";
        r4 = r4.append(r5);
        r0 = r19;
        r5 = r0.f21596a;
        r4 = r4.append(r5);
        r4 = r4.toString();
        p000.dgu.m27244e(r4);
        r4 = java.net.InetAddress.getByName(r9);	 Catch:{ UnknownHostException -> 0x0144 }
        r11 = r4.getHostAddress();	 Catch:{ UnknownHostException -> 0x0144 }
        r4 = r4.getAddress();	 Catch:{ UnknownHostException -> 0x0144 }
        r4 = r4.length;	 Catch:{ UnknownHostException -> 0x0144 }
        r5 = new java.lang.StringBuilder;	 Catch:{ UnknownHostException -> 0x0144 }
        r5.<init>();	 Catch:{ UnknownHostException -> 0x0144 }
        r6 = "IP address length is ";
        r5 = r5.append(r6);	 Catch:{ UnknownHostException -> 0x0144 }
        r5 = r5.append(r4);	 Catch:{ UnknownHostException -> 0x0144 }
        r5 = r5.toString();	 Catch:{ UnknownHostException -> 0x0144 }
        p000.dgu.m27244e(r5);	 Catch:{ UnknownHostException -> 0x0144 }
        r5 = new java.lang.StringBuilder;	 Catch:{ UnknownHostException -> 0x0144 }
        r5.<init>();	 Catch:{ UnknownHostException -> 0x0144 }
        r6 = "IP is ";
        r5 = r5.append(r6);	 Catch:{ UnknownHostException -> 0x0144 }
        r5 = r5.append(r11);	 Catch:{ UnknownHostException -> 0x0144 }
        r5 = r5.toString();	 Catch:{ UnknownHostException -> 0x0144 }
        p000.dgu.m27244e(r5);	 Catch:{ UnknownHostException -> 0x0144 }
        r12 = p000.dgx.m27250a(r4);	 Catch:{ UnknownHostException -> 0x0144 }
        r4 = new java.lang.StringBuilder;	 Catch:{ UnknownHostException -> 0x0144 }
        r4.<init>();	 Catch:{ UnknownHostException -> 0x0144 }
        r5 = "Ping executable is ";
        r4 = r4.append(r5);	 Catch:{ UnknownHostException -> 0x0144 }
        r4 = r4.append(r12);	 Catch:{ UnknownHostException -> 0x0144 }
        r4 = r4.toString();	 Catch:{ UnknownHostException -> 0x0144 }
        p000.dgu.m27244e(r4);	 Catch:{ UnknownHostException -> 0x0144 }
        if (r12 != 0) goto L_0x00a0;
    L_0x007b:
        r2 = "Ping Executable not found";
        p000.dgu.m27244e(r2);	 Catch:{ UnknownHostException -> 0x0144 }
        r0 = r19;
        r2 = r0.f21596a;	 Catch:{ UnknownHostException -> 0x0144 }
        r3 = new java.lang.StringBuilder;	 Catch:{ UnknownHostException -> 0x0144 }
        r3.<init>();	 Catch:{ UnknownHostException -> 0x0144 }
        r4 = "Ping Executable Not Found=";
        r3 = r3.append(r4);	 Catch:{ UnknownHostException -> 0x0144 }
        r0 = r19;
        r4 = r0.f21596a;	 Catch:{ UnknownHostException -> 0x0144 }
        r3 = r3.append(r4);	 Catch:{ UnknownHostException -> 0x0144 }
        r3 = r3.toString();	 Catch:{ UnknownHostException -> 0x0144 }
        r2 = p000.dgu.C4899c.m27236a(r2, r3);	 Catch:{ UnknownHostException -> 0x0144 }
    L_0x009f:
        return r2;
    L_0x00a0:
        r6 = r2;
        r2 = r3;
    L_0x00a2:
        r7 = r2 + -1;
        if (r2 <= 0) goto L_0x03c5;
    L_0x00a6:
        r0 = r19;
        r2 = r0.f21598c;
        if (r2 != 0) goto L_0x03c5;
    L_0x00ac:
        r2 = 8;
        r2 = new java.lang.Object[r2];
        r3 = 0;
        r2[r3] = r12;
        r3 = 1;
        r4 = "-n";
        r2[r3] = r4;
        r3 = 2;
        r4 = "-t";
        r2[r3] = r4;
        r3 = 3;
        r4 = java.lang.Integer.valueOf(r6);
        r2[r3] = r4;
        r3 = 4;
        r4 = "-s";
        r2[r3] = r4;
        r3 = 5;
        r4 = 56;
        r4 = java.lang.Integer.valueOf(r4);
        r2[r3] = r4;
        r3 = 6;
        r4 = "-c 1";
        r2[r3] = r4;
        r3 = 7;
        r2[r3] = r9;
        r8 = p000.dgx.m27251a(r2);
        r4 = 0;
        r13 = new java.util.HashSet;	 Catch:{ SecurityException -> 0x018c, IOException -> 0x01d8 }
        r13.<init>();	 Catch:{ SecurityException -> 0x018c, IOException -> 0x01d8 }
        r3 = 0;
        r2 = 0;
        r18 = r2;
        r2 = r3;
        r3 = r18;
    L_0x00ec:
        r14 = 1;
        if (r3 >= r14) goto L_0x01ef;
    L_0x00ef:
        r14 = java.lang.Runtime.getRuntime();	 Catch:{ SecurityException -> 0x018c, IOException -> 0x01d8 }
        r14 = r14.exec(r8);	 Catch:{ SecurityException -> 0x018c, IOException -> 0x01d8 }
        r0 = r19;
        r0.f21597b = r14;	 Catch:{ SecurityException -> 0x018c, IOException -> 0x01d8 }
        r0 = r19;
        r14 = r0.f21600e;	 Catch:{ SecurityException -> 0x018c, IOException -> 0x01d8 }
        r16 = 504; // 0x1f8 float:7.06E-43 double:2.49E-321;
        r14 = r14 + r16;
        r0 = r19;
        r0.f21600e = r14;	 Catch:{ SecurityException -> 0x018c, IOException -> 0x01d8 }
        r14 = new dgu$b;	 Catch:{ SecurityException -> 0x018c, IOException -> 0x01d8 }
        r0 = r19;
        r15 = r0.f21597b;	 Catch:{ SecurityException -> 0x018c, IOException -> 0x01d8 }
        r16 = 0;
        r14.<init>(r15);	 Catch:{ SecurityException -> 0x018c, IOException -> 0x01d8 }
        r14.start();	 Catch:{ SecurityException -> 0x018c, IOException -> 0x01d8 }
        r16 = 5000; // 0x1388 float:7.006E-42 double:2.4703E-320;
        r0 = r16;
        r14.join(r0);	 Catch:{ InterruptedException -> 0x0128, TimeoutException -> 0x017c }
        r15 = r14.f21593c;	 Catch:{ InterruptedException -> 0x0128, TimeoutException -> 0x017c }
        if (r15 != 0) goto L_0x01a1;
    L_0x0122:
        r15 = new java.util.concurrent.TimeoutException;	 Catch:{ InterruptedException -> 0x0128, TimeoutException -> 0x017c }
        r15.<init>();	 Catch:{ InterruptedException -> 0x0128, TimeoutException -> 0x017c }
        throw r15;	 Catch:{ InterruptedException -> 0x0128, TimeoutException -> 0x017c }
    L_0x0128:
        r15 = move-exception;
        r14.interrupt();	 Catch:{ SecurityException -> 0x018c, IOException -> 0x01d8 }
        r14 = java.lang.Thread.currentThread();	 Catch:{ SecurityException -> 0x018c, IOException -> 0x01d8 }
        r14.interrupt();	 Catch:{ SecurityException -> 0x018c, IOException -> 0x01d8 }
        r14 = "Traceroute process gets interrupted";
        p000.dgu.m27244e(r14);	 Catch:{ SecurityException -> 0x018c, IOException -> 0x01d8 }
        r0 = r19;
        r14 = r0.f21597b;	 Catch:{ SecurityException -> 0x018c, IOException -> 0x01d8 }
        r0 = r19;
        r0.m27239a(r14);	 Catch:{ SecurityException -> 0x018c, IOException -> 0x01d8 }
    L_0x0141:
        r3 = r3 + 1;
        goto L_0x00ec;
    L_0x0144:
        r2 = move-exception;
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = "Cannot resolve host ";
        r2 = r2.append(r3);
        r2 = r2.append(r9);
        r2 = r2.toString();
        p000.dgu.m27244e(r2);
        r0 = r19;
        r2 = r0.f21596a;
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r4 = "UnknownHostException=";
        r3 = r3.append(r4);
        r0 = r19;
        r4 = r0.f21596a;
        r3 = r3.append(r4);
        r3 = r3.toString();
        r2 = p000.dgu.C4899c.m27236a(r2, r3);
        goto L_0x009f;
    L_0x017c:
        r14 = move-exception;
        r14 = "Traceroute process timeout";
        p000.dgu.m27244e(r14);	 Catch:{ SecurityException -> 0x018c, IOException -> 0x01d8 }
        r0 = r19;
        r14 = r0.f21597b;	 Catch:{ SecurityException -> 0x018c, IOException -> 0x01d8 }
        r0 = r19;
        r0.m27239a(r14);	 Catch:{ SecurityException -> 0x018c, IOException -> 0x01d8 }
        goto L_0x0141;
    L_0x018c:
        r2 = move-exception;
        r2 = "Does not have the permission to run ping on this device";
        p000.dgu.m27244e(r2);	 Catch:{ all -> 0x039b }
        r0 = r19;
        r2 = r0.f21597b;
        r0 = r19;
        r0.m27239a(r2);
    L_0x019b:
        r2 = r6 + 1;
        r6 = r2;
        r2 = r7;
        goto L_0x00a2;
    L_0x01a1:
        r14 = r14.f21591a;	 Catch:{ SecurityException -> 0x018c, IOException -> 0x01d8 }
        r14 = (double) r14;	 Catch:{ SecurityException -> 0x018c, IOException -> 0x01d8 }
        r4 = r4 + r14;
        r2 = r2 + 1;
        r0 = r19;
        r14 = r0.f21597b;	 Catch:{ SecurityException -> 0x018c, IOException -> 0x01d8 }
        r14 = r14.getInputStream();	 Catch:{ SecurityException -> 0x018c, IOException -> 0x01d8 }
        r15 = new java.io.BufferedReader;	 Catch:{ SecurityException -> 0x018c, IOException -> 0x01d8 }
        r16 = new java.io.InputStreamReader;	 Catch:{ SecurityException -> 0x018c, IOException -> 0x01d8 }
        r0 = r16;
        r0.<init>(r14);	 Catch:{ SecurityException -> 0x018c, IOException -> 0x01d8 }
        r15.<init>(r16);	 Catch:{ SecurityException -> 0x018c, IOException -> 0x01d8 }
        r0 = r19;
        r0.m27238a(r15, r13, r11);	 Catch:{ SecurityException -> 0x018c, IOException -> 0x01d8 }
        r0 = r19;
        r14 = r0.f21597b;	 Catch:{ SecurityException -> 0x018c, IOException -> 0x01d8 }
        r0 = r19;
        r0.m27239a(r14);	 Catch:{ SecurityException -> 0x018c, IOException -> 0x01d8 }
        r14 = 500; // 0x1f4 float:7.0E-43 double:2.47E-321;
        java.lang.Thread.sleep(r14);	 Catch:{ InterruptedException -> 0x01d0 }
        goto L_0x0141;
    L_0x01d0:
        r14 = move-exception;
        r14 = "Sleep interrupted between ping intervals";
        p000.dgu.m27244e(r14);	 Catch:{ SecurityException -> 0x018c, IOException -> 0x01d8 }
        goto L_0x0141;
    L_0x01d8:
        r2 = move-exception;
        r3 = "The ping program cannot be executed";
        p000.dgu.m27244e(r3);	 Catch:{ all -> 0x039b }
        r2 = r2.getMessage();	 Catch:{ all -> 0x039b }
        p000.dgu.m27244e(r2);	 Catch:{ all -> 0x039b }
        r0 = r19;
        r2 = r0.f21597b;
        r0 = r19;
        r0.m27239a(r2);
        goto L_0x019b;
    L_0x01ef:
        if (r2 == 0) goto L_0x0217;
    L_0x01f1:
        r2 = (double) r2;
        r2 = r4 / r2;
        r4 = r2;
    L_0x01f5:
        r2 = -4616189618054758400; // 0xbff0000000000000 float:0.0 double:-1.0;
        r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1));
        if (r2 != 0) goto L_0x021e;
    L_0x01fb:
        r3 = "";
        r2 = 0;
    L_0x01fe:
        r8 = 1;
        if (r2 >= r8) goto L_0x021b;
    L_0x0201:
        r8 = new java.lang.StringBuilder;	 Catch:{ SecurityException -> 0x018c, IOException -> 0x01d8 }
        r8.<init>();	 Catch:{ SecurityException -> 0x018c, IOException -> 0x01d8 }
        r3 = r8.append(r3);	 Catch:{ SecurityException -> 0x018c, IOException -> 0x01d8 }
        r8 = "* ";
        r3 = r3.append(r8);	 Catch:{ SecurityException -> 0x018c, IOException -> 0x01d8 }
        r3 = r3.toString();	 Catch:{ SecurityException -> 0x018c, IOException -> 0x01d8 }
        r2 = r2 + 1;
        goto L_0x01fe;
    L_0x0217:
        r2 = -4616189618054758400; // 0xbff0000000000000 float:0.0 double:-1.0;
        r4 = r2;
        goto L_0x01f5;
    L_0x021b:
        r13.add(r3);	 Catch:{ SecurityException -> 0x018c, IOException -> 0x01d8 }
    L_0x021e:
        r2 = new java.lang.StringBuilder;	 Catch:{ SecurityException -> 0x018c, IOException -> 0x01d8 }
        r2.<init>();	 Catch:{ SecurityException -> 0x018c, IOException -> 0x01d8 }
        r3 = "RTT is ";
        r2 = r2.append(r3);	 Catch:{ SecurityException -> 0x018c, IOException -> 0x01d8 }
        r2 = r2.append(r4);	 Catch:{ SecurityException -> 0x018c, IOException -> 0x01d8 }
        r2 = r2.toString();	 Catch:{ SecurityException -> 0x018c, IOException -> 0x01d8 }
        p000.dgu.m27244e(r2);	 Catch:{ SecurityException -> 0x018c, IOException -> 0x01d8 }
        r2 = new dgu$a;	 Catch:{ SecurityException -> 0x018c, IOException -> 0x01d8 }
        r2.<init>(r13, r4);	 Catch:{ SecurityException -> 0x018c, IOException -> 0x01d8 }
        r10.add(r2);	 Catch:{ SecurityException -> 0x018c, IOException -> 0x01d8 }
        r3 = new java.lang.StringBuffer;	 Catch:{ SecurityException -> 0x018c, IOException -> 0x01d8 }
        r2 = new java.lang.StringBuilder;	 Catch:{ SecurityException -> 0x018c, IOException -> 0x01d8 }
        r2.<init>();	 Catch:{ SecurityException -> 0x018c, IOException -> 0x01d8 }
        r2 = r2.append(r6);	 Catch:{ SecurityException -> 0x018c, IOException -> 0x01d8 }
        r4 = ": ";
        r2 = r2.append(r4);	 Catch:{ SecurityException -> 0x018c, IOException -> 0x01d8 }
        r2 = r2.toString();	 Catch:{ SecurityException -> 0x018c, IOException -> 0x01d8 }
        r3.<init>(r2);	 Catch:{ SecurityException -> 0x018c, IOException -> 0x01d8 }
        r4 = r13.iterator();	 Catch:{ SecurityException -> 0x018c, IOException -> 0x01d8 }
    L_0x0258:
        r2 = r4.hasNext();	 Catch:{ SecurityException -> 0x018c, IOException -> 0x01d8 }
        if (r2 == 0) goto L_0x03a6;
    L_0x025e:
        r2 = r4.next();	 Catch:{ SecurityException -> 0x018c, IOException -> 0x01d8 }
        r2 = (java.lang.String) r2;	 Catch:{ SecurityException -> 0x018c, IOException -> 0x01d8 }
        r5 = r2.compareTo(r11);	 Catch:{ SecurityException -> 0x018c, IOException -> 0x01d8 }
        if (r5 != 0) goto L_0x0383;
    L_0x026a:
        r2 = new java.lang.StringBuilder;	 Catch:{ SecurityException -> 0x018c, IOException -> 0x01d8 }
        r2.<init>();	 Catch:{ SecurityException -> 0x018c, IOException -> 0x01d8 }
        r2 = r2.append(r6);	 Catch:{ SecurityException -> 0x018c, IOException -> 0x01d8 }
        r3 = ": ";
        r2 = r2.append(r3);	 Catch:{ SecurityException -> 0x018c, IOException -> 0x01d8 }
        r2 = r2.append(r11);	 Catch:{ SecurityException -> 0x018c, IOException -> 0x01d8 }
        r2 = r2.toString();	 Catch:{ SecurityException -> 0x018c, IOException -> 0x01d8 }
        p000.dgu.m27244e(r2);	 Catch:{ SecurityException -> 0x018c, IOException -> 0x01d8 }
        r2 = new java.lang.StringBuilder;	 Catch:{ SecurityException -> 0x018c, IOException -> 0x01d8 }
        r2.<init>();	 Catch:{ SecurityException -> 0x018c, IOException -> 0x01d8 }
        r3 = " Finished! ";
        r2 = r2.append(r3);	 Catch:{ SecurityException -> 0x018c, IOException -> 0x01d8 }
        r2 = r2.append(r9);	 Catch:{ SecurityException -> 0x018c, IOException -> 0x01d8 }
        r3 = " reached in ";
        r2 = r2.append(r3);	 Catch:{ SecurityException -> 0x018c, IOException -> 0x01d8 }
        r2 = r2.append(r6);	 Catch:{ SecurityException -> 0x018c, IOException -> 0x01d8 }
        r3 = " hops";
        r2 = r2.append(r3);	 Catch:{ SecurityException -> 0x018c, IOException -> 0x01d8 }
        r2 = r2.toString();	 Catch:{ SecurityException -> 0x018c, IOException -> 0x01d8 }
        p000.dgu.m27244e(r2);	 Catch:{ SecurityException -> 0x018c, IOException -> 0x01d8 }
        r0 = r19;
        r2 = r0.f21599d;	 Catch:{ SecurityException -> 0x018c, IOException -> 0x01d8 }
        r3 = "success";
        r4 = 1;
        r4 = java.lang.String.valueOf(r4);	 Catch:{ SecurityException -> 0x018c, IOException -> 0x01d8 }
        r2.put(r3, r4);	 Catch:{ SecurityException -> 0x018c, IOException -> 0x01d8 }
        r2 = 1;
        r0 = r19;
        r0.f21598c = r2;	 Catch:{ SecurityException -> 0x018c, IOException -> 0x01d8 }
        r0 = r19;
        r2 = r0.f21599d;	 Catch:{ SecurityException -> 0x018c, IOException -> 0x01d8 }
        r3 = "num_hops";
        r4 = java.lang.String.valueOf(r6);	 Catch:{ SecurityException -> 0x018c, IOException -> 0x01d8 }
        r2.put(r3, r4);	 Catch:{ SecurityException -> 0x018c, IOException -> 0x01d8 }
        r2 = 0;
        r8 = r2;
    L_0x02cc:
        r2 = r10.size();	 Catch:{ SecurityException -> 0x018c, IOException -> 0x01d8 }
        if (r8 >= r2) goto L_0x034d;
    L_0x02d2:
        r2 = r10.get(r8);	 Catch:{ SecurityException -> 0x018c, IOException -> 0x01d8 }
        r2 = (p000.dgu.C4897a) r2;	 Catch:{ SecurityException -> 0x018c, IOException -> 0x01d8 }
        r3 = 1;
        r4 = r2.f21589a;	 Catch:{ SecurityException -> 0x018c, IOException -> 0x01d8 }
        r13 = r4.iterator();	 Catch:{ SecurityException -> 0x018c, IOException -> 0x01d8 }
        r4 = r3;
    L_0x02e0:
        r3 = r13.hasNext();	 Catch:{ SecurityException -> 0x018c, IOException -> 0x01d8 }
        if (r3 == 0) goto L_0x0314;
    L_0x02e6:
        r3 = r13.next();	 Catch:{ SecurityException -> 0x018c, IOException -> 0x01d8 }
        r3 = (java.lang.String) r3;	 Catch:{ SecurityException -> 0x018c, IOException -> 0x01d8 }
        r0 = r19;
        r14 = r0.f21599d;	 Catch:{ SecurityException -> 0x018c, IOException -> 0x01d8 }
        r5 = new java.lang.StringBuilder;	 Catch:{ SecurityException -> 0x018c, IOException -> 0x01d8 }
        r5.<init>();	 Catch:{ SecurityException -> 0x018c, IOException -> 0x01d8 }
        r15 = "hop_";
        r5 = r5.append(r15);	 Catch:{ SecurityException -> 0x018c, IOException -> 0x01d8 }
        r5 = r5.append(r8);	 Catch:{ SecurityException -> 0x018c, IOException -> 0x01d8 }
        r15 = "_addr_";
        r15 = r5.append(r15);	 Catch:{ SecurityException -> 0x018c, IOException -> 0x01d8 }
        r5 = r4 + 1;
        r4 = r15.append(r4);	 Catch:{ SecurityException -> 0x018c, IOException -> 0x01d8 }
        r4 = r4.toString();	 Catch:{ SecurityException -> 0x018c, IOException -> 0x01d8 }
        r14.put(r4, r3);	 Catch:{ SecurityException -> 0x018c, IOException -> 0x01d8 }
        r4 = r5;
        goto L_0x02e0;
    L_0x0314:
        r0 = r19;
        r3 = r0.f21599d;	 Catch:{ SecurityException -> 0x018c, IOException -> 0x01d8 }
        r4 = new java.lang.StringBuilder;	 Catch:{ SecurityException -> 0x018c, IOException -> 0x01d8 }
        r4.<init>();	 Catch:{ SecurityException -> 0x018c, IOException -> 0x01d8 }
        r5 = "hop_";
        r4 = r4.append(r5);	 Catch:{ SecurityException -> 0x018c, IOException -> 0x01d8 }
        r4 = r4.append(r8);	 Catch:{ SecurityException -> 0x018c, IOException -> 0x01d8 }
        r5 = "_rtt_ms";
        r4 = r4.append(r5);	 Catch:{ SecurityException -> 0x018c, IOException -> 0x01d8 }
        r4 = r4.toString();	 Catch:{ SecurityException -> 0x018c, IOException -> 0x01d8 }
        r14 = r2.f21590b;	 Catch:{ SecurityException -> 0x018c, IOException -> 0x01d8 }
        r16 = 4652007308841189376; // 0x408f400000000000 float:0.0 double:1000.0;
        r14 = r14 * r16;
        r14 = java.lang.Math.round(r14);	 Catch:{ SecurityException -> 0x018c, IOException -> 0x01d8 }
        r16 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r14 = r14 / r16;
        r2 = java.lang.String.valueOf(r14);	 Catch:{ SecurityException -> 0x018c, IOException -> 0x01d8 }
        r3.put(r4, r2);	 Catch:{ SecurityException -> 0x018c, IOException -> 0x01d8 }
        r2 = r8 + 1;
        r8 = r2;
        goto L_0x02cc;
    L_0x034d:
        r2 = new java.lang.StringBuilder;	 Catch:{ SecurityException -> 0x018c, IOException -> 0x01d8 }
        r2.<init>();	 Catch:{ SecurityException -> 0x018c, IOException -> 0x01d8 }
        r0 = r19;
        r3 = r0.f21596a;	 Catch:{ SecurityException -> 0x018c, IOException -> 0x01d8 }
        r2 = r2.append(r3);	 Catch:{ SecurityException -> 0x018c, IOException -> 0x01d8 }
        r3 = " resolvedIp=";
        r2 = r2.append(r3);	 Catch:{ SecurityException -> 0x018c, IOException -> 0x01d8 }
        r2 = r2.append(r11);	 Catch:{ SecurityException -> 0x018c, IOException -> 0x01d8 }
        r2 = r2.toString();	 Catch:{ SecurityException -> 0x018c, IOException -> 0x01d8 }
        r0 = r19;
        r3 = r0.f21599d;	 Catch:{ SecurityException -> 0x018c, IOException -> 0x01d8 }
        r2 = p000.dgs.m27232a(r2, r3);	 Catch:{ SecurityException -> 0x018c, IOException -> 0x01d8 }
        r0 = r19;
        r3 = r0.f21596a;	 Catch:{ SecurityException -> 0x018c, IOException -> 0x01d8 }
        r2 = p000.dgu.C4899c.m27236a(r3, r2);	 Catch:{ SecurityException -> 0x018c, IOException -> 0x01d8 }
        r0 = r19;
        r3 = r0.f21597b;
        r0 = r19;
        r0.m27239a(r3);
        goto L_0x009f;
    L_0x0383:
        r5 = new java.lang.StringBuilder;	 Catch:{ SecurityException -> 0x018c, IOException -> 0x01d8 }
        r5.<init>();	 Catch:{ SecurityException -> 0x018c, IOException -> 0x01d8 }
        r2 = r5.append(r2);	 Catch:{ SecurityException -> 0x018c, IOException -> 0x01d8 }
        r5 = " | ";
        r2 = r2.append(r5);	 Catch:{ SecurityException -> 0x018c, IOException -> 0x01d8 }
        r2 = r2.toString();	 Catch:{ SecurityException -> 0x018c, IOException -> 0x01d8 }
        r3.append(r2);	 Catch:{ SecurityException -> 0x018c, IOException -> 0x01d8 }
        goto L_0x0258;
    L_0x039b:
        r2 = move-exception;
        r0 = r19;
        r3 = r0.f21597b;
        r0 = r19;
        r0.m27239a(r3);
        throw r2;
    L_0x03a6:
        r2 = r3.length();	 Catch:{ SecurityException -> 0x018c, IOException -> 0x01d8 }
        r2 = r2 + -3;
        r4 = r3.length();	 Catch:{ SecurityException -> 0x018c, IOException -> 0x01d8 }
        r3.delete(r2, r4);	 Catch:{ SecurityException -> 0x018c, IOException -> 0x01d8 }
        r2 = r3.toString();	 Catch:{ SecurityException -> 0x018c, IOException -> 0x01d8 }
        p000.dgu.m27244e(r2);	 Catch:{ SecurityException -> 0x018c, IOException -> 0x01d8 }
        r0 = r19;
        r2 = r0.f21597b;
        r0 = r19;
        r0.m27239a(r2);
        goto L_0x019b;
    L_0x03c5:
        r0 = r19;
        r2 = r0.f21599d;
        r3 = "num_hops";
        r4 = java.lang.String.valueOf(r6);
        r2.put(r3, r4);
        r2 = 0;
        r4 = r2;
    L_0x03d4:
        r2 = r10.size();
        if (r4 >= r2) goto L_0x0453;
    L_0x03da:
        r2 = r10.get(r4);
        r2 = (p000.dgu.C4897a) r2;
        r3 = 1;
        r5 = r2.f21589a;
        r7 = r5.iterator();
        r5 = r3;
    L_0x03e8:
        r3 = r7.hasNext();
        if (r3 == 0) goto L_0x041c;
    L_0x03ee:
        r3 = r7.next();
        r3 = (java.lang.String) r3;
        r0 = r19;
        r8 = r0.f21599d;
        r6 = new java.lang.StringBuilder;
        r6.<init>();
        r9 = "hop_";
        r6 = r6.append(r9);
        r6 = r6.append(r4);
        r9 = "_addr_";
        r9 = r6.append(r9);
        r6 = r5 + 1;
        r5 = r9.append(r5);
        r5 = r5.toString();
        r8.put(r5, r3);
        r5 = r6;
        goto L_0x03e8;
    L_0x041c:
        r0 = r19;
        r3 = r0.f21599d;
        r5 = new java.lang.StringBuilder;
        r5.<init>();
        r6 = "hop_";
        r5 = r5.append(r6);
        r5 = r5.append(r4);
        r6 = "_rtt_ms";
        r5 = r5.append(r6);
        r5 = r5.toString();
        r6 = r2.f21590b;
        r8 = 4652007308841189376; // 0x408f400000000000 float:0.0 double:1000.0;
        r6 = r6 * r8;
        r6 = java.lang.Math.round(r6);
        r8 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r6 = r6 / r8;
        r2 = java.lang.String.valueOf(r6);
        r3.put(r5, r2);
        r2 = r4 + 1;
        r4 = r2;
        goto L_0x03d4;
    L_0x0453:
        r0 = r19;
        r2 = r0.f21599d;
        r3 = "success";
        r4 = 0;
        r4 = java.lang.String.valueOf(r4);
        r2.put(r3, r4);
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r0 = r19;
        r3 = r0.f21596a;
        r2 = r2.append(r3);
        r3 = " resolvedIp=";
        r2 = r2.append(r3);
        r2 = r2.append(r11);
        r2 = r2.toString();
        r0 = r19;
        r3 = r0.f21596a;
        r0 = r19;
        r4 = r0.f21599d;
        r2 = p000.dgs.m27232a(r2, r4);
        r2 = p000.dgu.C4899c.m27236a(r3, r2);
        goto L_0x009f;
        */
        throw new UnsupportedOperationException("Method not decompiled: dgu.a():dgu$c");
    }

    /* renamed from: e */
    private static void m27244e(String str) {
    }
}
