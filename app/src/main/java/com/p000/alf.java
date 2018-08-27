package com.p000;

import android.content.Context;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/* renamed from: alf */
public class alf implements ala {
    /* renamed from: a */
    private final TreeSet<String> f1965a = new TreeSet();

    public alf(Context context, Collection<String> collection) {
        m2455a(context, (Collection) collection);
    }

    /* renamed from: a */
    public String mo320a(String str, Throwable th) {
        return m2453a(m2454a(th), m2456b(m2454a(th)), str);
    }

    /* renamed from: a */
    protected String m2453a(Throwable th, StackTraceElement stackTraceElement, String str) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(th.getClass().getSimpleName());
        if (stackTraceElement != null) {
            String[] split = stackTraceElement.getClassName().split("\\.");
            String str2 = "unknown";
            if (split != null && split.length > 0) {
                str2 = split[split.length - 1];
            }
            stringBuilder.append(String.format(" (@%s:%s:%s)", new Object[]{str2, stackTraceElement.getMethodName(), Integer.valueOf(stackTraceElement.getLineNumber())}));
        }
        if (str != null) {
            stringBuilder.append(String.format(" {%s}", new Object[]{str}));
        }
        return stringBuilder.toString();
    }

    /* renamed from: a */
    protected Throwable m2454a(Throwable th) {
        while (th.getCause() != null) {
            th = th.getCause();
        }
        return th;
    }

    /* renamed from: a */
    public void m2455a(Context context, Collection<String> collection) {
        this.f1965a.clear();
        Set<String> hashSet = new HashSet();
        if (collection != null) {
            hashSet.addAll(collection);
        }
        if (context != null) {
            hashSet.add(context.getApplicationContext().getPackageName());
        }
        for (String str : hashSet) {
            Iterator it = this.f1965a.iterator();
            Object obj = 1;
            while (it.hasNext()) {
                String str2 = (String) it.next();
                if (str.startsWith(str2)) {
                    obj = null;
                } else {
                    if (str2.startsWith(str)) {
                        this.f1965a.remove(str2);
                    }
                    if (obj != null) {
                        this.f1965a.add(str);
                    }
                }
            }
            if (obj != null) {
                this.f1965a.add(str);
            }
        }
    }

    /* renamed from: b */
    protected StackTraceElement m2456b(Throwable th) {
        StackTraceElement[] stackTrace = th.getStackTrace();
        if (stackTrace == null || stackTrace.length == 0) {
            return null;
        }
        for (StackTraceElement stackTraceElement : stackTrace) {
            String className = stackTraceElement.getClassName();
            Iterator it = this.f1965a.iterator();
            while (it.hasNext()) {
                if (className.startsWith((String) it.next())) {
                    return stackTraceElement;
                }
            }
        }
        return stackTrace[0];
    }
}
