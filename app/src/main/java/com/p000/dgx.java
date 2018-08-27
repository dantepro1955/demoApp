package com.p000;

import java.io.IOException;
import java.security.InvalidParameterException;
import java.util.Map;

/* compiled from: SystemCmdUtil */
/* renamed from: dgx */
public class dgx {
    /* renamed from: a */
    public static String[] m27252a() {
        String str = "";
        Map map = System.getenv();
        if (map.containsKey("PATH")) {
            str = (String) map.get("PATH");
        }
        if (str.contains(":")) {
            return str.split(":");
        }
        return new String[]{str};
    }

    /* renamed from: a */
    public static String m27250a(int i) {
        Process process = null;
        String[] a = dgx.m27252a();
        if (!(a == null || a.length == 0)) {
            int length = a.length;
            int i2 = 0;
            while (i2 < length) {
                String str = a[i2];
                if (i == 4) {
                    try {
                        str = str + "/ping";
                    } catch (IOException e) {
                        if (process != null) {
                            process.destroy();
                        }
                        i2++;
                    } catch (Throwable th) {
                        if (process != null) {
                            process.destroy();
                        }
                    }
                } else if (i == 16) {
                    str = str + "/ping6";
                } else {
                    Object obj = process;
                }
                process = Runtime.getRuntime().exec(str);
                if (process == null) {
                    return str;
                }
                process.destroy();
                return str;
            }
        }
        return process;
    }

    /* renamed from: a */
    public static String m27251a(Object... objArr) throws InvalidParameterException {
        String str = "";
        int length = objArr.length;
        if (length < 0) {
            throw new InvalidParameterException("0 arguments passed in for constructing command");
        }
        for (int i = 0; i < length - 1; i++) {
            str = str + objArr[i] + " ";
        }
        return str + objArr[length - 1];
    }
}
