package com.p000;

import android.os.Build.VERSION;
import java.io.File;
import java.io.FileFilter;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.regex.Pattern;

/* compiled from: ThreadUtil */
/* renamed from: djx */
public class djx {
    /* renamed from: a */
    private static ExecutorService f21811a;

    /* compiled from: ThreadUtil */
    /* renamed from: djx$1 */
    static class C49401 implements FileFilter {
        C49401() {
        }

        public boolean accept(File file) {
            return Pattern.matches("cpu[0-9]+", file.getName());
        }
    }

    /* renamed from: a */
    public static ExecutorService m27634a() {
        if (f21811a == null || f21811a.isShutdown() || f21811a.isTerminated()) {
            f21811a = Executors.newFixedThreadPool(djx.m27635b());
        }
        return f21811a;
    }

    /* renamed from: b */
    private static int m27635b() {
        int i = 8;
        if (VERSION.SDK_INT >= 17) {
            return Math.max(i, Runtime.getRuntime().availableProcessors());
        }
        try {
            return Math.max(8, new File("/sys/devices/system/cpu/").listFiles(new C49401()).length);
        } catch (Exception e) {
            return i;
        }
    }
}
