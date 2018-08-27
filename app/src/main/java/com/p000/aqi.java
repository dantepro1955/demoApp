package com.p000;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.WorkSource;
import android.util.Log;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: aqi */
public class aqi {
    /* renamed from: a */
    private static final Method f3944a = aqi.m4935a();
    /* renamed from: b */
    private static final Method f3945b = aqi.m4938b();
    /* renamed from: c */
    private static final Method f3946c = aqi.m4940c();
    /* renamed from: d */
    private static final Method f3947d = aqi.m4941d();
    /* renamed from: e */
    private static final Method f3948e = aqi.m4942e();

    /* renamed from: a */
    public static int m4931a(WorkSource workSource) {
        if (f3946c != null) {
            try {
                return ((Integer) f3946c.invoke(workSource, new Object[0])).intValue();
            } catch (Throwable e) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e);
            }
        }
        return 0;
    }

    /* renamed from: a */
    public static WorkSource m4932a(int i, String str) {
        WorkSource workSource = new WorkSource();
        aqi.m4936a(workSource, i, str);
        return workSource;
    }

    /* renamed from: a */
    public static WorkSource m4933a(Context context, String str) {
        if (context == null || context.getPackageManager() == null) {
            return null;
        }
        String str2;
        String str3;
        String valueOf;
        try {
            ApplicationInfo a = ato.m5611b(context).m5606a(str, 0);
            if (a != null) {
                return aqi.m4932a(a.uid, str);
            }
            str2 = "WorkSourceUtil";
            str3 = "Could not get applicationInfo from package: ";
            valueOf = String.valueOf(str);
            Log.e(str2, valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
            return null;
        } catch (NameNotFoundException e) {
            str2 = "WorkSourceUtil";
            str3 = "Could not find package: ";
            valueOf = String.valueOf(str);
            Log.e(str2, valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
            return null;
        }
    }

    /* renamed from: a */
    public static String m4934a(WorkSource workSource, int i) {
        if (f3948e != null) {
            try {
                return (String) f3948e.invoke(workSource, new Object[]{Integer.valueOf(i)});
            } catch (Throwable e) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e);
            }
        }
        return null;
    }

    /* renamed from: a */
    private static Method m4935a() {
        Method method = null;
        try {
            method = WorkSource.class.getMethod("add", new Class[]{Integer.TYPE});
        } catch (Exception e) {
        }
        return method;
    }

    /* renamed from: a */
    public static void m4936a(WorkSource workSource, int i, String str) {
        if (f3945b != null) {
            if (str == null) {
                str = "";
            }
            try {
                f3945b.invoke(workSource, new Object[]{Integer.valueOf(i), str});
            } catch (Throwable e) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e);
            }
        } else if (f3944a != null) {
            try {
                f3944a.invoke(workSource, new Object[]{Integer.valueOf(i)});
            } catch (Throwable e2) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e2);
            }
        }
    }

    /* renamed from: a */
    public static boolean m4937a(Context context) {
        return (context == null || context.getPackageManager() == null || ato.m5611b(context).m5605a("android.permission.UPDATE_DEVICE_STATS", context.getPackageName()) != 0) ? false : true;
    }

    /* renamed from: b */
    private static Method m4938b() {
        Method method = null;
        if (aqd.m4916f()) {
            try {
                method = WorkSource.class.getMethod("add", new Class[]{Integer.TYPE, String.class});
            } catch (Exception e) {
            }
        }
        return method;
    }

    /* renamed from: b */
    public static List<String> m4939b(WorkSource workSource) {
        int i = 0;
        int a = workSource == null ? 0 : aqi.m4931a(workSource);
        if (a == 0) {
            return Collections.EMPTY_LIST;
        }
        List<String> arrayList = new ArrayList();
        while (i < a) {
            String a2 = aqi.m4934a(workSource, i);
            if (!aqf.m4926a(a2)) {
                arrayList.add(a2);
            }
            i++;
        }
        return arrayList;
    }

    /* renamed from: c */
    private static Method m4940c() {
        Method method = null;
        try {
            method = WorkSource.class.getMethod("size", new Class[0]);
        } catch (Exception e) {
        }
        return method;
    }

    /* renamed from: d */
    private static Method m4941d() {
        Method method = null;
        try {
            method = WorkSource.class.getMethod("get", new Class[]{Integer.TYPE});
        } catch (Exception e) {
        }
        return method;
    }

    /* renamed from: e */
    private static Method m4942e() {
        Method method = null;
        if (aqd.m4916f()) {
            try {
                method = WorkSource.class.getMethod("getName", new Class[]{Integer.TYPE});
            } catch (Exception e) {
            }
        }
        return method;
    }
}
