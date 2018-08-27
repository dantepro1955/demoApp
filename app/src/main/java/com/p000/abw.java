package com.p000;

import android.content.Context;
import com.facebook.internal.NativeProtocol;
import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.services.common.CommonUtils;
import java.io.File;
import java.util.Set;

/* compiled from: LogFileManager */
/* renamed from: abw */
class abw {
    /* renamed from: a */
    private static final C0053b f293a = new C0053b();
    /* renamed from: b */
    private final Context f294b;
    /* renamed from: c */
    private final C0031a f295c;
    /* renamed from: d */
    private abu f296d;

    /* compiled from: LogFileManager */
    /* renamed from: abw$a */
    public interface C0031a {
        /* renamed from: a */
        File mo9a();
    }

    /* compiled from: LogFileManager */
    /* renamed from: abw$b */
    static final class C0053b implements abu {
        private C0053b() {
        }

        /* renamed from: a */
        public abd mo23a() {
            return null;
        }

        /* renamed from: b */
        public void mo24b() {
        }

        /* renamed from: c */
        public void mo25c() {
        }
    }

    abw(Context context, C0031a c0031a) {
        this(context, c0031a, null);
    }

    abw(Context context, C0031a c0031a, String str) {
        this.f294b = context;
        this.f295c = c0031a;
        this.f296d = f293a;
        m389a(str);
    }

    /* renamed from: a */
    final void m389a(String str) {
        this.f296d.mo24b();
        this.f296d = f293a;
        if (str != null) {
            if (CommonUtils.a(this.f294b, "com.crashlytics.CollectCustomLogs", true)) {
                m388a(m386b(str), NativeProtocol.MESSAGE_GET_ACCESS_TOKEN_REQUEST);
            } else {
                Fabric.h().a("CrashlyticsCore", "Preferences requested no custom logs. Aborting log file creation.");
            }
        }
    }

    /* renamed from: a */
    abd m387a() {
        return this.f296d.mo23a();
    }

    /* renamed from: b */
    void m391b() {
        this.f296d.mo25c();
    }

    /* renamed from: a */
    void m390a(Set<String> set) {
        File[] listFiles = this.f295c.mo9a().listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                if (!set.contains(m385a(file))) {
                    file.delete();
                }
            }
        }
    }

    /* renamed from: a */
    void m388a(File file, int i) {
        this.f296d = new ace(file, i);
    }

    /* renamed from: b */
    private File m386b(String str) {
        return new File(this.f295c.mo9a(), "crashlytics-userlog-" + str + ".temp");
    }

    /* renamed from: a */
    private String m385a(File file) {
        String name = file.getName();
        int lastIndexOf = name.lastIndexOf(".temp");
        return lastIndexOf == -1 ? name : name.substring("crashlytics-userlog-".length(), lastIndexOf);
    }
}
