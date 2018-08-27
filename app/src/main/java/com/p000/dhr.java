package com.p000;

import java.io.File;
import java.util.TimerTask;
import p000.dfu.C4884a;

/* compiled from: LazyHttpDownloader */
/* renamed from: dhr */
public class dhr extends dht {
    /* renamed from: a */
    private boolean f21656a = false;
    /* renamed from: b */
    private boolean f21657b;

    /* compiled from: LazyHttpDownloader */
    /* renamed from: dhr$1 */
    class C49101 extends TimerTask {
        /* renamed from: a */
        final /* synthetic */ Thread f21648a;
        /* renamed from: b */
        final /* synthetic */ dft f21649b;
        /* renamed from: c */
        final /* synthetic */ File f21650c;
        /* renamed from: d */
        final /* synthetic */ long f21651d;
        /* renamed from: e */
        final /* synthetic */ dhr f21652e;

        C49101(dhr dhr, Thread thread, dft dft, File file, long j) {
            this.f21652e = dhr;
            this.f21648a = thread;
            this.f21649b = dft;
            this.f21650c = file;
            this.f21651d = j;
        }

        public void run() {
            if (this.f21648a.isInterrupted()) {
                this.f21649b.m27106c();
                cancel();
                this.f21650c.delete();
                this.f21652e.m27316a(this.f21651d, "LazyHttpDownloader:Interrupted");
            }
            if (!this.f21648a.isAlive()) {
                cancel();
            }
        }
    }

    /* compiled from: LazyHttpDownloader */
    /* renamed from: dhr$a */
    class C4911a implements C4884a {
        /* renamed from: a */
        long f21653a;
        /* renamed from: b */
        final /* synthetic */ dhr f21654b;

        public C4911a(dhr dhr, long j) {
            this.f21654b = dhr;
            this.f21653a = j;
        }

        /* renamed from: a */
        public void mo4411a(long j, long j2) {
            this.f21654b.m27315a(this.f21653a, j, j2);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public void m27320a(long r22, String r24, p000.dft r25, String r26) {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: Can't find block by offset: 0x001d in list [B:23:0x0081]
	at jadx.core.utils.BlockUtils.getBlockByOffset(BlockUtils.java:43)
	at jadx.core.dex.instructions.IfNode.initBlocks(IfNode.java:60)
	at jadx.core.dex.visitors.blocksmaker.BlockFinish.initBlocksInIfNodes(BlockFinish.java:48)
	at jadx.core.dex.visitors.blocksmaker.BlockFinish.visit(BlockFinish.java:33)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/1976752685.run(Unknown Source)
*/
        /*
        r21 = this;
        r16 = java.lang.System.currentTimeMillis();
        r21.m27313a(r22);
        r4 = new java.io.File;
        r0 = r26;
        r4.<init>(r0);
        r4 = r4.exists();
        if (r4 == 0) goto L_0x001e;
    L_0x0014:
        r4 = 0;
        r0 = r21;
        r1 = r22;
        r0.m27314a(r1, r4);
    L_0x001d:
        return;
    L_0x001e:
        r4 = 0;
        r0 = r21;	 Catch:{ Exception -> 0x0085 }
        r1 = r26;	 Catch:{ Exception -> 0x0085 }
        r4 = r0.m27312a(r1);	 Catch:{ Exception -> 0x0085 }
        r5 = r4.exists();	 Catch:{ Exception -> 0x0085 }
        if (r5 == 0) goto L_0x003d;	 Catch:{ Exception -> 0x0085 }
    L_0x002d:
        r6 = r4.lastModified();	 Catch:{ Exception -> 0x0085 }
        r6 = r16 - r6;	 Catch:{ Exception -> 0x0085 }
        r8 = 120000; // 0x1d4c0 float:1.68156E-40 double:5.9288E-319;	 Catch:{ Exception -> 0x0085 }
        r5 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1));	 Catch:{ Exception -> 0x0085 }
        if (r5 <= 0) goto L_0x001d;	 Catch:{ Exception -> 0x0085 }
    L_0x003a:
        r4.delete();	 Catch:{ Exception -> 0x0085 }
    L_0x003d:
        r9 = r4;
    L_0x003e:
        if (r9 == 0) goto L_0x001d;
    L_0x0040:
        r9.createNewFile();	 Catch:{ Exception -> 0x01af }
        r7 = java.lang.Thread.currentThread();
        r18 = new java.util.Timer;
        r18.<init>();
        r4 = r25.m27100b();	 Catch:{ IOException -> 0x014f, b -> 0x0173, all -> 0x0197 }
        r5 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;	 Catch:{ IOException -> 0x014f, b -> 0x0173, all -> 0x0197 }
        if (r4 <= r5) goto L_0x0088;	 Catch:{ IOException -> 0x014f, b -> 0x0173, all -> 0x0197 }
    L_0x0054:
        r5 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x014f, b -> 0x0173, all -> 0x0197 }
        r5.<init>();	 Catch:{ IOException -> 0x014f, b -> 0x0173, all -> 0x0197 }
        r6 = "HttpCode:";	 Catch:{ IOException -> 0x014f, b -> 0x0173, all -> 0x0197 }
        r5 = r5.append(r6);	 Catch:{ IOException -> 0x014f, b -> 0x0173, all -> 0x0197 }
        r4 = r5.append(r4);	 Catch:{ IOException -> 0x014f, b -> 0x0173, all -> 0x0197 }
        r4 = r4.toString();	 Catch:{ IOException -> 0x014f, b -> 0x0173, all -> 0x0197 }
        r0 = r21;	 Catch:{ IOException -> 0x014f, b -> 0x0173, all -> 0x0197 }
        r1 = r22;	 Catch:{ IOException -> 0x014f, b -> 0x0173, all -> 0x0197 }
        r0.m27316a(r1, r4);	 Catch:{ IOException -> 0x014f, b -> 0x0173, all -> 0x0197 }
        r0 = r21;
        r1 = r26;
        r4 = r0.m27312a(r1);
        r5 = r4.exists();
        if (r5 == 0) goto L_0x007f;
    L_0x007c:
        r4.delete();
    L_0x007f:
        if (r18 == 0) goto L_0x001d;
    L_0x0081:
        r18.cancel();
        goto L_0x001d;
    L_0x0085:
        r5 = move-exception;
        r9 = r4;
        goto L_0x003e;
    L_0x0088:
        r4 = r25.m27120j();	 Catch:{ IOException -> 0x014f, b -> 0x0173, all -> 0x0197 }
        r19 = new dfu;	 Catch:{ IOException -> 0x014f, b -> 0x0173, all -> 0x0197 }
        r0 = r19;	 Catch:{ IOException -> 0x014f, b -> 0x0173, all -> 0x0197 }
        r0.<init>(r9);	 Catch:{ IOException -> 0x014f, b -> 0x0173, all -> 0x0197 }
        r20 = new java.io.BufferedOutputStream;	 Catch:{ IOException -> 0x014f, b -> 0x0173, all -> 0x0197 }
        r0 = r20;	 Catch:{ IOException -> 0x014f, b -> 0x0173, all -> 0x0197 }
        r1 = r19;	 Catch:{ IOException -> 0x014f, b -> 0x0173, all -> 0x0197 }
        r0.<init>(r1);	 Catch:{ IOException -> 0x014f, b -> 0x0173, all -> 0x0197 }
        if (r4 <= 0) goto L_0x00b1;	 Catch:{ IOException -> 0x014f, b -> 0x0173, all -> 0x0197 }
    L_0x009e:
        r0 = r19;	 Catch:{ IOException -> 0x014f, b -> 0x0173, all -> 0x0197 }
        r0.m27131a(r4);	 Catch:{ IOException -> 0x014f, b -> 0x0173, all -> 0x0197 }
        r5 = new dhr$a;	 Catch:{ IOException -> 0x014f, b -> 0x0173, all -> 0x0197 }
        r0 = r21;	 Catch:{ IOException -> 0x014f, b -> 0x0173, all -> 0x0197 }
        r1 = r22;	 Catch:{ IOException -> 0x014f, b -> 0x0173, all -> 0x0197 }
        r5.<init>(r0, r1);	 Catch:{ IOException -> 0x014f, b -> 0x0173, all -> 0x0197 }
        r0 = r19;	 Catch:{ IOException -> 0x014f, b -> 0x0173, all -> 0x0197 }
        r0.m27132a(r5);	 Catch:{ IOException -> 0x014f, b -> 0x0173, all -> 0x0197 }
    L_0x00b1:
        r0 = r21;	 Catch:{ IOException -> 0x014f, b -> 0x0173, all -> 0x0197 }
        r5 = r0.f21656a;	 Catch:{ IOException -> 0x014f, b -> 0x0173, all -> 0x0197 }
        if (r5 == 0) goto L_0x00cc;	 Catch:{ IOException -> 0x014f, b -> 0x0173, all -> 0x0197 }
    L_0x00b7:
        r5 = new dhr$1;	 Catch:{ IOException -> 0x014f, b -> 0x0173, all -> 0x0197 }
        r6 = r21;	 Catch:{ IOException -> 0x014f, b -> 0x0173, all -> 0x0197 }
        r8 = r25;	 Catch:{ IOException -> 0x014f, b -> 0x0173, all -> 0x0197 }
        r10 = r22;	 Catch:{ IOException -> 0x014f, b -> 0x0173, all -> 0x0197 }
        r5.<init>(r6, r7, r8, r9, r10);	 Catch:{ IOException -> 0x014f, b -> 0x0173, all -> 0x0197 }
        r12 = 0;	 Catch:{ IOException -> 0x014f, b -> 0x0173, all -> 0x0197 }
        r14 = 10;	 Catch:{ IOException -> 0x014f, b -> 0x0173, all -> 0x0197 }
        r10 = r18;	 Catch:{ IOException -> 0x014f, b -> 0x0173, all -> 0x0197 }
        r11 = r5;	 Catch:{ IOException -> 0x014f, b -> 0x0173, all -> 0x0197 }
        r10.scheduleAtFixedRate(r11, r12, r14);	 Catch:{ IOException -> 0x014f, b -> 0x0173, all -> 0x0197 }
    L_0x00cc:
        r0 = r25;	 Catch:{ IOException -> 0x014f, b -> 0x0173, all -> 0x0197 }
        r1 = r20;	 Catch:{ IOException -> 0x014f, b -> 0x0173, all -> 0x0197 }
        r0.m27084a(r1);	 Catch:{ IOException -> 0x014f, b -> 0x0173, all -> 0x0197 }
        r20.flush();	 Catch:{ IOException -> 0x014f, b -> 0x0173, all -> 0x0197 }
        r20.close();	 Catch:{ IOException -> 0x014f, b -> 0x0173, all -> 0x0197 }
        r19.close();	 Catch:{ IOException -> 0x014f, b -> 0x0173, all -> 0x0197 }
        r0 = r21;	 Catch:{ IOException -> 0x014f, b -> 0x0173, all -> 0x0197 }
        r5 = r0.f21657b;	 Catch:{ IOException -> 0x014f, b -> 0x0173, all -> 0x0197 }
        if (r5 == 0) goto L_0x011f;	 Catch:{ IOException -> 0x014f, b -> 0x0173, all -> 0x0197 }
    L_0x00e2:
        if (r4 <= 0) goto L_0x011f;	 Catch:{ IOException -> 0x014f, b -> 0x0173, all -> 0x0197 }
    L_0x00e4:
        r6 = (long) r4;	 Catch:{ IOException -> 0x014f, b -> 0x0173, all -> 0x0197 }
        r10 = r9.length();	 Catch:{ IOException -> 0x014f, b -> 0x0173, all -> 0x0197 }
        r5 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1));	 Catch:{ IOException -> 0x014f, b -> 0x0173, all -> 0x0197 }
        if (r5 <= 0) goto L_0x011f;	 Catch:{ IOException -> 0x014f, b -> 0x0173, all -> 0x0197 }
    L_0x00ed:
        r14 = r9.length();	 Catch:{ IOException -> 0x014f, b -> 0x0173, all -> 0x0197 }
        r0 = (long) r4;	 Catch:{ IOException -> 0x014f, b -> 0x0173, all -> 0x0197 }
        r16 = r0;	 Catch:{ IOException -> 0x014f, b -> 0x0173, all -> 0x0197 }
        r11 = r21;	 Catch:{ IOException -> 0x014f, b -> 0x0173, all -> 0x0197 }
        r12 = r22;	 Catch:{ IOException -> 0x014f, b -> 0x0173, all -> 0x0197 }
        r11.m27319b(r12, r14, r16);	 Catch:{ IOException -> 0x014f, b -> 0x0173, all -> 0x0197 }
        r9.delete();	 Catch:{ IOException -> 0x014f, b -> 0x0173, all -> 0x0197 }
        r4 = "LazyHttpDownloader:DownloadIncomplete";	 Catch:{ IOException -> 0x014f, b -> 0x0173, all -> 0x0197 }
        r0 = r21;	 Catch:{ IOException -> 0x014f, b -> 0x0173, all -> 0x0197 }
        r1 = r22;	 Catch:{ IOException -> 0x014f, b -> 0x0173, all -> 0x0197 }
        r0.m27316a(r1, r4);	 Catch:{ IOException -> 0x014f, b -> 0x0173, all -> 0x0197 }
        r0 = r21;
        r1 = r26;
        r4 = r0.m27312a(r1);
        r5 = r4.exists();
        if (r5 == 0) goto L_0x0118;
    L_0x0115:
        r4.delete();
    L_0x0118:
        if (r18 == 0) goto L_0x001d;
    L_0x011a:
        r18.cancel();
        goto L_0x001d;
    L_0x011f:
        r21.m27318b(r22);	 Catch:{ IOException -> 0x014f, b -> 0x0173, all -> 0x0197 }
        r4 = new java.io.File;	 Catch:{ IOException -> 0x014f, b -> 0x0173, all -> 0x0197 }
        r0 = r26;	 Catch:{ IOException -> 0x014f, b -> 0x0173, all -> 0x0197 }
        r4.<init>(r0);	 Catch:{ IOException -> 0x014f, b -> 0x0173, all -> 0x0197 }
        r9.renameTo(r4);	 Catch:{ IOException -> 0x014f, b -> 0x0173, all -> 0x0197 }
        r4 = p000.djw.m27633a(r16);	 Catch:{ IOException -> 0x014f, b -> 0x0173, all -> 0x0197 }
        r0 = r21;	 Catch:{ IOException -> 0x014f, b -> 0x0173, all -> 0x0197 }
        r1 = r22;	 Catch:{ IOException -> 0x014f, b -> 0x0173, all -> 0x0197 }
        r0.m27314a(r1, r4);	 Catch:{ IOException -> 0x014f, b -> 0x0173, all -> 0x0197 }
        r0 = r21;
        r1 = r26;
        r4 = r0.m27312a(r1);
        r5 = r4.exists();
        if (r5 == 0) goto L_0x0148;
    L_0x0145:
        r4.delete();
    L_0x0148:
        if (r18 == 0) goto L_0x001d;
    L_0x014a:
        r18.cancel();
        goto L_0x001d;
    L_0x014f:
        r4 = move-exception;
        r4 = r4.getMessage();	 Catch:{ IOException -> 0x014f, b -> 0x0173, all -> 0x0197 }
        r0 = r21;	 Catch:{ IOException -> 0x014f, b -> 0x0173, all -> 0x0197 }
        r1 = r22;	 Catch:{ IOException -> 0x014f, b -> 0x0173, all -> 0x0197 }
        r0.m27316a(r1, r4);	 Catch:{ IOException -> 0x014f, b -> 0x0173, all -> 0x0197 }
        r0 = r21;
        r1 = r26;
        r4 = r0.m27312a(r1);
        r5 = r4.exists();
        if (r5 == 0) goto L_0x016c;
    L_0x0169:
        r4.delete();
    L_0x016c:
        if (r18 == 0) goto L_0x001d;
    L_0x016e:
        r18.cancel();
        goto L_0x001d;
    L_0x0173:
        r4 = move-exception;
        r4 = r4.getMessage();	 Catch:{ IOException -> 0x014f, b -> 0x0173, all -> 0x0197 }
        r0 = r21;	 Catch:{ IOException -> 0x014f, b -> 0x0173, all -> 0x0197 }
        r1 = r22;	 Catch:{ IOException -> 0x014f, b -> 0x0173, all -> 0x0197 }
        r0.m27316a(r1, r4);	 Catch:{ IOException -> 0x014f, b -> 0x0173, all -> 0x0197 }
        r0 = r21;
        r1 = r26;
        r4 = r0.m27312a(r1);
        r5 = r4.exists();
        if (r5 == 0) goto L_0x0190;
    L_0x018d:
        r4.delete();
    L_0x0190:
        if (r18 == 0) goto L_0x001d;
    L_0x0192:
        r18.cancel();
        goto L_0x001d;
    L_0x0197:
        r4 = move-exception;
        r0 = r21;
        r1 = r26;
        r5 = r0.m27312a(r1);
        r6 = r5.exists();
        if (r6 == 0) goto L_0x01a9;
    L_0x01a6:
        r5.delete();
    L_0x01a9:
        if (r18 == 0) goto L_0x01ae;
    L_0x01ab:
        r18.cancel();
    L_0x01ae:
        throw r4;
    L_0x01af:
        r4 = move-exception;
        goto L_0x001d;
        */
        throw new UnsupportedOperationException("Method not decompiled: dhr.a(long, java.lang.String, dft, java.lang.String):void");
    }

    public dhr(dhu dhu) {
        m27317a(dhu);
        this.f21657b = true;
    }

    /* renamed from: a */
    public void m27321a(boolean z) {
        this.f21656a = z;
    }
}
