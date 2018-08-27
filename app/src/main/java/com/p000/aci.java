package com.p000;

import android.app.ActivityManager.RunningAppProcessInfo;
import android.os.Build.VERSION;
import com.facebook.appevents.AppEventsConstants;
import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.services.common.IdManager.DeviceIdentifierType;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* compiled from: SessionProtobufHelper */
/* renamed from: aci */
class aci {
    /* renamed from: a */
    private static final abd f361a = abd.m153a(AppEventsConstants.EVENT_PARAM_VALUE_NO);
    /* renamed from: b */
    private static final abd f362b = abd.m153a("Unity");

    /* renamed from: a */
    public static void m490a(abg abg, String str, String str2, long j) throws Exception {
        abg.m192a(1, abd.m153a(str2));
        abg.m192a(2, abd.m153a(str));
        abg.m191a(3, j);
    }

    /* renamed from: a */
    public static void m492a(abg abg, String str, String str2, String str3, String str4, String str5, int i, String str6) throws Exception {
        abd a = abd.m153a(str);
        abd a2 = abd.m153a(str2);
        abd a3 = abd.m153a(str3);
        abd a4 = abd.m153a(str4);
        abd a5 = abd.m153a(str5);
        abd a6 = str6 != null ? abd.m153a(str6) : null;
        abg.m207g(7, 2);
        abg.m209k(aci.m471a(a, a2, a3, a4, a5, i, a6));
        abg.m192a(1, a);
        abg.m192a(2, a3);
        abg.m192a(3, a4);
        abg.m207g(5, 2);
        abg.m209k(aci.m469a(a2));
        abg.m192a(1, a2);
        abg.m192a(6, a5);
        if (a6 != null) {
            abg.m192a(8, f362b);
            abg.m192a(9, a6);
        }
        abg.m201b(10, i);
    }

    /* renamed from: a */
    public static void m495a(abg abg, boolean z) throws Exception {
        abd a = abd.m153a(VERSION.RELEASE);
        abd a2 = abd.m153a(VERSION.CODENAME);
        abg.m207g(8, 2);
        abg.m209k(aci.m472a(a, a2, z));
        abg.m201b(1, 3);
        abg.m192a(2, a);
        abg.m192a(3, a2);
        abg.m193a(4, z);
    }

    /* renamed from: a */
    public static void m489a(abg abg, String str, int i, String str2, int i2, long j, long j2, boolean z, Map<DeviceIdentifierType, String> map, int i3, String str3, String str4) throws Exception {
        abd a = abd.m153a(str);
        abd a2 = aci.m481a(str2);
        abd a3 = aci.m481a(str4);
        abd a4 = aci.m481a(str3);
        abg.m207g(9, 2);
        abg.m209k(aci.m467a(i, a, a2, i2, j, j2, z, (Map) map, i3, a4, a3));
        abg.m192a(1, a);
        abg.m201b(3, i);
        abg.m192a(4, a2);
        abg.m190a(5, i2);
        abg.m191a(6, j);
        abg.m191a(7, j2);
        abg.m193a(10, z);
        for (Entry entry : map.entrySet()) {
            abg.m207g(11, 2);
            abg.m209k(aci.m476a((DeviceIdentifierType) entry.getKey(), (String) entry.getValue()));
            abg.m201b(1, ((DeviceIdentifierType) entry.getKey()).f24003h);
            abg.m192a(2, abd.m153a((String) entry.getValue()));
        }
        abg.m190a(12, i3);
        if (a4 != null) {
            abg.m192a(13, a4);
        }
        if (a3 != null) {
            abg.m192a(14, a3);
        }
    }

    /* renamed from: a */
    public static void m491a(abg abg, String str, String str2, String str3) throws Exception {
        if (str == null) {
            str = "";
        }
        abd a = abd.m153a(str);
        abd a2 = aci.m481a(str2);
        abd a3 = aci.m481a(str3);
        int b = 0 + abg.m170b(1, a);
        if (str2 != null) {
            b += abg.m170b(2, a2);
        }
        if (str3 != null) {
            b += abg.m170b(3, a3);
        }
        abg.m207g(6, 2);
        abg.m209k(b);
        abg.m192a(1, a);
        if (str2 != null) {
            abg.m192a(2, a2);
        }
        if (str3 != null) {
            abg.m192a(3, a3);
        }
    }

    /* renamed from: a */
    public static void m483a(abg abg, long j, String str, acl acl, Thread thread, StackTraceElement[] stackTraceElementArr, Thread[] threadArr, List<StackTraceElement[]> list, Map<String, String> map, abw abw, RunningAppProcessInfo runningAppProcessInfo, int i, String str2, String str3, Float f, int i2, boolean z, long j2, long j3) throws Exception {
        abd abd;
        abd a = abd.m153a(str2);
        if (str3 == null) {
            abd = null;
        } else {
            abd = abd.m153a(str3.replace("-", ""));
        }
        abd a2 = abw.m387a();
        if (a2 == null) {
            Fabric.h().a("CrashlyticsCore", "No log data to include with this event.");
        }
        abw.m391b();
        abg.m207g(10, 2);
        abg.m209k(aci.m468a(j, str, acl, thread, stackTraceElementArr, threadArr, (List) list, 8, (Map) map, runningAppProcessInfo, i, a, abd, f, i2, z, j2, j3, a2));
        abg.m191a(1, j);
        abg.m192a(2, abd.m153a(str));
        aci.m487a(abg, acl, thread, stackTraceElementArr, threadArr, (List) list, 8, a, abd, (Map) map, runningAppProcessInfo, i);
        aci.m488a(abg, f, i2, z, i, j2, j3);
        aci.m484a(abg, a2);
    }

    /* renamed from: a */
    private static void m487a(abg abg, acl acl, Thread thread, StackTraceElement[] stackTraceElementArr, Thread[] threadArr, List<StackTraceElement[]> list, int i, abd abd, abd abd2, Map<String, String> map, RunningAppProcessInfo runningAppProcessInfo, int i2) throws Exception {
        abg.m207g(3, 2);
        abg.m209k(aci.m475a(acl, thread, stackTraceElementArr, threadArr, (List) list, i, abd, abd2, (Map) map, runningAppProcessInfo, i2));
        aci.m486a(abg, acl, thread, stackTraceElementArr, threadArr, list, i, abd, abd2);
        if (!(map == null || map.isEmpty())) {
            aci.m494a(abg, (Map) map);
        }
        if (runningAppProcessInfo != null) {
            abg.m193a(3, runningAppProcessInfo.importance != 100);
        }
        abg.m190a(4, i2);
    }

    /* renamed from: a */
    private static void m486a(abg abg, acl acl, Thread thread, StackTraceElement[] stackTraceElementArr, Thread[] threadArr, List<StackTraceElement[]> list, int i, abd abd, abd abd2) throws Exception {
        abg.m207g(1, 2);
        abg.m209k(aci.m474a(acl, thread, stackTraceElementArr, threadArr, (List) list, i, abd, abd2));
        aci.m493a(abg, thread, stackTraceElementArr, 4, true);
        int length = threadArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            aci.m493a(abg, threadArr[i2], (StackTraceElement[]) list.get(i2), 0, false);
        }
        aci.m485a(abg, acl, 1, i, 2);
        abg.m207g(3, 2);
        abg.m209k(aci.m466a());
        abg.m192a(1, f361a);
        abg.m192a(2, f361a);
        abg.m191a(3, 0);
        abg.m207g(4, 2);
        abg.m209k(aci.m470a(abd, abd2));
        abg.m191a(1, 0);
        abg.m191a(2, 0);
        abg.m192a(3, abd);
        if (abd2 != null) {
            abg.m192a(4, abd2);
        }
    }

    /* renamed from: a */
    private static void m494a(abg abg, Map<String, String> map) throws Exception {
        for (Entry entry : map.entrySet()) {
            abg.m207g(2, 2);
            abg.m209k(aci.m479a((String) entry.getKey(), (String) entry.getValue()));
            abg.m192a(1, abd.m153a((String) entry.getKey()));
            String str = (String) entry.getValue();
            if (str == null) {
                str = "";
            }
            abg.m192a(2, abd.m153a(str));
        }
    }

    /* renamed from: a */
    private static void m485a(abg abg, acl acl, int i, int i2, int i3) throws Exception {
        int i4 = 0;
        abg.m207g(i3, 2);
        abg.m209k(aci.m473a(acl, 1, i2));
        abg.m192a(1, abd.m153a(acl.f367b));
        String str = acl.f366a;
        if (str != null) {
            abg.m192a(3, abd.m153a(str));
        }
        for (StackTraceElement a : acl.f368c) {
            aci.m482a(abg, 4, a, true);
        }
        acl acl2 = acl.f369d;
        if (acl2 == null) {
            return;
        }
        if (i < i2) {
            aci.m485a(abg, acl2, i + 1, i2, 6);
            return;
        }
        while (acl2 != null) {
            acl2 = acl2.f369d;
            i4++;
        }
        abg.m190a(7, i4);
    }

    /* renamed from: a */
    private static void m493a(abg abg, Thread thread, StackTraceElement[] stackTraceElementArr, int i, boolean z) throws Exception {
        abg.m207g(1, 2);
        abg.m209k(aci.m480a(thread, stackTraceElementArr, i, z));
        abg.m192a(1, abd.m153a(thread.getName()));
        abg.m190a(2, i);
        for (StackTraceElement a : stackTraceElementArr) {
            aci.m482a(abg, 3, a, z);
        }
    }

    /* renamed from: a */
    private static void m482a(abg abg, int i, StackTraceElement stackTraceElement, boolean z) throws Exception {
        int i2 = 4;
        abg.m207g(i, 2);
        abg.m209k(aci.m478a(stackTraceElement, z));
        if (stackTraceElement.isNativeMethod()) {
            abg.m191a(1, (long) Math.max(stackTraceElement.getLineNumber(), 0));
        } else {
            abg.m191a(1, 0);
        }
        abg.m192a(2, abd.m153a(stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName()));
        if (stackTraceElement.getFileName() != null) {
            abg.m192a(3, abd.m153a(stackTraceElement.getFileName()));
        }
        if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
            abg.m191a(4, (long) stackTraceElement.getLineNumber());
        }
        if (!z) {
            i2 = 0;
        }
        abg.m190a(5, i2);
    }

    /* renamed from: a */
    private static void m488a(abg abg, Float f, int i, boolean z, int i2, long j, long j2) throws Exception {
        abg.m207g(5, 2);
        abg.m209k(aci.m477a(f, i, z, i2, j, j2));
        if (f != null) {
            abg.m189a(1, f.floatValue());
        }
        abg.m203c(2, i);
        abg.m193a(3, z);
        abg.m190a(4, i2);
        abg.m191a(5, j);
        abg.m191a(6, j2);
    }

    /* renamed from: a */
    private static void m484a(abg abg, abd abd) throws Exception {
        if (abd != null) {
            abg.m207g(6, 2);
            abg.m209k(aci.m496b(abd));
            abg.m192a(1, abd);
        }
    }

    /* renamed from: a */
    private static int m471a(abd abd, abd abd2, abd abd3, abd abd4, abd abd5, int i, abd abd6) {
        int b = ((0 + abg.m170b(1, abd)) + abg.m170b(2, abd3)) + abg.m170b(3, abd4);
        int a = aci.m469a(abd2);
        b = (b + (a + (abg.m183j(5) + abg.m184l(a)))) + abg.m170b(6, abd5);
        if (abd6 != null) {
            b = (b + abg.m170b(8, f362b)) + abg.m170b(9, abd6);
        }
        return b + abg.m178e(10, i);
    }

    /* renamed from: a */
    private static int m469a(abd abd) {
        return 0 + abg.m170b(1, abd);
    }

    /* renamed from: a */
    private static int m472a(abd abd, abd abd2, boolean z) {
        return (((0 + abg.m178e(1, 3)) + abg.m170b(2, abd)) + abg.m170b(3, abd2)) + abg.m171b(4, z);
    }

    /* renamed from: a */
    private static int m476a(DeviceIdentifierType deviceIdentifierType, String str) {
        return abg.m178e(1, deviceIdentifierType.f24003h) + abg.m170b(2, abd.m153a(str));
    }

    /* renamed from: a */
    private static int m467a(int i, abd abd, abd abd2, int i2, long j, long j2, boolean z, Map<DeviceIdentifierType, String> map, int i3, abd abd3, abd abd4) {
        int i4;
        int i5;
        int e = abg.m178e(3, i) + (0 + abg.m170b(1, abd));
        if (abd2 == null) {
            i4 = 0;
        } else {
            i4 = abg.m170b(4, abd2);
        }
        i4 = ((((i4 + e) + abg.m175d(5, i2)) + abg.m169b(6, j)) + abg.m169b(7, j2)) + abg.m171b(10, z);
        if (map != null) {
            i5 = i4;
            for (Entry entry : map.entrySet()) {
                i4 = aci.m476a((DeviceIdentifierType) entry.getKey(), (String) entry.getValue());
                i5 = (i4 + (abg.m183j(11) + abg.m184l(i4))) + i5;
            }
        } else {
            i5 = i4;
        }
        return (abd4 == null ? 0 : abg.m170b(14, abd4)) + ((i5 + abg.m175d(12, i3)) + (abd3 == null ? 0 : abg.m170b(13, abd3)));
    }

    /* renamed from: a */
    private static int m470a(abd abd, abd abd2) {
        int b = ((0 + abg.m169b(1, 0)) + abg.m169b(2, 0)) + abg.m170b(3, abd);
        if (abd2 != null) {
            return b + abg.m170b(4, abd2);
        }
        return b;
    }

    /* renamed from: a */
    private static int m468a(long j, String str, acl acl, Thread thread, StackTraceElement[] stackTraceElementArr, Thread[] threadArr, List<StackTraceElement[]> list, int i, Map<String, String> map, RunningAppProcessInfo runningAppProcessInfo, int i2, abd abd, abd abd2, Float f, int i3, boolean z, long j2, long j3, abd abd3) {
        int b = (0 + abg.m169b(1, j)) + abg.m170b(2, abd.m153a(str));
        int a = aci.m475a(acl, thread, stackTraceElementArr, threadArr, (List) list, i, abd, abd2, (Map) map, runningAppProcessInfo, i2);
        int j4 = b + (a + (abg.m183j(3) + abg.m184l(a)));
        a = aci.m477a(f, i3, z, i2, j2, j3);
        a = (a + (abg.m183j(5) + abg.m184l(a))) + j4;
        if (abd3 == null) {
            return a;
        }
        int b2 = aci.m496b(abd3);
        return a + (b2 + (abg.m183j(6) + abg.m184l(b2)));
    }

    /* renamed from: a */
    private static int m475a(acl acl, Thread thread, StackTraceElement[] stackTraceElementArr, Thread[] threadArr, List<StackTraceElement[]> list, int i, abd abd, abd abd2, Map<String, String> map, RunningAppProcessInfo runningAppProcessInfo, int i2) {
        int a = aci.m474a(acl, thread, stackTraceElementArr, threadArr, (List) list, i, abd, abd2);
        int j = 0 + (a + (abg.m183j(1) + abg.m184l(a)));
        if (map != null) {
            int i3 = j;
            for (Entry entry : map.entrySet()) {
                j = aci.m479a((String) entry.getKey(), (String) entry.getValue());
                i3 = (j + (abg.m183j(2) + abg.m184l(j))) + i3;
            }
            a = i3;
        } else {
            a = j;
        }
        if (runningAppProcessInfo != null) {
            j = abg.m171b(3, runningAppProcessInfo.importance != 100) + a;
        } else {
            j = a;
        }
        return j + abg.m175d(4, i2);
    }

    /* renamed from: a */
    private static int m474a(acl acl, Thread thread, StackTraceElement[] stackTraceElementArr, Thread[] threadArr, List<StackTraceElement[]> list, int i, abd abd, abd abd2) {
        int a;
        int a2 = aci.m480a(thread, stackTraceElementArr, 4, true);
        a2 = (a2 + (abg.m183j(1) + abg.m184l(a2))) + 0;
        int length = threadArr.length;
        int i2 = a2;
        for (a2 = 0; a2 < length; a2++) {
            a = aci.m480a(threadArr[a2], (StackTraceElement[]) list.get(a2), 0, false);
            i2 += a + (abg.m183j(1) + abg.m184l(a));
        }
        a = aci.m473a(acl, 1, i);
        a = (a + (abg.m183j(2) + abg.m184l(a))) + i2;
        a2 = aci.m466a();
        a += a2 + (abg.m183j(3) + abg.m184l(a2));
        a2 = aci.m470a(abd, abd2);
        return a + (a2 + (abg.m183j(3) + abg.m184l(a2)));
    }

    /* renamed from: a */
    private static int m479a(String str, String str2) {
        int b = abg.m170b(1, abd.m153a(str));
        if (str2 == null) {
            str2 = "";
        }
        return b + abg.m170b(2, abd.m153a(str2));
    }

    /* renamed from: a */
    private static int m477a(Float f, int i, boolean z, int i2, long j, long j2) {
        int i3 = 0;
        if (f != null) {
            i3 = 0 + abg.m168b(1, f.floatValue());
        }
        return ((((i3 + abg.m180f(2, i)) + abg.m171b(3, z)) + abg.m175d(4, i2)) + abg.m169b(5, j)) + abg.m169b(6, j2);
    }

    /* renamed from: b */
    private static int m496b(abd abd) {
        return abg.m170b(1, abd);
    }

    /* renamed from: a */
    private static int m473a(acl acl, int i, int i2) {
        int i3 = 0;
        int b = abg.m170b(1, abd.m153a(acl.f367b)) + 0;
        String str = acl.f366a;
        if (str != null) {
            b += abg.m170b(3, abd.m153a(str));
        }
        StackTraceElement[] stackTraceElementArr = acl.f368c;
        int length = stackTraceElementArr.length;
        int i4 = 0;
        while (i4 < length) {
            int a = aci.m478a(stackTraceElementArr[i4], true);
            i4++;
            b = (a + (abg.m183j(4) + abg.m184l(a))) + b;
        }
        acl acl2 = acl.f369d;
        if (acl2 == null) {
            return b;
        }
        if (i < i2) {
            i3 = aci.m473a(acl2, i + 1, i2);
            return b + (i3 + (abg.m183j(6) + abg.m184l(i3)));
        }
        while (acl2 != null) {
            acl2 = acl2.f369d;
            i3++;
        }
        return b + abg.m175d(7, i3);
    }

    /* renamed from: a */
    private static int m466a() {
        return ((0 + abg.m170b(1, f361a)) + abg.m170b(2, f361a)) + abg.m169b(3, 0);
    }

    /* renamed from: a */
    private static int m478a(StackTraceElement stackTraceElement, boolean z) {
        int b;
        int i;
        if (stackTraceElement.isNativeMethod()) {
            b = abg.m169b(1, (long) Math.max(stackTraceElement.getLineNumber(), 0)) + 0;
        } else {
            b = abg.m169b(1, 0) + 0;
        }
        b += abg.m170b(2, abd.m153a(stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName()));
        if (stackTraceElement.getFileName() != null) {
            b += abg.m170b(3, abd.m153a(stackTraceElement.getFileName()));
        }
        if (stackTraceElement.isNativeMethod() || stackTraceElement.getLineNumber() <= 0) {
            i = b;
        } else {
            i = b + abg.m169b(4, (long) stackTraceElement.getLineNumber());
        }
        return abg.m175d(5, z ? 2 : 0) + i;
    }

    /* renamed from: a */
    private static int m480a(Thread thread, StackTraceElement[] stackTraceElementArr, int i, boolean z) {
        int d = abg.m175d(2, i) + abg.m170b(1, abd.m153a(thread.getName()));
        for (StackTraceElement a : stackTraceElementArr) {
            int a2 = aci.m478a(a, z);
            d += a2 + (abg.m183j(3) + abg.m184l(a2));
        }
        return d;
    }

    /* renamed from: a */
    private static abd m481a(String str) {
        return str == null ? null : abd.m153a(str);
    }
}
