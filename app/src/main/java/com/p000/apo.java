package com.p000;

import android.os.PowerManager.WakeLock;
import android.os.Process;
import android.text.TextUtils;
import java.util.List;

/* renamed from: apo */
public class apo {
    /* renamed from: a */
    public static String m4862a(WakeLock wakeLock, String str) {
        Object obj;
        String valueOf = String.valueOf(String.valueOf((((long) Process.myPid()) << 32) | ((long) System.identityHashCode(wakeLock))));
        if (TextUtils.isEmpty(str)) {
            obj = "";
        }
        String valueOf2 = String.valueOf(obj);
        return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    /* renamed from: a */
    static String m4863a(String str) {
        return "com.google.android.gms".equals(str) ? null : str;
    }

    /* renamed from: a */
    static List<String> m4864a(List<String> list) {
        return (list != null && list.size() == 1 && "com.google.android.gms".equals(list.get(0))) ? null : list;
    }
}
