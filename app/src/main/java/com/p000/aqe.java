package com.p000;

import android.os.Process;
import android.os.StrictMode;
import android.os.StrictMode.ThreadPolicy;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.FileReader;
import java.io.IOException;

/* renamed from: aqe */
public class aqe {
    /* renamed from: a */
    private static String f3941a = null;
    /* renamed from: b */
    private static final int f3942b = Process.myPid();

    /* renamed from: a */
    public static String m4924a() {
        if (f3941a == null) {
            f3941a = aqe.m4925a(f3942b);
        }
        return f3941a;
    }

    /* renamed from: a */
    static String m4925a(int i) {
        Throwable th;
        String str = null;
        if (i > 0) {
            ThreadPolicy allowThreadDiskReads;
            Closeable bufferedReader;
            try {
                allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                bufferedReader = new BufferedReader(new FileReader("/proc/" + i + "/cmdline"));
                try {
                    StrictMode.setThreadPolicy(allowThreadDiskReads);
                    str = bufferedReader.readLine().trim();
                    aqb.m4908a(bufferedReader);
                } catch (IOException e) {
                    aqb.m4908a(bufferedReader);
                    return str;
                } catch (Throwable th2) {
                    th = th2;
                    aqb.m4908a(bufferedReader);
                    throw th;
                }
            } catch (IOException e2) {
                bufferedReader = str;
                aqb.m4908a(bufferedReader);
                return str;
            } catch (Throwable th3) {
                Throwable th4 = th3;
                bufferedReader = str;
                th = th4;
                aqb.m4908a(bufferedReader);
                throw th;
            }
        }
        return str;
    }
}
