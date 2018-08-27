package com.p000;

import android.content.Context;
import android.net.Uri.Builder;
import android.os.Build.VERSION;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.internal.zzqh;
import com.inmobi.commons.ads.cache.AdDatabaseHelper;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.Thread.UncaughtExceptionHandler;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.WeakHashMap;
import p000.bhc.C1197a;

@bhd
/* renamed from: bhb */
public class bhb implements bhc {
    /* renamed from: a */
    private static final Object f6223a = new Object();
    /* renamed from: b */
    private static bhc f6224b = null;
    /* renamed from: c */
    private final Object f6225c = new Object();
    /* renamed from: d */
    private final String f6226d;
    /* renamed from: e */
    private final zzqh f6227e;
    /* renamed from: f */
    private final WeakHashMap<Thread, Boolean> f6228f = new WeakHashMap();

    bhb(String str, zzqh zzqh) {
        this.f6226d = str;
        this.f6227e = zzqh;
        m8435b();
        m8434a();
    }

    /* renamed from: a */
    public static bhc m8433a(Context context, zzqh zzqh) {
        synchronized (f6223a) {
            if (f6224b == null) {
                if (((Boolean) bbb.f5401g.m7064c()).booleanValue()) {
                    String str = "unknown";
                    try {
                        str = context.getApplicationContext().getPackageName();
                    } catch (Throwable th) {
                        bky.m9011e("Cannot obtain package name, proceeding.");
                    }
                    f6224b = new bhb(str, zzqh);
                } else {
                    f6224b = new C1197a();
                }
            }
        }
        return f6224b;
    }

    /* renamed from: a */
    private void m8434a() {
        final UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(new UncaughtExceptionHandler(this) {
            /* renamed from: b */
            final /* synthetic */ bhb f6220b;

            /* JADX WARNING: inconsistent code. */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void uncaughtException(Thread r3, Throwable r4) {
                /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: Can't find block by offset: 0x000e in list [B:4:0x0009]
	at jadx.core.utils.BlockUtils.getBlockByOffset(BlockUtils.java:43)
	at jadx.core.dex.instructions.IfNode.initBlocks(IfNode.java:60)
	at jadx.core.dex.visitors.blocksmaker.BlockFinish.initBlocksInIfNodes(BlockFinish.java:48)
	at jadx.core.dex.visitors.blocksmaker.BlockFinish.visit(BlockFinish.java:33)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/1976752685.run(Unknown Source)
*/
                /*
                r2 = this;
                r0 = r2.f6220b;	 Catch:{ Throwable -> 0x000f, all -> 0x001f }
                r0.m8439a(r3, r4);	 Catch:{ Throwable -> 0x000f, all -> 0x001f }
                r0 = r0;
                if (r0 == 0) goto L_0x000e;
            L_0x0009:
                r0 = r0;
                r0.uncaughtException(r3, r4);
            L_0x000e:
                return;
            L_0x000f:
                r0 = move-exception;
                r0 = "AdMob exception reporter failed reporting the exception.";	 Catch:{ Throwable -> 0x000f, all -> 0x001f }
                p000.bky.m9008c(r0);	 Catch:{ Throwable -> 0x000f, all -> 0x001f }
                r0 = r0;
                if (r0 == 0) goto L_0x000e;
            L_0x0019:
                r0 = r0;
                r0.uncaughtException(r3, r4);
                goto L_0x000e;
            L_0x001f:
                r0 = move-exception;
                r1 = r0;
                if (r1 == 0) goto L_0x0029;
            L_0x0024:
                r1 = r0;
                r1.uncaughtException(r3, r4);
            L_0x0029:
                throw r0;
                */
                throw new UnsupportedOperationException("Method not decompiled: bhb.1.uncaughtException(java.lang.Thread, java.lang.Throwable):void");
            }
        });
    }

    /* renamed from: b */
    private void m8435b() {
        m8438a(Looper.getMainLooper().getThread());
    }

    /* renamed from: c */
    private Throwable m8436c(Throwable th) {
        if (((Boolean) bbb.f5402h.m7064c()).booleanValue()) {
            return th;
        }
        LinkedList linkedList = new LinkedList();
        while (th != null) {
            linkedList.push(th);
            th = th.getCause();
        }
        Throwable th2 = null;
        while (!linkedList.isEmpty()) {
            Throwable th3;
            Throwable th4 = (Throwable) linkedList.pop();
            StackTraceElement[] stackTrace = th4.getStackTrace();
            ArrayList arrayList = new ArrayList();
            arrayList.add(new StackTraceElement(th4.getClass().getName(), "<filtered>", "<filtered>", 1));
            int i = 0;
            for (StackTraceElement stackTraceElement : stackTrace) {
                if (m8441a(stackTraceElement.getClassName())) {
                    arrayList.add(stackTraceElement);
                    i = 1;
                } else if (m8444b(stackTraceElement.getClassName())) {
                    arrayList.add(stackTraceElement);
                } else {
                    arrayList.add(new StackTraceElement("<filtered>", "<filtered>", "<filtered>", 1));
                }
            }
            if (i != 0) {
                th3 = th2 == null ? new Throwable(th4.getMessage()) : new Throwable(th4.getMessage(), th2);
                th3.setStackTrace((StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]));
            } else {
                th3 = th2;
            }
            th2 = th3;
        }
        return th2;
    }

    /* renamed from: a */
    String m8437a(Class cls, Throwable th, String str) {
        Writer stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return new Builder().scheme("https").path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("id", "gmob-apps-report-exception").appendQueryParameter("os", VERSION.RELEASE).appendQueryParameter("api", String.valueOf(VERSION.SDK_INT)).appendQueryParameter("device", ako.m2343e().m9135e()).appendQueryParameter("js", this.f6227e.f15121a).appendQueryParameter(AdDatabaseHelper.COLUMN_APPID, this.f6226d).appendQueryParameter("exceptiontype", cls.getName()).appendQueryParameter("stacktrace", stringWriter.toString()).appendQueryParameter("eids", TextUtils.join(",", bbb.m7127a())).appendQueryParameter("exceptionkey", str).appendQueryParameter("cl", "155828604").appendQueryParameter("rc", "dev").appendQueryParameter("session_id", ako.m2347i().m8923a()).toString();
    }

    /* renamed from: a */
    public void m8438a(Thread thread) {
        if (thread != null) {
            synchronized (this.f6225c) {
                this.f6228f.put(thread, Boolean.valueOf(true));
            }
            final UncaughtExceptionHandler uncaughtExceptionHandler = thread.getUncaughtExceptionHandler();
            thread.setUncaughtExceptionHandler(new UncaughtExceptionHandler(this) {
                /* renamed from: b */
                final /* synthetic */ bhb f6222b;

                /* JADX WARNING: inconsistent code. */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public void uncaughtException(Thread r3, Throwable r4) {
                    /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: Can't find block by offset: 0x000e in list [B:4:0x0009]
	at jadx.core.utils.BlockUtils.getBlockByOffset(BlockUtils.java:43)
	at jadx.core.dex.instructions.IfNode.initBlocks(IfNode.java:60)
	at jadx.core.dex.visitors.blocksmaker.BlockFinish.initBlocksInIfNodes(BlockFinish.java:48)
	at jadx.core.dex.visitors.blocksmaker.BlockFinish.visit(BlockFinish.java:33)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/1976752685.run(Unknown Source)
*/
                    /*
                    r2 = this;
                    r0 = r2.f6222b;	 Catch:{ Throwable -> 0x000f, all -> 0x001f }
                    r0.m8439a(r3, r4);	 Catch:{ Throwable -> 0x000f, all -> 0x001f }
                    r0 = r0;
                    if (r0 == 0) goto L_0x000e;
                L_0x0009:
                    r0 = r0;
                    r0.uncaughtException(r3, r4);
                L_0x000e:
                    return;
                L_0x000f:
                    r0 = move-exception;
                    r0 = "AdMob exception reporter failed reporting the exception.";	 Catch:{ Throwable -> 0x000f, all -> 0x001f }
                    p000.bky.m9008c(r0);	 Catch:{ Throwable -> 0x000f, all -> 0x001f }
                    r0 = r0;
                    if (r0 == 0) goto L_0x000e;
                L_0x0019:
                    r0 = r0;
                    r0.uncaughtException(r3, r4);
                    goto L_0x000e;
                L_0x001f:
                    r0 = move-exception;
                    r1 = r0;
                    if (r1 == 0) goto L_0x0029;
                L_0x0024:
                    r1 = r0;
                    r1.uncaughtException(r3, r4);
                L_0x0029:
                    throw r0;
                    */
                    throw new UnsupportedOperationException("Method not decompiled: bhb.2.uncaughtException(java.lang.Thread, java.lang.Throwable):void");
                }
            });
        }
    }

    /* renamed from: a */
    protected void m8439a(Thread thread, Throwable th) {
        if (m8442a(th)) {
            m8443b(th);
        }
    }

    /* renamed from: a */
    public void mo1187a(Throwable th, String str) {
        Throwable c = m8436c(th);
        if (c != null) {
            Class cls = th.getClass();
            List arrayList = new ArrayList();
            arrayList.add(m8437a(cls, c, str));
            ako.m2343e().m9107a(arrayList, ako.m2347i().m8954i());
        }
    }

    /* renamed from: a */
    protected boolean m8441a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (str.startsWith((String) bbb.f5403i.m7064c())) {
            return true;
        }
        try {
            return Class.forName(str).isAnnotationPresent(bhd.class);
        } catch (Throwable e) {
            Throwable th = e;
            String str2 = "Fail to check class type for class ";
            String valueOf = String.valueOf(str);
            bky.m9004a(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), th);
            return false;
        }
    }

    /* renamed from: a */
    protected boolean m8442a(Throwable th) {
        boolean z = true;
        if (th == null) {
            return false;
        }
        boolean z2 = false;
        boolean z3 = false;
        while (th != null) {
            for (StackTraceElement stackTraceElement : th.getStackTrace()) {
                if (m8441a(stackTraceElement.getClassName())) {
                    z3 = true;
                }
                if (getClass().getName().equals(stackTraceElement.getClassName())) {
                    z2 = true;
                }
            }
            th = th.getCause();
        }
        if (!z3 || r2) {
            z = false;
        }
        return z;
    }

    /* renamed from: b */
    public void m8443b(Throwable th) {
        mo1187a(th, "");
    }

    /* renamed from: b */
    protected boolean m8444b(String str) {
        return TextUtils.isEmpty(str) ? false : str.startsWith("android.") || str.startsWith("java.");
    }
}
