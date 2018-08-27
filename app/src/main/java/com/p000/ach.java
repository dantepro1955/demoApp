package com.p000;

import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.services.common.BackgroundPriorityRunnable;
import java.io.File;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* compiled from: ReportUploader */
/* renamed from: ach */
class ach {
    /* renamed from: a */
    static final Map<String, String> f353a = Collections.singletonMap("X-CRASHLYTICS-INVALID-SESSION", "1");
    /* renamed from: b */
    private static final short[] f354b = new short[]{(short) 10, (short) 20, (short) 30, (short) 60, (short) 120, (short) 300};
    /* renamed from: c */
    private final Object f355c = new Object();
    /* renamed from: d */
    private final abq f356d;
    /* renamed from: e */
    private final String f357e;
    /* renamed from: f */
    private final C0037c f358f;
    /* renamed from: g */
    private final C0039b f359g;
    /* renamed from: h */
    private Thread f360h;

    /* compiled from: ReportUploader */
    /* renamed from: ach$d */
    interface C0035d {
        /* renamed from: a */
        boolean mo11a();
    }

    /* compiled from: ReportUploader */
    /* renamed from: ach$c */
    interface C0037c {
        /* renamed from: a */
        File[] mo12a();

        /* renamed from: b */
        File[] mo13b();
    }

    /* compiled from: ReportUploader */
    /* renamed from: ach$b */
    interface C0039b {
        /* renamed from: a */
        boolean mo14a();
    }

    /* compiled from: ReportUploader */
    /* renamed from: ach$a */
    static final class C0069a implements C0035d {
        C0069a() {
        }

        /* renamed from: a */
        public boolean mo11a() {
            return true;
        }
    }

    /* compiled from: ReportUploader */
    /* renamed from: ach$e */
    class C0070e extends BackgroundPriorityRunnable {
        /* renamed from: a */
        final /* synthetic */ ach f350a;
        /* renamed from: b */
        private final float f351b;
        /* renamed from: c */
        private final C0035d f352c;

        C0070e(ach ach, float f, C0035d c0035d) {
            this.f350a = ach;
            this.f351b = f;
            this.f352c = c0035d;
        }

        /* renamed from: a */
        public void m459a() {
            try {
                m458b();
            } catch (Throwable e) {
                Fabric.h().e("CrashlyticsCore", "An unexpected error occurred while attempting to upload crash reports.", e);
            }
            this.f350a.f360h = null;
        }

        /* renamed from: b */
        private void m458b() {
            Fabric.h().a("CrashlyticsCore", "Starting report processing in " + this.f351b + " second(s)...");
            if (this.f351b > 0.0f) {
                try {
                    Thread.sleep((long) (this.f351b * 1000.0f));
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    return;
                }
            }
            List<acg> a = this.f350a.m463a();
            if (!this.f350a.f359g.mo14a()) {
                if (a.isEmpty() || this.f352c.mo11a()) {
                    List list = a;
                    int i = 0;
                    while (!r0.isEmpty() && !this.f350a.f359g.mo14a()) {
                        Fabric.h().a("CrashlyticsCore", "Attempting to send " + r0.size() + " report(s)");
                        for (acg a2 : r0) {
                            this.f350a.m465a(a2);
                        }
                        List a3 = this.f350a.m463a();
                        if (a3.isEmpty()) {
                            list = a3;
                        } else {
                            int i2 = i + 1;
                            long j = (long) ach.f354b[Math.min(i, ach.f354b.length - 1)];
                            Fabric.h().a("CrashlyticsCore", "Report submisson: scheduling delayed retry in " + j + " seconds");
                            try {
                                Thread.sleep(j * 1000);
                                i = i2;
                                list = a3;
                            } catch (InterruptedException e2) {
                                Thread.currentThread().interrupt();
                                return;
                            }
                        }
                    }
                    return;
                }
                Fabric.h().a("CrashlyticsCore", "User declined to send. Removing " + a.size() + " Report(s).");
                for (acg a22 : a) {
                    a22.mo22f();
                }
            }
        }
    }

    public ach(String str, abq abq, C0037c c0037c, C0039b c0039b) {
        if (abq == null) {
            throw new IllegalArgumentException("createReportCall must not be null.");
        }
        this.f356d = abq;
        this.f357e = str;
        this.f358f = c0037c;
        this.f359g = c0039b;
    }

    /* renamed from: a */
    public synchronized void m464a(float f, C0035d c0035d) {
        if (this.f360h != null) {
            Fabric.h().a("CrashlyticsCore", "Report upload has already been started.");
        } else {
            this.f360h = new Thread(new C0070e(this, f, c0035d), "Crashlytics Report Uploader");
            this.f360h.start();
        }
    }

    /* renamed from: a */
    boolean m465a(acg acg) {
        boolean z = false;
        synchronized (this.f355c) {
            try {
                boolean a = this.f356d.mo16a(new abp(this.f357e, acg));
                Fabric.h().c("CrashlyticsCore", "Crashlytics report upload " + (a ? "complete: " : "FAILED: ") + acg.mo18b());
                if (a) {
                    acg.mo22f();
                    z = true;
                }
            } catch (Throwable e) {
                Fabric.h().e("CrashlyticsCore", "Error occurred sending report " + acg, e);
            }
        }
        return z;
    }

    /* renamed from: a */
    List<acg> m463a() {
        String a;
        Fabric.h().a("CrashlyticsCore", "Checking for crash reports...");
        synchronized (this.f355c) {
            File[] a2 = this.f358f.mo12a();
            File[] b = this.f358f.mo13b();
        }
        List<acg> linkedList = new LinkedList();
        if (a2 != null) {
            for (File file : a2) {
                Fabric.h().a("CrashlyticsCore", "Found crash report " + file.getPath());
                linkedList.add(new acj(file));
            }
        }
        Map hashMap = new HashMap();
        if (b != null) {
            for (File file2 : b) {
                a = abj.m246a(file2);
                if (!hashMap.containsKey(a)) {
                    hashMap.put(a, new LinkedList());
                }
                ((List) hashMap.get(a)).add(file2);
            }
        }
        for (String a3 : hashMap.keySet()) {
            Fabric.h().a("CrashlyticsCore", "Found invalid session: " + a3);
            List list = (List) hashMap.get(a3);
            linkedList.add(new abv(a3, (File[]) list.toArray(new File[list.size()])));
        }
        if (linkedList.isEmpty()) {
            Fabric.h().a("CrashlyticsCore", "No reports found.");
        }
        return linkedList;
    }
}
